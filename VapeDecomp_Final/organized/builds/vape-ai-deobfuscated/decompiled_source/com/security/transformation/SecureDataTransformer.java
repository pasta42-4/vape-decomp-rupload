/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
package com.security.transformation;

import a.Ne;
import a.Qh;
import a.a;
import a.tl;
import com.auth.tracking.AuthenticationStateTracker;
import com.client.event.ClientEventOrchestrator;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationPipeline;
import com.event.communication.EventBroadcastRegistry;
import com.exception.system.CustomSystemException;
import com.game.rendering.EntityRenderEvent;
import com.google.common.collect.Lists;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.color.ColorCompositionEngine;
import com.graphics.rendering.RenderEventDispatcher;
import com.math.geometry.GeometryCalculator;
import com.minecraft.render.MinecraftRenderContextManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.adaptive.AdaptiveRenderingEngine;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.rendering.context.RenderContextManager;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.flow.TransactionFlowController;
import com.transaction.management.TransactionOrchestrator1017;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class SecureDataTransformer
extends ContextualExecutionFramework {
    private static final long[] d;
    private static final Object[] j;
    private static final String[] m;
    private boolean F;
    private TransactionOrchestrator1017 w;
    private static final Map h;
    private final AdaptiveRenderingEngine r;
    private final AuthenticationStateTracker Z;
    private final AuthenticationStateTracker K;
    private static final Integer[] e;
    private final AdaptiveRenderingEngine l;
    private int x;
    private final AuthenticationStateTracker B;
    private static final long b;

    @DataExchangeProtocol2090
    public void n(MinecraftRenderContextManager minecraftRenderContextManager) {
        block13: {
            long l;
            block11: {
                block12: {
                    block10: {
                        l = b ^ 0x2AEE9321B7FAL;
                        try {
                            try {
                                if (!TemporalMetadataResolver.h.a().P(minecraftRenderContextManager.getEntityPlayer()) || !this.B.s().booleanValue()) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SecureDataTransformer.a(customSystemException);
                            }
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureDataTransformer.a(customSystemException);
                        }
                    }
                    try {
                        if (!this.Z.s().booleanValue()) break block11;
                        if (this.w == null) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureDataTransformer.a(customSystemException);
                    }
                    Qh qh = minecraftRenderContextManager.getEntityPlayer();
                    qh.I(false);
                    this.w = null;
                }
                return;
            }
            try {
                try {
                    if (!minecraftRenderContextManager.getEntityPlayer().B(ReflectionMetadataResolver.UQ) || minecraftRenderContextManager.getEntityPlayer().B(ReflectionMetadataResolver.rl)) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureDataTransformer.a(customSystemException);
                }
                Ne.h.z((int)SecureDataTransformer.a("d", (int)23298, (long)(0xC839CFFAA04DCE8L ^ l)));
                GL11.glPolygonOffset((float)1.0f, (float)2500000.0f);
            }
            catch (CustomSystemException customSystemException) {
                throw SecureDataTransformer.a(customSystemException);
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SecureDataTransformer.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureDataTransformer.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == 'W' || c == 'L' || c == '\u00f5') {
                field = SecureDataTransformer.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'L' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureDataTransformer.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ca' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "OJ1";
        objectArray[1] = Integer.TYPE;
        SecureDataTransformer.m[1] = "java/lang/Integer";
        objectArray[2] = "wZ\u0000\u001c)e|U\u0011ST}oR\u0018\u001a";
        objectArray[3] = "M<)Dt\u0013F38\u000b\u0015\u001dM8<Q";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001c+\rtp'\u00129S\nz0s)\u00017k2\u0010i\u0001;\u0011r\u001d-\rzn6J>W\n";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureDataTransformer.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureDataTransformer.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @DataExchangeProtocol2090
    public void K(RenderContextManager renderContextManager) {
        ColorCompositionEngine colorCompositionEngine;
        long l;
        block50: {
            block56: {
                block55: {
                    block49: {
                        block53: {
                            block48: {
                                DataTransformationPipeline dataTransformationPipeline;
                                block52: {
                                    block51: {
                                        block47: {
                                            l = b ^ 0x56BAFF9BB1ACL;
                                            if (!this.B.s().booleanValue()) break block47;
                                            try {
                                                if (!TemporalMetadataResolver.h.a().P(renderContextManager.getEntityPlayer())) break block47;
                                                return;
                                                catch (Exception exception) {
                                                    throw SecureDataTransformer.a(exception);
                                                }
                                            }
                                            catch (Exception exception) {
                                                throw SecureDataTransformer.a(exception);
                                            }
                                        }
                                        try {
                                            if (DynamicContextBroker.U(renderContextManager.getEntityPlayer())) {
                                                return;
                                            }
                                        }
                                        catch (Exception exception) {
                                            throw SecureDataTransformer.a(exception);
                                        }
                                        dataTransformationPipeline = TemporalMetadataResolver.h.U().K(DataTransformationPipeline.class);
                                        if (this.F) return;
                                        if (this.x == 3) return;
                                        break block51;
                                        catch (Exception exception) {
                                            throw SecureDataTransformer.a(exception);
                                        }
                                    }
                                    if (!dataTransformationPipeline.Z()) break block48;
                                    break block52;
                                    catch (Exception exception) {
                                        throw SecureDataTransformer.a(exception);
                                    }
                                }
                                try {
                                    if (!dataTransformationPipeline.a()) break block48;
                                    return;
                                    catch (Exception exception) {
                                        throw SecureDataTransformer.a(exception);
                                    }
                                }
                                catch (Exception exception) {
                                    throw SecureDataTransformer.a(exception);
                                }
                            }
                            if (this.Z.s().booleanValue()) break block49;
                            if (!renderContextManager.getEntityPlayer().B(ReflectionMetadataResolver.UQ)) return;
                            break block53;
                            catch (Exception exception) {
                                throw SecureDataTransformer.a(exception);
                            }
                        }
                        try {
                            block54: {
                                if (renderContextManager.getEntityPlayer().B(ReflectionMetadataResolver.rl)) return;
                                break block54;
                                catch (Exception exception) {
                                    throw SecureDataTransformer.a(exception);
                                }
                            }
                            Ne.h.y((int)SecureDataTransformer.a("d", (int)18909, (long)(0x6DDD2C1433254860L ^ l)));
                            GL11.glPolygonOffset((float)1.0f, (float)-2500000.0f);
                            return;
                        }
                        catch (Exception exception) {
                            throw SecureDataTransformer.a(exception);
                        }
                    }
                    if (!renderContextManager.getEntityPlayer().r()) return;
                    if (!renderContextManager.getRenderer().r()) return;
                    break block55;
                    catch (Exception exception) {
                        throw SecureDataTransformer.a(exception);
                    }
                }
                if (renderContextManager.getEntityPlayer().B(ReflectionMetadataResolver.rl)) return;
                break block56;
                catch (Exception exception) {
                    throw SecureDataTransformer.a(exception);
                }
            }
            try {
                block57: {
                    if (GeometryCalculator.C() != 13) break block50;
                    break block57;
                    catch (Exception exception) {
                        throw SecureDataTransformer.a(exception);
                    }
                }
                renderContextManager.setCanceled(true);
            }
            catch (Exception exception) {
                throw SecureDataTransformer.a(exception);
            }
        }
        Qh qh = renderContextManager.getEntityPlayer();
        double d2 = renderContextManager.getX();
        double d3 = renderContextManager.getY();
        double d4 = renderContextManager.getZ();
        float f = qh.A() + (qh.q() - qh.A()) * renderContextManager.getPartialTicks();
        try {
            CryptoContextNegotiator684.Y();
            GraphicsBufferAllocator.V();
            Ne.h.z(2929);
            Ne.h.z(3553);
            tl.P();
            colorCompositionEngine = this.K.s() != false ? this.r.L() : this.l.L();
        }
        catch (Exception exception) {
            throw SecureDataTransformer.a(exception);
        }
        GraphicsBufferAllocator.Y(colorCompositionEngine);
        ArrayList arrayList = null;
        if (GeometryCalculator.C() > 13) {
            arrayList = Lists.newArrayList(renderContextManager.getRenderer().W());
            renderContextManager.getRenderer().W().clear();
        }
        try {
            this.F = true;
            this.x = 1;
            renderContextManager.getRenderer().u(qh, d2, d3, d4, f, renderContextManager.getPartialTicks());
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            this.F = false;
            Ne.h.y(2929);
            Ne.h.y(3553);
            if (GeometryCalculator.C() == 13) {
                this.x = (int)SecureDataTransformer.a("d", (int)21227, (long)(0x1BF54155046D355L ^ l));
                GL11.glPushMatrix();
                Ne.h.y(2896);
                renderContextManager.getRenderer().u(qh, d2, d3, d4, f, renderContextManager.getPartialTicks());
                GL11.glDepthMask((boolean)false);
                Ne.h.z(2896);
                GL11.glPopMatrix();
            }
        }
        catch (Exception exception) {
            throw SecureDataTransformer.a(exception);
        }
        this.F = true;
        GraphicsBufferAllocator.Y(this.l.L());
        Ne.h.z(3553);
        try {
            this.x = (int)SecureDataTransformer.a("d", (int)8601, (long)(0x4C50A7C84BED2029L ^ l));
            renderContextManager.getRenderer().u(qh, d2, d3, d4, f, renderContextManager.getPartialTicks());
            this.F = false;
        }
        catch (Exception exception) {
            // empty catch block
        }
        try {
            if (GeometryCalculator.C() > 13) {
                renderContextManager.getRenderer().m(arrayList);
            }
        }
        catch (Exception exception) {
            throw SecureDataTransformer.a(exception);
        }
        try {
            Ne.h.y(3553);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            tl.T();
            GraphicsBufferAllocator.E();
            GL11.glPopMatrix();
            this.x = -1;
            if (!qh.R()) {
                this.w = qh;
                qh.I(true);
            }
        }
        catch (Exception exception) {
            throw SecureDataTransformer.a(exception);
        }
        try {
            if (GeometryCalculator.C() < 35) return;
            TransactionFlowController.g().D().E(false);
            return;
        }
        catch (Exception exception) {
            throw SecureDataTransformer.a(exception);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecureDataTransformer.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureDataTransformer.j[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = SecureDataTransformer.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(long l, long l2) {
        int n = SecureDataTransformer.a(l, l2);
        Object object = j[n];
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
                clazz3 = SecureDataTransformer.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecureDataTransformer.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureDataTransformer.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureDataTransformer.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureDataTransformer.b(216938733760001L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureDataTransformer.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureDataTransformer.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureDataTransformer.b(216938733760001L, 0L);
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
        int n = SecureDataTransformer.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureDataTransformer.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureDataTransformer.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureDataTransformer.a(clazz3, string2, clazz2)) != null) {
                    SecureDataTransformer.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureDataTransformer.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureDataTransformer.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureDataTransformer.b(216938733760001L, 0L);
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
        if (m[n4] != null) {
            return n4;
        }
        Object object = j[n4];
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
                n3 = 43;
                break;
            }
            case 2: {
                n3 = 15;
                break;
            }
            case 3: {
                n3 = 1;
                break;
            }
            case 4: {
                n3 = 33;
                break;
            }
            case 5: {
                n3 = 29;
                break;
            }
            case 6: {
                n3 = 24;
                break;
            }
            case 7: {
                n3 = 26;
                break;
            }
            case 8: {
                n3 = 51;
                break;
            }
            case 9: {
                n3 = 59;
                break;
            }
            case 10: {
                n3 = 46;
                break;
            }
            case 11: {
                n3 = 47;
                break;
            }
            case 12: {
                n3 = 22;
                break;
            }
            case 13: {
                n3 = 8;
                break;
            }
            case 14: {
                n3 = 14;
                break;
            }
            case 15: {
                n3 = 5;
                break;
            }
            case 16: {
                n3 = 42;
                break;
            }
            case 17: {
                n3 = 11;
                break;
            }
            case 18: {
                n3 = 9;
                break;
            }
            case 19: {
                n3 = 12;
                break;
            }
            case 20: {
                n3 = 32;
                break;
            }
            case 21: {
                n3 = 63;
                break;
            }
            case 22: {
                n3 = 16;
                break;
            }
            case 23: {
                n3 = 38;
                break;
            }
            case 24: {
                n3 = 18;
                break;
            }
            case 25: {
                n3 = 55;
                break;
            }
            case 26: {
                n3 = 54;
                break;
            }
            case 27: {
                n3 = 35;
                break;
            }
            case 28: {
                n3 = 0;
                break;
            }
            case 29: {
                n3 = 49;
                break;
            }
            case 30: {
                n3 = 31;
                break;
            }
            case 31: {
                n3 = 48;
                break;
            }
            case 32: {
                n3 = 28;
                break;
            }
            case 33: {
                n3 = 6;
                break;
            }
            case 34: {
                n3 = 53;
                break;
            }
            case 35: {
                n3 = 50;
                break;
            }
            case 36: {
                n3 = 3;
                break;
            }
            case 37: {
                n3 = 20;
                break;
            }
            case 38: {
                n3 = 10;
                break;
            }
            case 39: {
                n3 = 56;
                break;
            }
            case 40: {
                n3 = 58;
                break;
            }
            case 41: {
                n3 = 60;
                break;
            }
            case 42: {
                n3 = 62;
                break;
            }
            case 43: {
                n3 = 4;
                break;
            }
            case 44: {
                n3 = 19;
                break;
            }
            case 45: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 27;
                break;
            }
            case 47: {
                n3 = 17;
                break;
            }
            case 48: {
                n3 = 44;
                break;
            }
            case 49: {
                n3 = 2;
                break;
            }
            case 50: {
                n3 = 40;
                break;
            }
            case 51: {
                n3 = 23;
                break;
            }
            case 52: {
                n3 = 57;
                break;
            }
            case 53: {
                n3 = 52;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 34;
                break;
            }
            case 56: {
                n3 = 41;
                break;
            }
            case 57: {
                n3 = 30;
                break;
            }
            case 58: {
                n3 = 36;
                break;
            }
            case 59: {
                n3 = 37;
                break;
            }
            case 60: {
                n3 = 21;
                break;
            }
            case 61: {
                n3 = 25;
                break;
            }
            case 62: {
                n3 = 7;
                break;
            }
            default: {
                n3 = 13;
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
        SecureDataTransformer.m[n4] = new String(cArray);
        return n4;
    }

    @DataExchangeProtocol2090
    public void e(RenderEventDispatcher renderEventDispatcher) {
        try {
            if (!this.F) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer.a(customSystemException);
        }
        try {
            if (renderEventDispatcher.getWorld().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer.a(customSystemException);
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = renderEventDispatcher.getThePlayer();
        CryptographicTransformer cryptographicTransformer = renderEventDispatcher.getEntity();
        try {
            if (cryptographicTransformer.equals(systemConfigurationOrchestrator)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer.a(customSystemException);
        }
        renderEventDispatcher.setCanceled(true);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5E6;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/AS", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            SecureDataTransformer.e[n2] = n3;
        }
        return e[n2];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                SecureDataTransformer.b = MultiContainerRegistry.a(8470207519003515366L, 2257698225499392525L, MethodHandles.lookup().lookupClass()).a(245890943875930L);
                SecureDataTransformer.j = new Object[5];
                SecureDataTransformer.m = new String[5];
                SecureDataTransformer.a();
                SecureDataTransformer.h = new HashMap<K, V>(13);
                var0 = SecureDataTransformer.b ^ 62670909456413L;
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
                var8_3 = new long[15];
                var5_4 = 0;
                var6_5 = "\u00b6l\u00e6M\u0005\u00c4(98rw\u0082\u00e1\u00cb\u0016|\u009fm ,\u008a\u0000\u0081\u00f6\u001a4\u009e\u0006bChN\u001d\r~\u00d5\u00fc\u00b5\u00c9^ \u00a3\u001a\u00d4\u00ca\u00d7\u00f8x\u0082\u00ac\u00ac\u00da\u00a7%\u008er\u001d\u00ba[*G\u00ff\u0093\u00ba]\u00d0i\u00d9\u008b\u007fX&0\u0084&!i*\u0012\u00a2'\u0019\u0002\u00d5\u00e1 \u00fa\u001b\u00c0\u00ae\u00e6C@s\u00a3\u00c3 \u00e5+\u00c1B\u0093x\u00fd";
                var7_6 = "\u00b6l\u00e6M\u0005\u00c4(98rw\u0082\u00e1\u00cb\u0016|\u009fm ,\u008a\u0000\u0081\u00f6\u001a4\u009e\u0006bChN\u001d\r~\u00d5\u00fc\u00b5\u00c9^ \u00a3\u001a\u00d4\u00ca\u00d7\u00f8x\u0082\u00ac\u00ac\u00da\u00a7%\u008er\u001d\u00ba[*G\u00ff\u0093\u00ba]\u00d0i\u00d9\u008b\u007fX&0\u0084&!i*\u0012\u00a2'\u0019\u0002\u00d5\u00e1 \u00fa\u001b\u00c0\u00ae\u00e6C@s\u00a3\u00c3 \u00e5+\u00c1B\u0093x\u00fd".length();
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
                    var6_5 = "\u00fa\u00f4\u00b5\r\u00fd\u001b\u009b\u00e1Np\u0013\"\u008a-)\u00d3";
                    var7_6 = "\u00fa\u00f4\u00b5\r\u00fd\u001b\u009b\u00e1Np\u0013\"\u008a-)\u00d3".length();
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
        SecureDataTransformer.d = var8_3;
        SecureDataTransformer.e = new Integer[15];
    }

    @DataExchangeProtocol2090
    public void v(EventBroadcastRegistry eventBroadcastRegistry) {
        block15: {
            block16: {
                ColorCompositionEngine colorCompositionEngine;
                block18: {
                    block17: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (!eventBroadcastRegistry.getEntity().B(ReflectionMetadataResolver.UQ) || eventBroadcastRegistry.getEntity().B(ReflectionMetadataResolver.rl)) break block15;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw SecureDataTransformer.a(customSystemException);
                                            }
                                            if (!this.Z.s().booleanValue()) break block15;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw SecureDataTransformer.a(customSystemException);
                                        }
                                        if (!this.F) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw SecureDataTransformer.a(customSystemException);
                                    }
                                    if (this.x != 1) break block16;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw SecureDataTransformer.a(customSystemException);
                                }
                                if (!this.K.s().booleanValue()) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw SecureDataTransformer.a(customSystemException);
                            }
                            colorCompositionEngine = this.r.L();
                            break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureDataTransformer.a(customSystemException);
                        }
                    }
                    colorCompositionEngine = this.l.L();
                }
                GraphicsBufferAllocator.Y(colorCompositionEngine);
            }
            try {
                if (this.x == 2) {
                    GraphicsBufferAllocator.Y(this.l.L());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw SecureDataTransformer.a(customSystemException);
            }
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @DataExchangeProtocol2090
    public void B(EntityRenderEvent entityRenderEvent) {
        block4: {
            block5: {
                try {
                    try {
                        if (!this.F) break block4;
                        if (!ApplicationLifecycleManager.c().Y()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureDataTransformer.a(customSystemException);
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw SecureDataTransformer.a(customSystemException);
                }
            }
            entityRenderEvent.setResult(0);
            entityRenderEvent.setCanceled(true);
        }
    }

    public SecureDataTransformer() {
        long l = b ^ 0x2E8B04025B3CL;
        super(a.cs((int)SecureDataTransformer.a("d", (int)25410, (long)(0xB927B55E3AA8860L ^ l))), (int)SecureDataTransformer.a("d", (int)9160, (long)(0x11D358904063C8EDL ^ l)), RecursiveNodeGraph.z, a.cs((int)SecureDataTransformer.a("d", (int)31352, (long)(0x4F9B69AD37019159L ^ l))));
        this.B = AuthenticationStateTracker.R(this, (String)((Object)SecureDataTransformer.c("\u00e1", (int)SecureDataTransformer.a("d", (int)25134, (long)(0x609902909D588901L ^ l)), (long)7983485801008858292L, (long)l)), false, (String)((Object)SecureDataTransformer.c("\u00e1", (int)SecureDataTransformer.a("d", (int)28173, (long)(0x19CAAE3D06C8527L ^ l)), (long)7983485801008858292L, (long)l)));
        this.Z = AuthenticationStateTracker.R(this, (String)((Object)SecureDataTransformer.c("\u00e1", (int)SecureDataTransformer.a("d", (int)3523, (long)(0x61986FDB3D966E5L ^ l)), (long)7983485801008858292L, (long)l)), false, (String)((Object)SecureDataTransformer.c("\u00e1", (int)SecureDataTransformer.a("d", (int)16695, (long)(0x44D715112689AA10L ^ l)), (long)7983485801008858292L, (long)l)));
        this.l = AdaptiveRenderingEngine.C(this, (String)((Object)SecureDataTransformer.c("\u00e1", (int)SecureDataTransformer.a("d", (int)2577, (long)(0x26DBD12C0A7AE139L ^ l)), (long)7983485801008858292L, (long)l)), new Color(255, 0, 0));
        this.K = AuthenticationStateTracker.R(this, (String)((Object)SecureDataTransformer.c("\u00e1", (int)SecureDataTransformer.a("d", (int)27920, (long)(0x41E6ED9D8E628634L ^ l)), (long)7983485801008858292L, (long)l)), true, (String)((Object)SecureDataTransformer.c("\u00e1", (int)SecureDataTransformer.a("d", (int)16148, (long)(0x7600708D6185D43FL ^ l)), (long)7983485801008858292L, (long)l)));
        this.r = AdaptiveRenderingEngine.C(this, (String)((Object)SecureDataTransformer.c("\u00e1", (int)SecureDataTransformer.a("d", (int)9295, (long)(0x179B1BE255C2CF66L ^ l)), (long)7983485801008858292L, (long)l)), new Color(255, 255, 0));
        this.N(new ConfigurationProfileResolver[]{this.B, this.Z.l(new ConfigurationProfileResolver[]{this.l, this.K.l(this.r)}), this.l, this.K, this.r});
    }

    @DataExchangeProtocol2090
    public void D(ClientEventOrchestrator clientEventOrchestrator) {
        try {
            if (clientEventOrchestrator.getClientPlayer().B(ReflectionMetadataResolver.rl)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer.a(customSystemException);
        }
        try {
            if (!this.F) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer.a(customSystemException);
        }
        try {
            if (ApplicationLifecycleManager.c().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataTransformer.a(customSystemException);
        }
        clientEventOrchestrator.setCanceled(true);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecureDataTransformer.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/AS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureDataTransformer.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(SecureDataTransformer.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

