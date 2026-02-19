/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.network.protocol;

import a.M;
import a.Rh;
import a.Ry;
import a.Z3;
import a._b;
import a.bE;
import a.hQ;
import a.hr;
import a.is;
import a.yC;
import a.yR;
import a.yb;
import com.audit.trail.AuditTrailReconstructor;
import com.authentication.profile.UserProfileManager;
import com.cluster.management.ClusterNodeOrchestrator2613;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.compression.adaptive.AdaptiveCompressionManager;
import com.concurrency.execution.HybridExecutionCoordinator;
import com.config.management.ConfigurationParameterManager454;
import com.core.computation.AbstractComputationKernel;
import com.data.compression.CompressionUtilityManager;
import com.data.serialization.JsonPayloadOrchestrator;
import com.data.serialization.SerializationOrchestrator;
import com.data.streaming.DataStreamOrchestrator629;
import com.dynamic.resolution.RuntimeMethodResolver;
import com.event.dispatch.EventDispatchController;
import com.exception.system.CustomSystemException;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.graphics.rendering.GraphicalRenderController;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.transformation.GeometricTransformEngine;
import com.hardware.management.HardwareYield;
import com.math.computation.IntegerComputationManager;
import com.math.precision.PrecisionMathOrchestrator;
import com.math.transformation.NumericTransformationEngine;
import com.messaging.queue.MessageQueueOrchestrator;
import com.network.config.NetworkConfigurationResolver2717;
import com.security.cipher.CipherModeRegistry;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CryptoAlgorithmResolver;
import com.security.crypto.CryptographicModeEnum;
import com.security.cryptography.CryptographicContextManager153;
import com.security.policy.CryptographicPolicyDescriptor;
import com.security.session.CipherSessionManager;
import com.system.lifecycle.SystemLifecycleController;
import com.system.resource.ResourceAllocationManager1348;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;
import com.transaction.monitoring.TransactionStatusTracker;
import com.ui.rendering.GraphicalRenderingController;
import com.user.profile.UserProfileManager1821;
import com.workflow.adaptive.AdaptiveWorkflowController;
import java.awt.Color;
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
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CommunicationProtocolManager
extends CipherSessionManager
implements NetworkConfigurationResolver2717 {
    private static final long ab;
    private ClusterNodeOrchestrator2613 _J;
    private GraphicalRenderEngine1082 _v;
    private static final Map lb;
    private boolean _D;
    static final boolean _j;
    private HybridExecutionCoordinator _k;
    private CipherModeRegistry _Y;
    private boolean _d;
    @Nullable
    private CipherContextManager1101 _m;
    private static final Integer[] fb;
    private boolean _C;
    private GraphicalRenderEngine1082 _q;
    private static final Object[] qb;
    private static final long[] eb;
    private static final String[] rb;
    private boolean _I;
    private PrecisionMathOrchestrator _R;
    private String _K;

    private void lambda$addCenteredOverlay$10(AtomicReference atomicReference) {
        CompressionUtilityManager compressionUtilityManager = (CompressionUtilityManager)atomicReference.get();
        try {
            if (compressionUtilityManager != null) {
                this.Z(compressionUtilityManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
    }

    private static void lambda$openWithPublicListing$16(CommunicationProtocolManager communicationProtocolManager) {
        communicationProtocolManager.q((Ry)null);
    }

    private static Field o(long l, long l2) {
        int n = CommunicationProtocolManager.m(l, l2);
        Object object = qb[n];
        if (object instanceof String) {
            String string = rb[n];
            int n2 = string.indexOf(8);
            Class clazz = CommunicationProtocolManager.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CommunicationProtocolManager.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CommunicationProtocolManager.g(clazz3, string2, clazz2)) != null) {
                    CommunicationProtocolManager.qb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CommunicationProtocolManager.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CommunicationProtocolManager.qb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CommunicationProtocolManager.n(213056277254577L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CommunicationProtocolManager.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static void lambda$openWithEditor$20(CommunicationProtocolManager communicationProtocolManager) {
    }

    public void u(CipherContextManager1101 cipherContextManager1101) {
        long l = ab ^ 0x787CCEB9C4D5L;
        TemporalMetadataResolver.x((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)25866, (long)(0x61404E73ABF8C312L ^ l)), (long)-8967407300414315366L, (long)l)) + cipherContextManager1101 + (String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)1072, (long)(0x5E93384AACF2223CL ^ l)), (long)-8967407300414315366L, (long)l)));
        CipherContextManager1101 cipherContextManager11012 = this._m;
    }

    @DataExchangeProtocol2090
    public void C(UserProfileManager userProfileManager) {
        GraphicalRenderingController.st.execute(() -> this.lambda$onPublicProfileDelete$14(userProfileManager));
    }

    public CompressionUtilityManager d(@Nullable CipherSessionManager cipherSessionManager, AbstractComputationKernel abstractComputationKernel) {
        CipherSessionManager cipherSessionManager2;
        AtomicReference<CompressionUtilityManager> atomicReference = new AtomicReference<CompressionUtilityManager>();
        try {
            cipherSessionManager2 = cipherSessionManager != null ? cipherSessionManager : this;
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        CipherSessionManager cipherSessionManager3 = cipherSessionManager2;
        CompressionUtilityManager compressionUtilityManager = GraphicalRenderingController.v(cipherSessionManager3, this.M(abstractComputationKernel, () -> this.lambda$addCenteredOverlay$10(atomicReference)), CompressionUtilityManager.class);
        atomicReference.set(compressionUtilityManager);
        compressionUtilityManager.b((int)((cipherSessionManager3.w() - abstractComputationKernel.w()) / 2.0));
        compressionUtilityManager.H((int)((cipherSessionManager3.b() - abstractComputationKernel.b()) / 2.0));
        this.u(compressionUtilityManager);
        return compressionUtilityManager;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CommunicationProtocolManager.m(l, l2);
            object = qb[n];
            try {
                if (!(object instanceof String)) break block2;
                CommunicationProtocolManager.qb[n] = clazz = Class.forName(rb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static void w(@Nullable Consumer<CommunicationProtocolManager> consumer) {
        CommunicationProtocolManager communicationProtocolManager = GraphicalRenderingController.D(CommunicationProtocolManager.class);
        try {
            communicationProtocolManager.r(true, false);
            GraphicalRenderingController.K.T(GraphicalRenderingController.w);
            if (consumer != null) {
                consumer.accept(communicationProtocolManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
    }

    private static void lambda$createCenteredOverlayNode$11(Runnable runnable) {
        runnable.run();
    }

    static void A(CommunicationProtocolManager communicationProtocolManager, CipherContextManager1101 cipherContextManager1101) {
        communicationProtocolManager.Z(cipherContextManager1101);
    }

    private void lambda$null$3() {
        this._J.I();
    }

    private static void lambda$openWithEditor$22(AuditTrailReconstructor auditTrailReconstructor, CommunicationProtocolManager communicationProtocolManager, TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        block13: {
            long l = ab ^ 0x6A0F721B1CE3L;
            try {
                if (auditTrailReconstructor.K().isCancelled()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
            try {
                auditTrailReconstructor.X(null);
                if (throwable != null) {
                    TemporalMetadataResolver.W(throwable);
                    communicationProtocolManager.Z(auditTrailReconstructor.z());
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
            try {
                if (!transactionStatusTracker.b()) {
                    TemporalMetadataResolver.x((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)22590, (long)(0x50F628004186261BL ^ l)), (long)6609961411276553388L, (long)l)) + transactionStatusTracker.A());
                    IntegerComputationManager.q((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)9974, (long)(0x74411EF74CA458C7L ^ l)), (long)6609961411276553388L, (long)l)) + transactionStatusTracker.A());
                    communicationProtocolManager.Z(auditTrailReconstructor.z());
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
            try {
                try {
                    if (_j || transactionStatusTracker.h() != null) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw CommunicationProtocolManager.a(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
        }
        communicationProtocolManager.Y((Ry)transactionStatusTracker.h());
    }

    @Nullable
    public static CompletableFuture<?> R(boolean bl, long l) {
        block4: {
            block5: {
                try {
                    try {
                        if (!bl) break block4;
                        if (SystemLifecycleController.C.U().equals((Object)CryptographicModeEnum.ONLINE)) break block5;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CommunicationProtocolManager.a(customSystemException);
                    }
                    CommunicationProtocolManager.w(CommunicationProtocolManager::lambda$openWithEditor$20);
                    return null;
                }
                catch (CustomSystemException customSystemException) {
                    throw CommunicationProtocolManager.a(customSystemException);
                }
            }
            CommunicationProtocolManager.w(CommunicationProtocolManager::lambda$openWithEditor$21);
        }
        CommunicationProtocolManager communicationProtocolManager = GraphicalRenderingController.D(CommunicationProtocolManager.class);
        AuditTrailReconstructor auditTrailReconstructor = communicationProtocolManager.Y(null);
        auditTrailReconstructor.X((CompletableFuture<?>)((CompletableFuture)_b.S().M().d(l).whenCompleteAsync((arg_0, arg_1) -> CommunicationProtocolManager.lambda$openWithEditor$22(auditTrailReconstructor, communicationProtocolManager, arg_0, arg_1), (Executor)GraphicalRenderingController.st)).exceptionally(CommunicationProtocolManager::lambda$openWithEditor$23));
        return auditTrailReconstructor.K();
    }

    private void lambda$createLeftContainer$2(hr hr2) {
        this.J(hr2);
    }

    public static void T() {
        CommunicationProtocolManager.w(null);
    }

    public void J(hr hr2) {
        CompressionUtilityManager compressionUtilityManager = this.W(null, new AdaptiveCompressionManager(this));
        compressionUtilityManager.b((int)(hr2.G() - this.G()) + 45);
        compressionUtilityManager.H((int)(hr2.W() - this.W()) + 5);
    }

    @Override
    public void F() {
        CipherContextManager1101 cipherContextManager1101 = this._m;
        try {
            if (cipherContextManager1101 != null) {
                this.R(cipherContextManager1101);
                this._m = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
    }

    public ClusterNodeOrchestrator2613 D() {
        return this._J;
    }

    private void lambda$onPublicProfileDelete$14(UserProfileManager userProfileManager) {
        ArrayList<AbstractComputationKernel> arrayList = new ArrayList<AbstractComputationKernel>();
        for (AbstractComputationKernel abstractComputationKernel : this._q.A()) {
            try {
                if (!(abstractComputationKernel instanceof PrecisionMathOrchestrator)) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
            PrecisionMathOrchestrator precisionMathOrchestrator = (PrecisionMathOrchestrator)abstractComputationKernel;
            yR yR2 = precisionMathOrchestrator.w(yR.class);
            try {
                if (yR2 == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
            try {
                if (yR2.U().H() != userProfileManager.getProfile().H()) continue;
                arrayList.add(abstractComputationKernel);
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
        }
        try {
            if (arrayList.isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        for (AbstractComputationKernel abstractComputationKernel : arrayList) {
            this._q.J(abstractComputationKernel);
        }
        TemporalMetadataResolver.h.o().E();
    }

    @Override
    public void d() {
        block14: {
            block13: {
                block12: {
                    try {
                        try {
                            if (SystemLifecycleController.C.U().equals((Object)CryptographicModeEnum.ONLINE) || this._d) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CommunicationProtocolManager.a(customSystemException);
                        }
                        this.I();
                        break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CommunicationProtocolManager.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (!SystemLifecycleController.C.U().equals((Object)CryptographicModeEnum.ONLINE) || !this._d) break block13;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CommunicationProtocolManager.a(customSystemException);
                    }
                    this._I = false;
                }
                catch (CustomSystemException customSystemException) {
                    throw CommunicationProtocolManager.a(customSystemException);
                }
            }
            CipherContextManager1101 cipherContextManager1101 = this._m;
            try {
                try {
                    if (cipherContextManager1101 == null || !cipherContextManager1101.f()) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw CommunicationProtocolManager.a(customSystemException);
                }
                cipherContextManager1101.c();
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
        }
    }

    public yb q(@Nullable Ry ry) {
        Object object;
        Gson gson;
        TransactionDescriptor transactionDescriptor;
        JsonPayloadOrchestrator jsonPayloadOrchestrator;
        JsonPayloadOrchestrator jsonPayloadOrchestrator2;
        Object v0;
        long l = ab ^ 0xC73F5ECC410L;
        if (ry == null) {
            yb yb2 = new yb(this, null, null);
            yb2.x(this.g(null, yb2));
            return yb2;
        }
        try {
            v0 = ry.z() != null ? ry.z().getOrDefault(CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)13686, (long)(0x455820D6066513A1L ^ l)), (long)-8986886200776563617L, (long)l), null) : null;
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        Object var5_5 = v0;
        try {
            JsonPayloadOrchestrator jsonPayloadOrchestrator3;
            jsonPayloadOrchestrator2 = jsonPayloadOrchestrator3;
            jsonPayloadOrchestrator = jsonPayloadOrchestrator3;
            transactionDescriptor = null;
            gson = SerializationOrchestrator.q;
            object = var5_5 != null ? SerializationOrchestrator.q.toJson(var5_5) : CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)29620, (long)(0x22E477C267BDD56CL ^ l)), (long)-8986886200776563617L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        jsonPayloadOrchestrator2(transactionDescriptor, (JsonArray)gson.fromJson((String)object, JsonArray.class));
        JsonPayloadOrchestrator jsonPayloadOrchestrator4 = jsonPayloadOrchestrator;
        yb yb3 = new yb(this, ry, jsonPayloadOrchestrator4);
        yb3.x(this.g(null, yb3));
        return yb3;
    }

    public CommunicationProtocolManager() {
        long l = ab ^ 0x5683C73E75B6L;
        this._C = true;
        this._Y = CipherModeRegistry.RATED;
        this._K = "";
        this.b(200.0);
        this.M(200.0);
        this.d().m(false);
        this.d().o(false);
        this.d().i(false);
        this.d().y(false);
        this.d().f((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)18369, (long)(0x677C7BEC0CFD50B4L ^ l)), (long)3669994361401693689L, (long)l)));
        this.a(new MessageQueueOrchestrator(this, this, (String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)24623, (long)(0x3B80EC1B9362F756L ^ l)), (long)3669994361401693689L, (long)l)), (String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)7235, (long)(0x54D78F5D8E148B2AL ^ l)), (long)3669994361401693689L, (long)l)), 0.5).Y(CommunicationProtocolManager::lambda$new$0));
        this.v();
        this.g(false);
        this.N(true);
        this.B(false, true);
        this.L(true);
        Z3.s().A(this, new Predicate[0]);
    }

    private void lambda$onPublicProfileCreate$13(UserProfileManager1821 userProfileManager1821) {
        this.G(userProfileManager1821.getProfile());
        TemporalMetadataResolver.h.o().E();
    }

    @Override
    public String A() {
        long l = ab ^ 0xB6A5F3404C8L;
        return CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)6832, (long)(0x4ACDCC44B64AFCB2L ^ l)), (long)4868441245485278343L, (long)l);
    }

    @Nullable
    public static CompletableFuture<?> L(long l) {
        try {
            if (!SystemLifecycleController.C.U().equals((Object)CryptographicModeEnum.ONLINE)) {
                CommunicationProtocolManager.w(CommunicationProtocolManager::lambda$openWithPublicListing$15);
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        CommunicationProtocolManager.w(CommunicationProtocolManager::lambda$openWithPublicListing$16);
        return ((CompletableFuture)_b.S().M().d(l).whenCompleteAsync(CommunicationProtocolManager::lambda$openWithPublicListing$18, (Executor)GraphicalRenderingController.st)).exceptionally(CommunicationProtocolManager::lambda$openWithPublicListing$19);
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
                n3 = 12;
                break;
            }
            case 1: {
                n3 = 43;
                break;
            }
            case 2: {
                n3 = 13;
                break;
            }
            case 3: {
                n3 = 2;
                break;
            }
            case 4: {
                n3 = 47;
                break;
            }
            case 5: {
                n3 = 24;
                break;
            }
            case 6: {
                n3 = 1;
                break;
            }
            case 7: {
                n3 = 54;
                break;
            }
            case 8: {
                n3 = 32;
                break;
            }
            case 9: {
                n3 = 46;
                break;
            }
            case 10: {
                n3 = 38;
                break;
            }
            case 11: {
                n3 = 10;
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
                n3 = 57;
                break;
            }
            case 15: {
                n3 = 23;
                break;
            }
            case 16: {
                n3 = 14;
                break;
            }
            case 17: {
                n3 = 63;
                break;
            }
            case 18: {
                n3 = 20;
                break;
            }
            case 19: {
                n3 = 53;
                break;
            }
            case 20: {
                n3 = 35;
                break;
            }
            case 21: {
                n3 = 9;
                break;
            }
            case 22: {
                n3 = 62;
                break;
            }
            case 23: {
                n3 = 17;
                break;
            }
            case 24: {
                n3 = 7;
                break;
            }
            case 25: {
                n3 = 28;
                break;
            }
            case 26: {
                n3 = 4;
                break;
            }
            case 27: {
                n3 = 22;
                break;
            }
            case 28: {
                n3 = 5;
                break;
            }
            case 29: {
                n3 = 40;
                break;
            }
            case 30: {
                n3 = 41;
                break;
            }
            case 31: {
                n3 = 21;
                break;
            }
            case 32: {
                n3 = 31;
                break;
            }
            case 33: {
                n3 = 19;
                break;
            }
            case 34: {
                n3 = 55;
                break;
            }
            case 35: {
                n3 = 18;
                break;
            }
            case 36: {
                n3 = 26;
                break;
            }
            case 37: {
                n3 = 49;
                break;
            }
            case 38: {
                n3 = 34;
                break;
            }
            case 39: {
                n3 = 33;
                break;
            }
            case 40: {
                n3 = 30;
                break;
            }
            case 41: {
                n3 = 11;
                break;
            }
            case 42: {
                n3 = 16;
                break;
            }
            case 43: {
                n3 = 56;
                break;
            }
            case 44: {
                n3 = 58;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 60;
                break;
            }
            case 47: {
                n3 = 44;
                break;
            }
            case 48: {
                n3 = 59;
                break;
            }
            case 49: {
                n3 = 48;
                break;
            }
            case 50: {
                n3 = 37;
                break;
            }
            case 51: {
                n3 = 0;
                break;
            }
            case 52: {
                n3 = 27;
                break;
            }
            case 53: {
                n3 = 8;
                break;
            }
            case 54: {
                n3 = 61;
                break;
            }
            case 55: {
                n3 = 25;
                break;
            }
            case 56: {
                n3 = 42;
                break;
            }
            case 57: {
                n3 = 52;
                break;
            }
            case 58: {
                n3 = 15;
                break;
            }
            case 59: {
                n3 = 3;
                break;
            }
            case 60: {
                n3 = 50;
                break;
            }
            case 61: {
                n3 = 39;
                break;
            }
            case 62: {
                n3 = 51;
                break;
            }
            default: {
                n3 = 29;
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
        CommunicationProtocolManager.rb[n4] = new String(cArray);
        return n4;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2590;
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
                throw new RuntimeException("a/f1", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CommunicationProtocolManager.fb[n2] = n3;
        }
        return fb[n2];
    }

    public void j(@Nullable CipherContextManager1101 cipherContextManager1101) {
        CipherContextManager1101 cipherContextManager11012 = this._m;
        try {
            if (cipherContextManager11012 != null) {
                this.Z(cipherContextManager11012);
                this.F();
                this.A();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        this._m = cipherContextManager1101;
    }

    private static void X() {
        Object[] objectArray = qb;
        qb[0] = "\u0013*X";
        objectArray[1] = Integer.TYPE;
        CommunicationProtocolManager.rb[1] = "java/lang/Integer";
        objectArray[2] = "3\u0013\u0005\"n$8\u001c\u0014m\u0013<+\u001b\u001d$";
        objectArray[3] = "\u0017DtHF\u001a\u001cKe\u0007'\u0014\u0017@a]";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "R&?b\"\"\u0001=7\u0012.f1}l,ur\u0001.cv\u007f\u001d\b /(,![x(#E";
    }

    private void Z(CipherContextManager1101 cipherContextManager1101) {
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = cipherContextManager1101.o(GraphicalRenderEngine1082.class);
        if (graphicalRenderEngine1082 != null) {
            for (AbstractComputationKernel abstractComputationKernel : graphicalRenderEngine1082.A()) {
                NumericTransformationEngine numericTransformationEngine;
                if (abstractComputationKernel instanceof GraphicalRenderEngine1082) {
                    numericTransformationEngine = (GraphicalRenderEngine1082)abstractComputationKernel;
                    for (AbstractComputationKernel abstractComputationKernel2 : numericTransformationEngine.A()) {
                        NumericTransformationEngine numericTransformationEngine2;
                        if (abstractComputationKernel2 instanceof AdaptiveWorkflowController) {
                            numericTransformationEngine2 = (AdaptiveWorkflowController)abstractComputationKernel2;
                            ((AdaptiveWorkflowController)numericTransformationEngine2).T();
                        }
                        if (!(abstractComputationKernel2 instanceof EventDispatchController)) continue;
                        numericTransformationEngine2 = (EventDispatchController)abstractComputationKernel2;
                        ((EventDispatchController)numericTransformationEngine2).y();
                    }
                }
                if (abstractComputationKernel instanceof AdaptiveWorkflowController) {
                    numericTransformationEngine = (AdaptiveWorkflowController)abstractComputationKernel;
                    ((AdaptiveWorkflowController)numericTransformationEngine).T();
                }
                if (!(abstractComputationKernel instanceof EventDispatchController)) continue;
                numericTransformationEngine = (EventDispatchController)abstractComputationKernel;
                ((EventDispatchController)numericTransformationEngine).y();
            }
        }
        try {
            GraphicalRenderingController.z(cipherContextManager1101);
            if (this._m == cipherContextManager1101) {
                this._m = null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
    }

    @Nullable
    public CipherContextManager1101 Z() {
        return this._m;
    }

    private List lambda$null$7(Function function, TransactionStatusTracker transactionStatusTracker) {
        block8: {
            try {
                if (!transactionStatusTracker.b()) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
            try {
                try {
                    if (_j || transactionStatusTracker.h() != null) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw CommunicationProtocolManager.a(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
        }
        this._J.Z((DataStreamOrchestrator629)transactionStatusTracker.h());
        List list = ((DataStreamOrchestrator629)transactionStatusTracker.h()).v();
        ArrayList<PrecisionMathOrchestrator> arrayList = new ArrayList<PrecisionMathOrchestrator>();
        for (ConfigurationParameterManager454 configurationParameterManager454 : list) {
            PrecisionMathOrchestrator precisionMathOrchestrator = (PrecisionMathOrchestrator)function.apply(configurationParameterManager454);
            arrayList.add(precisionMathOrchestrator);
            TemporalMetadataResolver.h.u().M(configurationParameterManager454);
            Rh rh = precisionMathOrchestrator.w(Rh.class);
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            rh.l(new is(this, atomicBoolean, configurationParameterManager454));
        }
        return arrayList;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CommunicationProtocolManager.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CommunicationProtocolManager.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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

    public String r() {
        return this._K;
    }

    @DataExchangeProtocol2090
    public void j(UserProfileManager1821 userProfileManager1821) {
        GraphicalRenderingController.st.execute(() -> this.lambda$onPublicProfileCreate$13(userProfileManager1821));
    }

    private void lambda$createRightContainer$4() {
        GraphicalRenderingController.st.execute(this::lambda$null$3);
    }

    private void R(GraphicalRenderEngine1082 graphicalRenderEngine1082) {
        CallSite callSite;
        yC yC2;
        yC yC3;
        AbstractComputationKernel abstractComputationKernel;
        double d2;
        GraphicalRenderEngine1082 graphicalRenderEngine10822;
        GraphicalRenderEngine1082 graphicalRenderEngine10823;
        long l = ab ^ 0x48BB6189A1D7L;
        try {
            GraphicalRenderEngine1082 graphicalRenderEngine10824;
            graphicalRenderEngine10823 = graphicalRenderEngine10824;
            graphicalRenderEngine10822 = graphicalRenderEngine10824;
            d2 = this._C ? 92.0 : 8.0;
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        graphicalRenderEngine10823(d2, graphicalRenderEngine1082.b());
        GraphicalRenderEngine1082 graphicalRenderEngine10825 = graphicalRenderEngine10822;
        this._R = new PrecisionMathOrchestrator(4.0, 4.0, 6.0, 6.0, graphicalRenderEngine10825);
        graphicalRenderEngine1082.n(this._R, new Object[0]);
        graphicalRenderEngine10825.d().f((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)3913, (long)(0x2B6F1369BB1A4C4DL ^ l)), (long)-1833125207775182440L, (long)l)));
        GraphicalRenderEngine1082 graphicalRenderEngine10826 = new GraphicalRenderEngine1082(graphicalRenderEngine10825.w(), 12.0);
        if (this._C) {
            abstractComputationKernel = new CryptographicContextManager153((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)17291, (long)(0x38A9A84AEDEA8097L ^ l)), (long)-1833125207775182440L, (long)l)));
            ((CryptographicContextManager153)abstractComputationKernel).q(true);
            ((CryptographicContextManager153)abstractComputationKernel).B(CommunicationProtocolManager.M.w);
            ((CryptographicContextManager153)abstractComputationKernel).p(0.7);
            ((CryptographicContextManager153)abstractComputationKernel).S(0.0f);
            ((CryptographicContextManager153)abstractComputationKernel).j(-2.0f);
            graphicalRenderEngine10826.Y(false);
            graphicalRenderEngine10826.n(abstractComputationKernel, new Object[0]);
        }
        try {
            yC yC4;
            yC3 = yC4;
            yC2 = yC4;
            callSite = this._C ? CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)7275, (long)(0x55BD62A0229D5F75L ^ l)), (long)-1833125207775182440L, (long)l) : CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)14063, (long)(0x58AC13219230F5E5L ^ l)), (long)-1833125207775182440L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        yC3((String)((Object)callSite), 5.0, 4.0, 5.0, 4.0, null, null, null);
        abstractComputationKernel = yC2;
        graphicalRenderEngine10826.n(abstractComputationKernel, CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)6697, (long)(0xDF9C134C739D92EL ^ l)), (long)-1833125207775182440L, (long)l));
        ((hQ)abstractComputationKernel).N(this::lambda$createLeftContainer$1);
        graphicalRenderEngine10825.n(graphicalRenderEngine10826, new Object[0]);
        if (this._C) {
            GraphicalRenderEngine1082 graphicalRenderEngine10827 = new GraphicalRenderEngine1082(graphicalRenderEngine10825.w(), graphicalRenderEngine10825.b() - graphicalRenderEngine10826.b());
            graphicalRenderEngine10827.d().f((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)29803, (long)(0x4F6F8432AA433778L ^ l)), (long)-1833125207775182440L, (long)l)));
            graphicalRenderEngine10825.n(graphicalRenderEngine10827, CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)31553, (long)(0x4938505E3282384EL ^ l)), (long)-1833125207775182440L, (long)l));
            hr hr2 = new hr((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)24577, (long)(0xE5969D797FA317L ^ l)), (long)-1833125207775182440L, (long)l)), 0.8, CommunicationProtocolManager.M.Y, CommunicationProtocolManager.M.u);
            hr2.T(graphicalRenderEngine10827.w());
            hr2.w(14.0);
            hr2.N(() -> this.lambda$createLeftContainer$2(hr2));
            hr2.f(true);
            hr2.q(false);
            hr2.A(Color.WHITE);
            graphicalRenderEngine10827.n(hr2, new Object[0]);
            bE bE2 = new bE(0.0, 2.0);
            graphicalRenderEngine10827.n(bE2, new Object[0]);
            this._q = new GraphicalRenderEngine1082(graphicalRenderEngine10827.w(), graphicalRenderEngine10825.b() - graphicalRenderEngine10826.b() - hr2.b() - bE2.b() + 2.0);
            this._q.q(true);
            this._q.i(this._q.b());
            this._q.i(false);
            this._q.O(CryptographicPolicyDescriptor.OUTSIDE);
            this._q.G(true);
            this._q.d().f((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)26731, (long)(0x36B64AF44F2C2B60L ^ l)), (long)-1833125207775182440L, (long)l)));
            graphicalRenderEngine10827.n(this._q, new Object[0]);
            for (Ry ry : TemporalMetadataResolver.h.u().j().values()) {
                this.G(ry);
            }
        }
    }

    private static void lambda$openWithEditor$21(CommunicationProtocolManager communicationProtocolManager) {
        communicationProtocolManager.q((Ry)null);
    }

    private static void lambda$openWithPublicListing$15(CommunicationProtocolManager communicationProtocolManager) {
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public AuditTrailReconstructor Y(@Nullable Ry ry) {
        if (ry == null) {
            AuditTrailReconstructor auditTrailReconstructor = new AuditTrailReconstructor(this, null, null);
            auditTrailReconstructor.x(this.g(null, auditTrailReconstructor));
            return auditTrailReconstructor;
        }
        JsonPayloadOrchestrator jsonPayloadOrchestrator = JsonPayloadOrchestrator.q(ry);
        AuditTrailReconstructor auditTrailReconstructor = new AuditTrailReconstructor(this, ry, jsonPayloadOrchestrator);
        auditTrailReconstructor.x(this.g(null, auditTrailReconstructor));
        return auditTrailReconstructor;
    }

    private void lambda$setCenteredOverlay$9(AtomicReference atomicReference) {
        CompressionUtilityManager compressionUtilityManager = (CompressionUtilityManager)atomicReference.get();
        try {
            if (compressionUtilityManager != null) {
                this.Z(compressionUtilityManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
    }

    private static CompletableFuture lambda$addPublicProfileButton$12(Ry ry) {
        return CommunicationProtocolManager.R(false, ry.H());
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CommunicationProtocolManager.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CommunicationProtocolManager.ab = MultiContainerRegistry.a(-9071475178551875050L, -8265342021022167076L, MethodHandles.lookup().lookupClass()).a(269158867969307L);
                CommunicationProtocolManager.qb = new Object[5];
                CommunicationProtocolManager.rb = new String[5];
                CommunicationProtocolManager.X();
                CommunicationProtocolManager.lb = new HashMap<K, V>(13);
                var0 = CommunicationProtocolManager.ab ^ 30493747933829L;
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
                var6_5 = "8.:\u00d9\u0000\u00f2Y\u0092,H%\u00ba\u0017\u00da\u0092\u001bnUz=\u0098#\u00fd\u00adC\u00c8Ok\u001b)\u00a4<`\u0004\u00fb\u00c6>\u0010\u00fa\u00e9?\u00ac7\u009d{Q\u00ea\u00c6L\u0095\u00dfo 2\u0089\u0006\u00ceg\u00e1+;\u00ef?\u0086\u00e8\u0013\u0086\u00e5\u00eaa\u001el\u00cf\u00fb\u000b\u00aa\u00bd\u00cfXv\u00ef(3\u0006\u00c0\u00db\u00df=|\u0088xL\u008b\r\\\u009db\u008c-\u00fcf\u00ef\u0098m\u007f\u00d4\u007f\u00c1\u008e\u00ee\u001e:x\u00dfk\u0001\u0099]\u00b4\u00fd\u00c8!{\u00f7\u0011+\u0006*I\u0013\u00af\u00de\u00d8\u00e55\u00adL\u00d0\u0096\u00cf\u00b5\u00c14\u009f5f\r(\u00fa\n\u0087W\u00be\u00b5\u00da\u00c2\u0095\u00ac`FRo\u001d\u00a5C1p\u00e6<\u0007r]G\u0001\u0095<\fS\u00f4n\u0084rP7\u00a9@;~^9\u0015\u009b\u009d\u0083.8\u00a4\u00a7N\u00d4\u00eb`e4\u0097C\u0084\u00ad\u0097LX\u000b\"\u0011\u00c5\u00f7";
                var7_6 = "8.:\u00d9\u0000\u00f2Y\u0092,H%\u00ba\u0017\u00da\u0092\u001bnUz=\u0098#\u00fd\u00adC\u00c8Ok\u001b)\u00a4<`\u0004\u00fb\u00c6>\u0010\u00fa\u00e9?\u00ac7\u009d{Q\u00ea\u00c6L\u0095\u00dfo 2\u0089\u0006\u00ceg\u00e1+;\u00ef?\u0086\u00e8\u0013\u0086\u00e5\u00eaa\u001el\u00cf\u00fb\u000b\u00aa\u00bd\u00cfXv\u00ef(3\u0006\u00c0\u00db\u00df=|\u0088xL\u008b\r\\\u009db\u008c-\u00fcf\u00ef\u0098m\u007f\u00d4\u007f\u00c1\u008e\u00ee\u001e:x\u00dfk\u0001\u0099]\u00b4\u00fd\u00c8!{\u00f7\u0011+\u0006*I\u0013\u00af\u00de\u00d8\u00e55\u00adL\u00d0\u0096\u00cf\u00b5\u00c14\u009f5f\r(\u00fa\n\u0087W\u00be\u00b5\u00da\u00c2\u0095\u00ac`FRo\u001d\u00a5C1p\u00e6<\u0007r]G\u0001\u0095<\fS\u00f4n\u0084rP7\u00a9@;~^9\u0015\u009b\u009d\u0083.8\u00a4\u00a7N\u00d4\u00eb`e4\u0097C\u0084\u00ad\u0097LX\u000b\"\u0011\u00c5\u00f7".length();
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
                    var6_5 = "\u008f6\u0096\u00db\u0007\u008c\u0091\u00f6\u00dd\u00cb$\u00bb\u00b1\u00876\u00aa";
                    var7_6 = "\u008f6\u0096\u00db\u0007\u008c\u0091\u00f6\u00dd\u00cb$\u00bb\u00b1\u00876\u00aa".length();
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
        CommunicationProtocolManager.eb = var8_3;
        CommunicationProtocolManager.fb = new Integer[29];
        try {
            v8 = CommunicationProtocolManager.class.desiredAssertionStatus() == false;
        }
        catch (CustomSystemException v9) {
            throw CommunicationProtocolManager.a(v9);
        }
        CommunicationProtocolManager._j = v8;
    }

    private static void lambda$new$0() {
        GraphicalRenderingController.K.T(GraphicalRenderingController.F);
    }

    private GraphicalRenderEngine1082 M(@NotNull AbstractComputationKernel abstractComputationKernel, Runnable runnable) {
        long l = ab ^ 0x5F35A034D183L;
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(abstractComputationKernel.w(), abstractComputationKernel.b() + 11.0);
        graphicalRenderEngine1082.Q(CommunicationProtocolManager.M.g);
        graphicalRenderEngine1082.d().f((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)10428, (long)(0x581F86D91AAA1BEEL ^ l)), (long)-7576327965676244532L, (long)l)));
        graphicalRenderEngine1082.J(CommunicationProtocolManager.M.S);
        graphicalRenderEngine1082.d(1.0f);
        GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(abstractComputationKernel.w(), 10.0);
        graphicalRenderEngine10822.i(false);
        graphicalRenderEngine10822.d().f((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)2548, (long)(0x33BD9B8CF8BCBAACL ^ l)), (long)-7576327965676244532L, (long)l)));
        graphicalRenderEngine1082.n(graphicalRenderEngine10822, new Object[0]);
        HardwareYield hardwareYield = new HardwareYield((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)24913, (long)(0x2ADDF3BBCE5F520CL ^ l)), (long)-7576327965676244532L, (long)l)), 1.2, new Color(0, 0, 0, 0), CommunicationProtocolManager.M.w, 8.0, 8.0);
        hardwareYield.N(() -> CommunicationProtocolManager.lambda$createCenteredOverlayNode$11(runnable));
        graphicalRenderEngine10822.n(new PrecisionMathOrchestrator(2.0, 2.0, 2.0, 2.0, hardwareYield), new Object[0]);
        graphicalRenderEngine1082.n(abstractComputationKernel, new Object[0]);
        return graphicalRenderEngine1082;
    }

    public CompressionUtilityManager W(@Nullable CipherSessionManager cipherSessionManager, AbstractComputationKernel abstractComputationKernel) {
        CipherSessionManager cipherSessionManager2;
        try {
            cipherSessionManager2 = cipherSessionManager != null ? cipherSessionManager : this;
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        CompressionUtilityManager compressionUtilityManager = GraphicalRenderingController.v(cipherSessionManager2, abstractComputationKernel, CompressionUtilityManager.class);
        this.j(compressionUtilityManager);
        return compressionUtilityManager;
    }

    private static void lambda$openWithPublicListing$18(TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        block10: {
            long l = ab ^ 0x271C56AB98AFL;
            try {
                if (throwable != null) {
                    TemporalMetadataResolver.W(throwable);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
            try {
                if (!transactionStatusTracker.b()) {
                    TemporalMetadataResolver.x((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)30796, (long)(0x6771AF06ED1F0223L ^ l)), (long)-2308374141643966240L, (long)l)) + transactionStatusTracker.A());
                    IntegerComputationManager.q((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)4224, (long)(0x2B133E5059EFEAEDL ^ l)), (long)-2308374141643966240L, (long)l)) + transactionStatusTracker.A());
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
            try {
                try {
                    if (_j || transactionStatusTracker.h() != null) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw CommunicationProtocolManager.a(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
        }
        CommunicationProtocolManager.w(arg_0 -> CommunicationProtocolManager.lambda$null$17(transactionStatusTracker, arg_0));
    }

    @Override
    public double b() {
        return 214.0;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method p(long l, long l2) {
        int n = CommunicationProtocolManager.m(l, l2);
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
                clazz3 = CommunicationProtocolManager.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CommunicationProtocolManager.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CommunicationProtocolManager.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        CommunicationProtocolManager.qb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CommunicationProtocolManager.n(213056277254577L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CommunicationProtocolManager.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CommunicationProtocolManager.qb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CommunicationProtocolManager.n(213056277254577L, 0L);
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

    private static AbstractComputationKernel lambda$createRightContainer$6(Function function) {
        return (PrecisionMathOrchestrator)function.apply(null);
    }

    public CompressionUtilityManager g(@Nullable CipherSessionManager cipherSessionManager, AbstractComputationKernel abstractComputationKernel) {
        CipherSessionManager cipherSessionManager2;
        try {
            cipherSessionManager2 = cipherSessionManager != null ? cipherSessionManager : this;
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        CipherSessionManager cipherSessionManager3 = cipherSessionManager2;
        AtomicReference<CompressionUtilityManager> atomicReference = new AtomicReference<CompressionUtilityManager>();
        CompressionUtilityManager compressionUtilityManager = GraphicalRenderingController.v(cipherSessionManager3, this.M(abstractComputationKernel, () -> this.lambda$setCenteredOverlay$9(atomicReference)), CompressionUtilityManager.class);
        atomicReference.set(compressionUtilityManager);
        compressionUtilityManager.b((int)((cipherSessionManager3.w() - abstractComputationKernel.w()) / 2.0));
        compressionUtilityManager.H((int)((cipherSessionManager3.b() - abstractComputationKernel.b()) / 2.0));
        this.j(compressionUtilityManager);
        return compressionUtilityManager;
    }

    private void m(CipherContextManager1101 cipherContextManager1101, boolean bl) {
        block7: {
            try {
                if (cipherContextManager1101 == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
            try {
                try {
                    GraphicalRenderingController.X(cipherContextManager1101);
                    GraphicalRenderingController.z(cipherContextManager1101);
                    if (!(cipherContextManager1101.N() instanceof CipherContextManager1101) || bl) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CommunicationProtocolManager.a(customSystemException);
                }
                this.m((CipherContextManager1101)cipherContextManager1101.N(), true);
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
        }
    }

    private static TransactionStatusTracker lambda$openWithPublicListing$19(Throwable throwable) {
        return null;
    }

    private void lambda$createLeftContainer$1() {
        boolean bl;
        try {
            CommunicationProtocolManager communicationProtocolManager = this;
            bl = !this._C;
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        communicationProtocolManager._C = bl;
        this.v();
    }

    @Override
    public void u() {
    }

    private void v(GraphicalRenderEngine1082 graphicalRenderEngine1082) {
        block17: {
            int n;
            ClusterNodeOrchestrator2613 clusterNodeOrchestrator2613;
            block14: {
                int n2;
                ClusterNodeOrchestrator2613 clusterNodeOrchestrator26132;
                block16: {
                    block15: {
                        double d2;
                        HybridExecutionCoordinator hybridExecutionCoordinator;
                        HybridExecutionCoordinator hybridExecutionCoordinator2;
                        int n3;
                        double d3;
                        GraphicalRenderEngine1082 graphicalRenderEngine10822;
                        GraphicalRenderEngine1082 graphicalRenderEngine10823;
                        long l = ab ^ 0x757DE1D6F354L;
                        try {
                            GraphicalRenderEngine1082 graphicalRenderEngine10824;
                            CommunicationProtocolManager communicationProtocolManager = this;
                            graphicalRenderEngine10823 = graphicalRenderEngine10824;
                            graphicalRenderEngine10822 = graphicalRenderEngine10824;
                            d3 = graphicalRenderEngine1082.w() - this._R.w();
                            n3 = this._C ? 5 : 6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CommunicationProtocolManager.a(customSystemException);
                        }
                        graphicalRenderEngine10823(d3 - (double)n3, graphicalRenderEngine1082.b() + 10.0);
                        communicationProtocolManager._v = graphicalRenderEngine10822;
                        this._v.i(this._v.b());
                        this._v.d().f((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)7097, (long)(0xBC22DDD2AFB8A38L ^ l)), (long)-5472907554291952869L, (long)l)));
                        graphicalRenderEngine1082.n(this._v, new Object[0]);
                        this._v.n(new bE(0.0, 2.0), new Object[0]);
                        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)21685, (long)(0x449E22731C87452FL ^ l)), (long)-5472907554291952869L, (long)l)));
                        cryptographicContextManager153.q(true);
                        cryptographicContextManager153.B(CommunicationProtocolManager.M.w);
                        cryptographicContextManager153.p(0.7);
                        cryptographicContextManager153.S(0.0f);
                        this._v.n(cryptographicContextManager153, new Object[0]);
                        this._v.n(new bE(0.0, 5.0), new Object[0]);
                        HybridExecutionCoordinator hybridExecutionCoordinator3 = this._k;
                        try {
                            HybridExecutionCoordinator hybridExecutionCoordinator4;
                            CommunicationProtocolManager communicationProtocolManager = this;
                            hybridExecutionCoordinator2 = hybridExecutionCoordinator4;
                            hybridExecutionCoordinator = hybridExecutionCoordinator4;
                            d2 = this._C ? 240.0 : 324.0;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CommunicationProtocolManager.a(customSystemException);
                        }
                        hybridExecutionCoordinator2(d2, this::lambda$createRightContainer$4);
                        communicationProtocolManager._k = hybridExecutionCoordinator;
                        if (hybridExecutionCoordinator3 != null) {
                            this._k.X().y(hybridExecutionCoordinator3.X().a());
                            for (ResourceAllocationManager1348 resourceAllocationManager1348 : hybridExecutionCoordinator3.h().p()) {
                                this._k.h().u(resourceAllocationManager1348);
                            }
                        }
                        try {
                            try {
                                try {
                                    this._v.n(this._k, new Object[0]);
                                    this._v.n(new bE(0.0, 5.0), new Object[0]);
                                    if (this._J != null && !this._D) break block14;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CommunicationProtocolManager.a(customSystemException);
                                }
                                this._J = new ClusterNodeOrchestrator2613(this._v.w() - 6.0, 50.0);
                                this._J.q(new M(this._J));
                                this._J.d().f((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)20680, (long)(0x7241F6D81DEB4150L ^ l)), (long)-5472907554291952869L, (long)l)));
                                this._J.Y(false);
                                clusterNodeOrchestrator26132 = this._J;
                                if (!this._C) break block15;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CommunicationProtocolManager.a(customSystemException);
                            }
                            n2 = 3;
                            break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CommunicationProtocolManager.a(customSystemException);
                        }
                    }
                    n2 = 4;
                }
                clusterNodeOrchestrator26132.G(n2);
                this._J.O(CryptographicPolicyDescriptor.OUTSIDE);
                Function<ConfigurationParameterManager454, PrecisionMathOrchestrator> function = CommunicationProtocolManager::lambda$createRightContainer$5;
                this._J.D(() -> CommunicationProtocolManager.lambda$createRightContainer$6(function));
                this._J.a(() -> this.lambda$createRightContainer$8(function));
                this._J.I();
                break block17;
            }
            try {
                this._J.Y(this._v.w() - 6.0);
                clusterNodeOrchestrator2613 = this._J;
                n = this._C ? 3 : 4;
            }
            catch (CustomSystemException customSystemException) {
                throw CommunicationProtocolManager.a(customSystemException);
            }
            clusterNodeOrchestrator2613.G(n);
            this._J.y();
        }
        this._J.Q(this._v);
        this._J.i(false);
        this._v.n(this._J, new Object[0]);
    }

    private CompletableFuture lambda$createRightContainer$8(Function function) {
        String string;
        this._K = string = this._k.X().a().trim();
        return _b.S().M().T(this._Y, this._J.f(), string, this._k.h().p().stream().map(ResourceAllocationManager1348::p).collect(Collectors.toList())).thenApplyAsync(arg_0 -> this.lambda$null$7(function, arg_0), (Executor)GraphicalRenderingController.st);
    }

    private void I() {
        this._d = true;
        this.k();
        RuntimeMethodResolver runtimeMethodResolver = new RuntimeMethodResolver();
        this.n(new PrecisionMathOrchestrator(this.w() / 2.0 - runtimeMethodResolver.w() / 2.0, this.b() / 2.0 - runtimeMethodResolver.b() / 2.0 - 20.0, runtimeMethodResolver), new Object[0]);
        this.h(true);
    }

    private static TransactionStatusTracker lambda$openWithEditor$23(Throwable throwable) {
        return null;
    }

    private static void lambda$null$17(TransactionStatusTracker transactionStatusTracker, CommunicationProtocolManager communicationProtocolManager) {
        communicationProtocolManager.q((Ry)transactionStatusTracker.h());
    }

    public void i(TransactionDescriptor transactionDescriptor) {
        this.g(null, new CryptoAlgorithmResolver(this, transactionDescriptor));
    }

    public void R(CipherContextManager1101 cipherContextManager1101) {
        this.m(cipherContextManager1101, false);
    }

    public CipherModeRegistry v() {
        return this._Y;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = CommunicationProtocolManager.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CommunicationProtocolManager.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public void r(boolean bl, boolean bl2) {
        super.r(bl, bl2);
        this._I = false;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/f1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f9' || c == '\u00c5' || c == 'X' || c == '\u00e0') {
                field = CommunicationProtocolManager.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CommunicationProtocolManager.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void E() {
        try {
            if (!this._I) {
                this._I = true;
                this._D = true;
                this.v();
                this._D = false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        try {
            if (this._J != null) {
                this._J.h(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        try {
            if (this._v != null) {
                this._v.h(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        super.E();
    }

    @Override
    public void i() {
    }

    private void G(Ry ry) {
        yR yR2 = new yR(ry);
        yR2.T(92.0);
        yR2.f(() -> CommunicationProtocolManager.lambda$addPublicProfileButton$12(ry));
        this._q.n(new PrecisionMathOrchestrator(0.0, 1.0, yR2), new Object[0]);
    }

    @Override
    public double e() {
        return 356.0;
    }

    public void z(CipherModeRegistry cipherModeRegistry) {
        this._Y = cipherModeRegistry;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static PrecisionMathOrchestrator lambda$createRightContainer$5(ConfigurationParameterManager454 configurationParameterManager454) {
        Rh rh = new Rh(configurationParameterManager454);
        return new PrecisionMathOrchestrator(1.0, 2.0, 0.0, 3.0, rh);
    }

    private void v() {
        long l = ab ^ 0x40AA59287BC8L;
        try {
            if (!SystemLifecycleController.C.U().equals((Object)CryptographicModeEnum.ONLINE)) {
                this.I();
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        this._d = false;
        this.k();
        this.n(new GeometricTransformEngine(this.w(), 2.0, 0.5, 0.0, CommunicationProtocolManager.M.S), new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(this.e(), 185.0);
        this.n(graphicalRenderEngine1082, new Object[0]);
        graphicalRenderEngine1082.d().f((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)15668, (long)(0x6C2147183A86A426L ^ l)), (long)4364100484405844871L, (long)l)));
        this.R(graphicalRenderEngine1082);
        GraphicalRenderController graphicalRenderController = new GraphicalRenderController(1.0, graphicalRenderEngine1082.b() + 2.0, CommunicationProtocolManager.M.g);
        try {
            if (!this._C) {
                graphicalRenderEngine1082.n(graphicalRenderController, new Object[0]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CommunicationProtocolManager.a(customSystemException);
        }
        graphicalRenderEngine1082.n(new GeometricTransformEngine(4.0, 0.0, 0.5, 0.0, new Color(0, 0, 0, 0)), new Object[0]);
        this.v(graphicalRenderEngine1082);
        this._J.d().f((String)((Object)CommunicationProtocolManager.e("\u00d1", (int)CommunicationProtocolManager.d("s", (int)11578, (long)(0x27ED0408E4263437L ^ l)), (long)4364100484405844871L, (long)l)));
        this.h(true);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CommunicationProtocolManager.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CommunicationProtocolManager.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

