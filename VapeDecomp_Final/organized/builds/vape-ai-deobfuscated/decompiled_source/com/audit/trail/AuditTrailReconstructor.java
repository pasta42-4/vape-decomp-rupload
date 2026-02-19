/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package com.audit.trail;

import a.C_;
import a.Ry;
import a.Z3;
import a._b;
import a.bE;
import a.y8;
import a.yP;
import com.async.pipeline.AsynchronousPipelineOrchestrator;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.concurrent.task.AsynchronousTaskCoordinator;
import com.config.mapping.ConfigurationMapper2227;
import com.core.computation.AbstractComputationKernel;
import com.crypto.cipher.SymmetricCipherManager;
import com.data.compression.DataCompressionNegotiator;
import com.data.conversion.TemporalDataTransformer;
import com.data.serialization.JsonPayloadOrchestrator;
import com.data.streaming.DataStreamOrchestrator629;
import com.data.streaming.DataStreamProcessor1772;
import com.data.temporal.ChronoDataSynchronizer;
import com.encoding.registry.EncodingProtocolRegistry;
import com.event.core.EventDispatchFramework;
import com.exception.system.CustomSystemException;
import com.execution.context.ExecutionContextManager;
import com.google.gson.JsonObject;
import com.graphics.management.GraphicsResourceAllocator;
import com.graphics.palette.ColorPaletteGenerator;
import com.graphics.rendering.GraphicalRenderController;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.transformation.GeometricTransformEngine;
import com.identity.service.UniversalIdentificationService;
import com.math.computation.IntegerComputationManager;
import com.math.computation.NumericComputationEngine832;
import com.math.precision.PrecisionMathOrchestrator;
import com.messaging.async.AsynchronousMessageBroker;
import com.network.config.NetworkConfigurationResolver2717;
import com.network.connection.NetworkConnectionManager1525;
import com.network.protocol.CommunicationProtocolManager;
import com.reflection.dynamic.RuntimeReflectionResolver;
import com.review.events.ReviewEventAggregator;
import com.security.cipher.AdaptiveCipherEngine;
import com.security.crypto.CipherContextManager1101;
import com.security.crypto.CipherManager;
import com.security.cryptography.CryptographicContextManager153;
import com.security.encryption.CipherEncryptionManager;
import com.security.session.CryptographicSessionManager884;
import com.security.tokenization.CryptographicTokenGenerator186;
import com.system.resource.ResourceAllocationManager1348;
import com.system.state.StateTransitionEngine;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.core.TransactionMediator;
import com.transaction.model.TransactionDescriptor;
import com.transaction.monitoring.TransactionStatusTracker;
import com.ui.rendering.GraphicalRenderingController;
import com.ui.rendering.VisualRenderContext;
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
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class AuditTrailReconstructor
extends y8
implements NetworkConfigurationResolver2717 {
    private static final long[] tb;
    @Nullable
    protected UniversalIdentificationService PK;
    private static final Integer[] ub;
    private final String[] Pf;
    private static final long fb;
    private static final String[] Hb;
    private String PU;
    private GraphicalRenderEngine1082 Ph;
    static final boolean PR;
    private static final Map vb;
    private static final Object[] Gb;
    private final Set<Long> PH;
    private yP P3;

    private CompletableFuture lambda$viewDetailsSettings$18() {
        long l = fb ^ 0x993E98A420CL;
        return C_.P(this.V(), (String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)24762, (long)(0x6E0DF19ADAB7AA4AL ^ l)), (long)-5918834801193923504L, (long)l)), (String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)15192, (long)(0x11C1B244829571A1L ^ l)), (long)-5918834801193923504L, (long)l)), (String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)12207, (long)(0x1870F132A3646576L ^ l)), (long)-5918834801193923504L, (long)l)), this::lambda$null$17);
    }

    protected void V() {
        long l = fb ^ 0xAC0D00A773BL;
        this.y();
        this.Ba.N(false);
        this.BM.N(false);
        double d2 = this.T().w();
        this.getClass();
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d2 - (double)(5.0f * 2.0f), this.T().b());
        graphicalRenderEngine1082.i(false);
        graphicalRenderEngine1082.d().f((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)28178, (long)(0x1ED33CC7AD8911C9L ^ l)), (long)-7427825255921616537L, (long)l)));
        this.T().n(graphicalRenderEngine1082, new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(80.0, 10.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 2.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(40.0, 10.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 2.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(graphicalRenderEngine1082.w(), 15.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 5.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(20.0, 10.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 2.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(graphicalRenderEngine1082.w(), 15.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 8.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(50.0, 10.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 5.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(graphicalRenderEngine1082.w(), 12.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 5.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(graphicalRenderEngine1082.w(), 15.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 5.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(graphicalRenderEngine1082.w(), 12.0), new Object[0]);
        graphicalRenderEngine1082.n(new bE(0.0, 5.0), new Object[0]);
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(25.0, 12.0), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)32514, (long)(0x1D376FDE1D5080FBL ^ l)), (long)-7427825255921616537L, (long)l));
        graphicalRenderEngine1082.n(new bE(graphicalRenderEngine1082.w() - 25.0 - 100.0, 5.0), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)23630, (long)(0x69ECA2BD0475A3B1L ^ l)), (long)-7427825255921616537L, (long)l));
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(25.0, 12.0), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)13449, (long)(0x1B51B528B6274B60L ^ l)), (long)-7427825255921616537L, (long)l));
        graphicalRenderEngine1082.n(new bE(5.0, 5.0), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)30640, (long)(0x67EF1CAB5A7C084CL ^ l)), (long)-7427825255921616537L, (long)l));
        graphicalRenderEngine1082.n(new NetworkConnectionManager1525(60.0, 12.0), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)25052, (long)(0x44EFD1946AD49E7EL ^ l)), (long)-7427825255921616537L, (long)l));
    }

    private void lambda$null$13() {
        ((CompletableFuture)_b.S().M().z(this.Mb.H()).whenCompleteAsync(this::lambda$null$11, (Executor)GraphicalRenderingController.st)).exceptionally(AuditTrailReconstructor::lambda$null$12);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                AuditTrailReconstructor.fb = MultiContainerRegistry.a(6573582357546623578L, 8552173363900238987L, MethodHandles.lookup().lookupClass()).a(128527159549814L);
                AuditTrailReconstructor.Gb = new Object[5];
                AuditTrailReconstructor.Hb = new String[5];
                AuditTrailReconstructor.X();
                AuditTrailReconstructor.vb = new HashMap<K, V>(13);
                var0 = AuditTrailReconstructor.fb ^ 100123562479887L;
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
                var8_3 = new long[77];
                var5_4 = 0;
                var6_5 = "s?[\u00b1\u00be\u00acv\u00820\u009b\u00f2w~\fr\u00a8,d=\u00d4\u00f2\f5\u00b9V\u00cfX\u00dc6\u00fdvHQ\\\u0093\u00d3\u00be\u0017`g\u00fb\u0080k\u00e2/\u0081ag\u0082\u00d4n\u00f5\u00c7\\\u00b61\f\u00f6{\u0002\u00ca\u00d9\u00db\u00c4?N@\u00b2i\u009a\u00e3\u00d6\u00c1Z]F\u0096_=\u00dd)\u00bd\u0096\u001f\u00d08s\u00c0\u00f5m\u00d8\u00e1r\u00bbM\u0006w\u00cc\u0000o\u001b\u00ffQB\u00dd\u000f\u00f1\u0091\n\u00fe\u00baJ\u00b1\u0016\u0000\u00d8\u00af\u00af\u00d9I\u00b7\u0093\u00ae\u00b2\u00e8c\u009bNg\u00b47\u001a\u0010\u000bk!\u009d\u00bf\u0095+\u00a2U\u00b6\u00d3\u00ed\u00beY\u00b9\u00e3%0\u00e0\u00a5\u00cc\u00ba\u0080\u00d5\u00d2\u00afH>\u00c6\u00ba\u00d8\u00f4j\u008bw7L\u007f\u00ac\u00a6V\u00b9\u00d5?\u00da#\u00eao\u00ed\u00d0p\u00c9\u0080\b\u00ad\u00c3\u00edz\u00cb\u0002\tY7\u00fa\u00bcM\u00c4\u00fb\u00bf\u0005Y\u00a2\t\u00d4<\u00d5\u00c7\u00e4^a\u00bb1\u00d1DF;W\u009e\u00ff\u00af>\u0081\u00f1B\u00fej\u0085(\u0011'\u00af_\u0013\u008c5\u0011\u0093(\u0095\u00c87\u0019\u00c4=\u00a8eh:\u009d\u0084at\u00fad\u00cay\u0094q\u0004\u00d9\u00fb\u00c9\u00ad\u00d7!+\u00b5;\u0083\u00ca\u009e\u00f9\u008bN\u00c2d\u0095^\u00eb^K}\u00fe\u009f\"\u00b1\u00fc\u00ee\u00b4M}{\u00cd\u00a4\u00fb\u00b6\u00f2\u00f1A?\u00950*N\";w\u00e1\u0095\u009e\u001cK\u00fb\u00c1\u00b6\u0090\n,\u009cPU\u001d3\u009a\u0082j\u00a2\u00ff\u00014\u009fycM\u00af\u0015\u00b055\u00ff\u00efP\u00de]\u00c5_\u0082\u00cb\u00fay\u0082\n\u0014\u00bc\u00ee\u0002\u0002\u0089j\u00ef\u00c0Q\u0012\u0013n7\u0000\u0098\u00c2\u00c3\u008e\u00e5{S\u00bc\u00d6\u00bf\u00811\u008c\u007f\u00a25\u001b%u\u00d8E\u000f\u009cf\u0001\u00b8\fAR\u009eD\u00c7k\u00be\u00b9z\u00a5}\u00da4b\u0004\u00c6\u001b!\u001bMq\u001f\u00d0\u00f1\r\u00d12\u00ceM\u00e1\u00b4\u0098\u0098%\u00c6\u0091t#m\u0017t\u00a0.e\u009c\u0091,\u00816\u00dc\u00d7\u00ab\u00f8\u00a75p\u008a\u00fd\u00d8\u00e3\u0093>^\u0013G\u00af\u00f5\u00bag\u00d5%shh\u00a2e0\u00a1\"\u0011j\u00c6\u0087K\u00c5\u00ab\u00ed=\u00ec&\u0083\u007f\u00f4\u00dc\u0099&\u00ff\u00c36Be\u00f1\u00c4\u00b7\fs\u00e2\u0006\u00e59\u0019 \u00dc\u0012s2_\u00cd\u00fb:s\u00a3\u00b4\u008a\u00f3\u0012\u001dN\u00cdP\u00e2\u0087(\u00caK\u00ed`nH,\u00e8Lh\u00f9,^U\u000eQ1z<\u00e9\u001f-\u00f2}\u00e6\u00c5\u00a0\u00fey\u0010\u008f\u0099)Ah\u009f\u0001\u000e\u000e{\u00dc\u009az\u00ae\u00e41\u0096'\u00f4c\u009b\"\u00c1\u001e\u00aa8-\u0088\u0003(\u00b1\u008f\u0006\u001fN\u009cm\u0090\u00df\u0081";
                var7_6 = "s?[\u00b1\u00be\u00acv\u00820\u009b\u00f2w~\fr\u00a8,d=\u00d4\u00f2\f5\u00b9V\u00cfX\u00dc6\u00fdvHQ\\\u0093\u00d3\u00be\u0017`g\u00fb\u0080k\u00e2/\u0081ag\u0082\u00d4n\u00f5\u00c7\\\u00b61\f\u00f6{\u0002\u00ca\u00d9\u00db\u00c4?N@\u00b2i\u009a\u00e3\u00d6\u00c1Z]F\u0096_=\u00dd)\u00bd\u0096\u001f\u00d08s\u00c0\u00f5m\u00d8\u00e1r\u00bbM\u0006w\u00cc\u0000o\u001b\u00ffQB\u00dd\u000f\u00f1\u0091\n\u00fe\u00baJ\u00b1\u0016\u0000\u00d8\u00af\u00af\u00d9I\u00b7\u0093\u00ae\u00b2\u00e8c\u009bNg\u00b47\u001a\u0010\u000bk!\u009d\u00bf\u0095+\u00a2U\u00b6\u00d3\u00ed\u00beY\u00b9\u00e3%0\u00e0\u00a5\u00cc\u00ba\u0080\u00d5\u00d2\u00afH>\u00c6\u00ba\u00d8\u00f4j\u008bw7L\u007f\u00ac\u00a6V\u00b9\u00d5?\u00da#\u00eao\u00ed\u00d0p\u00c9\u0080\b\u00ad\u00c3\u00edz\u00cb\u0002\tY7\u00fa\u00bcM\u00c4\u00fb\u00bf\u0005Y\u00a2\t\u00d4<\u00d5\u00c7\u00e4^a\u00bb1\u00d1DF;W\u009e\u00ff\u00af>\u0081\u00f1B\u00fej\u0085(\u0011'\u00af_\u0013\u008c5\u0011\u0093(\u0095\u00c87\u0019\u00c4=\u00a8eh:\u009d\u0084at\u00fad\u00cay\u0094q\u0004\u00d9\u00fb\u00c9\u00ad\u00d7!+\u00b5;\u0083\u00ca\u009e\u00f9\u008bN\u00c2d\u0095^\u00eb^K}\u00fe\u009f\"\u00b1\u00fc\u00ee\u00b4M}{\u00cd\u00a4\u00fb\u00b6\u00f2\u00f1A?\u00950*N\";w\u00e1\u0095\u009e\u001cK\u00fb\u00c1\u00b6\u0090\n,\u009cPU\u001d3\u009a\u0082j\u00a2\u00ff\u00014\u009fycM\u00af\u0015\u00b055\u00ff\u00efP\u00de]\u00c5_\u0082\u00cb\u00fay\u0082\n\u0014\u00bc\u00ee\u0002\u0002\u0089j\u00ef\u00c0Q\u0012\u0013n7\u0000\u0098\u00c2\u00c3\u008e\u00e5{S\u00bc\u00d6\u00bf\u00811\u008c\u007f\u00a25\u001b%u\u00d8E\u000f\u009cf\u0001\u00b8\fAR\u009eD\u00c7k\u00be\u00b9z\u00a5}\u00da4b\u0004\u00c6\u001b!\u001bMq\u001f\u00d0\u00f1\r\u00d12\u00ceM\u00e1\u00b4\u0098\u0098%\u00c6\u0091t#m\u0017t\u00a0.e\u009c\u0091,\u00816\u00dc\u00d7\u00ab\u00f8\u00a75p\u008a\u00fd\u00d8\u00e3\u0093>^\u0013G\u00af\u00f5\u00bag\u00d5%shh\u00a2e0\u00a1\"\u0011j\u00c6\u0087K\u00c5\u00ab\u00ed=\u00ec&\u0083\u007f\u00f4\u00dc\u0099&\u00ff\u00c36Be\u00f1\u00c4\u00b7\fs\u00e2\u0006\u00e59\u0019 \u00dc\u0012s2_\u00cd\u00fb:s\u00a3\u00b4\u008a\u00f3\u0012\u001dN\u00cdP\u00e2\u0087(\u00caK\u00ed`nH,\u00e8Lh\u00f9,^U\u000eQ1z<\u00e9\u001f-\u00f2}\u00e6\u00c5\u00a0\u00fey\u0010\u008f\u0099)Ah\u009f\u0001\u000e\u000e{\u00dc\u009az\u00ae\u00e41\u0096'\u00f4c\u009b\"\u00c1\u001e\u00aa8-\u0088\u0003(\u00b1\u008f\u0006\u001fN\u009cm\u0090\u00df\u0081".length();
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
                    var6_5 = "\u008f\u0018\u00e4l\u00fez\u008c1\u00f6{l\u00deD\u00e0\u00e6\u00f4";
                    var7_6 = "\u008f\u0018\u00e4l\u00fez\u008c1\u00f6{l\u00deD\u00e0\u00e6\u00f4".length();
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
        AuditTrailReconstructor.tb = var8_3;
        AuditTrailReconstructor.ub = new Integer[77];
        try {
            v8 = AuditTrailReconstructor.class.desiredAssertionStatus() == false;
        }
        catch (CustomSystemException v9) {
            throw AuditTrailReconstructor.b(v9);
        }
        AuditTrailReconstructor.PR = v8;
    }

    private void I() {
        long l = fb ^ 0x5F08DE6F1F2FL;
        this.D();
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(this.Ph.w(), 15.0);
        graphicalRenderEngine1082.d().f((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)16741, (long)(0xF8D22A0034C56ADL ^ l)), (long)-1081068966375812749L, (long)l)));
        graphicalRenderEngine1082.i(graphicalRenderEngine1082.b());
        graphicalRenderEngine1082.i(false);
        this.Ph.n(graphicalRenderEngine1082, new Object[0]);
        graphicalRenderEngine1082.n(new GraphicsResourceAllocator((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)26396, (long)(0x3DE02A2DB070F0A8L ^ l)), (long)-1081068966375812749L, (long)l)), String.valueOf(this.Mb.j()), 12.0, 0.9), new Object[0]);
        VisualRenderContext visualRenderContext = new VisualRenderContext((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)31127, (long)(0x5CD29B476118EE47L ^ l)), (long)-1081068966375812749L, (long)l)), 0.8, false, 50.0, 10.0);
        visualRenderContext.c(null);
        visualRenderContext.f(this::lambda$viewDetailsReviews$4);
        graphicalRenderEngine1082.n(visualRenderContext, AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)32431, (long)(0x1784A20BD767E918L ^ l)), (long)-1081068966375812749L, (long)l));
        double d2 = this.Ph.w();
        double d3 = this.Ph.b() - this.Ph.d().R();
        this.getClass();
        AsynchronousPipelineOrchestrator asynchronousPipelineOrchestrator = new AsynchronousPipelineOrchestrator(d2, d3 - 5.0);
        asynchronousPipelineOrchestrator.d().f((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)21264, (long)(0x607EB1A649C344E4L ^ l)), (long)-1081068966375812749L, (long)l)));
        asynchronousPipelineOrchestrator.i(asynchronousPipelineOrchestrator.b());
        asynchronousPipelineOrchestrator.i(false);
        Function<TemporalDataTransformer, AsynchronousTaskCoordinator> function = this::lambda$viewDetailsReviews$5;
        asynchronousPipelineOrchestrator.D(() -> AuditTrailReconstructor.lambda$viewDetailsReviews$6(function));
        asynchronousPipelineOrchestrator.a(() -> this.lambda$viewDetailsReviews$10(asynchronousPipelineOrchestrator, function));
        asynchronousPipelineOrchestrator.I();
        this.Ph.n(asynchronousPipelineOrchestrator, new Object[0]);
    }

    private void O() {
        block7: {
            try {
                try {
                    if (PR || this.PK != null) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuditTrailReconstructor.b(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
        }
        ArrayList<Long> arrayList = new ArrayList<Long>(this.PH);
        try {
            this.PH.clear();
            if (!arrayList.isEmpty()) {
                ((CompletableFuture)_b.S().M().H(this.Mb, arrayList).whenCompleteAsync((arg_0, arg_1) -> this.lambda$markViewedReviewsAsRead$23(arrayList, arg_0, arg_1), (Executor)GraphicalRenderingController.st)).exceptionally(AuditTrailReconstructor::lambda$markViewedReviewsAsRead$24);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
    }

    @DataExchangeProtocol2090
    public void V(ReviewEventAggregator reviewEventAggregator) {
        this.I();
    }

    @Override
    public void T() {
        super.T();
        this.O();
    }

    private void lambda$null$2(TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        long l = fb ^ 0x5B4D5E3DDB08L;
        try {
            if (throwable != null) {
                TemporalMetadataResolver.W(throwable);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        try {
            if (!transactionStatusTracker.b()) {
                IntegerComputationManager.q((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)5936, (long)(0x344C9087B20DC4EEL ^ l)), (long)3807865800265192788L, (long)l)) + transactionStatusTracker.A());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        IntegerComputationManager.G((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)6080, (long)(0x5C790DCE1188445AL ^ l)), (long)3807865800265192788L, (long)l)));
        for (TemporalDataTransformer temporalDataTransformer : this.Mb.e().v()) {
            try {
                if (temporalDataTransformer.N() == null) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
            temporalDataTransformer.W(true);
        }
        this.J(0L);
        this.I();
    }

    @Override
    protected void x(GraphicalRenderEngine1082 graphicalRenderEngine1082) {
        TransactionDescriptor transactionDescriptor;
        long l;
        block6: {
            l = fb ^ 0x5B68517DB3C8L;
            try {
                try {
                    if (this.Mb != null && this.PK != null) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuditTrailReconstructor.b(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
        }
        try {
            transactionDescriptor = this.PK.v() != null ? TemporalMetadataResolver.h.o().g(this.PK.v()) : null;
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        TransactionDescriptor transactionDescriptor2 = transactionDescriptor;
        List<TransactionDescriptor> list = TemporalMetadataResolver.h.u().A();
        ArrayList<TransactionDescriptor> arrayList = new ArrayList<TransactionDescriptor>(TemporalMetadataResolver.h.o().T());
        arrayList.removeIf(list::contains);
        EventDispatchFramework eventDispatchFramework = new EventDispatchFramework((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)11017, (long)(0x7482F852EB73902FL ^ l)), (long)6636126482171837844L, (long)l)), transactionDescriptor2, arrayList.toArray(new TransactionDescriptor[0]));
        eventDispatchFramework.w(6.0);
        eventDispatchFramework.T(graphicalRenderEngine1082.w());
        eventDispatchFramework.i(false);
        eventDispatchFramework.K(this::lambda$setupProfileNameSubheader$1);
        graphicalRenderEngine1082.n(eventDispatchFramework, AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)6122, (long)(0x194B6E7DC0D2ACE1L ^ l)), (long)6636126482171837844L, (long)l));
    }

    private void lambda$null$7(TemporalDataTransformer temporalDataTransformer) {
        try {
            if (temporalDataTransformer.G()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        this.PH.add(temporalDataTransformer.V());
    }

    private void lambda$null$11(TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        long l;
        block10: {
            l = fb ^ 0x41E381A6A8A5L;
            try {
                if (throwable != null) {
                    IntegerComputationManager.q((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)21911, (long)(0x3744C0BE30B4F5DEL ^ l)), (long)5149122267958028025L, (long)l)));
                    TemporalMetadataResolver.W(throwable);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
            try {
                if (!transactionStatusTracker.b()) {
                    IntegerComputationManager.q((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)8770, (long)(0x523C063547D28227L ^ l)), (long)5149122267958028025L, (long)l)) + transactionStatusTracker.A());
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
            try {
                try {
                    if (PR || transactionStatusTracker.h() != null) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuditTrailReconstructor.b(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
        }
        this.Mb.J(((UniversalIdentificationService)transactionStatusTracker.h()).u());
        this.PK.g(((UniversalIdentificationService)transactionStatusTracker.h()).u());
        this.J();
        IntegerComputationManager.G((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)31291, (long)(0x38E2FCC5D8BCDA66L ^ l)), (long)5149122267958028025L, (long)l)));
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
                n3 = 11;
                break;
            }
            case 1: {
                n3 = 49;
                break;
            }
            case 2: {
                n3 = 63;
                break;
            }
            case 3: {
                n3 = 30;
                break;
            }
            case 4: {
                n3 = 43;
                break;
            }
            case 5: {
                n3 = 61;
                break;
            }
            case 6: {
                n3 = 10;
                break;
            }
            case 7: {
                n3 = 57;
                break;
            }
            case 8: {
                n3 = 20;
                break;
            }
            case 9: {
                n3 = 46;
                break;
            }
            case 10: {
                n3 = 15;
                break;
            }
            case 11: {
                n3 = 4;
                break;
            }
            case 12: {
                n3 = 31;
                break;
            }
            case 13: {
                n3 = 33;
                break;
            }
            case 14: {
                n3 = 26;
                break;
            }
            case 15: {
                n3 = 25;
                break;
            }
            case 16: {
                n3 = 21;
                break;
            }
            case 17: {
                n3 = 24;
                break;
            }
            case 18: {
                n3 = 42;
                break;
            }
            case 19: {
                n3 = 39;
                break;
            }
            case 20: {
                n3 = 55;
                break;
            }
            case 21: {
                n3 = 28;
                break;
            }
            case 22: {
                n3 = 58;
                break;
            }
            case 23: {
                n3 = 22;
                break;
            }
            case 24: {
                n3 = 18;
                break;
            }
            case 25: {
                n3 = 56;
                break;
            }
            case 26: {
                n3 = 60;
                break;
            }
            case 27: {
                n3 = 34;
                break;
            }
            case 28: {
                n3 = 40;
                break;
            }
            case 29: {
                n3 = 54;
                break;
            }
            case 30: {
                n3 = 32;
                break;
            }
            case 31: {
                n3 = 50;
                break;
            }
            case 32: {
                n3 = 48;
                break;
            }
            case 33: {
                n3 = 53;
                break;
            }
            case 34: {
                n3 = 59;
                break;
            }
            case 35: {
                n3 = 8;
                break;
            }
            case 36: {
                n3 = 41;
                break;
            }
            case 37: {
                n3 = 0;
                break;
            }
            case 38: {
                n3 = 19;
                break;
            }
            case 39: {
                n3 = 7;
                break;
            }
            case 40: {
                n3 = 16;
                break;
            }
            case 41: {
                n3 = 36;
                break;
            }
            case 42: {
                n3 = 3;
                break;
            }
            case 43: {
                n3 = 13;
                break;
            }
            case 44: {
                n3 = 38;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 5;
                break;
            }
            case 47: {
                n3 = 23;
                break;
            }
            case 48: {
                n3 = 44;
                break;
            }
            case 49: {
                n3 = 37;
                break;
            }
            case 50: {
                n3 = 9;
                break;
            }
            case 51: {
                n3 = 27;
                break;
            }
            case 52: {
                n3 = 29;
                break;
            }
            case 53: {
                n3 = 47;
                break;
            }
            case 54: {
                n3 = 51;
                break;
            }
            case 55: {
                n3 = 14;
                break;
            }
            case 56: {
                n3 = 2;
                break;
            }
            case 57: {
                n3 = 12;
                break;
            }
            case 58: {
                n3 = 1;
                break;
            }
            case 59: {
                n3 = 6;
                break;
            }
            case 60: {
                n3 = 17;
                break;
            }
            case 61: {
                n3 = 35;
                break;
            }
            case 62: {
                n3 = 52;
                break;
            }
            default: {
                n3 = 62;
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
        AuditTrailReconstructor.Hb[n4] = new String(cArray);
        return n4;
    }

    private CompletableFuture<?> A(@Nullable UUID uUID, @Nullable String string, @Nullable List<String> list, @Nullable Boolean bl, @Nullable Boolean bl2, @Nullable Boolean bl3, boolean bl4) {
        Boolean bl5;
        List<String> list2;
        String string2;
        String string3;
        UUID uUID2;
        long l;
        CryptographicTokenGenerator186 cryptographicTokenGenerator186;
        String string4;
        block28: {
            block25: {
                boolean bl6;
                block27: {
                    block26: {
                        block24: {
                            block23: {
                                block22: {
                                    try {
                                        try {
                                            if (PR || this.Mb != null) break block22;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AuditTrailReconstructor.b(customSystemException);
                                        }
                                        throw new AssertionError();
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AuditTrailReconstructor.b(customSystemException);
                                    }
                                }
                                try {
                                    if (bl4) {
                                        this.MX.A();
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AuditTrailReconstructor.b(customSystemException);
                                }
                                try {
                                    if (list == null || list.size() >= 5) break block23;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AuditTrailReconstructor.b(customSystemException);
                                }
                                string4 = ExecutionContextManager.m(this.P3.o().a().trim());
                                if (string4 != null) {
                                    String string5 = ExecutionContextManager.d(string4);
                                    try {
                                        if (string5 != null) {
                                            IntegerComputationManager.q(string5);
                                            return null;
                                        }
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AuditTrailReconstructor.b(customSystemException);
                                    }
                                    list.add(string4);
                                    this.P3.u(new ResourceAllocationManager1348(string4));
                                    this.P3.o().y("");
                                }
                            }
                            string4 = null;
                            try {
                                if (!bl4 || this.MX.P() == null) break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AuditTrailReconstructor.b(customSystemException);
                            }
                            string4 = this.MX.P().p();
                            try {
                                if (string4 == null) {
                                    TemporalMetadataResolver.h.o().C(this.MX.P());
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AuditTrailReconstructor.b(customSystemException);
                            }
                        }
                        try {
                            try {
                                cryptographicTokenGenerator186 = _b.S().M();
                                l = this.Mb.H();
                                uUID2 = uUID;
                                string3 = this.Mb.e();
                                string2 = string;
                                list2 = list;
                                if (bl == null) break block25;
                                if (bl.booleanValue()) break block26;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AuditTrailReconstructor.b(customSystemException);
                            }
                            bl6 = true;
                            break block27;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AuditTrailReconstructor.b(customSystemException);
                        }
                    }
                    bl6 = false;
                }
                bl5 = bl6;
                break block28;
            }
            bl5 = null;
        }
        return ((CompletableFuture)((CompletableFuture)cryptographicTokenGenerator186.A(AsynchronousMessageBroker.R(l, uUID2, string3, string2, list2, bl5, bl2, bl3, (JsonObject)string4)).whenCompleteAsync(this::lambda$update$25, (Executor)GraphicalRenderingController.st)).thenComposeAsync(this::lambda$update$26)).thenApplyAsync(AuditTrailReconstructor::lambda$update$27, (Executor)GraphicalRenderingController.st);
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AuditTrailReconstructor.f(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private CompletableFuture lambda$viewDetailsSettings$22(CipherManager cipherManager, AdaptiveCipherEngine adaptiveCipherEngine, AdaptiveCipherEngine adaptiveCipherEngine2, AdaptiveCipherEngine adaptiveCipherEngine3) {
        return this.A(this.Mb.G().v(), cipherManager.a(), this.P3.C(), adaptiveCipherEngine.j(), adaptiveCipherEngine2.j(), adaptiveCipherEngine3.j(), true);
    }

    private static TransactionStatusTracker lambda$null$16(Throwable throwable) {
        return null;
    }

    private CompletableFuture lambda$viewDetailsReviews$10(AsynchronousPipelineOrchestrator asynchronousPipelineOrchestrator, Function function) {
        return _b.S().M().M(this.Mb.H(), asynchronousPipelineOrchestrator.f()).thenApplyAsync(arg_0 -> this.lambda$null$9(asynchronousPipelineOrchestrator, function, arg_0), (Executor)GraphicalRenderingController.st);
    }

    private static Method l(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AuditTrailReconstructor.k(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AuditTrailReconstructor.l(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void lambda$null$8() {
    }

    private static TransactionStatusTracker lambda$markViewedReviewsAsRead$24(Throwable throwable) {
        return null;
    }

    private static CustomSystemException b(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void L() {
        long l = fb ^ 0x7011B1944D12L;
        this.D();
        String[] stringArray = new String[]{AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)27309, (long)(0x5D74A0705A992F5DL ^ l)), (long)-6718690485121858738L, (long)l), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)3755, (long)(0xADC58BA94C9CB5FL ^ l)), (long)-6718690485121858738L, (long)l), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)30844, (long)(0x28D693C8226E3DBDL ^ l)), (long)-6718690485121858738L, (long)l), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)15902, (long)(0x35D2982E5214FBE6L ^ l)), (long)-6718690485121858738L, (long)l), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)32547, (long)(0x4AD350749CB43AE5L ^ l)), (long)-6718690485121858738L, (long)l), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)16986, (long)(0x6FC1D99DA6EF87DBL ^ l)), (long)-6718690485121858738L, (long)l)};
        String[] stringArray2 = new String[]{String.valueOf(this.Mb.B()), String.valueOf(this.Mb.l()), String.valueOf(this.Mb.b()), ChronoDataSynchronizer.A(this.Mb.Z()), ChronoDataSynchronizer.A(this.Mb.u()), String.valueOf(this.Mb.e().L())};
        this.Ph.n(new bE(0.0, 5.0), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)3759, (long)(0x3D509CDBA36BCB54L ^ l)), (long)-6718690485121858738L, (long)l));
        for (int i = 0; i < stringArray.length; ++i) {
            double d2;
            StateTransitionEngine stateTransitionEngine;
            String string = stringArray[i];
            String string2 = stringArray2[i];
            try {
                if (i % 4 == 3) {
                    this.Ph.n(new bE(0.0, 1.0), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)1770, (long)(0x5E7FAE396574C30BL ^ l)), (long)-6718690485121858738L, (long)l));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
            StateTransitionEngine stateTransitionEngine2 = new StateTransitionEngine(string, string2);
            try {
                stateTransitionEngine2.n(1.0);
                stateTransitionEngine = stateTransitionEngine2;
                d2 = string2.length() >= 5 ? 0.95 : 1.1;
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
            stateTransitionEngine.X(d2);
            stateTransitionEngine2.T(this.Ph.w() / 3.0 - 4.0);
            stateTransitionEngine2.w(stateTransitionEngine2.w());
            this.Ph.n(new PrecisionMathOrchestrator(2.0, stateTransitionEngine2), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)31821, (long)(0x6A44C6AC00B9BEL ^ l)), (long)-6718690485121858738L, (long)l));
        }
    }

    private void D() {
        this.Ph.k();
        this.O();
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite k(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void lambda$setupProfileNameSubheader$1(TransactionDescriptor transactionDescriptor) {
        this.PK.Q(transactionDescriptor.k());
        this.MX = JsonPayloadOrchestrator.u(this.Mb, transactionDescriptor);
        this.J();
    }

    private static RuntimeReflectionResolver lambda$update$27(TransactionStatusTracker transactionStatusTracker) {
        try {
            if (!transactionStatusTracker.b()) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        return (RuntimeReflectionResolver)transactionStatusTracker.h();
    }

    private void lambda$null$15(TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        long l = fb ^ 0x21990885F89DL;
        try {
            if (throwable != null) {
                TemporalMetadataResolver.W(throwable);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        try {
            if (!transactionStatusTracker.b()) {
                IntegerComputationManager.q((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)21515, (long)(0x9D79C7E2EA32475L ^ l)), (long)1679063182151415489L, (long)l)) + transactionStatusTracker.A());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        IntegerComputationManager.G((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)32343, (long)(0x7C8716C6BC2F0E5BL ^ l)), (long)1679063182151415489L, (long)l)) + this.Mb.e() + (String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)18068, (long)(0x6900FF563DB6EDL ^ l)), (long)1679063182151415489L, (long)l)));
        TemporalMetadataResolver.h.u().V(this.Mb);
        this.Bs.j((CipherContextManager1101)null);
    }

    private static Field w(long l, long l2) {
        int n = AuditTrailReconstructor.u(l, l2);
        Object object = Gb[n];
        if (object instanceof String) {
            String string = Hb[n];
            int n2 = string.indexOf(8);
            Class clazz = AuditTrailReconstructor.v(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AuditTrailReconstructor.v(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AuditTrailReconstructor.k(clazz3, string2, clazz2)) != null) {
                    AuditTrailReconstructor.Gb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AuditTrailReconstructor.l(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AuditTrailReconstructor.Gb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AuditTrailReconstructor.v(276986619678580L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private CompletableFuture lambda$viewDetailsReviews$4() {
        return ((CompletableFuture)_b.S().M().l(this.Mb).whenCompleteAsync(this::lambda$null$2, (Executor)GraphicalRenderingController.st)).exceptionally(AuditTrailReconstructor::lambda$null$3);
    }

    @Override
    protected void J() {
        block4: {
            try {
                try {
                    super.J();
                    if (this.Mb != null && this.MX != null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuditTrailReconstructor.b(customSystemException);
                }
                this.V();
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
        }
    }

    private void lambda$viewDetailsSettings$19() {
        this.Bs.j((CipherContextManager1101)null);
    }

    private void q() {
        boolean bl;
        ColorPaletteGenerator colorPaletteGenerator;
        Color color;
        List<AbstractComputationKernel> list;
        CallSite callSite;
        ColorPaletteGenerator colorPaletteGenerator2;
        ColorPaletteGenerator colorPaletteGenerator3;
        boolean bl2;
        AdaptiveCipherEngine adaptiveCipherEngine;
        boolean bl3;
        AdaptiveCipherEngine adaptiveCipherEngine2;
        long l = fb ^ 0x592EAB912226L;
        this.D();
        double d2 = this.Ba.w();
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d2, 14.0);
        graphicalRenderEngine1082.d().f((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)11916, (long)(0x3F30A841E9FE0436L ^ l)), (long)-3605620067988493190L, (long)l)));
        graphicalRenderEngine1082.i(false);
        GraphicalRenderEngine1082 graphicalRenderEngine10822 = new GraphicalRenderEngine1082(d2, this.Ph.b() - graphicalRenderEngine1082.b() - 8.0);
        graphicalRenderEngine10822.i(graphicalRenderEngine10822.b() - 2.0);
        graphicalRenderEngine10822.i(false);
        graphicalRenderEngine10822.Q(Color.RED);
        double d3 = d2 - 3.0;
        SymmetricCipherManager symmetricCipherManager = new SymmetricCipherManager(d2);
        symmetricCipherManager.i(false);
        symmetricCipherManager.Q(Color.YELLOW);
        symmetricCipherManager.d().f((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)8883, (long)(0x74FCAFF7F618085CL ^ l)), (long)-3605620067988493190L, (long)l)));
        graphicalRenderEngine10822.n(symmetricCipherManager, new Object[0]);
        this.Ph.n(graphicalRenderEngine10822, new Object[0]);
        this.Ph.n(new GraphicalRenderController(d3, 0.5, AuditTrailReconstructor.M.S), new Object[0]);
        this.Ph.n(new bE(0.0, 8.0), new Object[0]);
        this.Ph.n(graphicalRenderEngine1082, new Object[0]);
        CryptographicContextManager153 cryptographicContextManager153 = new CryptographicContextManager153((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)17996, (long)(0x3D4059BF2E6DECB2L ^ l)), (long)-3605620067988493190L, (long)l)), 0.7, AuditTrailReconstructor.M.H, true);
        cryptographicContextManager153.S(0.0f);
        symmetricCipherManager.n(cryptographicContextManager153, new Object[0]);
        CipherEncryptionManager cipherEncryptionManager = new CipherEncryptionManager(this, (String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)10803, (long)(0x53F60D52673B80DAL ^ l)), (long)-3605620067988493190L, (long)l)), d3);
        cipherEncryptionManager.Z(0.0);
        cipherEncryptionManager.R(0.0f);
        cipherEncryptionManager.x(1.0f);
        cipherEncryptionManager.y(this.Mb.G());
        cipherEncryptionManager.z(AuditTrailReconstructor.M.c);
        cipherEncryptionManager.g(AuditTrailReconstructor.M.n);
        cipherEncryptionManager.O().N(false);
        cipherEncryptionManager.i(false);
        cipherEncryptionManager.I(false);
        symmetricCipherManager.n(cipherEncryptionManager, new Object[0]);
        symmetricCipherManager.n(new GeometricTransformEngine(d3, 2.0, 0.5, 0.0, AuditTrailReconstructor.M.S), new Object[0]);
        symmetricCipherManager.n(new bE(0.0, 5.0), new Object[0]);
        CryptographicContextManager153 cryptographicContextManager1532 = new CryptographicContextManager153((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)19337, (long)(0x753D949700E5E13FL ^ l)), (long)-3605620067988493190L, (long)l)), 0.7, AuditTrailReconstructor.M.H, true);
        cryptographicContextManager1532.S(0.0f);
        symmetricCipherManager.n(cryptographicContextManager1532, AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)31258, (long)(0x5CE8C9898DA050F2L ^ l)), (long)-3605620067988493190L, (long)l));
        CryptographicContextManager153 cryptographicContextManager1533 = new CryptographicContextManager153((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)13094, (long)(0x104BDAE3C3AB99D7L ^ l)), (long)-3605620067988493190L, (long)l)), 0.7, AuditTrailReconstructor.M.w, false);
        double d4 = cryptographicContextManager1533.D();
        this.getClass();
        cryptographicContextManager1533.T(d4 + (double)(5.0f * 2.0f));
        symmetricCipherManager.n(cryptographicContextManager1533, AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)28382, (long)(0x115A315655FD4424L ^ l)), (long)-3605620067988493190L, (long)l));
        this.P3 = new yP((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)6975, (long)(0x6B47C5C82D331C0L ^ l)), (long)-3605620067988493190L, (long)l)), this.Ph.w(), 20.0);
        for (String object22 : this.Mb.o()) {
            this.P3.u(new ResourceAllocationManager1348(object22));
        }
        symmetricCipherManager.n(this.P3, AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)32653, (long)(0x73E8280919335556L ^ l)), (long)-3605620067988493190L, (long)l));
        symmetricCipherManager.n(new GeometricTransformEngine(d3, 2.0, 0.5, 0.0, AuditTrailReconstructor.M.S), new Object[0]);
        symmetricCipherManager.n(new bE(0.0, 5.0), new Object[0]);
        CryptographicContextManager153 cryptographicContextManager1534 = new CryptographicContextManager153((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)24582, (long)(0x761F091DCAB6CAB7L ^ l)), (long)-3605620067988493190L, (long)l)), 0.7, AuditTrailReconstructor.M.H, true);
        cryptographicContextManager1534.S(0.0f);
        symmetricCipherManager.n(cryptographicContextManager1534, new Object[0]);
        AdaptiveCipherEngine adaptiveCipherEngine3 = new AdaptiveCipherEngine((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)22904, (long)(0x13CB803C8F20F3AAL ^ l)), (long)-3605620067988493190L, (long)l)), 0.8);
        try {
            adaptiveCipherEngine3.Z(0.0);
            adaptiveCipherEngine3.Y(d3);
            adaptiveCipherEngine3.i(false);
            adaptiveCipherEngine2 = adaptiveCipherEngine3;
            bl3 = !this.PK.t();
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        adaptiveCipherEngine2.c(bl3);
        symmetricCipherManager.n(adaptiveCipherEngine3, new Object[0]);
        AdaptiveCipherEngine adaptiveCipherEngine4 = new AdaptiveCipherEngine((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)13174, (long)(0x5B8011F4461599AAL ^ l)), (long)-3605620067988493190L, (long)l)), 0.8);
        try {
            adaptiveCipherEngine4.Z(0.0);
            adaptiveCipherEngine4.Y(d3);
            adaptiveCipherEngine4.i(false);
            adaptiveCipherEngine4.c(this.PK.E());
            adaptiveCipherEngine = adaptiveCipherEngine4;
            bl2 = !this.PK.t();
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        adaptiveCipherEngine.N(bl2);
        symmetricCipherManager.n(adaptiveCipherEngine4, new Object[0]);
        adaptiveCipherEngine3.l(new DataStreamProcessor1772(this, adaptiveCipherEngine4));
        GraphicalRenderEngine1082 graphicalRenderEngine10823 = new GraphicalRenderEngine1082(d3, 16.0);
        graphicalRenderEngine10823.i(true);
        graphicalRenderEngine10823.Q(AuditTrailReconstructor.M.L);
        DataCompressionNegotiator dataCompressionNegotiator = new DataCompressionNegotiator((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)17805, (long)(0x2FB713B36AC1EF36L ^ l)), (long)-3605620067988493190L, (long)l)) + this.PK.u(), 0.8, AuditTrailReconstructor.M.Y);
        dataCompressionNegotiator.T(graphicalRenderEngine10823.w());
        dataCompressionNegotiator.w(graphicalRenderEngine10823.b());
        dataCompressionNegotiator.g((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)15744, (long)(0x27305F3D83DA976AL ^ l)), (long)-3605620067988493190L, (long)l)));
        dataCompressionNegotiator.q(true);
        dataCompressionNegotiator.l(new TransactionMediator(this));
        graphicalRenderEngine10823.n(dataCompressionNegotiator, new Object[0]);
        ConfigurationMapper2227 configurationMapper2227 = new ConfigurationMapper2227(this, (String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)12839, (long)(0x481B613F7C5C98F6L ^ l)), (long)-3605620067988493190L, (long)l)), 6.0, 6.0, 8.0, 8.0, null, null, null);
        configurationMapper2227.n(false);
        configurationMapper2227.g((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)12415, (long)(0x481004B57FE9A86L ^ l)), (long)-3605620067988493190L, (long)l)));
        configurationMapper2227.f(this::lambda$viewDetailsSettings$14);
        graphicalRenderEngine10823.n(configurationMapper2227, AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)3179, (long)(0x379FF4E6FCBB2693L ^ l)), (long)-3605620067988493190L, (long)l));
        symmetricCipherManager.n(graphicalRenderEngine10823, new Object[0]);
        AdaptiveCipherEngine adaptiveCipherEngine5 = new AdaptiveCipherEngine((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)31673, (long)(0x5D9B834C56B8D169L ^ l)), (long)-3605620067988493190L, (long)l)), 0.8);
        adaptiveCipherEngine5.Z(0.0);
        adaptiveCipherEngine5.Y(d3);
        adaptiveCipherEngine5.i(false);
        adaptiveCipherEngine5.c(this.PK.l());
        symmetricCipherManager.n(adaptiveCipherEngine5, new Object[0]);
        VisualRenderContext visualRenderContext = new VisualRenderContext((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)24477, (long)(0x2D24C9F9238DF57DL ^ l)), (long)-3605620067988493190L, (long)l)), 0.7, true);
        visualRenderContext.c(AuditTrailReconstructor.M.O);
        visualRenderContext.f(true);
        visualRenderContext.T(30.0);
        visualRenderContext.w(graphicalRenderEngine1082.b());
        visualRenderContext.f(this::lambda$viewDetailsSettings$18);
        graphicalRenderEngine1082.n(visualRenderContext, new Object[0]);
        GraphicalRenderEngine1082 graphicalRenderEngine10824 = new GraphicalRenderEngine1082(75.0, graphicalRenderEngine1082.b());
        graphicalRenderEngine10824.i(false);
        graphicalRenderEngine10824.d().f((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)19672, (long)(0x20EDEF6DFA02E661L ^ l)), (long)-3605620067988493190L, (long)l)));
        graphicalRenderEngine1082.n(graphicalRenderEngine10824, AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)20616, (long)(0x419335221CB07A63L ^ l)), (long)-3605620067988493190L, (long)l));
        VisualRenderContext visualRenderContext2 = new VisualRenderContext((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)18025, (long)(0x7BB00F1077E36C9FL ^ l)), (long)-3605620067988493190L, (long)l)), 0.7, true);
        visualRenderContext2.c(AuditTrailReconstructor.M.n);
        visualRenderContext2.f(true);
        visualRenderContext2.T(30.0);
        visualRenderContext2.w(graphicalRenderEngine1082.b());
        visualRenderContext2.N(this::lambda$viewDetailsSettings$19);
        graphicalRenderEngine10824.n(visualRenderContext2, new Object[0]);
        List<AbstractComputationKernel> list2 = Arrays.asList(new VisualRenderContext((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)10107, (long)(0x3FFBA40B744C0D98L ^ l)), (long)-3605620067988493190L, (long)l)), 0.75, false).a(true).c(Color.WHITE).f(true).f(this::lambda$viewDetailsSettings$20), new VisualRenderContext((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)10570, (long)(0x6368DEB1023883ADL ^ l)), (long)-3605620067988493190L, (long)l)), 0.75, false).a(true).c(Color.WHITE).f(true).f(() -> this.lambda$viewDetailsSettings$21(cipherEncryptionManager, adaptiveCipherEngine3, adaptiveCipherEngine5, adaptiveCipherEngine4)));
        try {
            ColorPaletteGenerator colorPaletteGenerator4;
            colorPaletteGenerator3 = colorPaletteGenerator4;
            colorPaletteGenerator2 = colorPaletteGenerator4;
            callSite = AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)15428, (long)(0x1D794539A584168FL ^ l)), (long)-3605620067988493190L, (long)l);
            list = list2;
            color = this.MX.P() != null ? AuditTrailReconstructor.M.Y : AuditTrailReconstructor.M.S;
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        colorPaletteGenerator3((String)((Object)callSite), list, color, this.MX.P() != null ? AuditTrailReconstructor.M.u : AuditTrailReconstructor.M.S, null, 1.0f, 1.0f);
        ColorPaletteGenerator colorPaletteGenerator5 = colorPaletteGenerator2;
        try {
            colorPaletteGenerator = colorPaletteGenerator5;
            bl = this.MX.P() == null;
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        colorPaletteGenerator.g(bl);
        colorPaletteGenerator5.A(true);
        colorPaletteGenerator5.T(60.0);
        colorPaletteGenerator5.w(graphicalRenderEngine1082.b());
        colorPaletteGenerator5.f(() -> this.lambda$viewDetailsSettings$22(cipherEncryptionManager, adaptiveCipherEngine3, adaptiveCipherEngine5, adaptiveCipherEngine4));
        graphicalRenderEngine10824.n(colorPaletteGenerator5, new Object[0]);
        double d5 = visualRenderContext2.w() + colorPaletteGenerator5.w();
        this.getClass();
        graphicalRenderEngine10824.Y(d5 + 5.0);
    }

    private static Class v(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AuditTrailReconstructor.u(l, l2);
            object = Gb[n];
            try {
                if (!(object instanceof String)) break block2;
                AuditTrailReconstructor.Gb[n] = clazz = Class.forName(Hb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = AuditTrailReconstructor.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AuditTrailReconstructor.l(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void lambda$null$17() {
        ((CompletableFuture)_b.S().M().T(this.Mb.H()).whenCompleteAsync(this::lambda$null$15, (Executor)GraphicalRenderingController.st)).exceptionally(AuditTrailReconstructor::lambda$null$16);
    }

    private static int e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x670A;
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
                throw new RuntimeException("a/yL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AuditTrailReconstructor.ub[n2] = n3;
        }
        return ub[n2];
    }

    private CompletableFuture lambda$viewDetailsSettings$20() {
        return this.A(this.Mb.G().v(), null, null, null, null, null, true);
    }

    private void lambda$update$25(TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        long l;
        block10: {
            l = fb ^ 0x207B3EA9EB13L;
            try {
                if (throwable != null) {
                    TemporalMetadataResolver.W(throwable);
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
            try {
                if (!transactionStatusTracker.b()) {
                    IntegerComputationManager.q((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)15885, (long)(0x6CA73A79482CDDF1L ^ l)), (long)343182813467403599L, (long)l)) + transactionStatusTracker.A());
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
            try {
                try {
                    if (PR || transactionStatusTracker.h() != null) break block10;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuditTrailReconstructor.b(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
        }
        this.PK = ((Ry)transactionStatusTracker.h()).G();
        IntegerComputationManager.G((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)5734, (long)(0x644383AFB160F5A4L ^ l)), (long)343182813467403599L, (long)l)) + this.Mb.e() + (String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)24147, (long)(0xE115ECF823ABD8BL ^ l)), (long)343182813467403599L, (long)l)));
        TemporalMetadataResolver.h.u().D(this.Mb, (Ry)transactionStatusTracker.h());
        this.J();
    }

    public AuditTrailReconstructor(CommunicationProtocolManager communicationProtocolManager, @Nullable Ry ry, @Nullable JsonPayloadOrchestrator jsonPayloadOrchestrator) {
        long l = fb ^ 0x109DC4C3AA5BL;
        super(communicationProtocolManager, ry, jsonPayloadOrchestrator, true);
        this.PH = new HashSet<Long>();
        this.Pf = new String[]{AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)18764, (long)(0x300DD52CB8EEBE6L ^ l)), (long)5011110098438988807L, (long)l), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)29408, (long)(0x55B55FA4CF69D021L ^ l)), (long)5011110098438988807L, (long)l), AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)22923, (long)(0x275A33B943CC7B18L ^ l)), (long)5011110098438988807L, (long)l)};
        this.PU = this.Pf[0];
        this.Mb = ry;
        this.PK = ry != null ? ry.G() : null;
        this.MX = jsonPayloadOrchestrator;
        this.BX = false;
        this.g(this::Y);
        this.J();
        Z3.s().A(this, new Predicate[0]);
    }

    private static Method x(long l, long l2) {
        int n = AuditTrailReconstructor.u(l, l2);
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
                clazz3 = AuditTrailReconstructor.v(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AuditTrailReconstructor.v(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AuditTrailReconstructor.k(clazz, string, clazz2, n2, classArray2)) != null) {
                        AuditTrailReconstructor.Gb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AuditTrailReconstructor.v(276986619678580L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AuditTrailReconstructor.l(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AuditTrailReconstructor.Gb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AuditTrailReconstructor.v(276986619678580L, 0L);
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

    private List lambda$null$9(AsynchronousPipelineOrchestrator asynchronousPipelineOrchestrator, Function function, TransactionStatusTracker transactionStatusTracker) {
        block8: {
            try {
                if (!transactionStatusTracker.b()) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
            try {
                try {
                    if (PR || transactionStatusTracker.h() != null) break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuditTrailReconstructor.b(customSystemException);
                }
                throw new AssertionError();
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
        }
        asynchronousPipelineOrchestrator.Z((DataStreamOrchestrator629)transactionStatusTracker.h());
        ArrayList<AsynchronousTaskCoordinator> arrayList = new ArrayList<AsynchronousTaskCoordinator>();
        for (TemporalDataTransformer temporalDataTransformer : ((DataStreamOrchestrator629)transactionStatusTracker.h()).v()) {
            arrayList.add(((AsynchronousTaskCoordinator)function.apply(temporalDataTransformer)).A(() -> this.lambda$null$7(temporalDataTransformer)).v(AuditTrailReconstructor::lambda$null$8));
        }
        return arrayList;
    }

    private void Y() {
        long l = fb ^ 0x2728A39068DEL;
        this.m();
        double d2 = this.Ba.w();
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(d2, 15.0);
        graphicalRenderEngine1082.i(false);
        this.Ba.n(graphicalRenderEngine1082, new Object[0]);
        this.Ph = new GraphicalRenderEngine1082(d2, this.Ba.b() - graphicalRenderEngine1082.b() - 6.0);
        this.Ph.i(false);
        this.Ph.d().f((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)4537, (long)(0x775FD365AD83F18FL ^ l)), (long)-8714960468214028670L, (long)l)));
        this.D();
        this.Ba.n(this.Ph, new Object[0]);
        graphicalRenderEngine1082.d().f((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)7504, (long)(0x69A139E2C0B2FD65L ^ l)), (long)-8714960468214028670L, (long)l)));
        graphicalRenderEngine1082.i(false);
        for (String string : this.Pf) {
            block10: {
                VisualRenderContext visualRenderContext;
                block9: {
                    Color color;
                    VisualRenderContext visualRenderContext2;
                    visualRenderContext = new VisualRenderContext(string, 0.75);
                    try {
                        visualRenderContext.f(false);
                        visualRenderContext2 = visualRenderContext;
                        color = string.equals(this.PU) ? AuditTrailReconstructor.M.c : AuditTrailReconstructor.M.H;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AuditTrailReconstructor.b(customSystemException);
                    }
                    try {
                        visualRenderContext2.c(color);
                        visualRenderContext.I(false);
                        visualRenderContext.w(12.0);
                        graphicalRenderEngine1082.n(visualRenderContext, new Object[0]);
                        visualRenderContext.N(() -> this.lambda$viewDetails$0(string, graphicalRenderEngine1082));
                        if (!string.equalsIgnoreCase((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)11266, (long)(0x1A30FCB6CC68CC25L ^ l)), (long)-8714960468214028670L, (long)l))) || this.PK.Y() <= 0L) break block9;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AuditTrailReconstructor.b(customSystemException);
                    }
                    NumericComputationEngine832 numericComputationEngine832 = new NumericComputationEngine832(this.PK.Y());
                    graphicalRenderEngine1082.n(numericComputationEngine832, AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)3330, (long)(0x7B176D8FCE9ED01L ^ l)), (long)-8714960468214028670L, (long)l));
                    visualRenderContext.T(visualRenderContext.d());
                    break block10;
                }
                visualRenderContext.T(visualRenderContext.d());
            }
            try {
                try {
                    graphicalRenderEngine1082.n(new bE(8.0, this.b()), new Object[0]);
                    if (!string.equalsIgnoreCase((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)19029, (long)(0x6D0A9BF1B5112A51L ^ l)), (long)-8714960468214028670L, (long)l))) || this.PK.Y() <= 0L) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuditTrailReconstructor.b(customSystemException);
                }
                this.getClass();
                graphicalRenderEngine1082.n(new bE(5.0, this.b()), new Object[0]);
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
        }
        this.q();
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static TransactionStatusTracker lambda$null$3(Throwable throwable) {
        return null;
    }

    private AsynchronousTaskCoordinator lambda$viewDetailsReviews$5(TemporalDataTransformer temporalDataTransformer) {
        double d2 = this.Ph.w();
        this.getClass();
        return new AsynchronousTaskCoordinator(this.Mb, temporalDataTransformer, d2 - 5.0, EncodingProtocolRegistry.REPLY);
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d2' || c == '\u00ec' || c == '\u00e6' || c == '\u00d3') {
                field = AuditTrailReconstructor.w(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ec' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AuditTrailReconstructor.x(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'B' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private CompletionStage lambda$update$26(TransactionStatusTracker transactionStatusTracker) {
        block7: {
            try {
                try {
                    if (transactionStatusTracker != null && transactionStatusTracker.b()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuditTrailReconstructor.b(customSystemException);
                }
                return CompletableFuture.completedFuture(null);
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
        }
        TransactionDescriptor transactionDescriptor = this.MX.P();
        try {
            if (transactionDescriptor == null) {
                return CompletableFuture.completedFuture(null);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        return _b.S().c().M(CryptographicSessionManager884.d(Collections.singletonList(transactionDescriptor), null));
    }

    private static TransactionStatusTracker lambda$null$12(Throwable throwable) {
        return null;
    }

    private static int e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AuditTrailReconstructor.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    private CompletableFuture lambda$viewDetailsSettings$14() {
        long l = fb ^ 0x65F34661D71DL;
        return C_.P(this.V(), (String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)9316, (long)(0x435029706E9FFB87L ^ l)), (long)4093067803168758081L, (long)l)), (String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)10337, (long)(0x15EE52132532F78CL ^ l)), (long)4093067803168758081L, (long)l)), (String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)20878, (long)(0x6BBDC5404C308E0DL ^ l)), (long)4093067803168758081L, (long)l)), this::lambda$null$13);
    }

    private void lambda$markViewedReviewsAsRead$23(List list, TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        long l = fb ^ 0x4A517293EB91L;
        try {
            if (throwable != null) {
                TemporalMetadataResolver.W(throwable);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        try {
            if (!transactionStatusTracker.b()) {
                IntegerComputationManager.q((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)3179, (long)(0x4449906E1A8BEF01L ^ l)), (long)306615142937028045L, (long)l)) + transactionStatusTracker.A());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AuditTrailReconstructor.b(customSystemException);
        }
        for (TemporalDataTransformer temporalDataTransformer : this.Mb.e().v()) {
            try {
                if (!list.contains(temporalDataTransformer.V())) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
            temporalDataTransformer.W(true);
            this.J(this.PK.Y() - 1L);
        }
    }

    private static AbstractComputationKernel lambda$viewDetailsReviews$6(Function function) {
        return (AsynchronousTaskCoordinator)function.apply(null);
    }

    private CompletableFuture lambda$viewDetailsSettings$21(CipherManager cipherManager, AdaptiveCipherEngine adaptiveCipherEngine, AdaptiveCipherEngine adaptiveCipherEngine2, AdaptiveCipherEngine adaptiveCipherEngine3) {
        return this.A(null, cipherManager.a(), this.P3.C(), adaptiveCipherEngine.j(), adaptiveCipherEngine2.j(), adaptiveCipherEngine3.j(), false);
    }

    private void lambda$viewDetails$0(String string, GraphicalRenderEngine1082 graphicalRenderEngine1082) {
        block11: {
            long l;
            block12: {
                block10: {
                    l = fb ^ 0xEC9F9857EBFL;
                    try {
                        if (!string.equalsIgnoreCase((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)10722, (long)(0x7AB6228496F4DF97L ^ l)), (long)-7967126943729258269L, (long)l)))) break block10;
                        this.L();
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AuditTrailReconstructor.b(customSystemException);
                    }
                }
                try {
                    if (!string.equalsIgnoreCase((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)31363, (long)(0x13A7BE5C4BB78CD9L ^ l)), (long)-7967126943729258269L, (long)l)))) break block12;
                    this.I();
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw AuditTrailReconstructor.b(customSystemException);
                }
            }
            try {
                if (string.equalsIgnoreCase((String)((Object)AuditTrailReconstructor.k("B", (int)AuditTrailReconstructor.e("i", (int)5804, (long)(0x5E0DCAE844C3E0E1L ^ l)), (long)-7967126943729258269L, (long)l)))) {
                    this.q();
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
        }
        this.PU = string;
        for (AbstractComputationKernel abstractComputationKernel : graphicalRenderEngine1082.A()) {
            Color color;
            VisualRenderContext visualRenderContext;
            if (!(abstractComputationKernel instanceof VisualRenderContext)) continue;
            VisualRenderContext visualRenderContext2 = (VisualRenderContext)abstractComputationKernel;
            try {
                visualRenderContext = visualRenderContext2;
                color = visualRenderContext2.O().equals(this.PU) ? AuditTrailReconstructor.M.c : AuditTrailReconstructor.M.H;
            }
            catch (CustomSystemException customSystemException) {
                throw AuditTrailReconstructor.b(customSystemException);
            }
            visualRenderContext.c(color);
            visualRenderContext2.f(false);
        }
    }

    private static void X() {
        Object[] objectArray = Gb;
        Gb[0] = "@\u0017z";
        objectArray[1] = Integer.TYPE;
        AuditTrailReconstructor.Hb[1] = "java/lang/Integer";
        objectArray[2] = "\rY}Oc\u0014\u0006Vl\u0000\u001e\f\u0015QeI";
        objectArray[3] = "#\u001abvD,(\u0015s9%\"#\u001ewc";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ";aL\u001b@_caX\u007fF\u001c_'\r\u0006\u001d^$:N\u0003-^$a\u000f\u0002A\u0000>;V\u007f";
    }

    private void J(long l) {
        block11: {
            Ry ry;
            block12: {
                block10: {
                    try {
                        try {
                            if (PR || this.PK != null) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AuditTrailReconstructor.b(customSystemException);
                        }
                        throw new AssertionError();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AuditTrailReconstructor.b(customSystemException);
                    }
                }
                this.PK.t(l);
                ry = TemporalMetadataResolver.h.u().j().get(this.Mb.H());
                try {
                    try {
                        try {
                            if (ry == null) break block11;
                            if (PR) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AuditTrailReconstructor.b(customSystemException);
                        }
                        if (ry.G() != null) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AuditTrailReconstructor.b(customSystemException);
                    }
                    throw new AssertionError();
                }
                catch (CustomSystemException customSystemException) {
                    throw AuditTrailReconstructor.b(customSystemException);
                }
            }
            ry.G().t(l);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AuditTrailReconstructor.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AuditTrailReconstructor.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

