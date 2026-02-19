/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.util.internal.ConcurrentSet
 */
package com.auth.token;

import a.Ne;
import a.Qh;
import a.tl;
import com.app.algorithms.AlgorithmOrchestrator;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.security.tokens.SecurityTokenGenerator2037;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.concurrency.dispatch.TaskDispatchCoordinator;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.streaming.DataStreamOrchestrator686;
import com.encoding.protocol.EncodingProtocolEnum;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.google.common.collect.Lists;
import com.graphics.rendering.RenderEventDispatcher;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.minecraft.render.MinecraftRenderContextManager;
import com.network.event.NetworkEventDispatcher;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.transmission.DataTransmissionManager2384;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.rendering.context.RenderContextManager;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.crypto.CryptographicProcessor;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.execution.CryptoOperationCoordinator;
import com.security.transform.CryptographicTransformer;
import com.strategy.selection.StrategySelectionController;
import com.system.resource.ResourceAllocationController1414;
import com.temporal.metadata.TemporalMetadataResolver;
import io.netty.util.internal.ConcurrentSet;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class SecurityTokenGenerator
extends ContextTransformationEngine<DataStreamOrchestrator686> {
    private static final Integer[] l;
    private static final Map m;
    public NumericPrecisionTransformer B;
    private Set<Integer> A;
    private static final String[] o;
    private boolean r;
    private NetworkProtocolNegotiator e;
    private CryptographicProcessor O;
    private static final Object[] n;
    boolean L;
    private boolean N;
    private AuthenticationStateTracker G;
    private static int d;
    private static final long h;
    private static final long[] j;

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecurityTokenGenerator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecurityTokenGenerator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Loose catch block
     */
    @DataExchangeProtocol2090
    public void K(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        try {
            block6: {
                d = ((Double)this.B.J()).intValue();
                if (this.e == null) break block6;
                try {
                    block7: {
                        if (this.e.equals(ApplicationLifecycleManager.c())) break block6;
                        break block7;
                        catch (Exception exception) {
                            throw SecurityTokenGenerator.a(exception);
                        }
                    }
                    this.O.C();
                }
                catch (Exception exception) {
                    throw SecurityTokenGenerator.a(exception);
                }
            }
            this.e = ApplicationLifecycleManager.c();
            this.O.r();
            this.O.U();
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x357D;
        if (SecurityTokenGenerator.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])m.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xW", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecurityTokenGenerator.l[n2] = n3;
        }
        return SecurityTokenGenerator.l[n2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SecurityTokenGenerator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecurityTokenGenerator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean L(CryptographicTransformer cryptographicTransformer) {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!cryptographicTransformer.B(ReflectionMetadataResolver.Pr) || !DynamicContextBroker.U(cryptographicTransformer)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecurityTokenGenerator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecurityTokenGenerator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void v() {
        this.O.P();
        this.O.U();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == '\u00e6' || c == 'r' || c == '\u00c2') {
                field = SecurityTokenGenerator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecurityTokenGenerator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'F' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @DataExchangeProtocol2090
    public void K(MinecraftRenderContextManager minecraftRenderContextManager) {
        try {
            if (!this.G.s().booleanValue()) {
                return;
            }
            Qh qh = minecraftRenderContextManager.getEntityPlayer();
            TaskDispatchCoordinator taskDispatchCoordinator = this.O.k(qh.X());
            if (taskDispatchCoordinator != null) {
                for (ResourceAllocationController1414 resourceAllocationController1414 : TaskDispatchCoordinator.d(taskDispatchCoordinator)) {
                    this.L = true;
                    DataTransmissionManager2384 dataTransmissionManager2384 = ResourceAllocationController1414.H(resourceAllocationController1414);
                    double d2 = dataTransmissionManager2384.F() - NumericComputationEngine1131.b();
                    double d3 = dataTransmissionManager2384.V() - NumericComputationEngine1131.S();
                    double d4 = dataTransmissionManager2384.B() - NumericComputationEngine1131.n();
                    float f = dataTransmissionManager2384.A() + (dataTransmissionManager2384.q() - dataTransmissionManager2384.A()) * ApplicationLifecycleManager.K().h();
                    tl.N();
                    Ne.h.z();
                    GraphicsBufferAllocator.V();
                    tl.R(false);
                    tl.k();
                    GraphicsBufferAllocator.Y(new Color(100, 100, 100, 50));
                    ArrayList arrayList = null;
                    if (GeometryCalculator.C() > 13) {
                        arrayList = Lists.newArrayList(minecraftRenderContextManager.getRenderer().W());
                        minecraftRenderContextManager.getRenderer().W().clear();
                    }
                    try {
                        dataTransmissionManager2384.I(false);
                        minecraftRenderContextManager.getRenderer().u(dataTransmissionManager2384, d2, d3, d4, f, minecraftRenderContextManager.getPartialTicks());
                        if (GeometryCalculator.C() > 13) {
                            minecraftRenderContextManager.getRenderer().m(arrayList);
                        }
                    }
                    catch (Exception exception) {
                        throw SecurityTokenGenerator.a(exception);
                    }
                    try {
                        GraphicsBufferAllocator.E();
                        Ne.h.X();
                        if (dataTransmissionManager2384.R()) continue;
                        dataTransmissionManager2384.I(true);
                    }
                    catch (Exception exception) {
                        throw SecurityTokenGenerator.a(exception);
                    }
                }
            }
            GraphicsBufferAllocator.Y(new Color(255, 255, 255, 255));
            tl.R(true);
            tl.k();
            tl.j();
            this.L = false;
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecurityTokenGenerator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecurityTokenGenerator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public SecurityTokenGenerator(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = h ^ 0x3692AD8E5E9L;
        super(contextualExecutionFramework, string);
        this.B = NumericPrecisionTransformer.t(this, (String)((Object)SecurityTokenGenerator.c("F", (int)SecurityTokenGenerator.a("s", (int)27575, (long)(0x1F8921294D15638FL ^ l)), (long)4415262127702060958L, (long)l)), (String)((Object)SecurityTokenGenerator.c("F", (int)SecurityTokenGenerator.a("s", (int)6022, (long)(0x78F1FF3A140C1FBCL ^ l)), (long)4415262127702060958L, (long)l)), "", 1.0, 1.0, 5.0);
        this.G = AuthenticationStateTracker.w(this, (String)((Object)SecurityTokenGenerator.c("F", (int)SecurityTokenGenerator.a("s", (int)13769, (long)(0x6B74199861913DF2L ^ l)), (long)4415262127702060958L, (long)l)), true);
        this.O = new CryptographicProcessor(null);
        this.A = new ConcurrentSet();
        this.r = false;
        this.N = false;
        this.e(this.B, new AlgorithmOrchestrator[0]);
        this.e(this.G, GameVersionEnumerator.MC_1_7_10.q());
    }

    /*
     * Loose catch block
     */
    @DataExchangeProtocol2090
    public void r(NetworkPacketOrchestrator1222 networkPacketOrchestrator1222) {
        block8: {
            try {
                CryptographicTransformer cryptographicTransformer;
                block9: {
                    if (!networkPacketOrchestrator1222.getPacket().B(ReflectionMetadataResolver.b)) break block8;
                    StrategySelectionController strategySelectionController = new StrategySelectionController(networkPacketOrchestrator1222.getPacket());
                    cryptographicTransformer = strategySelectionController.c(ApplicationLifecycleManager.c());
                    if (!cryptographicTransformer.r()) break block8;
                    if (!this.A.contains(cryptographicTransformer.X())) break block8;
                    break block9;
                    catch (Exception exception) {
                        throw SecurityTokenGenerator.a(exception);
                    }
                }
                try {
                    block10: {
                        if (!cryptographicTransformer.B(ReflectionMetadataResolver.Pr)) break block8;
                        break block10;
                        catch (Exception exception) {
                            throw SecurityTokenGenerator.a(exception);
                        }
                    }
                    this.O.L(cryptographicTransformer.X(), cryptographicTransformer.F(), cryptographicTransformer.V(), cryptographicTransformer.B(), cryptographicTransformer.q(), cryptographicTransformer.S());
                }
                catch (Exception exception) {
                    throw SecurityTokenGenerator.a(exception);
                }
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
    }

    static int I() {
        return d;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void A(RenderContextManager renderContextManager) {
        Qh qh = renderContextManager.getEntityPlayer();
        try {
            if (this.L) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityTokenGenerator.a(customSystemException);
        }
        try {
            if (this.L(qh)) {
                renderContextManager.setCanceled(true);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityTokenGenerator.a(customSystemException);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void a() {
        Object[] objectArray = n;
        n[0] = "\u001a\u001eL";
        objectArray[1] = Integer.TYPE;
        SecurityTokenGenerator.o[1] = "java/lang/Integer";
        objectArray[2] = "YW\u0015e]0RX\u0004* (A_\rc";
        objectArray[3] = "\u0010^\u0019 \u00055\u001bQ\bod;\u0010Z\f5";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "a\u0012T'\u0007I:Z\rA\u0013W\u0004R[0\u0005^i\u001c\u000e.x\u0015iR\u000e#\u0007\u0012dAHA";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = MultiContainerRegistry.a(-3864010777606661046L, 5543566320412970160L, MethodHandles.lookup().lookupClass()).a(181926759255318L);
        n = new Object[5];
        o = new String[5];
        SecurityTokenGenerator.a();
        m = new HashMap(13);
        long l = h ^ 0x7726241D6566L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "_\u00aa\u00e3\u0001\u0095\u00ac\u00f8\u001b\u00bb\u00ad\u00ff\u00b9\u0011Okm\u0003\u0018\u00ea\u00cajW\u000b\u00db";
        int n2 = "_\u00aa\u00e3\u0001\u0095\u00ac\u00f8\u001b\u00bb\u00ad\u00ff\u00b9\u0011Okm\u0003\u0018\u00ea\u00cajW\u000b\u00db".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        j = lArray;
        SecurityTokenGenerator.l = new Integer[3];
        d = 0;
    }

    @DataExchangeProtocol2090
    public void A(RenderEventDispatcher renderEventDispatcher) {
        try {
            if (!this.L) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityTokenGenerator.a(customSystemException);
        }
        try {
            if (renderEventDispatcher.getWorld().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityTokenGenerator.a(customSystemException);
        }
        CryptographicTransformer cryptographicTransformer = renderEventDispatcher.getEntity();
        try {
            if (this.L(cryptographicTransformer)) {
                renderEventDispatcher.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecurityTokenGenerator.a(customSystemException);
        }
    }

    /*
     * Loose catch block
     */
    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void x(NetworkEventDispatcher networkEventDispatcher) {
        block23: {
            try {
                block22: {
                    block21: {
                        if (networkEventDispatcher.getPacket().B(ReflectionMetadataResolver.rZ)) {
                            int n;
                            CryptoOperationCoordinator cryptoOperationCoordinator;
                            block18: {
                                block19: {
                                    int n2;
                                    block20: {
                                        cryptoOperationCoordinator = new CryptoOperationCoordinator(networkEventDispatcher.getPacket());
                                        n = cryptoOperationCoordinator.D();
                                        try {
                                            if (!DynamicContextBroker.s(n)) break block18;
                                            if (!cryptoOperationCoordinator.R().equals(SecurityTokenGenerator2037.M())) break block19;
                                        }
                                        catch (Exception exception) {
                                            throw SecurityTokenGenerator.a(exception);
                                        }
                                        n2 = this.O.R(n);
                                        try {
                                            if (n2 != -1) break block20;
                                            networkEventDispatcher.forceCancel();
                                            break block21;
                                        }
                                        catch (Exception exception) {
                                            throw SecurityTokenGenerator.a(exception);
                                        }
                                    }
                                    cryptoOperationCoordinator.P(n2);
                                    break block21;
                                }
                                networkEventDispatcher.forceCancel();
                                this.r = true;
                                break block21;
                            }
                            try {
                                if (cryptoOperationCoordinator.R().equals(SecurityTokenGenerator2037.M())) {
                                    this.A.add(n);
                                }
                            }
                            catch (Exception exception) {
                                throw SecurityTokenGenerator.a(exception);
                            }
                        }
                    }
                    if (!this.r) break block22;
                    try {
                        block24: {
                            if (!networkEventDispatcher.getPacket().B(ReflectionMetadataResolver.U5)) break block22;
                            break block24;
                            catch (Exception exception) {
                                throw SecurityTokenGenerator.a(exception);
                            }
                        }
                        this.r = false;
                        networkEventDispatcher.forceCancel();
                        this.N = true;
                    }
                    catch (Exception exception) {
                        throw SecurityTokenGenerator.a(exception);
                    }
                }
                if (!networkEventDispatcher.getPacket().B(ReflectionMetadataResolver.Uc)) break block23;
                try {
                    block25: {
                        if (!this.N) break block23;
                        break block25;
                        catch (Exception exception) {
                            throw SecurityTokenGenerator.a(exception);
                        }
                    }
                    this.N = false;
                    networkEventDispatcher.forceCancel();
                }
                catch (Exception exception) {
                    throw SecurityTokenGenerator.a(exception);
                }
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (o[n4] != null) {
            return n4;
        }
        Object object = SecurityTokenGenerator.n[n4];
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
                n3 = 29;
                break;
            }
            case 2: {
                n3 = 44;
                break;
            }
            case 3: {
                n3 = 22;
                break;
            }
            case 4: {
                n3 = 21;
                break;
            }
            case 5: {
                n3 = 40;
                break;
            }
            case 6: {
                n3 = 52;
                break;
            }
            case 7: {
                n3 = 2;
                break;
            }
            case 8: {
                n3 = 20;
                break;
            }
            case 9: {
                n3 = 53;
                break;
            }
            case 10: {
                n3 = 59;
                break;
            }
            case 11: {
                n3 = 5;
                break;
            }
            case 12: {
                n3 = 23;
                break;
            }
            case 13: {
                n3 = 57;
                break;
            }
            case 14: {
                n3 = 38;
                break;
            }
            case 15: {
                n3 = 51;
                break;
            }
            case 16: {
                n3 = 18;
                break;
            }
            case 17: {
                n3 = 46;
                break;
            }
            case 18: {
                n3 = 0;
                break;
            }
            case 19: {
                n3 = 48;
                break;
            }
            case 20: {
                n3 = 35;
                break;
            }
            case 21: {
                n3 = 16;
                break;
            }
            case 22: {
                n3 = 26;
                break;
            }
            case 23: {
                n3 = 56;
                break;
            }
            case 24: {
                n3 = 32;
                break;
            }
            case 25: {
                n3 = 47;
                break;
            }
            case 26: {
                n3 = 11;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 45;
                break;
            }
            case 29: {
                n3 = 7;
                break;
            }
            case 30: {
                n3 = 50;
                break;
            }
            case 31: {
                n3 = 12;
                break;
            }
            case 32: {
                n3 = 33;
                break;
            }
            case 33: {
                n3 = 54;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 10;
                break;
            }
            case 36: {
                n3 = 36;
                break;
            }
            case 37: {
                n3 = 43;
                break;
            }
            case 38: {
                n3 = 63;
                break;
            }
            case 39: {
                n3 = 39;
                break;
            }
            case 40: {
                n3 = 62;
                break;
            }
            case 41: {
                n3 = 41;
                break;
            }
            case 42: {
                n3 = 9;
                break;
            }
            case 43: {
                n3 = 25;
                break;
            }
            case 44: {
                n3 = 60;
                break;
            }
            case 45: {
                n3 = 30;
                break;
            }
            case 46: {
                n3 = 31;
                break;
            }
            case 47: {
                n3 = 8;
                break;
            }
            case 48: {
                n3 = 27;
                break;
            }
            case 49: {
                n3 = 24;
                break;
            }
            case 50: {
                n3 = 17;
                break;
            }
            case 51: {
                n3 = 34;
                break;
            }
            case 52: {
                n3 = 4;
                break;
            }
            case 53: {
                n3 = 42;
                break;
            }
            case 54: {
                n3 = 19;
                break;
            }
            case 55: {
                n3 = 61;
                break;
            }
            case 56: {
                n3 = 55;
                break;
            }
            case 57: {
                n3 = 14;
                break;
            }
            case 58: {
                n3 = 15;
                break;
            }
            case 59: {
                n3 = 28;
                break;
            }
            case 60: {
                n3 = 3;
                break;
            }
            case 61: {
                n3 = 37;
                break;
            }
            case 62: {
                n3 = 58;
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
        SecurityTokenGenerator.o[n4] = new String(cArray);
        return n4;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecurityTokenGenerator.a(l, l2);
            object = SecurityTokenGenerator.n[n];
            try {
                if (!(object instanceof String)) break block2;
                SecurityTokenGenerator.n[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(long l, long l2) {
        int n = SecurityTokenGenerator.a(l, l2);
        Object object = SecurityTokenGenerator.n[n];
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
                clazz3 = SecurityTokenGenerator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecurityTokenGenerator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecurityTokenGenerator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecurityTokenGenerator.n[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecurityTokenGenerator.b(269372876236926L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecurityTokenGenerator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecurityTokenGenerator.n[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecurityTokenGenerator.b(269372876236926L, 0L);
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
        int n = SecurityTokenGenerator.a(l, l2);
        Object object = SecurityTokenGenerator.n[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = SecurityTokenGenerator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecurityTokenGenerator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecurityTokenGenerator.a(clazz3, string2, clazz2)) != null) {
                    SecurityTokenGenerator.n[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecurityTokenGenerator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecurityTokenGenerator.n[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecurityTokenGenerator.b(269372876236926L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecurityTokenGenerator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(SecurityTokenGenerator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

