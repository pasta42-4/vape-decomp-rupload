/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.indexing.metadata;

import a._Y;
import a.a;
import com.adapter.management.GenericAdapterManager;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.events.GenericEventDispatcher2175;
import com.app.streaming.StreamProcessor2644;
import com.app.validation.DataValidator;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.deobfuscation.mapping.GenericComponentMapper;
import com.event.dispatch.EventDispatchController1028;
import com.event.dynamic.DynamicEventOrchestrator;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.rendering.GraphicRenderBuffer;
import com.math.geometry.GeometryCalculator;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionLifecycleHandler;
import com.network.statefulgw.StatefulCommunicationController;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.dynamic.ReflectiveMethodInvoker;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.RuntimeResourceTracker;
import com.transaction.management.TransactionOrchestrator1017;
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
import org.lwjgl.opengl.GL11;

public class MetadataIndexingService
extends ContextualExecutionFramework {
    public final NumericPrecisionTransformer t;
    private int l;
    private static final long b;
    private static final long[] e;
    private final GenericComponentMapper<StatefulCommunicationController> j;
    NetworkConfigManager h;
    public final AuthenticationStateTracker G;
    private final GenericComponentMapper<GenericEventDispatcher2175> o;
    private final GenericComponentMapper<ReflectiveMethodInvoker> d;
    private static final Map r;
    public final AuthenticationStateTracker x;
    private final GenericComponentMapper<DynamicEventOrchestrator> F;
    private static final Integer[] n;
    private static final String[] w;
    private static final Object[] v;
    public final NumericPrecisionTransformer m;
    private final GenericAdapterManager V;

    public boolean G() {
        return this.x.s();
    }

    @DataExchangeProtocol2090
    public void E(EventTriggerEngine eventTriggerEngine) {
        block20: {
            block21: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                int[] nArray;
                block19: {
                    int n;
                    block17: {
                        block18: {
                            block16: {
                                block15: {
                                    long l = b ^ 0x11C20631EA97L;
                                    nArray = ConnectionLifecycleHandler.W();
                                    try {
                                        try {
                                            n = GeometryCalculator.C();
                                            if (nArray == null) break block15;
                                            if (n != 13) break block16;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw MetadataIndexingService.a(customSystemException);
                                        }
                                        n = this.E() ? 1 : 0;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MetadataIndexingService.a(customSystemException);
                                    }
                                }
                                try {
                                    if (nArray == null) break block17;
                                    if (n != 0) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MetadataIndexingService.a(customSystemException);
                                }
                            }
                            return;
                        }
                        try {
                            systemConfigurationOrchestrator = eventTriggerEngine.getThePlayer();
                            if (nArray == null) break block19;
                            n = systemConfigurationOrchestrator.Y() ? 1 : 0;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MetadataIndexingService.a(customSystemException);
                        }
                    }
                    if (n != 0) {
                        return;
                    }
                    systemConfigurationOrchestrator = eventTriggerEngine.getThePlayer();
                }
                LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.K();
                try {
                    try {
                        try {
                            if (nArray == null) break block20;
                            if (!lightweightExecutionContext.r()) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MetadataIndexingService.a(customSystemException);
                        }
                        if (!RuntimeResourceTracker.a(lightweightExecutionContext.C())) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataIndexingService.a(customSystemException);
                    }
                    this.l = eventTriggerEngine.getThePlayer().R();
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataIndexingService.a(customSystemException);
                }
            }
            eventTriggerEngine.getThePlayer().U(10);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = MetadataIndexingService.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = MetadataIndexingService.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public String t() {
        try {
            if (this.V.J() == this.d) {
                return this.d.c().t();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetadataIndexingService.a(customSystemException);
        }
        try {
            if (this.V.J() == this.F) {
                return this.F.c().t();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetadataIndexingService.a(customSystemException);
        }
        return this.H();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = MetadataIndexingService.a(l, l2);
            object = v[n];
            try {
                if (!(object instanceof String)) break block2;
                MetadataIndexingService.v[n] = clazz = Class.forName(w[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (w[n4] != null) {
            return n4;
        }
        Object object = v[n4];
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
                n3 = 60;
                break;
            }
            case 2: {
                n3 = 51;
                break;
            }
            case 3: {
                n3 = 9;
                break;
            }
            case 4: {
                n3 = 22;
                break;
            }
            case 5: {
                n3 = 48;
                break;
            }
            case 6: {
                n3 = 35;
                break;
            }
            case 7: {
                n3 = 61;
                break;
            }
            case 8: {
                n3 = 43;
                break;
            }
            case 9: {
                n3 = 34;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 63;
                break;
            }
            case 14: {
                n3 = 37;
                break;
            }
            case 15: {
                n3 = 12;
                break;
            }
            case 16: {
                n3 = 49;
                break;
            }
            case 17: {
                n3 = 23;
                break;
            }
            case 18: {
                n3 = 13;
                break;
            }
            case 19: {
                n3 = 25;
                break;
            }
            case 20: {
                n3 = 58;
                break;
            }
            case 21: {
                n3 = 36;
                break;
            }
            case 22: {
                n3 = 29;
                break;
            }
            case 23: {
                n3 = 24;
                break;
            }
            case 24: {
                n3 = 18;
                break;
            }
            case 25: {
                n3 = 56;
                break;
            }
            case 26: {
                n3 = 3;
                break;
            }
            case 27: {
                n3 = 11;
                break;
            }
            case 28: {
                n3 = 40;
                break;
            }
            case 29: {
                n3 = 5;
                break;
            }
            case 30: {
                n3 = 32;
                break;
            }
            case 31: {
                n3 = 42;
                break;
            }
            case 32: {
                n3 = 31;
                break;
            }
            case 33: {
                n3 = 57;
                break;
            }
            case 34: {
                n3 = 6;
                break;
            }
            case 35: {
                n3 = 50;
                break;
            }
            case 36: {
                n3 = 46;
                break;
            }
            case 37: {
                n3 = 44;
                break;
            }
            case 38: {
                n3 = 33;
                break;
            }
            case 39: {
                n3 = 19;
                break;
            }
            case 40: {
                n3 = 0;
                break;
            }
            case 41: {
                n3 = 8;
                break;
            }
            case 42: {
                n3 = 10;
                break;
            }
            case 43: {
                n3 = 27;
                break;
            }
            case 44: {
                n3 = 47;
                break;
            }
            case 45: {
                n3 = 17;
                break;
            }
            case 46: {
                n3 = 14;
                break;
            }
            case 47: {
                n3 = 7;
                break;
            }
            case 48: {
                n3 = 2;
                break;
            }
            case 49: {
                n3 = 16;
                break;
            }
            case 50: {
                n3 = 26;
                break;
            }
            case 51: {
                n3 = 53;
                break;
            }
            case 52: {
                n3 = 21;
                break;
            }
            case 53: {
                n3 = 38;
                break;
            }
            case 54: {
                n3 = 59;
                break;
            }
            case 55: {
                n3 = 39;
                break;
            }
            case 56: {
                n3 = 20;
                break;
            }
            case 57: {
                n3 = 55;
                break;
            }
            case 58: {
                n3 = 15;
                break;
            }
            case 59: {
                n3 = 41;
                break;
            }
            case 60: {
                n3 = 54;
                break;
            }
            case 61: {
                n3 = 52;
                break;
            }
            case 62: {
                n3 = 4;
                break;
            }
            default: {
                n3 = 28;
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
        MetadataIndexingService.w[n4] = new String(cArray);
        return n4;
    }

    private static Method d(long l, long l2) {
        int n = MetadataIndexingService.a(l, l2);
        Object object = v[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = w[n];
                int n3 = string2.indexOf(8);
                clazz3 = MetadataIndexingService.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = MetadataIndexingService.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = MetadataIndexingService.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        MetadataIndexingService.v[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = MetadataIndexingService.b(221003589763306L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = MetadataIndexingService.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        MetadataIndexingService.v[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = MetadataIndexingService.b(221003589763306L, 0L);
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

    @DataExchangeProtocol2090
    public void x(EventDispatchController1028 eventDispatchController1028) {
        block19: {
            block18: {
                MetadataIndexingService metadataIndexingService;
                int n;
                block16: {
                    int[] nArray;
                    block17: {
                        block14: {
                            block15: {
                                block13: {
                                    block12: {
                                        long l = b ^ 0x10FF07E25137L;
                                        nArray = ConnectionLifecycleHandler.W();
                                        try {
                                            try {
                                                n = GeometryCalculator.C();
                                                if (nArray == null) break block12;
                                                if (n != 13) break block13;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw MetadataIndexingService.a(customSystemException);
                                            }
                                            n = this.E() ? 1 : 0;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw MetadataIndexingService.a(customSystemException);
                                        }
                                    }
                                    try {
                                        if (nArray == null) break block14;
                                        if (n != 0) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MetadataIndexingService.a(customSystemException);
                                    }
                                }
                                return;
                            }
                            n = eventDispatchController1028.getThePlayer().Y() ? 1 : 0;
                        }
                        try {
                            if (nArray == null) break block16;
                            if (n == 0) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MetadataIndexingService.a(customSystemException);
                        }
                        return;
                    }
                    try {
                        metadataIndexingService = this;
                        if (nArray == null) break block18;
                        n = metadataIndexingService.l;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataIndexingService.a(customSystemException);
                    }
                }
                try {
                    if (n == -1) break block19;
                    eventDispatchController1028.getThePlayer().U(this.l);
                    metadataIndexingService = this;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataIndexingService.a(customSystemException);
                }
            }
            metadataIndexingService.l = -1;
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B83;
        if (MetadataIndexingService.n[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])r.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AQ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MetadataIndexingService.n[n2] = n3;
        }
        return MetadataIndexingService.n[n2];
    }

    @DataExchangeProtocol2090
    public void R(DataValidator dataValidator) {
        block7: {
            block6: {
                try {
                    try {
                        if (GeometryCalculator.C() == 15 && this.E()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataIndexingService.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataIndexingService.a(customSystemException);
                }
            }
            try {
                if (!dataValidator.getThePlayer().r() || dataValidator.getThePlayer().R() <= 0) break block7;
            }
            catch (CustomSystemException customSystemException) {
                throw MetadataIndexingService.a(customSystemException);
            }
            GL11.glPopMatrix();
            float f = dataValidator.K;
            float f2 = ApplicationLifecycleManager.U().B(ApplicationLifecycleManager.K().h());
            GL11.glTranslatef((float)0.56f, (float)-0.52f, (float)-0.71999997f);
            GL11.glTranslatef((float)0.0f, (float)(f * -0.6f), (float)0.0f);
            GL11.glRotatef((float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f);
            float f3 = AdaptiveComputationEngine.D(f2 * f2 * (float)Math.PI);
            float f4 = AdaptiveComputationEngine.D(AdaptiveComputationEngine.l(f2) * (float)Math.PI);
            GL11.glRotatef((float)(f3 * -20.0f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(f4 * -20.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)(f4 * -80.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScalef((float)0.4f, (float)0.4f, (float)0.4f);
            return;
        }
        GL11.glTranslatef((float)-0.5f, (float)0.2f, (float)0.0f);
        GL11.glRotatef((float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00dd' || c == 't' || c == 'T' || c == '\u00d4') {
                field = MetadataIndexingService.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00dd' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'T' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = MetadataIndexingService.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void U(StreamProcessor2644 streamProcessor2644) {
        block9: {
            block8: {
                try {
                    try {
                        if (GeometryCalculator.C() == 15 && this.E()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataIndexingService.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataIndexingService.a(customSystemException);
                }
            }
            try {
                try {
                    if (!streamProcessor2644.getThePlayer().r() || streamProcessor2644.getThePlayer().R() <= 0) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataIndexingService.a(customSystemException);
                }
                GL11.glPushMatrix();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw MetadataIndexingService.a(customSystemException);
            }
        }
        float f = ApplicationLifecycleManager.U().B(ApplicationLifecycleManager.K().h());
        float f2 = -0.4f * AdaptiveComputationEngine.D(AdaptiveComputationEngine.l(f) * (float)Math.PI);
        float f3 = 0.2f * AdaptiveComputationEngine.D(AdaptiveComputationEngine.l(f) * (float)Math.PI * 2.0f);
        float f4 = -0.2f * AdaptiveComputationEngine.D(f * (float)Math.PI);
        GL11.glTranslatef((float)(-f2), (float)(-f3), (float)(-f4));
    }

    public boolean L() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!this.Z() || !this.q().I()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataIndexingService.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataIndexingService.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public MetadataIndexingService() {
        long l = b ^ 0x56CA8881A05L;
        super(a.cs((int)MetadataIndexingService.a("q", (int)32668, (long)(0x10918677488E04AEL ^ l))), (int)MetadataIndexingService.a("q", (int)27456, (long)(0x5F4D77B78C431063L ^ l)), RecursiveNodeGraph.X, a.cs((int)MetadataIndexingService.a("q", (int)18270, (long)(0x3F6677E806F3BC77L ^ l))));
        this.d = new ReflectiveMethodInvoker(this, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)1932, (long)(0x7365E30608367CA3L ^ l)), (long)1198655667181276025L, (long)l))).w();
        this.j = new StatefulCommunicationController(this, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)26871, (long)(0x718BE6213C3713DCL ^ l)), (long)1198655667181276025L, (long)l))).w();
        this.o = new GraphicRenderBuffer(this, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)13259, (long)(0x7590D21A1D4E48EAL ^ l)), (long)1198655667181276025L, (long)l))).w();
        this.F = new DynamicEventOrchestrator(this, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)12215, (long)(0x33DBE3A2C42E5491L ^ l)), (long)1198655667181276025L, (long)l))).w();
        this.x = AuthenticationStateTracker.R(this, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)8989, (long)(0x6705C09CAA6B5837L ^ l)), (long)1198655667181276025L, (long)l)), true, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)16451, (long)(0x73CC751B1C7EBB63L ^ l)), (long)1198655667181276025L, (long)l)));
        this.G = AuthenticationStateTracker.R(this, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)14366, (long)(0x42087B42120AC33BL ^ l)), (long)1198655667181276025L, (long)l)), true, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)29162, (long)(0x76FB23CDB2C00AC6L ^ l)), (long)1198655667181276025L, (long)l)));
        this.t = NumericPrecisionTransformer.b(this, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)29839, (long)(0x4526FA95B8D10FA2L ^ l)), (long)1198655667181276025L, (long)l)), (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)11047, (long)(0x429F2ED041EE5003L ^ l)), (long)1198655667181276025L, (long)l)), "", 0.0, 90.0, 360.0, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)27783, (long)(0x52D5DD5FCA5B17A5L ^ l)), (long)1198655667181276025L, (long)l)));
        this.m = NumericPrecisionTransformer.b(this, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)7064, (long)(0x577EC0B69B2460B0L ^ l)), (long)1198655667181276025L, (long)l)), (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)30808, (long)(0x617A05D660778368L ^ l)), (long)1198655667181276025L, (long)l)), "", 0.0, 5.0, 6.0, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)2920, (long)(0x1C1CDEE49BB2704FL ^ l)), (long)1198655667181276025L, (long)l)));
        this.V = GenericAdapterManager.D(this, (String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)20615, (long)(0x4FF865B9D151ABA9L ^ l)), (long)1198655667181276025L, (long)l)), this.d, this.d, this.j, this.o, this.F);
        this.h = new NetworkConfigManager();
        this.V.R((String)((Object)MetadataIndexingService.c("\u00f2", (int)MetadataIndexingService.a("q", (int)15247, (long)(0x3F560A349974C0BEL ^ l)), (long)1198655667181276025L, (long)l)));
        this.x.l(this.G);
        this.V.s(this.F, this.G);
        this.V.s(this.F, this.t);
        this.V.s(this.F, this.m);
        this.N(this.V, this.x, this.G, this.t, this.m);
    }

    @Override
    public String H() {
        return this.V.p();
    }

    public TransactionOrchestrator1017 T() {
        return this.j(90.0, 5.0);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = MetadataIndexingService.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = MetadataIndexingService.a(l, l2);
        Object object = v[n];
        if (object instanceof String) {
            String string = w[n];
            int n2 = string.indexOf(8);
            Class clazz = MetadataIndexingService.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = MetadataIndexingService.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = MetadataIndexingService.a(clazz3, string2, clazz2)) != null) {
                    MetadataIndexingService.v[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = MetadataIndexingService.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        MetadataIndexingService.v[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = MetadataIndexingService.b(221003589763306L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = MetadataIndexingService.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = MetadataIndexingService.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = v;
        v[0] = "T\u0004T";
        objectArray[1] = Integer.TYPE;
        MetadataIndexingService.w[1] = "java/lang/Integer";
        objectArray[2] = "I\u001ad\bQnB\u0015uG,vQ\u0012|\u000e";
        objectArray[3] = "l\r_^I<g\u0002N\u0011(2l\tJK";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Y1%Ka\u0002\u000b;:\"wDdfm\u001fwR\u001d=e\u0019l?^f'\u001dzZ\u001c62N\u001c";
    }

    public boolean x() {
        return this.q().y();
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MetadataIndexingService.b = MultiContainerRegistry.a(-3388392820122123631L, 168444685434411148L, MethodHandles.lookup().lookupClass()).a(85933013446734L);
                MetadataIndexingService.v = new Object[5];
                MetadataIndexingService.w = new String[5];
                MetadataIndexingService.a();
                MetadataIndexingService.r = new HashMap<K, V>(13);
                var0 = MetadataIndexingService.b ^ 51768326347641L;
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
                var8_3 = new long[19];
                var5_4 = 0;
                var6_5 = "r\u00cf\u00ae^\u00e2\u00ee\u009e\u00ae\n\u00b3\u00e9\u00c70 y\u00dd\u0011n\u00a0\u00f3h\u00b3\u00c4\u008bgec\u00db\u00ce//e\u001aK\u00c1\u00dc6\u00fa\u00d4d/\u0086Dm\u00ce\u00bc\u00135\u0090_\u0000n\u0014/\u00cb\u00841\u00f6!\u008b\u00aa\u00a5\u008f\u0007\\\u00c0\u0006\u00ac8\u00ab\u00d7\u00c17m\u0007\u00ee,\u000f\u00c4\u001e\u0015\u0098\u00a9\u0011\u009b=\u00fdvY\bZx/\u001b8\u0007@\u00a2~M\u0013y\u00b7\u00e6.\u00cf\u008c6\u00b6\u00bd\u00dd\u008eT\u00fd.D\u0001\u001as9\u0099K\\Q\u0003a\u00f7\u0000:4\u00c1\u00cd\u00b4#\u000bF";
                var7_6 = "r\u00cf\u00ae^\u00e2\u00ee\u009e\u00ae\n\u00b3\u00e9\u00c70 y\u00dd\u0011n\u00a0\u00f3h\u00b3\u00c4\u008bgec\u00db\u00ce//e\u001aK\u00c1\u00dc6\u00fa\u00d4d/\u0086Dm\u00ce\u00bc\u00135\u0090_\u0000n\u0014/\u00cb\u00841\u00f6!\u008b\u00aa\u00a5\u008f\u0007\\\u00c0\u0006\u00ac8\u00ab\u00d7\u00c17m\u0007\u00ee,\u000f\u00c4\u001e\u0015\u0098\u00a9\u0011\u009b=\u00fdvY\bZx/\u001b8\u0007@\u00a2~M\u0013y\u00b7\u00e6.\u00cf\u008c6\u00b6\u00bd\u00dd\u008eT\u00fd.D\u0001\u001as9\u0099K\\Q\u0003a\u00f7\u0000:4\u00c1\u00cd\u00b4#\u000bF".length();
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
                    var6_5 = "Ts\u008e\u00f2\u00d2&V[\u00f9/\u00d5\u00b5_\u00e6\u00e8=";
                    var7_6 = "Ts\u008e\u00f2\u00d2&V[\u00f9/\u00d5\u00b5_\u00e6\u00e8=".length();
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
        MetadataIndexingService.e = var8_3;
        MetadataIndexingService.n = new Integer[19];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public TransactionOrchestrator1017 j(double d2, double d3) {
        TransactionOrchestrator1017 transactionOrchestrator1017 = _Y.u(d3, d2 / 2.0);
        try {
            if (transactionOrchestrator1017 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetadataIndexingService.a(customSystemException);
        }
        try {
            if (_Y.a(ApplicationLifecycleManager.U(), transactionOrchestrator1017, d3, d2 / 2.0, true)) {
                return transactionOrchestrator1017;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetadataIndexingService.a(customSystemException);
        }
        return null;
    }

    private boolean E() {
        return false;
    }

    public boolean n() {
        boolean bl;
        block8: {
            block7: {
                try {
                    if (ApplicationLifecycleManager.X().r()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataIndexingService.a(customSystemException);
                }
                try {
                    try {
                        if (!ApplicationLifecycleManager.U().K().r() || !RuntimeResourceTracker.a(ApplicationLifecycleManager.U().K().C())) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetadataIndexingService.a(customSystemException);
                    }
                    bl = true;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetadataIndexingService.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MetadataIndexingService.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public GenericEventDispatcher2175 q() {
        return (GenericEventDispatcher2175)((GenericComponentMapper)this.V.J()).c();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MetadataIndexingService.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(MetadataIndexingService.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

