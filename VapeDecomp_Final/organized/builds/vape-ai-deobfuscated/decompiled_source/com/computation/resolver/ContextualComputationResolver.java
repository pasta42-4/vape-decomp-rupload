/*
 * Decompiled with CFR 0.152.
 */
package com.computation.resolver;

import a.E8;
import a.Ne;
import a.Qh;
import a.a;
import a.tl;
import a.z6;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.analytics.computation.NumericComputationEngine1000;
import com.app.workflow.StateTrackingCoordinator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationEngine1209;
import com.event.core.EventDispatchCoordinator1159;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.computation.NumericComputationEngine1131;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.ui.configuration.DisplayConfigurationManager;
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

public class ContextualComputationResolver
extends ContextualExecutionFramework {
    private final NumericPrecisionTransformer L;
    private static final Map j;
    private static final String[] m;
    private final Map<CryptographicTransformer, double[]> n;
    private final AuthenticationStateTracker h;
    private final AdaptiveRenderingEngine K;
    private static final Object[] l;
    private static final long b;
    private static final long[] d;
    private static final Integer[] e;
    private final AuthenticationStateTracker T;

    @DataExchangeProtocol2090
    public void G(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        this.n.clear();
        CryptoContextNegotiator684.Y();
        for (Object e : ApplicationLifecycleManager.c().L()) {
            CryptographicTransformer cryptographicTransformer = new CryptographicTransformer(e);
            if (!this.X(cryptographicTransformer)) continue;
            double d2 = cryptographicTransformer.b() + (cryptographicTransformer.F() - cryptographicTransformer.b()) * (double)eventDispatchRegistry2111.getTicks() - NumericComputationEngine1131.b();
            double d3 = cryptographicTransformer.q() + (cryptographicTransformer.V() - cryptographicTransformer.q()) * (double)eventDispatchRegistry2111.getTicks() - NumericComputationEngine1131.S();
            double d4 = cryptographicTransformer.I() + (cryptographicTransformer.B() - cryptographicTransformer.I()) * (double)eventDispatchRegistry2111.getTicks() - NumericComputationEngine1131.n();
            double[] dArray = CryptoContextNegotiator684.E(d2, d3, d4);
            this.n.put(cryptographicTransformer, dArray);
        }
        CryptoContextNegotiator684.J();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ContextualComputationResolver.a(l, l2);
            object = ContextualComputationResolver.l[n];
            try {
                if (!(object instanceof String)) break block2;
                ContextualComputationResolver.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'R' || c == 'a' || c == '\u00d1' || c == '\u00c8') {
                field = ContextualComputationResolver.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'a' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ContextualComputationResolver.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ContextualComputationResolver.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private float P(double d2, double d3, double d4, double d5) {
        return (float)Math.toDegrees(Math.atan2(d5 - d4, d3 - d2));
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field c(long l, long l2) {
        int n = ContextualComputationResolver.a(l, l2);
        Object object = ContextualComputationResolver.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = ContextualComputationResolver.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ContextualComputationResolver.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ContextualComputationResolver.a(clazz3, string2, clazz2)) != null) {
                    ContextualComputationResolver.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ContextualComputationResolver.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ContextualComputationResolver.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ContextualComputationResolver.b(223746085245253L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private boolean D(double d2, double d3, int n, int n2) {
        boolean bl;
        block9: {
            block8: {
                try {
                    try {
                        try {
                            try {
                                if (!(d2 > 0.0) || !(d3 > 0.0)) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw ContextualComputationResolver.a(customSystemException);
                            }
                            if (!(d2 < (double)(n / 2))) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ContextualComputationResolver.a(customSystemException);
                        }
                        if (!(d3 < (double)(n2 / 2))) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualComputationResolver.a(customSystemException);
                    }
                    bl = true;
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualComputationResolver.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean X(CryptographicTransformer cryptographicTransformer) {
        boolean bl;
        try {
            if (NumericComputationEngine1000.n()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualComputationResolver.a(customSystemException);
        }
        try {
            if (!cryptographicTransformer.B(ReflectionMetadataResolver.UQ)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualComputationResolver.a(customSystemException);
        }
        try {
            if (cryptographicTransformer.B(ReflectionMetadataResolver.rl)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualComputationResolver.a(customSystemException);
        }
        Qh qh = new Qh(cryptographicTransformer.M());
        try {
            if (TemporalMetadataResolver.h.a().P(qh)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualComputationResolver.a(customSystemException);
        }
        try {
            if (TemporalMetadataResolver.h.a().i(qh)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualComputationResolver.a(customSystemException);
        }
        try {
            bl = !TemporalMetadataResolver.h.j().Q(qh.e());
        }
        catch (CustomSystemException customSystemException) {
            throw ContextualComputationResolver.a(customSystemException);
        }
        return bl;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ContextualComputationResolver.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ContextualComputationResolver.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "\u000em\u0015";
        objectArray[1] = Integer.TYPE;
        ContextualComputationResolver.m[1] = "java/lang/Integer";
        objectArray[2] = "\u0011>Y\u0011M\u0000\u001a1H^0\u0018\t6A\u0017";
        objectArray[3] = "\r\u0006qP4Q\u0006\t`\u001fU_\r\u0002dE";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "]\f\u0012dE\rF\u0000neUkI\fRc\u0012\u0002O\u000f\u0011\u000e\u0017\rIR\u0007bK\u0005J\u001bn";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n4] != null) {
            return n4;
        }
        Object object = ContextualComputationResolver.l[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 45;
                break;
            }
            case 1: {
                n3 = 57;
                break;
            }
            case 2: {
                n3 = 61;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 4: {
                n3 = 13;
                break;
            }
            case 5: {
                n3 = 29;
                break;
            }
            case 6: {
                n3 = 52;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 46;
                break;
            }
            case 9: {
                n3 = 5;
                break;
            }
            case 10: {
                n3 = 0;
                break;
            }
            case 11: {
                n3 = 7;
                break;
            }
            case 12: {
                n3 = 28;
                break;
            }
            case 13: {
                n3 = 36;
                break;
            }
            case 14: {
                n3 = 3;
                break;
            }
            case 15: {
                n3 = 22;
                break;
            }
            case 16: {
                n3 = 10;
                break;
            }
            case 17: {
                n3 = 34;
                break;
            }
            case 18: {
                n3 = 50;
                break;
            }
            case 19: {
                n3 = 38;
                break;
            }
            case 20: {
                n3 = 14;
                break;
            }
            case 21: {
                n3 = 26;
                break;
            }
            case 22: {
                n3 = 43;
                break;
            }
            case 23: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 11;
                break;
            }
            case 25: {
                n3 = 41;
                break;
            }
            case 26: {
                n3 = 39;
                break;
            }
            case 27: {
                n3 = 30;
                break;
            }
            case 28: {
                n3 = 32;
                break;
            }
            case 29: {
                n3 = 33;
                break;
            }
            case 30: {
                n3 = 20;
                break;
            }
            case 31: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 40;
                break;
            }
            case 33: {
                n3 = 12;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 42;
                break;
            }
            case 36: {
                n3 = 53;
                break;
            }
            case 37: {
                n3 = 60;
                break;
            }
            case 38: {
                n3 = 58;
                break;
            }
            case 39: {
                n3 = 31;
                break;
            }
            case 40: {
                n3 = 27;
                break;
            }
            case 41: {
                n3 = 44;
                break;
            }
            case 42: {
                n3 = 37;
                break;
            }
            case 43: {
                n3 = 54;
                break;
            }
            case 44: {
                n3 = 51;
                break;
            }
            case 45: {
                n3 = 63;
                break;
            }
            case 46: {
                n3 = 17;
                break;
            }
            case 47: {
                n3 = 16;
                break;
            }
            case 48: {
                n3 = 19;
                break;
            }
            case 49: {
                n3 = 55;
                break;
            }
            case 50: {
                n3 = 8;
                break;
            }
            case 51: {
                n3 = 2;
                break;
            }
            case 52: {
                n3 = 4;
                break;
            }
            case 53: {
                n3 = 6;
                break;
            }
            case 54: {
                n3 = 21;
                break;
            }
            case 55: {
                n3 = 59;
                break;
            }
            case 56: {
                n3 = 18;
                break;
            }
            case 57: {
                n3 = 23;
                break;
            }
            case 58: {
                n3 = 35;
                break;
            }
            case 59: {
                n3 = 62;
                break;
            }
            case 60: {
                n3 = 48;
                break;
            }
            case 61: {
                n3 = 25;
                break;
            }
            case 62: {
                n3 = 47;
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
        ContextualComputationResolver.m[n4] = new String(cArray);
        return n4;
    }

    @DataExchangeProtocol2090
    public void W(DisplayConfigurationManager displayConfigurationManager) {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        long l;
        block22: {
            l = b ^ 0x15C3B53A2CA1L;
            systemConfigurationOrchestrator = displayConfigurationManager.getThePlayer();
            try {
                try {
                    if (!systemConfigurationOrchestrator.Y() && !displayConfigurationManager.getWorld().Y()) break block22;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualComputationResolver.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw ContextualComputationResolver.a(customSystemException);
            }
        }
        int n = ApplicationLifecycleManager.e();
        int n2 = ApplicationLifecycleManager.b();
        float f = (float)n / 4.0f;
        float f2 = (float)n2 / 4.0f;
        ConfigurationManager.F(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Color.WHITE);
        E8 e8 = displayConfigurationManager.getFontRenderer();
        for (CryptographicTransformer cryptographicTransformer : this.n.keySet()) {
            Object object;
            Object object2;
            int n3;
            double d2;
            double d3;
            float f3;
            block24: {
                int n4;
                int n5;
                int n6;
                int n7;
                int n8;
                Color color;
                Color color2;
                int n9;
                float f4;
                double[] dArray = this.n.get(cryptographicTransformer);
                double d4 = dArray[0];
                double d5 = (double)ApplicationLifecycleManager.b() - dArray[1];
                try {
                    try {
                        if (dArray[2] < 1.0 && this.D(d4 / 2.0, d5 / 2.0, n, n2)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ContextualComputationResolver.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualComputationResolver.a(customSystemException);
                }
                try {
                    f4 = this.P(f, d4 / 2.0, f2, d5 / 2.0);
                    n9 = dArray[2] > 1.0 ? 180 : 0;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualComputationResolver.a(customSystemException);
                }
                f3 = f4 + (float)n9;
                double d6 = (double)f * (Double)this.L.J();
                double d7 = (double)f2 * (Double)this.L.J();
                d3 = Math.sqrt(1.0 / (1.0 / (d6 * d6) + Math.pow(Math.tan(Math.toRadians(f3)), 2.0) / (d7 * d7)));
                d2 = Math.tan(Math.toRadians(f3)) * d3;
                float f5 = AdaptiveComputationEngine.v(f3 + 90.0f);
                if (f5 < 0.0f) {
                    d3 = -d3;
                    if (f5 > -180.0f) {
                        d2 = -d2;
                    }
                }
                if ((n3 = (int)((double)systemConfigurationOrchestrator.y(cryptographicTransformer) * 1.5)) > 255) {
                    n3 = 255;
                }
                try {
                    if (!this.h.s().booleanValue() || n3 >= 255) break block24;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualComputationResolver.a(customSystemException);
                }
                Ne.h.z();
                GraphicsBufferAllocator.V();
                object2 = (int)systemConfigurationOrchestrator.y(cryptographicTransformer) + (String)((Object)ContextualComputationResolver.c("\u00c4", (int)ContextualComputationResolver.a("h", (int)29856, (long)(0x4528AA889F489CDAL ^ l)), (long)-6897489923180137312L, (long)l));
                try {
                    Color color3;
                    Ne.h.m(d3 + (double)((float)n / 4.0f), d2 + (double)((float)n2 / 4.0f), 0.0);
                    Ne.h.x(0.5, 0.5, 0.0);
                    tl.N();
                    color2 = color3;
                    color = color3;
                    n8 = 255;
                    n7 = 255;
                    n6 = 255;
                    n5 = 255;
                    n4 = this.T.s() != false ? n3 : 0;
                }
                catch (CustomSystemException customSystemException) {
                    throw ContextualComputationResolver.a(customSystemException);
                }
                color2(n8, n7, n6, n5 - n4);
                Color color4 = color;
                if (ConfigurationManager.U()) {
                    object = DataTransformationEngine1209.i();
                    ((DataTransformationEngine1209)object).g();
                    ((DataTransformationEngine1209)object).C(z6.D.i().B());
                    e8.I((String)object2, (float)(-e8.L((String)object2)) / 2.0f, -e8.s((String)object2), EventDispatchCoordinator1159.S(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha()), (DataTransformationEngine1209)object);
                } else {
                    e8.m((String)object2, (float)(-e8.L((String)object2)) / 2.0f, -e8.s((String)object2), EventDispatchCoordinator1159.S(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha()));
                }
                tl.j();
                GraphicsBufferAllocator.E();
                Ne.h.X();
            }
            Ne.h.z();
            GraphicsBufferAllocator.V();
            Ne.h.m(d3 + (double)((float)n / 4.0f), d2 + (double)((float)n2 / 4.0f), 0.0);
            Ne.h.f(f3 - 90.0f, 0.0f, 0.0f, 1.0f);
            Ne.h.x(0.375, 0.5, 0.0);
            object2 = this.K.L();
            int n10 = ((Color)object2).getAlpha();
            if (this.T.s().booleanValue()) {
                n10 = 255 - n3;
            }
            object = new Color(((Color)object2).getRed(), ((Color)object2).getGreen(), ((Color)object2).getBlue(), n10);
            StateTrackingCoordinator.d((Color)object, -16.0f, 0.0f, (String)((Object)ContextualComputationResolver.c("\u00c4", (int)ContextualComputationResolver.a("h", (int)4066, (long)(0x6E713BD9F31EE79FL ^ l)), (long)-6897489923180137312L, (long)l)), 1.0f, false);
            GraphicsBufferAllocator.E();
            Ne.h.X();
        }
        this.n.clear();
    }

    public ContextualComputationResolver() {
        long l = b ^ 0x2464E9CC7361L;
        super(a.cs((int)ContextualComputationResolver.a("h", (int)18699, (long)(0x587301FED3BFFEB4L ^ l))), (int)ContextualComputationResolver.a("h", (int)4605, (long)(0x408C1D60EDC6A645L ^ l)), RecursiveNodeGraph.z, a.cs((int)ContextualComputationResolver.a("h", (int)2724, (long)(0x2BF2AD72C5363D1FL ^ l))));
        this.K = AdaptiveRenderingEngine.C(this, (String)((Object)ContextualComputationResolver.c("\u00c4", (int)ContextualComputationResolver.a("h", (int)21233, (long)(0x1814BFC26976546L ^ l)), (long)-34057566817047712L, (long)l)), new Color(255, 0, 0));
        this.h = AuthenticationStateTracker.R(this, (String)((Object)ContextualComputationResolver.c("\u00c4", (int)ContextualComputationResolver.a("h", (int)16356, (long)(0x6FABE80227850858L ^ l)), (long)-34057566817047712L, (long)l)), false, (String)((Object)ContextualComputationResolver.c("\u00c4", (int)ContextualComputationResolver.a("h", (int)7005, (long)(0x1D77C9FE03DCACE8L ^ l)), (long)-34057566817047712L, (long)l)));
        this.T = AuthenticationStateTracker.R(this, (String)((Object)ContextualComputationResolver.c("\u00c4", (int)ContextualComputationResolver.a("h", (int)17475, (long)(0x2004EFCD6C1373F2L ^ l)), (long)-34057566817047712L, (long)l)), false, (String)((Object)ContextualComputationResolver.c("\u00c4", (int)ContextualComputationResolver.a("h", (int)6851, (long)(0x22B6E8724112D7DL ^ l)), (long)-34057566817047712L, (long)l)));
        this.L = NumericPrecisionTransformer.N(this, (String)((Object)ContextualComputationResolver.c("\u00c4", (int)ContextualComputationResolver.a("h", (int)19365, (long)(0x38D64AC156037C13L ^ l)), (long)-34057566817047712L, (long)l)), (String)((Object)ContextualComputationResolver.c("\u00c4", (int)ContextualComputationResolver.a("h", (int)15492, (long)(0x5CEF0731D89D8B3DL ^ l)), (long)-34057566817047712L, (long)l)), (String)((Object)ContextualComputationResolver.c("\u00c4", (int)ContextualComputationResolver.a("h", (int)31079, (long)(0x235CDAD014D64ED3L ^ l)), (long)-34057566817047712L, (long)l)), 0.0, 0.5, 1.0, 0.05);
        this.n = new HashMap<CryptographicTransformer, double[]>();
        this.N(this.K, this.L, this.h, this.T);
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
                ContextualComputationResolver.b = MultiContainerRegistry.a(4592719572897191975L, -5861150657267132052L, MethodHandles.lookup().lookupClass()).a(3227094100515L);
                ContextualComputationResolver.l = new Object[5];
                ContextualComputationResolver.m = new String[5];
                ContextualComputationResolver.a();
                ContextualComputationResolver.j = new HashMap<K, V>(13);
                var0 = ContextualComputationResolver.b ^ 56464424441889L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "#\u0082\ra\u00cb,\u001f\u0006-\\\u00f5\u00ad\u00c2n:\u00df\u00d5\u00d9\u00ac\u00d9\\\u00cbv1=\u00ff\u00b6\u00da\u00c9\u00a0lp\u00b1\u00ba\u00d8\u001d\u008c\u0004\u00d6\u00f82ei}\u000b\u0001a\u00be\u00c7\u00a2]\u00a3\t\u00f1\u00ba\u000b\u0012NY\u00f5\u0094\u00b0K\fm\u0011\u00ae\u00d1\u001d\u00e9\u00b2\u00a9x-\u009c\u008a\u008f]\u00f7[\u00c24\u00fdf\u0087\u001b\u00d8\u00f4";
                var7_6 = "#\u0082\ra\u00cb,\u001f\u0006-\\\u00f5\u00ad\u00c2n:\u00df\u00d5\u00d9\u00ac\u00d9\\\u00cbv1=\u00ff\u00b6\u00da\u00c9\u00a0lp\u00b1\u00ba\u00d8\u001d\u008c\u0004\u00d6\u00f82ei}\u000b\u0001a\u00be\u00c7\u00a2]\u00a3\t\u00f1\u00ba\u000b\u0012NY\u00f5\u0094\u00b0K\fm\u0011\u00ae\u00d1\u001d\u00e9\u00b2\u00a9x-\u009c\u008a\u008f]\u00f7[\u00c24\u00fdf\u0087\u001b\u00d8\u00f4".length();
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
                    var6_5 = "\u000b\u00ad\u00fe\u00bf\u007f\u00f1t\u00cc9\u001bw\u0086_Q=T";
                    var7_6 = "\u000b\u00ad\u00fe\u00bf\u007f\u00f1t\u00cc9\u001bw\u0086_Q=T".length();
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
        ContextualComputationResolver.d = var8_3;
        ContextualComputationResolver.e = new Integer[13];
    }

    private static Method d(long l, long l2) {
        int n = ContextualComputationResolver.a(l, l2);
        Object object = ContextualComputationResolver.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = ContextualComputationResolver.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ContextualComputationResolver.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ContextualComputationResolver.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ContextualComputationResolver.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ContextualComputationResolver.b(223746085245253L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ContextualComputationResolver.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ContextualComputationResolver.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ContextualComputationResolver.b(223746085245253L, 0L);
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

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ContextualComputationResolver.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ContextualComputationResolver.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x483B;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
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
                throw new RuntimeException("a/AG", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ContextualComputationResolver.e[n2] = n3;
        }
        return e[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ContextualComputationResolver.a(n, l);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ContextualComputationResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ContextualComputationResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

