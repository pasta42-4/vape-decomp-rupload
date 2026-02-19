/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 */
package com.simulation.core;

import a.E8;
import a.KB;
import a.N9;
import a.Qh;
import a.Ya;
import a.Zw;
import a._Y;
import a.a;
import a.kg;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.core.execution.ExecutionOrchestrator;
import com.app.event.EventTrigger;
import com.app.event.dispatch.EventDispatchAdapter;
import com.app.identity.IdentityComparator;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.security.access.SecurityAccessController;
import com.app.security.crypto.CryptographicPrimitiveGenerator;
import com.app.system.orchestration.SystemStateOrchestrator1202;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.configuration.management.ConfigurationParameterResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.util.TimestampGenerator;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.data.compression.CompressionUtility;
import com.data.compression.CompressionUtility2668;
import com.distributed.coordination.DistributedResourceOrchestrator;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.ContextualEventDispatcher;
import com.event.management.DomainEventAggregator;
import com.exception.system.CustomSystemException;
import com.execution.scheduling.TimedExecutionCoordinator;
import com.finance.transaction.TransactionProcessor1728;
import com.financial.processing.TransactionCorrelationEngine;
import com.financial.validation.TransactionValidator1847;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteGenerator1110;
import com.graphics.palette.ColorPaletteManager;
import com.math.calculation.NumericCalculationEngine;
import com.math.computation.NumericComputationFramework;
import com.math.geometry.GeometricCalculator;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.ConnectionLifecycleManager;
import com.network.connection.NetworkConnectionManager1286;
import com.network.connection.NetworkConnectionManager2105;
import com.network.core.NetworkConnectionManager1925;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocol.ProtocolInteractionController;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.resource.management.DynamicResourceRegistry;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.auth.AuthenticationProvider2618;
import com.security.crypto.CipherContextManager784;
import com.security.crypto.CryptographicContextManager567;
import com.security.crypto.CryptographicSecurityProvider;
import com.security.event.SecureEventOrchestrator;
import com.security.streaming.CryptoStreamProcessor;
import com.security.transform.CryptographicTransformer;
import com.session.management.MultiProtocolSessionManager;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.monitoring.ExecutionStateTracker;
import com.system.parameters.MultimodalParameterController;
import com.system.resource.AssetLoadBalancer;
import com.system.resources.ResourceAllocationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.text.processing.PatternMatchingOrchestrator;
import com.ui.configuration.DisplayConfigurationManager;
import com.ui.input.UserInputEventMapper;
import com.ui.rendering.GraphicalRenderingController;
import com.util.numeric.NumericFormattingUtility;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ModelSimulationEngine
extends ContextualExecutionFramework {
    private final NumericPrecisionTransformer Vo;
    private final ConnectionLifecycleManager V;
    private final TimestampGenerator<N9> Vy;
    private boolean Vs;
    private float VH;
    private HashSet<N9> Vd;
    private int VB;
    private final ArrayList<DynamicResourceRegistry> X;
    public static final ArrayList<Vector<MultiProtocolSessionManager>> G;
    private static final Object[] kb;
    private NetworkConfigManager VU;
    private final AuthenticationStateTracker Z;
    private boolean L;
    private boolean V0;
    private HashSet<N9> Vt;
    private double Vp;
    private CipherContextManager784 V6;
    private final NetworkConnectionManager2105 P;
    private final ArrayList<DynamicResourceRegistry> Vn;
    private NetworkConfigManager VJ;
    private float Vk;
    private Boolean VO;
    private CipherContextManager784 x;
    private DynamicResourceRegistry VE;
    private final AuthenticationStateTracker V3;
    private final AuthenticationStateTracker Vh;
    private final HashMap<N9, HashSet<N9>> Vz;
    private final AuthenticationStateTracker VL;
    private final AuthenticationStateTracker O;
    private ArrayList<String> e;
    private List<NumericComputationFramework> VG;
    private static final Integer[] gb;
    private final NumericPrecisionTransformer m;
    private int n;
    private boolean Vr;
    private Boolean Y;
    private int h;
    private boolean VZ;
    private int v;
    private static final String[] lb;
    private boolean K;
    private final ColorPaletteManager Vc;
    private int VV;
    private final AuthenticationStateTracker Vw;
    private final NumericFormattingUtility Vl;
    private int V2;
    boolean w;
    private Boolean l;
    private NumericComputationFramework V8;
    private Ya VT;
    private Object Vu;
    private final AuthenticationStateTracker B;
    private final AuthenticationStateTracker Ve;
    private final NumericFormattingUtility V_;
    private String VP;
    private static final Map hb;
    private boolean Vx;
    private final NumericPrecisionTransformer Vi;
    private boolean VX;
    private boolean V7;
    private boolean F;
    private boolean t;
    private int Va;
    private int z;
    private NetworkPacketInterceptor1107 Vm;
    private int R;
    private MultiProtocolSessionManager VA;
    private static final long[] fb;
    private static final long bb;
    private final NumericPrecisionTransformer V4;
    private double b;
    private static final boolean o = false;
    private NumericComputationFramework r;
    private IdentityComparator VC;
    private Boolean T;
    private boolean j;
    private NetworkConfigManager Vq;
    private final NumericFormattingUtility VD;
    private boolean N;
    private TimedExecutionCoordinator d;
    private final AuthenticationStateTracker A;
    private double Vf;
    private final AuthenticationStateTracker V1;
    private boolean VF;
    private boolean Vg;
    private final ColorPaletteManager V5;
    private final AuthenticationStateTracker VR;

    private Ya T(Qh qh, ContextualEventDispatcher contextualEventDispatcher, ContextualEventDispatcher contextualEventDispatcher2, Ya ya, int n, float f) {
        float f2;
        float f3;
        Object object;
        Ya ya2;
        block16: {
            Ya ya3;
            block18: {
                block17: {
                    float f4;
                    float f5;
                    block19: {
                        block15: {
                            ya2 = ya;
                            try {
                                try {
                                    if (ya != null || qh.B(ReflectionMetadataResolver.rl)) break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (!ConfigurationCalibrator.b.P()) break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            object = (CryptographicSecurityProvider)ConfigurationCalibrator.b.N();
                            f5 = ((CryptographicSecurityProvider)object).P();
                            f4 = ((CryptographicSecurityProvider)object).v();
                            break block19;
                        }
                        if (ya == null) {
                            f5 = qh.q();
                            f4 = qh.S();
                        } else {
                            f5 = ya.A();
                            f4 = ya.L();
                        }
                    }
                    object = GeometricCalculator.k(contextualEventDispatcher, contextualEventDispatcher2, f5, f4);
                    try {
                        try {
                            if (ya != null) break block16;
                            if (!this.Ve.s().booleanValue()) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        ya3 = new CryptographicSecurityProvider(qh);
                        break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                ya3 = new TransactionValidator1847(this, (NumericCalculationEngine)object, qh);
            }
            ya2 = ya3;
        }
        try {
            ya2.g((NumericCalculationEngine)object);
            if (ya2 instanceof CryptographicSecurityProvider) {
                ((CryptographicSecurityProvider)ya2).x(Float.valueOf(f));
                ((CryptographicSecurityProvider)ya2).n(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        boolean bl = ya2 instanceof CryptographicSecurityProvider;
        if (bl) {
            f3 = ((CryptographicSecurityProvider)ya2).P();
            f2 = ((CryptographicSecurityProvider)ya2).v();
        } else {
            f3 = qh.q();
            f2 = qh.S();
        }
        float f6 = (float)contextualEventDispatcher.x(contextualEventDispatcher2);
        float f7 = Math.abs(AdaptiveComputationEngine.v(((NumericCalculationEngine)object).D() - f3));
        float f8 = Math.abs(((NumericCalculationEngine)object).g() - f2);
        float f9 = Math.abs(f7) + Math.abs(f8);
        float f10 = f9 / 1.8f / (float)Math.max(n, 1);
        float f11 = 15.0f + 85.0f * (((Double)this.m.J()).floatValue() / 10.0f);
        f10 = Math.min(f11 + (float)((int)(qh.V() * 100.0) % 5), f10);
        ya2.u(true);
        ya2.L(f10);
        ya2.N(0.0f);
        ya2.F(true);
        ya2.v(false);
        ya2.J(false);
        ya2.i(true);
        ya2.h(false);
        ya2.q(true);
        return ya2;
    }

    private void n() {
        block39: {
            block34: {
                block37: {
                    block36: {
                        block35: {
                            long l;
                            block32: {
                                block33: {
                                    l = bb ^ 0x3F428AEE143BL;
                                    SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                    try {
                                        try {
                                            if (!this.j) break block32;
                                            this.P();
                                            if (!ApplicationLifecycleManager.X().Y()) break block33;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ModelSimulationEngine.a(customSystemException);
                                        }
                                        CryptoStreamProcessor.y(false);
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                }
                                this.j = false;
                            }
                            try {
                                try {
                                    if (this.VE == null) break block34;
                                    if (this.z > 0) break block35;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                this.L = false;
                                this.t = false;
                                this.M((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)1186, (long)(0x41BE645EFA057B8EL ^ l)), (long)-2448084628776877411L, (long)l)));
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (!this.t || this.L) break block36;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (this.Vl.c() <= 0) break block36;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            this.V0 = false;
                            this.K = false;
                            this.N = false;
                            this.VF = false;
                            this.V();
                            this.t = false;
                            this.VB = (int)Math.round(this.Vl.l());
                            break block37;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    CryptoStreamProcessor.y(false);
                }
                this.n = (int)Math.round(this.V_.l());
                this.R = (int)Math.round(this.VD.l());
            }
            try {
                if (this.VE != null) {
                    this.VJ.m();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            try {
                this.VE = null;
                if (this.Vx) {
                    this.Vx = false;
                    ConfigurationRegistry.d.b(this);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            try {
                try {
                    block38: {
                        try {
                            try {
                                try {
                                    try {
                                        this.VA = null;
                                        this.Vz.clear();
                                        this.Vn.clear();
                                        G.clear();
                                        this.Vm = null;
                                        this.Vu = null;
                                        if (ConfigurationCalibrator.b.N() == null || ConfigurationCalibrator.b.N() != this.VT) break block38;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                    if (this.VT == null) break block39;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (this.VT.r()) break block39;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (!this.VT.F()) break block39;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    this.VT = null;
                    this.V.b(this);
                    if (!this.w) break block39;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                this.w = false;
                super.y(false, true);
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
        this.t = false;
        this.F = false;
        this.P.m(this);
    }

    private void C(int n) {
        ApplicationLifecycleManager.U().l().A(n);
    }

    private void z(oQ oQ2) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void n(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        ConnectionLifecycleHandler connectionLifecycleHandler;
        block37: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            long l;
            block32: {
                boolean bl;
                block38: {
                    boolean bl2;
                    block36: {
                        block35: {
                            block33: {
                                l = bb ^ 0x5AD0BCC95DB0L;
                                systemConfigurationOrchestrator = networkPacketOrchestrator1222.getThePlayer();
                                try {
                                    if (systemConfigurationOrchestrator.Y()) {
                                        return;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (networkPacketOrchestrator1222.isCanceled()) return;
                                connectionLifecycleHandler = networkPacketOrchestrator1222.getPacket();
                                try {
                                    try {
                                        if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.bh) && !connectionLifecycleHandler.B(ReflectionMetadataResolver.Ub)) break block32;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                    if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.bh)) break block33;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                NetworkConnectionManager1286 networkConnectionManager1286 = new NetworkConnectionManager1286(connectionLifecycleHandler.M());
                                try {
                                    boolean bl3 = bl = networkConnectionManager1286.h() == systemConfigurationOrchestrator.X();
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (bl) {
                                    double d2 = (double)networkConnectionManager1286.K() / 8000.0;
                                    double d3 = (double)networkConnectionManager1286.o() / 8000.0;
                                    double d4 = Math.sqrt(d2 * d2 + d3 * d3);
                                    double d5 = Math.sqrt(systemConfigurationOrchestrator.G() * systemConfigurationOrchestrator.G() + systemConfigurationOrchestrator.o() * systemConfigurationOrchestrator.o());
                                    double d6 = d4 + d5;
                                    this.M((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)20118, (long)(0x6513C59892D8782CL ^ l)), (long)-7526133374787892458L, (long)l)) + d4 + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)24602, (long)(0x102DAD44B56D56F2L ^ l)), (long)-7526133374787892458L, (long)l)) + d5 + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)26321, (long)(0x64B7B5171C6DD016L ^ l)), (long)-7526133374787892458L, (long)l)) + d6);
                                    this.L = true;
                                    this.z = (int)ModelSimulationEngine.a("j", (int)30125, (long)(0x55A91D8C2DA4347L ^ l));
                                }
                                break block38;
                            }
                            SystemStateOrchestrator1202 systemStateOrchestrator1202 = new SystemStateOrchestrator1202(connectionLifecycleHandler.M());
                            double d7 = systemStateOrchestrator1202.r();
                            double d8 = systemStateOrchestrator1202.v();
                            double d9 = systemStateOrchestrator1202.x();
                            try {
                                block34: {
                                    try {
                                        try {
                                            if (Math.abs(d7) >= 0.005 || Math.abs(d8) >= 0.005) break block34;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ModelSimulationEngine.a(customSystemException);
                                        }
                                        if (!(Math.abs(d9) >= 0.005)) break block35;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                }
                                bl2 = true;
                                break block36;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    bl = bl2;
                }
                try {
                    if (!bl) return;
                    this.x(systemConfigurationOrchestrator);
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            try {
                try {
                    try {
                        if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.UV)) break block37;
                        if (this.VE == null) return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    if (this.VE.x == null) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                this.t((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)2211, (long)(0x28461ACC34DABE29L ^ l)), (long)-7526133374787892458L, (long)l)), true);
                this.x(systemConfigurationOrchestrator);
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
        try {
            try {
                if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.Y9) || this.VE == null) return;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            if (this.VE.x == null) return;
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        TransactionProcessor1728 transactionProcessor1728 = new TransactionProcessor1728(connectionLifecycleHandler.M());
        NetworkConnectionOrchestrator networkConnectionOrchestrator = transactionProcessor1728.v();
        ReflectionUtilityBroker reflectionUtilityBroker = transactionProcessor1728.g();
        try {
            try {
                if (!PatternMatchingOrchestrator.e(networkConnectionOrchestrator.I()) || !this.VE.x.l(reflectionUtilityBroker.o(), reflectionUtilityBroker.q(), reflectionUtilityBroker.j())) return;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            this.Vr = true;
            this.Vy.w(new N9(reflectionUtilityBroker.o(), reflectionUtilityBroker.q(), reflectionUtilityBroker.j()));
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
    }

    private static Field c(long l, long l2) {
        int n = ModelSimulationEngine.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = ModelSimulationEngine.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ModelSimulationEngine.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ModelSimulationEngine.a(clazz3, string2, clazz2)) != null) {
                    ModelSimulationEngine.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ModelSimulationEngine.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ModelSimulationEngine.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ModelSimulationEngine.b(572726129072965L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    private ContextualEventDispatcher q(Qh var1_1, NetworkProtocolNegotiator var2_2, N9 var3_3, AdaptiveConfigurationManager var4_4) {
        block27: {
            block26: {
                var5_5 = var1_1.F();
                var7_6 = var1_1.B();
                try {
                    if (var4_4 != null && !var4_4.Y()) break block26;
                }
                catch (CustomSystemException v0) {
                    throw ModelSimulationEngine.a(v0);
                }
                var9_7 = ContextualEventDispatcher.N((double)var3_3.x() + 0.5, (double)var3_3.J() + 0.5, (double)var3_3.b() + 0.5);
                break block27;
            }
            var10_8 = PatternMatchingOrchestrator.y(var2_2, var3_3);
            var11_9 = var10_8.F() + (var10_8.f() - var10_8.F()) / 2.0;
            var13_10 = var10_8.c() + (var10_8.P() - var10_8.c()) / 2.0;
            var15_11 = var10_8.v() + (var10_8.R() - var10_8.v()) / 2.0;
            var17_12 = var11_9 - var5_5;
            var19_13 = var15_11 - var7_6;
            switch (var4_4.p()) {
                case 2: {
                    var15_11 = var10_8.v();
                    try {
                        if (!(Math.abs(var17_12) < (var10_8.f() - var10_8.F()) / 2.0)) ** GOTO lbl26
                        v1 = var5_5;
                        ** GOTO lbl30
                    }
                    catch (CustomSystemException v2) {
                        throw ModelSimulationEngine.a(v2);
                    }
lbl26:
                    // 1 sources

                    try {
                        v1 = var5_5 < (double)var3_3.x() ? var10_8.F() : var10_8.f();
                    }
                    catch (CustomSystemException v3) {
                        throw ModelSimulationEngine.a(v3);
                    }
lbl30:
                    // 2 sources

                    var11_9 = v1;
                    break;
                }
                case 3: {
                    var15_11 = var10_8.R();
                    try {
                        if (!(Math.abs(var17_12) < (var10_8.f() - var10_8.F()) / 2.0)) ** GOTO lbl40
                        v4 = var5_5;
                        ** GOTO lbl44
                    }
                    catch (CustomSystemException v5) {
                        throw ModelSimulationEngine.a(v5);
                    }
lbl40:
                    // 1 sources

                    try {
                        v4 = var5_5 < (double)var3_3.x() ? var10_8.F() : var10_8.f();
                    }
                    catch (CustomSystemException v6) {
                        throw ModelSimulationEngine.a(v6);
                    }
lbl44:
                    // 2 sources

                    var11_9 = v4;
                    break;
                }
                case 4: {
                    var11_9 = var10_8.F();
                    try {
                        if (!(Math.abs(var19_13) < (var10_8.R() - var10_8.v()) / 2.0)) ** GOTO lbl54
                        v7 = var7_6;
                        ** GOTO lbl58
                    }
                    catch (CustomSystemException v8) {
                        throw ModelSimulationEngine.a(v8);
                    }
lbl54:
                    // 1 sources

                    try {
                        v7 = var7_6 < (double)var3_3.b() ? var10_8.v() : var10_8.R();
                    }
                    catch (CustomSystemException v9) {
                        throw ModelSimulationEngine.a(v9);
                    }
lbl58:
                    // 2 sources

                    var15_11 = v7;
                    break;
                }
                case 5: {
                    var11_9 = var10_8.f();
                    try {
                        if (!(Math.abs(var19_13) < (var10_8.R() - var10_8.v()) / 2.0)) ** GOTO lbl68
                        v10 = var7_6;
                        ** GOTO lbl72
                    }
                    catch (CustomSystemException v11) {
                        throw ModelSimulationEngine.a(v11);
                    }
lbl68:
                    // 1 sources

                    try {
                        v10 = var7_6 < (double)var3_3.b() ? var10_8.v() : var10_8.R();
                    }
                    catch (CustomSystemException v12) {
                        throw ModelSimulationEngine.a(v12);
                    }
lbl72:
                    // 2 sources

                    var15_11 = v10;
                    break;
                }
                case 1: {
                    var13_10 = var10_8.P();
                    break;
                }
                case 0: {
                    var13_10 = var10_8.c();
                }
            }
            var9_7 = ContextualEventDispatcher.N(var11_9, var13_10, var15_11);
        }
        return var9_7;
    }

    private void P() {
        this.VO = null;
        this.T = null;
        this.l = null;
        this.Y = null;
    }

    private int q(DynamicResourceRegistry dynamicResourceRegistry, MultiProtocolSessionManager multiProtocolSessionManager, Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, float f, float f2, NumericComputationFramework numericComputationFramework) {
        int n;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        double d2;
        Qh qh2;
        CipherContextManager784 cipherContextManager784;
        block37: {
            block36: {
                block35: {
                    cipherContextManager784 = new CipherContextManager784(qh, systemConfigurationOrchestrator, networkProtocolNegotiator, numericComputationFramework);
                    try {
                        if (!this.F) break block35;
                        cipherContextManager784.r();
                        break block36;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                cipherContextManager784.d();
            }
            qh2 = cipherContextManager784.a();
            qh2.a(f);
            qh2.C(f);
            qh2.f(f2);
            double d3 = -0.0784000015258789;
            try {
                try {
                    try {
                        try {
                            if (!this.t || this.L) break block37;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        if (!qh.j()) break block37;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    if (qh.x() != d3) break block37;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                cipherContextManager784.Z();
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
        try {
            d2 = GeometryCalculator.C() > 13 ? (double)systemConfigurationOrchestrator.E() : 0.0;
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        double d4 = d2;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = 0;
        while (n2 < 6) {
            ++n2;
            kg kg2 = cipherContextManager784.G();
            ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N(kg2.R(), kg2.L() + d4, kg2.U());
            if (Zw.m(contextualEventDispatcher, networkProtocolNegotiator, multiProtocolSessionManager.o, multiProtocolSessionManager.N)) {
                double d5;
                bl2 = true;
                object4 = Zw.e(systemConfigurationOrchestrator, networkProtocolNegotiator, contextualEventDispatcher, multiProtocolSessionManager, f, f2);
                if (object4 != null && (d5 = contextualEventDispatcher.x((ContextualEventDispatcher)object4)) <= 5.0) {
                    bl3 = true;
                    multiProtocolSessionManager.Q = object4;
                    object3 = cipherContextManager784.G();
                    dynamicResourceRegistry.i = ContextualEventDispatcher.N(((kg)object3).R(), ((kg)object3).L() + d4, ((kg)object3).U());
                    break;
                }
            }
            double d6 = (double)multiProtocolSessionManager.o.x() + 0.5;
            double d7 = (double)multiProtocolSessionManager.o.b() + 0.5;
            float f3 = (float)_Y.F(contextualEventDispatcher.X(), contextualEventDispatcher.f(), f, d6, d7);
            float f4 = (float)Math.abs(AdaptiveComputationEngine.a(f3));
            bl = f4 > 110.0f;
            try {
                if (kg2.L() <= (double)dynamicResourceRegistry.m.h()) {
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            object2 = cipherContextManager784.v().M();
            CompressionUtility2668 compressionUtility2668 = null;
            if (!this.Ve.s().booleanValue()) {
                boolean bl4 = this.V8.O;
                boolean bl5 = this.V8.B;
                boolean bl6 = this.V8.P;
                boolean bl7 = this.V8.F;
                compressionUtility2668 = this.T(qh2, this.VH, bl4, bl5, bl6, bl7);
                try {
                    if (compressionUtility2668 != null) {
                        cipherContextManager784.r(compressionUtility2668.V, compressionUtility2668.W, compressionUtility2668.d, compressionUtility2668.n);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            try {
                cipherContextManager784.f();
                if (compressionUtility2668 == null) continue;
                cipherContextManager784.r(compressionUtility2668.T, compressionUtility2668.i, compressionUtility2668.P, compressionUtility2668.k);
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
        object4 = cipherContextManager784.G();
        if (bl3) {
            block38: {
                int n3;
                block40: {
                    block39: {
                        dynamicResourceRegistry.i = ContextualEventDispatcher.N(((kg)object4).R(), ((kg)object4).L() + d4, ((kg)object4).U());
                        boolean bl8 = multiProtocolSessionManager.o.f(dynamicResourceRegistry.N.v());
                        try {
                            try {
                                try {
                                    if (!bl8 || !qh.j()) break block38;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (!bl) break block39;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            n3 = 2;
                            break block40;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    n3 = 1;
                }
                return n3;
            }
            return n2;
        }
        N9 n9 = multiProtocolSessionManager.o;
        AdaptiveConfigurationManager adaptiveConfigurationManager = multiProtocolSessionManager.N;
        N9 n92 = multiProtocolSessionManager.h();
        object3 = n9;
        ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N((double)n92.x() + 0.5, qh.V() + d4, (double)n92.b() + 0.5);
        object2 = Zw.e(systemConfigurationOrchestrator, networkProtocolNegotiator, contextualEventDispatcher, multiProtocolSessionManager, f, f2);
        try {
            dynamicResourceRegistry.i = contextualEventDispatcher;
            MultiProtocolSessionManager multiProtocolSessionManager2 = multiProtocolSessionManager;
            object = object2 == null ? _Y.U(contextualEventDispatcher, PatternMatchingOrchestrator.y(networkProtocolNegotiator, n9), 0.0, 0.0, 0.0).l() : object2;
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        try {
            multiProtocolSessionManager2.Q = object;
            n = bl ? 2 : 2;
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        return n;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void j(AuthenticationProvider2618 authenticationProvider2618) {
        block11: {
            block12: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = authenticationProvider2618.getThePlayer();
                try {
                    try {
                        try {
                            try {
                                if (this.VE == null || !ApplicationLifecycleManager.X().Y()) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (!systemConfigurationOrchestrator.r()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        if (this.VT == null) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    if (this.VT instanceof CryptographicSecurityProvider) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                boolean bl = this.VF;
                boolean bl2 = this.N;
                boolean bl3 = this.K;
                boolean bl4 = this.V0;
                CompressionUtility2668 compressionUtility2668 = this.T((Qh)systemConfigurationOrchestrator, this.VH, bl, bl2, bl3, bl4);
                try {
                    if (compressionUtility2668 != null) {
                        this.j = true;
                        this.VO = compressionUtility2668.V;
                        this.Y = compressionUtility2668.n;
                        this.l = compressionUtility2668.d;
                        this.T = compressionUtility2668.W;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            this.V();
        }
    }

    private void M() {
    }

    private boolean i() {
        boolean bl;
        block21: {
            NetworkPacketInterceptor1107 networkPacketInterceptor1107;
            block25: {
                boolean bl2;
                block28: {
                    boolean bl3;
                    AdaptiveConfigurationManager adaptiveConfigurationManager;
                    block27: {
                        block26: {
                            boolean bl4;
                            block29: {
                                boolean bl5;
                                block24: {
                                    block23: {
                                        block22: {
                                            bl = false;
                                            if (this.VA == null) break block21;
                                            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                            oQ oQ2 = PatternMatchingOrchestrator.y(systemConfigurationOrchestrator.N(), this.VA.h());
                                            oQ oQ3 = systemConfigurationOrchestrator.S();
                                            try {
                                                if (oQ3.e(oQ2)) {
                                                    return bl;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                            networkPacketInterceptor1107 = ConfigurationCalibrator.b.m();
                                            try {
                                                if (!networkPacketInterceptor1107.h()) break block21;
                                                if (GeometryCalculator.C() <= GeometryCalculator.W) break block22;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                            bl4 = networkPacketInterceptor1107.f().equals(ReflectionUtilityBroker.Y(this.VA.o));
                                            break block29;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (networkPacketInterceptor1107.p() != this.VA.o.x() || networkPacketInterceptor1107.b() != this.VA.o.J()) break block23;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ModelSimulationEngine.a(customSystemException);
                                                }
                                                if (networkPacketInterceptor1107.m() != this.VA.o.b()) break block23;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                            bl5 = true;
                                            break block24;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ModelSimulationEngine.a(customSystemException);
                                        }
                                    }
                                    bl5 = false;
                                }
                                bl4 = bl5;
                            }
                            try {
                                try {
                                    if (!bl4) break block25;
                                    if (!this.VA.L) break block26;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                adaptiveConfigurationManager = this.VA.N;
                                break block27;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                        }
                        adaptiveConfigurationManager = null;
                    }
                    AdaptiveConfigurationManager adaptiveConfigurationManager2 = adaptiveConfigurationManager;
                    try {
                        bl3 = adaptiveConfigurationManager2 == null;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    bl2 = bl3;
                    try {
                        if (adaptiveConfigurationManager2 == null || !adaptiveConfigurationManager2.equals(networkPacketInterceptor1107.K())) break block28;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    bl2 = true;
                }
                if (bl2) {
                    bl = true;
                }
                break block21;
            }
            ReflectionUtilityBroker reflectionUtilityBroker = networkPacketInterceptor1107.f();
            N9 n9 = this.VA.h();
            if (n9.C(reflectionUtilityBroker.I(networkPacketInterceptor1107.K()))) {
                bl = true;
            }
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    @DataExchangeProtocol2090
    public void O(KB var1_1) {
        block210: {
            block220: {
                block212: {
                    block213: {
                        block211: {
                            block209: {
                                block206: {
                                    block208: {
                                        block207: {
                                            block192: {
                                                block188: {
                                                    block205: {
                                                        block204: {
                                                            block203: {
                                                                block198: {
                                                                    block200: {
                                                                        block199: {
                                                                            block202: {
                                                                                block201: {
                                                                                    block197: {
                                                                                        block195: {
                                                                                            block193: {
                                                                                                block194: {
                                                                                                    block191: {
                                                                                                        block190: {
                                                                                                            block186: {
                                                                                                                block187: {
                                                                                                                    block219: {
                                                                                                                        block182: {
                                                                                                                            block185: {
                                                                                                                                block183: {
                                                                                                                                    block184: {
                                                                                                                                        block180: {
                                                                                                                                            block181: {
                                                                                                                                                block179: {
                                                                                                                                                    block178: {
                                                                                                                                                        block176: {
                                                                                                                                                            block174: {
                                                                                                                                                                block173: {
                                                                                                                                                                    block172: {
                                                                                                                                                                        var2_2 = ModelSimulationEngine.bb ^ 21497660061134L;
                                                                                                                                                                        var4_3 = var1_1.getCurrentScreen();
                                                                                                                                                                        var5_4 = var1_1.getGameSettings();
                                                                                                                                                                        var6_5 = var1_1.getThePlayer();
                                                                                                                                                                        var7_6 = var1_1.getWorld();
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                if (!var6_5.Y() && !var7_6.Y()) break block172;
                                                                                                                                                                            }
                                                                                                                                                                            catch (CustomSystemException v0) {
                                                                                                                                                                                throw ModelSimulationEngine.a(v0);
                                                                                                                                                                            }
                                                                                                                                                                            this.n();
                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        catch (CustomSystemException v1) {
                                                                                                                                                                            throw ModelSimulationEngine.a(v1);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        if (this.Vr) {
                                                                                                                                                                            this.t((String)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)11512, (long)(2357584637072142900L ^ var2_2)), (long)-3513146024975512L, (long)var2_2), true);
                                                                                                                                                                            this.x(var6_5);
                                                                                                                                                                            this.Vr = false;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    catch (CustomSystemException v2) {
                                                                                                                                                                        throw ModelSimulationEngine.a(v2);
                                                                                                                                                                    }
                                                                                                                                                                    this.b(var6_5, var5_4, var4_3);
                                                                                                                                                                    var8_7 = -0.0784000015258789;
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            if (!var6_5.j() || var6_5.x() != var8_7) break block173;
                                                                                                                                                                        }
                                                                                                                                                                        catch (CustomSystemException v3) {
                                                                                                                                                                            throw ModelSimulationEngine.a(v3);
                                                                                                                                                                        }
                                                                                                                                                                        this.Vf = var6_5.V();
                                                                                                                                                                    }
                                                                                                                                                                    catch (CustomSystemException v4) {
                                                                                                                                                                        throw ModelSimulationEngine.a(v4);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    if (ApplicationLifecycleManager.X().M() == null) {
                                                                                                                                                                        ConfigurationParameterResolver.l();
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                catch (CustomSystemException v5) {
                                                                                                                                                                    throw ModelSimulationEngine.a(v5);
                                                                                                                                                                }
                                                                                                                                                                var10_8 = DynamicContextBroker.s(ApplicationLifecycleManager.N().s());
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        this.V8 = new NumericComputationFramework(var6_5);
                                                                                                                                                                        if (!this.j) break block174;
                                                                                                                                                                        this.V8.O = this.VO;
                                                                                                                                                                        this.V8.B = this.T;
                                                                                                                                                                        this.V8.P = this.l;
                                                                                                                                                                        this.V8.F = this.Y;
                                                                                                                                                                        this.P();
                                                                                                                                                                        this.j = false;
                                                                                                                                                                        if (!var4_3.Y()) break block174;
                                                                                                                                                                    }
                                                                                                                                                                    catch (CustomSystemException v6) {
                                                                                                                                                                        throw ModelSimulationEngine.a(v6);
                                                                                                                                                                    }
                                                                                                                                                                    CryptoStreamProcessor.y(false);
                                                                                                                                                                }
                                                                                                                                                                catch (CustomSystemException v7) {
                                                                                                                                                                    throw ModelSimulationEngine.a(v7);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            this.V8.O = var10_8;
                                                                                                                                                            var11_9 = var6_5.M().K();
                                                                                                                                                            try {
                                                                                                                                                                block175: {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                if (this.w || this.P.v()) break block175;
                                                                                                                                                                            }
                                                                                                                                                                            catch (CustomSystemException v8) {
                                                                                                                                                                                throw ModelSimulationEngine.a(v8);
                                                                                                                                                                            }
                                                                                                                                                                            if (this.V.F(this)) break block175;
                                                                                                                                                                        }
                                                                                                                                                                        catch (CustomSystemException v9) {
                                                                                                                                                                            throw ModelSimulationEngine.a(v9);
                                                                                                                                                                        }
                                                                                                                                                                        if (!ApplicationLifecycleManager.X().r()) break block176;
                                                                                                                                                                    }
                                                                                                                                                                    catch (CustomSystemException v10) {
                                                                                                                                                                        throw ModelSimulationEngine.a(v10);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                this.n();
                                                                                                                                                                return;
                                                                                                                                                            }
                                                                                                                                                            catch (CustomSystemException v11) {
                                                                                                                                                                throw ModelSimulationEngine.a(v11);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        var12_10 = this.T(var6_5);
                                                                                                                                                        try {
                                                                                                                                                            block177: {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            if (var11_9 || var6_5.T()) break block177;
                                                                                                                                                                        }
                                                                                                                                                                        catch (CustomSystemException v12) {
                                                                                                                                                                            throw ModelSimulationEngine.a(v12);
                                                                                                                                                                        }
                                                                                                                                                                        if (var6_5.d()) break block177;
                                                                                                                                                                    }
                                                                                                                                                                    catch (CustomSystemException v13) {
                                                                                                                                                                        throw ModelSimulationEngine.a(v13);
                                                                                                                                                                    }
                                                                                                                                                                    if (var12_10 != null) break block178;
                                                                                                                                                                }
                                                                                                                                                                catch (CustomSystemException v14) {
                                                                                                                                                                    throw ModelSimulationEngine.a(v14);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            this.n();
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        catch (CustomSystemException v15) {
                                                                                                                                                            throw ModelSimulationEngine.a(v15);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (this.V1.s().booleanValue() || this.V3.s().booleanValue()) break block179;
                                                                                                                                                            }
                                                                                                                                                            catch (CustomSystemException v16) {
                                                                                                                                                                throw ModelSimulationEngine.a(v16);
                                                                                                                                                            }
                                                                                                                                                            if (this.O.s().booleanValue()) break block179;
                                                                                                                                                        }
                                                                                                                                                        catch (CustomSystemException v17) {
                                                                                                                                                            throw ModelSimulationEngine.a(v17);
                                                                                                                                                        }
                                                                                                                                                        this.n();
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    catch (CustomSystemException v18) {
                                                                                                                                                        throw ModelSimulationEngine.a(v18);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var13_11 = DynamicContextBroker.s(var1_1.getGameSettings().r());
                                                                                                                                                try {
                                                                                                                                                    if (this.VE == null) break block180;
                                                                                                                                                    if (!var6_5.j()) break block181;
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException v19) {
                                                                                                                                                    throw ModelSimulationEngine.a(v19);
                                                                                                                                                }
                                                                                                                                                var14_12 = new CipherContextManager784(var6_5, var6_5, var7_6, this.V8);
                                                                                                                                                var15_16 = this.f(var6_5, var6_5, var7_6, var14_12, this.VE);
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        if (++this.h < 5 && var15_16) ** GOTO lbl148
                                                                                                                                                    }
                                                                                                                                                    catch (CustomSystemException v20) {
                                                                                                                                                        throw ModelSimulationEngine.a(v20);
                                                                                                                                                    }
                                                                                                                                                    this.n();
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException v21) {
                                                                                                                                                    throw ModelSimulationEngine.a(v21);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            this.h = 0;
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        if (!this.Z.s().booleanValue()) break block182;
                                                                                                                                                        if (this.VX == var13_11) break block183;
                                                                                                                                                    }
                                                                                                                                                    catch (CustomSystemException v22) {
                                                                                                                                                        throw ModelSimulationEngine.a(v22);
                                                                                                                                                    }
                                                                                                                                                    if (var13_11) break block183;
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException v23) {
                                                                                                                                                    throw ModelSimulationEngine.a(v23);
                                                                                                                                                }
                                                                                                                                                if (!this.Vs) break block184;
                                                                                                                                            }
                                                                                                                                            catch (CustomSystemException v24) {
                                                                                                                                                throw ModelSimulationEngine.a(v24);
                                                                                                                                            }
                                                                                                                                            this.Vs = false;
                                                                                                                                            break block183;
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException v25) {
                                                                                                                                            throw ModelSimulationEngine.a(v25);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    this.Vq.m();
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            if (this.VX || !var13_11) break block185;
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException v26) {
                                                                                                                                            throw ModelSimulationEngine.a(v26);
                                                                                                                                        }
                                                                                                                                        if (this.Vq.m(500L)) break block185;
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v27) {
                                                                                                                                        throw ModelSimulationEngine.a(v27);
                                                                                                                                    }
                                                                                                                                    this.Vs = true;
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v28) {
                                                                                                                                    throw ModelSimulationEngine.a(v28);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            this.VX = var13_11;
                                                                                                                            break block219;
                                                                                                                        }
                                                                                                                        this.VX = false;
                                                                                                                        this.Vs = false;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (this.VE == null) break block186;
                                                                                                                            if (!(var6_5.V() < (double)this.VE.N.h())) break block187;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v29) {
                                                                                                                            throw ModelSimulationEngine.a(v29);
                                                                                                                        }
                                                                                                                        this.n();
                                                                                                                        break block186;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v30) {
                                                                                                                        throw ModelSimulationEngine.a(v30);
                                                                                                                    }
                                                                                                                }
                                                                                                                var14_13 = _Y.z(var6_5.F(), var6_5.B(), (double)this.VE.m.z() + 0.5, (double)this.VE.m.A() + 0.5);
                                                                                                                var16_19 = _Y.z(var6_5.f(), var6_5.n(), (double)this.VE.m.z() + 0.5, (double)this.VE.m.A() + 0.5);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (!(var14_13 > var16_19) || !(var14_13 > 1.2)) break block186;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v31) {
                                                                                                                            throw ModelSimulationEngine.a(v31);
                                                                                                                        }
                                                                                                                        if (var6_5.j()) break block186;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v32) {
                                                                                                                        throw ModelSimulationEngine.a(v32);
                                                                                                                    }
                                                                                                                    this.n();
                                                                                                                }
                                                                                                                catch (CustomSystemException v33) {
                                                                                                                    throw ModelSimulationEngine.a(v33);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                block189: {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (!this.k() || this.VE != null) break block188;
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v34) {
                                                                                                                                    throw ModelSimulationEngine.a(v34);
                                                                                                                                }
                                                                                                                                if (var12_10 == null) break block188;
                                                                                                                            }
                                                                                                                            catch (CustomSystemException v35) {
                                                                                                                                throw ModelSimulationEngine.a(v35);
                                                                                                                            }
                                                                                                                            if (!var6_5.j()) break block189;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v36) {
                                                                                                                            throw ModelSimulationEngine.a(v36);
                                                                                                                        }
                                                                                                                        if (!(var6_5.x() >= 0.0)) break block190;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v37) {
                                                                                                                        throw ModelSimulationEngine.a(v37);
                                                                                                                    }
                                                                                                                }
                                                                                                                v38 = true;
                                                                                                                break block191;
                                                                                                            }
                                                                                                            catch (CustomSystemException v39) {
                                                                                                                throw ModelSimulationEngine.a(v39);
                                                                                                            }
                                                                                                        }
                                                                                                        v38 = false;
                                                                                                    }
                                                                                                    var14_14 = v38;
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (!var14_14 || var11_9) break block192;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v40) {
                                                                                                                        throw ModelSimulationEngine.a(v40);
                                                                                                                    }
                                                                                                                    if (var6_5.T()) break block192;
                                                                                                                }
                                                                                                                catch (CustomSystemException v41) {
                                                                                                                    throw ModelSimulationEngine.a(v41);
                                                                                                                }
                                                                                                                if (var6_5.d()) break block192;
                                                                                                            }
                                                                                                            catch (CustomSystemException v42) {
                                                                                                                throw ModelSimulationEngine.a(v42);
                                                                                                            }
                                                                                                            if (var6_5.F()) break block192;
                                                                                                        }
                                                                                                        catch (CustomSystemException v43) {
                                                                                                            throw ModelSimulationEngine.a(v43);
                                                                                                        }
                                                                                                        if (!this.VU.m(((Double)this.V4.J()).longValue())) break block192;
                                                                                                    }
                                                                                                    catch (CustomSystemException v44) {
                                                                                                        throw ModelSimulationEngine.a(v44);
                                                                                                    }
                                                                                                    var15_17 = this.v(50, var6_5);
                                                                                                    var16_20 = false;
                                                                                                    var17_23 = false;
                                                                                                    var18_25 = false;
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var15_17 == null) break block193;
                                                                                                            if (!this.V3.s().booleanValue()) break block194;
                                                                                                        }
                                                                                                        catch (CustomSystemException v45) {
                                                                                                            throw ModelSimulationEngine.a(v45);
                                                                                                        }
                                                                                                        if (!(var6_5.V() - (double)var15_17.h() - 3.0 > (double)var6_5.e())) break block194;
                                                                                                    }
                                                                                                    catch (CustomSystemException v46) {
                                                                                                        throw ModelSimulationEngine.a(v46);
                                                                                                    }
                                                                                                    var17_23 = true;
                                                                                                }
                                                                                                try {
                                                                                                    if (!this.O.s().booleanValue() || !(var6_5.V() - (double)(var15_17.h() + 1) >= (Double)this.Vo.J())) break block195;
                                                                                                }
                                                                                                catch (CustomSystemException v47) {
                                                                                                    throw ModelSimulationEngine.a(v47);
                                                                                                }
                                                                                                var18_25 = true;
                                                                                                break block195;
                                                                                            }
                                                                                            var16_20 = this.V1.s();
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    block196: {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var16_20 || var17_23) break block196;
                                                                                                            }
                                                                                                            catch (CustomSystemException v48) {
                                                                                                                throw ModelSimulationEngine.a(v48);
                                                                                                            }
                                                                                                            if (!var18_25) break block192;
                                                                                                        }
                                                                                                        catch (CustomSystemException v49) {
                                                                                                            throw ModelSimulationEngine.a(v49);
                                                                                                        }
                                                                                                    }
                                                                                                    if (this.V.z(this)) break block197;
                                                                                                }
                                                                                                catch (CustomSystemException v50) {
                                                                                                    throw ModelSimulationEngine.a(v50);
                                                                                                }
                                                                                                if (this.V.O(this, this.Ve.s())) break block197;
                                                                                            }
                                                                                            catch (CustomSystemException v51) {
                                                                                                throw ModelSimulationEngine.a(v51);
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        catch (CustomSystemException v52) {
                                                                                            throw ModelSimulationEngine.a(v52);
                                                                                        }
                                                                                    }
                                                                                    var19_27 = System.nanoTime();
                                                                                    var21_29 = this.D(var7_6, var6_5, var12_10);
                                                                                    var22_31 = System.nanoTime();
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var21_29 == null || var21_29.d()) break block198;
                                                                                                    }
                                                                                                    catch (CustomSystemException v53) {
                                                                                                        throw ModelSimulationEngine.a(v53);
                                                                                                    }
                                                                                                    this.M((String)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)3923, (long)(4102814819468169668L ^ var2_2)), (long)-3513146024975512L, (long)var2_2) + (double)(var22_31 - var19_27) / 1000000.0 + (String)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)18905, (long)(8713113883711051628L ^ var2_2)), (long)-3513146024975512L, (long)var2_2));
                                                                                                    this.K();
                                                                                                    this.e();
                                                                                                    this.h = 0;
                                                                                                    this.VV = 0;
                                                                                                    this.R = 0;
                                                                                                    this.VB = 0;
                                                                                                    this.n = 0;
                                                                                                    this.VE = var21_29;
                                                                                                    this.VX = var13_11;
                                                                                                    var5_4.G().B();
                                                                                                    if (this.Ve.s().booleanValue()) break block199;
                                                                                                }
                                                                                                catch (CustomSystemException v54) {
                                                                                                    throw ModelSimulationEngine.a(v54);
                                                                                                }
                                                                                                if (this.Vp != -999.0) break block200;
                                                                                            }
                                                                                            catch (CustomSystemException v55) {
                                                                                                throw ModelSimulationEngine.a(v55);
                                                                                            }
                                                                                            v56 = this;
                                                                                            if (!ResourceAllocationManager.b()) break block201;
                                                                                        }
                                                                                        catch (CustomSystemException v57) {
                                                                                            throw ModelSimulationEngine.a(v57);
                                                                                        }
                                                                                        v58 = ResourceAllocationManager.c();
                                                                                        break block202;
                                                                                    }
                                                                                    catch (CustomSystemException v59) {
                                                                                        throw ModelSimulationEngine.a(v59);
                                                                                    }
                                                                                }
                                                                                v58 = var6_5.q();
                                                                            }
                                                                            v56.Vp = v58;
                                                                            this.b = var6_5.S();
                                                                            break block200;
                                                                        }
                                                                        this.Vp = -999.0;
                                                                    }
                                                                    this.VG.clear();
                                                                    this.M();
                                                                    break block192;
                                                                }
                                                                var24_34 = null;
                                                                try {
                                                                    if (var21_29 != null) break block203;
                                                                    if (this.Vz.size() <= 0) break block204;
                                                                }
                                                                catch (CustomSystemException v60) {
                                                                    throw ModelSimulationEngine.a(v60);
                                                                }
                                                                var24_34 = ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)9837, (long)(4781264151412799665L ^ var2_2)), (long)-3513146024975512L, (long)var2_2);
                                                                break block204;
                                                            }
                                                            var24_34 = var21_29.E;
                                                            if (var24_34 == null) {
                                                                var24_34 = ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)32643, (long)(283440065610850617L ^ var2_2)), (long)-3513146024975512L, (long)var2_2);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (var24_34 == null || var24_34.isEmpty()) break block205;
                                                            }
                                                            catch (CustomSystemException v61) {
                                                                throw ModelSimulationEngine.a(v61);
                                                            }
                                                            this.b((String)var24_34);
                                                        }
                                                        catch (CustomSystemException v62) {
                                                            throw ModelSimulationEngine.a(v62);
                                                        }
                                                    }
                                                    this.X();
                                                    this.VE = null;
                                                    this.VU.m();
                                                    break block192;
                                                }
                                                try {
                                                    if (this.VE != null) {
                                                        this.A();
                                                    }
                                                }
                                                catch (CustomSystemException v63) {
                                                    throw ModelSimulationEngine.a(v63);
                                                }
                                            }
                                            try {
                                                try {
                                                    this.a();
                                                    this.Vm = ConfigurationCalibrator.b.m();
                                                    if (this.VE == null) break block206;
                                                    if (this.Vx) break block207;
                                                }
                                                catch (CustomSystemException v64) {
                                                    throw ModelSimulationEngine.a(v64);
                                                }
                                                this.Vx = true;
                                                ConfigurationRegistry.d.U(this);
                                            }
                                            catch (CustomSystemException v65) {
                                                throw ModelSimulationEngine.a(v65);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    this.VA = null;
                                                    if (this.VE.x == null) break block208;
                                                    this.VA = this.I(this.VE, var6_5, var7_6);
                                                    if (this.VA != null) break block209;
                                                }
                                                catch (CustomSystemException v66) {
                                                    throw ModelSimulationEngine.a(v66);
                                                }
                                                if (this.VE.x == null) break block209;
                                            }
                                            catch (CustomSystemException v67) {
                                                throw ModelSimulationEngine.a(v67);
                                            }
                                            this.VE.R((String)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)6684, (long)(5943600783453471904L ^ var2_2)), (long)-3513146024975512L, (long)var2_2));
                                            break block209;
                                        }
                                        catch (CustomSystemException v68) {
                                            throw ModelSimulationEngine.a(v68);
                                        }
                                    }
                                    try {
                                        try {
                                            if (this.t && !this.L) break block209;
                                        }
                                        catch (CustomSystemException v69) {
                                            throw ModelSimulationEngine.a(v69);
                                        }
                                        this.n();
                                        return;
                                    }
                                    catch (CustomSystemException v70) {
                                        throw ModelSimulationEngine.a(v70);
                                    }
                                }
                                this.n();
                                return;
                            }
                            try {
                                try {
                                    try {
                                        if (this.VA == null || !this.X(var6_5)) break block210;
                                    }
                                    catch (CustomSystemException v71) {
                                        throw ModelSimulationEngine.a(v71);
                                    }
                                    this.x = new CipherContextManager784(var6_5, var6_5, var7_6, this.V8);
                                    if (ConfigurationCalibrator.b.N() != null) break block211;
                                }
                                catch (CustomSystemException v72) {
                                    throw ModelSimulationEngine.a(v72);
                                }
                                this.VT = null;
                            }
                            catch (CustomSystemException v73) {
                                throw ModelSimulationEngine.a(v73);
                            }
                        }
                        try {
                            if (this.VT != null) break block212;
                            if (!ConfigurationCalibrator.b.P()) break block213;
                        }
                        catch (CustomSystemException v74) {
                            throw ModelSimulationEngine.a(v74);
                        }
                        var16_21 = (CryptographicSecurityProvider)ConfigurationCalibrator.b.N();
                        var14_15 = var16_21.P();
                        var15_18 = var16_21.v();
                        break block220;
                    }
                    var14_15 = var6_5.q();
                    var15_18 = var6_5.S();
                    break block220;
                }
                if (this.VT instanceof CryptographicSecurityProvider) {
                    var14_15 = ((CryptographicSecurityProvider)this.VT).P();
                    var15_18 = ((CryptographicSecurityProvider)this.VT).v();
                } else {
                    var14_15 = this.VT.A();
                    var15_18 = this.VT.L();
                }
            }
            var16_22 = this.i();
            if (var16_22) {
                block214: {
                    var17_24 = ApplicationLifecycleManager.N().G();
                    try {
                        try {
                            if (!var17_24.b() && !var17_24.k()) break block214;
                        }
                        catch (CustomSystemException v75) {
                            throw ModelSimulationEngine.a(v75);
                        }
                        ConnectionPoolOrchestrator1192.d(var17_24, false);
                    }
                    catch (CustomSystemException v76) {
                        throw ModelSimulationEngine.a(v76);
                    }
                }
                var18_26 = ApplicationLifecycleManager.N().D();
                ConnectionPoolOrchestrator1192.d(var18_26, true);
                ConnectionPoolOrchestrator1192.m(var18_26);
                ConnectionPoolOrchestrator1192.d(var18_26, false);
                if (this.VE.x != null) {
                    block218: {
                        block217: {
                            this.VA = null;
                            var19_28 = this.VE.x;
                            var20_35 = var19_28.N;
                            try {
                                if (!var20_35.isEmpty()) {
                                    var20_35.removeElementAt(0);
                                }
                            }
                            catch (CustomSystemException v77) {
                                throw ModelSimulationEngine.a(v77);
                            }
                            while (!var20_35.isEmpty()) {
                                block215: {
                                    block216: {
                                        var21_29 = var20_35.firstElement();
                                        if (var21_29 == null) continue;
                                        var22_32 = var21_29.h();
                                        var23_36 = var7_6.N(var22_32.x(), var22_32.J(), var22_32.b());
                                        try {
                                            try {
                                                if (!PatternMatchingOrchestrator.a(var23_36)) break block215;
                                                if (!Zw.R(var7_6, var6_5, var22_32)) break block216;
                                            }
                                            catch (CustomSystemException v78) {
                                                throw ModelSimulationEngine.a(v78);
                                            }
                                            this.VA = var21_29;
                                            break;
                                        }
                                        catch (CustomSystemException v79) {
                                            throw ModelSimulationEngine.a(v79);
                                        }
                                    }
                                    this.VE.R((String)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)18582, (long)(6743862259435705947L ^ var2_2)), (long)-3513146024975512L, (long)var2_2));
                                    break;
                                }
                                this.VE.i = null;
                                var20_35.removeElementAt(0);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (this.VA != null || !this.t) break block210;
                                        }
                                        catch (CustomSystemException v80) {
                                            throw ModelSimulationEngine.a(v80);
                                        }
                                        if (this.VT == null) break block210;
                                    }
                                    catch (CustomSystemException v81) {
                                        throw ModelSimulationEngine.a(v81);
                                    }
                                    if (!this.L) break block217;
                                }
                                catch (CustomSystemException v82) {
                                    throw ModelSimulationEngine.a(v82);
                                }
                                v83 = this.Vk;
                                break block218;
                            }
                            catch (CustomSystemException v84) {
                                throw ModelSimulationEngine.a(v84);
                            }
                        }
                        v83 = this.VH;
                    }
                    var21_30 = v83;
                    var22_33 = Math.abs(AdaptiveComputationEngine.v(var21_30 - var14_15));
                    var23_37 = Math.abs(var22_33) / 1.8f / 3.0f;
                    this.VT.L(var23_37);
                    this.VT.v(var21_30, this.VT.G());
                }
            }
        }
    }

    private void K() {
        block3: {
            block2: {
                try {
                    if (!this.F) break block2;
                    this.VF = true;
                    this.N = false;
                    this.K = false;
                    this.V0 = false;
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            this.VF = this.V8.O;
            this.N = this.V8.B;
            this.K = this.V8.P;
            this.V0 = this.V8.F;
        }
    }

    private boolean k() {
        boolean bl;
        block11: {
            block10: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (systemConfigurationOrchestrator.Y()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                try {
                    block9: {
                        try {
                            try {
                                if (systemConfigurationOrchestrator.G() != 0.0 || systemConfigurationOrchestrator.x() != 0.0) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (systemConfigurationOrchestrator.o() == 0.0) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private MultiProtocolSessionManager F(DynamicResourceRegistry dynamicResourceRegistry, Qh qh, NetworkProtocolNegotiator networkProtocolNegotiator, @Nullable NetworkConnectionOrchestrator networkConnectionOrchestrator) {
        long l = bb ^ 0x1F1EC8C86077L;
        MultiProtocolSessionManager multiProtocolSessionManager = null;
        DistributedResourceOrchestrator distributedResourceOrchestrator = dynamicResourceRegistry.x;
        Vector<MultiProtocolSessionManager> vector = distributedResourceOrchestrator.N;
        while (!vector.isEmpty()) {
            block16: {
                block17: {
                    MultiProtocolSessionManager multiProtocolSessionManager2;
                    block14: {
                        TransactionCorrelationEngine transactionCorrelationEngine;
                        block13: {
                            multiProtocolSessionManager2 = vector.firstElement();
                            if (multiProtocolSessionManager2 == null) continue;
                            N9 n9 = multiProtocolSessionManager2.o;
                            transactionCorrelationEngine = networkProtocolNegotiator.N(n9.x(), n9.J(), n9.b());
                            try {
                                try {
                                    if (networkConnectionOrchestrator == null || !PatternMatchingOrchestrator.e(transactionCorrelationEngine)) break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (PatternMatchingOrchestrator.e(networkConnectionOrchestrator.I())) break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            transactionCorrelationEngine = networkConnectionOrchestrator.I();
                        }
                        try {
                            block15: {
                                try {
                                    try {
                                        if (!PatternMatchingOrchestrator.a(transactionCorrelationEngine)) break block14;
                                        if (multiProtocolSessionManager2.L) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                    if (!PatternMatchingOrchestrator.N(transactionCorrelationEngine)) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                            }
                            dynamicResourceRegistry.R((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)32313, (long)(0x5C544DE379497527L ^ l)), (long)-6175974008462281007L, (long)l)));
                            return null;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    N9 n9 = multiProtocolSessionManager2.h();
                    TransactionCorrelationEngine transactionCorrelationEngine = networkProtocolNegotiator.N(n9.x(), n9.J(), n9.b());
                    try {
                        if (!PatternMatchingOrchestrator.a(transactionCorrelationEngine)) break block16;
                        if (!Zw.R(networkProtocolNegotiator, qh, n9)) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    multiProtocolSessionManager = multiProtocolSessionManager2;
                    break;
                }
                dynamicResourceRegistry.R((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)15643, (long)(0x381F4476F043B645L ^ l)), (long)-6175974008462281007L, (long)l)));
                break;
            }
            dynamicResourceRegistry.i = null;
            vector.removeElementAt(0);
        }
        return multiProtocolSessionManager;
    }

    private void v(ArrayList<DynamicResourceRegistry> arrayList, kg kg2, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        arrayList.sort(Comparator.comparingDouble(arg_0 -> this.lambda$sortClutchPaths$0(kg2, systemConfigurationOrchestrator, arg_0)));
    }

    /*
     * Exception decompiling
     */
    private DynamicResourceRegistry T(NetworkProtocolNegotiator var1_1, CipherContextManager784 var2_2, LightweightExecutionContext var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [286[DOLOOP]], but top level block is 99[TRYBLOCK]
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

    private void e() {
        this.VP = null;
        this.V2 = 0;
    }

    private DynamicResourceRegistry D(NetworkProtocolNegotiator networkProtocolNegotiator, SystemConfigurationOrchestrator systemConfigurationOrchestrator, LightweightExecutionContext lightweightExecutionContext) {
        CallSite callSite;
        block15: {
            boolean bl;
            float f;
            long l;
            block14: {
                block13: {
                    l = bb ^ 0x42E59C2B15E7L;
                    this.Vt.clear();
                    this.Vd.clear();
                    this.Vz.clear();
                    this.Vn.clear();
                    ExecutionStateTracker executionStateTracker = ApplicationLifecycleManager.N();
                    boolean bl2 = executionStateTracker.s().X();
                    boolean bl3 = executionStateTracker.w().X();
                    boolean bl4 = executionStateTracker.y().X();
                    boolean bl5 = executionStateTracker.h().X();
                    try {
                        if (this.Vp == -999.0) break block13;
                        f = (float)this.Vp;
                        break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                try {
                    f = ResourceAllocationManager.b() ? ResourceAllocationManager.c() : systemConfigurationOrchestrator.q();
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            float f2 = f;
            try {
                this.VH = f2;
                this.Vk = f2;
                this.F = false;
                this.t = false;
                ModelSimulationEngine modelSimulationEngine = this;
                bl = !this.VJ.m(250L);
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            modelSimulationEngine.V7 = bl;
            this.V6 = new CipherContextManager784(systemConfigurationOrchestrator, systemConfigurationOrchestrator, networkProtocolNegotiator, this.V8);
            this.x = new CipherContextManager784(systemConfigurationOrchestrator, systemConfigurationOrchestrator, networkProtocolNegotiator, this.V8);
            CipherContextManager784 cipherContextManager784 = new CipherContextManager784(systemConfigurationOrchestrator, systemConfigurationOrchestrator, networkProtocolNegotiator, this.V8);
            boolean bl6 = false;
            long l2 = System.nanoTime();
            callSite = ModelSimulationEngine.c("\u00ce", (Object)this, (Object)networkProtocolNegotiator, (Object)cipherContextManager784, (Object)lightweightExecutionContext, (long)-2316524123270209415L, (long)l);
            long l3 = System.nanoTime();
            try {
                try {
                    if (callSite == null || ((DynamicResourceRegistry)((Object)callSite)).d()) break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                if (!this.B.s().booleanValue()) break block15;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            int n = ((DynamicResourceRegistry)((Object)callSite)).o();
            try {
                if (n > ((Double)this.Vi.J()).intValue()) {
                    ((DynamicResourceRegistry)((Object)callSite)).R((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)7192, (long)(0x5C4E3AED20ABE2CEL ^ l)), (long)-2316304144028400831L, (long)l)) + n + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)31820, (long)(0x38C4B1E23CEB02B8L ^ l)), (long)-2316304144028400831L, (long)l)) + ((Double)this.Vi.J()).intValue() + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)14833, (long)(0x4B822DA852EF4740L ^ l)), (long)-2316304144028400831L, (long)l)));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
        return callSite;
    }

    @Override
    public void v() {
        GraphicalRenderingController.D(CryptographicContextManager567.class).v(this);
    }

    @Override
    public double e(double d2, boolean bl) {
        String string;
        StringBuilder stringBuilder;
        String string2;
        int n;
        long l = bb ^ 0x4EC56AAAA2D5L;
        try {
            if (!this.VR.s().booleanValue()) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        try {
            n = this.VE == null ? this.M() : this.VE.o();
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        int n2 = n;
        Color color = new Color(255, 20, 20);
        if (n2 >= 32) {
            color = new Color(2, 190, 58);
        } else if (n2 >= 16) {
            color = new Color(255, 249, 18);
        }
        E8 e8 = ApplicationLifecycleManager.X();
        if (this.VE != null) {
            string2 = "\u00a7f\u00a7l";
        } else {
            String string3;
            block43: {
                block42: {
                    boolean bl2;
                    boolean bl3;
                    boolean bl4;
                    block40: {
                        block39: {
                            boolean bl5;
                            block38: {
                                block37: {
                                    boolean bl6;
                                    block36: {
                                        block35: {
                                            try {
                                                try {
                                                    if (this.R <= 0 || this.VD.c() <= 0) break block35;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ModelSimulationEngine.a(customSystemException);
                                                }
                                                bl6 = true;
                                                break block36;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                        }
                                        bl6 = false;
                                    }
                                    bl4 = bl6;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (this.v == -1 || !this.VL.s().booleanValue()) break block37;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ModelSimulationEngine.a(customSystemException);
                                                }
                                                if (this.n <= 0) break block37;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                            if (this.V_.c() <= 0) break block37;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ModelSimulationEngine.a(customSystemException);
                                        }
                                        bl5 = true;
                                        break block38;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                }
                                bl5 = false;
                            }
                            bl3 = bl5;
                            try {
                                try {
                                    if (this.VB <= 0 || this.Vl.c() <= 0) break block39;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                bl2 = true;
                                break block40;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                        }
                        bl2 = false;
                    }
                    boolean bl7 = bl2;
                    try {
                        block41: {
                            try {
                                try {
                                    if (bl4 || bl3) break block41;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (!bl7) break block42;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                        }
                        string3 = "\u00a7e";
                        break block43;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                string3 = "\u00a77";
            }
            string2 = string3;
        }
        String string4 = (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)20016, (long)(0x7BCBD36D31DB87DAL ^ l)), (long)7559531151772988531L, (long)l)) + string2 + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)7556, (long)(0x189329A55BE9D455L ^ l)), (long)7559531151772988531L, (long)l)) + this.O() + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)8707, (long)(0x47E31C9BE4BD6BF0L ^ l)), (long)7559531151772988531L, (long)l));
        try {
            stringBuilder = new StringBuilder();
            string = this.VE == null ? "\u00a7r" : "\u00a76\u00a7l";
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        String string5 = stringBuilder.append(string).append(n2).toString();
        double d3 = e8.L(string4);
        double d4 = e8.L(string5);
        double d5 = (float)ApplicationLifecycleManager.e() / 4.0f - (float)AdaptiveComputationEngine.j(d4 / 2.0);
        if (bl) {
            string5 = string5 + string4;
        }
        e8.J(string5, d5 + 1.0, d2, color);
        return e8.B(string5);
    }

    private void W(NetworkProtocolNegotiator networkProtocolNegotiator, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block29: {
            block38: {
                LightweightExecutionContext lightweightExecutionContext;
                block37: {
                    boolean bl;
                    boolean bl2;
                    boolean bl3;
                    block35: {
                        block33: {
                            CompressionUtility compressionUtility;
                            block34: {
                                boolean bl4;
                                block32: {
                                    boolean bl5;
                                    block31: {
                                        block28: {
                                            try {
                                                try {
                                                    if (this.VE == null && this.Vn.isEmpty()) break block28;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ModelSimulationEngine.a(customSystemException);
                                                }
                                                return;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                        }
                                        lightweightExecutionContext = this.T(systemConfigurationOrchestrator);
                                        try {
                                            block30: {
                                                try {
                                                    try {
                                                        try {
                                                            if (!this.k() || this.VE != null) break block29;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ModelSimulationEngine.a(customSystemException);
                                                        }
                                                        if (!systemConfigurationOrchestrator.j()) break block30;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ModelSimulationEngine.a(customSystemException);
                                                    }
                                                    if (!(systemConfigurationOrchestrator.x() >= 0.0)) break block31;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ModelSimulationEngine.a(customSystemException);
                                                }
                                            }
                                            bl5 = true;
                                            break block32;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ModelSimulationEngine.a(customSystemException);
                                        }
                                    }
                                    bl5 = bl4 = false;
                                }
                                if (!bl4) break block38;
                                compressionUtility = this.v(50, systemConfigurationOrchestrator);
                                bl3 = false;
                                bl2 = false;
                                bl = false;
                                try {
                                    try {
                                        if (compressionUtility == null) break block33;
                                        if (!this.V3.s().booleanValue()) break block34;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                    if (!(systemConfigurationOrchestrator.V() - (double)compressionUtility.h() - 3.0 > (double)systemConfigurationOrchestrator.e())) break block34;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                bl2 = true;
                            }
                            try {
                                if (!this.O.s().booleanValue() || !(systemConfigurationOrchestrator.V() - (double)(compressionUtility.h() + 1) >= (Double)this.Vo.J())) break block35;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            bl = true;
                            break block35;
                        }
                        bl3 = this.V1.s();
                    }
                    try {
                        try {
                            try {
                                block36: {
                                    try {
                                        try {
                                            if (bl3 || bl2) break block36;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ModelSimulationEngine.a(customSystemException);
                                        }
                                        if (!bl) break block29;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                }
                                if (this.V.z(this)) break block37;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (this.V.O(this, this.Ve.s())) break block37;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                this.VE = this.D(networkProtocolNegotiator, systemConfigurationOrchestrator, lightweightExecutionContext);
                break block29;
            }
            this.Vf = systemConfigurationOrchestrator.V();
        }
    }

    private void y(oQ oQ2, Color color, Color color2, int n) {
        block23: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block15: {
                                            block14: {
                                                block13: {
                                                    block12: {
                                                        try {
                                                            GL11.glPushMatrix();
                                                            GL11.glEnable((int)3042);
                                                            GL11.glBlendFunc((int)770, (int)771);
                                                            GL11.glBegin((int)7);
                                                            if (n != 0) break block12;
                                                            GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                                                            break block13;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw ModelSimulationEngine.a(customSystemException);
                                                        }
                                                    }
                                                    GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
                                                }
                                                try {
                                                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
                                                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
                                                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
                                                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
                                                    if (n != 1) break block14;
                                                    GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                                                    break block15;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ModelSimulationEngine.a(customSystemException);
                                                }
                                            }
                                            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
                                        }
                                        try {
                                            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
                                            GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
                                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
                                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
                                            if (n != 2) break block16;
                                            GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                                            break block17;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ModelSimulationEngine.a(customSystemException);
                                        }
                                    }
                                    GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
                                }
                                try {
                                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
                                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
                                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
                                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
                                    if (n != 5) break block18;
                                    GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                                    break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                            }
                            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
                        }
                        try {
                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
                            GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
                            if (n != 3) break block20;
                            GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                            break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
                }
                try {
                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
                    GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
                    GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
                    if (n != 4) break block22;
                    GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)((float)color2.getAlpha() / 255.0f));
                    break block23;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
        }
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    @DataExchangeProtocol2090
    public void P(UserInputEventMapper userInputEventMapper) {
        block6: {
            ExecutionStateTracker executionStateTracker = userInputEventMapper.getGameSettings();
            try {
                try {
                    try {
                        if (this.VE == null || userInputEventMapper.getButton() != UserInputEventMapper.l) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    if (!userInputEventMapper.getButtonState()) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                userInputEventMapper.setCanceled(true);
                executionStateTracker.G().B();
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
    }

    private void b(String string) {
        try {
            this.VP = string;
            if (this.V2 == 0) {
                this.V2 = Math.min(3, Math.max(1, ((Double)this.V4.J()).intValue() / 50));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x210D;
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
                throw new RuntimeException("a/Af", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ModelSimulationEngine.gb[n2] = n3;
        }
        return gb[n2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ModelSimulationEngine.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                ModelSimulationEngine.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private MultiProtocolSessionManager I(DynamicResourceRegistry dynamicResourceRegistry, Qh qh, NetworkProtocolNegotiator networkProtocolNegotiator) {
        return this.F(dynamicResourceRegistry, qh, networkProtocolNegotiator, null);
    }

    private void t(String string, boolean bl) {
        boolean bl2;
        block13: {
            boolean bl3;
            long l;
            block12: {
                boolean bl4;
                block11: {
                    l = bb ^ 0x1582A11FE8BCL;
                    bl2 = false;
                    try {
                        try {
                            if (this.d == null || !this.d.Z()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        bl4 = true;
                        break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                bl4 = bl3 = false;
            }
            if (this.d == null) {
                this.d = new TimedExecutionCoordinator(CryptoConfigurationRegistry383.ALERT, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)3769, (long)(0xB95C3EAD4420D1CL ^ l)), (long)2486412230469942810L, (long)l)), new SecurityAccessController(string), 0.0, 0.0, 3500L);
                bl2 = true;
            } else {
                try {
                    if (!bl3 && !bl) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                bl2 = bl3;
                SecurityAccessController securityAccessController = (SecurityAccessController)this.d.V();
                securityAccessController.y(string);
                this.d.I(3500L);
            }
        }
        try {
            if (bl2) {
                TemporalMetadataResolver.h.c().e(this.d, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
    }

    @DataExchangeProtocol2090
    public void g(DomainEventAggregator domainEventAggregator) {
        ExecutionStateTracker executionStateTracker = domainEventAggregator.getGameSettings();
        try {
            if (this.VE != null) {
                domainEventAggregator.setCanceled(true);
                executionStateTracker.G().B();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
    }

    /*
     * Could not resolve type clashes
     * Loose catch block
     */
    private DynamicResourceRegistry p(int n, DynamicResourceRegistry dynamicResourceRegistry, NetworkProtocolNegotiator networkProtocolNegotiator, LightweightExecutionContext lightweightExecutionContext, ArrayList<N9> arrayList, Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        int n2;
        int n3;
        long l;
        long l2;
        block174: {
            int n4;
            DynamicResourceRegistry dynamicResourceRegistry2;
            block172: {
                Object object;
                Ya ya;
                boolean bl;
                Qh qh2;
                CipherContextManager784 cipherContextManager784;
                HashMap<Object, NetworkConnectionOrchestrator> hashMap;
                NetworkConnectionOrchestrator networkConnectionOrchestrator;
                int n5;
                block138: {
                    block137: {
                        block136: {
                            int n6;
                            l2 = bb ^ 0x571F0A0D53A8L;
                            try {
                                n6 = GameVersionEnumerator.MC_1_20_6.H() ? networkProtocolNegotiator.O() : 0;
                            }
                            catch (Exception exception) {
                                throw ModelSimulationEngine.a(exception);
                            }
                            n5 = n6;
                            l = System.nanoTime();
                            networkConnectionOrchestrator = PatternMatchingOrchestrator.P(lightweightExecutionContext);
                            hashMap = new HashMap<Object, NetworkConnectionOrchestrator>();
                            int n7 = dynamicResourceRegistry.x.N.size();
                            cipherContextManager784 = new CipherContextManager784(systemConfigurationOrchestrator, systemConfigurationOrchestrator, networkProtocolNegotiator, this.V8, this.V6);
                            ExecutionOrchestrator.o(cipherContextManager784.a(), systemConfigurationOrchestrator);
                            cipherContextManager784.w(this.V8);
                            qh2 = cipherContextManager784.a();
                            try {
                                if (!this.F) break block136;
                                cipherContextManager784.r();
                                break block137;
                            }
                            catch (Exception exception) {
                                throw ModelSimulationEngine.a(exception);
                            }
                        }
                        cipherContextManager784.d();
                    }
                    n3 = dynamicResourceRegistry.x.N.size();
                    bl = false;
                    dynamicResourceRegistry2 = new DynamicResourceRegistry(dynamicResourceRegistry.N, dynamicResourceRegistry.m, new ArrayList<kg>());
                    dynamicResourceRegistry2.x = new DistributedResourceOrchestrator(dynamicResourceRegistry.x.Q, new Vector<MultiProtocolSessionManager>(dynamicResourceRegistry.x.N));
                    dynamicResourceRegistry2.M.add(cipherContextManager784.G());
                    ya = null;
                    if (this.VT == null) break block138;
                    try {
                        block175: {
                            if (!(this.VT instanceof CryptographicSecurityProvider)) break block138;
                            break block175;
                            catch (Exception exception) {
                                throw ModelSimulationEngine.a(exception);
                            }
                        }
                        if (!ConfigurationCalibrator.b.P()) break block138;
                    }
                    catch (Exception exception) {
                        throw ModelSimulationEngine.a(exception);
                    }
                    ya = new CryptographicSecurityProvider(qh2);
                    ((CryptographicSecurityProvider)ya).j((CryptographicSecurityProvider)this.VT);
                    cipherContextManager784.w(ya);
                }
                int n8 = 0;
                boolean bl2 = ConfigurationCalibrator.b.P();
                int n9 = this.z;
                boolean bl3 = false;
                boolean bl4 = false;
                boolean bl5 = false;
                try {
                    for (int i = 0; i <= n; ++i) {
                        block201: {
                            Object object2;
                            block169: {
                                block171: {
                                    block170: {
                                        block199: {
                                            block198: {
                                                block166: {
                                                    block168: {
                                                        block167: {
                                                            block196: {
                                                                block195: {
                                                                    ObjectLifecycleTracker objectLifecycleTracker;
                                                                    block165: {
                                                                        block164: {
                                                                            block158: {
                                                                                float f;
                                                                                ContextualEventDispatcher contextualEventDispatcher2;
                                                                                int n10;
                                                                                block163: {
                                                                                    block162: {
                                                                                        float f22;
                                                                                        float f3;
                                                                                        Object object3;
                                                                                        block161: {
                                                                                            Object object4;
                                                                                            block191: {
                                                                                                block159: {
                                                                                                    block160: {
                                                                                                        Object object5;
                                                                                                        NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                                                                                                        block157: {
                                                                                                            block156: {
                                                                                                                block155: {
                                                                                                                    boolean bl6;
                                                                                                                    block154: {
                                                                                                                        block186: {
                                                                                                                            CompressionUtility2668 compressionUtility2668;
                                                                                                                            block151: {
                                                                                                                                float f4;
                                                                                                                                boolean bl7;
                                                                                                                                boolean bl8;
                                                                                                                                boolean bl9;
                                                                                                                                boolean bl10;
                                                                                                                                block153: {
                                                                                                                                    block152: {
                                                                                                                                        block148: {
                                                                                                                                            block142: {
                                                                                                                                                float f5;
                                                                                                                                                float f6;
                                                                                                                                                block150: {
                                                                                                                                                    block149: {
                                                                                                                                                        block182: {
                                                                                                                                                            block181: {
                                                                                                                                                                Object object6;
                                                                                                                                                                Object object7;
                                                                                                                                                                Vector<MultiProtocolSessionManager> vector;
                                                                                                                                                                block145: {
                                                                                                                                                                    block178: {
                                                                                                                                                                        block177: {
                                                                                                                                                                            float f7;
                                                                                                                                                                            block143: {
                                                                                                                                                                                block144: {
                                                                                                                                                                                    block139: {
                                                                                                                                                                                        block140: {
                                                                                                                                                                                            object4 = cipherContextManager784.v();
                                                                                                                                                                                            object = ((MultimodalParameterController)object4).M();
                                                                                                                                                                                            networkPacketInterceptor1107 = cipherContextManager784.L(3.0, 0.0f, false);
                                                                                                                                                                                            try {
                                                                                                                                                                                                ((MultimodalParameterController)object4).I(networkPacketInterceptor1107);
                                                                                                                                                                                                dynamicResourceRegistry2.P.add((MultimodalParameterController)object4);
                                                                                                                                                                                                if (dynamicResourceRegistry2 == null) break block139;
                                                                                                                                                                                                if (!qh2.j()) break block140;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (Exception exception) {
                                                                                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                                                                                            }
                                                                                                                                                                                            CipherContextManager784 cipherContextManager7842 = new CipherContextManager784(qh2, systemConfigurationOrchestrator, networkProtocolNegotiator, (NumericComputationFramework)object);
                                                                                                                                                                                            boolean bl11 = this.f(qh2, systemConfigurationOrchestrator, networkProtocolNegotiator, cipherContextManager7842, dynamicResourceRegistry2);
                                                                                                                                                                                            try {
                                                                                                                                                                                                if (++n8 < 5 && bl11) break block139;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (Exception exception) {
                                                                                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                                                                                            }
                                                                                                                                                                                            bl4 = true;
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        n8 = 0;
                                                                                                                                                                                    }
                                                                                                                                                                                    object2 = null;
                                                                                                                                                                                    if (dynamicResourceRegistry2.x == null) break block148;
                                                                                                                                                                                    object2 = this.F(dynamicResourceRegistry2, systemConfigurationOrchestrator, networkProtocolNegotiator, networkConnectionOrchestrator);
                                                                                                                                                                                    if (object2 == null) break block142;
                                                                                                                                                                                    try {
                                                                                                                                                                                        block176: {
                                                                                                                                                                                            if (ya != null) break block143;
                                                                                                                                                                                            break block176;
                                                                                                                                                                                            catch (Exception exception) {
                                                                                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        if (!ConfigurationCalibrator.b.P()) break block144;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (Exception exception) {
                                                                                                                                                                                        throw ModelSimulationEngine.a(exception);
                                                                                                                                                                                    }
                                                                                                                                                                                    object5 = (CryptographicSecurityProvider)ConfigurationCalibrator.b.N();
                                                                                                                                                                                    f6 = ((CryptographicSecurityProvider)object5).P();
                                                                                                                                                                                    f7 = ((CryptographicSecurityProvider)object5).v();
                                                                                                                                                                                    break block177;
                                                                                                                                                                                }
                                                                                                                                                                                f6 = systemConfigurationOrchestrator.q();
                                                                                                                                                                                f7 = systemConfigurationOrchestrator.S();
                                                                                                                                                                                break block177;
                                                                                                                                                                            }
                                                                                                                                                                            if (ya instanceof CryptographicSecurityProvider) {
                                                                                                                                                                                f6 = ((CryptographicSecurityProvider)ya).P();
                                                                                                                                                                                f7 = ((CryptographicSecurityProvider)ya).v();
                                                                                                                                                                            } else {
                                                                                                                                                                                f6 = ya.A();
                                                                                                                                                                                f7 = ya.L();
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        boolean bl12 = this.B((MultiProtocolSessionManager)object2, cipherContextManager784);
                                                                                                                                                                        if (!bl12) break block148;
                                                                                                                                                                        object3 = ((MultiProtocolSessionManager)object2).h();
                                                                                                                                                                        objectLifecycleTracker = ReflectionUtilityBroker.Y((N9)object3);
                                                                                                                                                                        hashMap.put(object3, networkProtocolNegotiator.T((ReflectionUtilityBroker)objectLifecycleTracker));
                                                                                                                                                                        PatternMatchingOrchestrator.O(networkProtocolNegotiator, (ReflectionUtilityBroker)objectLifecycleTracker, networkConnectionOrchestrator);
                                                                                                                                                                        if (dynamicResourceRegistry2.x == null) break block148;
                                                                                                                                                                        object2 = null;
                                                                                                                                                                        DistributedResourceOrchestrator distributedResourceOrchestrator = dynamicResourceRegistry2.x;
                                                                                                                                                                        vector = distributedResourceOrchestrator.N;
                                                                                                                                                                        try {
                                                                                                                                                                            if (!vector.isEmpty()) {
                                                                                                                                                                                vector.removeElementAt(0);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        catch (Exception exception) {
                                                                                                                                                                            throw ModelSimulationEngine.a(exception);
                                                                                                                                                                        }
                                                                                                                                                                        if (!vector.isEmpty()) break block145;
                                                                                                                                                                        if (n3 <= 3) break block145;
                                                                                                                                                                        break block178;
                                                                                                                                                                        catch (Exception exception) {
                                                                                                                                                                            throw ModelSimulationEngine.a(exception);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        block179: {
                                                                                                                                                                            if (this.F) break block145;
                                                                                                                                                                            break block179;
                                                                                                                                                                            catch (Exception exception) {
                                                                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        if (this.V8.y) break block145;
                                                                                                                                                                    }
                                                                                                                                                                    catch (Exception exception) {
                                                                                                                                                                        throw ModelSimulationEngine.a(exception);
                                                                                                                                                                    }
                                                                                                                                                                    object7 = new CipherContextManager784(qh2, systemConfigurationOrchestrator, networkProtocolNegotiator, (NumericComputationFramework)object);
                                                                                                                                                                    if (!this.f(qh2, systemConfigurationOrchestrator, networkProtocolNegotiator, (CipherContextManager784)object7, dynamicResourceRegistry2)) break block145;
                                                                                                                                                                    object6 = ((CipherContextManager784)object7).a();
                                                                                                                                                                    int n11 = AdaptiveComputationEngine.Q(((CryptographicTransformer)object6).F());
                                                                                                                                                                    int n12 = AdaptiveComputationEngine.Q(((CryptographicTransformer)object6).B());
                                                                                                                                                                    int n13 = n11 - dynamicResourceRegistry2.m.z();
                                                                                                                                                                    int n14 = n12 - dynamicResourceRegistry2.m.A();
                                                                                                                                                                    if (Math.abs(n13) + Math.abs(n14) >= 3) break block145;
                                                                                                                                                                    CompressionUtility compressionUtility = dynamicResourceRegistry2.m;
                                                                                                                                                                    CompressionUtility compressionUtility2 = new CompressionUtility(n11, dynamicResourceRegistry2.m.h(), n12);
                                                                                                                                                                    DynamicResourceRegistry dynamicResourceRegistry3 = new DynamicResourceRegistry(compressionUtility, compressionUtility2, new ArrayList<kg>());
                                                                                                                                                                    this.p(dynamicResourceRegistry3, 3, systemConfigurationOrchestrator, networkProtocolNegotiator, new ArrayList<kg>());
                                                                                                                                                                    if (dynamicResourceRegistry3.x == null) break block145;
                                                                                                                                                                    try {
                                                                                                                                                                        block180: {
                                                                                                                                                                            if (dynamicResourceRegistry3.x.N == null) break block145;
                                                                                                                                                                            break block180;
                                                                                                                                                                            catch (Exception exception) {
                                                                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        if (dynamicResourceRegistry3.x.N.isEmpty()) break block145;
                                                                                                                                                                    }
                                                                                                                                                                    catch (Exception exception) {
                                                                                                                                                                        throw ModelSimulationEngine.a(exception);
                                                                                                                                                                    }
                                                                                                                                                                    vector.addAll(dynamicResourceRegistry3.x.N);
                                                                                                                                                                    dynamicResourceRegistry.x.w(dynamicResourceRegistry3.x.N);
                                                                                                                                                                    dynamicResourceRegistry.m = dynamicResourceRegistry3.m;
                                                                                                                                                                    bl5 = true;
                                                                                                                                                                }
                                                                                                                                                                while (!vector.isEmpty()) {
                                                                                                                                                                    block146: {
                                                                                                                                                                        block147: {
                                                                                                                                                                            object7 = vector.firstElement();
                                                                                                                                                                            if (object7 == null) continue;
                                                                                                                                                                            object6 = ((MultiProtocolSessionManager)object7).h();
                                                                                                                                                                            TransactionCorrelationEngine transactionCorrelationEngine = networkProtocolNegotiator.N(((N9)object6).x(), ((N9)object6).J(), ((N9)object6).b());
                                                                                                                                                                            try {
                                                                                                                                                                                if (!PatternMatchingOrchestrator.a(transactionCorrelationEngine)) break block146;
                                                                                                                                                                                if (!Zw.R(networkProtocolNegotiator, systemConfigurationOrchestrator, (N9)object6)) break block147;
                                                                                                                                                                            }
                                                                                                                                                                            catch (Exception exception) {
                                                                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                                                                            }
                                                                                                                                                                            object2 = object7;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        dynamicResourceRegistry2.R((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)5873, (long)(0x19D8F9F090272E7BL ^ l2)), (long)-7379780905871981298L, (long)l2)));
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    dynamicResourceRegistry2.i = null;
                                                                                                                                                                    vector.removeElementAt(0);
                                                                                                                                                                }
                                                                                                                                                                if (object2 != null) break block148;
                                                                                                                                                                if (!this.t) break block148;
                                                                                                                                                                break block181;
                                                                                                                                                                catch (Exception exception) {
                                                                                                                                                                    throw ModelSimulationEngine.a(exception);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            if (ya == null) break block148;
                                                                                                                                                            break block182;
                                                                                                                                                            catch (Exception exception) {
                                                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            block183: {
                                                                                                                                                                if (!this.L) break block149;
                                                                                                                                                                break block183;
                                                                                                                                                                catch (Exception exception) {
                                                                                                                                                                    throw ModelSimulationEngine.a(exception);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            f5 = this.Vk;
                                                                                                                                                            break block150;
                                                                                                                                                        }
                                                                                                                                                        catch (Exception exception) {
                                                                                                                                                            throw ModelSimulationEngine.a(exception);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    f5 = this.VH;
                                                                                                                                                }
                                                                                                                                                float f8 = f5;
                                                                                                                                                float f9 = Math.abs(AdaptiveComputationEngine.v(f8 - f6));
                                                                                                                                                float f10 = Math.abs(f9) / 1.8f / 3.0f;
                                                                                                                                                ya.L(f10);
                                                                                                                                                ya.v(f8, ya.G());
                                                                                                                                                break block148;
                                                                                                                                            }
                                                                                                                                            if (dynamicResourceRegistry2.x == null) break block148;
                                                                                                                                            try {
                                                                                                                                                if (dynamicResourceRegistry2.m() <= n) break block148;
                                                                                                                                                break;
                                                                                                                                                catch (Exception exception) {
                                                                                                                                                    throw ModelSimulationEngine.a(exception);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            catch (Exception exception) {
                                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        bl6 = qh2.j();
                                                                                                                                        compressionUtility2668 = null;
                                                                                                                                        try {
                                                                                                                                            if (ya == null || ya instanceof CryptographicSecurityProvider) break block151;
                                                                                                                                        }
                                                                                                                                        catch (Exception exception) {
                                                                                                                                            throw ModelSimulationEngine.a(exception);
                                                                                                                                        }
                                                                                                                                        bl10 = this.V8.O;
                                                                                                                                        bl9 = this.V8.B;
                                                                                                                                        bl8 = this.V8.P;
                                                                                                                                        bl7 = this.V8.F;
                                                                                                                                        if (!this.L) break block152;
                                                                                                                                        try {
                                                                                                                                            block184: {
                                                                                                                                                if (!bl3) break block152;
                                                                                                                                                break block184;
                                                                                                                                                catch (Exception exception) {
                                                                                                                                                    throw ModelSimulationEngine.a(exception);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            f4 = this.Vk;
                                                                                                                                            break block153;
                                                                                                                                        }
                                                                                                                                        catch (Exception exception) {
                                                                                                                                            throw ModelSimulationEngine.a(exception);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    f4 = this.VH;
                                                                                                                                }
                                                                                                                                float f11 = f4;
                                                                                                                                compressionUtility2668 = this.T(qh2, f11, bl10, bl9, bl8, bl7);
                                                                                                                                try {
                                                                                                                                    if (compressionUtility2668 != null) {
                                                                                                                                        cipherContextManager784.r(compressionUtility2668.V, compressionUtility2668.W, compressionUtility2668.d, compressionUtility2668.n);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                catch (Exception exception) {
                                                                                                                                    throw ModelSimulationEngine.a(exception);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                cipherContextManager784.u(false);
                                                                                                                                if (compressionUtility2668 != null) {
                                                                                                                                    cipherContextManager784.r(compressionUtility2668.T, compressionUtility2668.i, compressionUtility2668.P, compressionUtility2668.k);
                                                                                                                                    ((NumericComputationFramework)object).O = compressionUtility2668.T;
                                                                                                                                    ((NumericComputationFramework)object).B = compressionUtility2668.i;
                                                                                                                                    ((NumericComputationFramework)object).P = compressionUtility2668.P;
                                                                                                                                    ((NumericComputationFramework)object).F = compressionUtility2668.k;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            catch (Exception exception) {
                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                            }
                                                                                                                            if (bl6) break block154;
                                                                                                                            try {
                                                                                                                                block185: {
                                                                                                                                    if (!qh2.j()) break block154;
                                                                                                                                    break block185;
                                                                                                                                    catch (Exception exception) {
                                                                                                                                        throw ModelSimulationEngine.a(exception);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (AdaptiveComputationEngine.Q(qh2.V()) < dynamicResourceRegistry2.m.h() + 1) break block155;
                                                                                                                            }
                                                                                                                            catch (Exception exception) {
                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                            }
                                                                                                                            bl = true;
                                                                                                                            if (!this.t) break block186;
                                                                                                                            try {
                                                                                                                                block187: {
                                                                                                                                    if (!this.L) break block155;
                                                                                                                                    break block187;
                                                                                                                                    catch (Exception exception) {
                                                                                                                                        throw ModelSimulationEngine.a(exception);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (!this.V8.y) break block155;
                                                                                                                            }
                                                                                                                            catch (Exception exception) {
                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        bl4 = true;
                                                                                                                        break block155;
                                                                                                                    }
                                                                                                                    if (!bl6) break block155;
                                                                                                                    try {
                                                                                                                        block188: {
                                                                                                                            if (qh2.j()) break block155;
                                                                                                                            break block188;
                                                                                                                            catch (Exception exception) {
                                                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (!bl5) break block155;
                                                                                                                    }
                                                                                                                    catch (Exception exception) {
                                                                                                                        throw ModelSimulationEngine.a(exception);
                                                                                                                    }
                                                                                                                    bl4 = false;
                                                                                                                }
                                                                                                                if (!this.L) break block157;
                                                                                                                try {
                                                                                                                    block189: {
                                                                                                                        --n9;
                                                                                                                        if (qh2.j()) break block156;
                                                                                                                        break block189;
                                                                                                                        catch (Exception exception) {
                                                                                                                            throw ModelSimulationEngine.a(exception);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (n9 != 0) break block157;
                                                                                                                }
                                                                                                                catch (Exception exception) {
                                                                                                                    throw ModelSimulationEngine.a(exception);
                                                                                                                }
                                                                                                            }
                                                                                                            bl3 = true;
                                                                                                        }
                                                                                                        object5 = cipherContextManager784.v();
                                                                                                        object3 = ((MultimodalParameterController)object4).M();
                                                                                                        ((MultimodalParameterController)object5).I(networkPacketInterceptor1107);
                                                                                                        if (object2 == null) break block158;
                                                                                                        try {
                                                                                                            block190: {
                                                                                                                if (ya != null) break block159;
                                                                                                                break block190;
                                                                                                                catch (Exception exception) {
                                                                                                                    throw ModelSimulationEngine.a(exception);
                                                                                                                }
                                                                                                            }
                                                                                                            if (!ConfigurationCalibrator.b.P()) break block160;
                                                                                                        }
                                                                                                        catch (Exception exception) {
                                                                                                            throw ModelSimulationEngine.a(exception);
                                                                                                        }
                                                                                                        CryptographicSecurityProvider cryptographicSecurityProvider = (CryptographicSecurityProvider)ConfigurationCalibrator.b.N();
                                                                                                        f3 = cryptographicSecurityProvider.P();
                                                                                                        f22 = cryptographicSecurityProvider.v();
                                                                                                        break block191;
                                                                                                    }
                                                                                                    f3 = systemConfigurationOrchestrator.q();
                                                                                                    f22 = systemConfigurationOrchestrator.S();
                                                                                                    break block191;
                                                                                                }
                                                                                                if (ya instanceof CryptographicSecurityProvider) {
                                                                                                    f3 = ((CryptographicSecurityProvider)ya).P();
                                                                                                    f22 = ((CryptographicSecurityProvider)ya).v();
                                                                                                } else {
                                                                                                    f3 = ya.A();
                                                                                                    f22 = ya.L();
                                                                                                }
                                                                                            }
                                                                                            if (object2 == null) break block161;
                                                                                            try {
                                                                                                block192: {
                                                                                                    if (((MultiProtocolSessionManager)object2).Q == null) break block161;
                                                                                                    break block192;
                                                                                                    catch (Exception exception) {
                                                                                                        throw ModelSimulationEngine.a(exception);
                                                                                                    }
                                                                                                }
                                                                                                ((MultimodalParameterController)object4).e(((MultiProtocolSessionManager)object2).Q.N());
                                                                                                ((MultimodalParameterController)object4).j(dynamicResourceRegistry2.i.N());
                                                                                            }
                                                                                            catch (Exception exception) {
                                                                                                throw ModelSimulationEngine.a(exception);
                                                                                            }
                                                                                        }
                                                                                        n10 = this.q(dynamicResourceRegistry2, (MultiProtocolSessionManager)object2, qh2, systemConfigurationOrchestrator, networkProtocolNegotiator, f3, f22, (NumericComputationFramework)object3);
                                                                                        contextualEventDispatcher2 = dynamicResourceRegistry2.i;
                                                                                        if (!this.L) break block162;
                                                                                        try {
                                                                                            block193: {
                                                                                                if (!bl3) break block162;
                                                                                                break block193;
                                                                                                catch (Exception exception) {
                                                                                                    throw ModelSimulationEngine.a(exception);
                                                                                                }
                                                                                            }
                                                                                            f = this.Vk;
                                                                                            break block163;
                                                                                        }
                                                                                        catch (Exception exception) {
                                                                                            throw ModelSimulationEngine.a(exception);
                                                                                        }
                                                                                    }
                                                                                    f = this.VH;
                                                                                }
                                                                                float f12 = f;
                                                                                ya = this.T(qh2, contextualEventDispatcher2, ((MultiProtocolSessionManager)object2).Q, ya, n10, f12);
                                                                                cipherContextManager784.w(ya);
                                                                            }
                                                                            cipherContextManager784.k();
                                                                            if (!this.t) break block164;
                                                                            try {
                                                                                block194: {
                                                                                    if (this.L) break block164;
                                                                                    break block194;
                                                                                    catch (Exception exception) {
                                                                                        throw ModelSimulationEngine.a(exception);
                                                                                    }
                                                                                }
                                                                                cipherContextManager784.y();
                                                                            }
                                                                            catch (Exception exception) {
                                                                                throw ModelSimulationEngine.a(exception);
                                                                            }
                                                                        }
                                                                        try {
                                                                            dynamicResourceRegistry2.M.add(cipherContextManager784.G());
                                                                            if (!(cipherContextManager784.a().V() <= (double)n5)) break block165;
                                                                            dynamicResourceRegistry2.R((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)11808, (long)(0x64FE3B8C4E6296D9L ^ l2)), (long)-7379780905871981298L, (long)l2)));
                                                                            this.M((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)24120, (long)(0x2775556912E3E696L ^ l2)), (long)-7379780905871981298L, (long)l2)) + i);
                                                                            break;
                                                                        }
                                                                        catch (Exception exception) {
                                                                            throw ModelSimulationEngine.a(exception);
                                                                        }
                                                                    }
                                                                    if (object2 != null) {
                                                                        objectLifecycleTracker = PatternMatchingOrchestrator.y(networkProtocolNegotiator, ((MultiProtocolSessionManager)object2).h());
                                                                        double d2 = ((oQ)objectLifecycleTracker).F();
                                                                        double d3 = ((oQ)objectLifecycleTracker).f();
                                                                        double d4 = ((oQ)objectLifecycleTracker).v();
                                                                        double d5 = ((oQ)objectLifecycleTracker).R();
                                                                        double d6 = ((oQ)objectLifecycleTracker).c();
                                                                        double d7 = ((oQ)objectLifecycleTracker).P();
                                                                    }
                                                                    if (!(qh2.V() < (double)(dynamicResourceRegistry2.m.h() - 1))) break block166;
                                                                    if (!(qh2.V() < (double)(dynamicResourceRegistry2.N.h() - 1))) break block166;
                                                                    break block195;
                                                                    catch (Exception exception) {
                                                                        throw ModelSimulationEngine.a(exception);
                                                                    }
                                                                }
                                                                if (!bl) break block167;
                                                                break block196;
                                                                catch (Exception exception) {
                                                                    throw ModelSimulationEngine.a(exception);
                                                                }
                                                            }
                                                            try {
                                                                block197: {
                                                                    if (qh2.j()) break block167;
                                                                    break block197;
                                                                    catch (Exception exception) {
                                                                        throw ModelSimulationEngine.a(exception);
                                                                    }
                                                                }
                                                                dynamicResourceRegistry2.R((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)10905, (long)(0x5ED65419DC55922DL ^ l2)), (long)-7379780905871981298L, (long)l2)));
                                                                break block168;
                                                            }
                                                            catch (Exception exception) {
                                                                throw ModelSimulationEngine.a(exception);
                                                            }
                                                        }
                                                        dynamicResourceRegistry2.R((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)29735, (long)(0x4BFB18F55CDFCCF2L ^ l2)), (long)-7379780905871981298L, (long)l2)));
                                                    }
                                                    this.M((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)17669, (long)(0x5A16D5753B197DDCL ^ l2)), (long)-7379780905871981298L, (long)l2)) + i + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)30373, (long)(0x441EA3A536564E5AL ^ l2)), (long)-7379780905871981298L, (long)l2)) + bl);
                                                    break;
                                                }
                                                if (!((double)dynamicResourceRegistry.m.h() > ((oQ)qh2.L()).c())) break block169;
                                                if (!((double)dynamicResourceRegistry.N.h() > ((oQ)qh2.L()).c())) break block169;
                                                break block198;
                                                catch (Exception exception) {
                                                    throw ModelSimulationEngine.a(exception);
                                                }
                                            }
                                            if (!bl) break block170;
                                            break block199;
                                            catch (Exception exception) {
                                                throw ModelSimulationEngine.a(exception);
                                            }
                                        }
                                        try {
                                            block200: {
                                                if (qh2.j()) break block170;
                                                break block200;
                                                catch (Exception exception) {
                                                    throw ModelSimulationEngine.a(exception);
                                                }
                                            }
                                            dynamicResourceRegistry2.R((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)7753, (long)(0x247AB253906DA6C2L ^ l2)), (long)-7379780905871981298L, (long)l2)));
                                            break block171;
                                        }
                                        catch (Exception exception) {
                                            throw ModelSimulationEngine.a(exception);
                                        }
                                    }
                                    dynamicResourceRegistry2.R((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)30390, (long)(0xF3AD7C2138CCE7BL ^ l2)), (long)-7379780905871981298L, (long)l2)));
                                }
                                this.M((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)32294, (long)(0x553EDCA7CAD246A2L ^ l2)), (long)-7379780905871981298L, (long)l2)) + i + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)16061, (long)(0x5C452F5492550676L ^ l2)), (long)-7379780905871981298L, (long)l2)) + bl);
                                break;
                            }
                            if (object2 != null) continue;
                            if (dynamicResourceRegistry2.x != null) continue;
                            break block201;
                            catch (Exception exception) {
                                throw ModelSimulationEngine.a(exception);
                            }
                        }
                        try {
                            if (!bl4) continue;
                            break;
                            catch (Exception exception) {
                                throw ModelSimulationEngine.a(exception);
                            }
                        }
                        catch (Exception exception) {
                            throw ModelSimulationEngine.a(exception);
                        }
                    }
                }
                catch (Exception exception) {
                    TemporalMetadataResolver.W(exception);
                }
                for (Object object4 : hashMap.entrySet()) {
                    object = ReflectionUtilityBroker.Y((N9)object4.getKey());
                    long l3 = System.nanoTime();
                    PatternMatchingOrchestrator.O(networkProtocolNegotiator, (ReflectionUtilityBroker)object, (NetworkConnectionOrchestrator)object4.getValue());
                }
                try {
                    block173: {
                        try {
                            try {
                                dynamicResourceRegistry.P.addAll(dynamicResourceRegistry2.P);
                                if (!bl) break block172;
                                if (qh2.j()) break block173;
                            }
                            catch (Exception exception) {
                                throw ModelSimulationEngine.a(exception);
                            }
                            if (!bl4) break block172;
                        }
                        catch (Exception exception) {
                            throw ModelSimulationEngine.a(exception);
                        }
                    }
                    dynamicResourceRegistry.M.clear();
                    dynamicResourceRegistry.M.addAll(dynamicResourceRegistry2.M);
                    return dynamicResourceRegistry;
                }
                catch (Exception exception) {
                    throw ModelSimulationEngine.a(exception);
                }
            }
            try {
                n4 = dynamicResourceRegistry2.x != null ? dynamicResourceRegistry2.x.N.size() : -1;
            }
            catch (Exception exception) {
                throw ModelSimulationEngine.a(exception);
            }
            n2 = n4;
            try {
                if (dynamicResourceRegistry2.d()) {
                    dynamicResourceRegistry.E = dynamicResourceRegistry2.E;
                    return dynamicResourceRegistry;
                }
            }
            catch (Exception exception) {
                throw ModelSimulationEngine.a(exception);
            }
            try {
                try {
                    if (dynamicResourceRegistry2.d() || n2 <= 0) break block174;
                }
                catch (Exception exception) {
                    throw ModelSimulationEngine.a(exception);
                }
                dynamicResourceRegistry.E = dynamicResourceRegistry2.E;
                return dynamicResourceRegistry;
            }
            catch (Exception exception) {
                throw ModelSimulationEngine.a(exception);
            }
        }
        double d8 = (double)(System.nanoTime() - l) / 1000000.0;
        this.M((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)20907, (long)(0x3CBBDFCDFCBAE962L ^ l2)), (long)-7379780905871981298L, (long)l2)) + n + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)3051, (long)(0x2F5C404D08313313L ^ l2)), (long)-7379780905871981298L, (long)l2)) + d8 + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)9798, (long)(0x318215E0708C1E9DL ^ l2)), (long)-7379780905871981298L, (long)l2)) + n2 + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)32433, (long)(0x795703EBEEBB4634L ^ l2)), (long)-7379780905871981298L, (long)l2)) + n3 + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)32641, (long)(0x2974EDF931724737L ^ l2)), (long)-7379780905871981298L, (long)l2)));
        return null;
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

    private boolean x() {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (this.VE == null || this.VE.x == null) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        if (this.VE.x.N.isEmpty()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Exception a(Exception exception) {
        return exception;
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
                n3 = 42;
                break;
            }
            case 1: {
                n3 = 11;
                break;
            }
            case 2: {
                n3 = 2;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 61;
                break;
            }
            case 5: {
                n3 = 26;
                break;
            }
            case 6: {
                n3 = 5;
                break;
            }
            case 7: {
                n3 = 52;
                break;
            }
            case 8: {
                n3 = 10;
                break;
            }
            case 9: {
                n3 = 14;
                break;
            }
            case 10: {
                n3 = 58;
                break;
            }
            case 11: {
                n3 = 35;
                break;
            }
            case 12: {
                n3 = 3;
                break;
            }
            case 13: {
                n3 = 46;
                break;
            }
            case 14: {
                n3 = 62;
                break;
            }
            case 15: {
                n3 = 54;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 30;
                break;
            }
            case 18: {
                n3 = 1;
                break;
            }
            case 19: {
                n3 = 44;
                break;
            }
            case 20: {
                n3 = 28;
                break;
            }
            case 21: {
                n3 = 57;
                break;
            }
            case 22: {
                n3 = 0;
                break;
            }
            case 23: {
                n3 = 29;
                break;
            }
            case 24: {
                n3 = 15;
                break;
            }
            case 25: {
                n3 = 38;
                break;
            }
            case 26: {
                n3 = 45;
                break;
            }
            case 27: {
                n3 = 32;
                break;
            }
            case 28: {
                n3 = 8;
                break;
            }
            case 29: {
                n3 = 50;
                break;
            }
            case 30: {
                n3 = 20;
                break;
            }
            case 31: {
                n3 = 47;
                break;
            }
            case 32: {
                n3 = 7;
                break;
            }
            case 33: {
                n3 = 25;
                break;
            }
            case 34: {
                n3 = 53;
                break;
            }
            case 35: {
                n3 = 17;
                break;
            }
            case 36: {
                n3 = 23;
                break;
            }
            case 37: {
                n3 = 55;
                break;
            }
            case 38: {
                n3 = 12;
                break;
            }
            case 39: {
                n3 = 36;
                break;
            }
            case 40: {
                n3 = 41;
                break;
            }
            case 41: {
                n3 = 6;
                break;
            }
            case 42: {
                n3 = 40;
                break;
            }
            case 43: {
                n3 = 21;
                break;
            }
            case 44: {
                n3 = 56;
                break;
            }
            case 45: {
                n3 = 34;
                break;
            }
            case 46: {
                n3 = 60;
                break;
            }
            case 47: {
                n3 = 19;
                break;
            }
            case 48: {
                n3 = 63;
                break;
            }
            case 49: {
                n3 = 31;
                break;
            }
            case 50: {
                n3 = 16;
                break;
            }
            case 51: {
                n3 = 51;
                break;
            }
            case 52: {
                n3 = 59;
                break;
            }
            case 53: {
                n3 = 27;
                break;
            }
            case 54: {
                n3 = 9;
                break;
            }
            case 55: {
                n3 = 48;
                break;
            }
            case 56: {
                n3 = 18;
                break;
            }
            case 57: {
                n3 = 43;
                break;
            }
            case 58: {
                n3 = 13;
                break;
            }
            case 59: {
                n3 = 33;
                break;
            }
            case 60: {
                n3 = 24;
                break;
            }
            case 61: {
                n3 = 49;
                break;
            }
            case 62: {
                n3 = 39;
                break;
            }
            default: {
                n3 = 4;
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
        ModelSimulationEngine.lb[n4] = new String(cArray);
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ModelSimulationEngine.bb = MultiContainerRegistry.a(-1749111606660855601L, -3141171352576800471L, MethodHandles.lookup().lookupClass()).a(182736240087658L);
                ModelSimulationEngine.kb = new Object[11];
                ModelSimulationEngine.lb = new String[11];
                ModelSimulationEngine.d();
                ModelSimulationEngine.hb = new HashMap<K, V>(13);
                var0 = ModelSimulationEngine.bb ^ 1669676633470L;
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
                var8_3 = new long[110];
                var5_4 = 0;
                var6_5 = "\u00e7\u00a6\u00e6\u00a0K\u00f3\u0089P\u0011cb\u00b9\u00bc$\u0096\u008d\u0001\u0086\u00bey37\u00e23\u0000\u00d4049\u0019\u009e\u00fb\u00b0\u0001a\u001e\u00df5\u0087\u00cad)z\u00d5W\u000e\u00b1t\u009b\u00b2\u00073\u00beM_\u00ad\u00a3\u00e5\u00b2\u00a2\u00fa~\u00e7^\u00ab,\u00d1\u00c3\u00db[\u0084,\u0018\u00bb\u0091\u00816mQ\u001e\u00e8A\u00be\u0089\u0000\u00a7\u00cb/]\u00aeU\u00e6`;zw\u0094\u00ee\u009d\b96`:\u00eb\u00e8c\u001a\u0093\u00e3[\u0007[\u00fc\u00f1\u00ce*f\u00153\u0018-\u00a0\u008e_\u00a0\u00f1k\u00c7~/~\u00e83\u00f0\u00f5U>YUz\b\f\u0085\u00bb\u00cb&}\u00f3+\u00c5nk\u008c4\u00b1\u00d3\u001c\u00d8\u0019]\u0003\u00e0f\u009dn\u000e&\u00bf\u00a31\u00fa\u009e\u00d0\u0097\u00be\u0099\u0081\u0012u\u0087\u00c3X]\u00d5O\u00d2\u00a8\u00fe\u00dew\u0017\u001fw\u0093\u00b0$Z\u00c6\u0083\r5DoN\u00ae\u00cfIp\u008b\u001cb\u0096\u00b9\u00e7\u00c0G\u00a1\u000b\u00d6\u00cf\u001b\u00ddJy\u0013\u0015S\u00ee\u0015\u0081:\u00eb\u00f1\u00a7\n\u00f2\u00a8\u0097\u00a5\u0092\u0006\u009f\u0093\u0094\u00971\u00a6\u00a6QVl\u00e3N\u00e9\\\u00d40J\u00d4\u0013\u0010,\u0019P\u00cc\u009b\u00cd\u00d2V\u00e8\u00f2\u00f4,>N,\u00ae\u009c[\u0082)\bh0\u0004\u00bfM\u00df:s\u008a~\"\u009f\u00ad\u00f8\u00a7\u00cc\u00b3\u008b\u0018\u009d\u00c6\u00b4\u00bd4\u0018\u0080\u0093ZR\u00fa\u00ed\u009a\u00889\u00f4;\u00ab\u00a9\u001b\u0089\u00f3\u001cs\u00c8\u00f1 \u00d9\tS\\l^\u00c9(r\u0004j\u0096\u0099\u00e77\u0084]\u0093\u0090p\u00ca\u00d2\u008f\u0094\u00af\u00b7\u008ez\u00c4\u00f6\u00d7\u0095\u0016\u0098\u0088]\u001c\u0095\u00c0\u0016\u00bc2\u00e6?\u0005\u00edY\u009b \u0007y78)o\u00a4W\u001f\u00c4\u0084\u00b6\u00bf\u00db6\u00af\u00f4\u00ack}\u0002p\u00c0-\u00d5\u00e5&b\u00e9\u00ca\u00c0,?\u009f\u0007\u00c3\u007fx\u0019:\u0007\u00d2\u0015\u00fa\nR\u0081\u001c\u00e4\u00ea~\u001d\u0084\u00d9\u00867\u00fdh\u00b5C0\u00d0\u0002\u0084z\u00d1\u00a0\u00d1\u001e\u00d2\u008a\u0086\u008d\n\u00adm\u0001!\u00e3d3&;\u007f8\u007f\u00cd+\u00bd'\u00e5Z_\u0010\u009dZ\u00d5\u0084\u0016\u00cf\u00fb4A\u00a7O\u00b7<t\u0016\u00fe\u0005\u00a4\f9\u00da\u00e4\u0000\u00c3\u009c\u00c8\u0016\u00dff\u00e1z\u0098\u00a4\u0016<2v{\u00ed\u00fc\u00bb\u00ac\u0081}\u009aU6\u00e4\u0011\u00a20w]oub\u0082\u00a7\u00a3\u0094e\u0018s\u0000^\u00e2\u00cbA\u00e6\u00df\u009aV)tq\u0016\u0088jZ\u0094'\u0000\u00e1\u001aQ\u001a\u0005\u0012\u00d2\\\u000e\u0000\u00bee\u00a2\u00d3\u0085\u00cf\u0017\u00c3\u00fa\u00fe\u0000\u00b4\u00bf.M\u00b2Q\u00ec\u008a\u00c6\u008b\u008c`}\u00f0C\f\u00f2\u0098\u0098\u00036AA9\u00cc~\u00ea |?q\u0083V2E\u00c3\u0012'\u0006@\u001fZ\u00a8\f\u001a\u00bd\u00c6n\u00ef\u00f6\u00ae\u00ec\u00fa\u00c5\u00b9Q?\u00c6\u00d2\u00f2\u00d0\r\u00e1{q\u0096\u00c3w\u00d3\u00d5\u00d68?\u00cb\u001f\u00e9\u001e\u00fc\u00ae\u00aa\u001a\u0012\u001fTa\u00e8M)\u00ceu\u0002\u0091?\u00c9\u00cb\u00b0\u00c7\u0000\u00d98\u0017&Q\u001b\u00c4\u0092\u008f\u00fcq\u00b6\u0007u\u00ee\u00a6W\u00b7\u00a3+\u0010_\u00be\u00bc\u00e5\u00d2\u00c6_\u000bp\u00ba\u00dd\u0097W\u0017/n\u00efXhp\u00b8\b\u00bb\u00e3d=]$\u008a\\\u0006W\u0003\u00cd\u00a9\u00c4\u00c8h\u008d\u00ba\u00ef\u0080J\u00beq\u00d2\u0095\u00de\u00e2\u0003F\u00a1\u0087XQ\u00bf\u00eaK\u00e4\u00bfi\u0002\u00c4\u0086>\u00f1\u00d1R\u00d7,\u0086(\u0080\u00b9\u0018\u00da\u00fdR\u008f\u00b8\u008d\u00b4\u009e8}u0\u00e9\u00ccA\u00a4s\u00b0T\u00eb\u0001\u0018\u009e\u00c9\u00dd6\u0099\u00d5RO\u0094\u000b g\u0088\u00f0D\u00b0\u00d5\u00aa\u00e4?\\2\u00da\u0089\u008b\u00fd\u00cd\u00bc\u00c2C\u008a\r5\u0005\u0084K\u00da:\u00cd\u008d~\u00e6\u00150\n:1&\u0086\u00db-\u00f9\u00c4\u00d0\u00ed\u00ef\u00c1\u0093\u00f1\u00b7?ZZR\f?\u007fZ\u0013t\u00e1'\"";
                var7_6 = "\u00e7\u00a6\u00e6\u00a0K\u00f3\u0089P\u0011cb\u00b9\u00bc$\u0096\u008d\u0001\u0086\u00bey37\u00e23\u0000\u00d4049\u0019\u009e\u00fb\u00b0\u0001a\u001e\u00df5\u0087\u00cad)z\u00d5W\u000e\u00b1t\u009b\u00b2\u00073\u00beM_\u00ad\u00a3\u00e5\u00b2\u00a2\u00fa~\u00e7^\u00ab,\u00d1\u00c3\u00db[\u0084,\u0018\u00bb\u0091\u00816mQ\u001e\u00e8A\u00be\u0089\u0000\u00a7\u00cb/]\u00aeU\u00e6`;zw\u0094\u00ee\u009d\b96`:\u00eb\u00e8c\u001a\u0093\u00e3[\u0007[\u00fc\u00f1\u00ce*f\u00153\u0018-\u00a0\u008e_\u00a0\u00f1k\u00c7~/~\u00e83\u00f0\u00f5U>YUz\b\f\u0085\u00bb\u00cb&}\u00f3+\u00c5nk\u008c4\u00b1\u00d3\u001c\u00d8\u0019]\u0003\u00e0f\u009dn\u000e&\u00bf\u00a31\u00fa\u009e\u00d0\u0097\u00be\u0099\u0081\u0012u\u0087\u00c3X]\u00d5O\u00d2\u00a8\u00fe\u00dew\u0017\u001fw\u0093\u00b0$Z\u00c6\u0083\r5DoN\u00ae\u00cfIp\u008b\u001cb\u0096\u00b9\u00e7\u00c0G\u00a1\u000b\u00d6\u00cf\u001b\u00ddJy\u0013\u0015S\u00ee\u0015\u0081:\u00eb\u00f1\u00a7\n\u00f2\u00a8\u0097\u00a5\u0092\u0006\u009f\u0093\u0094\u00971\u00a6\u00a6QVl\u00e3N\u00e9\\\u00d40J\u00d4\u0013\u0010,\u0019P\u00cc\u009b\u00cd\u00d2V\u00e8\u00f2\u00f4,>N,\u00ae\u009c[\u0082)\bh0\u0004\u00bfM\u00df:s\u008a~\"\u009f\u00ad\u00f8\u00a7\u00cc\u00b3\u008b\u0018\u009d\u00c6\u00b4\u00bd4\u0018\u0080\u0093ZR\u00fa\u00ed\u009a\u00889\u00f4;\u00ab\u00a9\u001b\u0089\u00f3\u001cs\u00c8\u00f1 \u00d9\tS\\l^\u00c9(r\u0004j\u0096\u0099\u00e77\u0084]\u0093\u0090p\u00ca\u00d2\u008f\u0094\u00af\u00b7\u008ez\u00c4\u00f6\u00d7\u0095\u0016\u0098\u0088]\u001c\u0095\u00c0\u0016\u00bc2\u00e6?\u0005\u00edY\u009b \u0007y78)o\u00a4W\u001f\u00c4\u0084\u00b6\u00bf\u00db6\u00af\u00f4\u00ack}\u0002p\u00c0-\u00d5\u00e5&b\u00e9\u00ca\u00c0,?\u009f\u0007\u00c3\u007fx\u0019:\u0007\u00d2\u0015\u00fa\nR\u0081\u001c\u00e4\u00ea~\u001d\u0084\u00d9\u00867\u00fdh\u00b5C0\u00d0\u0002\u0084z\u00d1\u00a0\u00d1\u001e\u00d2\u008a\u0086\u008d\n\u00adm\u0001!\u00e3d3&;\u007f8\u007f\u00cd+\u00bd'\u00e5Z_\u0010\u009dZ\u00d5\u0084\u0016\u00cf\u00fb4A\u00a7O\u00b7<t\u0016\u00fe\u0005\u00a4\f9\u00da\u00e4\u0000\u00c3\u009c\u00c8\u0016\u00dff\u00e1z\u0098\u00a4\u0016<2v{\u00ed\u00fc\u00bb\u00ac\u0081}\u009aU6\u00e4\u0011\u00a20w]oub\u0082\u00a7\u00a3\u0094e\u0018s\u0000^\u00e2\u00cbA\u00e6\u00df\u009aV)tq\u0016\u0088jZ\u0094'\u0000\u00e1\u001aQ\u001a\u0005\u0012\u00d2\\\u000e\u0000\u00bee\u00a2\u00d3\u0085\u00cf\u0017\u00c3\u00fa\u00fe\u0000\u00b4\u00bf.M\u00b2Q\u00ec\u008a\u00c6\u008b\u008c`}\u00f0C\f\u00f2\u0098\u0098\u00036AA9\u00cc~\u00ea |?q\u0083V2E\u00c3\u0012'\u0006@\u001fZ\u00a8\f\u001a\u00bd\u00c6n\u00ef\u00f6\u00ae\u00ec\u00fa\u00c5\u00b9Q?\u00c6\u00d2\u00f2\u00d0\r\u00e1{q\u0096\u00c3w\u00d3\u00d5\u00d68?\u00cb\u001f\u00e9\u001e\u00fc\u00ae\u00aa\u001a\u0012\u001fTa\u00e8M)\u00ceu\u0002\u0091?\u00c9\u00cb\u00b0\u00c7\u0000\u00d98\u0017&Q\u001b\u00c4\u0092\u008f\u00fcq\u00b6\u0007u\u00ee\u00a6W\u00b7\u00a3+\u0010_\u00be\u00bc\u00e5\u00d2\u00c6_\u000bp\u00ba\u00dd\u0097W\u0017/n\u00efXhp\u00b8\b\u00bb\u00e3d=]$\u008a\\\u0006W\u0003\u00cd\u00a9\u00c4\u00c8h\u008d\u00ba\u00ef\u0080J\u00beq\u00d2\u0095\u00de\u00e2\u0003F\u00a1\u0087XQ\u00bf\u00eaK\u00e4\u00bfi\u0002\u00c4\u0086>\u00f1\u00d1R\u00d7,\u0086(\u0080\u00b9\u0018\u00da\u00fdR\u008f\u00b8\u008d\u00b4\u009e8}u0\u00e9\u00ccA\u00a4s\u00b0T\u00eb\u0001\u0018\u009e\u00c9\u00dd6\u0099\u00d5RO\u0094\u000b g\u0088\u00f0D\u00b0\u00d5\u00aa\u00e4?\\2\u00da\u0089\u008b\u00fd\u00cd\u00bc\u00c2C\u008a\r5\u0005\u0084K\u00da:\u00cd\u008d~\u00e6\u00150\n:1&\u0086\u00db-\u00f9\u00c4\u00d0\u00ed\u00ef\u00c1\u0093\u00f1\u00b7?ZZR\f?\u007fZ\u0013t\u00e1'\"".length();
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
                    var6_5 = "C\u00ce(2\u00b1b\u0087\u00a5\u00f7(a.Ik!\u00d8";
                    var7_6 = "C\u00ce(2\u00b1b\u0087\u00a5\u00f7(a.Ik!\u00d8".length();
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
        ModelSimulationEngine.fb = var8_3;
        ModelSimulationEngine.gb = new Integer[110];
        ModelSimulationEngine.G = new ArrayList<E>();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Af" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean s(LightweightExecutionContext lightweightExecutionContext) {
        block4: {
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
        return this.Vc.H(lightweightExecutionContext);
    }

    private boolean X(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        int n = this.g();
        try {
            if (n == -1) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        try {
            if (this.v == -1) {
                this.v = systemConfigurationOrchestrator.l().v();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        this.C(n);
        return true;
    }

    private void A(String string, String string2) {
        try {
            File file = new File(string);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(string2.getBytes());
            fileOutputStream.close();
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    static double r(ModelSimulationEngine modelSimulationEngine, double d2) {
        modelSimulationEngine.Vp = d2;
        return modelSimulationEngine.Vp;
    }

    private int M() {
        int n;
        AssetLoadBalancer assetLoadBalancer;
        block25: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block27: {
                block24: {
                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    assetLoadBalancer = systemConfigurationOrchestrator.l();
                    try {
                        try {
                            if (!assetLoadBalancer.Y() && !systemConfigurationOrchestrator.Y()) break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        return 0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                n = 0;
                try {
                    block26: {
                        try {
                            try {
                                if (!this.Vw.s().booleanValue()) break block25;
                                if (systemConfigurationOrchestrator.a().Y()) break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (!systemConfigurationOrchestrator.a().C().Y()) break block27;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    return 0;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            try {
                if (!this.s(systemConfigurationOrchestrator.a())) {
                    return 0;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            try {
                if (!this.D(systemConfigurationOrchestrator.a())) {
                    return 0;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            return systemConfigurationOrchestrator.a().J();
        }
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext lightweightExecutionContext = assetLoadBalancer.F(i);
            try {
                try {
                    if (lightweightExecutionContext.Y() || !lightweightExecutionContext.C().B(ReflectionMetadataResolver.YX)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            if (this.D(lightweightExecutionContext)) {
                n += lightweightExecutionContext.J();
                continue;
            }
            for (String string : this.e) {
                if (!lightweightExecutionContext.g().contains(string)) continue;
                n += lightweightExecutionContext.J();
            }
        }
        return n;
    }

    private void b(SystemConfigurationOrchestrator systemConfigurationOrchestrator, ExecutionStateTracker executionStateTracker, SecureEventOrchestrator secureEventOrchestrator) {
        block22: {
            block27: {
                block26: {
                    block23: {
                        block24: {
                            block25: {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (this.VE != null) break block22;
                                                if (this.VB-- < 0) break block23;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                            if (this.VB > 0) break block24;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ModelSimulationEngine.a(customSystemException);
                                        }
                                        if (!secureEventOrchestrator.Y()) break block25;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                    CryptoStreamProcessor.y(false);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                            }
                            this.VB = -1;
                            break block23;
                        }
                        CryptoStreamProcessor.g(false);
                    }
                    try {
                        try {
                            try {
                                if (!this.VL.s().booleanValue() || this.v == -1) break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (this.n-- > 0) break block26;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        this.C(this.v);
                        this.v = -1;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (this.R < 0) break block22;
                        if (this.R-- > 0) break block27;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    this.J(systemConfigurationOrchestrator);
                    break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            try {
                try {
                    if (this.VT == null || this.VT.F()) break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                this.VT.L(((Double)this.m.J()).floatValue() / (float)this.R);
                this.VT.h(true);
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
    }

    public ModelSimulationEngine() {
        long l = bb ^ 0x4CFBCDF45167L;
        super(a.cs((int)ModelSimulationEngine.a("j", (int)14798, (long)(0x50617E696055039BL ^ l))), (int)ModelSimulationEngine.a("j", (int)5228, (long)(0x1E3A556183EFAE21L ^ l)), RecursiveNodeGraph.K, a.cs((int)ModelSimulationEngine.a("j", (int)13978, (long)(0x37044C443F410CFDL ^ l))));
        this.V1 = AuthenticationStateTracker.R(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)9610, (long)(0x242C6A9B1E8A1FD5L ^ l)), (long)-7252242660454086719L, (long)l)), true, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)19219, (long)(0x1F9B0E2DCB2DF171L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.V3 = AuthenticationStateTracker.R(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)30218, (long)(0x6708EE7590E7CC45L ^ l)), (long)-7252242660454086719L, (long)l)), true, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)26756, (long)(0x1B786415343CD2C4L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.O = AuthenticationStateTracker.R(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)30757, (long)(0x68503381F287425DL ^ l)), (long)-7252242660454086719L, (long)l)), false, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)9621, (long)(0x7E7515040C729FA6L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.Vo = NumericPrecisionTransformer.N(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)2949, (long)(0x3508E3DCE04DB19CL ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)16868, (long)(0x46EC3045DB1B7BA6L ^ l)), (long)-7252242660454086719L, (long)l)), "", 3.0, 6.0, 10.0, 1.0);
        this.m = NumericPrecisionTransformer.D(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)28292, (long)(0x70A5D28588A0D4D0L ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)15734, (long)(0x4E91541C58DD874FL ^ l)), (long)-7252242660454086719L, (long)l)), "", 1.0, 3.5, 10.0, 0.1, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)22726, (long)(0x2E3895F1153E62D4L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.Ve = AuthenticationStateTracker.R(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)12874, (long)(0x1E536B1001970855L ^ l)), (long)-7252242660454086719L, (long)l)), false, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)28506, (long)(0x604DBE9ED96FD52CL ^ l)), (long)-7252242660454086719L, (long)l)));
        this.Z = AuthenticationStateTracker.R(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)16685, (long)(0x53D257D5AD7BFB7EL ^ l)), (long)-7252242660454086719L, (long)l)), true, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)15703, (long)(0x15F2AC4E9915871FL ^ l)), (long)-7252242660454086719L, (long)l)));
        this.Vl = NumericFormattingUtility.K(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)10717, (long)(0x4CC967D709AF13A7L ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)21032, (long)(0x8FD9E7B2B76685BL ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)21661, (long)(0x7B4A7F9733DCEE96L ^ l)), (long)-7252242660454086719L, (long)l)), 0.0, 3.0, 6.0, 10.0, 1.0, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)7646, (long)(0x7097A65492A827E2L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.V4 = NumericPrecisionTransformer.D(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)2309, (long)(0x2F3DB3235EE1B304L ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)9752, (long)(0x105740CAE7CF1C69L ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)32374, (long)(0x758D9693B516442FL ^ l)), (long)-7252242660454086719L, (long)l)), 0.0, 100.0, 500.0, 50.0, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)13334, (long)(0x2A8F04FBFFE78E61L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.VR = AuthenticationStateTracker.w(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)20287, (long)(0x6D34D22EABD2F530L ^ l)), (long)-7252242660454086719L, (long)l)), false);
        this.B = AuthenticationStateTracker.R(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)18463, (long)(0x4EF99E402E9724DL ^ l)), (long)-7252242660454086719L, (long)l)), false, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)6268, (long)(0x187A1679F7EAA276L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.Vi = NumericPrecisionTransformer.D(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)10834, (long)(0x384474AAF5A8104CL ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)3408, (long)(0x4D2B420A25CD3759L ^ l)), (long)-7252242660454086719L, (long)l)), "", 1.0, 5.0, 10.0, 1.0, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)2371, (long)(0x444B15B503003352L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.VL = AuthenticationStateTracker.R(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)5166, (long)(0x77F346E7B0432E35L ^ l)), (long)-7252242660454086719L, (long)l)), true, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)22138, (long)(0x7383885DB90B6C15L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.V_ = NumericFormattingUtility.K(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)26351, (long)(0x14B2DC2BA643DCB8L ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)16710, (long)(0x1AB28D97C832FB5EL ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)20064, (long)(0x476449B4FFDDF43BL ^ l)), (long)-7252242660454086719L, (long)l)), 0.0, 3.0, 6.0, 10.0, 1.0, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)9582, (long)(0x54AE962E771B1F73L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.A = AuthenticationStateTracker.R(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)11153, (long)(0x4609F83C37979199L ^ l)), (long)-7252242660454086719L, (long)l)), true, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)3546, (long)(0x26EB64041E52B7DAL ^ l)), (long)-7252242660454086719L, (long)l)));
        this.VD = NumericFormattingUtility.K(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)8338, (long)(0x157BE019D3B69ADBL ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)27817, (long)(0x2049B0F0672856D4L ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)13898, (long)(0x63B86F0052F70C4FL ^ l)), (long)-7252242660454086719L, (long)l)), 0.0, 3.0, 6.0, 10.0, 1.0, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)29860, (long)(0x151A0FD3F0514EA8L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.Vh = AuthenticationStateTracker.R(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)14687, (long)(0x7874506E05210305L ^ l)), (long)-7252242660454086719L, (long)l)), true, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)110, (long)(0x554914FDCF483A06L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.V5 = ColorPaletteManager.o(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)13509, (long)(0x616A3BEE3AE80EFDL ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)19097, (long)(0x4FD61EFD215870ACL ^ l)), (long)-7252242660454086719L, (long)l)), ColorPaletteManager.g, RecursiveNodeTreeBuilder.U);
        this.Vw = AuthenticationStateTracker.R(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)27909, (long)(0x7A9AF988AE67D77AL ^ l)), (long)-7252242660454086719L, (long)l)), false, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)8213, (long)(0x1DA46576ACC11A69L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.Vc = ColorPaletteManager.r(this, (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)30304, (long)(0x6AE7C1007995CC3EL ^ l)), (long)-7252242660454086719L, (long)l)), (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)12491, (long)(0xB4A5BD3F3D38AB9L ^ l)), (long)-7252242660454086719L, (long)l)), ColorPaletteManager.U, new RecursiveNodeTreeBuilder((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)19713, (long)(0x40492F461C247761L ^ l)), (long)-7252242660454086719L, (long)l))));
        this.e = new ArrayList<String>(Arrays.asList(ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)14775, (long)(0x1791DAE1E10583E7L ^ l)), (long)-7252242660454086719L, (long)l), ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)8839, (long)(0x4E27054E428318CBL ^ l)), (long)-7252242660454086719L, (long)l), ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)26412, (long)(0x7F829ACF255B5D2FL ^ l)), (long)-7252242660454086719L, (long)l), ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)13174, (long)(0x5024F2ABCCB50910L ^ l)), (long)-7252242660454086719L, (long)l), ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)6036, (long)(0x77802DAC88182DFAL ^ l)), (long)-7252242660454086719L, (long)l), ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)11784, (long)(0x2727BCA8A64A941FL ^ l)), (long)-7252242660454086719L, (long)l), ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)2575, (long)(0x2E23EEC77163064L ^ l)), (long)-7252242660454086719L, (long)l)));
        this.V = ConfigurationRegistry.O;
        this.P = ConfigurationRegistry.l;
        this.VJ = new NetworkConfigManager();
        this.VU = new NetworkConfigManager();
        this.Vq = new NetworkConfigManager();
        this.VV = 0;
        this.v = -1;
        this.Vf = -999.0;
        this.Vx = false;
        this.Vp = -999.0;
        this.b = -999.0;
        this.VG = new ArrayList<NumericComputationFramework>();
        this.Vy = new TimestampGenerator(5000L);
        this.Vr = false;
        this.Vt = new HashSet();
        this.Vd = new HashSet();
        this.Va = 0;
        this.X = new ArrayList();
        this.Vn = new ArrayList();
        this.Vz = new HashMap();
        this.Vh.l(this.V5);
        this.Vw.l(this.Vc);
        this.O.l(this.Vo);
        this.VL.l(this.V_);
        this.B.l(this.Vi);
        this.Ve.o().z(this.A);
        this.A.x(new ColorPaletteGenerator1110().a);
        this.N(this.V1, this.V3, this.O, this.Vo, this.m, this.Ve, this.A, this.VD, this.VL, this.V_, this.Vl, this.V4, this.Z, this.VR, this.B, this.Vi, this.Vh, this.V5, this.Vw, this.Vc);
        this.V.y(this, 50);
    }

    private void x(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        try {
            this.VE = null;
            this.VA = null;
            this.n = (int)Math.round(this.V_.l());
            if (this.VT != null) {
                this.J(systemConfigurationOrchestrator);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
    }

    private void L(CompressionUtility compressionUtility, Color color) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)2929);
        double d2 = ApplicationLifecycleManager.r().L();
        double d3 = ApplicationLifecycleManager.r().D();
        double d4 = ApplicationLifecycleManager.r().s();
        oQ oQ2 = oQ.E(compressionUtility.z(), compressionUtility.h(), compressionUtility.A(), compressionUtility.z() + 1, compressionUtility.h() + 1, compressionUtility.A() + 1).V(-d2, -d3, -d4);
        Color color2 = Color.yellow;
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)0.45f);
        this.z(oQ2);
        GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)0.5f);
        this.u(oQ2);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
    }

    private static void d() {
        Object[] objectArray = kb;
        kb[0] = "6EH";
        objectArray[1] = Integer.TYPE;
        ModelSimulationEngine.lb[1] = "java/lang/Integer";
        objectArray[2] = "\u000e_\n\u000e2/\u0005P\u001bAO7\u0016W\u0012\b";
        objectArray[3] = "\u000b8R\b";
        objectArray[4] = "l}^K";
        objectArray[5] = "/m\u0005j";
        objectArray[6] = "0\u000bE/";
        objectArray[7] = "in\u0001%";
        objectArray[8] = "p \u007f\u0007\u001a/{/nH{!p$j\u0012";
        objectArray[9] = "JM\b\u0003!\u001a\u0014]\u000bHQ/p\r\u0017\\,\u000b\u0016G\u0006\u00015sKHU\u0007+\u0014J\\\u0000\\QO@ISYjK\u000eUU9m\f\u0016\\\t\u00070\u0013@Yk";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "l]F\u001a\u0015>\u007fU\u0000pEu\rHU\u0010_pcUCI.7bJ\u0007N\u001fcuB\u0001p";
    }

    private void V() {
        block15: {
            block14: {
                block13: {
                    block12: {
                        try {
                            if (ApplicationLifecycleManager.X().r()) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        try {
                            if (ApplicationLifecycleManager.X().M() == null) {
                                ConfigurationParameterResolver.l();
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        try {
                            if (this.VO == null) break block12;
                            CryptoStreamProcessor.j(this.VO, this.T, this.l, this.Y);
                            break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    CryptoStreamProcessor.j(this.VF, this.N, this.K, this.V0);
                }
                try {
                    try {
                        if (!this.t || this.L) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    CryptoStreamProcessor.r(false);
                    break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            CryptoStreamProcessor.r(this.V8.L);
        }
    }

    private boolean D(LightweightExecutionContext lightweightExecutionContext) {
        boolean bl;
        block13: {
            block12: {
                block11: {
                    try {
                        try {
                            if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
                try {
                    if (!protocolInteractionController.B(ReflectionMetadataResolver.YX)) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                try {
                    try {
                        if (this.Vh.s().booleanValue() && !this.V5.q(lightweightExecutionContext)) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ModelSimulationEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private CompressionUtility2668 T(Qh qh, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        float f2;
        boolean bl5;
        CompressionUtility2668 compressionUtility2668;
        block21: {
            block20: {
                compressionUtility2668 = new CompressionUtility2668();
                try {
                    block19: {
                        try {
                            try {
                                try {
                                    if (bl || bl2) break block19;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (bl3) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (!bl4) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    bl5 = true;
                    break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            bl5 = false;
        }
        boolean bl6 = bl5;
        try {
            f2 = ResourceAllocationManager.b() ? ResourceAllocationManager.c() : qh.q();
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        float f3 = f2;
        float f4 = ConfigurationCalibrator.b.E(f3, bl, bl2, bl3, bl4);
        if (bl6) {
            boolean bl7;
            boolean bl8;
            boolean bl9;
            boolean bl10;
            compressionUtility2668.T = bl;
            compressionUtility2668.i = bl2;
            compressionUtility2668.P = bl3;
            compressionUtility2668.k = bl4;
            float f5 = AdaptiveComputationEngine.v(AdaptiveComputationEngine.v(f4) - f);
            float f6 = f5 * ((float)Math.PI / 180);
            float f7 = (float)Math.cos(f6);
            float f8 = (float)(-Math.sin(f6));
            double d2 = 0.45f;
            try {
                bl10 = (double)f7 >= d2;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            boolean bl11 = bl10;
            try {
                bl9 = (double)f8 >= d2;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            boolean bl12 = bl9;
            try {
                bl8 = (double)f8 <= -d2;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            boolean bl13 = bl8;
            try {
                bl7 = (double)f7 <= -d2;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            boolean bl14 = bl7;
            compressionUtility2668.V = bl11;
            compressionUtility2668.W = bl14;
            compressionUtility2668.d = bl13;
            compressionUtility2668.n = bl12;
            return compressionUtility2668;
        }
        return null;
    }

    private CompressionUtility v(int n, SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        return this.e(n, systemConfigurationOrchestrator, systemConfigurationOrchestrator, null);
    }

    @DataExchangeProtocol2090
    public void f(DisplayConfigurationManager displayConfigurationManager) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = displayConfigurationManager.getThePlayer();
    }

    private int K(DynamicResourceRegistry dynamicResourceRegistry, ArrayList<kg> arrayList, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, Vector<MultiProtocolSessionManager> vector, int n) {
        long l;
        block12: {
            l = bb ^ 0x4F7C781C3CB8L;
            try {
                try {
                    if (vector != null && !vector.isEmpty()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                return (int)ModelSimulationEngine.a("j", (int)32385, (long)(0x957DF6CFEBBA959L ^ l));
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
        int n2 = 0;
        Vector<MultiProtocolSessionManager> vector2 = new Vector<MultiProtocolSessionManager>();
        for (MultiProtocolSessionManager multiProtocolSessionManager : vector) {
            vector2.add(multiProtocolSessionManager);
        }
        boolean bl = true;
        boolean bl2 = false;
        double d2 = vector.size() * 100;
        for (kg kg2 : arrayList) {
            try {
                if (vector2.isEmpty()) {
                    break;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            MultiProtocolSessionManager multiProtocolSessionManager = (MultiProtocolSessionManager)vector2.firstElement();
            ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N(kg2.R(), kg2.L(), kg2.U());
            if (Zw.m(contextualEventDispatcher, networkProtocolNegotiator, multiProtocolSessionManager.o, multiProtocolSessionManager.N)) {
                vector2.removeElementAt(0);
                bl = false;
            } else {
                d2 += 100000.0;
            }
            N9 n9 = multiProtocolSessionManager.h();
            ContextualEventDispatcher contextualEventDispatcher2 = ContextualEventDispatcher.N((double)n9.x() + 0.5, contextualEventDispatcher.F(), (double)n9.b() + 0.5);
            double d3 = contextualEventDispatcher.x(contextualEventDispatcher2);
            d2 += d3 * 50000.0;
            ++n2;
        }
        int n3 = vector2.size();
        d2 += (double)(n3 * ModelSimulationEngine.a("j", (int)8166, (long)(0x7976A5DCABC5480DL ^ l)));
        if (bl) {
            d2 = 2.147483647E9;
        }
        return (int)d2;
    }

    private void A() {
    }

    private void J(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block13: {
            boolean bl;
            block12: {
                bl = true;
                try {
                    try {
                        try {
                            try {
                                if (!this.A.s().booleanValue() || this.Ve.s().booleanValue()) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (this.V.F(this)) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        if (this.Vp == -999.0) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    if (this.VT == null) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                ConfigurationCalibrator.b.v(this.VT);
                this.VT = null;
                float f = AdaptiveComputationEngine.v(systemConfigurationOrchestrator.q() - (float)this.Vp);
                float f2 = f / 90.0f * 5.0f;
                f2 = Math.max(f2, 1.0f);
                float f3 = systemConfigurationOrchestrator.q() - (float)this.Vp;
                NetworkConnectionManager1925 networkConnectionManager1925 = new NetworkConnectionManager1925(this, ApplicationLifecycleManager.U(), f3, systemConfigurationOrchestrator.S() - (float)this.b);
                networkConnectionManager1925.h(true);
                networkConnectionManager1925.i(true);
                networkConnectionManager1925.J(true);
                networkConnectionManager1925.L(f2);
                ConfigurationCalibrator.b.W(networkConnectionManager1925);
                bl = false;
            }
            try {
                try {
                    if (!bl || this.VT == null) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                this.VT.F(true);
                this.VT.v(true);
                this.VT.i(true);
                this.VT.N(0.0f);
                this.VT.L(3.0f);
                ConfigurationCalibrator.b.v(this.VT);
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
    }

    private CompressionUtility e(int n, Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, ArrayList<kg> arrayList) {
        int n2;
        int n3;
        int n4;
        int n5;
        boolean bl;
        boolean bl2;
        boolean bl3;
        CipherContextManager784 cipherContextManager784;
        int n6;
        block42: {
            block41: {
                int n7;
                try {
                    n7 = GameVersionEnumerator.MC_1_20_6.H() ? systemConfigurationOrchestrator.N().O() : 0;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                n6 = n7;
                cipherContextManager784 = new CipherContextManager784(qh, systemConfigurationOrchestrator, systemConfigurationOrchestrator.N(), this.V8);
                try {
                    cipherContextManager784.w(this.V8);
                    cipherContextManager784.d();
                    if (arrayList != null) {
                        arrayList.add(cipherContextManager784.G());
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                try {
                    block40: {
                        try {
                            try {
                                try {
                                    if (this.V8.O || this.V8.B) break block40;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (this.V8.P) break block40;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (!this.V8.F) break block41;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    bl3 = true;
                    break block42;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            bl3 = false;
        }
        boolean bl4 = bl3;
        try {
            bl2 = this.V1.s() == false;
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        boolean bl5 = bl2;
        try {
            bl = this.O.s() == false;
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        boolean bl6 = bl;
        try {
            n5 = bl6 ? 1 : 3;
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        int n8 = n5;
        Qh qh2 = cipherContextManager784.a();
        int n9 = 0;
        CompressionUtility compressionUtility = null;
        ContextualEventDispatcher contextualEventDispatcher = ContextualEventDispatcher.N(qh2.F(), qh2.V(), qh2.B());
        for (n4 = 0; n4 <= n; ++n4) {
            block48: {
                block45: {
                    block46: {
                        boolean bl7;
                        int n10;
                        int n11;
                        int n12;
                        block43: {
                            block44: {
                                n3 = qh2.j();
                                try {
                                    cipherContextManager784.f();
                                    if (arrayList != null) {
                                        arrayList.add(cipherContextManager784.G());
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                contextualEventDispatcher.F(qh2.F());
                                contextualEventDispatcher.Q(qh2.V());
                                contextualEventDispatcher.N(qh2.B());
                                n2 = qh2.j() ? 1 : 0;
                                n12 = AdaptiveComputationEngine.Q(qh2.F());
                                n11 = AdaptiveComputationEngine.Q(qh2.V() - 0.015625);
                                n10 = AdaptiveComputationEngine.Q(qh2.B());
                                bl7 = false;
                                TransactionCorrelationEngine transactionCorrelationEngine = systemConfigurationOrchestrator.N().N(n12, n11, n10);
                                try {
                                    try {
                                        if (!transactionCorrelationEngine.r()) break block43;
                                        if (transactionCorrelationEngine.B(ReflectionMetadataResolver.Pf)) break block44;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                    if (!transactionCorrelationEngine.B(ReflectionMetadataResolver.UF)) break block43;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                            }
                            bl7 = true;
                        }
                        try {
                            try {
                                if (n2 == 0 && !bl7) break block45;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            ++n9;
                            if (compressionUtility != null) break block46;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        compressionUtility = new CompressionUtility(n12, n11, n10);
                    }
                    try {
                        block47: {
                            try {
                                try {
                                    if (n9 >= n8 || qh2.A()) break block47;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (!bl6) break block48;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                        }
                        return compressionUtility;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                compressionUtility = null;
                n9 = 0;
            }
            try {
                if (!(cipherContextManager784.a().V() <= (double)n6)) continue;
                return compressionUtility;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
        if (bl5) {
            n4 = AdaptiveComputationEngine.Q(qh2.F());
            n3 = AdaptiveComputationEngine.Q(qh2.V()) - 1;
            n2 = AdaptiveComputationEngine.Q(qh2.B());
            return new CompressionUtility(n4, n3, n2);
        }
        return null;
    }

    private boolean f(Qh qh, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, CipherContextManager784 cipherContextManager784, DynamicResourceRegistry dynamicResourceRegistry) {
        boolean bl;
        boolean bl2;
        boolean bl3;
        block25: {
            block24: {
                bl3 = false;
                bl2 = qh.j();
                double d2 = qh.V() - 0.015625;
                TransactionCorrelationEngine transactionCorrelationEngine = networkProtocolNegotiator.N(AdaptiveComputationEngine.Q(qh.F()), AdaptiveComputationEngine.Q(d2), AdaptiveComputationEngine.Q(qh.B()));
                try {
                    try {
                        if (!transactionCorrelationEngine.r() || !PatternMatchingOrchestrator.q(transactionCorrelationEngine)) break block24;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block25;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        boolean bl4 = bl;
        CompressionUtility compressionUtility = dynamicResourceRegistry.m;
        int n = 0;
        Qh qh2 = cipherContextManager784.a();
        cipherContextManager784.d();
        for (int i = 0; i < 10; ++i) {
            block33: {
                block26: {
                    boolean bl5;
                    double d3;
                    double d4;
                    block32: {
                        block31: {
                            boolean bl6;
                            boolean bl7;
                            block30: {
                                block29: {
                                    boolean bl8;
                                    block28: {
                                        block27: {
                                            cipherContextManager784.f();
                                            d4 = qh2.G();
                                            d3 = qh2.o();
                                            try {
                                                try {
                                                    try {
                                                        if (!qh2.j()) break block26;
                                                        ++n;
                                                        if (!(qh2.F() > (double)compressionUtility.z())) break block27;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ModelSimulationEngine.a(customSystemException);
                                                    }
                                                    if (!(qh2.F() < (double)(compressionUtility.z() + 1))) break block27;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ModelSimulationEngine.a(customSystemException);
                                                }
                                                bl8 = true;
                                                break block28;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                        }
                                        bl8 = false;
                                    }
                                    bl7 = bl8;
                                    try {
                                        try {
                                            if (!(qh2.B() > (double)compressionUtility.A()) || !(qh2.B() < (double)(compressionUtility.A() + 1))) break block29;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ModelSimulationEngine.a(customSystemException);
                                        }
                                        bl6 = true;
                                        break block30;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                }
                                bl6 = false;
                            }
                            boolean bl9 = bl6;
                            try {
                                try {
                                    if (!bl7 || !bl9) break block31;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                bl5 = true;
                                break block32;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                        }
                        bl5 = false;
                    }
                    boolean bl10 = bl5;
                    try {
                        try {
                            if (!(Math.abs(d4) < 0.005) || !(Math.abs(d3) < 0.005)) break block33;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        if (!bl10) break block33;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    bl3 = false;
                    break;
                }
                if (bl2) {
                    bl3 = true;
                    break;
                }
                n = 0;
            }
            bl2 = cipherContextManager784.a().j();
        }
        return bl3;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a3' || c == '\u00d1' || c == '\u00aa' || c == '\u00f6') {
                field = ModelSimulationEngine.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ModelSimulationEngine.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'u' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d0' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private LightweightExecutionContext T(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        AssetLoadBalancer assetLoadBalancer;
        block26: {
            block28: {
                block25: {
                    assetLoadBalancer = systemConfigurationOrchestrator.l();
                    try {
                        try {
                            if (!assetLoadBalancer.Y() && !systemConfigurationOrchestrator.Y()) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        return null;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                }
                try {
                    block27: {
                        try {
                            try {
                                if (!this.Vw.s().booleanValue()) break block26;
                                if (systemConfigurationOrchestrator.a().Y()) break block27;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (!systemConfigurationOrchestrator.a().C().Y()) break block28;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    return null;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            try {
                if (!this.s(systemConfigurationOrchestrator.a())) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            return systemConfigurationOrchestrator.a();
        }
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext lightweightExecutionContext = assetLoadBalancer.F(i);
            try {
                try {
                    if (lightweightExecutionContext.Y() || !lightweightExecutionContext.C().B(ReflectionMetadataResolver.YX)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            try {
                if (this.D(lightweightExecutionContext)) {
                    return lightweightExecutionContext;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            for (String string : this.e) {
                try {
                    if (!lightweightExecutionContext.g().contains(string)) continue;
                    return lightweightExecutionContext;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
        }
        return null;
    }

    static int h(ModelSimulationEngine modelSimulationEngine, DynamicResourceRegistry dynamicResourceRegistry, ArrayList arrayList, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, Vector vector, int n) {
        return modelSimulationEngine.K(dynamicResourceRegistry, arrayList, systemConfigurationOrchestrator, networkProtocolNegotiator, vector, n);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ModelSimulationEngine.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l, long l2) {
        int n = ModelSimulationEngine.a(l, l2);
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
                clazz3 = ModelSimulationEngine.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ModelSimulationEngine.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ModelSimulationEngine.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ModelSimulationEngine.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ModelSimulationEngine.b(572726129072965L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ModelSimulationEngine.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ModelSimulationEngine.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ModelSimulationEngine.b(572726129072965L, 0L);
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

    @DataExchangeProtocol2090
    public void m(EventTrigger eventTrigger) {
        block32: {
            float f;
            float f2;
            ConnectionConfigurationResolver connectionConfigurationResolver;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block34: {
                block33: {
                    block30: {
                        boolean bl;
                        long l;
                        block31: {
                            block29: {
                                l = bb ^ 0x41DB6E4A81C0L;
                                systemConfigurationOrchestrator = eventTrigger.getThePlayer();
                                connectionConfigurationResolver = eventTrigger.getWorld();
                                try {
                                    try {
                                        if (!systemConfigurationOrchestrator.Y() && !connectionConfigurationResolver.Y()) break block29;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                    this.n();
                                    return;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                            }
                            bl = systemConfigurationOrchestrator.j();
                            try {
                                if (this.z > 0) {
                                    --this.z;
                                    this.M((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)5922, (long)(0x223AD4D41CFF7DE9L ^ l)), (long)5475768678010951526L, (long)l)) + this.z + (String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)9592, (long)(0x760A86B6B491CF8EL ^ l)), (long)5475768678010951526L, (long)l)) + this.V8.y);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            try {
                                try {
                                    try {
                                        if (this.VE == null) break block30;
                                        if (!bl) break block31;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                    if (this.z != 0) break block31;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                this.M((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)15086, (long)(0x6B71A45CBBFCD00AL ^ l)), (long)5475768678010951526L, (long)l)));
                                this.z = 0;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (!bl && this.z != 0) break block30;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                    if (!this.t) break block30;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                if (!this.L) break block30;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            this.M((String)((Object)ModelSimulationEngine.c("\u00d0", (int)ModelSimulationEngine.a("j", (int)30058, (long)(0x7CA0072192009FA4L ^ l)), (long)5475768678010951526L, (long)l)));
                            this.VH = this.Vk;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            try {
                                this.r = new NumericComputationFramework(systemConfigurationOrchestrator);
                                if (this.VE == null || this.VE.x == null) break block32;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                            if (this.VA == null) break block32;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ModelSimulationEngine.a(customSystemException);
                        }
                        if (this.VT != null) break block33;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    f2 = systemConfigurationOrchestrator.q();
                    f = systemConfigurationOrchestrator.S();
                    break block34;
                }
                if (this.VT instanceof CryptographicSecurityProvider) {
                    f2 = ((CryptographicSecurityProvider)this.VT).P();
                    f = ((CryptographicSecurityProvider)this.VT).v();
                } else {
                    f2 = this.VT.A();
                    f = this.VT.L();
                }
            }
            int n = this.q(this.VE, this.VA, systemConfigurationOrchestrator, systemConfigurationOrchestrator, connectionConfigurationResolver, f2, f, this.r);
            ContextualEventDispatcher contextualEventDispatcher = this.VE.i;
            this.VT = this.T((Qh)systemConfigurationOrchestrator, contextualEventDispatcher, this.VA.Q, this.VT, n, this.VH);
            ConfigurationCalibrator.b.W(this.VT);
        }
    }

    private void w(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl = systemConfigurationOrchestrator.M().K();
    }

    @Override
    public void y(boolean bl, boolean bl2) {
        block12: {
            block11: {
                block8: {
                    boolean bl3;
                    block10: {
                        block9: {
                            try {
                                try {
                                    try {
                                        if (bl || !(this.VT instanceof CryptographicSecurityProvider)) break block8;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ModelSimulationEngine.a(customSystemException);
                                    }
                                    ModelSimulationEngine modelSimulationEngine = this;
                                    if (this.w) break block9;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                bl3 = true;
                                break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                        }
                        bl3 = false;
                    }
                    modelSimulationEngine.w = bl3;
                    break block12;
                }
                try {
                    super.y(bl, bl2);
                    this.w = false;
                    if (bl) break block11;
                    this.J(ApplicationLifecycleManager.U());
                    this.F = false;
                    this.t = false;
                    this.R = 0;
                    this.VB = 0;
                    this.n = 0;
                    this.Vn.clear();
                    this.X.clear();
                    G.clear();
                    this.n();
                    break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
            this.Vn.clear();
            this.X.clear();
            G.clear();
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ModelSimulationEngine.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ModelSimulationEngine.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void u(oQ oQ2) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    private void M(String string) {
    }

    private boolean B(MultiProtocolSessionManager multiProtocolSessionManager, CipherContextManager784 cipherContextManager784) {
        boolean bl;
        block21: {
            NetworkPacketInterceptor1107 networkPacketInterceptor1107;
            block25: {
                boolean bl2;
                block28: {
                    boolean bl3;
                    AdaptiveConfigurationManager adaptiveConfigurationManager;
                    block27: {
                        block26: {
                            boolean bl4;
                            block29: {
                                boolean bl5;
                                block24: {
                                    block23: {
                                        block22: {
                                            bl = false;
                                            if (multiProtocolSessionManager == null) break block21;
                                            Qh qh = cipherContextManager784.a();
                                            oQ oQ2 = PatternMatchingOrchestrator.y(qh.N(), multiProtocolSessionManager.h());
                                            oQ oQ3 = qh.S();
                                            try {
                                                if (oQ3.e(oQ2)) {
                                                    return bl;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                            networkPacketInterceptor1107 = cipherContextManager784.L(3.0, 0.0f, false);
                                            try {
                                                if (!networkPacketInterceptor1107.h()) break block21;
                                                if (GeometryCalculator.C() <= GeometryCalculator.W) break block22;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                            bl4 = networkPacketInterceptor1107.f().equals(ReflectionUtilityBroker.Y(multiProtocolSessionManager.o));
                                            break block29;
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (networkPacketInterceptor1107.p() != multiProtocolSessionManager.o.x() || networkPacketInterceptor1107.b() != multiProtocolSessionManager.o.J()) break block23;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ModelSimulationEngine.a(customSystemException);
                                                }
                                                if (networkPacketInterceptor1107.m() != multiProtocolSessionManager.o.b()) break block23;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ModelSimulationEngine.a(customSystemException);
                                            }
                                            bl5 = true;
                                            break block24;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ModelSimulationEngine.a(customSystemException);
                                        }
                                    }
                                    bl5 = false;
                                }
                                bl4 = bl5;
                            }
                            try {
                                try {
                                    if (!bl4) break block25;
                                    if (!multiProtocolSessionManager.L) break block26;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ModelSimulationEngine.a(customSystemException);
                                }
                                adaptiveConfigurationManager = multiProtocolSessionManager.N;
                                break block27;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ModelSimulationEngine.a(customSystemException);
                            }
                        }
                        adaptiveConfigurationManager = null;
                    }
                    AdaptiveConfigurationManager adaptiveConfigurationManager2 = adaptiveConfigurationManager;
                    try {
                        bl3 = adaptiveConfigurationManager2 == null;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    bl2 = bl3;
                    try {
                        if (adaptiveConfigurationManager2 == null || !adaptiveConfigurationManager2.equals(networkPacketInterceptor1107.K())) break block28;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    bl2 = true;
                }
                if (bl2) {
                    bl = true;
                }
                break block21;
            }
            ReflectionUtilityBroker reflectionUtilityBroker = networkPacketInterceptor1107.f();
            N9 n9 = multiProtocolSessionManager.h();
            if (n9.C(reflectionUtilityBroker.I(networkPacketInterceptor1107.K()))) {
                bl = true;
            }
        }
        return bl;
    }

    private void X() {
        try {
            if (ApplicationLifecycleManager.X().M() == null) {
                ConfigurationParameterResolver.l();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        CryptoStreamProcessor.y(false);
        this.VF = false;
        this.V0 = false;
        this.K = false;
        this.N = false;
    }

    @Override
    public void h() {
        GraphicalRenderingController.D(CryptographicContextManager567.class).r(this);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Af" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static TimestampGenerator S(ModelSimulationEngine modelSimulationEngine) {
        return modelSimulationEngine.Vy;
    }

    static ConnectionLifecycleManager U(ModelSimulationEngine modelSimulationEngine) {
        return modelSimulationEngine.V;
    }

    private void a() {
        block6: {
            try {
                try {
                    try {
                        if (this.V2 <= 0) break block6;
                        --this.V2;
                        if (this.V2 != 0) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    if (this.VP == null) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                this.t(this.VP, false);
                this.VP = null;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
    }

    private int g() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext object = ApplicationLifecycleManager.U().l().F(i);
            try {
                try {
                    if (!object.r() || !this.D(object)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
                arrayList.add(i);
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
        }
        try {
            if (arrayList.isEmpty()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ModelSimulationEngine.a(customSystemException);
        }
        for (String string : this.e) {
            for (Integer n : arrayList) {
                try {
                    if (!ApplicationLifecycleManager.U().l().F(n).g().contains(string)) continue;
                    return n;
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
        }
        return (Integer)arrayList.get(0);
    }

    private void p(DynamicResourceRegistry dynamicResourceRegistry, int n, SystemConfigurationOrchestrator systemConfigurationOrchestrator, NetworkProtocolNegotiator networkProtocolNegotiator, ArrayList<kg> arrayList) {
        block11: {
            try {
                if (dynamicResourceRegistry == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            try {
                if (dynamicResourceRegistry.x != null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ModelSimulationEngine.a(customSystemException);
            }
            N9 n9 = dynamicResourceRegistry.N.v();
            N9 n92 = dynamicResourceRegistry.m.v();
            int n2 = Math.abs(n9.x() - n92.x());
            int n3 = Math.abs(n9.b() - n92.b());
            int n4 = Math.abs(n9.J() - n92.J());
            EventDispatchAdapter eventDispatchAdapter = new EventDispatchAdapter(this, n2, n3, n4, networkProtocolNegotiator, systemConfigurationOrchestrator, dynamicResourceRegistry, arrayList);
            TransactionCorrelationEngine transactionCorrelationEngine = networkProtocolNegotiator.N(n92.x(), n92.J(), n92.b());
            boolean bl = PatternMatchingOrchestrator.a(transactionCorrelationEngine);
            if (bl) {
                CryptographicPrimitiveGenerator cryptographicPrimitiveGenerator = new CryptographicPrimitiveGenerator(eventDispatchAdapter);
                Vector<MultiProtocolSessionManager> vector = cryptographicPrimitiveGenerator.A(n9, n92);
                try {
                    try {
                        if (vector == null || vector.isEmpty()) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ModelSimulationEngine.a(customSystemException);
                    }
                    dynamicResourceRegistry.x = new DistributedResourceOrchestrator(vector.lastElement().N, vector);
                }
                catch (CustomSystemException customSystemException) {
                    throw ModelSimulationEngine.a(customSystemException);
                }
            }
        }
    }

    public void V(ContextualEventDispatcher contextualEventDispatcher, Color color) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)2929);
        double d2 = ApplicationLifecycleManager.r().L();
        double d3 = ApplicationLifecycleManager.r().D();
        double d4 = ApplicationLifecycleManager.r().s();
        ContextualEventDispatcher contextualEventDispatcher2 = contextualEventDispatcher;
        double d5 = contextualEventDispatcher2.X() - 0.05;
        double d6 = contextualEventDispatcher2.F() - 0.05;
        double d7 = contextualEventDispatcher2.f() - 0.05;
        oQ oQ2 = oQ.E(d5, d6, d7, d5 + 0.1, d6 + 0.1, d7 + 0.1).V(-d2, -d3, -d4);
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)0.25f);
        this.z(oQ2);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
    }

    private double lambda$sortClutchPaths$0(kg kg2, SystemConfigurationOrchestrator systemConfigurationOrchestrator, DynamicResourceRegistry dynamicResourceRegistry) {
        N9 n9 = dynamicResourceRegistry.m.v();
        N9 n92 = dynamicResourceRegistry.N.v();
        double d2 = 0.0;
        int n = 0;
        int n2 = Math.abs(n92.x() - n9.x());
        int n3 = Math.abs(n92.b() - n9.b());
        n += Math.abs(n2);
        d2 += (double)((n += Math.abs(n3)) * 100);
        if (n9.J() > n92.J()) {
            d2 -= (double)((n9.J() - n92.J()) * 200);
        }
        if (this.V7) {
            d2 += Math.sqrt(Math.pow((double)n92.x() + 0.5 - kg2.R(), 2.0) + Math.pow((double)n92.b() + 0.5 - kg2.U(), 2.0)) * 1000.0;
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator2 = ApplicationLifecycleManager.U();
        double d3 = _Y.F(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.B(), systemConfigurationOrchestrator.q(), (double)n92.x() + 0.5, (double)n92.b() + 0.5);
        return d2 += Math.abs((double)(n92.J() + 1) - this.Vf) * 200.0;
    }

    @DataExchangeProtocol2090
    public void l(EventDispatchRegistry2111 eventDispatchRegistry2111) {
    }

    private void p() {
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ModelSimulationEngine.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ModelSimulationEngine.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ModelSimulationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ModelSimulationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

