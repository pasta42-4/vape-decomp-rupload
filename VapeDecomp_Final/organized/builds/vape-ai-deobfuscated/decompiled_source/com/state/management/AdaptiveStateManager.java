/*
 * Decompiled with CFR 0.152.
 */
package com.state.management;

import a.KB;
import a.Ya;
import a._Y;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.event.EventTrigger;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.configuration.management.ConfigurationParameterResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.service.ServiceLifecycleController;
import com.data.streaming.DataStreamInterceptor;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.numeric.precision.NumericPrecisionTransformer;
import com.physics.simulation.PhysicsSimulator;
import com.resource.allocation.ResourceAllocationManager2527;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.streaming.CryptoStreamProcessor;
import com.security.tokens.CryptographicTokenGenerator;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resources.ResourceAllocationManager;
import com.ui.configuration.DisplayConfigurationManager;
import com.validation.core.ObjectValidator;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class AdaptiveStateManager
extends ContextTransformationEngine<CryptographicTokenGenerator> {
    DataStreamInterceptor K;
    private boolean N;
    private boolean l;
    private LightweightExecutionContext t;
    private NetworkConfigManager x;
    PhysicsSimulator xC;
    private NetworkConfigManager z;
    private double[] R;
    float[] x3;
    private boolean h;
    private final ConnectionPoolOrchestrator1192 G;
    boolean xQ;
    private ArrayList<Integer> n;
    private final NumericPrecisionTransformer A;
    private static final Object[] kb;
    private static final Map hb;
    private static final long bb;
    ArrayList<Integer> xr;
    private final ConnectionPoolOrchestrator1192 xy;
    private int d;
    private double[] Z;
    private boolean e;
    CryptographicTokenGenerator L;
    private int r;
    private static final Integer[] gb;
    private int xv;
    private boolean j;
    private boolean v;
    private boolean xb;
    private static final String[] lb;
    private boolean Y;
    private static final long[] fb;
    private final ConnectionPoolOrchestrator1192 o;
    private boolean V;
    private boolean T;
    private int P;
    private int m;
    private double[] O;
    private boolean B;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void E(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block19: {
            try {
                if (this.d != 0) break block19;
                this.x3 = new float[]{systemConfigurationOrchestrator.q(), 90.0f};
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveStateManager.a(customSystemException);
            }
        }
        if (this.d < 5) {
            float[] fArray = this.x3;
            try {
                block20: {
                    try {
                        try {
                            try {
                                this.x3 = this.Q(systemConfigurationOrchestrator, this.r(this.Z, this.d, this.T), this.d);
                                if (this.L.R == null || fArray == null) break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            if (fArray[0] != this.x3[0]) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        if (fArray[1] == this.x3[1]) return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                }
                this.L.b(this.x3, this.t(this.x3, 15));
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveStateManager.a(customSystemException);
            }
        }
        float[] fArray = this.x3;
        try {
            block21: {
                try {
                    try {
                        try {
                            this.x3 = this.n(systemConfigurationOrchestrator, this.T);
                            if (this.L.R == null || fArray == null) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        if (fArray[0] != this.x3[0]) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                    if (fArray[1] == this.x3[1]) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
            }
            this.L.b(this.x3, this.t(this.x3, 15));
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
    }

    private double[] r(double[] dArray, int n, boolean bl) {
        double d2;
        double d3;
        block30: {
            block31: {
                block28: {
                    block29: {
                        block26: {
                            block27: {
                                block24: {
                                    block25: {
                                        block22: {
                                            block23: {
                                                block20: {
                                                    block21: {
                                                        block18: {
                                                            block19: {
                                                                block16: {
                                                                    block17: {
                                                                        d3 = dArray[0];
                                                                        d2 = dArray[1];
                                                                        try {
                                                                            if (n != 1) break block16;
                                                                            if (!bl) break block17;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw AdaptiveStateManager.a(customSystemException);
                                                                        }
                                                                        d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.65)).doubleValue();
                                                                        d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.35)).doubleValue();
                                                                        break block30;
                                                                    }
                                                                    d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.35)).doubleValue();
                                                                    d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.65)).doubleValue();
                                                                    break block30;
                                                                }
                                                                try {
                                                                    if (n != 2) break block18;
                                                                    if (!bl) break block19;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw AdaptiveStateManager.a(customSystemException);
                                                                }
                                                                d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.65)).doubleValue();
                                                                d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.65)).doubleValue();
                                                                break block30;
                                                            }
                                                            d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.35)).doubleValue();
                                                            d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.35)).doubleValue();
                                                            break block30;
                                                        }
                                                        try {
                                                            if (n != 3) break block20;
                                                            if (!bl) break block21;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AdaptiveStateManager.a(customSystemException);
                                                        }
                                                        d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.35)).doubleValue();
                                                        d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.65)).doubleValue();
                                                        break block30;
                                                    }
                                                    d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.65)).doubleValue();
                                                    d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.35)).doubleValue();
                                                    break block30;
                                                }
                                                try {
                                                    if (n != 4) break block22;
                                                    if (!bl) break block23;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AdaptiveStateManager.a(customSystemException);
                                                }
                                                d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.35)).doubleValue();
                                                d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.35)).doubleValue();
                                                break block30;
                                            }
                                            d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.65)).doubleValue();
                                            d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.65)).doubleValue();
                                            break block30;
                                        }
                                        try {
                                            if (n != 6) break block24;
                                            if (!bl) break block25;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdaptiveStateManager.a(customSystemException);
                                        }
                                        d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.8)).doubleValue();
                                        d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.8)).doubleValue();
                                        break block30;
                                    }
                                    d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.8)).doubleValue();
                                    d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.2)).doubleValue();
                                    break block30;
                                }
                                try {
                                    if (n != 8) break block26;
                                    if (!bl) break block27;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveStateManager.a(customSystemException);
                                }
                                d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.2)).doubleValue();
                                d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.2)).doubleValue();
                                break block30;
                            }
                            d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.2)).doubleValue();
                            d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.8)).doubleValue();
                            break block30;
                        }
                        try {
                            if (n != 7) break block28;
                            if (!bl) break block29;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.2)).doubleValue();
                        d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.8)).doubleValue();
                        break block30;
                    }
                    d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.8)).doubleValue();
                    d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.8)).doubleValue();
                    break block30;
                }
                try {
                    if (n != 5) break block30;
                    if (!bl) break block31;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
                d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.8)).doubleValue();
                d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.2)).doubleValue();
                break block30;
            }
            d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.2)).doubleValue();
            d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.2)).doubleValue();
        }
        return new double[]{d3, d2};
    }

    private void b(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block19: {
            block21: {
                block22: {
                    boolean bl;
                    block18: {
                        block20: {
                            boolean bl2;
                            try {
                                if (ApplicationLifecycleManager.X().M() == null) {
                                    ConfigurationParameterResolver.l();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            boolean bl3 = this.v(systemConfigurationOrchestrator, this.d);
                            try {
                                bl2 = this.d < 5;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            bl = bl2;
                            try {
                                if (!bl3) {
                                    this.x.m();
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            try {
                                try {
                                    try {
                                        this.xb = bl3;
                                        if (!bl3) break block18;
                                        CryptoStreamProcessor.d(this.xy, false);
                                        CryptoStreamProcessor.d(this.o, false);
                                        CryptoStreamProcessor.d(this.G, false);
                                        if (bl) break block19;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdaptiveStateManager.a(customSystemException);
                                    }
                                    if (!this.T) break block20;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveStateManager.a(customSystemException);
                                }
                                CryptoStreamProcessor.d(this.G, false);
                                break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                        }
                        CryptoStreamProcessor.d(this.o, false);
                        break block19;
                    }
                    try {
                        try {
                            CryptoStreamProcessor.d(this.xy, true);
                            if (bl) break block21;
                            if (!this.T) break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        CryptoStreamProcessor.d(this.G, true);
                        break block19;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                }
                CryptoStreamProcessor.d(this.o, true);
                break block19;
            }
            CryptoStreamProcessor.d(this.o, false);
            CryptoStreamProcessor.d(this.G, false);
        }
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = " \f?";
        objectArray[1] = Integer.TYPE;
        AdaptiveStateManager.lb[1] = "java/lang/Integer";
        objectArray[2] = "\rpq5\u000bS\u0006\u007f`zvK\u0015xi3";
        objectArray[3] = "a,PLp&j#A\u0003\u0011(a(EY";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "3m\\{Ar:m\u001d\u0016\u0013bW(@g\u001b'<hE.x *(O(\u0016x*7P\u0016";
    }

    public boolean X(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        int n;
        block16: {
            boolean bl2;
            block18: {
                block17: {
                    NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                    block14: {
                        networkPacketInterceptor1107 = ConfigurationCalibrator.b.m();
                        try {
                            try {
                                if (!networkPacketInterceptor1107.Y() && networkPacketInterceptor1107.q().equals(ObjectValidator.Y())) break block14;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            return false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                    }
                    n = networkPacketInterceptor1107.j();
                    double d2 = systemConfigurationOrchestrator.x();
                    try {
                        try {
                            block15: {
                                try {
                                    try {
                                        if (d2 > 0.1 || d2 < -0.1) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdaptiveStateManager.a(customSystemException);
                                    }
                                    if (!this.v) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveStateManager.a(customSystemException);
                                }
                            }
                            if (n == 0) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        bl2 = true;
                        break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        try {
            bl = n > 1;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void L(DisplayConfigurationManager displayConfigurationManager) {
        this.L.Z();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AdaptiveStateManager.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private boolean A() {
        block10: {
            block12: {
                block11: {
                    try {
                        try {
                            try {
                                try {
                                    if (this.xC == null) break block10;
                                    if (this.xC.S()) break block11;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveStateManager.a(customSystemException);
                                }
                                if (this.m >= this.r) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            ++this.m;
                            if (!this.h) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                }
                try {
                    if (!this.xC.S()) break block12;
                    this.m = 0;
                    this.h = false;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
            }
            this.xC.g(true);
            this.L.P();
            this.xC = null;
            this.m = 0;
            this.h = false;
            return true;
        }
        return false;
    }

    @DataExchangeProtocol2090
    public void N(EventTrigger eventTrigger) {
        try {
            if (ApplicationLifecycleManager.U().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        try {
            if (this.xQ) {
                this.K.S(eventTrigger);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
    }

    public float[] Q(SystemConfigurationOrchestrator systemConfigurationOrchestrator, double[] dArray, int n) {
        float f;
        float[] fArray;
        float f2 = 0.1f * this.D(dArray, new double[]{systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.B()}, n);
        float f3 = n == 1 ? 135.0f - f2 : (n == 2 ? -135.0f - f2 : (n == 3 ? -45.0f - f2 : 45.0f - f2));
        try {
            float[] fArray2 = new float[2];
            fArray2[0] = f3;
            float[] fArray3 = fArray2;
            fArray = fArray2;
            int n2 = 1;
            f = this.x.d() > 500L ? 83.0f : 81.0f;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        fArray3[n2] = f;
        return fArray;
    }

    private boolean w(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block10: {
            int n;
            block11: {
                n = this.L.l();
                try {
                    if (n == -1) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
                try {
                    if (this.t == null || systemConfigurationOrchestrator.a().equals(this.t)) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
                int n2 = this.L.Z(systemConfigurationOrchestrator, this.t);
                try {
                    if (n2 == -1) break block11;
                    this.L.Q(n2);
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
            }
            try {
                if (systemConfigurationOrchestrator.l().v() != n) {
                    this.L.Q(n);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveStateManager.a(customSystemException);
            }
        }
        return true;
    }

    private void N() {
        long l = bb ^ 0x1DEAAAD0F88DL;
        this.xQ = true;
        this.Z = null;
        this.xC = null;
        this.m = 0;
        this.x3 = null;
        this.j = false;
        this.N = false;
        this.e = false;
        this.v = false;
        this.xb = true;
        this.d = 0;
        this.P = 0;
        this.n = new ArrayList();
        this.r = (int)AdaptiveStateManager.a("k", (int)14957, (long)(0x1047AE80AE7A18FAL ^ l));
        this.t = null;
        this.B = false;
        this.Y = true;
        ConfigurationRegistry.l.m(this);
        ConfigurationRegistry.i.Z();
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

    private void d(double[] dArray, boolean bl, boolean bl2, boolean bl3, int n) {
        this.xC = new PhysicsSimulator(dArray[0], dArray[1]);
        this.h = bl;
        this.xC.b(bl2);
        this.xC.r(bl3);
        ServiceLifecycleController.c.N(this.xC);
        this.m = 0;
        this.r = n;
    }

    public double[] K(int n) {
        try {
            if (n == 6) {
                return new double[]{135.0, 45.0};
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        try {
            if (n == 8) {
                return new double[]{315.0, 225.0};
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        try {
            if (n == 7) {
                return new double[]{225.0, 135.0};
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        try {
            if (n == 5) {
                return new double[]{45.0, 315.0};
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        return new double[0];
    }

    /*
     * Unable to fully structure code
     */
    private boolean q(SystemConfigurationOrchestrator var1_1) {
        block127: {
            block100: {
                block122: {
                    block114: {
                        block121: {
                            block120: {
                                block115: {
                                    block119: {
                                        block118: {
                                            block117: {
                                                block110: {
                                                    block113: {
                                                        block112: {
                                                            block111: {
                                                                block133: {
                                                                    block109: {
                                                                        block108: {
                                                                            block107: {
                                                                                block106: {
                                                                                    block101: {
                                                                                        block105: {
                                                                                            block104: {
                                                                                                block103: {
                                                                                                    block102: {
                                                                                                        block98: {
                                                                                                            block132: {
                                                                                                                block99: {
                                                                                                                    try {
                                                                                                                        if (ApplicationLifecycleManager.X().M() == null) {
                                                                                                                            ConfigurationParameterResolver.l();
                                                                                                                        }
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v0) {
                                                                                                                        throw AdaptiveStateManager.a(v0);
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (this.xC == null || !this.xC.S()) break block98;
                                                                                                                            }
                                                                                                                            catch (CustomSystemException v1) {
                                                                                                                                throw AdaptiveStateManager.a(v1);
                                                                                                                            }
                                                                                                                            if (!this.v) break block98;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v2) {
                                                                                                                            throw AdaptiveStateManager.a(v2);
                                                                                                                        }
                                                                                                                        this.xb = true;
                                                                                                                        this.xC = null;
                                                                                                                        this.Z = this.O;
                                                                                                                        this.d = this.P;
                                                                                                                        this.T = this.B;
                                                                                                                        this.v = false;
                                                                                                                        this.e = false;
                                                                                                                        CryptoStreamProcessor.N();
                                                                                                                        this.x.m();
                                                                                                                        this.z.m();
                                                                                                                        if (this.d >= 5) break block99;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v3) {
                                                                                                                        throw AdaptiveStateManager.a(v3);
                                                                                                                    }
                                                                                                                    var2_2 = this.Q(var1_1, this.r(this.Z, this.d, this.T), this.d);
                                                                                                                    this.q(var2_2, this.t(var2_2, 15));
                                                                                                                    break block132;
                                                                                                                }
                                                                                                                var2_3 = this.n(var1_1, this.T);
                                                                                                                this.q(var2_3, this.t(var2_3, 12));
                                                                                                            }
                                                                                                            this.V = true;
                                                                                                            return true;
                                                                                                        }
                                                                                                        var2_4 = DynamicContextBroker.s(ApplicationLifecycleManager.N().y());
                                                                                                        var3_5 = DynamicContextBroker.s(ApplicationLifecycleManager.N().h());
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (this.v) break block100;
                                                                                                                        if (!this.Y) break block101;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v4) {
                                                                                                                        throw AdaptiveStateManager.a(v4);
                                                                                                                    }
                                                                                                                    if (!var2_4) break block102;
                                                                                                                }
                                                                                                                catch (CustomSystemException v5) {
                                                                                                                    throw AdaptiveStateManager.a(v5);
                                                                                                                }
                                                                                                                if (this.j) break block102;
                                                                                                            }
                                                                                                            catch (CustomSystemException v6) {
                                                                                                                throw AdaptiveStateManager.a(v6);
                                                                                                            }
                                                                                                            v7 = true;
                                                                                                            break block103;
                                                                                                        }
                                                                                                        catch (CustomSystemException v8) {
                                                                                                            throw AdaptiveStateManager.a(v8);
                                                                                                        }
                                                                                                    }
                                                                                                    v7 = false;
                                                                                                }
                                                                                                var4_6 = v7;
                                                                                                try {
                                                                                                    try {
                                                                                                        if (!var3_5 || this.N) break block104;
                                                                                                    }
                                                                                                    catch (CustomSystemException v9) {
                                                                                                        throw AdaptiveStateManager.a(v9);
                                                                                                    }
                                                                                                    v10 = true;
                                                                                                    break block105;
                                                                                                }
                                                                                                catch (CustomSystemException v11) {
                                                                                                    throw AdaptiveStateManager.a(v11);
                                                                                                }
                                                                                            }
                                                                                            v10 = false;
                                                                                        }
                                                                                        var5_8 = v10;
                                                                                        break block133;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var2_4 || !this.j) break block106;
                                                                                        }
                                                                                        catch (CustomSystemException v12) {
                                                                                            throw AdaptiveStateManager.a(v12);
                                                                                        }
                                                                                        v13 = true;
                                                                                        break block107;
                                                                                    }
                                                                                    catch (CustomSystemException v14) {
                                                                                        throw AdaptiveStateManager.a(v14);
                                                                                    }
                                                                                }
                                                                                v13 = false;
                                                                            }
                                                                            var4_6 = v13;
                                                                            try {
                                                                                try {
                                                                                    if (var3_5 || !this.N) break block108;
                                                                                }
                                                                                catch (CustomSystemException v15) {
                                                                                    throw AdaptiveStateManager.a(v15);
                                                                                }
                                                                                v16 = true;
                                                                                break block109;
                                                                            }
                                                                            catch (CustomSystemException v17) {
                                                                                throw AdaptiveStateManager.a(v17);
                                                                            }
                                                                        }
                                                                        v16 = false;
                                                                    }
                                                                    var5_8 = v16;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                this.j = var2_4;
                                                                                this.N = var3_5;
                                                                                if (!this.Y || !this.z.m(0L)) break block110;
                                                                            }
                                                                            catch (CustomSystemException v18) {
                                                                                throw AdaptiveStateManager.a(v18);
                                                                            }
                                                                            v19 = this;
                                                                            if (var4_6) break block111;
                                                                        }
                                                                        catch (CustomSystemException v20) {
                                                                            throw AdaptiveStateManager.a(v20);
                                                                        }
                                                                        if (var5_8) break block111;
                                                                    }
                                                                    catch (CustomSystemException v21) {
                                                                        throw AdaptiveStateManager.a(v21);
                                                                    }
                                                                    v22 = true;
                                                                    break block112;
                                                                }
                                                                catch (CustomSystemException v23) {
                                                                    throw AdaptiveStateManager.a(v23);
                                                                }
                                                            }
                                                            v22 = false;
                                                        }
                                                        try {
                                                            v19.Y = v22;
                                                            if (!var4_6) break block113;
                                                            this.P = this.m(this.d, 1);
                                                            break block114;
                                                        }
                                                        catch (CustomSystemException v24) {
                                                            throw AdaptiveStateManager.a(v24);
                                                        }
                                                    }
                                                    try {
                                                        if (!var5_8) ** GOTO lbl206
                                                        this.P = this.m(this.d, -1);
                                                    }
                                                    catch (CustomSystemException v25) {
                                                        throw AdaptiveStateManager.a(v25);
                                                    }
                                                }
                                                try {
                                                    block116: {
                                                        try {
                                                            try {
                                                                if (this.Y) break block115;
                                                                v26 = this;
                                                                if (var4_6) break block116;
                                                            }
                                                            catch (CustomSystemException v27) {
                                                                throw AdaptiveStateManager.a(v27);
                                                            }
                                                            if (!var5_8) break block117;
                                                        }
                                                        catch (CustomSystemException v28) {
                                                            throw AdaptiveStateManager.a(v28);
                                                        }
                                                    }
                                                    v29 = true;
                                                    break block118;
                                                }
                                                catch (CustomSystemException v30) {
                                                    throw AdaptiveStateManager.a(v30);
                                                }
                                            }
                                            v29 = false;
                                        }
                                        try {
                                            v26.Y = v29;
                                            if (!var4_6) break block119;
                                            this.P = this.m(this.d, -1);
                                            break block114;
                                        }
                                        catch (CustomSystemException v31) {
                                            throw AdaptiveStateManager.a(v31);
                                        }
                                    }
                                    try {
                                        if (!var5_8) ** GOTO lbl206
                                        this.P = this.m(this.d, 1);
                                    }
                                    catch (CustomSystemException v32) {
                                        throw AdaptiveStateManager.a(v32);
                                    }
                                }
                                try {
                                    if (!var2_4) break block120;
                                    CryptoStreamProcessor.d(this.o, false);
                                    break block121;
                                }
                                catch (CustomSystemException v33) {
                                    throw AdaptiveStateManager.a(v33);
                                }
                            }
                            try {
                                if (var3_5) {
                                    CryptoStreamProcessor.d(this.G, false);
                                }
                            }
                            catch (CustomSystemException v34) {
                                throw AdaptiveStateManager.a(v34);
                            }
                        }
                        return false;
                    }
                    try {
                        try {
                            v35 = this;
                            if (!var4_6 && !var5_8) break block122;
                        }
                        catch (CustomSystemException v36) {
                            throw AdaptiveStateManager.a(v36);
                        }
                        v37 = true;
                        break block100;
                    }
                    catch (CustomSystemException v38) {
                        throw AdaptiveStateManager.a(v38);
                    }
                }
                v37 = v35.v = false;
            }
            if (this.v) {
                block131: {
                    block129: {
                        block130: {
                            block123: {
                                block128: {
                                    block126: {
                                        this.xC = null;
                                        var4_7 = new double[]{AdaptiveComputationEngine.Q(var1_1.F()), this.L.h(var1_1), AdaptiveComputationEngine.Q(var1_1.B())};
                                        try {
                                            block125: {
                                                try {
                                                    try {
                                                        try {
                                                            block124: {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (this.L.L(var4_7) || this.x(var1_1)) break block123;
                                                                                }
                                                                                catch (CustomSystemException v39) {
                                                                                    throw AdaptiveStateManager.a(v39);
                                                                                }
                                                                                if (this.m(var1_1, this.d)) break block123;
                                                                            }
                                                                            catch (CustomSystemException v40) {
                                                                                throw AdaptiveStateManager.a(v40);
                                                                            }
                                                                            this.B = this.S(var1_1, this.P);
                                                                            this.O = this.r(new double[]{var4_7[0], var4_7[2]}, this.P, this.B);
                                                                            this.L.A();
                                                                            if (this.d <= 4) break block124;
                                                                        }
                                                                        catch (CustomSystemException v41) {
                                                                            throw AdaptiveStateManager.a(v41);
                                                                        }
                                                                        if (this.T) break block124;
                                                                    }
                                                                    catch (CustomSystemException v42) {
                                                                        throw AdaptiveStateManager.a(v42);
                                                                    }
                                                                    if (this.P == this.m(this.d, -1)) break block125;
                                                                }
                                                                catch (CustomSystemException v43) {
                                                                    throw AdaptiveStateManager.a(v43);
                                                                }
                                                            }
                                                            if (this.d <= 4) break block126;
                                                        }
                                                        catch (CustomSystemException v44) {
                                                            throw AdaptiveStateManager.a(v44);
                                                        }
                                                        if (!this.T) break block126;
                                                    }
                                                    catch (CustomSystemException v45) {
                                                        throw AdaptiveStateManager.a(v45);
                                                    }
                                                    if (this.P != this.m(this.d, 1)) break block126;
                                                }
                                                catch (CustomSystemException v46) {
                                                    throw AdaptiveStateManager.a(v46);
                                                }
                                            }
                                            this.xC = new PhysicsSimulator(0.0, 0.0);
                                            this.xC.g(true);
                                            break block127;
                                        }
                                        catch (CustomSystemException v47) {
                                            throw AdaptiveStateManager.a(v47);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!(Math.abs(var1_1.F() - this.O[0]) > 0.15) && !(Math.abs(var1_1.B() - this.O[1]) > 0.15)) break block128;
                                        }
                                        catch (CustomSystemException v48) {
                                            throw AdaptiveStateManager.a(v48);
                                        }
                                        this.W(this.O, true, false, 40);
                                        break block127;
                                    }
                                    catch (CustomSystemException v49) {
                                        throw AdaptiveStateManager.a(v49);
                                    }
                                }
                                this.xC = new PhysicsSimulator(0.0, 0.0);
                                this.xC.g(true);
                                break block127;
                            }
                            try {
                                try {
                                    try {
                                        if (this.T) break block129;
                                        if (!var2_4) break block130;
                                    }
                                    catch (CustomSystemException v50) {
                                        throw AdaptiveStateManager.a(v50);
                                    }
                                    if (!this.v(var1_1, this.d)) break block130;
                                }
                                catch (CustomSystemException v51) {
                                    throw AdaptiveStateManager.a(v51);
                                }
                                CryptoStreamProcessor.d(this.o, false);
                                break block127;
                            }
                            catch (CustomSystemException v52) {
                                throw AdaptiveStateManager.a(v52);
                            }
                        }
                        try {
                            if (!var3_5) ** GOTO lbl332
                            CryptoStreamProcessor.d(this.G, false);
                        }
                        catch (CustomSystemException v53) {
                            throw AdaptiveStateManager.a(v53);
                        }
                    }
                    try {
                        try {
                            if (!var3_5 || !this.v(var1_1, this.d)) break block131;
                        }
                        catch (CustomSystemException v54) {
                            throw AdaptiveStateManager.a(v54);
                        }
                        CryptoStreamProcessor.d(this.G, false);
                        break block127;
                    }
                    catch (CustomSystemException v55) {
                        throw AdaptiveStateManager.a(v55);
                    }
                }
                try {
                    if (var2_4) {
                        CryptoStreamProcessor.d(this.o, false);
                    }
                }
                catch (CustomSystemException v56) {
                    throw AdaptiveStateManager.a(v56);
                }
            }
        }
        return false;
    }

    private static Method d(long l, long l2) {
        int n = AdaptiveStateManager.a(l, l2);
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
                clazz3 = AdaptiveStateManager.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AdaptiveStateManager.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AdaptiveStateManager.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AdaptiveStateManager.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AdaptiveStateManager.b(270099386041331L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AdaptiveStateManager.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AdaptiveStateManager.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AdaptiveStateManager.b(270099386041331L, 0L);
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

    private void W(double[] dArray, boolean bl, boolean bl2, int n) {
        this.xC = new PhysicsSimulator(dArray[0], dArray[1]);
        this.h = bl;
        this.xC.b(bl2);
        ServiceLifecycleController.c.N(this.xC);
        this.m = 0;
        this.r = n;
    }

    @Override
    public void h() {
        this.xQ = true;
    }

    @DataExchangeProtocol2090
    public void A(KB kB) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block35: {
            block37: {
                block34: {
                    block33: {
                        block32: {
                            try {
                                try {
                                    if (!ApplicationLifecycleManager.U().Y() && !ApplicationLifecycleManager.c().Y()) break block32;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveStateManager.a(customSystemException);
                                }
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                        }
                        systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        try {
                            try {
                                if (this.xQ || !this.X(systemConfigurationOrchestrator)) break block33;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            ApplicationLifecycleManager.N().D().X(1);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (this.xQ || this.V) break block34;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            if (this.h) break block34;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        this.b(systemConfigurationOrchestrator);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                }
                try {
                    block36: {
                        try {
                            try {
                                if (!this.xQ) break block35;
                                if (this.xC != null) break block36;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            if (this.x3 == null) break block37;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                    }
                    this.L.A();
                    this.K.h();
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
            }
            this.N();
            this.xQ = this.c(systemConfigurationOrchestrator);
            ConfigurationRegistry.l.m(this);
            ConfigurationRegistry.i.Z();
            return;
        }
        try {
            ConfigurationRegistry.l.E(this);
            ConfigurationRegistry.i.I();
            if (this.W(systemConfigurationOrchestrator)) {
                this.L.e();
                this.K.h();
                ConfigurationRegistry.l.m(this);
                ConfigurationRegistry.i.Z();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        try {
            if (this.S()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        try {
            if (this.q(systemConfigurationOrchestrator)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        try {
            if (this.Q(systemConfigurationOrchestrator)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        this.E(systemConfigurationOrchestrator);
        float f = Math.abs(systemConfigurationOrchestrator.q());
        this.b(systemConfigurationOrchestrator);
    }

    private boolean m(SystemConfigurationOrchestrator systemConfigurationOrchestrator, int n) {
        block53: {
            boolean bl;
            block55: {
                block54: {
                    double d2;
                    double d3;
                    block50: {
                        boolean bl2;
                        block52: {
                            block51: {
                                block47: {
                                    boolean bl3;
                                    block49: {
                                        block48: {
                                            double d4;
                                            double d5;
                                            block44: {
                                                boolean bl4;
                                                block46: {
                                                    block45: {
                                                        block41: {
                                                            boolean bl5;
                                                            block43: {
                                                                block42: {
                                                                    block38: {
                                                                        boolean bl6;
                                                                        block40: {
                                                                            block39: {
                                                                                block35: {
                                                                                    boolean bl7;
                                                                                    block37: {
                                                                                        block36: {
                                                                                            block32: {
                                                                                                boolean bl8;
                                                                                                block34: {
                                                                                                    block33: {
                                                                                                        d5 = systemConfigurationOrchestrator.F();
                                                                                                        d3 = systemConfigurationOrchestrator.B();
                                                                                                        d4 = AdaptiveComputationEngine.Q(d5);
                                                                                                        d2 = AdaptiveComputationEngine.Q(d3);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (n != 1) break block32;
                                                                                                                if (!(d5 - d4 + (d3 - d2) > 1.0)) break block33;
                                                                                                            }
                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                throw AdaptiveStateManager.a(customSystemException);
                                                                                                            }
                                                                                                            bl8 = true;
                                                                                                            break block34;
                                                                                                        }
                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                            throw AdaptiveStateManager.a(customSystemException);
                                                                                                        }
                                                                                                    }
                                                                                                    bl8 = false;
                                                                                                }
                                                                                                return bl8;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (n != 2) break block35;
                                                                                                    if (!(d4 - d5 + (d3 - d2) > 1.0)) break block36;
                                                                                                }
                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                    throw AdaptiveStateManager.a(customSystemException);
                                                                                                }
                                                                                                bl7 = true;
                                                                                                break block37;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw AdaptiveStateManager.a(customSystemException);
                                                                                            }
                                                                                        }
                                                                                        bl7 = false;
                                                                                    }
                                                                                    return bl7;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (n != 3) break block38;
                                                                                        if (!(d4 - d5 + (d2 - d3) > 1.0)) break block39;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw AdaptiveStateManager.a(customSystemException);
                                                                                    }
                                                                                    bl6 = true;
                                                                                    break block40;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw AdaptiveStateManager.a(customSystemException);
                                                                                }
                                                                            }
                                                                            bl6 = false;
                                                                        }
                                                                        return bl6;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (n != 4) break block41;
                                                                            if (!(d5 - d4 + (d2 - d3) > 1.0)) break block42;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw AdaptiveStateManager.a(customSystemException);
                                                                        }
                                                                        bl5 = true;
                                                                        break block43;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw AdaptiveStateManager.a(customSystemException);
                                                                    }
                                                                }
                                                                bl5 = false;
                                                            }
                                                            return bl5;
                                                        }
                                                        try {
                                                            try {
                                                                if (n != 6) break block44;
                                                                if (!(d5 - d4 > 0.5)) break block45;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AdaptiveStateManager.a(customSystemException);
                                                            }
                                                            bl4 = true;
                                                            break block46;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AdaptiveStateManager.a(customSystemException);
                                                        }
                                                    }
                                                    bl4 = false;
                                                }
                                                return bl4;
                                            }
                                            try {
                                                try {
                                                    if (n != 8) break block47;
                                                    if (!(d4 - d5 > 0.5)) break block48;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AdaptiveStateManager.a(customSystemException);
                                                }
                                                bl3 = true;
                                                break block49;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AdaptiveStateManager.a(customSystemException);
                                            }
                                        }
                                        bl3 = false;
                                    }
                                    return bl3;
                                }
                                try {
                                    try {
                                        if (n != 7) break block50;
                                        if (!(d3 - d2 > 0.5)) break block51;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdaptiveStateManager.a(customSystemException);
                                    }
                                    bl2 = true;
                                    break block52;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveStateManager.a(customSystemException);
                                }
                            }
                            bl2 = false;
                        }
                        return bl2;
                    }
                    try {
                        try {
                            if (n != 5) break block53;
                            if (!(d2 - d3 > 0.5)) break block54;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        bl = true;
                        break block55;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x839;
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
                throw new RuntimeException("a/xo", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveStateManager.gb[n2] = n3;
        }
        return gb[n2];
    }

    private float[] n(SystemConfigurationOrchestrator systemConfigurationOrchestrator, boolean bl) {
        int n;
        float[] fArray;
        double d2;
        double d3 = systemConfigurationOrchestrator.q();
        double d4 = systemConfigurationOrchestrator.f();
        double d5 = systemConfigurationOrchestrator.n();
        double d6 = d3;
        double d7 = d3;
        if (this.d == 6) {
            d6 = 135.0 + 20.0 * (this.Z[1] - d5);
            d7 = 45.0 + 20.0 * (this.Z[1] - d5);
        } else if (this.d == 8) {
            d6 = -45.0 - 20.0 * (this.Z[1] - d5);
            d7 = -135.0 - 20.0 * (this.Z[1] - d5);
        } else if (this.d == 7) {
            d6 = -135.0 - 20.0 * (this.Z[0] - d4);
            d7 = 135.0 + 20.0 * (d4 - this.Z[0]);
        } else if (this.d == 5) {
            d6 = 45.0 + 20.0 * (this.Z[0] - d4);
            d7 = -45.0 - 20.0 * (d4 - this.Z[0]);
        }
        try {
            d2 = bl ? d6 : d7;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        d3 = d2;
        try {
            float[] fArray2 = new float[2];
            fArray2[0] = (float)d3;
            float[] fArray3 = fArray2;
            fArray = fArray2;
            int n2 = 1;
            n = this.x.m(300L) ? 80 : 78;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        fArray3[n2] = n;
        return fArray;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d5' || c == 'T' || c == 'b' || c == '\u00d0') {
                field = AdaptiveStateManager.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AdaptiveStateManager.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean m(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        double d2 = systemConfigurationOrchestrator.F();
        double d3 = systemConfigurationOrchestrator.B();
        if (this.d == 1) {
            d2 += 0.2;
            d3 += 0.2;
        } else if (this.d == 2) {
            d2 -= 0.2;
            d3 += 0.2;
        } else if (this.d == 3) {
            d2 -= 0.2;
            d3 -= 0.2;
        } else if (this.d == 4) {
            d2 += 0.2;
            d3 -= 0.2;
        } else if (this.d == 6) {
            d2 += 0.25;
            d3 = this.Z[1];
        } else if (this.d == 8) {
            d2 -= 0.25;
            d3 = this.Z[1];
        } else if (this.d == 7) {
            d2 = this.Z[0];
            d3 += 0.25;
        } else if (this.d == 5) {
            d2 = this.Z[0];
            d3 -= 0.25;
        } else {
            return true;
        }
        d2 = AdaptiveComputationEngine.Q(d2);
        double d4 = this.L.h(systemConfigurationOrchestrator);
        d3 = AdaptiveComputationEngine.Q(d3);
        try {
            bl = !this.L.O(d2, d4, d3);
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void c(ResourceAllocationManager2527 resourceAllocationManager2527) {
        try {
            if (this.xQ) {
                this.K.X(resourceAllocationManager2527);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
    }

    private float t(float[] fArray, int n) {
        return (float)Math.min(2.0 + this.L.U(_Y.T(), fArray[0]) / (double)n, 12.0);
    }

    private boolean Q(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        if (this.x.m(800L)) {
            double[] dArray = this.c(systemConfigurationOrchestrator, this.d);
            this.Z = this.r(new double[]{dArray[0], dArray[2]}, this.d, this.T);
            this.x3 = this.n(systemConfigurationOrchestrator, this.T);
            this.L.b(this.x3, this.t(this.x3, 15));
            this.W(this.Z, true, false, 40);
            this.xb = true;
            this.x.m();
            return true;
        }
        return false;
    }

    private boolean k() {
        block9: {
            block10: {
                try {
                    try {
                        try {
                            if (this.L.R == null) break block9;
                            if (!(this.L.U(_Y.T(), this.L.R.a) > 4.0)) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        if (!this.V) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
            }
            try {
                if (this.V) {
                    this.L.e();
                    this.V = false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveStateManager.a(customSystemException);
            }
        }
        return false;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AdaptiveStateManager.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                AdaptiveStateManager.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveStateManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field c(long l, long l2) {
        int n = AdaptiveStateManager.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = AdaptiveStateManager.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AdaptiveStateManager.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AdaptiveStateManager.a(clazz3, string2, clazz2)) != null) {
                    AdaptiveStateManager.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AdaptiveStateManager.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AdaptiveStateManager.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AdaptiveStateManager.b(270099386041331L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AdaptiveStateManager.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AdaptiveStateManager.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean S() {
        boolean bl;
        block5: {
            block4: {
                boolean bl2 = this.k();
                boolean bl3 = this.A();
                try {
                    try {
                        if (!bl2 && !bl3) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean x(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        double d2;
        Object object;
        double d3 = -0.2;
        if (GeometryCalculator.C() >= 15) {
            object = systemConfigurationOrchestrator.L();
        } else {
            Object object2 = systemConfigurationOrchestrator.L();
            object = ((oQ)object2).h();
        }
        double d4 = systemConfigurationOrchestrator.G();
        try {
            d2 = GeometryCalculator.C() >= 50 ? 1.0 : -1.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        double d5 = d2;
        double d6 = systemConfigurationOrchestrator.o();
        oQ oQ2 = ((oQ)object).B(d3, 0.0, d3).s(d4, d5, d6);
        int n = ApplicationLifecycleManager.c().v(systemConfigurationOrchestrator, oQ2).size();
        try {
            bl = n == 0;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        return bl;
    }

    public AdaptiveStateManager(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = bb ^ 0x429310A9041BL;
        super(contextualExecutionFramework, string);
        this.A = NumericPrecisionTransformer.b(this, (String)((Object)AdaptiveStateManager.c("E", (int)AdaptiveStateManager.a("k", (int)23842, (long)(0x3DAF451DD6430321L ^ l)), (long)-3009801491531460214L, (long)l)), (String)((Object)AdaptiveStateManager.c("E", (int)AdaptiveStateManager.a("k", (int)14434, (long)(0xD2B9213AF946662L ^ l)), (long)-3009801491531460214L, (long)l)), "", 1.0, 2.0, 4.0, (String)((Object)AdaptiveStateManager.c("E", (int)AdaptiveStateManager.a("k", (int)1445, (long)(0x48695A461BB8DBA2L ^ l)), (long)-3009801491531460214L, (long)l)));
        this.L = (CryptographicTokenGenerator)this.n();
        this.K = new DataStreamInterceptor((ContextualExecutionFramework)this.n(), (String)((Object)AdaptiveStateManager.c("E", (int)AdaptiveStateManager.a("k", (int)17043, (long)(0x140C0A3E6CC39C91L ^ l)), (long)-3009801491531460214L, (long)l)));
        this.xC = null;
        this.d = 0;
        this.x = new NetworkConfigManager();
        this.z = new NetworkConfigManager();
        this.xr = new ArrayList<Integer>(Arrays.asList(5, 4, 6, 1, 7, 2, 8, 3));
        this.j = false;
        this.N = false;
        this.e = false;
        this.v = false;
        this.xb = false;
        this.l = false;
        this.h = false;
        this.V = false;
        this.n = new ArrayList();
        this.Y = true;
        this.xy = ApplicationLifecycleManager.N().w();
        this.G = ApplicationLifecycleManager.N().h();
        this.o = ApplicationLifecycleManager.N().y();
        this.N(this.A);
    }

    @Override
    public void v() {
        this.L.A();
        this.N();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AdaptiveStateManager.bb = MultiContainerRegistry.a(8426704656321794970L, -308214835067331418L, MethodHandles.lookup().lookupClass()).a(200401324812353L);
                AdaptiveStateManager.kb = new Object[5];
                AdaptiveStateManager.lb = new String[5];
                AdaptiveStateManager.a();
                AdaptiveStateManager.hb = new HashMap<K, V>(13);
                var0 = AdaptiveStateManager.bb ^ 128409726682641L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00b8\u00fd\u00fb\u001a\u001a\u00aa\u008fXd\u00bd\u00c9\u00ec\u00c9\u00f9\u00bel\u000e\u00c8\u00d8\u0016\u0010\u0006\u00b7\u00f7";
                var7_6 = "\u00b8\u00fd\u00fb\u001a\u001a\u00aa\u008fXd\u00bd\u00c9\u00ec\u00c9\u00f9\u00bel\u000e\u00c8\u00d8\u0016\u0010\u0006\u00b7\u00f7".length();
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
                    var6_5 = "\u009bk5\u000b\u009a\u0015\u0083\u001b&\u00df\u009c1[\u0012P\f";
                    var7_6 = "\u009bk5\u000b\u009a\u0015\u0083\u001b&\u00df\u009c1[\u0012P\f".length();
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
        AdaptiveStateManager.fb = var8_3;
        AdaptiveStateManager.gb = new Integer[5];
    }

    public float D(double[] dArray, double[] dArray2, int n) {
        double[] dArray3 = this.L.j(new double[]{dArray[0], 0.0, dArray[1]}, (int)(_Y.V(dArray[0], 0.0, dArray[1], dArray2[0], 0.0, dArray2[1]) + (double)this.L.c(1)), n);
        float f = (float)((dArray3[0] - dArray[0]) * (dArray2[1] - dArray[1]) - (dArray3[2] - dArray[1]) * (dArray2[0] - dArray[0]));
        return f;
    }

    private boolean v(SystemConfigurationOrchestrator systemConfigurationOrchestrator, int n) {
        boolean bl;
        double d2;
        Object object;
        boolean bl2 = DynamicContextBroker.s(ApplicationLifecycleManager.N().r());
        if (n > 4) {
            double d3 = systemConfigurationOrchestrator.F();
            double d4 = systemConfigurationOrchestrator.B();
            this.l = bl2;
            if (n == 6) {
                d3 += -0.15;
                d4 = this.Z[1];
            } else if (n == 8) {
                d3 -= -0.15;
                d4 = this.Z[1];
            } else if (n == 7) {
                d3 = this.Z[0];
                d4 += -0.15;
            } else if (n == 5) {
                d3 = this.Z[0];
                d4 -= -0.15;
            }
            d3 = AdaptiveComputationEngine.Q(d3);
            double d5 = this.L.h(systemConfigurationOrchestrator);
            d4 = AdaptiveComputationEngine.Q(d4);
            return this.L.O(d3, d5, d4);
        }
        double d6 = -0.16;
        this.l = bl2;
        if (GeometryCalculator.C() >= 15) {
            object = systemConfigurationOrchestrator.L();
        } else {
            Object object2 = systemConfigurationOrchestrator.L();
            object = ((oQ)object2).h();
        }
        double d7 = systemConfigurationOrchestrator.G();
        try {
            d2 = GeometryCalculator.C() >= 50 ? 1.0 : -1.0;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        double d8 = d2;
        double d9 = systemConfigurationOrchestrator.o();
        oQ oQ2 = ((oQ)object).B(d6, 0.0, d6).s(d7, d8, d9);
        int n2 = ApplicationLifecycleManager.c().v(systemConfigurationOrchestrator, oQ2).size();
        try {
            bl = n2 == 0;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        return bl;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private double[] c(SystemConfigurationOrchestrator systemConfigurationOrchestrator, int n) {
        double d2;
        double[] dArray;
        try {
            double[] dArray2 = new double[3];
            dArray2[0] = AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.F());
            double[] dArray3 = dArray2;
            dArray = dArray2;
            int n2 = 1;
            d2 = systemConfigurationOrchestrator.x() > 0.0 ? this.L.h(systemConfigurationOrchestrator) + 1.0 : this.L.h(systemConfigurationOrchestrator);
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        dArray3[n2] = d2;
        dArray[2] = AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.B());
        double[] dArray4 = dArray;
        if (this.L.L(dArray4) && this.L.L(dArray4 = this.L.j(dArray4, -1, n)) && this.L.L(dArray4 = this.L.j(dArray4, 1, this.m(n, 2)))) {
            dArray4 = this.L.j(dArray4, -2, this.m(n, 2));
        }
        return dArray4;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private int m(int n, int n2) {
        int n3;
        try {
            n3 = this.xr.indexOf(n) + n2 < 0 ? (this.xr.indexOf(n) + n2) % this.xr.size() + this.xr.size() : (this.xr.indexOf(n) + n2) % this.xr.size();
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        int n4 = n3;
        return this.xr.get(n4);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AdaptiveStateManager.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AdaptiveStateManager.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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
                n3 = 57;
                break;
            }
            case 1: {
                n3 = 34;
                break;
            }
            case 2: {
                n3 = 22;
                break;
            }
            case 3: {
                n3 = 53;
                break;
            }
            case 4: {
                n3 = 31;
                break;
            }
            case 5: {
                n3 = 9;
                break;
            }
            case 6: {
                n3 = 30;
                break;
            }
            case 7: {
                n3 = 21;
                break;
            }
            case 8: {
                n3 = 3;
                break;
            }
            case 9: {
                n3 = 37;
                break;
            }
            case 10: {
                n3 = 61;
                break;
            }
            case 11: {
                n3 = 63;
                break;
            }
            case 12: {
                n3 = 50;
                break;
            }
            case 13: {
                n3 = 6;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 52;
                break;
            }
            case 16: {
                n3 = 47;
                break;
            }
            case 17: {
                n3 = 42;
                break;
            }
            case 18: {
                n3 = 38;
                break;
            }
            case 19: {
                n3 = 45;
                break;
            }
            case 20: {
                n3 = 2;
                break;
            }
            case 21: {
                n3 = 43;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 14;
                break;
            }
            case 24: {
                n3 = 32;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 40;
                break;
            }
            case 27: {
                n3 = 8;
                break;
            }
            case 28: {
                n3 = 16;
                break;
            }
            case 29: {
                n3 = 24;
                break;
            }
            case 30: {
                n3 = 18;
                break;
            }
            case 31: {
                n3 = 33;
                break;
            }
            case 32: {
                n3 = 4;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 29;
                break;
            }
            case 35: {
                n3 = 28;
                break;
            }
            case 36: {
                n3 = 44;
                break;
            }
            case 37: {
                n3 = 7;
                break;
            }
            case 38: {
                n3 = 60;
                break;
            }
            case 39: {
                n3 = 55;
                break;
            }
            case 40: {
                n3 = 35;
                break;
            }
            case 41: {
                n3 = 59;
                break;
            }
            case 42: {
                n3 = 0;
                break;
            }
            case 43: {
                n3 = 10;
                break;
            }
            case 44: {
                n3 = 54;
                break;
            }
            case 45: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 51;
                break;
            }
            case 47: {
                n3 = 5;
                break;
            }
            case 48: {
                n3 = 25;
                break;
            }
            case 49: {
                n3 = 62;
                break;
            }
            case 50: {
                n3 = 19;
                break;
            }
            case 51: {
                n3 = 15;
                break;
            }
            case 52: {
                n3 = 58;
                break;
            }
            case 53: {
                n3 = 13;
                break;
            }
            case 54: {
                n3 = 23;
                break;
            }
            case 55: {
                n3 = 48;
                break;
            }
            case 56: {
                n3 = 11;
                break;
            }
            case 57: {
                n3 = 27;
                break;
            }
            case 58: {
                n3 = 36;
                break;
            }
            case 59: {
                n3 = 20;
                break;
            }
            case 60: {
                n3 = 12;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 17;
                break;
            }
            default: {
                n3 = 49;
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
        AdaptiveStateManager.lb[n4] = new String(cArray);
        return n4;
    }

    public boolean S(SystemConfigurationOrchestrator systemConfigurationOrchestrator, int n) {
        boolean bl;
        if (n > 4) {
            boolean bl2;
            double d2 = _Y.T();
            double[] dArray = this.K(n);
            try {
                bl2 = this.L.U(d2, dArray[0]) <= this.L.U(d2, dArray[1]);
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveStateManager.a(customSystemException);
            }
            return bl2;
        }
        try {
            bl = !this.T;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
        return bl;
    }

    private void q(float[] fArray, float f) {
        block3: {
            block2: {
                try {
                    if (this.L.R != null) break block2;
                    this.L.R = new Ya(fArray[0], fArray[1]);
                    this.L.R.L(Math.min(Math.max(2.0f, f), 12.0f));
                    this.L.R.F(true);
                    this.L.R.N(0.0f);
                    this.L.R.J(true);
                    this.L.R.i(true);
                    this.L.R.q(true);
                    ConfigurationCalibrator.b.W(this.L.R);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
            }
            this.L.R.L(Math.min(Math.max(2.0f, f), 12.0f));
            this.L.R.v(fArray[0], fArray[1]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        double[] dArray;
        block38: {
            block39: {
                block35: {
                    double[] dArray2;
                    block37: {
                        double[] dArray3;
                        block36: {
                            int n;
                            double d2;
                            double d3;
                            double d4;
                            block34: {
                                d4 = AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.F());
                                d3 = AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.B());
                                d2 = this.L.h(systemConfigurationOrchestrator);
                                try {
                                    if (!this.L.v(systemConfigurationOrchestrator.a())) {
                                        this.R = null;
                                        this.xv = 0;
                                        return true;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveStateManager.a(customSystemException);
                                }
                                n = this.L.y();
                                try {
                                    try {
                                        if (this.d == 0 || n == this.d) break block34;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdaptiveStateManager.a(customSystemException);
                                    }
                                    this.R = null;
                                    this.xv = 0;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveStateManager.a(customSystemException);
                                }
                            }
                            this.d = n;
                            dArray = new double[]{d4, d2, d3};
                            dArray3 = this.L.j(dArray, 1, this.d);
                            dArray2 = this.L.j(dArray, 2, this.d);
                            try {
                                try {
                                    try {
                                        if (this.R != null || !systemConfigurationOrchestrator.j()) break block35;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdaptiveStateManager.a(customSystemException);
                                    }
                                    if (!this.L.L(dArray)) break block36;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveStateManager.a(customSystemException);
                                }
                                this.R = dArray;
                                return true;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                        }
                        try {
                            if (!this.L.L(dArray3)) break block37;
                            this.R = dArray3;
                            return true;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                    }
                    try {
                        if (!this.L.L(dArray2)) return true;
                        this.R = dArray2;
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                if (this.R == null) return true;
                                if (!((double)this.xv >= (Double)this.A.J())) break block38;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            this.T = this.S(systemConfigurationOrchestrator, this.d);
                            this.Z = this.r(new double[]{this.R[0], this.R[2]}, this.d, this.T);
                            this.t = systemConfigurationOrchestrator.a();
                            if (DynamicContextBroker.s(ApplicationLifecycleManager.N().r())) break block39;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        if (systemConfigurationOrchestrator.M().K()) break block39;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                    this.W(this.Z, true, false, 40);
                    this.x3 = this.n(systemConfigurationOrchestrator, this.T);
                    this.L.b(this.x3, this.t(this.x3, 15));
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
            }
            this.xv = 0;
            this.R = null;
            this.x.m();
            return false;
        }
        if (!this.L.L(this.R)) {
            boolean bl;
            block40: {
                ++this.xv;
                double[] dArray4 = this.L.j(this.R, 1, this.d);
                bl = this.L.L(dArray4);
                try {
                    try {
                        if (!bl || !((double)this.xv < (Double)this.A.J())) break block40;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                    this.R = dArray4;
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
            }
            try {
                if (bl) return true;
                this.R = null;
                this.xv = 0;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveStateManager.a(customSystemException);
            }
        }
        try {
            if (!this.L.P(this.R, dArray, this.d, (Double)this.A.J(), this.xv)) return true;
            this.R = null;
            this.xv = 0;
            return true;
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveStateManager.a(customSystemException);
        }
    }

    private boolean W(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block18: {
            block16: {
                block17: {
                    try {
                        if (!ConfigurationRegistry.O.z(this.L)) {
                            this.xQ = true;
                            CryptoStreamProcessor.A();
                            return true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                    try {
                        if (!this.w(systemConfigurationOrchestrator)) {
                            this.xQ = true;
                            CryptoStreamProcessor.N();
                            return true;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                    try {
                        try {
                            try {
                                if (DynamicContextBroker.s(this.xy)) break block16;
                                if (systemConfigurationOrchestrator.M().K()) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveStateManager.a(customSystemException);
                            }
                            if (this.m(systemConfigurationOrchestrator)) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveStateManager.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveStateManager.a(customSystemException);
                    }
                }
                CryptoStreamProcessor.N();
                this.xQ = true;
                return true;
            }
            try {
                try {
                    if (ResourceAllocationManager.b()) break block18;
                    this.n = this.L.u(this.n);
                    if (this.L.z(this.n) < 10) break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveStateManager.a(customSystemException);
                }
                CryptoStreamProcessor.N();
                this.xQ = true;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveStateManager.a(customSystemException);
            }
        }
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveStateManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AdaptiveStateManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

