/*
 * Decompiled with CFR 0.152.
 */
package com.event.dispatch;

import a.GC;
import a.Sc;
import a._Y;
import a.a;
import a.vM;
import a.vR;
import com.adapter.management.GenericAdapterManager;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.resources.ResourceLifecycleManager1543;
import com.app.system.configuration.ConfigurationManager1306;
import com.app.transaction.TransactionValidator2680;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.configuration.management.ConfigurationParameterController;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.reflection.ReflectionUtilityResolver910;
import com.data.transformation.TransformationEngine;
import com.exception.system.CustomSystemException;
import com.graph.structure.RecursiveNodeGraph;
import com.math.geometry.GeometryCalculator;
import com.metrics.analysis.DimensionalMetricsTracker;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.ProtocolInteractionController;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.security.crypto.CryptographicCipherProvider;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.event.SecureEventOrchestrator;
import com.security.operations.CryptographicOperationCoordinator;
import com.security.streaming.StreamCipherOrchestrator183;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.resource.AssetLoadBalancer;
import com.system.resource.ResourceAllocator1606;
import com.temporal.metadata.TemporalMetadataResolver;
import com.util.numeric.NumericFormattingUtility;
import com.utils.reflection.ReflectionUtilityResolver;
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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EventDispatchCoordinator
extends ContextualExecutionFramework
implements TransactionValidator2680 {
    private boolean Z;
    private static final Integer[] o;
    private final NetworkConfigManager v;
    private String[] n;
    private static final Map B;
    private static final String[] X;
    private static final Object[] F;
    private boolean V;
    private final StreamCipherOrchestrator183 r;
    private SecureEventOrchestrator x;
    private final List<Integer> m;
    private String[] j;
    private final AuthenticationStateTracker P;
    private final NumericFormattingUtility K;
    private final Queue<DimensionalMetricsTracker> l;
    private String[] t;
    private static final long[] h;
    private boolean w;
    private final GenericAdapterManager e;
    private final NetworkConfigManager G;
    private boolean R;
    private final CryptographicCipherProvider L;
    private static final long b;
    private final AuthenticationStateTracker A;
    private boolean T;
    private String[] N;
    private final AuthenticationGateway1860 O;
    private final AuthenticationGateway1860 z;
    private final NetworkConfigManager d;

    private void L() {
        Object object;
        ObjectLifecycleTracker objectLifecycleTracker;
        this.V();
        this.m.clear();
        Sc sc = (Sc)this.r.J();
        ResourceAllocator1606 resourceAllocator1606 = ApplicationLifecycleManager.U().t();
        for (vM vM2 : this.K()) {
            ResourceLifecycleManager1543 resourceLifecycleManager1543;
            block57: {
                try {
                    if (ReflectionUtilityResolver910.v.equals(vM2.A().i())) {
                        this.m.add(vM2.i());
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                resourceLifecycleManager1543 = resourceAllocator1606.T(vM2.i());
                objectLifecycleTracker = resourceLifecycleManager1543.y();
                try {
                    if (((LightweightExecutionContext)objectLifecycleTracker).Y()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                try {
                    try {
                        if (vM2 instanceof vR) break block57;
                        if (!vM2.A().Z((LightweightExecutionContext)objectLifecycleTracker)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    if (!vM2.d((LightweightExecutionContext)objectLifecycleTracker)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
            }
            if (!(object = this.y(resourceAllocator1606, resourceLifecycleManager1543, vM2)).isEmpty()) {
                ResourceLifecycleManager1543 resourceLifecycleManager15432 = (ResourceLifecycleManager1543)object.get(0);
                try {
                    if (resourceLifecycleManager15432.G() != resourceLifecycleManager1543.G()) continue;
                    this.m.add(vM2.i());
                    continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
            }
            try {
                if (!(vM2 instanceof vR)) continue;
                this.m.add(vM2.i());
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        for (vM vM2 : this.K()) {
            Object object2;
            block66: {
                int n;
                block67: {
                    int n2;
                    block65: {
                        boolean bl;
                        block64: {
                            block62: {
                                int n3;
                                block61: {
                                    block60: {
                                        List<ResourceLifecycleManager1543> list;
                                        boolean bl2;
                                        block58: {
                                            block59: {
                                                n = vM2.i();
                                                objectLifecycleTracker = resourceAllocator1606.T(n);
                                                object = ((ResourceLifecycleManager1543)objectLifecycleTracker).y();
                                                bl2 = false;
                                                list = this.y(resourceAllocator1606, (ResourceLifecycleManager1543)objectLifecycleTracker, vM2);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (!((ObjectLifecycleTracker)object).r() || !((LightweightExecutionContext)object).C().r()) break block58;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw EventDispatchCoordinator.a(customSystemException);
                                                            }
                                                            if (!vM2.A().Z((LightweightExecutionContext)object)) break block59;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw EventDispatchCoordinator.a(customSystemException);
                                                        }
                                                        if (!vM2.d((LightweightExecutionContext)object)) break block59;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw EventDispatchCoordinator.a(customSystemException);
                                                    }
                                                    if (list.size() <= 1) continue;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw EventDispatchCoordinator.a(customSystemException);
                                                }
                                                try {
                                                    if (((ResourceLifecycleManager1543)objectLifecycleTracker).G() == list.get(0).G()) {
                                                        continue;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw EventDispatchCoordinator.a(customSystemException);
                                                }
                                                object2 = list.get(0);
                                                Comparator<LightweightExecutionContext> comparator = vM2.r().V();
                                                try {
                                                    if (vM2.r().equals(CryptographicOperationCoordinator.a)) {
                                                        continue;
                                                    }
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw EventDispatchCoordinator.a(customSystemException);
                                                }
                                                if (comparator != null) {
                                                    n2 = comparator.compare(((ResourceLifecycleManager1543)objectLifecycleTracker).y(), ((ResourceLifecycleManager1543)object2).y());
                                                    try {
                                                        if (n2 >= 0) {
                                                            this.m.add(vM2.i());
                                                            continue;
                                                        }
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw EventDispatchCoordinator.a(customSystemException);
                                                    }
                                                }
                                            }
                                            if (!(vM2 instanceof vR)) {
                                                object2 = sc.m(((ResourceLifecycleManager1543)objectLifecycleTracker).y());
                                                try {
                                                    try {
                                                        try {
                                                            if (object2 == null || !object2.d(((ResourceLifecycleManager1543)objectLifecycleTracker).y())) break block58;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw EventDispatchCoordinator.a(customSystemException);
                                                        }
                                                        if (((ReflectionUtilityResolver)object2).z() != GC.MOVE) break block58;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw EventDispatchCoordinator.a(customSystemException);
                                                    }
                                                    ConfigurationManager1306.M(((ResourceLifecycleManager1543)objectLifecycleTracker).G(), resourceAllocator1606.D(), this.l);
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw EventDispatchCoordinator.a(customSystemException);
                                                }
                                            }
                                        }
                                        if (list.isEmpty() || ((ObjectLifecycleTracker)(object2 = list.get(0))).equals(objectLifecycleTracker)) continue;
                                        this.m.add(vM2.i());
                                        int n4 = 0;
                                        if (((ObjectLifecycleTracker)object).r()) {
                                            n4 += ((LightweightExecutionContext)object).D();
                                        }
                                        try {
                                            try {
                                                if (bl2 || this.N((ResourceLifecycleManager1543)objectLifecycleTracker)) break block60;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw EventDispatchCoordinator.a(customSystemException);
                                            }
                                            n3 = 1;
                                            break block61;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw EventDispatchCoordinator.a(customSystemException);
                                        }
                                    }
                                    n3 = 0;
                                }
                                n2 = n3;
                                try {
                                    block63: {
                                        try {
                                            try {
                                                if (!this.z(vM2)) break block62;
                                                if (((ResourceLifecycleManager1543)object2).G() < 36) break block63;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw EventDispatchCoordinator.a(customSystemException);
                                            }
                                            if (!(vM2 instanceof vR)) break block62;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw EventDispatchCoordinator.a(customSystemException);
                                        }
                                    }
                                    bl = true;
                                    break block64;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw EventDispatchCoordinator.a(customSystemException);
                                }
                            }
                            bl = false;
                        }
                        boolean bl3 = bl;
                        try {
                            if (!bl3) break block65;
                            ConfigurationManager1306.M(((ResourceLifecycleManager1543)object2).G(), resourceAllocator1606.D(), this.l);
                            break block66;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchCoordinator.a(customSystemException);
                        }
                    }
                    try {
                        if (n2 == 0) break block67;
                        ConfigurationManager1306.W(((ResourceLifecycleManager1543)object2).G(), n, resourceAllocator1606.D(), this.l);
                        break block66;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                }
                ConfigurationManager1306.U(((ResourceLifecycleManager1543)object2).G(), n, resourceAllocator1606.D(), this.l);
            }
            this.m.add(((ResourceLifecycleManager1543)object2).G());
        }
    }

    private boolean F() {
        block7: {
            block9: {
                ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
                block8: {
                    SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
                    try {
                        if (secureEventOrchestrator.r()) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    try {
                        if (this.l.isEmpty() || !secureEventOrchestrator.Y()) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().R();
                    try {
                        if (GeometryCalculator.C() < 35) break block8;
                        OutputEncoder.p(connectionPoolOrchestrator1192);
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                }
                OutputEncoder.f(connectionPoolOrchestrator1192, true);
                OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
            }
            this.T = true;
            this.d.m();
            return true;
        }
        return false;
    }

    private void y() {
        AssetLoadBalancer assetLoadBalancer = ApplicationLifecycleManager.U().l();
        try {
            if (_Y.g().r()) {
                this.l.clear();
                ConfigurationManager1306.e(0, this.l);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        Sc sc = (Sc)this.r.J();
        ResourceAllocator1606 resourceAllocator1606 = ApplicationLifecycleManager.U().t();
        try {
            if (sc.D().isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        ArrayList<ResourceLifecycleManager1543> arrayList = new ArrayList<ResourceLifecycleManager1543>();
        for (ResourceLifecycleManager1543 object : resourceAllocator1606.D()) {
            arrayList.add(object);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ResourceLifecycleManager1543 resourceLifecycleManager1543 : arrayList) {
            ReflectionUtilityResolver reflectionUtilityResolver;
            block29: {
                LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
                if (lightweightExecutionContext.Y()) continue;
                try {
                    if (lightweightExecutionContext.C().Y()) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                reflectionUtilityResolver = sc.m(lightweightExecutionContext);
                if (reflectionUtilityResolver == null) continue;
                try {
                    if (!reflectionUtilityResolver.d(lightweightExecutionContext)) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                try {
                    if (resourceLifecycleManager1543.G() < 36 || resourceLifecycleManager1543.G() > 44) break block29;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                vM vM2 = sc.e(resourceLifecycleManager1543.G() - 36);
                try {
                    try {
                        if (vM2.A().Z(lightweightExecutionContext) && vM2.d(lightweightExecutionContext)) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
            }
            try {
                if (this.m.contains(resourceLifecycleManager1543.G())) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
            try {
                if (reflectionUtilityResolver.z() == GC.REMOVE) {
                    ConfigurationManager1306.X(resourceLifecycleManager1543.G(), resourceAllocator1606.D(), this.l);
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
            try {
                if (reflectionUtilityResolver.z() != GC.CONDENSE) continue;
                linkedHashMap.computeIfAbsent(reflectionUtilityResolver, EventDispatchCoordinator::lambda$getFilterClicks$1).add(resourceLifecycleManager1543);
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        this.R(linkedHashMap, resourceAllocator1606.D());
    }

    @Override
    public void h() {
        try {
            this.d();
            if (this.e.J() == this.z) {
                this.V = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Au" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean z(vM vM2) {
        ResourceAllocator1606 resourceAllocator1606;
        ObjectLifecycleTracker objectLifecycleTracker;
        if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) {
            objectLifecycleTracker = new TransformationEngine(ApplicationLifecycleManager.X());
            resourceAllocator1606 = ((TransformationEngine)objectLifecycleTracker).R();
        } else {
            resourceAllocator1606 = ApplicationLifecycleManager.U().t();
        }
        if (vM2 instanceof vR) {
            objectLifecycleTracker = resourceAllocator1606.T(vM2.i());
            return ((ResourceLifecycleManager1543)objectLifecycleTracker).y().Y();
        }
        for (int i = 0; i < 9; ++i) {
            boolean bl;
            block9: {
                block8: {
                    ResourceLifecycleManager1543 resourceLifecycleManager1543 = resourceAllocator1606.T(36 + i);
                    try {
                        try {
                            if (!resourceLifecycleManager1543.y().Y()) continue;
                            if (i != vM2.T()) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchCoordinator.a(customSystemException);
                        }
                        bl = true;
                        break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    private boolean L() {
        SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
        try {
            if (!secureEventOrchestrator.B(ReflectionMetadataResolver.FJ)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        TransformationEngine transformationEngine = new TransformationEngine(secureEventOrchestrator);
        ResourceAllocator1606 resourceAllocator1606 = transformationEngine.R();
        for (int i = 9; i < 36; ++i) {
            ResourceLifecycleManager1543 resourceLifecycleManager1543 = resourceAllocator1606.T(i);
            LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
            try {
                if (!lightweightExecutionContext.Y()) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        return false;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EventDispatchCoordinator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EventDispatchCoordinator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public boolean I() {
        boolean bl;
        block10: {
            block8: {
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    if (!this.Z() || this.l.isEmpty()) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw EventDispatchCoordinator.a(customSystemException);
                                }
                                if (this.A.s().booleanValue()) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDispatchCoordinator.a(customSystemException);
                            }
                            if (!ApplicationLifecycleManager.X().Y()) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchCoordinator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'G' || c == '\u00d4' || c == 'A' || c == '\u00a5') {
                field = EventDispatchCoordinator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'G' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EventDispatchCoordinator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n = EventDispatchCoordinator.a(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = X[n];
                int n3 = string2.indexOf(8);
                clazz3 = EventDispatchCoordinator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EventDispatchCoordinator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EventDispatchCoordinator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        EventDispatchCoordinator.F[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EventDispatchCoordinator.b(260013590553743L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EventDispatchCoordinator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EventDispatchCoordinator.F[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EventDispatchCoordinator.b(260013590553743L, 0L);
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6831;
        if (o[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])B.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    B.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Au", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EventDispatchCoordinator.o[n2] = n3;
        }
        return o[n2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EventDispatchCoordinator.a(l, l2);
            object = F[n];
            try {
                if (!(object instanceof String)) break block2;
                EventDispatchCoordinator.F[n] = clazz = Class.forName(X[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public boolean u() {
        try {
            if (this.z.o()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        return super.u();
    }

    public EventDispatchCoordinator() {
        long l = b ^ 0x30CEF6F98B66L;
        super(a.cs((int)EventDispatchCoordinator.a("d", (int)24643, (long)(0x2D711C1FA39CFAE3L ^ l))), (int)EventDispatchCoordinator.a("d", (int)27765, (long)(0x3B1A98B4865476D9L ^ l)), RecursiveNodeGraph.W, a.cs((int)EventDispatchCoordinator.a("d", (int)8101, (long)(0xE1A0E58B330517L ^ l))));
        this.K = NumericFormattingUtility.P(this, (String)((Object)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)17274, (long)(0x5B0C0F169B51D9C9L ^ l)), (long)-967968860865482791L, (long)l)), (String)((Object)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)25474, (long)(0x4922B5413A3F926L ^ l)), (long)-967968860865482791L, (long)l)), "", 50.0, 100.0, 150.0, 300.0);
        this.z = new AuthenticationGateway1860((String)((Object)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)30904, (long)(0x49A2726610FEE20DL ^ l)), (long)-967968860865482791L, (long)l)));
        this.O = new AuthenticationGateway1860((String)((Object)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)26208, (long)(0x35CF99BC86367CC6L ^ l)), (long)-967968860865482791L, (long)l)));
        this.e = GenericAdapterManager.D(this, (String)((Object)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)23362, (long)(0x39816C4521F9C1F2L ^ l)), (long)-967968860865482791L, (long)l)), this.z, this.z, this.O);
        this.A = AuthenticationStateTracker.R(this, (String)((Object)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)30003, (long)(0x3DCC39DACDAFEF87L ^ l)), (long)-967968860865482791L, (long)l)), true, (String)((Object)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)9714, (long)(0x973E6FF7177BF5FL ^ l)), (long)-967968860865482791L, (long)l)));
        this.P = AuthenticationStateTracker.w(this, (String)((Object)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)3752, (long)(0x1B689456A9549407L ^ l)), (long)-967968860865482791L, (long)l)), false);
        this.r = StreamCipherOrchestrator183.U(this, (String)((Object)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)7041, (long)(0x599C0F96F085012AL ^ l)), (long)-967968860865482791L, (long)l)));
        this.l = new ConcurrentLinkedQueue<DimensionalMetricsTracker>();
        this.m = new ArrayList<Integer>();
        this.v = new NetworkConfigManager();
        this.d = new NetworkConfigManager();
        this.G = new NetworkConfigManager();
        this.V = false;
        this.w = false;
        this.L = new CryptographicCipherProvider(20);
        this.Z = false;
        this.x = null;
        this.e.l((ConfigurationProfileResolver)this.A, this.O);
        this.e.l((ConfigurationProfileResolver)this.P, this.O);
        this.N(this.e, this.A, this.P, this.K, this.r);
        this.N = new String[]{EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)14242, (long)(0x63F3139BB07FAD0BL ^ l)), (long)-967968860865482791L, (long)l), EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)7694, (long)(0x21C434168BB684A0L ^ l)), (long)-967968860865482791L, (long)l)};
        this.t = new String[]{EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)2898, (long)(0x7D2156251EB891F5L ^ l)), (long)-967968860865482791L, (long)l), EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)25653, (long)(0x36079A8F4657FE9FL ^ l)), (long)-967968860865482791L, (long)l)};
        this.j = new String[]{EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)13941, (long)(0x31EAD3F89A8BACC4L ^ l)), (long)-967968860865482791L, (long)l), EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)966, (long)(0x20934A43BD8E9963L ^ l)), (long)-967968860865482791L, (long)l)};
        this.n = new String[]{EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)9704, (long)(0x6C43658DB2B9BF49L ^ l)), (long)-967968860865482791L, (long)l)};
    }

    private void o(boolean bl) {
        block18: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block17: {
                systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                LightweightExecutionContext lightweightExecutionContext = _Y.g();
                try {
                    try {
                        try {
                            if (this.w || !lightweightExecutionContext.r()) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchCoordinator.a(customSystemException);
                        }
                        if (!this.y()) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    this.R = false;
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
            }
            try {
                if (this.e.J() == this.z) {
                    this.T(false);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
            try {
                block19: {
                    try {
                        try {
                            try {
                                if (!bl || ApplicationLifecycleManager.X().Y()) break block18;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDispatchCoordinator.a(customSystemException);
                            }
                            if (this.e.J() == this.z) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchCoordinator.a(customSystemException);
                        }
                        if (!this.A.s().booleanValue()) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                }
                systemConfigurationOrchestrator.E();
                this.R = false;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        this.l.clear();
        this.v.m();
        this.m.clear();
        this.R = false;
    }

    @Override
    public void v() {
        this.d();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = EventDispatchCoordinator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EventDispatchCoordinator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private Collection<vM> K() {
        ArrayList<vM> arrayList = new ArrayList<vM>(((Sc)this.r.J()).w());
        try {
            if (((Sc)this.r.J()).D.o()) {
                arrayList.add(new vR(0));
                arrayList.add(new vR(1));
                arrayList.add(new vR(2));
                arrayList.add(new vR(3));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        return arrayList;
    }

    private static boolean lambda$condenseInventory$2(ResourceLifecycleManager1543 resourceLifecycleManager1543) {
        boolean bl;
        block5: {
            block4: {
                LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
                try {
                    try {
                        if (!lightweightExecutionContext.Y() && lightweightExecutionContext.J() < lightweightExecutionContext.D()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private boolean M() {
        block12: {
            block13: {
                SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
                try {
                    try {
                        try {
                            try {
                                if (!secureEventOrchestrator.r() || !secureEventOrchestrator.B(ReflectionMetadataResolver.FJ)) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDispatchCoordinator.a(customSystemException);
                            }
                            if (this.l.isEmpty()) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchCoordinator.a(customSystemException);
                        }
                        if (this.d.m(200 + ThreadLocalRandom.current().nextInt(200))) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
            }
            if (this.v.m((long)this.K.l())) {
                DimensionalMetricsTracker dimensionalMetricsTracker = this.l.poll();
                try {
                    if (dimensionalMetricsTracker != null) {
                        dimensionalMetricsTracker.H();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                this.v.m();
            }
            return true;
        }
        return false;
    }

    private int B(LightweightExecutionContext lightweightExecutionContext) {
        ConfigurationParameterController configurationParameterController = TemporalMetadataResolver.h.x().V(lightweightExecutionContext);
        for (String string : this.n) {
            try {
                if (!configurationParameterController.Z().toLowerCase().contains(string)) continue;
                return 8;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        for (String string : this.j) {
            try {
                if (!configurationParameterController.Z().toLowerCase().contains(string)) continue;
                return 7;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        for (String string : this.t) {
            try {
                if (!configurationParameterController.Z().toLowerCase().contains(string)) continue;
                return 6;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        for (String string : this.N) {
            try {
                if (!configurationParameterController.Z().toLowerCase().contains(string)) continue;
                return 5;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        return -1;
    }

    private static int lambda$getOtherValid$0(Comparator comparator, ResourceLifecycleManager1543 resourceLifecycleManager1543, ResourceLifecycleManager1543 resourceLifecycleManager15432) {
        return comparator.compare(resourceLifecycleManager1543.y(), resourceLifecycleManager15432.y());
    }

    @Override
    public String t() {
        block4: {
            long l = b ^ 0x1CEA69A49534L;
            try {
                try {
                    if (!this.P.s().booleanValue() || !this.L.b()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                return DynamicContextBroker.u + (String)((Object)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)30513, (long)(0x5EFE61173ADAF3C0L ^ l)), (long)-1386201212174192245L, (long)l));
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        return super.t();
    }

    private int X(int n, boolean bl) {
        int n2 = -1;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        LightweightExecutionContext lightweightExecutionContext = systemConfigurationOrchestrator.t().T(n).y();
        double d2 = 0.0;
        double d3 = 999.0;
        if (lightweightExecutionContext.r()) {
            d2 = RuntimeResourceTracker.i(lightweightExecutionContext);
            d3 = this.L(n);
        }
        double d4 = d2;
        double d5 = d3;
        int n3 = 9;
        while (true) {
            block12: {
                try {
                    if (n3 >= 45) break;
                    if (!systemConfigurationOrchestrator.t().T(n3).y().r()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                LightweightExecutionContext lightweightExecutionContext2 = systemConfigurationOrchestrator.t().T(n3).y();
                try {
                    if (this.B(lightweightExecutionContext2) == -1 || this.B(lightweightExecutionContext2) != n) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                double d6 = RuntimeResourceTracker.i(lightweightExecutionContext2);
                double d7 = this.L(n3);
                if (d6 > d4) {
                    d4 = d6;
                    n2 = n3;
                    d5 = d7;
                } else {
                    try {
                        try {
                            if (!bl || d6 != d4) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchCoordinator.a(customSystemException);
                        }
                        if (!(d7 < d5)) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    d5 = d7;
                    n2 = n3;
                }
            }
            ++n3;
        }
        return n2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EventDispatchCoordinator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public StreamCipherOrchestrator183 H() {
        return this.r;
    }

    private void R(Map<ReflectionUtilityResolver, List<ResourceLifecycleManager1543>> map, int n) {
        for (Map.Entry<ReflectionUtilityResolver, List<ResourceLifecycleManager1543>> entry : map.entrySet()) {
            ReflectionUtilityResolver reflectionUtilityResolver = entry.getKey();
            List<ResourceLifecycleManager1543> list = entry.getValue();
            try {
                list.removeIf(EventDispatchCoordinator::lambda$condenseInventory$2);
                if (list.size() <= 1) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
            list.sort(EventDispatchCoordinator::lambda$condenseInventory$3);
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            block13: for (int i = 0; i < list.size(); ++i) {
                ResourceLifecycleManager1543 resourceLifecycleManager1543 = list.get(i);
                LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
                int n2 = lightweightExecutionContext.J();
                try {
                    if (arrayList.contains(resourceLifecycleManager1543.G())) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                for (int j = i + 1; j < list.size(); ++j) {
                    ResourceLifecycleManager1543 resourceLifecycleManager15432 = list.get(j);
                    try {
                        if (resourceLifecycleManager1543.G() == resourceLifecycleManager15432.G()) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    LightweightExecutionContext lightweightExecutionContext2 = resourceLifecycleManager15432.y();
                    int n3 = lightweightExecutionContext2.J();
                    try {
                        if (!lightweightExecutionContext.C().equals(lightweightExecutionContext2.C())) {
                            continue;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    int n4 = n2 + n3;
                    int n5 = lightweightExecutionContext.D();
                    try {
                        if (n4 <= n5) {
                            arrayList.add(resourceLifecycleManager15432.G());
                            ConfigurationManager1306.U(resourceLifecycleManager15432.G(), resourceLifecycleManager1543.G(), n, this.l);
                            continue block13;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    int n6 = n5 - n2;
                    try {
                        ConfigurationManager1306.k(resourceLifecycleManager15432.G(), resourceLifecycleManager1543.G(), n, this.l);
                        ConfigurationManager1306.k(resourceLifecycleManager1543.G(), resourceLifecycleManager15432.G(), n, this.l);
                        ConfigurationManager1306.k(resourceLifecycleManager15432.G(), resourceLifecycleManager1543.G(), n, this.l);
                        if (n6 != 0) continue;
                        continue block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EventDispatchCoordinator.b = MultiContainerRegistry.a(-1651626449023237999L, 5007017325173103489L, MethodHandles.lookup().lookupClass()).a(219574382175565L);
                EventDispatchCoordinator.F = new Object[5];
                EventDispatchCoordinator.X = new String[5];
                EventDispatchCoordinator.a();
                EventDispatchCoordinator.B = new HashMap<K, V>(13);
                var0 = EventDispatchCoordinator.b ^ 98745476717378L;
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
                var8_3 = new long[22];
                var5_4 = 0;
                var6_5 = "\u00ef\u009c\u00d3\n.\u00dc\u00d7\u00b4iO\u00d7W\u0083kx?\u00e1\u00cev\u0093\u00cf\u00d0\u00e9#B\u0089\u008ah\u00f6\u0007\u00e4\u0080\u0090\u00be\fS\u0002\u00bb\u00da\u00f0\u00bc\u00ae[v\u0087\u00c3Z\u00a4R\u008f\u0006\u00f2\u00b6\u0015\u00a1@\u001d\u0017\u0000n\u0000\u00d4?\u00b0\u00ecZ-\u00f0\u0089\u00bcT6\u00b6E\u008cz\u00e7'\u0089\u00de{\u00c2\u0081\u00cd\u00b3[_\n\u00caW\u001f\u00f5(\u00be\u00e15\u00857\u000b\u0098\u00b5Z\u0017\u00c7\u00ce\u0091n\u0094\u00c3\"\u0002\u0018\u000f\n\u00d74\u0000\u0016~m\u00a0_\u00d84\u001b\u001a\u00c6\u00cc\u00f3\u00bbP\u00d5<\u001e,\u00c9c\u0095\u00c5\u00f1\u009e\u00d1\u00a1\u00152\u00c2\u0002\u00c6\u0095\u00af\u00eb6\u0014\u00e8\u00d9R0\u0093Jh";
                var7_6 = "\u00ef\u009c\u00d3\n.\u00dc\u00d7\u00b4iO\u00d7W\u0083kx?\u00e1\u00cev\u0093\u00cf\u00d0\u00e9#B\u0089\u008ah\u00f6\u0007\u00e4\u0080\u0090\u00be\fS\u0002\u00bb\u00da\u00f0\u00bc\u00ae[v\u0087\u00c3Z\u00a4R\u008f\u0006\u00f2\u00b6\u0015\u00a1@\u001d\u0017\u0000n\u0000\u00d4?\u00b0\u00ecZ-\u00f0\u0089\u00bcT6\u00b6E\u008cz\u00e7'\u0089\u00de{\u00c2\u0081\u00cd\u00b3[_\n\u00caW\u001f\u00f5(\u00be\u00e15\u00857\u000b\u0098\u00b5Z\u0017\u00c7\u00ce\u0091n\u0094\u00c3\"\u0002\u0018\u000f\n\u00d74\u0000\u0016~m\u00a0_\u00d84\u001b\u001a\u00c6\u00cc\u00f3\u00bbP\u00d5<\u001e,\u00c9c\u0095\u00c5\u00f1\u009e\u00d1\u00a1\u00152\u00c2\u0002\u00c6\u0095\u00af\u00eb6\u0014\u00e8\u00d9R0\u0093Jh".length();
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
                    var6_5 = "\u00ce\u00f3}c\u008d@q\u00da\u0099~\u00f5\u0004\u00f3\u00cb\u00f0X";
                    var7_6 = "\u00ce\u00f3}c\u008d@q\u00da\u0099~\u00f5\u0004\u00f3\u00cb\u00f0X".length();
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
        EventDispatchCoordinator.h = var8_3;
        EventDispatchCoordinator.o = new Integer[22];
    }

    private static void a() {
        Object[] objectArray = F;
        F[0] = "\u000ekj";
        objectArray[1] = Integer.TYPE;
        EventDispatchCoordinator.X[1] = "java/lang/Integer";
        objectArray[2] = "\b!P!\u007f}\u0003.An\u0002e\u0010)H'";
        objectArray[3] = "\u0015C\u000b_\u0017\u0013\u001eL\u001a\u0010v\u001d\u0015G\u001eJ";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\fV\rG\f'V\u0013\t:V71T[C\u00025\u0000\u0007\u0001SQL\b\u000b\f\u0007\f\"\b\u0016W@=";
    }

    private int L(int n) {
        int n2;
        SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
        try {
            n2 = systemConfigurationOrchestrator.t().T(n).y().r() ? systemConfigurationOrchestrator.t().T(n).y().b() : 999;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        return n2;
    }

    private boolean t() {
        try {
            if (this.e.J() != this.O) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        try {
            if (this.A.s().booleanValue()) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
        try {
            if (this.x == null) {
                this.x = secureEventOrchestrator;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        try {
            if (!this.x.equals(secureEventOrchestrator)) {
                this.Z = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        try {
            if (this.Z) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        this.x = secureEventOrchestrator;
        return false;
    }

    private static List lambda$getFilterClicks$1(ReflectionUtilityResolver reflectionUtilityResolver) {
        return new ArrayList();
    }

    private boolean N(ResourceLifecycleManager1543 resourceLifecycleManager1543) {
        LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
        return lightweightExecutionContext.Y();
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private boolean y() {
        SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
        try {
            if (!secureEventOrchestrator.B(ReflectionMetadataResolver.FJ)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        TransformationEngine transformationEngine = new TransformationEngine(secureEventOrchestrator);
        ResourceAllocator1606 resourceAllocator1606 = transformationEngine.R();
        for (int i = 9; i < 36; ++i) {
            ResourceLifecycleManager1543 resourceLifecycleManager1543 = resourceAllocator1606.T(i);
            LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
            try {
                if (!lightweightExecutionContext.Y()) continue;
                ConfigurationManager1306.k(i, 0, resourceAllocator1606.D(), this.l);
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        return false;
    }

    private void V() {
        AssetLoadBalancer assetLoadBalancer = ApplicationLifecycleManager.U().l();
        try {
            if (_Y.g().Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        try {
            if (this.L()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
        try {
            if (secureEventOrchestrator.Y()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        TransformationEngine transformationEngine = new TransformationEngine(secureEventOrchestrator);
        ResourceAllocator1606 resourceAllocator1606 = transformationEngine.R();
        LightweightExecutionContext lightweightExecutionContext = _Y.g();
        boolean bl = false;
        for (vM vM2 : this.K()) {
            try {
                if (!vM2.A().Z(lightweightExecutionContext) || !vM2.d(lightweightExecutionContext)) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
            ResourceLifecycleManager1543 resourceLifecycleManager1543 = resourceAllocator1606.T(vM2.i());
            Comparator<LightweightExecutionContext> comparator = vM2.r().V();
            try {
                if (vM2.r().equals(CryptographicOperationCoordinator.a)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
            if (comparator != null) {
                int n = comparator.compare(resourceLifecycleManager1543.y(), lightweightExecutionContext);
                try {
                    if (n >= 0) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
            }
            bl = true;
            break;
        }
        try {
            if (!bl) {
                this.l.clear();
                ConfigurationManager1306.e(0, this.l);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (X[n4] != null) {
            return n4;
        }
        Object object = F[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 5;
                break;
            }
            case 1: {
                n3 = 9;
                break;
            }
            case 2: {
                n3 = 44;
                break;
            }
            case 3: {
                n3 = 51;
                break;
            }
            case 4: {
                n3 = 15;
                break;
            }
            case 5: {
                n3 = 26;
                break;
            }
            case 6: {
                n3 = 18;
                break;
            }
            case 7: {
                n3 = 29;
                break;
            }
            case 8: {
                n3 = 61;
                break;
            }
            case 9: {
                n3 = 37;
                break;
            }
            case 10: {
                n3 = 43;
                break;
            }
            case 11: {
                n3 = 55;
                break;
            }
            case 12: {
                n3 = 48;
                break;
            }
            case 13: {
                n3 = 57;
                break;
            }
            case 14: {
                n3 = 10;
                break;
            }
            case 15: {
                n3 = 1;
                break;
            }
            case 16: {
                n3 = 24;
                break;
            }
            case 17: {
                n3 = 17;
                break;
            }
            case 18: {
                n3 = 52;
                break;
            }
            case 19: {
                n3 = 39;
                break;
            }
            case 20: {
                n3 = 27;
                break;
            }
            case 21: {
                n3 = 11;
                break;
            }
            case 22: {
                n3 = 59;
                break;
            }
            case 23: {
                n3 = 8;
                break;
            }
            case 24: {
                n3 = 7;
                break;
            }
            case 25: {
                n3 = 28;
                break;
            }
            case 26: {
                n3 = 38;
                break;
            }
            case 27: {
                n3 = 42;
                break;
            }
            case 28: {
                n3 = 32;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 2;
                break;
            }
            case 31: {
                n3 = 19;
                break;
            }
            case 32: {
                n3 = 25;
                break;
            }
            case 33: {
                n3 = 4;
                break;
            }
            case 34: {
                n3 = 40;
                break;
            }
            case 35: {
                n3 = 45;
                break;
            }
            case 36: {
                n3 = 50;
                break;
            }
            case 37: {
                n3 = 33;
                break;
            }
            case 38: {
                n3 = 62;
                break;
            }
            case 39: {
                n3 = 47;
                break;
            }
            case 40: {
                n3 = 35;
                break;
            }
            case 41: {
                n3 = 12;
                break;
            }
            case 42: {
                n3 = 54;
                break;
            }
            case 43: {
                n3 = 6;
                break;
            }
            case 44: {
                n3 = 20;
                break;
            }
            case 45: {
                n3 = 21;
                break;
            }
            case 46: {
                n3 = 14;
                break;
            }
            case 47: {
                n3 = 36;
                break;
            }
            case 48: {
                n3 = 23;
                break;
            }
            case 49: {
                n3 = 60;
                break;
            }
            case 50: {
                n3 = 56;
                break;
            }
            case 51: {
                n3 = 3;
                break;
            }
            case 52: {
                n3 = 30;
                break;
            }
            case 53: {
                n3 = 34;
                break;
            }
            case 54: {
                n3 = 49;
                break;
            }
            case 55: {
                n3 = 58;
                break;
            }
            case 56: {
                n3 = 13;
                break;
            }
            case 57: {
                n3 = 63;
                break;
            }
            case 58: {
                n3 = 22;
                break;
            }
            case 59: {
                n3 = 16;
                break;
            }
            case 60: {
                n3 = 46;
                break;
            }
            case 61: {
                n3 = 0;
                break;
            }
            case 62: {
                n3 = 31;
                break;
            }
            default: {
                n3 = 41;
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
        EventDispatchCoordinator.X[n4] = new String(cArray);
        return n4;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private boolean i() {
        block10: {
            try {
                try {
                    if (!TemporalMetadataResolver.h.U().Z(EventDispatchCoordinator.class) && !TemporalMetadataResolver.h.a().p()) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                this.l.clear();
                this.v.m();
                this.m.clear();
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        try {
            if (ApplicationLifecycleManager.U().M().G()) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        Sc sc = (Sc)this.r.J();
        try {
            if (sc == null) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        return false;
    }

    @Override
    public boolean Y() {
        boolean bl;
        try {
            bl = this.e.J() == this.z;
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        return bl;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EventDispatchCoordinator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field c(long l, long l2) {
        int n = EventDispatchCoordinator.a(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            String string = X[n];
            int n2 = string.indexOf(8);
            Class clazz = EventDispatchCoordinator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EventDispatchCoordinator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EventDispatchCoordinator.a(clazz3, string2, clazz2)) != null) {
                    EventDispatchCoordinator.F[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EventDispatchCoordinator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EventDispatchCoordinator.F[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EventDispatchCoordinator.b(260013590553743L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    @DataExchangeProtocol2090
    public void b(CryptoKeyManagementSystem var1_1) {
        block63: {
            block60: {
                block62: {
                    block61: {
                        block58: {
                            block57: {
                                block59: {
                                    block56: {
                                        block55: {
                                            block53: {
                                                block54: {
                                                    var2_2 = EventDispatchCoordinator.b ^ 96003547723931L;
                                                    try {
                                                        if (this.i()) {
                                                            return;
                                                        }
                                                    }
                                                    catch (CustomSystemException v0) {
                                                        throw EventDispatchCoordinator.a(v0);
                                                    }
                                                    try {
                                                        if (this.q()) {
                                                            return;
                                                        }
                                                    }
                                                    catch (CustomSystemException v1) {
                                                        throw EventDispatchCoordinator.a(v1);
                                                    }
                                                    try {
                                                        if (this.t()) {
                                                            return;
                                                        }
                                                    }
                                                    catch (CustomSystemException v2) {
                                                        throw EventDispatchCoordinator.a(v2);
                                                    }
                                                    try {
                                                        try {
                                                            if (!this.R) break block53;
                                                            if (!this.G.m(200 + ThreadLocalRandom.current().nextInt(200))) break block54;
                                                        }
                                                        catch (CustomSystemException v3) {
                                                            throw EventDispatchCoordinator.a(v3);
                                                        }
                                                        this.o(true);
                                                    }
                                                    catch (CustomSystemException v4) {
                                                        throw EventDispatchCoordinator.a(v4);
                                                    }
                                                }
                                                return;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (this.e.J() != this.O || !this.P.s().booleanValue()) break block55;
                                                    }
                                                    catch (CustomSystemException v5) {
                                                        throw EventDispatchCoordinator.a(v5);
                                                    }
                                                    this.L.a(var1_1.getPlayer());
                                                    if (!this.L.b()) break block55;
                                                }
                                                catch (CustomSystemException v6) {
                                                    throw EventDispatchCoordinator.a(v6);
                                                }
                                                this.V = false;
                                                this.u();
                                                this.d.m();
                                                return;
                                            }
                                            catch (CustomSystemException v7) {
                                                throw EventDispatchCoordinator.a(v7);
                                            }
                                        }
                                        try {
                                            try {
                                                if (this.e.J() != this.O || !this.l.isEmpty()) break block56;
                                            }
                                            catch (CustomSystemException v8) {
                                                throw EventDispatchCoordinator.a(v8);
                                            }
                                            this.V = true;
                                        }
                                        catch (CustomSystemException v9) {
                                            throw EventDispatchCoordinator.a(v9);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (!this.M()) break block57;
                                                if (!this.l.isEmpty()) break block58;
                                            }
                                            catch (CustomSystemException v10) {
                                                throw EventDispatchCoordinator.a(v10);
                                            }
                                            this.L();
                                            this.V = false;
                                            if (!this.l.isEmpty()) break block59;
                                        }
                                        catch (CustomSystemException v11) {
                                            throw EventDispatchCoordinator.a(v11);
                                        }
                                        this.y();
                                    }
                                    catch (CustomSystemException v12) {
                                        throw EventDispatchCoordinator.a(v12);
                                    }
                                }
                                try {
                                    if (!this.l.isEmpty()) ** GOTO lbl102
                                    this.u();
                                }
                                catch (CustomSystemException v13) {
                                    throw EventDispatchCoordinator.a(v13);
                                }
                            }
                            try {
                                try {
                                    if (this.V) break block58;
                                    this.V();
                                    if (!this.l.isEmpty()) break block58;
                                }
                                catch (CustomSystemException v14) {
                                    throw EventDispatchCoordinator.a(v14);
                                }
                                this.u();
                                return;
                            }
                            catch (CustomSystemException v15) {
                                throw EventDispatchCoordinator.a(v15);
                            }
                        }
                        try {
                            try {
                                if (!this.V) break block60;
                                this.L();
                                this.V = false;
                                if (!this.l.isEmpty()) break block61;
                            }
                            catch (CustomSystemException v16) {
                                throw EventDispatchCoordinator.a(v16);
                            }
                            this.y();
                        }
                        catch (CustomSystemException v17) {
                            throw EventDispatchCoordinator.a(v17);
                        }
                    }
                    try {
                        if (this.l.isEmpty()) {
                            this.Z = true;
                        }
                    }
                    catch (CustomSystemException v18) {
                        throw EventDispatchCoordinator.a(v18);
                    }
                    try {
                        if (this.e.J() != this.O) break block62;
                        break block60;
                    }
                    catch (CustomSystemException v19) {
                        throw EventDispatchCoordinator.a(v19);
                    }
                }
                try {
                    if (this.l.isEmpty()) {
                        this.u();
                        TemporalMetadataResolver.h.c().L((String)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)26834, (long)(385534121128755597L ^ var2_2)), (long)-9120788781189080028L, (long)var2_2), (String)EventDispatchCoordinator.c("Q", (int)EventDispatchCoordinator.a("d", (int)2677, (long)(2583870377450529568L ^ var2_2)), (long)-9120788781189080028L, (long)var2_2), 4000L);
                        return;
                    }
                }
                catch (CustomSystemException v20) {
                    throw EventDispatchCoordinator.a(v20);
                }
            }
            try {
                try {
                    try {
                        if (this.e.J() != this.z && !this.A.s().booleanValue()) break block63;
                    }
                    catch (CustomSystemException v21) {
                        throw EventDispatchCoordinator.a(v21);
                    }
                    if (!this.F()) break block63;
                }
                catch (CustomSystemException v22) {
                    throw EventDispatchCoordinator.a(v22);
                }
                return;
            }
            catch (CustomSystemException v23) {
                throw EventDispatchCoordinator.a(v23);
            }
        }
    }

    private void d() {
        this.v.m();
        this.l.clear();
        this.m.clear();
        this.R = false;
        this.T = false;
        this.w = false;
    }

    private List<ResourceLifecycleManager1543> y(ResourceAllocator1606 resourceAllocator1606, ResourceLifecycleManager1543 resourceLifecycleManager1543, vM vM2) {
        ProtocolInteractionController protocolInteractionController;
        Object object;
        List<ResourceLifecycleManager1543> list;
        block18: {
            list = resourceAllocator1606.D();
            if (vM2 instanceof vR) {
                int n = vM2.i();
                int n2 = this.X(n, false);
                try {
                    try {
                        if (n2 == -1 || this.m.contains(n2)) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    return Collections.singletonList(list.get(n2));
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
            }
        }
        ArrayList<ResourceLifecycleManager1543> arrayList = new ArrayList<ResourceLifecycleManager1543>();
        LightweightExecutionContext lightweightExecutionContext = null;
        int n = 9;
        while (true) {
            block20: {
                block19: {
                    try {
                        try {
                            if (n >= list.size()) break;
                            if (!this.m.contains(n)) break block19;
                            break block20;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchCoordinator.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                }
                object = resourceAllocator1606.T(n);
                LightweightExecutionContext lightweightExecutionContext2 = ((ResourceLifecycleManager1543)object).y();
                try {
                    try {
                        if (!lightweightExecutionContext2.r() || !vM2.A().Z(lightweightExecutionContext2)) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                    if (!vM2.d(lightweightExecutionContext2)) break block20;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventDispatchCoordinator.a(customSystemException);
                }
                lightweightExecutionContext = lightweightExecutionContext2;
                arrayList.add((ResourceLifecycleManager1543)object);
            }
            ++n;
        }
        if (lightweightExecutionContext != null && (protocolInteractionController = lightweightExecutionContext.C()).r()) {
            object = vM2.r().V();
            try {
                if (object != null) {
                    arrayList.sort((arg_0, arg_1) -> EventDispatchCoordinator.lambda$getOtherValid$0((Comparator)object, arg_0, arg_1));
                    Collections.reverse(arrayList);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        return arrayList;
    }

    private boolean q() {
        block8: {
            SecureEventOrchestrator secureEventOrchestrator = ApplicationLifecycleManager.X();
            try {
                block9: {
                    try {
                        try {
                            try {
                                if (this.l.isEmpty() || !this.T) break block8;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventDispatchCoordinator.a(customSystemException);
                            }
                            if (secureEventOrchestrator.Y()) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventDispatchCoordinator.a(customSystemException);
                        }
                        if (secureEventOrchestrator.B(ReflectionMetadataResolver.FJ)) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventDispatchCoordinator.a(customSystemException);
                    }
                }
                this.w = true;
                this.o(false);
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw EventDispatchCoordinator.a(customSystemException);
            }
        }
        return false;
    }

    private void u() {
        this.R = true;
        this.G.m();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Au" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int lambda$condenseInventory$3(ResourceLifecycleManager1543 resourceLifecycleManager1543, ResourceLifecycleManager1543 resourceLifecycleManager15432) {
        int n;
        int n2;
        LightweightExecutionContext lightweightExecutionContext = resourceLifecycleManager1543.y();
        LightweightExecutionContext lightweightExecutionContext2 = resourceLifecycleManager15432.y();
        try {
            n2 = lightweightExecutionContext.Y() ? 0 : lightweightExecutionContext.J();
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        try {
            n = lightweightExecutionContext2.Y() ? 0 : lightweightExecutionContext2.J();
        }
        catch (CustomSystemException customSystemException) {
            throw EventDispatchCoordinator.a(customSystemException);
        }
        return Integer.compare(n2, n);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EventDispatchCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(EventDispatchCoordinator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

