/*
 * Decompiled with CFR 0.152.
 */
package com.multimedia.streaming;

import a.CV;
import a.bE;
import a.h6;
import a.hr;
import a.yC;
import com.app.workflow.StateTrackingCoordinator;
import com.auth.tracking.AuthenticationStateTracker;
import com.cache.distribution.DistributedCacheManager;
import com.collections.management.MultiContainerRegistry;
import com.config.parameters.ParameterConfigurationHandler;
import com.core.computation.AbstractComputationKernel;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.crypto.operations.CipherOperationsManager;
import com.data.compression.DataCompressionNegotiator;
import com.distributed.cache.DistributedCacheOrchestrator;
import com.exception.system.CustomSystemException;
import com.graphics.geometry.GeometryTransformer;
import com.graphics.rendering.GraphicalRenderController;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.math.precision.PrecisionMathOrchestrator;
import com.math.transformation.NumericTransformationEngine;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.cryptography.CryptographicContextManager153;
import com.security.encoding.SecureDataEncoder414;
import com.system.lifecycle.SystemLifecycleController;
import com.system.resource.ResourceAllocationStrategy1907;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.rendering.VisualRenderContext;
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
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MultimediaStreamHandler
extends GeometryTransformer {
    private final hr vl;
    private final GraphicalRenderEngine1082 vS;
    private final GraphicalRenderEngine1082 vX;
    private static final long bb;
    private static final String[] pb;
    private final GraphicalRenderEngine1082 vB;
    private final CipherOperationsManager v8;
    private static final Object[] ob;
    private static final Integer[] lb;
    private final GraphicalRenderEngine1082 vq;
    private final GraphicalRenderEngine1082 vd;
    private final CV vE;
    final AtomicBoolean vG;
    private CryptographicContextManager153 vm;
    private static final long[] eb;
    private static final Map mb;
    private static int[] vU;

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MultimediaStreamHandler.m(l, l2);
            object = ob[n];
            try {
                if (!(object instanceof String)) break block2;
                MultimediaStreamHandler.ob[n] = clazz = Class.forName(pb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private AdaptiveCipherEngine n(AuthenticationStateTracker authenticationStateTracker) {
        AdaptiveCipherEngine adaptiveCipherEngine = new AdaptiveCipherEngine(authenticationStateTracker.w(), 0.8, authenticationStateTracker);
        adaptiveCipherEngine.Y(this.vS.w());
        adaptiveCipherEngine.J(true);
        adaptiveCipherEngine.P(10.0);
        adaptiveCipherEngine.S(true);
        adaptiveCipherEngine.Q(MultimediaStreamHandler.M.E);
        return adaptiveCipherEngine;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'j' || c == '\u00c5' || c == '\u00a3' || c == 'u') {
                field = MultimediaStreamHandler.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'j' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MultimediaStreamHandler.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'h' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x366D;
        if (lb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])mb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    mb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yH", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MultimediaStreamHandler.lb[n2] = n3;
        }
        return lb[n2];
    }

    static void Y(MultimediaStreamHandler multimediaStreamHandler) {
        multimediaStreamHandler.z();
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MultimediaStreamHandler.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MultimediaStreamHandler.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public MultimediaStreamHandler() {
        long l = bb ^ 0x55AD48F12AF3L;
        this.vm = new CryptographicContextManager153((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)32108, (long)(0x5030AE0E3A8C9FC4L ^ l)), (long)6113405994265685961L, (long)l)));
        this.vl = new hr((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)3697, (long)(0x67083CB4CAC5ECC8L ^ l)), (long)6113405994265685961L, (long)l)), Color.RED);
        this.vd = new GraphicalRenderEngine1082(104.0, 65.0);
        this.vX = new GraphicalRenderEngine1082(96.0, 18.0);
        this.vS = new GraphicalRenderEngine1082(96.0, 50.0);
        this.vG = new AtomicBoolean(false);
        this.vE = new SecureDataEncoder414(this, (String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)19828, (long)(0x318696DB3F63AFDBL ^ l)), (long)6113405994265685961L, (long)l)), 10000L);
        this.vd.i(false);
        this.vX.i(true);
        this.vS.i(true);
        this.vd.d().f((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)15322, (long)(0x3A288CD4EE1ED96FL ^ l)), (long)6113405994265685961L, (long)l)));
        this.v8 = new CipherOperationsManager(null, 16.0, 16.0);
        this.v8.Y(true);
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(104.0, 24.0);
        this.vq = new GraphicalRenderEngine1082(graphicalRenderEngine1082.w(), 24.0);
        this.vq.d().f((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)4629, (long)(0x2179D457CAAE70BEL ^ l)), (long)6113405994265685961L, (long)l)));
        graphicalRenderEngine1082.n(this.vq, new Object[0]);
        this.vm = new DataCompressionNegotiator(TemporalMetadataResolver.h.r().Y(), 1.0, Color.WHITE);
        this.vm.T(104.0);
        this.vm.w(12.0);
        this.vm.q(true);
        this.vq.n(new PrecisionMathOrchestrator(0.0, 2.0, 0.0, 0.0, this.vm), MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)18241, (long)(0x3E303ACC666FA5F6L ^ l)), (long)6113405994265685961L, (long)l));
        this.vB = new GraphicalRenderEngine1082(graphicalRenderEngine1082.w(), 24.0);
        this.vB.d().f((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)18398, (long)(0x66ABB3B8BBB8A577L ^ l)), (long)6113405994265685961L, (long)l)));
        this.vB.N(false);
        graphicalRenderEngine1082.n(this.vB, new Object[0]);
        this.vE.O().H((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)27993, (long)(0x359DB80AADC58FEFL ^ l)), (long)6113405994265685961L, (long)l)));
        this.vE.I(false);
        this.vE.o(16);
        this.vB.n(new bE((this.vB.w() - this.vE.w()) / 2.0, 0.0), MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)765, (long)(0x5B48788593EA6047L ^ l)), (long)6113405994265685961L, (long)l));
        this.vB.n(this.vE, new Object[0]);
        this.vB.n(new bE((this.vB.w() - this.vE.w()) / 2.0 + 4.0, 0.0), MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)14398, (long)(0x91E61D8BBDE5A83L ^ l)), (long)6113405994265685961L, (long)l));
        this.vB.n(new GraphicalRenderController(this.vE.w() - 20.0, 1.0, MultimediaStreamHandler.M.k), new Object[0]);
        VisualRenderContext visualRenderContext = new VisualRenderContext((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)5724, (long)(0x7AE480F96B85F4EFL ^ l)), (long)6113405994265685961L, (long)l)), 0.8, false, MultimediaStreamHandler.M.S);
        visualRenderContext.P(10.0);
        visualRenderContext.Y(22.0);
        visualRenderContext.N(this::z);
        this.vB.n(new bE((this.vB.w() - visualRenderContext.w()) / 2.0, 3.0), new Object[0]);
        this.vB.n(new bE((this.vB.w() - visualRenderContext.w()) / 2.0, 0.0), MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)21806, (long)(0x7A3251D2F19DB791L ^ l)), (long)6113405994265685961L, (long)l));
        this.vB.n(visualRenderContext, new Object[0]);
        h6 h62 = new h6((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)23922, (long)(0x612110781A743FDCL ^ l)), (long)6113405994265685961L, (long)l)), MultimediaStreamHandler.M.S);
        h62.T(19.0);
        h62.w(10.0);
        h62.d(0.6);
        h62.d(0.75f);
        h62.f(true);
        h62.N(MultimediaStreamHandler::lambda$new$0);
        yC yC2 = new yC((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)29625, (long)(0x20D550A3A167110BL ^ l)), (long)6113405994265685961L, (long)l)), 4.0, 4.0, 10.0, 10.0, MultimediaStreamHandler.M.Z, Color.WHITE, MultimediaStreamHandler.M.S);
        yC2.u(true);
        yC2.w(true);
        yC2.c(-0.5);
        yC2.N(this::z);
        this.vq.n(new bE(35.0, 0.0), new Object[0]);
        this.vq.n(h62, new Object[0]);
        this.vq.n(new bE(3.0, 0.0), new Object[0]);
        this.vq.n(yC2, new Object[0]);
        this.vd.n(new PrecisionMathOrchestrator(this.w() / 2.0 - this.v8.w() / 2.0, 6.0, this.v8), new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(104.0, 26.0);
        graphicalRenderEngine10822.d().f((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)11753, (long)(0x3632A74BAC89CF5DL ^ l)), (long)6113405994265685961L, (long)l)));
        this.vd.n(graphicalRenderEngine1082, new Object[0]);
        this.vX.Q(MultimediaStreamHandler.M.g);
        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)28437, (long)(0x14C94F3F27438DA4L ^ l)), (long)6113405994265685961L, (long)l)), 0.8, MultimediaStreamHandler.M.c);
        cryptographicContextManager153.w(this.vX.b());
        this.vX.n(cryptographicContextManager153, new Object[0]);
        this.vl.N(SystemLifecycleController.C::v);
        this.vl.P(10.0);
        this.vl.Y(45.0);
        this.vl.A(MultimediaStreamHandler.M.n);
        this.vl.q(false);
        this.vl.u(5.0f);
        this.vl.f(true);
        this.vl.d(0.8f);
        this.vl.Q(MultimediaStreamHandler.M.S, MultimediaStreamHandler.M.k);
        this.vX.n(new PrecisionMathOrchestrator(4.0, 4.0, this.vl), MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)4738, (long)(0x47C21E5AEA9F028L ^ l)), (long)6113405994265685961L, (long)l));
        this.vS.Q(MultimediaStreamHandler.M.g);
        this.vS.d().f((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)26750, (long)(0xB457BC33B410ADDL ^ l)), (long)6113405994265685961L, (long)l)));
        this.vS.n(new bE(0.0, 4.0), new Object[0]);
        this.vS.n(this.n(SystemLifecycleController.C.q().f()), new Object[0]);
        Object object = SystemLifecycleController.C.q();
        AuthenticationStateTracker[] authenticationStateTrackerArray = new AuthenticationStateTracker[]{((DistributedCacheManager)object).T(), ((DistributedCacheManager)object).v(), ((DistributedCacheManager)object).B()};
        ResourceAllocationStrategy1907 resourceAllocationStrategy1907 = new ResourceAllocationStrategy1907(this, (String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)32242, (long)(0x14014C63D2669F49L ^ l)), (long)6113405994265685961L, (long)l)), 0.8, null, authenticationStateTrackerArray);
        resourceAllocationStrategy1907.Y(this.vS.w());
        resourceAllocationStrategy1907.J(true);
        resourceAllocationStrategy1907.Q(MultimediaStreamHandler.M.E);
        this.vS.n(resourceAllocationStrategy1907, new Object[0]);
        hr hr2 = new hr((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)11057, (long)(0x13147304159AC98FL ^ l)), (long)6113405994265685961L, (long)l)), 0.8, MultimediaStreamHandler.M.E, MultimediaStreamHandler.M.m, MultimediaStreamHandler.M.S, 7.0f, 1.0f, this.vS.w() - 8.0, 14.0);
        hr2.q(false);
        hr2.A(MultimediaStreamHandler.M.c);
        this.vS.n(new PrecisionMathOrchestrator(4.0, 2.0, hr2), new Object[0]);
        hr2.N(MultimediaStreamHandler::lambda$new$1);
        object = new GraphicalRenderEngine1082(96.0, 75.0);
        ((NumericTransformationEngine)object).d().f((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)4551, (long)(0x1E2C004DE10EF37BL ^ l)), (long)6113405994265685961L, (long)l)));
        ((NumericTransformationEngine)object).n(this.vX, new Object[0]);
        ((NumericTransformationEngine)object).n(new bE(0.0, 4.0), new Object[0]);
        ((NumericTransformationEngine)object).n(this.vS, new Object[0]);
        this.o(this.vd, new PrecisionMathOrchestrator(4.0, 0.0, (AbstractComputationKernel)object));
    }

    @Override
    public void E() {
        long l = bb ^ 0x344D1EB7131DL;
        super.E();
        this.vm.H(TemporalMetadataResolver.h.r().Y());
        this.vl.z((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)12533, (long)(0x4133E47EF96D6BB7L ^ l)), (long)7870409496331621927L, (long)l)));
        StateTrackingCoordinator.B(MultimediaStreamHandler.M.Z, (float)this.vl.G() + 6.0f, (float)this.vl.W() + 2.0f, (String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)20854, (long)(0x56105996F4870A28L ^ l)), (long)7870409496331621927L, (long)l)), 5.0f, 5.0f, false);
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MultimediaStreamHandler.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void D() {
        Object[] objectArray = ob;
        ob[0] = "\u0016zr";
        objectArray[1] = Integer.TYPE;
        MultimediaStreamHandler.pb[1] = "java/lang/Integer";
        objectArray[2] = "Z\u0001\u000fZ_\u000bQ\u000e\u001e\u0015\"\u0013B\t\u0017\\";
        objectArray[3] = "Wc\nE\r=\\l\u001b\nl3Wg\u001fP";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0013J#ER\u001cF\tl4^\u0015-\u000etKX^\u0016\biX5T\u0017\u0012.TN\u0001_\u0017r4";
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void z() {
        boolean bl;
        GraphicalRenderEngine1082 graphicalRenderEngine1082;
        boolean bl2;
        GraphicalRenderEngine1082 graphicalRenderEngine10822;
        try {
            graphicalRenderEngine10822 = this.vq;
            bl2 = !this.vq.f();
        }
        catch (CustomSystemException customSystemException) {
            throw MultimediaStreamHandler.a(customSystemException);
        }
        try {
            graphicalRenderEngine10822.N(bl2);
            graphicalRenderEngine1082 = this.vB;
            bl = !this.vB.f();
        }
        catch (CustomSystemException customSystemException) {
            throw MultimediaStreamHandler.a(customSystemException);
        }
        graphicalRenderEngine1082.N(bl);
    }

    private static void lambda$new$1() {
        DistributedCacheOrchestrator.kW.Y();
    }

    public static void i(int[] nArray) {
        vU = nArray;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MultimediaStreamHandler.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void lambda$new$0() {
        long l = bb ^ 0x51A458ACF52BL;
        ParameterConfigurationHandler.q(TemporalMetadataResolver.h.r().Y());
        TemporalMetadataResolver.h.c().t((String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)26522, (long)(0x393998241060DAEFL ^ l)), (long)-8426469830547279855L, (long)l)), (String)((Object)MultimediaStreamHandler.d("\u00d3", (int)MultimediaStreamHandler.c("k", (int)31673, (long)(0x43D97E38A59646D9L ^ l)), (long)-8426469830547279855L, (long)l)) + TemporalMetadataResolver.h.r().Y(), CryptoConfigurationRegistry383.INFO, 5000L);
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = MultimediaStreamHandler.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MultimediaStreamHandler.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (pb[n4] != null) {
            return n4;
        }
        Object object = ob[n4];
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
                n3 = 20;
                break;
            }
            case 2: {
                n3 = 11;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 4: {
                n3 = 47;
                break;
            }
            case 5: {
                n3 = 49;
                break;
            }
            case 6: {
                n3 = 7;
                break;
            }
            case 7: {
                n3 = 25;
                break;
            }
            case 8: {
                n3 = 38;
                break;
            }
            case 9: {
                n3 = 54;
                break;
            }
            case 10: {
                n3 = 53;
                break;
            }
            case 11: {
                n3 = 57;
                break;
            }
            case 12: {
                n3 = 42;
                break;
            }
            case 13: {
                n3 = 31;
                break;
            }
            case 14: {
                n3 = 23;
                break;
            }
            case 15: {
                n3 = 45;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 4;
                break;
            }
            case 18: {
                n3 = 36;
                break;
            }
            case 19: {
                n3 = 13;
                break;
            }
            case 20: {
                n3 = 18;
                break;
            }
            case 21: {
                n3 = 3;
                break;
            }
            case 22: {
                n3 = 55;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 44;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 61;
                break;
            }
            case 27: {
                n3 = 56;
                break;
            }
            case 28: {
                n3 = 10;
                break;
            }
            case 29: {
                n3 = 14;
                break;
            }
            case 30: {
                n3 = 15;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 32;
                break;
            }
            case 33: {
                n3 = 51;
                break;
            }
            case 34: {
                n3 = 16;
                break;
            }
            case 35: {
                n3 = 37;
                break;
            }
            case 36: {
                n3 = 34;
                break;
            }
            case 37: {
                n3 = 21;
                break;
            }
            case 38: {
                n3 = 8;
                break;
            }
            case 39: {
                n3 = 58;
                break;
            }
            case 40: {
                n3 = 63;
                break;
            }
            case 41: {
                n3 = 60;
                break;
            }
            case 42: {
                n3 = 9;
                break;
            }
            case 43: {
                n3 = 29;
                break;
            }
            case 44: {
                n3 = 41;
                break;
            }
            case 45: {
                n3 = 26;
                break;
            }
            case 46: {
                n3 = 59;
                break;
            }
            case 47: {
                n3 = 62;
                break;
            }
            case 48: {
                n3 = 19;
                break;
            }
            case 49: {
                n3 = 46;
                break;
            }
            case 50: {
                n3 = 12;
                break;
            }
            case 51: {
                n3 = 22;
                break;
            }
            case 52: {
                n3 = 2;
                break;
            }
            case 53: {
                n3 = 50;
                break;
            }
            case 54: {
                n3 = 24;
                break;
            }
            case 55: {
                n3 = 27;
                break;
            }
            case 56: {
                n3 = 48;
                break;
            }
            case 57: {
                n3 = 30;
                break;
            }
            case 58: {
                n3 = 35;
                break;
            }
            case 59: {
                n3 = 52;
                break;
            }
            case 60: {
                n3 = 17;
                break;
            }
            case 61: {
                n3 = 43;
                break;
            }
            case 62: {
                n3 = 5;
                break;
            }
            default: {
                n3 = 33;
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
        MultimediaStreamHandler.pb[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void O() {
        this.vm.H(TemporalMetadataResolver.h.r().Y());
        this.v8.F(TemporalMetadataResolver.h.r().D());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MultimediaStreamHandler.bb = MultiContainerRegistry.a(9220214737695726317L, 6137091656650720261L, MethodHandles.lookup().lookupClass()).a(265608606068156L);
                MultimediaStreamHandler.ob = new Object[5];
                MultimediaStreamHandler.pb = new String[5];
                MultimediaStreamHandler.D();
                MultimediaStreamHandler.mb = new HashMap<K, V>(13);
                var0 = MultimediaStreamHandler.bb ^ 45919656536848L;
                MultimediaStreamHandler.i(new int[2]);
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
                var8_3 = new long[25];
                var5_4 = 0;
                var6_5 = "\u00ab\u00e9\u00fc\u00af\u00b8\u001d\u008b\u00f9\u00d9\u00ceR\u00e1;\u00ed%\u000eX\u0005\u0007\u0083\"~'\u00f4\u00bfA\u00ab|\u00ef\u0005r\u00cbA\u00ea\u00a0\u00ca\u00e6\u00a2\fV\u00bb\u00ec\u00bf|~\u00f4u\u00abE\u00f5\u0095\u00d3\u00ed\u00dd^\u00b7-\u009d\u00dbyS\u00b4\u0089oK^6\u00e5\u00e0\\y\u008c\u0017\u007f\u000f\u00f3P|E_\u00a9\u00cb6c^\u00fa\u00db\u00b4\u00f9\u00f3\u00a4\u0014\u00ebx(\u0092H\u00f6\u00ba\u00be\u00c1\u00f0n\u0082\u0005!rb\u008e/6\u00ee}\u0080Rk-=6\\_\u00b5\u00d9u\u00ab3\u00f1\u00db[\u00d0\u00d1b\b\n\u00e8\u0002A\u00d5\u00056\u0014\u0011\u00db{aq\u00deb\u00be\u00e1\u001f\u00ba\u00ac\u0083c\u00d0\u00bae\u00c2S\u00e6\u00c0\u00a3\u0006u\u00f6<1G\u0097\u0092\u0097_0\u0082\u00a1~\u0010\u0014\u00d1\u00a6\u00f9\u00d7\u00ff";
                var7_6 = "\u00ab\u00e9\u00fc\u00af\u00b8\u001d\u008b\u00f9\u00d9\u00ceR\u00e1;\u00ed%\u000eX\u0005\u0007\u0083\"~'\u00f4\u00bfA\u00ab|\u00ef\u0005r\u00cbA\u00ea\u00a0\u00ca\u00e6\u00a2\fV\u00bb\u00ec\u00bf|~\u00f4u\u00abE\u00f5\u0095\u00d3\u00ed\u00dd^\u00b7-\u009d\u00dbyS\u00b4\u0089oK^6\u00e5\u00e0\\y\u008c\u0017\u007f\u000f\u00f3P|E_\u00a9\u00cb6c^\u00fa\u00db\u00b4\u00f9\u00f3\u00a4\u0014\u00ebx(\u0092H\u00f6\u00ba\u00be\u00c1\u00f0n\u0082\u0005!rb\u008e/6\u00ee}\u0080Rk-=6\\_\u00b5\u00d9u\u00ab3\u00f1\u00db[\u00d0\u00d1b\b\n\u00e8\u0002A\u00d5\u00056\u0014\u0011\u00db{aq\u00deb\u00be\u00e1\u001f\u00ba\u00ac\u0083c\u00d0\u00bae\u00c2S\u00e6\u00c0\u00a3\u0006u\u00f6<1G\u0097\u0092\u0097_0\u0082\u00a1~\u0010\u0014\u00d1\u00a6\u00f9\u00d7\u00ff".length();
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
                    var6_5 = "\u00b4\u00e3\u008e\u0018\u000ed\u0010-(6\u00ea\u00b4\u008e\u008c\"@";
                    var7_6 = "\u00b4\u00e3\u008e\u0018\u000ed\u0010-(6\u00ea\u00b4\u008e\u008c\"@".length();
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
        MultimediaStreamHandler.eb = var8_3;
        MultimediaStreamHandler.lb = new Integer[25];
    }

    private static Method p(long l, long l2) {
        int n = MultimediaStreamHandler.m(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n];
                int n3 = string2.indexOf(8);
                clazz3 = MultimediaStreamHandler.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MultimediaStreamHandler.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MultimediaStreamHandler.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        MultimediaStreamHandler.ob[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MultimediaStreamHandler.n(230864420704979L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MultimediaStreamHandler.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MultimediaStreamHandler.ob[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MultimediaStreamHandler.n(230864420704979L, 0L);
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

    private static Field o(long l, long l2) {
        int n = MultimediaStreamHandler.m(l, l2);
        Object object = ob[n];
        if (object instanceof String) {
            String string = pb[n];
            int n2 = string.indexOf(8);
            Class clazz = MultimediaStreamHandler.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MultimediaStreamHandler.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MultimediaStreamHandler.g(clazz3, string2, clazz2)) != null) {
                    MultimediaStreamHandler.ob[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MultimediaStreamHandler.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MultimediaStreamHandler.ob[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MultimediaStreamHandler.n(230864420704979L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static int[] J() {
        return vU;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
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
            return MethodHandles.lookup().findStatic(MultimediaStreamHandler.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(MultimediaStreamHandler.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

