/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
package com.security.cryptography;

import a.Cv;
import a.Qh;
import a._Y;
import a.bE;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.graphics.GraphicsRenderingUtility1454;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.computation.metrics.MetricComputationEngine;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.comparison.ComparativeIdentifier;
import com.data.obfuscation.NumericScrambler;
import com.exception.system.CustomSystemException;
import com.game.core.state.GameStateManager1805;
import com.graphics.config.RenderConfigurationManager1114;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.network.config.ConnectionConfigurationResolver;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.NetworkProtocolNegotiator;
import com.network.protocols.ProtocolNegotiationHandler;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.context.RuntimeContextResolver;
import com.security.async.AsynchronousCipherManager;
import com.security.crypto.CryptoSecurityProvider;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.token.CryptographicTokenManager1032;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.UIRenderingCoordinator;
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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;

public class CryptoAlgorithmSelector
extends RenderConfigurationManager1114 {
    private static final String[] mb;
    @NotNull
    private final MetricComputationEngine wY;
    private static final Integer[] eb;
    private static final Object[] lb;
    private static final List<Integer> wN;
    private final ProtocolNegotiationHandler w6;
    private static final long ab;
    private final UIRenderingCoordinator wI;
    private float wk;
    private static final long[] bb;
    float wR;
    private Cv[] w7;
    private GraphicalRenderEngine1082 wW;
    private boolean wp;
    private static final Map fb;
    NetworkConfigManager wu;
    private boolean w4;
    private final Color wJ;
    int wg;
    private GraphicalRenderEngine1082 w8;
    private Qh w3;
    NetworkConfigManager wx;
    private final UIRenderingCoordinator wU;
    private ArrayList<Cv> wV;
    private GameStateManager1805 wd;

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x675A;
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
                throw new RuntimeException("a/yr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoAlgorithmSelector.eb[n2] = n3;
        }
        return eb[n2];
    }

    private static Field k(long l, long l2) {
        int n = CryptoAlgorithmSelector.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptoAlgorithmSelector.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptoAlgorithmSelector.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptoAlgorithmSelector.e(clazz3, string2, clazz2)) != null) {
                    CryptoAlgorithmSelector.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptoAlgorithmSelector.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptoAlgorithmSelector.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptoAlgorithmSelector.j(223185696576342L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void L() {
        block20: {
            int n;
            block19: {
                boolean bl;
                int n2;
                block18: {
                    block17: {
                        n2 = this.wY.x();
                        n = this.wY.k(this.w3);
                        try {
                            block16: {
                                try {
                                    try {
                                        if (this.w3 == null) break block16;
                                        if (n2 <= 4) break block17;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoAlgorithmSelector.a(customSystemException);
                                    }
                                    if (n == 0) break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoAlgorithmSelector.a(customSystemException);
                                }
                            }
                            bl = true;
                            break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoAlgorithmSelector.a(customSystemException);
                        }
                    }
                    bl = false;
                }
                boolean bl2 = bl;
                try {
                    try {
                        try {
                            if (!bl2) break block19;
                            if (n2 == 0) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoAlgorithmSelector.a(customSystemException);
                        }
                        if (!this.wu.m(1000 / n2)) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoAlgorithmSelector.a(customSystemException);
                    }
                    this.wu.m();
                    ++this.wg;
                    break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmSelector.a(customSystemException);
                }
            }
            try {
                try {
                    if (n != 1 || this.wY.W() <= 1) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmSelector.a(customSystemException);
                }
                this.wu.m();
                ++this.wg;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
        }
    }

    private CryptographicParameterGenerator r(double d2) {
        long l = ab ^ 0x49CB2471217DL;
        int n = (d2 + (String)((Object)CryptoAlgorithmSelector.d("\u00ce", (int)CryptoAlgorithmSelector.c("q", (int)2161, (long)(0x30EEDC4C89B93F76L ^ l)), (long)5790053862812748639L, (long)l))).length();
        try {
            if (n < 10) {
                return this.L(0.8);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        return this.L(0.7);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptoAlgorithmSelector.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public Qh H() {
        return this.w3;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'b' || c == '\u00da' || c == '\u00f1' || c == 'L') {
                field = CryptoAlgorithmSelector.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptoAlgorithmSelector.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fb' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void M(boolean bl) {
        boolean bl2;
        GameStateManager1805 gameStateManager1805;
        boolean bl3;
        int n;
        block40: {
            block41: {
                ComparativeIdentifier comparativeIdentifier;
                block38: {
                    block39: {
                        LightweightExecutionContext lightweightExecutionContext;
                        GameStateManager1805 gameStateManager18052;
                        LightweightExecutionContext lightweightExecutionContext2;
                        block37: {
                            block36: {
                                LightweightExecutionContext lightweightExecutionContext3;
                                block35: {
                                    block33: {
                                        block34: {
                                            this.w8.i(false);
                                            this.w8.Q(CryptoAlgorithmSelector.M.O);
                                            this.L();
                                            float f = this.v();
                                            n = (int)(f * 255.0f);
                                            bl3 = this.m();
                                            comparativeIdentifier = this.wY.n()[this.wY.n()];
                                            try {
                                                try {
                                                    try {
                                                        if (this.w3 == null || !this.w3.r()) break block33;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptoAlgorithmSelector.a(customSystemException);
                                                    }
                                                    if (!this.w3.a().r()) break block34;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptoAlgorithmSelector.a(customSystemException);
                                                }
                                                lightweightExecutionContext3 = this.w3.a();
                                                break block35;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptoAlgorithmSelector.a(customSystemException);
                                            }
                                        }
                                        lightweightExecutionContext3 = null;
                                        break block35;
                                    }
                                    lightweightExecutionContext3 = null;
                                }
                                lightweightExecutionContext2 = lightweightExecutionContext3;
                                try {
                                    gameStateManager18052 = this.wd;
                                    if (!bl3) break block36;
                                    lightweightExecutionContext = lightweightExecutionContext2;
                                    break block37;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoAlgorithmSelector.a(customSystemException);
                                }
                            }
                            try {
                                lightweightExecutionContext = comparativeIdentifier != null ? comparativeIdentifier.F() : null;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoAlgorithmSelector.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                try {
                                    gameStateManager18052.r(lightweightExecutionContext);
                                    gameStateManager1805 = this.wd;
                                    if (!bl3) break block38;
                                    if (lightweightExecutionContext2 == null) break block39;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoAlgorithmSelector.a(customSystemException);
                                }
                                if (RuntimeContextResolver.j(lightweightExecutionContext2).size() <= 0) break block39;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoAlgorithmSelector.a(customSystemException);
                            }
                            bl2 = true;
                            break block40;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoAlgorithmSelector.a(customSystemException);
                        }
                    }
                    bl2 = false;
                    break block40;
                }
                try {
                    try {
                        if (comparativeIdentifier == null || !comparativeIdentifier.C()) break block41;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoAlgorithmSelector.a(customSystemException);
                    }
                    bl2 = true;
                    break block40;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmSelector.a(customSystemException);
                }
            }
            bl2 = false;
        }
        gameStateManager1805.Z(bl2);
        this.wd.v(n);
        this.wd.i(bl);
        for (int i = 0; i < this.w7.length; ++i) {
            Cv cv;
            block45: {
                Object object;
                cv = this.w7[i];
                if (bl3) {
                    boolean bl4;
                    Cv cv2;
                    block43: {
                        block42: {
                            Object object2;
                            Cv cv3;
                            object = new LightweightExecutionContext(ApplicationLifecycleManager.U().l().G()[3 - i]);
                            try {
                                cv3 = cv;
                                object2 = ((ObjectLifecycleTracker)object).r() ? object : null;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoAlgorithmSelector.a(customSystemException);
                            }
                            try {
                                try {
                                    cv3.r((LightweightExecutionContext)object2);
                                    cv2 = cv;
                                    if (!((ObjectLifecycleTracker)object).r() || RuntimeContextResolver.j((LightweightExecutionContext)object).size() <= 0) break block42;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoAlgorithmSelector.a(customSystemException);
                                }
                                bl4 = true;
                                break block43;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoAlgorithmSelector.a(customSystemException);
                            }
                        }
                        bl4 = false;
                    }
                    cv2.Z(bl4);
                } else {
                    block44: {
                        object = this.wY.W()[3 - i];
                        try {
                            try {
                                if (object == null || ((ComparativeIdentifier)object).x() == 0) break block44;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoAlgorithmSelector.a(customSystemException);
                            }
                            cv.r(((ComparativeIdentifier)object).F());
                            cv.Z(((ComparativeIdentifier)object).C());
                            break block45;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoAlgorithmSelector.a(customSystemException);
                        }
                    }
                    cv.r(null);
                }
            }
            cv.i(bl);
        }
    }

    private void J(double d2, double d3, float f, float f2, float f3) {
        Color color;
        block12: {
            float f4;
            float f5;
            float f6 = 0.5f;
            if (this.wk < f) {
                f5 = this.wk / f;
                f4 = 1.0f - f5;
                this.wk += f6 * f4;
            }
            if (this.wk > f) {
                f5 = f / this.wk;
                if (this.wk == 0.0f) {
                    f5 = 0.0f;
                }
                f4 = 1.0f - f5;
                this.wk -= f6 * f4;
            }
            try {
                try {
                    if (!Float.isNaN(this.wk) && Float.isFinite(this.wk)) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmSelector.a(customSystemException);
                }
                this.wk = f;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
        }
        f = Math.max(f, 0.0f);
        double d4 = d2;
        double d5 = d3;
        double d6 = 75.0;
        double d7 = 2.0;
        float f7 = 0.6f;
        float f8 = f / Math.max(f2, 1.0f);
        float f9 = f / Math.max(f2, 1.0f);
        ConfigurationManager.c(d4, d5, d6, d7, new Color(54, 54, 54, 255), true, f7, 1.0f, 4.0f, new Color(0, 0, 0, 152));
        if (this.w3 == null) {
            f9 = 1.0f;
        }
        try {
            color = f > 0.0f ? GraphicsBufferAllocator.B(f9, true) : Color.RED;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        Color color2 = color;
        ConfigurationManager.o(d4, d5, Math.min(d6 * (double)f8, d6), d7, color2, false, f7, 1.0f);
        if (f3 > 0.0f) {
            f3 = Math.min(10.0f, f3);
            double d8 = Math.max(d4, d4 + d6 * (double)f8 - 2.0);
            double d9 = d4 + d6;
            double d10 = d4 + d6 * (double)f8;
            double d11 = 10.0f * (f3 / 2.0f);
            double d12 = d9 - (d10 - 2.0 + d11);
            if (d12 < 0.0) {
                d8 -= Math.abs(d12);
            }
            ConfigurationManager.o(d8, d5, d11, d7, this.wJ, true, f7, 1.0f);
        }
    }

    private void B(double d2, double d3) {
        try {
            if (!this.wY.U()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        NumericScrambler numericScrambler = CryptographicTokenManager1032.r().j(this.wY.l() + "", 32);
        try {
            if (numericScrambler != null) {
                ConfigurationManager.T((double)((float)(d2 - 0.5)), (double)((float)(d3 - 0.5)), 11.0, 1.0, CryptoAlgorithmSelector.M.O);
                ConfigurationManager.c((float)d2, (float)d3, 10.0f, 1.0f, Color.WHITE, numericScrambler);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
    }

    public CryptoAlgorithmSelector(@NotNull MetricComputationEngine metricComputationEngine) {
        long l = ab ^ 0xCAFE6FECB80L;
        super(114.0, 52.0);
        this.w3 = null;
        this.wk = 0.0f;
        this.wJ = new Color((int)CryptoAlgorithmSelector.c("q", (int)23337, (long)(0x64C9F9EB2E5886D1L ^ l)));
        this.wd = new GameStateManager1805();
        this.w7 = new Cv[]{new Cv(), new Cv(), new Cv(), new Cv()};
        this.wV = new ArrayList();
        this.wW = new GraphicalRenderEngine1082(110.0, 45.0);
        this.w8 = new GraphicalRenderEngine1082(110.0, 58.0);
        this.wp = false;
        this.wu = new NetworkConfigManager();
        this.wx = new NetworkConfigManager();
        this.wg = 0;
        this.wY = metricComputationEngine;
        this.i(false);
        this.wU = new UIRenderingCoordinator(metricComputationEngine.z().X(), 0.7, 1.0, 0.1, 74.0, false, true, Color.white);
        this.wI = new UIRenderingCoordinator(metricComputationEngine.z().j(), 0.6, 0.9, 0.1, 74.0, false, true, CryptoAlgorithmSelector.M.c);
        this.w8.d().f((String)((Object)CryptoAlgorithmSelector.d("\u00ce", (int)CryptoAlgorithmSelector.c("q", (int)25992, (long)(0x49F36F441C0B387EL ^ l)), (long)-4996987691689385566L, (long)l)));
        this.w8.o(new bE(110.0, 36.0));
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(110.0, 23.0);
        graphicalRenderEngine1082.i(false);
        graphicalRenderEngine1082.n(new bE(34.0, 1.0), new Object[0]);
        graphicalRenderEngine1082.n(this.wd, new Object[0]);
        for (Cv cv : this.w7) {
            graphicalRenderEngine1082.o(new bE(1.0, 0.0), cv);
        }
        this.w8.n(graphicalRenderEngine1082, new Object[0]);
        this.w8.i(false);
        this.n(this.w8, new Object[0]);
        this.wW.i(false);
        this.O();
        this.wW.N(false);
        this.n(this.wW, new Object[0]);
        this.w6 = ProtocolNegotiationHandler.e;
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

    public MetricComputationEngine f() {
        return this.wY;
    }

    @Override
    public void d() {
        try {
            super.d();
            if (ApplicationLifecycleManager.U().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        this.M(this.y());
    }

    private void O() {
        long l = ab ^ 0x86DFF54CFACL;
        this.wV.clear();
        this.wW.d().f((String)((Object)CryptoAlgorithmSelector.d("\u00ce", (int)CryptoAlgorithmSelector.c("q", (int)11166, (long)(0x55A0382C41B1724CL ^ l)), (long)-4716633400684780146L, (long)l)));
        this.wW.i(false);
        this.wW.f();
        this.wW.n(new bE(110.0, 1.5), new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(110.0, 6.0);
        graphicalRenderEngine1082.o(new bE(110.0, 1.0), new bE(93.0, 6.0));
        this.wW.n(graphicalRenderEngine1082, new Object[0]);
        graphicalRenderEngine1082.i(false);
        for (int n : wN) {
            GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(110.0, 11.0);
            graphicalRenderEngine10822.i(false);
            graphicalRenderEngine10822.n(new bE(8.0, 10.0), new Object[0]);
            for (int i = 0; i < 9; ++i) {
                LightweightExecutionContext lightweightExecutionContext;
                Cv cv;
                Cv cv2 = new Cv(10.0, 10.0, 8);
                ComparativeIdentifier comparativeIdentifier = this.wY.n()[n * 9 + i];
                try {
                    cv = cv2;
                    lightweightExecutionContext = comparativeIdentifier != null ? comparativeIdentifier.F() : null;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmSelector.a(customSystemException);
                }
                try {
                    cv.r(lightweightExecutionContext);
                    this.wV.add(cv2);
                    if (i != 0) {
                        graphicalRenderEngine10822.n(new bE(1.0, 11.0), new Object[0]);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmSelector.a(customSystemException);
                }
                graphicalRenderEngine10822.n(cv2, new Object[0]);
            }
            this.wW.n(graphicalRenderEngine10822, new Object[0]);
        }
    }

    private void o(float f) {
        long l = ab ^ 0x67C2197BFEC6L;
        try {
            if (f <= 0.0f) {
                ConfigurationManager.T(this.G() + 5.0, this.W() + 7.0, 24.0, 1.0, new Color(0, 0, 0, 200));
                StateTrackingCoordinator.B(new Color(197, 49, 49, 255), (float)this.G() + 5.0f + 12.0f - 4.0f, (float)this.W() + 9.0f + 13.0f - 6.0f, (String)((Object)CryptoAlgorithmSelector.d("\u00ce", (int)CryptoAlgorithmSelector.c("q", (int)22933, (long)(0x250E75824FD83127L ^ l)), (long)-8079095689006557980L, (long)l)), 8.0f, 8.0f, true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
    }

    public void M(AsynchronousCipherManager asynchronousCipherManager) {
        Object object;
        UIRenderingCoordinator uIRenderingCoordinator;
        Object object2;
        UIRenderingCoordinator uIRenderingCoordinator2;
        CryptographicTransformer cryptographicTransformer;
        long l;
        block17: {
            l = ab ^ 0x66BFC0A1AB49L;
            try {
                if (this.w3 == null || this.w3.equals(ApplicationLifecycleManager.U())) break block17;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
            cryptographicTransformer = ApplicationLifecycleManager.c().I(this.w3.X());
            try {
                this.w3 = cryptographicTransformer.r() ? new Qh(cryptographicTransformer) : null;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
        }
        cryptographicTransformer = ApplicationLifecycleManager.U();
        double d2 = this.wY.y(this.w3);
        double d3 = this.wY.e(this.w3);
        double d4 = this.wY.I(this.w3);
        float f = this.wY.j(this.w3);
        float f2 = this.wY.n(this.w3);
        float f3 = this.wY.k(this.w3);
        try {
            if (this.y()) {
                ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), new Color(26, 25, 26, 150));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        double d5 = this.G() + 6.0;
        double d6 = this.W() + 10.0;
        double d7 = 22.0;
        NumericScrambler numericScrambler = CryptographicTokenManager1032.r().j(this.wY.z().X(), 32);
        try {
            if (numericScrambler != null) {
                ConfigurationManager.T((double)((float)(d5 - 0.5)), (double)((float)(d6 - 0.5)), (double)((float)(d7 + 1.0)), 1.0, new Color(50, 50, 50, 255));
                ConfigurationManager.c((float)d5, (float)d6, (float)d7, 1.0f, Color.WHITE, numericScrambler);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        double d8 = d5 + d7 + 6.0;
        try {
            uIRenderingCoordinator2 = this.wU;
            object2 = this.wY != null ? this.wY.z().X() : CryptoAlgorithmSelector.d("\u00ce", (int)CryptoAlgorithmSelector.c("q", (int)8309, (long)(0x777FA177516A9D49L ^ l)), (long)-2707146906428669589L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        uIRenderingCoordinator2.V((String)object2);
        double d9 = d6 + 4.0;
        try {
            this.wU.V(d8, d9 - this.wU.E() / 2.0);
            uIRenderingCoordinator = this.wI;
            object = this.wY != null ? this.wY.z().j() : CryptoAlgorithmSelector.d("\u00ce", (int)CryptoAlgorithmSelector.c("q", (int)9428, (long)(0x5B05CA4D063D19E6L ^ l)), (long)-2707146906428669589L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        uIRenderingCoordinator.V((String)object);
        this.wI.V(d8, d9 + 10.0 - this.wI.E() / 2.0);
        double d10 = d6 + 18.0;
        this.J(d8, d10, f, f2, f3);
        this.D();
        this.o(f);
        ConfigurationManager.T(this.G() + this.w() - 8.0, this.W() + 4.0, 4.0, 1.0, new Color(0, 0, 0, 255));
        ConfigurationManager.T(this.G() + this.w() - 8.0, this.W() + 4.0, 4.0, 1.0, GraphicsRenderingUtility1454.P(this.wY.z().M()));
        if (!this.w4) {
            Object object3;
            this.U(d5, d6, d7, this.M(ApplicationLifecycleManager.U(), d2, d4));
            int n = (int)_Y.V(cryptographicTransformer.r(), cryptographicTransformer.y(), cryptographicTransformer.D(), d2, d3, d4);
            try {
                object3 = n > CryptoAlgorithmSelector.c("q", (int)17278, (long)(0x2289B0B47CD7E4EL ^ l)) ? CryptoAlgorithmSelector.d("\u00ce", (int)CryptoAlgorithmSelector.c("q", (int)3937, (long)(0xF59DDBBFAB63255L ^ l)), (long)-2707146906428669589L, (long)l) : n + (String)((Object)CryptoAlgorithmSelector.d("\u00ce", (int)CryptoAlgorithmSelector.c("q", (int)28287, (long)(0x39DD263679895349L ^ l)), (long)-2707146906428669589L, (long)l));
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
            CallSite callSite = object3;
            CryptographicParameterGenerator cryptographicParameterGenerator = this.r(n);
            double d11 = Math.max(d5 + d7 / 2.0 - cryptographicParameterGenerator.D((String)((Object)callSite)) / 2.0, this.G() + 2.0);
            double d12 = d6 + d7 + 6.0 + (this.W() + this.b() - 2.0 - (d6 + 4.0 + d7 + 4.0) - cryptographicParameterGenerator.B((String)((Object)callSite))) / 2.0;
            cryptographicParameterGenerator.Y((String)((Object)callSite), d11, d12, CryptoAlgorithmSelector.M.c);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = CryptoAlgorithmSelector.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptoAlgorithmSelector.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean q() {
        return this.w6.V().s();
    }

    private boolean y() {
        return this.w6.d().s();
    }

    private static Method l(long l, long l2) {
        int n = CryptoAlgorithmSelector.i(l, l2);
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
                clazz3 = CryptoAlgorithmSelector.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptoAlgorithmSelector.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptoAlgorithmSelector.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptoAlgorithmSelector.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptoAlgorithmSelector.j(223185696576342L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptoAlgorithmSelector.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptoAlgorithmSelector.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptoAlgorithmSelector.j(223185696576342L, 0L);
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

    private float v() {
        block7: {
            try {
                if (this.wR > 0.0f) {
                    this.wR = (float)this.wx.d() / 50.0f;
                    this.wR = Math.max(this.wR, 0.0f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
            try {
                try {
                    if (this.wg <= 0 || !(this.wR <= 0.0f)) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmSelector.a(customSystemException);
                }
                this.wR = 1.0f;
                --this.wg;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
        }
        return this.wR;
    }

    public CryptoAlgorithmSelector(CryptoSecurityProvider cryptoSecurityProvider) {
        this(cryptoSecurityProvider.i());
        this.w4 = true;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CryptoAlgorithmSelector.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "5e_";
        objectArray[1] = Integer.TYPE;
        CryptoAlgorithmSelector.mb[1] = "java/lang/Integer";
        objectArray[2] = "0\u001f8\u0006\u000fW;\u0010)IrO(\u0017 \u0000";
        objectArray[3] = "[xe\u0018VDPwtW7J[|p\r";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ")z\u0000wE,6}TN\u00146O3\u0007 \u001e-t D(\u007ft,rE<\u0012)r%HN";
    }

    private boolean m() {
        boolean bl;
        List<MetricComputationEngine> list = this.w6.R();
        try {
            bl = list.size() == 0;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        return bl;
    }

    @Override
    public void E() {
        AsynchronousCipherManager asynchronousCipherManager = (AsynchronousCipherManager)this.V();
        this.A();
        if (this.wp) {
            Cv cv = this.O(asynchronousCipherManager);
            super.E();
            ConfigurationManager.U(cv.G(), cv.W(), cv.w(), cv.b(), Color.white, 1.6f, 0.8f, 1.0f);
            return;
        }
        try {
            this.M(asynchronousCipherManager);
            super.E();
            if (this.q()) {
                this.x(this.G() + 30.0, this.W() + this.b() - 10.0, this.y());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        try {
            if (this.wx.m(50L)) {
                this.wx.m();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        this.v();
    }

    private Cv O(AsynchronousCipherManager asynchronousCipherManager) {
        int n;
        ArrayList<Cv> arrayList;
        Color color;
        double d2;
        double d3;
        String string;
        Object object;
        long l = ab ^ 0x205830AF5C5EL;
        boolean bl = this.m();
        this.wW.b(this.G());
        this.wW.M(this.W());
        this.wW.A();
        String string2 = "";
        for (ContextualExecutionFramework object2 : TemporalMetadataResolver.h.U().q()) {
            try {
                if (!object2.Z() || object2.N() == 0) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
            string2 = string2 + object2.O() + (String)((Object)CryptoAlgorithmSelector.d("\u00ce", (int)CryptoAlgorithmSelector.c("q", (int)19433, (long)(0x31FA57DA5C3681CBL ^ l)), (long)3276666545157928572L, (long)l));
        }
        for (Cv cv : this.wV) {
            Color color2;
            Cv cv2;
            try {
                cv2 = cv;
                color2 = this.y() ? CryptoAlgorithmSelector.M.W : new Color(26, 25, 26, 150);
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
            cv2.Q(color2);
        }
        try {
            if (this.y()) {
                ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), new Color(26, 25, 26, 150));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.75);
        try {
            object = cryptographicParameterGenerator;
            string = this.wY.z().X();
            d3 = this.G() + 8.0;
            d2 = this.W() + 4.0 - cryptographicParameterGenerator.B(this.wY.z().X()) / 2.0;
            color = this.y() ? CryptoAlgorithmSelector.M.c : Color.white;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        try {
            ((CryptographicParameterGenerator)object).Y(string, d3, d2, color);
            arrayList = this.wV;
            n = bl ? this.w3.l().v() + 27 : this.wY.n() + 27;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        return arrayList.get(n);
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptoAlgorithmSelector.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptoAlgorithmSelector.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptoAlgorithmSelector.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptoAlgorithmSelector.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void l() {
        boolean bl = this.m();
        int n = 0;
        for (int n2 : wN) {
            for (int i = 0; i < 9; ++i) {
                boolean bl2;
                Cv cv;
                block35: {
                    block36: {
                        ComparativeIdentifier comparativeIdentifier;
                        block33: {
                            block34: {
                                LightweightExecutionContext lightweightExecutionContext;
                                Cv cv2;
                                boolean bl3;
                                Cv cv3;
                                LightweightExecutionContext lightweightExecutionContext2;
                                block32: {
                                    block30: {
                                        block31: {
                                            boolean bl4;
                                            block29: {
                                                block28: {
                                                    LightweightExecutionContext lightweightExecutionContext3;
                                                    block27: {
                                                        block26: {
                                                            int n3 = n2 * 9 + i;
                                                            comparativeIdentifier = this.wY.n()[n3];
                                                            try {
                                                                try {
                                                                    if (this.w3 == null || !this.w3.r()) break block26;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw CryptoAlgorithmSelector.a(customSystemException);
                                                                }
                                                                lightweightExecutionContext3 = this.w3.l().F(n3);
                                                                break block27;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw CryptoAlgorithmSelector.a(customSystemException);
                                                            }
                                                        }
                                                        lightweightExecutionContext3 = null;
                                                    }
                                                    lightweightExecutionContext2 = lightweightExecutionContext3;
                                                    cv3 = this.wV.get(n);
                                                    try {
                                                        try {
                                                            if (lightweightExecutionContext2 == null || !lightweightExecutionContext2.r()) break block28;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw CryptoAlgorithmSelector.a(customSystemException);
                                                        }
                                                        bl4 = true;
                                                        break block29;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw CryptoAlgorithmSelector.a(customSystemException);
                                                    }
                                                }
                                                bl4 = false;
                                            }
                                            bl3 = bl4;
                                            try {
                                                try {
                                                    cv2 = cv3;
                                                    if (!bl) break block30;
                                                    if (!bl3) break block31;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw CryptoAlgorithmSelector.a(customSystemException);
                                                }
                                                lightweightExecutionContext = lightweightExecutionContext2;
                                                break block32;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw CryptoAlgorithmSelector.a(customSystemException);
                                            }
                                        }
                                        lightweightExecutionContext = null;
                                        break block32;
                                    }
                                    try {
                                        lightweightExecutionContext = comparativeIdentifier != null ? comparativeIdentifier.F() : null;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoAlgorithmSelector.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            cv2.r(lightweightExecutionContext);
                                            cv = cv3;
                                            if (!bl) break block33;
                                            if (!bl3) break block34;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw CryptoAlgorithmSelector.a(customSystemException);
                                        }
                                        if (RuntimeContextResolver.j(lightweightExecutionContext2).size() <= 0) break block34;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CryptoAlgorithmSelector.a(customSystemException);
                                    }
                                    bl2 = true;
                                    break block35;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoAlgorithmSelector.a(customSystemException);
                                }
                            }
                            bl2 = false;
                            break block35;
                        }
                        try {
                            try {
                                if (comparativeIdentifier == null || !comparativeIdentifier.C()) break block36;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoAlgorithmSelector.a(customSystemException);
                            }
                            bl2 = true;
                            break block35;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoAlgorithmSelector.a(customSystemException);
                        }
                    }
                    bl2 = false;
                }
                cv.Z(bl2);
                ++n;
            }
        }
    }

    private double V(double d2, double d3, double d4, double d5) {
        double d6;
        block11: {
            double d7;
            double d8;
            block10: {
                block9: {
                    block8: {
                        d6 = 0.0;
                        d8 = d4 - d2;
                        d7 = d5 - d3;
                        try {
                            if (!(d7 > 0.0) || !(d8 > 0.0)) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoAlgorithmSelector.a(customSystemException);
                        }
                        d6 = Math.toDegrees(-Math.atan(d8 / d7));
                        break block11;
                    }
                    try {
                        if (!(d7 > 0.0) || !(d8 < 0.0)) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoAlgorithmSelector.a(customSystemException);
                    }
                    d6 = Math.toDegrees(-Math.atan(d8 / d7));
                    break block11;
                }
                try {
                    if (!(d7 < 0.0) || !(d8 > 0.0)) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmSelector.a(customSystemException);
                }
                d6 = -90.0 + Math.toDegrees(Math.atan(d7 / d8));
                break block11;
            }
            try {
                if (!(d7 < 0.0) || !(d8 < 0.0)) break block11;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
            d6 = 90.0 + Math.toDegrees(Math.atan(d7 / d8));
        }
        double d9 = AdaptiveComputationEngine.v((float)d6);
        return AdaptiveComputationEngine.v((float)(d9 -= (double)AdaptiveComputationEngine.v(ApplicationLifecycleManager.U().q())));
    }

    public void p() {
        ConnectionConfigurationResolver connectionConfigurationResolver;
        block16: {
            connectionConfigurationResolver = ApplicationLifecycleManager.c();
            try {
                if (connectionConfigurationResolver.Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
            try {
                if (this.wY.z() instanceof CryptoSecurityProvider) {
                    this.w3 = ApplicationLifecycleManager.U();
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
            try {
                try {
                    if (this.w3 == null || !((NetworkProtocolNegotiator)connectionConfigurationResolver).I(this.w3.X()).Y()) break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmSelector.a(customSystemException);
                }
                this.w3 = null;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
        }
        try {
            if (this.w3 != null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoAlgorithmSelector.a(customSystemException);
        }
        for (Object e : connectionConfigurationResolver.M()) {
            Qh qh = new Qh(e);
            try {
                if (!qh.e().equalsIgnoreCase(this.wY.z().X())) continue;
                this.w3 = qh;
                break;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoAlgorithmSelector.a(customSystemException);
            }
        }
    }

    private double M(CryptographicTransformer cryptographicTransformer, double d2, double d3) {
        return this.V(cryptographicTransformer.r(), cryptographicTransformer.D(), d2, d3);
    }

    private void D() {
        int n = this.wY.o(this.w3);
        if (n > 0) {
            double d2 = (double)n / 20.0;
            int n2 = (int)(255.0 * d2);
            ConfigurationManager.T(this.G() + 6.0, this.W() + 10.0, 22.0, 1.0, new Color(255, 0, 0, n2));
        }
    }

    public void K(boolean bl) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        try {
                            try {
                                if (bl != this.wp) break block6;
                                if (!this.wp) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoAlgorithmSelector.a(customSystemException);
                            }
                            this.l();
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoAlgorithmSelector.a(customSystemException);
                        }
                    }
                    return;
                }
                try {
                    this.wp = bl;
                    if (!bl) break block8;
                    this.l();
                    this.w8.N(false);
                    this.wW.N(true);
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoAlgorithmSelector.a(customSystemException);
                }
            }
            this.wW.N(false);
            this.w8.N(true);
            this.w8.A();
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void x(double d2, double d3, boolean bl) {
        CryptographicParameterGenerator cryptographicParameterGenerator = this.L(0.75);
        String string = this.wY.x() + "";
        if (bl) {
            // empty if block
        }
        cryptographicParameterGenerator.Y(string, d2 - cryptographicParameterGenerator.D(string) / 2.0, d3 - cryptographicParameterGenerator.B(string) / 2.0, Color.white);
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void U(double d2, double d3, double d4, double d5) {
        double d6 = d4 / 2.0;
        double d7 = d2 + d6;
        double d8 = d3 + d6;
        double d9 = Math.toRadians(d5);
        double d10 = Math.toRadians(d5 - 12.0);
        double d11 = Math.toRadians(d5 + 12.0);
        double d12 = d7 + (d6 + 4.0) * Math.sin(d9);
        double d13 = d8 - (d6 + 4.0) * Math.cos(d9);
        double d14 = d7 + (d6 + 2.0) * Math.sin(d10);
        double d15 = d8 - (d6 + 2.0) * Math.cos(d10);
        double d16 = d7 + (d6 + 2.0) * Math.sin(d11);
        double d17 = d8 - (d6 + 2.0) * Math.cos(d11);
        ConfigurationManager.m(d14, d15, d12, d13, d16, d17, CryptoAlgorithmSelector.M.q);
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
                n3 = 59;
                break;
            }
            case 1: {
                n3 = 57;
                break;
            }
            case 2: {
                n3 = 0;
                break;
            }
            case 3: {
                n3 = 7;
                break;
            }
            case 4: {
                n3 = 16;
                break;
            }
            case 5: {
                n3 = 15;
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
                n3 = 63;
                break;
            }
            case 9: {
                n3 = 6;
                break;
            }
            case 10: {
                n3 = 25;
                break;
            }
            case 11: {
                n3 = 54;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 18;
                break;
            }
            case 14: {
                n3 = 14;
                break;
            }
            case 15: {
                n3 = 32;
                break;
            }
            case 16: {
                n3 = 8;
                break;
            }
            case 17: {
                n3 = 53;
                break;
            }
            case 18: {
                n3 = 56;
                break;
            }
            case 19: {
                n3 = 17;
                break;
            }
            case 20: {
                n3 = 13;
                break;
            }
            case 21: {
                n3 = 49;
                break;
            }
            case 22: {
                n3 = 30;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 21;
                break;
            }
            case 25: {
                n3 = 22;
                break;
            }
            case 26: {
                n3 = 45;
                break;
            }
            case 27: {
                n3 = 23;
                break;
            }
            case 28: {
                n3 = 47;
                break;
            }
            case 29: {
                n3 = 34;
                break;
            }
            case 30: {
                n3 = 11;
                break;
            }
            case 31: {
                n3 = 5;
                break;
            }
            case 32: {
                n3 = 60;
                break;
            }
            case 33: {
                n3 = 20;
                break;
            }
            case 34: {
                n3 = 1;
                break;
            }
            case 35: {
                n3 = 62;
                break;
            }
            case 36: {
                n3 = 50;
                break;
            }
            case 37: {
                n3 = 48;
                break;
            }
            case 38: {
                n3 = 36;
                break;
            }
            case 39: {
                n3 = 3;
                break;
            }
            case 40: {
                n3 = 33;
                break;
            }
            case 41: {
                n3 = 24;
                break;
            }
            case 42: {
                n3 = 58;
                break;
            }
            case 43: {
                n3 = 43;
                break;
            }
            case 44: {
                n3 = 51;
                break;
            }
            case 45: {
                n3 = 42;
                break;
            }
            case 46: {
                n3 = 38;
                break;
            }
            case 47: {
                n3 = 31;
                break;
            }
            case 48: {
                n3 = 4;
                break;
            }
            case 49: {
                n3 = 41;
                break;
            }
            case 50: {
                n3 = 46;
                break;
            }
            case 51: {
                n3 = 26;
                break;
            }
            case 52: {
                n3 = 52;
                break;
            }
            case 53: {
                n3 = 44;
                break;
            }
            case 54: {
                n3 = 2;
                break;
            }
            case 55: {
                n3 = 19;
                break;
            }
            case 56: {
                n3 = 12;
                break;
            }
            case 57: {
                n3 = 27;
                break;
            }
            case 58: {
                n3 = 37;
                break;
            }
            case 59: {
                n3 = 40;
                break;
            }
            case 60: {
                n3 = 55;
                break;
            }
            case 61: {
                n3 = 61;
                break;
            }
            case 62: {
                n3 = 28;
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
        CryptoAlgorithmSelector.mb[n4] = new String(cArray);
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoAlgorithmSelector.ab = MultiContainerRegistry.a(-6149522525333105851L, -2641851835376073064L, MethodHandles.lookup().lookupClass()).a(115343408338531L);
                CryptoAlgorithmSelector.lb = new Object[5];
                CryptoAlgorithmSelector.mb = new String[5];
                CryptoAlgorithmSelector.x();
                CryptoAlgorithmSelector.fb = new HashMap<K, V>(13);
                var0 = CryptoAlgorithmSelector.ab ^ 19665298767064L;
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
                var6_5 = "\u00d0l\u0095?\u00e2\u00ed3S}\u00b3F(2\u00c6\u008a,\\\u00908\u00c0\u0000h\u00e3@\u00ad,\u0095Q-=\u00c8tz]\u0007R\u00d6\u001ab,c\u00f9\u00e5I\u0002\u00c0\u00b4\u0088\u00c7\u0083\u00bb\u00950*\u00c3p\u00f9\u00f3\u00d0\u0096\u0014c7/\u0082\u00e7\u00ea\u009c\u00a4\fG\u0094";
                var7_6 = "\u00d0l\u0095?\u00e2\u00ed3S}\u00b3F(2\u00c6\u008a,\\\u00908\u00c0\u0000h\u00e3@\u00ad,\u0095Q-=\u00c8tz]\u0007R\u00d6\u001ab,c\u00f9\u00e5I\u0002\u00c0\u00b4\u0088\u00c7\u0083\u00bb\u00950*\u00c3p\u00f9\u00f3\u00d0\u0096\u0014c7/\u0082\u00e7\u00ea\u009c\u00a4\fG\u0094".length();
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
                    var6_5 = "{\u0004\u0080\u0010\u007f\u00f5\u00df$.\u0005\u00d1#H!\u00d0\u00eb";
                    var7_6 = "{\u0004\u0080\u0010\u007f\u00f5\u00df$.\u0005\u00d1#H!\u00d0\u00eb".length();
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
        CryptoAlgorithmSelector.bb = var8_3;
        CryptoAlgorithmSelector.eb = new Integer[11];
        CryptoAlgorithmSelector.wN = Arrays.asList(new Integer[]{1, 2, 3, 0});
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptoAlgorithmSelector.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CryptoAlgorithmSelector.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

