/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.KZ;
import a.X9;
import a.XE;
import a.Xw;
import a.Xz;
import a.cw;
import a.iT;
import com.app.concurrency.AsynchronousTaskExecutor2174;
import com.app.concurrent.AsyncTaskHandler;
import com.app.concurrent.BackgroundJobProcessor;
import com.app.security.AuthenticationHandler1695;
import com.app.security.CryptographicTokenResolver;
import com.app.workflow.WorkflowOrchestrator2512;
import com.async.task.AsynchronousTaskExecutor2525;
import com.communication.messaging.ChatMessageOrchestrator;
import com.concurrency.async.AsyncExecutionController;
import com.concurrency.tasks.AsynchronousTaskExecutor2014;
import com.concurrency.tasks.AsynchronousTaskExecutor2162;
import com.core.reflection.ReflectionUtility407;
import com.core.registration.ClassRegistrationHandler;
import com.crypto.advanced.AdvancedCipherTransformer;
import com.crypto.builder.EncryptionContextBuilder1019;
import com.crypto.transformation.CryptographicTransformer1014;
import com.data.mapping.DataMappingResolver;
import com.data.transformation.DataTransformationHandler705;
import com.dataprocessing.pipeline.ParameterizedDataTransformer;
import com.dataprocessing.transaction.TransactionalDataMapper;
import com.dynamic.proxy.InvocationProxyWrapper;
import com.encoding.context.EncodingContextBuilder;
import com.exception.system.CustomSystemException;
import com.execution.core.ExecutionContextOrchestrator1008;
import com.financial.validation.TransactionValidator1587;
import com.financial.verification.PaymentVerificationService;
import com.game.configuration.GameVersionEnumerator;
import com.invocation.dynamic.ParameterizedInvocationHandler;
import com.logging.util.LoggingContextMapper;
import com.math.geometry.GeometryCalculator;
import com.network.codec.NetworkPayloadEncoder;
import com.network.protocol.NetworkProtocolEncoder683;
import com.network.registry.NetworkEndpointRegistrar;
import com.physics.simulation.PhysicsSimulationEvent;
import com.reflection.access.FieldAccessNegotiator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.reflection.util.ContextualReflectionUtility;
import com.resource.management.ContextualResourceBroker;
import com.resources.dynamic.DynamicResourceResolver;
import com.security.cipher.CipherContextFactory735;
import com.security.cipher.CipherContextManager712;
import com.security.context.CryptoContextManager728;
import com.security.crypto.EncryptionTransformer;
import com.security.encapsulation.SecureDataEncapsulator;
import com.security.interception.SecureDataInterceptor;
import com.security.payload.SecurePayloadMapper;
import com.security.reflection.ReflectionSecurityManager;
import com.security.token.SecurityTokenProcessor;
import com.security.transform.CipherTransformationHandler669;
import com.temporal.metadata.TemporalMetadataResolver;
import com.threading.synchronization.ConcurrencyLockController;
import com.ui.configuration.DisplayConfigurationManager;
import java.util.Collection;
import java.util.Iterator;

public class cf
extends cw {
    private static int D;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int v() {
        return D;
    }

    public void u() {
        block48: {
            block47: {
                block46: {
                    block45: {
                        block44: {
                            block43: {
                                block42: {
                                    try {
                                        this.h.add(new TransactionValidator1587());
                                        this.h.add(new NetworkEndpointRegistrar());
                                        this.h.add(new ReflectionUtility407());
                                        if (GameVersionEnumerator.MC_1_21_4.H()) {
                                            this.h.add(new PaymentVerificationService());
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw cf.a(customSystemException);
                                    }
                                    try {
                                        this.h.add(new NetworkProtocolEncoder683());
                                        this.h.add(new ParameterizedDataTransformer());
                                        this.h.add(new ExecutionContextOrchestrator1008());
                                        this.h.add(new DynamicResourceResolver());
                                        this.h.add(new AuthenticationHandler1695());
                                        this.h.add(new ContextualResourceBroker());
                                        this.h.add(new SecureDataEncapsulator());
                                        this.h.add(new ParameterizedInvocationHandler());
                                        this.h.add(new CryptographicTokenResolver());
                                        this.h.add(new ReflectionSecurityManager());
                                        if (GameVersionEnumerator.MC_1_21_4.Q()) {
                                            this.h.add(new SecureDataInterceptor());
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw cf.a(customSystemException);
                                    }
                                    try {
                                        try {
                                            if (GeometryCalculator.C() != 13 || TemporalMetadataResolver.h.r()) break block42;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw cf.a(customSystemException);
                                        }
                                        this.h.add(new CryptographicTransformer1014());
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw cf.a(customSystemException);
                                    }
                                }
                                try {
                                    if (GeometryCalculator.C() <= 23) {
                                        this.h.add(new SecurePayloadMapper());
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw cf.a(customSystemException);
                                }
                                try {
                                    try {
                                        if (GeometryCalculator.C() < 35) break block43;
                                        this.h.add(new LoggingContextMapper());
                                        this.h.add(new XE());
                                        this.h.add(new iT());
                                        if (!GameVersionEnumerator.MC_1_21_4.Q()) break block44;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw cf.a(customSystemException);
                                    }
                                    this.h.add(new AdvancedCipherTransformer());
                                    break block44;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw cf.a(customSystemException);
                                }
                            }
                            this.h.add(new NetworkPayloadEncoder());
                        }
                        try {
                            this.h.add(new Xz());
                            if (GeometryCalculator.C() == 13) {
                                this.h.add(new SecurityTokenProcessor(ReflectionMetadataResolver.Fm));
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw cf.a(customSystemException);
                        }
                        try {
                            if (GeometryCalculator.C() == 15) {
                                this.h.add(new DataMappingResolver());
                                this.h.add(new CryptoContextManager728());
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw cf.a(customSystemException);
                        }
                        try {
                            if (!GameVersionEnumerator.MC_1_16_5.H()) break block45;
                            this.h.add(new EncodingContextBuilder());
                            break block46;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw cf.a(customSystemException);
                        }
                    }
                    try {
                        if (GameVersionEnumerator.MC_1_8_9.H()) {
                            this.h.add(new CipherContextFactory735());
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw cf.a(customSystemException);
                    }
                }
                try {
                    this.h.add(new CipherTransformationHandler669());
                    if (GameVersionEnumerator.MC_1_21_0.H()) {
                        this.h.add(new FieldAccessNegotiator());
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw cf.a(customSystemException);
                }
                try {
                    if (!GameVersionEnumerator.MC_1_20_6.H()) break block47;
                    this.h.add(new CipherContextManager712());
                    break block48;
                }
                catch (CustomSystemException customSystemException) {
                    throw cf.a(customSystemException);
                }
            }
            this.h.add(new TransactionalDataMapper());
        }
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                this.h.add(new ClassRegistrationHandler());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw cf.a(customSystemException);
        }
        try {
            if (GameVersionEnumerator.MC_1_21_6.H()) {
                this.h.add(new Xw());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw cf.a(customSystemException);
        }
        try {
            this.h.add(new DataTransformationHandler705());
            if (GameVersionEnumerator.MC_1_20_6.H()) {
                this.h.add(new X9());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw cf.a(customSystemException);
        }
    }

    public static int B() {
        int n = cf.v();
        try {
            if (n == 0) {
                return 108;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw cf.a(customSystemException);
        }
        return 0;
    }

    static {
        if (cf.v() == 0) {
            cf.g(106);
        }
    }

    public void b() {
        EncryptionContextBuilder1019 encryptionContextBuilder1019 = new EncryptionContextBuilder1019();
        this.h.add(encryptionContextBuilder1019);
    }

    public cf() {
        block25: {
            block24: {
                EncryptionTransformer.H(ReflectionMetadataResolver.PE);
                EncryptionTransformer.H(ReflectionMetadataResolver.Vl);
                EncryptionTransformer.H(ReflectionMetadataResolver.bj);
                EncryptionTransformer.H(ReflectionMetadataResolver.Ut);
                EncryptionTransformer.H(ReflectionMetadataResolver.VK);
                EncryptionTransformer.H(ReflectionMetadataResolver.C);
                EncryptionTransformer.H(ReflectionMetadataResolver.U8);
                EncryptionTransformer.H(ReflectionMetadataResolver.VL);
                EncryptionTransformer.H(ReflectionMetadataResolver.YN);
                EncryptionTransformer.H(ReflectionMetadataResolver.Et);
                EncryptionTransformer.H(ReflectionMetadataResolver.Uu);
                EncryptionTransformer.H(ReflectionMetadataResolver.Uo);
                EncryptionTransformer.H(ReflectionMetadataResolver.FK);
                EncryptionTransformer.H(ReflectionMetadataResolver.FM);
                EncryptionTransformer.H(ReflectionMetadataResolver.Et);
                EncryptionTransformer.H(ReflectionMetadataResolver.l);
                EncryptionTransformer.H(ReflectionMetadataResolver.bU);
                EncryptionTransformer.H(ReflectionMetadataResolver.R);
                EncryptionTransformer.H(ReflectionMetadataResolver.rl);
                EncryptionTransformer.H(ReflectionMetadataResolver.V_);
                EncryptionTransformer.H(ReflectionMetadataResolver.Fk);
                EncryptionTransformer.H(ReflectionMetadataResolver.EJ);
                EncryptionTransformer.H(InvocationProxyWrapper.class);
                if (GeometryCalculator.C() >= 35) {
                    try {
                        EncryptionTransformer.H(ReflectionMetadataResolver.rr);
                        EncryptionTransformer.H(ReflectionMetadataResolver.bg);
                        EncryptionTransformer.H(ReflectionMetadataResolver.Ej);
                        EncryptionTransformer.H(ReflectionMetadataResolver.Ux);
                        EncryptionTransformer.H(ReflectionMetadataResolver.EM);
                        EncryptionTransformer.H(ReflectionMetadataResolver.Yt);
                        if (TemporalMetadataResolver.h.d()) {
                            EncryptionTransformer.H(ReflectionMetadataResolver.YH);
                            EncryptionTransformer.H(ReflectionMetadataResolver.Fj);
                            EncryptionTransformer.H(ReflectionMetadataResolver.F0);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw cf.a(customSystemException);
                    }
                }
                try {
                    EncryptionTransformer.H(Object.class);
                    EncryptionTransformer.H(ReflectionMetadataResolver.ba);
                    EncryptionTransformer.H(Iterator.class);
                    EncryptionTransformer.H(Collection.class);
                    EncryptionTransformer.H(ReflectionMetadataResolver.Py);
                    EncryptionTransformer.H(ContextualReflectionUtility.S(Integer.TYPE));
                    if (GeometryCalculator.C() >= 23) {
                        EncryptionTransformer.H(ReflectionMetadataResolver.F7);
                        EncryptionTransformer.H(ReflectionMetadataResolver.FO);
                        EncryptionTransformer.H(ReflectionMetadataResolver.UP);
                        EncryptionTransformer.H(ReflectionMetadataResolver.Yw);
                        EncryptionTransformer.H(ReflectionMetadataResolver.VA);
                        EncryptionTransformer.H(ContextualReflectionUtility.S(ReflectionMetadataResolver.VA));
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw cf.a(customSystemException);
                }
                try {
                    if (GeometryCalculator.C() <= 13) break block24;
                    EncryptionTransformer.H(ReflectionMetadataResolver.PX);
                    EncryptionTransformer.H(ReflectionMetadataResolver.U0);
                    EncryptionTransformer.H(ReflectionMetadataResolver.P2);
                    EncryptionTransformer.H(ReflectionMetadataResolver.Pb);
                    EncryptionTransformer.H(ReflectionMetadataResolver.bE);
                    EncryptionTransformer.H(ReflectionMetadataResolver.Ei);
                    EncryptionTransformer.H(ReflectionMetadataResolver.ri);
                    EncryptionTransformer.H(ReflectionMetadataResolver.VJ);
                    EncryptionTransformer.H(ReflectionMetadataResolver.V7);
                    EncryptionTransformer.H(ReflectionMetadataResolver.E9);
                    EncryptionTransformer.H(ReflectionMetadataResolver.ru);
                    EncryptionTransformer.H(ReflectionMetadataResolver.Ec);
                    break block25;
                }
                catch (CustomSystemException customSystemException) {
                    throw cf.a(customSystemException);
                }
            }
            EncryptionTransformer.H(ReflectionMetadataResolver.VE);
            EncryptionTransformer.H(ReflectionMetadataResolver.bD);
        }
        try {
            if (GameVersionEnumerator.MC_1_21_4.H()) {
                EncryptionTransformer.H(ReflectionMetadataResolver.O);
                EncryptionTransformer.H(ReflectionMetadataResolver.UO);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw cf.a(customSystemException);
        }
        try {
            EncryptionTransformer.H(ReflectionMetadataResolver.bf);
            EncryptionTransformer.H(ReflectionMetadataResolver.PZ);
            EncryptionTransformer.H(ReflectionMetadataResolver.ru);
            EncryptionTransformer.H(AsyncTaskHandler.class);
            EncryptionTransformer.s(AsyncTaskHandler.class);
            EncryptionTransformer.H(BackgroundJobProcessor.class);
            EncryptionTransformer.s(BackgroundJobProcessor.class);
            EncryptionTransformer.H(AsynchronousTaskExecutor2162.class);
            EncryptionTransformer.s(AsynchronousTaskExecutor2162.class);
            EncryptionTransformer.H(AsynchronousTaskExecutor2174.class);
            EncryptionTransformer.s(AsynchronousTaskExecutor2174.class);
            EncryptionTransformer.H(PhysicsSimulationEvent.class);
            EncryptionTransformer.s(PhysicsSimulationEvent.class);
            EncryptionTransformer.H(DisplayConfigurationManager.class);
            EncryptionTransformer.s(DisplayConfigurationManager.class);
            EncryptionTransformer.H(KZ.class);
            EncryptionTransformer.s(KZ.class);
            EncryptionTransformer.H(AsynchronousTaskExecutor2525.class);
            EncryptionTransformer.H(ReflectionMetadataResolver.Up);
            EncryptionTransformer.H(ReflectionMetadataResolver.Er);
            if (GameVersionEnumerator.MC_1_16_5.H()) {
                EncryptionTransformer.H(ReflectionMetadataResolver.d);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw cf.a(customSystemException);
        }
        try {
            EncryptionTransformer.H(AsynchronousTaskExecutor2014.class);
            EncryptionTransformer.H(AsyncExecutionController.class);
            EncryptionTransformer.H(WorkflowOrchestrator2512.class);
            EncryptionTransformer.s(WorkflowOrchestrator2512.class);
            EncryptionTransformer.H(ConcurrencyLockController.class);
            EncryptionTransformer.s(ConcurrencyLockController.class);
            if (GameVersionEnumerator.MC_1_20_6.H()) {
                EncryptionTransformer.H(ChatMessageOrchestrator.class);
                EncryptionTransformer.s(ChatMessageOrchestrator.class);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw cf.a(customSystemException);
        }
        try {
            if (GameVersionEnumerator.MC_1_21_10.H()) {
                EncryptionTransformer.H(ReflectionMetadataResolver.bT);
                EncryptionTransformer.H(ReflectionMetadataResolver.S);
                EncryptionTransformer.H(ReflectionMetadataResolver.Pw);
                EncryptionTransformer.H(ReflectionMetadataResolver.re);
                EncryptionTransformer.H(ReflectionMetadataResolver.Uf);
                EncryptionTransformer.H(ReflectionMetadataResolver.P0);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw cf.a(customSystemException);
        }
        try {
            if (GameVersionEnumerator.MC_1_8_9.H()) {
                EncryptionTransformer.H(ReflectionMetadataResolver.Yk);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw cf.a(customSystemException);
        }
    }

    public static void g(int n) {
        D = n;
    }
}

