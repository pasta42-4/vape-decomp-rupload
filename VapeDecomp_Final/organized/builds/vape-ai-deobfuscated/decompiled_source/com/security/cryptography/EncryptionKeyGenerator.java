/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package com.security.cryptography;

import a.Cz;
import a._b;
import a.bE;
import a.fu;
import com.analytics.compression.AdvancedMetricCompressor;
import com.app.event.dispatch.EventDispatchCoordinator2329;
import com.app.logging.core.LoggingInterceptor2041;
import com.app.network.CommunicationProtocolManager1453;
import com.app.rendering.graphics.VisualizationRenderer;
import com.app.security.AuthenticationMediator2179;
import com.app.security.auth.AuthenticationDelegate2186;
import com.cache.management.ResourceCacheValidator;
import com.collections.management.MultiContainerRegistry;
import com.concurrent.scheduling.AsynchronousTaskScheduler1046;
import com.configuration.management.ConfigurationParameterController;
import com.context.negotiation.DynamicContextNegotiator;
import com.core.computation.AbstractComputationKernel;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.core.lifecycle.ObjectLifecycleManager;
import com.datastreaming.core.StreamProcessingController;
import com.encoding.strategy.EncodingScheme;
import com.exception.system.CustomSystemException;
import com.execution.validation.ExecutionStateValidator;
import com.financial.validation.TransactionValidator1458;
import com.game.configuration.GameVersionEnumerator;
import com.google.gson.JsonObject;
import com.graphics.rendering.VisualRenderingContext;
import com.network.communication.CommunicationChannelManager2488;
import com.network.protocol.NetworkProtocolEncoder1226;
import com.network.protocol.ProtocolInteractionController;
import com.networking.routing.MessageRouteResolver;
import com.resource.allocation.ResourceAllocationTracker2098;
import com.resource.lifecycle.ResourceLifecycleManager1951;
import com.resource.management.ResourceLifecycleHandler2095;
import com.runtime.context.DynamicContextBroker;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.mediation.RuntimeContextMediator;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.context.SecureContextBroker572;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CryptographicKeyManager426;
import com.security.crypto.CryptographicModeEnum;
import com.security.crypto.CryptographicParameterGenerator;
import com.security.crypto.CryptographicSessionController;
import com.security.protocol.EncryptionProtocolHandler;
import com.security.session.CipherSessionManager;
import com.state.management.StateTransitionController;
import com.system.configuration.ConfigurationManager;
import com.system.configuration.ConfigurationProfileManager1223;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.system.lifecycle.SystemLifecycleController;
import com.system.orchestration.SystemOrchestrationManager;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.logging.TransactionLogOrchestrator;
import com.transaction.monitoring.TransactionStatusTracker;
import com.transaction.validation.TransactionValidator1298;
import com.ui.rendering.GraphicalRenderingController;
import com.vape.performance.VapeInterfaceOptimizer;
import com.vape.ui.VapeInterfaceController;
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
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class EncryptionKeyGenerator
extends CipherSessionManager {
    private EncryptionProtocolHandler zt;
    private static final String[] rb;
    private GraphicalRenderingController zp;
    private HashMap<String, AbstractComputationKernel[]> zK;
    private static final Object[] qb;
    private static final Integer[] fb;
    private static final Map lb;
    private DynamicContextBroker zm;
    private ObjectLifecycleManager zN;
    private static final long[] eb;
    private static final long ab;

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = EncryptionKeyGenerator.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EncryptionKeyGenerator.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void lambda$addDebugTools$14() {
        long l = ab ^ 0x2D9AFD4F74D7L;
        for (int i = 0; i < 45; ++i) {
            LightweightExecutionContext lightweightExecutionContext = ApplicationLifecycleManager.U().l().F(i);
            try {
                if (lightweightExecutionContext.Y()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EncryptionKeyGenerator.a(customSystemException);
            }
            TemporalMetadataResolver.x((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)28176, (long)(0x4AB8765A45FBA44BL ^ l)), (long)-2374703011732730609L, (long)l)) + lightweightExecutionContext.g() + (String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)4528, (long)(0x6B6433087007DBE8L ^ l)), (long)-2374703011732730609L, (long)l)) + ProtocolInteractionController.l(lightweightExecutionContext.C()) + (String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)10700, (long)(0x6A180AEE93BB6387L ^ l)), (long)-2374703011732730609L, (long)l)) + i);
        }
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field o(long l, long l2) {
        int n = EncryptionKeyGenerator.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = EncryptionKeyGenerator.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EncryptionKeyGenerator.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EncryptionKeyGenerator.g(clazz3, string2, clazz2)) != null) {
                    EncryptionKeyGenerator.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EncryptionKeyGenerator.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EncryptionKeyGenerator.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EncryptionKeyGenerator.n(275392049603347L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void a(String string, AbstractComputationKernel ... abstractComputationKernelArray) {
        this.zK.put(string, abstractComputationKernelArray);
        this.n(new VisualRenderingContext(string).N(new VapeInterfaceOptimizer(this, string)), new Object[0]);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (rb[n4] != null) {
            return n4;
        }
        Object object = qb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 16;
                break;
            }
            case 2: {
                n3 = 14;
                break;
            }
            case 3: {
                n3 = 51;
                break;
            }
            case 4: {
                n3 = 59;
                break;
            }
            case 5: {
                n3 = 47;
                break;
            }
            case 6: {
                n3 = 24;
                break;
            }
            case 7: {
                n3 = 32;
                break;
            }
            case 8: {
                n3 = 5;
                break;
            }
            case 9: {
                n3 = 54;
                break;
            }
            case 10: {
                n3 = 41;
                break;
            }
            case 11: {
                n3 = 53;
                break;
            }
            case 12: {
                n3 = 57;
                break;
            }
            case 13: {
                n3 = 31;
                break;
            }
            case 14: {
                n3 = 33;
                break;
            }
            case 15: {
                n3 = 4;
                break;
            }
            case 16: {
                n3 = 27;
                break;
            }
            case 17: {
                n3 = 46;
                break;
            }
            case 18: {
                n3 = 11;
                break;
            }
            case 19: {
                n3 = 12;
                break;
            }
            case 20: {
                n3 = 63;
                break;
            }
            case 21: {
                n3 = 37;
                break;
            }
            case 22: {
                n3 = 38;
                break;
            }
            case 23: {
                n3 = 3;
                break;
            }
            case 24: {
                n3 = 29;
                break;
            }
            case 25: {
                n3 = 61;
                break;
            }
            case 26: {
                n3 = 45;
                break;
            }
            case 27: {
                n3 = 58;
                break;
            }
            case 28: {
                n3 = 55;
                break;
            }
            case 29: {
                n3 = 34;
                break;
            }
            case 30: {
                n3 = 44;
                break;
            }
            case 31: {
                n3 = 17;
                break;
            }
            case 32: {
                n3 = 28;
                break;
            }
            case 33: {
                n3 = 40;
                break;
            }
            case 34: {
                n3 = 8;
                break;
            }
            case 35: {
                n3 = 43;
                break;
            }
            case 36: {
                n3 = 22;
                break;
            }
            case 37: {
                n3 = 6;
                break;
            }
            case 38: {
                n3 = 49;
                break;
            }
            case 39: {
                n3 = 0;
                break;
            }
            case 40: {
                n3 = 13;
                break;
            }
            case 41: {
                n3 = 7;
                break;
            }
            case 42: {
                n3 = 56;
                break;
            }
            case 43: {
                n3 = 35;
                break;
            }
            case 44: {
                n3 = 42;
                break;
            }
            case 45: {
                n3 = 19;
                break;
            }
            case 46: {
                n3 = 36;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 48;
                break;
            }
            case 49: {
                n3 = 39;
                break;
            }
            case 50: {
                n3 = 52;
                break;
            }
            case 51: {
                n3 = 25;
                break;
            }
            case 52: {
                n3 = 26;
                break;
            }
            case 53: {
                n3 = 62;
                break;
            }
            case 54: {
                n3 = 50;
                break;
            }
            case 55: {
                n3 = 18;
                break;
            }
            case 56: {
                n3 = 10;
                break;
            }
            case 57: {
                n3 = 9;
                break;
            }
            case 58: {
                n3 = 20;
                break;
            }
            case 59: {
                n3 = 23;
                break;
            }
            case 60: {
                n3 = 2;
                break;
            }
            case 61: {
                n3 = 60;
                break;
            }
            case 62: {
                n3 = 30;
                break;
            }
            default: {
                n3 = 21;
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
        EncryptionKeyGenerator.rb[n4] = new String(cArray);
        return n4;
    }

    private static void lambda$null$6(TransactionStatusTracker transactionStatusTracker) {
        long l = ab ^ 0x58EC8D682286L;
        TemporalMetadataResolver.x((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)6264, (long)(0x7DD112F922548468L ^ l)), (long)-8549475556704806050L, (long)l)) + transactionStatusTracker);
    }

    static CryptographicKeyManager426 P(EncryptionKeyGenerator encryptionKeyGenerator, String string) {
        return encryptionKeyGenerator.o(string);
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EncryptionKeyGenerator.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static HashMap j(EncryptionKeyGenerator encryptionKeyGenerator) {
        return encryptionKeyGenerator.zK;
    }

    private static Method p(long l, long l2) {
        int n = EncryptionKeyGenerator.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = rb[n];
                int n3 = string2.indexOf(8);
                clazz3 = EncryptionKeyGenerator.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EncryptionKeyGenerator.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EncryptionKeyGenerator.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        EncryptionKeyGenerator.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EncryptionKeyGenerator.n(275392049603347L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EncryptionKeyGenerator.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EncryptionKeyGenerator.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EncryptionKeyGenerator.n(275392049603347L, 0L);
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

    private void lambda$addDebugTools$15() {
        for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.J()) {
            if (!(cipherSessionManager instanceof fu)) continue;
            fu fu2 = (fu)cipherSessionManager;
            fu2.N(true);
            for (AbstractComputationKernel abstractComputationKernel : fu2.A()) {
                if (!(abstractComputationKernel instanceof SystemOrchestrationManager)) continue;
                SystemOrchestrationManager systemOrchestrationManager = (SystemOrchestrationManager)abstractComputationKernel;
                systemOrchestrationManager.o();
            }
        }
        GraphicalRenderingController.i();
        this.J();
    }

    private static void lambda$new$8() {
        long l = ab ^ 0x7DC17D4A834BL;
        TemporalMetadataResolver.x((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)10124, (long)(0x2384726D618C9A47L ^ l)), (long)2924820135805663891L, (long)l)));
        JsonObject jsonObject = TemporalMetadataResolver.h.u().Y(true);
        ((CompletableFuture)_b.S().c().s(jsonObject).thenAccept(EncryptionKeyGenerator::lambda$null$6)).exceptionally(EncryptionKeyGenerator::lambda$null$7);
    }

    private static Void lambda$null$7(Throwable throwable) {
        TemporalMetadataResolver.W(throwable);
        return null;
    }

    private static void lambda$null$3(TransactionStatusTracker transactionStatusTracker) {
        long l = ab ^ 0x3414556EC5B8L;
        TemporalMetadataResolver.x((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)29285, (long)(0x249041AE58FF8974L ^ l)), (long)7954559532288408672L, (long)l)) + transactionStatusTracker);
    }

    @Override
    public String A() {
        long l = ab ^ 0x6FF0543AE84CL;
        return EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)5228, (long)(0x3297000EFDDA4285L ^ l)), (long)4868424577202213268L, (long)l);
    }

    private static Void lambda$null$4(Throwable throwable) {
        TemporalMetadataResolver.W(throwable);
        return null;
    }

    private static void lambda$new$5() {
        long l = ab ^ 0x248C656C54B8L;
        TemporalMetadataResolver.x((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)3058, (long)(0x66C19649C08061D2L ^ l)), (long)-43816466839114400L, (long)l)));
        ((CompletableFuture)_b.S().c().E().thenAccept(EncryptionKeyGenerator::lambda$null$3)).exceptionally(EncryptionKeyGenerator::lambda$null$4);
    }

    private void Z() {
        long l = ab ^ 0x7C2B2D344997L;
        this.a((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)8408, (long)(0x26673ED9653557C4L ^ l)), (long)-2140602351878803377L, (long)l)), new TransactionValidator1458((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)26185, (long)(0x72BF3ACD5F839156L ^ l)), (long)-2140602351878803377L, (long)l)), EncryptionKeyGenerator::lambda$addDebugTools$14), new TransactionValidator1458((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)28674, (long)(0x42CC74F43987870AL ^ l)), (long)-2140602351878803377L, (long)l)), this::lambda$addDebugTools$15), new TransactionValidator1458((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)4423, (long)(0xA48E7ECBD886640L ^ l)), (long)-2140602351878803377L, (long)l)), EncryptionKeyGenerator::lambda$addDebugTools$16), new TransactionValidator1458((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)31671, (long)(0x7D8A5D0B82C08C8EL ^ l)), (long)-2140602351878803377L, (long)l)), EncryptionKeyGenerator::lambda$addDebugTools$17), new TransactionValidator1458((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)29887, (long)(0x6DBB3C85CA6103A5L ^ l)), (long)-2140602351878803377L, (long)l)), DynamicContextNegotiator::R), new TransactionValidator1458((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)26463, (long)(0x13BBB445D96905DL ^ l)), (long)-2140602351878803377L, (long)l)), CryptographicSessionController::G));
    }

    private static void T() {
        Object[] objectArray = qb;
        qb[0] = "\u0002Sk";
        objectArray[1] = Integer.TYPE;
        EncryptionKeyGenerator.rb[1] = "java/lang/Integer";
        objectArray[2] = "\u001f/\fQ\u0019\u0006\u0014 \u001d\u001ed\u001e\u0007'\u0014W";
        objectArray[3] = "Z<zj\u0006\u0019Q3k%g\u0017Z8o\u007f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "pqcfC9ng=\u001b\u0018/\u0010'bx\u000fdvd9v\u0014T)`1$\u00134lre\"s";
    }

    static DynamicContextBroker L(EncryptionKeyGenerator encryptionKeyGenerator) {
        return encryptionKeyGenerator.zm;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void d() {
        block18: {
            TransactionLogOrchestrator transactionLogOrchestrator;
            block20: {
                CryptographicKeyManager426 cryptographicKeyManager426;
                block19: {
                    transactionLogOrchestrator = GraphicalRenderingController.D(TransactionLogOrchestrator.class);
                    cryptographicKeyManager426 = GraphicalRenderingController.D(CryptographicKeyManager426.class);
                    try {
                        try {
                            try {
                                try {
                                    if (!cryptographicKeyManager426.f() && !transactionLogOrchestrator.f()) break block18;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw EncryptionKeyGenerator.a(customSystemException);
                                }
                                if (!this.f()) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EncryptionKeyGenerator.a(customSystemException);
                            }
                            if (!cryptographicKeyManager426.f()) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EncryptionKeyGenerator.a(customSystemException);
                        }
                        this.r(false, false);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EncryptionKeyGenerator.a(customSystemException);
                    }
                }
                try {
                    if (!cryptographicKeyManager426.f()) break block20;
                    this.m(cryptographicKeyManager426.G(), cryptographicKeyManager426.W());
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw EncryptionKeyGenerator.a(customSystemException);
                }
            }
            try {
                try {
                    try {
                        if (!transactionLogOrchestrator.f() || this.G() == transactionLogOrchestrator.G()) return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EncryptionKeyGenerator.a(customSystemException);
                    }
                    if (this.W() == transactionLogOrchestrator.W()) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw EncryptionKeyGenerator.a(customSystemException);
                }
                this.m(transactionLogOrchestrator.G(), transactionLogOrchestrator.W());
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw EncryptionKeyGenerator.a(customSystemException);
            }
        }
        try {
            if (this.f()) return;
            this.r(true, false);
            return;
        }
        catch (CustomSystemException customSystemException) {
            throw EncryptionKeyGenerator.a(customSystemException);
        }
    }

    private static int lambda$sortGui$13(CipherSessionManager cipherSessionManager, CipherSessionManager cipherSessionManager2) {
        try {
            if (cipherSessionManager.b() == cipherSessionManager2.b()) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EncryptionKeyGenerator.a(customSystemException);
        }
        return Double.compare(cipherSessionManager2.b(), cipherSessionManager.b());
    }

    private static boolean lambda$sortGui$12(CipherSessionManager cipherSessionManager) {
        boolean bl;
        block12: {
            block11: {
                try {
                    block10: {
                        try {
                            try {
                                try {
                                    try {
                                        if (!cipherSessionManager.f() || cipherSessionManager.N()) break block10;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw EncryptionKeyGenerator.a(customSystemException);
                                    }
                                    if (!cipherSessionManager.m()) break block10;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw EncryptionKeyGenerator.a(customSystemException);
                                }
                                if (cipherSessionManager instanceof RuntimeContextMediator) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EncryptionKeyGenerator.a(customSystemException);
                            }
                            if (!(cipherSessionManager instanceof CipherContextManager1101)) break block11;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EncryptionKeyGenerator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw EncryptionKeyGenerator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private CryptographicKeyManager426 o(String string) {
        CryptographicKeyManager426 cryptographicKeyManager426 = GraphicalRenderingController.D(CryptographicKeyManager426.class).o(string);
        cryptographicKeyManager426.X();
        this.p(cryptographicKeyManager426);
        cryptographicKeyManager426.k();
        return cryptographicKeyManager426;
    }

    private static void lambda$addDebugTools$17() {
        TemporalMetadataResolver.h.W().P();
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EncryptionKeyGenerator.m(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                EncryptionKeyGenerator.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c8' || c == 'G' || c == '\u00cc' || c == '\u00e5') {
                field = EncryptionKeyGenerator.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EncryptionKeyGenerator.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'N' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'R' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EncryptionKeyGenerator.ab = MultiContainerRegistry.a(-3715550106654707243L, -8483446321820772072L, MethodHandles.lookup().lookupClass()).a(49332038850455L);
                EncryptionKeyGenerator.qb = new Object[5];
                EncryptionKeyGenerator.rb = new String[5];
                EncryptionKeyGenerator.T();
                EncryptionKeyGenerator.lb = new HashMap<K, V>(13);
                var0 = EncryptionKeyGenerator.ab ^ 103812758390150L;
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
                var8_3 = new long[49];
                var5_4 = 0;
                var6_5 = "\u00a0\u00c0\u00be\u007f\"\u009f\u00e6_\u00d5\u0081\u00bc\u00043\u008c\u00a3X+\u0082\u00bb\u008b\u00fc\u00c1fn\r\u00a07\u000e\u00ba\u00cb\u00a6\"R\u0095\u00c8\u00a1\u0016\u001d\u00bb\u00e7\u00b4>y\u00c1\n\u00de<b5w\u009c\u0086\u008fYk/\u00e4\u00e7y\u00fb\u00dd\u0096X\u00bc\u000e\u00feh)\u0019\u0099\u00114\u00c1\u00baA8\u00071\u00848\u009cK{\u0080\u00e2\u00f1)\u00c8\u00d6\\\u00ab^\u00cc6|\u00c8k\u00a0\u0005\u00b0\u009d\u009b\u0010\u00db\u00d1\u0000-\u00f8\u008d\u00a8\u00f0\u00c3\u00ae\u00f8\u00cd\u00e4\u00a50\u00fbn\n/\u00fb\u009cn\u0011\u00bf\u0006\u00c5\u00e7\u000b\u0080/\u00a9ef(\u00f5\b\u00f7)Z\u00a1\u00c5\fDV\u00f7*\u009a\u00f3\u009e5h\u0005!\u00dbBJ\u0083\u009a\u00f9\u0010Fu\u009a2\u00d3:\u00d2Vd\u0007\u009b\u00efo\u0094\u0019\t\u00cf\u00f6*\u00ce\u008f\u001bE0\u009b\u001f\u0091&\u00dc\\\u00d5\u00b1\u0003\"\f\u00f4\u0012\u00014\u0015\u00bf\u0011\u00c9\u00ca]\u00ac\u00b1O\u00b5\u00d7\u00f8D'\u00dfd\u0093}\u0095U,a\u00ef9l\u008cf\u000f1\u00a9\u00c2ye!\u0006\u0004\\r\u00b5\u009bu\n\u00ab\u00ca\u00c2\u0099ty;Z\u00e6\u00c4\u00b2u\u00bd\u00b8\u00ef\u0089}\u00a0\u008f\u00da\u00ec\u0006\u0089~\u00ca\u00eb\u00ca\u00e1\u00c3P3\u00a8f\u0088\u00cfm\u00ad\u00b0T\u0019\u008fG\u008d\u00c2p\u00c9\u00df\u00b0\u000ft\u0083R\u00e8\u00cd\u0081\u0017!\u001e\u00e2}\u00ad\n\u00fal\fY\u009f:Y\\\u0004\u00b7\u00d4D\u00cd\n\u00b2ZB\u00a4^x\u00b3\u00cc^\u00ea\u00e7\u00bf\u0090\u00c8\u0007\u00d3\u00fe\u009a0\u009c\f\u00ce\u0011\u0092V\u0093t9p\u0019\u0080\u009432\u000e\u00a9\u00ac@\u001ajK\u00c7\u00a5\u00e3\u001c\u00c2\u00f2\u008c\u00eeRbaV\u00e6\f\u00c1";
                var7_6 = "\u00a0\u00c0\u00be\u007f\"\u009f\u00e6_\u00d5\u0081\u00bc\u00043\u008c\u00a3X+\u0082\u00bb\u008b\u00fc\u00c1fn\r\u00a07\u000e\u00ba\u00cb\u00a6\"R\u0095\u00c8\u00a1\u0016\u001d\u00bb\u00e7\u00b4>y\u00c1\n\u00de<b5w\u009c\u0086\u008fYk/\u00e4\u00e7y\u00fb\u00dd\u0096X\u00bc\u000e\u00feh)\u0019\u0099\u00114\u00c1\u00baA8\u00071\u00848\u009cK{\u0080\u00e2\u00f1)\u00c8\u00d6\\\u00ab^\u00cc6|\u00c8k\u00a0\u0005\u00b0\u009d\u009b\u0010\u00db\u00d1\u0000-\u00f8\u008d\u00a8\u00f0\u00c3\u00ae\u00f8\u00cd\u00e4\u00a50\u00fbn\n/\u00fb\u009cn\u0011\u00bf\u0006\u00c5\u00e7\u000b\u0080/\u00a9ef(\u00f5\b\u00f7)Z\u00a1\u00c5\fDV\u00f7*\u009a\u00f3\u009e5h\u0005!\u00dbBJ\u0083\u009a\u00f9\u0010Fu\u009a2\u00d3:\u00d2Vd\u0007\u009b\u00efo\u0094\u0019\t\u00cf\u00f6*\u00ce\u008f\u001bE0\u009b\u001f\u0091&\u00dc\\\u00d5\u00b1\u0003\"\f\u00f4\u0012\u00014\u0015\u00bf\u0011\u00c9\u00ca]\u00ac\u00b1O\u00b5\u00d7\u00f8D'\u00dfd\u0093}\u0095U,a\u00ef9l\u008cf\u000f1\u00a9\u00c2ye!\u0006\u0004\\r\u00b5\u009bu\n\u00ab\u00ca\u00c2\u0099ty;Z\u00e6\u00c4\u00b2u\u00bd\u00b8\u00ef\u0089}\u00a0\u008f\u00da\u00ec\u0006\u0089~\u00ca\u00eb\u00ca\u00e1\u00c3P3\u00a8f\u0088\u00cfm\u00ad\u00b0T\u0019\u008fG\u008d\u00c2p\u00c9\u00df\u00b0\u000ft\u0083R\u00e8\u00cd\u0081\u0017!\u001e\u00e2}\u00ad\n\u00fal\fY\u009f:Y\\\u0004\u00b7\u00d4D\u00cd\n\u00b2ZB\u00a4^x\u00b3\u00cc^\u00ea\u00e7\u00bf\u0090\u00c8\u0007\u00d3\u00fe\u009a0\u009c\f\u00ce\u0011\u0092V\u0093t9p\u0019\u0080\u009432\u000e\u00a9\u00ac@\u001ajK\u00c7\u00a5\u00e3\u001c\u00c2\u00f2\u008c\u00eeRbaV\u00e6\f\u00c1".length();
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
                    var6_5 = " \u0091\u00bb\u00da-\u00c0}\u00deH\u00a5S\u00f8M\u00f4\\\u00d8";
                    var7_6 = " \u0091\u00bb\u00da-\u00c0}\u00deH\u00a5S\u00f8M\u00f4\\\u00d8".length();
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
        EncryptionKeyGenerator.eb = var8_3;
        EncryptionKeyGenerator.fb = new Integer[49];
    }

    private static void lambda$new$1() {
        String string;
        StringBuilder stringBuilder;
        CallSite callSite;
        AsynchronousTaskScheduler1046 asynchronousTaskScheduler1046;
        long l = ab ^ 0x63AC47330D78L;
        ConfigurationParameterController configurationParameterController = TemporalMetadataResolver.h.x().V(ApplicationLifecycleManager.U().a());
        try {
            asynchronousTaskScheduler1046 = TemporalMetadataResolver.h.c();
            callSite = EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)23356, (long)(0x2C1AF05843B468D6L ^ l)), (long)-6439001741917506400L, (long)l);
            stringBuilder = new StringBuilder().append((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)9227, (long)(0x5CC6ED4C14BA17E2L ^ l)), (long)-6439001741917506400L, (long)l)));
            string = configurationParameterController != null ? configurationParameterController.Z() : null;
        }
        catch (CustomSystemException customSystemException) {
            throw EncryptionKeyGenerator.a(customSystemException);
        }
        asynchronousTaskScheduler1046.L((String)((Object)callSite), stringBuilder.append(string).toString(), 3000L);
    }

    private static void lambda$new$2() {
        long l = ab ^ 0x58D0C848904AL;
        TemporalMetadataResolver.x((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)15081, (long)(0x41CABE8E5AFC943EL ^ l)), (long)4293664905142806930L, (long)l)));
        TemporalMetadataResolver.h.u().F();
    }

    private static void lambda$addDebugTools$16() {
        long l = ab ^ 0x17DC3518EAA6L;
        int n = 0;
        TemporalMetadataResolver.x((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)11487, (long)(0x45D308F48FAEF8F8L ^ l)), (long)4718196223105389438L, (long)l)) + GameVersionEnumerator.u());
        TemporalMetadataResolver.x((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)10547, (long)(0x8A75F0DCEBE7D37L ^ l)), (long)4718196223105389438L, (long)l)));
        while (true) {
            ObjectLifecycleTracker objectLifecycleTracker;
            if (GameVersionEnumerator.MC_1_16_5.H()) {
                block11: {
                    objectLifecycleTracker = CommunicationProtocolManager1453.J(n);
                    try {
                        try {
                            if (!objectLifecycleTracker.Y()) break block11;
                            if (n != 0) break;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EncryptionKeyGenerator.a(customSystemException);
                        }
                        ++n;
                        continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EncryptionKeyGenerator.a(customSystemException);
                    }
                }
                TemporalMetadataResolver.x(n + (String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)16246, (long)(0x362766C1A5D1EB76L ^ l)), (long)4718196223105389438L, (long)l)) + ((CommunicationProtocolManager1453)objectLifecycleTracker).j());
            } else {
                block12: {
                    objectLifecycleTracker = TransactionValidator1298.l(n);
                    try {
                        try {
                            if (!objectLifecycleTracker.Y()) break block12;
                            if (n != 0) break;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EncryptionKeyGenerator.a(customSystemException);
                        }
                        ++n;
                        continue;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EncryptionKeyGenerator.a(customSystemException);
                    }
                }
                TemporalMetadataResolver.x(n + (String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)25605, (long)(0x7E7EBCCEB38AB037L ^ l)), (long)4718196223105389438L, (long)l)) + ((TransactionValidator1298)objectLifecycleTracker).Y() + (String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)30082, (long)(0x3529D3FC830AA18FL ^ l)), (long)4718196223105389438L, (long)l)) + LoggingInterceptor2041.f(((TransactionValidator1298)objectLifecycleTracker).Y(), new Object[0]));
            }
            ++n;
        }
        TemporalMetadataResolver.x((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)31743, (long)(0x43512CB6D6FAFD7L ^ l)), (long)4718196223105389438L, (long)l)));
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x155F;
        if (fb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/fz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EncryptionKeyGenerator.fb[n2] = n3;
        }
        return fb[n2];
    }

    static void d(EncryptionKeyGenerator encryptionKeyGenerator) {
        encryptionKeyGenerator.J();
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void e(EncryptionKeyGenerator encryptionKeyGenerator) {
        encryptionKeyGenerator.Y();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static void lambda$new$11() {
        long l = ab ^ 0x3FD6A8A93F21L;
        try {
            if (SystemLifecycleController.C.U() != CryptographicModeEnum.ONLINE) {
                TemporalMetadataResolver.h.c().L((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)22634, (long)(0xFEE3352DB4DD9C9L ^ l)), (long)-7710920687682550023L, (long)l)), (String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)7662, (long)(0x2104DD4EAEC11C63L ^ l)), (long)-7710920687682550023L, (long)l)), 3000L);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EncryptionKeyGenerator.a(customSystemException);
        }
        SecureContextBroker572.h().c().W(EncryptionKeyGenerator::lambda$null$9, EncryptionKeyGenerator::lambda$null$10);
    }

    @Override
    public void i() {
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EncryptionKeyGenerator.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EncryptionKeyGenerator.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void lambda$new$0() {
        long l = ab ^ 0x367658841418L;
        StateTransitionController.V();
        TemporalMetadataResolver.h.c().L((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)30786, (long)(0x186ADDA9933D2D0L ^ l)), (long)-4628495498501313088L, (long)l)), (String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)19512, (long)(0x5F04623C40E966A4L ^ l)), (long)-4628495498501313088L, (long)l)), 3000L);
    }

    @Override
    public void u() {
    }

    private void J() {
        ArrayList<CipherSessionManager> arrayList = new ArrayList<CipherSessionManager>(GraphicalRenderingController.K.S().Y());
        arrayList.removeIf(EncryptionKeyGenerator::lambda$sortGui$12);
        try {
            arrayList.sort(EncryptionKeyGenerator::lambda$sortGui$13);
            CipherSessionManager cipherSessionManager = null;
            for (CipherSessionManager cipherSessionManager2 : arrayList) {
                if (!(cipherSessionManager2 instanceof CryptographicKeyManager426)) continue;
                cipherSessionManager = cipherSessionManager2;
                break;
            }
            try {
                if (cipherSessionManager != null) {
                    arrayList.remove(cipherSessionManager);
                    arrayList.add(0, cipherSessionManager);
                }
            }
            catch (Exception exception) {
                throw EncryptionKeyGenerator.a(exception);
            }
        }
        catch (Exception exception) {
            TemporalMetadataResolver.W(exception);
        }
        double d2 = 32.0;
        double d3 = 32.0;
        double d4 = 0.0;
        for (CipherSessionManager cipherSessionManager : arrayList) {
            double d5;
            if (d2 + cipherSessionManager.w() > (double)ApplicationLifecycleManager.P().s()) {
                d2 = 30.0;
                d3 += d4 + 4.0;
                d4 = 0.0;
            }
            try {
                double d6 = d5 = cipherSessionManager.b() > cipherSessionManager.Q() ? cipherSessionManager.Q() : cipherSessionManager.b();
            }
            catch (Exception exception) {
                throw EncryptionKeyGenerator.a(exception);
            }
            if (d5 > d4) {
                d4 = d5;
            }
            cipherSessionManager.m(d2, d3);
            d2 += cipherSessionManager.w() + 2.0;
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EncryptionKeyGenerator.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void y() {
        long l = ab ^ 0x747DF9A70546L;
        this.a((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)12502, (long)(0x66040D9C4CB30B07L ^ l)), (long)-5865369146699105122L, (long)l)), new AdaptiveCipherEngine(this.zp.sW), new AdaptiveCipherEngine(TemporalMetadataResolver.h.F().X), new AdaptiveCipherEngine(SystemLifecycleController.C.c().N()), new CommunicationChannelManager2488(this, TemporalMetadataResolver.h.F().P), new TransactionValidator1458((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)7550, (long)(0x7F0BD5ABC9532698L ^ l)), (long)-5865369146699105122L, (long)l)), new MessageRouteResolver(this)).g((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)2069, (long)(0x2200E016028933F9L ^ l)), (long)-5865369146699105122L, (long)l))));
        this.a((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)10646, (long)(0x519B469E45AA9249L ^ l)), (long)-5865369146699105122L, (long)l)), new VisualizationRenderer(EncryptionKeyGenerator.M.S), new AdaptiveCipherEngine(this.zm.A), new AdaptiveCipherEngine(this.zm.x), new AdaptiveCipherEngine(this.zm.w), new AdaptiveCipherEngine(this.zm.s), new ResourceLifecycleHandler2095(this, this.zm.Y), new ResourceAllocationTracker2098(this, this.zm.T));
        this.a((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)31501, (long)(0x36307AE7B2FC40CCL ^ l)), (long)-5865369146699105122L, (long)l)), new ExecutionStateValidator(this.zm.n), new AdaptiveCipherEngine(this.zm.F), new AdaptiveCipherEngine(this.zm.R), new AdaptiveCipherEngine(this.zm.O), new AdaptiveCipherEngine(this.zm.X));
        this.a((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)25642, (long)(0x65C225659D93DFC3L ^ l)), (long)-5865369146699105122L, (long)l)), new AdaptiveCipherEngine(this.zp.sy), new AdaptiveCipherEngine(this.zp.L), new AdaptiveCipherEngine(this.zp.sJ), new AdaptiveCipherEngine(this.zp.sq), new AdvancedMetricCompressor(this.zp.T), new ExecutionStateValidator(TemporalMetadataResolver.h.a().l), new ExecutionStateValidator(GraphicalRenderingController.K.Z), new TransactionValidator1458((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)13430, (long)(0x3FF8D23375C98FB5L ^ l)), (long)-5865369146699105122L, (long)l)), new VapeInterfaceController(this)).g((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)32559, (long)(0x414DD69194EC4DBL ^ l)), (long)-5865369146699105122L, (long)l))), new TransactionValidator1458((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)1086, (long)(0x6485645284903FDCL ^ l)), (long)-5865369146699105122L, (long)l)), new EventDispatchCoordinator2329(this)).g((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)5003, (long)(0x1929D5CF6D8DA86AL ^ l)), (long)-5865369146699105122L, (long)l))));
        this.a((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)8746, (long)(0x27616EDCAD7D99C1L ^ l)), (long)-5865369146699105122L, (long)l)), new AdvancedMetricCompressor(this.zN.M), new AdaptiveCipherEngine(this.zN.G));
        ObjectLifecycleManager objectLifecycleManager = TemporalMetadataResolver.h.F();
        this.a((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)4150, (long)(0x7C2B972866452BE3L ^ l)), (long)-5865369146699105122L, (long)l)), new AdaptiveCipherEngine(objectLifecycleManager.C), new ResourceLifecycleManager1951(this, objectLifecycleManager.K, objectLifecycleManager), new ResourceCacheValidator(this, objectLifecycleManager.F, objectLifecycleManager), new StreamProcessingController(this, objectLifecycleManager.r, objectLifecycleManager));
    }

    private static void lambda$null$9(NetworkProtocolEncoder1226 networkProtocolEncoder1226) {
        block3: {
            long l;
            block2: {
                l = ab ^ 0x72A36EEAE357L;
                try {
                    if (networkProtocolEncoder1226.c() != EncodingScheme.SUCCESS) break block2;
                    TemporalMetadataResolver.h.c().L((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)4564, (long)(0x8D2560D3FB04C20L ^ l)), (long)5227275129032759951L, (long)l)), (String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)24466, (long)(0x2176FFD14255825EL ^ l)), (long)5227275129032759951L, (long)l)), 3000L);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw EncryptionKeyGenerator.a(customSystemException);
                }
            }
            TemporalMetadataResolver.h.c().L((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)19134, (long)(0x5321162B4FF2176AL ^ l)), (long)5227275129032759951L, (long)l)), (String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)30889, (long)(0x1E6DAAB9F928A577L ^ l)), (long)5227275129032759951L, (long)l)) + (Object)((Object)networkProtocolEncoder1226.c()), 3000L);
        }
    }

    public EncryptionKeyGenerator() {
        long l = ab ^ 0x305B394EE651L;
        this.zp = GraphicalRenderingController.K;
        this.zm = TemporalMetadataResolver.h.a();
        this.zN = TemporalMetadataResolver.h.F();
        this.zK = new HashMap();
        this.Q(EncryptionKeyGenerator.M.a);
        this.d().m(false);
        this.d().f((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)11704, (long)(0x2EBCC5B58F50F56FL ^ l)), (long)5588195214077419401L, (long)l)));
        TransactionLogOrchestrator transactionLogOrchestrator = GraphicalRenderingController.D(TransactionLogOrchestrator.class);
        this.w(transactionLogOrchestrator.b());
        this.T(transactionLogOrchestrator.w());
        Cz cz = new Cz(this, (String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)12662, (long)(0x142DBDEA469DE9B9L ^ l)), (long)5588195214077419401L, (long)l)));
        cz.E(new AuthenticationMediator2179(this));
        cz.o(new AuthenticationDelegate2186(this));
        this.a(cz);
        this.n(new bE(1.0, 2.0), new Object[0]);
        this.n(new VisualizationRenderer(EncryptionKeyGenerator.M.S), new Object[0]);
        this.y();
        this.zt = new EncryptionProtocolHandler(this.zm.q);
        this.n(this.zt, new Object[0]);
        this.n(new ConfigurationProfileManager1223((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)27211, (long)(0x5DDC4C5CB963280L ^ l)), (long)5588195214077419401L, (long)l)), this.zp.C()).g((String)((Object)EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)259, (long)(0x771F48CCF636D9F3L ^ l)), (long)5588195214077419401L, (long)l))), new Object[0]);
        this.n(new VisualizationRenderer(EncryptionKeyGenerator.M.W), new Object[0]);
        this.N(false);
        this.B(false, false);
    }

    private static void lambda$null$10() {
    }

    private void p(CipherSessionManager cipherSessionManager) {
        boolean bl;
        CipherSessionManager cipherSessionManager2;
        try {
            if (cipherSessionManager == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EncryptionKeyGenerator.a(customSystemException);
        }
        try {
            cipherSessionManager2 = cipherSessionManager;
            bl = !cipherSessionManager.f();
        }
        catch (CustomSystemException customSystemException) {
            throw EncryptionKeyGenerator.a(customSystemException);
        }
        try {
            cipherSessionManager2.r(bl, false);
            if (cipherSessionManager.f()) {
                cipherSessionManager.R();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EncryptionKeyGenerator.a(customSystemException);
        }
        cipherSessionManager.b(this.G());
        cipherSessionManager.M(this.W());
        cipherSessionManager.A();
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    @Override
    public void S() {
        super.S();
    }

    public void O() {
        this.zt.q();
    }

    private void Y() {
        int n = 10;
        for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.J()) {
            try {
                if (cipherSessionManager instanceof TransactionLogOrchestrator) {
                    cipherSessionManager.m(10.0, 20.0);
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EncryptionKeyGenerator.a(customSystemException);
            }
            try {
                try {
                    if (!cipherSessionManager.m() || cipherSessionManager.N()) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw EncryptionKeyGenerator.a(customSystemException);
                }
                cipherSessionManager.m(GraphicalRenderingController.D(TransactionLogOrchestrator.class).w() + 10.0, n += 22);
            }
            catch (CustomSystemException customSystemException) {
                throw EncryptionKeyGenerator.a(customSystemException);
            }
        }
        for (CipherSessionManager cipherSessionManager : GraphicalRenderingController.J()) {
            if (cipherSessionManager.N()) continue;
            try {
                if (!cipherSessionManager.m()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw EncryptionKeyGenerator.a(customSystemException);
            }
            cipherSessionManager.N(cipherSessionManager instanceof TransactionLogOrchestrator);
        }
        GraphicalRenderingController.i();
    }

    @Override
    public void o(boolean bl) {
        long l = ab ^ 0x27E61916D23FL;
        super.o(bl);
        this.w(238.0);
        ConfigurationManager.A(this.G(), this.W() + this.Q().b() + 2.0, this.w(), this.b() - (this.Q().b() + 8.0), EncryptionKeyGenerator.M.W);
        CryptographicParameterGenerator cryptographicParameterGenerator = TemporalMetadataResolver.h.W().k(0.7, false);
        CallSite callSite = EncryptionKeyGenerator.e("R", (int)EncryptionKeyGenerator.d("x", (int)3580, (long)(0x4646F1030508616BL ^ l)), (long)8782958589947374567L, (long)l);
        double d2 = cryptographicParameterGenerator.D((String)((Object)callSite));
        cryptographicParameterGenerator.R((String)((Object)callSite), this.G() + this.w() - d2 - 4.0, this.W() + this.b() - 4.5, EncryptionKeyGenerator.M.w);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EncryptionKeyGenerator.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(EncryptionKeyGenerator.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

