/*
 * Decompiled with CFR 0.152.
 */
package com.resource.dynamic;

import a.KB;
import a._Y;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.event.EventTrigger;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.configuration.management.ConfigurationParameterResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.service.ServiceLifecycleController;
import com.data.streaming.DataStreamInterceptor;
import com.exception.system.CustomSystemException;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.numeric.precision.NumericPrecisionTransformer;
import com.physics.simulation.PhysicsSimulator;
import com.resource.allocation.ResourceAllocationManager2527;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.cipher.CryptographicTransformer1102;
import com.security.streaming.CryptoStreamProcessor;
import com.security.tokens.CryptographicTokenGenerator;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.ExecutionStateTracker;
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DynamicResourceAllocator
extends ContextTransformationEngine<CryptographicTokenGenerator> {
    private LightweightExecutionContext A;
    ExecutionStateTracker T;
    private static final long bb;
    private static final Integer[] gb;
    ConnectionPoolOrchestrator1192 K;
    private final AuthenticationStateTracker O;
    private ArrayList<Integer> Z;
    private final NumericPrecisionTransformer j;
    private NetworkConfigManager ds;
    PhysicsSimulator P;
    private NetworkConfigManager N;
    double[] n;
    ConnectionPoolOrchestrator1192 V;
    private static final Map hb;
    ConnectionPoolOrchestrator1192 d;
    private int dQ;
    private ArrayList<double[]> x;
    private static final Object[] kb;
    CryptographicTokenGenerator L;
    private double[] l;
    private boolean dh;
    DataStreamInterceptor t;
    private int B;
    private boolean R;
    private double[] v;
    private int m;
    private int r;
    ConnectionPoolOrchestrator1192 Y;
    boolean z;
    private boolean G;
    private NetworkConfigManager h;
    private static final long[] fb;
    private static final String[] lb;
    float[] o;
    private final NumericPrecisionTransformer e;

    @DataExchangeProtocol2090
    public void u(EventTrigger eventTrigger) {
        try {
            if (this.z) {
                this.t.S(eventTrigger);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
    }

    private static Field c(long l, long l2) {
        int n = DynamicResourceAllocator.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicResourceAllocator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicResourceAllocator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicResourceAllocator.a(clazz3, string2, clazz2)) != null) {
                    DynamicResourceAllocator.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicResourceAllocator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicResourceAllocator.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicResourceAllocator.b(631071114574290L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicResourceAllocator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(long l, long l2) {
        int n = DynamicResourceAllocator.a(l, l2);
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
                clazz3 = DynamicResourceAllocator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicResourceAllocator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicResourceAllocator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicResourceAllocator.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicResourceAllocator.b(631071114574290L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicResourceAllocator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicResourceAllocator.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicResourceAllocator.b(631071114574290L, 0L);
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

    private boolean A(int n) {
        return false;
    }

    private boolean B(SystemConfigurationOrchestrator systemConfigurationOrchestrator, double[] dArray) {
        double d2 = dArray[0];
        double d3 = dArray[2];
        double d4 = 0.8;
        if (this.m == 6) {
            boolean bl;
            double d5 = systemConfigurationOrchestrator.F() - (d2 += d4);
            try {
                bl = d5 >= -0.05;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
            return bl;
        }
        if (this.m == 8) {
            boolean bl;
            double d6 = systemConfigurationOrchestrator.F() - (d2 -= 1.0 - d4);
            try {
                bl = d6 <= 0.05;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
            return bl;
        }
        if (this.m == 7) {
            boolean bl;
            double d7 = systemConfigurationOrchestrator.B() - (d3 += d4);
            try {
                bl = d7 >= -0.05;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
            return bl;
        }
        if (this.m == 5) {
            boolean bl;
            double d8 = systemConfigurationOrchestrator.B() - (d3 -= 1.0 - d4);
            try {
                bl = d8 <= 0.05;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
            return bl;
        }
        return false;
    }

    private boolean y(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        block13: {
            block12: {
                double d2 = systemConfigurationOrchestrator.F();
                double d3 = systemConfigurationOrchestrator.B();
                if (this.m == 6) {
                    d2 += 0.15;
                } else if (this.m == 8) {
                    d2 -= 0.15;
                } else if (this.m == 7) {
                    d3 += 0.15;
                } else if (this.m == 5) {
                    d3 -= 0.15;
                } else {
                    return true;
                }
                d2 = AdaptiveComputationEngine.Q(d2);
                double d4 = this.L.h(systemConfigurationOrchestrator);
                d3 = AdaptiveComputationEngine.Q(d3);
                try {
                    try {
                        if (this.L.O(d2, d4, d3) || !systemConfigurationOrchestrator.j()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                    bl = true;
                    break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void r(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block9: {
            long l = bb ^ 0x4EC298A64839L;
            double[] dArray = this.t();
            try {
                block8: {
                    try {
                        try {
                            try {
                                if (this.n == null || AdaptiveComputationEngine.Q(this.n[0]) != AdaptiveComputationEngine.Q(dArray[0])) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicResourceAllocator.a(customSystemException);
                            }
                            if (AdaptiveComputationEngine.Q(this.n[1]) != AdaptiveComputationEngine.Q(dArray[1])) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        if (AdaptiveComputationEngine.Q(this.n[2]) == AdaptiveComputationEngine.Q(dArray[2])) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                }
                this.n = dArray;
                DynamicResourceAllocator.c("\u00dd", (Object)this.L, (Object)this.n, (float)this.L.J(this.m), (int)this.m, (Object)this.x.get(this.x.size() - 1), (long)1724898462198851819L, (long)l);
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3172;
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
                throw new RuntimeException("a/xx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicResourceAllocator.gb[n2] = n3;
        }
        return gb[n2];
    }

    private double[] S(boolean bl) {
        double[] dArray;
        block7: {
            block4: {
                int n;
                double[] dArray2;
                CryptographicTokenGenerator cryptographicTokenGenerator;
                block6: {
                    block5: {
                        try {
                            try {
                                if (!bl) break block4;
                                cryptographicTokenGenerator = this.L;
                                dArray2 = this.x.get(this.x.size() - 1);
                                if (!this.dh) break block5;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicResourceAllocator.a(customSystemException);
                            }
                            n = 4;
                            break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                    }
                    n = 3;
                }
                dArray = cryptographicTokenGenerator.j(dArray2, n, this.m);
                break block7;
            }
            dArray = this.L.j(this.x.get(this.x.size() - 1), 2, this.m);
        }
        double[] dArray3 = dArray;
        return this.h(new double[]{dArray3[0], dArray3[2]});
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

    private void k(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block18: {
            int n;
            block19: {
                n = this.x.size();
                try {
                    if (n == 0) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
                try {
                    try {
                        try {
                            if (!systemConfigurationOrchestrator.j()) break block18;
                            if (this.B != 0) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        if (this.B != 0) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                    if (!systemConfigurationOrchestrator.o()) break block18;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
            }
            double[] dArray = this.x.get(n - 1);
            try {
                if (this.B(systemConfigurationOrchestrator, dArray)) {
                    CryptoStreamProcessor.d(this.d, true);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
        }
        try {
            if (this.d.X()) {
                CryptoStreamProcessor.d(this.d, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
        try {
            if (!this.K.X()) {
                CryptoStreamProcessor.d(this.K, true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
    }

    @DataExchangeProtocol2090
    public void v(ResourceAllocationManager2527 resourceAllocationManager2527) {
        try {
            if (this.z) {
                this.t.X(resourceAllocationManager2527);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
    }

    private boolean d(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block12: {
            int n;
            block13: {
                block11: {
                    n = this.L.l();
                    try {
                        try {
                            if (n != -1 && this.L.c(1) >= 5) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                }
                try {
                    if (this.A == null || systemConfigurationOrchestrator.a().equals(this.A)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
                int n2 = this.L.Z(systemConfigurationOrchestrator, this.A);
                try {
                    if (n2 == -1) break block13;
                    this.L.Q(n2);
                    break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
            }
            try {
                if (systemConfigurationOrchestrator.l().v() != n) {
                    this.L.Q(n);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
        }
        return true;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DynamicResourceAllocator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicResourceAllocator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean V(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        block6: {
            boolean bl2;
            block8: {
                block7: {
                    try {
                        try {
                            if (this.m % 2 != 0) break block6;
                            if (!(Math.abs(systemConfigurationOrchestrator.G()) >= 0.1)) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        bl2 = true;
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        try {
            bl = Math.abs(systemConfigurationOrchestrator.o()) >= 0.1;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
        return bl;
    }

    public boolean a(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        block32: {
            block31: {
                boolean bl2;
                boolean bl3;
                block33: {
                    boolean bl4;
                    int n;
                    block28: {
                        boolean bl5;
                        block30: {
                            block29: {
                                boolean bl6;
                                NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                                block27: {
                                    block26: {
                                        block25: {
                                            networkPacketInterceptor1107 = ConfigurationCalibrator.b.m();
                                            try {
                                                block24: {
                                                    try {
                                                        try {
                                                            if (networkPacketInterceptor1107.Y() || !networkPacketInterceptor1107.q().equals(ObjectValidator.Y())) break block24;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw DynamicResourceAllocator.a(customSystemException);
                                                        }
                                                        if (this.x.size() >= 1) break block25;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DynamicResourceAllocator.a(customSystemException);
                                                    }
                                                }
                                                return false;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DynamicResourceAllocator.a(customSystemException);
                                            }
                                        }
                                        double[] dArray = this.x.get(this.x.size() - 1);
                                        double[] dArray2 = new double[]{AdaptiveComputationEngine.Q((double)networkPacketInterceptor1107.p()), AdaptiveComputationEngine.Q((double)networkPacketInterceptor1107.b()), AdaptiveComputationEngine.Q((double)networkPacketInterceptor1107.m())};
                                        try {
                                            try {
                                                try {
                                                    if (dArray[0] != dArray2[0] || dArray[1] != dArray2[1]) break block26;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DynamicResourceAllocator.a(customSystemException);
                                                }
                                                if (dArray[2] != dArray2[2]) break block26;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DynamicResourceAllocator.a(customSystemException);
                                            }
                                            bl6 = true;
                                            break block27;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DynamicResourceAllocator.a(customSystemException);
                                        }
                                    }
                                    bl6 = false;
                                }
                                bl3 = bl6;
                                n = networkPacketInterceptor1107.j();
                                try {
                                    try {
                                        try {
                                            if (this.B == 0 || this.x.size() != 4) break block28;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DynamicResourceAllocator.a(customSystemException);
                                        }
                                        if (n != 1) break block29;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DynamicResourceAllocator.a(customSystemException);
                                    }
                                    bl5 = true;
                                    break block30;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                            }
                            bl5 = false;
                        }
                        bl2 = bl5;
                        break block33;
                    }
                    try {
                        bl4 = n > 1;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                    bl2 = bl4;
                }
                try {
                    try {
                        if (!bl3 || !bl2) break block31;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                    bl = true;
                    break block32;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void M() {
        this.z = true;
        this.r = 0;
        this.P = null;
        this.h.m();
        this.o = null;
        this.R = false;
        this.m = 0;
        this.x.clear();
        this.A = null;
    }

    private void p(double[] dArray, boolean bl) {
        this.P = new PhysicsSimulator(dArray[0], dArray[1]);
        this.P.b(bl);
        this.P.s(true);
        ServiceLifecycleController.c.N(this.P);
        this.h.m();
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
            throw new RuntimeException("a/xx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean l(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        double[] dArray;
        block32: {
            block29: {
                double[] dArray2;
                block31: {
                    double[] dArray3;
                    block30: {
                        int n;
                        double d2;
                        double d3;
                        double d4;
                        block28: {
                            d4 = AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.F());
                            d3 = AdaptiveComputationEngine.Q(systemConfigurationOrchestrator.B());
                            d2 = this.L.h(systemConfigurationOrchestrator);
                            try {
                                if (!this.L.v(systemConfigurationOrchestrator.a())) {
                                    this.v = null;
                                    this.dQ = 0;
                                    return true;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicResourceAllocator.a(customSystemException);
                            }
                            n = this.L.y();
                            try {
                                try {
                                    if (this.m == 0 || n == this.m) break block28;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                                this.v = null;
                                this.dQ = 0;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicResourceAllocator.a(customSystemException);
                            }
                        }
                        this.m = n;
                        dArray = new double[]{d4, d2, d3};
                        dArray3 = this.L.j(dArray, 1, this.m);
                        dArray2 = this.L.j(dArray, 2, this.m);
                        try {
                            try {
                                try {
                                    if (this.v != null || !systemConfigurationOrchestrator.j()) break block29;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                                if (!this.L.L(dArray)) break block30;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicResourceAllocator.a(customSystemException);
                            }
                            this.v = dArray;
                            return true;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                    }
                    try {
                        if (!this.L.L(dArray3)) break block31;
                        this.v = dArray3;
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                }
                try {
                    if (!this.L.L(dArray2)) return true;
                    this.v = dArray2;
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
            }
            try {
                if (this.v == null) return true;
                if (!((double)this.dQ >= (Double)this.j.J())) break block32;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
            this.x.add(this.v);
            this.dQ = 0;
            double[] dArray4 = this.L.T(this.L.j(this.v, -1, this.m), 0.0, this.m);
            this.p(this.h(new double[]{dArray4[0], dArray4[2]}), false);
            this.A = systemConfigurationOrchestrator.a();
            this.v = null;
            this.dh = true;
            return false;
        }
        if (!this.L.L(this.v)) {
            boolean bl;
            block33: {
                ++this.dQ;
                double[] dArray5 = this.L.j(this.v, 1, this.m);
                bl = this.L.L(dArray5);
                try {
                    try {
                        if (!bl || !((double)this.dQ < (Double)this.j.J())) break block33;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                    this.v = dArray5;
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
            }
            try {
                if (bl) return true;
                this.v = null;
                this.dQ = 0;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
        }
        try {
            if (!this.L.P(this.v, dArray, this.m, (Double)this.j.J(), this.dQ)) return true;
            this.v = null;
            this.dQ = 0;
            return true;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
    }

    private boolean x(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        double d2 = this.x.get(this.x.size() - 1)[0];
        double d3 = this.x.get(this.x.size() - 1)[2];
        double d4 = 1.0;
        double d5 = 0.1;
        if (this.m == 6) {
            boolean bl;
            block21: {
                block20: {
                    d3 += 0.6;
                    double d6 = systemConfigurationOrchestrator.F() - (d2 += d4);
                    try {
                        try {
                            if (!(d6 < -d5) || !(Math.abs(systemConfigurationOrchestrator.B() - d3) <= 0.15)) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        bl = true;
                        break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        if (this.m == 8) {
            boolean bl;
            block23: {
                block22: {
                    d3 += 0.4;
                    double d7 = systemConfigurationOrchestrator.F() - (d2 -= 1.0 - d4);
                    try {
                        try {
                            if (!(d7 > d5) || !(Math.abs(systemConfigurationOrchestrator.B() - d3) <= 0.15)) break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        bl = true;
                        break block23;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        if (this.m == 7) {
            boolean bl;
            block25: {
                block24: {
                    d2 += 0.4;
                    double d8 = systemConfigurationOrchestrator.B() - (d3 += d4);
                    try {
                        try {
                            if (!(d8 < -d5) || !(Math.abs(systemConfigurationOrchestrator.F() - d2) <= 0.15)) break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        bl = true;
                        break block25;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        if (this.m == 5) {
            boolean bl;
            block27: {
                block26: {
                    d2 += 0.6;
                    double d9 = systemConfigurationOrchestrator.B() - (d3 -= 1.0 - d4);
                    try {
                        try {
                            if (!(d9 > d5) || !(Math.abs(systemConfigurationOrchestrator.F() - d2) <= 0.15)) break block26;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        bl = true;
                        break block27;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private double[] t() {
        double[] dArray;
        block6: {
            int n;
            block5: {
                n = this.x.size();
                try {
                    if (n == 0) {
                        return null;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
                try {
                    if (this.B == 0 || n != 4) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
                dArray = this.L.T(this.x.get(n - 1), 0.2, this.m);
                break block6;
            }
            double d2 = 0.3;
            double d3 = 0.2;
            dArray = this.L.B(this.x.get(n - 1), d2, d3, this.m);
        }
        return dArray;
    }

    private boolean J(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        boolean bl;
        block6: {
            boolean bl2;
            block8: {
                block7: {
                    try {
                        try {
                            if (this.m % 2 != 0) break block6;
                            if (!(Math.abs(systemConfigurationOrchestrator.G()) < 0.6)) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        bl2 = true;
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                }
                bl2 = false;
            }
            return bl2;
        }
        try {
            bl = Math.abs(systemConfigurationOrchestrator.o()) < 0.6;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicResourceAllocator.bb = MultiContainerRegistry.a(-3929750803506082833L, 4319268322485639138L, MethodHandles.lookup().lookupClass()).a(152619737177285L);
                DynamicResourceAllocator.kb = new Object[11];
                DynamicResourceAllocator.lb = new String[11];
                DynamicResourceAllocator.a();
                DynamicResourceAllocator.hb = new HashMap<K, V>(13);
                var0 = DynamicResourceAllocator.bb ^ 12422589811321L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "T<c0OA\u00b2\u00c9\u00c2\u007f\u00be\u00e0\u00ae\u009c\u0095\u00af\u00a8g\u00a4\u00ca\u00007}\u00d5l\u0091\u00cf\u00eb\u00af\u00de\u00d8\u00d3\u00d2h\u00e3\b\u00aa7\u00c39\u00eb\u008f\u00d6t\u00af\u00ec/H";
                var7_6 = "T<c0OA\u00b2\u00c9\u00c2\u007f\u00be\u00e0\u00ae\u009c\u0095\u00af\u00a8g\u00a4\u00ca\u00007}\u00d5l\u0091\u00cf\u00eb\u00af\u00de\u00d8\u00d3\u00d2h\u00e3\b\u00aa7\u00c39\u00eb\u008f\u00d6t\u00af\u00ec/H".length();
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
                    var6_5 = "Gm\u00f1/\u00d9\u0089z{%\u000b\u00f1\u0085\u001aZ\u00de\u00db";
                    var7_6 = "Gm\u00f1/\u00d9\u0089z{%\u000b\u00f1\u0085\u001aZ\u00de\u00db".length();
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
        DynamicResourceAllocator.fb = var8_3;
        DynamicResourceAllocator.gb = new Integer[8];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'v' || c == 'U' || c == '\u00aa' || c == 'Z') {
                field = DynamicResourceAllocator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'v' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'U' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicResourceAllocator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicResourceAllocator.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicResourceAllocator.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void h() {
        this.z = true;
    }

    private void N(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block40: {
            block47: {
                block45: {
                    block46: {
                        int n;
                        block44: {
                            block43: {
                                try {
                                    if (ApplicationLifecycleManager.X().M() == null) {
                                        ConfigurationParameterResolver.l();
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                                try {
                                    if (!this.R) {
                                        return;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                                try {
                                    if (!systemConfigurationOrchestrator.j()) {
                                        this.G = true;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                                try {
                                    block42: {
                                        try {
                                            try {
                                                try {
                                                    block41: {
                                                        try {
                                                            try {
                                                                this.O();
                                                                if (!systemConfigurationOrchestrator.j()) break block40;
                                                                if (this.dh) break block41;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw DynamicResourceAllocator.a(customSystemException);
                                                            }
                                                            if (!this.G) break block40;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw DynamicResourceAllocator.a(customSystemException);
                                                        }
                                                    }
                                                    DynamicResourceAllocator dynamicResourceAllocator = this;
                                                    if (this.dh) break block42;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DynamicResourceAllocator.a(customSystemException);
                                                }
                                                if (this.V(systemConfigurationOrchestrator)) break block43;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DynamicResourceAllocator.a(customSystemException);
                                            }
                                            if (!this.x(systemConfigurationOrchestrator)) break block43;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DynamicResourceAllocator.a(customSystemException);
                                        }
                                    }
                                    n = 0;
                                    break block44;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                            }
                            n = 1;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        dynamicResourceAllocator.B = n;
                                        this.dh = false;
                                        this.n = null;
                                        this.l = null;
                                        if (this.r < this.R() || this.B != 1) break block45;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DynamicResourceAllocator.a(customSystemException);
                                    }
                                    if ((Double)this.e.J() != 0.0) break block46;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                                if (this.J(systemConfigurationOrchestrator)) break block46;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicResourceAllocator.a(customSystemException);
                            }
                            this.p(this.S(false), false);
                            this.v(5);
                            this.G = false;
                            break block40;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                    }
                    try {
                        this.B = 0;
                        if (this.l == null) {
                            this.l = this.L.T(this.L.j(this.x.get(this.x.size() - 1), 1, this.m), 0.0, this.m);
                            this.p(this.h(new double[]{this.l[0], this.l[2]}), false);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                    this.v(1);
                    this.r(systemConfigurationOrchestrator);
                    return;
                }
                try {
                    if (this.B != 0) break block47;
                    this.o = this.q(systemConfigurationOrchestrator, this.m);
                    this.L.b(this.o, this.L.i(this.o));
                    this.ds.m();
                    CryptoStreamProcessor.d(this.K, true);
                    this.p(this.S(true), false);
                    this.v(1);
                    this.G = false;
                    this.r = 0;
                    break block40;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
            }
            this.p(this.S(false), false);
            this.v(4);
            ++this.r;
            this.G = false;
        }
        try {
            if (!systemConfigurationOrchestrator.j()) {
                this.r(systemConfigurationOrchestrator);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
        try {
            this.k(systemConfigurationOrchestrator);
            if (this.A(10000)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
    }

    private int R() {
        int n;
        int n2;
        double d2 = Math.random();
        int n3 = ((Double)this.e.J()).intValue();
        try {
            n2 = n3 == 0 ? 0 : n3 - 1;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
        int n4 = n2;
        try {
            n = n3 == 0 ? 0 : n3 + 1;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
        int n5 = n;
        try {
            if (d2 < 0.15) {
                return n5;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
        try {
            if (d2 < 0.25) {
                return n4;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
        return n3;
    }

    public DynamicResourceAllocator(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = bb ^ 0x570FC6B02E48L;
        super(contextualExecutionFramework, string);
        this.j = NumericPrecisionTransformer.b(this, (String)((Object)DynamicResourceAllocator.c("\u00f3", (int)DynamicResourceAllocator.a("k", (int)6925, (long)(0x1D8BF46B12F55BFCL ^ l)), (long)8179079552957474835L, (long)l)), (String)((Object)DynamicResourceAllocator.c("\u00f3", (int)DynamicResourceAllocator.a("k", (int)10319, (long)(0x4DA4DBAE6E9E68B8L ^ l)), (long)8179079552957474835L, (long)l)), "", 1.0, 2.0, 4.0, (String)((Object)DynamicResourceAllocator.c("\u00f3", (int)DynamicResourceAllocator.a("k", (int)23318, (long)(0x681E204FB3B31BE0L ^ l)), (long)8179079552957474835L, (long)l)));
        this.e = NumericPrecisionTransformer.N(this, (String)((Object)DynamicResourceAllocator.c("\u00f3", (int)DynamicResourceAllocator.a("k", (int)3470, (long)(0x360DD183E00DCD7CL ^ l)), (long)8179079552957474835L, (long)l)), (String)((Object)DynamicResourceAllocator.c("\u00f3", (int)DynamicResourceAllocator.a("k", (int)11390, (long)(0x269BCBABA6046C8EL ^ l)), (long)8179079552957474835L, (long)l)), "", 0.0, 1.0, 3.0, 1.0);
        this.O = AuthenticationStateTracker.R(this, (String)((Object)DynamicResourceAllocator.c("\u00f3", (int)DynamicResourceAllocator.a("k", (int)8254, (long)(0x2A35CAB9A40E60CAL ^ l)), (long)8179079552957474835L, (long)l)), true, (String)((Object)DynamicResourceAllocator.c("\u00f3", (int)DynamicResourceAllocator.a("k", (int)2922, (long)(0x1CD2BBEAE038CB99L ^ l)), (long)8179079552957474835L, (long)l)));
        this.L = (CryptographicTokenGenerator)this.n();
        this.P = null;
        this.t = new DataStreamInterceptor((ContextualExecutionFramework)this.n(), (String)((Object)DynamicResourceAllocator.c("\u00f3", (int)DynamicResourceAllocator.a("k", (int)26589, (long)(0x2C34AE36E6BDA728L ^ l)), (long)8179079552957474835L, (long)l)));
        this.R = false;
        this.m = 0;
        this.h = new NetworkConfigManager();
        this.N = new NetworkConfigManager();
        this.x = new ArrayList();
        this.v = null;
        this.l = null;
        this.ds = new NetworkConfigManager();
        this.dQ = 0;
        this.T = ApplicationLifecycleManager.N();
        this.Y = this.T.D();
        this.V = this.T.w();
        this.K = this.T.N();
        this.d = this.T.r();
        this.B = 0;
        this.r = 0;
        this.Z = new ArrayList();
        this.N(this.O, this.j, this.e);
    }

    @Override
    public void v() {
        this.L.A();
        this.M();
    }

    private double[] m(double[] dArray, int n) {
        double d2;
        double d3;
        double d4;
        block10: {
            block9: {
                int n2 = n;
                d4 = dArray[0];
                d3 = dArray[1];
                d2 = dArray[2];
                try {
                    if (this.B == 0 || n2 != 4) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
                d3 += 1.0;
                break block10;
            }
            if (this.m == 6) {
                d4 += 1.0;
            } else if (this.m == 8) {
                d4 -= 1.0;
            } else if (this.m == 7) {
                d2 += 1.0;
            } else if (this.m == 5) {
                d2 -= 1.0;
            }
        }
        return new double[]{d4, d3, d2};
    }

    private float[] q(SystemConfigurationOrchestrator systemConfigurationOrchestrator, int n) {
        double d2;
        double d3;
        double d4 = _Y.T();
        double d5 = 90.0;
        if (n == 6) {
            d4 = 230.0;
        } else if (n == 8) {
            d4 = 50.0;
        } else if (n == 7) {
            d4 = 320.0;
        } else if (n == 5) {
            d4 = 140.0;
        }
        try {
            d3 = d4;
            d2 = Math.random() < 0.5 ? Math.random() * -4.0 : Math.random() * 4.0;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
        d4 = d3 + d2;
        return new float[]{(float)d4, (float)(d5 += Math.random() * -5.0)};
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private double[] h(double[] dArray) {
        double d2 = dArray[0];
        double d3 = dArray[1];
        if (this.m == 6) {
            d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.3)).doubleValue();
            d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.6)).doubleValue();
        } else if (this.m == 8) {
            d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.7)).doubleValue();
            d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.4)).doubleValue();
        } else if (this.m == 7) {
            d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.4)).doubleValue();
            d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.3)).doubleValue();
        } else if (this.m == 5) {
            d2 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d2) + 0.6)).doubleValue();
            d3 = new BigDecimal(String.valueOf((double)AdaptiveComputationEngine.Q(d3) + 0.7)).doubleValue();
        }
        return new double[]{d2, d3};
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicResourceAllocator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicResourceAllocator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void H(KB kB) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block31: {
            block29: {
                block30: {
                    block28: {
                        block27: {
                            block26: {
                                block25: {
                                    try {
                                        try {
                                            if (!ApplicationLifecycleManager.U().Y() && !ApplicationLifecycleManager.c().Y()) break block25;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DynamicResourceAllocator.a(customSystemException);
                                        }
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DynamicResourceAllocator.a(customSystemException);
                                    }
                                }
                                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                try {
                                    if (!this.R) break block26;
                                    ConfigurationRegistry.l.E(this);
                                    ConfigurationRegistry.i.I();
                                    break block27;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                            }
                            ConfigurationRegistry.l.m(this);
                            ConfigurationRegistry.i.Z();
                        }
                        try {
                            try {
                                try {
                                    if (this.z || !this.R) break block28;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                                if (!this.a(systemConfigurationOrchestrator)) break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicResourceAllocator.a(customSystemException);
                            }
                            this.Y.X(1);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (!this.z) break block29;
                            if (!this.R) break block30;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        this.t.h();
                        this.L.A();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                }
                this.M();
                this.z = this.l(systemConfigurationOrchestrator);
                return;
            }
            try {
                if (this.u(systemConfigurationOrchestrator)) {
                    this.t.h();
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
            try {
                try {
                    try {
                        if (this.R || this.P == null) break block31;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                    if (!this.P.S()) break block31;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
                this.R = true;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
        }
        this.N(systemConfigurationOrchestrator);
    }

    private void v(int n) {
        double[] dArray = this.x.get(this.x.size() - 1);
        this.x.clear();
        try {
            while (this.x.size() != n) {
                this.x.add(dArray);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicResourceAllocator.a(customSystemException);
        }
    }

    private boolean u(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        block29: {
            block26: {
                block27: {
                    block28: {
                        boolean bl;
                        boolean bl2;
                        block25: {
                            block24: {
                                try {
                                    if (!ConfigurationRegistry.O.z(this.L)) {
                                        this.z = true;
                                        CryptoStreamProcessor.A();
                                        return true;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                                try {
                                    if (!this.d(systemConfigurationOrchestrator)) {
                                        this.z = true;
                                        CryptoStreamProcessor.D();
                                        return true;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                                bl2 = DynamicContextBroker.s(this.V);
                                try {
                                    try {
                                        if (this.O.s().booleanValue() && !CryptographicTransformer1102.A()) break block24;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DynamicResourceAllocator.a(customSystemException);
                                    }
                                    bl = true;
                                    break block25;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                            }
                            bl = false;
                        }
                        boolean bl3 = bl;
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (bl2 && bl3) break block26;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DynamicResourceAllocator.a(customSystemException);
                                        }
                                        if (!this.R) break block27;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DynamicResourceAllocator.a(customSystemException);
                                    }
                                    if (systemConfigurationOrchestrator.M().K()) break block28;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DynamicResourceAllocator.a(customSystemException);
                                }
                                if (this.y(systemConfigurationOrchestrator)) break block28;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DynamicResourceAllocator.a(customSystemException);
                            }
                            return false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                    }
                    CryptoStreamProcessor.D();
                }
                this.z = true;
                return true;
            }
            try {
                try {
                    this.Z = this.L.u(this.Z);
                    if (!this.R || this.L.z(this.Z) < 10) break block29;
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
                CryptoStreamProcessor.D();
                this.z = true;
                this.N.m();
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw DynamicResourceAllocator.a(customSystemException);
            }
        }
        return false;
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "D\u001dcT";
        objectArray[1] = "\u0018h";
        objectArray[2] = Float.TYPE;
        DynamicResourceAllocator.lb[2] = "java/lang/Float";
        objectArray[3] = Integer.TYPE;
        DynamicResourceAllocator.lb[3] = "java/lang/Integer";
        objectArray[4] = "&\r";
        objectArray[5] = Void.TYPE;
        DynamicResourceAllocator.lb[5] = "java/lang/Void";
        objectArray[6] = "\u0018M*";
        objectArray[7] = "w\u001e\u0010$}\u0014|\u0011\u0001k\u0000\fo\u0016\b\"";
        objectArray[8] = "CW\u0001<pQHX\u0010s\u0011_CS\u0014)";
        objectArray[9] = "\u0014F-Iv\u000eR\u001de0&j\u0010\u0015qAqWHAa^OSK\u0011~]\"\fD\u001d\u007f0u\u0005\u0010\u001coZ-\u0007\u0014\u0017\u001d\u000b!\u0006ZE Su\u0016E{&W(\u0015\u001a\u0007%M(\u0013+";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "0IC}L5l\u001dPe,bwy\u0005h\u0017n~\u0013]j\u0013e\fEM{]8`\t@=\u0014\t";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicResourceAllocator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void O() {
        block13: {
            double[] dArray;
            block14: {
                int n = this.x.size() - 1;
                try {
                    while (true) {
                        try {
                            if (n < Math.max(0, this.x.size() - 3) || !this.L.L(this.x.get(n))) break;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DynamicResourceAllocator.a(customSystemException);
                        }
                        this.n = null;
                        this.x.remove(n);
                        --n;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
                n = this.x.size();
                try {
                    if (n == 0) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
                dArray = this.m(this.x.get(n - 1), n);
                try {
                    try {
                        if (this.L.O(dArray[0], dArray[1], dArray[2])) break block13;
                        if (n != 6) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DynamicResourceAllocator.a(customSystemException);
                    }
                    this.x.clear();
                }
                catch (CustomSystemException customSystemException) {
                    throw DynamicResourceAllocator.a(customSystemException);
                }
            }
            this.x.add(new double[]{dArray[0], dArray[1], dArray[2]});
            this.L.e();
        }
    }

    @DataExchangeProtocol2090
    public void i(DisplayConfigurationManager displayConfigurationManager) {
        this.L.Z();
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
                n3 = 39;
                break;
            }
            case 1: {
                n3 = 33;
                break;
            }
            case 2: {
                n3 = 52;
                break;
            }
            case 3: {
                n3 = 38;
                break;
            }
            case 4: {
                n3 = 37;
                break;
            }
            case 5: {
                n3 = 32;
                break;
            }
            case 6: {
                n3 = 22;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 4;
                break;
            }
            case 9: {
                n3 = 26;
                break;
            }
            case 10: {
                n3 = 61;
                break;
            }
            case 11: {
                n3 = 28;
                break;
            }
            case 12: {
                n3 = 19;
                break;
            }
            case 13: {
                n3 = 8;
                break;
            }
            case 14: {
                n3 = 56;
                break;
            }
            case 15: {
                n3 = 21;
                break;
            }
            case 16: {
                n3 = 40;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 14;
                break;
            }
            case 19: {
                n3 = 57;
                break;
            }
            case 20: {
                n3 = 5;
                break;
            }
            case 21: {
                n3 = 51;
                break;
            }
            case 22: {
                n3 = 29;
                break;
            }
            case 23: {
                n3 = 23;
                break;
            }
            case 24: {
                n3 = 17;
                break;
            }
            case 25: {
                n3 = 45;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 63;
                break;
            }
            case 28: {
                n3 = 42;
                break;
            }
            case 29: {
                n3 = 13;
                break;
            }
            case 30: {
                n3 = 34;
                break;
            }
            case 31: {
                n3 = 58;
                break;
            }
            case 32: {
                n3 = 30;
                break;
            }
            case 33: {
                n3 = 53;
                break;
            }
            case 34: {
                n3 = 10;
                break;
            }
            case 35: {
                n3 = 62;
                break;
            }
            case 36: {
                n3 = 47;
                break;
            }
            case 37: {
                n3 = 41;
                break;
            }
            case 38: {
                n3 = 43;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 15;
                break;
            }
            case 41: {
                n3 = 44;
                break;
            }
            case 42: {
                n3 = 25;
                break;
            }
            case 43: {
                n3 = 1;
                break;
            }
            case 44: {
                n3 = 6;
                break;
            }
            case 45: {
                n3 = 49;
                break;
            }
            case 46: {
                n3 = 7;
                break;
            }
            case 47: {
                n3 = 3;
                break;
            }
            case 48: {
                n3 = 35;
                break;
            }
            case 49: {
                n3 = 46;
                break;
            }
            case 50: {
                n3 = 36;
                break;
            }
            case 51: {
                n3 = 16;
                break;
            }
            case 52: {
                n3 = 54;
                break;
            }
            case 53: {
                n3 = 31;
                break;
            }
            case 54: {
                n3 = 0;
                break;
            }
            case 55: {
                n3 = 48;
                break;
            }
            case 56: {
                n3 = 60;
                break;
            }
            case 57: {
                n3 = 11;
                break;
            }
            case 58: {
                n3 = 12;
                break;
            }
            case 59: {
                n3 = 24;
                break;
            }
            case 60: {
                n3 = 59;
                break;
            }
            case 61: {
                n3 = 20;
                break;
            }
            case 62: {
                n3 = 18;
                break;
            }
            default: {
                n3 = 27;
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
        DynamicResourceAllocator.lb[n4] = new String(cArray);
        return n4;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicResourceAllocator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DynamicResourceAllocator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

