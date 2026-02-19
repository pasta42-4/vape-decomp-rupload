/*
 * Decompiled with CFR 0.152.
 */
package com.security.context;

import a.P6;
import a.PJ;
import a.PN;
import a.PR;
import a.PS;
import a.PU;
import a.P_;
import a.Pd;
import a.Pi;
import a.Pv;
import a.Px;
import a.Pz;
import a.U2;
import a.U5;
import a.UB;
import a.UI;
import a.UU;
import a.UZ;
import a.Uf;
import a.Ui;
import a.Um;
import a.Uq;
import a.Uu;
import a.Ux;
import a.l0;
import a.l1;
import a.lJ;
import a.lT;
import a.lU;
import a.lg;
import a.md;
import a.ms;
import a.mu;
import a.my;
import a.qG;
import a.qH;
import a.qI;
import a.qL;
import a.qb;
import a.qd;
import a.qm;
import a.qv;
import a.qy;
import a.v9;
import a.vL;
import a.vO;
import a.vP;
import a.vW;
import a.vX;
import a.vh;
import com.adapters.factory.DynamicTypeAdapterFactory;
import com.adapters.type.TypeAdapterRegistry;
import com.advanced.computation.ComplexComputationResolver;
import com.app.config.ConfigurationManager2637;
import com.app.data.streaming.StreamProcessingEngine2191;
import com.app.logging.core.LoggingContextManager2591;
import com.app.monitoring.metrics.MetricsCollectionAgent;
import com.app.network.NetworkConnectionResolver2638;
import com.app.performance.CacheOptimizer;
import com.app.plugin.core.PluginDiscoveryService;
import com.app.resource.management.ResourceLifecycleManager2594;
import com.app.scheduling.tasks.BackgroundTaskScheduler;
import com.app.security.AuthenticationValidator2640;
import com.app.streaming.StreamProcessingHandler2177;
import com.asset.management.AssetProcessingCoordinator;
import com.auth.token.TokenAuthenticationHandler;
import com.cache.distributed.DistributedCacheManager135;
import com.cluster.management.ClusterNodeRegistry;
import com.collections.management.MultiContainerRegistry;
import com.compression.adaptive.AdaptiveCompressionEngine;
import com.computation.rules.ComputationalRuleEngine;
import com.computation.transform.ComputationalTransformationUnit;
import com.concurrency.async.AsyncOperationMediator;
import com.concurrency.management.AsynchronousTaskCoordinator826;
import com.concurrency.scheduling.AsyncTaskScheduler;
import com.concurrency.sync.AsyncResourceSynchronizer;
import com.concurrent.resource.MultithreadedResourceOrchestrator;
import com.config.dynamic.DynamicConfigurationResolver;
import com.config.management.ConfigurationParameterManager;
import com.config.mapping.BooleanConfigurationMapper;
import com.config.mapping.ConfigParameterMapper;
import com.config.mapping.ConfigurationKeyMapper;
import com.config.resolution.ConfigurationContextResolver;
import com.context.mapping.AdaptiveContextMapper;
import com.core.computation.AbstractComputationKernel;
import com.crypto.adaptive.AdaptiveCryptoTransformer;
import com.crypto.broker.CryptoTransformationBroker;
import com.crypto.config.CipherConfigurationManager;
import com.crypto.dynamic.DynamicCryptoParameterResolver;
import com.crypto.key.CipherKeyExchangeManager;
import com.crypto.keygen.CipherKeyGenerator;
import com.crypto.negotiation.CryptoParameterNegotiator590;
import com.crypto.protocol.CryptoProtocolEngine;
import com.crypto.resource.CryptoResourceAllocator;
import com.crypto.signature.CryptoSignatureManager;
import com.crypto.token.CryptoTokenExchangeManager;
import com.crypto.transform.CipherTransformationManager;
import com.crypto.transformation.CryptoTransformationEngine;
import com.crypto.transformer.CipherTransformationHandler;
import com.data.brokerage.ContextualDataBroker;
import com.data.compression.CompressionAlgorithmManager;
import com.data.conversion.TypeConversionHandler;
import com.data.conversion.TypeConversionOrchestrator;
import com.data.conversion.TypeConversionOrchestrator399;
import com.data.encoding.DataEncodingTranslator;
import com.data.encoding.EncodingTransformationService;
import com.data.enhancement.EnhancedTransformationProcessor;
import com.data.integrity.DataIntegrityGuardian;
import com.data.orchestration.DataTransformationOrchestrator801;
import com.data.orchestration.MultiChannelDataOrchestrator;
import com.data.parsing.MultiFormatDecoder;
import com.data.pipeline.TransformationPipelineManager;
import com.data.pipeline.TransformationPipelineManager616;
import com.data.processing.DataTransformationEngine408;
import com.data.processing.ResourceTransformationProcessor;
import com.data.reconstruction.DataReconstructionEngine;
import com.data.streaming.DataStreamProcessor;
import com.data.streaming.StreamProcessingCoordinator;
import com.data.synchronization.TransactionalDataSynchronizer;
import com.data.transform.DataTransformationEngine550;
import com.data.transform.DataTransformationProtocol;
import com.data.transformation.ContextualTransformationEngine;
import com.data.transformation.DataTranscodingResolver;
import com.data.transformation.DataTransformationBroker;
import com.data.transformation.DataTransformationEngine;
import com.data.transformation.DataTransformationEngine398;
import com.data.transformation.DataTransformationEngine679;
import com.data.transformation.DataTransformationOrchestrator;
import com.data.transformation.ResourceTransformationEngine;
import com.data.transformation.TransformationBroker;
import com.data.transformation.TransformationOrchestrator;
import com.data.validation.DataValidationOrchestrator;
import com.data.validation.IntegratedDataValidator;
import com.datamanagement.broker.ContextualDataBroker653;
import com.dataprocessing.mapping.TypeMappingCoordinator664;
import com.dataprocessing.resolution.DynamicTypeResolver;
import com.dataprocessing.transformation.GeneralTransformationHandler;
import com.dataprocessing.transformation.TypeConversionOrchestrator649;
import com.distributed.cluster.ClusterNodeOrchestrator;
import com.distributed.compute.DistributedComputationOrchestrator;
import com.distributed.resource.DistributedResourceMediator;
import com.encoding.protocol.EncodingProtocolManager;
import com.encoding.transformation.EncodingContextTransformer;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.identity.token.IdentityTokenGenerator;
import com.integration.adaptation.InterfaceAdaptationManager;
import com.integration.core.SystemIntegrationMediator;
import com.integration.interop.CrossPlatformInteroperabilityManager;
import com.integration.transformation.InteroperabilityTransformer;
import com.invocation.resolution.InvocationParameterResolver;
import com.mapping.dynamic.DynamicObjectMapper;
import com.mapping.resolution.DynamicMappingResolver;
import com.math.geometry.GeometryCalculator;
import com.messaging.secure.SecureMessageBroker;
import com.messaging.secure.SecureMessageDispatcher;
import com.metadata.extraction.MetadataExtractionService;
import com.metadata.mapping.ObjectMetadataMapper;
import com.metadata.reflection.ReflectionContextResolver;
import com.metadata.resolution.MetadataReflectionResolver;
import com.metrics.processing.MetricTransformationEngine;
import com.multimedia.codec.MultimediaCodecOrchestrator;
import com.network.auth.NetworkCredentialEncoder;
import com.network.config.ProtocolConfigurationManager;
import com.network.configuration.NetworkConfigurationManager2597;
import com.network.connection.NetworkConnectionManager2147;
import com.network.messaging.NetworkMessageBroker;
import com.network.negotiation.AdaptiveProtocolNegotiator;
import com.network.negotiation.SecureContextNegotiator531;
import com.network.protocol.CommunicationProtocolAdapter;
import com.network.protocol.GenericProtocolMapper;
import com.network.protocol.NetworkProtocolEncoder;
import com.network.protocol.NetworkProtocolEncoder553;
import com.network.protocol.NetworkProtocolTranslator;
import com.network.protocol.ProtocolEncoder;
import com.network.protocol.ProtocolMessageHandler;
import com.network.secure.SecureCommunicationBridge;
import com.network.security.NetworkSecurityTokenGenerator;
import com.network.security.NetworkSecurityValidator;
import com.network.security.SecureChannelNegotiator762;
import com.network.security.SecureChannelnegotiator;
import com.network.security.SecureDataExchangeProtocol;
import com.network.security.SecureTransmissionController;
import com.network.transmission.SecureDataTransmissionHandler;
import com.persistence.context.PersistenceContextManager;
import com.protocol.encoding.EncodingProtocolResolver;
import com.protocol.exception.ProtocolExceptionHandler;
import com.reflection.core.ReflectiveIntrospectionEngine603;
import com.reflection.dynamic.DynamicInvocationResolver;
import com.reflection.dynamic.ReflectiveInvocationBroker;
import com.reflection.dynamic.ReflectiveMethodInvoker522;
import com.reflection.handler.MethodIntrospectionHandler;
import com.reflection.introspection.MethodParameterInterceptor;
import com.reflection.invocation.DynamicMethodInvoker587;
import com.reflection.invocation.ReflectiveMethodInvoker1036;
import com.reflection.mediation.DynamicReferenceMediator;
import com.reflection.meta.MetaInformationResolver;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.proxy.ReflectionProxyManager;
import com.reflection.resolution.DynamicMethodResolver;
import com.resource.allocation.CompositeResourceAllocator;
import com.resource.lifecycle.ResourceLifecycleManager315;
import com.resource.lifecycle.ResourceLifecycleManager693;
import com.resource.management.ResourceAllocationController556;
import com.resource.management.ResourceAllocationCoordinator;
import com.resource.management.ResourceMappingController;
import com.resource.tracking.AssetRegistrationManager;
import com.routing.interceptor.InterceptorRoutingEngine;
import com.runtime.config.RuntimeConfigurationManager;
import com.runtime.configuration.RuntimeConfigurationAdapter;
import com.runtime.configuration.RuntimeConfigurationResolver811;
import com.runtime.context.ContextualRuntimeMediator;
import com.runtime.conversion.TypeConversionOrchestrator439;
import com.runtime.conversion.TypeConvertor;
import com.runtime.flagmanagement.RuntimeFlagOrchestrator;
import com.runtime.interception.RuntimeParameterInterceptor;
import com.runtime.interceptor.ContextualDataInterceptor;
import com.runtime.interceptor.ParameterInterceptor;
import com.runtime.introspection.ReflectionResolver;
import com.runtime.invocation.DynamicMethodInvoker;
import com.runtime.invocation.InvocationContextResolver;
import com.runtime.management.RuntimeContextManager;
import com.runtime.metadata.DynamicClassInspector;
import com.runtime.metadata.MetadataResolver;
import com.runtime.normalization.RuntimeContextNormalizer;
import com.runtime.reflection.ReflectionParameterResolver;
import com.runtime.resolution.DynamicClassResolver;
import com.runtime.typesystem.ParametricTypeInspector;
import com.secure.transformation.SecureDataTransformer538;
import com.security.auth.AuthenticationContextProvider;
import com.security.auth.AuthenticationTokenManager463;
import com.security.authentication.AuthenticationTokenGenerator2599;
import com.security.cipher.CipherConfigurationResolver;
import com.security.cipher.CipherContextManager551;
import com.security.cipher.CipherContextManager636;
import com.security.cipher.CipherKeyManager;
import com.security.cipher.CipherTransformationEngine569;
import com.security.cipher.CipherTransformationHandler599;
import com.security.cipher.CipherTransformationHandler897;
import com.security.codec.CryptographicTransformer476;
import com.security.communication.SecureCommunicationOrchestrator;
import com.security.compliance.SecurityComplianceValidator;
import com.security.config.SecureConfigurationManager;
import com.security.configuration.CipherConfigurationManager525;
import com.security.configuration.CryptoConfigManager;
import com.security.context.CipherContextManager489;
import com.security.context.CryptoContextBroker;
import com.security.context.CryptoContextManager842;
import com.security.context.CryptographicContextManager316;
import com.security.context.EncryptionContextProvider;
import com.security.context.SecureContextBroker;
import com.security.context.SecureContextBroker459;
import com.security.context.SecureContextBroker638;
import com.security.context.SecureContextNegotiator475;
import com.security.crypto.CipherProcessor;
import com.security.crypto.CryptoContextResolver;
import com.security.crypto.CryptoKeyExchanger;
import com.security.crypto.CryptoKeyGenerator;
import com.security.crypto.CryptoOperationMediator;
import com.security.crypto.CryptoSecurityManager;
import com.security.crypto.CryptoSecurityManager907;
import com.security.crypto.CryptoTransformationManager647;
import com.security.crypto.CryptographicKeyManager;
import com.security.crypto.CryptographicKeyResolver630;
import com.security.crypto.CryptographicParameterOrchestrator;
import com.security.crypto.CryptographicTokenManager;
import com.security.crypto.CryptographicTransformationManager;
import com.security.data.SecureDataTransformer273;
import com.security.decrypt.SecureDecryptionHandler;
import com.security.decryption.MultiProtocolDecryptionEngine;
import com.security.dispatch.CryptoOperationDispatcher;
import com.security.documents.DocumentEncryptionProcessor;
import com.security.encryption.CipherKeyGenerator518;
import com.security.encryption.CryptographicSecurityManager547;
import com.security.encryption.CryptographicStateManager;
import com.security.encryption.EncryptionContextBuilder;
import com.security.encryption.SecureDataEncryptionManager;
import com.security.encryption.SecureDataEncryptor;
import com.security.exchange.SecureDataExchanger;
import com.security.extraction.CryptographicMetadataExtractor;
import com.security.identification.SecureIdentificationResolver;
import com.security.integrity.DataIntegrityGuardian887;
import com.security.key.CipherKeyExchanger;
import com.security.key.CryptographicKeyManager131;
import com.security.keyexchange.CryptoKeyExchangeManager;
import com.security.keymanagement.CryptoKeyRotationManager794;
import com.security.keys.CryptographicKeyManager2632;
import com.security.mediation.SecureDataMediator;
import com.security.multistage.MultiStageEncryptionOrchestrator;
import com.security.negotiation.CryptoContextNegotiator562;
import com.security.negotiation.CryptoContextNegotiator595;
import com.security.negotiation.CryptoParameterNegotiator;
import com.security.negotiation.CryptoParameterNegotiator639;
import com.security.negotiation.SecureContextNegotiator852;
import com.security.obfuscation.ObfuscationUtility;
import com.security.obfuscation.SecureDataObfuscator;
import com.security.orchestration.SecureDataOrchestrator;
import com.security.policy.PolicyConfigurationManager;
import com.security.processing.SecureDataProcessor;
import com.security.provision.CryptoProvisioningService;
import com.security.registry.SecureParameterRegistry;
import com.security.resolution.CryptoOperationResolver;
import com.security.resource.SecureResourceManager;
import com.security.rotation.SecureContextRotator;
import com.security.session.CryptoSessionManager;
import com.security.session.CryptoSessionManager320;
import com.security.session.CryptoSessionManager627;
import com.security.session.CryptoSessionNegotiator;
import com.security.session.CryptographicSessionManager336;
import com.security.session.CryptographicSessionManager446;
import com.security.token.CryptographicTokenGenerator956;
import com.security.token.SecureTokenGenerator;
import com.security.token.SecureTokenGenerator839;
import com.security.token.TokenLifecycleController;
import com.security.tokens.SecureTokenLifecycleManager;
import com.security.transaction.SecureTransactionBroker;
import com.security.transform.CryptoTransformationEngine786;
import com.security.transform.SecureDataTransformer601;
import com.security.transformation.CryptographicTransformer745;
import com.security.validation.SecureTokenValidator;
import com.state.management.StateTransitionManager2094;
import com.stream.transformation.StreamTransformationService;
import com.system.config.RuntimeConfigurationResolver;
import com.system.configuration.AdaptiveConfigurationResolver;
import com.system.configuration.ConfigurationManager;
import com.system.dispatch.DynamicResourceDispatcher;
import com.system.monitoring.SystemResourceMonitor;
import com.system.resilience.ResilencyCoordinator;
import com.system.resource.ResourceAllocationController;
import com.system.resource.ResourceAllocationManager460;
import com.system.resource.SystemResourceMediator;
import com.system.resource.SystemResourceOrchestrator;
import com.system.resources.ResourceAllocationTracker820;
import com.system.resources.SystemResourceNegotiator;
import com.system.state.SystemStateReconciler;
import com.temporal.metadata.TemporalMetadataResolver;
import com.text.transformation.StringTransformationEngine;
import com.transaction.management.TransactionCoordinator;
import com.transaction.management.TransactionalStateManager;
import com.transaction.processing.TransactionSequencer;
import com.transaction.resources.TransactionalResourceAllocator;
import com.transaction.security.SecureTransactionHandler;
import com.transaction.security.TransactionSecurityOrchestrator;
import com.transaction.security.TransactionSecurityValidator;
import com.transformation.coordination.TypeConversionCoordinator;
import com.transformation.type.TypeConversionOrchestrator579;
import com.type.conversion.TypeConversionMediator;
import com.type.conversion.TypeConversionOrchestrator768;
import com.type.mapping.TypeMappingCoordinator;
import com.type.mapping.TypeMappingMediator;
import com.type.normalization.ParameterTypeNormalizer;
import com.type.registry.DynamicTypeRegistry;
import com.util.conversion.TypeConversionUtility;
import com.utils.reflection.ReflectionUtilityManager;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class CryptographicContextManager {
    public InvocationContextResolver LH;
    public TransformationPipelineManager616 dT;
    public PJ k_;
    public TransactionSequencer gA;
    public StateTransitionManager2094 LR;
    public CipherTransformationManager kn;
    public TypeConversionCoordinator k3;
    public TypeConversionMediator dI;
    public DataTranscodingResolver Gj;
    public SecureDataObfuscator C;
    public CryptoContextResolver g;
    public CipherKeyManager Lz;
    public MultimediaCodecOrchestrator GJ;
    public mu dA;
    public AdaptiveContextMapper dg;
    public CipherContextManager551 kS;
    public DynamicMethodInvoker587 d;
    public DataTransformationBroker Li;
    public CacheOptimizer gP;
    public NetworkMessageBroker kH;
    public CipherConfigurationResolver dp;
    public ProtocolConfigurationManager gM;
    public SecureContextRotator P;
    public CryptoOperationResolver ki;
    public TypeConversionOrchestrator649 LZ;
    public TransactionSecurityOrchestrator Lj;
    public TransformationBroker gK;
    public InterfaceAdaptationManager Lw;
    public CryptographicContextManager316 kA;
    public RuntimeContextManager l;
    public InvocationParameterResolver dh;
    public DataValidationOrchestrator LC;
    public ObjectMetadataMapper kZ;
    public InterceptorRoutingEngine G3;
    public DataTransformationEngine398 g6;
    public DynamicObjectMapper L8;
    public TypeConversionOrchestrator768 Go;
    public ResourceLifecycleManager693 x;
    public DynamicResourceDispatcher kg;
    public CryptoTransformationBroker J;
    public Uf Q;
    public v9 LM;
    public CipherConfigurationManager Lp;
    public SecureTokenGenerator gi;
    public TypeConversionHandler Lt;
    public static List<CryptoProtocolEngine> k8;
    public EncodingTransformationService GD;
    public ResourceMappingController da;
    public CryptographicMetadataExtractor kG;
    public ConfigurationParameterManager kI;
    public ContextualDataBroker ku;
    public lg T;
    public MultithreadedResourceOrchestrator dy;
    public CipherTransformationHandler L2;
    public TokenAuthenticationHandler d6;
    public RuntimeConfigurationResolver811 GE;
    public StreamTransformationService LU;
    public ResourceAllocationController556 kh;
    public qy G1;
    public lU GX;
    public CryptographicStateManager LE;
    public ResourceAllocationCoordinator Gb;
    public ReflectiveMethodInvoker522 Gf;
    public SecureDataTransformer273 Ll;
    public TypeConversionOrchestrator399 dl;
    public MetricsCollectionAgent dd;
    public DynamicMethodInvoker L9;
    public UI LF;
    public TransformationPipelineManager K;
    public qL dw;
    public UZ Lr;
    public TransactionCoordinator L4;
    public CryptoConfigManager dC;
    public TypeMappingCoordinator km;
    public StreamProcessingHandler2177 kT;
    public ResourceAllocationTracker820 kN;
    public SecureDataProcessor Gx;
    public ConfigurationManager2637 Gq;
    public P6 k7;
    public TypeConvertor LN;
    public SecureTransmissionController GI;
    public U2 i;
    public AdaptiveConfigurationResolver Gz;
    public CipherTransformationHandler599 k5;
    public PN GA;
    public ContextualTransformationEngine Ln;
    public AsynchronousTaskCoordinator826 Lu;
    public qd kw;
    public MetadataReflectionResolver dr;
    public CipherKeyExchanger GH;
    public UU L;
    public CryptoContextBroker LP;
    public SecureDataExchangeProtocol kq;
    public CryptoTransformationEngine786 kY;
    public NetworkConfigurationManager2597 u;
    public MultiProtocolDecryptionEngine GN;
    public PolicyConfigurationManager h;
    public qI G8;
    public MetadataResolver Lb;
    public AsyncResourceSynchronizer Lq;
    public CryptoKeyRotationManager794 LQ;
    public ComplexComputationResolver kx;
    public CryptographicSessionManager446 gY;
    public DataIntegrityGuardian887 Lf;
    public MetaInformationResolver G2;
    public DataTransformationOrchestrator801 kf;
    public vh gg;
    public SecureDataTransformer538 kt;
    public ObfuscationUtility D;
    public CryptographicTransformer476 gq;
    public ProtocolMessageHandler Gn;
    public SecureTransactionHandler c;
    public SecureDataMediator LI;
    public AdaptiveCompressionEngine g9;
    public ConfigurationKeyMapper kB;
    public DynamicMappingResolver Z;
    public UB g1;
    public SecureResourceManager GT;
    public DynamicReferenceMediator LS;
    public SecureChannelnegotiator L_;
    public MultiChannelDataOrchestrator I;
    public NetworkConnectionManager2147 de;
    public SecureChannelNegotiator762 dU;
    public ReflectionContextResolver du;
    public CryptographicSecurityManager547 LD;
    public SecureTransactionBroker gh;
    public ReflectionResolver dQ;
    public CryptoOperationDispatcher ky;
    public StringTransformationEngine gB;
    public CryptographicKeyManager2632 LG;
    public ConfigurationContextResolver gD;
    public CryptoSessionNegotiator q;
    public CryptoResourceAllocator L0;
    public RuntimeConfigurationManager R;
    public DataTransformationProtocol y;
    public CrossPlatformInteroperabilityManager w;
    public NetworkSecurityTokenGenerator k2;
    public CryptographicTransformer745 Ld;
    public CryptographicKeyManager GO;
    public AuthenticationTokenManager463 L3;
    public ResourceAllocationManager460 LV;
    public ContextualRuntimeMediator kU;
    public vW gQ;
    public AuthenticationTokenGenerator2599 gI;
    public NetworkCredentialEncoder gb;
    public TokenLifecycleController dm;
    public DynamicClassInspector V;
    public ConfigParameterMapper d8;
    public CryptoKeyGenerator v;
    public PU LL;
    public AdaptiveCryptoTransformer dE;
    public EncodingContextTransformer dY;
    public BackgroundTaskScheduler kl;
    public DynamicMethodResolver GL;
    public SecureTokenLifecycleManager LW;
    public P_ ke;
    public CryptoSessionManager627 dJ;
    public SystemResourceOrchestrator k6;
    public CryptoOperationMediator Gs;
    public PluginDiscoveryService Gp;
    public AsyncOperationMediator G;
    public DynamicCryptoParameterResolver di;
    public l0 LO;
    public TypeConversionOrchestrator439 LA;
    public ResourceTransformationProcessor gL;
    public Pi g0;
    public DataTransformationEngine408 gd;
    public PS k9;
    public TypeConversionUtility Gi;
    public CryptoSecurityManager ge;
    public TypeConversionOrchestrator kJ;
    public Uu gC;
    public MethodParameterInterceptor S;
    public U5 dH;
    private static int[] Gc;
    public AsyncTaskScheduler gS;
    public SecureConfigurationManager dz;
    public EncodingProtocolResolver Gd;
    public EncodingProtocolManager kp;
    public SecureDataTransformer601 Ly;
    public CryptoParameterNegotiator590 O;
    public SecureMessageBroker dc;
    public TransformationOrchestrator GV;
    public ResilencyCoordinator Gw;
    public CryptographicSessionManager336 G6;
    public lJ kz;
    public TypeConversionOrchestrator579 GZ;
    public qH GQ;
    public SecureDataEncryptor gG;
    public CryptoContextNegotiator562 dk;
    public GenericProtocolMapper g3;
    public DataStreamProcessor a;
    public CryptoContextNegotiator595 G_;
    public vX dM;
    public SystemResourceNegotiator G4;
    public SecureDataEncryptionManager Lc;
    public CryptoKeyExchangeManager Lm;
    public Um kO;
    public md d3;
    public ContextualDataInterceptor GR;
    public AssetProcessingCoordinator M;
    public StreamProcessingEngine2191 LJ;
    public Ux dK;
    public SecureCommunicationBridge GY;
    public qb kE;
    public SecureIdentificationResolver L1;
    public CipherContextManager489 dn;
    public InteroperabilityTransformer GG;
    public TransactionSecurityValidator X;
    public DataTransformationEngine Lk;
    public ComputationalTransformationUnit t;
    public SecureContextNegotiator852 L6;
    public DistributedComputationOrchestrator dq;
    public LoggingContextManager2591 dW;
    public CipherTransformationHandler897 W;
    public SecureContextBroker gH;
    public DataTransformationEngine550 Lh;
    public SecureCommunicationOrchestrator kL;
    public StreamProcessingCoordinator dD;
    public lT kQ;
    public MultiStageEncryptionOrchestrator LK;
    public qv k1;
    public CryptoParameterNegotiator639 dB;
    public CipherTransformationEngine569 kr;
    public SystemStateReconciler Gm;
    public TypeAdapterRegistry gn;
    public SecureParameterRegistry kV;
    public DynamicTypeRegistry Le;
    public SecureDataTransmissionHandler gk;
    public TransactionalStateManager ka;
    public Pd dV;
    public RuntimeConfigurationAdapter df;
    public ProtocolEncoder G7;
    public ResourceLifecycleManager315 g8;
    public EncryptionContextBuilder dO;
    public SystemResourceMonitor n;
    public ReflectiveMethodInvoker1036 Gt;
    public DocumentEncryptionProcessor d5;
    public ParameterInterceptor B;
    public CompressionAlgorithmManager p;
    public CryptoContextManager842 U;
    public CipherKeyGenerator518 Lv;
    public PR N;
    public CryptoProvisioningService z;
    public Px G5;
    public SecureContextBroker459 H;
    public SecureTokenGenerator839 kC;
    public vO ds;
    public ReflectionParameterResolver dP;
    public CryptoSignatureManager kK;
    private static final long ab;
    public CryptoSessionManager F;
    public ReflectionUtilityManager gx;
    public CryptographicKeyManager131 d0;
    public CryptoTransformationEngine LY;
    public Pv Lx;
    public DataReconstructionEngine kk;
    public DataEncodingTranslator o;
    public ReflectiveInvocationBroker d4;
    public DataTransformationEngine679 gf;
    public SecureMessageDispatcher dR;
    public CryptographicTokenManager Lo;
    public AuthenticationContextProvider m;
    public EncryptionContextProvider GC;
    public AdaptiveProtocolNegotiator GS;
    public qm kD;
    public NetworkProtocolEncoder553 kP;
    public CipherKeyGenerator db;
    public TransactionalDataSynchronizer dx;
    public CryptographicTokenGenerator956 dF;
    public MetricTransformationEngine f;
    public TypeMappingMediator s;
    public CommunicationProtocolAdapter GW;
    public DynamicConfigurationResolver Gk;
    public my Ge;
    public DistributedResourceMediator Gr;
    public l1 gl;
    public CryptographicKeyResolver630 k;
    public NetworkProtocolTranslator Ls;
    public SecureDataExchanger Gv;
    public CryptoParameterNegotiator ko;
    public ProtocolExceptionHandler k0;
    public NetworkProtocolEncoder gw;
    public ResourceLifecycleManager2594 LX;
    public CryptoTokenExchangeManager L5;
    public RuntimeContextNormalizer Gl;
    public CipherProcessor ks;
    public ParameterTypeNormalizer dL;
    public ClusterNodeRegistry Gy;
    public vL Lg;
    public CryptoTransformationManager647 gW;
    public DataTransformationOrchestrator A;
    public MetadataExtractionService L7;
    public DynamicInvocationResolver E;
    public CipherKeyExchangeManager kW;
    public Pz kX;
    public CryptographicParameterOrchestrator j;
    public PersistenceContextManager GF;
    public NetworkConnectionResolver2638 Ga;
    public CryptoSecurityManager907 gp;
    public MethodIntrospectionHandler dG;
    public IdentityTokenGenerator gs;
    public SecureContextNegotiator475 gt;
    public EnhancedTransformationProcessor b;
    public SecurityComplianceValidator GM;
    public Uq dN;
    public MultiFormatDecoder kF;
    public RuntimeFlagOrchestrator kR;
    public NetworkSecurityValidator kd;
    public SecureDataOrchestrator gU;
    public BooleanConfigurationMapper gc;
    public ContextualDataBroker653 dX;
    public ResourceTransformationEngine GB;
    public SystemResourceMediator dv;
    public ms dZ;
    public qG G9;
    public Ui kj;
    public CipherContextManager636 LT;
    public CryptoSessionManager320 gy;
    public ClusterNodeOrchestrator g7;
    public TransactionalResourceAllocator GP;
    public IntegratedDataValidator LB;
    public RuntimeConfigurationResolver kv;
    public SecureContextBroker638 Gu;
    public ParametricTypeInspector d2;
    public DynamicTypeAdapterFactory G0;
    public RuntimeParameterInterceptor d_;
    public SecureTokenValidator La;
    public TypeMappingCoordinator664 Gg;
    public SecureDecryptionHandler r;
    public AuthenticationValidator2640 kb;
    public DynamicTypeResolver gF;
    public DynamicClassResolver GK;
    public CryptoKeyExchanger dj;
    public vP d7;
    public SystemIntegrationMediator Y;
    public DistributedCacheManager135 dS;
    public ReflectiveIntrospectionEngine603 gj;
    public CipherConfigurationManager525 dt;
    public DataIntegrityGuardian Gh;
    public ResourceAllocationController d9;
    public CompositeResourceAllocator k4;
    public AssetRegistrationManager gN;
    public GeneralTransformationHandler kM;
    public ReflectionProxyManager GU;
    public SecureContextNegotiator531 kc;
    public CryptographicTransformationManager d1;
    public ComputationalRuleEngine e;

    static {
        ab = MultiContainerRegistry.a(6206944253927541469L, -950227367862985254L, MethodHandles.lookup().lookupClass()).a(272661770760905L);
        k8 = new ArrayList<CryptoProtocolEngine>();
        CryptographicContextManager.G(new int[3]);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Unable to fully structure code
     */
    public void E() {
        block180: {
            block181: {
                block178: {
                    block179: {
                        block177: {
                            block174: {
                                block175: {
                                    block170: {
                                        block171: {
                                            block172: {
                                                block173: {
                                                    block169: {
                                                        block168: {
                                                            block166: {
                                                                block167: {
                                                                    block165: {
                                                                        block161: {
                                                                            block162: {
                                                                                block163: {
                                                                                    block164: {
                                                                                        block158: {
                                                                                            block159: {
                                                                                                block160: {
                                                                                                    block154: {
                                                                                                        block157: {
                                                                                                            block155: {
                                                                                                                block156: {
                                                                                                                    block153: {
                                                                                                                        block150: {
                                                                                                                            block151: {
                                                                                                                                block149: {
                                                                                                                                    block145: {
                                                                                                                                        block148: {
                                                                                                                                            block146: {
                                                                                                                                                block147: {
                                                                                                                                                    block144: {
                                                                                                                                                        block142: {
                                                                                                                                                            block143: {
                                                                                                                                                                block140: {
                                                                                                                                                                    block141: {
                                                                                                                                                                        block182: {
                                                                                                                                                                            block139: {
                                                                                                                                                                                block137: {
                                                                                                                                                                                    block138: {
                                                                                                                                                                                        block136: {
                                                                                                                                                                                            block135: {
                                                                                                                                                                                                block133: {
                                                                                                                                                                                                    block134: {
                                                                                                                                                                                                        var1_1 = CryptographicContextManager.ab ^ 115833334581846L;
                                                                                                                                                                                                        var3_2 = CryptographicContextManager.X();
                                                                                                                                                                                                        try {
                                                                                                                                                                                                            try {
                                                                                                                                                                                                                try {
                                                                                                                                                                                                                    try {
                                                                                                                                                                                                                        v0 = TemporalMetadataResolver.h.r();
                                                                                                                                                                                                                        if (var3_2 == null) break block133;
                                                                                                                                                                                                                        if (v0 != 0) break block134;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    catch (CustomSystemException v1) {
                                                                                                                                                                                                                        throw CryptographicContextManager.a(v1);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    this.dO = new EncryptionContextBuilder();
                                                                                                                                                                                                                    v0 = GeometryCalculator.C();
                                                                                                                                                                                                                    v2 = 13;
                                                                                                                                                                                                                    if (var3_2 == null) break block135;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                catch (CustomSystemException v3) {
                                                                                                                                                                                                                    throw CryptographicContextManager.a(v3);
                                                                                                                                                                                                                }
                                                                                                                                                                                                                if (v0 != v2) break block134;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            catch (CustomSystemException v4) {
                                                                                                                                                                                                                throw CryptographicContextManager.a(v4);
                                                                                                                                                                                                            }
                                                                                                                                                                                                            this.S = new MethodParameterInterceptor();
                                                                                                                                                                                                            this.kg = new DynamicResourceDispatcher();
                                                                                                                                                                                                        }
                                                                                                                                                                                                        catch (CustomSystemException v5) {
                                                                                                                                                                                                            throw CryptographicContextManager.a(v5);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                    this.p = new CompressionAlgorithmManager();
                                                                                                                                                                                                    this.dQ = new ReflectionResolver();
                                                                                                                                                                                                    this.LG = new CryptographicKeyManager2632();
                                                                                                                                                                                                    this.GW = new CommunicationProtocolAdapter();
                                                                                                                                                                                                    this.dl = new TypeConversionOrchestrator399();
                                                                                                                                                                                                    this.Z = new DynamicMappingResolver();
                                                                                                                                                                                                    this.G1 = new qy();
                                                                                                                                                                                                    this.ku = new ContextualDataBroker();
                                                                                                                                                                                                    this.L1 = new SecureIdentificationResolver();
                                                                                                                                                                                                    this.g1 = new UB();
                                                                                                                                                                                                    this.kU = new ContextualRuntimeMediator();
                                                                                                                                                                                                    this.gw = new NetworkProtocolEncoder();
                                                                                                                                                                                                    this.L7 = new MetadataExtractionService();
                                                                                                                                                                                                    this.da = new ResourceMappingController();
                                                                                                                                                                                                    this.di = new DynamicCryptoParameterResolver();
                                                                                                                                                                                                    this.T = new lg();
                                                                                                                                                                                                    this.d8 = new ConfigParameterMapper();
                                                                                                                                                                                                    this.k7 = new P6();
                                                                                                                                                                                                    this.k1 = new qv();
                                                                                                                                                                                                    this.GN = new MultiProtocolDecryptionEngine();
                                                                                                                                                                                                    this.GV = new TransformationOrchestrator();
                                                                                                                                                                                                    this.dV = new Pd();
                                                                                                                                                                                                    this.GT = new SecureResourceManager();
                                                                                                                                                                                                    this.H = new SecureContextBroker459();
                                                                                                                                                                                                    this.Ln = new ContextualTransformationEngine();
                                                                                                                                                                                                    this.Le = new DynamicTypeRegistry();
                                                                                                                                                                                                    this.l = new RuntimeContextManager();
                                                                                                                                                                                                    this.GU = new ReflectionProxyManager();
                                                                                                                                                                                                    this.Gu = new SecureContextBroker638();
                                                                                                                                                                                                    this.v = new CryptoKeyGenerator();
                                                                                                                                                                                                    this.Gb = new ResourceAllocationCoordinator();
                                                                                                                                                                                                    this.dS = new DistributedCacheManager135();
                                                                                                                                                                                                    this.dw = new qL();
                                                                                                                                                                                                    this.gF = new DynamicTypeResolver();
                                                                                                                                                                                                    this.dx = new TransactionalDataSynchronizer();
                                                                                                                                                                                                    this.kK = new CryptoSignatureManager();
                                                                                                                                                                                                    this.GK = new DynamicClassResolver();
                                                                                                                                                                                                    this.L4 = new TransactionCoordinator();
                                                                                                                                                                                                    this.gM = new ProtocolConfigurationManager();
                                                                                                                                                                                                    this.s = new TypeMappingMediator();
                                                                                                                                                                                                    this.dW = new LoggingContextManager2591();
                                                                                                                                                                                                    this.LE = new CryptographicStateManager();
                                                                                                                                                                                                    this.d4 = new ReflectiveInvocationBroker();
                                                                                                                                                                                                    this.o = new DataEncodingTranslator();
                                                                                                                                                                                                    this.a = new DataStreamProcessor();
                                                                                                                                                                                                    this.GL = new DynamicMethodResolver();
                                                                                                                                                                                                    this.gB = new StringTransformationEngine();
                                                                                                                                                                                                    this.R = new RuntimeConfigurationManager();
                                                                                                                                                                                                    v0 = GeometryCalculator.C();
                                                                                                                                                                                                }
                                                                                                                                                                                                try {
                                                                                                                                                                                                    if (var3_2 == null) break block136;
                                                                                                                                                                                                    v2 = 37;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (CustomSystemException v6) {
                                                                                                                                                                                                    throw CryptographicContextManager.a(v6);
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            try {
                                                                                                                                                                                                if (v0 < v2) {
                                                                                                                                                                                                    this.dB = new CryptoParameterNegotiator639();
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (CustomSystemException v7) {
                                                                                                                                                                                                throw CryptographicContextManager.a(v7);
                                                                                                                                                                                            }
                                                                                                                                                                                            this.Gk = new DynamicConfigurationResolver();
                                                                                                                                                                                            this.h = new PolicyConfigurationManager();
                                                                                                                                                                                            this.LB = new IntegratedDataValidator();
                                                                                                                                                                                            this.z = new CryptoProvisioningService();
                                                                                                                                                                                            this.Lh = new DataTransformationEngine550();
                                                                                                                                                                                            this.gI = new AuthenticationTokenGenerator2599();
                                                                                                                                                                                            this.kE = new qb();
                                                                                                                                                                                            this.e = new ComputationalRuleEngine();
                                                                                                                                                                                            this.du = new ReflectionContextResolver();
                                                                                                                                                                                            this.Ll = new SecureDataTransformer273();
                                                                                                                                                                                            this.LV = new ResourceAllocationManager460();
                                                                                                                                                                                            this.gK = new TransformationBroker();
                                                                                                                                                                                            this.LQ = new CryptoKeyRotationManager794();
                                                                                                                                                                                            this.j = new CryptographicParameterOrchestrator();
                                                                                                                                                                                            this.dN = new Uq();
                                                                                                                                                                                            this.gy = new CryptoSessionManager320();
                                                                                                                                                                                            this.LU = new StreamTransformationService();
                                                                                                                                                                                            this.x = new ResourceLifecycleManager693();
                                                                                                                                                                                            this.gY = new CryptographicSessionManager446();
                                                                                                                                                                                            this.d0 = new CryptographicKeyManager131();
                                                                                                                                                                                            this.Gl = new RuntimeContextNormalizer();
                                                                                                                                                                                            this.ko = new CryptoParameterNegotiator();
                                                                                                                                                                                            this.gg = new vh();
                                                                                                                                                                                            this.L9 = new DynamicMethodInvoker();
                                                                                                                                                                                            this.dy = new MultithreadedResourceOrchestrator();
                                                                                                                                                                                            this.LN = new TypeConvertor();
                                                                                                                                                                                            this.ke = new P_();
                                                                                                                                                                                            this.gD = new ConfigurationContextResolver();
                                                                                                                                                                                            v0 = (int)GameVersionEnumerator.MC_1_21_10.Q();
                                                                                                                                                                                        }
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                if (var3_2 == null) break block137;
                                                                                                                                                                                                if (v0 == 0) break block138;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (CustomSystemException v8) {
                                                                                                                                                                                                throw CryptographicContextManager.a(v8);
                                                                                                                                                                                            }
                                                                                                                                                                                            this.F = new CryptoSessionManager();
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (CustomSystemException v9) {
                                                                                                                                                                                            throw CryptographicContextManager.a(v9);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        this.Gs = new CryptoOperationMediator();
                                                                                                                                                                                        this.A = new DataTransformationOrchestrator();
                                                                                                                                                                                        this.Lm = new CryptoKeyExchangeManager();
                                                                                                                                                                                        this.g = new CryptoContextResolver();
                                                                                                                                                                                        this.dZ = new ms();
                                                                                                                                                                                        this.GB = new ResourceTransformationEngine();
                                                                                                                                                                                        this.LS = new DynamicReferenceMediator();
                                                                                                                                                                                        this.Lr = new UZ();
                                                                                                                                                                                        this.kH = new NetworkMessageBroker();
                                                                                                                                                                                        this.GR = new ContextualDataInterceptor();
                                                                                                                                                                                        this.kM = new GeneralTransformationHandler();
                                                                                                                                                                                        this.k_ = new PJ();
                                                                                                                                                                                        this.dv = new SystemResourceMediator();
                                                                                                                                                                                        this.Ls = new NetworkProtocolTranslator();
                                                                                                                                                                                        this.u = new NetworkConfigurationManager2597();
                                                                                                                                                                                        this.Gr = new DistributedResourceMediator();
                                                                                                                                                                                        this.dJ = new CryptoSessionManager627();
                                                                                                                                                                                        this.G = new AsyncOperationMediator();
                                                                                                                                                                                        this.GD = new EncodingTransformationService();
                                                                                                                                                                                        this.w = new CrossPlatformInteroperabilityManager();
                                                                                                                                                                                        this.L5 = new CryptoTokenExchangeManager();
                                                                                                                                                                                        this.GA = new PN();
                                                                                                                                                                                        this.L = new UU();
                                                                                                                                                                                        this.g6 = new DataTransformationEngine398();
                                                                                                                                                                                        this.LI = new SecureDataMediator();
                                                                                                                                                                                        this.N = new PR();
                                                                                                                                                                                        this.ks = new CipherProcessor();
                                                                                                                                                                                        this.M = new AssetProcessingCoordinator();
                                                                                                                                                                                        this.d9 = new ResourceAllocationController();
                                                                                                                                                                                        this.GF = new PersistenceContextManager();
                                                                                                                                                                                        this.gk = new SecureDataTransmissionHandler();
                                                                                                                                                                                        this.gL = new ResourceTransformationProcessor();
                                                                                                                                                                                        this.dY = new EncodingContextTransformer();
                                                                                                                                                                                        this.gW = new CryptoTransformationManager647();
                                                                                                                                                                                        this.kd = new NetworkSecurityValidator();
                                                                                                                                                                                        this.gN = new AssetRegistrationManager();
                                                                                                                                                                                        this.kO = new Um();
                                                                                                                                                                                        this.Go = new TypeConversionOrchestrator768();
                                                                                                                                                                                        this.Gq = new ConfigurationManager2637();
                                                                                                                                                                                        this.k0 = new ProtocolExceptionHandler();
                                                                                                                                                                                        this.dp = new CipherConfigurationResolver();
                                                                                                                                                                                        this.LR = new StateTransitionManager2094();
                                                                                                                                                                                        this.Gf = new ReflectiveMethodInvoker522();
                                                                                                                                                                                        this.Lc = new SecureDataEncryptionManager();
                                                                                                                                                                                        this.g0 = new Pi();
                                                                                                                                                                                        this.Lb = new MetadataResolver();
                                                                                                                                                                                        this.L2 = new CipherTransformationHandler();
                                                                                                                                                                                        this.K = new TransformationPipelineManager();
                                                                                                                                                                                        this.G3 = new InterceptorRoutingEngine();
                                                                                                                                                                                        this.kS = new CipherContextManager551();
                                                                                                                                                                                        this.k5 = new CipherTransformationHandler599();
                                                                                                                                                                                        this.LF = new UI();
                                                                                                                                                                                        this.G0 = new DynamicTypeAdapterFactory();
                                                                                                                                                                                        this.I = new MultiChannelDataOrchestrator();
                                                                                                                                                                                        this.gU = new SecureDataOrchestrator();
                                                                                                                                                                                        this.kL = new SecureCommunicationOrchestrator();
                                                                                                                                                                                        this.GY = new SecureCommunicationBridge();
                                                                                                                                                                                        this.LZ = new TypeConversionOrchestrator649();
                                                                                                                                                                                        this.kn = new CipherTransformationManager();
                                                                                                                                                                                        this.d3 = new md();
                                                                                                                                                                                        this.gd = new DataTransformationEngine408();
                                                                                                                                                                                        this.Gj = new DataTranscodingResolver();
                                                                                                                                                                                        v10 = this;
                                                                                                                                                                                        if (var3_2 == null) break block139;
                                                                                                                                                                                        v10.gS = new AsyncTaskScheduler();
                                                                                                                                                                                        v0 = (int)ConfigurationManager.p();
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (CustomSystemException v11) {
                                                                                                                                                                                        throw CryptographicContextManager.a(v11);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                if (v0 == 0) break block182;
                                                                                                                                                                                v10 = this;
                                                                                                                                                                            }
                                                                                                                                                                            v10.GP = new TransactionalResourceAllocator();
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                v12 = ReflectionMetadataResolver.b8;
                                                                                                                                                                                if (var3_2 == null) break block140;
                                                                                                                                                                                if (v12 == null) break block141;
                                                                                                                                                                            }
                                                                                                                                                                            catch (CustomSystemException v13) {
                                                                                                                                                                                throw CryptographicContextManager.a(v13);
                                                                                                                                                                            }
                                                                                                                                                                            this.d7 = new vP();
                                                                                                                                                                        }
                                                                                                                                                                        catch (CustomSystemException v14) {
                                                                                                                                                                            throw CryptographicContextManager.a(v14);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    v12 = ReflectionMetadataResolver.bM;
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        if (var3_2 == null) break block142;
                                                                                                                                                                        if (v12 == null) break block143;
                                                                                                                                                                    }
                                                                                                                                                                    catch (CustomSystemException v15) {
                                                                                                                                                                        throw CryptographicContextManager.a(v15);
                                                                                                                                                                    }
                                                                                                                                                                    this.gf = new DataTransformationEngine679();
                                                                                                                                                                    TemporalMetadataResolver.J = true;
                                                                                                                                                                }
                                                                                                                                                                catch (CustomSystemException v16) {
                                                                                                                                                                    throw CryptographicContextManager.a(v16);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            v12 = ReflectionMetadataResolver.Yc;
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            if (v12 != null) {
                                                                                                                                                                this.g3 = new GenericProtocolMapper();
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        catch (CustomSystemException v17) {
                                                                                                                                                            throw CryptographicContextManager.a(v17);
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                v18 = GeometryCalculator.C();
                                                                                                                                                                if (var3_2 == null) break block144;
                                                                                                                                                                if (v18 <= 13) break block145;
                                                                                                                                                            }
                                                                                                                                                            catch (CustomSystemException v19) {
                                                                                                                                                                throw CryptographicContextManager.a(v19);
                                                                                                                                                            }
                                                                                                                                                            this.LY = new CryptoTransformationEngine();
                                                                                                                                                            this.dR = new SecureMessageDispatcher();
                                                                                                                                                            v18 = (int)GameVersionEnumerator.MC_1_21_6.Q();
                                                                                                                                                        }
                                                                                                                                                        catch (CustomSystemException v20) {
                                                                                                                                                            throw CryptographicContextManager.a(v20);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            if (var3_2 == null) break block146;
                                                                                                                                                            if (v18 == 0) break block147;
                                                                                                                                                        }
                                                                                                                                                        catch (CustomSystemException v21) {
                                                                                                                                                            throw CryptographicContextManager.a(v21);
                                                                                                                                                        }
                                                                                                                                                        this.dX = new ContextualDataBroker653();
                                                                                                                                                    }
                                                                                                                                                    catch (CustomSystemException v22) {
                                                                                                                                                        throw CryptographicContextManager.a(v22);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    this.kA = new CryptographicContextManager316();
                                                                                                                                                    this.dM = new vX();
                                                                                                                                                    this.G6 = new CryptographicSessionManager336();
                                                                                                                                                    this.G7 = new ProtocolEncoder();
                                                                                                                                                    this.Gy = new ClusterNodeRegistry();
                                                                                                                                                    this.Lw = new InterfaceAdaptationManager();
                                                                                                                                                    this.L8 = new DynamicObjectMapper();
                                                                                                                                                    this.G2 = new MetaInformationResolver();
                                                                                                                                                    this.gx = new ReflectionUtilityManager();
                                                                                                                                                    this.G9 = new qG();
                                                                                                                                                    this.y = new DataTransformationProtocol();
                                                                                                                                                    this.gP = new CacheOptimizer();
                                                                                                                                                    this.g7 = new ClusterNodeOrchestrator();
                                                                                                                                                    this.dE = new AdaptiveCryptoTransformer();
                                                                                                                                                    this.Gv = new SecureDataExchanger();
                                                                                                                                                    this.d9 = new ResourceAllocationController();
                                                                                                                                                    this.B = new ParameterInterceptor();
                                                                                                                                                    this.Gv = new SecureDataExchanger();
                                                                                                                                                    this.D = new ObfuscationUtility();
                                                                                                                                                    this.dT = new TransformationPipelineManager616();
                                                                                                                                                    this.GQ = new qH();
                                                                                                                                                    this.k3 = new TypeConversionCoordinator();
                                                                                                                                                    this.kD = new qm();
                                                                                                                                                    if (var3_2 == null) break block148;
                                                                                                                                                    v18 = GameVersionEnumerator.u();
                                                                                                                                                }
                                                                                                                                                catch (CustomSystemException v23) {
                                                                                                                                                    throw CryptographicContextManager.a(v23);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                if (v18 <= GameVersionEnumerator.MC_1_8_9.B()) {
                                                                                                                                                    this.GH = new CipherKeyExchanger();
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            catch (CustomSystemException v24) {
                                                                                                                                                throw CryptographicContextManager.a(v24);
                                                                                                                                            }
                                                                                                                                            this.kv = new RuntimeConfigurationResolver();
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (var3_2 != null) break block149;
                                                                                                                                            AbstractComputationKernel.I(new String[5]);
                                                                                                                                        }
                                                                                                                                        catch (CustomSystemException v25) {
                                                                                                                                            throw CryptographicContextManager.a(v25);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    this.kB = new ConfigurationKeyMapper();
                                                                                                                                    this.kx = new ComplexComputationResolver();
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        v26 = GeometryCalculator.C();
                                                                                                                                        v27 = 15;
                                                                                                                                        if (var3_2 == null) break block150;
                                                                                                                                        if (v26 != v27) break block151;
                                                                                                                                    }
                                                                                                                                    catch (CustomSystemException v28) {
                                                                                                                                        throw CryptographicContextManager.a(v28);
                                                                                                                                    }
                                                                                                                                    this.LH = new InvocationContextResolver();
                                                                                                                                    this.dg = new AdaptiveContextMapper();
                                                                                                                                    this.Lf = new DataIntegrityGuardian887();
                                                                                                                                    this.G4 = new SystemResourceNegotiator();
                                                                                                                                    this.E = new DynamicInvocationResolver();
                                                                                                                                    this.c = new SecureTransactionHandler();
                                                                                                                                    this.dk = new CryptoContextNegotiator562();
                                                                                                                                    this.Lt = new TypeConversionHandler();
                                                                                                                                    this.GX = new lU();
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v29) {
                                                                                                                                    throw CryptographicContextManager.a(v29);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v26 = GeometryCalculator.C();
                                                                                                                            v27 = 23;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            block152: {
                                                                                                                                try {
                                                                                                                                    if (v26 < v27) break block152;
                                                                                                                                    this.b = new EnhancedTransformationProcessor();
                                                                                                                                    this.m = new AuthenticationContextProvider();
                                                                                                                                    this.kF = new MultiFormatDecoder();
                                                                                                                                    this.dP = new ReflectionParameterResolver();
                                                                                                                                    this.k4 = new CompositeResourceAllocator();
                                                                                                                                    this.Gd = new EncodingProtocolResolver();
                                                                                                                                    this.kk = new DataReconstructionEngine();
                                                                                                                                    if (var3_2 != null) break block153;
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v30) {
                                                                                                                                    throw CryptographicContextManager.a(v30);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            this.gq = new CryptographicTransformer476();
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v31) {
                                                                                                                            throw CryptographicContextManager.a(v31);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (ReflectionMetadataResolver.rj != null) {
                                                                                                                            this.G_ = new CryptoContextNegotiator595();
                                                                                                                            this.d_ = new RuntimeParameterInterceptor();
                                                                                                                            this.km = new TypeMappingCoordinator();
                                                                                                                            this.ds = new vO();
                                                                                                                        }
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v32) {
                                                                                                                        throw CryptographicContextManager.a(v32);
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    this.Gz = new AdaptiveConfigurationResolver();
                                                                                                                                    v33 = GeometryCalculator.C();
                                                                                                                                    v34 = 35;
                                                                                                                                    if (var3_2 == null) break block154;
                                                                                                                                    if (v33 >= v34) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl462
                                                                                                                                }
                                                                                                                                catch (CustomSystemException v35) {
                                                                                                                                    throw CryptographicContextManager.a(v35);
                                                                                                                                }
                                                                                                                                this.GI = new SecureTransmissionController();
                                                                                                                                this.P = new SecureContextRotator();
                                                                                                                                this.GS = new AdaptiveProtocolNegotiator();
                                                                                                                                this.kZ = new ObjectMetadataMapper();
                                                                                                                                this.LM = new v9();
                                                                                                                                this.X = new TransactionSecurityValidator();
                                                                                                                                this.GG = new InteroperabilityTransformer();
                                                                                                                                this.dH = new U5();
                                                                                                                                this.Lx = new Pv();
                                                                                                                                v36 = GeometryCalculator.C();
                                                                                                                                if (var3_2 == null) break block155;
                                                                                                                            }
                                                                                                                            catch (CustomSystemException v37) {
                                                                                                                                throw CryptographicContextManager.a(v37);
                                                                                                                            }
                                                                                                                            if (v36 >= 50) break block156;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException v38) {
                                                                                                                            throw CryptographicContextManager.a(v38);
                                                                                                                        }
                                                                                                                        this.LO = new l0();
                                                                                                                    }
                                                                                                                    catch (CustomSystemException v39) {
                                                                                                                        throw CryptographicContextManager.a(v39);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    this.Lj = new TransactionSecurityOrchestrator();
                                                                                                                    this.La = new SecureTokenValidator();
                                                                                                                    this.k2 = new NetworkSecurityTokenGenerator();
                                                                                                                    this.G8 = new qI();
                                                                                                                    this.Gm = new SystemStateReconciler();
                                                                                                                    this.V = new DynamicClassInspector();
                                                                                                                    this.Lv = new CipherKeyGenerator518();
                                                                                                                    this.dc = new SecureMessageBroker();
                                                                                                                    this.kJ = new TypeConversionOrchestrator();
                                                                                                                    this.gG = new SecureDataEncryptor();
                                                                                                                    if (var3_2 == null) break block157;
                                                                                                                    v36 = (int)GameVersionEnumerator.MC_1_21_6.Q();
                                                                                                                }
                                                                                                                catch (CustomSystemException v40) {
                                                                                                                    throw CryptographicContextManager.a(v40);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                if (v36 != 0) {
                                                                                                                    this.kt = new SecureDataTransformer538();
                                                                                                                }
                                                                                                            }
                                                                                                            catch (CustomSystemException v41) {
                                                                                                                throw CryptographicContextManager.a(v41);
                                                                                                            }
                                                                                                            this.Y = new SystemIntegrationMediator();
                                                                                                            this.kw = new qd();
                                                                                                            this.Lk = new DataTransformationEngine();
                                                                                                            this.LL = new PU();
                                                                                                            this.r = new SecureDecryptionHandler();
                                                                                                            this.L0 = new CryptoResourceAllocator();
                                                                                                            this.LW = new SecureTokenLifecycleManager();
                                                                                                            this.dL = new ParameterTypeNormalizer();
                                                                                                            this.Lp = new CipherConfigurationManager();
                                                                                                            this.gb = new NetworkCredentialEncoder();
                                                                                                            this.dr = new MetadataReflectionResolver();
                                                                                                            this.kl = new BackgroundTaskScheduler();
                                                                                                            this.gn = new TypeAdapterRegistry();
                                                                                                            this.gc = new BooleanConfigurationMapper();
                                                                                                            this.db = new CipherKeyGenerator();
                                                                                                            this.Gg = new TypeMappingCoordinator664();
                                                                                                            this.kC = new SecureTokenGenerator839();
                                                                                                            this.Ly = new SecureDataTransformer601();
                                                                                                            this.kX = new Pz();
                                                                                                            this.ky = new CryptoOperationDispatcher();
                                                                                                            this.GM = new SecurityComplianceValidator();
                                                                                                            this.kW = new CipherKeyExchangeManager();
                                                                                                            this.kI = new ConfigurationParameterManager();
                                                                                                            this.k = new CryptographicKeyResolver630();
                                                                                                        }
                                                                                                        try {
                                                                                                            if (var3_2 != null) break block158;
lbl462:
                                                                                                            // 2 sources

                                                                                                            this.kT = new StreamProcessingHandler2177();
                                                                                                            this.gC = new Uu();
                                                                                                            v33 = GeometryCalculator.C();
                                                                                                            v34 = 23;
                                                                                                        }
                                                                                                        catch (CustomSystemException v42) {
                                                                                                            throw CryptographicContextManager.a(v42);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var3_2 == null) break block159;
                                                                                                            if (v33 < v34) break block160;
                                                                                                        }
                                                                                                        catch (CustomSystemException v43) {
                                                                                                            throw CryptographicContextManager.a(v43);
                                                                                                        }
                                                                                                        this.kf = new DataTransformationOrchestrator801();
                                                                                                    }
                                                                                                    catch (CustomSystemException v44) {
                                                                                                        throw CryptographicContextManager.a(v44);
                                                                                                    }
                                                                                                }
                                                                                                v33 = GeometryCalculator.C();
                                                                                                v34 = 13;
                                                                                            }
                                                                                            try {
                                                                                                if (v33 > v34) {
                                                                                                    this.dh = new InvocationParameterResolver();
                                                                                                }
                                                                                            }
                                                                                            catch (CustomSystemException v45) {
                                                                                                throw CryptographicContextManager.a(v45);
                                                                                            }
                                                                                            this.kq = new SecureDataExchangeProtocol();
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    this.kc = new SecureContextNegotiator531();
                                                                                                    this.k6 = new SystemResourceOrchestrator();
                                                                                                    v46 = GeometryCalculator.C();
                                                                                                    v47 = 37;
                                                                                                    if (var3_2 == null) break block161;
                                                                                                    if (v46 < v47) break block162;
                                                                                                }
                                                                                                catch (CustomSystemException v48) {
                                                                                                    throw CryptographicContextManager.a(v48);
                                                                                                }
                                                                                                this.gh = new SecureTransactionBroker();
                                                                                                this.dG = new MethodIntrospectionHandler();
                                                                                                this.dA = new mu();
                                                                                                this.gl = new l1();
                                                                                                this.kN = new ResourceAllocationTracker820();
                                                                                                this.n = new SystemResourceMonitor();
                                                                                                this.f = new MetricTransformationEngine();
                                                                                                this.L_ = new SecureChannelnegotiator();
                                                                                                v49 = this;
                                                                                                if (var3_2 == null) break block163;
                                                                                            }
                                                                                            catch (CustomSystemException v50) {
                                                                                                throw CryptographicContextManager.a(v50);
                                                                                            }
                                                                                            v49.W = new CipherTransformationHandler897();
                                                                                            if (!GameVersionEnumerator.MC_1_21_6.Q()) break block164;
                                                                                        }
                                                                                        catch (CustomSystemException v51) {
                                                                                            throw CryptographicContextManager.a(v51);
                                                                                        }
                                                                                        this.ka = new TransactionalStateManager();
                                                                                    }
                                                                                    v49 = this;
                                                                                }
                                                                                v49.Lu = new AsynchronousTaskCoordinator826();
                                                                            }
                                                                            try {
                                                                                v46 = GeometryCalculator.C();
                                                                                if (var3_2 == null) break block165;
                                                                                v47 = 50;
                                                                            }
                                                                            catch (CustomSystemException v52) {
                                                                                throw CryptographicContextManager.a(v52);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (v46 >= v47) {
                                                                                v46 = (int)GameVersionEnumerator.MC_1_21_10.Q();
                                                                            }
                                                                            ** GOTO lbl592
                                                                        }
                                                                        catch (CustomSystemException v53) {
                                                                            throw CryptographicContextManager.a(v53);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var3_2 == null) break block166;
                                                                            if (v46 == 0) break block167;
                                                                        }
                                                                        catch (CustomSystemException v54) {
                                                                            throw CryptographicContextManager.a(v54);
                                                                        }
                                                                        this.d2 = new ParametricTypeInspector();
                                                                    }
                                                                    catch (CustomSystemException v55) {
                                                                        throw CryptographicContextManager.a(v55);
                                                                    }
                                                                }
                                                                try {
                                                                    this.dC = new CryptoConfigManager();
                                                                    this.gi = new SecureTokenGenerator();
                                                                    this.Ld = new CryptographicTransformer745();
                                                                    this.d = new DynamicMethodInvoker587();
                                                                    this.g8 = new ResourceLifecycleManager315();
                                                                    this.Gi = new TypeConversionUtility();
                                                                    this.Lq = new AsyncResourceSynchronizer();
                                                                    this.kQ = new lT();
                                                                    this.q = new CryptoSessionNegotiator();
                                                                    this.LT = new CipherContextManager636();
                                                                    this.C = new SecureDataObfuscator();
                                                                    this.dj = new CryptoKeyExchanger();
                                                                    this.kY = new CryptoTransformationEngine786();
                                                                    this.J = new CryptoTransformationBroker();
                                                                    this.dn = new CipherContextManager489();
                                                                    if (var3_2 == null) break block168;
                                                                    v46 = (int)GameVersionEnumerator.MC_1_21_6.Q();
                                                                }
                                                                catch (CustomSystemException v56) {
                                                                    throw CryptographicContextManager.a(v56);
                                                                }
                                                            }
                                                            try {
                                                                if (v46 != 0) {
                                                                    this.t = new ComputationalTransformationUnit();
                                                                }
                                                            }
                                                            catch (CustomSystemException v57) {
                                                                throw CryptographicContextManager.a(v57);
                                                            }
                                                            this.LJ = new StreamProcessingEngine2191();
                                                            this.kG = new CryptographicMetadataExtractor();
                                                            this.gt = new SecureContextNegotiator475();
                                                            this.d6 = new TokenAuthenticationHandler();
                                                        }
                                                        try {
                                                            if (var3_2 != null) break block169;
lbl592:
                                                            // 2 sources

                                                            this.Lg = new vL();
                                                            this.dm = new TokenLifecycleController();
                                                        }
                                                        catch (CustomSystemException v58) {
                                                            throw CryptographicContextManager.a(v58);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                v59 = GameVersionEnumerator.MC_1_21_0.H();
                                                                if (var3_2 == null) break block170;
                                                                if (!v59) break block171;
                                                            }
                                                            catch (CustomSystemException v60) {
                                                                throw CryptographicContextManager.a(v60);
                                                            }
                                                            v61 = this;
                                                            if (var3_2 == null) break block172;
                                                        }
                                                        catch (CustomSystemException v62) {
                                                            throw CryptographicContextManager.a(v62);
                                                        }
                                                        v61.LD = new CryptographicSecurityManager547();
                                                        if (!GameVersionEnumerator.MC_1_20_6.Q()) break block173;
                                                    }
                                                    catch (CustomSystemException v63) {
                                                        throw CryptographicContextManager.a(v63);
                                                    }
                                                    this.L6 = new SecureContextNegotiator852();
                                                }
                                                v61 = this;
                                            }
                                            v61.GJ = new MultimediaCodecOrchestrator();
                                        }
                                        v59 = GameVersionEnumerator.MC_1_21_4.H();
                                    }
                                    try {
                                        try {
                                            if (var3_2 == null) break block174;
                                            if (!v59) break block175;
                                        }
                                        catch (CustomSystemException v64) {
                                            throw CryptographicContextManager.a(v64);
                                        }
                                        this.dz = new SecureConfigurationManager();
                                        this.dq = new DistributedComputationOrchestrator();
                                        this.kh = new ResourceAllocationController556();
                                        this.gH = new SecureContextBroker();
                                        this.kp = new EncodingProtocolManager();
                                        this.Ga = new NetworkConnectionResolver2638();
                                        this.Lo = new CryptographicTokenManager();
                                        this.O = new CryptoParameterNegotiator590();
                                        this.LA = new TypeConversionOrchestrator439();
                                        this.U = new CryptoContextManager842();
                                        this.df = new RuntimeConfigurationAdapter();
                                        this.kb = new AuthenticationValidator2640();
                                        this.d5 = new DocumentEncryptionProcessor();
                                        this.gs = new IdentityTokenGenerator();
                                        this.Li = new DataTransformationBroker();
                                        this.de = new NetworkConnectionManager2147();
                                        this.gQ = new vW();
                                        this.GC = new EncryptionContextProvider();
                                        this.GO = new CryptographicKeyManager();
                                        this.d1 = new CryptographicTransformationManager();
                                        this.Gt = new ReflectiveMethodInvoker1036();
                                        this.g9 = new AdaptiveCompressionEngine();
                                        this.ki = new CryptoOperationResolver();
                                        this.Gx = new SecureDataProcessor();
                                        this.i = new U2();
                                        this.Ge = new my();
                                        this.LK = new MultiStageEncryptionOrchestrator();
                                        this.gj = new ReflectiveIntrospectionEngine603();
                                    }
                                    catch (CustomSystemException v65) {
                                        throw CryptographicContextManager.a(v65);
                                    }
                                }
                                v59 = GameVersionEnumerator.MC_1_21_6.H();
                            }
                            try {
                                block176: {
                                    try {
                                        if (!v59) break block176;
                                        this.L3 = new AuthenticationTokenManager463();
                                        this.Gh = new DataIntegrityGuardian();
                                        this.Gn = new ProtocolMessageHandler();
                                        this.Q = new Uf();
                                        this.dt = new CipherConfigurationManager525();
                                        this.dF = new CryptographicTokenGenerator956();
                                        this.kz = new lJ();
                                        this.Gw = new ResilencyCoordinator();
                                        if (var3_2 != null) break block177;
                                    }
                                    catch (CustomSystemException v66) {
                                        throw CryptographicContextManager.a(v66);
                                    }
                                }
                                this.ge = new CryptoSecurityManager();
                                this.LP = new CryptoContextBroker();
                            }
                            catch (CustomSystemException v67) {
                                throw CryptographicContextManager.a(v67);
                            }
                        }
                        try {
                            try {
                                v68 = GameVersionEnumerator.MC_1_21_10.H();
                                if (var3_2 == null) break block178;
                                if (!v68) break block179;
                            }
                            catch (CustomSystemException v69) {
                                throw CryptographicContextManager.a(v69);
                            }
                            this.Lz = new CipherKeyManager();
                            this.dI = new TypeConversionMediator();
                            this.kV = new SecureParameterRegistry();
                            this.gp = new CryptoSecurityManager907();
                            this.kj = new Ui();
                            this.kr = new CipherTransformationEngine569();
                        }
                        catch (CustomSystemException v70) {
                            throw CryptographicContextManager.a(v70);
                        }
                    }
                    this.dK = new Ux();
                    v68 = GameVersionEnumerator.MC_1_20_6.H();
                }
                try {
                    try {
                        if (var3_2 == null) break block180;
                        if (!v68) break block181;
                    }
                    catch (CustomSystemException v71) {
                        throw CryptographicContextManager.a(v71);
                    }
                    this.dD = new StreamProcessingCoordinator();
                    this.kP = new NetworkProtocolEncoder553();
                    this.kR = new RuntimeFlagOrchestrator();
                    this.dU = new SecureChannelNegotiator762();
                    this.GE = new RuntimeConfigurationResolver811();
                    this.LX = new ResourceLifecycleManager2594();
                    this.dd = new MetricsCollectionAgent();
                    this.Gp = new PluginDiscoveryService();
                    this.gA = new TransactionSequencer();
                    this.GZ = new TypeConversionOrchestrator579();
                }
                catch (CustomSystemException v72) {
                    throw CryptographicContextManager.a(v72);
                }
            }
            v68 = GameVersionEnumerator.MC_1_21_4.H();
        }
        try {
            if (v68) {
                this.LC = new DataValidationOrchestrator();
                this.G5 = new Px();
                this.k9 = new PS();
            }
        }
        catch (CustomSystemException v73) {
            throw CryptographicContextManager.a(v73);
        }
    }

    public static int[] X() {
        return Gc;
    }

    public static void G(int[] nArray) {
        Gc = nArray;
    }
}

