/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.system.concurrency;

import a.Ne;
import a.a;
import a.kg;
import com.adapter.management.GenericAdapterManager;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.encoding.protocol.EncodingProtocolEnum;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.event.NetworkEventDispatcher;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.network.transmission.DataTransmissionManager2384;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.authentication.AuthenticationGateway1860;
import com.security.negotiation.CryptoContextNegotiator684;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.event.UserInterfaceEventBroker;
import com.util.comparison.ComparisonUtility;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class ConcurrentTaskScheduler
extends ContextualExecutionFramework {
    private static final Map t;
    private final GenericAdapterManager G;
    private static final String[] A;
    private static final Integer[] m;
    private final NumericPrecisionTransformer d;
    private DataTransmissionManager2384 h;
    private final Queue<ComparisonUtility> n;
    private static final Object[] z;
    public NumericComputationEngine1131 o;
    private final GenericAdapterManager L;
    private boolean e;
    private final AuthenticationGateway1860 T;
    private static final long b;
    private int l;
    private final AuthenticationStateTracker x;
    private final AuthenticationStateTracker R;
    private boolean v;
    private final AuthenticationGateway1860 r;
    private int Z;
    private final AuthenticationStateTracker F;
    private final AuthenticationGateway1860 K;
    private static final long[] j;
    private final AuthenticationGateway1860 N;
    private boolean B;
    private final List<kg> w;

    @DataExchangeProtocol2090
    public void n(UserInterfaceEventBroker userInterfaceEventBroker) {
    }

    @Override
    public void v() {
        block9: {
            block8: {
                try {
                    try {
                        if (!ApplicationLifecycleManager.U().Y() && !ApplicationLifecycleManager.c().Y()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConcurrentTaskScheduler.a(customSystemException);
                    }
                    this.w.clear();
                    this.h = null;
                    this.Z = 0;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentTaskScheduler.a(customSystemException);
                }
            }
            try {
                try {
                    if (this.h == null || !ApplicationLifecycleManager.c().I(this.l).r()) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentTaskScheduler.a(customSystemException);
                }
                ApplicationLifecycleManager.c().d(this.h);
            }
            catch (CustomSystemException customSystemException) {
                throw ConcurrentTaskScheduler.a(customSystemException);
            }
        }
        this.h = null;
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

    /*
     * Unable to fully structure code
     */
    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void b(NetworkEventDispatcher var1_1) {
        var2_2 = ConcurrentTaskScheduler.b ^ 108208040000011L;
        try {
            block39: {
                block40: {
                    block48: {
                        block47: {
                            block38: {
                                block37: {
                                    block36: {
                                        block43: {
                                            block35: {
                                                block44: {
                                                    block42: {
                                                        block41: {
                                                            if (var1_1.isCanceled()) {
                                                                return;
                                                            }
                                                            var4_3 = ApplicationLifecycleManager.X();
                                                            if (var4_3.B(ReflectionMetadataResolver.Uk)) ** GOTO lbl25
                                                            if (var4_3.B(ReflectionMetadataResolver.B)) ** GOTO lbl25
                                                            break block41;
                                                            catch (Exception v0) {
                                                                throw ConcurrentTaskScheduler.a(v0);
                                                            }
                                                        }
                                                        if (var4_3.B(ReflectionMetadataResolver.D)) ** GOTO lbl25
                                                        break block42;
                                                        catch (Exception v1) {
                                                            throw ConcurrentTaskScheduler.a(v1);
                                                        }
                                                    }
                                                    if (!ApplicationLifecycleManager.U().Y()) break block43;
                                                    break block44;
                                                    catch (Exception v2) {
                                                        throw ConcurrentTaskScheduler.a(v2);
                                                    }
                                                }
                                                try {
                                                    block45: {
                                                        this.B = true;
                                                        this.z();
                                                        if (this.x.s().booleanValue()) break block35;
                                                        break block45;
                                                        catch (Exception v3) {
                                                            throw ConcurrentTaskScheduler.a(v3);
                                                        }
                                                    }
                                                    super.T(false);
                                                }
                                                catch (Exception v4) {
                                                    throw ConcurrentTaskScheduler.a(v4);
                                                }
                                            }
                                            return;
                                        }
                                        if (this.e) {
                                            return;
                                        }
                                        var5_5 = var1_1.getPacket();
                                        if (!this.W(var5_5)) break block36;
                                        return;
                                    }
                                    if (!var5_5.B(ReflectionMetadataResolver.L)) break block37;
                                    try {
                                        block46: {
                                            if (!this.L()) break block38;
                                            break block46;
                                            catch (Exception v5) {
                                                throw ConcurrentTaskScheduler.a(v5);
                                            }
                                        }
                                        if (this.Z % 5 != 0) break block38;
                                    }
                                    catch (Exception v6) {
                                        throw ConcurrentTaskScheduler.a(v6);
                                    }
                                    var6_6 = ApplicationLifecycleManager.U();
                                    try {
                                        v7 = this.Z % 2 == 0;
                                    }
                                    catch (Exception v8) {
                                        throw ConcurrentTaskScheduler.a(v8);
                                    }
                                    var7_7 = v7;
                                    try {
                                        v9 = 0.2;
                                        v10 = var7_7 != false ? -1 : 1;
                                    }
                                    catch (Exception v11) {
                                        throw ConcurrentTaskScheduler.a(v11);
                                    }
                                    var8_8 = v9 * (double)v10 * Math.cos(Math.toRadians(var6_6.q()));
                                    try {
                                        v12 = 0.2;
                                        v13 = var7_7 != false ? -1 : 1;
                                    }
                                    catch (Exception v14) {
                                        throw ConcurrentTaskScheduler.a(v14);
                                    }
                                    var10_9 = v12 * (double)v13 * Math.sin(Math.toRadians(var6_6.q()));
                                    this.w.add(new kg(var6_6.F() + var8_8, var6_6.V(), var6_6.B() + var10_9));
                                    break block38;
                                }
                                if (((NetworkConnectionEstablisher)this.L.J()).equals(this.N)) {
                                    return;
                                }
                            }
                            ++this.Z;
                            if (!this.x.s().booleanValue()) break block39;
                            if (!((Double)this.d.J() > 0.0)) break block39;
                            break block47;
                            catch (Exception v15) {
                                throw ConcurrentTaskScheduler.a(v15);
                            }
                        }
                        if (!((double)this.Z >= (Double)this.d.J())) break block39;
                        break block48;
                        catch (Exception v16) {
                            throw ConcurrentTaskScheduler.a(v16);
                        }
                    }
                    try {
                        block49: {
                            this.B = true;
                            if (this.h == null) break block40;
                            break block49;
                            catch (Exception v17) {
                                throw ConcurrentTaskScheduler.a(v17);
                            }
                        }
                        if (!this.h.r()) break block40;
                    }
                    catch (Exception v18) {
                        throw ConcurrentTaskScheduler.a(v18);
                    }
                    var6_6 = ApplicationLifecycleManager.U();
                    try {
                        v19 = this.h;
                        v20 = var6_6.F();
                        v21 = DynamicContextBroker.e != false ? var6_6.V() : var6_6.V() - 1.5;
                    }
                    catch (Exception v22) {
                        throw ConcurrentTaskScheduler.a(v22);
                    }
                    v19.u(v20, v21, var6_6.B(), var6_6.q(), var6_6.S());
                    this.h.C(var6_6.J());
                }
                this.Z = 0;
                this.w.clear();
            }
            this.n.add(new ComparisonUtility(var5_5, true, var1_1.getNetworkManager()));
            var1_1.setCanceled(true);
            this.z();
        }
        catch (Exception var4_4) {
            TemporalMetadataResolver.x((String)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)23846, (long)(1495348951198081291L ^ var2_2)), (long)-3130532292217910894L, (long)var2_2));
            TemporalMetadataResolver.W(var4_4);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void h() {
        block4: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block5: {
                this.G();
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    try {
                        if (!this.F.s().booleanValue()) break block4;
                        this.h = DataTransmissionManager2384.h(ApplicationLifecycleManager.c(), ApplicationLifecycleManager.U().B());
                        this.h.R(systemConfigurationOrchestrator, true);
                        if (GeometryCalculator.C() < 37) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConcurrentTaskScheduler.a(customSystemException);
                    }
                    this.h.f(-420);
                    this.h.A(UUID.randomUUID());
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentTaskScheduler.a(customSystemException);
                }
            }
            this.k();
            this.h.C(systemConfigurationOrchestrator.J());
            this.l = DynamicContextBroker.M();
            ApplicationLifecycleManager.c().c(this.l, this.h);
        }
    }

    private void k() {
        double d2;
        double d3;
        DataTransmissionManager2384 dataTransmissionManager2384;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block9: {
            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                block8: {
                    try {
                        try {
                            if (systemConfigurationOrchestrator.r() || this.h.r()) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ConcurrentTaskScheduler.a(customSystemException);
                        }
                        if (this.F.s().booleanValue()) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConcurrentTaskScheduler.a(customSystemException);
                    }
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConcurrentTaskScheduler.a(customSystemException);
            }
        }
        try {
            dataTransmissionManager2384 = this.h;
            d3 = systemConfigurationOrchestrator.F();
            d2 = DynamicContextBroker.e ? systemConfigurationOrchestrator.V() : systemConfigurationOrchestrator.V() - 1.5;
        }
        catch (CustomSystemException customSystemException) {
            throw ConcurrentTaskScheduler.a(customSystemException);
        }
        dataTransmissionManager2384.u(d3, d2, systemConfigurationOrchestrator.B(), systemConfigurationOrchestrator.q(), systemConfigurationOrchestrator.S());
        this.h.C(systemConfigurationOrchestrator.J());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ConcurrentTaskScheduler.b = MultiContainerRegistry.a(5361532307232528716L, -2316526067089456783L, MethodHandles.lookup().lookupClass()).a(122125376726656L);
                ConcurrentTaskScheduler.z = new Object[5];
                ConcurrentTaskScheduler.A = new String[5];
                ConcurrentTaskScheduler.a();
                ConcurrentTaskScheduler.t = new HashMap<K, V>(13);
                var0 = ConcurrentTaskScheduler.b ^ 112907989088289L;
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
                var8_3 = new long[24];
                var5_4 = 0;
                var6_5 = "+\u00ff\u009c\u00ca\u0003l;:\u00e7 \u00a5\u00eb\u0005 \u0085\u008e\u009e>\u00dc7\f\u00e1\u0085\b\u00cd\u00fc\u00d1\u0018\u009a\u0090d\u00db\u00cfQ\u0001\u008a9_Mz\u0016B\u00b2\u00ac\u00ef\u00b6\u00c5U\u009c\u00e1C\u00e9~lj\u00cfN\rM\u00c7\u00e8M\u0093\u00ed\u00fa\"\u00ee\u001c\u00fa\u00fe\u00e6:1(\u00ce\u00f0\\\u00a7\u00a9\u008f\u00d8\u00ae\u0006\u00d6\u00ca\u00f92;\u00b4\u0010\u0080*\u00efB\u00c1\u00a3\u0091\u00b6\u00ca\f4_\u00cb\u007fP\u0098e\u00b7LzQ\u00865\u008cq\u00dahB\r\u000eV\u0019K\u000b\u00af\u00a1\u00f0\u00fa\u00faS\u00da\u0094PTG\u00ae\u00c9\u00fd\u0019\u0088\u00cb-f|\u00fd\u0003k\u00d8\u00d2\u009b\u009a0l5\u009b\u009d\u00fdP\u00ac\u0011\u00eb\u00ee\u0086f/\u00cb\u001c\u00c2&\u00b1\u0005S\u0098\u00b7\u00ab{";
                var7_6 = "+\u00ff\u009c\u00ca\u0003l;:\u00e7 \u00a5\u00eb\u0005 \u0085\u008e\u009e>\u00dc7\f\u00e1\u0085\b\u00cd\u00fc\u00d1\u0018\u009a\u0090d\u00db\u00cfQ\u0001\u008a9_Mz\u0016B\u00b2\u00ac\u00ef\u00b6\u00c5U\u009c\u00e1C\u00e9~lj\u00cfN\rM\u00c7\u00e8M\u0093\u00ed\u00fa\"\u00ee\u001c\u00fa\u00fe\u00e6:1(\u00ce\u00f0\\\u00a7\u00a9\u008f\u00d8\u00ae\u0006\u00d6\u00ca\u00f92;\u00b4\u0010\u0080*\u00efB\u00c1\u00a3\u0091\u00b6\u00ca\f4_\u00cb\u007fP\u0098e\u00b7LzQ\u00865\u008cq\u00dahB\r\u000eV\u0019K\u000b\u00af\u00a1\u00f0\u00fa\u00faS\u00da\u0094PTG\u00ae\u00c9\u00fd\u0019\u0088\u00cb-f|\u00fd\u0003k\u00d8\u00d2\u009b\u009a0l5\u009b\u009d\u00fdP\u00ac\u0011\u00eb\u00ee\u0086f/\u00cb\u001c\u00c2&\u00b1\u0005S\u0098\u00b7\u00ab{".length();
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
                    var6_5 = "6]\u009c\u00bbu\u00a5B\u00d4=\u00d8\u00c0\u009d\u00e2j\u00c0\u00dc";
                    var7_6 = "6]\u009c\u00bbu\u00a5B\u00d4=\u00d8\u00c0\u009d\u00e2j\u00c0\u00dc".length();
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
        ConcurrentTaskScheduler.j = var8_3;
        ConcurrentTaskScheduler.m = new Integer[24];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == '\u00f9' || c == '\u00e0' || c == 'H') {
                field = ConcurrentTaskScheduler.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConcurrentTaskScheduler.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ce' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Loose catch block
     */
    @DataExchangeProtocol2090
    public void o(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        long l = b ^ 0x6B9A45CAFF91L;
        try {
            ConnectionLifecycleHandler connectionLifecycleHandler;
            block15: {
                block18: {
                    block14: {
                        block16: {
                            block13: {
                                connectionLifecycleHandler = networkPacketOrchestrator1222.getPacket();
                                if (!connectionLifecycleHandler.B(ReflectionMetadataResolver.UV)) break block16;
                                try {
                                    block17: {
                                        this.B = true;
                                        this.z();
                                        if (this.x.s().booleanValue()) break block13;
                                        break block17;
                                        catch (Exception exception) {
                                            throw ConcurrentTaskScheduler.a(exception);
                                        }
                                    }
                                    super.T(false);
                                }
                                catch (Exception exception) {
                                    throw ConcurrentTaskScheduler.a(exception);
                                }
                            }
                            return;
                        }
                        if (((NetworkConnectionEstablisher)this.G.J()).equals(this.T)) {
                            return;
                        }
                        if (!this.e) break block14;
                        return;
                    }
                    ++this.Z;
                    if (!this.x.s().booleanValue()) break block15;
                    if (!((Double)this.d.J() > 0.0)) break block15;
                    break block18;
                    catch (Exception exception) {
                        throw ConcurrentTaskScheduler.a(exception);
                    }
                }
                try {
                    block19: {
                        if (!((double)this.Z >= (Double)this.d.J())) break block15;
                        break block19;
                        catch (Exception exception) {
                            throw ConcurrentTaskScheduler.a(exception);
                        }
                    }
                    this.B = true;
                    this.k();
                    this.Z = 0;
                    this.w.clear();
                }
                catch (Exception exception) {
                    throw ConcurrentTaskScheduler.a(exception);
                }
            }
            this.n.add(new ComparisonUtility(connectionLifecycleHandler, false, networkPacketOrchestrator1222.getNetworkManager()));
            networkPacketOrchestrator1222.setCanceled(true);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.x((String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)12043, (long)(0x69FBAC1AFA0E16A9L ^ l)), (long)1230631168441158664L, (long)l)));
            TemporalMetadataResolver.W(exception);
        }
    }

    private boolean L() {
        boolean bl;
        block5: {
            block4: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    try {
                        if (systemConfigurationOrchestrator.G() == 0.0 && systemConfigurationOrchestrator.o() == 0.0) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConcurrentTaskScheduler.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentTaskScheduler.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Field c(long l, long l2) {
        int n = ConcurrentTaskScheduler.a(l, l2);
        Object object = z[n];
        if (object instanceof String) {
            String string = A[n];
            int n2 = string.indexOf(8);
            Class clazz = ConcurrentTaskScheduler.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConcurrentTaskScheduler.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConcurrentTaskScheduler.a(clazz3, string2, clazz2)) != null) {
                    ConcurrentTaskScheduler.z[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConcurrentTaskScheduler.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConcurrentTaskScheduler.z[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConcurrentTaskScheduler.b(252239698756265L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @DataExchangeProtocol2090
    public void V(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        block12: {
            try {
                try {
                    if (this.R.s().booleanValue() && !this.w.isEmpty()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentTaskScheduler.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ConcurrentTaskScheduler.a(customSystemException);
            }
        }
        try {
            eventDispatchRegistry2111.getEntityRenderer().H(1.0);
            CryptoContextNegotiator684.Y();
            if (!ConfigurationManager.U()) {
                Ne.h.y(3042);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glLineWidth((float)1.5f);
                Ne.h.z(3553);
                Ne.h.y(2848);
                Ne.h.z(2929);
                GL11.glDepthMask((boolean)false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConcurrentTaskScheduler.a(customSystemException);
        }
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        boolean bl = true;
        for (kg kg2 : this.w) {
            Color color = Color.RED;
            if (bl) {
                color = Color.YELLOW;
                bl = false;
            }
            CryptoContextNegotiator684.x(kg2.K - 0.1, kg2.w, kg2.O - 0.1, 0.2, 0.0, 0.2, 1.0, Color.BLACK, color, d2, d3, d4);
        }
        try {
            if (!ConfigurationManager.U()) {
                GL11.glDepthMask((boolean)true);
                Ne.h.y(2929);
                Ne.h.y(3553);
                Ne.h.z(2848);
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConcurrentTaskScheduler.a(customSystemException);
        }
        CryptoContextNegotiator684.J();
        eventDispatchRegistry2111.getEntityRenderer().F(1.0);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ConcurrentTaskScheduler.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConcurrentTaskScheduler.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void r() {
        this.B = true;
        this.v = true;
        this.z();
    }

    private void z() {
        block6: {
            try {
                if (!this.B) break block6;
                this.e = true;
            }
            catch (CustomSystemException customSystemException) {
                throw ConcurrentTaskScheduler.a(customSystemException);
            }
            while (!this.n.isEmpty()) {
                ComparisonUtility comparisonUtility = this.n.poll();
                comparisonUtility.c();
            }
            try {
                this.e = false;
                this.B = false;
                if (this.v) {
                    this.v = false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConcurrentTaskScheduler.a(customSystemException);
            }
        }
    }

    @Override
    public void T(boolean bl) {
        super.T(bl);
    }

    @Override
    public void y(boolean bl, boolean bl2) {
        super.y(bl, bl2);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ConcurrentTaskScheduler.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l, long l2) {
        int n = ConcurrentTaskScheduler.a(l, l2);
        Object object = z[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = A[n];
                int n3 = string2.indexOf(8);
                clazz3 = ConcurrentTaskScheduler.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConcurrentTaskScheduler.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConcurrentTaskScheduler.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConcurrentTaskScheduler.z[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConcurrentTaskScheduler.b(252239698756265L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConcurrentTaskScheduler.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConcurrentTaskScheduler.z[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConcurrentTaskScheduler.b(252239698756265L, 0L);
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

    private static void a() {
        Object[] objectArray = z;
        z[0] = "t\u000e\u0006";
        objectArray[1] = Integer.TYPE;
        ConcurrentTaskScheduler.A[1] = "java/lang/Integer";
        objectArray[2] = "\u001csy\ne-\u0017|hE\u00185\u0004{a\f";
        objectArray[3] = "ue\teYw~j\u0018*8yua\u001cp";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Ax6K\u0000y[p29Rg#.a\b@u@&bHC\u001c\u001ajbU\u0007|\u001cf<\u00049";
    }

    @Override
    public String H() {
        try {
            if (this.Z == 0) {
                return "";
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConcurrentTaskScheduler.a(customSystemException);
        }
        return String.valueOf(this.Z);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConcurrentTaskScheduler.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x28A5;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xn", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConcurrentTaskScheduler.m[n2] = n3;
        }
        return m[n2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConcurrentTaskScheduler.a(l, l2);
            object = z[n];
            try {
                if (!(object instanceof String)) break block2;
                ConcurrentTaskScheduler.z[n] = clazz = Class.forName(A[n]);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xn" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public ConcurrentTaskScheduler() {
        long l = b ^ 0x10245B12A006L;
        super(a.cs((int)ConcurrentTaskScheduler.a("l", (int)5676, (long)(0x6DD1E4D6F76F701BL ^ l))), (int)ConcurrentTaskScheduler.a("l", (int)9540, (long)(0x5F23B8BC645E4367L ^ l)), RecursiveNodeGraph.K, a.cs((int)ConcurrentTaskScheduler.a("l", (int)15888, (long)(0x67EE106092695823L ^ l))));
        this.w = new CopyOnWriteArrayList<kg>();
        this.T = new AuthenticationGateway1860((String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)25034, (long)(0x52080BB3A93787E1L ^ l)), (long)5657487847824675743L, (long)l)));
        this.r = new AuthenticationGateway1860((String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)26501, (long)(0x52D4D4597B6981B1L ^ l)), (long)5657487847824675743L, (long)l)));
        this.G = GenericAdapterManager.I(this, (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)2847, (long)(0x3DA1DB8F00D3ED38L ^ l)), (long)5657487847824675743L, (long)l)), (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)11368, (long)(0x77D1A01EC4004A44L ^ l)), (long)5657487847824675743L, (long)l)), this.T, this.T, this.r);
        this.K = new AuthenticationGateway1860((String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)26253, (long)(0xC8DBA4872A880BBL ^ l)), (long)5657487847824675743L, (long)l)));
        this.N = new AuthenticationGateway1860((String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)16792, (long)(0x37A5D2A51B8127BCL ^ l)), (long)5657487847824675743L, (long)l)));
        this.L = GenericAdapterManager.I(this, (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)24082, (long)(0x33BD250780BAB83DL ^ l)), (long)5657487847824675743L, (long)l)), (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)31986, (long)(0x2EFC34444EE19AD8L ^ l)), (long)5657487847824675743L, (long)l)), this.K, this.K, this.N);
        this.R = AuthenticationStateTracker.R(this, (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)9021, (long)(0x37204023EC314514L ^ l)), (long)5657487847824675743L, (long)l)), false, (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)2581, (long)(0x6200193C23A46C27L ^ l)), (long)5657487847824675743L, (long)l)));
        this.F = AuthenticationStateTracker.R(this, (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)5214, (long)(0x554ED19D3B4CF270L ^ l)), (long)5657487847824675743L, (long)l)), false, (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)15887, (long)(0x21CC68F5A22BD829L ^ l)), (long)5657487847824675743L, (long)l)));
        this.x = AuthenticationStateTracker.R(this, (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)2336, (long)(0x238657E208F06F11L ^ l)), (long)5657487847824675743L, (long)l)), false, (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)1481, (long)(0x48CFAB3FBF0163E1L ^ l)), (long)5657487847824675743L, (long)l)));
        this.d = NumericPrecisionTransformer.D(this, (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)12514, (long)(0x7E04C15F8162D6C7L ^ l)), (long)5657487847824675743L, (long)l)), (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)106, (long)(0x1E477BF526E65AL ^ l)), (long)5657487847824675743L, (long)l)), "", 0.0, 50.0, 100.0, 1.0, (String)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)4809, (long)(0x7DECA6438F5374E8L ^ l)), (long)5657487847824675743L, (long)l)));
        this.n = new ConcurrentLinkedQueue<ComparisonUtility>();
        this.B = false;
        this.e = false;
        this.v = false;
        this.o = ApplicationLifecycleManager.r();
        this.x.l(this.d);
        this.N(this.G, this.L, this.R, this.F, this.x, this.d);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void G() {
        this.Z = 0;
        this.n.clear();
        this.w.clear();
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (A[n4] != null) {
            return n4;
        }
        Object object = z[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 42;
                break;
            }
            case 2: {
                n3 = 48;
                break;
            }
            case 3: {
                n3 = 52;
                break;
            }
            case 4: {
                n3 = 9;
                break;
            }
            case 5: {
                n3 = 62;
                break;
            }
            case 6: {
                n3 = 35;
                break;
            }
            case 7: {
                n3 = 57;
                break;
            }
            case 8: {
                n3 = 51;
                break;
            }
            case 9: {
                n3 = 46;
                break;
            }
            case 10: {
                n3 = 63;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 40;
                break;
            }
            case 13: {
                n3 = 12;
                break;
            }
            case 14: {
                n3 = 33;
                break;
            }
            case 15: {
                n3 = 28;
                break;
            }
            case 16: {
                n3 = 49;
                break;
            }
            case 17: {
                n3 = 13;
                break;
            }
            case 18: {
                n3 = 15;
                break;
            }
            case 19: {
                n3 = 26;
                break;
            }
            case 20: {
                n3 = 38;
                break;
            }
            case 21: {
                n3 = 36;
                break;
            }
            case 22: {
                n3 = 25;
                break;
            }
            case 23: {
                n3 = 10;
                break;
            }
            case 24: {
                n3 = 11;
                break;
            }
            case 25: {
                n3 = 6;
                break;
            }
            case 26: {
                n3 = 24;
                break;
            }
            case 27: {
                n3 = 47;
                break;
            }
            case 28: {
                n3 = 32;
                break;
            }
            case 29: {
                n3 = 23;
                break;
            }
            case 30: {
                n3 = 27;
                break;
            }
            case 31: {
                n3 = 31;
                break;
            }
            case 32: {
                n3 = 5;
                break;
            }
            case 33: {
                n3 = 16;
                break;
            }
            case 34: {
                n3 = 7;
                break;
            }
            case 35: {
                n3 = 53;
                break;
            }
            case 36: {
                n3 = 61;
                break;
            }
            case 37: {
                n3 = 54;
                break;
            }
            case 38: {
                n3 = 56;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 44;
                break;
            }
            case 41: {
                n3 = 58;
                break;
            }
            case 42: {
                n3 = 60;
                break;
            }
            case 43: {
                n3 = 19;
                break;
            }
            case 44: {
                n3 = 37;
                break;
            }
            case 45: {
                n3 = 3;
                break;
            }
            case 46: {
                n3 = 22;
                break;
            }
            case 47: {
                n3 = 41;
                break;
            }
            case 48: {
                n3 = 34;
                break;
            }
            case 49: {
                n3 = 29;
                break;
            }
            case 50: {
                n3 = 55;
                break;
            }
            case 51: {
                n3 = 43;
                break;
            }
            case 52: {
                n3 = 4;
                break;
            }
            case 53: {
                n3 = 50;
                break;
            }
            case 54: {
                n3 = 18;
                break;
            }
            case 55: {
                n3 = 8;
                break;
            }
            case 56: {
                n3 = 21;
                break;
            }
            case 57: {
                n3 = 14;
                break;
            }
            case 58: {
                n3 = 45;
                break;
            }
            case 59: {
                n3 = 39;
                break;
            }
            case 60: {
                n3 = 20;
                break;
            }
            case 61: {
                n3 = 17;
                break;
            }
            case 62: {
                n3 = 59;
                break;
            }
            default: {
                n3 = 30;
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
        ConcurrentTaskScheduler.A[n4] = new String(cArray);
        return n4;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConcurrentTaskScheduler.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConcurrentTaskScheduler.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private boolean W(ConnectionLifecycleHandler connectionLifecycleHandler) {
        boolean bl;
        block5: {
            block4: {
                long l = b ^ 0x305ED805A1F1L;
                try {
                    try {
                        if (!connectionLifecycleHandler.M().getClass().toString().contains((CharSequence)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)17830, (long)(0x166ED33BAABE2273L ^ l)), (long)5725288177921086056L, (long)l))) && !connectionLifecycleHandler.M().toString().contains((CharSequence)((Object)ConcurrentTaskScheduler.c("\u00a3", (int)ConcurrentTaskScheduler.a("l", (int)4134, (long)(0x33EE5C3C6ED377FCL ^ l)), (long)5725288177921086056L, (long)l)))) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ConcurrentTaskScheduler.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConcurrentTaskScheduler.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConcurrentTaskScheduler.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ConcurrentTaskScheduler.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

