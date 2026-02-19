/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 */
package com.system.configuration;

import a.KB;
import a.Kf;
import a.Ne;
import a.Qh;
import a._Y;
import a.tl;
import a.z6;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.database.QueryBuilder;
import com.app.entity.movement.EntityMovementController;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.resource.management.ResourceAllocator1162;
import com.app.signal.SignalBroadcaster;
import com.app.workflow.WorkflowCoordinator1801;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.service.ServiceLifecycleController;
import com.crypto.stream.StreamCipherSessionManager;
import com.data.transformation.TransformationPipelineController;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.clustering.ClusterEventBroadcaster;
import com.event.dispatch.EventDispatchController1028;
import com.event.management.DomainEventAggregator;
import com.event.management.EventDispatchCoordinator2607;
import com.event.orchestration.ClusterEventOrchestrator;
import com.event.propagation.EventPropagationDispatcher;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graphics.color.ColorCompositionEngine;
import com.math.geometry.GeometricCalculator1575;
import com.math.geometry.GeometryCalculator;
import com.minecraft.render.MinecraftRenderContextManager;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.event.NetworkEventDispatcher;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolNegotiator;
import com.notification.distribution.NotificationDistributionManager;
import com.proxy.invocation.InvocationProxyManager;
import com.random.generation.RandomGenerationEngine;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.rendering.context.RenderContextManager;
import com.runtime.context.DynamicContextBroker;
import com.security.auth.AuthenticationProvider2618;
import com.security.crypto.CryptographicSecurityProvider;
import com.security.crypto.CryptographySessionManager;
import com.security.event.SecureEventOrchestrator;
import com.security.logging.CryptographicTransactionLogger;
import com.security.streaming.CryptoStreamProcessor;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.core.SystemStateOrchestrator1145;
import com.system.monitoring.ExecutionStateTracker;
import com.system.resources.ResourceAllocationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionLifecycleCoordinator;
import com.transaction.management.TransactionOrchestrator1017;
import com.transaction.validation.TransactionValidationProcessor;
import com.ui.configuration.DisplayConfigurationManager;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class ConfigurationCalibrator
implements NetworkConfigurationResolver2717 {
    private static final NetworkPacketInterceptor1107 J;
    private float m;
    private static final long[] f;
    private boolean s;
    private float n;
    private float h;
    private boolean v;
    private boolean B;
    private boolean d;
    private float X;
    private NetworkPacketInterceptor1107 R;
    private float j;
    private float T;
    private int W;
    private final TransformationPipelineController g = new TransformationPipelineController();
    private float L;
    private static final long c;
    private float y;
    public static ConfigurationCalibrator b;
    private RandomGenerationEngine D;
    private static final float K = 0.4f;
    private boolean r;
    private double V;
    private float l;
    private NetworkPacketInterceptor1107 a = J;
    private float F;
    private static final Integer[] i;
    private float q;
    private float Z;
    private float o = 0.0f;
    private boolean x;
    private boolean P;
    private NetworkPacketInterceptor1107 Q;
    private float e;
    private float A;
    private boolean u;
    private float Y;
    private static final Map k;

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void x(Kf kf) {
        try {
            if (this.P()) {
                this.V(false);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
    }

    public NetworkPacketInterceptor1107 B() {
        return this.a;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void b(RenderContextManager renderContextManager) {
        try {
            if (!TemporalMetadataResolver.h.a().F.s().booleanValue()) {
                return;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        Qh qh = renderContextManager.getEntityPlayer();
        try {
            if (!qh.B(ReflectionMetadataResolver.rl)) {
                return;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        this.K(new SystemConfigurationOrchestrator(qh));
    }

    public ConfigurationCalibrator() {
        this.R = J;
    }

    @DataExchangeProtocol2090
    public void C(EventTriggerEngine eventTriggerEngine) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block12: {
            block11: {
                systemConfigurationOrchestrator = eventTriggerEngine.getThePlayer();
                try {
                    try {
                        if (this.D != null && !systemConfigurationOrchestrator.Y()) break block11;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    this.D = null;
                    this.x();
                    return;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
            }
            try {
                try {
                    if (!this.D.F() || this.D.r()) break block12;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                this.D = null;
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
        }
        try {
            if (this.D == null) {
                this.x();
                return;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        double d2 = ApplicationLifecycleManager.K().R();
        double d3 = this.g.D() * d2;
        this.g.m();
        double d4 = d3 * (double)this.a();
        this.Y(d4, systemConfigurationOrchestrator, eventTriggerEngine.getCurrentScreen());
        this.v = true;
        this.D.P(eventTriggerEngine);
    }

    public boolean w() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.D == null || this.D.F()) break block4;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public float Y() {
        float f;
        try {
            f = this.P() ? this.h : ((CryptographicTransformer)ApplicationLifecycleManager.g()).q();
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        return f;
    }

    public NetworkPacketInterceptor1107 f(double d2, float f, boolean bl) {
        return this.M(d2, f, bl, null);
    }

    private void Q(boolean bl) {
        block4: {
            try {
                if (this.Q != null && !this.Q.Y()) break block4;
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
            Object object = ApplicationLifecycleManager.g();
            float f = ((CryptographicTransformer)object).q();
            float f2 = ((TransactionOrchestrator1017)object).J();
            float f3 = ((CryptographicTransformer)object).S();
            ((CryptographicTransformer)object).a(this.h);
            ((TransactionOrchestrator1017)object).C(this.h);
            ((CryptographicTransformer)object).f(this.F);
            double d2 = 3.0;
            if (TemporalMetadataResolver.h.a().O.s().booleanValue()) {
                d2 = TemporalMetadataResolver.h.U().K(InvocationProxyManager.class).v();
            }
            double d3 = 0.0;
            if (TemporalMetadataResolver.h.a().X.s().booleanValue()) {
                d3 = TemporalMetadataResolver.h.U().K(CryptographySessionManager.class).F();
            }
            ResourceAllocator1162.O((float)d2, (float)d3);
            this.Q = ApplicationLifecycleManager.u();
            ((CryptographicTransformer)object).a(f);
            ((TransactionOrchestrator1017)object).C(f2);
            ((CryptographicTransformer)object).f(f3);
        }
        ApplicationLifecycleManager.e(this.Q);
    }

    public RandomGenerationEngine N() {
        return this.D;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void Y(NetworkEventDispatcher networkEventDispatcher) {
        block4: {
            try {
                try {
                    if (!GameVersionEnumerator.MC_1_21_4.H() || !this.P()) break block4;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                if (!networkEventDispatcher.getPacket().B(ReflectionMetadataResolver.PG)) break block4;
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
            WorkflowCoordinator1801 workflowCoordinator1801 = new WorkflowCoordinator1801(networkEventDispatcher.getPacket());
            workflowCoordinator1801.Y(this.F);
            workflowCoordinator1801.G(this.h);
        }
    }

    private void k() {
        ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
        CryptoStreamProcessor.s(executionStateTracker.s(), this.x);
        CryptoStreamProcessor.s(executionStateTracker.h(), this.u);
        CryptoStreamProcessor.s(executionStateTracker.y(), this.P);
        CryptoStreamProcessor.s(executionStateTracker.w(), this.s);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/XO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public NetworkPacketInterceptor1107 m() {
        return this.R;
    }

    private void a(Color color, float f, double d2, double d3, double d4, double d5, double d6, double d7) {
        boolean bl;
        boolean bl2;
        block15: {
            block14: {
                bl2 = GL11.glIsEnabled((int)3042);
                bl = GL11.glIsEnabled((int)2896);
                try {
                    GL11.glBlendFunc((int)770, (int)771);
                    if (!bl2) {
                        Ne.h.y(3042);
                    }
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                try {
                    if (bl) {
                        Ne.h.z(2896);
                    }
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                try {
                    GL11.glBlendFunc((int)770, (int)771);
                    Ne.h.y(2848);
                    Ne.h.z(3553);
                    if (!ConfigurationManager.U()) break block14;
                    z6.b(d2, d3, d4, d5, d6, d7, f, color);
                    break block15;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
            }
            GL11.glLineWidth((float)f);
            GL11.glBegin((int)1);
            GraphicsBufferAllocator.Y(color);
            GL11.glVertex3d((double)d2, (double)d3, (double)d4);
            GL11.glVertex3d((double)d5, (double)d6, (double)d7);
            GL11.glEnd();
        }
        try {
            if (bl) {
                Ne.h.y(2896);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        try {
            if (!bl2) {
                Ne.h.z(3042);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        Ne.h.y(3553);
        Ne.h.z(2848);
    }

    private void V(boolean bl) {
        block3: {
            Object object;
            block2: {
                object = ApplicationLifecycleManager.g();
                try {
                    if (!bl) break block2;
                    this.y = ((CryptographicTransformer)object).q();
                    this.Z = ((CryptographicTransformer)object).S();
                    ((CryptographicTransformer)object).a(this.h);
                    ((TransactionOrchestrator1017)object).C(this.h);
                    ((CryptographicTransformer)object).f(this.F);
                    break block3;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
            }
            ((CryptographicTransformer)object).a(this.y);
            ((TransactionOrchestrator1017)object).C(this.y);
            ((CryptographicTransformer)object).f(this.Z);
        }
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void Z(NotificationDistributionManager notificationDistributionManager) {
        try {
            if (!TemporalMetadataResolver.h.a().F.s().booleanValue()) {
                return;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        this.h(notificationDistributionManager.getPlayer());
    }

    private boolean u() {
        boolean bl;
        block11: {
            block10: {
                try {
                    if (ApplicationLifecycleManager.X().Y()) {
                        return false;
                    }
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                StreamCipherSessionManager streamCipherSessionManager = TemporalMetadataResolver.h.U().K(StreamCipherSessionManager.class);
                try {
                    block9: {
                        try {
                            try {
                                if (streamCipherSessionManager == null || !streamCipherSessionManager.Z()) break block9;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw ConfigurationCalibrator.a(nullPointerException);
                            }
                            if (streamCipherSessionManager.s()) break block10;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw ConfigurationCalibrator.a(nullPointerException);
                        }
                    }
                    bl = true;
                    break block11;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public double r() {
        return this.V;
    }

    private void G(SystemConfigurationOrchestrator systemConfigurationOrchestrator, float f, float f2) {
        boolean bl;
        float f3;
        block11: {
            boolean bl2;
            block10: {
                float f4 = AdaptiveComputationEngine.v(f - this.A);
                this.A += f4 * 0.3f;
                f3 = AdaptiveComputationEngine.v(this.l - this.A);
                try {
                    try {
                        if (!(f3 < -90.0f) && !(f3 >= 90.0f)) break block10;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    bl2 = true;
                    break block11;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
            }
            bl2 = bl = false;
        }
        if (f3 < -75.0f) {
            f3 = -75.0f;
        }
        if (f3 >= 75.0f) {
            f3 = 75.0f;
        }
        try {
            this.A = this.l - f3;
            if (f3 * f3 > 2500.0f) {
                this.A += f3 * 0.2f;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        if (bl) {
            f2 *= -1.0f;
        }
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void E(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        block19: {
            ConnectionLifecycleHandler connectionLifecycleHandler;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block20: {
                block18: {
                    try {
                        try {
                            if (this.P() && !networkPacketOrchestrator1222.isCanceled()) break block18;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw ConfigurationCalibrator.a(nullPointerException);
                        }
                        return;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                }
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (systemConfigurationOrchestrator.Y()) {
                        return;
                    }
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)this.D;
                connectionLifecycleHandler = networkPacketOrchestrator1222.getPacket();
                try {
                    try {
                        if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.UV)) break block19;
                        if (!cryptographicSecurityProvider.G()) break block20;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    cryptographicSecurityProvider.X(true);
                    break block19;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
            }
            CryptographicTransactionLogger cryptographicTransactionLogger = new CryptographicTransactionLogger(connectionLifecycleHandler);
            float f = cryptographicTransactionLogger.Z();
            float f2 = cryptographicTransactionLogger.F();
            if (GeometryCalculator.C() > 13) {
                Set set = cryptographicTransactionLogger.y();
                for (Object e : set) {
                    TransactionLifecycleCoordinator transactionLifecycleCoordinator = new TransactionLifecycleCoordinator(e);
                    try {
                        if (transactionLifecycleCoordinator.Y() == TransactionLifecycleCoordinator.G()) {
                            systemConfigurationOrchestrator.f(this.F);
                            this.F += f2;
                        }
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    try {
                        if (transactionLifecycleCoordinator.Y() != TransactionLifecycleCoordinator.u()) continue;
                        systemConfigurationOrchestrator.a(this.h);
                        this.h += f;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void G(AuthenticationProvider2618 var1_1) {
        block48: {
            block49: {
                block47: {
                    block45: {
                        block46: {
                            block44: {
                                block43: {
                                    try {
                                        if (ApplicationLifecycleManager.U().Y()) {
                                            this.B = false;
                                            return;
                                        }
                                    }
                                    catch (NullPointerException v0) {
                                        throw ConfigurationCalibrator.a(v0);
                                    }
                                    var2_2 = this.P();
                                    var3_3 = (NetworkConnectionEstablisher)TemporalMetadataResolver.h.a().n.J();
                                    try {
                                        if (var3_3.equals(DynamicContextBroker.c)) {
                                            return;
                                        }
                                    }
                                    catch (NullPointerException v1) {
                                        throw ConfigurationCalibrator.a(v1);
                                    }
                                    var4_4 = var1_1.getPlayer();
                                    try {
                                        try {
                                            if (!var3_3.equals(DynamicContextBroker.B) && !var3_3.equals(DynamicContextBroker.v)) break block43;
                                        }
                                        catch (NullPointerException v2) {
                                            throw ConfigurationCalibrator.a(v2);
                                        }
                                        v3 = true;
                                        break block44;
                                    }
                                    catch (NullPointerException v4) {
                                        throw ConfigurationCalibrator.a(v4);
                                    }
                                }
                                v3 = var5_5 = false;
                            }
                            if (!var5_5) break block48;
                            var6_6 = ApplicationLifecycleManager.N();
                            var7_7 = new ConnectionPoolOrchestrator1192[]{var6_6.s(), var6_6.h(), var6_6.y(), var6_6.w()};
                            var8_8 = false;
                            for (ConnectionPoolOrchestrator1192 var12_15 : var7_7) {
                                if (DynamicContextBroker.s(var12_15) == var12_15.X()) continue;
                                var8_8 = true;
                                break;
                            }
                            try {
                                try {
                                    try {
                                        if (this.u()) break block45;
                                        if (!var8_8) break block46;
                                    }
                                    catch (NullPointerException v5) {
                                        throw ConfigurationCalibrator.a(v5);
                                    }
                                    if (!_Y.V()) break block45;
                                    ** GOTO lbl55
                                }
                                catch (NullPointerException v6) {
                                    throw ConfigurationCalibrator.a(v6);
                                }
                            }
                            catch (NullPointerException v7) {
                                throw ConfigurationCalibrator.a(v7);
                            }
                        }
                        try {
                            if (!CryptoStreamProcessor.B()) break block45;
lbl55:
                            // 2 sources

                            v8 = true;
                            break block47;
                        }
                        catch (NullPointerException v9) {
                            throw ConfigurationCalibrator.a(v9);
                        }
                    }
                    v8 = var9_10 = false;
                }
                if (var2_2) {
                    var10_12 = (CryptographicSecurityProvider)this.D;
                    try {
                        v10 = this;
                        v11 = ResourceAllocationManager.b() != false ? ResourceAllocationManager.c() : var4_4.q();
                    }
                    catch (NullPointerException v12) {
                        throw ConfigurationCalibrator.a(v12);
                    }
                    v10.q = v11;
                    this.j = var4_4.B();
                    var11_14 = var10_12.y();
                    var12_16 = this.t(var11_14, var8_8);
                    try {
                        v13 = var3_3.equals(DynamicContextBroker.v) != false ? var12_16 + 180.0f : this.h;
                    }
                    catch (NullPointerException v14) {
                        throw ConfigurationCalibrator.a(v14);
                    }
                    var13_17 = v13;
                    var4_4.a(var13_17);
                    var4_4.C(var13_17);
                    this.r = true;
                    if (var9_10) {
                        var14_18 = AdaptiveComputationEngine.v(AdaptiveComputationEngine.v(var13_17) - var12_16);
                        var15_19 = var14_18 * 0.017453292f;
                        var16_20 = (float)Math.cos(var15_19);
                        var17_21 = (float)(-Math.sin(var15_19));
                        try {
                            v15 = ServiceLifecycleController.c.k() != null ? 0.075 : 0.4000000059604645;
                        }
                        catch (NullPointerException v16) {
                            throw ConfigurationCalibrator.a(v16);
                        }
                        var18_22 = v15;
                        try {
                            v17 = (double)var16_20 >= var18_22;
                        }
                        catch (NullPointerException v18) {
                            throw ConfigurationCalibrator.a(v18);
                        }
                        var20_23 = v17;
                        try {
                            v19 = (double)var17_21 >= var18_22;
                        }
                        catch (NullPointerException v20) {
                            throw ConfigurationCalibrator.a(v20);
                        }
                        var21_24 = v19;
                        try {
                            v21 = (double)var17_21 <= -var18_22;
                        }
                        catch (NullPointerException v22) {
                            throw ConfigurationCalibrator.a(v22);
                        }
                        var22_25 = v21;
                        try {
                            v23 = (double)var16_20 <= -var18_22;
                        }
                        catch (NullPointerException v24) {
                            throw ConfigurationCalibrator.a(v24);
                        }
                        var23_26 = v23;
                        this.x = var6_6.s().X();
                        this.u = var6_6.h().X();
                        this.P = var6_6.y().X();
                        this.s = var6_6.w().X();
                        var6_6.s().p(var20_23);
                        var6_6.h().p(var21_24);
                        var6_6.y().p(var22_25);
                        var6_6.w().p(var23_26);
                        this.B = true;
                    }
                }
                try {
                    try {
                        try {
                            try {
                                if (var2_2 && var9_10) break block48;
                            }
                            catch (NullPointerException v25) {
                                throw ConfigurationCalibrator.a(v25);
                            }
                            if (!this.B) break block48;
                        }
                        catch (NullPointerException v26) {
                            throw ConfigurationCalibrator.a(v26);
                        }
                        if (var8_8) break block49;
                    }
                    catch (NullPointerException v27) {
                        throw ConfigurationCalibrator.a(v27);
                    }
                    this.k();
                }
                catch (NullPointerException v28) {
                    throw ConfigurationCalibrator.a(v28);
                }
            }
            this.B = false;
        }
    }

    private void h(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        try {
            if (this.d) {
                systemConfigurationOrchestrator.a(this.q);
                systemConfigurationOrchestrator.z(this.L);
                systemConfigurationOrchestrator.f(this.Y);
                systemConfigurationOrchestrator.G(this.m);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
    }

    private void Y(double d2, SystemConfigurationOrchestrator systemConfigurationOrchestrator, SecureEventOrchestrator secureEventOrchestrator) {
        this.V += d2;
        int n = (int)Math.round(this.V);
        for (int i = 0; i < n; ++i) {
            try {
                this.D.H(systemConfigurationOrchestrator, secureEventOrchestrator);
                this.D.m(secureEventOrchestrator);
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++this.W;
        }
        this.V -= (double)n;
    }

    public void v(RandomGenerationEngine randomGenerationEngine) {
        block4: {
            block5: {
                try {
                    try {
                        if (this.D == null || !this.D.equals(randomGenerationEngine)) break block4;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    if (!(this.D instanceof CryptographicSecurityProvider)) break block5;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)this.D;
                cryptographicSecurityProvider.n(true);
                break block4;
            }
            this.D.q(false);
            this.D.X(true);
        }
    }

    public float o() {
        float f;
        try {
            f = this.P() ? ApplicationLifecycleManager.U().Z() : ((CryptographicTransformer)ApplicationLifecycleManager.g()).A();
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        return f;
    }

    private void l(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        this.e = this.A;
        double d2 = systemConfigurationOrchestrator.F() - systemConfigurationOrchestrator.f();
        double d3 = systemConfigurationOrchestrator.B() - systemConfigurationOrchestrator.n();
        float f = (float)(d2 * d2 + d3 * d3);
        float f2 = this.A;
        float f3 = 0.0f;
        if (f > 0.0025000002f) {
            f3 = (float)Math.sqrt(f) * 3.0f;
            f2 = (float)AdaptiveComputationEngine.X(d3, d2) * 180.0f / (float)Math.PI - 90.0f;
        }
        if (systemConfigurationOrchestrator.g() > 0) {
            f2 = this.l;
        }
        this.G(systemConfigurationOrchestrator, f2, f3);
        try {
            while (this.A - this.e < -180.0f) {
                this.e -= 360.0f;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        try {
            while (this.A - this.e >= 180.0f) {
                this.e += 360.0f;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private void W() {
        boolean bl;
        double d2;
        double d3;
        block6: {
            boolean bl2;
            d3 = TemporalMetadataResolver.h.U().K(InvocationProxyManager.class).v();
            d2 = TemporalMetadataResolver.h.U().K(CryptographySessionManager.class).F();
            try {
                bl2 = d3 > 3.0;
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
            bl = bl2;
            try {
                try {
                    if (this.P() || !ResourceAllocationManager.b()) break block6;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                this.h = ResourceAllocationManager.c();
                this.F = ResourceAllocationManager.b();
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
        }
        this.a = this.f(d3, (float)d2, bl);
        this.R = this.f(3.0, 0.0f, false);
    }

    public float a() {
        float f = b.E();
        float f2 = f * 0.6f + 0.2f;
        f2 = f2 * f2 * f2 * 8.0f;
        float f3 = 0.5f;
        f3 = f3 * f3 * f3 * 8.0f;
        return f3 / f2;
    }

    private void x() {
        this.V = 0.0;
        this.W = 0;
        this.g.m();
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void U(MinecraftRenderContextManager minecraftRenderContextManager) {
        try {
            if (!TemporalMetadataResolver.h.a().F.s().booleanValue()) {
                return;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        Qh qh = minecraftRenderContextManager.getEntityPlayer();
        try {
            if (!qh.B(ReflectionMetadataResolver.rl)) {
                return;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        this.h(new SystemConfigurationOrchestrator(qh));
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void Y(TransactionValidationProcessor transactionValidationProcessor) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = transactionValidationProcessor.getPlayer();
        try {
            if (this.r) {
                systemConfigurationOrchestrator.a(this.q);
                systemConfigurationOrchestrator.C(this.q);
                systemConfigurationOrchestrator.m((float)((double)this.j + (double)(this.q - this.j) * 0.5));
                this.r = false;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        try {
            if (this.B) {
                this.k();
                this.B = false;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        try {
            if (this.d) {
                this.l(systemConfigurationOrchestrator);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void b(EventPropagationDispatcher eventPropagationDispatcher) {
        boolean bl;
        block13: {
            boolean bl2;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block12: {
                block11: {
                    try {
                        if (this.P()) {
                            EntityMovementController.setRotationYaw(this.h);
                            EntityMovementController.setRotationPitch(this.F);
                        }
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    try {
                        try {
                            this.n = systemConfigurationOrchestrator.Z();
                            this.X = systemConfigurationOrchestrator.c();
                            this.l = EntityMovementController.getRotationYaw();
                            this.T = EntityMovementController.getRotationPitch();
                            if (this.l == systemConfigurationOrchestrator.q() && this.T == systemConfigurationOrchestrator.S()) break block11;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw ConfigurationCalibrator.a(nullPointerException);
                        }
                        bl2 = true;
                        break block12;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                }
                bl2 = false;
            }
            bl = bl2;
            try {
                try {
                    if (this.d || !bl) break block13;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                this.A = systemConfigurationOrchestrator.U();
                this.e = systemConfigurationOrchestrator.j();
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
        }
        this.d = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ConfigurationCalibrator.c = MultiContainerRegistry.a(6719231928106572797L, 3925157634561709263L, MethodHandles.lookup().lookupClass()).a(103496634321328L);
                ConfigurationCalibrator.k = new HashMap<K, V>(13);
                var0 = ConfigurationCalibrator.c ^ 762555920870L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u00f0\u00ca\u0092>\u00cfY\u00ba!\u00e1_\u00a35=\u0095\u00ba>";
                var7_6 = "\u00f0\u00ca\u0092>\u00cfY\u00ba!\u00e1_\u00a35=\u0095\u00ba>".length();
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
                    var6_5 = "\u00cd\u00b9\u00edy\u00a8R\u0000\u00a83\u00c7Qc\u00b1\u00a6\u00b3C";
                    var7_6 = "\u00cd\u00b9\u00edy\u00a8R\u0000\u00a83\u00c7Qc\u00b1\u00a6\u00b3C".length();
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
        ConfigurationCalibrator.f = var8_3;
        ConfigurationCalibrator.i = new Integer[4];
        ConfigurationCalibrator.J = new NetworkPacketInterceptor1107(null);
        ConfigurationCalibrator.b = new ConfigurationCalibrator();
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void H(QueryBuilder queryBuilder) {
        block4: {
            try {
                try {
                    if (!this.v || this.D == null) break block4;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                this.D.z(queryBuilder);
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
        }
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void n(ClusterEventBroadcaster clusterEventBroadcaster) {
        try {
            if (this.P()) {
                this.Q(true);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @DataExchangeProtocol2090
    public void Z(EventDispatchController1028 var1_1) {
        block9: {
            block10: {
                if (!this.v) break block9;
                ** try [egrp 1[TRYBLOCK] [0 : 7->21)] { 
                {
                    catch (NullPointerException v0) {
                        throw ConfigurationCalibrator.a(v0);
                    }
lbl6:
                    // 1 sources

                    if (this.D == null || !var1_1.getThePlayer().r()) break block10;
                    ** GOTO lbl12
                }
lbl8:
                // 1 sources

                catch (NullPointerException v1) {
                    try {
                        throw ConfigurationCalibrator.a(v1);
lbl12:
                        // 2 sources

                        this.D.Q(var1_1);
                        break block10;
                    }
                    catch (CustomSystemException v2) {
                        throw ConfigurationCalibrator.a(v2);
                    }
                }
                catch (NullPointerException var2_2) {
                    TemporalMetadataResolver.W(var2_2);
                }
            }
            this.v = false;
        }
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void V(SignalBroadcaster signalBroadcaster) {
        try {
            if (this.P()) {
                this.V(true);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void U(KB kB) {
        SecureEventOrchestrator secureEventOrchestrator;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block16: {
            block15: {
                systemConfigurationOrchestrator = kB.getThePlayer();
                secureEventOrchestrator = kB.getCurrentScreen();
                try {
                    this.o = ApplicationLifecycleManager.N().W();
                    this.Q = J;
                    if (systemConfigurationOrchestrator.r()) {
                        this.W();
                    }
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                try {
                    try {
                        if (this.D != null && !systemConfigurationOrchestrator.Y()) break block15;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    this.D = null;
                    this.x();
                    return;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
            }
            try {
                try {
                    if (!this.D.F() || this.D.r()) break block16;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                this.D = null;
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
        }
        try {
            if (this.D == null) {
                this.x();
                return;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        this.g.m();
        double d2 = Math.round(50.0f * this.a());
        double d3 = Math.max(d2 - (double)this.W, 0.0);
        this.Y(d3, systemConfigurationOrchestrator, secureEventOrchestrator);
        this.W = 0;
        if (this.P()) {
            CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)this.D;
            this.h = cryptographicSecurityProvider.P();
            this.F = AdaptiveComputationEngine.g(cryptographicSecurityProvider.v(), -90.0f, 90.0f);
            this.l = this.h;
            this.T = this.F;
            this.Q(false);
        }
        this.W();
    }

    public void W(@NotNull RandomGenerationEngine randomGenerationEngine) {
        block8: {
            CryptographicSecurityProvider cryptographicSecurityProvider;
            block7: {
                try {
                    if (this.D == randomGenerationEngine) {
                        return;
                    }
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                try {
                    if (!(this.D instanceof CryptographicSecurityProvider) || !(randomGenerationEngine instanceof CryptographicSecurityProvider)) break block7;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                cryptographicSecurityProvider = (CryptographicSecurityProvider)this.D;
                cryptographicSecurityProvider.n(true);
                cryptographicSecurityProvider.X(true);
                CryptographicSecurityProvider cryptographicSecurityProvider2 = (CryptographicSecurityProvider)randomGenerationEngine;
                cryptographicSecurityProvider2.n(false);
                cryptographicSecurityProvider2.B(cryptographicSecurityProvider.P());
                cryptographicSecurityProvider2.g(cryptographicSecurityProvider.v());
            }
            try {
                if (this.D != null || !(randomGenerationEngine instanceof CryptographicSecurityProvider)) break block8;
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
            cryptographicSecurityProvider = (CryptographicSecurityProvider)randomGenerationEngine;
            this.h = cryptographicSecurityProvider.P();
            this.F = cryptographicSecurityProvider.v();
        }
        this.D = randomGenerationEngine;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void I(EventDispatchCoordinator2607 eventDispatchCoordinator2607) {
        try {
            if (!TemporalMetadataResolver.h.a().F.s().booleanValue()) {
                return;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        this.K(eventDispatchCoordinator2607.getPlayer());
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void z(ClusterEventOrchestrator clusterEventOrchestrator) {
        try {
            if (this.P()) {
                this.Q(true);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
    }

    private void K(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        try {
            if (this.d) {
                this.q = systemConfigurationOrchestrator.q();
                this.L = systemConfigurationOrchestrator.A();
                this.Y = systemConfigurationOrchestrator.S();
                this.m = systemConfigurationOrchestrator.Q();
                systemConfigurationOrchestrator.C(this.l);
                systemConfigurationOrchestrator.F(this.n);
                systemConfigurationOrchestrator.y(this.A);
                systemConfigurationOrchestrator.J(this.e);
                systemConfigurationOrchestrator.f(this.T);
                systemConfigurationOrchestrator.G(this.X);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
    }

    @DataExchangeProtocol2090
    public void S(DisplayConfigurationManager displayConfigurationManager) {
        block28: {
            boolean bl;
            boolean bl2;
            block30: {
                Color color;
                Color color2;
                double d2;
                block29: {
                    ColorCompositionEngine colorCompositionEngine;
                    ColorCompositionEngine colorCompositionEngine2;
                    ColorCompositionEngine colorCompositionEngine3;
                    ConfigurationCalibrator configurationCalibrator;
                    boolean bl3;
                    long l;
                    block27: {
                        l = c ^ 0x227DB583CEEFL;
                        SystemConfigurationOrchestrator systemConfigurationOrchestrator = displayConfigurationManager.getThePlayer();
                        try {
                            block26: {
                                try {
                                    try {
                                        if (!TemporalMetadataResolver.h.a().R.s().booleanValue() || systemConfigurationOrchestrator.Y()) break block26;
                                    }
                                    catch (NullPointerException nullPointerException) {
                                        throw ConfigurationCalibrator.a(nullPointerException);
                                    }
                                    if (!ApplicationLifecycleManager.X().r()) break block27;
                                }
                                catch (NullPointerException nullPointerException) {
                                    throw ConfigurationCalibrator.a(nullPointerException);
                                }
                            }
                            return;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw ConfigurationCalibrator.a(nullPointerException);
                        }
                    }
                    try {
                        bl3 = ApplicationLifecycleManager.N().V() > 0;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    boolean bl4 = bl3;
                    try {
                        if (!this.P() || bl4) break block28;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)this.D;
                    double d3 = 0.0;
                    float f = 15.0f;
                    float f2 = 2.0f;
                    Ne.h.z();
                    GraphicsBufferAllocator.V();
                    GeometricCalculator1575 geometricCalculator1575 = new GeometricCalculator1575();
                    float f3 = 2.0f / (float)ApplicationLifecycleManager.P().J();
                    Ne.h.m(geometricCalculator1575.j() / 2.0 / (double)f3, geometricCalculator1575.x() / 2.0 / (double)f3, d3);
                    Object object = ApplicationLifecycleManager.g();
                    float f4 = ApplicationLifecycleManager.K().h();
                    float f5 = ((CryptographicTransformer)object).q() + (((CryptographicTransformer)object).q() - ((CryptographicTransformer)object).A()) * f4;
                    float f6 = ((CryptographicTransformer)object).S() + (((CryptographicTransformer)object).S() - ((CryptographicTransformer)object).Q()) * f4;
                    float f7 = this.n + (this.l - this.n) * f4 + 90.0f;
                    Ne.h.f(f6, -1.0f, 0.0f, 0.0f);
                    Ne.h.f(90.0f, 0.0f, -1.0f, 0.0f);
                    Ne.h.J(-1.0f, -1.0f, -1.0f);
                    Ne.h.m(0.0, 5.0, 0.5);
                    Ne.h.f(20.0f, 0.0f, 0.0f, 1.0f);
                    this.a(new Color((int)ConfigurationCalibrator.a("m", (int)9898, (long)(0x3F4B373A62B57DD9L ^ l)), true), 3.0f, 0.0, -5.0, 0.0, 0.0, 5.0, 0.0);
                    float f8 = f7 - f5 - 90.0f;
                    try {
                        ColorCompositionEngine colorCompositionEngine4;
                        Ne.h.f(f8, 0.0f, -1.0f, 0.0f);
                        this.a(new Color((int)ConfigurationCalibrator.a("m", (int)5082, (long)(0x64CBC535B9B248ABL ^ l))), f2 + 1.0f, 0.0, 0.0, 0.0, f, 0.0, 0.0);
                        configurationCalibrator = this;
                        colorCompositionEngine3 = colorCompositionEngine4;
                        colorCompositionEngine2 = colorCompositionEngine4;
                        colorCompositionEngine = cryptographicSecurityProvider.N() ? cryptographicSecurityProvider.a() : cryptographicSecurityProvider.c();
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    colorCompositionEngine3(colorCompositionEngine);
                    configurationCalibrator.a(colorCompositionEngine2.I(255), f2, 0.0, 0.0, 0.0, f, 0.0, 0.0);
                    Ne.h.f(f8, 0.0f, 1.0f, 0.0f);
                    Ne.h.f(f5, 0.0f, 1.0f, 0.0f);
                    bl2 = Ne.h.k(3042);
                    bl = Ne.h.k(2896);
                    try {
                        if (!bl2) {
                            Ne.h.y(3042);
                        }
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    try {
                        if (bl) {
                            Ne.h.z(2896);
                        }
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    GL11.glBlendFunc((int)770, (int)771);
                    Ne.h.y(2848);
                    Ne.h.z(3553);
                    d2 = 5.0;
                    color2 = new Color((int)ConfigurationCalibrator.a("m", (int)10834, (long)(0x1AC4BBFFFDB27122L ^ l)), true);
                    color = new Color((int)ConfigurationCalibrator.a("m", (int)8970, (long)(0x206B58B03687F878L ^ l)), true);
                    try {
                        if (!ConfigurationManager.U()) break block29;
                        z6.b(-d2, -5.0, -d2, d2, -5.0, -d2, f2, color2);
                        z6.b(d2, -5.0, -d2, d2, -5.0, d2, f2, color2);
                        z6.b(d2, -5.0, d2, -d2, -5.0, d2, f2, color2);
                        z6.b(-d2, -5.0, d2, -d2, -5.0, -d2, f2, color2);
                        z6.G(-d2, -5.0, -d2, d2, -5.0, -d2, d2, -5.0, d2, -d2, -5.0, d2, color);
                        break block30;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                }
                GL11.glLineWidth((float)1.0f);
                GL11.glBegin((int)2);
                GraphicsBufferAllocator.Y(color2);
                GL11.glVertex3d((double)(-d2), (double)-5.0, (double)(-d2));
                GL11.glVertex3d((double)d2, (double)-5.0, (double)(-d2));
                GL11.glVertex3d((double)d2, (double)-5.0, (double)d2);
                GL11.glVertex3d((double)(-d2), (double)-5.0, (double)d2);
                GL11.glEnd();
                tl.M();
                GL11.glBegin((int)7);
                GraphicsBufferAllocator.Y(color);
                GL11.glVertex3d((double)(-d2), (double)-5.0, (double)(-d2));
                GL11.glVertex3d((double)d2, (double)-5.0, (double)(-d2));
                GL11.glVertex3d((double)d2, (double)-5.0, (double)d2);
                GL11.glVertex3d((double)(-d2), (double)-5.0, (double)d2);
                GL11.glEnd();
                tl.V();
            }
            try {
                if (bl) {
                    Ne.h.y(2896);
                }
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
            try {
                if (!bl2) {
                    Ne.h.z(3042);
                }
            }
            catch (NullPointerException nullPointerException) {
                throw ConfigurationCalibrator.a(nullPointerException);
            }
            Ne.h.y(3553);
            Ne.h.z(2848);
            GraphicsBufferAllocator.E();
            Ne.h.X();
        }
    }

    public float E(float f, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        float f2;
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            f2 = f;
                            try {
                                if (!bl || !bl2) break block13;
                            }
                            catch (NullPointerException nullPointerException) {
                                throw ConfigurationCalibrator.a(nullPointerException);
                            }
                            f2 += 45.0f;
                            break block17;
                        }
                        try {
                            if (!bl4 || !bl2) break block14;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw ConfigurationCalibrator.a(nullPointerException);
                        }
                        f2 += 135.0f;
                        break block17;
                    }
                    if (bl2) {
                        f2 += 90.0f;
                    } else {
                        try {
                            if (!bl || !bl3) break block15;
                        }
                        catch (NullPointerException nullPointerException) {
                            throw ConfigurationCalibrator.a(nullPointerException);
                        }
                        f2 -= 45.0f;
                    }
                    break block17;
                }
                try {
                    if (!bl4 || !bl3) break block16;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                f2 -= 135.0f;
                break block17;
            }
            if (bl3) {
                f2 -= 90.0f;
            } else if (bl4) {
                f2 += 180.0f;
            }
        }
        return f2;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConfigurationCalibrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public float p() {
        float f;
        try {
            f = this.P() ? this.F : ((CryptographicTransformer)ApplicationLifecycleManager.g()).S();
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        return f;
    }

    public float l() {
        float f;
        try {
            f = this.P() ? ApplicationLifecycleManager.U().c() : ((CryptographicTransformer)ApplicationLifecycleManager.g()).Q();
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        return f;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6FFC;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
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
                throw new RuntimeException("a/XO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigurationCalibrator.i[n2] = n3;
        }
        return i[n2];
    }

    public float t(float f, boolean bl) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = executionStateTracker.s();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11922 = executionStateTracker.h();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11923 = executionStateTracker.y();
        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11924 = executionStateTracker.w();
        try {
            bl5 = bl ? connectionPoolOrchestrator1192.X() : DynamicContextBroker.s(connectionPoolOrchestrator1192);
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        boolean bl6 = bl5;
        try {
            bl4 = bl ? connectionPoolOrchestrator11922.X() : DynamicContextBroker.s(connectionPoolOrchestrator11922);
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        boolean bl7 = bl4;
        try {
            bl3 = bl ? connectionPoolOrchestrator11923.X() : DynamicContextBroker.s(connectionPoolOrchestrator11923);
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        boolean bl8 = bl3;
        try {
            bl2 = bl ? connectionPoolOrchestrator11924.X() : DynamicContextBroker.s(connectionPoolOrchestrator11924);
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
        boolean bl9 = bl2;
        return this.E(f, bl6, bl7, bl8, bl9);
    }

    public boolean P() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.D == null || !(this.D instanceof CryptographicSecurityProvider)) break block4;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw ConfigurationCalibrator.a(nullPointerException);
                    }
                    bl = true;
                    break block5;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public float E() {
        return this.o;
    }

    public NetworkPacketInterceptor1107 M(double d2, float f, boolean bl, @Nullable Predicate<CryptographicTransformer> predicate) {
        NetworkPacketInterceptor1107 networkPacketInterceptor1107;
        block3: {
            block2: {
                try {
                    if (!this.P() && !ResourceAllocationManager.b()) break block2;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                Object object = ApplicationLifecycleManager.g();
                float f2 = ((CryptographicTransformer)object).q();
                float f3 = ((TransactionOrchestrator1017)object).J();
                float f4 = ((CryptographicTransformer)object).S();
                ((CryptographicTransformer)object).a(this.h);
                ((TransactionOrchestrator1017)object).C(this.h);
                ((CryptographicTransformer)object).f(this.F);
                networkPacketInterceptor1107 = SystemStateOrchestrator1145.h((TransactionOrchestrator1017)object, d2, f, bl, predicate);
                ((CryptographicTransformer)object).a(f2);
                ((TransactionOrchestrator1017)object).C(f3);
                ((CryptographicTransformer)object).f(f4);
                break block3;
            }
            networkPacketInterceptor1107 = SystemStateOrchestrator1145.B(d2, f, bl, predicate);
        }
        return networkPacketInterceptor1107;
    }

    public NetworkPacketInterceptor1107 k(boolean bl) {
        NetworkPacketInterceptor1107 networkPacketInterceptor1107;
        block3: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block2: {
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                NetworkProtocolNegotiator networkProtocolNegotiator = systemConfigurationOrchestrator.N();
                try {
                    if (!this.P() && !ResourceAllocationManager.b()) break block2;
                }
                catch (NullPointerException nullPointerException) {
                    throw ConfigurationCalibrator.a(nullPointerException);
                }
                Object object = ApplicationLifecycleManager.g();
                float f = ((CryptographicTransformer)object).q();
                float f2 = ((TransactionOrchestrator1017)object).J();
                float f3 = ((CryptographicTransformer)object).S();
                ((CryptographicTransformer)object).a(this.h);
                ((TransactionOrchestrator1017)object).C(this.h);
                ((CryptographicTransformer)object).f(this.F);
                networkPacketInterceptor1107 = SystemStateOrchestrator1145.W(systemConfigurationOrchestrator.N(), systemConfigurationOrchestrator, bl);
                ((CryptographicTransformer)object).a(f);
                ((TransactionOrchestrator1017)object).C(f2);
                ((CryptographicTransformer)object).f(f3);
                break block3;
            }
            networkPacketInterceptor1107 = SystemStateOrchestrator1145.W(systemConfigurationOrchestrator.N(), systemConfigurationOrchestrator, bl);
        }
        return networkPacketInterceptor1107;
    }

    public void X() {
        this.v(this.D);
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGHEST)
    public void C(DomainEventAggregator domainEventAggregator) {
        try {
            if (this.P()) {
                this.Q(false);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw ConfigurationCalibrator.a(nullPointerException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConfigurationCalibrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

