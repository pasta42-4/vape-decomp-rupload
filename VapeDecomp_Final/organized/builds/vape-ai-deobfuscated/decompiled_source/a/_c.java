/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.app.bytecode.analysis.BytecodeMetadataExtractor;
import com.app.core.configuration.ConfigurationInitializer;
import com.app.monitoring.metrics.MetricTracker;
import com.bytecode.analysis.BinaryCodeAnalyzer;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.bytecode.analysis.BytecodeInspectionUtility;
import com.bytecode.exception.BytecodeProcessingException;
import com.bytecode.instrumentation.ArgumentInterceptor;
import com.configuration.management.ConfigurationOrchestrator2115;
import com.core.exception.CustomRuntimeException;
import com.deobfuscation.orchestration.OperationOrchestrator;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.error.handling.ContextualExceptionHandler;
import com.network.performance.TransmissionRateManager;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.system.compilation.CompilationDiagnosticException;
import com.user.profile.UserProfileManager1412;
import com.util.serialization.SerializationUtility2100;

public abstract class _c
extends SerializationUtility2100 {
    protected BytecodeInspectionEngine G;

    /*
     * Unable to fully structure code
     */
    public void X(String var1_1, boolean var2_2, boolean var3_3) throws ContextualExceptionHandler {
        var4_4 = this.k;
        var4_4.m();
        var5_5 = this.G.v();
        var6_6 = this.G.Z();
        try {
            if (var6_6 == null) {
                throw new ContextualExceptionHandler("no method body");
            }
        }
        catch (CustomRuntimeException v0) {
            throw _c.a(v0);
        }
        var7_7 = var6_6.h();
        var8_8 = var6_6.i();
        var9_9 = new ComplexEntityLifecycleManager(var5_5, 0, var8_8 + 1);
        var9_9.Z(var6_6.Q() + 1);
        var10_10 = new ArgumentInterceptor(var9_9, var4_4);
        try {
            var11_11 = var10_10.n(this.C(), ConfigurationOrchestrator2115.O(this.A()));
            var10_10.K(var6_6, var11_11);
            var12_15 = this.P();
            var13_16 = var10_10.Y(var12_15, true);
            var10_10.X(var6_6, 0);
            var14_17 = this.O(var2_2, var9_9, var12_15, var13_16, var10_10, var1_1);
            var15_18 = var7_7.d();
            try {
                if (var2_2) {
                    var6_6.u().E(this.p(var6_6), var15_18, var15_18, 0);
                }
            }
            catch (CustomRuntimeException v1) {
                throw _c.a(v1);
            }
            var16_19 = 0;
            var17_20 = 0;
            var18_21 = true;
            while (var7_7.L()) {
                block30: {
                    block32: {
                        block31: {
                            block37: {
                                block36: {
                                    block35: {
                                        block34: {
                                            block33: {
                                                var19_22 = var7_7.S();
                                                try {
                                                    if (var19_22 >= var15_18) {
                                                        break;
                                                    }
                                                }
                                                catch (CustomRuntimeException v2) {
                                                    throw _c.a(v2);
                                                }
                                                var20_23 = var7_7.z(var19_22);
                                                if (var20_23 == 176) ** GOTO lbl75
                                                if (var20_23 == 172) ** GOTO lbl75
                                                break block33;
                                                catch (CustomRuntimeException v3) {
                                                    throw _c.a(v3);
                                                }
                                            }
                                            if (var20_23 == 174) ** GOTO lbl75
                                            break block34;
                                            catch (CustomRuntimeException v4) {
                                                throw _c.a(v4);
                                            }
                                        }
                                        if (var20_23 == 173) ** GOTO lbl75
                                        break block35;
                                        catch (CustomRuntimeException v5) {
                                            throw _c.a(v5);
                                        }
                                    }
                                    if (var20_23 == 175) ** GOTO lbl75
                                    break block36;
                                    catch (CustomRuntimeException v6) {
                                        throw _c.a(v6);
                                    }
                                }
                                if (var20_23 != 177) continue;
                                break block37;
                                catch (CustomRuntimeException v7) {
                                    throw _c.a(v7);
                                }
                            }
                            try {
                                block38: {
                                    if (!var3_3) break block30;
                                    break block38;
                                    catch (CustomRuntimeException v8) {
                                        throw _c.a(v8);
                                    }
                                }
                                var7_7.D(var15_18);
                                if (!var18_21) break block31;
                            }
                            catch (CustomRuntimeException v9) {
                                throw _c.a(v9);
                            }
                            var18_21 = false;
                            var21_24 = var9_9;
                            var22_25 = var10_10;
                            var23_26 = var13_16;
                            break block32;
                        }
                        var21_24 = new ComplexEntityLifecycleManager(var5_5, 0, var8_8 + 1);
                        var21_24.Z(var6_6.Q() + 1);
                        var22_25 = new ArgumentInterceptor(var21_24, var4_4);
                        var24_27 = var22_25.n(this.C(), ConfigurationOrchestrator2115.O(this.A()));
                        var22_25.K(var6_6, var24_27);
                        var23_26 = var22_25.Y(var12_15, true);
                        var22_25.X(var6_6, 0);
                    }
                    var24_27 = this.i(var21_24, var22_25, var1_1, var5_5, var12_15, var23_26);
                    var25_28 = var7_7.z(var21_24.u());
                    var7_7.J(var21_24.w(), var25_28);
                    var26_29 = var7_7.d() - var24_27;
                    this.g(var7_7, var26_29, var19_22);
                    var15_18 = var7_7.f();
                    continue;
                }
                if (var18_21) {
                    var16_19 = this.i(var9_9, var10_10, var1_1, var5_5, var12_15, var13_16);
                    var15_18 = var7_7.z(var9_9.u());
                    var7_7.J(var9_9.w(), var15_18);
                    var17_20 = var7_7.d() - var16_19;
                    var14_17 = var17_20 - var15_18;
                    var18_21 = false;
                }
                this.g(var7_7, var17_20, var19_22);
                var17_20 = var7_7.d() - var16_19;
                var15_18 = var17_20 - var14_17;
            }
            if (var18_21) {
                var15_18 = var7_7.z(var9_9.u());
                var7_7.J(var9_9.w(), var15_18);
            }
            var6_6.D(var9_9.L());
            var6_6.J(var9_9.D());
            this.G.w(var4_4.K(), var4_4.o());
        }
        catch (CustomRuntimeException var11_12) {
            throw new ContextualExceptionHandler(var11_12);
        }
        catch (CompilationDiagnosticException var11_13) {
            throw new ContextualExceptionHandler(var11_13);
        }
        catch (BytecodeProcessingException var11_14) {
            throw new ContextualExceptionHandler(var11_14);
        }
    }

    protected _c(MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine) {
        super(metaclassDefinitionRegistry);
        this.G = bytecodeInspectionEngine;
    }

    public int E(int n, boolean bl, String string) throws ContextualExceptionHandler {
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.G.Z();
        try {
            if (binaryCodeAnalyzer == null) {
                throw new ContextualExceptionHandler("no method body");
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw _c.a(customRuntimeException);
        }
        BytecodeInspectionUtility bytecodeInspectionUtility = (BytecodeInspectionUtility)binaryCodeAnalyzer.G("LineNumberTable");
        try {
            if (bytecodeInspectionUtility == null) {
                throw new ContextualExceptionHandler("no line number info");
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw _c.a(customRuntimeException);
        }
        TransmissionRateManager transmissionRateManager = bytecodeInspectionUtility.B(n);
        n = transmissionRateManager.u;
        int n2 = transmissionRateManager.n;
        try {
            if (!bl) {
                return n;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw _c.a(customRuntimeException);
        }
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.k;
        metaclassDefinitionRegistry.m();
        BytecodeAnalysisEngine305 bytecodeAnalysisEngine305 = binaryCodeAnalyzer.h();
        ArgumentInterceptor argumentInterceptor = new ArgumentInterceptor(metaclassDefinitionRegistry);
        try {
            argumentInterceptor.X(binaryCodeAnalyzer, n2);
            argumentInterceptor.n(this.C(), ConfigurationOrchestrator2115.O(this.A()));
            argumentInterceptor.A(binaryCodeAnalyzer.i());
            argumentInterceptor.b(string);
            ComplexEntityLifecycleManager complexEntityLifecycleManager = argumentInterceptor.k();
            int n3 = complexEntityLifecycleManager.D();
            int n4 = complexEntityLifecycleManager.L();
            try {
                binaryCodeAnalyzer.J(n3);
                if (n4 > binaryCodeAnalyzer.Q()) {
                    binaryCodeAnalyzer.D(n4);
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw _c.a(customRuntimeException);
            }
            n2 = bytecodeAnalysisEngine305.z(n2, complexEntityLifecycleManager.u());
            bytecodeAnalysisEngine305.P(complexEntityLifecycleManager.w(), n2);
            this.G.w(metaclassDefinitionRegistry.K(), metaclassDefinitionRegistry.o());
            return n;
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw new ContextualExceptionHandler(customRuntimeException);
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw new ContextualExceptionHandler(compilationDiagnosticException);
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new ContextualExceptionHandler(bytecodeProcessingException);
        }
    }

    public void x(ConfigurationInitializer configurationInitializer) throws ContextualExceptionHandler {
        try {
            if (this.k.c()) {
                this.k.m();
            }
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw _c.a(contextualExceptionHandler);
        }
        try {
            if (configurationInitializer.Y(this.k, this.G)) {
                this.k.m();
            }
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw _c.a(contextualExceptionHandler);
        }
    }

    public void V(String string) throws ContextualExceptionHandler {
        this.L(string, true);
    }

    public BytecodeInspectionEngine a() {
        return this.G;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void L(String string, boolean bl) throws ContextualExceptionHandler {
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.k;
        metaclassDefinitionRegistry.m();
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.G.Z();
        try {
            if (binaryCodeAnalyzer == null) {
                throw new ContextualExceptionHandler("no method body");
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw _c.a(customRuntimeException);
        }
        BytecodeAnalysisEngine305 bytecodeAnalysisEngine305 = binaryCodeAnalyzer.h();
        ArgumentInterceptor argumentInterceptor = new ArgumentInterceptor(metaclassDefinitionRegistry);
        try {
            int n = argumentInterceptor.n(this.C(), ConfigurationOrchestrator2115.O(this.A()));
            argumentInterceptor.K(binaryCodeAnalyzer, n);
            argumentInterceptor.X(binaryCodeAnalyzer, 0);
            argumentInterceptor.Y(this.P(), false);
            argumentInterceptor.b(string);
            ComplexEntityLifecycleManager complexEntityLifecycleManager = argumentInterceptor.k();
            int n2 = complexEntityLifecycleManager.L();
            int n3 = complexEntityLifecycleManager.D();
            try {
                if (n2 > binaryCodeAnalyzer.Q()) {
                    binaryCodeAnalyzer.D(n2);
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw _c.a(customRuntimeException);
            }
            try {
                if (n3 > binaryCodeAnalyzer.i()) {
                    binaryCodeAnalyzer.J(n3);
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw _c.a(customRuntimeException);
            }
            int n4 = bytecodeAnalysisEngine305.X(complexEntityLifecycleManager.u());
            try {
                bytecodeAnalysisEngine305.P(complexEntityLifecycleManager.w(), n4);
                if (bl) {
                    this.G.w(metaclassDefinitionRegistry.K(), metaclassDefinitionRegistry.o());
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw _c.a(customRuntimeException);
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw new ContextualExceptionHandler(customRuntimeException);
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw new ContextualExceptionHandler(compilationDiagnosticException);
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new ContextualExceptionHandler(bytecodeProcessingException);
        }
    }

    public void o(String string, MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws ContextualExceptionHandler {
        this.k.m();
        BytecodeAnalyzer bytecodeAnalyzer = this.G.v();
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.G.Z();
        try {
            if (binaryCodeAnalyzer == null) {
                throw new ContextualExceptionHandler("no method body");
            }
        }
        catch (ContextualExceptionHandler contextualExceptionHandler) {
            throw _c.a(contextualExceptionHandler);
        }
        BytecodeMetadataExtractor bytecodeMetadataExtractor = (BytecodeMetadataExtractor)binaryCodeAnalyzer.G("LocalVariableTable");
        if (bytecodeMetadataExtractor == null) {
            bytecodeMetadataExtractor = new BytecodeMetadataExtractor(bytecodeAnalyzer);
            binaryCodeAnalyzer.w().add(bytecodeMetadataExtractor);
        }
        int n = binaryCodeAnalyzer.i();
        String string2 = ReflectionMetadataResolver933.H(metaclassDefinitionRegistry);
        bytecodeMetadataExtractor.D(0, binaryCodeAnalyzer.O(), bytecodeAnalyzer.D(string), bytecodeAnalyzer.D(string2), n);
        binaryCodeAnalyzer.J(n + ReflectionMetadataResolver933.q(string2));
    }

    public MetaclassDefinitionRegistry[] C() throws CustomRuntimeException {
        return ReflectionMetadataResolver933.Z(this.G.b(), this.k.K());
    }

    @Override
    public String I() {
        return this.G.b();
    }

    private int O(boolean bl, ComplexEntityLifecycleManager complexEntityLifecycleManager, MetaclassDefinitionRegistry metaclassDefinitionRegistry, int n, ArgumentInterceptor argumentInterceptor, String string) throws CompilationDiagnosticException {
        int n2;
        int n3;
        block14: {
            try {
                if (!bl) {
                    return 0;
                }
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw _c.a(compilationDiagnosticException);
            }
            n3 = complexEntityLifecycleManager.D();
            complexEntityLifecycleManager.J(1);
            n2 = complexEntityLifecycleManager.H();
            complexEntityLifecycleManager.S(n3);
            if (metaclassDefinitionRegistry.m()) {
                block17: {
                    char c;
                    block16: {
                        block15: {
                            block13: {
                                c = ((UserProfileManager1412)metaclassDefinitionRegistry).y();
                                try {
                                    if (c != 'D') break block13;
                                    complexEntityLifecycleManager.p(0.0);
                                    complexEntityLifecycleManager.N(n);
                                    break block14;
                                }
                                catch (CompilationDiagnosticException compilationDiagnosticException) {
                                    throw _c.a(compilationDiagnosticException);
                                }
                            }
                            try {
                                if (c != 'F') break block15;
                                complexEntityLifecycleManager.s(0.0f);
                                complexEntityLifecycleManager.q(n);
                                break block14;
                            }
                            catch (CompilationDiagnosticException compilationDiagnosticException) {
                                throw _c.a(compilationDiagnosticException);
                            }
                        }
                        try {
                            if (c != 'J') break block16;
                            complexEntityLifecycleManager.M(0L);
                            complexEntityLifecycleManager.x(n);
                            break block14;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw _c.a(compilationDiagnosticException);
                        }
                    }
                    try {
                        if (c != 'V') break block17;
                        complexEntityLifecycleManager.E(1);
                        complexEntityLifecycleManager.S(n);
                        break block14;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw _c.a(compilationDiagnosticException);
                    }
                }
                complexEntityLifecycleManager.a(0);
                complexEntityLifecycleManager.o(n);
            } else {
                complexEntityLifecycleManager.E(1);
                complexEntityLifecycleManager.S(n);
            }
        }
        argumentInterceptor.b(string);
        complexEntityLifecycleManager.B(n3);
        complexEntityLifecycleManager.E(191);
        return complexEntityLifecycleManager.H() - n2;
    }

    public void P(String string, MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws ContextualExceptionHandler {
        this.C(string, metaclassDefinitionRegistry, "$e");
    }

    @Override
    public int A() {
        return OperationOrchestrator.X(this.G.Z());
    }

    private int i(ComplexEntityLifecycleManager complexEntityLifecycleManager, ArgumentInterceptor argumentInterceptor, String string, BytecodeAnalyzer bytecodeAnalyzer, MetaclassDefinitionRegistry metaclassDefinitionRegistry, int n) throws CompilationDiagnosticException {
        int n2;
        block7: {
            block8: {
                block6: {
                    n2 = complexEntityLifecycleManager.H();
                    try {
                        try {
                            if (metaclassDefinitionRegistry != MetaclassDefinitionRegistry.M) break block6;
                            complexEntityLifecycleManager.E(1);
                            complexEntityLifecycleManager.S(n);
                            argumentInterceptor.b(string);
                            complexEntityLifecycleManager.E(177);
                            if (complexEntityLifecycleManager.D() >= 1) break block7;
                        }
                        catch (CompilationDiagnosticException compilationDiagnosticException) {
                            throw _c.a(compilationDiagnosticException);
                        }
                        complexEntityLifecycleManager.e(1);
                        break block7;
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw _c.a(compilationDiagnosticException);
                    }
                }
                try {
                    complexEntityLifecycleManager.P(n, metaclassDefinitionRegistry);
                    argumentInterceptor.b(string);
                    complexEntityLifecycleManager.y(n, metaclassDefinitionRegistry);
                    if (!metaclassDefinitionRegistry.m()) break block8;
                    complexEntityLifecycleManager.E(((UserProfileManager1412)metaclassDefinitionRegistry).G());
                    break block7;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw _c.a(compilationDiagnosticException);
                }
            }
            complexEntityLifecycleManager.E(176);
        }
        return complexEntityLifecycleManager.H() - n2;
    }

    public void C(String string, MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string2) throws ContextualExceptionHandler {
        MetaclassDefinitionRegistry metaclassDefinitionRegistry2 = this.k;
        metaclassDefinitionRegistry2.m();
        BytecodeAnalyzer bytecodeAnalyzer = this.G.v();
        BinaryCodeAnalyzer binaryCodeAnalyzer = this.G.Z();
        BytecodeAnalysisEngine305 bytecodeAnalysisEngine305 = binaryCodeAnalyzer.h();
        ComplexEntityLifecycleManager complexEntityLifecycleManager = new ComplexEntityLifecycleManager(bytecodeAnalyzer, binaryCodeAnalyzer.Q(), binaryCodeAnalyzer.i());
        complexEntityLifecycleManager.Z(1);
        ArgumentInterceptor argumentInterceptor = new ArgumentInterceptor(complexEntityLifecycleManager, metaclassDefinitionRegistry2);
        try {
            argumentInterceptor.n(this.C(), ConfigurationOrchestrator2115.O(this.A()));
            int n = argumentInterceptor.a(metaclassDefinitionRegistry, string2);
            complexEntityLifecycleManager.S(n);
            argumentInterceptor.b(string);
            int n2 = complexEntityLifecycleManager.L();
            int n3 = complexEntityLifecycleManager.D();
            try {
                if (n2 > binaryCodeAnalyzer.Q()) {
                    binaryCodeAnalyzer.D(n2);
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw _c.a(customRuntimeException);
            }
            try {
                if (n3 > binaryCodeAnalyzer.i()) {
                    binaryCodeAnalyzer.J(n3);
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw _c.a(customRuntimeException);
            }
            int n4 = bytecodeAnalysisEngine305.d();
            int n5 = bytecodeAnalysisEngine305.z(complexEntityLifecycleManager.u());
            binaryCodeAnalyzer.u().E(this.p(binaryCodeAnalyzer), n4, n4, bytecodeAnalyzer.A(metaclassDefinitionRegistry));
            bytecodeAnalysisEngine305.J(complexEntityLifecycleManager.w(), n5);
            this.G.w(metaclassDefinitionRegistry2.K(), metaclassDefinitionRegistry2.o());
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw new ContextualExceptionHandler(customRuntimeException);
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw new ContextualExceptionHandler(compilationDiagnosticException);
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw new ContextualExceptionHandler(bytecodeProcessingException);
        }
    }

    private void g(BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, int n, int n2) throws BytecodeProcessingException {
        block10: {
            MetricTracker metricTracker;
            block11: {
                int n3;
                block9: {
                    int n4;
                    boolean bl;
                    try {
                        bytecodeAnalysisEngine305.q(n);
                        bytecodeAnalysisEngine305.g(0, n2);
                        bl = n + 2 - n2 > Short.MAX_VALUE;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw _c.a(bytecodeProcessingException);
                    }
                    boolean bl2 = bl;
                    try {
                        n4 = bl2 ? 4 : 2;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw _c.a(bytecodeProcessingException);
                    }
                    int n5 = n4;
                    metricTracker = bytecodeAnalysisEngine305.J(n2, n5, false);
                    n2 = metricTracker.m + metricTracker.X - n5;
                    n3 = bytecodeAnalysisEngine305.M() - n2;
                    try {
                        if (!bl2) break block9;
                        bytecodeAnalysisEngine305.g(200, n2);
                        bytecodeAnalysisEngine305.k(n3, n2 + 1);
                        break block10;
                    }
                    catch (BytecodeProcessingException bytecodeProcessingException) {
                        throw _c.a(bytecodeProcessingException);
                    }
                }
                try {
                    if (n3 > Short.MAX_VALUE) break block11;
                    bytecodeAnalysisEngine305.g(167, n2);
                    bytecodeAnalysisEngine305.V(n3, n2 + 1);
                    break block10;
                }
                catch (BytecodeProcessingException bytecodeProcessingException) {
                    throw _c.a(bytecodeProcessingException);
                }
            }
            if (metricTracker.X < 4) {
                MetricTracker metricTracker2 = bytecodeAnalysisEngine305.J(metricTracker.m, 2, false);
                n2 = metricTracker2.m + metricTracker2.X + metricTracker.X - 4;
            }
            bytecodeAnalysisEngine305.g(200, n2);
            bytecodeAnalysisEngine305.k(bytecodeAnalysisEngine305.M() - n2, n2 + 1);
        }
    }

    MetaclassDefinitionRegistry P() throws CustomRuntimeException {
        return ReflectionMetadataResolver933.X(this.G.b(), this.k.K());
    }

    int p(BinaryCodeAnalyzer binaryCodeAnalyzer) throws ContextualExceptionHandler {
        return 0;
    }

    public void j(String string) throws ContextualExceptionHandler {
        this.X(string, false, false);
    }

    public int p(int n, String string) throws ContextualExceptionHandler {
        return this.E(n, true, string);
    }

    @Override
    protected void r(StringBuilder stringBuilder) {
        stringBuilder.append(' ');
        stringBuilder.append(this.l());
        stringBuilder.append(' ');
        stringBuilder.append(this.G.b());
    }
}

