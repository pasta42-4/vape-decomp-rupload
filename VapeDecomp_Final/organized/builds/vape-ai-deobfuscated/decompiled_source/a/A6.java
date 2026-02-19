/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 */
package a;

import a.Ne;
import a.a;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.ui.theming.StylesheetThemeManager;
import com.asset.management.AssetLifecycleManager;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.flow.DataFlowAnalyzer;
import com.deobfuscation.strategy.ExecutionStrategy;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.validation.PaymentValidationService;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.rendering.GraphicsRenderingContext;
import com.math.computation.NumericComputationEngine1131;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.ProtocolInteractionController;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.security.context.SecurityContextManager2112;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.transaction.audit.TransactionAuditor;
import com.transaction.core.BaseTransactionProcessor;
import com.transaction.core.TransactionProcessor2473;
import com.validation.core.ObjectValidator;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
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
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class A6
extends ContextualExecutionFramework {
    private static final Map l;
    private final AdaptiveRenderingEngine T;
    private boolean e;
    private final AdaptiveRenderingEngine O;
    private final ArrayList<GraphicsRenderingContext> K;
    private static final String[] o;
    private final AssetLifecycleManager m;
    private final NumericComputationEngine1131 X;
    private Color F;
    private static final Object[] n;
    private final StylesheetThemeManager t;
    private static final Integer[] j;
    private final AssetLifecycleManager A;
    private final StylesheetThemeManager w;
    private final BaseTransactionProcessor d;
    private final AdaptiveRenderingEngine L;
    private static final long[] h;
    private static final long b;
    private final AuthenticationStateTracker Z;
    private final StylesheetThemeManager P;

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x9E3;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])A6.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    A6.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/A6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            A6.j[n2] = n3;
        }
        return j[n2];
    }

    private void I(double d2, double d3, double d4) {
        this.K.add(new GraphicsRenderingContext(d2, d3, d4, null));
    }

    private void T(@Nullable Color color) {
        if (ConfigurationManager.U()) {
            for (GraphicsRenderingContext graphicsRenderingContext : this.K) {
                Color color2;
                float f;
                double d2;
                double d3;
                double d4;
                double d5;
                double d6;
                double d7;
                try {
                    d7 = graphicsRenderingContext.t;
                    d6 = graphicsRenderingContext.Y;
                    d5 = graphicsRenderingContext.V;
                    d4 = graphicsRenderingContext.a;
                    d3 = graphicsRenderingContext.f;
                    d2 = graphicsRenderingContext.Q;
                    f = graphicsRenderingContext.T;
                    color2 = color == null ? graphicsRenderingContext.N : color;
                }
                catch (CustomSystemException customSystemException) {
                    throw A6.a(customSystemException);
                }
                DataFlowAnalyzer.N(d7, d6, d5, d4, d3, d2, f, color2);
            }
        } else {
            for (GraphicsRenderingContext graphicsRenderingContext : this.K) {
                GL11.glVertex3d((double)graphicsRenderingContext.t, (double)graphicsRenderingContext.Y, (double)graphicsRenderingContext.V);
            }
        }
        this.K.clear();
    }

    private static void a() {
        Object[] objectArray = n;
        n[0] = "x\u0019\b";
        objectArray[1] = Integer.TYPE;
        A6.o[1] = "java/lang/Integer";
        objectArray[2] = ".)K/:a%&Z`Gy6!S)";
        objectArray[3] = ",\u000eNU3['\u0001_\u001aRU,\n[@";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "#GbY\u0004l*[xi\u0006'I\u00051\u0015S58B0\u000e\u0010\\pCm\u0007\u0014<\"@`\tm";
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = A6.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    private static Method d(long l, long l2) {
        int n = A6.a(l, l2);
        Object object = A6.n[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = A6.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = A6.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = A6.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        A6.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = A6.b(279615917379642L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = A6.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        A6.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = A6.b(279615917379642L, 0L);
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

    public A6() {
        long l = b ^ 0x48479AA34E81L;
        super(a.cs((int)A6.a("n", (int)3595, (long)(0x64181833F16773ABL ^ l))), (int)A6.a("n", (int)21613, (long)(0xD5B3447242C29C9L ^ l)), RecursiveNodeGraph.z, a.cs((int)A6.a("n", (int)32736, (long)(0xBAC9AE43BCC0242L ^ l))));
        this.T = AdaptiveRenderingEngine.C(this, (String)((Object)A6.c("G", (int)A6.a("n", (int)23002, (long)(0x6545F1970237A47DL ^ l)), (long)-844976685090829145L, (long)l)), new Color(255, 255, 255));
        this.A = new TransactionAuditor(this);
        this.Z = AuthenticationStateTracker.R(this, (String)((Object)A6.c("G", (int)A6.a("n", (int)27896, (long)(0x5ECF6F664BE5915DL ^ l)), (long)-844976685090829145L, (long)l)), false, (String)((Object)A6.c("G", (int)A6.a("n", (int)10452, (long)(0x1BC349EA1BD2D575L ^ l)), (long)-844976685090829145L, (long)l)));
        this.P = new StylesheetThemeManager(Collections.singleton(ReflectionMetadataResolver.El), new Color(255, 238, 154));
        this.w = new StylesheetThemeManager(Collections.singleton(ReflectionMetadataResolver.EH), new Color(173, 12, 255));
        this.t = new StylesheetThemeManager(Collections.singleton(ReflectionMetadataResolver.P3), new Color(255, 255, 255));
        this.d = new BaseTransactionProcessor();
        this.m = new TransactionProcessor2473(this);
        this.L = AdaptiveRenderingEngine.C(this, (String)((Object)A6.c("G", (int)A6.a("n", (int)11287, (long)(0x4D9813C86DE4D1B4L ^ l)), (long)-844976685090829145L, (long)l)), new Color(0, 0, 255, 255));
        this.O = AdaptiveRenderingEngine.C(this, (String)((Object)A6.c("G", (int)A6.a("n", (int)28793, (long)(0x4EE743A4ED180DD5L ^ l)), (long)-844976685090829145L, (long)l)), new Color(255, 0, 0, 255));
        this.K = new ArrayList();
        this.N(this.T, this.O, this.L, this.Z);
        this.X = ApplicationLifecycleManager.r();
        this.F = this.O.L();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Nullable
    private LightweightExecutionContext O(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        if (GameVersionEnumerator.MC_1_12_2.H()) {
            List<LightweightExecutionContext> list = Arrays.asList(systemConfigurationOrchestrator.G(SecurityContextManager2112.R()), systemConfigurationOrchestrator.G(SecurityContextManager2112.e()));
            for (LightweightExecutionContext lightweightExecutionContext : list) {
                try {
                    if (lightweightExecutionContext.Y()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw A6.a(customSystemException);
                }
                ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
                try {
                    if (protocolInteractionController.Y()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw A6.a(customSystemException);
                }
                ExecutionStrategy executionStrategy = this.d(protocolInteractionController);
                try {
                    if (executionStrategy == null) continue;
                    return lightweightExecutionContext;
                }
                catch (CustomSystemException customSystemException) {
                    throw A6.a(customSystemException);
                }
            }
            return null;
        }
        return systemConfigurationOrchestrator.K();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @DataExchangeProtocol2090
    public void E(EventDispatchRegistry2111 var1_1) {
        block154: {
            block153: {
                block151: {
                    block149: {
                        block139: {
                            block138: {
                                block137: {
                                    block136: {
                                        block135: {
                                            block134: {
                                                var2_2 = A6.b ^ 18536982935058L;
                                                var4_3 = var1_1.getThePlayer();
                                                try {
                                                    if (var4_3.Y()) {
                                                        return;
                                                    }
                                                }
                                                catch (CustomSystemException v0) {
                                                    throw A6.a(v0);
                                                }
                                                var5_4 = var1_1.getWorld();
                                                try {
                                                    if (var5_4.Y()) {
                                                        return;
                                                    }
                                                }
                                                catch (CustomSystemException v1) {
                                                    throw A6.a(v1);
                                                }
                                                var6_5 = this.O(var4_3);
                                                try {
                                                    try {
                                                        if (var6_5 == null) return;
                                                        if (var6_5.Y()) {
                                                            return;
                                                        }
                                                    }
                                                    catch (CustomSystemException v2) {
                                                        throw A6.a(v2);
                                                    }
                                                }
                                                catch (CustomSystemException v3) {
                                                    throw A6.a(v3);
                                                }
                                                var7_6 = var6_5.C();
                                                try {
                                                    if (var7_6.Y()) {
                                                        return;
                                                    }
                                                }
                                                catch (CustomSystemException v4) {
                                                    throw A6.a(v4);
                                                }
                                                var8_7 = this.d(var7_6);
                                                try {
                                                    if (var8_7 == null) {
                                                        return;
                                                    }
                                                }
                                                catch (CustomSystemException v5) {
                                                    throw A6.a(v5);
                                                }
                                                try {
                                                    v6 = var8_7 == this.A;
                                                }
                                                catch (CustomSystemException v7) {
                                                    throw A6.a(v7);
                                                }
                                                var9_8 = v6;
                                                var10_9 = var7_6.B(ReflectionMetadataResolver.V1);
                                                try {
                                                    v8 = var8_7 == this.d;
                                                }
                                                catch (CustomSystemException v9) {
                                                    throw A6.a(v9);
                                                }
                                                var11_10 = v8;
                                                var12_11 = var4_3.S() / 180.0f * 3.1415927f;
                                                var13_12 = var4_3.q() / 180.0f * 3.1415927f;
                                                try {
                                                    v10 = var9_8 != false ? 1.0 : 0.4;
                                                }
                                                catch (CustomSystemException v11) {
                                                    throw A6.a(v11);
                                                }
                                                var14_13 = v10;
                                                try {
                                                    v12 = GameVersionEnumerator.MC_1_16_5.H() != false ? -1.6 : 0.0;
                                                }
                                                catch (CustomSystemException v13) {
                                                    throw A6.a(v13);
                                                }
                                                var16_14 = v12;
                                                var18_15 = NumericComputationEngine1131.b() - (double)(AdaptiveComputationEngine.S(var13_12) * 0.16f);
                                                var20_16 = NumericComputationEngine1131.S() + (double)var4_3.E() - 0.10000000149011612 + var16_14;
                                                var22_17 = NumericComputationEngine1131.n() - (double)(AdaptiveComputationEngine.D(var13_12) * 0.16f);
                                                var24_18 = (double)(-AdaptiveComputationEngine.D(var13_12) * AdaptiveComputationEngine.S(var12_11)) * var14_13;
                                                var26_19 = (double)(-AdaptiveComputationEngine.D(var12_11)) * var14_13;
                                                var28_20 = (double)(AdaptiveComputationEngine.S(var13_12) * AdaptiveComputationEngine.S(var12_11)) * var14_13;
                                                var30_21 = false;
                                                var31_22 = 40;
                                                try {
                                                    try {
                                                        try {
                                                            if (!var10_9 || this.Z.s().booleanValue()) break block134;
                                                        }
                                                        catch (CustomSystemException v14) {
                                                            throw A6.a(v14);
                                                        }
                                                        if (!PaymentValidationService.J(var6_5)) {
                                                            return;
                                                        }
                                                    }
                                                    catch (CustomSystemException v15) {
                                                        throw A6.a(v15);
                                                    }
                                                }
                                                catch (CustomSystemException v16) {
                                                    throw A6.a(v16);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (this.Z.s().booleanValue() || var4_3.R() > 0) break block135;
                                                            }
                                                            catch (CustomSystemException v17) {
                                                                throw A6.a(v17);
                                                            }
                                                            if (!var9_8) break block135;
                                                        }
                                                        catch (CustomSystemException v18) {
                                                            throw A6.a(v18);
                                                        }
                                                        if (var10_9 == false) return;
                                                    }
                                                    catch (CustomSystemException v19) {
                                                        throw A6.a(v19);
                                                    }
                                                    if (!PaymentValidationService.J(var6_5)) {
                                                        return;
                                                    }
                                                }
                                                catch (CustomSystemException v20) {
                                                    throw A6.a(v20);
                                                }
                                            }
                                            catch (CustomSystemException v21) {
                                                throw A6.a(v21);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (var4_3.R() > 0 && var9_8) break block136;
                                                }
                                                catch (CustomSystemException v22) {
                                                    throw A6.a(v22);
                                                }
                                                if (!var10_9) break block137;
                                            }
                                            catch (CustomSystemException v23) {
                                                throw A6.a(v23);
                                            }
                                            if (!PaymentValidationService.J(var6_5)) break block137;
                                        }
                                        catch (CustomSystemException v24) {
                                            throw A6.a(v24);
                                        }
                                    }
                                    var31_22 = var4_3.R();
                                    var30_21 = true;
                                }
                                var32_23 = A6.a("n", (int)18869, (long)(5547698210666843264L ^ var2_2)) - var31_22;
                                var33_24 = (float)var32_23 / 20.0f;
                                var33_24 = (var33_24 * var33_24 + var33_24 * 2.0f) / 3.0f;
                                try {
                                    if ((double)var33_24 < 0.1) {
                                        return;
                                    }
                                }
                                catch (CustomSystemException v25) {
                                    throw A6.a(v25);
                                }
                                if (var33_24 > 1.0f) {
                                    var33_24 = 1.0f;
                                }
                                GraphicsBufferAllocator.V();
                                CryptoContextNegotiator684.Y();
                                ApplicationLifecycleManager.U().H(0.0);
                                var34_25 = Ne.h.k(2929);
                                var35_26 = Ne.h.k(3553);
                                var36_27 = Ne.h.k(3042);
                                try {
                                    if (var34_25) {
                                        Ne.h.z(2929);
                                    }
                                }
                                catch (CustomSystemException v26) {
                                    throw A6.a(v26);
                                }
                                try {
                                    if (var35_26) {
                                        Ne.h.z(3553);
                                    }
                                }
                                catch (CustomSystemException v27) {
                                    throw A6.a(v27);
                                }
                                try {
                                    Ne.h.y(2848);
                                    GL11.glBlendFunc((int)770, (int)771);
                                    if (!var36_27) {
                                        Ne.h.y(3042);
                                    }
                                }
                                catch (CustomSystemException v28) {
                                    throw A6.a(v28);
                                }
                                var37_28 = AdaptiveComputationEngine.C(var24_18 * var24_18 + var26_19 * var26_19 + var28_20 * var28_20);
                                var24_18 /= (double)var37_28;
                                var26_19 /= (double)var37_28;
                                var28_20 /= (double)var37_28;
                                try {
                                    v29 = var9_8 != false ? var33_24 * 2.0f : 1.0f;
                                }
                                catch (CustomSystemException v30) {
                                    throw A6.a(v30);
                                }
                                var38_29 = (double)v29 * 1.5;
                                var24_18 *= var38_29;
                                var26_19 *= var38_29;
                                var28_20 *= var38_29;
                                Ne.h.h(1.5f);
                                Ne.h.i(3);
                                var40_30 = false;
                                var41_31 = new NetworkPacketInterceptor1107(null);
                                var42_32 = var8_7.r();
                                var43_33 = var8_7.Y();
                                var44_34 = var42_32 / 2.0f;
                                try {
                                    if (!this.e) break block138;
                                    GraphicsBufferAllocator.Y(this.O.L());
                                    this.F = this.O.L();
                                    break block139;
                                }
                                catch (CustomSystemException v31) {
                                    throw A6.a(v31);
                                }
                            }
                            GraphicsBufferAllocator.Y(this.T.L());
                            this.F = this.T.L();
                        }
                        this.e = false;
                        var45_35 = (Predicate<NetworkPacketInterceptor1107>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onRenderWorldLast$0(com.network.protocol.NetworkPacketInterceptor1107 ), (Lcom/network/protocol/NetworkPacketInterceptor1107;)Z)();
                        var46_36 = 0.0;
                        var48_37 = 0.0;
                        var50_38 = 0.0;
                        var52_39 = false;
                        while (!var40_30) {
                            block148: {
                                block147: {
                                    block146: {
                                        block144: {
                                            block145: {
                                                var53_40 = ContextualEventDispatcher.N(var18_15, var20_16, var22_17);
                                                var54_41 = ContextualEventDispatcher.N(var18_15 + var24_18, var20_16 + var26_19, var22_17 + var28_20);
                                                var41_31 = ApplicationLifecycleManager.c().g((ContextualEventDispatcher)var53_40, (ContextualEventDispatcher)var54_41, false, var9_8, false, var4_3);
                                                var53_40 = ContextualEventDispatcher.N(var18_15, var20_16, var22_17);
                                                var54_41 = ContextualEventDispatcher.N(var18_15 + var24_18, var20_16 + var26_19, var22_17 + var28_20);
                                                if (var45_35.test(var41_31)) {
                                                    var55_42 = var41_31.i();
                                                    var54_41 = ContextualEventDispatcher.N(var55_42.X(), var55_42.F(), var55_42.f());
                                                }
                                                var55_42 = oQ.E(var18_15 - (double)var44_34, var20_16, var22_17 - (double)var44_34, var18_15 + (double)var44_34, var20_16 + (double)var43_33, var22_17 + (double)var44_34);
                                                var56_43 = 0.0;
                                                var58_44 = var5_4.R(var4_3, var55_42.r(var24_18, var26_19, var28_20).B(1.0, 1.0, 1.0));
                                                for (E var60_49 : var58_44) {
                                                    block142: {
                                                        block143: {
                                                            block140: {
                                                                block141: {
                                                                    var61_52 = new CryptographicTransformer(var60_49);
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (!GameVersionEnumerator.MC_1_16_5.H()) break block140;
                                                                                    if (!var61_52.B(ReflectionMetadataResolver.Ut)) break block141;
                                                                                }
                                                                                catch (CustomSystemException v32) {
                                                                                    throw A6.a(v32);
                                                                                }
                                                                                if (var61_52.B(ReflectionMetadataResolver.tD)) break block141;
                                                                            }
                                                                            catch (CustomSystemException v33) {
                                                                                throw A6.a(v33);
                                                                            }
                                                                            if (var61_52.equals(var4_3)) break block141;
                                                                        }
                                                                        catch (CustomSystemException v34) {
                                                                            throw A6.a(v34);
                                                                        }
                                                                        v35 = true;
                                                                        break block142;
                                                                    }
                                                                    catch (CustomSystemException v36) {
                                                                        throw A6.a(v36);
                                                                    }
                                                                }
                                                                v35 = false;
                                                                break block142;
                                                            }
                                                            try {
                                                                try {
                                                                    if (!var61_52.m() || var61_52.equals(var4_3)) break block143;
                                                                }
                                                                catch (CustomSystemException v37) {
                                                                    throw A6.a(v37);
                                                                }
                                                                v35 = true;
                                                                break block142;
                                                            }
                                                            catch (CustomSystemException v38) {
                                                                throw A6.a(v38);
                                                            }
                                                        }
                                                        v35 = false;
                                                    }
                                                    var62_53 = v35;
                                                    try {
                                                        if (!var62_53) {
                                                            continue;
                                                        }
                                                    }
                                                    catch (CustomSystemException v39) {
                                                        throw A6.a(v39);
                                                    }
                                                    var63_56 = var61_52.S().B(0.3, 0.3, 0.3);
                                                    var64_57 = var63_56.x((ContextualEventDispatcher)var53_40, (ContextualEventDispatcher)var54_41);
                                                    if (!var45_35.test(var64_57)) continue;
                                                    var65_60 = var53_40.R(var64_57.i());
                                                    try {
                                                        if (var56_43 != 0.0 && !(var65_60 < var56_43)) continue;
                                                    }
                                                    catch (CustomSystemException v40) {
                                                        throw A6.a(v40);
                                                    }
                                                    var64_57.s(var61_52);
                                                    var56_43 = var65_60;
                                                    var41_31 = var64_57;
                                                    var40_30 = true;
                                                    this.e = true;
                                                }
                                                var18_15 += var24_18;
                                                var20_16 += var26_19;
                                                var22_17 += var28_20;
                                                var59_46 = false;
                                                try {
                                                    try {
                                                        if (!var59_46) break block144;
                                                        if (!var9_8) break block145;
                                                    }
                                                    catch (CustomSystemException v41) {
                                                        throw A6.a(v41);
                                                    }
                                                    v42 = 0.6f;
                                                    break block146;
                                                }
                                                catch (CustomSystemException v43) {
                                                    throw A6.a(v43);
                                                }
                                            }
                                            v42 = 0.8f;
                                            break block146;
                                        }
                                        v42 = 0.99f;
                                    }
                                    var60_48 = v42;
                                    try {
                                        try {
                                            if (!var9_8 && !var11_10) break block147;
                                        }
                                        catch (CustomSystemException v44) {
                                            throw A6.a(v44);
                                        }
                                        v45 = 0.05f;
                                        break block148;
                                    }
                                    catch (CustomSystemException v46) {
                                        throw A6.a(v46);
                                    }
                                }
                                v45 = 0.03f;
                            }
                            var61_51 = v45;
                            var24_18 *= (double)var60_48;
                            var26_19 *= (double)var60_48;
                            var28_20 *= (double)var60_48;
                            var26_19 -= (double)var61_51;
                            if (ConfigurationManager.U()) {
                                var62_54 = var18_15 - NumericComputationEngine1131.b();
                                var64_58 = var20_16 - NumericComputationEngine1131.S();
                                var66_61 = var22_17 - NumericComputationEngine1131.n();
                                if (!var52_39) {
                                    var46_36 = var62_54;
                                    var48_37 = var64_58;
                                    var50_38 = var66_61;
                                    var52_39 = true;
                                    continue;
                                }
                                this.M(var46_36, var48_37, var50_38, var62_54, var64_58, var66_61, 1.5f);
                                var46_36 = var62_54;
                                var48_37 = var64_58;
                                var50_38 = var66_61;
                            } else {
                                this.I(var18_15 - NumericComputationEngine1131.b(), var20_16 - NumericComputationEngine1131.S(), var22_17 - NumericComputationEngine1131.n());
                            }
                            try {
                                try {
                                    try {
                                        if (var40_30 || var20_16 < -128.0) break;
                                    }
                                    catch (CustomSystemException v47) {
                                        throw A6.a(v47);
                                    }
                                    if (!var45_35.test(var41_31)) continue;
                                    break;
                                }
                                catch (CustomSystemException v48) {
                                    throw A6.a(v48);
                                }
                            }
                            catch (CustomSystemException v49) {
                                throw A6.a(v49);
                            }
                        }
                        this.T(this.F);
                        Ne.h.a();
                        Ne.h.m(var18_15 - NumericComputationEngine1131.b(), var20_16 - NumericComputationEngine1131.S(), var22_17 - NumericComputationEngine1131.n());
                        if (!var45_35.test(var41_31)) break block154;
                        var53_40 = var41_31.q();
                        var54_41 = var41_31.l();
                        try {
                            if (!GameVersionEnumerator.MC_1_16_5.Q() && !ObjectValidator.Y().equals(var53_40)) break block149;
                        }
                        catch (CustomSystemException v50) {
                            throw A6.a(v50);
                        }
                        var55_42 = var41_31.K();
                        try {
                            try {
                                if (!var55_42.r()) ** GOTO lbl416
                                switch (var55_42.p()) {
                                    case 2: 
                                    case 3: {
                                        Ne.h.f(90.0f, 1.0f, 0.0f, 0.0f);
                                        break;
                                    }
                                    case 4: 
                                    case 5: {
                                        Ne.h.f(90.0f, 0.0f, 0.0f, 1.0f);
                                        break;
                                    }
                                }
                            }
                            catch (CustomSystemException v51) {
                                throw A6.a(v51);
                            }
                        }
                        catch (CustomSystemException v52) {
                            throw A6.a(v52);
                        }
                    }
                    if (var54_41.r()) {
                        block152: {
                            block150: {
                                var55_42 = var54_41.S().B(0.3, 0.3, 0.3);
                                var56_43 = var41_31.i().X();
                                var58_45 = var41_31.i().F();
                                var60_50 = var41_31.i().f();
                                var62_55 = var55_42.F();
                                var64_59 = var55_42.f();
                                var66_61 = var55_42.c();
                                var68_62 = var55_42.P();
                                var70_63 = var55_42.v();
                                var72_64 = var55_42.R();
                                var74_65 = Math.abs(var56_43 - var62_55);
                                var76_66 = Math.abs(var56_43 - var64_59);
                                var78_67 = Math.min(var74_65, var76_66);
                                var80_68 = Math.abs(var60_50 - var70_63);
                                var82_69 = Math.abs(var60_50 - var72_64);
                                var84_70 = Math.min(var80_68, var82_69);
                                var86_71 = Math.abs(var58_45 - var66_61);
                                var88_72 = Math.abs(var58_45 - var68_62);
                                var90_73 = Math.min(var86_71, var88_72);
                                var92_74 = Math.min(var90_73, Math.min(var78_67, var84_70));
                                try {
                                    if (var92_74 != var78_67) break block150;
                                    Ne.h.f(90.0f, 0.0f, 0.0f, 1.0f);
                                    break block151;
                                }
                                catch (CustomSystemException v53) {
                                    throw A6.a(v53);
                                }
                            }
                            try {
                                if (var92_74 != var84_70) break block152;
                                Ne.h.f(90.0f, 1.0f, 0.0f, 0.0f);
                                break block151;
                            }
                            catch (CustomSystemException v54) {
                                throw A6.a(v54);
                            }
                        }
                        if (var92_74 == var90_73) {
                            // empty if block
                        }
                    }
                }
                try {
                    if (!var54_41.r()) break block153;
                    GraphicsBufferAllocator.Y(this.L.L());
                    this.F = this.L.L();
                    break block154;
                }
                catch (CustomSystemException v55) {
                    throw A6.a(v55);
                }
            }
            GraphicsBufferAllocator.Y(this.T.L());
            this.F = this.T.L();
        }
        try {
            this.s();
            Ne.h.z(2929);
            if (!var36_27) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException v56) {
            throw A6.a(v56);
        }
        try {
            Ne.h.z(2848);
            if (var34_25) {
                Ne.h.y(2929);
            }
        }
        catch (CustomSystemException v57) {
            throw A6.a(v57);
        }
        try {
            if (var35_26) {
                Ne.h.y(3553);
            }
        }
        catch (CustomSystemException v58) {
            throw A6.a(v58);
        }
        try {
            if (!var36_27) {
                Ne.h.z(3042);
            }
        }
        catch (CustomSystemException v59) {
            throw A6.a(v59);
        }
        ApplicationLifecycleManager.U().F(0.0);
        GraphicsBufferAllocator.E();
        Ne.h.X();
    }

    private void M(double d2, double d3, double d4, double d5, double d6, double d7, float f) {
        this.K.add(new GraphicsRenderingContext(d2, d3, d4, d5, d6, d7, f, null));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Nullable
    private ExecutionStrategy d(ProtocolInteractionController protocolInteractionController) {
        try {
            if (protocolInteractionController.B(ReflectionMetadataResolver.U6)) {
                return this.A;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A6.a(customSystemException);
        }
        try {
            if (protocolInteractionController.B(ReflectionMetadataResolver.bP)) {
                return this.t;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A6.a(customSystemException);
        }
        try {
            if (protocolInteractionController.B(ReflectionMetadataResolver.Vu)) {
                return this.w;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A6.a(customSystemException);
        }
        try {
            if (protocolInteractionController.B(ReflectionMetadataResolver.YZ)) {
                return this.P;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A6.a(customSystemException);
        }
        try {
            if (protocolInteractionController.B(ReflectionMetadataResolver.F1)) {
                return this.d;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A6.a(customSystemException);
        }
        try {
            if (protocolInteractionController.B(ReflectionMetadataResolver.V1)) {
                return this.A;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw A6.a(customSystemException);
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e9' || c == 'A' || c == '\u00c5' || c == '\u00db') {
                field = A6.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e9' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = A6.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'g' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'G' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = A6.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = A6.b(classArray2[i], string, clazz2, n, classArray);
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
        if (o[n4] != null) {
            return n4;
        }
        Object object = A6.n[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 30;
                break;
            }
            case 1: {
                n3 = 9;
                break;
            }
            case 2: {
                n3 = 11;
                break;
            }
            case 3: {
                n3 = 8;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 32;
                break;
            }
            case 6: {
                n3 = 31;
                break;
            }
            case 7: {
                n3 = 46;
                break;
            }
            case 8: {
                n3 = 27;
                break;
            }
            case 9: {
                n3 = 25;
                break;
            }
            case 10: {
                n3 = 20;
                break;
            }
            case 11: {
                n3 = 12;
                break;
            }
            case 12: {
                n3 = 38;
                break;
            }
            case 13: {
                n3 = 14;
                break;
            }
            case 14: {
                n3 = 34;
                break;
            }
            case 15: {
                n3 = 54;
                break;
            }
            case 16: {
                n3 = 16;
                break;
            }
            case 17: {
                n3 = 36;
                break;
            }
            case 18: {
                n3 = 63;
                break;
            }
            case 19: {
                n3 = 10;
                break;
            }
            case 20: {
                n3 = 56;
                break;
            }
            case 21: {
                n3 = 44;
                break;
            }
            case 22: {
                n3 = 53;
                break;
            }
            case 23: {
                n3 = 43;
                break;
            }
            case 24: {
                n3 = 4;
                break;
            }
            case 25: {
                n3 = 55;
                break;
            }
            case 26: {
                n3 = 18;
                break;
            }
            case 27: {
                n3 = 26;
                break;
            }
            case 28: {
                n3 = 58;
                break;
            }
            case 29: {
                n3 = 51;
                break;
            }
            case 30: {
                n3 = 23;
                break;
            }
            case 31: {
                n3 = 49;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 47;
                break;
            }
            case 34: {
                n3 = 6;
                break;
            }
            case 35: {
                n3 = 7;
                break;
            }
            case 36: {
                n3 = 59;
                break;
            }
            case 37: {
                n3 = 50;
                break;
            }
            case 38: {
                n3 = 48;
                break;
            }
            case 39: {
                n3 = 5;
                break;
            }
            case 40: {
                n3 = 1;
                break;
            }
            case 41: {
                n3 = 17;
                break;
            }
            case 42: {
                n3 = 39;
                break;
            }
            case 43: {
                n3 = 21;
                break;
            }
            case 44: {
                n3 = 60;
                break;
            }
            case 45: {
                n3 = 33;
                break;
            }
            case 46: {
                n3 = 2;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 0;
                break;
            }
            case 49: {
                n3 = 45;
                break;
            }
            case 50: {
                n3 = 19;
                break;
            }
            case 51: {
                n3 = 40;
                break;
            }
            case 52: {
                n3 = 61;
                break;
            }
            case 53: {
                n3 = 28;
                break;
            }
            case 54: {
                n3 = 52;
                break;
            }
            case 55: {
                n3 = 29;
                break;
            }
            case 56: {
                n3 = 24;
                break;
            }
            case 57: {
                n3 = 62;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 57;
                break;
            }
            case 60: {
                n3 = 13;
                break;
            }
            case 61: {
                n3 = 37;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 3;
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
        A6.o[n4] = new String(cArray);
        return n4;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/A6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = A6.a(l, l2);
        Object object = A6.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = A6.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = A6.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = A6.a(clazz3, string2, clazz2)) != null) {
                    A6.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = A6.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        A6.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = A6.b(279615917379642L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                A6.b = MultiContainerRegistry.a(-3651325332871626089L, 3326550929794779752L, MethodHandles.lookup().lookupClass()).a(112363667297856L);
                A6.n = new Object[5];
                A6.o = new String[5];
                A6.a();
                A6.l = new HashMap<K, V>(13);
                var0 = A6.b ^ 39048709765708L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00d6\u0094\u00c4\u0019\u00e1\u0087\u0015\u00e5\u00f0\u0088\u00d4\u00e5\u008db\u0093\u00c6\u009c'>A\u00e8_\u0004a\u001a\u00e3\u00e1\u0007\u0087\u00c5@Yf!\u00b8\u0099\u0090\u0081\u00ce<\u00f0\u008b\u00ea\u001e\u00c3\u00fa\u00eb\u0004\u0015Q\u0080\u00e5\u00b8\u008c\u0081W";
                var7_6 = "\u00d6\u0094\u00c4\u0019\u00e1\u0087\u0015\u00e5\u00f0\u0088\u00d4\u00e5\u008db\u0093\u00c6\u009c'>A\u00e8_\u0004a\u001a\u00e3\u00e1\u0007\u0087\u00c5@Yf!\u00b8\u0099\u0090\u0081\u00ce<\u00f0\u008b\u00ea\u001e\u00c3\u00fa\u00eb\u0004\u0015Q\u0080\u00e5\u00b8\u008c\u0081W".length();
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
                    var6_5 = "\u0090\u0082\fi\u00eb\u0084\u00be\u00bd\u00e6\u00fa$5\u00ff31!";
                    var7_6 = "\u0090\u0082\fi\u00eb\u0084\u00be\u00bd\u00e6\u00fa$5\u00ff31!".length();
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
        A6.h = var8_3;
        A6.j = new Integer[9];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = A6.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = A6.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public void s() {
        block3: {
            block2: {
                try {
                    if (!ConfigurationManager.U()) break block2;
                    DataFlowAnalyzer.D(-0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, this.F);
                    DataFlowAnalyzer.D(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 1.0f, this.F);
                    DataFlowAnalyzer.D(0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 1.0f, this.F);
                    DataFlowAnalyzer.D(0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, this.F);
                    DataFlowAnalyzer.D(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.0f, this.F);
                    DataFlowAnalyzer.D(0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 1.0f, this.F);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw A6.a(customSystemException);
                }
            }
            GL11.glBegin((int)1);
            GL11.glVertex3d((double)-0.25, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)-0.25);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.25, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.25);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glEnd();
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = A6.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void u(double d2, double d3, double d4, double d5, double d6, double d7, float f, Color color) {
        this.K.add(new GraphicsRenderingContext(d2, d3, d4, d5, d6, d7, f, color, null));
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = A6.a(l, l2);
            object = A6.n[n];
            try {
                if (!(object instanceof String)) break block2;
                A6.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static boolean lambda$onRenderWorldLast$0(NetworkPacketInterceptor1107 networkPacketInterceptor1107) {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (networkPacketInterceptor1107 == null || !networkPacketInterceptor1107.r()) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw A6.a(customSystemException);
                        }
                        if (ObjectValidator.u().equals(networkPacketInterceptor1107.q())) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw A6.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw A6.a(customSystemException);
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
            return MethodHandles.lookup().findStatic(A6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(A6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

