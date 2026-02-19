/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.C_;
import a.M;
import a.Ry;
import a._b;
import a.bE;
import a.hr;
import a.wx;
import a.y8;
import a.yC;
import a.yF;
import com.app.ui.styling.VisualStyleCompositor;
import com.async.pipeline.AsynchronousPipelineOrchestrator;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.scheduler.AsynchronousTaskScheduler253;
import com.concurrent.task.AsynchronousTaskCoordinator;
import com.config.parameters.ParameterConfigurationHandler;
import com.core.computation.AbstractComputationKernel;
import com.crypto.cipher.SymmetricCipherManager;
import com.crypto.operations.CipherOperationsManager;
import com.data.conversion.TemporalDataTransformer;
import com.data.serialization.JsonPayloadOrchestrator;
import com.data.streaming.DataStreamOrchestrator629;
import com.data.temporal.ChronoDataSynchronizer;
import com.encoding.registry.EncodingProtocolRegistry;
import com.exception.system.CustomSystemException;
import com.graphics.management.GraphicsResourceAllocator;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.theme.GraphicalThemeRenderer;
import com.identity.management.UniqueIdentifierManager;
import com.math.computation.IntegerComputationManager;
import com.math.precision.PrecisionMathOrchestrator;
import com.network.connection.NetworkConnectionManager1525;
import com.network.protocol.CommunicationProtocolManager;
import com.security.cryptography.CryptographicContextManager153;
import com.system.lifecycle.SystemLifecycleController;
import com.system.resource.ResourceAllocationManager1348;
import com.system.state.StateTransitionEngine;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.model.TransactionDescriptor;
import com.transaction.monitoring.TransactionStatusTracker;
import com.ui.rendering.GraphicalRenderingController;
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
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class yb
extends y8 {
    private static final long[] tb;
    private static final Integer[] ub;
    private final GraphicalThemeRenderer _n;
    @Nullable
    private final Ry _G;
    private static final String[] Hb;
    private AsynchronousPipelineOrchestrator _t;
    private final GraphicalThemeRenderer _s;
    @Nullable
    private final JsonPayloadOrchestrator _a;
    static final boolean __;
    private static final Map vb;
    private static final long fb;
    private static final Object[] Gb;

    @Override
    protected void x(GraphicalRenderEngine1082 graphicalRenderEngine1082) {
        Object object;
        StringBuilder stringBuilder;
        CryptographicContextManager153 cryptographicContextManager153;
        CryptographicContextManager153 cryptographicContextManager1532;
        long l = fb ^ 0x43FABF961DC5L;
        try {
            if (this._G == null) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw yb.b(customSystemException);
        }
        graphicalRenderEngine1082.n(new bE(0.0, 2.0), new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(this.I().w(), 10.0);
        graphicalRenderEngine10822.i(false);
        graphicalRenderEngine10822.n(new bE(5.0, 0.0), new Object[0]);
        CipherOperationsManager cipherOperationsManager = new CipherOperationsManager(this._G.E(), 10.0, 10.0);
        try {
            CryptographicContextManager153 cryptographicContextManager1533;
            graphicalRenderEngine10822.n(cipherOperationsManager, new Object[0]);
            cryptographicContextManager1532 = cryptographicContextManager1533;
            cryptographicContextManager153 = cryptographicContextManager1533;
            stringBuilder = new StringBuilder().append((String)((Object)yb.k("S", (int)yb.e("g", (int)23782, (long)(0x165D3890027C6E45L ^ l)), (long)6636186670359241413L, (long)l)));
            object = this._G.E() != null ? this._G.E().X() : yb.k("S", (int)yb.e("g", (int)12745, (long)(0x155A39F1B6AA8371L ^ l)), (long)6636186670359241413L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw yb.b(customSystemException);
        }
        cryptographicContextManager1532(stringBuilder.append((String)object).toString());
        CryptographicContextManager153 cryptographicContextManager1534 = cryptographicContextManager153;
        cryptographicContextManager1534.q(true);
        cryptographicContextManager1534.w(10.0);
        graphicalRenderEngine10822.n(cryptographicContextManager1534, new Object[0]);
        graphicalRenderEngine1082.n(graphicalRenderEngine10822, new Object[0]);
    }

    private void lambda$null$8(TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        UniqueIdentifierManager uniqueIdentifierManager;
        long l;
        block10: {
            l = fb ^ 0x169084FB72FCL;
            try {
                if (throwable != null) {
                    TemporalMetadataResolver.W(throwable);
                    IntegerComputationManager.q((String)((Object)yb.k("S", (int)yb.e("g", (int)14449, (long)(0x7A602FCE38FBE5F3L ^ l)), (long)3684276512914968060L, (long)l)));
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw yb.b(customSystemException);
            }
            try {
                if (!transactionStatusTracker.b()) {
                    TemporalMetadataResolver.x((String)((Object)yb.k("S", (int)yb.e("g", (int)17133, (long)(0x13D8268582271F57L ^ l)), (long)3684276512914968060L, (long)l)) + transactionStatusTracker.A());
                    IntegerComputationManager.q((String)((Object)yb.k("S", (int)yb.e("g", (int)10887, (long)(0x361366FA47D07715L ^ l)), (long)3684276512914968060L, (long)l)) + transactionStatusTracker.A());
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw yb.b(customSystemException);
            }
            uniqueIdentifierManager = (UniqueIdentifierManager)transactionStatusTracker.h();
            try {
                try {
                    if (__ || uniqueIdentifierManager != null) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw yb.b(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw yb.b(customSystemException);
            }
        }
        TransactionDescriptor transactionDescriptor = new TransactionDescriptor(uniqueIdentifierManager.S(), uniqueIdentifierManager.H());
        transactionDescriptor.P(uniqueIdentifierManager.N());
        transactionDescriptor.e(uniqueIdentifierManager.N());
        TemporalMetadataResolver.h.o().Q(transactionDescriptor);
        this.l();
        IntegerComputationManager.G((String)((Object)yb.k("S", (int)yb.e("g", (int)12147, (long)(0x14E97E3AEFB7F2D6L ^ l)), (long)3684276512914968060L, (long)l)) + uniqueIdentifierManager.S());
    }

    private void lambda$null$15(boolean bl) {
        this.D();
        this.I(bl);
    }

    public yb(CommunicationProtocolManager communicationProtocolManager, @Nullable Ry ry, @Nullable JsonPayloadOrchestrator jsonPayloadOrchestrator) {
        long l = fb ^ 0x6F847B4D492AL;
        super(communicationProtocolManager, ry, jsonPayloadOrchestrator);
        this._n = new GraphicalThemeRenderer((String)((Object)yb.k("S", (int)yb.e("g", (int)19797, (long)(0x53A794350E4AAB3FL ^ l)), (long)646078405907494442L, (long)l)), 0.8);
        this._s = new GraphicalThemeRenderer((String)((Object)yb.k("S", (int)yb.e("g", (int)20558, (long)(0x173F4D4AE573615L ^ l)), (long)646078405907494442L, (long)l)), 0.8);
        this._G = ry;
        this._a = jsonPayloadOrchestrator;
        this.g(this::I);
        this.J();
    }

    private void L() {
        block6: {
            block4: {
                block5: {
                    try {
                        try {
                            if (this._G.d() == null) break block4;
                            if (!this._G.d().s()) break block5;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw yb.b(customSystemException);
                        }
                        this._n.H(yb.M.Y);
                        this._s.H(yb.M.Z);
                        break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw yb.b(customSystemException);
                    }
                }
                this._s.H(yb.M.O);
                this._n.H(yb.M.Z);
                break block6;
            }
            this._n.H(yb.M.Z);
            this._s.H(yb.M.Z);
        }
    }

    private static AbstractComputationKernel lambda$viewDetails$2(Function function) {
        return (AsynchronousTaskCoordinator)function.apply(null);
    }

    private static void fb() {
        Object[] objectArray = Gb;
        Gb[0] = "+[\u0010";
        objectArray[1] = Integer.TYPE;
        yb.Hb[1] = "java/lang/Integer";
        objectArray[2] = ")k\u0010\u0000Qz\"d\u0001O,b1c\b\u0006";
        objectArray[3] = "\u0018&\u000f\\0E\u0013)\u001e\u0013QK\u0018\"\u001aI";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "{\u001fwTw)/\u000485#l\u0015\n/R\"o)C\u007fRH--\u0007%X/-n\u001a-5";
    }

    private void l() {
        Object object;
        long l;
        block11: {
            block10: {
                l = fb ^ 0x76A7F5415D4AL;
                try {
                    this.v();
                    this.BM.d().f((String)((Object)yb.k("S", (int)yb.e("g", (int)4855, (long)(0x1022302E0F4060F1L ^ l)), (long)2060200844110242378L, (long)l)));
                    this.BM.n(new bE(0.0, 8.0), yb.k("S", (int)yb.e("g", (int)29894, (long)(0x7B541D80581F86D3L ^ l)), (long)2060200844110242378L, (long)l));
                    this.BM.n(new bE(5.0, 0.0), new Object[0]);
                    if (!SystemLifecycleController.C.B(this._G.E())) break block10;
                    this.BM.n(new bE(45.0, 0.0), new Object[0]);
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw yb.b(customSystemException);
                }
            }
            this._n.R(yb.M.u);
            this._n.C(this::lambda$footerDownload$6);
            this._s.R(yb.M.b);
            this._s.C(this::lambda$footerDownload$7);
            this.L();
            object = new yF(this._n, this._s);
            ((AbstractComputationKernel)object).T(45.0);
            ((AbstractComputationKernel)object).w(15.0);
            this.BM.n((AbstractComputationKernel)object, new Object[0]);
        }
        object = TemporalMetadataResolver.h.o().Y(this._G.H());
        if (object == null) {
            this.BM.n(new bE(15.0, 0.0), new Object[0]);
            hr hr2 = new hr((String)((Object)yb.k("S", (int)yb.e("g", (int)1184, (long)(0x7ED49C092011F689L ^ l)), (long)2060200844110242378L, (long)l)), 0.8, yb.M.Y, yb.M.u);
            hr2.q(false);
            hr2.A(Color.WHITE);
            hr2.T(144.0);
            hr2.w(15.0);
            hr2.f(this::lambda$footerDownload$10);
            this.BM.n(hr2, new Object[0]);
        } else {
            block12: {
                try {
                    try {
                        if (__ || ((TransactionDescriptor)object).p() != null) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw yb.b(customSystemException);
                    }
                    throw new AssertionError();
                }
                catch (CustomSystemException customSystemException) {
                    throw yb.b(customSystemException);
                }
            }
            if (this._G.t() == ((TransactionDescriptor)object).p().z()) {
                this.BM.n(new bE(68.0, 0.0), new Object[0]);
                yC yC2 = new yC((String)((Object)yb.k("S", (int)yb.e("g", (int)9557, (long)(0x3AF002BE8350D77DL ^ l)), (long)2060200844110242378L, (long)l)), 8.0, 8.0, 8.0, 8.0, yb.M.Z, yb.M.Z, null);
                this.BM.n(new PrecisionMathOrchestrator(4.0, 0.0, 0.0, 0.0, yC2), new Object[0]);
                CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)yb.k("S", (int)yb.e("g", (int)23814, (long)(0x5871EF0C7C07AF25L ^ l)), (long)2060200844110242378L, (long)l)), 0.8, yb.M.n, true);
                cryptographicContextManager153.S(3.0f);
                cryptographicContextManager153.T(70.0);
                cryptographicContextManager153.w(17.0);
                this.BM.n(cryptographicContextManager153, new Object[0]);
            } else {
                this.BM.n(new bE(12.0, 0.0), new Object[0]);
                VisualStyleCompositor visualStyleCompositor = new VisualStyleCompositor((String)((Object)yb.k("S", (int)yb.e("g", (int)2956, (long)(0x6994D6F2B665798FL ^ l)), (long)2060200844110242378L, (long)l)), 8.0f, 8.0f);
                visualStyleCompositor.T(10.0);
                visualStyleCompositor.w(12.0);
                this.BM.n(visualStyleCompositor, new Object[0]);
                CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)yb.k("S", (int)yb.e("g", (int)22208, (long)(0x1170F7715A8EA4F6L ^ l)), (long)2060200844110242378L, (long)l)), 0.8, yb.M.n, true);
                cryptographicContextManager153.T(75.0);
                cryptographicContextManager153.w(17.0);
                this.BM.n(cryptographicContextManager153, new Object[0]);
                hr hr3 = new hr((String)((Object)yb.k("S", (int)yb.e("g", (int)22010, (long)(0x324A2A1776EB27FDL ^ l)), (long)2060200844110242378L, (long)l)), 0.8, yb.M.Y, yb.M.u);
                hr3.T(60.0);
                hr3.w(15.0);
                hr3.q(false);
                hr3.A(Color.WHITE);
                hr3.f(() -> this.lambda$footerDownload$13((TransactionDescriptor)object));
                this.BM.n(hr3, new Object[0]);
            }
        }
    }

    private CompletableFuture lambda$footerDownload$10() {
        return ((CompletableFuture)_b.S().M().X(this._G.H()).whenCompleteAsync(this::lambda$null$8, (Executor)GraphicalRenderingController.st)).exceptionally(yb::lambda$null$9);
    }

    private void lambda$footerDownload$6() {
        this.I(true);
    }

    private void p(AsynchronousTaskCoordinator asynchronousTaskCoordinator) {
        long l = fb ^ 0x65510312745L;
        this.v();
        this.BM.d().f((String)((Object)yb.k("S", (int)yb.e("g", (int)5054, (long)(0x6F073C5B6E8D9BA7L ^ l)), (long)7392726075204622405L, (long)l)));
        this.BM.n(new bE(0.0, 8.0), yb.k("S", (int)yb.e("g", (int)17661, (long)(0x4081BA28AFACCD7L ^ l)), (long)7392726075204622405L, (long)l));
        this.BM.n(new bE(5.0, 0.0), new Object[0]);
        AsynchronousTaskScheduler253 asynchronousTaskScheduler253 = new AsynchronousTaskScheduler253(this._G, asynchronousTaskCoordinator.S().s(), true, this::l, this::D);
        asynchronousTaskScheduler253.h().y(asynchronousTaskCoordinator.S().q());
        asynchronousTaskScheduler253.T(this.BM.w() - 5.0);
        asynchronousTaskScheduler253.w(this.BM.b() - 8.0);
        this.BM.n(asynchronousTaskScheduler253, new Object[0]);
    }

    private void lambda$footerReviewInput$14() {
        this._G.d().c(this._G, this::D);
    }

    private AsynchronousTaskCoordinator lambda$viewDetails$1(TemporalDataTransformer temporalDataTransformer) {
        return new AsynchronousTaskCoordinator(this._G, temporalDataTransformer, this._t.w(), EncodingProtocolRegistry.OTHER);
    }

    private static TransactionStatusTracker lambda$null$9(Throwable throwable) {
        return null;
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = yb.f(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6EB1;
        if (ub[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = tb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])vb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    vb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            yb.ub[n2] = n3;
        }
        return ub[n2];
    }

    private void I() {
        GraphicalRenderEngine1082 graphicalRenderEngine1082;
        long l;
        block7: {
            l = fb ^ 0x40787EB3E57AL;
            try {
                try {
                    if (__ || this._G != null) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw yb.b(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw yb.b(customSystemException);
            }
        }
        this.m();
        double d2 = this.Ba.w();
        this.getClass();
        double d3 = d2 - 5.0;
        GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(d3, 12.0);
        graphicalRenderEngine10822.d().f((String)((Object)yb.k("S", (int)yb.e("g", (int)23471, (long)(0x7A0BF718E63D1197L ^ l)), (long)-6582156956820825478L, (long)l)));
        graphicalRenderEngine10822.i(false);
        this.Ba.n(graphicalRenderEngine10822, new Object[0]);
        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)yb.k("S", (int)yb.e("g", (int)28494, (long)(0x44542192AA972569L ^ l)), (long)-6582156956820825478L, (long)l)), 0.9);
        cryptographicContextManager153.S(0.0f);
        cryptographicContextManager153.q(true);
        cryptographicContextManager153.B(yb.M.c);
        graphicalRenderEngine10822.n(cryptographicContextManager153, new Object[0]);
        cryptographicContextManager153.T(graphicalRenderEngine10822.w());
        SymmetricCipherManager symmetricCipherManager = new SymmetricCipherManager(d3);
        symmetricCipherManager.i(false);
        wx wx2 = new wx(this._G.G(), d3);
        CryptographicContextManager153 cryptographicContextManager1532 = new CryptographicContextManager153((String)((Object)yb.k("S", (int)yb.e("g", (int)11975, (long)(0xA8733278E1D64C5L ^ l)), (long)-6582156956820825478L, (long)l)) + ChronoDataSynchronizer.T(this._G.Z()), 0.8);
        cryptographicContextManager1532.w(8.0);
        cryptographicContextManager1532.T(d3);
        cryptographicContextManager1532.S(0.0f);
        wx2.W().n(new bE(0.0, 6.0), new Object[0]);
        wx2.W().n(cryptographicContextManager1532, new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine10823 = new GraphicalRenderEngine1082(d3, 10.0);
        graphicalRenderEngine10823.d().J(true);
        graphicalRenderEngine10823.i(false);
        CryptographicContextManager153 cryptographicContextManager1533 = new CryptographicContextManager153((String)((Object)yb.k("S", (int)yb.e("g", (int)23258, (long)(0x1488BB37B07D90D0L ^ l)), (long)-6582156956820825478L, (long)l)) + this._G.b(), 0.8);
        cryptographicContextManager1533.w(8.0);
        cryptographicContextManager1533.S(0.0f);
        graphicalRenderEngine10823.n(cryptographicContextManager1533, new Object[0]);
        yC yC2 = new yC((String)((Object)yb.k("S", (int)yb.e("g", (int)27862, (long)(0x351D7283B9EA6E6L ^ l)), (long)-6582156956820825478L, (long)l)), 4.0, 4.0, 8.0, 8.0, yb.M.Z, yb.M.q, yb.M.S);
        yC2.k(0.75f);
        yC2.y(2.0);
        yC2.c(2.0);
        graphicalRenderEngine10823.n(new bE(4.0, 0.0), new Object[0]);
        graphicalRenderEngine10823.n(yC2, new Object[0]);
        yC2.C(this::lambda$viewDetails$0);
        wx2.W().n(graphicalRenderEngine10823, new Object[0]);
        symmetricCipherManager.n(wx2, new Object[0]);
        symmetricCipherManager.n(new bE(0.0, 8.0), new Object[0]);
        this.Ba.n(symmetricCipherManager, new Object[0]);
        if (!this._G.o().isEmpty()) {
            graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d3, 12.0);
            graphicalRenderEngine1082.d().f((String)((Object)yb.k("S", (int)yb.e("g", (int)2237, (long)(0x2A68CF3E0D9BC2A3L ^ l)), (long)-6582156956820825478L, (long)l)));
            graphicalRenderEngine1082.i(false);
            this.Ba.n(graphicalRenderEngine1082, new Object[0]);
            for (String stringArray2 : this._G.o()) {
                graphicalRenderEngine1082.n(new ResourceAllocationManager1348(stringArray2), new Object[0]);
                graphicalRenderEngine1082.n(new bE(2.0, 0.0), new Object[0]);
            }
        }
        this.Ba.n(new bE(0.0, 5.0), new Object[0]);
        graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d3, 40.0);
        graphicalRenderEngine1082.d().f((String)((Object)yb.k("S", (int)yb.e("g", (int)10739, (long)(0x7491B34F69DD63F0L ^ l)), (long)-6582156956820825478L, (long)l)));
        graphicalRenderEngine1082.i(false);
        this.Ba.n(graphicalRenderEngine1082, new Object[0]);
        String[] stringArray3 = new String[]{yb.k("S", (int)yb.e("g", (int)12372, (long)(0x2D0C23AB35EEFA59L ^ l)), (long)-6582156956820825478L, (long)l), yb.k("S", (int)yb.e("g", (int)18344, (long)(0x615E1ED2BA298DB7L ^ l)), (long)-6582156956820825478L, (long)l), yb.k("S", (int)yb.e("g", (int)13552, (long)(0x513357FD0BB4FEF0L ^ l)), (long)-6582156956820825478L, (long)l)};
        String[] stringArray = new String[]{String.valueOf(this._G.B()), ChronoDataSynchronizer.A(this._G.u()), String.valueOf(this._G.b())};
        graphicalRenderEngine1082.n(new bE(0.0, 5.0), yb.k("S", (int)yb.e("g", (int)31338, (long)(0x11BD446FF6ED3065L ^ l)), (long)-6582156956820825478L, (long)l));
        for (int function = 0; function < stringArray3.length; ++function) {
            String string = stringArray3[function];
            String string2 = stringArray[function];
            StateTransitionEngine stateTransitionEngine = new StateTransitionEngine(string, string2);
            stateTransitionEngine.T(graphicalRenderEngine1082.w() / (double)stringArray3.length - 2.0);
            stateTransitionEngine.w(29.0);
            graphicalRenderEngine1082.n(new PrecisionMathOrchestrator(1.0, stateTransitionEngine), yb.k("S", (int)yb.e("g", (int)17003, (long)(0x18480FB015680862L ^ l)), (long)-6582156956820825478L, (long)l));
        }
        graphicalRenderEngine1082.n(new bE(0.0, 5.0), yb.k("S", (int)yb.e("g", (int)5303, (long)(0x575E1AF8AE35EA0L ^ l)), (long)-6582156956820825478L, (long)l));
        this._t = new AsynchronousPipelineOrchestrator(d3, 50.0, 2);
        this._t.E(6);
        this._t.q(new M(this._t));
        this._t.d().f((String)((Object)yb.k("S", (int)yb.e("g", (int)4860, (long)(0x77B4E461255658EDL ^ l)), (long)-6582156956820825478L, (long)l)));
        this._t.i(false);
        this._t.Y(false);
        this._t.Q(this.Ba);
        Function<TemporalDataTransformer, AsynchronousTaskCoordinator> function = this::lambda$viewDetails$1;
        this._t.D(() -> yb.lambda$viewDetails$2(function));
        this._t.a(() -> this.lambda$viewDetails$4(function));
        this._t.Z(this._G.e());
        this.Ba.n(this._t, new Object[0]);
        this.D();
    }

    private static Field w(long l, long l2) {
        int n = yb.u(l, l2);
        Object object = Gb[n];
        if (object instanceof String) {
            String string = Hb[n];
            int n2 = string.indexOf(8);
            Class clazz = yb.v(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = yb.v(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = yb.k(clazz3, string2, clazz2)) != null) {
                    yb.Gb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = yb.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        yb.Gb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = yb.v(246209546687668L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void D() {
        long l = fb ^ 0x603EC8CF258CL;
        this._t.k();
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(this._t.w(), 8.0);
        graphicalRenderEngine1082.d().f((String)((Object)yb.k("S", (int)yb.e("g", (int)13985, (long)(0x185FA424A321BC68L ^ l)), (long)7228659317579766412L, (long)l)));
        graphicalRenderEngine1082.i(false);
        this._t.n(graphicalRenderEngine1082, new Object[0]);
        graphicalRenderEngine1082.n(new GraphicsResourceAllocator((String)((Object)yb.k("S", (int)yb.e("g", (int)29486, (long)(0x59CE36012CB279ECL ^ l)), (long)7228659317579766412L, (long)l)), String.valueOf(this._G.j()), 8.0, 0.8), new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(65.0, graphicalRenderEngine1082.b());
        graphicalRenderEngine10822.d().f((String)((Object)yb.k("S", (int)yb.e("g", (int)9292, (long)(0x7043303618392E8BL ^ l)), (long)7228659317579766412L, (long)l)));
        graphicalRenderEngine10822.i(false);
        graphicalRenderEngine1082.n(graphicalRenderEngine10822, yb.k("S", (int)yb.e("g", (int)20266, (long)(0xAA7AC5867D4C5E5L ^ l)), (long)7228659317579766412L, (long)l));
        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153(this._G.U() + (String)((Object)yb.k("S", (int)yb.e("g", (int)11625, (long)(0x6F2B8DE4D56E2784L ^ l)), (long)7228659317579766412L, (long)l)), 0.8, yb.M.Y);
        graphicalRenderEngine10822.n(cryptographicContextManager153, new Object[0]);
        this._t.n(new bE(0.0, 5.0), yb.k("S", (int)yb.e("g", (int)26344, (long)(0x31D70D147DCEEC0EL ^ l)), (long)7228659317579766412L, (long)l));
        TemporalDataTransformer temporalDataTransformer = this._G.d();
        if (temporalDataTransformer != null) {
            AsynchronousTaskCoordinator asynchronousTaskCoordinator = new AsynchronousTaskCoordinator(this._G, temporalDataTransformer, this._t.w(), EncodingProtocolRegistry.SELF).N(this::D);
            asynchronousTaskCoordinator.n(() -> this.lambda$updateReviewsContainer$5(asynchronousTaskCoordinator));
            this._t.n(asynchronousTaskCoordinator, new Object[0]);
            this._t.n(new bE(0.0, 2.0), new Object[0]);
        }
        for (TemporalDataTransformer temporalDataTransformer2 : this._G.e().v()) {
            this._t.n(new AsynchronousTaskCoordinator(this._G, temporalDataTransformer2, this._t.w(), EncodingProtocolRegistry.OTHER), new Object[0]);
            this._t.n(new bE(0.0, 2.0), new Object[0]);
        }
        this._t.P(this._t.d().R());
        this._t.i(this._t.F());
        this.L();
    }

    private List lambda$null$3(Function function, TransactionStatusTracker transactionStatusTracker) {
        block8: {
            try {
                if (!transactionStatusTracker.b()) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw yb.b(customSystemException);
            }
            try {
                try {
                    if (__ || transactionStatusTracker.h() != null) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw yb.b(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw yb.b(customSystemException);
            }
        }
        this._t.Z((DataStreamOrchestrator629)transactionStatusTracker.h());
        ArrayList arrayList = new ArrayList();
        for (TemporalDataTransformer temporalDataTransformer : ((DataStreamOrchestrator629)transactionStatusTracker.h()).v()) {
            arrayList.add(function.apply(temporalDataTransformer));
        }
        return arrayList;
    }

    private static Class v(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = yb.u(l, l2);
            object = Gb[n];
            try {
                if (!(object instanceof String)) break block2;
                yb.Gb[n] = clazz = Class.forName(Hb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void I(boolean bl) {
        boolean bl2;
        boolean bl3;
        Ry ry;
        AsynchronousTaskScheduler253 asynchronousTaskScheduler253;
        AsynchronousTaskScheduler253 asynchronousTaskScheduler2532;
        long l;
        block9: {
            block11: {
                block10: {
                    l = fb ^ 0x1118001DB4F9L;
                    try {
                        if (SystemLifecycleController.C.B(this._G.E())) {
                            return;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw yb.b(customSystemException);
                    }
                    try {
                        try {
                            if (this._G.d() == null) break block9;
                            if (this._G.d().s() != bl) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw yb.b(customSystemException);
                        }
                        C_.P(this.V(), (String)((Object)yb.k("S", (int)yb.e("g", (int)13317, (long)(0x1ABC34E3AADE2F94L ^ l)), (long)-782453708654228487L, (long)l)), (String)((Object)yb.k("S", (int)yb.e("g", (int)10782, (long)(0x69F64320E3C2B193L ^ l)), (long)-782453708654228487L, (long)l)), (String)((Object)yb.k("S", (int)yb.e("g", (int)24495, (long)(0x267172F5D277C412L ^ l)), (long)-782453708654228487L, (long)l)), this::lambda$footerReviewInput$14);
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw yb.b(customSystemException);
                    }
                }
                C_.P(this.V(), (String)((Object)yb.k("S", (int)yb.e("g", (int)2919, (long)(0x185D4B7553B690F2L ^ l)), (long)-782453708654228487L, (long)l)), (String)((Object)yb.k("S", (int)yb.e("g", (int)12159, (long)(0x34CD9E6428ABB4FDL ^ l)), (long)-782453708654228487L, (long)l)), (String)((Object)yb.k("S", (int)yb.e("g", (int)8834, (long)(0x5E14E93A6ACE391BL ^ l)), (long)-782453708654228487L, (long)l)), () -> this.lambda$footerReviewInput$16(bl));
            }
            return;
        }
        try {
            AsynchronousTaskScheduler253 asynchronousTaskScheduler2533;
            this.v();
            this.BM.d().f((String)((Object)yb.k("S", (int)yb.e("g", (int)11542, (long)(0x6E0BB2F172BCB6A0L ^ l)), (long)-782453708654228487L, (long)l)));
            this.BM.n(new bE(0.0, 8.0), yb.k("S", (int)yb.e("g", (int)14892, (long)(0x66C7FE9A85EB21AAL ^ l)), (long)-782453708654228487L, (long)l));
            this.BM.n(new bE(5.0, 0.0), new Object[0]);
            asynchronousTaskScheduler2532 = asynchronousTaskScheduler2533;
            asynchronousTaskScheduler253 = asynchronousTaskScheduler2533;
            ry = this._G;
            bl3 = bl;
            bl2 = this._G.d() != null;
        }
        catch (CustomSystemException customSystemException) {
            throw yb.b(customSystemException);
        }
        asynchronousTaskScheduler2532(ry, bl3, bl2, this::l, this::D);
        AsynchronousTaskScheduler253 asynchronousTaskScheduler2534 = asynchronousTaskScheduler253;
        asynchronousTaskScheduler2534.T(this.BM.w() - 5.0);
        asynchronousTaskScheduler2534.w(this.BM.b() - 8.0);
        this.BM.n(asynchronousTaskScheduler2534, new Object[0]);
    }

    private CompletableFuture lambda$footerDownload$13(TransactionDescriptor transactionDescriptor) {
        return ((CompletableFuture)_b.S().M().i(this._G.H()).whenCompleteAsync((arg_0, arg_1) -> this.lambda$null$11(transactionDescriptor, arg_0, arg_1), (Executor)GraphicalRenderingController.st)).exceptionally(yb::lambda$null$12);
    }

    private static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = yb.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = yb.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method x(long l, long l2) {
        int n = yb.u(l, l2);
        Object object = Gb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = Hb[n];
                int n3 = string2.indexOf(8);
                clazz3 = yb.v(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = yb.v(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = yb.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        yb.Gb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = yb.v(246209546687668L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = yb.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        yb.Gb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = yb.v(246209546687668L, 0L);
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

    private static Method k(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private void lambda$footerDownload$7() {
        this.I(false);
    }

    private CompletableFuture lambda$viewDetails$4(Function function) {
        return _b.S().M().E(this._G, this._t.f()).thenApplyAsync(arg_0 -> this.lambda$null$3(function, arg_0), (Executor)GraphicalRenderingController.st);
    }

    private static int u(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (Hb[n4] != null) {
            return n4;
        }
        Object object = Gb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 27;
                break;
            }
            case 1: {
                n3 = 14;
                break;
            }
            case 2: {
                n3 = 51;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 12;
                break;
            }
            case 5: {
                n3 = 4;
                break;
            }
            case 6: {
                n3 = 1;
                break;
            }
            case 7: {
                n3 = 63;
                break;
            }
            case 8: {
                n3 = 41;
                break;
            }
            case 9: {
                n3 = 28;
                break;
            }
            case 10: {
                n3 = 56;
                break;
            }
            case 11: {
                n3 = 30;
                break;
            }
            case 12: {
                n3 = 22;
                break;
            }
            case 13: {
                n3 = 61;
                break;
            }
            case 14: {
                n3 = 60;
                break;
            }
            case 15: {
                n3 = 16;
                break;
            }
            case 16: {
                n3 = 8;
                break;
            }
            case 17: {
                n3 = 44;
                break;
            }
            case 18: {
                n3 = 33;
                break;
            }
            case 19: {
                n3 = 24;
                break;
            }
            case 20: {
                n3 = 23;
                break;
            }
            case 21: {
                n3 = 49;
                break;
            }
            case 22: {
                n3 = 19;
                break;
            }
            case 23: {
                n3 = 25;
                break;
            }
            case 24: {
                n3 = 21;
                break;
            }
            case 25: {
                n3 = 34;
                break;
            }
            case 26: {
                n3 = 52;
                break;
            }
            case 27: {
                n3 = 10;
                break;
            }
            case 28: {
                n3 = 15;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 47;
                break;
            }
            case 31: {
                n3 = 57;
                break;
            }
            case 32: {
                n3 = 6;
                break;
            }
            case 33: {
                n3 = 3;
                break;
            }
            case 34: {
                n3 = 35;
                break;
            }
            case 35: {
                n3 = 7;
                break;
            }
            case 36: {
                n3 = 59;
                break;
            }
            case 37: {
                n3 = 36;
                break;
            }
            case 38: {
                n3 = 2;
                break;
            }
            case 39: {
                n3 = 5;
                break;
            }
            case 40: {
                n3 = 55;
                break;
            }
            case 41: {
                n3 = 40;
                break;
            }
            case 42: {
                n3 = 46;
                break;
            }
            case 43: {
                n3 = 58;
                break;
            }
            case 44: {
                n3 = 62;
                break;
            }
            case 45: {
                n3 = 50;
                break;
            }
            case 46: {
                n3 = 26;
                break;
            }
            case 47: {
                n3 = 9;
                break;
            }
            case 48: {
                n3 = 32;
                break;
            }
            case 49: {
                n3 = 43;
                break;
            }
            case 50: {
                n3 = 42;
                break;
            }
            case 51: {
                n3 = 18;
                break;
            }
            case 52: {
                n3 = 48;
                break;
            }
            case 53: {
                n3 = 29;
                break;
            }
            case 54: {
                n3 = 17;
                break;
            }
            case 55: {
                n3 = 11;
                break;
            }
            case 56: {
                n3 = 20;
                break;
            }
            case 57: {
                n3 = 31;
                break;
            }
            case 58: {
                n3 = 39;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 38;
                break;
            }
            case 61: {
                n3 = 0;
                break;
            }
            case 62: {
                n3 = 54;
                break;
            }
            default: {
                n3 = 45;
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
        yb.Hb[n4] = new String(cArray);
        return n4;
    }

    private void lambda$footerReviewInput$16(boolean bl) {
        this._G.d().c(this._G, () -> this.lambda$null$15(bl));
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$updateReviewsContainer$5(AsynchronousTaskCoordinator asynchronousTaskCoordinator) {
        this.p(asynchronousTaskCoordinator);
    }

    private void lambda$null$11(TransactionDescriptor transactionDescriptor, TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        UniqueIdentifierManager uniqueIdentifierManager;
        long l;
        block10: {
            l = fb ^ 0x4EC99D8BDEA0L;
            try {
                if (throwable != null) {
                    TemporalMetadataResolver.W(throwable);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw yb.b(customSystemException);
            }
            try {
                if (!transactionStatusTracker.b()) {
                    TemporalMetadataResolver.x((String)((Object)yb.k("S", (int)yb.e("g", (int)16020, (long)(0x6E453F200C42CF75L ^ l)), (long)-6954272855111753312L, (long)l)) + transactionStatusTracker.A());
                    IntegerComputationManager.q((String)((Object)yb.k("S", (int)yb.e("g", (int)9069, (long)(0x284802C733A5D293L ^ l)), (long)-6954272855111753312L, (long)l)) + transactionStatusTracker.A());
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw yb.b(customSystemException);
            }
            uniqueIdentifierManager = (UniqueIdentifierManager)transactionStatusTracker.h();
            try {
                try {
                    if (__ || uniqueIdentifierManager != null) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw yb.b(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw yb.b(customSystemException);
            }
        }
        transactionDescriptor.P(uniqueIdentifierManager.N());
        this.l();
        IntegerComputationManager.G((String)((Object)yb.k("S", (int)yb.e("g", (int)10799, (long)(0x595AD5034CD5DBFDL ^ l)), (long)-6954272855111753312L, (long)l)) + uniqueIdentifierManager.S());
    }

    private void X() {
        long l = fb ^ 0x52FCD7E84EA1L;
        this.y();
        this.Ba.N(false);
        this.BM.N(false);
        double d2 = this.T().w();
        this.getClass();
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d2 - (double)(5.0f * 2.0f), this.T().b());
        graphicalRenderEngine1082.i(false);
        graphicalRenderEngine1082.d().f((String)((Object)yb.k("S", (int)yb.e("g", (int)22234, (long)(0x2D9B0D63335DB73CL ^ l)), (long)1115882925167980961L, (long)l)));
        this.T().n(graphicalRenderEngine1082, new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(30.0, 10.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 2.0), new Object[0]);
        double d3 = graphicalRenderEngine1082.w();
        this.getClass();
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(d3 - 5.0, 20.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 2.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(graphicalRenderEngine1082.w() / 2.0, 10.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 5.0), new Object[0]);
        double d4 = graphicalRenderEngine1082.w();
        this.getClass();
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(d4 - 5.0, 30.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 5.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(50.0, 10.0), yb.k("S", (int)yb.e("g", (int)6277, (long)(0x305C1FDB0675F943L ^ l)), (long)1115882925167980961L, (long)l));
        graphicalRenderEngine1082.n(new bE(graphicalRenderEngine1082.w() - 100.0, 2.0), yb.k("S", (int)yb.e("g", (int)18773, (long)(0x5851283641E728BCL ^ l)), (long)1115882925167980961L, (long)l));
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(45.0, 10.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 5.0), new Object[0]);
        double d5 = graphicalRenderEngine1082.w();
        this.getClass();
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(d5 - 5.0, 68.0), new Object[0]);
    }

    private static CallSite k(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = yb.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = yb.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                yb.fb = MultiContainerRegistry.a(2036054130877707103L, 3837772328792986652L, MethodHandles.lookup().lookupClass()).a(23111099714743L);
                yb.Gb = new Object[5];
                yb.Hb = new String[5];
                yb.fb();
                yb.vb = new HashMap<K, V>(13);
                var0 = yb.fb ^ 78253453908265L;
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
                var8_3 = new long[53];
                var5_4 = 0;
                var6_5 = "\u0095\f\\_$\u00d1/:|\u00d6\u0006\u00b9\u009a\u000b\u00f6\u00e5#\u00a9\u0002~h\u0083\u00a4v\u0019v\u00a7\u0003iq\u001eV\u000e+\u0080\u0081\f1B\u00d0\u00f4\u00ae\u00d7\u00b3\u00b6T\u00f2\u0081\u008b\u00b2\u00ea`\u00bb\u00e4k\b\tF\u00f0\u00a27t=\u009dv\u00f4\u001f\u00cb\u00df\u00cd\u00a1\u0099\u00f3x\u00ba\u0098\u00af\u00c4N\u0001\u00f11r\u00c7\u00ec-\u00ae@\u00c6\u00bd\u008e\u009d\u00ba\u00aa\u00adP\u00a8O\u001f,[\u00a6}g\u00de\u00df\u00df\u0084/\tC\u00d8\u00e6\u009d\u00b3\u00ae\u00df\u000e\u0088\u00d1l\u00d4\u0096\r\u00e0\u00aci\u00ef\u00b4a\u00d9M0\u00fe\u00cal-\u00ac'W\u00ed\u0011\u00dfD,\u00a2\n\u00ac\u00d7^c\u00eb\u00df\u0080\u0096W\u00b1A=8}KB\r\u00ab\u0093\u00f5\u00f5\u00de\u00b4u'HMB\u0014\u000eR\u0084\u00d6\u00e7O6\u00c6\u009b\u0001\u00f61\u00dd\u00c5\u00f2\u0080\u0090`\u0016\u00f6D\u00d5\u00acL\u0081\u00f7\u00ad\u00afz\u00e4Dx\u00bf\u00d1[\u00c3d\u00ff\u0013\u00dci\u00a0>\u0091\u00b4\u0015\u0018\u001a\u000e\u0012\u009d?\u0010_NCuN\u008d\u00bc`QT\u00e3\u008d\u0080\u00ad\u00d6\u0015\u00b1\u009b!\u0003\u00fc\u00b2\u00c5\u00afB\u001c\u00b9u)\u00bf\u00df\u00073\u00ce\bmF\u00a6F\u00cab\u000f\u00f1\u0015/\u0001BD\u00f1O}\u00f8\u0006`8m\u00ad\u0083\u00fem\u00f6\u009a\u00ee\u009e\u001a\u00fa\u00b1\u00d5\u00e4\u009b<mB|`\u00bd7Kg&[9\u009e\u00deP\u001a\u00a5\u0081\u00bfb+\u00d2f\u00a9\u009a8\u00d1d\u00aa\u00a1\u00fc\u0010\u00b8K\u001e\u009c|\u00dd\u00ed\u000b\u00c9\u0083\u001c\u00b6\u0082\u0081\u00fer3\u008a\u0007e0\u0088\n\u009cm\u008e\r\u00a1\u008a8p\u00ac\u00ec#)\u000b\u00d3F1\u00c4P/JbV}\u00b3\u0010\u001d!\u00b5\u00e1\u0014QF\u007f^\u00df\u009a\u00f6\u00f3z8\u0019\u00dc\u00d0\u001fl\u009c-H\u00d1z\u00c7\u00a8\u000e\u00b6";
                var7_6 = "\u0095\f\\_$\u00d1/:|\u00d6\u0006\u00b9\u009a\u000b\u00f6\u00e5#\u00a9\u0002~h\u0083\u00a4v\u0019v\u00a7\u0003iq\u001eV\u000e+\u0080\u0081\f1B\u00d0\u00f4\u00ae\u00d7\u00b3\u00b6T\u00f2\u0081\u008b\u00b2\u00ea`\u00bb\u00e4k\b\tF\u00f0\u00a27t=\u009dv\u00f4\u001f\u00cb\u00df\u00cd\u00a1\u0099\u00f3x\u00ba\u0098\u00af\u00c4N\u0001\u00f11r\u00c7\u00ec-\u00ae@\u00c6\u00bd\u008e\u009d\u00ba\u00aa\u00adP\u00a8O\u001f,[\u00a6}g\u00de\u00df\u00df\u0084/\tC\u00d8\u00e6\u009d\u00b3\u00ae\u00df\u000e\u0088\u00d1l\u00d4\u0096\r\u00e0\u00aci\u00ef\u00b4a\u00d9M0\u00fe\u00cal-\u00ac'W\u00ed\u0011\u00dfD,\u00a2\n\u00ac\u00d7^c\u00eb\u00df\u0080\u0096W\u00b1A=8}KB\r\u00ab\u0093\u00f5\u00f5\u00de\u00b4u'HMB\u0014\u000eR\u0084\u00d6\u00e7O6\u00c6\u009b\u0001\u00f61\u00dd\u00c5\u00f2\u0080\u0090`\u0016\u00f6D\u00d5\u00acL\u0081\u00f7\u00ad\u00afz\u00e4Dx\u00bf\u00d1[\u00c3d\u00ff\u0013\u00dci\u00a0>\u0091\u00b4\u0015\u0018\u001a\u000e\u0012\u009d?\u0010_NCuN\u008d\u00bc`QT\u00e3\u008d\u0080\u00ad\u00d6\u0015\u00b1\u009b!\u0003\u00fc\u00b2\u00c5\u00afB\u001c\u00b9u)\u00bf\u00df\u00073\u00ce\bmF\u00a6F\u00cab\u000f\u00f1\u0015/\u0001BD\u00f1O}\u00f8\u0006`8m\u00ad\u0083\u00fem\u00f6\u009a\u00ee\u009e\u001a\u00fa\u00b1\u00d5\u00e4\u009b<mB|`\u00bd7Kg&[9\u009e\u00deP\u001a\u00a5\u0081\u00bfb+\u00d2f\u00a9\u009a8\u00d1d\u00aa\u00a1\u00fc\u0010\u00b8K\u001e\u009c|\u00dd\u00ed\u000b\u00c9\u0083\u001c\u00b6\u0082\u0081\u00fer3\u008a\u0007e0\u0088\n\u009cm\u008e\r\u00a1\u008a8p\u00ac\u00ec#)\u000b\u00d3F1\u00c4P/JbV}\u00b3\u0010\u001d!\u00b5\u00e1\u0014QF\u007f^\u00df\u009a\u00f6\u00f3z8\u0019\u00dc\u00d0\u001fl\u009c-H\u00d1z\u00c7\u00a8\u000e\u00b6".length();
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
                    var6_5 = "\u009a\u00be\u00fb\u00b9\u00bcO\u00f8'\u008b\u0018\u009b\u00b5\u00f6\u001a\u0011\u00d8";
                    var7_6 = "\u009a\u00be\u00fb\u00b9\u00bcO\u00f8'\u008b\u0018\u009b\u00b5\u00f6\u001a\u0011\u00d8".length();
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
        yb.tb = var8_3;
        yb.ub = new Integer[53];
        try {
            v8 = yb.class.desiredAssertionStatus() == false;
        }
        catch (CustomSystemException v9) {
            throw yb.b(v9);
        }
        yb.__ = v8;
    }

    private void lambda$viewDetails$0() {
        long l = fb ^ 0x2B0302A0368CL;
        ParameterConfigurationHandler.q(this._G.b());
        IntegerComputationManager.G((String)((Object)yb.k("S", (int)yb.e("g", (int)12311, (long)(0x2C685320F553A9EDL ^ l)), (long)8597671186933467532L, (long)l)));
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = yb.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c7' || c == '\u00db' || c == 'M' || c == '\u00cc') {
                field = yb.w(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = yb.x(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ce' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'S' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    protected void J() {
        block4: {
            try {
                try {
                    super.J();
                    if (this._a != null && this._G != null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw yb.b(customSystemException);
                }
                this.X();
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw yb.b(customSystemException);
            }
        }
        this.l();
    }

    private static TransactionStatusTracker lambda$null$12(Throwable throwable) {
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(yb.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(yb.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

