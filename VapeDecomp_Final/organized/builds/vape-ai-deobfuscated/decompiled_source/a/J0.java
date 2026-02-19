/*
 * Decompiled with CFR 0.152.
 */
package a;

import a._c;
import com.bytecode.analysis.BytecodeAnalysisEngine305;
import com.bytecode.analysis.BytecodeAnalyzer;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.bytecode.exception.BytecodeProcessingException;
import com.entity.lifecycle.ComplexEntityLifecycleManager;
import com.error.handling.ContextualExceptionHandler;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.system.config.ResourceConfigurationBuilder;
import com.transaction.management.TransactionStrategyResolver;
import com.user.profile.UserProfileManager1412;

public abstract class J0
implements TransactionStrategyResolver {
    int e;
    MetaclassDefinitionRegistry r;
    BytecodeAnalysisEngine305 D;
    boolean V;
    private static int p;
    int I;
    int j;
    BytecodeInspectionEngine C;

    public static int X() {
        int n = J0.l();
        try {
            if (n == 0) {
                return 119;
            }
        }
        catch (RuntimeException runtimeException) {
            throw J0.a(runtimeException);
        }
        return 0;
    }

    protected final int r() {
        return this.j;
    }

    private static void A(int n, int n2, MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray, int n3, ComplexEntityLifecycleManager complexEntityLifecycleManager) {
        try {
            if (n >= n2) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw J0.a(runtimeException);
        }
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = metaclassDefinitionRegistryArray[n];
        int n4 = metaclassDefinitionRegistry instanceof UserProfileManager1412 ? ((UserProfileManager1412)metaclassDefinitionRegistry).m() : 1;
        J0.A(n + 1, n2, metaclassDefinitionRegistryArray, n3 + n4, complexEntityLifecycleManager);
        complexEntityLifecycleManager.P(n3, metaclassDefinitionRegistry);
    }

    protected final int Y() {
        return this.I;
    }

    protected J0(int n, BytecodeAnalysisEngine305 bytecodeAnalysisEngine305, MetaclassDefinitionRegistry metaclassDefinitionRegistry, BytecodeInspectionEngine bytecodeInspectionEngine) {
        this.e = n;
        this.D = bytecodeAnalysisEngine305;
        this.r = metaclassDefinitionRegistry;
        this.C = bytecodeInspectionEngine;
    }

    public static int l() {
        return p;
    }

    public abstract void N(String var1) throws ContextualExceptionHandler;

    static final boolean W(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string) throws ContextualExceptionHandler {
        boolean bl;
        block6: {
            boolean bl2;
            try {
                bl2 = string.indexOf("$_") >= 0;
            }
            catch (ContextualExceptionHandler contextualExceptionHandler) {
                throw J0.a(contextualExceptionHandler);
            }
            bl = bl2;
            try {
                try {
                    if (bl || metaclassDefinitionRegistry == MetaclassDefinitionRegistry.M) break block6;
                }
                catch (ContextualExceptionHandler contextualExceptionHandler) {
                    throw J0.a(contextualExceptionHandler);
                }
                throw new ContextualExceptionHandler("the resulting value is not stored in $_");
            }
            catch (ContextualExceptionHandler contextualExceptionHandler) {
                throw J0.a(contextualExceptionHandler);
            }
        }
        return bl;
    }

    public _c E() {
        _c[] _cArray;
        block17: {
            BytecodeInspectionEngine bytecodeInspectionEngine = this.C;
            _cArray = this.r.L();
            int n = _cArray.length - 1;
            while (true) {
                block16: {
                    try {
                        try {
                            if (n < 0) break;
                            if (_cArray[n].a() != bytecodeInspectionEngine) break block16;
                        }
                        catch (RuntimeException runtimeException) {
                            throw J0.a(runtimeException);
                        }
                        return _cArray[n];
                    }
                    catch (RuntimeException runtimeException) {
                        throw J0.a(runtimeException);
                    }
                }
                --n;
            }
            ResourceConfigurationBuilder resourceConfigurationBuilder = this.r.u();
            try {
                try {
                    if (resourceConfigurationBuilder == null || resourceConfigurationBuilder.a() != bytecodeInspectionEngine) break block17;
                }
                catch (RuntimeException runtimeException) {
                    throw J0.a(runtimeException);
                }
                return resourceConfigurationBuilder;
            }
            catch (RuntimeException runtimeException) {
                throw J0.a(runtimeException);
            }
        }
        int n = _cArray.length - 1;
        while (true) {
            block18: {
                try {
                    try {
                        try {
                            if (n < 0) break;
                            if (!this.C.C().equals(_cArray[n].a().C())) break block18;
                        }
                        catch (RuntimeException runtimeException) {
                            throw J0.a(runtimeException);
                        }
                        if (!this.C.b().equals(_cArray[n].a().b())) break block18;
                    }
                    catch (RuntimeException runtimeException) {
                        throw J0.a(runtimeException);
                    }
                    return _cArray[n];
                }
                catch (RuntimeException runtimeException) {
                    throw J0.a(runtimeException);
                }
            }
            --n;
        }
        throw new RuntimeException("fatal: not found");
    }

    protected void E(int n, ComplexEntityLifecycleManager complexEntityLifecycleManager, int n2) throws BytecodeProcessingException {
        byte[] byArray = complexEntityLifecycleManager.u();
        this.V = true;
        int n3 = byArray.length - n2;
        try {
            for (int i = 0; i < n2; ++i) {
                this.D.g(0, n + i);
            }
        }
        catch (BytecodeProcessingException bytecodeProcessingException) {
            throw J0.a(bytecodeProcessingException);
        }
        if (n3 > 0) {
            n = this.D.J((int)n, (int)n3, (boolean)false).m;
        }
        this.D.Z(byArray, n);
        this.D.P(complexEntityLifecycleManager.w(), n);
        this.j = complexEntityLifecycleManager.D();
        this.I = complexEntityLifecycleManager.L();
    }

    public int H() {
        return this.C.i(this.e);
    }

    static final void x(MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray, boolean bl, int n, ComplexEntityLifecycleManager complexEntityLifecycleManager) {
        try {
            J0.A(0, metaclassDefinitionRegistryArray.length, metaclassDefinitionRegistryArray, n + 1, complexEntityLifecycleManager);
            if (bl) {
                complexEntityLifecycleManager.E(1);
            }
        }
        catch (RuntimeException runtimeException) {
            throw J0.a(runtimeException);
        }
        complexEntityLifecycleManager.S(n);
    }

    public static void I(int n) {
        p = n;
    }

    protected final boolean u() {
        boolean bl;
        try {
            bl = (this.C.Z() & 8) != 0;
        }
        catch (RuntimeException runtimeException) {
            throw J0.a(runtimeException);
        }
        return bl;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    protected final boolean G() {
        return this.V;
    }

    protected final BytecodeAnalyzer e() {
        return this.C.v();
    }

    static {
        if (J0.l() == 0) {
            J0.I(15);
        }
    }
}

