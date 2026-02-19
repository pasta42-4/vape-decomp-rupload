/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  org.jetbrains.annotations.Nullable
 */
package com.network.protocol;

import a.FZ;
import a.JF;
import a.T1;
import a.TL;
import a.TS;
import a.Tm;
import a.Tq;
import a.Wp;
import a.ZF;
import a.ZQ;
import a.Zt;
import a._Y;
import a.e9;
import a.zb;
import com.analytics.computation.AnalyticsComputationEngine;
import com.analytics.timeseries.TimeSeriesAnalyzer1764;
import com.api.request.RequestHandler;
import com.api.response.ResponseMapper;
import com.app.adapter.GenericTransformationAdapter;
import com.app.analytics.MetricsCalculator;
import com.app.analytics.time.TimeSeriesAnalyzer;
import com.app.context.resolver.DataContextResolver;
import com.app.correlation.management.UuidCorrelationManager;
import com.app.data.storage.TimestampedDataContainer;
import com.app.execution.TimedExecutionController;
import com.app.network.ConnectionBroker2515;
import com.app.network.protocol.NetworkProtocolHandler2036;
import com.app.resources.ResourceAllocationTracker1690;
import com.app.scheduling.execution.TimedExecutionManager;
import com.app.security.cryptography.CryptographicKeyManager2408;
import com.app.security.encryption.EncryptionEngine;
import com.app.transformation.GenericDataTransformer;
import com.app.transformer.DataTransformationEngine1438;
import com.app.validation.StateValidator2172;
import com.cache.management.CacheDispatcher;
import com.collections.management.MultiContainerRegistry;
import com.collections.management.MultiListAggregator;
import com.computation.metrics.MetricComputationEngine;
import com.concurrency.management.ThreadSynchronizationController;
import com.config.management.ConfigurationTemplateManager;
import com.core.encoding.CharsetEncodingSpecification;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.constants.CipherModeEnum;
import com.crypto.registry.CryptoAlgorithmRegistry;
import com.data.aggregation.SequentialDataAggregator;
import com.data.comparison.ComparativeIdentifier;
import com.data.contract.DataTransformationContract2366;
import com.data.stream.StreamProcessor1422;
import com.data.streaming.DataStreamOrchestrator1513;
import com.data.streaming.DataStreamProcessor1482;
import com.data.transformation.MessageTransformationStrategy;
import com.data.transformation.PayloadTransformationManager;
import com.data.transformation.TransformationProtocol;
import com.data.versioning.DataVersionController;
import com.event.dynamic.DynamicEventDispatcher;
import com.event.management.EventDispatchController1219;
import com.event.management.EventDispatchQueue;
import com.event.processing.EventStreamProcessor;
import com.finance.validation.TransactionValidator1747;
import com.financial.risk.FinancialRiskCalculator1773;
import com.financial.transaction.TransactionInitiator;
import com.financial.transactions.TransactionValidator1768;
import com.financial.validation.TransactionValidator;
import com.financial.validation.TransactionValidator2148;
import com.io.buffer.StreamBufferManager;
import com.logging.audit.AuditTraceLogger;
import com.logging.temporal.TimestampTracker2469;
import com.math.conversion.NumericTransformationEngine1112;
import com.memory.management.BufferAllocationStrategy;
import com.messaging.codec.MessageEncoderHandler;
import com.messaging.template.MessageTemplateCompiler;
import com.metrics.time.TimeSeriesMetricsCollector;
import com.monitoring.metrics.PerformanceMetricsCollector1472;
import com.network.config.NetworkConfigurationEnum;
import com.network.connection.ConnectionEndpointResolver;
import com.network.connection.NetworkConnectionManager1416;
import com.network.connection.NetworkConnectionManager1456;
import com.network.interceptor.NetworkMessageInterceptor;
import com.network.lifecycle.ConnectionLifecycleManager1740;
import com.network.mapping.NetworkPortMapper;
import com.network.protocol.NetworkProtocolEncoder1226;
import com.network.protocol.NetworkProtocolManager1476;
import com.network.protocol.NetworkProtocolMapper1327;
import com.network.protocol.ProtocolStateTracker;
import com.network.protocol.ProtocolVersionResolver;
import com.network.registry.NetworkEndpointRegistry;
import com.network.security.SecureChannelNegotiator2460;
import com.network.security.SecureTransmissionHandler2454;
import com.network.session.ConnectionSession;
import com.network.state.NetworkStateController;
import com.network.traffic.NetworkTrafficClassifier;
import com.network.transformation.ChannelDataTransformer;
import com.network.transmission.NetworkPacketQueue;
import com.performance.monitoring.PerformanceTimestampTracker;
import com.reflection.resolution.MethodResolutionMediator;
import com.reflection.utils.ReflectionUtilityManager680;
import com.regulatory.compliance.ComplianceValidator;
import com.resource.management.ResourceAllocator1778;
import com.resource.tracking.ContextualResourceTracker;
import com.resource.tracking.TimestampedResourceTracker;
import com.resource.tracking.TimestampedResourceTracker2101;
import com.security.auth.AuthenticationValidator1734;
import com.security.auth.SecurityTokenGenerator1646;
import com.security.authentication.AuthenticationTokenGenerator1331;
import com.security.authentication.AuthenticationTokenManager1512;
import com.security.authentication.TokenAuthenticator;
import com.security.config.CryptoAlgorithmConfiguration;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CipherTransformationType;
import com.security.crypto.CryptoOperationExecutor;
import com.security.crypto.CryptoTransformationRegistry;
import com.security.crypto.CryptographicAlgorithmDescriptor;
import com.security.cryptography.CryptographicKeyManager1216;
import com.security.encoding.SecurityEncodingDescriptor;
import com.security.encryption.CryptographicKeyGenerator1849;
import com.security.encryption.SessionEncryptionManager;
import com.security.key.CryptoKeyExchangeManager1384;
import com.security.keygen.CipherKeyGenerationEnum;
import com.security.keys.CryptographicKeyManager2017;
import com.security.modes.CryptographicModeEnum866;
import com.security.policy.SecurityPolicyDescriptor;
import com.security.policy.SecurityPolicyValidator;
import com.security.registry.CryptoAlgorithmRegistry893;
import com.security.registry.CryptoParameterRegistry;
import com.security.token.CryptographicTokenManager1366;
import com.security.token.SecureTokenGenerator1501;
import com.security.token.SecurityTokenGenerator1739;
import com.security.validation.TimestampValidator1519;
import com.security.validation.TokenValidationService;
import com.stream.processing.StreamProcessor;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.configuration.SystemConfigurationProfile;
import com.system.lifecycle.SystemLifecycleController;
import com.system.mapping.DynamicMappingRegistry;
import com.system.memory.CacheMemoryManager1616;
import com.system.resource.ResourceAllocationTracker1589;
import com.system.resources.ResourceAllocationController1149;
import com.temporal.metadata.TemporalMetadataResolver;
import com.text.encoding.TextEncodingResolver;
import com.token.management.TokenWorkflow;
import com.transaction.audit.TransactionLogger;
import com.transaction.context.TransactionContextManager;
import com.transaction.core.TransactionContextBuilder;
import com.type.conversion.PrimitiveTypeMapper;
import com.user.identity.UserIdentityManager;
import com.user.identity.UserProfileIdentifier;
import com.validation.operations.OperationValidator;
import com.validation.temporal.TimeBasedValidator;
import com.workflow.coordination.WorkflowOrchestrator1642;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

@ChannelHandler.Sharable
public class NetworkPacketInterceptor
extends SimpleChannelInboundHandler<DataTransformationContract2366> {
    private static final Integer[] d;
    private ReflectionUtilityManager680 a;
    private Channel J;
    private final Map<UUID, DynamicMappingRegistry<@Nullable Consumer<UuidCorrelationManager<?>>, @Nullable Runnable>> I = new HashMap();
    private static final String[] g;
    static final boolean s;
    private static final Object[] f;
    private static final long b;
    private static final Map e;
    private static final long[] c;

    public void l(ReflectionUtilityManager680 reflectionUtilityManager680, Consumer<StreamProcessor> consumer, Runnable runnable) {
        this.N(new NetworkProtocolManager1476(reflectionUtilityManager680), arg_0 -> this.lambda$sendGroupInvitePacket$15(reflectionUtilityManager680, consumer, arg_0), runnable);
    }

    public void Q(int n, Map<Integer, MetricsCalculator> map) {
        this.K(new zb(n, map));
    }

    public void Y(Consumer<MultiListAggregator> consumer) {
        this.L(new DataStreamProcessor1482(), arg_0 -> NetworkPacketInterceptor.lambda$sendFriendsListPacket$6(consumer, arg_0));
    }

    private void q(MessageTransformationStrategy messageTransformationStrategy) {
        ResourceAllocationTracker1690.H.E(new ConnectionBroker2515(this));
    }

    private void e(TokenValidationService tokenValidationService) {
        AnalyticsComputationEngine analyticsComputationEngine;
        block67: {
            UserIdentityManager userIdentityManager;
            NumericTransformationEngine1112 numericTransformationEngine1112;
            block71: {
                AnalyticsComputationEngine analyticsComputationEngine2;
                block70: {
                    block68: {
                        block63: {
                            block66: {
                                block64: {
                                    block59: {
                                        block62: {
                                            block60: {
                                                String string;
                                                try {
                                                    if (tokenValidationService.a() == TemporalMetadataResolver.h.O().n().s().r()) {
                                                        return;
                                                    }
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                }
                                                numericTransformationEngine1112 = tokenValidationService.G();
                                                userIdentityManager = TemporalMetadataResolver.h.O().t().w(tokenValidationService.a());
                                                try {
                                                    string = userIdentityManager != null ? userIdentityManager.j() : String.valueOf(tokenValidationService.a());
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                }
                                                String string2 = string;
                                                analyticsComputationEngine2 = EventStreamProcessor.B.j(userIdentityManager);
                                                analyticsComputationEngine = null;
                                                try {
                                                    block61: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (numericTransformationEngine1112.h() != SecurityEncodingDescriptor.POSITION) break block59;
                                                                        if (s) break block60;
                                                                    }
                                                                    catch (RuntimeException runtimeException) {
                                                                        throw NetworkPacketInterceptor.a(runtimeException);
                                                                    }
                                                                    if (numericTransformationEngine1112.s() == null) break block61;
                                                                }
                                                                catch (RuntimeException runtimeException) {
                                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                                }
                                                                if (numericTransformationEngine1112.i() == null) break block61;
                                                            }
                                                            catch (RuntimeException runtimeException) {
                                                                throw NetworkPacketInterceptor.a(runtimeException);
                                                            }
                                                            if (numericTransformationEngine1112.M() != null) break block60;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw NetworkPacketInterceptor.a(runtimeException);
                                                        }
                                                    }
                                                    throw new AssertionError();
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (!(analyticsComputationEngine2 instanceof TransactionValidator) || !analyticsComputationEngine2.h(numericTransformationEngine1112.s(), numericTransformationEngine1112.i(), numericTransformationEngine1112.M())) break block62;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                }
                                                analyticsComputationEngine2.a();
                                                return;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw NetworkPacketInterceptor.a(runtimeException);
                                            }
                                        }
                                        analyticsComputationEngine = new TransactionValidator(userIdentityManager, new double[]{numericTransformationEngine1112.s(), numericTransformationEngine1112.i(), numericTransformationEngine1112.M()});
                                        break block67;
                                    }
                                    try {
                                        block65: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (numericTransformationEngine1112.h() != SecurityEncodingDescriptor.BLOCK) break block63;
                                                            if (s) break block64;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw NetworkPacketInterceptor.a(runtimeException);
                                                        }
                                                        if (numericTransformationEngine1112.Z() == null) break block65;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw NetworkPacketInterceptor.a(runtimeException);
                                                    }
                                                    if (numericTransformationEngine1112.p() == null) break block65;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                }
                                                if (numericTransformationEngine1112.U() != null) break block64;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw NetworkPacketInterceptor.a(runtimeException);
                                            }
                                        }
                                        throw new AssertionError();
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw NetworkPacketInterceptor.a(runtimeException);
                                    }
                                }
                                if (analyticsComputationEngine2 instanceof ResourceAllocationController1149) {
                                    double[] dArray = analyticsComputationEngine2.n();
                                    try {
                                        try {
                                            try {
                                                if (dArray[0] != (double)numericTransformationEngine1112.Z().intValue() || dArray[1] != (double)numericTransformationEngine1112.p().intValue()) break block66;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw NetworkPacketInterceptor.a(runtimeException);
                                            }
                                            if (dArray[2] != (double)numericTransformationEngine1112.U().intValue()) break block66;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw NetworkPacketInterceptor.a(runtimeException);
                                        }
                                        analyticsComputationEngine2.a();
                                        return;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw NetworkPacketInterceptor.a(runtimeException);
                                    }
                                }
                            }
                            analyticsComputationEngine = new ResourceAllocationController1149(userIdentityManager, new double[]{numericTransformationEngine1112.Z().intValue(), numericTransformationEngine1112.p().intValue(), numericTransformationEngine1112.U().intValue()});
                            break block67;
                        }
                        try {
                            block69: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (numericTransformationEngine1112.h() != SecurityEncodingDescriptor.ENTITY) break block67;
                                                    if (s) break block68;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                }
                                                if (numericTransformationEngine1112.Q() == null) break block69;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw NetworkPacketInterceptor.a(runtimeException);
                                            }
                                            if (numericTransformationEngine1112.s() == null) break block69;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw NetworkPacketInterceptor.a(runtimeException);
                                        }
                                        if (numericTransformationEngine1112.i() == null) break block69;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw NetworkPacketInterceptor.a(runtimeException);
                                    }
                                    if (numericTransformationEngine1112.M() != null) break block68;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw NetworkPacketInterceptor.a(runtimeException);
                                }
                            }
                            throw new AssertionError();
                        }
                        catch (RuntimeException runtimeException) {
                            throw NetworkPacketInterceptor.a(runtimeException);
                        }
                    }
                    Long l = numericTransformationEngine1112.W();
                    try {
                        try {
                            if (l == null || l.longValue() != TemporalMetadataResolver.h.O().n().s().r()) break block70;
                        }
                        catch (RuntimeException runtimeException) {
                            throw NetworkPacketInterceptor.a(runtimeException);
                        }
                        return;
                    }
                    catch (RuntimeException runtimeException) {
                        throw NetworkPacketInterceptor.a(runtimeException);
                    }
                }
                try {
                    try {
                        if (!(analyticsComputationEngine2 instanceof TransactionLogger) || !analyticsComputationEngine2.h(numericTransformationEngine1112.s(), numericTransformationEngine1112.i(), numericTransformationEngine1112.M())) break block71;
                    }
                    catch (RuntimeException runtimeException) {
                        throw NetworkPacketInterceptor.a(runtimeException);
                    }
                    analyticsComputationEngine2.a();
                    return;
                }
                catch (RuntimeException runtimeException) {
                    throw NetworkPacketInterceptor.a(runtimeException);
                }
            }
            analyticsComputationEngine = new TransactionLogger(userIdentityManager, numericTransformationEngine1112.W(), numericTransformationEngine1112.Q(), new double[]{numericTransformationEngine1112.s(), numericTransformationEngine1112.i(), numericTransformationEngine1112.M()});
        }
        try {
            if (analyticsComputationEngine != null) {
                EventStreamProcessor.B.M(analyticsComputationEngine);
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
    }

    private static void lambda$sendUserDisplayNamePacket$19(Consumer consumer, TimeSeriesAnalyzer timeSeriesAnalyzer) {
        try {
            if (timeSeriesAnalyzer.a() == CryptographicModeEnum866.SUCCESSFUL) {
                TemporalMetadataResolver.h.O().n().A(timeSeriesAnalyzer.F());
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        consumer.accept(timeSeriesAnalyzer);
    }

    private void lambda$sendGroupCreatePacket$11(Consumer consumer, NetworkProtocolEncoder1226 networkProtocolEncoder1226) {
        consumer.accept(networkProtocolEncoder1226);
        ResourceAllocationTracker1690.H.E(new EncryptionEngine(this, new JF(TemporalMetadataResolver.h.O().n())));
    }

    public void O(ReflectionUtilityManager680 reflectionUtilityManager680, Consumer<StreamProcessor1422> consumer, Runnable runnable) {
        this.N(new CacheDispatcher(reflectionUtilityManager680), arg_0 -> this.lambda$sendGroupUninvitePacket$17(reflectionUtilityManager680, consumer, arg_0), runnable);
    }

    public void e(ReflectionUtilityManager680 reflectionUtilityManager680, String string, Consumer<TransactionContextBuilder> consumer) {
        this.L(new DataContextResolver(reflectionUtilityManager680, string), arg_0 -> NetworkPacketInterceptor.lambda$sendChatToFriendPacket$10(consumer, arg_0));
    }

    public void m() {
        this.L(new TokenWorkflow(), NetworkPacketInterceptor::lambda$sendHeartbeatPacket$4);
    }

    public void k(ReflectionUtilityManager680 reflectionUtilityManager680, Consumer<NetworkConnectionManager1456> consumer, Runnable runnable) {
        this.N(new RequestHandler(reflectionUtilityManager680), arg_0 -> NetworkPacketInterceptor.lambda$sendClientGroupLeaderKickPacket$22(consumer, arg_0), runnable);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e9' || c == 'X' || c == 's' || c == 'Z') {
                field = NetworkPacketInterceptor.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e9' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == 's' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = NetworkPacketInterceptor.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'U' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = NetworkPacketInterceptor.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void c(ResourceAllocator1778 resourceAllocator1778) {
        ResourceAllocationTracker1690.H.E(new ZF(this, resourceAllocator1778.P()));
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelInactive(channelHandlerContext);
        this.J.close();
        this.J = null;
    }

    private void lambda$sendGroupInviteStatePacket$18(Consumer consumer, TL tL) {
        block6: {
            block7: {
                try {
                    try {
                        try {
                            if (tL.w() != CharsetEncodingSpecification.SUCCESSFULLY_ACCEPTED) break block6;
                            if (s) break block7;
                        }
                        catch (RuntimeException runtimeException) {
                            throw NetworkPacketInterceptor.a(runtimeException);
                        }
                        if (tL.C() != null) break block7;
                    }
                    catch (RuntimeException runtimeException) {
                        throw NetworkPacketInterceptor.a(runtimeException);
                    }
                    throw new AssertionError();
                }
                catch (RuntimeException runtimeException) {
                    throw NetworkPacketInterceptor.a(runtimeException);
                }
            }
            ResourceAllocationTracker1690.H.E(new ProtocolVersionResolver(this, new JF(tL.C())));
        }
        consumer.accept(tL);
    }

    public void W(Consumer<NetworkProtocolEncoder1226> consumer, Runnable runnable) {
        this.N(new TransactionInitiator(), arg_0 -> this.lambda$sendGroupCreatePacket$11(consumer, arg_0), runnable);
    }

    private void D(AuthenticationTokenGenerator1331 authenticationTokenGenerator1331) {
        ResourceAllocationTracker1690.H.E(new ConnectionEndpointResolver(this, authenticationTokenGenerator1331.V(), authenticationTokenGenerator1331.h()));
    }

    public void d(long[] lArray) {
        this.K(EventDispatchController1219.w(lArray));
    }

    private void lambda$sendGroupDeletePacket$13(Consumer consumer, ChannelDataTransformer channelDataTransformer) {
        try {
            if (channelDataTransformer.Q() == CipherKeyGenerationEnum.SUCCESS) {
                ResourceAllocationTracker1690.H.E(new ConnectionBroker2515(this));
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        consumer.accept(channelDataTransformer);
    }

    public void a(CryptoAlgorithmRegistry893 cryptoAlgorithmRegistry893, Object object) {
        this.K(new DynamicEventDispatcher(cryptoAlgorithmRegistry893, object));
    }

    private void lambda$sendGroupUninvitePacket$17(ReflectionUtilityManager680 reflectionUtilityManager680, Consumer consumer, StreamProcessor1422 streamProcessor1422) {
        try {
            if (streamProcessor1422.m() == CipherTransformationType.SUCCESS) {
                ResourceAllocationTracker1690.H.E(new CryptographicKeyManager2017(this, TemporalMetadataResolver.h.O().t().O(reflectionUtilityManager680.r(), () -> NetworkPacketInterceptor.lambda$null$16(reflectionUtilityManager680))));
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        consumer.accept(streamProcessor1422);
    }

    private void h(ProtocolStateTracker protocolStateTracker) {
        SequentialDataAggregator sequentialDataAggregator = TemporalMetadataResolver.h.O().m();
        MetricComputationEngine metricComputationEngine = sequentialDataAggregator.x(protocolStateTracker.V());
        try {
            if (metricComputationEngine == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        Arrays.fill(metricComputationEngine.W(), null);
        Arrays.fill(metricComputationEngine.n(), null);
        metricComputationEngine.d(protocolStateTracker.A());
        for (Map.Entry<Integer, MetricsCalculator> entry : protocolStateTracker.Y().entrySet()) {
            try {
                if (entry.getKey() >= 36) {
                    metricComputationEngine.W()[entry.getKey().intValue() - 36] = ComparativeIdentifier.f(entry.getValue());
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw NetworkPacketInterceptor.a(runtimeException);
            }
            metricComputationEngine.n()[entry.getKey().intValue()] = ComparativeIdentifier.f(entry.getValue());
        }
        metricComputationEngine.q(true);
    }

    private static Method d(long l, long l2) {
        int n = NetworkPacketInterceptor.a(l, l2);
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
                clazz3 = NetworkPacketInterceptor.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = NetworkPacketInterceptor.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = NetworkPacketInterceptor.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        NetworkPacketInterceptor.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = NetworkPacketInterceptor.b(277495222566708L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = NetworkPacketInterceptor.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        NetworkPacketInterceptor.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = NetworkPacketInterceptor.b(277495222566708L, 0L);
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

    public void B(long l, int n, int n2, int n3) {
        this.K(new PerformanceMetricsCollector1472(l, n, n2, n3));
    }

    public Channel Y() {
        return this.J;
    }

    private static void lambda$sendFriendRequestUpdatePacket$9(boolean bl, Consumer consumer, Tq tq) {
        block4: {
            try {
                try {
                    if (tq.N() == CryptographicAlgorithmDescriptor.UNKNOWN || !bl) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw NetworkPacketInterceptor.a(runtimeException);
                }
                ResourceAllocationTracker1690.H.E(new SessionEncryptionManager(SecureContextBroker572.h().c(), tq.x()));
            }
            catch (RuntimeException runtimeException) {
                throw NetworkPacketInterceptor.a(runtimeException);
            }
        }
        consumer.accept(tq);
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        super.exceptionCaught(channelHandlerContext, throwable);
    }

    public <R extends UuidCorrelationManager<?>> void N(UuidCorrelationManager<R> uuidCorrelationManager, @Nullable Consumer<R> consumer, @Nullable Runnable runnable) {
        this.I.put(uuidCorrelationManager.R(), DynamicMappingRegistry.U(consumer, runnable));
        this.K(uuidCorrelationManager);
    }

    private void m(Wp wp) {
        block9: {
            block8: {
                if (wp.K() != CryptoParameterRegistry.ADD) break block8;
                for (long l : wp.J()) {
                    UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.O().t().w(l);
                    try {
                        if (userIdentityManager == null) {
                            continue;
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        throw NetworkPacketInterceptor.a(runtimeException);
                    }
                    TemporalMetadataResolver.h.O().m().P(userIdentityManager);
                }
                break block9;
            }
            if (wp.K() != CryptoParameterRegistry.CHANGED_WORLD) break block9;
            for (long l : wp.J()) {
                try {
                    if (l == TemporalMetadataResolver.h.O().n().s().r()) {
                        TemporalMetadataResolver.h.O().m().G(false);
                        continue;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw NetworkPacketInterceptor.a(runtimeException);
                }
                TemporalMetadataResolver.h.O().m().P(l);
            }
        }
    }

    public void O(String string, Consumer<TimestampedDataContainer> consumer) {
        this.L(new DataVersionController(string), consumer::accept);
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
                n3 = 62;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 43;
                break;
            }
            case 3: {
                n3 = 0;
                break;
            }
            case 4: {
                n3 = 7;
                break;
            }
            case 5: {
                n3 = 38;
                break;
            }
            case 6: {
                n3 = 51;
                break;
            }
            case 7: {
                n3 = 33;
                break;
            }
            case 8: {
                n3 = 61;
                break;
            }
            case 9: {
                n3 = 39;
                break;
            }
            case 10: {
                n3 = 49;
                break;
            }
            case 11: {
                n3 = 31;
                break;
            }
            case 12: {
                n3 = 6;
                break;
            }
            case 13: {
                n3 = 36;
                break;
            }
            case 14: {
                n3 = 10;
                break;
            }
            case 15: {
                n3 = 15;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 1;
                break;
            }
            case 18: {
                n3 = 3;
                break;
            }
            case 19: {
                n3 = 27;
                break;
            }
            case 20: {
                n3 = 20;
                break;
            }
            case 21: {
                n3 = 32;
                break;
            }
            case 22: {
                n3 = 19;
                break;
            }
            case 23: {
                n3 = 55;
                break;
            }
            case 24: {
                n3 = 35;
                break;
            }
            case 25: {
                n3 = 4;
                break;
            }
            case 26: {
                n3 = 22;
                break;
            }
            case 27: {
                n3 = 5;
                break;
            }
            case 28: {
                n3 = 17;
                break;
            }
            case 29: {
                n3 = 59;
                break;
            }
            case 30: {
                n3 = 24;
                break;
            }
            case 31: {
                n3 = 45;
                break;
            }
            case 32: {
                n3 = 40;
                break;
            }
            case 33: {
                n3 = 13;
                break;
            }
            case 34: {
                n3 = 16;
                break;
            }
            case 35: {
                n3 = 41;
                break;
            }
            case 36: {
                n3 = 30;
                break;
            }
            case 37: {
                n3 = 2;
                break;
            }
            case 38: {
                n3 = 23;
                break;
            }
            case 39: {
                n3 = 47;
                break;
            }
            case 40: {
                n3 = 48;
                break;
            }
            case 41: {
                n3 = 25;
                break;
            }
            case 42: {
                n3 = 57;
                break;
            }
            case 43: {
                n3 = 37;
                break;
            }
            case 44: {
                n3 = 54;
                break;
            }
            case 45: {
                n3 = 34;
                break;
            }
            case 46: {
                n3 = 50;
                break;
            }
            case 47: {
                n3 = 14;
                break;
            }
            case 48: {
                n3 = 12;
                break;
            }
            case 49: {
                n3 = 26;
                break;
            }
            case 50: {
                n3 = 53;
                break;
            }
            case 51: {
                n3 = 56;
                break;
            }
            case 52: {
                n3 = 63;
                break;
            }
            case 53: {
                n3 = 9;
                break;
            }
            case 54: {
                n3 = 58;
                break;
            }
            case 55: {
                n3 = 21;
                break;
            }
            case 56: {
                n3 = 29;
                break;
            }
            case 57: {
                n3 = 18;
                break;
            }
            case 58: {
                n3 = 42;
                break;
            }
            case 59: {
                n3 = 60;
                break;
            }
            case 60: {
                n3 = 28;
                break;
            }
            case 61: {
                n3 = 11;
                break;
            }
            case 62: {
                n3 = 44;
                break;
            }
            default: {
                n3 = 46;
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
        NetworkPacketInterceptor.g[n4] = new String(cArray);
        return n4;
    }

    public void d(Consumer<T1> consumer, Runnable runnable) {
        this.N(new PayloadTransformationManager(), arg_0 -> this.lambda$sendGroupLeavePacket$12(consumer, arg_0), runnable);
    }

    public <R extends UuidCorrelationManager<?>> void L(UuidCorrelationManager<R> uuidCorrelationManager, Consumer<R> consumer) {
        this.N(uuidCorrelationManager, consumer, null);
    }

    public void m(NumericTransformationEngine1112 numericTransformationEngine1112, Consumer<NetworkPacketQueue> consumer) {
        this.N(new DataTransformationEngine1438(numericTransformationEngine1112), consumer, null);
    }

    private static void lambda$sendClientGroupLeaderPromotePacket$23(Consumer consumer, ResponseMapper responseMapper) {
        consumer.accept(responseMapper);
    }

    private void a(e9 e92) {
        ResourceAllocationTracker1690.H.E(new SecureChannelNegotiator2460(this, e92.v()));
    }

    public void G(long l) {
        long l2 = b ^ 0x36F0169E9FCCL;
        StateValidator2172.t((String)((Object)NetworkPacketInterceptor.b("U", (int)NetworkPacketInterceptor.a("j", (int)12143, (long)(0x52CB767A96808370L ^ l2)), (long)-6626418369381494666L, (long)l2)) + l);
        this.K(new PerformanceTimestampTracker(l));
    }

    private void lambda$sendGroupLeavePacket$12(Consumer consumer, T1 t1) {
        try {
            consumer.accept(t1);
            if (t1.Q() == TransformationProtocol.SUCCESS) {
                ResourceAllocationTracker1690.H.E(new TransactionValidator2148(this));
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
    }

    private void h(DataStreamOrchestrator1513 dataStreamOrchestrator1513) {
        SequentialDataAggregator sequentialDataAggregator = TemporalMetadataResolver.h.O().m();
        for (int i = 0; i < dataStreamOrchestrator1513.i().length; ++i) {
            long l = dataStreamOrchestrator1513.i()[i];
            WorkflowOrchestrator1642 workflowOrchestrator1642 = dataStreamOrchestrator1513.o()[i];
            MetricComputationEngine metricComputationEngine = sequentialDataAggregator.x(l);
            try {
                if (metricComputationEngine == null) {
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw NetworkPacketInterceptor.a(runtimeException);
            }
            metricComputationEngine.C(workflowOrchestrator1642);
        }
    }

    public void c(ReflectionUtilityManager680 reflectionUtilityManager680, Consumer<ResponseMapper> consumer, Runnable runnable) {
        this.N(new StreamBufferManager(reflectionUtilityManager680), arg_0 -> NetworkPacketInterceptor.lambda$sendClientGroupLeaderPromotePacket$23(consumer, arg_0), runnable);
    }

    private void G(ConnectionSession connectionSession) {
        new TransactionContextManager(this, new ReflectionUtilityManager680(connectionSession.L(), null), new ReflectionUtilityManager680(connectionSession.L(), null), connectionSession.h()).t();
    }

    public void a(String string, Consumer<TS> consumer) {
        this.L(new MessageTemplateCompiler(string), arg_0 -> this.lambda$sendFriendRequestPacket$8(consumer, arg_0));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x814;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
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
                throw new RuntimeException("a/Ho", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            NetworkPacketInterceptor.d[n2] = n3;
        }
        return d[n2];
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        this.J = channelHandlerContext.channel();
        this.J.attr(NetworkTrafficClassifier.G).set((Object)CryptoAlgorithmRegistry.UNAUTHENTICATED);
    }

    private void g(CryptographicKeyManager1216 cryptographicKeyManager1216) {
        block14: {
            block12: {
                block13: {
                    try {
                        try {
                            try {
                                if (cryptographicKeyManager1216.j() != PrimitiveTypeMapper.SENT) break block12;
                                if (s) break block13;
                            }
                            catch (RuntimeException runtimeException) {
                                throw NetworkPacketInterceptor.a(runtimeException);
                            }
                            if (cryptographicKeyManager1216.O() != null) break block13;
                        }
                        catch (RuntimeException runtimeException) {
                            throw NetworkPacketInterceptor.a(runtimeException);
                        }
                        throw new AssertionError();
                    }
                    catch (RuntimeException runtimeException) {
                        throw NetworkPacketInterceptor.a(runtimeException);
                    }
                }
                try {
                    if (TemporalMetadataResolver.h.O().n().s().r() == cryptographicKeyManager1216.O().r()) {
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw NetworkPacketInterceptor.a(runtimeException);
                }
                ResourceAllocationTracker1690.H.E(new CryptographicKeyManager2408(this, TemporalMetadataResolver.h.O().t().O(cryptographicKeyManager1216.Z().r(), () -> NetworkPacketInterceptor.lambda$handleServerGroupInviteUpdatePacket$20(cryptographicKeyManager1216))));
                break block14;
            }
            try {
                if (cryptographicKeyManager1216.j() == PrimitiveTypeMapper.DECLINED) {
                    ResourceAllocationTracker1690.H.E(new CryptographicKeyManager2017(this, TemporalMetadataResolver.h.O().t().O(cryptographicKeyManager1216.Z().r(), () -> NetworkPacketInterceptor.lambda$handleServerGroupInviteUpdatePacket$21(cryptographicKeyManager1216))));
                }
            }
            catch (RuntimeException runtimeException) {
                throw NetworkPacketInterceptor.a(runtimeException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public void K(DataTransformationContract2366 var1_1) {
        block13: {
            if (this.J == null) ** GOTO lbl8
            try {
                block15: {
                    if (this.J.isOpen()) break block13;
                    break block15;
                    catch (Exception v0) {
                        throw NetworkPacketInterceptor.a(v0);
                    }
                }
                if (var1_1 instanceof UuidCorrelationManager) {
                    // empty if block
                }
            }
            catch (Exception v1) {
                throw NetworkPacketInterceptor.a(v1);
            }
            return;
        }
        try {
            block14: {
                try {
                    if (!(var1_1 instanceof UuidCorrelationManager)) break block14;
                    if (!(var1_1 instanceof TokenWorkflow)) {
                        // empty if block
                    }
                }
                catch (Exception v2) {
                    throw NetworkPacketInterceptor.a(v2);
                }
                try {
                    if (this.I.containsKey(((UuidCorrelationManager)var1_1).R())) ** GOTO lbl34
                    this.I.put(((UuidCorrelationManager)var1_1).R(), DynamicMappingRegistry.U((Consumer<UuidCorrelationManager>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$sendPacket$0(com.app.correlation.management.UuidCorrelationManager ), (Lcom/app/correlation/management/UuidCorrelationManager;)V)(), (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$sendPacket$1(), ()V)()));
                }
                catch (Exception v3) {
                    throw NetworkPacketInterceptor.a(v3);
                }
            }
            if (!(var1_1 instanceof TokenWorkflow)) {
                // empty if block
            }
lbl34:
            // 5 sources

            this.J.writeAndFlush((Object)var1_1);
        }
        catch (Exception var2_2) {
            // empty catch block
        }
    }

    private void s(NetworkPortMapper networkPortMapper) {
        block6: {
            block5: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (systemConfigurationOrchestrator.Y()) {
                        this.K(new OperationValidator(false));
                        return;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw NetworkPacketInterceptor.a(runtimeException);
                }
                double d2 = _Y.V(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B(), networkPortMapper.M(), networkPortMapper.p(), networkPortMapper.Z());
                try {
                    if (!(d2 <= 10.0)) break block5;
                    this.K(new OperationValidator(true));
                    break block6;
                }
                catch (RuntimeException runtimeException) {
                    throw NetworkPacketInterceptor.a(runtimeException);
                }
            }
            this.K(new OperationValidator(false));
        }
    }

    public void R(Consumer<EventDispatchQueue> consumer) {
        this.L(new NetworkProtocolMapper1327(10), arg_0 -> NetworkPacketInterceptor.lambda$sendHandshake$2(consumer, arg_0));
    }

    public void c(ReflectionUtilityManager680 reflectionUtilityManager680, boolean bl, Consumer<TL> consumer, Runnable runnable) {
        this.N(new TimedExecutionManager(reflectionUtilityManager680, bl), arg_0 -> this.lambda$sendGroupInviteStatePacket$18(consumer, arg_0), runnable);
    }

    private static UserIdentityManager lambda$null$14(ReflectionUtilityManager680 reflectionUtilityManager680) {
        return new UserIdentityManager(reflectionUtilityManager680);
    }

    private void m(TimeSeriesMetricsCollector timeSeriesMetricsCollector) {
        SequentialDataAggregator sequentialDataAggregator = TemporalMetadataResolver.h.O().m();
        MetricComputationEngine metricComputationEngine = sequentialDataAggregator.x(timeSeriesMetricsCollector.B());
        try {
            if (metricComputationEngine == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        metricComputationEngine.d(timeSeriesMetricsCollector.C());
        metricComputationEngine.q(true);
    }

    private static void lambda$sendHeartbeatPacket$4(GenericDataTransformer genericDataTransformer) {
    }

    public void F(String string, Consumer<GenericTransformationAdapter> consumer) {
        MethodResolutionMediator methodResolutionMediator = ApplicationLifecycleManager.G();
        this.L(new UserProfileIdentifier(string, methodResolutionMediator.w(), methodResolutionMediator.N()), arg_0 -> this.lambda$sendAuthenticationPacket$5(consumer, arg_0));
    }

    private void I(TimestampedResourceTracker timestampedResourceTracker) {
        ResourceAllocationTracker1690.H.E(new TimestampedResourceTracker2101(this, timestampedResourceTracker.N(), timestampedResourceTracker.G()));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = NetworkPacketInterceptor.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = NetworkPacketInterceptor.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static UserIdentityManager lambda$null$16(ReflectionUtilityManager680 reflectionUtilityManager680) {
        return new UserIdentityManager(reflectionUtilityManager680);
    }

    public void l(CryptoTransformationRegistry cryptoTransformationRegistry) {
        this.K(new ConnectionLifecycleManager1740(cryptoTransformationRegistry));
    }

    public void a(int n) {
        this.K(new BufferAllocationStrategy(n));
    }

    public void b(long l, boolean bl, Consumer<Tq> consumer) {
        this.L(new Tm(l, bl), arg_0 -> NetworkPacketInterceptor.lambda$sendFriendRequestUpdatePacket$9(bl, consumer, arg_0));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                NetworkPacketInterceptor.b = MultiContainerRegistry.a(-4053863596933130067L, 8801691907060355220L, MethodHandles.lookup().lookupClass()).a(240997799781777L);
                NetworkPacketInterceptor.f = new Object[5];
                NetworkPacketInterceptor.g = new String[5];
                NetworkPacketInterceptor.a();
                NetworkPacketInterceptor.e = new HashMap<K, V>(13);
                var0 = NetworkPacketInterceptor.b ^ 89579616854074L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00c9Vh\u0085\u009e)Fp\u0093R8\u007f\u00d1\u0002\u00bd&\u00f2b8\u007f\u008b8\u00a5c";
                var7_6 = "\u00c9Vh\u0085\u009e)Fp\u0093R8\u007f\u00d1\u0002\u00bd&\u00f2b8\u007f\u008b8\u00a5c".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block10;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "/\u00a0&\u00e9\u00a1y\u00b9;F\u00b68\u00c9I\u0096\u00a2\u00a0";
                    var7_6 = "/\u00a0&\u00e9\u00a1y\u00b9;F\u00b68\u00c9I\u0096\u00a2\u00a0".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block11;
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
        NetworkPacketInterceptor.c = var8_3;
        NetworkPacketInterceptor.d = new Integer[5];
        try {
            v8 = NetworkPacketInterceptor.class.desiredAssertionStatus() == false;
        }
        catch (RuntimeException v9) {
            throw NetworkPacketInterceptor.a(v9);
        }
        NetworkPacketInterceptor.s = v8;
    }

    public void K() {
        long l = b ^ 0x64986BE48271L;
        StateValidator2172.t((String)((Object)NetworkPacketInterceptor.b("U", (int)NetworkPacketInterceptor.a("j", (int)10527, (long)(0x1CAA72B4F42B18BCL ^ l)), (long)-5064462769686934069L, (long)l)));
        this.K(new CryptographicKeyGenerator1849());
    }

    private void lambda$sendAuthenticationPacket$5(Consumer consumer, GenericTransformationAdapter genericTransformationAdapter) {
        block4: {
            try {
                try {
                    if (s || genericTransformationAdapter.V() != null) break block4;
                }
                catch (RuntimeException runtimeException) {
                    throw NetworkPacketInterceptor.a(runtimeException);
                }
                throw new AssertionError();
            }
            catch (RuntimeException runtimeException) {
                throw NetworkPacketInterceptor.a(runtimeException);
            }
        }
        TemporalMetadataResolver.h.O().n().J(genericTransformationAdapter.V());
        this.E(genericTransformationAdapter.V());
        consumer.accept(genericTransformationAdapter);
    }

    public ReflectionUtilityManager680 M() {
        return this.a;
    }

    private static UserIdentityManager lambda$handleServerGroupInviteUpdatePacket$21(CryptographicKeyManager1216 cryptographicKeyManager1216) {
        return new UserIdentityManager(cryptographicKeyManager1216.Z());
    }

    private void f(CryptoKeyExchangeManager1384 cryptoKeyExchangeManager1384) {
        ResourceAllocationTracker1690.H.E(new NetworkStateController(this, cryptoKeyExchangeManager1384.W(), cryptoKeyExchangeManager1384.U()));
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

    public void z() {
        boolean bl = SystemLifecycleController.C.q().T().s();
        this.K(new TransactionValidator1747(bl));
    }

    private void u(AuthenticationValidator1734 authenticationValidator1734) {
        ResourceAllocationTracker1690.H.E(new SecureTransmissionHandler2454(this, authenticationValidator1734.I()));
    }

    public void x(String string, Consumer<TimeSeriesAnalyzer> consumer, Runnable runnable) {
        this.N(new ConfigurationTemplateManager(string), arg_0 -> NetworkPacketInterceptor.lambda$sendUserDisplayNamePacket$19(consumer, arg_0), runnable);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "Ut7";
        objectArray[1] = Integer.TYPE;
        NetworkPacketInterceptor.g[1] = "java/lang/Integer";
        objectArray[2] = "zA\u0011\u001ecLqN\u0000Q\u001eTbI\t\u0018";
        objectArray[3] = "4\t\u0005\u001c~j?\u0006\u0014S\u001fd4\r\u0010\t";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "#l{\nAy/l8uV9\u0013**\u001b\u0005:+x*\u0015LB*n-\u0015_#}j:D=";
    }

    private void lambda$sendFriendRequestPacket$8(Consumer consumer, TS tS) {
        try {
            if (tS.E() == CipherModeEnum.SENT) {
                ResourceAllocationTracker1690.H.E(new ZQ(this, tS.C()));
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        consumer.accept(tS);
    }

    public void O(Consumer<ChannelDataTransformer> consumer, Runnable runnable) {
        this.N(new TokenAuthenticator(), arg_0 -> this.lambda$sendGroupDeletePacket$13(consumer, arg_0), runnable);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void k(ComplianceValidator complianceValidator) {
        ResourceAllocationTracker1690.H.E(new NetworkProtocolHandler2036(this, complianceValidator.M()));
    }

    private void s(CryptographicTokenManager1366 cryptographicTokenManager1366) {
        ResourceAllocationTracker1690.H.E(new AuditTraceLogger(this, cryptographicTokenManager1366.n(), cryptographicTokenManager1366.Q(), cryptographicTokenManager1366.x()));
    }

    private static void lambda$sendHandshake$2(Consumer consumer, EventDispatchQueue eventDispatchQueue) {
        consumer.accept(eventDispatchQueue);
    }

    private void j(SecurityTokenGenerator1739 securityTokenGenerator1739) {
        ResourceAllocationTracker1690.H.E(new Zt(this, securityTokenGenerator1739.M()));
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = NetworkPacketInterceptor.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                NetworkPacketInterceptor.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void j(Map<Integer, MetricsCalculator> map) {
        this.K(new NetworkMessageInterceptor(map));
    }

    private void lambda$switchToAuthenticated$3(MultiListAggregator multiListAggregator) {
        this.z();
        ResourceAllocationTracker1690.H.E(new NetworkEndpointRegistry(this, multiListAggregator.D(), multiListAggregator.h(), multiListAggregator.e()));
    }

    public CryptoAlgorithmRegistry N() {
        return (CryptoAlgorithmRegistry)((Object)this.J.attr(NetworkTrafficClassifier.G).get());
    }

    private static void lambda$sendFriendDeletePacket$7(Consumer consumer, ThreadSynchronizationController threadSynchronizationController) {
        consumer.accept(threadSynchronizationController);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = NetworkPacketInterceptor.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = NetworkPacketInterceptor.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void a(TimeSeriesAnalyzer1764 timeSeriesAnalyzer1764) {
        ResourceAllocationTracker1690.H.E(new TimestampTracker2469(this, timeSeriesAnalyzer1764.W()));
    }

    private void v(TimeBasedValidator timeBasedValidator) {
        UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.O().t().w(timeBasedValidator.s());
        try {
            if (userIdentityManager == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        SequentialDataAggregator sequentialDataAggregator = TemporalMetadataResolver.h.O().m();
        MetricComputationEngine metricComputationEngine = sequentialDataAggregator.x(timeBasedValidator.s());
        try {
            if (metricComputationEngine == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        metricComputationEngine.L(timeBasedValidator.C());
    }

    private void R(FZ fZ) {
        ResourceAllocationTracker1690.H.E(new ContextualResourceTracker(this, fZ.m(), fZ.d()));
    }

    private static Field c(long l, long l2) {
        int n = NetworkPacketInterceptor.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = NetworkPacketInterceptor.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = NetworkPacketInterceptor.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = NetworkPacketInterceptor.a(clazz3, string2, clazz2)) != null) {
                    NetworkPacketInterceptor.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = NetworkPacketInterceptor.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        NetworkPacketInterceptor.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = NetworkPacketInterceptor.b(277495222566708L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void r(NetworkConnectionManager1416 networkConnectionManager1416) {
        ResourceAllocationTracker1690.H.E(new CacheMemoryManager1616(this, networkConnectionManager1416.E(), networkConnectionManager1416.n()));
    }

    private static void lambda$sendPacket$0(UuidCorrelationManager uuidCorrelationManager) {
    }

    private static void lambda$sendChatToFriendPacket$10(Consumer consumer, TransactionContextBuilder transactionContextBuilder) {
        try {
            if (transactionContextBuilder.E() == SecurityPolicyDescriptor.SUCCESS) {
                consumer.accept(transactionContextBuilder);
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
    }

    protected void t(ChannelHandlerContext channelHandlerContext, DataTransformationContract2366 dataTransformationContract2366) {
        block66: {
            block91: {
                block90: {
                    block89: {
                        block88: {
                            block87: {
                                block86: {
                                    block85: {
                                        block84: {
                                            block83: {
                                                block82: {
                                                    block81: {
                                                        block80: {
                                                            block79: {
                                                                block78: {
                                                                    block77: {
                                                                        block76: {
                                                                            block75: {
                                                                                block74: {
                                                                                    block73: {
                                                                                        block72: {
                                                                                            block71: {
                                                                                                block70: {
                                                                                                    block69: {
                                                                                                        block68: {
                                                                                                            block67: {
                                                                                                                block65: {
                                                                                                                    long l = b ^ 0x3731DC0A2172L;
                                                                                                                    if (dataTransformationContract2366 instanceof UuidCorrelationManager) {
                                                                                                                        UuidCorrelationManager uuidCorrelationManager = (UuidCorrelationManager)dataTransformationContract2366;
                                                                                                                        DynamicMappingRegistry<Consumer<UuidCorrelationManager<?>>, Runnable> dynamicMappingRegistry = this.I.remove(uuidCorrelationManager.R());
                                                                                                                        try {
                                                                                                                            if (dynamicMappingRegistry == null) {
                                                                                                                                throw new RuntimeException((String)((Object)NetworkPacketInterceptor.b("U", (int)NetworkPacketInterceptor.a("j", (int)26792, (long)(0x6B2B35D4FDCAFA0BL ^ l)), (long)1924227091053686472L, (long)l)) + dataTransformationContract2366 + (String)((Object)NetworkPacketInterceptor.b("U", (int)NetworkPacketInterceptor.a("j", (int)17918, (long)(0x3317A77477F1D75BL ^ l)), (long)1924227091053686472L, (long)l)) + uuidCorrelationManager.R() + (String)((Object)NetworkPacketInterceptor.b("U", (int)NetworkPacketInterceptor.a("j", (int)23739, (long)(0x3E52E3735B324E19L ^ l)), (long)1924227091053686472L, (long)l)));
                                                                                                                            }
                                                                                                                        }
                                                                                                                        catch (RuntimeException runtimeException) {
                                                                                                                            throw NetworkPacketInterceptor.a(runtimeException);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (dynamicMappingRegistry.z() != null) {
                                                                                                                                dynamicMappingRegistry.z().accept(uuidCorrelationManager);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        catch (RuntimeException runtimeException) {
                                                                                                                            throw NetworkPacketInterceptor.a(runtimeException);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (dynamicMappingRegistry.p() != null) {
                                                                                                                                dynamicMappingRegistry.p().run();
                                                                                                                            }
                                                                                                                        }
                                                                                                                        catch (RuntimeException runtimeException) {
                                                                                                                            throw NetworkPacketInterceptor.a(runtimeException);
                                                                                                                        }
                                                                                                                        return;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (!(dataTransformationContract2366 instanceof FinancialRiskCalculator1773)) break block65;
                                                                                                                        this.n((FinancialRiskCalculator1773)dataTransformationContract2366);
                                                                                                                        break block66;
                                                                                                                    }
                                                                                                                    catch (RuntimeException runtimeException) {
                                                                                                                        throw NetworkPacketInterceptor.a(runtimeException);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (!(dataTransformationContract2366 instanceof ResourceAllocator1778)) break block67;
                                                                                                                    this.c((ResourceAllocator1778)dataTransformationContract2366);
                                                                                                                    break block66;
                                                                                                                }
                                                                                                                catch (RuntimeException runtimeException) {
                                                                                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                if (!(dataTransformationContract2366 instanceof SecurityTokenGenerator1739)) break block68;
                                                                                                                this.j((SecurityTokenGenerator1739)dataTransformationContract2366);
                                                                                                                break block66;
                                                                                                            }
                                                                                                            catch (RuntimeException runtimeException) {
                                                                                                                throw NetworkPacketInterceptor.a(runtimeException);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            if (!(dataTransformationContract2366 instanceof TimeSeriesAnalyzer1764)) break block69;
                                                                                                            this.a((TimeSeriesAnalyzer1764)dataTransformationContract2366);
                                                                                                            break block66;
                                                                                                        }
                                                                                                        catch (RuntimeException runtimeException) {
                                                                                                            throw NetworkPacketInterceptor.a(runtimeException);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!(dataTransformationContract2366 instanceof CryptoKeyExchangeManager1384)) break block70;
                                                                                                        this.f((CryptoKeyExchangeManager1384)dataTransformationContract2366);
                                                                                                        break block66;
                                                                                                    }
                                                                                                    catch (RuntimeException runtimeException) {
                                                                                                        throw NetworkPacketInterceptor.a(runtimeException);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (!(dataTransformationContract2366 instanceof ConnectionSession)) break block71;
                                                                                                    this.G((ConnectionSession)dataTransformationContract2366);
                                                                                                    break block66;
                                                                                                }
                                                                                                catch (RuntimeException runtimeException) {
                                                                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (!(dataTransformationContract2366 instanceof AuthenticationValidator1734)) break block72;
                                                                                                this.u((AuthenticationValidator1734)dataTransformationContract2366);
                                                                                                break block66;
                                                                                            }
                                                                                            catch (RuntimeException runtimeException) {
                                                                                                throw NetworkPacketInterceptor.a(runtimeException);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (!(dataTransformationContract2366 instanceof ComplianceValidator)) break block73;
                                                                                            this.k((ComplianceValidator)dataTransformationContract2366);
                                                                                            break block66;
                                                                                        }
                                                                                        catch (RuntimeException runtimeException) {
                                                                                            throw NetworkPacketInterceptor.a(runtimeException);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (!(dataTransformationContract2366 instanceof MessageTransformationStrategy)) break block74;
                                                                                        this.q((MessageTransformationStrategy)dataTransformationContract2366);
                                                                                        break block66;
                                                                                    }
                                                                                    catch (RuntimeException runtimeException) {
                                                                                        throw NetworkPacketInterceptor.a(runtimeException);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (!(dataTransformationContract2366 instanceof FZ)) break block75;
                                                                                    this.R((FZ)dataTransformationContract2366);
                                                                                    break block66;
                                                                                }
                                                                                catch (RuntimeException runtimeException) {
                                                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (!(dataTransformationContract2366 instanceof AuthenticationTokenManager1512)) break block76;
                                                                                this.A((AuthenticationTokenManager1512)dataTransformationContract2366);
                                                                                break block66;
                                                                            }
                                                                            catch (RuntimeException runtimeException) {
                                                                                throw NetworkPacketInterceptor.a(runtimeException);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (!(dataTransformationContract2366 instanceof CryptographicKeyManager1216)) break block77;
                                                                            this.g((CryptographicKeyManager1216)dataTransformationContract2366);
                                                                            break block66;
                                                                        }
                                                                        catch (RuntimeException runtimeException) {
                                                                            throw NetworkPacketInterceptor.a(runtimeException);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (!(dataTransformationContract2366 instanceof CryptographicTokenManager1366)) break block78;
                                                                        this.s((CryptographicTokenManager1366)dataTransformationContract2366);
                                                                        break block66;
                                                                    }
                                                                    catch (RuntimeException runtimeException) {
                                                                        throw NetworkPacketInterceptor.a(runtimeException);
                                                                    }
                                                                }
                                                                try {
                                                                    if (!(dataTransformationContract2366 instanceof TimestampValidator1519)) break block79;
                                                                    this.g((TimestampValidator1519)dataTransformationContract2366);
                                                                    break block66;
                                                                }
                                                                catch (RuntimeException runtimeException) {
                                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                                }
                                                            }
                                                            try {
                                                                if (!(dataTransformationContract2366 instanceof AuthenticationTokenGenerator1331)) break block80;
                                                                this.D((AuthenticationTokenGenerator1331)dataTransformationContract2366);
                                                                break block66;
                                                            }
                                                            catch (RuntimeException runtimeException) {
                                                                throw NetworkPacketInterceptor.a(runtimeException);
                                                            }
                                                        }
                                                        try {
                                                            if (!(dataTransformationContract2366 instanceof TimestampedResourceTracker)) break block81;
                                                            this.I((TimestampedResourceTracker)dataTransformationContract2366);
                                                            break block66;
                                                        }
                                                        catch (RuntimeException runtimeException) {
                                                            throw NetworkPacketInterceptor.a(runtimeException);
                                                        }
                                                    }
                                                    try {
                                                        if (!(dataTransformationContract2366 instanceof NetworkConnectionManager1416)) break block82;
                                                        this.r((NetworkConnectionManager1416)dataTransformationContract2366);
                                                        break block66;
                                                    }
                                                    catch (RuntimeException runtimeException) {
                                                        throw NetworkPacketInterceptor.a(runtimeException);
                                                    }
                                                }
                                                try {
                                                    if (!(dataTransformationContract2366 instanceof e9)) break block83;
                                                    this.a((e9)dataTransformationContract2366);
                                                    break block66;
                                                }
                                                catch (RuntimeException runtimeException) {
                                                    throw NetworkPacketInterceptor.a(runtimeException);
                                                }
                                            }
                                            try {
                                                if (!(dataTransformationContract2366 instanceof TokenValidationService)) break block84;
                                                this.e((TokenValidationService)dataTransformationContract2366);
                                                break block66;
                                            }
                                            catch (RuntimeException runtimeException) {
                                                throw NetworkPacketInterceptor.a(runtimeException);
                                            }
                                        }
                                        try {
                                            if (!(dataTransformationContract2366 instanceof Wp)) break block85;
                                            this.m((Wp)dataTransformationContract2366);
                                            break block66;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw NetworkPacketInterceptor.a(runtimeException);
                                        }
                                    }
                                    try {
                                        if (!(dataTransformationContract2366 instanceof DataStreamOrchestrator1513)) break block86;
                                        this.h((DataStreamOrchestrator1513)dataTransformationContract2366);
                                        break block66;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw NetworkPacketInterceptor.a(runtimeException);
                                    }
                                }
                                try {
                                    if (!(dataTransformationContract2366 instanceof NetworkPortMapper)) break block87;
                                    this.s((NetworkPortMapper)dataTransformationContract2366);
                                    break block66;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw NetworkPacketInterceptor.a(runtimeException);
                                }
                            }
                            try {
                                if (!(dataTransformationContract2366 instanceof TimeBasedValidator)) break block88;
                                this.v((TimeBasedValidator)dataTransformationContract2366);
                                break block66;
                            }
                            catch (RuntimeException runtimeException) {
                                throw NetworkPacketInterceptor.a(runtimeException);
                            }
                        }
                        try {
                            if (!(dataTransformationContract2366 instanceof ProtocolStateTracker)) break block89;
                            this.h((ProtocolStateTracker)dataTransformationContract2366);
                            break block66;
                        }
                        catch (RuntimeException runtimeException) {
                            throw NetworkPacketInterceptor.a(runtimeException);
                        }
                    }
                    try {
                        if (!(dataTransformationContract2366 instanceof CryptoOperationExecutor)) break block90;
                        this.V((CryptoOperationExecutor)dataTransformationContract2366);
                        break block66;
                    }
                    catch (RuntimeException runtimeException) {
                        throw NetworkPacketInterceptor.a(runtimeException);
                    }
                }
                try {
                    if (!(dataTransformationContract2366 instanceof TimeSeriesMetricsCollector)) break block91;
                    this.m((TimeSeriesMetricsCollector)dataTransformationContract2366);
                    break block66;
                }
                catch (RuntimeException runtimeException) {
                    throw NetworkPacketInterceptor.a(runtimeException);
                }
            }
            try {
                if (dataTransformationContract2366 instanceof SecureTokenGenerator1501) {
                    this.k((SecureTokenGenerator1501)dataTransformationContract2366);
                }
            }
            catch (RuntimeException runtimeException) {
                throw NetworkPacketInterceptor.a(runtimeException);
            }
        }
    }

    private static void lambda$sendClientGroupLeaderKickPacket$22(Consumer consumer, NetworkConnectionManager1456 networkConnectionManager1456) {
        consumer.accept(networkConnectionManager1456);
    }

    private void k(SecureTokenGenerator1501 secureTokenGenerator1501) {
        try {
            if (secureTokenGenerator1501.h() == SecurityPolicyValidator.BANNED) {
                SystemLifecycleController.C.r(NetworkConfigurationEnum.BANNED);
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        SystemLifecycleController.C.o(secureTokenGenerator1501.h());
        SystemLifecycleController.C.N();
    }

    public void C(@Nullable String string) {
        this.K(new TextEncodingResolver(string));
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ho" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void V(CryptoOperationExecutor cryptoOperationExecutor) {
        SequentialDataAggregator sequentialDataAggregator = TemporalMetadataResolver.h.O().m();
        MetricComputationEngine metricComputationEngine = sequentialDataAggregator.x(cryptoOperationExecutor.W());
        try {
            if (metricComputationEngine == null) {
                return;
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        for (Map.Entry<Integer, MetricsCalculator> entry : cryptoOperationExecutor.I().entrySet()) {
            try {
                if (entry.getKey() >= 36) {
                    metricComputationEngine.W()[entry.getKey().intValue() - 36] = ComparativeIdentifier.f(entry.getValue());
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw NetworkPacketInterceptor.a(runtimeException);
            }
            metricComputationEngine.n()[entry.getKey().intValue()] = ComparativeIdentifier.f(entry.getValue());
        }
        metricComputationEngine.q(true);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = NetworkPacketInterceptor.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ho" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void U() {
        this.K(EventDispatchController1219.V());
    }

    private void n(FinancialRiskCalculator1773 financialRiskCalculator1773) {
        ResourceAllocationTracker1690.H.E(new SessionEncryptionManager(SecureContextBroker572.h().c(), financialRiskCalculator1773.Y()));
    }

    public void P(UUID uUID, String string) {
        this.K(new SecurityTokenGenerator1646(uUID, string));
    }

    private static void lambda$sendFriendsListPacket$6(Consumer consumer, MultiListAggregator multiListAggregator) {
        consumer.accept(multiListAggregator);
    }

    public void m(int n) {
        this.K(new TransactionValidator1768(n));
    }

    private void E(ReflectionUtilityManager680 reflectionUtilityManager680) {
        this.a = reflectionUtilityManager680;
        this.J.attr(NetworkTrafficClassifier.G).set((Object)CryptoAlgorithmRegistry.AUTHENTICATED);
        this.Y(this::lambda$switchToAuthenticated$3);
    }

    private static void lambda$sendPacket$1() {
    }

    public void f(ReflectionUtilityManager680 reflectionUtilityManager680, Consumer<ThreadSynchronizationController> consumer, Runnable runnable) {
        this.N(new MessageEncoderHandler(reflectionUtilityManager680), arg_0 -> NetworkPacketInterceptor.lambda$sendFriendDeletePacket$7(consumer, arg_0), runnable);
    }

    private static UserIdentityManager lambda$handleServerGroupInviteUpdatePacket$20(CryptographicKeyManager1216 cryptographicKeyManager1216) {
        return new UserIdentityManager(cryptographicKeyManager1216.Z());
    }

    private void A(AuthenticationTokenManager1512 authenticationTokenManager1512) {
        if (authenticationTokenManager1512.g() == SystemConfigurationProfile.ADD) {
            // empty if block
        }
        ResourceAllocationTracker1690.H.E(new ResourceAllocationTracker1589(this, authenticationTokenManager1512.u(), authenticationTokenManager1512.g()));
    }

    private void g(TimestampValidator1519 timestampValidator1519) {
        ResourceAllocationTracker1690.H.E(new TimedExecutionController(this, timestampValidator1519.I(), timestampValidator1519.T()));
    }

    private void lambda$sendGroupInvitePacket$15(ReflectionUtilityManager680 reflectionUtilityManager680, Consumer consumer, StreamProcessor streamProcessor) {
        try {
            if (streamProcessor.l() == CryptoAlgorithmConfiguration.SUCCESS) {
                ResourceAllocationTracker1690.H.E(new CryptographicKeyManager2408(this, TemporalMetadataResolver.h.O().t().O(reflectionUtilityManager680.r(), () -> NetworkPacketInterceptor.lambda$null$14(reflectionUtilityManager680))));
            }
        }
        catch (RuntimeException runtimeException) {
            throw NetworkPacketInterceptor.a(runtimeException);
        }
        consumer.accept(streamProcessor);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(NetworkPacketInterceptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(NetworkPacketInterceptor.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

