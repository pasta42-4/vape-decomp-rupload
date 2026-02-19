/*
 * Decompiled with CFR 0.152.
 */
package com.security.policy;

import a.KB;
import a._Y;
import a.a;
import a.kg;
import a.oQ;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.core.comparison.QualityFactorComparator;
import com.app.core.sorting.QualityFactorSorter;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.sorting.QueueComparator;
import com.app.sorting.comparison.PriorityComparator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.sorting.CustomObjectComparator;
import com.data.streaming.StreamProcessingOrchestrator1917;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.ContextualEventDispatcher;
import com.event.management.EventDispatchCoordinator1595;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.color.ColorCompositionEngine;
import com.graphics.palette.ColorPaletteManager;
import com.math.calculation.NumericCalculationEngine;
import com.math.generation.RandomGeometryGenerator;
import com.math.geometry.GeometryCalculator;
import com.network.clustering.ClusterNodeRegistry1151;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionLifecycleManager;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.numeric.precision.NumericPrecisionTransformer;
import com.output.processing.OutputEncoder;
import com.random.generation.RandomGenerationEngine;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.security.crypto.CryptographicSecurityProvider;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.event.SecureEventOrchestrator;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transfer.SecureDataExchanger1153;
import com.security.transform.CryptographicTransformer;
import com.simulation.calibration.SimulationParameterCalibrator;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.core.SystemStateOrchestrator1145;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.randomization.RandomGenerationEngine1239;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import com.util.numeric.NumericFormattingUtility;
import com.util.reflection.ReflectionUtility;
import com.vape.sorting.VapeProductComparator;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class PolicyEnforcementHandler
extends ContextualExecutionFramework {
    public final AuthenticationStateTracker A;
    public final AuthenticationStateTracker AY;
    private boolean AD;
    public final AuthenticationGateway1860 AF;
    public final AuthenticationStateTracker O;
    private final AuthenticationStateTracker Av;
    private final AuthenticationGateway1860 j;
    private final AuthenticationStateTracker z;
    public final AuthenticationGateway1860 l;
    public final AuthenticationGateway1860 A6;
    public final AuthenticationGateway1860 o;
    private boolean m;
    private float AX;
    private final AdaptiveRenderingEngine Aq;
    private boolean AA;
    private boolean F;
    private final RandomGeometryGenerator Ag;
    private float Y;
    private static final long[] fb;
    private final RandomGeometryGenerator AN;
    private static SimulationParameterCalibrator Ac;
    private final NumericFormattingUtility P;
    private float A5;
    public final ColorPaletteManager AW;
    public final ReflectionUtility Z;
    private static SecureDataExchanger1153 t;
    public final AuthenticationGateway1860 h;
    private float x;
    private static final Object[] kb;
    public final RandomGenerationEngine1239 An;
    public GenericAdapterManager AH;
    private final NetworkConfigManager K;
    private final AuthenticationStateTracker R;
    private boolean v;
    private static final Map hb;
    public final AuthenticationGateway1860 N;
    private TransactionOrchestrator1017 AT;
    private float A0;
    private static final String[] lb;
    private final ConnectionLifecycleManager G;
    private final ColorPaletteManager V;
    public final NumericPrecisionTransformer e;
    private final AuthenticationStateTracker A1;
    private float AM;
    public final NumericPrecisionTransformer T;
    private final RandomGeometryGenerator r;
    private static final Integer[] gb;
    public GenericAdapterManager AI;
    private long B;
    public final AuthenticationGateway1860 n;
    public GenericAdapterManager w;
    private static final long bb;
    public final AuthenticationGateway1860 L;
    public final NumericPrecisionTransformer Au;
    private final Random b;
    private final AdaptiveRenderingEngine Ax;
    private boolean d;
    private CryptographicSecurityProvider X;
    public final AuthenticationStateTracker A2;

    @DataExchangeProtocol2090
    public void i(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        block16: {
            ColorCompositionEngine colorCompositionEngine;
            Color color;
            double d2;
            TransactionOrchestrator1017 transactionOrchestrator1017;
            block20: {
                ColorCompositionEngine colorCompositionEngine2;
                float f;
                float f2;
                float f3;
                double d3;
                double d4;
                double d5;
                block22: {
                    block21: {
                        float f4;
                        block19: {
                            block18: {
                                try {
                                    block17: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (!this.A2.s().booleanValue() || this.AT == null) break block16;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw PolicyEnforcementHandler.a(customSystemException);
                                                    }
                                                    if (!ApplicationLifecycleManager.X().Y()) break block16;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw PolicyEnforcementHandler.a(customSystemException);
                                                }
                                                if (this.AT.B(ReflectionMetadataResolver.UQ)) break block17;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw PolicyEnforcementHandler.a(customSystemException);
                                            }
                                            if (!this.AT.B(ReflectionMetadataResolver.Pr)) break block18;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw PolicyEnforcementHandler.a(customSystemException);
                                        }
                                    }
                                    f4 = 0.7f;
                                    break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                            }
                            f4 = this.AT.d();
                        }
                        float f5 = f4;
                        try {
                            try {
                                if (!this.N.o()) break block20;
                                d5 = this.AT.r();
                                d4 = this.AT.y();
                                d3 = this.AT.D();
                                f3 = 50.0f;
                                f2 = f5;
                                f = this.AT.L();
                                if (!this.E()) break block21;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                            colorCompositionEngine2 = this.Ax.L();
                            break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                    }
                    colorCompositionEngine2 = this.Aq.L();
                }
                ConfigurationManager.a(d5, d4, d3, f3, f2, f, colorCompositionEngine2);
                break block16;
            }
            try {
                transactionOrchestrator1017 = this.AT;
                d2 = 1.0;
                color = null;
                colorCompositionEngine = this.E() ? this.Ax.L() : this.Aq.L();
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
            CryptoContextNegotiator684.G(transactionOrchestrator1017, d2, color, colorCompositionEngine, eventDispatchRegistry2111.getTicks());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void U() {
        block33: {
            block35: {
                int n;
                float f;
                float f2;
                float f3;
                float f4;
                float f5;
                float f6;
                float f7;
                float f8;
                float f9;
                float f10;
                float f11;
                float f12;
                float f13;
                double d2;
                block36: {
                    float f14;
                    boolean bl;
                    double d3;
                    double d4;
                    double d5;
                    double d6;
                    double d7;
                    double d8;
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                    block34: {
                        boolean bl2;
                        block32: {
                            block31: {
                                try {
                                    if (ApplicationLifecycleManager.c().Y()) {
                                        this.l();
                                        return;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                                try {
                                    try {
                                        if (this.AT == null || !this.J(this.AT)) break block31;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PolicyEnforcementHandler.a(customSystemException);
                                    }
                                    bl2 = true;
                                    break block32;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                            }
                            bl2 = false;
                        }
                        boolean bl3 = bl2;
                        boolean bl4 = this.G.z(this);
                        try {
                            if (!bl3 || !bl4) break block33;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                        this.n();
                        systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        double[] dArray = this.J(this.AT);
                        d8 = dArray[0];
                        double d9 = dArray[1];
                        d7 = dArray[2];
                        double d10 = dArray[3];
                        double d11 = dArray[4];
                        double d12 = dArray[5];
                        d2 = systemConfigurationOrchestrator.w(d8, d9, d7);
                        double d13 = d8 - d10;
                        double d14 = d7 - d12;
                        d6 = Math.sqrt(d13 * d13 + d14 * d14);
                        d5 = d8 + this.Ag.x() * (1.0 + d6);
                        d4 = d7 + this.AN.x() * (1.0 + d6);
                        double d15 = d9;
                        double d16 = this.AT.L();
                        double d17 = systemConfigurationOrchestrator.V() + 1.62;
                        d3 = d17 < d15 ? d15 + this.r.x() * 0.5 : Math.min(d17, d15 + d16) - 0.275 + this.r.x();
                        try {
                            if (this.X != null) break block34;
                            this.X = new EventDispatchCoordinator1595(this);
                            this.X.n(false);
                            this.X.q(true);
                            this.X.F(true);
                            this.X.N(0.0f);
                            this.X.i(false);
                            this.X.J(false);
                            ConfigurationCalibrator.b.W(this.X);
                            break block35;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                    }
                    this.X.n(false);
                    this.X.i(false);
                    this.X.J(false);
                    NumericCalculationEngine numericCalculationEngine = this.X.j(ContextualEventDispatcher.N(d5, d3, d4));
                    float f15 = (float)_Y.w(systemConfigurationOrchestrator, d8, d3, d7);
                    f13 = ConfigurationCalibrator.b.Y();
                    f12 = ConfigurationCalibrator.b.p();
                    f11 = AdaptiveComputationEngine.v(numericCalculationEngine.D() - f13);
                    f10 = AdaptiveComputationEngine.v(f15 - f12);
                    f9 = f12 - ConfigurationCalibrator.b.l();
                    f8 = f13 - ConfigurationCalibrator.b.o();
                    f7 = 0.05f;
                    try {
                        bl = Math.signum(f11) == Math.signum(f8);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                    boolean bl5 = bl;
                    double d18 = Math.sqrt(systemConfigurationOrchestrator.G() * systemConfigurationOrchestrator.G() + systemConfigurationOrchestrator.o() * systemConfigurationOrchestrator.o());
                    f6 = 0.45f * this.x;
                    f5 = 0.91f * this.A5;
                    try {
                        f14 = this.AD ? 0.05f : 0.1f;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                    f4 = f14 * this.Y;
                    f3 = 0.33f * this.A0;
                    double d19 = systemConfigurationOrchestrator.x();
                    if (Math.abs(d19) > 0.1) {
                        f10 *= (float)(1.0 + Math.random() * 0.32);
                    }
                    try {
                        if (!bl5 || !(Math.abs(f11) < 20.0f)) break block36;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                    f4 *= 2.5f;
                    f8 *= (float)(1.0 + Math.min(d6 + d18, 0.25));
                }
                if (d2 < 0.8) {
                    double d20 = d2 / 0.8;
                    f10 *= (float)(d20 * d20);
                    f11 *= (float)d20;
                }
                try {
                    f2 = f10 - f9;
                    f = f8 * f7;
                    n = Math.random() >= 0.5 ? -1 : 1;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                float f16 = f2 + f * (float)n;
                float f17 = f11 - f8;
                this.AX += f16 * f7;
                this.AM += f17 * f7;
                float f18 = f6 * f16 + f5 * this.AX + 0.0f;
                float f19 = f4 * f17 + f3 * this.AM + 0.0f;
                if (Math.abs(f11) > 120.0f) {
                    this.AM = 0.0f;
                    f19 = 0.0f;
                }
                try {
                    if (ApplicationLifecycleManager.X().r()) {
                        this.AM = 0.0f;
                        this.AX = 0.0f;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                this.X.v(f13 + f11 + f19 / 3.0f, f12 + f18);
            }
            try {
                block37: {
                    try {
                        try {
                            if (ConfigurationCalibrator.b.N() == null) break block37;
                            if (this.i()) return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                        if (!ConfigurationCalibrator.b.P()) return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                }
                ConfigurationCalibrator.b.W(this.X);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
        }
        this.l();
    }

    private boolean S() {
        block18: {
            block20: {
                block19: {
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    try {
                        if (systemConfigurationOrchestrator.Y()) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (!this.z.s().booleanValue() || !this.K.m(this.B)) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                                if (!this.Av.s().booleanValue()) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                            if (this.V.H(systemConfigurationOrchestrator.K())) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                }
                try {
                    if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                NetworkPacketInterceptor1107 networkPacketInterceptor1107 = SystemStateOrchestrator1145.J();
                try {
                    try {
                        if (!networkPacketInterceptor1107.r() || !networkPacketInterceptor1107.h()) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                    if (!DynamicContextBroker.e()) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().G();
                OutputEncoder.r(connectionPoolOrchestrator1192, true, false);
                return true;
            }
            this.B = (long)this.P.l();
            this.K.m();
        }
        return false;
    }

    static TransactionOrchestrator1017 w(PolicyEnforcementHandler policyEnforcementHandler) {
        return policyEnforcementHandler.AT;
    }

    public TransactionOrchestrator1017 m() {
        return this.AT;
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "$\r>";
        objectArray[1] = Integer.TYPE;
        PolicyEnforcementHandler.lb[1] = "java/lang/Integer";
        objectArray[2] = "6\u000fGR(n=\u0000V\u001dUv.\u0007_T";
        objectArray[3] = "\u0016'\u001d\u0004F?\u001d(\fK'1\u0016#\b\u0011";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0013\u001f\u0011oUh\fJ\n\t^lrB]wT{K\u0016\u00166T\u0017K\u001c\u0012dTg\b\u001d\t`5";
    }

    @Override
    public void y(boolean bl, boolean bl2) {
        block9: {
            block6: {
                boolean bl3;
                block8: {
                    block7: {
                        try {
                            try {
                                try {
                                    this.AX = 0.0f;
                                    this.AM = 0.0f;
                                    if (bl || !this.i()) break block6;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                                PolicyEnforcementHandler policyEnforcementHandler = this;
                                if (this.F) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                            bl3 = true;
                            break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                    }
                    bl3 = false;
                }
                policyEnforcementHandler.F = bl3;
                break block9;
            }
            this.F = false;
            super.y(bl, bl2);
        }
    }

    private boolean x(TransactionOrchestrator1017 transactionOrchestrator1017) {
        if (this.A.s().booleanValue()) {
            LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().K();
            try {
                if (!this.AW.b(lightweightExecutionContext, false)) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
            return this.Z.u(transactionOrchestrator1017);
        }
        return this.Z.u(transactionOrchestrator1017);
    }

    public boolean r() {
        block4: {
            boolean bl;
            try {
                if (!GameVersionEnumerator.MC_1_12_2.H() || !this.A1.s().booleanValue()) break block4;
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
            float f = ApplicationLifecycleManager.U().X(0.0f);
            try {
                bl = f == 1.0f;
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
            return bl;
        }
        return this.An.J();
    }

    private double M() {
        return 3.0 + (Double)this.T.J();
    }

    private static Method d(long l, long l2) {
        int n = PolicyEnforcementHandler.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = lb[n];
                int n3 = string2.indexOf(8);
                clazz3 = PolicyEnforcementHandler.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = PolicyEnforcementHandler.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = PolicyEnforcementHandler.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        PolicyEnforcementHandler.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = PolicyEnforcementHandler.b(221445886397443L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = PolicyEnforcementHandler.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        PolicyEnforcementHandler.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = PolicyEnforcementHandler.b(221445886397443L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static Field c(long l, long l2) {
        int n = PolicyEnforcementHandler.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = PolicyEnforcementHandler.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = PolicyEnforcementHandler.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = PolicyEnforcementHandler.a(clazz3, string2, clazz2)) != null) {
                    PolicyEnforcementHandler.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = PolicyEnforcementHandler.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        PolicyEnforcementHandler.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = PolicyEnforcementHandler.b(221445886397443L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean E() {
        boolean bl;
        block8: {
            bl = false;
            try {
                try {
                    if (this.AT == null || !this.i()) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                if (!this.Y(this.AT)) break block8;
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
            NetworkPacketInterceptor1107 networkPacketInterceptor1107 = ConfigurationCalibrator.b.B();
            try {
                try {
                    if (networkPacketInterceptor1107 == null || !networkPacketInterceptor1107.r()) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                if (!this.AT.equals(networkPacketInterceptor1107.l())) break block8;
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
            bl = true;
        }
        return bl;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void u(KB kB) {
        block67: {
            block66: {
                block59: {
                    long l;
                    block61: {
                        block58: {
                            l = bb ^ 0x3C3DE4BCB849L;
                            try {
                                this.v = this.S();
                                if (this.m) {
                                    this.m = false;
                                    ApplicationLifecycleManager.N().G().B();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                            try {
                                if (ApplicationLifecycleManager.U().Y()) {
                                    this.l();
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                            try {
                                block57: {
                                    try {
                                        try {
                                            if (this.F || !this.Z()) break block57;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw PolicyEnforcementHandler.a(customSystemException);
                                        }
                                        if (!this.v) break block58;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PolicyEnforcementHandler.a(customSystemException);
                                    }
                                }
                                this.l();
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                        }
                        try {
                            if (t == null) {
                                t = TemporalMetadataResolver.h.U().K(SecureDataExchanger1153.class);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                        try {
                            if (!t.Z()) {
                                t.T(true);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                        try {
                            block60: {
                                try {
                                    try {
                                        this.H();
                                        if (!this.O.s().booleanValue()) break block59;
                                        if (ApplicationLifecycleManager.U().O()) break block60;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PolicyEnforcementHandler.a(customSystemException);
                                    }
                                    if (!(ApplicationLifecycleManager.U().e() <= 0.0f)) break block61;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                            }
                            this.m();
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                    }
                    if (GeometryCalculator.C() >= 35) {
                        block62: {
                            SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
                            try {
                                try {
                                    try {
                                        if (!secureEventOrchestrator.r()) break block59;
                                        if (this.AA) break block62;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PolicyEnforcementHandler.a(customSystemException);
                                    }
                                    if (!secureEventOrchestrator.B(ReflectionMetadataResolver.Yu)) break block62;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                                this.AA = true;
                                this.m();
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                        }
                        this.AA = false;
                    } else {
                        StreamProcessingOrchestrator1917 streamProcessingOrchestrator1917 = ApplicationLifecycleManager.k();
                        if (streamProcessingOrchestrator1917.r()) {
                            String string;
                            block63: {
                                string = streamProcessingOrchestrator1917.A();
                                try {
                                    block64: {
                                        try {
                                            try {
                                                try {
                                                    if (this.AA || string == null) break block63;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw PolicyEnforcementHandler.a(customSystemException);
                                                }
                                                if (string.toLowerCase().contains((CharSequence)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)15797, (long)(0x31255BFFBE15C992L ^ l)), (long)-5122995017858920109L, (long)l)))) break block64;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw PolicyEnforcementHandler.a(customSystemException);
                                            }
                                            if (!string.toLowerCase().contains((CharSequence)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)23739, (long)(0x82A8845A3EB2891L ^ l)), (long)-5122995017858920109L, (long)l)))) break block63;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw PolicyEnforcementHandler.a(customSystemException);
                                        }
                                    }
                                    this.AA = true;
                                    this.m();
                                    return;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if (string != null && !string.equals("")) break block59;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                                this.AA = false;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                        }
                    }
                }
                try {
                    block65: {
                        try {
                            try {
                                if (!ClusterNodeRegistry1151.W().S().D()) break block65;
                                if (!this.AY.s().booleanValue()) break block66;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                            if (DynamicContextBroker.e()) break block66;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                    }
                    this.l();
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
            }
            try {
                try {
                    try {
                        this.q();
                        this.U();
                        if (!GameVersionEnumerator.MC_1_12_2.H() || !this.A1.s().booleanValue()) break block67;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                    if (!this.l()) break block67;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                ApplicationLifecycleManager.N().G().L();
                this.m = true;
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
        }
    }

    @Override
    public String t() {
        long l = bb ^ 0x7B30D07CEC6DL;
        return this.An.p() + (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)16052, (long)(0x5112845578809E8AL ^ l)), (long)-1386211338876091017L, (long)l));
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == 'P' || c == '\u00e2' || c == '\u00c5') {
                field = PolicyEnforcementHandler.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'P' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = PolicyEnforcementHandler.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'r' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void n() {
        this.r.L();
        this.Ag.L();
        this.AN.L();
    }

    @Override
    public void v() {
        try {
            if (this.X != null) {
                this.X = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        this.G.b(this);
    }

    public void l() {
        block18: {
            block16: {
                try {
                    try {
                        this.AX = 0.0f;
                        this.AM = 0.0f;
                        this.AT = null;
                        this.d = false;
                        if (this.X == null || !this.i()) break block16;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                    this.X.i(true);
                    this.X.J(true);
                    ConfigurationCalibrator.b.v(this.X);
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
            }
            try {
                try {
                    block17: {
                        try {
                            try {
                                try {
                                    try {
                                        if (ConfigurationCalibrator.b.N() == null || ConfigurationCalibrator.b.N() != this.X) break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PolicyEnforcementHandler.a(customSystemException);
                                    }
                                    if (this.X == null) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                                if (!this.X.G()) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                            if (!this.X.F()) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                    }
                    this.X = null;
                    this.G.b(this);
                    if (!this.F) break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                this.F = false;
                super.y(false, true);
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void q() {
        ObjectLifecycleTracker objectLifecycleTracker;
        ArrayList<CryptographicTransformer> arrayList;
        block51: {
            block54: {
                block53: {
                    block52: {
                        block50: {
                            arrayList = new ArrayList<CryptographicTransformer>();
                            try {
                                if (this.c()) {
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                            ArrayList arrayList2 = new ArrayList(ApplicationLifecycleManager.c().L());
                            for (Object e : arrayList2) {
                                objectLifecycleTracker = new CryptographicTransformer(e);
                                try {
                                    try {
                                        if (DynamicContextBroker.e && objectLifecycleTracker.B(ReflectionMetadataResolver.PR)) {
                                            continue;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PolicyEnforcementHandler.a(customSystemException);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                                if (!objectLifecycleTracker.B(ReflectionMetadataResolver.Ut)) continue;
                                TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(e);
                                try {
                                    if (!this.J(transactionOrchestrator1017)) continue;
                                    arrayList.add(transactionOrchestrator1017);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                            }
                            try {
                                if (this.w.J() != this.AF) break block50;
                                arrayList.sort(new QualityFactorComparator());
                                break block51;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                        }
                        try {
                            if (this.w.J() != this.j) break block52;
                            arrayList.sort(new QualityFactorSorter());
                            break block51;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                    }
                    try {
                        if (this.w.J() != this.o) break block53;
                        arrayList.sort(new PriorityComparator());
                        break block51;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                }
                try {
                    if (this.w.J() != this.L) break block54;
                    arrayList.sort(new CustomObjectComparator());
                    break block51;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
            }
            try {
                if (this.w.J() == this.h) {
                    arrayList.sort(new QueueComparator());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
        }
        try {
            if (this.R.s().booleanValue()) {
                arrayList.sort(new VapeProductComparator(this));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        if (!arrayList.isEmpty()) {
            block57: {
                TransactionOrchestrator1017 transactionOrchestrator1017;
                block56: {
                    boolean bl;
                    block55: {
                        transactionOrchestrator1017 = (TransactionOrchestrator1017)arrayList.get(0);
                        bl = false;
                        try {
                            if (this.AT == null || this.AT.equals(transactionOrchestrator1017)) break block55;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                        bl = true;
                    }
                    try {
                        try {
                            if (this.AT != null && !bl) break block56;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                        ApplicationLifecycleManager.N().G().B();
                        this.B();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                }
                try {
                    this.AT = transactionOrchestrator1017;
                    if (!this.G.z(this)) {
                        this.G.O(this, true);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                try {
                    try {
                        this.d = false;
                        if (this.X == null) return;
                        if (!GameVersionEnumerator.MC_1_12_2.H()) break block57;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                    if (!this.A1.s().booleanValue()) break block57;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                objectLifecycleTracker = ConfigurationCalibrator.b.B();
                try {
                    try {
                        try {
                            if (!objectLifecycleTracker.r() || !((NetworkPacketInterceptor1107)objectLifecycleTracker).l().r()) return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                        if (!((NetworkPacketInterceptor1107)objectLifecycleTracker).l().equals(this.AT)) return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                    this.d = true;
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
            }
            double d2 = _Y.a(this.AT);
            try {
                try {
                    if (!(d2 < 3.0) || !this.Y(this.AT)) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                this.d = true;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
        }
        this.l();
    }

    private boolean c() {
        boolean bl;
        block18: {
            block17: {
                try {
                    if (Ac == null) {
                        Ac = TemporalMetadataResolver.h.U().K(SimulationParameterCalibrator.class);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                try {
                    block15: {
                        try {
                            try {
                                try {
                                    block16: {
                                        try {
                                            try {
                                                if (this.F) break block15;
                                                if (Ac == null) break block16;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw PolicyEnforcementHandler.a(customSystemException);
                                            }
                                            if (Ac.Z()) break block15;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw PolicyEnforcementHandler.a(customSystemException);
                                        }
                                    }
                                    if (this.v) break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PolicyEnforcementHandler.a(customSystemException);
                                }
                                if (!this.G.F(this)) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw PolicyEnforcementHandler.a(customSystemException);
                            }
                            if (this.G.O(this, true)) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PolicyEnforcementHandler.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void H() {
        block4: {
            try {
                try {
                    if (this.AT == null || !this.i()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                this.AD = this.E();
                this.X.N(this.Ax.L());
                this.X.V(this.Aq.L());
                this.X.o(this.AD);
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = PolicyEnforcementHandler.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                PolicyEnforcementHandler.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public PolicyEnforcementHandler() {
        long l = bb ^ 0x5E24F129D5D8L;
        super(a.cs((int)PolicyEnforcementHandler.a("z", (int)20399, (long)(0x456E7CF3550D605L ^ l))), (int)PolicyEnforcementHandler.a("z", (int)9647, (long)(0x468FE9CBA658BC15L ^ l)), RecursiveNodeGraph.X, a.cs((int)PolicyEnforcementHandler.a("z", (int)18782, (long)(0x3585822B6525D0D9L ^ l))));
        this.Z = ReflectionUtility.L(this);
        this.Au = NumericPrecisionTransformer.b(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)20179, (long)(0x2F7B5BE62037D766L ^ l)), (long)-3065239176384791358L, (long)l)), (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)17272, (long)(0x3D4687E3495F5AF9L ^ l)), (long)-3065239176384791358L, (long)l)), "", 1.0, 7.0, 10.0, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)13975, (long)(0x7D5446347C992F1AL ^ l)), (long)-3065239176384791358L, (long)l)));
        this.T = NumericPrecisionTransformer.b(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)10268, (long)(0x2AF43BA6FA7FB193L ^ l)), (long)-3065239176384791358L, (long)l)), (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)30549, (long)(0x4B840B0773EAEEFBL ^ l)), (long)-3065239176384791358L, (long)l)), "", 0.0, 1.0, 3.0, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)27185, (long)(0x27FA6FD80A65F393L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.AY = AuthenticationStateTracker.w(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)27949, (long)(0x14C2C5110F33F49DL ^ l)), (long)-3065239176384791358L, (long)l)), false);
        this.O = AuthenticationStateTracker.w(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)4598, (long)(0x4D7F01295461886CL ^ l)), (long)-3065239176384791358L, (long)l)), false);
        this.A2 = AuthenticationStateTracker.w(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)18072, (long)(0x416B25C77B7B5F29L ^ l)), (long)-3065239176384791358L, (long)l)), false);
        this.R = AuthenticationStateTracker.R(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)30333, (long)(0x175D14885F6FEFCFL ^ l)), (long)-3065239176384791358L, (long)l)), false, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)6023, (long)(0xF053807F2D90E26L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.A = AuthenticationStateTracker.R(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)16898, (long)(0x14E8637DD35D5BA1L ^ l)), (long)-3065239176384791358L, (long)l)), false, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)11916, (long)(0x2D591DA80D84370FL ^ l)), (long)-3065239176384791358L, (long)l)));
        this.z = AuthenticationStateTracker.R(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)29847, (long)(0x762D9731A0F0ED31L ^ l)), (long)-3065239176384791358L, (long)l)), false, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)13148, (long)(0x3C0EAD41BAC52AC7L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.P = NumericFormattingUtility.K(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)24006, (long)(0x24507E62BF9B444FL ^ l)), (long)-3065239176384791358L, (long)l)), (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)19807, (long)(0x7614C98B19D654DAL ^ l)), (long)-3065239176384791358L, (long)l)), "", 0.0, 0.0, 10.0, 2000.0, 1.0, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)12398, (long)(0x51BFD4E9EB0F29E0L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.Av = AuthenticationStateTracker.w(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)28097, (long)(0x5C845D60C1477479L ^ l)), (long)-3065239176384791358L, (long)l)), false);
        this.V = ColorPaletteManager.o(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)2917, (long)(0x6E5BECA581712C1L ^ l)), (long)-3065239176384791358L, (long)l)), (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)19855, (long)(0x6BF0B4DAFBDFD422L ^ l)), (long)-3065239176384791358L, (long)l)), ColorPaletteManager.U, Arrays.asList(new RecursiveNodeTreeBuilder((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)4190, (long)(0x332CBE1A585089E0L ^ l)), (long)-3065239176384791358L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)25474, (long)(0x61C31B16FE03FA31L ^ l)), (long)-3065239176384791358L, (long)l)))));
        this.An = RandomGenerationEngine1239.a(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)27415, (long)(0xB9A9E2926FEF2A0L ^ l)), (long)-3065239176384791358L, (long)l)), (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)28076, (long)(0x779236D945BCF424L ^ l)), (long)-3065239176384791358L, (long)l)), "", 1.0, 6.0, 13.0, 20.0);
        this.e = NumericPrecisionTransformer.D(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)20220, (long)(0x2537889B3E92D77CL ^ l)), (long)-3065239176384791358L, (long)l)), (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)12052, (long)(0x1D4D8996535CB6B3L ^ l)), (long)-3065239176384791358L, (long)l)), "", 1.0, 120.0, 360.0, 5.0, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)3698, (long)(0x48332A8E173497DAL ^ l)), (long)-3065239176384791358L, (long)l)));
        this.Aq = AdaptiveRenderingEngine.M(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)15613, (long)(0x4AA0F9C5CC31257BL ^ l)), (long)-3065239176384791358L, (long)l)), new Color(255, 200, 112), 50);
        this.Ax = AdaptiveRenderingEngine.C(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)12889, (long)(0x1BD90686E49FABC1L ^ l)), (long)-3065239176384791358L, (long)l)), new Color(255, 0, 0, 100));
        this.j = new AuthenticationGateway1860((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)7938, (long)(0x1BDEA8842FAA86A2L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.AF = new AuthenticationGateway1860((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)13210, (long)(0x1C53D1EBEA01AA2EL ^ l)), (long)-3065239176384791358L, (long)l)));
        this.L = new AuthenticationGateway1860((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)12108, (long)(0x16C624F2EC936F0L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.o = new AuthenticationGateway1860((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)31902, (long)(0x4DD5B779D0ABE537L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.h = new AuthenticationGateway1860((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)20905, (long)(0x3FA2E0F93FC54836L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.w = GenericAdapterManager.I(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)17482, (long)(0x1F82BE348568DDCEL ^ l)), (long)-3065239176384791358L, (long)l)), (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)14686, (long)(0x312641D3491E20DCL ^ l)), (long)-3065239176384791358L, (long)l)), this.j, this.j, this.AF, this.L, this.o, this.h);
        this.AW = ColorPaletteManager.o(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)23476, (long)(0x1F151D2D1BC1C211L ^ l)), (long)-3065239176384791358L, (long)l)), (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)24661, (long)(0x4F005BEE0CF479FAL ^ l)), (long)-3065239176384791358L, (long)l)), ColorPaletteManager.U, Collections.emptyList());
        this.l = new AuthenticationGateway1860((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)27884, (long)(0x6B7CCD6DA6C3F555L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.n = new AuthenticationGateway1860((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)31361, (long)(0x501269053944E33EL ^ l)), (long)-3065239176384791358L, (long)l)));
        this.AI = GenericAdapterManager.I(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)26736, (long)(0x3B5649AF2D9771FCL ^ l)), (long)-3065239176384791358L, (long)l)), (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)10765, (long)(0x756A78BF7F43B3A1L ^ l)), (long)-3065239176384791358L, (long)l)), this.l, this.l, this.n);
        this.N = new AuthenticationGateway1860((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)4357, (long)(0x1FFBA77265F008B8L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.A6 = new AuthenticationGateway1860((String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)21982, (long)(0x44D46D4F38964C47L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.AH = GenericAdapterManager.D(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)12681, (long)(0x5946F81624E3A822L ^ l)), (long)-3065239176384791358L, (long)l)), this.N, this.N, this.A6);
        this.A1 = AuthenticationStateTracker.R(this, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)27179, (long)(0x15699401BB0173A1L ^ l)), (long)-3065239176384791358L, (long)l)), false, (String)((Object)PolicyEnforcementHandler.c("r", (int)PolicyEnforcementHandler.a("z", (int)21438, (long)(0x7D33D36E63C4A20L ^ l)), (long)-3065239176384791358L, (long)l)));
        this.AT = null;
        this.F = false;
        this.AA = false;
        this.B = 0L;
        this.K = new NetworkConfigManager();
        this.AD = false;
        this.G = ConfigurationRegistry.O;
        this.AX = 0.0f;
        this.AM = 0.0f;
        this.b = new Random();
        this.x = 1.0f;
        this.A5 = 1.0f;
        this.Y = 1.0f;
        this.A0 = 1.0f;
        this.r = new RandomGeometryGenerator(-0.3, 0.25);
        this.Ag = new RandomGeometryGenerator(-0.15, 0.15);
        this.AN = new RandomGeometryGenerator(-0.15, 0.15);
        this.m = false;
        this.N(this.Z, this.Au, this.An, this.T, this.e, this.w, this.AI);
        this.A2.l(this.Aq, this.Ax, this.AH);
        this.z.l(this.P, this.Av);
        this.Av.l(this.V);
        this.e(this.A1, GameVersionEnumerator.MC_1_8_9.q());
        this.e(this.R, GameVersionEnumerator.MC_1_8_9.V());
        this.N(new ConfigurationProfileResolver[]{this.O, this.z, this.P, this.Av, this.V, this.AY, this.A2, this.Aq, this.Ax, this.AH, this.A.l(this.AW), this.AW});
        this.A.E(this.AW);
        this.G.y(this, 5);
        this.An.Z(0);
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private void B() {
        this.x = 0.85f + this.b.nextFloat() * 0.3f;
        this.A5 = 0.85f + this.b.nextFloat() * 0.3f;
        this.Y = 0.8f + this.b.nextFloat() * 0.4f;
        this.A0 = 0.85f + this.b.nextFloat() * 0.3f;
    }

    static ConnectionLifecycleManager w(PolicyEnforcementHandler policyEnforcementHandler) {
        return policyEnforcementHandler.G;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (lb[n4] != null) {
            return n4;
        }
        Object object = kb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 53;
                break;
            }
            case 1: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 22;
                break;
            }
            case 3: {
                n3 = 24;
                break;
            }
            case 4: {
                n3 = 4;
                break;
            }
            case 5: {
                n3 = 21;
                break;
            }
            case 6: {
                n3 = 31;
                break;
            }
            case 7: {
                n3 = 2;
                break;
            }
            case 8: {
                n3 = 11;
                break;
            }
            case 9: {
                n3 = 39;
                break;
            }
            case 10: {
                n3 = 42;
                break;
            }
            case 11: {
                n3 = 50;
                break;
            }
            case 12: {
                n3 = 63;
                break;
            }
            case 13: {
                n3 = 49;
                break;
            }
            case 14: {
                n3 = 47;
                break;
            }
            case 15: {
                n3 = 20;
                break;
            }
            case 16: {
                n3 = 26;
                break;
            }
            case 17: {
                n3 = 61;
                break;
            }
            case 18: {
                n3 = 25;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 41;
                break;
            }
            case 21: {
                n3 = 33;
                break;
            }
            case 22: {
                n3 = 27;
                break;
            }
            case 23: {
                n3 = 17;
                break;
            }
            case 24: {
                n3 = 35;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 62;
                break;
            }
            case 27: {
                n3 = 37;
                break;
            }
            case 28: {
                n3 = 60;
                break;
            }
            case 29: {
                n3 = 34;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 52;
                break;
            }
            case 32: {
                n3 = 7;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 59;
                break;
            }
            case 35: {
                n3 = 29;
                break;
            }
            case 36: {
                n3 = 13;
                break;
            }
            case 37: {
                n3 = 30;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 39: {
                n3 = 44;
                break;
            }
            case 40: {
                n3 = 0;
                break;
            }
            case 41: {
                n3 = 28;
                break;
            }
            case 42: {
                n3 = 38;
                break;
            }
            case 43: {
                n3 = 58;
                break;
            }
            case 44: {
                n3 = 46;
                break;
            }
            case 45: {
                n3 = 15;
                break;
            }
            case 46: {
                n3 = 16;
                break;
            }
            case 47: {
                n3 = 40;
                break;
            }
            case 48: {
                n3 = 51;
                break;
            }
            case 49: {
                n3 = 14;
                break;
            }
            case 50: {
                n3 = 48;
                break;
            }
            case 51: {
                n3 = 36;
                break;
            }
            case 52: {
                n3 = 12;
                break;
            }
            case 53: {
                n3 = 54;
                break;
            }
            case 54: {
                n3 = 3;
                break;
            }
            case 55: {
                n3 = 56;
                break;
            }
            case 56: {
                n3 = 55;
                break;
            }
            case 57: {
                n3 = 23;
                break;
            }
            case 58: {
                n3 = 32;
                break;
            }
            case 59: {
                n3 = 8;
                break;
            }
            case 60: {
                n3 = 5;
                break;
            }
            case 61: {
                n3 = 43;
                break;
            }
            case 62: {
                n3 = 18;
                break;
            }
            default: {
                n3 = 57;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        PolicyEnforcementHandler.lb[n4] = new String(cArray);
        return n4;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4CDD;
        if (gb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            PolicyEnforcementHandler.gb[n2] = n3;
        }
        return gb[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = PolicyEnforcementHandler.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = PolicyEnforcementHandler.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean l() {
        try {
            if (ApplicationLifecycleManager.c().Y()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        try {
            if (!this.r()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        try {
            if (!this.d) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        try {
            if (ApplicationLifecycleManager.X().r()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        try {
            if (this.v) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        return true;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = PolicyEnforcementHandler.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private double[] J(TransactionOrchestrator1017 transactionOrchestrator1017) {
        if (this.AI.J() == this.n) {
            kg kg2 = _Y.t(ApplicationLifecycleManager.U(), (oQ)transactionOrchestrator1017.L(), 0.0, 0.0, 0.0);
            double d2 = transactionOrchestrator1017.F() - transactionOrchestrator1017.f();
            double d3 = transactionOrchestrator1017.V() - transactionOrchestrator1017.l();
            double d4 = transactionOrchestrator1017.B() - transactionOrchestrator1017.n();
            double d5 = kg2.R();
            double d6 = transactionOrchestrator1017.V();
            double d7 = kg2.U();
            double d8 = d5 - d2;
            double d9 = transactionOrchestrator1017.l();
            double d10 = d7 - d4;
            return new double[]{d5, d6, d7, d8, d9, d10};
        }
        return new double[]{transactionOrchestrator1017.F(), transactionOrchestrator1017.V(), transactionOrchestrator1017.B(), transactionOrchestrator1017.f(), transactionOrchestrator1017.l(), transactionOrchestrator1017.n()};
    }

    private boolean i() {
        boolean bl;
        block5: {
            block4: {
                RandomGenerationEngine randomGenerationEngine = ConfigurationCalibrator.b.N();
                try {
                    try {
                        if (randomGenerationEngine == null || !randomGenerationEngine.equals(this.X)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw PolicyEnforcementHandler.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean J(TransactionOrchestrator1017 transactionOrchestrator1017) {
        block25: {
            try {
                if (transactionOrchestrator1017.Y()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
            try {
                if (transactionOrchestrator1017.equals(ApplicationLifecycleManager.U())) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
            try {
                try {
                    if (!(transactionOrchestrator1017.e() <= 0.0f) && !transactionOrchestrator1017.O()) break block25;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
        }
        try {
            if (!this.Y(transactionOrchestrator1017)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        try {
            if (_Y.g(ApplicationLifecycleManager.U(), transactionOrchestrator1017) > ((Double)this.e.J()).intValue() / 2) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        try {
            if (TemporalMetadataResolver.h.j().h(transactionOrchestrator1017)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        try {
            if (transactionOrchestrator1017.equals(ApplicationLifecycleManager.U().o())) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        try {
            if (!this.x(transactionOrchestrator1017)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                PolicyEnforcementHandler.bb = MultiContainerRegistry.a(4449862269631839841L, -617168923162864772L, MethodHandles.lookup().lookupClass()).a(272625981753920L);
                PolicyEnforcementHandler.kb = new Object[5];
                PolicyEnforcementHandler.lb = new String[5];
                PolicyEnforcementHandler.a();
                PolicyEnforcementHandler.hb = new HashMap<K, V>(13);
                var0 = PolicyEnforcementHandler.bb ^ 64360599447363L;
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
                var8_3 = new long[54];
                var5_4 = 0;
                var6_5 = "\u00bb\u00d5b\u00ff\u0090\u0010\u00ec?\u0016h\u00a6!7J\u00a7|\u00c2\u00bd\bJ_\u001e\u00c4\u00a4\u0090\u0018v`\u00a8\u00c1\u0085k{/\u0012qL_y\u0007\u000f[\u00a2\u00cb\u00b5\u00cc\u0012\u00e9\u00fcn\u000b\u0086\u00cbW\u00c8W\u00e2\u00f14f\u007f*t^\u00d2,\u001d\f\u00c6\u001f>>\u00b9*\u00a2\u00da\u0099\r>\u00a0v\u00eac\u007f\t6\u00b9V&\u001d\u001b\u00ac\u00eb?\u00a7{\u0014Q\u0098\u0089\u00d1\u0084\u00ec<\u00ed\u00d3\u00baC|\u00e91lZO\u0085\u008c\u00e8\u00eb\u0091:\u008a\u00e6(=\u00a8\u00e5\u0007i}\u0084\u0004^o\u00b3\u00e0\u0004\u00da\u00828\u00ca\u0005:>a\u0082'h\u00d4\b\u008dbX\u00a6M\u00e4\u00a4\u0016`@\u00ac\u00eb\u00c9\u001fH\u00fdS\u00f2\u008c%\u00e8\u00a1\u0083\u00d9\n\u0016\u00f9\u00ac\u0007\u001et:\u00f2%\u008fk\u0006B\u0007\u0085%\u0014(d\u0003\"\u00d7'\u00a36\u001f\u0084B\u0095!M[\u00a8\u00d5\u00eak\u00ea}\u0080\u00126\u000f\u00b4d\u00cds\u00ba\u008f\u00d8\u00d0\u00c3 \u00fe6c\u0004\u0017>m\u00d0U{\u00e2`\u001c\u0002\u0013\u00abZ\u00c7\u00d3\t\u00d8\u00aa4\u00f3r\u00ad\u00b7\u0096\u008e\u009e\u00a3\u001e\u00a6\u0013\u0012\u00ef@\u0003\u00b0\u00c7\u0015\u00c1\u00a0\f|\u0099\u00e4\u0016\u00bc2k\u0004\u0083#\u00f7\u001d^H\u009ar\u0005^.\u00c1\u00de\u00d8\u00fcd\u0016\u00e4\u0099\u0014\u00d9\u0087\u00a5T\u00fc\u00b3\u0011\u00c3\u00b3\u00af\\j\u00a3\u00e5\u008b\u00b4'^?^\u0089\u00c6\u0019\u00d7\u00a9\u0012tG\u00d9\u00b4\u0095\u008f\u009c\u00ec\u0015\u0012\u00f5\u00e4\u00a5\u00e6\u00d6vI\u00cfLc\u00f5\u0013\u0013\u00db\u00c6\u009e\u0004WP\u00c0\u00a4\u00a3z\u0001\u00e0m\u000bY\u00b2\u00b7RDs\u00f42\u00a6\u00cd\u000e\u00b2\u00dc\u00f0\u0014\u00c7u\u00b5\u00dc\u00f7\\L\u001d\u008e\u00cf\u00a6\u0014\u00d3jX\u00f73\u00b0\u0003\u00f3v\u001b)\u00eaU;\u00ed\u00c7\u00eb\u0083#4\u00f8\u00dc,SR\u001c86";
                var7_6 = "\u00bb\u00d5b\u00ff\u0090\u0010\u00ec?\u0016h\u00a6!7J\u00a7|\u00c2\u00bd\bJ_\u001e\u00c4\u00a4\u0090\u0018v`\u00a8\u00c1\u0085k{/\u0012qL_y\u0007\u000f[\u00a2\u00cb\u00b5\u00cc\u0012\u00e9\u00fcn\u000b\u0086\u00cbW\u00c8W\u00e2\u00f14f\u007f*t^\u00d2,\u001d\f\u00c6\u001f>>\u00b9*\u00a2\u00da\u0099\r>\u00a0v\u00eac\u007f\t6\u00b9V&\u001d\u001b\u00ac\u00eb?\u00a7{\u0014Q\u0098\u0089\u00d1\u0084\u00ec<\u00ed\u00d3\u00baC|\u00e91lZO\u0085\u008c\u00e8\u00eb\u0091:\u008a\u00e6(=\u00a8\u00e5\u0007i}\u0084\u0004^o\u00b3\u00e0\u0004\u00da\u00828\u00ca\u0005:>a\u0082'h\u00d4\b\u008dbX\u00a6M\u00e4\u00a4\u0016`@\u00ac\u00eb\u00c9\u001fH\u00fdS\u00f2\u008c%\u00e8\u00a1\u0083\u00d9\n\u0016\u00f9\u00ac\u0007\u001et:\u00f2%\u008fk\u0006B\u0007\u0085%\u0014(d\u0003\"\u00d7'\u00a36\u001f\u0084B\u0095!M[\u00a8\u00d5\u00eak\u00ea}\u0080\u00126\u000f\u00b4d\u00cds\u00ba\u008f\u00d8\u00d0\u00c3 \u00fe6c\u0004\u0017>m\u00d0U{\u00e2`\u001c\u0002\u0013\u00abZ\u00c7\u00d3\t\u00d8\u00aa4\u00f3r\u00ad\u00b7\u0096\u008e\u009e\u00a3\u001e\u00a6\u0013\u0012\u00ef@\u0003\u00b0\u00c7\u0015\u00c1\u00a0\f|\u0099\u00e4\u0016\u00bc2k\u0004\u0083#\u00f7\u001d^H\u009ar\u0005^.\u00c1\u00de\u00d8\u00fcd\u0016\u00e4\u0099\u0014\u00d9\u0087\u00a5T\u00fc\u00b3\u0011\u00c3\u00b3\u00af\\j\u00a3\u00e5\u008b\u00b4'^?^\u0089\u00c6\u0019\u00d7\u00a9\u0012tG\u00d9\u00b4\u0095\u008f\u009c\u00ec\u0015\u0012\u00f5\u00e4\u00a5\u00e6\u00d6vI\u00cfLc\u00f5\u0013\u0013\u00db\u00c6\u009e\u0004WP\u00c0\u00a4\u00a3z\u0001\u00e0m\u000bY\u00b2\u00b7RDs\u00f42\u00a6\u00cd\u000e\u00b2\u00dc\u00f0\u0014\u00c7u\u00b5\u00dc\u00f7\\L\u001d\u008e\u00cf\u00a6\u0014\u00d3jX\u00f73\u00b0\u0003\u00f3v\u001b)\u00eaU;\u00ed\u00c7\u00eb\u0083#4\u00f8\u00dc,SR\u001c86".length();
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
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00a9\u00f0\u0016\u00db\u00cd)TS\u00e8{IT8\u00008x";
                    var7_6 = "\u00a9\u00f0\u0016\u00db\u00cd)TS\u00e8{IT8\u00008x".length();
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
lbl42:
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
lbl55:
                // 1 sources

                ** continue;
            }
        }
        PolicyEnforcementHandler.fb = var8_3;
        PolicyEnforcementHandler.gb = new Integer[54];
    }

    @DataExchangeProtocol2090
    public void M(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = PolicyEnforcementHandler.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = PolicyEnforcementHandler.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = PolicyEnforcementHandler.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private boolean Y(TransactionOrchestrator1017 transactionOrchestrator1017) {
        boolean bl;
        double[] dArray = this.J(transactionOrchestrator1017);
        double d2 = dArray[0];
        double d3 = dArray[1];
        double d4 = dArray[2];
        double d5 = ApplicationLifecycleManager.U().w(d2, d3, d4);
        try {
            bl = d5 <= this.M();
        }
        catch (CustomSystemException customSystemException) {
            throw PolicyEnforcementHandler.a(customSystemException);
        }
        return bl;
    }

    public boolean W() {
        block4: {
            try {
                try {
                    if (!GameVersionEnumerator.MC_1_12_2.H() || !this.A1.s().booleanValue()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw PolicyEnforcementHandler.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw PolicyEnforcementHandler.a(customSystemException);
            }
        }
        return this.l();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(PolicyEnforcementHandler.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(PolicyEnforcementHandler.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

