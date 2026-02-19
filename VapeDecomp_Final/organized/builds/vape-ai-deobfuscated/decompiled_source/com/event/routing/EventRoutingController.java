/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.event.routing;

import a.V3;
import a.a;
import com.adapter.management.GenericAdapterManager;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.app.resources.ResourceLifecycleManager1543;
import com.app.transaction.TransactionValidator2680;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.collections.sequence.IntegerSequenceManager;
import com.communication.protocol.DataExchangeProtocol2090;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.event.management.EventDispatchCoordinator1090;
import com.exception.system.CustomSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.geometry.GeometryCalculator;
import com.network.configuration.NetworkConfigManager;
import com.network.protocol.ProtocolInteractionController;
import com.network.streaming.DataStreamProcessor1233;
import com.output.processing.OutputEncoder;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.security.authentication.AuthenticationGateway1860;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.monitoring.RuntimeResourceTracker;
import com.system.pipeline.ObjectPipelineManager;
import com.system.resource.ResourceAllocationManager1058;
import com.system.resource.ResourceAllocator1647;
import com.temporal.metadata.TemporalMetadataResolver;
import com.util.numeric.NumericFormattingUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EventRoutingController
extends ContextualExecutionFramework
implements TransactionValidator2680 {
    private final ColorPaletteManager N;
    private final NumericFormattingUtility m;
    private static final Integer[] v;
    private static final Map w;
    private final AuthenticationStateTracker G;
    private final AuthenticationGateway1860 T;
    private final AuthenticationStateTracker j;
    private final NetworkConfigManager r;
    private final Queue<Integer> e;
    private boolean L;
    private final AuthenticationGateway1860 h;
    private LightweightExecutionContext F;
    private LightweightExecutionContext R;
    private final AuthenticationStateTracker A;
    private LightweightExecutionContext Y;
    private static final String[] z;
    private final AuthenticationStateTracker n;
    private static final long[] d;
    private static final long b;
    private LightweightExecutionContext[] o;
    private LightweightExecutionContext t;
    private final GenericAdapterManager O;
    private final AuthenticationStateTracker l;
    private static final Object[] x;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public ColorPaletteManager I() {
        return this.N;
    }

    private boolean t(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (!lightweightExecutionContext.C().B(ReflectionMetadataResolver.Fl)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventRoutingController.a(customSystemException);
        }
        DataStreamProcessor1233 dataStreamProcessor1233 = new DataStreamProcessor1233(lightweightExecutionContext.C());
        List<V3> list = dataStreamProcessor1233.g(lightweightExecutionContext);
        for (V3 v3 : list) {
            ResourceAllocationManager1058 resourceAllocationManager1058 = ObjectPipelineManager.u(v3);
            try {
                if (!resourceAllocationManager1058.l()) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw EventRoutingController.a(customSystemException);
            }
        }
        return false;
    }

    /*
     * Could not resolve type clashes
     * Loose catch block
     */
    private boolean U() {
        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
        block25: {
            block27: {
                ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
                block26: {
                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) break block25;
                    try {
                        block29: {
                            if (!this.A.s().booleanValue()) break block25;
                            break block29;
                            catch (Exception exception) {
                                throw EventRoutingController.a(exception);
                            }
                        }
                        if (this.O.J() != this.h) break block25;
                    }
                    catch (Exception exception) {
                        throw EventRoutingController.a(exception);
                    }
                    connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().R();
                    try {
                        if (GeometryCalculator.C() < 35) break block26;
                        OutputEncoder.p(connectionPoolOrchestrator1192);
                        break block27;
                    }
                    catch (Exception exception) {
                        throw EventRoutingController.a(exception);
                    }
                }
                OutputEncoder.f(connectionPoolOrchestrator1192, true);
                OutputEncoder.r(connectionPoolOrchestrator1192, false, false);
            }
            return false;
        }
        try {
            if (systemConfigurationOrchestrator.t().Y()) {
                return false;
            }
        }
        catch (Exception exception) {
            throw EventRoutingController.a(exception);
        }
        List<ResourceLifecycleManager1543> list = systemConfigurationOrchestrator.t().D();
        list.sort(Comparator.comparingInt(this::w));
        this.o = this.O();
        this.t = this.e(list, ReflectionMetadataResolver.Yx, Comparator.comparingDouble(DynamicContextBroker::S));
        this.R = this.e(list, ReflectionMetadataResolver.tZ, Comparator.comparingDouble(DynamicContextBroker::q));
        this.F = this.e(list, ReflectionMetadataResolver.U6, Comparator.comparingDouble(DynamicContextBroker::y));
        this.Y = this.e(list, ReflectionMetadataResolver.EL, Comparator.comparingDouble(DynamicContextBroker::S));
        HashMap hashMap = new HashMap();
        block20: for (Object object : systemConfigurationOrchestrator.t().D()) {
            try {
                if (!((ResourceLifecycleManager1543)object).H() || ((ResourceLifecycleManager1543)object).y().Y()) continue;
                for (Object object2 : systemConfigurationOrchestrator.l().G()) {
                    try {
                        if (object2 == null || !object2.equals(((ResourceLifecycleManager1543)object).y())) continue;
                        continue block20;
                    }
                    catch (Exception exception) {
                        throw EventRoutingController.a(exception);
                    }
                }
                try {
                    if (!this.S(((ResourceLifecycleManager1543)object).y())) continue;
                    this.A(((ResourceLifecycleManager1543)object).G());
                }
                catch (Exception exception) {
                    throw EventRoutingController.a(exception);
                }
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        try {
            block22: for (Object object : hashMap.entrySet()) {
                IntegerSequenceManager integerSequenceManager = (IntegerSequenceManager)object.getValue();
                integerSequenceManager.l();
                List<Integer> list2 = integerSequenceManager.S();
                if (list2.size() <= 0) continue;
                int n = IntegerSequenceManager.Q(integerSequenceManager);
                while (true) {
                    block28: {
                        if (n >= list2.size()) continue block22;
                        try {
                            block30: {
                                if (n <= 0) break block28;
                                break block30;
                                catch (Exception exception) {
                                    throw EventRoutingController.a(exception);
                                }
                            }
                            this.A(list2.get(n));
                        }
                        catch (Exception exception) {
                            throw EventRoutingController.a(exception);
                        }
                    }
                    ++n;
                    continue;
                    break;
                }
            }
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
        return true;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EventRoutingController.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EventRoutingController.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = EventRoutingController.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EventRoutingController.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private int w(ResourceLifecycleManager1543 resourceLifecycleManager1543) {
        block14: {
            int n;
            block13: {
                block12: {
                    n = resourceLifecycleManager1543.G();
                    try {
                        try {
                            if (n < 36 || n > 44) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventRoutingController.a(customSystemException);
                        }
                        return 0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventRoutingController.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (n < 9 || n > 17) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventRoutingController.a(customSystemException);
                    }
                    return 1;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventRoutingController.a(customSystemException);
                }
            }
            try {
                try {
                    if (n < 18 || n > 26) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventRoutingController.a(customSystemException);
                }
                return 2;
            }
            catch (CustomSystemException customSystemException) {
                throw EventRoutingController.a(customSystemException);
            }
        }
        return 3;
    }

    private static double z(LightweightExecutionContext lightweightExecutionContext) {
        block5: {
            int n = 0;
            try {
                if (lightweightExecutionContext.Y()) {
                    return n;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventRoutingController.a(customSystemException);
            }
            try {
                if (!lightweightExecutionContext.C().r() || !RuntimeResourceTracker.l(lightweightExecutionContext.C())) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw EventRoutingController.a(customSystemException);
            }
            n = (int)RuntimeResourceTracker.r(lightweightExecutionContext);
        }
        return n += EventDispatchCoordinator1090.b(new LightweightExecutionContext[]{lightweightExecutionContext}, ResourceAllocator1647.G(ApplicationLifecycleManager.U()));
    }

    @Override
    public void S() {
        long l = b ^ 0x48753DD673D5L;
        this.N.J((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)25871, (long)(0x5E42DE4A6CAB97E9L ^ l)), (long)-3085693762478381681L, (long)l)), -1);
        this.N.J((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)7139, (long)(0x1D33422B6D18E917L ^ l)), (long)-3085693762478381681L, (long)l)), -1);
        this.N.J((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)12457, (long)(0x5D7C441349474242L ^ l)), (long)-3085693762478381681L, (long)l)), -1);
        this.N.J((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)19011, (long)(0x4A42799C2256B8A4L ^ l)), (long)-3085693762478381681L, (long)l)), -1);
        this.N.J((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)975, (long)(0xB644E473477F136L ^ l)), (long)-3085693762478381681L, (long)l)), -1);
        this.N.J((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)7769, (long)(0x5139E86CAC376CBBL ^ l)), (long)-3085693762478381681L, (long)l)), -1);
        this.N.J((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)32353, (long)(0x7B4B2EC680418C97L ^ l)), (long)-3085693762478381681L, (long)l)), -1);
        this.N.J((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)1547, (long)(0x2499EC7A921874F1L ^ l)), (long)-3085693762478381681L, (long)l)), -1);
        this.N.J((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)6413, (long)(0x7CC257698082EBF5L ^ l)), (long)-3085693762478381681L, (long)l)), -1);
    }

    public static double G(LightweightExecutionContext lightweightExecutionContext) {
        double d2 = EventRoutingController.z(lightweightExecutionContext);
        d2 += (double)EventDispatchCoordinator1090.c(32, lightweightExecutionContext);
        d2 += (double)EventDispatchCoordinator1090.c(16, lightweightExecutionContext);
        d2 += (double)EventDispatchCoordinator1090.c(19, lightweightExecutionContext);
        d2 += (double)EventDispatchCoordinator1090.c(20, lightweightExecutionContext);
        d2 += (double)EventDispatchCoordinator1090.c(48, lightweightExecutionContext);
        return d2 += (double)EventDispatchCoordinator1090.c(34, lightweightExecutionContext);
    }

    @Override
    public boolean Y() {
        boolean bl;
        try {
            bl = this.O.J() == this.h;
        }
        catch (CustomSystemException customSystemException) {
            throw EventRoutingController.a(customSystemException);
        }
        return bl;
    }

    private boolean S(LightweightExecutionContext lightweightExecutionContext) {
        boolean bl;
        block50: {
            block49: {
                int n;
                ProtocolInteractionController protocolInteractionController;
                block51: {
                    block40: {
                        int n2;
                        block46: {
                            block45: {
                                block39: {
                                    protocolInteractionController = lightweightExecutionContext.C();
                                    if (RuntimeResourceTracker.l(protocolInteractionController)) {
                                        n = RuntimeResourceTracker.q(lightweightExecutionContext);
                                        try {
                                            try {
                                                if (this.o[n] == null || this.o[n].equals(lightweightExecutionContext)) break block39;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw EventRoutingController.a(customSystemException);
                                            }
                                            return true;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw EventRoutingController.a(customSystemException);
                                        }
                                    }
                                }
                                n = 1;
                                try {
                                    block42: {
                                        try {
                                            try {
                                                block44: {
                                                    try {
                                                        try {
                                                            block43: {
                                                                try {
                                                                    try {
                                                                        block41: {
                                                                            try {
                                                                                try {
                                                                                    if (!this.l.s().booleanValue()) break block40;
                                                                                    if (!protocolInteractionController.B(ReflectionMetadataResolver.U6)) break block41;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw EventRoutingController.a(customSystemException);
                                                                                }
                                                                                if (!this.F.equals(lightweightExecutionContext)) break block42;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw EventRoutingController.a(customSystemException);
                                                                            }
                                                                        }
                                                                        if (!protocolInteractionController.B(ReflectionMetadataResolver.tZ)) break block43;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw EventRoutingController.a(customSystemException);
                                                                    }
                                                                    if (!this.R.equals(lightweightExecutionContext)) break block42;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw EventRoutingController.a(customSystemException);
                                                                }
                                                            }
                                                            if (!RuntimeResourceTracker.a(protocolInteractionController)) break block44;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw EventRoutingController.a(customSystemException);
                                                        }
                                                        if (!this.t.equals(lightweightExecutionContext)) break block42;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw EventRoutingController.a(customSystemException);
                                                    }
                                                }
                                                if (!protocolInteractionController.B(ReflectionMetadataResolver.EL)) break block45;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw EventRoutingController.a(customSystemException);
                                            }
                                            if (this.Y.equals(lightweightExecutionContext)) break block45;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw EventRoutingController.a(customSystemException);
                                        }
                                    }
                                    n2 = 1;
                                    break block46;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw EventRoutingController.a(customSystemException);
                                }
                            }
                            n2 = 0;
                        }
                        n = n2;
                        break block51;
                    }
                    n = 0;
                }
                try {
                    block47: {
                        try {
                            try {
                                try {
                                    block48: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (this.N.b(lightweightExecutionContext, true) || n != 0) break block47;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw EventRoutingController.a(customSystemException);
                                                    }
                                                    if (!this.G.s().booleanValue()) break block48;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw EventRoutingController.a(customSystemException);
                                                }
                                                if (!protocolInteractionController.B(ReflectionMetadataResolver.bO)) break block48;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw EventRoutingController.a(customSystemException);
                                            }
                                            if (!protocolInteractionController.B(ReflectionMetadataResolver.Fn)) break block47;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw EventRoutingController.a(customSystemException);
                                        }
                                    }
                                    if (!this.j.s().booleanValue()) break block49;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw EventRoutingController.a(customSystemException);
                                }
                                if (!protocolInteractionController.B(ReflectionMetadataResolver.Fl)) break block49;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventRoutingController.a(customSystemException);
                            }
                            if (!this.t(lightweightExecutionContext)) break block49;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventRoutingController.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block50;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventRoutingController.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EventRoutingController.a(l, l2);
            object = x[n];
            try {
                if (!(object instanceof String)) break block2;
                EventRoutingController.x[n] = clazz = Class.forName(z[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void y(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        try {
            if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) {
                systemConfigurationOrchestrator.E();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventRoutingController.a(customSystemException);
        }
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
                                    if (!this.Z() || !this.L) break block8;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw EventRoutingController.a(customSystemException);
                                }
                                if (this.A.s().booleanValue()) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventRoutingController.a(customSystemException);
                            }
                            if (!ApplicationLifecycleManager.X().Y()) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventRoutingController.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventRoutingController.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public EventRoutingController() {
        long l = b ^ 0x4B07FCC485D0L;
        super(a.cs((int)EventRoutingController.a("z", (int)23555, (long)(0x73A4D3C309D7D8F6L ^ l))), (int)EventRoutingController.a("z", (int)22216, (long)(0x5521AF34CF11D201L ^ l)), RecursiveNodeGraph.W, a.cs((int)EventRoutingController.a("z", (int)11245, (long)(0x1EB1ED016A322F1AL ^ l))));
        this.e = new ArrayDeque<Integer>();
        this.r = new NetworkConfigManager();
        this.m = NumericFormattingUtility.y(this, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)27448, (long)(0x2744EB3514A5EFD9L ^ l)), (long)2533392085562987402L, (long)l)), (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)16050, (long)(0x19D293AF12FE3A44L ^ l)), (long)2533392085562987402L, (long)l)), "", 1.0, 100.0, 120.0, 200.0, 1.0);
        this.l = AuthenticationStateTracker.R(this, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)6469, (long)(0x1235EDB4558B9DBDL ^ l)), (long)2533392085562987402L, (long)l)), true, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)16824, (long)(0xFD80A59E3384557L ^ l)), (long)2533392085562987402L, (long)l)));
        this.j = AuthenticationStateTracker.R(this, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)14432, (long)(0x48D520941B56BC88L ^ l)), (long)2533392085562987402L, (long)l)), true, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)16105, (long)(0x71918307BF503A0CL ^ l)), (long)2533392085562987402L, (long)l)));
        this.G = AuthenticationStateTracker.R(this, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)14653, (long)(0x2710A6233EF4BDD4L ^ l)), (long)2533392085562987402L, (long)l)), true, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)27362, (long)(0x73F0BBF863706E18L ^ l)), (long)2533392085562987402L, (long)l)));
        this.A = AuthenticationStateTracker.R(this, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)13079, (long)(0x1B0816C9F0A837FAL ^ l)), (long)2533392085562987402L, (long)l)), true, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)10975, (long)(0x51743B91DEFA2E2BL ^ l)), (long)2533392085562987402L, (long)l)));
        this.n = AuthenticationStateTracker.R(this, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)7530, (long)(0x70C93DBFD6E71998L ^ l)), (long)2533392085562987402L, (long)l)), true, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)22207, (long)(0x50B25B946BC3D259L ^ l)), (long)2533392085562987402L, (long)l)));
        this.N = ColorPaletteManager.o(this, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)32468, (long)(0x4417E559496CFA3FL ^ l)), (long)2533392085562987402L, (long)l)), (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)3375, (long)(0x7F161FE8DDA989C5L ^ l)), (long)2533392085562987402L, (long)l)), ColorPaletteManager.g, Collections.emptyList());
        this.h = new AuthenticationGateway1860((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)2323, (long)(0x767DB945C7940DF3L ^ l)), (long)2533392085562987402L, (long)l)));
        this.T = new AuthenticationGateway1860((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)30959, (long)(0x5F28B5E4167CFC1FL ^ l)), (long)2533392085562987402L, (long)l)));
        this.O = GenericAdapterManager.D(this, (String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)15798, (long)(0x27502A14063E394FL ^ l)), (long)2533392085562987402L, (long)l)), this.h, this.h, this.T);
        this.q(false);
        this.O.l(this.A, this.n);
        this.O.l((ConfigurationProfileResolver)this.A, this.h);
        this.O.l((ConfigurationProfileResolver)this.n, this.T);
        this.N(this.O, this.m, this.A, this.n, this.l, this.j, this.G, this.N);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EventRoutingController.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x27C0;
        if (v[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])w.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    w.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ag", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EventRoutingController.v[n2] = n3;
        }
        return v[n2];
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'C' || c == '\u00d9' || c == '\u00db' || c == 'S') {
                field = EventRoutingController.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'C' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d9' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EventRoutingController.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cf' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ag" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = x;
        x[0] = "\u0012yM";
        objectArray[1] = Integer.TYPE;
        EventRoutingController.z[1] = "java/lang/Integer";
        objectArray[2] = "p\n\u001dk\u0006\u0017{\u0005\f${\u000fh\u0002\u0005m";
        objectArray[3] = "\u0013Et+~y\u0018Jed\u001fw\u0013Aa>";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0005\u0002\u0019WG]X\u001b^;I\u001fe\u001aXW\u001d^TP\u0001V\"]\u0006\u001b\u0007@[\u0003\t]\u0007;";
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EventRoutingController.b = MultiContainerRegistry.a(384996652581676529L, -6414559055331649748L, MethodHandles.lookup().lookupClass()).a(144887515663425L);
                EventRoutingController.x = new Object[5];
                EventRoutingController.z = new String[5];
                EventRoutingController.a();
                EventRoutingController.w = new HashMap<K, V>(13);
                var0 = EventRoutingController.b ^ 96707504826981L;
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
                var8_3 = new long[33];
                var5_4 = 0;
                var6_5 = "I\u001a\u0081\u00f6\u0016G7}\u0098\u009d4\u008f\u0086\u00eb.J\u001f>\u00d9\u001c5n\u00a9\u00c5\u00da\u00e3\u0088\u00a5\u0002n\u00da\u00bbGr`\u0011\u00f6\u0014J\u00e0nB\u00c4\u00beaF\u00bc\u0080\u0000\u0091\n1\u00ab\u00c6\u008a\u0082\u008d\u0086\u001c\u00b6!\u009d\u00a7\u00c3\u0085\u008e\u00c6=\u00bb\f-\u0086\u00a3\u00a2\u0005\u00b6\u00b4\u00bf&)\f\u00a1U2\u00f0\u0099\u00a7;\u00d9\u00c3X\u0016\"\u001f]\u001d\u00bfk\u00b5=\u00e6\u008f\u0007\u009b?\u00fdnhI\u00fc\u008c\u0005U\u009a.\u00e2\n\u00dazx\u008b`\u0017\u001dmI\u00bd\u0014\u0091LQ \u00d3\u00cf\u00e5\u0014\u00fd\u00b0\u00b6\b\u00ac\u0099H\u00c3\u00ac\u00a0\u0000\n=\u00eb\u00c8!\u00df\u0081\u009a\u001a\u0097y\u00f5\u008a\"\u009a\u0004\u00dd\u009f\u0086Tk2\u00de\u00ef\u00cc\u00f6\u00db\u00b2\u00a5<\u00c6\b\u00d1s]\u00e1\u00e7\u00c5a=\u00efJ&h?\u00aa\u00d5\u00a9\u00bc-\u00fa\u0093\u0006W\u00d4\u009f\u00dd\rsg|g\u00d2\u00c9\u0016%\t!\u00cb@s\u00a0&\u00cew\u0099+\u0090RwU\u00d4\u00f6\u0099X\u00b5\u00a6k\u0096\u0093\u0081\u00eb\b\u000f*\u009cFb\u0002lh";
                var7_6 = "I\u001a\u0081\u00f6\u0016G7}\u0098\u009d4\u008f\u0086\u00eb.J\u001f>\u00d9\u001c5n\u00a9\u00c5\u00da\u00e3\u0088\u00a5\u0002n\u00da\u00bbGr`\u0011\u00f6\u0014J\u00e0nB\u00c4\u00beaF\u00bc\u0080\u0000\u0091\n1\u00ab\u00c6\u008a\u0082\u008d\u0086\u001c\u00b6!\u009d\u00a7\u00c3\u0085\u008e\u00c6=\u00bb\f-\u0086\u00a3\u00a2\u0005\u00b6\u00b4\u00bf&)\f\u00a1U2\u00f0\u0099\u00a7;\u00d9\u00c3X\u0016\"\u001f]\u001d\u00bfk\u00b5=\u00e6\u008f\u0007\u009b?\u00fdnhI\u00fc\u008c\u0005U\u009a.\u00e2\n\u00dazx\u008b`\u0017\u001dmI\u00bd\u0014\u0091LQ \u00d3\u00cf\u00e5\u0014\u00fd\u00b0\u00b6\b\u00ac\u0099H\u00c3\u00ac\u00a0\u0000\n=\u00eb\u00c8!\u00df\u0081\u009a\u001a\u0097y\u00f5\u008a\"\u009a\u0004\u00dd\u009f\u0086Tk2\u00de\u00ef\u00cc\u00f6\u00db\u00b2\u00a5<\u00c6\b\u00d1s]\u00e1\u00e7\u00c5a=\u00efJ&h?\u00aa\u00d5\u00a9\u00bc-\u00fa\u0093\u0006W\u00d4\u009f\u00dd\rsg|g\u00d2\u00c9\u0016%\t!\u00cb@s\u00a0&\u00cew\u0099+\u0090RwU\u00d4\u00f6\u0099X\u00b5\u00a6k\u0096\u0093\u0081\u00eb\b\u000f*\u009cFb\u0002lh".length();
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
                    var6_5 = "w\u00d1\u00ec6.\u007f;V\u00eb\u001d\u0017;L\u00bd\u009e;";
                    var7_6 = "w\u00d1\u00ec6.\u007f;V\u00eb\u001d\u0017;L\u00bd\u009e;".length();
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
        EventRoutingController.d = var8_3;
        EventRoutingController.v = new Integer[33];
    }

    @DataExchangeProtocol2090
    public void x(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
        block50: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block49: {
                block48: {
                    block46: {
                        block47: {
                            block45: {
                                block43: {
                                    block41: {
                                        block42: {
                                            block40: {
                                                try {
                                                    try {
                                                        if (!TemporalMetadataResolver.h.U().Z(EventRoutingController.class) && !TemporalMetadataResolver.h.a().p()) break block40;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw EventRoutingController.a(customSystemException);
                                                    }
                                                    this.L = false;
                                                    return;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw EventRoutingController.a(customSystemException);
                                                }
                                            }
                                            systemConfigurationOrchestrator = cryptoKeyManagementSystem.getThePlayer();
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (this.L) break block41;
                                                                if (!this.U()) break block42;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw EventRoutingController.a(customSystemException);
                                                            }
                                                            if (this.L) break block42;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw EventRoutingController.a(customSystemException);
                                                        }
                                                        if (this.O.J() != this.h) break block42;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw EventRoutingController.a(customSystemException);
                                                    }
                                                    this.T(false);
                                                    if (!this.A.s().booleanValue()) break block42;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw EventRoutingController.a(customSystemException);
                                                }
                                                this.y(systemConfigurationOrchestrator);
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw EventRoutingController.a(customSystemException);
                                            }
                                        }
                                        return;
                                    }
                                    try {
                                        block44: {
                                            try {
                                                try {
                                                    try {
                                                        if (this.O.J() != this.T || !this.n.s().booleanValue()) break block43;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw EventRoutingController.a(customSystemException);
                                                    }
                                                    if (!ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) break block44;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw EventRoutingController.a(customSystemException);
                                                }
                                                if (!systemConfigurationOrchestrator.M().G()) break block43;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw EventRoutingController.a(customSystemException);
                                            }
                                        }
                                        return;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw EventRoutingController.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (!this.L || !this.A.s().booleanValue()) break block45;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw EventRoutingController.a(customSystemException);
                                        }
                                        if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) break block45;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw EventRoutingController.a(customSystemException);
                                    }
                                    this.m();
                                    return;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw EventRoutingController.a(customSystemException);
                                }
                            }
                            try {
                                if (this.e.isEmpty()) break block46;
                                if (!this.r.m((long)this.m.l())) break block47;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EventRoutingController.a(customSystemException);
                            }
                            this.r.m();
                            int n = this.e.poll();
                            ApplicationLifecycleManager.n().e(systemConfigurationOrchestrator.t().D(), n, 0, 0, systemConfigurationOrchestrator);
                        }
                        return;
                    }
                    try {
                        try {
                            if (this.O.J() != this.h) break block48;
                            this.T(false);
                            if (!this.A.s().booleanValue()) break block49;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EventRoutingController.a(customSystemException);
                        }
                        this.y(systemConfigurationOrchestrator);
                        break block49;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventRoutingController.a(customSystemException);
                    }
                }
                this.L = false;
            }
            try {
                try {
                    try {
                        if (!systemConfigurationOrchestrator.M().G() || !ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.bN)) break block50;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EventRoutingController.a(customSystemException);
                    }
                    if (this.O.J() != this.h) break block50;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventRoutingController.a(customSystemException);
                }
                this.T(false);
            }
            catch (CustomSystemException customSystemException) {
                throw EventRoutingController.a(customSystemException);
            }
        }
    }

    @Override
    public void x(JsonObject jsonObject) {
        long l = b ^ 0x1B1AC3926D50L;
        super.x(jsonObject);
        if (jsonObject.get((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)18849, (long)(0x2166D1CE08EA5DFL ^ l)), (long)-3771700156717434102L, (long)l))) != null) {
            JsonArray jsonArray = jsonObject.get((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)29294, (long)(0x65844C4DA041E02L ^ l)), (long)-3771700156717434102L, (long)l))).getAsJsonArray();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)16650, (long)(0x63CCAAE57D882D71L ^ l)), (long)-3771700156717434102L, (long)l)), this.N.x());
            jsonObject2.add((String)((Object)EventRoutingController.c("\u00cf", (int)EventRoutingController.a("z", (int)10353, (long)(0x1B1F62139678C415L ^ l)), (long)-3771700156717434102L, (long)l)), (JsonElement)jsonArray);
            this.N.C(jsonObject2);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ag" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = EventRoutingController.a(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            String string = z[n];
            int n2 = string.indexOf(8);
            Class clazz = EventRoutingController.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EventRoutingController.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EventRoutingController.a(clazz3, string2, clazz2)) != null) {
                    EventRoutingController.x[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EventRoutingController.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EventRoutingController.x[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EventRoutingController.b(242146533060387L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EventRoutingController.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l, long l2) {
        int n = EventRoutingController.a(l, l2);
        Object object = x[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = z[n];
                int n3 = string2.indexOf(8);
                clazz3 = EventRoutingController.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EventRoutingController.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EventRoutingController.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        EventRoutingController.x[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EventRoutingController.b(242146533060387L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EventRoutingController.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EventRoutingController.x[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EventRoutingController.b(242146533060387L, 0L);
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

    private void A(int n) {
        try {
            if (this.e.contains(n)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EventRoutingController.a(customSystemException);
        }
        this.e.add(n);
        this.e.add(-999);
        this.L = true;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private LightweightExecutionContext e(List<ResourceLifecycleManager1543> list, Class<?> clazz, Comparator<LightweightExecutionContext> comparator) {
        LightweightExecutionContext lightweightExecutionContext;
        ArrayList<LightweightExecutionContext> arrayList = new ArrayList<LightweightExecutionContext>();
        for (ResourceLifecycleManager1543 resourceLifecycleManager1543 : list) {
            try {
                if (!resourceLifecycleManager1543.H()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventRoutingController.a(customSystemException);
            }
            LightweightExecutionContext lightweightExecutionContext2 = resourceLifecycleManager1543.y();
            try {
                if (lightweightExecutionContext2.Y()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EventRoutingController.a(customSystemException);
            }
            try {
                if (!lightweightExecutionContext2.C().B(clazz)) continue;
                arrayList.add(lightweightExecutionContext2);
            }
            catch (CustomSystemException customSystemException) {
                throw EventRoutingController.a(customSystemException);
            }
        }
        try {
            Collections.reverse(arrayList);
            arrayList.sort(comparator);
            Collections.reverse(arrayList);
            lightweightExecutionContext = arrayList.isEmpty() ? null : (LightweightExecutionContext)arrayList.get(0);
        }
        catch (CustomSystemException customSystemException) {
            throw EventRoutingController.a(customSystemException);
        }
        return lightweightExecutionContext;
    }

    @Override
    public void h() {
        this.e.clear();
        this.L = false;
    }

    private LightweightExecutionContext[] O() {
        LightweightExecutionContext[] lightweightExecutionContextArray = new LightweightExecutionContext[4];
        ArrayList<LightweightExecutionContext> arrayList = new ArrayList<LightweightExecutionContext>();
        List<ResourceLifecycleManager1543> list = ApplicationLifecycleManager.U().t().D();
        for (ResourceLifecycleManager1543 objectLifecycleTracker : list) {
            try {
                try {
                    if (!objectLifecycleTracker.H() || !RuntimeResourceTracker.l(objectLifecycleTracker.y().C())) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventRoutingController.a(customSystemException);
                }
                arrayList.add(objectLifecycleTracker.y());
            }
            catch (CustomSystemException customSystemException) {
                throw EventRoutingController.a(customSystemException);
            }
        }
        for (LightweightExecutionContext lightweightExecutionContext : arrayList) {
            int n = RuntimeResourceTracker.q(lightweightExecutionContext);
            LightweightExecutionContext lightweightExecutionContext2 = lightweightExecutionContextArray[n];
            try {
                try {
                    if (lightweightExecutionContext2 != null && !(EventRoutingController.z(lightweightExecutionContext) > EventRoutingController.z(lightweightExecutionContext2))) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw EventRoutingController.a(customSystemException);
                }
                lightweightExecutionContextArray[n] = lightweightExecutionContext;
            }
            catch (CustomSystemException customSystemException) {
                throw EventRoutingController.a(customSystemException);
            }
        }
        return lightweightExecutionContextArray;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (z[n4] != null) {
            return n4;
        }
        Object object = x[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 44;
                break;
            }
            case 1: {
                n3 = 22;
                break;
            }
            case 2: {
                n3 = 18;
                break;
            }
            case 3: {
                n3 = 47;
                break;
            }
            case 4: {
                n3 = 55;
                break;
            }
            case 5: {
                n3 = 34;
                break;
            }
            case 6: {
                n3 = 28;
                break;
            }
            case 7: {
                n3 = 10;
                break;
            }
            case 8: {
                n3 = 16;
                break;
            }
            case 9: {
                n3 = 38;
                break;
            }
            case 10: {
                n3 = 51;
                break;
            }
            case 11: {
                n3 = 46;
                break;
            }
            case 12: {
                n3 = 53;
                break;
            }
            case 13: {
                n3 = 31;
                break;
            }
            case 14: {
                n3 = 63;
                break;
            }
            case 15: {
                n3 = 50;
                break;
            }
            case 16: {
                n3 = 23;
                break;
            }
            case 17: {
                n3 = 49;
                break;
            }
            case 18: {
                n3 = 42;
                break;
            }
            case 19: {
                n3 = 9;
                break;
            }
            case 20: {
                n3 = 61;
                break;
            }
            case 21: {
                n3 = 15;
                break;
            }
            case 22: {
                n3 = 36;
                break;
            }
            case 23: {
                n3 = 37;
                break;
            }
            case 24: {
                n3 = 48;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 20;
                break;
            }
            case 27: {
                n3 = 40;
                break;
            }
            case 28: {
                n3 = 54;
                break;
            }
            case 29: {
                n3 = 5;
                break;
            }
            case 30: {
                n3 = 8;
                break;
            }
            case 31: {
                n3 = 45;
                break;
            }
            case 32: {
                n3 = 59;
                break;
            }
            case 33: {
                n3 = 35;
                break;
            }
            case 34: {
                n3 = 12;
                break;
            }
            case 35: {
                n3 = 6;
                break;
            }
            case 36: {
                n3 = 29;
                break;
            }
            case 37: {
                n3 = 30;
                break;
            }
            case 38: {
                n3 = 52;
                break;
            }
            case 39: {
                n3 = 17;
                break;
            }
            case 40: {
                n3 = 60;
                break;
            }
            case 41: {
                n3 = 4;
                break;
            }
            case 42: {
                n3 = 32;
                break;
            }
            case 43: {
                n3 = 2;
                break;
            }
            case 44: {
                n3 = 33;
                break;
            }
            case 45: {
                n3 = 43;
                break;
            }
            case 46: {
                n3 = 7;
                break;
            }
            case 47: {
                n3 = 21;
                break;
            }
            case 48: {
                n3 = 58;
                break;
            }
            case 49: {
                n3 = 1;
                break;
            }
            case 50: {
                n3 = 41;
                break;
            }
            case 51: {
                n3 = 25;
                break;
            }
            case 52: {
                n3 = 0;
                break;
            }
            case 53: {
                n3 = 24;
                break;
            }
            case 54: {
                n3 = 56;
                break;
            }
            case 55: {
                n3 = 14;
                break;
            }
            case 56: {
                n3 = 13;
                break;
            }
            case 57: {
                n3 = 27;
                break;
            }
            case 58: {
                n3 = 39;
                break;
            }
            case 59: {
                n3 = 11;
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
                n3 = 3;
                break;
            }
            default: {
                n3 = 62;
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
        EventRoutingController.z[n4] = new String(cArray);
        return n4;
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
            return MethodHandles.lookup().findStatic(EventRoutingController.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(EventRoutingController.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

