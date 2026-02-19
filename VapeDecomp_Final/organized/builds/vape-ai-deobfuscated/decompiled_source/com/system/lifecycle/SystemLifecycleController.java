/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  org.jetbrains.annotations.Nullable
 */
package com.system.lifecycle;

import a.JF;
import a.ZF;
import a.ZQ;
import a.Zt;
import a.ew;
import a.zI;
import com.app.adapter.GenericTransformationAdapter;
import com.app.crypto.processing.CipherTextProcessor;
import com.app.execution.TimedExecutionController;
import com.app.network.ConnectionBroker2515;
import com.app.network.NetworkConnectionBroker2678;
import com.app.network.protocol.NetworkProtocolHandler2036;
import com.app.resources.ResourceAllocationTracker1690;
import com.app.security.cryptography.CryptographicKeyManager2408;
import com.app.security.encryption.EncryptionEngine;
import com.app.service.ServiceRegistry;
import com.cache.distribution.DistributedCacheManager;
import com.collections.management.MultiContainerRegistry;
import com.configuration.resolver.ConfigurationProfileResolver;
import com.crypto.config.CryptoConfigurationRegistry383;
import com.distributed.cache.DistributedCacheOrchestrator;
import com.exception.system.CustomSystemException;
import com.financial.validation.TransactionValidator2148;
import com.identity.management.UniversalIdentityManager;
import com.logging.audit.AuditTraceLogger;
import com.logging.context.LoggingContextManager;
import com.logging.temporal.TimestampTracker2469;
import com.network.config.NetworkConfigurationEnum;
import com.network.configuration.NetworkConfigManager;
import com.network.connection.ConnectionEndpointResolver;
import com.network.connection.NetworkConnectionManager2517;
import com.network.connection.NetworkEndpointIdentifier;
import com.network.protocol.NetworkPacketInterceptor;
import com.network.protocol.ProtocolVersionResolver;
import com.network.registry.NetworkEndpointRegistry;
import com.network.security.SecureChannelNegotiator2460;
import com.network.security.SecureTransmissionHandler2454;
import com.network.state.NetworkStateController;
import com.reflection.core.ReflectiveIntrospectionEngine;
import com.reflection.utils.ReflectionProxyHandler;
import com.resource.tracking.ContextualResourceTracker;
import com.resource.tracking.TimestampedResourceTracker2101;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CryptoSecurityProvider;
import com.security.crypto.CryptographicModeEnum;
import com.security.encryption.SessionEncryptionManager;
import com.security.keys.CryptographicKeyManager2017;
import com.security.orchestration.CryptoDataOrchestrator;
import com.security.policy.SecurityPolicyValidator;
import com.simulation.physics.PhysicalSimulationEngine;
import com.system.memory.CacheMemoryManager1616;
import com.system.resource.ResourceAllocationTracker1589;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.context.TransactionContextManager;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.theme.ApplicationColorSchemeManager;
import com.user.identity.UserIdentityManager;
import com.validation.state.StateValidator;
import io.netty.channel.Channel;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class SystemLifecycleController {
    public static final SystemLifecycleController C;
    private static final long b;
    private static final String[] d;
    private boolean e = false;
    private static final Object[] c;
    private final NetworkConfigManager Y;
    @Nullable
    private Thread D;
    private NetworkConfigurationEnum U;
    private long H = -1L;
    private final CryptoDataOrchestrator Q;
    private CryptographicModeEnum f = CryptographicModeEnum.OFFLINE;
    private boolean r = false;
    private int P;
    private boolean h = false;
    @Nullable
    private SecurityPolicyValidator G;
    private final DistributedCacheManager y;
    private boolean Z = false;
    private static final long a;

    public void A() {
        this.v();
        this.H = -1L;
        if (this.D != null) {
            try {
                this.D.interrupt();
                this.D = null;
            }
            catch (Throwable throwable) {
                TemporalMetadataResolver.W(throwable);
            }
        }
        this.o(CryptographicModeEnum.OFFLINE);
    }

    private static void lambda$setupListeners$7(NetworkEndpointRegistry networkEndpointRegistry) {
        TemporalMetadataResolver.h.O().I();
        NetworkPacketInterceptor networkPacketInterceptor = SecureContextBroker572.h().c();
        TemporalMetadataResolver.h.O().n().A(networkPacketInterceptor.M().C());
        for (UniversalIdentityManager object : networkEndpointRegistry.Q()) {
            new SessionEncryptionManager(networkPacketInterceptor, object).t();
        }
        for (NetworkEndpointIdentifier networkEndpointIdentifier : networkEndpointRegistry.S()) {
            new Zt(networkPacketInterceptor, networkEndpointIdentifier).t();
        }
        for (NetworkEndpointIdentifier networkEndpointIdentifier : networkEndpointRegistry.T()) {
            new ZQ(networkPacketInterceptor, networkEndpointIdentifier).t();
        }
    }

    private static Method d(long l, long l2) {
        int n = SystemLifecycleController.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = SystemLifecycleController.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SystemLifecycleController.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SystemLifecycleController.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SystemLifecycleController.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SystemLifecycleController.b(257075783176164L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SystemLifecycleController.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SystemLifecycleController.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SystemLifecycleController.b(257075783176164L, 0L);
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

    private static void lambda$setupListeners$11(ZF zF) {
        UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.M().u(zF.u());
        try {
            if (userIdentityManager == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        TemporalMetadataResolver.h.j().y(userIdentityManager.u());
        TemporalMetadataResolver.h.M().f(userIdentityManager);
    }

    private static void lambda$setState$5(CryptographicModeEnum cryptographicModeEnum) {
        DistributedCacheOrchestrator.kW.i(cryptographicModeEnum);
    }

    private static void lambda$setupListeners$10(NetworkStateController networkStateController) {
        UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.M().u(networkStateController.u());
        try {
            if (userIdentityManager == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        userIdentityManager.y(ApplicationColorSchemeManager.t(networkStateController.z()));
        CipherTextProcessor.v();
    }

    /*
     * Loose catch block
     */
    public void L() throws Exception {
        block12: {
            try {
                if (this.r) {
                    return;
                }
            }
            catch (Throwable throwable) {
                throw SystemLifecycleController.a(throwable);
            }
            this.r = true;
            this.Y();
            this.r(NetworkConfigurationEnum.CONNECTING);
            Runnable runnable = this::lambda$initialize$0;
            this.Q.w();
            try {
                block14: {
                    block13: {
                        boolean bl;
                        block11: {
                            StateValidator stateValidator = TemporalMetadataResolver.h.r().e();
                            boolean bl2 = stateValidator.e();
                            bl = stateValidator.T();
                            boolean bl3 = stateValidator.C();
                            try {
                                if (!bl3) break block11;
                                this.r(NetworkConfigurationEnum.BANNED);
                                break block12;
                            }
                            catch (Throwable throwable) {
                                throw SystemLifecycleController.a(throwable);
                            }
                        }
                        if (!bl) break block14;
                        try {
                            block15: {
                                this.r(NetworkConfigurationEnum.REGISTERED);
                                this.y.q();
                                if (!this.y.f().s().booleanValue()) break block13;
                                break block15;
                                catch (Throwable throwable) {
                                    throw SystemLifecycleController.a(throwable);
                                }
                            }
                            this.N();
                            break block12;
                        }
                        catch (Throwable throwable) {
                            throw SystemLifecycleController.a(throwable);
                        }
                    }
                    GraphicalRenderingController.D(ReflectionProxyHandler.class).J().S((Boolean)false);
                    break block12;
                }
                this.r(NetworkConfigurationEnum.UNREGISTERED);
                GraphicalRenderingController.D(ReflectionProxyHandler.class).Z();
                GraphicalRenderingController.D(ReflectionProxyHandler.class).l();
            }
            catch (Throwable throwable) {
                runnable.run();
            }
        }
    }

    private static void lambda$setupListeners$14(ZQ zQ) {
        TemporalMetadataResolver.h.O().u().T(new ServiceRegistry(zQ.y()));
    }

    public long V() {
        return this.H;
    }

    private void lambda$null$1() {
        try {
            if (!this.h) {
                this.Y.m();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        this.S();
    }

    private static void lambda$setupListeners$16(JF jF) {
        JF jF2 = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF2 != null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        CryptoSecurityProvider cryptoSecurityProvider = TemporalMetadataResolver.h.O().n();
        UserIdentityManager userIdentityManager = jF.q(cryptoSecurityProvider.s());
        try {
            if (userIdentityManager != null) {
                cryptoSecurityProvider.c(userIdentityManager.M());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        TemporalMetadataResolver.h.O().p().A(jF);
    }

    private static UserIdentityManager lambda$null$24(NetworkProtocolHandler2036 networkProtocolHandler2036) {
        return new UserIdentityManager(networkProtocolHandler2036.o());
    }

    public void r(NetworkConfigurationEnum networkConfigurationEnum) {
        this.U = networkConfigurationEnum;
        CryptographicModeEnum cryptographicModeEnum = this.f;
        GraphicalRenderingController.st.execute(() -> SystemLifecycleController.lambda$setAccountState$6(networkConfigurationEnum, cryptographicModeEnum));
    }

    public NetworkConfigurationEnum P() {
        return this.U;
    }

    private void Y() {
        try {
            if (this.e) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        this.e = true;
        ResourceAllocationTracker1690.H.t(NetworkEndpointRegistry.class, SystemLifecycleController::lambda$setupListeners$7);
        ResourceAllocationTracker1690.H.t(SessionEncryptionManager.class, this::lambda$setupListeners$9);
        ResourceAllocationTracker1690.H.t(NetworkStateController.class, SystemLifecycleController::lambda$setupListeners$10);
        ResourceAllocationTracker1690.H.t(ZF.class, SystemLifecycleController::lambda$setupListeners$11);
        ResourceAllocationTracker1690.H.t(Zt.class, SystemLifecycleController::lambda$setupListeners$12);
        ResourceAllocationTracker1690.H.t(TimestampTracker2469.class, SystemLifecycleController::lambda$setupListeners$13);
        ResourceAllocationTracker1690.H.t(ZQ.class, SystemLifecycleController::lambda$setupListeners$14);
        ResourceAllocationTracker1690.H.t(TransactionContextManager.class, SystemLifecycleController::lambda$setupListeners$15);
        Consumer<JF> consumer = SystemLifecycleController::lambda$setupListeners$16;
        ResourceAllocationTracker1690.H.t(EncryptionEngine.class, arg_0 -> SystemLifecycleController.lambda$setupListeners$17(consumer, arg_0));
        ResourceAllocationTracker1690.H.t(ProtocolVersionResolver.class, arg_0 -> SystemLifecycleController.lambda$setupListeners$18(consumer, arg_0));
        Runnable runnable = SystemLifecycleController::lambda$setupListeners$19;
        ResourceAllocationTracker1690.H.t(ConnectionBroker2515.class, arg_0 -> SystemLifecycleController.lambda$setupListeners$20(runnable, arg_0));
        ResourceAllocationTracker1690.H.t(TransactionValidator2148.class, arg_0 -> SystemLifecycleController.lambda$setupListeners$21(runnable, arg_0));
        ResourceAllocationTracker1690.H.t(SecureTransmissionHandler2454.class, SystemLifecycleController::lambda$setupListeners$23);
        ResourceAllocationTracker1690.H.t(NetworkProtocolHandler2036.class, SystemLifecycleController::lambda$setupListeners$25);
        ResourceAllocationTracker1690.H.t(CryptographicKeyManager2408.class, SystemLifecycleController::lambda$setupListeners$26);
        ResourceAllocationTracker1690.H.t(CryptographicKeyManager2017.class, SystemLifecycleController::lambda$setupListeners$27);
        ResourceAllocationTracker1690.H.t(ResourceAllocationTracker1589.class, arg_0 -> SystemLifecycleController.lambda$setupListeners$29(runnable, arg_0));
        ResourceAllocationTracker1690.H.t(SecureChannelNegotiator2460.class, SystemLifecycleController::lambda$setupListeners$30);
        ResourceAllocationTracker1690.H.t(ContextualResourceTracker.class, SystemLifecycleController::lambda$setupListeners$31);
        ResourceAllocationTracker1690.H.t(CacheMemoryManager1616.class, SystemLifecycleController::lambda$setupListeners$32);
        ResourceAllocationTracker1690.H.t(AuditTraceLogger.class, SystemLifecycleController::lambda$setupListeners$33);
        ResourceAllocationTracker1690.H.t(TimedExecutionController.class, SystemLifecycleController::lambda$setupListeners$34);
        ResourceAllocationTracker1690.H.t(TimestampedResourceTracker2101.class, SystemLifecycleController::lambda$setupListeners$35);
        ResourceAllocationTracker1690.H.t(ConnectionEndpointResolver.class, SystemLifecycleController::lambda$setupListeners$36);
    }

    private static void lambda$setupListeners$34(TimedExecutionController timedExecutionController) {
        UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.O().t().w(timedExecutionController.O());
        try {
            if (userIdentityManager != null) {
                userIdentityManager.x(timedExecutionController.d());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
    }

    private static void lambda$setupListeners$15(TransactionContextManager transactionContextManager) {
        UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.M().u(transactionContextManager.h());
        try {
            if (userIdentityManager == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        CipherTextProcessor.k(userIdentityManager, userIdentityManager, transactionContextManager.e());
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SystemLifecycleController.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (d[n4] != null) {
            return n4;
        }
        Object object = c[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 15;
                break;
            }
            case 1: {
                n3 = 54;
                break;
            }
            case 2: {
                n3 = 49;
                break;
            }
            case 3: {
                n3 = 22;
                break;
            }
            case 4: {
                n3 = 42;
                break;
            }
            case 5: {
                n3 = 62;
                break;
            }
            case 6: {
                n3 = 14;
                break;
            }
            case 7: {
                n3 = 24;
                break;
            }
            case 8: {
                n3 = 23;
                break;
            }
            case 9: {
                n3 = 21;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 48;
                break;
            }
            case 12: {
                n3 = 59;
                break;
            }
            case 13: {
                n3 = 12;
                break;
            }
            case 14: {
                n3 = 0;
                break;
            }
            case 15: {
                n3 = 28;
                break;
            }
            case 16: {
                n3 = 47;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 44;
                break;
            }
            case 19: {
                n3 = 17;
                break;
            }
            case 20: {
                n3 = 61;
                break;
            }
            case 21: {
                n3 = 31;
                break;
            }
            case 22: {
                n3 = 60;
                break;
            }
            case 23: {
                n3 = 39;
                break;
            }
            case 24: {
                n3 = 53;
                break;
            }
            case 25: {
                n3 = 26;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 2;
                break;
            }
            case 28: {
                n3 = 4;
                break;
            }
            case 29: {
                n3 = 9;
                break;
            }
            case 30: {
                n3 = 56;
                break;
            }
            case 31: {
                n3 = 52;
                break;
            }
            case 32: {
                n3 = 18;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 57;
                break;
            }
            case 35: {
                n3 = 5;
                break;
            }
            case 36: {
                n3 = 34;
                break;
            }
            case 37: {
                n3 = 33;
                break;
            }
            case 38: {
                n3 = 43;
                break;
            }
            case 39: {
                n3 = 27;
                break;
            }
            case 40: {
                n3 = 37;
                break;
            }
            case 41: {
                n3 = 25;
                break;
            }
            case 42: {
                n3 = 16;
                break;
            }
            case 43: {
                n3 = 63;
                break;
            }
            case 44: {
                n3 = 40;
                break;
            }
            case 45: {
                n3 = 13;
                break;
            }
            case 46: {
                n3 = 8;
                break;
            }
            case 47: {
                n3 = 3;
                break;
            }
            case 48: {
                n3 = 58;
                break;
            }
            case 49: {
                n3 = 36;
                break;
            }
            case 50: {
                n3 = 41;
                break;
            }
            case 51: {
                n3 = 32;
                break;
            }
            case 52: {
                n3 = 51;
                break;
            }
            case 53: {
                n3 = 6;
                break;
            }
            case 54: {
                n3 = 7;
                break;
            }
            case 55: {
                n3 = 38;
                break;
            }
            case 56: {
                n3 = 19;
                break;
            }
            case 57: {
                n3 = 10;
                break;
            }
            case 58: {
                n3 = 11;
                break;
            }
            case 59: {
                n3 = 35;
                break;
            }
            case 60: {
                n3 = 1;
                break;
            }
            case 61: {
                n3 = 30;
                break;
            }
            case 62: {
                n3 = 29;
                break;
            }
            default: {
                n3 = 20;
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
        SystemLifecycleController.d[n4] = new String(cArray);
        return n4;
    }

    private void lambda$startup$4(GenericTransformationAdapter genericTransformationAdapter) {
        this.P = 0;
        GraphicalRenderingController.D(ReflectionProxyHandler.class).T();
        this.o(CryptographicModeEnum.ONLINE);
        this.h = true;
    }

    private void lambda$initialize$0() {
        this.r(NetworkConfigurationEnum.REGISTRATION_OFFLINE);
        GraphicalRenderingController.D(ReflectionProxyHandler.class).p();
        this.r = false;
    }

    private static void lambda$setupListeners$31(ContextualResourceTracker contextualResourceTracker) {
        block9: {
            PhysicalSimulationEngine physicalSimulationEngine;
            UserIdentityManager userIdentityManager;
            JF jF;
            block8: {
                jF = TemporalMetadataResolver.h.O().p().Q();
                try {
                    if (jF == null) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemLifecycleController.a(customSystemException);
                }
                userIdentityManager = jF.q(contextualResourceTracker.v());
                try {
                    if (userIdentityManager == null) {
                        return;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemLifecycleController.a(customSystemException);
                }
                physicalSimulationEngine = new PhysicalSimulationEngine(contextualResourceTracker.D());
                try {
                    if (!contextualResourceTracker.v().equals(TemporalMetadataResolver.h.O().n().s())) break block8;
                    jF.A(new ReflectiveIntrospectionEngine(TemporalMetadataResolver.h.O().n(), physicalSimulationEngine));
                    break block9;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemLifecycleController.a(customSystemException);
                }
            }
            jF.A(new ReflectiveIntrospectionEngine(userIdentityManager, physicalSimulationEngine));
        }
    }

    private static void lambda$setupListeners$25(NetworkProtocolHandler2036 networkProtocolHandler2036) {
        NetworkConnectionBroker2678 networkConnectionBroker2678 = TemporalMetadataResolver.h.O().p().P(TemporalMetadataResolver.h.O().t().O(networkProtocolHandler2036.o().r(), () -> SystemLifecycleController.lambda$null$24(networkProtocolHandler2036)));
        try {
            if (networkConnectionBroker2678 == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        TemporalMetadataResolver.h.O().p().H(networkConnectionBroker2678);
    }

    private static UserIdentityManager lambda$null$22(SecureTransmissionHandler2454 secureTransmissionHandler2454) {
        return new UserIdentityManager(secureTransmissionHandler2454.r());
    }

    private static UserIdentityManager lambda$null$8(SessionEncryptionManager sessionEncryptionManager) {
        return new UserIdentityManager(sessionEncryptionManager.D());
    }

    private static void lambda$setupListeners$21(Runnable runnable, TransactionValidator2148 transactionValidator2148) {
        runnable.run();
    }

    private static Field c(long l, long l2) {
        int n = SystemLifecycleController.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = SystemLifecycleController.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SystemLifecycleController.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SystemLifecycleController.a(clazz3, string2, clazz2)) != null) {
                    SystemLifecycleController.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SystemLifecycleController.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SystemLifecycleController.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SystemLifecycleController.b(257075783176164L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void lambda$setupListeners$23(SecureTransmissionHandler2454 secureTransmissionHandler2454) {
        NetworkConnectionBroker2678 networkConnectionBroker2678 = new NetworkConnectionBroker2678(TemporalMetadataResolver.h.O().t().O(secureTransmissionHandler2454.r().r(), () -> SystemLifecycleController.lambda$null$22(secureTransmissionHandler2454)));
        TemporalMetadataResolver.h.O().p().h(networkConnectionBroker2678);
    }

    private static void lambda$setupListeners$30(SecureChannelNegotiator2460 secureChannelNegotiator2460) {
        JF jF = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        UserIdentityManager userIdentityManager = jF.q(secureChannelNegotiator2460.g());
        try {
            if (userIdentityManager == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        jF.u(userIdentityManager);
    }

    public boolean N() {
        return this.Z;
    }

    private static void lambda$setupListeners$36(ConnectionEndpointResolver connectionEndpointResolver) {
        UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.O().t().w(connectionEndpointResolver.R());
        try {
            if (userIdentityManager != null) {
                userIdentityManager.B(connectionEndpointResolver.D());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
    }

    private static void lambda$setupListeners$12(Zt zt) {
        TemporalMetadataResolver.h.O().u().T(new NetworkConnectionManager2517(zt.y()));
    }

    public boolean y() {
        return this.h;
    }

    private static void lambda$setupListeners$13(TimestampTracker2469 timestampTracker2469) {
        TemporalMetadataResolver.h.O().u().o(timestampTracker2469.M());
    }

    private static void lambda$setupListeners$27(CryptographicKeyManager2017 cryptographicKeyManager2017) {
        JF jF = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        jF.W(cryptographicKeyManager2017.e());
    }

    /*
     * Loose catch block
     */
    private void lambda$null$2(AtomicReference atomicReference) {
        block23: {
            int n;
            block25: {
                CryptographicModeEnum cryptographicModeEnum;
                block24: {
                    SecurityPolicyValidator securityPolicyValidator = this.G;
                    cryptographicModeEnum = this.f;
                    try {
                        if (cryptographicModeEnum == CryptographicModeEnum.OUTDATED_CLIENT) {
                            return;
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        throw SystemLifecycleController.a(interruptedException);
                    }
                    try {
                        if (cryptographicModeEnum != CryptographicModeEnum.OUTDATED_SERVER) {
                            this.o(CryptographicModeEnum.OFFLINE);
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        throw SystemLifecycleController.a(interruptedException);
                    }
                    try {
                        if (securityPolicyValidator == SecurityPolicyValidator.LOGGED_IN_FROM_ANOTHER_LOCATION) {
                            GraphicalRenderingController.D(ReflectionProxyHandler.class).Z();
                            return;
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        throw SystemLifecycleController.a(interruptedException);
                    }
                    try {
                        if (securityPolicyValidator == SecurityPolicyValidator.BANNED) {
                            this.r(NetworkConfigurationEnum.BANNED);
                            return;
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        throw SystemLifecycleController.a(interruptedException);
                    }
                    if (this.Z) break block23;
                    try {
                        block26: {
                            if (securityPolicyValidator == null) break block24;
                            break block26;
                            catch (InterruptedException interruptedException) {
                                throw SystemLifecycleController.a(interruptedException);
                            }
                        }
                        if (!securityPolicyValidator.Y()) break block23;
                    }
                    catch (InterruptedException interruptedException) {
                        throw SystemLifecycleController.a(interruptedException);
                    }
                }
                n = 5 * ++this.P;
                try {
                    if (n <= 30 && cryptographicModeEnum != CryptographicModeEnum.OUTDATED_SERVER) break block25;
                }
                catch (InterruptedException interruptedException) {
                    throw SystemLifecycleController.a(interruptedException);
                }
                n = 30;
            }
            try {
                this.H = System.currentTimeMillis() + (long)(n *= 1000);
                Thread.sleep(n);
            }
            catch (InterruptedException interruptedException) {
                this.H = -1L;
                return;
            }
            try {
                if (this.D == atomicReference.get()) {
                    this.N();
                }
            }
            catch (InterruptedException interruptedException) {
                throw SystemLifecycleController.a(interruptedException);
            }
            this.H = -1L;
        }
    }

    @Nullable
    public SecurityPolicyValidator I() {
        return this.G;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e9' || c == '\u00a3' || c == 'u' || c == 'D') {
                field = SystemLifecycleController.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SystemLifecycleController.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'k' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void N() {
        try {
            if (!this.f.D()) {
                return;
            }
        }
        catch (Throwable throwable) {
            throw SystemLifecycleController.a(throwable);
        }
        this.o((SecurityPolicyValidator)null);
        this.o(CryptographicModeEnum.CONNECTING);
        if (this.D != null) {
            try {
                this.D.interrupt();
                this.D = null;
            }
            catch (Throwable throwable) {
                TemporalMetadataResolver.W(throwable);
            }
        }
        AtomicReference<Thread> atomicReference = new AtomicReference<Thread>();
        Thread thread = new Thread(() -> this.lambda$connect$3(atomicReference));
        atomicReference.set(thread);
        thread.start();
        this.D = thread;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "+HP";
        objectArray[1] = Integer.TYPE;
        SystemLifecycleController.d[1] = "java/lang/Integer";
        objectArray[2] = "EUA5~\u0006NZPz\u0003\u001e]]Y3";
        objectArray[3] = "D\u0007\u001c\u0006:5O\b\rI[;D\u0003\t\u0013";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u001c K\u0018I<\u001d5BfB<{|\u0011\n@#\u0003>\u0018\u0000\u0019GB N\u0016Gx\u0012<O\f)";
    }

    public CryptographicModeEnum U() {
        return this.f;
    }

    private static UserIdentityManager lambda$null$28(ResourceAllocationTracker1589 resourceAllocationTracker1589) {
        return new UserIdentityManager(resourceAllocationTracker1589.p());
    }

    public void o(@Nullable SecurityPolicyValidator securityPolicyValidator) {
        this.G = securityPolicyValidator;
    }

    private void lambda$setupListeners$9(SessionEncryptionManager sessionEncryptionManager) {
        UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.O().t().O(sessionEncryptionManager.D().U(), () -> SystemLifecycleController.lambda$null$8(sessionEncryptionManager));
        userIdentityManager.n(sessionEncryptionManager.D());
        TemporalMetadataResolver.h.M().X(userIdentityManager);
        TemporalMetadataResolver.h.O().u().y(userIdentityManager);
        Boolean bl = this.q().U().h().get(userIdentityManager.s().r());
        try {
            if (bl != null) {
                userIdentityManager.f(bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        CipherTextProcessor.v();
    }

    private void lambda$connect$3(AtomicReference atomicReference) {
        try {
            this.Z = false;
            SecureContextBroker572.h().Y(this::lambda$null$1, () -> this.lambda$null$2(atomicReference));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void lambda$setupListeners$20(Runnable runnable, ConnectionBroker2515 connectionBroker2515) {
        runnable.run();
    }

    private static void lambda$setupListeners$29(Runnable runnable, ResourceAllocationTracker1589 resourceAllocationTracker1589) {
        block8: {
            UserIdentityManager userIdentityManager;
            block10: {
                JF jF;
                block9: {
                    block7: {
                        long l = a ^ 0x73FE63865F88L;
                        jF = TemporalMetadataResolver.h.O().p().Q();
                        try {
                            if (jF == null) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemLifecycleController.a(customSystemException);
                        }
                        userIdentityManager = TemporalMetadataResolver.h.O().t().O(resourceAllocationTracker1589.p().I(), () -> SystemLifecycleController.lambda$null$28(resourceAllocationTracker1589));
                        try {
                            if (resourceAllocationTracker1589.m() != zI.ADD) break block7;
                            jF.W(userIdentityManager);
                            jF.c(userIdentityManager);
                            userIdentityManager.c(resourceAllocationTracker1589.p().e());
                            TemporalMetadataResolver.h.c().t(userIdentityManager.j() + (String)((Object)SystemLifecycleController.a("k", (int)((int)b), (long)-3457891208988869112L, (long)l)), "", CryptoConfigurationRegistry383.FRIENDS_PARTY_GENERAL, 3000L);
                            break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemLifecycleController.a(customSystemException);
                        }
                    }
                    try {
                        if (!userIdentityManager.equals(TemporalMetadataResolver.h.O().n())) break block9;
                        runnable.run();
                        break block10;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemLifecycleController.a(customSystemException);
                    }
                }
                jF.F(userIdentityManager);
            }
            userIdentityManager.c(-1);
        }
    }

    public CryptoDataOrchestrator c() {
        return this.Q;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(1925882045288290521L, -1923892319932430307L, MethodHandles.lookup().lookupClass()).a(281087664336272L);
        c = new Object[5];
        d = new String[5];
        SystemLifecycleController.a();
        long l = a ^ 0x5B6125BE8F7AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 1072935281648262497L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                C = new SystemLifecycleController();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public void v() {
        Channel channel = SecureContextBroker572.h().c().Y();
        try {
            if (channel == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        C.v(true);
        channel.close();
        C.o(CryptographicModeEnum.OFFLINE);
    }

    private static void lambda$setupListeners$26(CryptographicKeyManager2408 cryptographicKeyManager2408) {
        JF jF = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        jF.z(cryptographicKeyManager2408.R());
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/YK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void o(CryptographicModeEnum cryptographicModeEnum) {
        block4: {
            try {
                try {
                    if (cryptographicModeEnum != CryptographicModeEnum.OFFLINE || this.f == cryptographicModeEnum) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemLifecycleController.a(customSystemException);
                }
                TemporalMetadataResolver.h.O().I();
                GraphicalRenderingController.D(ReflectionProxyHandler.class).P();
            }
            catch (CustomSystemException customSystemException) {
                throw SystemLifecycleController.a(customSystemException);
            }
        }
        this.f = cryptographicModeEnum;
        GraphicalRenderingController.st.execute(() -> SystemLifecycleController.lambda$setState$5(cryptographicModeEnum));
    }

    private static void lambda$setAccountState$6(NetworkConfigurationEnum networkConfigurationEnum, CryptographicModeEnum cryptographicModeEnum) {
        DistributedCacheOrchestrator.kW.l(networkConfigurationEnum, cryptographicModeEnum);
    }

    public boolean b(long l) {
        boolean bl;
        block5: {
            block4: {
                long l2 = TemporalMetadataResolver.h.r().D();
                try {
                    try {
                        if (l2 == -1L || l2 != l) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemLifecycleController.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemLifecycleController.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public SystemLifecycleController() {
        this.U = NetworkConfigurationEnum.CONNECTING;
        this.Y = new NetworkConfigManager();
        this.y = new DistributedCacheManager();
        this.Q = new CryptoDataOrchestrator();
    }

    private static void lambda$setupListeners$18(Consumer consumer, ProtocolVersionResolver protocolVersionResolver) {
        consumer.accept(protocolVersionResolver.g());
    }

    private static void lambda$setupListeners$35(TimestampedResourceTracker2101 timestampedResourceTracker2101) {
        try {
            if (timestampedResourceTracker2101.c() == TemporalMetadataResolver.h.O().n().s().r()) {
                TemporalMetadataResolver.h.O().n().A(timestampedResourceTracker2101.b());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.O().t().w(timestampedResourceTracker2101.c());
        try {
            if (userIdentityManager != null) {
                userIdentityManager.A(timestampedResourceTracker2101.b());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static void lambda$setupListeners$17(Consumer consumer, EncryptionEngine encryptionEngine) {
        consumer.accept(encryptionEngine.E());
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SystemLifecycleController.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SystemLifecycleController.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void lambda$setupListeners$33(AuditTraceLogger auditTraceLogger) {
        UserIdentityManager userIdentityManager = TemporalMetadataResolver.h.O().t().w(auditTraceLogger.s());
        try {
            if (userIdentityManager != null) {
                userIdentityManager.J(auditTraceLogger.S(), auditTraceLogger.a());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SystemLifecycleController.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SystemLifecycleController.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean B(@Nullable ew ew2) {
        boolean bl;
        block7: {
            block6: {
                long l = TemporalMetadataResolver.h.r().D();
                try {
                    try {
                        try {
                            if (ew2 == null || l == -1L) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SystemLifecycleController.a(customSystemException);
                        }
                        if (l != ew2.y()) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SystemLifecycleController.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw SystemLifecycleController.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public void v(boolean bl) {
        this.Z = bl;
    }

    public DistributedCacheManager q() {
        return this.y;
    }

    private static void lambda$setupListeners$32(CacheMemoryManager1616 cacheMemoryManager1616) {
        JF jF = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        ConfigurationProfileResolver<?, ?> configurationProfileResolver = jF.b().get((Object)cacheMemoryManager1616.r());
        try {
            if (configurationProfileResolver != null) {
                configurationProfileResolver.H(cacheMemoryManager1616.i());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SystemLifecycleController.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                SystemLifecycleController.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void S() {
        String string = LoggingContextManager.q();
        SecureContextBroker572.h().c().F(string, this::lambda$startup$4);
    }

    private static void lambda$setupListeners$19() {
        JF jF = TemporalMetadataResolver.h.O().p().Q();
        try {
            if (jF == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SystemLifecycleController.a(customSystemException);
        }
        TemporalMetadataResolver.h.O().p().A(null);
        TemporalMetadataResolver.h.O().n().c(-1);
        for (UserIdentityManager userIdentityManager : TemporalMetadataResolver.h.O().t().Z()) {
            userIdentityManager.c(-1);
        }
    }

    public NetworkConfigManager C() {
        return this.Y;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SystemLifecycleController.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

