/*
 * Decompiled with CFR 0.152.
 */
package com.compute.hybrid;

import a.C_;
import a.JF;
import a.T1;
import a.Wc;
import a.bE;
import a.hr;
import a.wD;
import com.app.database.optimization.QueryOptimizer;
import com.app.events.EventInterceptor;
import com.app.network.core.NetworkConnectionInitializer;
import com.app.resource.management.ResourceAllocationPolicy;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.component.management.ComponentAggregator;
import com.concurrency.management.AsyncExecutionCoordinator;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.computation.AbstractComputationKernel;
import com.crypto.cipher.SymmetricCipherManager;
import com.exception.system.CustomSystemException;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.theme.GraphicalThemeRenderer;
import com.hardware.management.HardwareYield;
import com.messaging.codec.MessageCodec;
import com.network.configuration.NetworkConfigurationManager1825;
import com.network.transformation.ChannelDataTransformer;
import com.reflection.utils.ReflectionProxyHandler;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CipherContextManager1101;
import com.security.cryptography.CryptographicContextManager153;
import com.security.registry.CryptoAlgorithmRegistry893;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.core.TransactionOrchestrator2354;
import com.ui.rendering.GraphicalRenderingController;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class HybridComputationOrchestrator
extends GraphicalRenderEngine1082 {
    private AsyncExecutionCoordinator oG;
    private static final String[] mb;
    private static String[] on;
    private GraphicalThemeRenderer oE;
    private final wD og;
    hr oz;
    private static final Integer[] eb;
    private static final long[] bb;
    private static final long ab;
    private final GraphicalThemeRenderer o7;
    boolean o_;
    private SymmetricCipherManager oc;
    private NetworkConfigurationManager1825 o0;
    private static final Map fb;
    private static final Object[] lb;
    private JF oU;

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1F6;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HybridComputationOrchestrator.eb[n2] = n3;
        }
        return eb[n2];
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00da' || c == '\u00c1' || c == '\u00dd' || c == '\u00e0') {
                field = HybridComputationOrchestrator.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00da' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = HybridComputationOrchestrator.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void lambda$null$0(ChannelDataTransformer channelDataTransformer) {
    }

    static SymmetricCipherManager M(HybridComputationOrchestrator hybridComputationOrchestrator) {
        return hybridComputationOrchestrator.oc;
    }

    private void V() {
        try {
            if (this.oG != null) {
                GraphicalRenderingController.z(this.oG);
                this.oG = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw HybridComputationOrchestrator.a(customSystemException);
        }
    }

    public HybridComputationOrchestrator(JF jF) {
        CallSite callSite;
        hr hr2;
        hr hr3;
        long l = ab ^ 0x97AE63CECCL;
        super(92.0, 11.0);
        this.oE = new HardwareYield((String)((Object)HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)25453, (long)(0x57461DD4B5F9E8CBL ^ l)), (long)-8478815187290057829L, (long)l)), 1.0, new Color(0, 0, 0, 0), HybridComputationOrchestrator.M.S, 10.0, 10.0);
        this.o7 = new GraphicalThemeRenderer((String)((Object)HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)20586, (long)(0x64630E9E4D4C5BCDL ^ l)), (long)-8478815187290057829L, (long)l)), 1.0, HybridComputationOrchestrator.M.q, Color.white, 8.0, 8.0);
        this.oc = new SymmetricCipherManager(80.0);
        this.o_ = false;
        this.oU = jF;
        this.og = new wD(jF);
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(45.0, 8.0);
        graphicalRenderEngine1082.o(new bE(2.0, 1.0));
        ComponentAggregator componentAggregator = new ComponentAggregator(jF.u());
        graphicalRenderEngine1082.o(componentAggregator);
        componentAggregator.l(new ResourceAllocationPolicy(this));
        componentAggregator.g((String)((Object)HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)7567, (long)(0x318AC8BFFD87962EL ^ l)), (long)-8478815187290057829L, (long)l)));
        this.o7.g((String)((Object)HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)20974, (long)(0x77F0855F85085A4BL ^ l)), (long)-8478815187290057829L, (long)l)));
        this.og.Z().N(this::R);
        GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(45.0, 8.0);
        graphicalRenderEngine10822.n(new bE(graphicalRenderEngine10822.w() - this.o7.w() - this.oE.w() - 2.0, 1.0), new Object[0]);
        graphicalRenderEngine10822.n(this.o7, new Object[0]);
        graphicalRenderEngine10822.n(new bE(2.0, 1.0), new Object[0]);
        graphicalRenderEngine10822.n(this.oE, new Object[0]);
        graphicalRenderEngine10822.i(false);
        graphicalRenderEngine10822.d().J(true);
        graphicalRenderEngine1082.i(false);
        this.o(graphicalRenderEngine1082, graphicalRenderEngine10822);
        this.o7.N(new NetworkConnectionInitializer(this));
        this.oc = new SymmetricCipherManager(99.0);
        this.oc.o(new bE(99.0, 3.0));
        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)8540, (long)(0x7D52885FA37A2AF7L ^ l)), (long)-8478815187290057829L, (long)l)));
        cryptographicContextManager153.B(HybridComputationOrchestrator.M.n);
        this.oc.o(cryptographicContextManager153);
        for (Map.Entry<CryptoAlgorithmRegistry893, ConfigurationProfileResolver<?, ?>> object2 : jF.b().entrySet()) {
            CryptoAlgorithmRegistry893 cryptoAlgorithmRegistry893 = object2.getKey();
            ConfigurationProfileResolver<?, ?> configurationProfileResolver = object2.getValue();
            if (!(configurationProfileResolver instanceof AuthenticationStateTracker)) continue;
            AuthenticationStateTracker authenticationStateTracker = (AuthenticationStateTracker)configurationProfileResolver;
            AdaptiveCipherEngine adaptiveCipherEngine = new AdaptiveCipherEngine(authenticationStateTracker);
            adaptiveCipherEngine.l(new EventInterceptor(this, authenticationStateTracker, cryptoAlgorithmRegistry893, configurationProfileResolver));
            this.oc.o(adaptiveCipherEngine);
        }
        try {
            hr hr4;
            this.oc.Q(HybridComputationOrchestrator.M.k);
            HybridComputationOrchestrator hybridComputationOrchestrator = this;
            hr3 = hr4;
            hr2 = hr4;
            callSite = jF.R().equals(TemporalMetadataResolver.h.O().n()) ? HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)27583, (long)(0x580133CA58F76015L ^ l)), (long)-8478815187290057829L, (long)l) : HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)22931, (long)(0x2DDF578377D05230L ^ l)), (long)-8478815187290057829L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw HybridComputationOrchestrator.a(customSystemException);
        }
        hr3((String)((Object)callSite), 0.9, HybridComputationOrchestrator.M.O, HybridComputationOrchestrator.M.b, 80.0, 10.0);
        hybridComputationOrchestrator.oz = hr2;
        this.oz.N(this::J);
        this.oz.q(false);
        this.oc.T(99.0);
        QueryOptimizer queryOptimizer = new QueryOptimizer(this, this.oc.w(), 14.0);
        queryOptimizer.d().f((String)((Object)HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)3618, (long)(0x44F29EB207160582L ^ l)), (long)-8478815187290057829L, (long)l)));
        queryOptimizer.n(new bE(99.0, 2.0), new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine10823 = new GraphicalRenderEngine1082(99.0, 10.0);
        graphicalRenderEngine10823.o(new bE(this.oc.w() / 2.0 - this.oz.w() / 2.0, 0.0), this.oz, new bE(this.oc.w() / 2.0 - this.oz.w() / 2.0, 0.0));
        queryOptimizer.o(graphicalRenderEngine10823);
        queryOptimizer.Q(HybridComputationOrchestrator.M.W);
        this.oc.o(queryOptimizer);
        this.oc.n(new bE(99.0, 6.0), new Object[0]);
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "*\u0007$";
        objectArray[1] = Integer.TYPE;
        HybridComputationOrchestrator.mb[1] = "java/lang/Integer";
        objectArray[2] = "S-\u001c+\u00131X\"\rdn)K%\u0004-";
        objectArray[3] = "\u001e7F\u0019Xh\u00158WV9f\u001e3S\f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "-/x\u001c{J\u007f`b|lXB!v\u0015gLxa6\u0006\u0007\u001a;h3@=\u001c./r|";
    }

    public GraphicalThemeRenderer A() {
        return this.oE;
    }

    public static void i(String[] stringArray) {
        on = stringArray;
    }

    static void h(HybridComputationOrchestrator hybridComputationOrchestrator) {
        hybridComputationOrchestrator.P();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                HybridComputationOrchestrator.ab = MultiContainerRegistry.a(-5572941640690908316L, 6238080018469439021L, MethodHandles.lookup().lookupClass()).a(57020383854363L);
                HybridComputationOrchestrator.lb = new Object[5];
                HybridComputationOrchestrator.mb = new String[5];
                HybridComputationOrchestrator.x();
                HybridComputationOrchestrator.fb = new HashMap<K, V>(13);
                HybridComputationOrchestrator.i(new String[5]);
                var0 = HybridComputationOrchestrator.ab ^ 132336121122847L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u0099\u00c1]\u00f1C:\u00b3\u00cb.\u009aBgE\u0002\u00a2\u0090\u009e\b\u00d6\u0093\u0083a\u0082\u000b\u00d3\u0006\u00a7\u001a\u00f3\\\u0086\u00f7D4\u00b1o\u00d7\u008bMYi\u00e47\u00e8\u00c0\u0083\u001a\u0090I$\u00f2\u0094[\u0093,\u0088%\u00d4\u00a5\r\u001f\u00d5\u0013\u00f2\u0087<V4b\u00fe\u00c5L";
                var7_6 = "\u0099\u00c1]\u00f1C:\u00b3\u00cb.\u009aBgE\u0002\u00a2\u0090\u009e\b\u00d6\u0093\u0083a\u0082\u000b\u00d3\u0006\u00a7\u001a\u00f3\\\u0086\u00f7D4\u00b1o\u00d7\u008bMYi\u00e47\u00e8\u00c0\u0083\u001a\u0090I$\u00f2\u0094[\u0093,\u0088%\u00d4\u00a5\r\u001f\u00d5\u0013\u00f2\u0087<V4b\u00fe\u00c5L".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "2\u0016\u00a7\u008a\u00f5\u0097g\u0099\u00cb\u00e1\u0083a\u009dS\u001f\u0091";
                    var7_6 = "2\u0016\u00a7\u008a\u00f5\u0097g\u0099\u00cb\u00e1\u0083a\u009dS\u001f\u0091".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        HybridComputationOrchestrator.bb = var8_3;
        HybridComputationOrchestrator.eb = new Integer[11];
    }

    public static String[] u() {
        return on;
    }

    static AsyncExecutionCoordinator g(HybridComputationOrchestrator hybridComputationOrchestrator) {
        return hybridComputationOrchestrator.oG;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void J() {
        block7: {
            block8: {
                long l = ab ^ 0xAEBC4788340L;
                try {
                    if (this.o_) {
                        return;
                    }
                }
                catch (Exception exception) {
                    throw HybridComputationOrchestrator.a(exception);
                }
                try {
                    this.o_ = true;
                    if (this.oU == null) break block7;
                    if (!this.oU.R().equals(TemporalMetadataResolver.h.O().n())) break block8;
                }
                catch (Exception exception) {
                    throw HybridComputationOrchestrator.a(exception);
                }
                try {
                    GraphicalRenderingController.z(this.oG);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                C_ c_ = new C_((String)((Object)HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)28459, (long)(0x6A7199233B0A905L ^ l)), (long)-4046140122625155561L, (long)l)), (String)((Object)HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)10942, (long)(0x6B20BA950B646C9AL ^ l)), (long)-4046140122625155561L, (long)l)), (String)((Object)HybridComputationOrchestrator.d("\u00e3", (int)HybridComputationOrchestrator.c("k", (int)3644, (long)(0x5F9DDB62F9494814L ^ l)), (long)-4046140122625155561L, (long)l)));
                NetworkConfigurationManager1825 networkConfigurationManager1825 = GraphicalRenderingController.v(this.V(), c_, NetworkConfigurationManager1825.class);
                c_.Z().N(() -> this.lambda$leaveAction$2(networkConfigurationManager1825));
                c_.u().N(() -> this.lambda$leaveAction$3(networkConfigurationManager1825));
                networkConfigurationManager1825.l(new Wc(this, networkConfigurationManager1825));
                break block7;
            }
            GraphicalRenderingController.z(this.oG);
            SecureContextBroker572.h().c().d(HybridComputationOrchestrator::lambda$leaveAction$4, this::lambda$leaveAction$5);
        }
    }

    private void lambda$leaveAction$3(CipherContextManager1101 cipherContextManager1101) {
        GraphicalRenderingController.z(cipherContextManager1101);
        this.o_ = false;
    }

    static void j(HybridComputationOrchestrator hybridComputationOrchestrator) {
        hybridComputationOrchestrator.F();
    }

    private void lambda$leaveAction$5() {
        this.o_ = false;
    }

    @Override
    public void d() {
        try {
            this.oU = TemporalMetadataResolver.h.O().p().Q();
            if (this.oU == null) {
                this.R();
                this.V();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw HybridComputationOrchestrator.a(customSystemException);
        }
        boolean bl = this.oU.R().equals(TemporalMetadataResolver.h.O().n());
        for (AbstractComputationKernel abstractComputationKernel : this.oc.A()) {
            boolean bl2;
            TransactionOrchestrator2354 transactionOrchestrator2354;
            block9: {
                block8: {
                    try {
                        try {
                            if (!(abstractComputationKernel instanceof TransactionOrchestrator2354)) continue;
                            transactionOrchestrator2354 = (TransactionOrchestrator2354)((Object)abstractComputationKernel);
                            if (bl) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw HybridComputationOrchestrator.a(customSystemException);
                        }
                        bl2 = true;
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw HybridComputationOrchestrator.a(customSystemException);
                    }
                }
                bl2 = false;
            }
            transactionOrchestrator2354.Z(bl2);
        }
        super.d();
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (mb[n4] != null) {
            return n4;
        }
        Object object = lb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 56;
                break;
            }
            case 1: {
                n3 = 37;
                break;
            }
            case 2: {
                n3 = 51;
                break;
            }
            case 3: {
                n3 = 59;
                break;
            }
            case 4: {
                n3 = 26;
                break;
            }
            case 5: {
                n3 = 36;
                break;
            }
            case 6: {
                n3 = 15;
                break;
            }
            case 7: {
                n3 = 11;
                break;
            }
            case 8: {
                n3 = 60;
                break;
            }
            case 9: {
                n3 = 23;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 11: {
                n3 = 0;
                break;
            }
            case 12: {
                n3 = 9;
                break;
            }
            case 13: {
                n3 = 25;
                break;
            }
            case 14: {
                n3 = 5;
                break;
            }
            case 15: {
                n3 = 13;
                break;
            }
            case 16: {
                n3 = 30;
                break;
            }
            case 17: {
                n3 = 38;
                break;
            }
            case 18: {
                n3 = 8;
                break;
            }
            case 19: {
                n3 = 35;
                break;
            }
            case 20: {
                n3 = 3;
                break;
            }
            case 21: {
                n3 = 61;
                break;
            }
            case 22: {
                n3 = 28;
                break;
            }
            case 23: {
                n3 = 27;
                break;
            }
            case 24: {
                n3 = 7;
                break;
            }
            case 25: {
                n3 = 52;
                break;
            }
            case 26: {
                n3 = 2;
                break;
            }
            case 27: {
                n3 = 42;
                break;
            }
            case 28: {
                n3 = 54;
                break;
            }
            case 29: {
                n3 = 21;
                break;
            }
            case 30: {
                n3 = 14;
                break;
            }
            case 31: {
                n3 = 46;
                break;
            }
            case 32: {
                n3 = 24;
                break;
            }
            case 33: {
                n3 = 18;
                break;
            }
            case 34: {
                n3 = 44;
                break;
            }
            case 35: {
                n3 = 40;
                break;
            }
            case 36: {
                n3 = 32;
                break;
            }
            case 37: {
                n3 = 58;
                break;
            }
            case 38: {
                n3 = 20;
                break;
            }
            case 39: {
                n3 = 43;
                break;
            }
            case 40: {
                n3 = 10;
                break;
            }
            case 41: {
                n3 = 55;
                break;
            }
            case 42: {
                n3 = 49;
                break;
            }
            case 43: {
                n3 = 63;
                break;
            }
            case 44: {
                n3 = 62;
                break;
            }
            case 45: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 45;
                break;
            }
            case 47: {
                n3 = 48;
                break;
            }
            case 48: {
                n3 = 34;
                break;
            }
            case 49: {
                n3 = 19;
                break;
            }
            case 50: {
                n3 = 29;
                break;
            }
            case 51: {
                n3 = 33;
                break;
            }
            case 52: {
                n3 = 53;
                break;
            }
            case 53: {
                n3 = 50;
                break;
            }
            case 54: {
                n3 = 12;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 1;
                break;
            }
            case 57: {
                n3 = 16;
                break;
            }
            case 58: {
                n3 = 57;
                break;
            }
            case 59: {
                n3 = 17;
                break;
            }
            case 60: {
                n3 = 41;
                break;
            }
            case 61: {
                n3 = 22;
                break;
            }
            case 62: {
                n3 = 47;
                break;
            }
            default: {
                n3 = 6;
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
        HybridComputationOrchestrator.mb[n4] = new String(cArray);
        return n4;
    }

    private void F() {
        if (this.o0 == null) {
            ReflectionProxyHandler reflectionProxyHandler = GraphicalRenderingController.D(ReflectionProxyHandler.class);
            this.o0 = (NetworkConfigurationManager1825)reflectionProxyHandler.C(reflectionProxyHandler.S(), this.og, NetworkConfigurationManager1825.class);
        }
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = HybridComputationOrchestrator.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static void Q(HybridComputationOrchestrator hybridComputationOrchestrator) {
        hybridComputationOrchestrator.V();
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = HybridComputationOrchestrator.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                HybridComputationOrchestrator.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = HybridComputationOrchestrator.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = HybridComputationOrchestrator.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = HybridComputationOrchestrator.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n];
                int n3 = string2.indexOf(8);
                clazz3 = HybridComputationOrchestrator.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = HybridComputationOrchestrator.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = HybridComputationOrchestrator.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        HybridComputationOrchestrator.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = HybridComputationOrchestrator.j(234404488844342L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = HybridComputationOrchestrator.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        HybridComputationOrchestrator.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = HybridComputationOrchestrator.j(234404488844342L, 0L);
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

    private void R() {
        try {
            if (this.o0 != null) {
                GraphicalRenderingController.z(this.o0);
                this.o0 = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw HybridComputationOrchestrator.a(customSystemException);
        }
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void lambda$leaveAction$4(T1 t1) {
    }

    private void lambda$leaveAction$2(CipherContextManager1101 cipherContextManager1101) {
        GraphicalRenderingController.z(cipherContextManager1101);
        SecureContextBroker572.h().c().O(HybridComputationOrchestrator::lambda$null$0, this::lambda$null$1);
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = HybridComputationOrchestrator.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void P() {
        if (this.oG == null) {
            ReflectionProxyHandler reflectionProxyHandler = GraphicalRenderingController.D(ReflectionProxyHandler.class);
            this.oG = (AsyncExecutionCoordinator)reflectionProxyHandler.C(this.o7, this.oc, AsyncExecutionCoordinator.class);
            this.oG.l(new MessageCodec(this));
        } else {
            this.V();
        }
    }

    private static Field k(long l, long l2) {
        int n = HybridComputationOrchestrator.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = HybridComputationOrchestrator.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = HybridComputationOrchestrator.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = HybridComputationOrchestrator.e(clazz3, string2, clazz2)) != null) {
                    HybridComputationOrchestrator.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = HybridComputationOrchestrator.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        HybridComputationOrchestrator.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = HybridComputationOrchestrator.j(234404488844342L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void E() {
        this.i(false);
        super.E();
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = HybridComputationOrchestrator.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = HybridComputationOrchestrator.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private void lambda$null$1() {
        this.o_ = false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(HybridComputationOrchestrator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(HybridComputationOrchestrator.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

