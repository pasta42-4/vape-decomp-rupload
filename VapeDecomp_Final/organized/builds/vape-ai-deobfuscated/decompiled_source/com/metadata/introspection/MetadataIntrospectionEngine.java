/*
 * Decompiled with CFR 0.152.
 */
package com.metadata.introspection;

import a.Nw;
import a._c;
import com.app.reflection.analysis.ClassStructureAnalyzer;
import com.app.resource.ResourceIdentifier;
import com.app.security.CryptographicKeyGenerator2679;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeAnnotationExtractor;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.bytecode.analysis.ClassInitializationTracker;
import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.instrumentation.ArgumentInterceptor;
import com.collections.management.MultiContainerRegistry;
import com.configuration.management.ConfigurationOrchestrator2115;
import com.core.exception.CustomRuntimeException;
import com.deobfuscation.orchestration.OperationOrchestrator;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.metadata.ClassMetadataExtractor;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.resource.management.ResourceHierarchyManager;
import com.reverse.engineering.DecompilationAnalyzer;
import com.system.compilation.CompilationDiagnosticException;
import com.system.config.ResourceConfigurationBuilder;
import com.util.serialization.SerializationUtility2100;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.security.Key;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class MetadataIntrospectionEngine
extends MetaclassDefinitionRegistry {
    private int W;
    private boolean p = ClassPoolRegistry.p;
    private Nw X;
    ClassPoolRegistry o;
    boolean N;
    byte[] V;
    private CryptographicKeyGenerator2679 j;
    private boolean x;
    private static final long c;
    private Map<ResourceIdentifier, String> J;
    boolean F;
    private Reference<ResourceHierarchyManager> D;
    boolean Y;
    private int A;
    ClassMetadataExtractor m;
    private static final long a;

    private static ResourceIdentifier W(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, String string2) {
        Object object;
        MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray;
        if (metaclassDefinitionRegistry instanceof MetadataIntrospectionEngine) {
            metaclassDefinitionRegistryArray = ((MetadataIntrospectionEngine)metaclassDefinitionRegistry).h();
            object = metaclassDefinitionRegistryArray.O();
            SerializationUtility2100 serializationUtility2100 = metaclassDefinitionRegistryArray.x();
            while (object != serializationUtility2100) {
                if (!((SerializationUtility2100)(object = ((SerializationUtility2100)object).Y())).l().equals(string) || !((ResourceIdentifier)object).a().b().equals(string2)) continue;
                return (ResourceIdentifier)object;
            }
        }
        try {
            metaclassDefinitionRegistryArray = metaclassDefinitionRegistry.G();
            if (metaclassDefinitionRegistryArray != null && (object = MetadataIntrospectionEngine.W((MetaclassDefinitionRegistry)metaclassDefinitionRegistryArray, string, string2)) != null) {
                return object;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            // empty catch block
        }
        try {
            metaclassDefinitionRegistryArray = metaclassDefinitionRegistry.l();
            for (MetaclassDefinitionRegistry metaclassDefinitionRegistry2 : metaclassDefinitionRegistryArray) {
                ResourceIdentifier resourceIdentifier = MetadataIntrospectionEngine.W(metaclassDefinitionRegistry2, string, string2);
                if (resourceIdentifier == null) continue;
                return resourceIdentifier;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            // empty catch block
        }
        return null;
    }

    MetadataIntrospectionEngine(InputStream inputStream, ClassPoolRegistry classPoolRegistry) throws IOException {
        this((String)null, classPoolRegistry);
        this.m = new ClassMetadataExtractor(new DataInputStream(inputStream));
        this.i = this.m.Z();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void n(DataOutputStream var1_1) throws ContextualExceptionHandler, IOException {
        try {
            if (this.q()) {
                this.L("toBytecode");
                var2_2 = this.o();
                try {
                    if (this.N) {
                        var2_2.D();
                        this.N = false;
                    }
                }
                catch (CustomRuntimeException v0) {
                    throw MetadataIntrospectionEngine.b(v0);
                }
                try {
                    this.T(var2_2);
                    this.z(var2_2);
                    if (MetadataIntrospectionEngine.d != null) {
                        this.i(var2_2);
                    }
                }
                catch (CustomRuntimeException v1) {
                    throw MetadataIntrospectionEngine.b(v1);
                }
                try {
                    var2_2.e(var1_1);
                    var1_1.flush();
                    this.j = null;
                    if (!this.p) ** GOTO lbl31
                    var2_2.t();
                    this.F = true;
                }
                catch (CustomRuntimeException v2) {
                    throw MetadataIntrospectionEngine.b(v2);
                }
            } else {
                this.o.i(this.H(), var1_1);
            }
lbl31:
            // 3 sources

            this.W = 0;
            this.x = true;
        }
        catch (CustomRuntimeException var2_3) {
            throw new ContextualExceptionHandler(var2_3);
        }
        catch (IOException var2_4) {
            throw new ContextualExceptionHandler(var2_4);
        }
    }

    @Override
    public MetaclassDefinitionRegistry i() throws CustomRuntimeException {
        ClassMetadataExtractor classMetadataExtractor = this.o();
        ClassStructureAnalyzer classStructureAnalyzer = (ClassStructureAnalyzer)classMetadataExtractor.V("InnerClasses");
        try {
            if (classStructureAnalyzer == null) {
                return null;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw MetadataIntrospectionEngine.b(customRuntimeException);
        }
        String string = this.H();
        int n = classStructureAnalyzer.H();
        int n2 = 0;
        while (true) {
            block12: {
                try {
                    if (n2 >= n) break;
                    if (!string.equals(classStructureAnalyzer.r(n2))) break block12;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetadataIntrospectionEngine.b(customRuntimeException);
                }
                String string2 = classStructureAnalyzer.H(n2);
                try {
                    if (string2 != null) {
                        return this.o.g(string2);
                    }
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetadataIntrospectionEngine.b(customRuntimeException);
                }
                ClassInitializationTracker classInitializationTracker = (ClassInitializationTracker)classMetadataExtractor.V("EnclosingMethod");
                try {
                    if (classInitializationTracker != null) {
                        return this.o.g(classInitializationTracker.s());
                    }
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetadataIntrospectionEngine.b(customRuntimeException);
                }
            }
            ++n2;
        }
        return null;
    }

    private static void n(BinaryCodeAnalyzer binaryCodeAnalyzer, ComplexEntityLifecycleManager complexEntityLifecycleManager, int n) throws BytecodeProcessingException {
        BytecodeAnalysisEngine305 bytecodeAnalysisEngine305 = binaryCodeAnalyzer.h();
        int n2 = bytecodeAnalysisEngine305.x();
        if (n2 < 0) {
            n2 = bytecodeAnalysisEngine305.R();
            try {
                if (n2 >= 0) {
                    return;
                }
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw MetadataIntrospectionEngine.b(bytecodeProcessingException);
            }
        }
        int n3 = bytecodeAnalysisEngine305.X(complexEntityLifecycleManager.u());
        bytecodeAnalysisEngine305.P(complexEntityLifecycleManager.w(), n3);
        int n4 = binaryCodeAnalyzer.Q();
        try {
            if (n4 < n) {
                binaryCodeAnalyzer.D(n);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw MetadataIntrospectionEngine.b(bytecodeProcessingException);
        }
    }

    void y() {
        block10: {
            block11: {
                try {
                    try {
                        try {
                            if (this.W >= 2) break block10;
                            if (this.q()) break block11;
                        }
                        catch (RuntimeException runtimeException) {
                            throw MetadataIntrospectionEngine.b(runtimeException);
                        }
                        if (!ClassPoolRegistry.G) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw MetadataIntrospectionEngine.b(runtimeException);
                    }
                    this.V();
                    break block10;
                }
                catch (RuntimeException runtimeException) {
                    throw MetadataIntrospectionEngine.b(runtimeException);
                }
            }
            try {
                try {
                    if (!this.c() || this.F) break block10;
                }
                catch (RuntimeException runtimeException) {
                    throw MetadataIntrospectionEngine.b(runtimeException);
                }
                this.b();
            }
            catch (RuntimeException runtimeException) {
                throw MetadataIntrospectionEngine.b(runtimeException);
            }
        }
        this.W = 0;
    }

    private void L(String string) {
        try {
            if (this.F) {
                throw new RuntimeException(string + "(): " + this.H() + " was pruned.");
            }
        }
        catch (RuntimeException runtimeException) {
            throw MetadataIntrospectionEngine.b(runtimeException);
        }
    }

    private DecompilationAnalyzer v(DecompilationAnalyzer decompilationAnalyzer, String string, String string2) throws CustomRuntimeException {
        if (decompilationAnalyzer == null) {
            String string3 = "field: " + string;
            if (string2 != null) {
                string3 = string3 + " type " + string2;
            }
            throw new CustomRuntimeException(string3 + " in " + this.H());
        }
        return decompilationAnalyzer;
    }

    @Override
    public Nw t() {
        try {
            if (this.X == null) {
                this.X = new Nw(this);
            }
        }
        catch (RuntimeException runtimeException) {
            throw MetadataIntrospectionEngine.b(runtimeException);
        }
        return this.X;
    }

    final void P() {
        ++this.W;
    }

    @Override
    public int a() {
        int n;
        block7: {
            int n2;
            block8: {
                ClassMetadataExtractor classMetadataExtractor = this.o();
                n = classMetadataExtractor.c();
                n = OperationOrchestrator.E(n, 32);
                n2 = classMetadataExtractor.o();
                try {
                    if (n2 == -1) break block7;
                    if ((n2 & 8) == 0) break block8;
                }
                catch (RuntimeException runtimeException) {
                    throw MetadataIntrospectionEngine.b(runtimeException);
                }
                n |= 8;
            }
            if ((n2 & 1) != 0) {
                n |= 1;
            } else {
                n &= 0xFFFFFFFE;
                if ((n2 & 4) != 0) {
                    n |= 4;
                } else if ((n2 & 2) != 0) {
                    n |= 2;
                }
            }
        }
        return OperationOrchestrator.X(n);
    }

    @Override
    public ResourceConfigurationBuilder u() {
        ResourceHierarchyManager resourceHierarchyManager = this.h();
        SerializationUtility2100 serializationUtility2100 = resourceHierarchyManager.b();
        for (SerializationUtility2100 serializationUtility21002 = resourceHierarchyManager.S(); serializationUtility21002 != serializationUtility2100; serializationUtility21002 = serializationUtility21002.Y()) {
            ResourceConfigurationBuilder resourceConfigurationBuilder = (ResourceConfigurationBuilder)serializationUtility21002;
            try {
                if (!resourceConfigurationBuilder.Y()) continue;
                return resourceConfigurationBuilder;
            }
            catch (RuntimeException runtimeException) {
                throw MetadataIntrospectionEngine.b(runtimeException);
            }
        }
        return null;
    }

    @Override
    public DecompilationAnalyzer d(String string, String string2) throws CustomRuntimeException {
        DecompilationAnalyzer decompilationAnalyzer = this.j(string, string2);
        return this.v(decompilationAnalyzer, string, string2);
    }

    private DecompilationAnalyzer W(String string, String string2) {
        ResourceHierarchyManager resourceHierarchyManager = this.h();
        SerializationUtility2100 serializationUtility2100 = resourceHierarchyManager.s();
        SerializationUtility2100 serializationUtility21002 = resourceHierarchyManager.Q();
        while (serializationUtility2100 != serializationUtility21002) {
            if (!(serializationUtility2100 = serializationUtility2100.Y()).l().equals(string)) continue;
            try {
                if (string2 != null && !string2.equals(serializationUtility2100.I())) continue;
            }
            catch (RuntimeException runtimeException) {
                throw MetadataIntrospectionEngine.b(runtimeException);
            }
            return (DecompilationAnalyzer)serializationUtility2100;
        }
        return null;
    }

    @Override
    public void Z() {
        this.L("defrost");
        this.x = false;
    }

    private void D(ResourceHierarchyManager resourceHierarchyManager) {
        List<BytecodeInspectionEngine> list = this.K(false).L();
        for (BytecodeInspectionEngine bytecodeInspectionEngine : list) {
            try {
                if (bytecodeInspectionEngine.F()) {
                    resourceHierarchyManager.U(new ResourceIdentifier(bytecodeInspectionEngine, this));
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw MetadataIntrospectionEngine.b(runtimeException);
            }
            resourceHierarchyManager.l(new ResourceConfigurationBuilder(bytecodeInspectionEngine, this));
        }
    }

    @Override
    public ResourceIdentifier H(String string, String string2) throws CustomRuntimeException {
        ResourceIdentifier resourceIdentifier = MetadataIntrospectionEngine.W(this, string, string2);
        try {
            if (resourceIdentifier != null) {
                return resourceIdentifier;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw MetadataIntrospectionEngine.b(customRuntimeException);
        }
        throw new CustomRuntimeException(string + "(..) is not found in " + this.H());
    }

    @Override
    public ResourceConfigurationBuilder w(String string) throws CustomRuntimeException {
        ResourceHierarchyManager resourceHierarchyManager = this.h();
        SerializationUtility2100 serializationUtility2100 = resourceHierarchyManager.b();
        for (SerializationUtility2100 serializationUtility21002 = resourceHierarchyManager.S(); serializationUtility21002 != serializationUtility2100; serializationUtility21002 = serializationUtility21002.Y()) {
            ResourceConfigurationBuilder resourceConfigurationBuilder = (ResourceConfigurationBuilder)serializationUtility21002;
            try {
                try {
                    if (!resourceConfigurationBuilder.a().b().equals(string) || !resourceConfigurationBuilder.N()) continue;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetadataIntrospectionEngine.b(customRuntimeException);
                }
                return resourceConfigurationBuilder;
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw MetadataIntrospectionEngine.b(customRuntimeException);
            }
        }
        return super.w(string);
    }

    private void T(ClassMetadataExtractor classMetadataExtractor) throws ContextualExceptionHandler, CustomRuntimeException {
        try {
            if (this.j == null) {
                return;
            }
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw MetadataIntrospectionEngine.b(contextualExceptionHandler);
        }
        ComplexEntityLifecycleManager complexEntityLifecycleManager = new ComplexEntityLifecycleManager(classMetadataExtractor.X(), 0, 0);
        ArgumentInterceptor argumentInterceptor = new ArgumentInterceptor(complexEntityLifecycleManager, this);
        int n = 0;
        boolean bl = false;
        CryptographicKeyGenerator2679 cryptographicKeyGenerator2679 = this.j;
        while (cryptographicKeyGenerator2679 != null) {
            DecompilationAnalyzer decompilationAnalyzer = cryptographicKeyGenerator2679.d;
            if (ConfigurationOrchestrator2115.O(decompilationAnalyzer.A())) {
                bl = true;
                int n2 = cryptographicKeyGenerator2679.p.E(decompilationAnalyzer.Z(), decompilationAnalyzer.l(), complexEntityLifecycleManager, argumentInterceptor);
                if (n < n2) {
                    n = n2;
                }
            }
            cryptographicKeyGenerator2679 = cryptographicKeyGenerator2679.R;
        }
        try {
            if (bl) {
                this.E(classMetadataExtractor, complexEntityLifecycleManager, n, 0);
            }
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw MetadataIntrospectionEngine.b(contextualExceptionHandler);
        }
    }

    private void r(StringBuilder stringBuilder, String string, SerializationUtility2100 serializationUtility2100, SerializationUtility2100 serializationUtility21002) {
        stringBuilder.append(string);
        while (serializationUtility2100 != serializationUtility21002) {
            serializationUtility2100 = serializationUtility2100.Y();
            stringBuilder.append(serializationUtility2100);
            stringBuilder.append(", ");
        }
    }

    @Override
    protected void K(StringBuilder stringBuilder) {
        Object object;
        block22: {
            try {
                if (this.Y) {
                    stringBuilder.append("changed ");
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw MetadataIntrospectionEngine.b(customRuntimeException);
            }
            try {
                if (this.x) {
                    stringBuilder.append("frozen ");
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw MetadataIntrospectionEngine.b(customRuntimeException);
            }
            try {
                if (this.F) {
                    stringBuilder.append("pruned ");
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw MetadataIntrospectionEngine.b(customRuntimeException);
            }
            stringBuilder.append(ConfigurationOrchestrator2115.c(this.a()));
            stringBuilder.append(" class ");
            stringBuilder.append(this.H());
            try {
                object = this.G();
                if (object == null) break block22;
                String string = ((MetaclassDefinitionRegistry)object).H();
                try {
                    if (!string.equals("java.lang.Object")) {
                        stringBuilder.append(" extends ").append(((MetaclassDefinitionRegistry)object).H());
                    }
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetadataIntrospectionEngine.b(customRuntimeException);
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                stringBuilder.append(" extends ??");
            }
        }
        try {
            object = this.l();
            try {
                if (((MetaclassDefinitionRegistry[])object).length > 0) {
                    stringBuilder.append(" implements ");
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw MetadataIntrospectionEngine.b(customRuntimeException);
            }
            try {
                for (int i = 0; i < ((Object)object).length; ++i) {
                    stringBuilder.append(((MetaclassDefinitionRegistry)object[i]).H());
                    stringBuilder.append(", ");
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw MetadataIntrospectionEngine.b(customRuntimeException);
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            stringBuilder.append(" extends ??");
        }
        object = this.h();
        this.r(stringBuilder, " fields=", ((ResourceHierarchyManager)object).s(), ((ResourceHierarchyManager)object).Q());
        this.r(stringBuilder, " constructors=", ((ResourceHierarchyManager)object).S(), ((ResourceHierarchyManager)object).b());
        this.r(stringBuilder, " methods=", ((ResourceHierarchyManager)object).O(), ((ResourceHierarchyManager)object).x());
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    void m() throws RuntimeException {
        if (this.c()) {
            String string = this.H() + " class is frozen";
            if (this.F) {
                string = string + " and pruned";
            }
            throw new RuntimeException(string);
        }
        this.Y = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(4275195397812834276L, -7164239838088295476L, MethodHandles.lookup().lookupClass()).a(22288208318790L);
        long l = a ^ 0x7A36BAD5CCB5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -7575028590520817162L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private synchronized ClassMetadataExtractor q(ClassMetadataExtractor classMetadataExtractor) {
        try {
            if (this.m == null) {
                this.m = classMetadataExtractor;
            }
        }
        catch (RuntimeException runtimeException) {
            throw MetadataIntrospectionEngine.b(runtimeException);
        }
        return this.m;
    }

    private void B(ResourceHierarchyManager resourceHierarchyManager) {
        List<BytecodeAnnotationExtractor> list = this.K(false).j();
        for (BytecodeAnnotationExtractor bytecodeAnnotationExtractor : list) {
            resourceHierarchyManager.F(new DecompilationAnalyzer(bytecodeAnnotationExtractor, this));
        }
    }

    @Override
    public boolean t(MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CustomRuntimeException {
        int n;
        int n2;
        String[] stringArray;
        block25: {
            String string;
            ClassMetadataExtractor classMetadataExtractor;
            String string2;
            block23: {
                block22: {
                    string2 = metaclassDefinitionRegistry.H();
                    try {
                        try {
                            if (this != metaclassDefinitionRegistry && !this.H().equals(string2)) break block22;
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw MetadataIntrospectionEngine.b(customRuntimeException);
                        }
                        return true;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw MetadataIntrospectionEngine.b(customRuntimeException);
                    }
                }
                classMetadataExtractor = this.o();
                string = classMetadataExtractor.r();
                try {
                    try {
                        if (string == null || !string.equals(string2)) break block23;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw MetadataIntrospectionEngine.b(customRuntimeException);
                    }
                    return true;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetadataIntrospectionEngine.b(customRuntimeException);
                }
            }
            stringArray = classMetadataExtractor.v();
            n2 = stringArray.length;
            n = 0;
            while (true) {
                block24: {
                    try {
                        try {
                            if (n >= n2) break;
                            if (!stringArray[n].equals(string2)) break block24;
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw MetadataIntrospectionEngine.b(customRuntimeException);
                        }
                        return true;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw MetadataIntrospectionEngine.b(customRuntimeException);
                    }
                }
                ++n;
            }
            try {
                try {
                    if (string == null || !this.o.g(string).t(metaclassDefinitionRegistry)) break block25;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetadataIntrospectionEngine.b(customRuntimeException);
                }
                return true;
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw MetadataIntrospectionEngine.b(customRuntimeException);
            }
        }
        n = 0;
        while (true) {
            block26: {
                try {
                    try {
                        if (n >= n2) break;
                        if (!this.o.g(stringArray[n]).t(metaclassDefinitionRegistry)) break block26;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw MetadataIntrospectionEngine.b(customRuntimeException);
                    }
                    return true;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw MetadataIntrospectionEngine.b(customRuntimeException);
                }
            }
            ++n;
        }
        return false;
    }

    private void i(ClassMetadataExtractor classMetadataExtractor) throws IOException {
        try (DataOutputStream dataOutputStream = this.F(d);){
            classMetadataExtractor.e(dataOutputStream);
        }
    }

    @Override
    public _c[] L() {
        SerializationUtility2100 serializationUtility2100;
        ResourceHierarchyManager resourceHierarchyManager = this.h();
        SerializationUtility2100 serializationUtility21002 = resourceHierarchyManager.b();
        int n = ResourceHierarchyManager.z(serializationUtility2100, serializationUtility21002);
        SerializationUtility2100 serializationUtility21003 = resourceHierarchyManager.O();
        SerializationUtility2100 serializationUtility21004 = resourceHierarchyManager.x();
        int n2 = ResourceHierarchyManager.z(serializationUtility21003, serializationUtility21004);
        _c[] _cArray = new _c[n + n2];
        int n3 = 0;
        for (serializationUtility2100 = resourceHierarchyManager.S(); serializationUtility2100 != serializationUtility21002; serializationUtility2100 = serializationUtility2100.Y()) {
            _cArray[n3++] = (_c)serializationUtility2100;
        }
        while (serializationUtility21003 != serializationUtility21004) {
            serializationUtility21003 = serializationUtility21003.Y();
            _cArray[n3++] = (_c)serializationUtility21003;
        }
        return _cArray;
    }

    private int Q(ComplexEntityLifecycleManager complexEntityLifecycleManager, MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray) throws ContextualExceptionHandler, CustomRuntimeException {
        int n = 0;
        ArgumentInterceptor argumentInterceptor = new ArgumentInterceptor(complexEntityLifecycleManager, this);
        try {
            argumentInterceptor.n(metaclassDefinitionRegistryArray, false);
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw new ContextualExceptionHandler(compilationDiagnosticException);
        }
        CryptographicKeyGenerator2679 cryptographicKeyGenerator2679 = this.j;
        while (cryptographicKeyGenerator2679 != null) {
            int n2;
            DecompilationAnalyzer decompilationAnalyzer = cryptographicKeyGenerator2679.d;
            if (!ConfigurationOrchestrator2115.O(decompilationAnalyzer.A()) && n < (n2 = cryptographicKeyGenerator2679.p.j(decompilationAnalyzer.Z(), decompilationAnalyzer.l(), complexEntityLifecycleManager, metaclassDefinitionRegistryArray, argumentInterceptor))) {
                n = n2;
            }
            cryptographicKeyGenerator2679 = cryptographicKeyGenerator2679.R;
        }
        return n;
    }

    @Override
    public MetaclassDefinitionRegistry G() throws CustomRuntimeException {
        String string = this.o().r();
        try {
            if (string == null) {
                return null;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw MetadataIntrospectionEngine.b(customRuntimeException);
        }
        return this.o.g(string);
    }

    private void z(ClassMetadataExtractor classMetadataExtractor) throws ContextualExceptionHandler, CustomRuntimeException {
        try {
            if (this.j == null) {
                return;
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw MetadataIntrospectionEngine.b(bytecodeProcessingException);
        }
        BytecodeAnalyzer bytecodeAnalyzer = classMetadataExtractor.X();
        List<BytecodeInspectionEngine> list = classMetadataExtractor.L();
        for (BytecodeInspectionEngine bytecodeInspectionEngine : list) {
            BinaryCodeAnalyzer binaryCodeAnalyzer;
            if (!bytecodeInspectionEngine.O() || (binaryCodeAnalyzer = bytecodeInspectionEngine.Z()) == null) continue;
            try {
                ComplexEntityLifecycleManager complexEntityLifecycleManager = new ComplexEntityLifecycleManager(bytecodeAnalyzer, 0, binaryCodeAnalyzer.i());
                MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = ReflectionMetadataResolver933.Z(bytecodeInspectionEngine.b(), this.o);
                int n = this.Q(complexEntityLifecycleManager, metaclassDefinitionRegistryArray);
                MetadataIntrospectionEngine.n(binaryCodeAnalyzer, complexEntityLifecycleManager, n);
                bytecodeInspectionEngine.w(this.o, classMetadataExtractor);
            }
            catch (BytecodeProcessingException bytecodeProcessingException) {
                throw new ContextualExceptionHandler(bytecodeProcessingException);
            }
        }
    }

    private synchronized void V() {
        block6: {
            try {
                try {
                    try {
                        if (this.m == null || this.q()) break block6;
                    }
                    catch (RuntimeException runtimeException) {
                        throw MetadataIntrospectionEngine.b(runtimeException);
                    }
                    if (this.N() != null) break block6;
                }
                catch (RuntimeException runtimeException) {
                    throw MetadataIntrospectionEngine.b(runtimeException);
                }
                this.m = null;
            }
            catch (RuntimeException runtimeException) {
                throw MetadataIntrospectionEngine.b(runtimeException);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public ClassMetadataExtractor K(boolean bl) {
        long l = a ^ 0x77D7EB566495L;
        ClassMetadataExtractor classMetadataExtractor = this.m;
        try {
            if (classMetadataExtractor != null) {
                return classMetadataExtractor;
            }
        }
        catch (IOException iOException) {
            throw MetadataIntrospectionEngine.b(iOException);
        }
        try {
            if (bl) {
                this.o.H();
            }
        }
        catch (IOException iOException) {
            throw MetadataIntrospectionEngine.b(iOException);
        }
        Object object = this;
        // MONITORENTER : object
        classMetadataExtractor = this.m;
        if (classMetadataExtractor != null) {
            // MONITOREXIT : object
            return classMetadataExtractor;
        }
        byte[] byArray = this.V;
        // MONITOREXIT : object
        if (byArray != null) {
            try {
                object = new ClassMetadataExtractor(new DataInputStream(new ByteArrayInputStream(byArray)));
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException.toString(), iOException);
            }
            this.W = (int)c;
            MetadataIntrospectionEngine metadataIntrospectionEngine = this;
            // MONITORENTER : metadataIntrospectionEngine
            this.V = null;
            // MONITOREXIT : metadataIntrospectionEngine
            return this.q((ClassMetadataExtractor)object);
        }
        object = null;
        object = this.o.A(this.H());
        try {
            if (object == null) {
                throw new CustomRuntimeException(this.H());
            }
        }
        catch (IOException iOException) {
            throw MetadataIntrospectionEngine.b(iOException);
        }
        object = new BufferedInputStream((InputStream)object);
        ClassMetadataExtractor classMetadataExtractor2 = new ClassMetadataExtractor(new DataInputStream((InputStream)object));
        try {
            if (!classMetadataExtractor2.Z().equals(this.i)) {
                throw new RuntimeException("cannot find " + this.i + ": " + classMetadataExtractor2.Z() + " found in " + this.i.replace('.', '/') + ".class");
            }
        }
        catch (IOException iOException) {
            throw MetadataIntrospectionEngine.b(iOException);
        }
        ClassMetadataExtractor classMetadataExtractor3 = this.q(classMetadataExtractor2);
        try {
            if (object == null) return classMetadataExtractor3;
            ((InputStream)object).close();
            return classMetadataExtractor3;
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw MetadataIntrospectionEngine.b(customRuntimeException);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return classMetadataExtractor3;
        catch (CustomRuntimeException customRuntimeException) {
            try {
                throw new RuntimeException(customRuntimeException.toString(), customRuntimeException);
                catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString(), iOException);
                }
            }
            catch (Throwable throwable) {
                try {
                    if (object == null) throw throwable;
                    ((InputStream)object).close();
                    throw throwable;
                }
                catch (CustomRuntimeException customRuntimeException2) {
                    throw MetadataIntrospectionEngine.b(customRuntimeException2);
                }
                catch (IOException iOException) {
                    // empty catch block
                }
                throw throwable;
            }
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private synchronized void b() {
        block6: {
            if (this.m == null) return;
            try {
                if (this.N() == null) break block6;
                return;
                catch (IOException iOException) {
                    throw MetadataIntrospectionEngine.b(iOException);
                }
            }
            catch (IOException iOException) {
                throw MetadataIntrospectionEngine.b(iOException);
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            this.m.e(dataOutputStream);
            byteArrayOutputStream.close();
            this.V = byteArrayOutputStream.toByteArray();
            this.m = null;
            return;
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    @Override
    public MetaclassDefinitionRegistry[] l() throws CustomRuntimeException {
        String[] stringArray = this.o().v();
        int n = stringArray.length;
        MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = new MetaclassDefinitionRegistry[n];
        try {
            for (int i = 0; i < n; ++i) {
                metaclassDefinitionRegistryArray[i] = this.o.g(stringArray[i]);
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw MetadataIntrospectionEngine.b(customRuntimeException);
        }
        return metaclassDefinitionRegistryArray;
    }

    DecompilationAnalyzer j(String string, String string2) {
        DecompilationAnalyzer decompilationAnalyzer = this.W(string, string2);
        try {
            if (decompilationAnalyzer != null) {
                return decompilationAnalyzer;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw MetadataIntrospectionEngine.b(customRuntimeException);
        }
        try {
            MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = this.l();
            for (MetaclassDefinitionRegistry metaclassDefinitionRegistry : metaclassDefinitionRegistryArray) {
                DecompilationAnalyzer decompilationAnalyzer2 = metaclassDefinitionRegistry.j(string, string2);
                if (decompilationAnalyzer2 == null) continue;
                return decompilationAnalyzer2;
            }
            MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.G();
            if (metaclassDefinitionRegistry != null) {
                return metaclassDefinitionRegistry.j(string, string2);
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            // empty catch block
        }
        return null;
    }

    @Override
    public boolean c() {
        return this.x;
    }

    protected ResourceHierarchyManager N() {
        try {
            if (this.D != null) {
                return this.D.get();
            }
        }
        catch (RuntimeException runtimeException) {
            throw MetadataIntrospectionEngine.b(runtimeException);
        }
        return null;
    }

    MetadataIntrospectionEngine(String string, ClassPoolRegistry classPoolRegistry) {
        super(string);
        this.o = classPoolRegistry;
        this.N = false;
        this.F = false;
        this.x = false;
        this.Y = false;
        this.m = null;
        this.V = null;
        this.D = null;
        this.X = null;
        this.j = null;
        this.J = null;
        this.A = 0;
        this.W = 0;
    }

    protected synchronized ResourceHierarchyManager h() {
        ResourceHierarchyManager resourceHierarchyManager = null;
        if (this.D == null || (resourceHierarchyManager = this.D.get()) == null) {
            resourceHierarchyManager = new ResourceHierarchyManager(this);
            this.B(resourceHierarchyManager);
            this.D(resourceHierarchyManager);
            this.D = new WeakReference<ResourceHierarchyManager>(resourceHierarchyManager);
        }
        return resourceHierarchyManager;
    }

    /*
     * Unable to fully structure code
     */
    private void E(ClassMetadataExtractor var1_1, ComplexEntityLifecycleManager var2_2, int var3_3, int var4_4) throws ContextualExceptionHandler {
        var5_5 = var1_1.c();
        if (var5_5 == null) {
            var2_2.w(177);
            var2_2.l(var3_3);
            var2_2.e(var4_4);
            var5_5 = new BytecodeInspectionEngine(var1_1.X(), "<clinit>", "()V");
            var5_5.D(8);
            var5_5.u(var2_2.u());
            var1_1.b(var5_5);
            var6_6 = this.N();
            try {
                if (var6_6 == null) ** GOTO lbl44
                var6_6.l(new ResourceConfigurationBuilder(var5_5, this));
            }
            catch (BytecodeProcessingException v0) {
                throw MetadataIntrospectionEngine.b(v0);
            }
        } else {
            var6_6 = var5_5.Z();
            try {
                if (var6_6 == null) {
                    throw new ContextualExceptionHandler("empty <clinit>");
                }
            }
            catch (BytecodeProcessingException v1) {
                throw MetadataIntrospectionEngine.b(v1);
            }
            try {
                var7_8 = var6_6.h();
                var8_10 = var7_8.X(var2_2.u());
                var7_8.P(var2_2.w(), var8_10);
                var9_11 = var6_6.Q();
                try {
                    if (var9_11 < var3_3) {
                        var6_6.D(var3_3);
                    }
                }
                catch (BytecodeProcessingException v2) {
                    throw MetadataIntrospectionEngine.b(v2);
                }
                var10_12 = var6_6.i();
                try {
                    if (var10_12 < var4_4) {
                        var6_6.J(var4_4);
                    }
                }
                catch (BytecodeProcessingException v3) {
                    throw MetadataIntrospectionEngine.b(v3);
                }
            }
            catch (BytecodeProcessingException var7_9) {
                throw new ContextualExceptionHandler(var7_9);
            }
        }
        try {
            var5_5.w(this.o, var1_1);
        }
        catch (BytecodeProcessingException var6_7) {
            throw new ContextualExceptionHandler(var6_7);
        }
    }

    @Override
    public boolean q() {
        return this.Y;
    }

    @Override
    public ClassMetadataExtractor o() {
        return this.K(true);
    }

    @Override
    public boolean h() {
        return ConfigurationOrchestrator2115.E(this.a());
    }

    @Override
    public ClassPoolRegistry K() {
        return this.o;
    }
}

