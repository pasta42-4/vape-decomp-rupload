/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 */
package com.temporal.metadata;

import a.KW;
import a.N;
import a.S7;
import a.TN;
import a.XD;
import a.Z3;
import a._b;
import a.a;
import a.cf;
import a.cr;
import a.ec;
import a.it;
import com.app.events.EventNotificationBroker2314;
import com.app.graphics.rendering.RenderConfigurationManager1184;
import com.app.network.NetworkConnectionHandler1537;
import com.app.stream.processing.StreamProcessingCoordinator1197;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.AsynchronousTaskCoordinator342;
import com.concurrent.processing.AsynchronousOperationQueue;
import com.concurrent.scheduling.AsynchronousTaskScheduler1046;
import com.config.context.ConfigurationContextResolver775;
import com.core.computation.AbstractComputationKernel;
import com.core.event.EventRegistryManager;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.lifecycle.ObjectLifecycleManager;
import com.core.service.ServiceLifecycleController;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.data.collection.MultiListDataAggregator;
import com.data.streaming.DataStreamOrchestrator;
import com.data.transformation.DataTransformationHandler1402;
import com.dynamic.proxy.DynamicProxyResolver;
import com.encoding.core.DataEncodingOrchestrator;
import com.event.coordination.EventSequenceOrchestrator;
import com.event.dispatch.EventDispatchRegistry;
import com.event.management.EventSubscriptionManager;
import com.event.processing.EventStreamProcessor;
import com.filtering.selection.SelectionFilterRegistry;
import com.game.configuration.GameVersionEnumerator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.graphics.buffer.GraphicsBufferManager;
import com.integration.platform.CrossPlatformIntegrator;
import com.logging.context.LoggingContextManager;
import com.math.computation.IntegerComputationManager;
import com.math.geometry.GeometryCalculator;
import com.math.precision.PrecisionComputationService;
import com.messaging.core.MessageBroker;
import com.messaging.notification.NotificationBroker;
import com.messaging.queue.MessageQueueManager;
import com.metadata.management.MetadataOrchestrator;
import com.module.configuration.ModuleConfigurationRegistry;
import com.network.clustering.ClusterNodeRegistry1151;
import com.network.codec.NetworkPayloadEncoder747;
import com.network.configuration.NetworkConfigManager;
import com.network.configuration.NetworkConfigurationResolver;
import com.network.protocol.CommunicationProtocolNegotiator;
import com.network.protocol.NetworkProtocolAdapter286;
import com.network.protocols.ProtocolNegotiationHandler;
import com.object.lifecycle.ObjectLifecycleMediator;
import com.processing.transformation.DataTransformationEngine817;
import com.reflection.util.ContextualReflectionUtility;
import com.resource.management.DistributedResourceAllocator;
import com.resource.management.ResourceAllocationTracker401;
import com.runtime.context.DynamicContextBroker;
import com.runtime.signature.RuntimeSignatureBuilder;
import com.security.context.CryptoContextManager;
import com.security.context.CryptographicContextManager;
import com.security.crypto.CryptographicServiceManager;
import com.security.crypto.CryptographicSessionController;
import com.security.crypto.CryptographicTransformer724;
import com.security.metadata.TimestampedSecurityDescriptor;
import com.security.protocol.EncryptionProtocolHandler397;
import com.security.session.CipherSessionManager;
import com.security.session.CryptoSessionManager704;
import com.security.validation.AuthenticationTokenValidator;
import com.sensor.integration.SensorAdapter;
import com.stream.synchronization.StreamSynchronizer;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.ConfigurationResolver;
import com.system.lifecycle.SystemLifecycleController;
import com.system.pipeline.ObjectPipelineManager;
import com.system.resource.ResourceAllocationTracker748;
import com.transaction.model.TransactionDescriptor;
import com.transaction.monitoring.TransactionStatusTracker;
import com.ui.rendering.FontRenderingEngine;
import com.ui.rendering.GraphicalRenderingController;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletionException;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TemporalMetadataResolver {
    private ObjectLifecycleManager l;
    private static final Date P;
    public static boolean o;
    private AsynchronousOperationQueue k;
    private final ConfigurationContextResolver775 x;
    private CryptographicServiceManager G;
    private RenderConfigurationManager1184 L;
    private EventRegistryManager C;
    private String z;
    private GraphicsBufferManager n;
    public static final boolean a = false;
    private DynamicContextBroker b;
    private boolean F;
    private final EventSubscriptionManager v;
    private DataEncodingOrchestrator u;
    static NetworkConfigManager m;
    private static int M;
    private cf d;
    private MessageBroker t;
    public static final boolean H = false;
    private MessageQueueManager w;
    private final AsynchronousTaskCoordinator342 K;
    private CryptoContextManager c;
    public static boolean J;
    private boolean R;
    private DataStreamOrchestrator Z;
    private DistributedResourceAllocator Y;
    private MetadataOrchestrator N;
    public boolean Q;
    private ResourceAllocationTracker748 s;
    private CryptographicContextManager D;
    private FontRenderingEngine e;
    private EventDispatchRegistry i;
    private CommunicationProtocolNegotiator V;
    private TN A;
    private XD j;
    public static TemporalMetadataResolver h;
    private boolean S;
    private static final int[] g;
    private cr B;
    private AsynchronousTaskScheduler1046 I;
    private AuthenticationTokenValidator p;
    private Boolean O;
    private static final Map cb;
    private final boolean q;
    private static final long[] ab;
    private boolean X;
    private static final long E;
    private KW U;
    private static final Object[] db;
    private static final String[] eb;
    private EventSequenceOrchestrator W;
    private boolean T;
    public static boolean r;
    private IntegerComputationManager y;
    private static final Integer[] bb;
    public static final String f = "4.19";

    public CryptoContextManager E() {
        return this.c;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = TemporalMetadataResolver.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = TemporalMetadataResolver.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
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

    public cf c() {
        return this.d;
    }

    public TemporalMetadataResolver() {
        long l = E ^ 0x1ABEAC3791E0L;
        int n = TemporalMetadataResolver.R();
        this.x = new ConfigurationContextResolver775();
        this.K = new AsynchronousTaskCoordinator342(this);
        this.S = false;
        this.R = false;
        this.O = null;
        this.E(17);
        int n2 = n;
        try {
            h = this;
            this.q = a.a.iv();
            this.v = new NetworkPayloadEncoder747();
            if (AbstractComputationKernel.J() != null) {
                TemporalMetadataResolver.V(++n2);
            }
        }
        catch (CompletionException completionException) {
            throw TemporalMetadataResolver.a(completionException);
        }
    }

    public boolean J() {
        return this.X;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x63DF;
        if (bb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = ab[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])cb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    cb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/SE", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            TemporalMetadataResolver.bb[n2] = n3;
        }
        return bb[n2];
    }

    public void E(int n) {
        a.a.trs(n);
    }

    public ObjectLifecycleManager F() {
        return this.l;
    }

    public CryptographicTransformer724 t() {
        return null;
    }

    public boolean U() {
        return this.T;
    }

    public void M(JsonObject jsonObject, boolean bl) {
        block12: {
            long l;
            block11: {
                CallSite callSite;
                JsonObject jsonObject2;
                JsonObject jsonObject3;
                l = E ^ 0x415AA58D31ABL;
                JsonArray jsonArray = EncryptionProtocolHandler397.q(jsonObject, (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)18409, (long)(0x5CBA6FD08866C763L ^ l)), (long)7158207123583089026L, (long)l)));
                try {
                    if (jsonArray != null) {
                        this.Y.I(jsonArray);
                    }
                }
                catch (CompletionException completionException) {
                    throw TemporalMetadataResolver.a(completionException);
                }
                JsonObject jsonObject4 = EncryptionProtocolHandler397.F(jsonObject, (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)13079, (long)(0x24E85F7B98ECB39EL ^ l)), (long)7158207123583089026L, (long)l)));
                if (jsonObject4 != null) {
                    jsonObject3 = jsonObject.get((String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)19885, (long)(0x46225FC9AD08CD2DL ^ l)), (long)7158207123583089026L, (long)l))).getAsJsonObject();
                    this.j.R(jsonObject3);
                } else {
                    TemporalMetadataResolver.x((String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)12096, (long)(0x11029FFDA7CC2FD6L ^ l)), (long)7158207123583089026L, (long)l)));
                }
                try {
                    jsonObject2 = jsonObject;
                    callSite = bl ? TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)12779, (long)(0x1C706241C3FB164L ^ l)), (long)7158207123583089026L, (long)l) : TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)16347, (long)(0x5E3B08141B393F58L ^ l)), (long)7158207123583089026L, (long)l);
                }
                catch (CompletionException completionException) {
                    throw TemporalMetadataResolver.a(completionException);
                }
                jsonObject3 = EncryptionProtocolHandler397.q(jsonObject2, (String)((Object)callSite));
                try {
                    try {
                        if (jsonObject3 == null || jsonObject3.size() <= 0) break block11;
                    }
                    catch (CompletionException completionException) {
                        throw TemporalMetadataResolver.a(completionException);
                    }
                    this.N.V((JsonArray)jsonObject3);
                    break block12;
                }
                catch (CompletionException completionException) {
                    throw TemporalMetadataResolver.a(completionException);
                }
            }
            TemporalMetadataResolver.x((String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)23070, (long)(0x66AACBA8A2BDDA8FL ^ l)), (long)7158207123583089026L, (long)l)));
        }
        h.o().E();
    }

    public boolean s() {
        return SystemLifecycleController.C.c().w();
    }

    public EventSequenceOrchestrator x() {
        return this.W;
    }

    public AsynchronousOperationQueue R() {
        return this.k;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = TemporalMetadataResolver.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void Z() {
        this.d.u();
        this.d.z();
        this.w = new MessageQueueManager();
        this.w.R();
    }

    private static Method d(long l, long l2) {
        int n = TemporalMetadataResolver.a(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = eb[n];
                int n3 = string2.indexOf(8);
                clazz3 = TemporalMetadataResolver.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = TemporalMetadataResolver.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = TemporalMetadataResolver.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        TemporalMetadataResolver.db[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = TemporalMetadataResolver.b(815893571131656L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = TemporalMetadataResolver.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        TemporalMetadataResolver.db[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = TemporalMetadataResolver.b(815893571131656L, 0L);
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

    public void R(String string) {
        long l = E ^ 0x3AC731D7C7BFL;
        try {
            String string2 = this.Z.f();
            for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.J()) {
                try {
                    if (cipherSessionManager instanceof PrecisionComputationService) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    throw TemporalMetadataResolver.a(exception);
                }
                try {
                    if (!cipherSessionManager.m()) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    throw TemporalMetadataResolver.a(exception);
                }
                String string3 = (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)17056, (long)(0x267A5EE138EEB43AL ^ l)), (long)-7691175171296735338L, (long)l)) + cipherSessionManager.A().toLowerCase().replace((CharSequence)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)18860, (long)(0x12CE88CDF7C2BF3FL ^ l)), (long)-7691175171296735338L, (long)l)), (CharSequence)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)19667, (long)(0x4CF310618D7FBA5CL ^ l)), (long)-7691175171296735338L, (long)l))) + (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)22083, (long)(0x5E60BF35945C20D3L ^ l)), (long)-7691175171296735338L, (long)l)) + cipherSessionManager.A();
                string2 = string2 + string3 + (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)7334, (long)(0x3C27A83E36D96A30L ^ l)), (long)-7691175171296735338L, (long)l));
            }
            FileOutputStream fileOutputStream = new FileOutputStream(string);
            fileOutputStream.write(string2.getBytes());
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
            exception.printStackTrace();
        }
    }

    public boolean G() {
        return this.F;
    }

    public static void i(String string) {
        a.a.sce(string);
    }

    public static byte[] V(String string) {
        long l = E ^ 0x3CEF0A9E1C7L;
        return TemporalMetadataResolver.b("\u00d1", (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)9700, (long)(0x37BDE30142EDF515L ^ l)), (long)-5531742059927180818L, (long)l)) + string, (long)-5531588670590818829L, (long)l);
    }

    public static boolean K() {
        for (int n : g) {
            try {
                if (n != GeometryCalculator.C()) continue;
                return true;
            }
            catch (CompletionException completionException) {
                throw TemporalMetadataResolver.a(completionException);
            }
        }
        return false;
    }

    public MetadataOrchestrator V() {
        return this.N;
    }

    public KW g() {
        return this.U;
    }

    public DataStreamOrchestrator U() {
        return this.Z;
    }

    public DistributedResourceAllocator j() {
        return this.Y;
    }

    private static boolean lambda$registerListeners$0(EventNotificationBroker2314 eventNotificationBroker2314) {
        return a.N.J.x();
    }

    public EventDispatchRegistry m() {
        return this.i;
    }

    public RenderConfigurationManager1184 a() {
        return this.L;
    }

    public void u(boolean bl) {
        this.T = bl;
    }

    public boolean H() {
        long l = E ^ 0x46489E85E2F0L;
        LoggingContextManager.q();
        try {
            TransactionStatusTracker<TimestampedSecurityDescriptor> transactionStatusTracker = _b.S().C().join();
            if (!transactionStatusTracker.b()) {
                TemporalMetadataResolver.i((String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)13822, (long)(0x73344A0D8A23662DL ^ l)), (long)-5761220607272293671L, (long)l)) + transactionStatusTracker.A());
                return false;
            }
            this.p = AuthenticationTokenValidator.i(transactionStatusTracker.h());
        }
        catch (CancellationException | CompletionException runtimeException) {
            TemporalMetadataResolver.i((String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)9109, (long)(0x7321442FC8BBF050L ^ l)), (long)-5761220607272293671L, (long)l)) + TemporalMetadataResolver.j(runtimeException));
            return false;
        }
        return true;
    }

    public void n() {
        this.K.a();
        if (this.j != null) {
            TransactionDescriptor transactionDescriptor = this.j.A();
            try {
                if (transactionDescriptor != null) {
                    transactionDescriptor.j(true);
                }
            }
            catch (CompletionException completionException) {
                throw TemporalMetadataResolver.a(completionException);
            }
        }
    }

    public boolean q() {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    long l = E ^ 0x190E62B0265EL;
                    try {
                        try {
                            if (this.O != null) break block4;
                            TemporalMetadataResolver temporalMetadataResolver = this;
                            if (TemporalMetadataResolver.b("\u00d1", (Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)3407, (long)(0x1CF298AD48309A20L ^ l)), (long)8404375680630533751L, (long)l), (long)8404797453735459883L, (long)l) == null) break block5;
                        }
                        catch (CompletionException completionException) {
                            throw TemporalMetadataResolver.a(completionException);
                        }
                        bl = true;
                        break block6;
                    }
                    catch (CompletionException completionException) {
                        throw TemporalMetadataResolver.a(completionException);
                    }
                }
                bl = false;
            }
            temporalMetadataResolver.O = bl;
        }
        return this.O;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public GraphicsBufferManager l() {
        return this.n;
    }

    public boolean V() {
        return this.Q;
    }

    public int C() {
        try {
            if (this.p == null) {
                return 0;
            }
        }
        catch (CompletionException completionException) {
            throw TemporalMetadataResolver.a(completionException);
        }
        return (int)this.p.D();
    }

    public static int K() {
        int n = TemporalMetadataResolver.R();
        try {
            if (n == 0) {
                return 103;
            }
        }
        catch (CompletionException completionException) {
            throw TemporalMetadataResolver.a(completionException);
        }
        return 0;
    }

    public boolean r() {
        return this.q;
    }

    public void x() {
        try {
            try {
                if (ConfigurationManager.U()) {
                    CryptographicSessionController.x();
                }
            }
            catch (Exception exception) {
                throw TemporalMetadataResolver.a(exception);
            }
            this.e = new FontRenderingEngine();
            this.e.d();
            StateTrackingCoordinator.u();
            ConfigurationManager.F();
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    public void W() {
        r = true;
        this.L = new RenderConfigurationManager1184();
        this.L.z();
    }

    public TN O() {
        return this.A;
    }

    public cr e() {
        return this.B;
    }

    public FontRenderingEngine W() {
        return this.e;
    }

    public MessageBroker W() {
        return this.t;
    }

    public synchronized String l(boolean bl) {
        block6: {
            block5: {
                long l = E ^ 0x3610F9D33176L;
                try {
                    if (!bl || this.z != null) break block5;
                }
                catch (CompletionException completionException) {
                    throw TemporalMetadataResolver.a(completionException);
                }
                String string = a.a.gp((String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)18489, (long)(0x3C89E0E82AF0C868L ^ l)), (long)7172677545459530079L, (long)l)));
                byte[] byArray = ec.S(string);
                this.z = new String(byArray);
                break block6;
            }
            try {
                if (this.z == null) {
                    return "";
                }
            }
            catch (CompletionException completionException) {
                throw TemporalMetadataResolver.a(completionException);
            }
        }
        return this.z;
    }

    public AsynchronousTaskScheduler1046 c() {
        return this.I;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/SE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public CommunicationProtocolNegotiator Z() {
        return this.V;
    }

    public ResourceAllocationTracker748 J() {
        return this.s;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00eb' || c == '\u00a5' || c == 'h' || c == '\u00a3') {
                field = TemporalMetadataResolver.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00eb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'h' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = TemporalMetadataResolver.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public DataEncodingOrchestrator w() {
        return this.u;
    }

    public boolean d() {
        boolean bl;
        long l = E ^ 0x66FD287F3C21L;
        try {
            if (this.S) {
                return this.R;
            }
        }
        catch (CompletionException completionException) {
            throw TemporalMetadataResolver.a(completionException);
        }
        try {
            this.S = true;
            if (!this.q) {
                return false;
            }
        }
        catch (CompletionException completionException) {
            throw TemporalMetadataResolver.a(completionException);
        }
        try {
            TemporalMetadataResolver temporalMetadataResolver = this;
            bl = TemporalMetadataResolver.b("\u00d1", (Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)759, (long)(0x34700B17C8358FE1L ^ l)), (long)7988586206904792072L, (long)l), (long)7988445878338545236L, (long)l) != null;
        }
        catch (CompletionException completionException) {
            throw TemporalMetadataResolver.a(completionException);
        }
        temporalMetadataResolver.R = bl;
        return this.R;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/SE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void j() {
        TemporalMetadataResolver temporalMetadataResolver;
        int n;
        block7: {
            long l;
            block8: {
                l = E ^ 0x17D399328A3CL;
                this.E(18);
                TemporalMetadataResolver.b("\u00d1", (long)-2827775535444546725L, (long)l);
                int n2 = TemporalMetadataResolver.K();
                o = true;
                this.E(19);
                n = n2;
                try {
                    try {
                        temporalMetadataResolver = this;
                        if (n != 0) break block7;
                        if (!temporalMetadataResolver.q) break block8;
                    }
                    catch (CompletionException completionException) {
                        throw TemporalMetadataResolver.a(completionException);
                    }
                    TemporalMetadataResolver.b("\u00d1", (long)-2827947387656259467L, (long)l);
                    TemporalMetadataResolver.b("\u00d1", (long)-2827775535444546725L, (long)l);
                    a.a.rsc();
                }
                catch (CompletionException completionException) {
                    throw TemporalMetadataResolver.a(completionException);
                }
            }
            MultiListDataAggregator.l();
            DataTransformationEngine817.c();
            this.E(20);
            this.D = new CryptographicContextManager();
            TemporalMetadataResolver.b("m", (Object)this.D, (long)-2826327421267599619L, (long)l);
            this.E(21);
            TemporalMetadataResolver.b("\u00d1", (long)-2827947387656259467L, (long)l);
            CryptographicContextManager.k8.clear();
            this.X = true;
            MultiListDataAggregator.k();
            this.D = new CryptographicContextManager();
            TemporalMetadataResolver.b("m", (Object)this.D, (long)-2826327421267599619L, (long)l);
            MultiListDataAggregator.g();
            temporalMetadataResolver = this;
        }
        try {
            temporalMetadataResolver.E(22);
            a.a.su(ApplicationLifecycleManager.G().N());
            if (n != 0) {
                AbstractComputationKernel.I(new String[3]);
            }
        }
        catch (CompletionException completionException) {
            throw TemporalMetadataResolver.a(completionException);
        }
    }

    public void P() {
        this.L.x();
    }

    private static Field c(long l, long l2) {
        int n = TemporalMetadataResolver.a(l, l2);
        Object object = db[n];
        if (object instanceof String) {
            String string = eb[n];
            int n2 = string.indexOf(8);
            Class clazz = TemporalMetadataResolver.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = TemporalMetadataResolver.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = TemporalMetadataResolver.a(clazz3, string2, clazz2)) != null) {
                    TemporalMetadataResolver.db[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = TemporalMetadataResolver.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        TemporalMetadataResolver.db[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = TemporalMetadataResolver.b(815893571131656L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void W(Throwable throwable) {
        TemporalMetadataResolver.x(TemporalMetadataResolver.j(throwable));
    }

    private void U() {
        block6: {
            block5: {
                try {
                    Z3.s().A(ObjectLifecycleMediator.P, new Predicate[0]);
                    Z3.s().A(new ModuleConfigurationRegistry(), new Predicate[0]);
                    Z3.s().A(ResourceAllocationTracker401.H, new Predicate[0]);
                    Z3.s().A(EventStreamProcessor.B, new Predicate[0]);
                    Z3.s().A(ConfigurationCalibrator.b, new Predicate[0]);
                    Z3.s().A(ServiceLifecycleController.c, new Predicate[0]);
                    Z3.s().A(CrossPlatformIntegrator.C, new Predicate[0]);
                    Z3.s().A(ProtocolNegotiationHandler.e, new Predicate[0]);
                    Z3.s().A(a.N.J, TemporalMetadataResolver::lambda$registerListeners$0);
                    Z3.s().A(new DataTransformationHandler1402(), new Predicate[0]);
                    Z3.s().A(new SensorAdapter(), new Predicate[0]);
                    Z3.s().A(new RuntimeSignatureBuilder(), new Predicate[0]);
                    Z3.s().A(new StreamProcessingCoordinator1197(), new Predicate[0]);
                    Z3.s().A(new NetworkConnectionHandler1537(), new Predicate[0]);
                    Z3.s().A(NetworkConfigurationResolver.Z, TemporalMetadataResolver::lambda$registerListeners$1);
                    Z3.s().A(new NotificationBroker(), new Predicate[0]);
                    Z3.s().A(SelectionFilterRegistry.Y, new Predicate[0]);
                    Z3.s().A(this.I, new Predicate[0]);
                    Z3.s().A(new it(), new Predicate[0]);
                    if (GeometryCalculator.C() == 15) {
                        Z3.s().A(new CryptoSessionManager704(), new Predicate[0]);
                    }
                }
                catch (CompletionException completionException) {
                    throw TemporalMetadataResolver.a(completionException);
                }
                try {
                    if (!GameVersionEnumerator.MC_1_16_5.H()) break block5;
                    Z3.s().A(new NetworkProtocolAdapter286(), new Predicate[0]);
                    break block6;
                }
                catch (CompletionException completionException) {
                    throw TemporalMetadataResolver.a(completionException);
                }
            }
            Z3.s().A(new StreamSynchronizer(), new Predicate[0]);
        }
    }

    public static void S(String string) {
        long l = E ^ 0x3F423E5CBD10L;
        a.a.p(String.format((String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)1023, (long)(0x3EC7030533D78FDCL ^ l)), (long)-1158426298053905095L, (long)l)), System.currentTimeMillis(), string + (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)32616, (long)(0x376CB9E3E9507352L ^ l)), (long)-1158426298053905095L, (long)l)) + m.d()));
        m.m();
    }

    public static void V(int n) {
        M = n;
    }

    public XD o() {
        return this.j;
    }

    public IntegerComputationManager u() {
        return this.y;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = TemporalMetadataResolver.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public AsynchronousTaskCoordinator342 u() {
        return this.K;
    }

    public DynamicContextBroker a() {
        return this.b;
    }

    /*
     * Unable to fully structure code
     */
    public void q() {
        block22: {
            block26: {
                block28: {
                    block23: {
                        block29: {
                            block27: {
                                block21: {
                                    block24: {
                                        var1_1 = TemporalMetadataResolver.E ^ 60155053619185L;
                                        v0 = TemporalMetadataResolver.K();
                                        this.n = new GraphicsBufferManager();
                                        this.n.o(24, 1);
                                        this.s = new ResourceAllocationTracker748();
                                        var3_2 = v0;
                                        this.y = new IntegerComputationManager();
                                        this.B = new cr();
                                        this.V = new CommunicationProtocolNegotiator();
                                        this.N = new MetadataOrchestrator();
                                        this.Y = new DistributedResourceAllocator();
                                        this.C = new EventRegistryManager();
                                        this.U = new KW();
                                        this.c = new CryptoContextManager();
                                        this.i = new EventDispatchRegistry();
                                        this.b = new DynamicContextBroker();
                                        this.l = new ObjectLifecycleManager();
                                        this.Z = new DataStreamOrchestrator();
                                        TemporalMetadataResolver.b("m", (Object)this.Z, (long)7281036325461128352L, (long)var1_1);
                                        this.b.g = this.Z.K(DynamicProxyResolver.class);
                                        this.G = new CryptographicServiceManager();
                                        this.E(23);
                                        TemporalMetadataResolver.b("\u00db", (Object)this, (long)7281300732309148835L, (long)var1_1);
                                        this.E(24);
                                        this.W = new EventSequenceOrchestrator();
                                        this.W.e();
                                        try {
                                            this.W.q();
                                        }
                                        catch (Throwable var4_3) {
                                            // empty catch block
                                        }
                                        ObjectPipelineManager.h();
                                        this.u = new DataEncodingOrchestrator();
                                        this.j = new XD();
                                        this.Z.X();
                                        this.I = new AsynchronousTaskScheduler1046();
                                        this.K.F();
                                        this.E(25);
                                        this.Z.g();
                                        v1 = this.l.j();
                                        if (var3_2 != 0) break block21;
                                        if (v1 == null) ** GOTO lbl55
                                        break block24;
                                        catch (Throwable v2) {
                                            throw TemporalMetadataResolver.a(v2);
                                        }
                                    }
                                    try {
                                        block25: {
                                            this.o().q(this.l.j());
                                            if (var3_2 == 0) break block21;
                                            break block25;
                                            catch (Throwable v3) {
                                                throw TemporalMetadataResolver.a(v3);
                                            }
                                        }
                                        v1 = this.o().W();
                                    }
                                    catch (Throwable v4) {
                                        throw TemporalMetadataResolver.a(v4);
                                    }
                                }
                                v5 = this;
                                if (var3_2 != 0) break block22;
                                if (v5.j.W() == null) break block26;
                                break block27;
                                catch (Throwable v6) {
                                    throw TemporalMetadataResolver.a(v6);
                                }
                            }
                            v7 = TemporalMetadataResolver.h;
                            if (var3_2 != 0) break block28;
                            break block29;
                            catch (Throwable v8) {
                                throw TemporalMetadataResolver.a(v8);
                            }
                        }
                        try {
                            block30: {
                                if (!v7.F().j.s().booleanValue()) break block23;
                                break block30;
                                catch (Throwable v9) {
                                    throw TemporalMetadataResolver.a(v9);
                                }
                            }
                            this.j.W().C();
                        }
                        catch (Throwable v10) {
                            throw TemporalMetadataResolver.a(v10);
                        }
                    }
                    v7 = this;
                }
                v7.j.W().X();
            }
            this.E(26);
            this.A = new TN();
            this.E(27);
            this.k = new AsynchronousOperationQueue();
            TemporalMetadataResolver.b("m", (Object)ClusterNodeRegistry1151.W(), (long)7281679885086518689L, (long)var1_1);
            TemporalMetadataResolver.b("m", (Object)this, (long)7281096972107895205L, (long)var1_1);
            this.G();
            this.K.c();
            this.e().n((ConfigurationResolver)TemporalMetadataResolver.h.F().P.J());
            new Thread(this.K.c()).start();
            this.E(28);
            TemporalMetadataResolver.b("\u00d1", (long)7281527218719365420L, (long)var1_1);
            v5 = this;
        }
        v5.U();
        try {
            SystemLifecycleController.C.L();
        }
        catch (Exception var4_4) {
            TemporalMetadataResolver.W(var4_4);
        }
        try {
            if (GameVersionEnumerator.MC_1_21_10.H()) {
                this.I.t((String)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)16932, (long)(6395554772088374520L ^ var1_1)), (long)7281608786769362904L, (long)var1_1), (String)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)16165, (long)(6274039652943903208L ^ var1_1)), (long)7281608786769362904L, (long)var1_1), CryptoConfigurationRegistry383.WARNING, 10000L);
            }
        }
        catch (Throwable v11) {
            throw TemporalMetadataResolver.a(v11);
        }
    }

    public ConfigurationContextResolver775 c() {
        return this.x;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = TemporalMetadataResolver.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = TemporalMetadataResolver.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static boolean lambda$registerListeners$1(EventNotificationBroker2314 eventNotificationBroker2314) {
        return Z3.X;
    }

    public static void k() {
        long l = E ^ 0x1F565D8AFA5L;
        ContextualReflectionUtility.E();
        TemporalMetadataResolver.b("\u00d1", (int)101, (long)-189371987748943900L, (long)l);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = TemporalMetadataResolver.a(l, l2);
            object = db[n];
            try {
                if (!(object instanceof String)) break block2;
                TemporalMetadataResolver.db[n] = clazz = Class.forName(eb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void B(boolean bl) {
        this.F = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void X() {
        long l = E ^ 0x614EF52A8EC3L;
        this.d = new cf();
        int n = TemporalMetadataResolver.R();
        this.d.b();
        int n2 = n;
        this.d.z();
        S7.G.execute(GraphicalRenderingController::F);
        try {
            try {
                while (!GraphicalRenderingController.sK) {
                    try {
                        Thread.sleep(10L);
                        if (n2 == 0) return;
                    }
                    catch (InterruptedException interruptedException) {
                        TemporalMetadataResolver.W(interruptedException);
                        if (n2 != 0) continue;
                        break;
                    }
                }
            }
            catch (CompletionException completionException) {
                throw TemporalMetadataResolver.a(completionException);
            }
        }
        catch (CompletionException completionException) {
            throw TemporalMetadataResolver.a(completionException);
        }
        this.d.x();
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (eb[n4] != null) {
            return n4;
        }
        Object object = db[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 37;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 58;
                break;
            }
            case 3: {
                n3 = 41;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 5: {
                n3 = 48;
                break;
            }
            case 6: {
                n3 = 56;
                break;
            }
            case 7: {
                n3 = 9;
                break;
            }
            case 8: {
                n3 = 52;
                break;
            }
            case 9: {
                n3 = 0;
                break;
            }
            case 10: {
                n3 = 7;
                break;
            }
            case 11: {
                n3 = 29;
                break;
            }
            case 12: {
                n3 = 17;
                break;
            }
            case 13: {
                n3 = 18;
                break;
            }
            case 14: {
                n3 = 43;
                break;
            }
            case 15: {
                n3 = 53;
                break;
            }
            case 16: {
                n3 = 33;
                break;
            }
            case 17: {
                n3 = 28;
                break;
            }
            case 18: {
                n3 = 44;
                break;
            }
            case 19: {
                n3 = 26;
                break;
            }
            case 20: {
                n3 = 23;
                break;
            }
            case 21: {
                n3 = 42;
                break;
            }
            case 22: {
                n3 = 34;
                break;
            }
            case 23: {
                n3 = 36;
                break;
            }
            case 24: {
                n3 = 31;
                break;
            }
            case 25: {
                n3 = 16;
                break;
            }
            case 26: {
                n3 = 13;
                break;
            }
            case 27: {
                n3 = 54;
                break;
            }
            case 28: {
                n3 = 5;
                break;
            }
            case 29: {
                n3 = 6;
                break;
            }
            case 30: {
                n3 = 40;
                break;
            }
            case 31: {
                n3 = 15;
                break;
            }
            case 32: {
                n3 = 10;
                break;
            }
            case 33: {
                n3 = 1;
                break;
            }
            case 34: {
                n3 = 49;
                break;
            }
            case 35: {
                n3 = 4;
                break;
            }
            case 36: {
                n3 = 11;
                break;
            }
            case 37: {
                n3 = 25;
                break;
            }
            case 38: {
                n3 = 63;
                break;
            }
            case 39: {
                n3 = 61;
                break;
            }
            case 40: {
                n3 = 2;
                break;
            }
            case 41: {
                n3 = 39;
                break;
            }
            case 42: {
                n3 = 51;
                break;
            }
            case 43: {
                n3 = 21;
                break;
            }
            case 44: {
                n3 = 35;
                break;
            }
            case 45: {
                n3 = 55;
                break;
            }
            case 46: {
                n3 = 57;
                break;
            }
            case 47: {
                n3 = 59;
                break;
            }
            case 48: {
                n3 = 45;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 30;
                break;
            }
            case 51: {
                n3 = 22;
                break;
            }
            case 52: {
                n3 = 20;
                break;
            }
            case 53: {
                n3 = 19;
                break;
            }
            case 54: {
                n3 = 3;
                break;
            }
            case 55: {
                n3 = 62;
                break;
            }
            case 56: {
                n3 = 27;
                break;
            }
            case 57: {
                n3 = 47;
                break;
            }
            case 58: {
                n3 = 60;
                break;
            }
            case 59: {
                n3 = 14;
                break;
            }
            case 60: {
                n3 = 46;
                break;
            }
            case 61: {
                n3 = 24;
                break;
            }
            case 62: {
                n3 = 38;
                break;
            }
            default: {
                n3 = 32;
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
        TemporalMetadataResolver.eb[n4] = new String(cArray);
        return n4;
    }

    private static void b() {
        Object[] objectArray = db;
        db[0] = "|\u0016'B";
        objectArray[1] = Void.TYPE;
        TemporalMetadataResolver.eb[1] = "java/lang/Void";
        objectArray[2] = "CGJ}";
        objectArray[3] = "f4\u001e";
        objectArray[4] = Integer.TYPE;
        TemporalMetadataResolver.eb[4] = "java/lang/Integer";
        objectArray[5] = ")!ukKX\".d$6@1)mm";
        objectArray[6] = "O\n";
        objectArray[7] = "z\u0013\u0007lN{q\u001c\u0016##{q\u0001\u0002";
        objectArray[8] = "2&vV";
        objectArray[9] = "B#[r";
        objectArray[10] = "$pl#";
        objectArray[11] = "x@r_-5sOc\u0010L;xDgJ";
        objectArray[12] = "\u001f\u0007^\u0015wuUD\r\u001eIiO\u007fZ\u001b/vEE\u000f\u0014$|%FZJ%bB\u0006X\u0010s\f";
        objectArray[13] = "MkIvpf\u0016m[y\u0001Lp7\u000e=mh\u0017w\fg;\u0006";
        objectArray[14] = "8Al6^J}\u001cy$`v\u0006\u00190r\fJaY2(Z$";
        objectArray[15] = "v{oB \u0011u}mOF?O%:\u0012*\u001c(e8H|r";
        objectArray[16] = "c\u0006BV\u000eV)E\u0011]0A\"~D\t\u000bC7\u0019\u0004\u000bQ\u0015Y";
        objectArray[17] = "wK\u0007ctl2\u0016\u0012qJRI\u0013['&l.SY}p\u0002";
        objectArray[18] = "J\u001a\u0010\u0010J\u0003[\u0019\u0014 mm\u001aLFLH\nZN\u001c\u001a&";
        objectArray[19] = "r\u0003\n-8x8@Y&\u0006n#{\u000e1{d,DVr:|HGD 7d5\u0011\nv7\u0001";
        objectArray[20] = "J\u0017\u0007\fy\n\u0000TT\u0007G\u001f\u001bo\u0001S|\u001f\u001e\bAQ&Ip";
        objectArray[21] = "o\u0019z/%_%Z)$\u001bM.a~!}\\5[+.vVUZ=6~Bj\u0002~wf&";
        objectArray[22] = "2\u0001.\u00174\u0000m^o\u0003Z\f\r[nV6\fj\u001bl\f`b";
        Object[] objectArray2 = objectArray;
        objectArray[23] = "j!GC!F b\u0014H\u001fP>3x\u001cgB5=GD$\u0003-YDZ'U(a\u0003\u0016z^P";
    }

    private void G() {
        long l = E ^ 0x4DC83436D31BL;
        GraphicalRenderingController graphicalRenderingController = h.U().K(GraphicalRenderingController.class);
        try {
            if (graphicalRenderingController.L.s().booleanValue()) {
                this.I.L((String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)22665, (long)(0x2D3726C9C25E3AB2L ^ l)), (long)-9086289456475088078L, (long)l)), (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)30405, (long)(0x7C5BCC2C7CBA14ECL ^ l)), (long)-9086289456475088078L, (long)l)) + graphicalRenderingController.C().t() + (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)30074, (long)(0x58E5711F751A175FL ^ l)), (long)-9086289456475088078L, (long)l)), 5000L);
            }
        }
        catch (CompletionException completionException) {
            throw TemporalMetadataResolver.a(completionException);
        }
        this.I.t((String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)22221, (long)(0x4615D3EB5569B4F0L ^ l)), (long)-9086289456475088078L, (long)l)), (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)30905, (long)(0x75D33019B7509A96L ^ l)), (long)-9086289456475088078L, (long)l)), CryptoConfigurationRegistry383.WARNING, 10000L);
    }

    public AuthenticationTokenValidator r() {
        return this.p;
    }

    public static int R() {
        return M;
    }

    public CryptographicContextManager u() {
        return this.D;
    }

    public EventRegistryManager M() {
        return this.C;
    }

    public boolean Z() {
        boolean bl;
        block7: {
            block8: {
                long l = E ^ 0x537943BD960DL;
                int n = TemporalMetadataResolver.R();
                try {
                    if (this.p == null) {
                        return false;
                    }
                }
                catch (CompletionException completionException) {
                    throw TemporalMetadataResolver.a(completionException);
                }
                List<Long> list = Arrays.asList(149956L, 149953L);
                try {
                    try {
                        bl = list.contains(this.p.D());
                        if (n == 0) break block7;
                        if (!bl) break block8;
                    }
                    catch (CompletionException completionException) {
                        throw TemporalMetadataResolver.a(completionException);
                    }
                    return false;
                }
                catch (CompletionException completionException) {
                    throw TemporalMetadataResolver.a(completionException);
                }
            }
            bl = this.p.o().before(P);
        }
        return bl;
    }

    public CryptographicServiceManager S() {
        return this.G;
    }

    public static void x(String string) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                TemporalMetadataResolver.E = MultiContainerRegistry.a(6556914246836556267L, -3457818595226953634L, MethodHandles.lookup().lookupClass()).a(155501395782664L);
                TemporalMetadataResolver.db = new Object[24];
                TemporalMetadataResolver.eb = new String[24];
                TemporalMetadataResolver.b();
                TemporalMetadataResolver.cb = new HashMap<K, V>(13);
                TemporalMetadataResolver.V(34);
                var0 = TemporalMetadataResolver.E ^ 82576197519189L;
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
                var8_3 = new long[29];
                var5_4 = 0;
                var6_5 = "\u00b5\u00d6y\u00b7F.\u0094\u000e\u00db\u00e6\u0086\u001a\u00a7d\u0086r\u00b6\"\u009e\u00c2p%\u007f\u00b5\u00a8\u00d4\u0005\u00dd\u00b4\u00f9\u00c8\u009e)\u008f\u00feS^--3\u00e8\u0098\u009a\u0099CQ\u00f4!\u00bf\u00fe]\u00ddH\u00c3[\u00fb\u00cd\u00ea\u00be*\u000e\u00ca\u0018\n\u0086\u00bb\u0081\u00f5Kj\u00b5\u00a4\u009ep\t\u0091o\u0087\u001db\u00e5\u00a7y)\u00ef\u009c\u00b3\u0082\r\u00a4\u0015x4A\u0096@\u0097\u00b5\u00e2S~\u00e0\u00d9\u00b47\u00b9XnQ\u00a3\u0094n{\u00bc\u00ea\u00f3\u00e79+L\r\u00a3\u009f\u00a4\u00d9p$#\u001flo\u0095JIq\u00b7\u0081\u00bd\u0000;\u00d2\u0097\u009fj:\u009d\u0016\u0087U%_~\u009b\u000f\u00c4\u00cb\u0006\u009c\u000e-7b^\u0004\u00b5\u00c3\u00a2\u0080<\u0085B\u00fe\u00a8\u00a4v\u00e6M\u00e0\u00b34\u008b\u000b\u00ad\u00fc\u00d4l\u0003\u00ae\u0081\u00c3s\u00c0$\u009ah\u00f0\u00d5\u009a\u00d0\u00a1B?F\u00c3\r\u0091\u0002\u008c;)\u00d1\u00ce\u00a1C\u001c\u00fa";
                var7_6 = "\u00b5\u00d6y\u00b7F.\u0094\u000e\u00db\u00e6\u0086\u001a\u00a7d\u0086r\u00b6\"\u009e\u00c2p%\u007f\u00b5\u00a8\u00d4\u0005\u00dd\u00b4\u00f9\u00c8\u009e)\u008f\u00feS^--3\u00e8\u0098\u009a\u0099CQ\u00f4!\u00bf\u00fe]\u00ddH\u00c3[\u00fb\u00cd\u00ea\u00be*\u000e\u00ca\u0018\n\u0086\u00bb\u0081\u00f5Kj\u00b5\u00a4\u009ep\t\u0091o\u0087\u001db\u00e5\u00a7y)\u00ef\u009c\u00b3\u0082\r\u00a4\u0015x4A\u0096@\u0097\u00b5\u00e2S~\u00e0\u00d9\u00b47\u00b9XnQ\u00a3\u0094n{\u00bc\u00ea\u00f3\u00e79+L\r\u00a3\u009f\u00a4\u00d9p$#\u001flo\u0095JIq\u00b7\u0081\u00bd\u0000;\u00d2\u0097\u009fj:\u009d\u0016\u0087U%_~\u009b\u000f\u00c4\u00cb\u0006\u009c\u000e-7b^\u0004\u00b5\u00c3\u00a2\u0080<\u0085B\u00fe\u00a8\u00a4v\u00e6M\u00e0\u00b34\u008b\u000b\u00ad\u00fc\u00d4l\u0003\u00ae\u0081\u00c3s\u00c0$\u009ah\u00f0\u00d5\u009a\u00d0\u00a1B?F\u00c3\r\u0091\u0002\u008c;)\u00d1\u00ce\u00a1C\u001c\u00fa".length();
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
                    var6_5 = "\u00d6Z\u00d7:P*\u001b\u00ebWi\u00cf3'ek\\";
                    var7_6 = "\u00d6Z\u00d7:P*\u001b\u00ebWi\u00cf3'ek\\".length();
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
        TemporalMetadataResolver.ab = var8_3;
        TemporalMetadataResolver.bb = new Integer[29];
        TemporalMetadataResolver.g = new int[]{13, 15, 23, 35, 36};
        TemporalMetadataResolver.P = new Date(1710640988922L);
        TemporalMetadataResolver.r = false;
        TemporalMetadataResolver.J = false;
        TemporalMetadataResolver.o = false;
        TemporalMetadataResolver.m = new NetworkConfigManager();
    }

    public static String j(Throwable throwable) {
        long l = E ^ 0x689B6DE6F5F9L;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        throwable.printStackTrace(printWriter);
        return (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)10977, (long)(0x7B9EF4AB15186E27L ^ l)), (long)-6411675947644420656L, (long)l)) + throwable.getClass().getCanonicalName() + (String)((Object)TemporalMetadataResolver.b("\u00d1", (int)TemporalMetadataResolver.a("c", (int)7627, (long)(0x231073CE839DD91CL ^ l)), (long)-6411675947644420656L, (long)l)) + stringWriter.toString();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(TemporalMetadataResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(TemporalMetadataResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

