/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.computation.metrics;

import a.Qh;
import a.Qv;
import a.V3;
import a.c0;
import com.app.analytics.MetricsCalculator;
import com.app.math.NumericStreamProcessor;
import com.collections.management.MultiContainerRegistry;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.comparison.ComparativeIdentifier;
import com.exception.system.CustomSystemException;
import com.integration.platform.CrossPlatformIntegrator;
import com.math.geometry.GeometricCalculator1977;
import com.network.protocol.ProtocolInteractionController;
import com.reflection.introspection.ReflectionIntrospector;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.context.RuntimeContextResolver;
import com.security.authentication.SessionTokenGenerator;
import com.security.transform.CryptographicTransformer;
import com.service.configuration.ServiceConfigurationResolver;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.pipeline.ObjectPipelineManager;
import com.system.resource.ResourceAllocationManager1058;
import com.user.identity.UserIdentityManager;
import com.workflow.coordination.WorkflowOrchestrator1642;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class MetricComputationEngine {
    private float p;
    private static final Integer[] h;
    private final UserIdentityManager x;
    private double Q;
    @Nullable
    private String e;
    HashMap<Integer, Integer> H;
    private double S;
    private float b;
    @Nullable
    private UUID E;
    private final ComparativeIdentifier[] G;
    private int V;
    private NumericStreamProcessor i;
    private int J;
    private int w;
    private static final long[] d;
    private static final long a;
    private HashSet<ReflectionIntrospector> v;
    private float y;
    private int K;
    private AtomicBoolean O;
    private double Z;
    private boolean M;
    private static final Map j;
    private boolean r;
    private final Map<ResourceAllocationManager1058, Integer> c;
    private final ComparativeIdentifier[] g;
    private int W;
    private int m;
    private int f;
    private int A;

    public void y(int n) {
        this.K = n;
    }

    public int n() {
        return this.J;
    }

    @Nullable
    public static ComparativeIdentifier Y(LightweightExecutionContext lightweightExecutionContext) {
        MetricsCalculator metricsCalculator = MetricComputationEngine.N(lightweightExecutionContext);
        try {
            if (metricsCalculator == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        return ComparativeIdentifier.f(metricsCalculator);
    }

    public float n(Qh qh) {
        try {
            if (qh == null) {
                return this.y;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        return qh.K();
    }

    public void C(WorkflowOrchestrator1642 workflowOrchestrator1642) {
        block11: {
            block10: {
                this.r = true;
                GeometricCalculator1977 geometricCalculator1977 = workflowOrchestrator1642.T();
                try {
                    if (geometricCalculator1977 != null) {
                        this.Q = geometricCalculator1977.K();
                        this.Z = geometricCalculator1977.t();
                        this.S = geometricCalculator1977.q();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw MetricComputationEngine.a(customSystemException);
                }
                c0 c02 = workflowOrchestrator1642.P();
                if (c02 != null) {
                    this.b = c02.I();
                    this.y = c02.a();
                    this.p = c02.U();
                    this.W = c02.P();
                    this.c.clear();
                    for (Map.Entry entry : c02.A().entrySet()) {
                        ResourceAllocationManager1058 resourceAllocationManager1058 = ObjectPipelineManager.r((Short)entry.getKey());
                        try {
                            if (resourceAllocationManager1058 == null) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw MetricComputationEngine.a(customSystemException);
                        }
                        this.c.put(resourceAllocationManager1058, (Integer)entry.getValue());
                    }
                }
                SessionTokenGenerator sessionTokenGenerator = workflowOrchestrator1642.c();
                try {
                    if (sessionTokenGenerator == null) break block10;
                    this.E = sessionTokenGenerator.j();
                    this.e = sessionTokenGenerator.l();
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetricComputationEngine.a(customSystemException);
                }
            }
            this.E = null;
            this.e = null;
        }
    }

    public int r() {
        return this.w;
    }

    public double y(Qh qh) {
        try {
            if (qh == null) {
                return this.Q;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        return qh.r();
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public int P() {
        return this.W;
    }

    public void d(int n) {
        this.J = n;
    }

    public void O(int n) {
        this.W = n;
    }

    public UserIdentityManager z() {
        return this.x;
    }

    public void Q(ReflectionIntrospector reflectionIntrospector) {
        this.v.remove((Object)reflectionIntrospector);
    }

    public int w() {
        return this.K;
    }

    public void p() {
        this.v.clear();
        this.H.clear();
    }

    public void D(boolean bl) {
    }

    public ComparativeIdentifier[] n() {
        return this.g;
    }

    public ReflectionIntrospector b() {
        try {
            if (this.v.contains((Object)ReflectionIntrospector.DEAD)) {
                return ReflectionIntrospector.DEAD;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        try {
            if (this.v.contains((Object)ReflectionIntrospector.AFK)) {
                return ReflectionIntrospector.AFK;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        try {
            if (this.v.contains((Object)ReflectionIntrospector.COMBAT)) {
                return ReflectionIntrospector.COMBAT;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        try {
            if (this.v.contains((Object)ReflectionIntrospector.BUILDING)) {
                return ReflectionIntrospector.BUILDING;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        try {
            if (this.v.contains((Object)ReflectionIntrospector.MOVING)) {
                return ReflectionIntrospector.MOVING;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        return ReflectionIntrospector.NONE;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/I2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xBC3;
        if (h[n2] == null) {
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
                throw new RuntimeException("a/I2", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MetricComputationEngine.h[n2] = n3;
        }
        return h[n2];
    }

    @Nullable
    public static MetricsCalculator N(LightweightExecutionContext lightweightExecutionContext) {
        block8: {
            try {
                try {
                    if (!lightweightExecutionContext.Y() && lightweightExecutionContext.C().O() != 0) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetricComputationEngine.a(customSystemException);
                }
                return null;
            }
            catch (CustomSystemException customSystemException) {
                throw MetricComputationEngine.a(customSystemException);
            }
        }
        Map<Qv, Short> map = RuntimeContextResolver.j(lightweightExecutionContext);
        HashMap<Short, Short> hashMap = new HashMap<Short, Short>();
        for (Map.Entry<Qv, Short> entry : map.entrySet()) {
            Short s2 = RuntimeContextResolver.O(entry.getKey());
            try {
                if (s2 == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MetricComputationEngine.a(customSystemException);
            }
            hashMap.put(s2, entry.getValue());
        }
        return new MetricsCalculator(lightweightExecutionContext.C().O(), lightweightExecutionContext.J(), lightweightExecutionContext.b(), hashMap);
    }

    public int k(Qh qh) {
        try {
            if (qh == null) {
                return this.w;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        return qh.g();
    }

    public float j(Qh qh) {
        return this.b;
    }

    public double e(Qh qh) {
        try {
            if (qh == null) {
                return this.Z;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        return qh.y();
    }

    @Nullable
    public String h() {
        return this.e;
    }

    public void e(int n) {
        this.H.put(n, 0);
    }

    public void q(boolean bl) {
        this.r = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-8454738115559337126L, -5903234345596837903L, MethodHandles.lookup().lookupClass()).a(40699856417271L);
        j = new HashMap(13);
        long l = a ^ 0x6953513E9844L;
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
        String string = "\u00b3N\u00af\u0086*\u00ea\u000b\u009c\u0013\u009fCEy\u0094\u00e8^";
        int n2 = "\u00b3N\u00af\u0086*\u00ea\u000b\u009c\u0013\u009fCEy\u0094\u00e8^".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        d = lArray;
        h = new Integer[2];
    }

    public void G(int n) {
        this.w = n;
    }

    public int x() {
        return this.m;
    }

    public boolean v() {
        return this.M;
    }

    public int W() {
        return this.V;
    }

    public void T() {
        block40: {
            block39: {
                block38: {
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                    block36: {
                        block33: {
                            block32: {
                                block31: {
                                    block30: {
                                        int n;
                                        block29: {
                                            systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                            try {
                                                if (systemConfigurationOrchestrator.Y()) {
                                                    return;
                                                }
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw MetricComputationEngine.a(customSystemException);
                                            }
                                            n = 600;
                                            try {
                                                try {
                                                    if (systemConfigurationOrchestrator.S() == systemConfigurationOrchestrator.c() && systemConfigurationOrchestrator.q() == systemConfigurationOrchestrator.Z()) break block29;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw MetricComputationEngine.a(customSystemException);
                                                }
                                                this.A = 0;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw MetricComputationEngine.a(customSystemException);
                                            }
                                        }
                                        try {
                                            if (this.A <= n) break block30;
                                            this.A(ReflectionIntrospector.AFK);
                                            break block31;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw MetricComputationEngine.a(customSystemException);
                                        }
                                    }
                                    this.Q(ReflectionIntrospector.AFK);
                                }
                                try {
                                    if (this.H.isEmpty()) break block32;
                                    this.y(this.H.size());
                                    this.A(ReflectionIntrospector.COMBAT);
                                    this.N();
                                    break block33;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MetricComputationEngine.a(customSystemException);
                                }
                            }
                            this.Q(ReflectionIntrospector.COMBAT);
                        }
                        int n = 160;
                        ComparativeIdentifier comparativeIdentifier = this.n()[this.n()];
                        if (comparativeIdentifier != null) {
                            block35: {
                                ProtocolInteractionController protocolInteractionController;
                                block34: {
                                    protocolInteractionController = ProtocolInteractionController.d(String.valueOf(comparativeIdentifier.x()));
                                    try {
                                        try {
                                            if (!protocolInteractionController.B(ReflectionMetadataResolver.YX) || !ApplicationLifecycleManager.N().D().X()) break block34;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw MetricComputationEngine.a(customSystemException);
                                        }
                                        this.V = 0;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MetricComputationEngine.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        if (!protocolInteractionController.B(ReflectionMetadataResolver.YX) || this.V >= n) break block35;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw MetricComputationEngine.a(customSystemException);
                                    }
                                    this.A(ReflectionIntrospector.BUILDING);
                                    break block36;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MetricComputationEngine.a(customSystemException);
                                }
                            }
                            this.Q(ReflectionIntrospector.BUILDING);
                        } else {
                            this.Q(ReflectionIntrospector.BUILDING);
                        }
                    }
                    try {
                        block37: {
                            try {
                                try {
                                    if (systemConfigurationOrchestrator.G() != 0.0 || systemConfigurationOrchestrator.x() > 0.0) break block37;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw MetricComputationEngine.a(customSystemException);
                                }
                                if (systemConfigurationOrchestrator.o() == 0.0) break block38;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw MetricComputationEngine.a(customSystemException);
                            }
                        }
                        this.f = 0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetricComputationEngine.a(customSystemException);
                    }
                }
                try {
                    if (this.f >= 50) break block39;
                    this.A(ReflectionIntrospector.MOVING);
                    break block40;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetricComputationEngine.a(customSystemException);
                }
            }
            this.Q(ReflectionIntrospector.MOVING);
        }
        ++this.A;
        ++this.V;
        ++this.f;
    }

    public void t(int n) {
        this.V = n;
    }

    public boolean U() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (this.l() == null || this.h() == null) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetricComputationEngine.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetricComputationEngine.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public NumericStreamProcessor A() {
        return this.i;
    }

    public static WorkflowOrchestrator1642 z(Qh qh) {
        ServiceConfigurationResolver serviceConfigurationResolver;
        block10: {
            block9: {
                Object object2;
                serviceConfigurationResolver = new ServiceConfigurationResolver();
                serviceConfigurationResolver.o(new GeometricCalculator1977(qh.F(), qh.V(), qh.B()));
                LinkedHashMap<Short, Integer> linkedHashMap = new LinkedHashMap<Short, Integer>();
                for (Object object2 : qh.A()) {
                    V3 v3 = new V3(object2);
                    try {
                        if (v3.Y()) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetricComputationEngine.a(customSystemException);
                    }
                    ResourceAllocationManager1058 resourceAllocationManager1058 = ObjectPipelineManager.u(v3);
                    try {
                        if (resourceAllocationManager1058 == null) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw MetricComputationEngine.a(customSystemException);
                    }
                    linkedHashMap.put(resourceAllocationManager1058.G(), v3.V());
                }
                serviceConfigurationResolver.A(new c0(qh.e(), qh.K(), qh.H(), qh.b(), linkedHashMap));
                CrossPlatformIntegrator crossPlatformIntegrator = CrossPlatformIntegrator.C;
                object2 = crossPlatformIntegrator.f();
                try {
                    if (object2 == null) break block9;
                    serviceConfigurationResolver.l(new SessionTokenGenerator(((CryptographicTransformer)object2).q(), ((CryptographicTransformer)object2).e()));
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw MetricComputationEngine.a(customSystemException);
                }
            }
            serviceConfigurationResolver.l(null);
        }
        return serviceConfigurationResolver.l();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = MetricComputationEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public float k(Qh qh) {
        try {
            if (qh == null) {
                return this.p;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        return qh.H();
    }

    @Nullable
    public UUID l() {
        return this.E;
    }

    public double I(Qh qh) {
        try {
            if (qh == null) {
                return this.S;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        return qh.D();
    }

    public void N() {
        int n = 150;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.putAll(this.H);
        Set set = hashMap.keySet();
        for (Integer n2 : set) {
            try {
                if (this.H.get(n2) > n) {
                    this.H.remove(n2);
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw MetricComputationEngine.a(customSystemException);
            }
            this.H.put(n2, this.H.get(n2) + 1);
        }
    }

    public MetricComputationEngine(UserIdentityManager userIdentityManager) {
        long l = a ^ 0x6D8DCBED6072L;
        this.v = new HashSet<ReflectionIntrospector>(Arrays.asList(new ReflectionIntrospector[0]));
        this.A = 0;
        this.V = (int)MetricComputationEngine.a("c", (int)14984, (long)(0x6BE4972C442C759EL ^ l));
        this.f = (int)MetricComputationEngine.a("c", (int)5414, (long)(0x41ED3604B440DA31L ^ l));
        this.K = 0;
        this.O = new AtomicBoolean(false);
        this.H = new HashMap();
        this.b = 15.0f;
        this.y = 20.0f;
        this.p = 2.0f;
        this.w = 0;
        this.i = new NumericStreamProcessor(0.05, 0.0, 1.0);
        this.m = 0;
        this.Q = 0.0;
        this.Z = 64.0;
        this.S = 0.0;
        this.G = new ComparativeIdentifier[4];
        this.g = new ComparativeIdentifier[36];
        this.c = new LinkedHashMap<ResourceAllocationManager1058, Integer>();
        this.r = false;
        this.x = userIdentityManager;
    }

    public boolean h() {
        return this.r;
    }

    public ComparativeIdentifier[] W() {
        return this.G;
    }

    public void L(int n) {
        this.m = n;
    }

    public void P(int n) {
        this.A = n;
    }

    public void A(ReflectionIntrospector reflectionIntrospector) {
        this.v.add(reflectionIntrospector);
    }

    public int o(Qh qh) {
        try {
            if (qh == null) {
                return this.W;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw MetricComputationEngine.a(customSystemException);
        }
        return qh.b();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(MetricComputationEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

