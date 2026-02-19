/*
 * Decompiled with CFR 0.152.
 */
package com.simulation.probabilistic;

import a.KB;
import a._Y;
import a.a;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.NetworkConnectionManager1286;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.tokens.SecurityTokenGenerator2623;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.pipeline.ObjectPipelineManager;
import com.ui.rendering.GraphicalRenderingController;
import com.util.numeric.NumericFormattingUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StochasticSimulationModel
extends ContextualExecutionFramework {
    private double d;
    private boolean l;
    private static final long b;
    private final Random O;
    private static final Map j;
    private boolean A;
    private static final long[] e;
    private final AuthenticationStateTracker B;
    private static final String[] n;
    private double G;
    private double P;
    public final NumericPrecisionTransformer Z;
    public final AuthenticationStateTracker z;
    private final NumericFormattingUtility t;
    private static final Integer[] h;
    private boolean F;
    private static final Object[] m;

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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6C29;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ah", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            StochasticSimulationModel.h[n2] = n3;
        }
        return h[n2];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cd' || c == 'K' || c == '\u00e0' || c == 'q') {
                field = StochasticSimulationModel.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = StochasticSimulationModel.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void lambda$onPacketReceived$0(ConnectionLifecycleHandler connectionLifecycleHandler) {
        block13: {
            if (connectionLifecycleHandler.B(ReflectionMetadataResolver.bh)) {
                boolean bl;
                NetworkConnectionManager1286 networkConnectionManager1286;
                block17: {
                    block16: {
                        networkConnectionManager1286 = new NetworkConnectionManager1286(connectionLifecycleHandler);
                        try {
                            block15: {
                                try {
                                    block14: {
                                        try {
                                            try {
                                                if (networkConnectionManager1286.h() != ApplicationLifecycleManager.U().X()) break block13;
                                                if (networkConnectionManager1286.K() != 0) break block14;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw StochasticSimulationModel.a(customSystemException);
                                            }
                                            if (networkConnectionManager1286.o() == 0) break block15;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw StochasticSimulationModel.a(customSystemException);
                                        }
                                    }
                                    if (networkConnectionManager1286.I() >= 0) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StochasticSimulationModel.a(customSystemException);
                                }
                            }
                            bl = true;
                            break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StochasticSimulationModel.a(customSystemException);
                        }
                    }
                    bl = false;
                }
                boolean bl2 = bl;
                try {
                    try {
                        if (bl2 || !this.V()) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StochasticSimulationModel.a(customSystemException);
                    }
                    this.d = (double)networkConnectionManager1286.K() / 8000.0;
                    this.G = (double)networkConnectionManager1286.I() / 8000.0;
                    this.P = (double)networkConnectionManager1286.o() / 8000.0;
                    this.A = true;
                }
                catch (CustomSystemException customSystemException) {
                    throw StochasticSimulationModel.a(customSystemException);
                }
            }
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public boolean l() {
        block7: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                if (systemConfigurationOrchestrator.Y()) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StochasticSimulationModel.a(customSystemException);
            }
            try {
                try {
                    if (!this.B.s().booleanValue() || !systemConfigurationOrchestrator.F()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw StochasticSimulationModel.a(customSystemException);
                }
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw StochasticSimulationModel.a(customSystemException);
            }
        }
        return false;
    }

    public StochasticSimulationModel() {
        long l = b ^ 0x7A9BE3E7784FL;
        super(a.cs((int)StochasticSimulationModel.a("m", (int)32406, (long)(0x29F3D340071D37A7L ^ l))), (int)StochasticSimulationModel.a("m", (int)22480, (long)(0x5C235A6FB4C49EE7L ^ l)), RecursiveNodeGraph.X, a.cs((int)StochasticSimulationModel.a("m", (int)1419, (long)(0x4E73D2AE07644CB1L ^ l))));
        this.O = new Random();
        this.z = AuthenticationStateTracker.R(this, (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)25690, (long)(0x43026B40FD89AD6CL ^ l)), (long)2673476664845249261L, (long)l)), false, (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)14651, (long)(0x5AFD7346AD4700BL ^ l)), (long)2673476664845249261L, (long)l)));
        this.t = NumericFormattingUtility.K(this, (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)32234, (long)(0x4547CB4D963CB4D4L ^ l)), (long)2673476664845249261L, (long)l)), (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)6146, (long)(0x1BEAFA19DCD0D13EL ^ l)), (long)2673476664845249261L, (long)l)), (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)7005, (long)(0x86F32EF3FF55268L ^ l)), (long)2673476664845249261L, (long)l)), 0.0, 40.0, 60.0, 100.0, 1.0, (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)22754, (long)(0x79B2A631755491D9L ^ l)), (long)2673476664845249261L, (long)l)));
        this.Z = NumericPrecisionTransformer.b(this, (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)30302, (long)(0x7B28B3B0FA53BF66L ^ l)), (long)2673476664845249261L, (long)l)), (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)980, (long)(0x6019D2CCD77B4AE9L ^ l)), (long)2673476664845249261L, (long)l)), (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)549, (long)(0x38E465448A7D4B1CL ^ l)), (long)2673476664845249261L, (long)l)), 0.0, 40.0, 100.0, (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)32387, (long)(0x37A330E171B4B7B0L ^ l)), (long)2673476664845249261L, (long)l)));
        this.B = AuthenticationStateTracker.R(this, (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)13393, (long)(0x6DAAD3F3C6747D63L ^ l)), (long)2673476664845249261L, (long)l)), false, (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)14072, (long)(0x13EEAAF27FD8FFC7L ^ l)), (long)2673476664845249261L, (long)l)));
        this.N(this.Z, this.t, this.z, this.B);
        this.Z.L(0);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = StochasticSimulationModel.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @DataExchangeProtocol2090
    public void k(KB kB) {
        int n;
        block25: {
            boolean bl;
            block28: {
                StochasticSimulationModel stochasticSimulationModel;
                double d2;
                block27: {
                    block26: {
                        double d3;
                        double d4;
                        block24: {
                            boolean bl2;
                            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                            block22: {
                                block23: {
                                    long l = b ^ 0x43331C73F2FDL;
                                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                    n = GraphicalRenderingController.b();
                                    try {
                                        bl2 = systemConfigurationOrchestrator.Y();
                                        if (n != 0) break block22;
                                        if (!bl2) break block23;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw StochasticSimulationModel.a(customSystemException);
                                    }
                                    return;
                                }
                                bl2 = this.A;
                            }
                            if (!bl2) {
                                return;
                            }
                            double d5 = AdaptiveComputationEngine.W(systemConfigurationOrchestrator.G(), 3);
                            double d6 = AdaptiveComputationEngine.W(systemConfigurationOrchestrator.x(), 3);
                            d4 = AdaptiveComputationEngine.W(systemConfigurationOrchestrator.o(), 3);
                            double d7 = AdaptiveComputationEngine.W(this.d, 3);
                            double d8 = AdaptiveComputationEngine.W(this.G, 3);
                            d3 = AdaptiveComputationEngine.W(this.P, 3);
                            try {
                                try {
                                    d2 = d5 == d7 ? 0 : (d5 > d7 ? 1 : -1);
                                    if (n != 0) break block24;
                                    if (d2 != false) break block25;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StochasticSimulationModel.a(customSystemException);
                                }
                                d2 = d6 == d8 ? 0 : (d6 > d8 ? 1 : -1);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StochasticSimulationModel.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                if (n != 0) break block26;
                                if (d2 != false) break block25;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StochasticSimulationModel.a(customSystemException);
                            }
                            d2 = d4 == d3 ? 0 : (d4 > d3 ? 1 : -1);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StochasticSimulationModel.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n != 0) break block27;
                                if (d2 != false) break block25;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StochasticSimulationModel.a(customSystemException);
                            }
                            this.P = 0.0;
                            this.G = 0.0;
                            this.d = 0.0;
                            stochasticSimulationModel = this;
                            bl = false;
                            if (n != 0) break block28;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StochasticSimulationModel.a(customSystemException);
                        }
                        stochasticSimulationModel.A = bl;
                        d2 = (double)ApplicationLifecycleManager.N().r().X();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StochasticSimulationModel.a(customSystemException);
                    }
                }
                try {
                    if (d2 != false) break block25;
                    stochasticSimulationModel = this;
                    bl = true;
                }
                catch (CustomSystemException customSystemException) {
                    throw StochasticSimulationModel.a(customSystemException);
                }
            }
            stochasticSimulationModel.F = bl;
        }
        try {
            if (n != 0) {
                AbstractComputationKernel.I(new String[3]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StochasticSimulationModel.a(customSystemException);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = StochasticSimulationModel.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = StochasticSimulationModel.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "O\u0011^";
        objectArray[1] = Integer.TYPE;
        StochasticSimulationModel.n[1] = "java/lang/Integer";
        objectArray[2] = "ftm\u0012\f\u0011m{|]q\t~|u\u0014";
        objectArray[3] = "(g3&'\t#h\"iF\u0007(c&3";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "RS\u00071m\u000b\u0005T\u000bVx\u00018\fXn/\u001aF\\\u0011(sz\u0001UX&l\u0014\u0005L\u00154\u0013";
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = StochasticSimulationModel.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                StochasticSimulationModel.m[n] = clazz = Class.forName(StochasticSimulationModel.n[n]);
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
            throw new RuntimeException("a/Ah" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void O(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        try {
            if (ApplicationLifecycleManager.U().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StochasticSimulationModel.a(customSystemException);
        }
        ConnectionLifecycleHandler connectionLifecycleHandler = networkPacketOrchestrator1222.getPacket();
        ConnectionLifecycleHandler.A(connectionLifecycleHandler, this::lambda$onPacketReceived$0);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                StochasticSimulationModel.b = MultiContainerRegistry.a(5097481209463939832L, 6686234639950240624L, MethodHandles.lookup().lookupClass()).a(254623827177654L);
                StochasticSimulationModel.m = new Object[5];
                StochasticSimulationModel.n = new String[5];
                StochasticSimulationModel.a();
                StochasticSimulationModel.j = new HashMap<K, V>(13);
                var0 = StochasticSimulationModel.b ^ 77082375405614L;
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
                var8_3 = new long[16];
                var5_4 = 0;
                var6_5 = "\u008a\u00fa<\u00a5\u00c1\u00e3\u00da\u00cf\u00df\u008c\u00e1\u007f\u00a1L\u00fa$\u00c8\u00aazj\u0016ZJ\u0085\u00aa\u00afZGS\u007f_I\u008d;[\u00fa\u0082\u00f5E\u00d1\u00bf\u00ea\u00bbg\u00d7g\u00d7H=\u00d7\u00cd6\u00f5<\u00c4\u00d6X\u008c\u007f\u0019\u00e16\u001d\u00cf\u00f5\u00be\u00b4\u007f\u00c6\u0019I\b*\u0093\u00f0\u0092\u00992\u0091N,\u00c9Y\u0013\u00b9\u00e7\u008c\u00e3\u0080\u00e9C\u00ba\u0016\u00ba\u00cfM\u00f6d\u00e0,9\u00b7\u000e\u00b0n\u00e2\u001aV\u0089\u00f11\u00a9";
                var7_6 = "\u008a\u00fa<\u00a5\u00c1\u00e3\u00da\u00cf\u00df\u008c\u00e1\u007f\u00a1L\u00fa$\u00c8\u00aazj\u0016ZJ\u0085\u00aa\u00afZGS\u007f_I\u008d;[\u00fa\u0082\u00f5E\u00d1\u00bf\u00ea\u00bbg\u00d7g\u00d7H=\u00d7\u00cd6\u00f5<\u00c4\u00d6X\u008c\u007f\u0019\u00e16\u001d\u00cf\u00f5\u00be\u00b4\u007f\u00c6\u0019I\b*\u0093\u00f0\u0092\u00992\u0091N,\u00c9Y\u0013\u00b9\u00e7\u008c\u00e3\u0080\u00e9C\u00ba\u0016\u00ba\u00cfM\u00f6d\u00e0,9\u00b7\u000e\u00b0n\u00e2\u001aV\u0089\u00f11\u00a9".length();
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
                    var6_5 = "\u0014\u008d\u0093i\u000b\u00b1J\u00cf5\u00864\u0090\r~\u008f}";
                    var7_6 = "\u0014\u008d\u0093i\u000b\u00b1J\u00cf5\u00864\u0090\r~\u008f}".length();
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
        StochasticSimulationModel.e = var8_3;
        StochasticSimulationModel.h = new Integer[16];
    }

    @DataExchangeProtocol2090
    public void b(SecurityTokenGenerator2623 securityTokenGenerator2623) {
        if (this.l) {
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().r();
            DynamicContextBroker.g(connectionPoolOrchestrator1192, false);
            ApplicationLifecycleManager.N().r().p(false);
            ApplicationLifecycleManager.U().W().C(false);
            this.l = false;
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ah" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (StochasticSimulationModel.n[n4] != null) {
            return n4;
        }
        Object object = m[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 34;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 62;
                break;
            }
            case 3: {
                n3 = 20;
                break;
            }
            case 4: {
                n3 = 25;
                break;
            }
            case 5: {
                n3 = 19;
                break;
            }
            case 6: {
                n3 = 44;
                break;
            }
            case 7: {
                n3 = 14;
                break;
            }
            case 8: {
                n3 = 54;
                break;
            }
            case 9: {
                n3 = 2;
                break;
            }
            case 10: {
                n3 = 4;
                break;
            }
            case 11: {
                n3 = 38;
                break;
            }
            case 12: {
                n3 = 26;
                break;
            }
            case 13: {
                n3 = 9;
                break;
            }
            case 14: {
                n3 = 41;
                break;
            }
            case 15: {
                n3 = 22;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 63;
                break;
            }
            case 18: {
                n3 = 53;
                break;
            }
            case 19: {
                n3 = 47;
                break;
            }
            case 20: {
                n3 = 40;
                break;
            }
            case 21: {
                n3 = 48;
                break;
            }
            case 22: {
                n3 = 42;
                break;
            }
            case 23: {
                n3 = 18;
                break;
            }
            case 24: {
                n3 = 8;
                break;
            }
            case 25: {
                n3 = 60;
                break;
            }
            case 26: {
                n3 = 16;
                break;
            }
            case 27: {
                n3 = 39;
                break;
            }
            case 28: {
                n3 = 31;
                break;
            }
            case 29: {
                n3 = 3;
                break;
            }
            case 30: {
                n3 = 6;
                break;
            }
            case 31: {
                n3 = 55;
                break;
            }
            case 32: {
                n3 = 30;
                break;
            }
            case 33: {
                n3 = 58;
                break;
            }
            case 34: {
                n3 = 10;
                break;
            }
            case 35: {
                n3 = 43;
                break;
            }
            case 36: {
                n3 = 17;
                break;
            }
            case 37: {
                n3 = 32;
                break;
            }
            case 38: {
                n3 = 0;
                break;
            }
            case 39: {
                n3 = 50;
                break;
            }
            case 40: {
                n3 = 23;
                break;
            }
            case 41: {
                n3 = 5;
                break;
            }
            case 42: {
                n3 = 61;
                break;
            }
            case 43: {
                n3 = 12;
                break;
            }
            case 44: {
                n3 = 36;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 46;
                break;
            }
            case 47: {
                n3 = 24;
                break;
            }
            case 48: {
                n3 = 37;
                break;
            }
            case 49: {
                n3 = 59;
                break;
            }
            case 50: {
                n3 = 49;
                break;
            }
            case 51: {
                n3 = 35;
                break;
            }
            case 52: {
                n3 = 7;
                break;
            }
            case 53: {
                n3 = 13;
                break;
            }
            case 54: {
                n3 = 29;
                break;
            }
            case 55: {
                n3 = 27;
                break;
            }
            case 56: {
                n3 = 52;
                break;
            }
            case 57: {
                n3 = 15;
                break;
            }
            case 58: {
                n3 = 11;
                break;
            }
            case 59: {
                n3 = 33;
                break;
            }
            case 60: {
                n3 = 57;
                break;
            }
            case 61: {
                n3 = 51;
                break;
            }
            case 62: {
                n3 = 21;
                break;
            }
            default: {
                n3 = 56;
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
        StochasticSimulationModel.n[n4] = new String(cArray);
        return n4;
    }

    @DataExchangeProtocol2090
    public void s(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        if (this.F) {
            float f = AdaptiveComputationEngine.B(this.O, 0, 100);
            double d2 = this.t.l();
            try {
                if ((double)f < 100.0 - d2) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StochasticSimulationModel.a(customSystemException);
            }
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().r();
            DynamicContextBroker.g(connectionPoolOrchestrator1192, true);
            connectionPoolOrchestrator1192.p(true);
            ApplicationLifecycleManager.U().W().C(true);
            this.l = true;
            this.F = false;
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public String t() {
        long l = b ^ 0x734271F3B196L;
        return this.Z.p() + (String)((Object)StochasticSimulationModel.c("T", (int)StochasticSimulationModel.a("m", (int)30028, (long)(0x3667690A9F0AF5A1L ^ l)), (long)-1386245546163739852L, (long)l));
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = StochasticSimulationModel.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = StochasticSimulationModel.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = StochasticSimulationModel.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = StochasticSimulationModel.n[n];
            int n2 = string.indexOf(8);
            Class clazz = StochasticSimulationModel.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = StochasticSimulationModel.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = StochasticSimulationModel.a(clazz3, string2, clazz2)) != null) {
                    StochasticSimulationModel.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = StochasticSimulationModel.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        StochasticSimulationModel.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = StochasticSimulationModel.b(214657052382986L, 0L);
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
        int n2 = StochasticSimulationModel.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(long l, long l2) {
        int n = StochasticSimulationModel.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = StochasticSimulationModel.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = StochasticSimulationModel.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = StochasticSimulationModel.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = StochasticSimulationModel.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        StochasticSimulationModel.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = StochasticSimulationModel.b(214657052382986L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = StochasticSimulationModel.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        StochasticSimulationModel.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = StochasticSimulationModel.b(214657052382986L, 0L);
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

    private boolean V() {
        block17: {
            try {
                if (this.l) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StochasticSimulationModel.a(customSystemException);
            }
            try {
                if (ApplicationLifecycleManager.U().e(ObjectPipelineManager.T)) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StochasticSimulationModel.a(customSystemException);
            }
            try {
                if (this.l()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw StochasticSimulationModel.a(customSystemException);
            }
            if (this.z.s().booleanValue()) {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                boolean bl = _Y.c(systemConfigurationOrchestrator);
                boolean bl2 = _Y.a(systemConfigurationOrchestrator);
                try {
                    try {
                        if (bl && bl2) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StochasticSimulationModel.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw StochasticSimulationModel.a(customSystemException);
                }
            }
        }
        int n = AdaptiveComputationEngine.B(this.O, 0, 100);
        try {
            if ((double)n >= 100.0 - (Double)this.Z.J()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StochasticSimulationModel.a(customSystemException);
        }
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(StochasticSimulationModel.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(StochasticSimulationModel.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

