/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package com.data.streaming;

import a.A5;
import a.A6;
import a.A7;
import a.A9;
import a.AA;
import a.AJ;
import a.AN;
import a.j5;
import a.jD;
import a.j_;
import a.jg;
import a.jt;
import a.x9;
import a.xL;
import com.adapter.management.GenericAdapterManager;
import com.advanced.resolution.MultiLayeredCompositeResolver;
import com.app.algorithms.AlgorithmOrchestrator;
import com.app.context.transformation.ContextTransformationEngine;
import com.app.transaction.TransactionValidator2680;
import com.async.events.AsynchronousEventCoordinator;
import com.codec.translation.EncodingProtocolTranslator;
import com.collections.management.MultiContainerRegistry;
import com.computation.resolver.ContextualComputationResolver;
import com.concurrent.task.AsynchronousTaskDispatcher;
import com.config.management.ConfigurationStateManager;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.context.resolver.ContextMappingResolver;
import com.core.computation.AbstractComputationKernel;
import com.crypto.adaptive.AdaptiveCryptoNegotiator;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.crypto.negotiation.AdvancedCipherNegotiator;
import com.crypto.negotiation.CryptoAlgorithmNegotiator;
import com.crypto.negotiation.CryptoDataNegotiator;
import com.crypto.stream.DataStreamCipher;
import com.crypto.stream.StreamCipherSessionManager;
import com.data.streaming.DataStreamOrchestrator686;
import com.data.transformation.DataTransformationPipeline;
import com.deobfuscation.mapping.GenericComponentMapper;
import com.dynamic.proxy.DynamicProxyResolver;
import com.event.dispatch.EventDispatchCoordinator;
import com.event.orchestration.EventDispatchOrchestrator;
import com.event.routing.EventRoutingController;
import com.exception.system.CustomSystemException;
import com.execution.dynamic.DynamicExecutionOrchestrator;
import com.game.configuration.GameVersionEnumerator;
import com.game.mechanics.GameMechanicsCalculator;
import com.geo.resolver.GeolocationResolver;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.rendering.GraphicsContextBroker;
import com.graphics.resources.GraphicalResourceManager;
import com.indexing.metadata.MetadataIndexingService;
import com.interaction.multimodal.MultimodalInteractionManager;
import com.logging.transactions.TransactionAuditLogger;
import com.math.geometry.GeometricComputationEngine;
import com.math.geometry.GeometricComputationEngine275;
import com.math.geometry.GeometryCalculator;
import com.math.orchestration.NumericTransformationOrchestrator;
import com.matrix.transformation.MatrixTransformer;
import com.message.processing.MessageQueueProcessor;
import com.network.clustering.ClusterNodeCoordinator;
import com.network.connection.AdaptiveConnectionManager;
import com.network.connection.NetworkConnectionEstablisher;
import com.network.interceptor.MultiProtocolInterceptor;
import com.network.protocol.NetworkProtocolEncoder318;
import com.network.protocol.NetworkProtocolEncoder688;
import com.network.protocol.NetworkProtocolHandler765;
import com.network.protocol.NetworkProtocolMapper;
import com.network.protocol.NetworkProtocolTranslator813;
import com.network.routing.NetworkPacketRouter;
import com.network.secure.SecureChannelNegotiator389;
import com.network.security.NetworkSecureChannelManager;
import com.network.security.SecureConnectionBroker;
import com.network.transmission.SecureDataDispatcher;
import com.proxy.invocation.InvocationProxyManager;
import com.reflection.metadata.ReflectionMetadataExtractor1376;
import com.reflection.resolution.ReflectiveEntityResolver;
import com.rendering.context.ContextualRenderingMediator;
import com.resource.dynamic.DynamicResourceBroker;
import com.resource.management.ResourceAllocationTracker;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.DynamicContextBroker;
import com.runtime.memory.MemoryResourceAllocator;
import com.security.access.SecureAccessController;
import com.security.authentication.AuthenticationTokenGenerator;
import com.security.crypto.CryptoTransformationManager;
import com.security.crypto.CryptographicKeyManager815;
import com.security.crypto.CryptographySessionManager;
import com.security.dispatch.CryptoOperationDispatcher891;
import com.security.interception.CryptoResourceInterceptor;
import com.security.keygen.CryptographicKeyGenerator;
import com.security.negotiation.CryptoContextNegotiator;
import com.security.policy.PolicyEnforcementHandler;
import com.security.resolver.EncryptionContextResolver;
import com.security.resource.SecureResourceAllocator346;
import com.security.runtime.RuntimeSecurityInspector;
import com.security.session.CryptoSessionManager819;
import com.security.session.CryptographicSessionManager199;
import com.security.session.CryptographicSessionManager847;
import com.security.stream.CryptoStreamProcessor609;
import com.security.token.AsynchronousTokenGenerator;
import com.security.token.CryptographicTokenGenerator69;
import com.security.token.SecurityTokenGenerator254;
import com.security.tokens.CryptographicTokenGenerator;
import com.security.transaction.CryptographicTransactionProcessor;
import com.security.transfer.SecureDataExchanger1153;
import com.security.transformation.SecureDataTransformer;
import com.simulation.calibration.SimulationParameterCalibrator;
import com.simulation.core.ModelSimulationEngine;
import com.simulation.probabilistic.StochasticSimulationModel;
import com.stream.processing.StreamProcessingOrchestrator;
import com.system.config.ConfigurationResolver715;
import com.system.dynamic.DynamicResourceResolver642;
import com.system.interceptors.ResourceInterceptor;
import com.system.resources.ResourceAllocationManager;
import com.system.resources.ResourceAllocationManager264;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator;
import com.transaction.model.TransactionDescriptor;
import com.ui.rendering.GraphicalRenderingController;
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
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class DataStreamOrchestrator {
    private static final long a;
    private final ArrayList<ContextualExecutionFramework> N;
    private static final String[] g;
    private jD q;
    private static final long[] b;
    private boolean d;
    private static boolean Q;
    private final Map<Class<? extends ContextualExecutionFramework>, ContextualExecutionFramework> Y;
    private TransactionAuditLogger F;
    private static final Map e;
    private final HashSet<ContextualExecutionFramework> u;
    private final Map<Class<? extends ContextualExecutionFramework>, ContextualExecutionFramework> J = new LinkedHashMap<Class<? extends ContextualExecutionFramework>, ContextualExecutionFramework>();
    private static final Object[] f;
    private static final Integer[] c;

    public void V() {
        long l = a ^ 0x11701CC62E5EL;
        int n = 0;
        for (ContextualExecutionFramework contextualExecutionFramework : this.q()) {
            try {
                if (contextualExecutionFramework.H() || contextualExecutionFramework instanceof GraphicalRenderingController) continue;
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
            try {
                if (contextualExecutionFramework.N() == 0) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
            try {
                if (!contextualExecutionFramework.Z()) continue;
                ++n;
                contextualExecutionFramework.m();
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
        try {
            if (n > 0) {
                TemporalMetadataResolver.h.c().t((String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)9952, (long)(0x65AA793B61905F6EL ^ l)), (long)-5007685762755930691L, (long)l)), n + (String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)11842, (long)(0x319FC7CDF33C57C9L ^ l)), (long)-5007685762755930691L, (long)l)), CryptoConfigurationRegistry383.WARNING, 2500L);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamOrchestrator.a(customSystemException);
        }
    }

    public Collection<ContextualExecutionFramework> E() {
        ArrayList<ContextualExecutionFramework> arrayList = new ArrayList<ContextualExecutionFramework>();
        for (ContextualExecutionFramework contextualExecutionFramework : this.u()) {
            try {
                if (contextualExecutionFramework instanceof ContextTransformationEngine) continue;
                arrayList.add(contextualExecutionFramework);
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
        return arrayList;
    }

    private static void lambda$registerStream$8(MatrixTransformer matrixTransformer) {
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e6' || c == 'D' || c == '\u00cb' || c == '\u00e3') {
                field = DataStreamOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataStreamOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'p' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ea' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public JsonArray N(boolean bl) {
        JsonArray jsonArray = new JsonArray();
        for (ContextualExecutionFramework contextualExecutionFramework : this.E()) {
            JsonObject jsonObject = contextualExecutionFramework.r(bl);
            try {
                if (jsonObject == null) continue;
                jsonArray.add((JsonElement)jsonObject);
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
        return jsonArray;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataStreamOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static boolean w() {
        boolean bl = DataStreamOrchestrator.b();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamOrchestrator.a(customSystemException);
        }
        return false;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/O6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public JsonObject w() {
        JsonObject jsonObject = new JsonObject();
        for (ContextualExecutionFramework contextualExecutionFramework : this.u()) {
            try {
                if (!(contextualExecutionFramework instanceof ReflectionMetadataExtractor1376)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
            try {
                if (!contextualExecutionFramework.Z()) continue;
                jsonObject.addProperty(contextualExecutionFramework.O(), Boolean.valueOf(contextualExecutionFramework.Z()));
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
        return jsonObject;
    }

    public void g() {
        block8: {
            block9: {
                for (ContextualExecutionFramework contextualExecutionFramework : this.Y.values()) {
                    contextualExecutionFramework.b();
                }
                try {
                    try {
                        if (GeometryCalculator.C() != 15) break block8;
                        if (!TemporalMetadataResolver.h.s()) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataStreamOrchestrator.a(customSystemException);
                    }
                    this.K(EncryptionContextResolver.class).T(true);
                    this.K(jt.class).T(true);
                }
                catch (CustomSystemException customSystemException) {
                    throw DataStreamOrchestrator.a(customSystemException);
                }
            }
            try {
                if (!this.K(jt.class).Z()) {
                    this.K(jt.class).T(true);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
    }

    private void I() {
        MatrixTransformer.X().e(new ResourceAllocationManager()).x(this);
        MatrixTransformer.X().e(new EncryptionContextResolver()).y(GameVersionEnumerator.MC_1_7_10.q()).x(this);
        MatrixTransformer.X().e(new jt()).y(GameVersionEnumerator.MC_1_8_9.Q()).x(this);
        this.W(Stream.of(new MemoryResourceAllocator(), new EncodingProtocolTranslator(), new CryptoSessionManager819()));
        MatrixTransformer.X().e(new j_()).y(GameVersionEnumerator.MC_1_8_9.Q()).x(this);
        this.W(Stream.of(new CryptographicKeyManager815(), new CryptographicSessionManager847(), new RuntimeSecurityInspector(), new jg(), new NetworkProtocolHandler765(), new CryptoStreamProcessor609(), new DynamicResourceBroker(), new CryptoOperationDispatcher891(), new j5(), new NetworkProtocolTranslator813(), new ContextMappingResolver(), new SecureChannelNegotiator389()));
        MatrixTransformer.X().e(new NetworkSecureChannelManager()).r(GameVersionEnumerator.MC_1_7_10.q(), GameVersionEnumerator.MC_1_16_5.g()).x(this);
        MatrixTransformer.X().e(new SecureResourceAllocator346()).y(GameVersionEnumerator.MC_1_20_6.g()).x(this);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataStreamOrchestrator.a = MultiContainerRegistry.a(-184792811037747629L, 2004190155340829268L, MethodHandles.lookup().lookupClass()).a(38239686228213L);
                DataStreamOrchestrator.f = new Object[5];
                DataStreamOrchestrator.g = new String[5];
                DataStreamOrchestrator.a();
                DataStreamOrchestrator.e = new HashMap<K, V>(13);
                var0 = DataStreamOrchestrator.a ^ 5826829331763L;
                DataStreamOrchestrator.T(false);
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
                var8_3 = new long[26];
                var5_4 = 0;
                var6_5 = "s\u00d7\u00a9\"\u009c}\u00e5/\u00cc7\u00b5\u00ec\u00cc\u00b86b\u00b1\u00feb\u001au*n\u00c6\u00d3J\u00af\u00fe\u00bf3;e\u0005\u00e9UAs\u00e2*\u00ee\u008b\n#]B\u00e9\u00b8\u00a8\u0096\u001b?\u00dbCg\u00f4\u0084\u00af\u00e98\u00b4^\u00c0]\u00eb\u00d6\u0001\u00a2h\u00c2\u00f4\u0082\u0089\u00a6\u00d1E\u009d\u00b6W\u00ad;\u00b1\u00cf[\u00f3\u00f2\u00e7\u0011\u00a5\u001d\u008fR\u00cb)\u00d8\u00c0lC`w\u0003\u00c3\"\u00aa\u0095\u0000;\u00024\u00e2Q]>[\u0010\u0096:Q3N\u00c9\u00cf5\u00b9\u00c9\u00ce\u0098\u00ee\u00d6J\u00c9\u008a\u00da^\u00a7\u00ec\u0004\u00e8Y\u0089i\u009e\u000f\u009a^JU\u0018.\u00f6\u00889\u00a1\u00c0bJ\u00e62\u00de\u00fbg\u0095\u009d\u0013\u00e6\u0093\u00d2\u00d4\u0001\u0086\u00db\u00b9\u0010l\u0019\u00ee\u00d0p\u00ed\u00ed\u00c8\u00e3U\u00deIk@4\u00ae\u00d7\u00ff\u0094\u00a8";
                var7_6 = "s\u00d7\u00a9\"\u009c}\u00e5/\u00cc7\u00b5\u00ec\u00cc\u00b86b\u00b1\u00feb\u001au*n\u00c6\u00d3J\u00af\u00fe\u00bf3;e\u0005\u00e9UAs\u00e2*\u00ee\u008b\n#]B\u00e9\u00b8\u00a8\u0096\u001b?\u00dbCg\u00f4\u0084\u00af\u00e98\u00b4^\u00c0]\u00eb\u00d6\u0001\u00a2h\u00c2\u00f4\u0082\u0089\u00a6\u00d1E\u009d\u00b6W\u00ad;\u00b1\u00cf[\u00f3\u00f2\u00e7\u0011\u00a5\u001d\u008fR\u00cb)\u00d8\u00c0lC`w\u0003\u00c3\"\u00aa\u0095\u0000;\u00024\u00e2Q]>[\u0010\u0096:Q3N\u00c9\u00cf5\u00b9\u00c9\u00ce\u0098\u00ee\u00d6J\u00c9\u008a\u00da^\u00a7\u00ec\u0004\u00e8Y\u0089i\u009e\u000f\u009a^JU\u0018.\u00f6\u00889\u00a1\u00c0bJ\u00e62\u00de\u00fbg\u0095\u009d\u0013\u00e6\u0093\u00d2\u00d4\u0001\u0086\u00db\u00b9\u0010l\u0019\u00ee\u00d0p\u00ed\u00ed\u00c8\u00e3U\u00deIk@4\u00ae\u00d7\u00ff\u0094\u00a8".length();
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
                    var6_5 = "*\u00fd\u00eb\u00fdHB\u00d0\u0014\u00f2\u00e5\u0003\u0013\u00caW\u00e1\u00b3";
                    var7_6 = "*\u00fd\u00eb\u00fdHB\u00d0\u0014\u00f2\u00e5\u0003\u0013\u00caW\u00e1\u00b3".length();
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
        DataStreamOrchestrator.b = var8_3;
        DataStreamOrchestrator.c = new Integer[26];
    }

    private static Field c(long l, long l2) {
        int n = DataStreamOrchestrator.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = DataStreamOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataStreamOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataStreamOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    DataStreamOrchestrator.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataStreamOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataStreamOrchestrator.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataStreamOrchestrator.b(216610783798863L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void X(JsonObject jsonObject) {
        for (ContextualExecutionFramework contextualExecutionFramework : this.q()) {
            try {
                if (!(contextualExecutionFramework instanceof ReflectionMetadataExtractor1376)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
            if (!jsonObject.has(contextualExecutionFramework.O())) continue;
            boolean bl = jsonObject.get(contextualExecutionFramework.O()).getAsBoolean();
            try {
                if (contextualExecutionFramework.Z() == bl) continue;
                contextualExecutionFramework.T(bl);
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
    }

    public List<ContextualExecutionFramework> Z(JsonObject jsonObject) {
        ArrayList<ContextualExecutionFramework> arrayList = new ArrayList<ContextualExecutionFramework>();
        for (ContextualExecutionFramework contextualExecutionFramework : this.q()) {
            try {
                try {
                    try {
                        if (!jsonObject.has(contextualExecutionFramework.O()) || !contextualExecutionFramework.H()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataStreamOrchestrator.a(customSystemException);
                    }
                    if (contextualExecutionFramework.t() == RecursiveNodeGraph.p) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataStreamOrchestrator.a(customSystemException);
                }
                arrayList.add(contextualExecutionFramework);
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
        return arrayList;
    }

    private static Method d(long l, long l2) {
        int n = DataStreamOrchestrator.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataStreamOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataStreamOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataStreamOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataStreamOrchestrator.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataStreamOrchestrator.b(216610783798863L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataStreamOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataStreamOrchestrator.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataStreamOrchestrator.b(216610783798863L, 0L);
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

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataStreamOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataStreamOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void lambda$addModules$6(MatrixTransformer matrixTransformer) {
        matrixTransformer.y(GameVersionEnumerator.MC_1_21_4.g());
    }

    /*
     * Loose catch block
     */
    public void T(JsonArray jsonArray) {
        long l = a ^ 0x6FAAF60EEDDDL;
        for (int i = 0; i < jsonArray.size(); ++i) {
            JsonElement jsonElement;
            block11: {
                jsonElement = jsonArray.get(i);
                if (!jsonElement.isJsonObject()) continue;
                try {
                    if (jsonElement.isJsonNull()) {
                        continue;
                    }
                    break block11;
                    catch (Exception exception) {
                        throw DataStreamOrchestrator.a(exception);
                    }
                }
                catch (Exception exception) {
                    throw DataStreamOrchestrator.a(exception);
                }
            }
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            try {
                if (jsonObject.get((String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)6565, (long)(0x12E49C783B2FA3A4L ^ l)), (long)8719635793845294654L, (long)l))) == null || jsonObject.get((String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)20233, (long)(0x2990EE56974B750AL ^ l)), (long)8719635793845294654L, (long)l))).isJsonNull()) continue;
            }
            catch (Exception exception) {
                throw DataStreamOrchestrator.a(exception);
            }
            String string = jsonObject.get((String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)15979, (long)(0x55C9A6D4FEF047BL ^ l)), (long)8719635793845294654L, (long)l))).getAsString();
            for (ContextualExecutionFramework contextualExecutionFramework : this.E()) {
                try {
                    if (!contextualExecutionFramework.O().equalsIgnoreCase(string)) continue;
                    contextualExecutionFramework.x(jsonObject);
                }
                catch (Exception exception) {
                    TemporalMetadataResolver.x(contextualExecutionFramework.O());
                    TemporalMetadataResolver.W(exception);
                }
            }
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "'[<";
        objectArray[1] = Integer.TYPE;
        DataStreamOrchestrator.g[1] = "java/lang/Integer";
        objectArray[2] = "Ee..!<Nj?a\\$]m6(";
        objectArray[3] = "ad\u0007T\u0019Vjk\u0016\u001bxXa`\u0012A";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "i\f\u007fY\u0019f:\u001d*&HyP\u0011=\u001eZ>9\u00168G#;0\n.A_d+V,&";
    }

    private static void lambda$addModules$1(MatrixTransformer matrixTransformer) {
        matrixTransformer.y(GameVersionEnumerator.MC_1_8_9.V());
    }

    private void lambda$registerStream$7(Consumer consumer, ContextualExecutionFramework contextualExecutionFramework) {
        MatrixTransformer<ContextualExecutionFramework> matrixTransformer = MatrixTransformer.X().e(contextualExecutionFramework);
        consumer.accept(matrixTransformer);
        matrixTransformer.x(this);
    }

    public String f() {
        long l = a ^ 0x424ACD0DDAL;
        StringBuilder stringBuilder = new StringBuilder();
        for (ContextualExecutionFramework contextualExecutionFramework : this.q()) {
            String string;
            block8: {
                String string2 = contextualExecutionFramework.O();
                string = string2.replace((CharSequence)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)4898, (long)(0x180A331B0CA24923L ^ l)), (long)-7420470492803500487L, (long)l)), (CharSequence)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)8508, (long)(0x1CA167A458627B2DL ^ l)), (long)-7420470492803500487L, (long)l))).toLowerCase();
                try {
                    try {
                        stringBuilder.append(string + (String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)7663, (long)(0x7ACAF20088B847E4L ^ l)), (long)-7420470492803500487L, (long)l)) + string2);
                        stringBuilder.append((String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)31011, (long)(0x1FDB0A997297A331L ^ l)), (long)-7420470492803500487L, (long)l)));
                        if (contextualExecutionFramework.r() == null || contextualExecutionFramework.r().equals("")) break block8;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataStreamOrchestrator.a(customSystemException);
                    }
                    stringBuilder.append(string + (String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)22362, (long)(0x44F60B23347B0D5FL ^ l)), (long)-7420470492803500487L, (long)l)) + contextualExecutionFramework.r().replace((CharSequence)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)6338, (long)(0x19766B972C3742D1L ^ l)), (long)-7420470492803500487L, (long)l)), (CharSequence)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)30182, (long)(0x31F5FE9C68FBAFEEL ^ l)), (long)-7420470492803500487L, (long)l))));
                    stringBuilder.append((String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)27027, (long)(0x311AEBA363D53386L ^ l)), (long)-7420470492803500487L, (long)l)));
                }
                catch (CustomSystemException customSystemException) {
                    throw DataStreamOrchestrator.a(customSystemException);
                }
            }
            for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : contextualExecutionFramework.Y()) {
                String string3 = configurationProfileResolver.O();
                String string4 = string + (String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)2515, (long)(0x198E12A1F99553D0L ^ l)), (long)-7420470492803500487L, (long)l)) + configurationProfileResolver.O().replace((CharSequence)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)7588, (long)(0x383F1A094C6EC7AAL ^ l)), (long)-7420470492803500487L, (long)l)), (CharSequence)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)1617, (long)(0x104EAE81E6935C5DL ^ l)), (long)-7420470492803500487L, (long)l))).toLowerCase();
                try {
                    stringBuilder.append(string4 + (String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)12160, (long)(0x29D39045D032F590L ^ l)), (long)-7420470492803500487L, (long)l)) + string3);
                    stringBuilder.append((String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)26023, (long)(0x6DE4F26483F9BFA0L ^ l)), (long)-7420470492803500487L, (long)l)));
                    if (configurationProfileResolver.d() == null || configurationProfileResolver.d().isEmpty()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataStreamOrchestrator.a(customSystemException);
                }
                String string5 = configurationProfileResolver.d().replace((CharSequence)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)28292, (long)(0x293997B482C83490L ^ l)), (long)-7420470492803500487L, (long)l)), (CharSequence)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)31025, (long)(0x34C00B30242327L ^ l)), (long)-7420470492803500487L, (long)l)));
                String string6 = string4 + (String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)17843, (long)(0x6DFF664BC961FB3L ^ l)), (long)-7420470492803500487L, (long)l));
                stringBuilder.append(string6 + (String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)8143, (long)(0x535093A74CD145C2L ^ l)), (long)-7420470492803500487L, (long)l)) + string5);
                stringBuilder.append((String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)16485, (long)(0xD1F428DBBE91A7CL ^ l)), (long)-7420470492803500487L, (long)l)));
            }
        }
        return stringBuilder.toString();
    }

    public HashSet<ContextualExecutionFramework> x() {
        return this.u;
    }

    public boolean W(Class<? extends ContextualExecutionFramework> clazz) {
        for (ContextualExecutionFramework contextualExecutionFramework : this.q()) {
            try {
                if (!contextualExecutionFramework.getClass().equals(clazz)) continue;
                return contextualExecutionFramework.Z();
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
        return false;
    }

    public void o(TransactionDescriptor transactionDescriptor) {
        long l = a ^ 0x1E53008C489EL;
        this.d = true;
        JsonObject jsonObject = transactionDescriptor.r();
        int n = 0;
        for (ContextualExecutionFramework contextualExecutionFramework : this.q()) {
            try {
                if (contextualExecutionFramework instanceof ReflectionMetadataExtractor1376) {
                    continue;
                }
            }
            catch (Exception exception) {
                throw DataStreamOrchestrator.a(exception);
            }
            try {
                if (contextualExecutionFramework.t().equals(RecursiveNodeGraph.p)) {
                    continue;
                }
            }
            catch (Exception exception) {
                throw DataStreamOrchestrator.a(exception);
            }
            try {
                block19: {
                    try {
                        if (!jsonObject.has(contextualExecutionFramework.O())) break block19;
                        if (!contextualExecutionFramework.H()) continue;
                    }
                    catch (Exception exception) {
                        throw DataStreamOrchestrator.a(exception);
                    }
                    try {
                        if (contextualExecutionFramework.Z()) continue;
                        contextualExecutionFramework.T(jsonObject.get(contextualExecutionFramework.O()).getAsBoolean());
                        ++n;
                    }
                    catch (Exception exception) {
                        TemporalMetadataResolver.W(exception);
                    }
                    continue;
                }
                try {
                    if (contextualExecutionFramework instanceof GraphicalRenderingController || contextualExecutionFramework.N() == 0) {
                        continue;
                    }
                }
                catch (Exception exception) {
                    throw DataStreamOrchestrator.a(exception);
                }
                if (!contextualExecutionFramework.Z()) continue;
                contextualExecutionFramework.m();
            }
            catch (Exception exception) {
                TemporalMetadataResolver.W(exception);
            }
        }
        try {
            this.d = false;
            if (TemporalMetadataResolver.h.F().F.s().booleanValue()) {
                this.F.K((String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)28115, (long)(0x1456929E23BD7295L ^ l)), (long)-2575725320637467779L, (long)l)) + DynamicContextBroker.u + (String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)31487, (long)(0x40E74EED738765B2L ^ l)), (long)-2575725320637467779L, (long)l)) + transactionDescriptor.T()).D(n + (String)((Object)DataStreamOrchestrator.b("\u00ea", (int)DataStreamOrchestrator.a("c", (int)27553, (long)(0x7DE8C1BE6F0FF4FDL ^ l)), (long)-2575725320637467779L, (long)l))).Q();
                TemporalMetadataResolver.h.c().h(this.F);
            }
        }
        catch (Exception exception) {
            throw DataStreamOrchestrator.a(exception);
        }
    }

    public ContextualExecutionFramework X(String string) {
        for (Map.Entry<Class<? extends ContextualExecutionFramework>, ContextualExecutionFramework> entry : this.Y.entrySet()) {
            try {
                if (!entry.getValue().O().equals(string)) continue;
                return entry.getValue();
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
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

    private static void lambda$addModules$0(MatrixTransformer matrixTransformer) {
        matrixTransformer.y(GameVersionEnumerator.MC_1_16_5.g());
    }

    public JsonObject J() {
        JsonObject jsonObject = new JsonObject();
        for (ContextualExecutionFramework contextualExecutionFramework : this.u()) {
            try {
                if (contextualExecutionFramework instanceof ReflectionMetadataExtractor1376) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
            try {
                if (!contextualExecutionFramework.Z()) continue;
                jsonObject.addProperty(contextualExecutionFramework.O(), Boolean.valueOf(contextualExecutionFramework.Z()));
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
        return jsonObject;
    }

    private static void lambda$addModules$4(MatrixTransformer matrixTransformer) {
        matrixTransformer.r(GameVersionEnumerator.MC_1_7_10.q(), GameVersionEnumerator.MC_1_20_6.g());
    }

    public <T extends ContextualExecutionFramework> T K(Class<T> clazz) {
        return (T)this.Y.get(clazz);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataStreamOrchestrator.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                DataStreamOrchestrator.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/O6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4304;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/O6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataStreamOrchestrator.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DataStreamOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataStreamOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void T(boolean bl) {
        Q = bl;
    }

    public Collection<ContextualExecutionFramework> q() {
        return this.Y.values();
    }

    @Nullable
    public jD l() {
        return this.q;
    }

    void k(ContextualExecutionFramework contextualExecutionFramework, List<List<AlgorithmOrchestrator>> list, boolean bl) {
        this.J.put(contextualExecutionFramework.getClass(), contextualExecutionFramework);
        if (!list.isEmpty()) {
            boolean bl2 = false;
            for (List<AlgorithmOrchestrator> list2 : list) {
                NetworkConnectionEstablisher[] networkConnectionEstablisherArray = AlgorithmOrchestrator.h(list2);
                if (!networkConnectionEstablisherArray.isEmpty()) continue;
                bl2 = true;
            }
            try {
                if (!bl2) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
        this.Y.put(contextualExecutionFramework.getClass(), contextualExecutionFramework);
        this.N.add(contextualExecutionFramework);
        for (ConfigurationProfileResolver<?, ?> configurationProfileResolver : contextualExecutionFramework.Y()) {
            List<AlgorithmOrchestrator> list2;
            if (!(configurationProfileResolver instanceof GenericAdapterManager)) continue;
            list2 = (GenericAdapterManager)configurationProfileResolver;
            for (NetworkConnectionEstablisher networkConnectionEstablisher : ((GenericAdapterManager)((Object)list2)).Z()) {
                if (!(networkConnectionEstablisher instanceof GenericComponentMapper)) continue;
                GenericComponentMapper genericComponentMapper = (GenericComponentMapper)networkConnectionEstablisher;
                try {
                    if (!((ContextTransformationEngine)genericComponentMapper.c()).X()) continue;
                    this.k((ContextualExecutionFramework)genericComponentMapper.c(), list, false);
                    contextualExecutionFramework.S(new ContextTransformationEngine[]{genericComponentMapper.c()});
                }
                catch (CustomSystemException customSystemException) {
                    throw DataStreamOrchestrator.a(customSystemException);
                }
            }
        }
        try {
            if (bl) {
                contextualExecutionFramework.T(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamOrchestrator.a(customSystemException);
        }
    }

    private static void lambda$addModules$3(MatrixTransformer matrixTransformer) {
        matrixTransformer.y(GameVersionEnumerator.MC_1_7_10.q());
    }

    private static void lambda$addModules$5(MatrixTransformer matrixTransformer) {
        matrixTransformer.y(GameVersionEnumerator.MC_1_21_4.R());
    }

    private void W(Stream<ContextualExecutionFramework> stream) {
        this.P(stream, DataStreamOrchestrator::lambda$registerStream$8);
    }

    private void P(Stream<ContextualExecutionFramework> stream, Consumer<MatrixTransformer<?>> consumer) {
        stream.forEach(arg_0 -> this.lambda$registerStream$7(consumer, arg_0));
    }

    public boolean Z(Class<? extends TransactionValidator2680> clazz) {
        for (ContextualExecutionFramework contextualExecutionFramework : this.Y.values()) {
            try {
                if (contextualExecutionFramework.getClass() == clazz) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
            try {
                if (!(contextualExecutionFramework instanceof TransactionValidator2680)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
            TransactionValidator2680 transactionValidator2680 = (TransactionValidator2680)((Object)contextualExecutionFramework);
            try {
                if (!transactionValidator2680.I()) continue;
                return true;
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
        return false;
    }

    public void e(ContextualExecutionFramework contextualExecutionFramework) {
        block13: {
            block12: {
                block11: {
                    try {
                        if (!contextualExecutionFramework.Z()) break block11;
                        this.u.add(contextualExecutionFramework);
                        break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataStreamOrchestrator.a(customSystemException);
                    }
                }
                this.u.remove(contextualExecutionFramework);
            }
            for (ContextualExecutionFramework contextualExecutionFramework2 : this.x()) {
                contextualExecutionFramework2.V(contextualExecutionFramework);
            }
            try {
                try {
                    try {
                        try {
                            if (!GraphicalRenderingController.K.k() || !contextualExecutionFramework.u()) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataStreamOrchestrator.a(customSystemException);
                        }
                        if (!TemporalMetadataResolver.h.F().K.s().booleanValue()) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataStreamOrchestrator.a(customSystemException);
                    }
                    if (this.d) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataStreamOrchestrator.a(customSystemException);
                }
                contextualExecutionFramework.I();
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
    }

    public Collection<ContextualExecutionFramework> u() {
        return this.J.values();
    }

    private static void lambda$addModules$2(MatrixTransformer matrixTransformer) {
        matrixTransformer.y(GameVersionEnumerator.MC_1_8_9.V()).y(GameVersionEnumerator.MC_1_21_4.R());
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 51;
                break;
            }
            case 1: {
                n3 = 49;
                break;
            }
            case 2: {
                n3 = 1;
                break;
            }
            case 3: {
                n3 = 41;
                break;
            }
            case 4: {
                n3 = 37;
                break;
            }
            case 5: {
                n3 = 26;
                break;
            }
            case 6: {
                n3 = 0;
                break;
            }
            case 7: {
                n3 = 27;
                break;
            }
            case 8: {
                n3 = 63;
                break;
            }
            case 9: {
                n3 = 50;
                break;
            }
            case 10: {
                n3 = 30;
                break;
            }
            case 11: {
                n3 = 47;
                break;
            }
            case 12: {
                n3 = 32;
                break;
            }
            case 13: {
                n3 = 20;
                break;
            }
            case 14: {
                n3 = 12;
                break;
            }
            case 15: {
                n3 = 53;
                break;
            }
            case 16: {
                n3 = 35;
                break;
            }
            case 17: {
                n3 = 29;
                break;
            }
            case 18: {
                n3 = 59;
                break;
            }
            case 19: {
                n3 = 3;
                break;
            }
            case 20: {
                n3 = 46;
                break;
            }
            case 21: {
                n3 = 5;
                break;
            }
            case 22: {
                n3 = 58;
                break;
            }
            case 23: {
                n3 = 11;
                break;
            }
            case 24: {
                n3 = 43;
                break;
            }
            case 25: {
                n3 = 34;
                break;
            }
            case 26: {
                n3 = 4;
                break;
            }
            case 27: {
                n3 = 38;
                break;
            }
            case 28: {
                n3 = 23;
                break;
            }
            case 29: {
                n3 = 60;
                break;
            }
            case 30: {
                n3 = 28;
                break;
            }
            case 31: {
                n3 = 25;
                break;
            }
            case 32: {
                n3 = 39;
                break;
            }
            case 33: {
                n3 = 55;
                break;
            }
            case 34: {
                n3 = 6;
                break;
            }
            case 35: {
                n3 = 40;
                break;
            }
            case 36: {
                n3 = 10;
                break;
            }
            case 37: {
                n3 = 54;
                break;
            }
            case 38: {
                n3 = 62;
                break;
            }
            case 39: {
                n3 = 61;
                break;
            }
            case 40: {
                n3 = 8;
                break;
            }
            case 41: {
                n3 = 56;
                break;
            }
            case 42: {
                n3 = 33;
                break;
            }
            case 43: {
                n3 = 42;
                break;
            }
            case 44: {
                n3 = 7;
                break;
            }
            case 45: {
                n3 = 16;
                break;
            }
            case 46: {
                n3 = 31;
                break;
            }
            case 47: {
                n3 = 57;
                break;
            }
            case 48: {
                n3 = 24;
                break;
            }
            case 49: {
                n3 = 21;
                break;
            }
            case 50: {
                n3 = 9;
                break;
            }
            case 51: {
                n3 = 52;
                break;
            }
            case 52: {
                n3 = 45;
                break;
            }
            case 53: {
                n3 = 14;
                break;
            }
            case 54: {
                n3 = 44;
                break;
            }
            case 55: {
                n3 = 17;
                break;
            }
            case 56: {
                n3 = 36;
                break;
            }
            case 57: {
                n3 = 19;
                break;
            }
            case 58: {
                n3 = 18;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 15;
                break;
            }
            case 61: {
                n3 = 22;
                break;
            }
            case 62: {
                n3 = 48;
                break;
            }
            default: {
                n3 = 2;
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
        DataStreamOrchestrator.g[n4] = new String(cArray);
        return n4;
    }

    public void k() {
        this.d = true;
        for (ContextualExecutionFramework contextualExecutionFramework : this.q()) {
            try {
                try {
                    try {
                        if (contextualExecutionFramework.t() == RecursiveNodeGraph.p || !contextualExecutionFramework.Z()) continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataStreamOrchestrator.a(customSystemException);
                    }
                    if (contextualExecutionFramework instanceof ReflectionMetadataExtractor1376) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataStreamOrchestrator.a(customSystemException);
                }
                contextualExecutionFramework.T(false);
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamOrchestrator.a(customSystemException);
            }
        }
        this.d = false;
    }

    public static boolean b() {
        return Q;
    }

    public void B() {
        long l = a ^ 0x160BCE8176F2L;
        ContextualExecutionFramework[] contextualExecutionFrameworkArray = new ContextualExecutionFramework[58];
        contextualExecutionFrameworkArray[0] = new GraphicalRenderingController();
        contextualExecutionFrameworkArray[1] = new x9();
        contextualExecutionFrameworkArray[2] = new GameMechanicsCalculator();
        contextualExecutionFrameworkArray[3] = new DataStreamCipher();
        contextualExecutionFrameworkArray[4] = new StochasticSimulationModel();
        contextualExecutionFrameworkArray[5] = new InvocationProxyManager();
        contextualExecutionFrameworkArray[6] = new xL();
        contextualExecutionFrameworkArray[7] = new NetworkPacketRouter();
        contextualExecutionFrameworkArray[8] = new AJ();
        contextualExecutionFrameworkArray[9] = new GraphicalResourceManager();
        contextualExecutionFrameworkArray[10] = new MultiLayeredCompositeResolver();
        contextualExecutionFrameworkArray[11] = new DataTransformationPipeline();
        contextualExecutionFrameworkArray[12] = new ClusterNodeCoordinator();
        contextualExecutionFrameworkArray[13] = new GeometricComputationEngine275();
        contextualExecutionFrameworkArray[14] = new NetworkProtocolMapper();
        contextualExecutionFrameworkArray[15] = new CryptographySessionManager();
        contextualExecutionFrameworkArray[16] = new MultimodalInteractionManager();
        contextualExecutionFrameworkArray[17] = new AsynchronousTokenGenerator();
        contextualExecutionFrameworkArray[18] = new CryptographicTokenGenerator();
        contextualExecutionFrameworkArray[19] = new AN();
        contextualExecutionFrameworkArray[20] = new ConfigurationStateManager();
        contextualExecutionFrameworkArray[21] = new NetworkProtocolEncoder318();
        contextualExecutionFrameworkArray[22] = new AsynchronousTaskDispatcher();
        contextualExecutionFrameworkArray[23] = new EventRoutingController();
        contextualExecutionFrameworkArray[24] = new EventDispatchOrchestrator();
        contextualExecutionFrameworkArray[25] = new CryptoAlgorithmNegotiator();
        contextualExecutionFrameworkArray[26] = new GeometricComputationEngine();
        contextualExecutionFrameworkArray[27] = new A6();
        contextualExecutionFrameworkArray[28] = new CryptoTransformationManager();
        contextualExecutionFrameworkArray[29] = new AA();
        contextualExecutionFrameworkArray[30] = new A9();
        contextualExecutionFrameworkArray[31] = new CryptoResourceInterceptor();
        contextualExecutionFrameworkArray[32] = new ResourceInterceptor();
        contextualExecutionFrameworkArray[33] = new ContextualComputationResolver();
        contextualExecutionFrameworkArray[34] = new DynamicExecutionOrchestrator();
        contextualExecutionFrameworkArray[35] = new ContextualRenderingMediator();
        contextualExecutionFrameworkArray[36] = new SecureConnectionBroker();
        contextualExecutionFrameworkArray[37] = new A5();
        contextualExecutionFrameworkArray[38] = new SecurityTokenGenerator254();
        contextualExecutionFrameworkArray[39] = new GraphicsContextBroker();
        contextualExecutionFrameworkArray[40] = new AdaptiveCryptoNegotiator();
        contextualExecutionFrameworkArray[41] = new StreamProcessingOrchestrator();
        contextualExecutionFrameworkArray[42] = new CryptographicTokenGenerator69();
        contextualExecutionFrameworkArray[43] = new A7();
        contextualExecutionFrameworkArray[44] = new AdaptiveConnectionManager();
        contextualExecutionFrameworkArray[45] = new MessageQueueProcessor();
        contextualExecutionFrameworkArray[46] = new AuthenticationTokenGenerator();
        contextualExecutionFrameworkArray[47] = new CryptoContextNegotiator();
        contextualExecutionFrameworkArray[48] = new CryptographicTransactionProcessor();
        contextualExecutionFrameworkArray[49] = new DynamicResourceResolver642();
        contextualExecutionFrameworkArray[50] = new AsynchronousEventCoordinator();
        contextualExecutionFrameworkArray[51] = new MetadataIndexingService();
        PolicyEnforcementHandler policyEnforcementHandler = new PolicyEnforcementHandler();
        contextualExecutionFrameworkArray[52] = policyEnforcementHandler;
        contextualExecutionFrameworkArray[53] = new SecureDataExchanger1153(policyEnforcementHandler);
        contextualExecutionFrameworkArray[54] = new ResourceAllocationTracker();
        contextualExecutionFrameworkArray[55] = new EventDispatchCoordinator();
        contextualExecutionFrameworkArray[56] = new GeolocationResolver();
        contextualExecutionFrameworkArray[57] = new ReflectiveEntityResolver();
        this.W(Stream.of(contextualExecutionFrameworkArray));
        MatrixTransformer.X().e(new NetworkProtocolEncoder688()).y(GameVersionEnumerator.MC_1_16_5.g()).x(this);
        ContextualExecutionFramework[] contextualExecutionFrameworkArray2 = new ContextualExecutionFramework[3];
        contextualExecutionFrameworkArray2[0] = new SecureDataTransformer();
        contextualExecutionFrameworkArray2[1] = new SimulationParameterCalibrator();
        this.q = new jD();
        contextualExecutionFrameworkArray2[2] = this.q;
        this.P(Stream.of(contextualExecutionFrameworkArray2), DataStreamOrchestrator::lambda$addModules$0);
        boolean bl = RecursiveNodeGraph.E();
        this.P(Stream.of(new StreamCipherSessionManager()), DataStreamOrchestrator::lambda$addModules$1);
        this.P(Stream.of(new DataStreamOrchestrator686()), DataStreamOrchestrator::lambda$addModules$2);
        this.P(Stream.of(new TransactionOrchestrator(), new SecureDataDispatcher(), new ModelSimulationEngine()), DataStreamOrchestrator::lambda$addModules$3);
        this.P(Stream.of(new ReflectiveEntityResolver()), DataStreamOrchestrator::lambda$addModules$4);
        this.W(Stream.of(new DynamicProxyResolver()));
        this.P(Stream.of(new CryptographicSessionManager199(), new CryptographicKeyGenerator(), new MultiProtocolInterceptor()), DataStreamOrchestrator::lambda$addModules$5);
        this.P(Stream.of(new AdvancedCipherNegotiator(), new CryptoDataNegotiator(), new NumericTransformationOrchestrator(), new ConfigurationResolver715(), new SecureAccessController()), DataStreamOrchestrator::lambda$addModules$6);
        this.N();
        this.I();
        boolean bl2 = bl;
        try {
            if (bl2) {
                AbstractComputationKernel.I(new String[4]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamOrchestrator.a(customSystemException);
        }
    }

    public ArrayList<ContextualExecutionFramework> G() {
        return this.N;
    }

    private void N() {
        MatrixTransformer.X().e(new ResourceAllocationManager264()).x(this);
    }

    public DataStreamOrchestrator() {
        this.Y = new LinkedHashMap<Class<? extends ContextualExecutionFramework>, ContextualExecutionFramework>();
        this.u = new HashSet();
        this.N = new ArrayList();
        this.F = new TransactionAuditLogger(CryptoConfigurationRegistry383.INFO, "", "", 2000L);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataStreamOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public void X() {
        for (ContextualExecutionFramework contextualExecutionFramework : this.J.values()) {
            contextualExecutionFramework.S();
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataStreamOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(DataStreamOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

