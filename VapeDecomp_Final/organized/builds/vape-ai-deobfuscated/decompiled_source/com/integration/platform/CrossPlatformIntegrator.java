/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.lwjgl.opengl.GL11
 */
package com.integration.platform;

import a.JF;
import a.KB;
import a.Ne;
import a.Qh;
import a.S3;
import a._Y;
import a._o;
import a.tR;
import a.tl;
import com.analytics.computation.NumericComputationEngine1000;
import com.app.command.CommandExecutor;
import com.app.graphics.GraphicsRenderingUtility1454;
import com.app.workflow.StateTrackingCoordinator;
import com.cache.distribution.DistributedCacheManager;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.compression.core.DataCompressionHandler;
import com.computation.metrics.MetricComputationEngine;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.aggregation.SequentialDataAggregator;
import com.event.dispatch.EventDispatchRegistry2111;
import com.exception.system.CustomSystemException;
import com.graphics.color.ColorCompositionEngine;
import com.graphics.resources.GraphicalResourceManager;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometricComputationEngine;
import com.math.geometry.GeometryCalculator;
import com.messaging.validation.MessageValidationProcessor;
import com.network.config.ConnectionConfigurationResolver;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.configuration.NetworkConfigManager;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.resolution.MethodResolutionMediator;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CryptoSecurityProvider;
import com.security.crypto.CryptographicModeEnum;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.event.SecureEventOrchestrator;
import com.security.negotiation.CryptoContextNegotiator684;
import com.security.policy.PolicyEnforcementHandler;
import com.security.transform.CryptographicTransformer;
import com.simulation.world.WorldStateTransitioner;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.interceptors.ResourceInterceptor;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.lifecycle.SystemLifecycleController;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import com.transaction.model.TransactionDescriptor;
import com.user.identity.UserIdentityManager;
import com.workflow.coordination.WorkflowOrchestrator1642;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class CrossPlatformIntegrator
implements NetworkConfigurationResolver2717 {
    private final PolicyEnforcementHandler A;
    private static final long[] c;
    private static final Object[] g;
    private NetworkConfigManager Z = new NetworkConfigManager();
    private final GeometricComputationEngine e;
    private long j;
    private static final Map f;
    private String T;
    private static final long a;
    @Nullable
    private Qh b;
    private final ResourceInterceptor o = TemporalMetadataResolver.h.U().K(ResourceInterceptor.class);
    private static final String[] h;
    private static final Integer[] d;
    private int w;
    public static CrossPlatformIntegrator C;

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2B12;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/_j", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CrossPlatformIntegrator.d[n2] = n3;
        }
        return d[n2];
    }

    private void Q(UserIdentityManager userIdentityManager) {
        block10: {
            MethodResolutionMediator methodResolutionMediator = ApplicationLifecycleManager.G();
            try {
                if (methodResolutionMediator.Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CrossPlatformIntegrator.a(customSystemException);
            }
            UUID uUID = userIdentityManager.J();
            try {
                block9: {
                    try {
                        try {
                            if (!userIdentityManager.X().equals(methodResolutionMediator.N()) || uUID == null) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                        if (uUID.equals(methodResolutionMediator.w())) break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                }
                userIdentityManager.J(methodResolutionMediator.w(), methodResolutionMediator.N());
                SecureContextBroker572.h().c().P(methodResolutionMediator.w(), methodResolutionMediator.N());
            }
            catch (CustomSystemException customSystemException) {
                throw CrossPlatformIntegrator.a(customSystemException);
            }
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CrossPlatformIntegrator.a(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                CrossPlatformIntegrator.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Nullable
    public Qh f() {
        block26: {
            block25: {
                Object object;
                ObjectLifecycleTracker objectLifecycleTracker;
                block24: {
                    block23: {
                        try {
                            if (!this.o.Z() || this.o.N.isEmpty()) break block23;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                        objectLifecycleTracker = ApplicationLifecycleManager.X();
                        try {
                            if (this.o.v.s().booleanValue() && !((SecureEventOrchestrator)objectLifecycleTracker).Y()) break block23;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                        for (TransactionOrchestrator1017 transactionOrchestrator1017 : this.o.N) {
                            try {
                                if (!transactionOrchestrator1017.B(ReflectionMetadataResolver.UQ)) continue;
                                return new Qh(transactionOrchestrator1017.M());
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformIntegrator.a(customSystemException);
                            }
                        }
                    }
                    if (this.A.Z()) {
                        objectLifecycleTracker = this.A.m();
                        object = ApplicationLifecycleManager.X();
                        try {
                            try {
                                try {
                                    if (!((SecureEventOrchestrator)object).Y() || objectLifecycleTracker == null) break block24;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CrossPlatformIntegrator.a(customSystemException);
                                }
                                if (!objectLifecycleTracker.B(ReflectionMetadataResolver.UQ)) break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformIntegrator.a(customSystemException);
                            }
                            return new Qh(objectLifecycleTracker);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                    }
                }
                if (this.e.Z() && ((SecureEventOrchestrator)(objectLifecycleTracker = ApplicationLifecycleManager.X())).Y()) {
                    object = this.e.A();
                    try {
                        try {
                            if (object == null || !((ObjectLifecycleTracker)object).B(ReflectionMetadataResolver.UQ)) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                        return new Qh(((ObjectLifecycleTracker)object).M());
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                }
            }
            try {
                try {
                    if (this.b == null || System.currentTimeMillis() - this.j >= 5000L) break block26;
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformIntegrator.a(customSystemException);
                }
                return this.b;
            }
            catch (CustomSystemException customSystemException) {
                throw CrossPlatformIntegrator.a(customSystemException);
            }
        }
        return null;
    }

    private static List lambda$onRenderWorldLast$1(MetricComputationEngine metricComputationEngine, Qh qh, List list) {
        List list2;
        try {
            list2 = list != null ? list : new ArrayList();
        }
        catch (CustomSystemException customSystemException) {
            throw CrossPlatformIntegrator.a(customSystemException);
        }
        List list3 = list2;
        list3.add(metricComputationEngine);
        return list3;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "viP";
        objectArray[1] = Integer.TYPE;
        CrossPlatformIntegrator.h[1] = "java/lang/Integer";
        objectArray[2] = "qK[C_TzDJ\f\"LiCCE";
        objectArray[3] = "gu9\u001c-9lz(SL7gq,\t";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\f\u001f#GyR\t\u001f>\u007fwMi\\c\u0007`M\u000f\\?\u0002p6P\u001c#\u0006n\f\u0005\u0017<\u0004\u001c";
    }

    @DataExchangeProtocol2090
    public void a(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        DistributedCacheManager distributedCacheManager;
        Object object5;
        block44: {
            Object object2;
            Object object3;
            block47: {
                block46: {
                    LinkedHashMap<UUID, Qh> linkedHashMap;
                    block45: {
                        block43: {
                            Object object4;
                            try {
                                if (NumericComputationEngine1000.n()) {
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformIntegrator.a(customSystemException);
                            }
                            JF jF = TemporalMetadataResolver.h.O().p().Q();
                            try {
                                if (jF == null) {
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformIntegrator.a(customSystemException);
                            }
                            ConnectionConfigurationResolver connectionConfigurationResolver = eventDispatchRegistry2111.getWorld();
                            try {
                                if (connectionConfigurationResolver.Y()) {
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformIntegrator.a(customSystemException);
                            }
                            linkedHashMap = new LinkedHashMap<UUID, Qh>();
                            for (Object object5 : connectionConfigurationResolver.M()) {
                                object4 = new Qh(object5);
                                linkedHashMap.put(((CryptographicTransformer)object4).q(), (Qh)object4);
                            }
                            try {
                                if (linkedHashMap.isEmpty()) {
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformIntegrator.a(customSystemException);
                            }
                            this.C(linkedHashMap.values());
                            distributedCacheManager = SystemLifecycleController.C.q();
                            object5 = new LinkedHashMap();
                            object4 = TemporalMetadataResolver.h.O().m().b();
                            object3 = object4.iterator();
                            while (object3.hasNext()) {
                                object2 = (MetricComputationEngine)object3.next();
                                if (!jF.u().contains(((MetricComputationEngine)object2).z())) continue;
                                try {
                                    try {
                                        if (object2.equals(TemporalMetadataResolver.h.O().n().i()) && !distributedCacheManager.C().s().booleanValue()) {
                                            continue;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw CrossPlatformIntegrator.a(customSystemException);
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CrossPlatformIntegrator.a(customSystemException);
                                }
                                try {
                                    if (!((MetricComputationEngine)object2).U()) {
                                        continue;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CrossPlatformIntegrator.a(customSystemException);
                                }
                                Qh qh = (Qh)linkedHashMap.get(((MetricComputationEngine)object2).l());
                                try {
                                    if (qh == null) {
                                        continue;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CrossPlatformIntegrator.a(customSystemException);
                                }
                                try {
                                    if (qh.equals(ApplicationLifecycleManager.U())) {
                                        continue;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CrossPlatformIntegrator.a(customSystemException);
                                }
                                object5.compute(qh, (arg_0, arg_1) -> CrossPlatformIntegrator.lambda$onRenderWorldLast$0((MetricComputationEngine)object2, arg_0, arg_1));
                            }
                            try {
                                if (distributedCacheManager.C().s().booleanValue()) break block43;
                                break block44;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformIntegrator.a(customSystemException);
                            }
                        }
                        object3 = TemporalMetadataResolver.h.O().n().i();
                        try {
                            if (((MetricComputationEngine)object3).U()) break block45;
                            break block44;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                    }
                    object2 = (Qh)linkedHashMap.get(((MetricComputationEngine)object3).l());
                    try {
                        if (object2 != null) break block46;
                        break block44;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                }
                try {
                    if (!((ObjectLifecycleTracker)object2).equals(ApplicationLifecycleManager.U())) break block47;
                    break block44;
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformIntegrator.a(customSystemException);
                }
            }
            object5.compute(object2, (arg_0, arg_1) -> CrossPlatformIntegrator.lambda$onRenderWorldLast$1((MetricComputationEngine)object3, arg_0, arg_1));
        }
        try {
            if (object5.isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CrossPlatformIntegrator.a(customSystemException);
        }
        GraphicsBufferAllocator.V();
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        for (Map.Entry entry : object5.entrySet()) {
            Qh qh = (Qh)entry.getKey();
            List list = (List)entry.getValue();
            list.sort(CrossPlatformIntegrator::lambda$onRenderWorldLast$2);
            float f = eventDispatchRegistry2111.getTicks();
            double d5 = qh.b() + (qh.F() - qh.b()) * (double)f;
            double d6 = qh.q() + (qh.V() - qh.q()) * (double)f;
            double d7 = qh.I() + (qh.B() - qh.I()) * (double)f;
            GL11.glPushMatrix();
            GL11.glTranslated((double)(d5 - d2 + (double)0.03f), (double)(d6 - d3 + 0.001), (double)(d7 - d4 + (double)0.03f));
            GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glScaled((double)0.1, (double)0.1, (double)0.1);
            float f2 = 10.0f;
            try {
                GL11.glPopMatrix();
                if (list.size() <= 0 || !distributedCacheManager.P().s().booleanValue()) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw CrossPlatformIntegrator.a(customSystemException);
            }
            MetricComputationEngine metricComputationEngine = (MetricComputationEngine)list.get(0);
            ColorCompositionEngine colorCompositionEngine = new ColorCompositionEngine(GraphicsRenderingUtility1454.V(metricComputationEngine.z())).I(150);
            ConfigurationManager.a(qh.r(), qh.y(), qh.D(), 50.0f, 0.7f, qh.L(), colorCompositionEngine);
        }
        GraphicsBufferAllocator.E();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/_j" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static List<MetricComputationEngine> O(String string) {
        ArrayList<MetricComputationEngine> arrayList;
        block11: {
            arrayList = new ArrayList<MetricComputationEngine>();
            for (MetricComputationEngine metricComputationEngine : TemporalMetadataResolver.h.O().m().b()) {
                try {
                    try {
                        if (!metricComputationEngine.U() || !metricComputationEngine.h().equals(string)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                    arrayList.add(metricComputationEngine);
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformIntegrator.a(customSystemException);
                }
            }
            MetricComputationEngine metricComputationEngine = TemporalMetadataResolver.h.O().n().i();
            try {
                try {
                    try {
                        if (!SystemLifecycleController.C.q().C().s().booleanValue() || !metricComputationEngine.U()) break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                    if (!metricComputationEngine.h().equals(string)) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformIntegrator.a(customSystemException);
                }
                arrayList.add(metricComputationEngine);
            }
            catch (CustomSystemException customSystemException) {
                throw CrossPlatformIntegrator.a(customSystemException);
            }
        }
        return arrayList;
    }

    private void C(Collection<Qh> collection) {
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        double d5 = systemConfigurationOrchestrator.r() - d2;
        double d6 = systemConfigurationOrchestrator.y() - d3;
        double d7 = systemConfigurationOrchestrator.D() - d4;
        double d8 = 7.0;
        GraphicalResourceManager graphicalResourceManager = TemporalMetadataResolver.h.U().K(GraphicalResourceManager.class);
        if (graphicalResourceManager.Z()) {
            d8 += 7.0;
        }
        for (Qh qh : collection) {
            this.C(qh, d8, d5, d6, d7, d2, d3, d4);
        }
    }

    @DataExchangeProtocol2090
    public void D(WorldStateTransitioner worldStateTransitioner) {
        TemporalMetadataResolver.h.O().m().r();
        TemporalMetadataResolver.h.O().N().U();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CrossPlatformIntegrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CrossPlatformIntegrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = CrossPlatformIntegrator.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = CrossPlatformIntegrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CrossPlatformIntegrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CrossPlatformIntegrator.a(clazz3, string2, clazz2)) != null) {
                    CrossPlatformIntegrator.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CrossPlatformIntegrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CrossPlatformIntegrator.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CrossPlatformIntegrator.b(278152486308583L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static List lambda$onRenderWorldLast$0(MetricComputationEngine metricComputationEngine, Qh qh, List list) {
        List list2;
        try {
            list2 = list != null ? list : new ArrayList();
        }
        catch (CustomSystemException customSystemException) {
            throw CrossPlatformIntegrator.a(customSystemException);
        }
        List list3 = list2;
        list3.add(metricComputationEngine);
        return list3;
    }

    @DataExchangeProtocol2090
    public void h(KB kB) {
        try {
            if (SystemLifecycleController.C.U() != CryptographicModeEnum.ONLINE) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CrossPlatformIntegrator.a(customSystemException);
        }
        try {
            if (!this.Z.m(1000L)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CrossPlatformIntegrator.a(customSystemException);
        }
        this.Z.m();
        CryptoSecurityProvider cryptoSecurityProvider = TemporalMetadataResolver.h.O().n();
        this.Q(cryptoSecurityProvider);
        this.H(cryptoSecurityProvider);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CrossPlatformIntegrator.a(n, l);
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
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-7933145726157731132L, 6635186747313391800L, MethodHandles.lookup().lookupClass()).a(869555249660L);
        g = new Object[5];
        h = new String[5];
        CrossPlatformIntegrator.a();
        f = new HashMap(13);
        long l = a ^ 0x1AB2C4DC1343L;
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
        String string = "\u00b0=\u0094\u00b3\r\u00feF\u0099\u00cdKeS\u00ec\u00ca[\u00f4\u00bc)\u0085\u00af\u00d2\u008c%\u00eb";
        int n2 = "\u00b0=\u0094\u00b3\r\u00feF\u0099\u00cdKeS\u00ec\u00ca[\u00f4\u00bc)\u0085\u00af\u00d2\u008c%\u00eb".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[3];
        C = new CrossPlatformIntegrator();
    }

    @DataExchangeProtocol2090
    public void e(CommandExecutor commandExecutor) {
        try {
            if (TemporalMetadataResolver.h.O().p().Q() == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CrossPlatformIntegrator.a(customSystemException);
        }
        try {
            if (commandExecutor.getTarget().B(ReflectionMetadataResolver.UQ)) {
                this.B(new Qh(commandExecutor.getTarget().M()));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CrossPlatformIntegrator.a(customSystemException);
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CrossPlatformIntegrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @DataExchangeProtocol2090
    public void Z(S3 s3) {
        block11: {
            TransactionDescriptor transactionDescriptor;
            block9: {
                block10: {
                    TransactionDescriptor transactionDescriptor2 = s3.getPreviousProfile();
                    transactionDescriptor = s3.getNewProfile();
                    try {
                        try {
                            try {
                                if (transactionDescriptor2 == null || transactionDescriptor2.p() == null) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformIntegrator.a(customSystemException);
                            }
                            if (transactionDescriptor.p() == null) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                        SecureContextBroker572.h().c().G(transactionDescriptor.p().i());
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                }
                SecureContextBroker572.h().c().K();
                break block11;
            }
            try {
                if (transactionDescriptor.p() != null) {
                    SecureContextBroker572.h().c().G(transactionDescriptor.p().i());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CrossPlatformIntegrator.a(customSystemException);
            }
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 14;
                break;
            }
            case 1: {
                n3 = 33;
                break;
            }
            case 2: {
                n3 = 8;
                break;
            }
            case 3: {
                n3 = 10;
                break;
            }
            case 4: {
                n3 = 59;
                break;
            }
            case 5: {
                n3 = 5;
                break;
            }
            case 6: {
                n3 = 58;
                break;
            }
            case 7: {
                n3 = 28;
                break;
            }
            case 8: {
                n3 = 55;
                break;
            }
            case 9: {
                n3 = 26;
                break;
            }
            case 10: {
                n3 = 62;
                break;
            }
            case 11: {
                n3 = 19;
                break;
            }
            case 12: {
                n3 = 37;
                break;
            }
            case 13: {
                n3 = 49;
                break;
            }
            case 14: {
                n3 = 54;
                break;
            }
            case 15: {
                n3 = 16;
                break;
            }
            case 16: {
                n3 = 24;
                break;
            }
            case 17: {
                n3 = 35;
                break;
            }
            case 18: {
                n3 = 52;
                break;
            }
            case 19: {
                n3 = 51;
                break;
            }
            case 20: {
                n3 = 2;
                break;
            }
            case 21: {
                n3 = 3;
                break;
            }
            case 22: {
                n3 = 11;
                break;
            }
            case 23: {
                n3 = 61;
                break;
            }
            case 24: {
                n3 = 17;
                break;
            }
            case 25: {
                n3 = 27;
                break;
            }
            case 26: {
                n3 = 23;
                break;
            }
            case 27: {
                n3 = 43;
                break;
            }
            case 28: {
                n3 = 45;
                break;
            }
            case 29: {
                n3 = 15;
                break;
            }
            case 30: {
                n3 = 38;
                break;
            }
            case 31: {
                n3 = 9;
                break;
            }
            case 32: {
                n3 = 34;
                break;
            }
            case 33: {
                n3 = 44;
                break;
            }
            case 34: {
                n3 = 63;
                break;
            }
            case 35: {
                n3 = 1;
                break;
            }
            case 36: {
                n3 = 50;
                break;
            }
            case 37: {
                n3 = 12;
                break;
            }
            case 38: {
                n3 = 56;
                break;
            }
            case 39: {
                n3 = 0;
                break;
            }
            case 40: {
                n3 = 20;
                break;
            }
            case 41: {
                n3 = 31;
                break;
            }
            case 42: {
                n3 = 46;
                break;
            }
            case 43: {
                n3 = 29;
                break;
            }
            case 44: {
                n3 = 22;
                break;
            }
            case 45: {
                n3 = 13;
                break;
            }
            case 46: {
                n3 = 21;
                break;
            }
            case 47: {
                n3 = 4;
                break;
            }
            case 48: {
                n3 = 57;
                break;
            }
            case 49: {
                n3 = 36;
                break;
            }
            case 50: {
                n3 = 42;
                break;
            }
            case 51: {
                n3 = 60;
                break;
            }
            case 52: {
                n3 = 40;
                break;
            }
            case 53: {
                n3 = 53;
                break;
            }
            case 54: {
                n3 = 48;
                break;
            }
            case 55: {
                n3 = 6;
                break;
            }
            case 56: {
                n3 = 32;
                break;
            }
            case 57: {
                n3 = 41;
                break;
            }
            case 58: {
                n3 = 47;
                break;
            }
            case 59: {
                n3 = 30;
                break;
            }
            case 60: {
                n3 = 25;
                break;
            }
            case 61: {
                n3 = 7;
                break;
            }
            case 62: {
                n3 = 39;
                break;
            }
            default: {
                n3 = 18;
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
        CrossPlatformIntegrator.h[n4] = new String(cArray);
        return n4;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'M' || c == 'J' || c == '\u00f0' || c == 'W') {
                field = CrossPlatformIntegrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CrossPlatformIntegrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'p' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 's' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = CrossPlatformIntegrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CrossPlatformIntegrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void C(CryptographicTransformer cryptographicTransformer, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        float f;
        double d9;
        block19: {
            block20: {
                double d10;
                double d11;
                double d12;
                block17: {
                    double d13;
                    double d14;
                    double d15;
                    block18: {
                        float f2;
                        try {
                            if (cryptographicTransformer.O()) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                        d12 = cryptographicTransformer.r() - d6;
                        d11 = cryptographicTransformer.y() - d7;
                        d10 = cryptographicTransformer.D() - d8;
                        d9 = _Y.V(d12, d11, d10, d3, d4, d5);
                        float f3 = (float)d9;
                        try {
                            f2 = (double)f3 / 5.0 <= 2.0 ? 2.0f : (float)((double)f3 / 5.0);
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                        float f4 = f2;
                        f = 0.016666668f * f4;
                        try {
                            try {
                                CryptoContextNegotiator684.Y();
                                tR.l();
                                if (GeometryCalculator.C() < 35) break block17;
                                if (ApplicationLifecycleManager.N().V() != 0) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformIntegrator.a(customSystemException);
                            }
                            GL11.glTranslated((double)d12, (double)(d11 + (double)cryptographicTransformer.L() + 0.2), (double)d10);
                            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)(-ApplicationLifecycleManager.r().k()), (float)0.0f, (float)1.0f, (float)0.0f);
                            GL11.glRotatef((float)(-ApplicationLifecycleManager.r().r()), (float)-1.0f, (float)0.0f, (float)0.0f);
                            break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                    }
                    DataCompressionHandler dataCompressionHandler = ApplicationLifecycleManager.U().v();
                    try {
                        d15 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.b() - dataCompressionHandler.w().X();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                    double d16 = d15;
                    try {
                        d14 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.S() - dataCompressionHandler.w().F();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                    double d17 = d14;
                    try {
                        d13 = ConfigurationManager.U() ? 0.0 : NumericComputationEngine1131.n() - dataCompressionHandler.w().f();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                    double d18 = d13;
                    GL11.glTranslated((double)(d12 + d16), (double)(d11 + d17 + (double)cryptographicTransformer.L() + (double)0.4f), (double)(d10 + d18));
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)(-ApplicationLifecycleManager.r().k()), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)ApplicationLifecycleManager.r().r(), (float)1.0f, (float)0.0f, (float)0.0f);
                    break block19;
                }
                try {
                    GL11.glTranslated((double)(d12 + 0.0), (double)(d11 + (double)cryptographicTransformer.L() + 0.5), (double)d10);
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    if (ApplicationLifecycleManager.N().V() != 2) break block20;
                    GL11.glRotatef((float)(-ApplicationLifecycleManager.r().k()), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)ApplicationLifecycleManager.r().r(), (float)-1.0f, (float)0.0f, (float)0.0f);
                    break block19;
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformIntegrator.a(customSystemException);
                }
            }
            GL11.glRotatef((float)(-ApplicationLifecycleManager.r().k()), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)ApplicationLifecycleManager.r().r(), (float)1.0f, (float)0.0f, (float)0.0f);
        }
        GL11.glScalef((float)(-f), (float)(-f), (float)f);
        tl.R(false);
        tl.w();
        float f5 = (float)(d9 / 5.0);
        float f6 = 0.01f * f5;
        GL11.glTranslated((double)0.0, (double)(-d2), (double)0.0);
        GL11.glScaled((double)(1.0f / f), (double)(1.0f / f), (double)(-(1.0f / f)));
        GL11.glScaled((double)f6, (double)f6, (double)f6);
        CrossPlatformIntegrator.q(cryptographicTransformer);
        tl.k();
        tl.R(true);
        CryptoContextNegotiator684.J();
        ApplicationLifecycleManager.U().F(1.0);
    }

    private static int lambda$onRenderWorldLast$2(MetricComputationEngine metricComputationEngine, MetricComputationEngine metricComputationEngine2) {
        return metricComputationEngine.z().j().compareTo(metricComputationEngine2.z().j());
    }

    public CrossPlatformIntegrator() {
        this.A = TemporalMetadataResolver.h.U().K(PolicyEnforcementHandler.class);
        this.e = TemporalMetadataResolver.h.U().K(GeometricComputationEngine.class);
    }

    public static void q(CryptographicTransformer cryptographicTransformer) {
        Object object;
        DistributedCacheManager distributedCacheManager;
        int n;
        Qh qh;
        long l;
        block13: {
            l = a ^ 0x4314D7910EE7L;
            JF jF = TemporalMetadataResolver.h.O().p().Q();
            try {
                if (jF == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CrossPlatformIntegrator.a(customSystemException);
            }
            try {
                if (!cryptographicTransformer.B(ReflectionMetadataResolver.UQ)) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CrossPlatformIntegrator.a(customSystemException);
            }
            qh = new Qh(cryptographicTransformer.M());
            double d2 = 10.0;
            double d3 = 20.0;
            n = 5;
            distributedCacheManager = SystemLifecycleController.C.q();
            if (SystemLifecycleController.C.q().M().s().booleanValue()) {
                object = TemporalMetadataResolver.h.O().m().u(qh.e());
                try {
                    if (object == null || !jF.u().contains(((MetricComputationEngine)object).z())) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformIntegrator.a(customSystemException);
                }
                Color color = GraphicsRenderingUtility1454.V(((MetricComputationEngine)object).z());
                color = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
                ConfigurationManager.T(-6.0, (double)(-n - 1), 12.0, 1.0, new Color(0, 0, 0, 96));
                ConfigurationManager.T(-5.0, (double)(-n), 10.0, 1.0, color);
                n = (int)((double)n + 15.0);
            }
        }
        if (SystemLifecycleController.C.q().P().s().booleanValue()) {
            block14: {
                ApplicationLifecycleManager.U().H(0.0);
                Ne.h.z(2896);
                tl.s();
                GL11.glBlendFunc((int)770, (int)771);
                object = CrossPlatformIntegrator.O(qh.e());
                try {
                    if (object.isEmpty() || !distributedCacheManager.P().s().booleanValue()) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformIntegrator.a(customSystemException);
                }
                double d4 = -5.0 - (double)object.size() * 20.0 / 2.0 + 10.0 - 2.0;
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    MetricComputationEngine metricComputationEngine = (MetricComputationEngine)iterator.next();
                    Color color = GraphicsRenderingUtility1454.V(metricComputationEngine.z());
                    color = new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
                    StateTrackingCoordinator.B(new Color(0, 0, 0, 150), (float)d4 - 1.0f, (float)(-n) - 1.0f, (String)((Object)CrossPlatformIntegrator.b("s", (int)CrossPlatformIntegrator.a("h", (int)26238, (long)(0x6283AFFAEC9F2A53L ^ l)), (long)-1783939314336107282L, (long)l)), 16.0f, 16.0f, false);
                    StateTrackingCoordinator.B(color, (float)d4, -n, (String)((Object)CrossPlatformIntegrator.b("s", (int)CrossPlatformIntegrator.a("h", (int)5589, (long)(0x4BF997D4314D9F9L ^ l)), (long)-1783939314336107282L, (long)l)), 14.0f, 14.0f, false);
                    d4 += 20.0;
                }
            }
            Ne.h.y(2896);
            ApplicationLifecycleManager.U().F(0.0);
        }
    }

    @DataExchangeProtocol2090
    public void F(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block12: {
            int n;
            WorkflowOrchestrator1642 workflowOrchestrator1642;
            SequentialDataAggregator sequentialDataAggregator;
            block13: {
                ConnectionConfigurationResolver connectionConfigurationResolver;
                Qh qh;
                MetricComputationEngine metricComputationEngine;
                block11: {
                    try {
                        if (SystemLifecycleController.C.U() != CryptographicModeEnum.ONLINE) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                    sequentialDataAggregator = TemporalMetadataResolver.h.O().m();
                    metricComputationEngine = TemporalMetadataResolver.h.O().n().i();
                    qh = cryptoKeyManagementSystem.getPlayer();
                    connectionConfigurationResolver = cryptoKeyManagementSystem.getWorld();
                    try {
                        try {
                            if (this.b == null || System.currentTimeMillis() - this.j < 10000L) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                        this.B(null);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                }
                sequentialDataAggregator.M(qh, connectionConfigurationResolver);
                workflowOrchestrator1642 = MetricComputationEngine.z(qh);
                metricComputationEngine.C(workflowOrchestrator1642);
                n = _o.W();
                try {
                    try {
                        metricComputationEngine.L(n);
                        if (sequentialDataAggregator.p()) break block12;
                        if (this.w == n) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                    SecureContextBroker572.h().c().m(n);
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformIntegrator.a(customSystemException);
                }
            }
            this.w = n;
            sequentialDataAggregator.M(workflowOrchestrator1642);
        }
    }

    private void B(@Nullable Qh qh) {
        this.b = qh;
        this.j = System.currentTimeMillis();
    }

    private void H(UserIdentityManager userIdentityManager) {
        String string;
        block21: {
            block20: {
                block19: {
                    Object object;
                    block18: {
                        long l = a ^ 0x5EFE70ED990FL;
                        MessageValidationProcessor messageValidationProcessor = ApplicationLifecycleManager.b();
                        object = ApplicationLifecycleManager.E() ? CrossPlatformIntegrator.b("s", (int)CrossPlatformIntegrator.a("h", (int)23600, (long)(0x1E3132283DFD07F7L ^ l)), (long)8130740395108262662L, (long)l) : (messageValidationProcessor.r() ? messageValidationProcessor.V() : null);
                        string = object;
                        if (!SystemLifecycleController.C.q().v().s().booleanValue()) {
                            object = null;
                        }
                        try {
                            try {
                                if (userIdentityManager.V() != null || object == null) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CrossPlatformIntegrator.a(customSystemException);
                            }
                            userIdentityManager.B((String)object);
                            SecureContextBroker572.h().c().C((String)object);
                            break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            if (userIdentityManager.V() == null || object != null) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                        userIdentityManager.B((String)object);
                        SecureContextBroker572.h().c().C((String)object);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                }
                try {
                    try {
                        try {
                            if (this.T == null && string != null) break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CrossPlatformIntegrator.a(customSystemException);
                        }
                        if (this.T == null) break block21;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CrossPlatformIntegrator.a(customSystemException);
                    }
                    if (string != null) break block21;
                }
                catch (CustomSystemException customSystemException) {
                    throw CrossPlatformIntegrator.a(customSystemException);
                }
            }
            SequentialDataAggregator sequentialDataAggregator = TemporalMetadataResolver.h.O().m();
            try {
                if (!sequentialDataAggregator.p()) {
                    sequentialDataAggregator.r();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CrossPlatformIntegrator.a(customSystemException);
            }
        }
        this.T = string;
    }

    private static Method d(long l, long l2) {
        int n = CrossPlatformIntegrator.a(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = CrossPlatformIntegrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CrossPlatformIntegrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CrossPlatformIntegrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        CrossPlatformIntegrator.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CrossPlatformIntegrator.b(278152486308583L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CrossPlatformIntegrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CrossPlatformIntegrator.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CrossPlatformIntegrator.b(278152486308583L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CrossPlatformIntegrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CrossPlatformIntegrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

