/*
 * Decompiled with CFR 0.152.
 */
package com.system.interceptors;

import a._Y;
import a.a;
import a.oQ;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.core.comparison.QualityFactorComparator;
import com.app.core.sorting.QualityFactorSorter;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.scenarios.ScenarioTemplateManager;
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
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.messaging.processing.MessageProcessingFilter;
import com.network.config.ConnectionConfigurationResolver;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.ProtocolInteractionController;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.randomization.RandomGenerationEngine1239;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import com.util.reflection.ReflectionUtility;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ResourceInterceptor
extends ContextualExecutionFramework {
    public final AuthenticationGateway1860 R;
    private static final Object[] bb;
    public final NumericPrecisionTransformer A;
    public final AuthenticationGateway1860 o;
    private static final Integer[] P;
    public final AuthenticationGateway1860 F;
    public final NumericPrecisionTransformer T;
    private static final String[] fb;
    private final AdaptiveRenderingEngine e;
    public NetworkConfigManager K;
    public final AuthenticationStateTracker G;
    public final ColorPaletteManager Z;
    public final AuthenticationStateTracker v;
    private final AdaptiveRenderingEngine X;
    public int d;
    public final ReflectionUtility l;
    public final AuthenticationGateway1860 b;
    public final AuthenticationStateTracker B;
    public final AuthenticationStateTracker j;
    private static final long r;
    public List<TransactionOrchestrator1017> N;
    private static final Map V;
    public GenericAdapterManager n;
    private static final long[] w;
    public final NumericPrecisionTransformer z;
    public int L;
    private boolean O;
    public final AuthenticationStateTracker m;
    private final AuthenticationGateway1860 x;
    public final AuthenticationStateTracker Y;
    public final NumericPrecisionTransformer t;
    public final RandomGenerationEngine1239 h;

    public boolean q() {
        boolean bl;
        block8: {
            block6: {
                block7: {
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    try {
                        try {
                            try {
                                if (GeometryCalculator.C() <= 15 || !this.j.s().booleanValue()) break block6;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceInterceptor.a(customSystemException);
                            }
                            if (systemConfigurationOrchestrator.X(0.5f) != 1.0f) break block7;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceInterceptor.a(customSystemException);
                        }
                        bl = true;
                        break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                }
                bl = false;
                break block8;
            }
            bl = this.h.J();
        }
        boolean bl2 = bl;
        return bl2;
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.HIGH)
    public void w(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block8: {
            try {
                try {
                    block9: {
                        try {
                            try {
                                if (!this.m.s().booleanValue()) break block8;
                                if (cryptoKeyManagementSystem.getPlayer().O()) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceInterceptor.a(customSystemException);
                            }
                            if (!(cryptoKeyManagementSystem.getPlayer().e() <= 0.0f)) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceInterceptor.a(customSystemException);
                        }
                    }
                    if (!this.Z()) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
                this.m();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceInterceptor.a(customSystemException);
            }
        }
    }

    public float i(double d2, double d3, float f) {
        double d4;
        block6: {
            double d5;
            double d6;
            block5: {
                block4: {
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    d6 = d2 - systemConfigurationOrchestrator.F();
                    d5 = d3 - systemConfigurationOrchestrator.B();
                    try {
                        if (!(d5 < 0.0) || !(d6 < 0.0)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                    d4 = 90.0 + Math.toDegrees(Math.atan(d5 / d6));
                    break block6;
                }
                try {
                    if (!(d5 < 0.0) || !(d6 > 0.0)) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
                d4 = -90.0 + Math.toDegrees(Math.atan(d5 / d6));
                break block6;
            }
            d4 = Math.toDegrees(-Math.atan(d6 / d5));
        }
        return AdaptiveComputationEngine.v(-(f - (float)d4));
    }

    private static Field c(long l, long l2) {
        int n = ResourceInterceptor.a(l, l2);
        Object object = bb[n];
        if (object instanceof String) {
            String string = fb[n];
            int n2 = string.indexOf(8);
            Class clazz = ResourceInterceptor.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ResourceInterceptor.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ResourceInterceptor.a(clazz3, string2, clazz2)) != null) {
                    ResourceInterceptor.bb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ResourceInterceptor.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ResourceInterceptor.bb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ResourceInterceptor.b(224916889671190L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e0' || c == '\u00c3' || c == '\u00da' || c == '\u00c6') {
                field = ResourceInterceptor.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ResourceInterceptor.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'x' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'h' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("a/xs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public TransactionOrchestrator1017 C() {
        block4: {
            try {
                try {
                    if (!this.N.isEmpty() && this.N.size() - 1 >= this.L) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceInterceptor.a(customSystemException);
            }
        }
        return this.N.get(this.L);
    }

    private static void a() {
        Object[] objectArray = bb;
        bb[0] = "9z\u0013";
        objectArray[1] = Integer.TYPE;
        ResourceInterceptor.fb[1] = "java/lang/Integer";
        objectArray[2] = "\bB\u0003?dG\u0003M\u0012p\u0019_\u0010J\u001b9";
        objectArray[3] = "\u0016\u00023J9m\u001d\r\"\u0005Xc\u0016\u0006&_";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "8\u0019\u0011Nj%<\u0001D2k$Q^\u0011\n?>5\tOBi_h\u0006TMxcn\u001f\u0013V\u0000";
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
        if (fb[n4] != null) {
            return n4;
        }
        Object object = bb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 40;
                break;
            }
            case 1: {
                n3 = 54;
                break;
            }
            case 2: {
                n3 = 25;
                break;
            }
            case 3: {
                n3 = 42;
                break;
            }
            case 4: {
                n3 = 44;
                break;
            }
            case 5: {
                n3 = 38;
                break;
            }
            case 6: {
                n3 = 35;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 48;
                break;
            }
            case 9: {
                n3 = 50;
                break;
            }
            case 10: {
                n3 = 14;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 17;
                break;
            }
            case 13: {
                n3 = 10;
                break;
            }
            case 14: {
                n3 = 15;
                break;
            }
            case 15: {
                n3 = 16;
                break;
            }
            case 16: {
                n3 = 59;
                break;
            }
            case 17: {
                n3 = 45;
                break;
            }
            case 18: {
                n3 = 34;
                break;
            }
            case 19: {
                n3 = 47;
                break;
            }
            case 20: {
                n3 = 28;
                break;
            }
            case 21: {
                n3 = 7;
                break;
            }
            case 22: {
                n3 = 11;
                break;
            }
            case 23: {
                n3 = 26;
                break;
            }
            case 24: {
                n3 = 32;
                break;
            }
            case 25: {
                n3 = 20;
                break;
            }
            case 26: {
                n3 = 62;
                break;
            }
            case 27: {
                n3 = 57;
                break;
            }
            case 28: {
                n3 = 53;
                break;
            }
            case 29: {
                n3 = 22;
                break;
            }
            case 30: {
                n3 = 55;
                break;
            }
            case 31: {
                n3 = 8;
                break;
            }
            case 32: {
                n3 = 6;
                break;
            }
            case 33: {
                n3 = 56;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 58;
                break;
            }
            case 36: {
                n3 = 12;
                break;
            }
            case 37: {
                n3 = 4;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 39;
                break;
            }
            case 40: {
                n3 = 18;
                break;
            }
            case 41: {
                n3 = 5;
                break;
            }
            case 42: {
                n3 = 41;
                break;
            }
            case 43: {
                n3 = 49;
                break;
            }
            case 44: {
                n3 = 23;
                break;
            }
            case 45: {
                n3 = 31;
                break;
            }
            case 46: {
                n3 = 61;
                break;
            }
            case 47: {
                n3 = 46;
                break;
            }
            case 48: {
                n3 = 33;
                break;
            }
            case 49: {
                n3 = 24;
                break;
            }
            case 50: {
                n3 = 63;
                break;
            }
            case 51: {
                n3 = 21;
                break;
            }
            case 52: {
                n3 = 60;
                break;
            }
            case 53: {
                n3 = 19;
                break;
            }
            case 54: {
                n3 = 2;
                break;
            }
            case 55: {
                n3 = 3;
                break;
            }
            case 56: {
                n3 = 37;
                break;
            }
            case 57: {
                n3 = 51;
                break;
            }
            case 58: {
                n3 = 43;
                break;
            }
            case 59: {
                n3 = 52;
                break;
            }
            case 60: {
                n3 = 13;
                break;
            }
            case 61: {
                n3 = 1;
                break;
            }
            case 62: {
                n3 = 0;
                break;
            }
            default: {
                n3 = 29;
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
        ResourceInterceptor.fb[n4] = new String(cArray);
        return n4;
    }

    private boolean B(TransactionOrchestrator1017 transactionOrchestrator1017) {
        if (this.Y.s().booleanValue()) {
            boolean bl;
            block12: {
                block11: {
                    LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().K();
                    try {
                        if (lightweightExecutionContext.Y()) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                    ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
                    try {
                        if (protocolInteractionController.Y()) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                    try {
                        try {
                            if (!this.Z.b(lightweightExecutionContext, false) || !this.l.u(transactionOrchestrator1017)) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceInterceptor.a(customSystemException);
                        }
                        bl = true;
                        break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return this.l.u(transactionOrchestrator1017);
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void O(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        block6: {
            try {
                GraphicsBufferAllocator.V();
                if (!this.G.s().booleanValue() || this.N.isEmpty()) break block6;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceInterceptor.a(customSystemException);
            }
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = eventDispatchRegistry2111.getThePlayer();
            for (TransactionOrchestrator1017 transactionOrchestrator1017 : this.N) {
                try {
                    if ((double)systemConfigurationOrchestrator.y(transactionOrchestrator1017) <= (Double)this.t.J()) {
                        CryptoContextNegotiator684.G(transactionOrchestrator1017, 0.0, null, this.X.L(), eventDispatchRegistry2111.getTicks());
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
                CryptoContextNegotiator684.G(transactionOrchestrator1017, 0.0, null, this.e.L(), eventDispatchRegistry2111.getTicks());
            }
        }
        GraphicsBufferAllocator.E();
    }

    private float[] S(double d2, double d3, double d4) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        double d5 = d2 - systemConfigurationOrchestrator.F();
        double d6 = d3 - systemConfigurationOrchestrator.B();
        double d7 = d4 - ((oQ)systemConfigurationOrchestrator.L()).c() - 1.2;
        double d8 = AdaptiveComputationEngine.C(d5 * d5 + d6 * d6);
        float f = (float)(Math.atan2(d6, d5) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(Math.atan2(d7, d8) * 180.0 / Math.PI));
        return new float[]{f, f2};
    }

    public float[] Q(TransactionOrchestrator1017 transactionOrchestrator1017) {
        double d2 = transactionOrchestrator1017.F();
        double d3 = transactionOrchestrator1017.B();
        double d4 = ((oQ)transactionOrchestrator1017.L()).c() + (double)(transactionOrchestrator1017.E() / 2.0f);
        return this.S(d2, d3, d4);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3CD3;
        if (P[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = w[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])V.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    V.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xs", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceInterceptor.P[n2] = n3;
        }
        return P[n2];
    }

    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOW)
    public void g(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block82: {
            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
            boolean bl;
            boolean bl2;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            boolean bl3;
            block78: {
                block77: {
                    block71: {
                        ScenarioTemplateManager scenarioTemplateManager;
                        long l;
                        block73: {
                            boolean bl4;
                            block70: {
                                l = r ^ 0x19B3908D55F9L;
                                try {
                                    if ((Double)this.T.J() < (Double)this.t.J()) {
                                        this.T.r((Double)this.t.J() + 0.1);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceInterceptor.a(customSystemException);
                                }
                                try {
                                    if (this.d > 0) {
                                        --this.d;
                                        return;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceInterceptor.a(customSystemException);
                                }
                                try {
                                    try {
                                        if (!this.v.s().booleanValue() || !ApplicationLifecycleManager.X().r()) break block70;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceInterceptor.a(customSystemException);
                                    }
                                    this.d = 1;
                                    return;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceInterceptor.a(customSystemException);
                                }
                            }
                            try {
                                bl4 = GeometryCalculator.C() < 23;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceInterceptor.a(customSystemException);
                            }
                            bl3 = bl4;
                            systemConfigurationOrchestrator = cryptoKeyManagementSystem.getThePlayer();
                            try {
                                block72: {
                                    try {
                                        try {
                                            if (!this.m.s().booleanValue()) break block71;
                                            if (systemConfigurationOrchestrator.O()) break block72;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceInterceptor.a(customSystemException);
                                        }
                                        if (!(systemConfigurationOrchestrator.e() <= 0.0f)) break block73;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceInterceptor.a(customSystemException);
                                    }
                                }
                                this.m();
                                return;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceInterceptor.a(customSystemException);
                            }
                        }
                        if (GeometryCalculator.C() >= 35) {
                            block74: {
                                scenarioTemplateManager = ApplicationLifecycleManager.X();
                                try {
                                    try {
                                        try {
                                            if (!scenarioTemplateManager.r()) break block71;
                                            if (this.O) break block74;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw ResourceInterceptor.a(customSystemException);
                                        }
                                        if (!scenarioTemplateManager.B(ReflectionMetadataResolver.Yu)) break block74;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceInterceptor.a(customSystemException);
                                    }
                                    this.O = true;
                                    this.m();
                                    return;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceInterceptor.a(customSystemException);
                                }
                            }
                            this.O = false;
                        } else {
                            scenarioTemplateManager = ApplicationLifecycleManager.k();
                            if (scenarioTemplateManager.r()) {
                                String string;
                                block75: {
                                    string = ((StreamProcessingOrchestrator1917)scenarioTemplateManager).A();
                                    try {
                                        block76: {
                                            try {
                                                try {
                                                    try {
                                                        if (this.O || string == null) break block75;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw ResourceInterceptor.a(customSystemException);
                                                    }
                                                    if (string.toLowerCase().contains((CharSequence)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)26124, (long)(0x4360BFECCAB33C89L ^ l)), (long)-1850557767546869193L, (long)l)))) break block76;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw ResourceInterceptor.a(customSystemException);
                                                }
                                                if (!string.toLowerCase().contains((CharSequence)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)15321, (long)(0x21845F8F1AD76150L ^ l)), (long)-1850557767546869193L, (long)l)))) break block75;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw ResourceInterceptor.a(customSystemException);
                                            }
                                        }
                                        this.O = true;
                                        this.m();
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceInterceptor.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        if (string != null && !string.equals("")) break block71;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceInterceptor.a(customSystemException);
                                    }
                                    this.O = false;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceInterceptor.a(customSystemException);
                                }
                            }
                        }
                    }
                    try {
                        try {
                            if (!this.B.s().booleanValue() || DynamicContextBroker.e()) break block77;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceInterceptor.a(customSystemException);
                        }
                        this.N.clear();
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                }
                try {
                    this.e(systemConfigurationOrchestrator, cryptoKeyManagementSystem.getWorld());
                    if (!this.q()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
                boolean bl5 = false;
                for (TransactionOrchestrator1017 transactionOrchestrator1017 : this.N) {
                    double d2;
                    if (!this.S(systemConfigurationOrchestrator, transactionOrchestrator1017) || !((d2 = (double)systemConfigurationOrchestrator.y(transactionOrchestrator1017)) <= (Double)this.T.J())) continue;
                    bl5 = true;
                    break;
                }
                try {
                    if (!bl5) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
                bl2 = false;
                bl = DynamicContextBroker.H();
                connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().D();
                try {
                    try {
                        if (!bl || !connectionPoolOrchestrator1192.X()) break block78;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                    connectionPoolOrchestrator1192.p(false);
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
            }
            for (TransactionOrchestrator1017 transactionOrchestrator1017 : this.N) {
                block81: {
                    block80: {
                        double d3;
                        block79: {
                            if (!this.S(systemConfigurationOrchestrator, transactionOrchestrator1017)) continue;
                            d3 = systemConfigurationOrchestrator.y(transactionOrchestrator1017);
                            try {
                                try {
                                    if (!(d3 <= (Double)this.T.J())) continue;
                                    if (!bl3) break block79;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceInterceptor.a(customSystemException);
                                }
                                systemConfigurationOrchestrator.g();
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceInterceptor.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                if (!(d3 <= (Double)this.t.J())) break block80;
                                ApplicationLifecycleManager.n().R(systemConfigurationOrchestrator, transactionOrchestrator1017);
                                if (bl3) break block81;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceInterceptor.a(customSystemException);
                            }
                            systemConfigurationOrchestrator.g();
                            break block81;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceInterceptor.a(customSystemException);
                        }
                    }
                    try {
                        if (!bl3) {
                            systemConfigurationOrchestrator.g();
                            systemConfigurationOrchestrator.n();
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                }
                if (!bl) continue;
                bl2 = true;
                ApplicationLifecycleManager.N();
            }
            try {
                try {
                    if (bl2 || !bl) break block82;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
                connectionPoolOrchestrator1192.p(true);
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceInterceptor.a(customSystemException);
            }
        }
        this.h.Q();
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void y(double d2, double d3, double d4, double d5) {
        double d6 = d4 / 2.0;
        double d7 = d2 + d6;
        double d8 = d3 + d6;
        double d9 = Math.toRadians(d5 -= 90.0);
        double d10 = d7 + (d6 + 0.0) * Math.cos(d9);
        double d11 = d8 + (d6 + 0.0) * Math.sin(d9);
        double d12 = d7 + (d6 - 4.0) * Math.cos(d9);
        double d13 = d8 + (d6 - 4.0) * Math.sin(d9);
        ConfigurationManager.g(d10, d11, d12, d13, 2.0f, Color.RED);
    }

    public boolean L() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || this.N.isEmpty()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void lambda$new$1(AtomicBoolean atomicBoolean, NumericPrecisionTransformer numericPrecisionTransformer) {
        try {
            if (atomicBoolean.get()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceInterceptor.a(customSystemException);
        }
        try {
            if ((Double)numericPrecisionTransformer.J() > (Double)this.T.J()) {
                atomicBoolean.set(true);
                numericPrecisionTransformer.r((Double)this.T.J() - numericPrecisionTransformer.o());
                atomicBoolean.set(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceInterceptor.a(customSystemException);
        }
    }

    private void lambda$new$0(AtomicBoolean atomicBoolean, NumericPrecisionTransformer numericPrecisionTransformer) {
        try {
            if (atomicBoolean.get()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceInterceptor.a(customSystemException);
        }
        try {
            if ((Double)numericPrecisionTransformer.J() < (Double)this.t.J()) {
                atomicBoolean.set(true);
                numericPrecisionTransformer.r((Double)this.t.J() + numericPrecisionTransformer.o());
                atomicBoolean.set(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceInterceptor.a(customSystemException);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ResourceInterceptor.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ResourceInterceptor.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public AuthenticationStateTracker x() {
        return this.v;
    }

    private void N(CryptographicTransformer cryptographicTransformer, double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        block12: {
            double d8;
            double d9;
            block11: {
                block10: {
                    block9: {
                        double d10 = cryptographicTransformer.b() + (cryptographicTransformer.F() - cryptographicTransformer.b()) - NumericComputationEngine1131.b();
                        double d11 = cryptographicTransformer.q() + (cryptographicTransformer.V() + (double)cryptographicTransformer.L() * 0.75 - cryptographicTransformer.q()) - NumericComputationEngine1131.S();
                        double d12 = cryptographicTransformer.I() + (cryptographicTransformer.B() - cryptographicTransformer.I()) - NumericComputationEngine1131.n();
                        double[] dArray = CryptoContextNegotiator684.E(d10, d11, d12);
                        double d13 = dArray[2];
                        float f = ApplicationLifecycleManager.P().J();
                        float f2 = MessageProcessingFilter.v();
                        float f3 = ApplicationLifecycleManager.b();
                        d7 = dArray[0] / (double)f / (double)f2;
                        d6 = ((double)f3 - dArray[1] / (double)f2) / (double)f;
                        if (d13 >= 1.0) {
                            d7 = (double)(ApplicationLifecycleManager.e() / 2) - d7;
                            d6 = (double)(ApplicationLifecycleManager.b() / 2) - d6;
                        }
                        ConfigurationManager.a();
                        d5 = 0.0;
                        d9 = d2 - d7;
                        d8 = d3 - d6;
                        try {
                            if (!(d8 > 0.0) || !(d9 > 0.0)) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceInterceptor.a(customSystemException);
                        }
                        d5 = Math.toDegrees(-Math.atan(d9 / d8));
                        break block12;
                    }
                    try {
                        if (!(d8 > 0.0) || !(d9 < 0.0)) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                    d5 = Math.toDegrees(-Math.atan(d9 / d8));
                    break block12;
                }
                try {
                    if (!(d8 < 0.0) || !(d9 > 0.0)) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
                d5 = -90.0 + Math.toDegrees(Math.atan(d8 / d9));
                break block12;
            }
            try {
                if (!(d8 < 0.0) || !(d9 < 0.0)) break block12;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceInterceptor.a(customSystemException);
            }
            d5 = 90.0 + Math.toDegrees(Math.atan(d8 / d9));
        }
        ConfigurationManager.A(d7, d6, 2.0, 2.0, Color.RED);
        this.y(d2, d3, d4, d5);
        ConfigurationManager.Y();
    }

    @Override
    public void v() {
        super.v();
        this.N.clear();
    }

    private static Method d(long l, long l2) {
        int n = ResourceInterceptor.a(l, l2);
        Object object = bb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = fb[n];
                int n3 = string2.indexOf(8);
                clazz3 = ResourceInterceptor.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ResourceInterceptor.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ResourceInterceptor.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ResourceInterceptor.bb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ResourceInterceptor.b(224916889671190L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ResourceInterceptor.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ResourceInterceptor.bb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ResourceInterceptor.b(224916889671190L, 0L);
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

    public boolean S(SystemConfigurationOrchestrator systemConfigurationOrchestrator, TransactionOrchestrator1017 transactionOrchestrator1017) {
        block25: {
            try {
                if (transactionOrchestrator1017.Y()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceInterceptor.a(customSystemException);
            }
            try {
                if (transactionOrchestrator1017.equals(systemConfigurationOrchestrator)) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceInterceptor.a(customSystemException);
            }
            try {
                if (!this.B(transactionOrchestrator1017)) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceInterceptor.a(customSystemException);
            }
            try {
                try {
                    if (!(transactionOrchestrator1017.e() <= 0.0f) && !transactionOrchestrator1017.O()) break block25;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceInterceptor.a(customSystemException);
            }
        }
        try {
            if ((double)systemConfigurationOrchestrator.y(transactionOrchestrator1017) >= (Double)this.T.J()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceInterceptor.a(customSystemException);
        }
        try {
            if (_Y.g(systemConfigurationOrchestrator, transactionOrchestrator1017) > ((Double)this.z.J()).intValue() / 2) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceInterceptor.a(customSystemException);
        }
        try {
            if (TemporalMetadataResolver.h.j().h(transactionOrchestrator1017)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceInterceptor.a(customSystemException);
        }
        try {
            if (transactionOrchestrator1017.equals(systemConfigurationOrchestrator.o())) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceInterceptor.a(customSystemException);
        }
        return true;
    }

    @Override
    public void h() {
        super.h();
        this.N.clear();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ResourceInterceptor.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void e(SystemConfigurationOrchestrator systemConfigurationOrchestrator, ConnectionConfigurationResolver connectionConfigurationResolver) {
        block26: {
            block29: {
                block28: {
                    block27: {
                        block25: {
                            this.N.clear();
                            ArrayList arrayList = new ArrayList(connectionConfigurationResolver.L());
                            for (Object e : arrayList) {
                                CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
                                try {
                                    try {
                                        if (DynamicContextBroker.e && cryptographicTransformer.B(ReflectionMetadataResolver.PR)) {
                                            continue;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw ResourceInterceptor.a(customSystemException);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceInterceptor.a(customSystemException);
                                }
                                if (!cryptographicTransformer.B(ReflectionMetadataResolver.Ut)) continue;
                                TransactionOrchestrator1017 transactionOrchestrator1017 = new TransactionOrchestrator1017(e);
                                try {
                                    if (!this.S(systemConfigurationOrchestrator, transactionOrchestrator1017)) continue;
                                    this.N.add(transactionOrchestrator1017);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw ResourceInterceptor.a(customSystemException);
                                }
                            }
                            try {
                                if (this.n.J() != this.o) break block25;
                                this.N.sort(new QualityFactorComparator());
                                break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ResourceInterceptor.a(customSystemException);
                            }
                        }
                        try {
                            if (this.n.J() != this.x) break block27;
                            this.N.sort(new QualityFactorSorter());
                            break block26;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ResourceInterceptor.a(customSystemException);
                        }
                    }
                    try {
                        if (this.n.J() != this.F) break block28;
                        this.N.sort(new PriorityComparator());
                        break block26;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ResourceInterceptor.a(customSystemException);
                    }
                }
                try {
                    if (this.n.J() != this.b) break block29;
                    this.N.sort(new CustomObjectComparator());
                    break block26;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
            }
            try {
                if (this.n.J() == this.R) {
                    this.N.sort(new QueueComparator());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ResourceInterceptor.a(customSystemException);
            }
        }
        ArrayList<TransactionOrchestrator1017> arrayList = new ArrayList<TransactionOrchestrator1017>(this.N);
        this.N.clear();
        int n = ((Double)this.A.J()).intValue();
        int n2 = 0;
        try {
            while (true) {
                try {
                    if (n2 >= n || n2 >= arrayList.size()) break;
                }
                catch (CustomSystemException customSystemException) {
                    throw ResourceInterceptor.a(customSystemException);
                }
                this.N.add((TransactionOrchestrator1017)arrayList.get(n2));
                ++n2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ResourceInterceptor.a(customSystemException);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ResourceInterceptor.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ResourceInterceptor.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public ResourceInterceptor() {
        long l = r ^ 0x33DDCF4BCB91L;
        super(a.cs((int)ResourceInterceptor.a("p", (int)25880, (long)(0x122CB23446DFA1F4L ^ l))), (int)ResourceInterceptor.a("p", (int)14686, (long)(0x97F84132FB37DB0L ^ l)), RecursiveNodeGraph.G, a.cs((int)ResourceInterceptor.a("p", (int)28048, (long)(0x36492C08901297BL ^ l))));
        this.l = ReflectionUtility.L(this);
        this.T = NumericPrecisionTransformer.t(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)29509, (long)(0x7CDFD1ED1DFD37BEL ^ l)), (long)8663049836813218911L, (long)l)), (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)27011, (long)(0x547A5F62773A2D76L ^ l)), (long)8663049836813218911L, (long)l)), "", 0.0, 4.0, 6.0);
        this.t = NumericPrecisionTransformer.t(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)15, (long)(0x1512423457C4C4E8L ^ l)), (long)8663049836813218911L, (long)l)), (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)6198, (long)(0x16B680FA9F675CC5L ^ l)), (long)8663049836813218911L, (long)l)), "", 0.0, 3.5, 6.0);
        this.B = AuthenticationStateTracker.w(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)11208, (long)(0x5585C211E3B06F35L ^ l)), (long)8663049836813218911L, (long)l)), false);
        this.m = AuthenticationStateTracker.w(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)27235, (long)(0x52D7EE1C3BF12E9CL ^ l)), (long)8663049836813218911L, (long)l)), false);
        this.G = AuthenticationStateTracker.w(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)425, (long)(0x4A8C77027B8CC54AL ^ l)), (long)8663049836813218911L, (long)l)), false);
        this.Y = AuthenticationStateTracker.R(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)15866, (long)(0x71B8067F49097900L ^ l)), (long)8663049836813218911L, (long)l)), false, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)1227, (long)(0x4083EBBAE1CDC03BL ^ l)), (long)8663049836813218911L, (long)l)));
        this.v = AuthenticationStateTracker.R(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)29509, (long)(0xB1CAD0B91B0B7B9L ^ l)), (long)8663049836813218911L, (long)l)), true, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)22157, (long)(0x4BEDCE1D4CFA926DL ^ l)), (long)8663049836813218911L, (long)l)));
        this.j = AuthenticationStateTracker.R(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)5266, (long)(0x4E0043AC9262D064L ^ l)), (long)8663049836813218911L, (long)l)), false, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)2782, (long)(0x4BE789BDF8EFCE29L ^ l)), (long)8663049836813218911L, (long)l)));
        this.h = RandomGenerationEngine1239.a(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)30205, (long)(0x7E94F1AFEF6EB112L ^ l)), (long)8663049836813218911L, (long)l)), (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)5932, (long)(0x162C3B3D52CA53DDL ^ l)), (long)8663049836813218911L, (long)l)), "", 1.0, 6.0, 13.0, 20.0);
        this.z = NumericPrecisionTransformer.N(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)5486, (long)(0x12E0373D9475D1A5L ^ l)), (long)8663049836813218911L, (long)l)), (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)23002, (long)(0x147E62E91C581D33L ^ l)), (long)8663049836813218911L, (long)l)), "", 1.0, 90.0, 360.0, 5.0);
        this.A = NumericPrecisionTransformer.N(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)20557, (long)(0x36C9B9AA239594BFL ^ l)), (long)8663049836813218911L, (long)l)), (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)720, (long)(0x642AC8F12D48463AL ^ l)), (long)8663049836813218911L, (long)l)), "", 1.0, 1.0, 6.0, 1.0);
        this.e = AdaptiveRenderingEngine.M(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)11677, (long)(0x20387B3C9F86E963L ^ l)), (long)8663049836813218911L, (long)l)), new Color(255, 200, 112), 50);
        this.X = AdaptiveRenderingEngine.C(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)31202, (long)(0x611A4C9CA59BD0AL ^ l)), (long)8663049836813218911L, (long)l)), new Color(255, 0, 0, 100));
        this.x = new AuthenticationGateway1860((String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)14773, (long)(0x4D0C0ED7A5527D4DL ^ l)), (long)8663049836813218911L, (long)l)));
        this.o = new AuthenticationGateway1860((String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)9160, (long)(0x7797BB3CA9AFE72DL ^ l)), (long)8663049836813218911L, (long)l)));
        this.b = new AuthenticationGateway1860((String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)28101, (long)(0x5A088305258D2921L ^ l)), (long)8663049836813218911L, (long)l)));
        this.F = new AuthenticationGateway1860((String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)30776, (long)(0x262E713E8301BCDEL ^ l)), (long)8663049836813218911L, (long)l)));
        this.R = new AuthenticationGateway1860((String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)5213, (long)(0x4194E350596250A4L ^ l)), (long)8663049836813218911L, (long)l)));
        this.Z = ColorPaletteManager.o(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)238, (long)(0x7A6A6946F7534424L ^ l)), (long)8663049836813218911L, (long)l)), (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)11489, (long)(0x2939762B8F7A6803L ^ l)), (long)8663049836813218911L, (long)l)), ColorPaletteManager.U, Collections.emptyList());
        this.K = new NetworkConfigManager();
        this.N = new CopyOnWriteArrayList<TransactionOrchestrator1017>();
        this.n = GenericAdapterManager.I(this, (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)8591, (long)(0x2168DEE09B75657BL ^ l)), (long)8663049836813218911L, (long)l)), (String)((Object)ResourceInterceptor.c("h", (int)ResourceInterceptor.a("p", (int)8873, (long)(0x3D4A2361FCD7E660L ^ l)), (long)8663049836813218911L, (long)l)), this.x, this.x, this.o, this.b, this.F, this.R);
        this.O = false;
        this.N(this.l, this.h, this.T, this.t, this.z, this.A, this.n);
        this.e(this.j, GameVersionEnumerator.MC_1_8_9.q());
        this.G.l(this.e, this.X);
        this.N(new ConfigurationProfileResolver[]{this.m, this.B, this.v, this.G, this.e, this.X, this.Y.l(this.Z), this.Z});
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.T.P(arg_0 -> this.lambda$new$0(atomicBoolean, arg_0));
        this.t.P(arg_0 -> this.lambda$new$1(atomicBoolean, arg_0));
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ResourceInterceptor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceInterceptor.r = MultiContainerRegistry.a(-2547969935958548460L, 4159659535367968206L, MethodHandles.lookup().lookupClass()).a(132027238620172L);
                ResourceInterceptor.bb = new Object[5];
                ResourceInterceptor.fb = new String[5];
                ResourceInterceptor.a();
                ResourceInterceptor.V = new HashMap<K, V>(13);
                var0 = ResourceInterceptor.r ^ 6837557540031L;
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
                var8_3 = new long[35];
                var5_4 = 0;
                var6_5 = "\u00f9&\u0091\u009ay\u00beY\u00e7\u00bc\u00a5\u00cf*}\u00dbI\u00d6\u000bb\u00b0\u00d8Y_\u0001D\u008c\u0006\\\u0084\u00a6\u0003\u00e7(\u0000\u0080\u00b8\u0015\u0086X\u00e7-\u00c4K\u0082\u00a9\u000e\u00c3\u00fea\u00e4\u0086\u008a\u00de\u00e1\u00e7:\u00ca\u00bc\u00a0\u00f5\u00b6`\u0094\u00e2\u00e8\u00e3F\u00a0\u0015q\"\u0018\u00f8\u008e\u00b6\"h.$u\u0005\u0080\u00eb\u00d4\u00bd\u0087\ri~\u00f2\u00f9\u00a1U\u00d0\u009ed.j\u0011\u00c6\u0081\u00efw\u00fc75\u00e7ZdP\u008f\u00ee\u00d75\fHO\u00e3{\u0081`C/\u00e9\u00aa\u009fK\u00af^KsA\u00fb\u00c8\u00b5\u00b9\u001d\u00a5\u0082_\u00e7\u00c1\u0081\u0085\u0005\u00ee\u00a8\u0089\u0090e\u00ca\u00caz\u00f9\u001f\u00b1\u0091N\u00c4\u00d71J\u00d9Q\u00e9\u008c\u00aa\u00d0JSo$\u00a6\u008c\u0004X\u00ca!\u00b4#\u00d9f\u008d\u00d69\u00c3\u0082K\u00a3v\u0010\u00ab\u00e0\u00b9\u00fc\u0014\u00c22nTK\u00d5%\u00c4bh@u\u00be\u00ee\u001b\u00af.\u0095\u00f7\u00ed\u00fa\u00f1\u009f\u0099 \u0086(\u00f0*\u00f6m\u00f9\u0094\u00a9Cw\u0019\u00e1\u00b1\u00c5c\u0080m\u00f9\u009dC\u00d4\u00d7\u00c7S\u00e9\u00d2<)\u001b\u0080\u00c2\u0014\u00a3\u00d6`S\u00b5\u00a9\u00ce\u000f\u0012\u0012\u00b9";
                var7_6 = "\u00f9&\u0091\u009ay\u00beY\u00e7\u00bc\u00a5\u00cf*}\u00dbI\u00d6\u000bb\u00b0\u00d8Y_\u0001D\u008c\u0006\\\u0084\u00a6\u0003\u00e7(\u0000\u0080\u00b8\u0015\u0086X\u00e7-\u00c4K\u0082\u00a9\u000e\u00c3\u00fea\u00e4\u0086\u008a\u00de\u00e1\u00e7:\u00ca\u00bc\u00a0\u00f5\u00b6`\u0094\u00e2\u00e8\u00e3F\u00a0\u0015q\"\u0018\u00f8\u008e\u00b6\"h.$u\u0005\u0080\u00eb\u00d4\u00bd\u0087\ri~\u00f2\u00f9\u00a1U\u00d0\u009ed.j\u0011\u00c6\u0081\u00efw\u00fc75\u00e7ZdP\u008f\u00ee\u00d75\fHO\u00e3{\u0081`C/\u00e9\u00aa\u009fK\u00af^KsA\u00fb\u00c8\u00b5\u00b9\u001d\u00a5\u0082_\u00e7\u00c1\u0081\u0085\u0005\u00ee\u00a8\u0089\u0090e\u00ca\u00caz\u00f9\u001f\u00b1\u0091N\u00c4\u00d71J\u00d9Q\u00e9\u008c\u00aa\u00d0JSo$\u00a6\u008c\u0004X\u00ca!\u00b4#\u00d9f\u008d\u00d69\u00c3\u0082K\u00a3v\u0010\u00ab\u00e0\u00b9\u00fc\u0014\u00c22nTK\u00d5%\u00c4bh@u\u00be\u00ee\u001b\u00af.\u0095\u00f7\u00ed\u00fa\u00f1\u009f\u0099 \u0086(\u00f0*\u00f6m\u00f9\u0094\u00a9Cw\u0019\u00e1\u00b1\u00c5c\u0080m\u00f9\u009dC\u00d4\u00d7\u00c7S\u00e9\u00d2<)\u001b\u0080\u00c2\u0014\u00a3\u00d6`S\u00b5\u00a9\u00ce\u000f\u0012\u0012\u00b9".length();
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
                    var6_5 = "`\u00ab'\u00c5\u0093\u0094\u00c0\u00c3f\u0081\u00ab\u00116?IV";
                    var7_6 = "`\u00ab'\u00c5\u0093\u0094\u00c0\u00c3f\u0081\u00ab\u00116?IV".length();
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
        ResourceInterceptor.w = var8_3;
        ResourceInterceptor.P = new Integer[35];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ResourceInterceptor.a(l, l2);
            object = bb[n];
            try {
                if (!(object instanceof String)) break block2;
                ResourceInterceptor.bb[n] = clazz = Class.forName(fb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ResourceInterceptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ResourceInterceptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

