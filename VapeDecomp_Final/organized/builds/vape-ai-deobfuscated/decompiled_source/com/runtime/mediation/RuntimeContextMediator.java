/*
 * Decompiled with CFR 0.152.
 */
package com.runtime.mediation;

import com.analytics.computation.MetricsCalculationEngine;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.DataCompressionEngine;
import com.event.core.EventDispatchCoordinator1159;
import com.exception.system.CustomSystemException;
import com.execution.validation.ExecutionStateValidator;
import com.math.geometry.GeometricCalculator1575;
import com.math.geometry.GeometricCalculator1649;
import com.network.protocol.CommunicationProtocolHandler;
import com.networking.protocol.ProtocolNegotiator;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.reflection.metadata.ReflectionMetadataExtractor1376;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.rendering.style.RenderStyleController;
import com.runtime.context.ContextualExecutionFramework;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CryptographicEnumRegistry;
import com.security.session.CipherSessionManager;
import com.system.configuration.ConfigurationManager;
import com.system.resource.ResourceAllocationTracker1227;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.rendering.GraphicalRenderingController;
import com.workflow.validation.StateTransitionValidator;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class RuntimeContextMediator<T extends ReflectionMetadataExtractor1376>
extends StateTransitionValidator {
    private static final Map ub;
    private RenderStyleController tg;
    private static final String[] Hb;
    private double tI;
    public final int tr;
    private final AuthenticationStateTracker tK;
    private boolean tD;
    private static final Object[] Gb;
    private double tv;
    public T tS;
    private static int t6;
    private static final Integer[] tb;
    private double tw;
    private ResourceAllocationTracker1227 t8;
    private DataCompressionEngine<RenderStyleController> tZ;
    private double tN;
    private static final long[] lb;
    private RenderStyleController tR;
    private static final long ab;

    @Override
    public void S(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        super.S(userInteractionEventDispatcher);
        this.Z(userInteractionEventDispatcher);
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x28E6;
        if (tb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = lb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ub.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    ub.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wN", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            RuntimeContextMediator.tb[n2] = n3;
        }
        return tb[n2];
    }

    private static Method i(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public double c() {
        return Math.max(26.0, this.b());
    }

    @Override
    public void i() {
        block22: {
            block21: {
                block20: {
                    block19: {
                        try {
                            try {
                                if (!this.Od || DynamicInvocationResolver1041.F(160)) break block19;
                                break block20;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RuntimeContextMediator.c(customSystemException);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeContextMediator.c(customSystemException);
                        }
                    }
                    this.tv = -1.0;
                    this.tw = -1.0;
                    this.tI = -1.0;
                    this.tN = -1.0;
                }
                try {
                    if (this.R()) {
                        this.t8.Z((int)this.w() * 2, (int)this.b() * 2);
                        this.t8.q((int)this.G(), (int)this.W(), 6.0f, 4.0f);
                        ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), this.b());
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeContextMediator.c(customSystemException);
                }
                try {
                    try {
                        if (!this.l()) break block21;
                        this.Z();
                        if (!this.f()) break block22;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeContextMediator.c(customSystemException);
                    }
                    this.tZ.l();
                    this.tZ.R();
                    break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeContextMediator.c(customSystemException);
                }
            }
            try {
                this.tg.N(false);
                this.tR.N(false);
                if (this.tZ.f()) {
                    this.tZ.N(false);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeContextMediator.c(customSystemException);
            }
            for (AbstractComputationKernel abstractComputationKernel : this.tZ.A()) {
                try {
                    try {
                        if (!(abstractComputationKernel instanceof ExecutionStateValidator) || !((ExecutionStateValidator)abstractComputationKernel).r()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeContextMediator.c(customSystemException);
                    }
                    abstractComputationKernel.N(false);
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeContextMediator.c(customSystemException);
                }
            }
        }
        this.V();
    }

    @Override
    public boolean d() {
        return false;
    }

    private static int q(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Hb[n4] != null) {
            return n4;
        }
        Object object = Gb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 49;
                break;
            }
            case 1: {
                n3 = 47;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 21;
                break;
            }
            case 4: {
                n3 = 56;
                break;
            }
            case 5: {
                n3 = 11;
                break;
            }
            case 6: {
                n3 = 15;
                break;
            }
            case 7: {
                n3 = 45;
                break;
            }
            case 8: {
                n3 = 40;
                break;
            }
            case 9: {
                n3 = 7;
                break;
            }
            case 10: {
                n3 = 5;
                break;
            }
            case 11: {
                n3 = 10;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 53;
                break;
            }
            case 14: {
                n3 = 48;
                break;
            }
            case 15: {
                n3 = 41;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 37;
                break;
            }
            case 18: {
                n3 = 46;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 16;
                break;
            }
            case 22: {
                n3 = 19;
                break;
            }
            case 23: {
                n3 = 22;
                break;
            }
            case 24: {
                n3 = 9;
                break;
            }
            case 25: {
                n3 = 58;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 51;
                break;
            }
            case 29: {
                n3 = 42;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 35;
                break;
            }
            case 32: {
                n3 = 25;
                break;
            }
            case 33: {
                n3 = 28;
                break;
            }
            case 34: {
                n3 = 32;
                break;
            }
            case 35: {
                n3 = 54;
                break;
            }
            case 36: {
                n3 = 1;
                break;
            }
            case 37: {
                n3 = 23;
                break;
            }
            case 38: {
                n3 = 4;
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
                n3 = 59;
                break;
            }
            case 42: {
                n3 = 8;
                break;
            }
            case 43: {
                n3 = 61;
                break;
            }
            case 44: {
                n3 = 63;
                break;
            }
            case 45: {
                n3 = 3;
                break;
            }
            case 46: {
                n3 = 27;
                break;
            }
            case 47: {
                n3 = 60;
                break;
            }
            case 48: {
                n3 = 29;
                break;
            }
            case 49: {
                n3 = 33;
                break;
            }
            case 50: {
                n3 = 24;
                break;
            }
            case 51: {
                n3 = 18;
                break;
            }
            case 52: {
                n3 = 38;
                break;
            }
            case 53: {
                n3 = 39;
                break;
            }
            case 54: {
                n3 = 30;
                break;
            }
            case 55: {
                n3 = 36;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 55;
                break;
            }
            case 58: {
                n3 = 34;
                break;
            }
            case 59: {
                n3 = 6;
                break;
            }
            case 60: {
                n3 = 57;
                break;
            }
            case 61: {
                n3 = 26;
                break;
            }
            case 62: {
                n3 = 43;
                break;
            }
            default: {
                n3 = 0;
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
        RuntimeContextMediator.Hb[n4] = new String(cArray);
        return n4;
    }

    private static void eb() {
        Object[] objectArray = Gb;
        Gb[0] = "gF_";
        objectArray[1] = Integer.TYPE;
        RuntimeContextMediator.Hb[1] = "java/lang/Integer";
        objectArray[2] = "H0j\u0015g\u0016C?{Z\u001a\u000eP8r\u0013";
        objectArray[3] = ">+\u0012F\u000555$\u0003\td;>/\u0007S";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "7_\u000eFac(C\u0004'q\u007fR\u0006\u0007^+i(_RZc\u0004kC\u001cX*<l\u0007\nJ\u001a";
    }

    public Color u(Color color, int n) {
        int n2;
        block2: {
            n2 = color.getAlpha();
            try {
                if (RuntimeContextMediator.I() || GraphicalRenderingController.K.P) break block2;
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeContextMediator.c(customSystemException);
            }
            n2 = (int)((float)n2 * ((float)n / 100.0f));
        }
        return EventDispatchCoordinator1159.y(color, n2);
    }

    public void M(boolean bl) {
        boolean bl2;
        AuthenticationStateTracker authenticationStateTracker;
        try {
            authenticationStateTracker = this.tK;
            bl2 = !bl;
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeContextMediator.c(customSystemException);
        }
        authenticationStateTracker.k(bl2);
    }

    public void m(boolean bl) {
        this.tK.H(bl);
    }

    public boolean U() {
        return this.tK.s();
    }

    private static Method t(long l, long l2) {
        int n = RuntimeContextMediator.q(l, l2);
        Object object = Gb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Hb[n];
                int n3 = string2.indexOf(8);
                clazz3 = RuntimeContextMediator.r(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = RuntimeContextMediator.r(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = RuntimeContextMediator.i(clazz, string, clazz2, n2, classArray2)) != null) {
                        RuntimeContextMediator.Gb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = RuntimeContextMediator.r(227830009847531L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = RuntimeContextMediator.j(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        RuntimeContextMediator.Gb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = RuntimeContextMediator.r(227830009847531L, 0L);
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

    private GeometricCalculator1649[] N(MetricsCalculationEngine metricsCalculationEngine) {
        GeometricCalculator1649 geometricCalculator1649;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        GeometricCalculator1649 geometricCalculator16492 = null;
        GeometricCalculator1649 geometricCalculator16493 = null;
        double d7 = 2.0;
        double d8 = 60.0;
        for (CryptographicEnumRegistry cryptographicEnumRegistry : CryptographicEnumRegistry.v()) {
            for (CryptographicEnumRegistry cryptographicEnumRegistry2 : CryptographicEnumRegistry.v()) {
                block16: {
                    d6 = cryptographicEnumRegistry.f(metricsCalculationEngine) - cryptographicEnumRegistry2.f(this.C());
                    if (!(Math.abs(d6) <= d7)) continue;
                    d5 = CryptographicEnumRegistry.TOP.f(metricsCalculationEngine) - CryptographicEnumRegistry.TOP.f(this.C());
                    if (d5 > 0.0) {
                        d4 = CryptographicEnumRegistry.BOTTOM.f(this.C());
                        d3 = CryptographicEnumRegistry.TOP.f(metricsCalculationEngine);
                    } else {
                        d4 = CryptographicEnumRegistry.BOTTOM.f(metricsCalculationEngine);
                        d3 = CryptographicEnumRegistry.TOP.f(this.C());
                    }
                    d2 = cryptographicEnumRegistry.f(metricsCalculationEngine);
                    geometricCalculator1649 = new GeometricCalculator1649(cryptographicEnumRegistry.f(metricsCalculationEngine), d4, cryptographicEnumRegistry2.f(this.C()), d3, cryptographicEnumRegistry, cryptographicEnumRegistry2, d2);
                    try {
                        try {
                            if (!(geometricCalculator1649.p() < d8)) continue;
                            if (geometricCalculator16492 == null) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeContextMediator.c(customSystemException);
                        }
                        if (!(geometricCalculator1649.p() < geometricCalculator16492.p())) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeContextMediator.c(customSystemException);
                    }
                }
                geometricCalculator16492 = geometricCalculator1649;
            }
        }
        for (CryptographicEnumRegistry cryptographicEnumRegistry : CryptographicEnumRegistry.s()) {
            for (CryptographicEnumRegistry cryptographicEnumRegistry2 : CryptographicEnumRegistry.s()) {
                block17: {
                    d6 = cryptographicEnumRegistry.f(metricsCalculationEngine) - cryptographicEnumRegistry2.f(this.C());
                    if (!(Math.abs(d6) <= d7)) continue;
                    d5 = CryptographicEnumRegistry.LEFT.f(metricsCalculationEngine) - CryptographicEnumRegistry.LEFT.f(this.C());
                    if (d5 > 0.0) {
                        d4 = CryptographicEnumRegistry.RIGHT.f(this.C());
                        d3 = CryptographicEnumRegistry.LEFT.f(metricsCalculationEngine);
                    } else {
                        d4 = CryptographicEnumRegistry.RIGHT.f(metricsCalculationEngine);
                        d3 = CryptographicEnumRegistry.LEFT.f(this.C());
                    }
                    d2 = cryptographicEnumRegistry.f(metricsCalculationEngine);
                    geometricCalculator1649 = new GeometricCalculator1649(d4, cryptographicEnumRegistry.f(metricsCalculationEngine), d3, cryptographicEnumRegistry2.f(this.C()), cryptographicEnumRegistry, cryptographicEnumRegistry2, d2);
                    try {
                        try {
                            if (!(geometricCalculator1649.L() < d8)) continue;
                            if (geometricCalculator16493 == null) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeContextMediator.c(customSystemException);
                        }
                        if (!(geometricCalculator1649.L() < geometricCalculator16493.L())) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeContextMediator.c(customSystemException);
                    }
                }
                geometricCalculator16493 = geometricCalculator1649;
            }
        }
        return new GeometricCalculator1649[]{geometricCalculator16492, geometricCalculator16493};
    }

    private static MethodHandle e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e8' || c == '\u00ce' || c == 'r' || c == 'R') {
                field = RuntimeContextMediator.s(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = RuntimeContextMediator.t(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'H' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public RuntimeContextMediator(Class<T> clazz) {
        long l = ab ^ 0xB60506449C4L;
        super(clazz.getName());
        this.tr = (int)RuntimeContextMediator.e("w", (int)25719, (long)(0x7719ABF324BAFC8DL ^ l));
        this.tg = new RenderStyleController((String)((Object)RuntimeContextMediator.k("H", (int)RuntimeContextMediator.e("w", (int)24425, (long)(0x184E57A139F8C792L ^ l)), (long)-5756312425328247036L, (long)l)), RuntimeContextMediator.M.g);
        this.tR = new RenderStyleController((String)((Object)RuntimeContextMediator.k("H", (int)RuntimeContextMediator.e("w", (int)30255, (long)(0x55BDB9B8454C6ED7L ^ l)), (long)-5756312425328247036L, (long)l)), 0.7, RuntimeContextMediator.M.g);
        this.tD = false;
        this.tv = -1.0;
        this.tw = -1.0;
        this.tI = -1.0;
        this.tN = -1.0;
        this.t8 = new ResourceAllocationTracker1227(0, 0);
        this.tS = (ReflectionMetadataExtractor1376)TemporalMetadataResolver.h.U().K(clazz);
        this.Q(RuntimeContextMediator.M.W);
        this.b(30.0);
        this.M(10.0);
        this.Y(true);
        this.N(false);
        this.Q(RuntimeContextMediator.M.E);
        this.d().m(false);
        this.d().f((String)((Object)RuntimeContextMediator.k("H", (int)RuntimeContextMediator.e("w", (int)25180, (long)(0x64078AAA08EAFAA2L ^ l)), (long)-5756312425328247036L, (long)l)));
        int n = (int)Math.floor(76.5);
        this.tK = AuthenticationStateTracker.w(this.tS, (String)((Object)RuntimeContextMediator.k("H", (int)RuntimeContextMediator.e("w", (int)24370, (long)(0x32B752E988F347CBL ^ l)), (long)-5756312425328247036L, (long)l)), true);
        ((ContextualExecutionFramework)this.tS).Y().add(0, this.tK);
        this.tg.Q(new Color(RuntimeContextMediator.M.g.getRed(), RuntimeContextMediator.M.g.getGreen(), RuntimeContextMediator.M.g.getBlue(), n));
        this.tR.Q(new Color(RuntimeContextMediator.M.W.getRed(), RuntimeContextMediator.M.W.getGreen(), RuntimeContextMediator.M.W.getBlue(), n));
        this.tg.N(new ProtocolNegotiator(this));
        this.tR.N(new CommunicationProtocolHandler(this));
        this.tZ = new DataCompressionEngine<RenderStyleController>(this.tR);
        GraphicalRenderingController.s7.B(this.tZ);
        this.o(this.tg, this.tR);
    }

    public void V(boolean bl) {
        this.tD = bl;
    }

    public Color s(Color color) {
        return this.u(color, 40);
    }

    private static CallSite k(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                RuntimeContextMediator.ab = MultiContainerRegistry.a(702783946418915211L, -820868444905843901L, MethodHandles.lookup().lookupClass()).a(51065321930821L);
                RuntimeContextMediator.Gb = new Object[5];
                RuntimeContextMediator.Hb = new String[5];
                RuntimeContextMediator.eb();
                RuntimeContextMediator.ub = new HashMap<K, V>(13);
                RuntimeContextMediator.h(0);
                var0 = RuntimeContextMediator.ab ^ 138589488593882L;
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
                var6_5 = "\u00b7bd\t<hD+<\u009fM\u0010\u00c3\u00f6\u00dc\u00d1\u00cc\u001e\u00dc\u00ba\u0017\u000f\u0095\u0087";
                var7_6 = "\u00b7bd\t<hD+<\u009fM\u0010\u00c3\u00f6\u00dc\u00d1\u00cc\u001e\u00dc\u00ba\u0017\u000f\u0095\u0087".length();
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
                    var6_5 = "\tv\u000ed\n\u008bJN\u00f4\u00c8Ex@\u00dd\u00eb\u0018";
                    var7_6 = "\tv\u000ed\n\u008bJN\u00f4\u00c8Ex@\u00dd\u00eb\u0018".length();
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
        RuntimeContextMediator.lb = var8_3;
        RuntimeContextMediator.tb = new Integer[5];
    }

    public void z() {
        for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.J()) {
            if (!(cipherSessionManager instanceof RuntimeContextMediator)) continue;
            RuntimeContextMediator runtimeContextMediator = (RuntimeContextMediator)cipherSessionManager;
            runtimeContextMediator.V(false);
        }
    }

    public boolean R() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.tK.s().booleanValue() || !(this.b() > 0.0)) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeContextMediator.c(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeContextMediator.c(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public T t() {
        return this.tS;
    }

    private static Field i(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public DataCompressionEngine<RenderStyleController> V() {
        return this.tZ;
    }

    private static Field s(long l, long l2) {
        int n = RuntimeContextMediator.q(l, l2);
        Object object = Gb[n];
        if (object instanceof String) {
            String string = Hb[n];
            int n2 = string.indexOf(8);
            Class clazz = RuntimeContextMediator.r(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = RuntimeContextMediator.r(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = RuntimeContextMediator.i(clazz3, string2, clazz2)) != null) {
                    RuntimeContextMediator.Gb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = RuntimeContextMediator.j(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        RuntimeContextMediator.Gb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = RuntimeContextMediator.r(227830009847531L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public void u() {
        try {
            if (this.R()) {
                this.t8.Z((int)this.w() * 2, (int)this.b() * 2);
                this.t8.q((int)this.G(), (int)this.W(), 6.0f, 4.0f);
                ConfigurationManager.S(this.G(), this.W(), this.w(), this.b(), this.b());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeContextMediator.c(customSystemException);
        }
        try {
            if (this.l()) {
                this.V(false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeContextMediator.c(customSystemException);
        }
        this.V();
    }

    private static Method j(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = RuntimeContextMediator.i(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = RuntimeContextMediator.j(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field j(Class clazz, String string, Class clazz2) {
        Field field = RuntimeContextMediator.i(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = RuntimeContextMediator.j(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public MetricsCalculationEngine C() {
        MetricsCalculationEngine metricsCalculationEngine = super.C();
        metricsCalculationEngine.q(metricsCalculationEngine.t() + 20.0);
        metricsCalculationEngine.o(this.c());
        return metricsCalculationEngine;
    }

    public static int N() {
        return t6;
    }

    public static boolean I() {
        return GraphicalRenderingController.I();
    }

    private static CustomSystemException c(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public float L() {
        block4: {
            try {
                try {
                    if (RuntimeContextMediator.I() || GraphicalRenderingController.K.P) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeContextMediator.c(customSystemException);
                }
                return 0.4f;
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeContextMediator.c(customSystemException);
            }
        }
        return 1.0f;
    }

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
        block11: {
            try {
                if (!RuntimeContextMediator.I()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeContextMediator.c(customSystemException);
            }
            try {
                try {
                    if (this.tD || !userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.LEFT_CLICK)) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeContextMediator.c(customSystemException);
                }
                this.z();
                this.tD = true;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeContextMediator.c(customSystemException);
            }
        }
        if (userInteractionEventDispatcher.getAction().equals((Object)CipherConfigurationMode.LEFT_CLICK)) {
            this.Ob = GraphicsBufferAllocator.b();
            MetricsCalculationEngine metricsCalculationEngine = new MetricsCalculationEngine(this.G(), this.W(), this.w(), this.b());
            try {
                if (metricsCalculationEngine.O(this.Ob.X, this.Ob.I)) {
                    this.Od = true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeContextMediator.c(customSystemException);
            }
            this.Y(false);
        }
    }

    private void O() {
        block11: {
            try {
                if (!this.tD) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeContextMediator.c(customSystemException);
            }
            try {
                try {
                    if (this.tI != -1.0 && this.tN != -1.0) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeContextMediator.c(customSystemException);
                }
                this.tI = (double)GraphicsBufferAllocator.b().X - this.G();
                this.tN = (double)GraphicsBufferAllocator.b().I - this.W();
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeContextMediator.c(customSystemException);
            }
        }
        for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.J()) {
            if (!(cipherSessionManager instanceof RuntimeContextMediator) || !cipherSessionManager.f()) continue;
            try {
                if (cipherSessionManager.equals(this)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeContextMediator.c(customSystemException);
            }
            MetricsCalculationEngine metricsCalculationEngine = cipherSessionManager.C();
            MetricsCalculationEngine metricsCalculationEngine2 = new MetricsCalculationEngine(metricsCalculationEngine.K() - 2.0, metricsCalculationEngine.q() - 2.0, metricsCalculationEngine.t() + 4.0, metricsCalculationEngine.V() + 4.0);
            this.B(metricsCalculationEngine2);
        }
        GeometricCalculator1575 geometricCalculator1575 = ApplicationLifecycleManager.P();
        this.B(new MetricsCalculationEngine((double)geometricCalculator1575.s() / 2.0, 0.0, 20.0, geometricCalculator1575.Z()));
    }

    static DataCompressionEngine a(RuntimeContextMediator runtimeContextMediator) {
        return runtimeContextMediator.tZ;
    }

    private static Class r(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = RuntimeContextMediator.q(l, l2);
            object = Gb[n];
            try {
                if (!(object instanceof String)) break block2;
                RuntimeContextMediator.Gb[n] = clazz = Class.forName(Hb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public double e() {
        return 50.0;
    }

    public static int U() {
        int n = RuntimeContextMediator.N();
        try {
            if (n == 0) {
                return 38;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeContextMediator.c(customSystemException);
        }
        return 0;
    }

    public Color A() {
        return this.s(Color.WHITE);
    }

    public boolean l() {
        return this.tD;
    }

    public abstract void V();

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = RuntimeContextMediator.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public double z() {
        return 30.0;
    }

    public static void h(int n) {
        t6 = n;
    }

    public Color b() {
        int n = 102;
        return this.s(new Color(RuntimeContextMediator.M.W.getRed(), RuntimeContextMediator.M.W.getGreen(), RuntimeContextMediator.M.W.getBlue(), n));
    }

    static boolean z(RuntimeContextMediator runtimeContextMediator, boolean bl) {
        runtimeContextMediator.tD = bl;
        return runtimeContextMediator.tD;
    }

    public void Z() {
        this.tg.N(true);
        this.tg.b(this.G() + this.w() + 2.0);
        this.tg.M(this.W() - 0.25);
        this.tg.w(13.0);
        this.tg.T(13.0);
        this.tR.N(true);
        this.tR.b(this.G() + this.w() + 2.0);
        this.tR.M(this.W() + this.tg.b() + 2.0);
        this.tR.w(13.0);
        this.tR.T(13.0);
        for (double d2 = this.G() - 2.0; d2 < this.G() + this.w() + 4.0 + this.tg.w(); d2 += 2.0) {
            ConfigurationManager.r(d2, this.W() - 3.5, 1.0, 1.0f, RuntimeContextMediator.M.u);
            ConfigurationManager.r(d2, this.W() + this.c() + 3.5, 1.0, 1.0f, RuntimeContextMediator.M.u);
        }
        for (double d3 = this.W() - 2.0; d3 < this.W() + this.c() + 4.0; d3 += 2.0) {
            ConfigurationManager.T(this.G() - 2.0, d3, 1.0, 1.0f, RuntimeContextMediator.M.u);
            ConfigurationManager.T(this.G() + this.w() + 2.0 + this.tg.w() + 2.0, d3, 1.0, 1.0f, RuntimeContextMediator.M.u);
        }
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = RuntimeContextMediator.e(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Exception decompiling
     */
    private void B(MetricsCalculationEngine var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[TRYBLOCK]], but top level block is 17[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(RuntimeContextMediator.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(RuntimeContextMediator.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

