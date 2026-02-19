/*
 * Decompiled with CFR 0.152.
 */
package com.system.monitoring;

import a.Qv;
import a.V3;
import com.app.concurrency.management.ThreadPoolOrchestrator2584;
import com.app.database.query.QueryComposer;
import com.app.io.stream.OutputStreamHandler;
import com.app.messaging.core.MessageRoutingEngine2585;
import com.app.network.CommunicationProtocolManager1453;
import com.app.network.NetworkConnectionHandler1792;
import com.app.resources.ResourceLifecycleManager1543;
import com.collections.management.MultiContainerRegistry;
import com.communication.output.OutputChannelManager;
import com.configuration.management.ConfigurationParameterController;
import com.crypto.operations.CryptographicOperationHandler;
import com.data.compression.DataCompressionManager;
import com.data.processing.DataTransformationOrchestrator1673;
import com.distributed.cluster.ClusterNodeCoordinator1923;
import com.event.management.EventDispatchCoordinator1090;
import com.event.management.EventDispatchCoordinator1933;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionValidationHandler2049;
import com.game.configuration.GameVersionEnumerator;
import com.integration.core.SystemIntegrationOrchestrator;
import com.math.geometry.GeometryCalculator;
import com.messaging.routing.MessageRoutingEngine1959;
import com.network.communication.CommunicationChannelSetup;
import com.network.communication.CommunicationProtocolHandler1897;
import com.network.connection.NetworkConnectionManager1945;
import com.network.packet.PacketCompositionHandler;
import com.network.protocol.ProtocolInteractionController;
import com.network.secure.SecureTransmissionController998;
import com.network.security.ProtocolValidator;
import com.network.session.CommunicationSessionController;
import com.network.streaming.DataStreamProcessor1233;
import com.protocol.encoding.EncodingProtocolHandler;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.LightweightExecutionContext;
import com.security.computation.SecureComputationFramework;
import com.security.operations.CryptoOperationOrchestrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.monitoring.SystemHealthMonitor1723;
import com.system.pipeline.ObjectPipelineManager;
import com.system.resource.ResourceAllocationManager1749;
import com.system.resource.ResourceAllocator1606;
import com.system.resource.SystemResourceAllocator1279;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class RuntimeResourceTracker {
    private static final long[] b;
    private static final List<LightweightExecutionContext> j;
    private static final Integer[] c;
    private static final Object[] e;
    private static final long a;
    private static final Map d;
    private static final String[] f;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Xu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static double Z(LightweightExecutionContext lightweightExecutionContext) {
        double d2 = RuntimeResourceTracker.G(lightweightExecutionContext);
        try {
            if (d2 == 0.0) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        try {
            if (!lightweightExecutionContext.C().B(ReflectionMetadataResolver.b9)) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.A().e(), lightweightExecutionContext));
        return d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.R().e(), lightweightExecutionContext));
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static ProtocolInteractionController k(String string) {
        long l = a ^ 0xFF2316651F8L;
        Iterator iterator = ProtocolInteractionController.e().K().iterator();
        String string2 = "";
        while (true) {
            ObjectLifecycleTracker objectLifecycleTracker;
            Object object;
            block6: {
                block5: {
                    try {
                        if (!iterator.hasNext()) return null;
                        if (GeometryCalculator.C() != 13) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    string2 = (String)iterator.next();
                    object = ProtocolInteractionController.e().D(string2);
                    break block6;
                }
                objectLifecycleTracker = new NetworkConnectionManager1945(iterator.next());
                string2 = objectLifecycleTracker.y();
                object = ProtocolInteractionController.e().D(objectLifecycleTracker.M());
            }
            string2 = string2.replace((CharSequence)((Object)RuntimeResourceTracker.b("A", (int)RuntimeResourceTracker.a("z", (int)12822, (long)(0x3A80A51B07C44A78L ^ l)), (long)-77093279949407150L, (long)l)), "");
            string2 = string2.toLowerCase();
            if (!ReflectionMetadataResolver.VP.isInstance(object)) continue;
            objectLifecycleTracker = new ProtocolInteractionController(object);
            if (string2.equalsIgnoreCase(string)) return objectLifecycleTracker;
            continue;
            break;
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
    }

    private static int lambda$populateItems$0(LightweightExecutionContext lightweightExecutionContext, LightweightExecutionContext lightweightExecutionContext2) {
        int n;
        int n2;
        block22: {
            int n3;
            int n4;
            block26: {
                block25: {
                    int n5;
                    int n6;
                    ConfigurationParameterController configurationParameterController;
                    block24: {
                        block23: {
                            int n7;
                            ConfigurationParameterController configurationParameterController2;
                            block21: {
                                block20: {
                                    int n8;
                                    block19: {
                                        block18: {
                                            configurationParameterController2 = TemporalMetadataResolver.h.x().V(lightweightExecutionContext);
                                            configurationParameterController = TemporalMetadataResolver.h.x().V(lightweightExecutionContext2);
                                            try {
                                                try {
                                                    if (configurationParameterController2 == null || configurationParameterController2.Y() == null) break block18;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw RuntimeResourceTracker.a(customSystemException);
                                                }
                                                n8 = configurationParameterController2.Y();
                                                break block19;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw RuntimeResourceTracker.a(customSystemException);
                                            }
                                        }
                                        n8 = lightweightExecutionContext.C().O();
                                    }
                                    n2 = n8;
                                    try {
                                        try {
                                            if (configurationParameterController == null || configurationParameterController.Y() == null) break block20;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw RuntimeResourceTracker.a(customSystemException);
                                        }
                                        n7 = configurationParameterController.Y();
                                        break block21;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw RuntimeResourceTracker.a(customSystemException);
                                    }
                                }
                                n7 = lightweightExecutionContext2.C().O();
                            }
                            n = n7;
                            try {
                                try {
                                    try {
                                        if (n2 != n) break block22;
                                        n6 = n2;
                                        if (configurationParameterController2 == null) break block23;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw RuntimeResourceTracker.a(customSystemException);
                                    }
                                    if (configurationParameterController2.i() == null) break block23;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw RuntimeResourceTracker.a(customSystemException);
                                }
                                n5 = configurationParameterController2.i();
                                break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RuntimeResourceTracker.a(customSystemException);
                            }
                        }
                        n5 = 0;
                    }
                    n2 = n6 + n5;
                    try {
                        try {
                            n4 = n;
                            if (configurationParameterController == null || configurationParameterController.i() == null) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeResourceTracker.a(customSystemException);
                        }
                        n3 = configurationParameterController.i();
                        break block26;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                }
                n3 = 0;
            }
            n = n4 + n3;
        }
        return Integer.compare(n2, n);
    }

    public static double W(LightweightExecutionContext lightweightExecutionContext) {
        double d2 = RuntimeResourceTracker.M(lightweightExecutionContext);
        d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.r().e(), lightweightExecutionContext));
        d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.k().e(), lightweightExecutionContext));
        d2 += (double)(1 * Math.max(0, EventDispatchCoordinator1090.c(Qv.S().e(), lightweightExecutionContext)));
        d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.R().e(), lightweightExecutionContext));
        return d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.A().e(), lightweightExecutionContext));
    }

    private static Field c(long l, long l2) {
        int n = RuntimeResourceTracker.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = RuntimeResourceTracker.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = RuntimeResourceTracker.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = RuntimeResourceTracker.a(clazz3, string2, clazz2)) != null) {
                    RuntimeResourceTracker.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = RuntimeResourceTracker.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        RuntimeResourceTracker.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = RuntimeResourceTracker.b(211951186468737L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static double E(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (lightweightExecutionContext.Y()) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (!RuntimeResourceTracker.l(protocolInteractionController)) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        double d2 = RuntimeResourceTracker.m(lightweightExecutionContext);
        double d3 = RuntimeResourceTracker.A(lightweightExecutionContext);
        return d2 + d3;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = RuntimeResourceTracker.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                RuntimeResourceTracker.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static boolean l(LightweightExecutionContext lightweightExecutionContext) {
        return RuntimeResourceTracker.t(lightweightExecutionContext.C());
    }

    public static boolean c(ProtocolInteractionController protocolInteractionController) {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            ResourceAllocationManager1749 resourceAllocationManager1749 = protocolInteractionController.C();
            Object object = resourceAllocationManager1749.r(SystemResourceAllocator1279.Z());
            if (ReflectionMetadataResolver.rO.isInstance(object)) {
                MessageRoutingEngine1959 messageRoutingEngine1959 = new MessageRoutingEngine1959(object);
                try {
                    if (SystemIntegrationOrchestrator.y().equals(messageRoutingEngine1959)) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
            return false;
        }
        return protocolInteractionController.B(ReflectionMetadataResolver.PO);
    }

    public static boolean s(ProtocolInteractionController protocolInteractionController) {
        long l = a ^ 0x47E0B32EAC2L;
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            String string;
            block5: {
                string = protocolInteractionController.n();
                try {
                    try {
                        if (string != null && !string.isEmpty()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
            return string.contains((CharSequence)((Object)RuntimeResourceTracker.b("A", (int)RuntimeResourceTracker.a("z", (int)22360, (long)(0x5DC479B7704F940DL ^ l)), (long)5031672651997710184L, (long)l)));
        }
        return protocolInteractionController.B(ReflectionMetadataResolver.tZ);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = RuntimeResourceTracker.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static double r(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (lightweightExecutionContext.Y()) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (!RuntimeResourceTracker.l(protocolInteractionController)) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        double d2 = 0.0;
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            ResourceAllocationManager1749 resourceAllocationManager1749 = protocolInteractionController.C();
            Object object = resourceAllocationManager1749.r(SystemResourceAllocator1279.b());
            CommunicationProtocolHandler1897 communicationProtocolHandler1897 = new CommunicationProtocolHandler1897(object);
            ThreadPoolOrchestrator2584 threadPoolOrchestrator2584 = EncodingProtocolHandler.p();
            List<ClusterNodeCoordinator1923> list = communicationProtocolHandler1897.a();
            for (ClusterNodeCoordinator1923 clusterNodeCoordinator1923 : list) {
                ThreadPoolOrchestrator2584 threadPoolOrchestrator25842 = clusterNodeCoordinator1923.b();
                NetworkConnectionHandler1792 networkConnectionHandler1792 = clusterNodeCoordinator1923.k();
                if (!threadPoolOrchestrator25842.equals(threadPoolOrchestrator2584)) continue;
                double d3 = networkConnectionHandler1792.y();
                d2 += d3;
            }
        } else {
            SecureComputationFramework secureComputationFramework = new SecureComputationFramework(protocolInteractionController);
            d2 = secureComputationFramework.F();
        }
        return d2;
    }

    public static boolean P(LightweightExecutionContext lightweightExecutionContext) {
        return RuntimeResourceTracker.c(lightweightExecutionContext.C());
    }

    public static double m(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (lightweightExecutionContext.Y()) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (!RuntimeResourceTracker.l(protocolInteractionController)) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        return RuntimeResourceTracker.r(lightweightExecutionContext) + (double)EventDispatchCoordinator1090.c(0, lightweightExecutionContext);
    }

    private static Method d(long l, long l2) {
        int n = RuntimeResourceTracker.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = RuntimeResourceTracker.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = RuntimeResourceTracker.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = RuntimeResourceTracker.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        RuntimeResourceTracker.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = RuntimeResourceTracker.b(211951186468737L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = RuntimeResourceTracker.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        RuntimeResourceTracker.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = RuntimeResourceTracker.b(211951186468737L, 0L);
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

    private static void a() {
        Object[] objectArray = e;
        e[0] = "C7~";
        objectArray[1] = Integer.TYPE;
        RuntimeResourceTracker.f[1] = "java/lang/Integer";
        objectArray[2] = "eh>\b4vng/GIn}`&\u000e";
        objectArray[3] = "\twRc$ \u0002xC,E.\tsGv";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "_EmE\t\u0007\b\u001bj*\u001dEcL<\u0014KU\u001b\u000f3UF>Z\u001a<\u0012MG\u0019\n{\u0016v";
    }

    public static boolean Z(LightweightExecutionContext lightweightExecutionContext) {
        return RuntimeResourceTracker.a(lightweightExecutionContext.C());
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = RuntimeResourceTracker.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = RuntimeResourceTracker.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static boolean C(LightweightExecutionContext lightweightExecutionContext) {
        block18: {
            block17: {
                try {
                    try {
                        if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
            try {
                if (!RuntimeResourceTracker.k(lightweightExecutionContext)) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                ResourceAllocationManager1749 resourceAllocationManager1749 = lightweightExecutionContext.C().C();
                Object object = resourceAllocationManager1749.r(SystemResourceAllocator1279.k());
                if (object != null) {
                    CryptographicOperationHandler cryptographicOperationHandler = new CryptographicOperationHandler(object);
                    DataCompressionManager dataCompressionManager = cryptographicOperationHandler.b();
                    try {
                        try {
                            if (dataCompressionManager == null || !dataCompressionManager.equals(PacketCompositionHandler.w())) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeResourceTracker.a(customSystemException);
                        }
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                }
            } else {
                SecureComputationFramework secureComputationFramework = new SecureComputationFramework(lightweightExecutionContext.C());
                try {
                    if (DataTransformationOrchestrator1673.F().equals(secureComputationFramework.k())) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
        }
        return false;
    }

    public static double i(LightweightExecutionContext lightweightExecutionContext) {
        int n;
        int n2;
        try {
            if (lightweightExecutionContext.Y()) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (!RuntimeResourceTracker.l(protocolInteractionController)) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        double d2 = RuntimeResourceTracker.E(lightweightExecutionContext);
        int n3 = EventDispatchCoordinator1090.c(Qv.M().e(), lightweightExecutionContext);
        if (n3 > 0) {
            d2 += (double)n3 * 0.1;
        }
        if ((n2 = EventDispatchCoordinator1090.c(Qv.e().e(), lightweightExecutionContext)) > 0) {
            d2 += (double)n2 * 0.1;
        }
        if ((n = EventDispatchCoordinator1090.c(Qv.E().e(), lightweightExecutionContext)) > 0) {
            d2 += (double)n * 0.1;
        }
        return d2;
    }

    private static void V() {
        for (Object e : ProtocolInteractionController.e().K()) {
            ObjectLifecycleTracker objectLifecycleTracker;
            Object object;
            if (GeometryCalculator.C() == 13) {
                object = ProtocolInteractionController.e().D(e);
            } else {
                objectLifecycleTracker = new NetworkConnectionManager1945(e);
                object = ProtocolInteractionController.e().D(objectLifecycleTracker.M());
            }
            if (!ReflectionMetadataResolver.VP.isInstance(object)) continue;
            objectLifecycleTracker = new ProtocolInteractionController(object);
            List list = new ArrayList();
            if (GeometryCalculator.C() >= 23) {
                list = (List)OutputStreamHandler.x().M();
            }
            try {
                ((ProtocolInteractionController)objectLifecycleTracker).l((ProtocolInteractionController)objectLifecycleTracker, list);
                if (list.isEmpty()) {
                    j.add(((ProtocolInteractionController)objectLifecycleTracker).A());
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
            for (Object e2 : list) {
                LightweightExecutionContext lightweightExecutionContext = new LightweightExecutionContext(e2);
                try {
                    if (lightweightExecutionContext.C().O() == 62) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
                j.add(lightweightExecutionContext);
            }
        }
        j.sort(RuntimeResourceTracker::lambda$populateItems$0);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Xu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static boolean l(ProtocolInteractionController protocolInteractionController) {
        if (GameVersionEnumerator.MC_1_21_6.H()) {
            CryptographicOperationHandler cryptographicOperationHandler = new CryptographicOperationHandler(protocolInteractionController.A().k(SystemResourceAllocator1279.k()));
            try {
                if (cryptographicOperationHandler.Y()) {
                    return false;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
            return cryptographicOperationHandler.L().y();
        }
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            ThreadPoolOrchestrator2584 threadPoolOrchestrator2584 = EncodingProtocolHandler.p();
            ResourceAllocationManager1749 resourceAllocationManager1749 = protocolInteractionController.C();
            Object object = resourceAllocationManager1749.r(SystemResourceAllocator1279.b());
            CommunicationProtocolHandler1897 communicationProtocolHandler1897 = new CommunicationProtocolHandler1897(object);
            List<ClusterNodeCoordinator1923> list = communicationProtocolHandler1897.a();
            for (ClusterNodeCoordinator1923 clusterNodeCoordinator1923 : list) {
                ThreadPoolOrchestrator2584 threadPoolOrchestrator25842 = clusterNodeCoordinator1923.b();
                try {
                    if (!threadPoolOrchestrator25842.equals(threadPoolOrchestrator2584)) continue;
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
            return false;
        }
        return protocolInteractionController.B(ReflectionMetadataResolver.Fv);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static double v(LightweightExecutionContext lightweightExecutionContext) {
        double d2;
        block15: {
            int n;
            EventDispatchCoordinator1933 eventDispatchCoordinator1933;
            block17: {
                block16: {
                    block14: {
                        d2 = 0.0;
                        try {
                            block13: {
                                try {
                                    try {
                                        if (lightweightExecutionContext.Y() || lightweightExecutionContext.C().Y()) break block13;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw RuntimeResourceTracker.a(customSystemException);
                                    }
                                    if (RuntimeResourceTracker.t(lightweightExecutionContext.C())) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw RuntimeResourceTracker.a(customSystemException);
                                }
                            }
                            return d2;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeResourceTracker.a(customSystemException);
                        }
                    }
                    eventDispatchCoordinator1933 = lightweightExecutionContext.P();
                    try {
                        try {
                            if (eventDispatchCoordinator1933.j() <= 0) break block15;
                            if (GeometryCalculator.C() != 23) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeResourceTracker.a(customSystemException);
                        }
                        n = 1;
                        break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                }
                n = 0;
            }
            int n2 = n;
            NetworkConnectionHandler1792 networkConnectionHandler1792 = new NetworkConnectionHandler1792(eventDispatchCoordinator1933.F().toArray()[n2]);
            d2 = networkConnectionHandler1792.y();
        }
        d2 += (double)EventDispatchCoordinator1090.b(lightweightExecutionContext, ProtocolValidator.f());
        try {
            if (!lightweightExecutionContext.C().B(ReflectionMetadataResolver.EL)) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.j().e(), lightweightExecutionContext));
        d2 += 0.01 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.A().e(), lightweightExecutionContext));
        d2 += 0.01 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.t().e(), lightweightExecutionContext));
        d2 += 0.01 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.C().e(), lightweightExecutionContext));
        d2 += 0.01 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.F().e(), lightweightExecutionContext));
        return d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.R().e(), lightweightExecutionContext));
    }

    public static double g(LightweightExecutionContext lightweightExecutionContext) {
        int n;
        double d2 = RuntimeResourceTracker.G(lightweightExecutionContext);
        try {
            if (d2 == 0.0) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        try {
            if (!lightweightExecutionContext.C().B(ReflectionMetadataResolver.x)) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        int n2 = EventDispatchCoordinator1090.c(Qv.j().e(), lightweightExecutionContext);
        try {
            n = n2 > 0 ? n2 * n2 + 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        n2 = n;
        d2 += (double)n2;
        d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.A().e(), lightweightExecutionContext));
        d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.t().e(), lightweightExecutionContext));
        return d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.R().e(), lightweightExecutionContext));
    }

    public static double l(LightweightExecutionContext lightweightExecutionContext) {
        int n;
        double d2 = RuntimeResourceTracker.G(lightweightExecutionContext);
        try {
            if (d2 == 0.0) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        try {
            if (!lightweightExecutionContext.C().B(ReflectionMetadataResolver.tZ)) {
                return d2;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        int n2 = EventDispatchCoordinator1090.c(Qv.j().e(), lightweightExecutionContext);
        try {
            n = n2 > 0 ? n2 * n2 + 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        n2 = n;
        d2 += (double)n2;
        d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.A().e(), lightweightExecutionContext));
        d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.t().e(), lightweightExecutionContext));
        return d2 += 0.1 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.R().e(), lightweightExecutionContext));
    }

    public static List<LightweightExecutionContext> K() {
        try {
            if (j.isEmpty()) {
                RuntimeResourceTracker.V();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        return j;
    }

    public static double G(LightweightExecutionContext lightweightExecutionContext) {
        block7: {
            try {
                block6: {
                    try {
                        try {
                            if (lightweightExecutionContext.Y() || lightweightExecutionContext.C().Y()) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeResourceTracker.a(customSystemException);
                        }
                        if (RuntimeResourceTracker.t(lightweightExecutionContext.C())) break block7;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                }
                return 0.0;
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
        }
        return new SecureTransmissionController998(lightweightExecutionContext.C().M()).y();
    }

    public static double D(LightweightExecutionContext lightweightExecutionContext) {
        double d2 = RuntimeResourceTracker.N(lightweightExecutionContext);
        return d2 += (double)EventDispatchCoordinator1090.b(lightweightExecutionContext, ProtocolValidator.f());
    }

    public static float N(LightweightExecutionContext lightweightExecutionContext) {
        ProtocolInteractionController protocolInteractionController;
        block14: {
            block13: {
                try {
                    try {
                        if (lightweightExecutionContext != null && !lightweightExecutionContext.Y()) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    return 0.0f;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
            protocolInteractionController = lightweightExecutionContext.C();
            try {
                try {
                    if (RuntimeResourceTracker.a(protocolInteractionController) || RuntimeResourceTracker.t(protocolInteractionController)) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
                return 0.0f;
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
        }
        float f = 0.0f;
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            ResourceAllocationManager1749 resourceAllocationManager1749 = protocolInteractionController.C();
            Object object = resourceAllocationManager1749.r(SystemResourceAllocator1279.b());
            CommunicationProtocolHandler1897 communicationProtocolHandler1897 = new CommunicationProtocolHandler1897(object);
            ThreadPoolOrchestrator2584 threadPoolOrchestrator2584 = EncodingProtocolHandler.f();
            List<ClusterNodeCoordinator1923> list = communicationProtocolHandler1897.a();
            for (ClusterNodeCoordinator1923 clusterNodeCoordinator1923 : list) {
                ThreadPoolOrchestrator2584 threadPoolOrchestrator25842 = clusterNodeCoordinator1923.b();
                NetworkConnectionHandler1792 networkConnectionHandler1792 = clusterNodeCoordinator1923.k();
                if (!threadPoolOrchestrator25842.equals(threadPoolOrchestrator2584)) continue;
                double d2 = networkConnectionHandler1792.y();
                f += (float)d2;
            }
        } else if (RuntimeResourceTracker.a(protocolInteractionController)) {
            CryptoOperationOrchestrator cryptoOperationOrchestrator = new CryptoOperationOrchestrator(protocolInteractionController.M());
            f = 4.0f + cryptoOperationOrchestrator.i();
        } else {
            SecureTransmissionController998 secureTransmissionController998 = new SecureTransmissionController998(protocolInteractionController.M());
            f = secureTransmissionController998.O();
        }
        return f;
    }

    public static boolean k(LightweightExecutionContext lightweightExecutionContext) {
        return RuntimeResourceTracker.l(lightweightExecutionContext.C());
    }

    public static boolean a(ProtocolInteractionController protocolInteractionController) {
        long l = a ^ 0x42CF93659C6FL;
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            String string;
            block5: {
                string = protocolInteractionController.n();
                try {
                    try {
                        if (string != null && !string.isEmpty()) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    return false;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
            return string.contains((CharSequence)((Object)RuntimeResourceTracker.b("A", (int)RuntimeResourceTracker.a("z", (int)20283, (long)(0x4822B195C9DC7AC1L ^ l)), (long)3709085033106534853L, (long)l)));
        }
        return protocolInteractionController.B(ReflectionMetadataResolver.Yx);
    }

    public static int q(LightweightExecutionContext lightweightExecutionContext) {
        block4: {
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
                return -1;
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
        }
        return RuntimeResourceTracker.m(lightweightExecutionContext.C());
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                RuntimeResourceTracker.a = MultiContainerRegistry.a(-4240556576761342288L, 3611086010616075220L, MethodHandles.lookup().lookupClass()).a(254249570064245L);
                RuntimeResourceTracker.e = new Object[5];
                RuntimeResourceTracker.f = new String[5];
                RuntimeResourceTracker.a();
                RuntimeResourceTracker.d = new HashMap<K, V>(13);
                var0 = RuntimeResourceTracker.a ^ 109325151373540L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u00ac\u00bb\u001a\u0015q\u00cd\u0001\u0011o\u0097\u00ad8&\u009dua";
                var7_6 = "\u00ac\u00bb\u001a\u0015q\u00cd\u0001\u0011o\u0097\u00ad8&\u009dua".length();
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
                    var6_5 = "a\u008e2\u009f\u00e0z>\u00d7\u0012\u00ffA\u00a3[\r\u00a4\u009f";
                    var7_6 = "a\u008e2\u009f\u00e0z>\u00d7\u0012\u00ffA\u00a3[\r\u00a4\u009f".length();
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
        RuntimeResourceTracker.b = var8_3;
        RuntimeResourceTracker.c = new Integer[4];
        RuntimeResourceTracker.j = new ArrayList<LightweightExecutionContext>();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = RuntimeResourceTracker.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = RuntimeResourceTracker.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static boolean C(ProtocolInteractionController protocolInteractionController) {
        boolean bl;
        block12: {
            block11: {
                try {
                    block10: {
                        try {
                            try {
                                try {
                                    try {
                                        if (protocolInteractionController.B(ReflectionMetadataResolver.bP) || protocolInteractionController.B(ReflectionMetadataResolver.YZ)) break block10;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw RuntimeResourceTracker.a(customSystemException);
                                    }
                                    if (protocolInteractionController.B(ReflectionMetadataResolver.Vu)) break block10;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw RuntimeResourceTracker.a(customSystemException);
                                }
                                if (protocolInteractionController.B(ReflectionMetadataResolver.Yz)) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RuntimeResourceTracker.a(customSystemException);
                            }
                            if (!protocolInteractionController.B(ReflectionMetadataResolver.FQ)) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeResourceTracker.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public static double M(LightweightExecutionContext lightweightExecutionContext) {
        double d2 = 2.0;
        int n = EventDispatchCoordinator1090.c(Qv.w().e(), lightweightExecutionContext);
        if (n > 0) {
            d2 += (double)n * 0.5 + 0.5;
        }
        return d2;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e8' || c == '\u00fe' || c == 'l' || c == '\u00d0') {
                field = RuntimeResourceTracker.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'l' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = RuntimeResourceTracker.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'A' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static double U(LightweightExecutionContext lightweightExecutionContext) {
        double d2 = RuntimeResourceTracker.D(lightweightExecutionContext);
        d2 += 0.01 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.C().e(), lightweightExecutionContext));
        d2 += 0.01 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.F().e(), lightweightExecutionContext));
        d2 += 0.01 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.f().e(), lightweightExecutionContext));
        d2 += 0.05 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.i().e(), lightweightExecutionContext));
        d2 += 0.01 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.G().e(), lightweightExecutionContext));
        d2 += 0.01 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.R().e(), lightweightExecutionContext));
        d2 += 0.01 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.A().e(), lightweightExecutionContext));
        return d2 += 0.05 * (double)Math.max(0, EventDispatchCoordinator1090.c(Qv.n().e(), lightweightExecutionContext));
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 41;
                break;
            }
            case 2: {
                n3 = 57;
                break;
            }
            case 3: {
                n3 = 31;
                break;
            }
            case 4: {
                n3 = 56;
                break;
            }
            case 5: {
                n3 = 42;
                break;
            }
            case 6: {
                n3 = 29;
                break;
            }
            case 7: {
                n3 = 50;
                break;
            }
            case 8: {
                n3 = 7;
                break;
            }
            case 9: {
                n3 = 1;
                break;
            }
            case 10: {
                n3 = 10;
                break;
            }
            case 11: {
                n3 = 14;
                break;
            }
            case 12: {
                n3 = 17;
                break;
            }
            case 13: {
                n3 = 22;
                break;
            }
            case 14: {
                n3 = 60;
                break;
            }
            case 15: {
                n3 = 45;
                break;
            }
            case 16: {
                n3 = 5;
                break;
            }
            case 17: {
                n3 = 8;
                break;
            }
            case 18: {
                n3 = 33;
                break;
            }
            case 19: {
                n3 = 37;
                break;
            }
            case 20: {
                n3 = 0;
                break;
            }
            case 21: {
                n3 = 44;
                break;
            }
            case 22: {
                n3 = 48;
                break;
            }
            case 23: {
                n3 = 12;
                break;
            }
            case 24: {
                n3 = 4;
                break;
            }
            case 25: {
                n3 = 19;
                break;
            }
            case 26: {
                n3 = 30;
                break;
            }
            case 27: {
                n3 = 3;
                break;
            }
            case 28: {
                n3 = 62;
                break;
            }
            case 29: {
                n3 = 58;
                break;
            }
            case 30: {
                n3 = 15;
                break;
            }
            case 31: {
                n3 = 55;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 21;
                break;
            }
            case 35: {
                n3 = 11;
                break;
            }
            case 36: {
                n3 = 24;
                break;
            }
            case 37: {
                n3 = 20;
                break;
            }
            case 38: {
                n3 = 43;
                break;
            }
            case 39: {
                n3 = 23;
                break;
            }
            case 40: {
                n3 = 61;
                break;
            }
            case 41: {
                n3 = 27;
                break;
            }
            case 42: {
                n3 = 28;
                break;
            }
            case 43: {
                n3 = 25;
                break;
            }
            case 44: {
                n3 = 26;
                break;
            }
            case 45: {
                n3 = 38;
                break;
            }
            case 46: {
                n3 = 2;
                break;
            }
            case 47: {
                n3 = 59;
                break;
            }
            case 48: {
                n3 = 53;
                break;
            }
            case 49: {
                n3 = 63;
                break;
            }
            case 50: {
                n3 = 51;
                break;
            }
            case 51: {
                n3 = 9;
                break;
            }
            case 52: {
                n3 = 40;
                break;
            }
            case 53: {
                n3 = 47;
                break;
            }
            case 54: {
                n3 = 54;
                break;
            }
            case 55: {
                n3 = 34;
                break;
            }
            case 56: {
                n3 = 6;
                break;
            }
            case 57: {
                n3 = 39;
                break;
            }
            case 58: {
                n3 = 36;
                break;
            }
            case 59: {
                n3 = 32;
                break;
            }
            case 60: {
                n3 = 18;
                break;
            }
            case 61: {
                n3 = 49;
                break;
            }
            case 62: {
                n3 = 13;
                break;
            }
            default: {
                n3 = 52;
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
        RuntimeResourceTracker.f[n4] = new String(cArray);
        return n4;
    }

    public static boolean d(LightweightExecutionContext lightweightExecutionContext) {
        return RuntimeResourceTracker.y(lightweightExecutionContext, false);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = RuntimeResourceTracker.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static boolean j(LightweightExecutionContext lightweightExecutionContext) {
        block16: {
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block16;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
        }
        try {
            if (!RuntimeResourceTracker.t(lightweightExecutionContext.C())) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            CommunicationChannelSetup communicationChannelSetup;
            MessageRoutingEngine2585 messageRoutingEngine2585;
            ResourceAllocationManager1749 resourceAllocationManager1749 = lightweightExecutionContext.C().C();
            Object object = resourceAllocationManager1749.r(SystemResourceAllocator1279.N());
            if (object != null && (messageRoutingEngine2585 = (communicationChannelSetup = new CommunicationChannelSetup(object)).T()).B(ReflectionMetadataResolver.rf)) {
                QueryComposer queryComposer = new QueryComposer(messageRoutingEngine2585);
                OutputChannelManager outputChannelManager = queryComposer.X();
                try {
                    if (outputChannelManager.equals(TransactionValidationHandler2049.O())) {
                        return true;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
        } else {
            SecureTransmissionController998 secureTransmissionController998 = new SecureTransmissionController998(lightweightExecutionContext.C());
            try {
                if (secureTransmissionController998.h().equals(SystemHealthMonitor1723.M())) {
                    return true;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
        }
        return false;
    }

    public static double A(LightweightExecutionContext lightweightExecutionContext) {
        try {
            if (GameVersionEnumerator.MC_1_12_2.Q()) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        try {
            if (lightweightExecutionContext.Y()) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (!RuntimeResourceTracker.l(protocolInteractionController)) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        double d2 = 0.0;
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            ResourceAllocationManager1749 resourceAllocationManager1749 = protocolInteractionController.C();
            Object object = resourceAllocationManager1749.r(SystemResourceAllocator1279.b());
            CommunicationProtocolHandler1897 communicationProtocolHandler1897 = new CommunicationProtocolHandler1897(object);
            ThreadPoolOrchestrator2584 threadPoolOrchestrator2584 = EncodingProtocolHandler.O();
            List<ClusterNodeCoordinator1923> list = communicationProtocolHandler1897.a();
            for (ClusterNodeCoordinator1923 clusterNodeCoordinator1923 : list) {
                ThreadPoolOrchestrator2584 threadPoolOrchestrator25842 = clusterNodeCoordinator1923.b();
                NetworkConnectionHandler1792 networkConnectionHandler1792 = clusterNodeCoordinator1923.k();
                if (!threadPoolOrchestrator25842.equals(threadPoolOrchestrator2584)) continue;
                double d3 = networkConnectionHandler1792.y();
                d2 += d3;
            }
        } else {
            SecureComputationFramework secureComputationFramework = new SecureComputationFramework(protocolInteractionController);
            d2 = secureComputationFramework.g();
        }
        return d2;
    }

    public static float d(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        float f = 0.0f;
        ResourceAllocator1606 resourceAllocator1606 = systemConfigurationOrchestrator.t();
        for (int i = 0; i < 45; ++i) {
            LightweightExecutionContext lightweightExecutionContext;
            float f2;
            ResourceLifecycleManager1543 resourceLifecycleManager1543 = resourceAllocator1606.T(i);
            if (!resourceLifecycleManager1543.H() || !((f2 = RuntimeResourceTracker.g(lightweightExecutionContext = resourceLifecycleManager1543.y())) > f)) continue;
            f = f2;
        }
        return f;
    }

    public static int m(ProtocolInteractionController protocolInteractionController) {
        try {
            if (protocolInteractionController.Y()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        try {
            if (!RuntimeResourceTracker.l(protocolInteractionController)) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw RuntimeResourceTracker.a(customSystemException);
        }
        int n = -1;
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            ResourceAllocationManager1749 resourceAllocationManager1749 = protocolInteractionController.C();
            Object object = resourceAllocationManager1749.r(SystemResourceAllocator1279.k());
            if (object != null) {
                CryptographicOperationHandler cryptographicOperationHandler = new CryptographicOperationHandler(object);
                CommunicationSessionController communicationSessionController = cryptographicOperationHandler.L();
                n = communicationSessionController.l();
            }
        } else {
            SecureComputationFramework secureComputationFramework = new SecureComputationFramework(protocolInteractionController);
            n = secureComputationFramework.d();
        }
        if (GameVersionEnumerator.MC_1_16_5.H()) {
            n = 3 - n;
        }
        return n;
    }

    public static float g(LightweightExecutionContext lightweightExecutionContext) {
        block9: {
            block8: {
                try {
                    try {
                        if (lightweightExecutionContext != null && !lightweightExecutionContext.Y()) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    return 0.0f;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
            ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
            try {
                try {
                    if (RuntimeResourceTracker.a(protocolInteractionController) || RuntimeResourceTracker.t(protocolInteractionController)) break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
                return 0.0f;
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
        }
        float f = RuntimeResourceTracker.N(lightweightExecutionContext);
        return (float)EventDispatchCoordinator1090.c(Qv.o().e(), lightweightExecutionContext) * 1.25f + f + (float)EventDispatchCoordinator1090.c(Qv.f().e(), lightweightExecutionContext) * 0.01f;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x683;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Xu", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            RuntimeResourceTracker.c[n2] = n3;
        }
        return c[n2];
    }

    public static boolean t(ProtocolInteractionController protocolInteractionController) {
        if (GameVersionEnumerator.MC_1_21_4.H()) {
            boolean bl;
            ResourceAllocationManager1749 resourceAllocationManager1749 = protocolInteractionController.C();
            Object object = resourceAllocationManager1749.r(SystemResourceAllocator1279.i());
            try {
                bl = object != null;
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
            return bl;
        }
        return protocolInteractionController.B(ReflectionMetadataResolver.Um);
    }

    public static boolean y(LightweightExecutionContext lightweightExecutionContext, boolean bl) {
        boolean bl2;
        CommunicationProtocolManager1453 communicationProtocolManager1453;
        CommunicationProtocolManager1453 communicationProtocolManager14532;
        int n;
        int n2;
        DataStreamProcessor1233 dataStreamProcessor1233;
        block44: {
            block43: {
                block41: {
                    long l;
                    block40: {
                        block39: {
                            l = a ^ 0x526654D9096CL;
                            try {
                                try {
                                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block39;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw RuntimeResourceTracker.a(customSystemException);
                                }
                                return false;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RuntimeResourceTracker.a(customSystemException);
                            }
                        }
                        try {
                            try {
                                if (!bl || !RuntimeResourceTracker.P(lightweightExecutionContext)) break block40;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RuntimeResourceTracker.a(customSystemException);
                            }
                            return true;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeResourceTracker.a(customSystemException);
                        }
                    }
                    try {
                        if (!lightweightExecutionContext.C().B(ReflectionMetadataResolver.Fl)) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    dataStreamProcessor1233 = new DataStreamProcessor1233(lightweightExecutionContext.C().M());
                    try {
                        if (dataStreamProcessor1233.Q(lightweightExecutionContext) == null) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    n2 = 6;
                    n = 10;
                    try {
                        if (GameVersionEnumerator.MC_1_20_6.H()) {
                            --n2;
                            --n;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    communicationProtocolManager14532 = ObjectPipelineManager.P.Y();
                    communicationProtocolManager1453 = ObjectPipelineManager.F.Y();
                    try {
                        block42: {
                            try {
                                try {
                                    if (!GameVersionEnumerator.MC_1_20_6.H()) break block41;
                                    if (communicationProtocolManager14532 == null) break block42;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw RuntimeResourceTracker.a(customSystemException);
                                }
                                if (communicationProtocolManager1453 != null) break block41;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw RuntimeResourceTracker.a(customSystemException);
                            }
                        }
                        TemporalMetadataResolver.x((String)((Object)RuntimeResourceTracker.b("A", (int)RuntimeResourceTracker.a("z", (int)18267, (long)(0x1BFEC340887267A3L ^ l)), (long)-6450771470733482810L, (long)l)));
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                }
                try {
                    try {
                        try {
                            if (!GameVersionEnumerator.MC_1_20_6.H() || communicationProtocolManager14532 == null) break block43;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw RuntimeResourceTracker.a(customSystemException);
                        }
                        if (communicationProtocolManager1453 == null) break block43;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    bl2 = true;
                    break block44;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
            bl2 = false;
        }
        boolean bl3 = bl2;
        for (V3 v3 : dataStreamProcessor1233.g(lightweightExecutionContext)) {
            if (GameVersionEnumerator.MC_1_20_6.H()) {
                CommunicationProtocolManager1453 communicationProtocolManager14533 = v3.G();
                try {
                    try {
                        if (!communicationProtocolManager14532.equals(communicationProtocolManager14533) && !communicationProtocolManager1453.equals(communicationProtocolManager14533)) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw RuntimeResourceTracker.a(customSystemException);
                    }
                    return true;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
            }
            int n3 = v3.n();
            try {
                try {
                    if (n3 != n2 && n3 != n) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw RuntimeResourceTracker.a(customSystemException);
                }
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw RuntimeResourceTracker.a(customSystemException);
            }
        }
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(RuntimeResourceTracker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(RuntimeResourceTracker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

