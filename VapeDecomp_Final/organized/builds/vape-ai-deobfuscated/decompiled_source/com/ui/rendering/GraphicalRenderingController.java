/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package com.ui.rendering;

import a.KB;
import a.Ne;
import a.a;
import a.cr;
import a.fG;
import a.fH;
import a.fO;
import a.fP;
import a.fe;
import a.fl;
import a.fu;
import a.wj;
import a.ws;
import com.adapter.management.GenericAdapterManager;
import com.analytics.computation.MetricsCalculationEngine;
import com.analytics.computation.NumericComputationEngine1000;
import com.app.security.auth.JwtTokenHandler;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.concurrency.execution.TaskDispatcherService;
import com.concurrency.sync.MultiThreadResourceSynchronizer;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.lifecycle.ObjectLifecycleManager;
import com.data.processing.CollectionFilterProcessor;
import com.data.protocol.DataProcessingProtocol;
import com.data.transformation.DataEncodingTransformer;
import com.data.transformation.DataTransformationService;
import com.distributed.topology.DistributedResourceTopologyManager;
import com.event.core.EventDispatchCoordinator1159;
import com.event.dispatch.EventDispatchController;
import com.event.management.EventDispatchCoordinator511;
import com.event.trigger.EventTriggerEngine;
import com.exception.system.CustomSystemException;
import com.execution.validation.ExecutionStateValidator;
import com.finance.risk.FinancialRiskCalculator;
import com.finance.transaction.TransactionValidator1498;
import com.game.input.GameInputController;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.color.ColorCompositionEngine;
import com.graphics.palette.ColorPaletteGenerator;
import com.integration.multimodal.MultimodalIntegrationFramework;
import com.math.geometry.GeometryCalculator;
import com.media.transcoding.MediaTranscodingEngine;
import com.module.dynamic.DynamicModuleLoader;
import com.network.communication.NetworkCommunicationBroker;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.protocol.CommunicationProtocolManager;
import com.network.protocol.NetworkProtocolInterceptor;
import com.network.secure.SecureConnectionOrchestrator;
import com.network.security.NetworkSecurityTransformer;
import com.network.security.SecureTransmissionProtocol;
import com.network.transmission.TransmissionProtocolHandler;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.dynamic.DynamicInvocationResolver1041;
import com.reflection.dynamic.ReflectiveMethodInvoker549;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.utils.ReflectionProxyHandler;
import com.rendering.buffer.GraphicsBufferAllocator;
import com.resource.lifecycle.ResourceLifecycleOrchestrator;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.mediation.RuntimeContextMediator;
import com.runtime.reflection.ReflectionObjectMapper;
import com.security.allocation.SecureResourceAllocator;
import com.security.async.AsynchronousCipherManager;
import com.security.authentication.AuthenticationGateway1860;
import com.security.authentication.CryptographicKeyResolver;
import com.security.constants.CipherConfigurationMode;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CipherManager;
import com.security.crypto.CryptographicContextManager567;
import com.security.crypto.CryptographicKeyManager426;
import com.security.crypto.CryptographicSessionController;
import com.security.crypto.CryptographicSessionManager1141;
import com.security.crypto.CryptographicUtility;
import com.security.cryptography.EncryptionKeyGenerator;
import com.security.cryptography.SecurityCipherManager;
import com.security.encoding.SecureDataEncoder;
import com.security.network.SecureChannelNegotiator;
import com.security.resource.SecureResourceAllocator360;
import com.security.session.CipherSessionManager;
import com.spatial.mapping.CoordinateMapper;
import com.system.configuration.ConfigurationManager;
import com.system.diagnostics.SystemDiagnosticAnalyzer;
import com.system.resilience.ResiliencyEventProcessor;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.logging.TransactionLogOrchestrator;
import com.transaction.management.TransactionOrchestrator1017;
import com.ui.events.UserInteractionEventDispatcher;
import com.ui.input.UserInputEventMapper;
import com.workflow.core.WorkflowOrchestrator;
import java.awt.Color;
import java.awt.Point;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class GraphicalRenderingController
extends ContextualExecutionFramework {
    public static final TaskDispatcherService st;
    private CipherSessionManager sd;
    public static WorkflowOrchestrator s6;
    public static Color sU;
    private static final Map hb;
    public AuthenticationStateTracker L;
    public AuthenticationStateTracker sW;
    private static int j;
    public AuthenticationStateTracker sy;
    private static final int sx;
    private static final long bb;
    public boolean P;
    public static TransactionLogOrchestrator G;
    public static WorkflowOrchestrator B;
    private static final boolean h = true;
    private static final List<CipherSessionManager> s2;
    public AuthenticationStateTracker sj;
    private boolean sQ;
    public GenericAdapterManager Z;
    private static CipherSessionManager b;
    private final boolean r = false;
    public static ResiliencyEventProcessor v;
    public final AuthenticationGateway1860 Y;
    public static WorkflowOrchestrator F;
    private static HashSet<CipherSessionManager> so;
    private static final Integer[] gb;
    public NumericPrecisionTransformer T;
    private boolean X;
    private static ImmutableList<CipherSessionManager> sf;
    public static WorkflowOrchestrator w;
    private static final long[] fb;
    public static boolean sK;
    public static WorkflowOrchestrator z;
    Set<CipherSessionManager> x;
    public static WorkflowOrchestrator s7;
    private static final List<NumericComputationEngine1000> sk;
    private static MetricsCalculationEngine N;
    private static final String[] lb;
    private float R;
    public AuthenticationStateTracker sJ;
    private static final Object[] kb;
    public AuthenticationStateTracker sq;
    public static NetworkSecurityTransformer A;
    public static boolean e;
    public static WorkflowOrchestrator o;
    private static final HashMap<Class<?>, CipherSessionManager> V;
    public static GraphicalRenderingController K;
    public final AuthenticationGateway1860 n;
    public int s5;
    public final AuthenticationGateway1860 O;
    private WorkflowOrchestrator s0;
    public static WorkflowOrchestrator l;
    public GenericAdapterManager m;
    private boolean sa;
    public static AbstractComputationKernel d;
    public static fu s4;
    boolean t;

    private static Method d(long l, long l2) {
        int n = GraphicalRenderingController.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = lb[n];
                int n3 = string2.indexOf(8);
                clazz3 = GraphicalRenderingController.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = GraphicalRenderingController.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = GraphicalRenderingController.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        GraphicalRenderingController.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = GraphicalRenderingController.b(506321148363216L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = GraphicalRenderingController.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        GraphicalRenderingController.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = GraphicalRenderingController.b(506321148363216L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cb' || c == '\u00d0' || c == '\u00c2' || c == 'P') {
                field = GraphicalRenderingController.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = GraphicalRenderingController.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void N(JsonArray jsonArray) {
        long l = bb ^ 0x29C3B32022B0L;
        try {
            if (jsonArray.size() == 0) {
                return;
            }
        }
        catch (Exception exception) {
            throw GraphicalRenderingController.a(exception);
        }
        jsonArray = jsonArray.get(0).getAsJsonArray();
        int n = 0;
        while (true) {
            block15: {
                if (n >= jsonArray.size()) {
                    return;
                }
                try {
                    JsonElement jsonElement;
                    block14: {
                        jsonElement = jsonArray.get(n);
                        try {
                            if (jsonElement.isJsonObject() && !jsonElement.isJsonNull()) break block14;
                            break block15;
                        }
                        catch (Exception exception) {
                            throw GraphicalRenderingController.a(exception);
                        }
                    }
                    JsonObject jsonObject = jsonElement.getAsJsonObject();
                    try {
                        if (jsonObject.get((String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)1593, (long)(0x379C97DB0CAA0B74L ^ l)), (long)986628985351354914L, (long)l))) == null || jsonObject.get((String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)26781, (long)(0x4E81EB6C9E2265CDL ^ l)), (long)986628985351354914L, (long)l))).isJsonNull()) break block15;
                    }
                    catch (Exception exception) {
                        throw GraphicalRenderingController.a(exception);
                    }
                    for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.J()) {
                        try {
                            if (!cipherSessionManager.A().equals(jsonObject.get((String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)20545, (long)(0x2E87FB0EE350DD07L ^ l)), (long)986628985351354914L, (long)l))).getAsString())) continue;
                            cipherSessionManager.y(jsonObject);
                        }
                        catch (Exception exception) {
                            throw GraphicalRenderingController.a(exception);
                        }
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            ++n;
        }
    }

    public static List<CipherSessionManager> J() {
        return s2;
    }

    private static void B() {
        try {
            GraphicalRenderingController.J(new SecureConnectionOrchestrator().L(ApplicationLifecycleManager.e() / 4 - 154, 38.0), s7, F);
            GraphicalRenderingController.J(new DistributedResourceTopologyManager().L(40.0, 40.0), s7, F);
            GraphicalRenderingController.J(new MultiThreadResourceSynchronizer().L(40.0, 150.0), s7, F);
            GraphicalRenderingController.J(new TransmissionProtocolHandler().L(ApplicationLifecycleManager.e() / 2 - 90, 10.0), s7, F);
            GraphicalRenderingController.J(new DataTransformationService().L(100.0, 150.0), s7, F);
            GraphicalRenderingController.J(new ReflectiveMethodInvoker549().L(140.0, 40.0), s7, F);
            GraphicalRenderingController.J(new fl().L(140.0, 70.0), s7, F);
            GraphicalRenderingController.J(new DynamicModuleLoader().L(140.0, 110.0), s7, F);
            if (GeometryCalculator.C() < 50) {
                GraphicalRenderingController.J(new MediaTranscodingEngine(), s7, F);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
    }

    public boolean p(GameInputController gameInputController) {
        block15: {
            block17: {
                block16: {
                    int n = gameInputController.getKey();
                    boolean bl = gameInputController.isDown();
                    int n2 = 70;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (!DynamicInvocationResolver1041.F(163) && !DynamicInvocationResolver1041.F(162)) break block15;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalRenderingController.a(customSystemException);
                                        }
                                        if (n != 70) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalRenderingController.a(customSystemException);
                                    }
                                    if (!bl) break block15;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicalRenderingController.a(customSystemException);
                                }
                                if (this.O.o()) break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderingController.a(customSystemException);
                            }
                            if (!this.Y.o()) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                        A.s().s().I();
                        break block17;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                }
                try {
                    if (this.n.o()) {
                        G.o().y();
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
            }
            return true;
        }
        return false;
    }

    public static void l(CipherSessionManager cipherSessionManager) {
        try {
            if (!cipherSessionManager.g()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
        GraphicalRenderingController.K.sd = cipherSessionManager;
    }

    public void m(boolean bl) {
        this.sa = bl;
    }

    public static void z() {
        for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.K.s0.Y()) {
            try {
                if (!(cipherSessionManager instanceof EventDispatchCoordinator511)) continue;
                ((EventDispatchCoordinator511)cipherSessionManager).Z();
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = GraphicalRenderingController.a(lookup, mutableCallSite, string, methodType, l, l2);
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

    private static void lambda$removePopup$1(WorkflowOrchestrator workflowOrchestrator, CipherContextManager1101 cipherContextManager1101) {
        workflowOrchestrator.d(cipherContextManager1101);
    }

    public void T(WorkflowOrchestrator workflowOrchestrator) {
        this.c();
        v = null;
        this.s0 = workflowOrchestrator;
        for (CipherSessionManager cipherSessionManager : workflowOrchestrator.Y()) {
            try {
                if (!cipherSessionManager.N()) continue;
                cipherSessionManager.q();
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
    }

    private static void lambda$new$0(GenericAdapterManager genericAdapterManager) {
        G.Y();
    }

    @Override
    public void X(GameInputController gameInputController) {
        block8: {
            block9: {
                try {
                    try {
                        try {
                            try {
                                super.X(gameInputController);
                                if (this.P) break block8;
                                if (gameInputController.getKey() != 27) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderingController.a(customSystemException);
                            }
                            if (!gameInputController.isDown()) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                        this.P = true;
                        this.T(false);
                        if (this.S().equals(s6)) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                    ApplicationLifecycleManager.Y();
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
            }
            gameInputController.setCanceled(true);
        }
    }

    @Override
    public void m() {
        block8: {
            long l;
            block7: {
                block6: {
                    l = bb ^ 0x137A878C1F9L;
                    try {
                        try {
                            super.m();
                            if (ApplicationLifecycleManager.X().M() == null || ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.Uk)) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                }
                try {
                    if (!this.Z()) break block7;
                    ApplicationLifecycleManager.E();
                    this.X = ApplicationLifecycleManager.N().U();
                    ApplicationLifecycleManager.N().e(false);
                    this.P = false;
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
            }
            ApplicationLifecycleManager.N().e(this.X);
            TemporalMetadataResolver.x((String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)17734, (long)(0x4150D46E0FBAB5EL ^ l)), (long)-1227198867940812437L, (long)l)));
            this.P = true;
        }
    }

    public static void F() {
        long l = bb ^ 0x580A57DD2483L;
        try {
            TemporalMetadataResolver.h.x();
            GraphicalRenderingController.B();
            GraphicalRenderingController.J(new CryptographicContextManager567(), s7, F);
            A = new NetworkSecurityTransformer();
            GraphicalRenderingController.J(A, F);
            G = new TransactionLogOrchestrator();
            GraphicalRenderingController.J(G, F);
            GraphicalRenderingController.J(new EncryptionKeyGenerator(), F);
            GraphicalRenderingController.J(new CryptographicKeyManager426(), F);
            s4 = new fu(RecursiveNodeGraph.X);
            GraphicalRenderingController.J(s4, F);
            if (GraphicalRenderingController.c("\u00d5", (Object)TemporalMetadataResolver.h, (long)829416722846641178L, (long)l) != false) {
                GraphicalRenderingController.J(new fu(RecursiveNodeGraph.G), F);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
        GraphicalRenderingController.J(new fu(RecursiveNodeGraph.z), F);
        GraphicalRenderingController.J(new fu(RecursiveNodeGraph.K), F);
        GraphicalRenderingController.J(new fu(RecursiveNodeGraph.k), F);
        GraphicalRenderingController.J(new fu(RecursiveNodeGraph.W), F);
        GraphicalRenderingController.J(new fu(RecursiveNodeGraph.V), F);
        GraphicalRenderingController.J(new fO(), F);
        GraphicalRenderingController.J(new DataEncodingTransformer(), F);
        GraphicalRenderingController.J(new fH(), F);
        GraphicalRenderingController.J(new ReflectionProxyHandler(), F);
        GraphicalRenderingController.J(new ResourceLifecycleOrchestrator(), F);
        GraphicalRenderingController.J(new ws(), F);
        GraphicalRenderingController.J(new wj(), F);
        GraphicalRenderingController.J(new FinancialRiskCalculator(), F);
        GraphicalRenderingController.J(new NetworkCommunicationBroker(), F);
        GraphicalRenderingController.J(new SecureChannelNegotiator(), F);
        GraphicalRenderingController.J(new AsynchronousCipherManager(), F);
        GraphicalRenderingController.J(new MultimodalIntegrationFramework(), F);
        GraphicalRenderingController.J(new fe(), GraphicalRenderingController.l);
        GraphicalRenderingController.J(GraphicalRenderingController.D(fe.class).L(), GraphicalRenderingController.l);
        GraphicalRenderingController.J(new CommunicationProtocolManager(), w);
        GraphicalRenderingController.J(new NetworkProtocolInterceptor(), s7);
        GraphicalRenderingController.J(NetworkProtocolInterceptor.Jr, s7);
        GraphicalRenderingController.J(new fG(), s7);
        GraphicalRenderingController.J(GraphicalRenderingController.D(fG.class).P(), s7);
        GraphicalRenderingController.J(new SecureResourceAllocator360(), s7);
        GraphicalRenderingController.J(new SecurityCipherManager(), s7);
        GraphicalRenderingController.J(new SecureDataEncoder(), s6);
        GraphicalRenderingController.J(new CryptographicKeyResolver(), o);
        GraphicalRenderingController.J(new SecureTransmissionProtocol(), z);
        GraphicalRenderingController.J(new fP(), z);
        sf = ImmutableList.copyOf(s2);
        GraphicalRenderingController.j();
        fO.p();
        sK = true;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (lb[n4] != null) {
            return n4;
        }
        Object object = kb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 4;
                break;
            }
            case 1: {
                n3 = 54;
                break;
            }
            case 2: {
                n3 = 48;
                break;
            }
            case 3: {
                n3 = 63;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 37;
                break;
            }
            case 6: {
                n3 = 52;
                break;
            }
            case 7: {
                n3 = 38;
                break;
            }
            case 8: {
                n3 = 60;
                break;
            }
            case 9: {
                n3 = 8;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 15;
                break;
            }
            case 12: {
                n3 = 61;
                break;
            }
            case 13: {
                n3 = 16;
                break;
            }
            case 14: {
                n3 = 2;
                break;
            }
            case 15: {
                n3 = 21;
                break;
            }
            case 16: {
                n3 = 28;
                break;
            }
            case 17: {
                n3 = 57;
                break;
            }
            case 18: {
                n3 = 35;
                break;
            }
            case 19: {
                n3 = 3;
                break;
            }
            case 20: {
                n3 = 32;
                break;
            }
            case 21: {
                n3 = 22;
                break;
            }
            case 22: {
                n3 = 14;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 10;
                break;
            }
            case 25: {
                n3 = 56;
                break;
            }
            case 26: {
                n3 = 24;
                break;
            }
            case 27: {
                n3 = 33;
                break;
            }
            case 28: {
                n3 = 47;
                break;
            }
            case 29: {
                n3 = 27;
                break;
            }
            case 30: {
                n3 = 26;
                break;
            }
            case 31: {
                n3 = 0;
                break;
            }
            case 32: {
                n3 = 1;
                break;
            }
            case 33: {
                n3 = 34;
                break;
            }
            case 34: {
                n3 = 30;
                break;
            }
            case 35: {
                n3 = 62;
                break;
            }
            case 36: {
                n3 = 5;
                break;
            }
            case 37: {
                n3 = 46;
                break;
            }
            case 38: {
                n3 = 41;
                break;
            }
            case 39: {
                n3 = 53;
                break;
            }
            case 40: {
                n3 = 29;
                break;
            }
            case 41: {
                n3 = 58;
                break;
            }
            case 42: {
                n3 = 25;
                break;
            }
            case 43: {
                n3 = 17;
                break;
            }
            case 44: {
                n3 = 31;
                break;
            }
            case 45: {
                n3 = 40;
                break;
            }
            case 46: {
                n3 = 36;
                break;
            }
            case 47: {
                n3 = 11;
                break;
            }
            case 48: {
                n3 = 23;
                break;
            }
            case 49: {
                n3 = 44;
                break;
            }
            case 50: {
                n3 = 20;
                break;
            }
            case 51: {
                n3 = 12;
                break;
            }
            case 52: {
                n3 = 13;
                break;
            }
            case 53: {
                n3 = 43;
                break;
            }
            case 54: {
                n3 = 49;
                break;
            }
            case 55: {
                n3 = 19;
                break;
            }
            case 56: {
                n3 = 51;
                break;
            }
            case 57: {
                n3 = 18;
                break;
            }
            case 58: {
                n3 = 7;
                break;
            }
            case 59: {
                n3 = 6;
                break;
            }
            case 60: {
                n3 = 9;
                break;
            }
            case 61: {
                n3 = 59;
                break;
            }
            case 62: {
                n3 = 50;
                break;
            }
            default: {
                n3 = 55;
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
        GraphicalRenderingController.lb[n4] = new String(cArray);
        return n4;
    }

    public void K(MetricsCalculationEngine metricsCalculationEngine, MetricsCalculationEngine metricsCalculationEngine2) {
        for (CipherSessionManager cipherSessionManager : this.s0.Y()) {
            try {
                if (!cipherSessionManager.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            try {
                if (!cipherSessionManager.N()) continue;
                cipherSessionManager.m((double)ApplicationLifecycleManager.e() / 4.0 - cipherSessionManager.w() / 2.0, (double)ApplicationLifecycleManager.b() / 4.0 - cipherSessionManager.b() / 2.0);
                cipherSessionManager.h(true);
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
        GraphicalRenderingController.D(NetworkSecurityTransformer.class).y();
        GraphicalRenderingController.D(SecureResourceAllocator360.class).I();
    }

    public static int b() {
        int n = GraphicalRenderingController.x();
        try {
            if (n == 0) {
                return 45;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
        return 0;
    }

    public void X() {
        block6: {
            block5: {
                try {
                    if (this.P) break block5;
                    break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
            }
            try {
                this.q();
                if (ConfigurationManager.U()) {
                    CryptographicSessionController.x().v(0.0f);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
    }

    public static void D(int n) {
        j = n;
    }

    public static int x() {
        return j;
    }

    public static ArrayList<CipherContextManager1101> S() {
        ArrayList<CipherContextManager1101> arrayList = new ArrayList<CipherContextManager1101>();
        for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.K.s0.Y()) {
            arrayList.addAll(cipherSessionManager.V());
        }
        return arrayList;
    }

    public static <T extends CipherSessionManager> T D(Class<T> clazz) {
        CipherSessionManager cipherSessionManager = V.get(clazz);
        try {
            if (cipherSessionManager != null) {
                return (T)cipherSessionManager;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
        for (CipherSessionManager cipherSessionManager2 : s2) {
            try {
                if (!cipherSessionManager2.getClass().getCanonicalName().equals(clazz.getCanonicalName())) continue;
                V.put(clazz, cipherSessionManager2);
                return (T)cipherSessionManager2;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
        return null;
    }

    private static void J(CipherSessionManager cipherSessionManager, WorkflowOrchestrator ... workflowOrchestratorArray) {
        s2.add(cipherSessionManager);
        for (WorkflowOrchestrator workflowOrchestrator : workflowOrchestratorArray) {
            workflowOrchestrator.B(cipherSessionManager);
        }
    }

    @Override
    public boolean h() {
        return false;
    }

    private void V() {
        for (CipherSessionManager cipherSessionManager : s2) {
            if (!cipherSessionManager.f()) continue;
            try {
                if (!cipherSessionManager.F()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            cipherSessionManager.t();
        }
    }

    private void c() {
        ArrayList<CipherContextManager1101> arrayList = new ArrayList<CipherContextManager1101>();
        for (CipherSessionManager cipherSessionManager : this.s0.Y()) {
            for (CipherContextManager1101 cipherContextManager1101 : cipherSessionManager.V()) {
                try {
                    if (!cipherContextManager1101.K()) continue;
                    arrayList.add(cipherContextManager1101);
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
            }
        }
        for (CipherContextManager1101 cipherContextManager1101 : arrayList) {
            cipherContextManager1101.T().V().remove(cipherContextManager1101);
            this.s0.d(cipherContextManager1101);
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = GraphicalRenderingController.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = GraphicalRenderingController.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = GraphicalRenderingController.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = GraphicalRenderingController.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = GraphicalRenderingController.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = GraphicalRenderingController.a(clazz3, string2, clazz2)) != null) {
                    GraphicalRenderingController.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = GraphicalRenderingController.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        GraphicalRenderingController.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = GraphicalRenderingController.b(506321148363216L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void w(CipherSessionManager cipherSessionManager, List<CipherSessionManager> list) {
        try {
            if (!cipherSessionManager.f()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
        cipherSessionManager.E();
        if (cipherSessionManager.G()) {
            boolean bl = true;
            for (CipherSessionManager cipherSessionManager2 : list) {
                try {
                    if (cipherSessionManager2.equals(cipherSessionManager)) {
                        break;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
                try {
                    if (!cipherSessionManager2.f() || !cipherSessionManager2.G()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
                bl = false;
            }
            try {
                if (bl) {
                    cipherSessionManager.N();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
    }

    public void M(int n, int n2, int n3) {
        UserInteractionEventDispatcher userInteractionEventDispatcher;
        block34: {
            boolean bl;
            block36: {
                block35: {
                    CoordinateMapper coordinateMapper = GraphicsBufferAllocator.b();
                    userInteractionEventDispatcher = new UserInteractionEventDispatcher(coordinateMapper.X, coordinateMapper.I, CipherConfigurationMode.Z(n3));
                    try {
                        if (userInteractionEventDispatcher.fire()) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                    try {
                        try {
                            if (d == null) break block34;
                            if (d instanceof CipherManager) break block35;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                        bl = true;
                        break block36;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                }
                bl = false;
            }
            boolean bl2 = bl;
            try {
                d.S(userInteractionEventDispatcher);
                if (bl2) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
        CopyOnWriteArrayList<CipherSessionManager> copyOnWriteArrayList = new CopyOnWriteArrayList<CipherSessionManager>(this.s0.Y());
        Collections.reverse(copyOnWriteArrayList);
        for (CipherSessionManager iterator : copyOnWriteArrayList) {
            try {
                try {
                    try {
                        if (!iterator.f() || !iterator.j().f()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                    if (!iterator.j().s()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
                iterator.j().l();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
        boolean bl = false;
        block23: for (CipherSessionManager cipherSessionManager : copyOnWriteArrayList) {
            try {
                if (!cipherSessionManager.f()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            for (DataProcessingProtocol dataProcessingProtocol : cipherSessionManager.Z()) {
                if (dataProcessingProtocol.o(new Point(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY()))) {
                    bl = true;
                    break;
                }
                dataProcessingProtocol.B(new Point(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY()), userInteractionEventDispatcher.getAction().n());
            }
            for (DataProcessingProtocol dataProcessingProtocol : cipherSessionManager.G()) {
                if (!dataProcessingProtocol.o(new Point(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY()))) continue;
                bl = true;
                continue block23;
            }
        }
        if (!bl) {
            for (CipherSessionManager cipherSessionManager : copyOnWriteArrayList) {
                Object object;
                block37: {
                    block38: {
                        try {
                            if (!cipherSessionManager.f()) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                        try {
                            cipherSessionManager.O(userInteractionEventDispatcher);
                            if (!cipherSessionManager.j(userInteractionEventDispatcher.getX(), userInteractionEventDispatcher.getY())) break block37;
                            if (!(cipherSessionManager instanceof RuntimeContextMediator)) break block38;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                        object = (RuntimeContextMediator)cipherSessionManager;
                        try {
                            if (!RuntimeContextMediator.I()) {
                                continue;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                    }
                    cipherSessionManager.R();
                    cipherSessionManager.S(userInteractionEventDispatcher);
                    break;
                }
                if (!(cipherSessionManager instanceof RuntimeContextMediator)) continue;
                object = (RuntimeContextMediator)cipherSessionManager;
                ((RuntimeContextMediator)object).V(false);
            }
        }
    }

    public boolean k() {
        return this.P;
    }

    public static void e(CipherSessionManager cipherSessionManager) {
        so.add(cipherSessionManager);
    }

    public void s(CipherSessionManager cipherSessionManager, CipherSessionManager cipherSessionManager2) {
        this.s0.G(cipherSessionManager, cipherSessionManager2);
    }

    public void u() {
        long l = bb ^ 0x2E850C6E8813L;
        this.E();
        GraphicalRenderingController.c("\u00d5", (Object)TemporalMetadataResolver.h.c(), (long)-6407984246522554287L, (long)l);
    }

    public JsonArray P() {
        long l = bb ^ 0x2D85A9E607BFL;
        JsonArray jsonArray = new JsonArray();
        for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.J()) {
            try {
                if (cipherSessionManager.A().startsWith((String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)1579, (long)(0xB1072B545932E60L ^ l)), (long)2935838517445435181L, (long)l)))) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            jsonArray.add((JsonElement)cipherSessionManager.E());
        }
        return jsonArray;
    }

    public static CipherSessionManager w() {
        return b;
    }

    @Override
    public void b() {
    }

    @Override
    protected CollectionFilterProcessor c() {
        return new TransactionValidator1498(this);
    }

    public static void a(RecursiveNodeGraph recursiveNodeGraph) {
        for (CipherSessionManager cipherSessionManager : s2) {
            try {
                try {
                    if (!((NetworkConnectionEstablisher)GraphicalRenderingController.K.Z.J()).equals(GraphicalRenderingController.K.n) && cipherSessionManager instanceof TransactionLogOrchestrator) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            try {
                if (!(cipherSessionManager instanceof fu) || !((fu)cipherSessionManager).Q().equals(recursiveNodeGraph)) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            int n = ((fu)cipherSessionManager).r();
            try {
                if (!(cipherSessionManager.Q() instanceof SecureResourceAllocator)) continue;
                ((SecureResourceAllocator)cipherSessionManager.Q()).o(n);
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = GraphicalRenderingController.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = GraphicalRenderingController.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ao" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void n() {
        ColorCompositionEngine colorCompositionEngine = TemporalMetadataResolver.h.a().q.L();
        float[] fArray = new float[3];
        Color.RGBtoHSB(((Color)colorCompositionEngine).getRed(), ((Color)colorCompositionEngine).getGreen(), ((Color)colorCompositionEngine).getBlue(), fArray);
        this.R = fArray[0];
    }

    public static void X(CipherSessionManager cipherSessionManager) {
        WorkflowOrchestrator workflowOrchestrator = K.S();
        st.execute(() -> GraphicalRenderingController.lambda$removePopups$2(cipherSessionManager, workflowOrchestrator));
        cipherSessionManager.V().V().clear();
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = GraphicalRenderingController.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                GraphicalRenderingController.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static <T extends CipherContextManager1101> T v(AbstractComputationKernel abstractComputationKernel, AbstractComputationKernel abstractComputationKernel2, Class<T> clazz) {
        try {
            Constructor<T> constructor = clazz.getConstructor(AbstractComputationKernel.class, AbstractComputationKernel.class);
            CipherContextManager1101 cipherContextManager1101 = (CipherContextManager1101)constructor.newInstance(abstractComputationKernel, abstractComputationKernel2);
            GraphicalRenderingController.K.s0.Y().add(cipherContextManager1101);
            abstractComputationKernel.V().V().add(cipherContextManager1101);
            return (T)cipherContextManager1101;
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
            return null;
        }
    }

    public static boolean P() {
        return true;
    }

    public static void j() {
        for (CipherSessionManager cipherSessionManager : s2) {
            try {
                if (!(cipherSessionManager instanceof fu) || cipherSessionManager instanceof TransactionLogOrchestrator) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            int n = ((fu)cipherSessionManager).r();
            try {
                if (!(cipherSessionManager.Q() instanceof SecureResourceAllocator)) continue;
                ((SecureResourceAllocator)cipherSessionManager.Q()).o(n);
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
    }

    @Override
    public void v() {
        super.v();
        this.H();
        CryptographicUtility.e(ApplicationLifecycleManager.N().e(), false);
    }

    public static void r(NumericComputationEngine1000 numericComputationEngine1000) {
        sk.add(numericComputationEngine1000);
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "L\u0000\u001c\n";
        objectArray[1] = Void.TYPE;
        GraphicalRenderingController.lb[1] = "java/lang/Void";
        objectArray[2] = "\u00029f";
        objectArray[3] = Integer.TYPE;
        GraphicalRenderingController.lb[3] = "java/lang/Integer";
        objectArray[4] = "t\u001f\f.lm\u007f\u0010\u001da\u0011ul\u0017\u0014(";
        objectArray[5] = ":C*H";
        objectArray[6] = Boolean.TYPE;
        GraphicalRenderingController.lb[6] = "java/lang/Boolean";
        objectArray[7] = "i\u0004cVY(b\u000br\u00198&i\u0000vC";
        objectArray[8] = ".*\u0010Hxwpx\u0017/:\u00058y\u0012@ 5toS/";
        objectArray[9] = "?\u0015\u00003-\u0012?\u0019\u0000=F\u0013}{\u0001q<\u001b\u007fKF$~\u0006\u0006@\u000b${\u0013}\u0000\u000b1?x";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "~\u001eXMO\f \u001dUC%\"EPWLB\r}\u0001C\f\u001ap";
    }

    public static CipherSessionManager W(String string) {
        for (CipherSessionManager cipherSessionManager : s2) {
            try {
                if (cipherSessionManager.A() == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            try {
                if (!cipherSessionManager.A().equalsIgnoreCase(string)) continue;
                return cipherSessionManager;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
        return null;
    }

    @Deprecated
    public static void a(Class clazz, boolean bl) {
        block4: {
            boolean bl2;
            Object t;
            Object t2;
            block6: {
                block5: {
                    t2 = GraphicalRenderingController.D(clazz);
                    try {
                        try {
                            if (t2 == null) break block4;
                            t = t2;
                            if (((AbstractComputationKernel)t2).f()) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                        bl2 = true;
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                }
                bl2 = false;
            }
            ((CipherSessionManager)t).r(bl2, bl);
            ((CipherSessionManager)t2).R();
        }
    }

    public boolean b() {
        return this.sa;
    }

    public void B(EventTriggerEngine eventTriggerEngine) {
        TemporalMetadataResolver.h.a().q.k();
    }

    public GraphicalRenderingController() {
        long l = bb ^ 0x3289D623F49AL;
        super(a.cs((int)GraphicalRenderingController.a("o", (int)8614, (long)(0x2ACD8474BF957AD3L ^ l))), 161, 0, RecursiveNodeGraph.p, a.cs((int)GraphicalRenderingController.a("o", (int)9776, (long)(0x8EEF2C42AB77D56L ^ l))));
        this.r = false;
        this.s5 = 0;
        this.sy = AuthenticationStateTracker.R(this, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)28574, (long)(0x2E22B5F9C7C734E8L ^ l)), (long)-2622451094055588856L, (long)l)), true, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)22735, (long)(0x1E49FDA8AFD103B2L ^ l)), (long)-2622451094055588856L, (long)l)));
        this.sW = AuthenticationStateTracker.R(this, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)22473, (long)(0x2ADB098C347F8CACL ^ l)), (long)-2622451094055588856L, (long)l)), false, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)28463, (long)(0x513341D284E4B447L ^ l)), (long)-2622451094055588856L, (long)l)));
        this.L = AuthenticationStateTracker.R(this, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)24624, (long)(0x3D96C4191B3FBB54L ^ l)), (long)-2622451094055588856L, (long)l)), true, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)9942, (long)(0x66188A67860C7DAFL ^ l)), (long)-2622451094055588856L, (long)l)));
        this.sj = new JwtTokenHandler(this, this, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)15760, (long)(0x19F7C5B74CB5E6FBL ^ l)), (long)-2622451094055588856L, (long)l)), true);
        this.sJ = AuthenticationStateTracker.R(this, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)29581, (long)(0x1AAE31D3006428F3L ^ l)), (long)-2622451094055588856L, (long)l)), true, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)20283, (long)(0x58C6308278C79447L ^ l)), (long)-2622451094055588856L, (long)l)));
        this.T = NumericPrecisionTransformer.D(this, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)2774, (long)(0x64F5CCFA0854D1AEL ^ l)), (long)-2622451094055588856L, (long)l)), (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)15262, (long)(0x53604ECCDAFF60F1L ^ l)), (long)-2622451094055588856L, (long)l)), "", 0.1, 1.0, 10.0, 0.1, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)25216, (long)(0x5E13C176B457B9F2L ^ l)), (long)-2622451094055588856L, (long)l)));
        this.m = (GenericAdapterManager)GenericAdapterManager.D(this, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)7117, (long)(0x71FBAAEF749740A0L ^ l)), (long)-2622451094055588856L, (long)l)), cr.X, cr.X, cr.T, cr.v, cr.E, cr.m).y(false);
        this.sq = AuthenticationStateTracker.R(this, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)13168, (long)(0x4F04088C3637E800L ^ l)), (long)-2622451094055588856L, (long)l)), true, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)19650, (long)(0x412ED256D01917B5L ^ l)), (long)-2622451094055588856L, (long)l)));
        this.P = true;
        this.sQ = false;
        this.s0 = F;
        this.x = new HashSet<CipherSessionManager>(s2);
        this.R = 0.0f;
        K = this;
        this.Y = new AuthenticationGateway1860((String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)21743, (long)(0x493DED6A098A8F9EL ^ l)), (long)-2622451094055588856L, (long)l)), 0.8);
        this.n = new AuthenticationGateway1860((String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)21155, (long)(0x5C0155D81E0D89CAL ^ l)), (long)-2622451094055588856L, (long)l)), 0.8);
        this.O = new AuthenticationGateway1860((String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)19442, (long)(0x10AD18B94DA21098L ^ l)), (long)-2622451094055588856L, (long)l)), 0.8);
        this.Z = GenericAdapterManager.I(this, (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)24390, (long)(0x45AFECCA85E90432L ^ l)), (long)-2622451094055588856L, (long)l)), (String)((Object)GraphicalRenderingController.c("B", (int)GraphicalRenderingController.a("o", (int)1918, (long)(0x3E794217DA885C01L ^ l)), (long)-2622451094055588856L, (long)l)), this.Y, this.n, this.O, this.Y);
        ObjectLifecycleManager objectLifecycleManager = TemporalMetadataResolver.h.F();
        objectLifecycleManager.C.l(objectLifecycleManager.K);
        objectLifecycleManager.C.l(objectLifecycleManager.F);
        objectLifecycleManager.C.l(objectLifecycleManager.r);
        this.Z.P(GraphicalRenderingController::lambda$new$0);
        this.N(this.sy, this.sW, this.L, this.sJ, this.T, this.Z);
    }

    @DataExchangeProtocol2090
    public void D(UserInputEventMapper userInputEventMapper) {
        try {
            if (!this.P) {
                userInputEventMapper.setCanceled(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
    }

    /*
     * Exception decompiling
     */
    public static void A(CipherSessionManager var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.NullPointerException: Cannot invoke "org.benf.cfr.reader.bytecode.analysis.types.BindingSuperContainer.getBoundSuperForBase(org.benf.cfr.reader.bytecode.analysis.types.JavaTypeInstance)" because "bindingSuperContainer" is null
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopLivenessClash.getIterableIterType(LoopLivenessClash.java:35)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopLivenessClash.detect(LoopLivenessClash.java:66)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.LoopLivenessClash.detect(LoopLivenessClash.java:25)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:827)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @DataExchangeProtocol2090
    public void l(EventTriggerEngine eventTriggerEngine) {
        try {
            if (this.sd != null) {
                this.s0.x(this.sd);
                this.sd.V().forEach(CipherContextManager1101::L);
                b = this.sd;
                this.sd = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
    }

    public boolean O() {
        return this.S().equals(F);
    }

    public void K() {
        this.I(false);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Loose catch block
     */
    public void W(KB kB) {
        try {
            block41: {
                block39: {
                    block40: {
                        block36: {
                            block38: {
                                block37: {
                                    block44: {
                                        block43: {
                                            if (ApplicationLifecycleManager.X().M() == null) break block36;
                                            if (!ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.Uk)) break block37;
                                            break block43;
                                            catch (Exception exception) {
                                                throw GraphicalRenderingController.a(exception);
                                            }
                                        }
                                        if (!this.C().B()) break block37;
                                        break block44;
                                        catch (Exception exception) {
                                            throw GraphicalRenderingController.a(exception);
                                        }
                                    }
                                    try {
                                        block45: {
                                            if (!this.P) break block37;
                                            break block45;
                                            catch (Exception exception) {
                                                throw GraphicalRenderingController.a(exception);
                                            }
                                        }
                                        this.m();
                                        this.T(s6);
                                        break block38;
                                    }
                                    catch (Exception exception) {
                                        throw GraphicalRenderingController.a(exception);
                                    }
                                }
                                try {
                                    if (!this.P && !this.C().B()) {
                                        // empty if block
                                    }
                                }
                                catch (Exception exception) {
                                    throw GraphicalRenderingController.a(exception);
                                }
                            }
                            if (!this.s0.equals(s6)) break block39;
                            try {
                                block46: {
                                    if (ApplicationLifecycleManager.X().B(ReflectionMetadataResolver.Uk)) break block39;
                                    break block46;
                                    catch (Exception exception) {
                                        throw GraphicalRenderingController.a(exception);
                                    }
                                }
                                this.T(F);
                                break block39;
                            }
                            catch (Exception exception) {
                                throw GraphicalRenderingController.a(exception);
                            }
                        }
                        if (this.P) break block39;
                        try {
                            block47: {
                                if (GeometryCalculator.C() < 35) break block40;
                                break block47;
                                catch (Exception exception) {
                                    throw GraphicalRenderingController.a(exception);
                                }
                            }
                            if (!ApplicationLifecycleManager.k().R()) break block39;
                        }
                        catch (Exception exception) {
                            throw GraphicalRenderingController.a(exception);
                        }
                        this.m();
                        return;
                    }
                    if (ApplicationLifecycleManager.d()) {
                        this.m();
                        return;
                    }
                }
                if (d == null) break block41;
                try {
                    block48: {
                        if (d.f()) break block41;
                        break block48;
                        catch (Exception exception) {
                            throw GraphicalRenderingController.a(exception);
                        }
                    }
                    d = null;
                }
                catch (Exception exception) {
                    throw GraphicalRenderingController.a(exception);
                }
            }
            this.x.clear();
            this.x.addAll(s2);
            this.x.addAll(this.s0.Y());
            if (GraphicalRenderingController.K.P) {
                for (CipherSessionManager cipherSessionManager : s2) {
                    try {
                        if (!(cipherSessionManager instanceof EventDispatchController)) continue;
                        this.x.add(cipherSessionManager);
                    }
                    catch (Exception exception) {
                        throw GraphicalRenderingController.a(exception);
                    }
                }
            }
            for (CipherSessionManager cipherSessionManager : this.x) {
                try {
                    cipherSessionManager.c();
                }
                catch (Exception exception) {
                    TemporalMetadataResolver.x("" + cipherSessionManager.A());
                    TemporalMetadataResolver.W(exception);
                }
            }
            try {
                if (this.s5++ > 20) {
                    this.s5 = 0;
                }
            }
            catch (Exception exception) {
                throw GraphicalRenderingController.a(exception);
            }
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
    }

    public static void i() {
        so.clear();
    }

    public Color T(Object object) {
        block16: {
            block18: {
                TransactionOrchestrator1017 transactionOrchestrator1017;
                block17: {
                    try {
                        if (!ReflectionMetadataResolver.Ut.isInstance(object)) {
                            return null;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                    try {
                        if (object.equals(ApplicationLifecycleManager.U())) {
                            return null;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                    transactionOrchestrator1017 = new TransactionOrchestrator1017(object);
                    float f = transactionOrchestrator1017.y(ApplicationLifecycleManager.U());
                    try {
                        try {
                            try {
                                if (!ReflectionMetadataResolver.Pr.isInstance(object)) break block16;
                                if (!TemporalMetadataResolver.h.j().Q(transactionOrchestrator1017.e())) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderingController.a(customSystemException);
                            }
                            if (!TemporalMetadataResolver.h.j().b.s().booleanValue()) break block17;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                        return TemporalMetadataResolver.h.j().u.L();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (!TemporalMetadataResolver.h.g().Q(transactionOrchestrator1017.e()) || !TemporalMetadataResolver.h.g().a.s().booleanValue()) break block18;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                    return TemporalMetadataResolver.h.g().F.L();
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
            }
            return Color.WHITE;
        }
        return null;
    }

    public void q() {
        long l = bb ^ 0x3330E27FCC97L;
        int n = Ne.h.S(3009);
        float f = Ne.h.h(3010);
        Ne.h.p(516, 0.0f);
        if (K.k()) {
            Ne.h.z();
            double d2 = TemporalMetadataResolver.h.a().b();
            try {
                Ne.h.x(d2, d2, d2);
                if (K.k()) {
                    this.V();
                    GraphicalRenderingController.c("\u00d5", (Object)TemporalMetadataResolver.h.c(), (long)-2047350081628660523L, (long)l);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            Ne.h.X();
        }
        Ne.h.p(n, f);
    }

    public static void z(CipherContextManager1101 cipherContextManager1101) {
        WorkflowOrchestrator workflowOrchestrator = K.S();
        st.execute(() -> GraphicalRenderingController.lambda$removePopup$1(workflowOrchestrator, cipherContextManager1101));
        cipherContextManager1101.T().V().remove(cipherContextManager1101);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ao" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void H() {
        try {
            if (TemporalMetadataResolver.h.U().K(GraphicalRenderingController.class).sy.s().booleanValue()) {
                CryptographicSessionManager1141.p().T();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
    }

    public static void k(String string) {
        CipherSessionManager cipherSessionManager = null;
        for (CipherSessionManager cipherSessionManager2 : s2) {
            boolean bl;
            CipherSessionManager cipherSessionManager3;
            block11: {
                block10: {
                    try {
                        try {
                            try {
                                if (!(cipherSessionManager2 instanceof fu) || !((fu)cipherSessionManager2).W().equalsIgnoreCase(string)) continue;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderingController.a(customSystemException);
                            }
                            cipherSessionManager3 = cipherSessionManager2;
                            if (cipherSessionManager2.f()) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                        bl = true;
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                }
                bl = false;
            }
            cipherSessionManager3.N(bl);
            cipherSessionManager = cipherSessionManager2;
        }
        try {
            if (cipherSessionManager != null) {
                cipherSessionManager.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
    }

    public WorkflowOrchestrator S() {
        return this.s0;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xE4;
        if (gb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ao", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GraphicalRenderingController.gb[n2] = n3;
        }
        return gb[n2];
    }

    public void L() {
        double d2 = 32.0;
        double d3 = 32.0;
        double d4 = 0.0;
        for (CipherSessionManager cipherSessionManager : sf) {
            if (!cipherSessionManager.m()) continue;
            try {
                if (!cipherSessionManager.d()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            if (d2 + cipherSessionManager.w() > (double)ApplicationLifecycleManager.P().s()) {
                d2 = 24.0;
                d3 += d4 + 8.0;
                d4 = 0.0;
            }
            if (cipherSessionManager.b() > d4) {
                d4 = cipherSessionManager.b();
            }
            cipherSessionManager.b(d2);
            cipherSessionManager.M(d3);
            cipherSessionManager.A();
            d2 += cipherSessionManager.w() + 2.0;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                GraphicalRenderingController.bb = MultiContainerRegistry.a(-1867913350177472371L, 1930697753737349945L, MethodHandles.lookup().lookupClass()).a(4381640182357L);
                GraphicalRenderingController.kb = new Object[11];
                GraphicalRenderingController.lb = new String[11];
                GraphicalRenderingController.a();
                GraphicalRenderingController.hb = new HashMap<K, V>(13);
                var0 = GraphicalRenderingController.bb ^ 44012955325965L;
                GraphicalRenderingController.D(90);
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
                var8_3 = new long[28];
                var5_4 = 0;
                var6_5 = "lN\u00ab\f\u00f7Z\u00f2l7w\u008a\u00b0\u0002a\u001a\u0098\u00aa\u009e\u0086\u001ast\u00bdZ\u009a#\u00b7\u00c7\u001a\u0017\u009cYST\u0000\u0016\u0004\u00ff\u00e6+O\u000e|\u008c\u00b1\u00f410-\u0093s\u00bd\u00f7'\"\u00f2>\u00e8\u00bb|\u00feG\u0080\u00cc\u00bb\u0092\u00b9\u00e2\u0004))\u000b\u00ba\u00f3.\u0094Y\u0018Y\u0080&42\u00ab\u0094\u00a0\u0098'\u0011\u0085\u00b26p\u00d4K7\u0013\u00ab\u00aaQ9'\u008c\u009e9\u00b9\u00b1\u00b2\u00be\u0098\b\u00fc\u007fQ\u0090\u00eaX7\u0015u\u0093\r\u00f2\u009e\u00ee\u00a1\\\u0002\u0012\u00de\u000e\t\u00da\u00f5\f 2\u001f9ZO\u0082BG\u0018\u00f0\u0096ut\u00d9\u0090\u00a32R1\u00ee\r\u0006\u00fb\u0015\u00ad\u00f1:\u0010x\r\u0005h\u00e3\u00e9h\u00a4\u0080e\u0080;\u00c1Ui\u00b2\u00f1VH\u00b4\u0080\u001e-\u0013\u001bpv&>\u00d0\u00c6x\u0016#\u00e89=\u0096B&\r\u00c7\u007f\u00ca";
                var7_6 = "lN\u00ab\f\u00f7Z\u00f2l7w\u008a\u00b0\u0002a\u001a\u0098\u00aa\u009e\u0086\u001ast\u00bdZ\u009a#\u00b7\u00c7\u001a\u0017\u009cYST\u0000\u0016\u0004\u00ff\u00e6+O\u000e|\u008c\u00b1\u00f410-\u0093s\u00bd\u00f7'\"\u00f2>\u00e8\u00bb|\u00feG\u0080\u00cc\u00bb\u0092\u00b9\u00e2\u0004))\u000b\u00ba\u00f3.\u0094Y\u0018Y\u0080&42\u00ab\u0094\u00a0\u0098'\u0011\u0085\u00b26p\u00d4K7\u0013\u00ab\u00aaQ9'\u008c\u009e9\u00b9\u00b1\u00b2\u00be\u0098\b\u00fc\u007fQ\u0090\u00eaX7\u0015u\u0093\r\u00f2\u009e\u00ee\u00a1\\\u0002\u0012\u00de\u000e\t\u00da\u00f5\f 2\u001f9ZO\u0082BG\u0018\u00f0\u0096ut\u00d9\u0090\u00a32R1\u00ee\r\u0006\u00fb\u0015\u00ad\u00f1:\u0010x\r\u0005h\u00e3\u00e9h\u00a4\u0080e\u0080;\u00c1Ui\u00b2\u00f1VH\u00b4\u0080\u001e-\u0013\u001bpv&>\u00d0\u00c6x\u0016#\u00e89=\u0096B&\r\u00c7\u007f\u00ca".length();
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
                    var6_5 = "\u00cc/\u00cd\u00ca\u00ce\u001f\u009b\u00dd\u008a\u00a5\u0014\u00cf\u00e2\u00d5\u00065";
                    var7_6 = "\u00cc/\u00cd\u00ca\u00ce\u001f\u009b\u00dd\u008a\u00a5\u0014\u00cf\u00e2\u00d5\u00065".length();
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
        GraphicalRenderingController.fb = var8_3;
        GraphicalRenderingController.gb = new Integer[28];
        GraphicalRenderingController.sx = (int)GraphicalRenderingController.a("o", (int)29832, (long)(var0 ^ 1142518597434936684L));
        GraphicalRenderingController.sk = new ArrayList<NumericComputationEngine1000>();
        GraphicalRenderingController.sU = Color.WHITE;
        GraphicalRenderingController.s2 = new ArrayList<CipherSessionManager>();
        GraphicalRenderingController.F = new WorkflowOrchestrator();
        GraphicalRenderingController.s7 = new WorkflowOrchestrator();
        GraphicalRenderingController.w = new WorkflowOrchestrator();
        GraphicalRenderingController.l = new WorkflowOrchestrator();
        GraphicalRenderingController.s6 = new WorkflowOrchestrator();
        GraphicalRenderingController.o = new WorkflowOrchestrator();
        GraphicalRenderingController.z = new WorkflowOrchestrator();
        GraphicalRenderingController.B = new WorkflowOrchestrator();
        GraphicalRenderingController.st = new TaskDispatcherService();
        GraphicalRenderingController.so = new HashSet<E>();
        GraphicalRenderingController.V = new HashMap<K, V>();
    }

    public static boolean I() {
        return K.S().equals(s7);
    }

    @Deprecated
    public static void W(Class clazz) {
        GraphicalRenderingController.a(clazz, true);
    }

    public Color Q() {
        block4: {
            block5: {
                try {
                    try {
                        if (!TemporalMetadataResolver.h.a().q.j()) break block4;
                        this.R = (float)((double)this.R - 0.03);
                        if (!(this.R <= 0.0f)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                    this.R = 1.0f - -this.R;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
            }
            return EventDispatchCoordinator1159.b(this.R, 0.9f, 1.0f);
        }
        return TemporalMetadataResolver.h.a().q.L();
    }

    private static void lambda$removePopups$2(CipherSessionManager cipherSessionManager, WorkflowOrchestrator workflowOrchestrator) {
        for (CipherContextManager1101 cipherContextManager1101 : cipherSessionManager.V()) {
            workflowOrchestrator.d(cipherContextManager1101);
        }
    }

    public static boolean B(AbstractComputationKernel abstractComputationKernel) {
        boolean bl;
        block14: {
            block13: {
                try {
                    block12: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (d == null || d instanceof CipherManager) break block12;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw GraphicalRenderingController.a(customSystemException);
                                        }
                                        if (d instanceof ExecutionStateValidator) break block12;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw GraphicalRenderingController.a(customSystemException);
                                    }
                                    if (d instanceof ColorPaletteGenerator) break block12;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw GraphicalRenderingController.a(customSystemException);
                                }
                                if (d.equals(abstractComputationKernel)) break block12;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw GraphicalRenderingController.a(customSystemException);
                            }
                            if (!d.A().contains(abstractComputationKernel)) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void E() {
        CipherSessionManager cipherSessionManager;
        Iterator iterator;
        Object object;
        block23: {
            if (this.t) {
                for (CipherSessionManager copyOnWriteArrayList2 : this.s0.Y()) {
                    copyOnWriteArrayList2.A();
                }
                this.t = false;
            }
            ArrayList<CipherSessionManager> arrayList = new ArrayList<CipherSessionManager>(this.s0.Y());
            Iterator iterator2 = arrayList.iterator();
            while (iterator2.hasNext()) {
                object = (CipherSessionManager)iterator2.next();
                ((CipherSessionManager)object).L();
            }
            this.n();
            CopyOnWriteArrayList<CipherSessionManager> copyOnWriteArrayList = new CopyOnWriteArrayList<CipherSessionManager>();
            copyOnWriteArrayList.addAll(arrayList);
            object = new CopyOnWriteArrayList();
            object.addAll(copyOnWriteArrayList);
            Collections.reverse(copyOnWriteArrayList);
            SystemDiagnosticAnalyzer.K().Q();
            iterator = object.iterator();
            while (iterator.hasNext()) {
                cipherSessionManager = (CipherSessionManager)iterator.next();
                try {
                    if (cipherSessionManager instanceof ReflectionObjectMapper) {
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
                this.w(cipherSessionManager, copyOnWriteArrayList);
            }
            try {
                SystemDiagnosticAnalyzer.K().H();
                if (!(d instanceof ExecutionStateValidator) && !(d instanceof ColorPaletteGenerator)) break block23;
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
            boolean bl = d.H();
            try {
                try {
                    d.i(false);
                    d.E();
                    d.i(bl);
                    if (d.F() == null || !d.F().O()) break block23;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
                d.F().a();
            }
            catch (CustomSystemException customSystemException) {
                throw GraphicalRenderingController.a(customSystemException);
            }
        }
        iterator = object.iterator();
        while (iterator.hasNext()) {
            block24: {
                cipherSessionManager = (CipherSessionManager)iterator.next();
                try {
                    try {
                        try {
                            if (!cipherSessionManager.f() || !cipherSessionManager.r()) break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw GraphicalRenderingController.a(customSystemException);
                        }
                        cipherSessionManager.j().N(true);
                        cipherSessionManager.j().E();
                        if (!cipherSessionManager.j().G()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw GraphicalRenderingController.a(customSystemException);
                    }
                    cipherSessionManager.j().N();
                    continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw GraphicalRenderingController.a(customSystemException);
                }
            }
            cipherSessionManager.j().N(false);
        }
        try {
            if (v != null) {
                v.E();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw GraphicalRenderingController.a(customSystemException);
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = GraphicalRenderingController.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void I(boolean bl) {
        this.P = bl;
    }

    public void R() {
        this.t = true;
    }

    /*
     * Unable to fully structure code
     */
    public void k() {
        try {
            block16: {
                block18: {
                    block15: {
                        block14: {
                            ConfigurationManager.a();
                            GraphicsBufferAllocator.V();
                            if (ConfigurationManager.U()) break block15;
                            try {
                                block17: {
                                    if (!this.sy.s().booleanValue()) break block14;
                                    break block17;
                                    catch (Throwable v0) {
                                        throw GraphicalRenderingController.a(v0);
                                    }
                                }
                                CryptographicSessionManager1141.p().X();
                                break block15;
                            }
                            catch (Throwable v1) {
                                throw GraphicalRenderingController.a(v1);
                            }
                        }
                        CryptographicSessionManager1141.p().T();
                    }
                    var1_1 = new MetricsCalculationEngine(0.0, 0.0, ApplicationLifecycleManager.e(), ApplicationLifecycleManager.b());
                    if (GraphicalRenderingController.N == null) break block16;
                    if (var1_1.t() != GraphicalRenderingController.N.t()) ** GOTO lbl34
                    break block18;
                    catch (Throwable v2) {
                        throw GraphicalRenderingController.a(v2);
                    }
                }
                try {
                    block19: {
                        if (var1_1.V() == GraphicalRenderingController.N.V()) break block16;
                        break block19;
                        catch (Throwable v3) {
                            throw GraphicalRenderingController.a(v3);
                        }
                    }
                    this.K(GraphicalRenderingController.N, var1_1);
                }
                catch (Throwable v4) {
                    throw GraphicalRenderingController.a(v4);
                }
            }
            GraphicalRenderingController.N = var1_1;
            Ne.h.z();
            var2_3 = TemporalMetadataResolver.h.a().b();
            Ne.h.x(var2_3, var2_3, var2_3);
            try {
                GraphicalRenderingController.st.z();
            }
            catch (Throwable var4_4) {
                // empty catch block
            }
            this.u();
            Ne.h.X();
            GraphicsBufferAllocator.E();
            ConfigurationManager.Y();
        }
        catch (Exception var1_2) {
            TemporalMetadataResolver.W(var1_2);
        }
        Ne.h.q(1.0f, 1.0f, 1.0f, 1.0f);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(GraphicalRenderingController.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(GraphicalRenderingController.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

