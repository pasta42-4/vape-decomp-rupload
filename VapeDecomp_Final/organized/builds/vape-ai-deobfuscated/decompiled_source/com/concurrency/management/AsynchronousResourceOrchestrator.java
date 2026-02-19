/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
package com.concurrency.management;

import a.Ne;
import a.tl;
import com.analytics.computation.NumericComputationEngine1000;
import com.app.context.transformation.ContextTransformationEngine;
import com.client.event.ClientEventOrchestrator;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.transformation.DataTransformationPipeline;
import com.event.communication.EventBroadcastRegistry;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.financial.transaction.TransactionGateway;
import com.game.rendering.EntityRenderEvent;
import com.google.common.collect.Lists;
import com.graphics.color.ColorCompositionEngine;
import com.graphics.rendering.RenderEventDispatcher;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.network.config.ConnectionConfigurationResolver;
import com.network.interceptor.DynamicProtocolInterceptor;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.runtime.context.ContextualExecutionFramework;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.transform.CryptographicTransformer;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
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

public class AsynchronousResourceOrchestrator
extends ContextTransformationEngine<DataTransformationPipeline> {
    private boolean o = false;
    private boolean m;
    private static final long[] e;
    private static final String[] n;
    private static final Integer[] h;
    private boolean z;
    private static final long d;
    private static final Object[] l;
    private static final Map j;
    private int A = 0;
    private boolean P;

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x110C;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
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
                throw new RuntimeException("a/xg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AsynchronousResourceOrchestrator.h[n2] = n3;
        }
        return h[n2];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @DataExchangeProtocol2090
    public void p(ClientEventOrchestrator clientEventOrchestrator) {
        block23: {
            block24: {
                block22: {
                    try {
                        if (NumericComputationEngine1000.n()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                    try {
                        try {
                            if (!TemporalMetadataResolver.h.a().P(clientEventOrchestrator.getClientPlayer()) || !((DataTransformationPipeline)this.n()).r.s().booleanValue()) break block22;
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousResourceOrchestrator.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                }
                try {
                    try {
                        try {
                            if (!((DataTransformationPipeline)this.n()).h.s().booleanValue()) break block23;
                            if (!((DataTransformationPipeline)this.n()).L.s().booleanValue()) break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousResourceOrchestrator.a(customSystemException);
                        }
                        if (TemporalMetadataResolver.h.g().Q(clientEventOrchestrator.getClientPlayer().e())) break block23;
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousResourceOrchestrator.a(customSystemException);
                }
            }
            try {
                if (TemporalMetadataResolver.h.a().G(clientEventOrchestrator.getClientPlayer(), false)) break block23;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousResourceOrchestrator.a(customSystemException);
            }
        }
        try {
            if (clientEventOrchestrator.getWorld().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousResourceOrchestrator.a(customSystemException);
        }
        try {
            if (!this.m) return;
            clientEventOrchestrator.setCanceled(true);
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousResourceOrchestrator.a(customSystemException);
        }
    }

    private static Field c(long l, long l2) {
        int n = AsynchronousResourceOrchestrator.a(l, l2);
        Object object = AsynchronousResourceOrchestrator.l[n];
        if (object instanceof String) {
            String string = AsynchronousResourceOrchestrator.n[n];
            int n2 = string.indexOf(8);
            Class clazz = AsynchronousResourceOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AsynchronousResourceOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AsynchronousResourceOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    AsynchronousResourceOrchestrator.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AsynchronousResourceOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AsynchronousResourceOrchestrator.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AsynchronousResourceOrchestrator.b(212814540507321L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean V() {
        return this.m;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @DataExchangeProtocol2090
    public void T(EntityRenderEvent entityRenderEvent) {
        block23: {
            block24: {
                block22: {
                    try {
                        if (NumericComputationEngine1000.n()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                    try {
                        try {
                            if (!TemporalMetadataResolver.h.a().P(entityRenderEvent.getEntity()) || !((DataTransformationPipeline)this.n()).r.s().booleanValue()) break block22;
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousResourceOrchestrator.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                }
                try {
                    try {
                        try {
                            if (!((DataTransformationPipeline)this.n()).h.s().booleanValue()) break block23;
                            if (!((DataTransformationPipeline)this.n()).L.s().booleanValue()) break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousResourceOrchestrator.a(customSystemException);
                        }
                        if (TemporalMetadataResolver.h.g().Q(entityRenderEvent.getEntity().e())) break block23;
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousResourceOrchestrator.a(customSystemException);
                }
            }
            try {
                if (TemporalMetadataResolver.h.a().G(entityRenderEvent.getEntity(), false)) break block23;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousResourceOrchestrator.a(customSystemException);
            }
        }
        try {
            if (entityRenderEvent.getWorld().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousResourceOrchestrator.a(customSystemException);
        }
        try {
            if (!this.m) return;
            entityRenderEvent.setResult(0);
            entityRenderEvent.setCanceled(true);
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousResourceOrchestrator.a(customSystemException);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AsynchronousResourceOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AsynchronousResourceOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AsynchronousResourceOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AsynchronousResourceOrchestrator.b(classArray[i], string, clazz2);
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
            if (c == '\u00e8' || c == '\u00c5' || c == 'n' || c == '\u00e4') {
                field = AsynchronousResourceOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AsynchronousResourceOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'v' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method d(long l, long l2) {
        int n = AsynchronousResourceOrchestrator.a(l, l2);
        Object object = AsynchronousResourceOrchestrator.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = AsynchronousResourceOrchestrator.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = AsynchronousResourceOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AsynchronousResourceOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AsynchronousResourceOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AsynchronousResourceOrchestrator.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AsynchronousResourceOrchestrator.b(212814540507321L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AsynchronousResourceOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AsynchronousResourceOrchestrator.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AsynchronousResourceOrchestrator.b(212814540507321L, 0L);
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

    public AsynchronousResourceOrchestrator(ContextualExecutionFramework contextualExecutionFramework, String string) {
        super(contextualExecutionFramework, string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @DataExchangeProtocol2090
    public void f(RenderEventDispatcher renderEventDispatcher) {
        block26: {
            block27: {
                block25: {
                    try {
                        if (NumericComputationEngine1000.n()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                    try {
                        try {
                            if (!TemporalMetadataResolver.h.a().P(renderEventDispatcher.getEntity()) || !((DataTransformationPipeline)this.n()).r.s().booleanValue()) break block25;
                            return;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousResourceOrchestrator.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                }
                try {
                    try {
                        try {
                            if (!((DataTransformationPipeline)this.n()).h.s().booleanValue()) break block26;
                            if (!((DataTransformationPipeline)this.n()).L.s().booleanValue()) break block27;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousResourceOrchestrator.a(customSystemException);
                        }
                        if (TemporalMetadataResolver.h.g().Q(renderEventDispatcher.getEntity().e())) break block26;
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousResourceOrchestrator.a(customSystemException);
                }
            }
            try {
                if (TemporalMetadataResolver.h.a().G(renderEventDispatcher.getEntity(), false)) break block26;
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousResourceOrchestrator.a(customSystemException);
            }
        }
        try {
            if (renderEventDispatcher.getWorld().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousResourceOrchestrator.a(customSystemException);
        }
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = renderEventDispatcher.getThePlayer();
        CryptographicTransformer cryptographicTransformer = renderEventDispatcher.getEntity();
        try {
            if (cryptographicTransformer.equals(systemConfigurationOrchestrator)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousResourceOrchestrator.a(customSystemException);
        }
        try {
            if (!this.m) return;
            renderEventDispatcher.setCanceled(true);
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousResourceOrchestrator.a(customSystemException);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @DataExchangeProtocol2090
    public void R(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        boolean bl;
        block38: {
            block37: {
                block33: {
                    try {
                        if (NumericComputationEngine1000.n()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                    try {
                        block34: {
                            try {
                                try {
                                    if (GeometryCalculator.C() > 13) break block33;
                                    if (!this.o) break block34;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AsynchronousResourceOrchestrator.a(customSystemException);
                                }
                                if (this.A >= 10) break block33;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousResourceOrchestrator.a(customSystemException);
                            }
                        }
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                }
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = eventDispatchRegistry2111.getThePlayer();
                ConnectionConfigurationResolver connectionConfigurationResolver = eventDispatchRegistry2111.getWorld();
                DynamicProtocolInterceptor.R();
                int n = GL11.glGenLists((int)1);
                DynamicProtocolInterceptor.F().s();
                GL11.glPushMatrix();
                GraphicsBufferAllocator.V();
                boolean bl2 = GL11.glIsEnabled((int)2929);
                boolean bl3 = GL11.glIsEnabled((int)3042);
                boolean bl4 = GL11.glIsEnabled((int)3553);
                boolean bl5 = GL11.glIsEnabled((int)2896);
                boolean bl6 = GL11.glIsEnabled((int)2848);
                bl = GL11.glIsEnabled((int)3008);
                tl.w();
                DynamicProtocolInterceptor.F().S(true);
                GL11.glNewList((int)n, (int)4864);
                boolean bl7 = false;
                for (Object e : connectionConfigurationResolver.L()) {
                    ColorCompositionEngine colorCompositionEngine;
                    CryptographicTransformer cryptographicTransformer;
                    block35: {
                        block36: {
                            cryptographicTransformer = new CryptographicTransformer(e);
                            colorCompositionEngine = ((DataTransformationPipeline)this.n()).K(eventDispatchRegistry2111.getThePlayer(), cryptographicTransformer);
                            try {
                                if (colorCompositionEngine == null) {
                                    continue;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousResourceOrchestrator.a(customSystemException);
                            }
                            try {
                                try {
                                    try {
                                        if (!((DataTransformationPipeline)this.n()).h.s().booleanValue()) break block35;
                                        if (!((DataTransformationPipeline)this.n()).L.s().booleanValue()) break block36;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                                    }
                                    if (!TemporalMetadataResolver.h.g().Q(cryptographicTransformer.e())) {
                                        continue;
                                    }
                                    break block35;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AsynchronousResourceOrchestrator.a(customSystemException);
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AsynchronousResourceOrchestrator.a(customSystemException);
                            }
                        }
                        try {
                            if (!TemporalMetadataResolver.h.a().G(cryptographicTransformer, false)) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousResourceOrchestrator.a(customSystemException);
                        }
                    }
                    if (cryptographicTransformer.equals(systemConfigurationOrchestrator)) continue;
                    try {
                        if (!cryptographicTransformer.B(ReflectionMetadataResolver.UQ)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                    double d2 = cryptographicTransformer.b();
                    double d3 = cryptographicTransformer.q();
                    double d4 = cryptographicTransformer.I();
                    double d5 = d2 + (cryptographicTransformer.F() - d2) * (double)eventDispatchRegistry2111.getTicks() - NumericComputationEngine1131.b();
                    double d6 = d3 + (cryptographicTransformer.V() - d3) * (double)eventDispatchRegistry2111.getTicks() - NumericComputationEngine1131.S();
                    double d7 = d4 + (cryptographicTransformer.B() - d4) * (double)eventDispatchRegistry2111.getTicks() - NumericComputationEngine1131.n();
                    boolean bl8 = cryptographicTransformer.R();
                    cryptographicTransformer.I(false);
                    GL11.glPushMatrix();
                    GL11.glLineWidth((float)3.0f);
                    Ne.h.y(2848);
                    tl.s();
                    tl.R();
                    tl.P();
                    eventDispatchRegistry2111.getEntityRenderer().H(0.0);
                    TransactionGateway transactionGateway = new TransactionGateway(ApplicationLifecycleManager.r().D(cryptographicTransformer).M());
                    if (transactionGateway.r()) {
                        Object object;
                        this.m = true;
                        ArrayList arrayList = null;
                        if (GeometryCalculator.C() > 13) {
                            object = transactionGateway.W();
                            arrayList = Lists.newArrayList(object);
                            object.clear();
                        }
                        object = GraphicsBufferAllocator.S(colorCompositionEngine.Y());
                        try {
                            Ne.h.q((float)object[0], (float)object[1], (float)object[2], (float)object[3]);
                            transactionGateway.u(cryptographicTransformer, d5, d6, d7, eventDispatchRegistry2111.getTicks(), eventDispatchRegistry2111.getTicks());
                            if (GeometryCalculator.C() > 13) {
                                transactionGateway.m(arrayList);
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AsynchronousResourceOrchestrator.a(customSystemException);
                        }
                        this.m = false;
                    }
                    cryptographicTransformer.I(bl8);
                    tl.T();
                    tl.j();
                    tl.B();
                    eventDispatchRegistry2111.getEntityRenderer().F(1.0);
                    GL11.glPopMatrix();
                }
                try {
                    tl.s();
                    tl.R();
                    tl.P();
                    eventDispatchRegistry2111.getEntityRenderer().H(0.0);
                    GL11.glEndList();
                    GL11.glPolygonMode((int)1032, (int)6913);
                    GL11.glCallList((int)n);
                    GL11.glPolygonMode((int)1032, (int)6912);
                    GL11.glCallList((int)n);
                    DynamicProtocolInterceptor.F().S(false);
                    GL11.glPolygonMode((int)1032, (int)6914);
                    GL11.glCallList((int)n);
                    DynamicProtocolInterceptor.F().C();
                    GL11.glPolygonMode((int)1032, (int)6913);
                    GL11.glCallList((int)n);
                    GL11.glPolygonMode((int)1032, (int)6912);
                    GL11.glCallList((int)n);
                    GL11.glPolygonMode((int)1032, (int)6914);
                    DynamicProtocolInterceptor.F().B();
                    tl.m(2929, bl2);
                    GL11.glDeleteLists((int)n, (int)1);
                    tl.m(2896, bl5);
                    tl.m(3042, bl3);
                    tl.m(3553, bl4);
                    if (!bl6) break block37;
                    Ne.h.y(2848);
                    break block38;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousResourceOrchestrator.a(customSystemException);
                }
            }
            Ne.h.z(2848);
        }
        tl.m(3008, bl);
        eventDispatchRegistry2111.getEntityRenderer().F(1.0);
        GL11.glPopMatrix();
        GraphicsBufferAllocator.E();
    }

    @DataExchangeProtocol2090
    public void i(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        long l = d ^ 0x69825D092DDEL;
        try {
            if (ApplicationLifecycleManager.N().C()) {
                ((DataTransformationPipeline)this.n()).X.V(((DataTransformationPipeline)this.n()).Z);
                TemporalMetadataResolver.h.c().L((String)((Object)AsynchronousResourceOrchestrator.c("v", (int)AsynchronousResourceOrchestrator.a("l", (int)22621, (long)(0x27F314C9243B236AL ^ l)), (long)-1568926191085831131L, (long)l)), (String)((Object)AsynchronousResourceOrchestrator.c("v", (int)AsynchronousResourceOrchestrator.a("l", (int)7328, (long)(0x3BD4D519627F6796L ^ l)), (long)-1568926191085831131L, (long)l)), 5000L);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AsynchronousResourceOrchestrator.a(customSystemException);
        }
    }

    @DataExchangeProtocol2090
    public void a(EventBroadcastRegistry eventBroadcastRegistry) {
        block15: {
            block14: {
                try {
                    if (NumericComputationEngine1000.n()) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousResourceOrchestrator.a(customSystemException);
                }
                try {
                    if (((DataTransformationPipeline)this.n()).K(eventBroadcastRegistry.getThePlayer(), eventBroadcastRegistry.getEntity()) == null) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousResourceOrchestrator.a(customSystemException);
                }
                try {
                    try {
                        if (!this.m || GeometryCalculator.C() != 13) break block14;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AsynchronousResourceOrchestrator.a(customSystemException);
                    }
                    GraphicsBufferAllocator.V();
                    GraphicsBufferAllocator.Y(((DataTransformationPipeline)this.n()).x.L());
                    GraphicsBufferAllocator.E();
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousResourceOrchestrator.a(customSystemException);
                }
            }
            try {
                try {
                    if (eventBroadcastRegistry.getEntity().B(ReflectionMetadataResolver.rl) || !eventBroadcastRegistry.getEntity().B(ReflectionMetadataResolver.UQ)) break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw AsynchronousResourceOrchestrator.a(customSystemException);
                }
                this.o = true;
                ++this.A;
            }
            catch (CustomSystemException customSystemException) {
                throw AsynchronousResourceOrchestrator.a(customSystemException);
            }
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AsynchronousResourceOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (AsynchronousResourceOrchestrator.n[n4] != null) {
            return n4;
        }
        Object object = AsynchronousResourceOrchestrator.l[n4];
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
                n3 = 30;
                break;
            }
            case 2: {
                n3 = 15;
                break;
            }
            case 3: {
                n3 = 52;
                break;
            }
            case 4: {
                n3 = 48;
                break;
            }
            case 5: {
                n3 = 7;
                break;
            }
            case 6: {
                n3 = 35;
                break;
            }
            case 7: {
                n3 = 27;
                break;
            }
            case 8: {
                n3 = 29;
                break;
            }
            case 9: {
                n3 = 44;
                break;
            }
            case 10: {
                n3 = 22;
                break;
            }
            case 11: {
                n3 = 18;
                break;
            }
            case 12: {
                n3 = 10;
                break;
            }
            case 13: {
                n3 = 47;
                break;
            }
            case 14: {
                n3 = 49;
                break;
            }
            case 15: {
                n3 = 54;
                break;
            }
            case 16: {
                n3 = 4;
                break;
            }
            case 17: {
                n3 = 25;
                break;
            }
            case 18: {
                n3 = 11;
                break;
            }
            case 19: {
                n3 = 3;
                break;
            }
            case 20: {
                n3 = 34;
                break;
            }
            case 21: {
                n3 = 45;
                break;
            }
            case 22: {
                n3 = 61;
                break;
            }
            case 23: {
                n3 = 46;
                break;
            }
            case 24: {
                n3 = 63;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 57;
                break;
            }
            case 27: {
                n3 = 12;
                break;
            }
            case 28: {
                n3 = 56;
                break;
            }
            case 29: {
                n3 = 55;
                break;
            }
            case 30: {
                n3 = 16;
                break;
            }
            case 31: {
                n3 = 58;
                break;
            }
            case 32: {
                n3 = 39;
                break;
            }
            case 33: {
                n3 = 28;
                break;
            }
            case 34: {
                n3 = 60;
                break;
            }
            case 35: {
                n3 = 19;
                break;
            }
            case 36: {
                n3 = 37;
                break;
            }
            case 37: {
                n3 = 62;
                break;
            }
            case 38: {
                n3 = 51;
                break;
            }
            case 39: {
                n3 = 13;
                break;
            }
            case 40: {
                n3 = 17;
                break;
            }
            case 41: {
                n3 = 31;
                break;
            }
            case 42: {
                n3 = 36;
                break;
            }
            case 43: {
                n3 = 33;
                break;
            }
            case 44: {
                n3 = 21;
                break;
            }
            case 45: {
                n3 = 24;
                break;
            }
            case 46: {
                n3 = 43;
                break;
            }
            case 47: {
                n3 = 41;
                break;
            }
            case 48: {
                n3 = 5;
                break;
            }
            case 49: {
                n3 = 14;
                break;
            }
            case 50: {
                n3 = 50;
                break;
            }
            case 51: {
                n3 = 32;
                break;
            }
            case 52: {
                n3 = 20;
                break;
            }
            case 53: {
                n3 = 42;
                break;
            }
            case 54: {
                n3 = 23;
                break;
            }
            case 55: {
                n3 = 59;
                break;
            }
            case 56: {
                n3 = 6;
                break;
            }
            case 57: {
                n3 = 26;
                break;
            }
            case 58: {
                n3 = 38;
                break;
            }
            case 59: {
                n3 = 1;
                break;
            }
            case 60: {
                n3 = 53;
                break;
            }
            case 61: {
                n3 = 8;
                break;
            }
            case 62: {
                n3 = 2;
                break;
            }
            default: {
                n3 = 9;
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
        AsynchronousResourceOrchestrator.n[n4] = new String(cArray);
        return n4;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AsynchronousResourceOrchestrator.a(l, l2);
            object = AsynchronousResourceOrchestrator.l[n];
            try {
                if (!(object instanceof String)) break block2;
                AsynchronousResourceOrchestrator.l[n] = clazz = Class.forName(AsynchronousResourceOrchestrator.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = l;
        l[0] = "!gK";
        objectArray[1] = Integer.TYPE;
        AsynchronousResourceOrchestrator.n[1] = "java/lang/Integer";
        objectArray[2] = "3+GyDf8$V69~+#_\u007f";
        objectArray[3] = "F7\u00056\"XM8\u0014yCVF3\u0010#";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "5w\u0007*\u0012[v7ZP\u0018\u001e\t>Tn\u001c\u0007xsI?s\\puE*\fZ16SP";
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = MultiContainerRegistry.a(2493450041684560191L, 3977147601051648699L, MethodHandles.lookup().lookupClass()).a(230551557763817L);
        l = new Object[5];
        n = new String[5];
        AsynchronousResourceOrchestrator.a();
        j = new HashMap(13);
        long l = d ^ 0x6A4EFB8AE232L;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "3r\u009aOq\u00ffc?\u008f\u00c9\u00c4\u00a6\u00e8\u00a1\u00a7\u00bf";
        int n2 = "3r\u009aOq\u00ffc?\u008f\u00c9\u00c4\u00a6\u00e8\u00a1\u00a7\u00bf".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        e = lArray;
        h = new Integer[2];
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AsynchronousResourceOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AsynchronousResourceOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AsynchronousResourceOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

