/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.data.mapping;

import a.E8;
import a.KB;
import a.Ni;
import a.Qh;
import a._Y;
import a.a;
import a.kg;
import a.oQ;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.app.config.management.ConfigurationRegistry;
import com.app.core.execution.ExecutionOrchestrator;
import com.app.network.pool.ConnectionPoolOrchestrator1192;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.CompressionUtility;
import com.event.dispatch.EventDispatchRegistry2111;
import com.event.management.ContextualEventDispatcher;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.computation.NumericComputationEngine1131;
import com.math.geometry.GeometryCalculator;
import com.memory.caching.CacheMemoryManager;
import com.network.connection.ConnectionLifecycleManager;
import com.network.connection.NetworkConnectionManager2105;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.ProtocolInteractionController;
import com.network.transmission.DataTransmissionManager2384;
import com.numeric.precision.NumericPrecisionTransformer;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.context.LightweightExecutionContext;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.auth.AuthenticationGateway;
import com.security.crypto.CryptographicCipherProvider;
import com.security.crypto.CryptographicContextManager567;
import com.security.crypto.EncryptionTransformer;
import com.security.cryptography.CryptoKeyManagementSystem;
import com.security.protocol.SecurityProtocolHandler2385;
import com.security.transform.CryptographicTransformer;
import com.spatial.calculation.GeometricPositionCalculator;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.structures.tree.RecursiveNodeTree;
import com.system.config.AdaptiveConfigurationManager;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.system.resource.AssetLoadBalancer;
import com.temporal.metadata.TemporalMetadataResolver;
import com.transaction.management.TransactionOrchestrator1017;
import com.ui.rendering.GraphicalRenderingController;
import com.validation.core.ObjectValidator;
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
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class DataMappingOrchestrator
extends ContextualExecutionFramework {
    private final CryptographicCipherProvider P;
    private final AuthenticationStateTracker h;
    private final AuthenticationStateTracker F;
    private final AuthenticationStateTracker T;
    private final AuthenticationStateTracker K;
    private static final Map hb;
    private final List<RecursiveNodeTreeBuilder> O;
    private static final Integer[] gb;
    private final ColorPaletteManager Y;
    private int d;
    private ArrayList<String> Z;
    private AdaptiveConfigurationManager w;
    private static final Object[] kb;
    private static final long[] fb;
    private final ColorPaletteManager L;
    private final AuthenticationStateTracker X;
    private static final String[] lb;
    boolean Wk;
    private boolean l;
    private int B;
    private double R;
    private ContextualEventDispatcher G;
    private final NetworkConnectionManager2105 m;
    private final ConnectionLifecycleManager v;
    private int t;
    private static final long bb;
    private boolean b;
    private final AuthenticationStateTracker o;
    private AuthenticationGateway z;
    private final AuthenticationStateTracker N;
    private CompressionUtility x;
    private CacheMemoryManager A;
    private CompressionUtility V;
    private CompressionUtility r;
    private final AuthenticationStateTracker j;
    private double n;
    private final NumericPrecisionTransformer e;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataMappingOrchestrator.bb = MultiContainerRegistry.a(-6671561540258728635L, -2475828247891785468L, MethodHandles.lookup().lookupClass()).a(253489095821163L);
                DataMappingOrchestrator.kb = new Object[18];
                DataMappingOrchestrator.lb = new String[18];
                DataMappingOrchestrator.a();
                DataMappingOrchestrator.hb = new HashMap<K, V>(13);
                var0 = DataMappingOrchestrator.bb ^ 43408772569958L;
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
                var8_3 = new long[89];
                var5_4 = 0;
                var6_5 = "Q\u00ab\u00d7\u00cf\u00c2\u00f9_\u0088\u00e9{\u00cdpT\u00eb\u00ea\u0098\u0003\u00ebk\u00d6\u00ec\u0082\u00faA(h\u0003\u009c\u00bb\u00f9\u00b6V\u0090\u0094%\u00b8\u001a\u0005t\u0081E\u00c56\u00e7FT\u00a78\u00aam\u0003]E\u00fd\u001cLy\u00fe\u00ddk\u00ec\u0013\u009fi\u00e6Q\u0089\u0097\u00db\u0084~\u008c\u00f7\u00f2\u00e4\u009dG\u00ae\u00c2f2\u00f1\u001d\u00cd`\u0007\u001cu\u0002c\u00a7\u00d8\u008b\u0087\u00d42\u000b\u00e2\u0017=\u008a\u00c8l\u00e4\u0014\u009e^!\u00fcK\u0014\u00ee\u0001\u001f\r=\u00b7'\u0011\u0018\u00ed\u00b6_\u00e6\u00e4\u00d5\u00a0\u00af^\b3\u00ff\u00d9Q\u00d3\u00c3\u00be\u00f8\u00a1\u00ca\u00e0C\u001c\u0007\u001cQ\u0010W\u0016Hn/x\u00f9\u00d5\u00b0d3ADh\u00b8\u0007E\u001eR\u00dd#\u00ca\t\u00d8\u0015\u0017\f\u00fa}\u00ac\u00ba)0\u00bb\u00ed\u0086\u00efK\u00d8h\u000e\u00f3\u00c1\u00d6\u00f1\u00f9C0v\u0096\n%\u00eb}\u00af\u0099.O\u0018\u0091\u0081Lz\u0092\u00d7!\u00ee0\u00d8\u00c3|\u0002\u0095\u00ef\u008f,\u00e4\u009a\u00a9\u00cf\u00f9+.{\u00fb\u00c4$\u009d\u00e3.\f\u0090+\f\u00fa\u0006\u00adc\u0016f\u001a\u00ea{\u00ba\u00e69q\u00b8O\u001eIh\u00ca\u009a\u0089\u00eb0\u00fc2\u00dd\u007fY\u00ea\t\u00d1\u00ca\u00e1\u0011\b\u00a2\rE\u0086\u00a1\u00baSx\r\u00e0\u000e\u00bf\u001e\u00c6\u007f\u00cd\u008c\u00e8\u00e1\rB\u0006+\u00b3\u009b\u0091X\u0099\u007f-\u00f6\u0011\u00f4\u009a\b\u00895C\u00a1~\u00e6r\u008b\u001d'8-\u00dcO\u009c\u00e0\u00e0\u007fV\u00fb\u00a5\u00adV\r\u001dBT\u00ad\u00f9\u00ea\u00dcUQx\u00c7pjl\t\u00bfe:\u00de\u00bcx\u00bc\u0019E\u00bcO[=C\u00d0'\u00b9\u00e4\u0082\u00ba\u00fc\u0096\u00b2\u00a1\u008b\u00d1\u00a7\u00b9\u0003<\u0018\u00aexz\u00f6\u008d\u0012&J\u0093at\u00da,\u001f\u00ebE\u00e9\u00d73qa\u00f6\u001ewS\u00e9@\u00c8\u00f8%\u00de\u00ff\u00a1)\u00fb3\u0014\u00de\u00999f\u00d2\u00bb\u00db\u0093\u0090\u00a6M\u00f9y\u0094\u0015\u001d\u00a8-p\u00ed\u00a1\u00e1\u00f3\u00b9\u0098\u0080\u00ac\u00fc\u001d%\u00b4\u00d7\u009a\u00d1\u0090\u00de-9\u0091I\u00fet9\u00ab\f\u00e5\u00be\u00c9\u00d1\u00ab\u00f0\u0003\u009cV7q`m\u001a\u00ce\u00a0\u00c3{u>9]9t\u00b1\u00efGU_\u00a7X\u00c9\u000e\u00a4~\u00d0I@,\u00ab\u008f\u00cd&U\u00f7\u001ft\u00b7<\u0092<I\u0083\u00f9>$\u00ce\u00cc3\u0019\u0017\u001c\u00f7\u00a5\u00bd(G\u0096V\u009b\u0013uE=2\u0089C\u0018\u00eb2\u00b9?\u00a6\u00d8\u00a9\u00f1v\u00c7{h\u00a5\u00cf\t\u00c0<\u0097[\u0084P\u0016\u009aR\u009f\u00f9\u001b/\u00c0\u001b\u00eb\u00c0\u00ad\u00d8\u00b0c\u009f\u0014\u0097\u00b8\u00b8;\u00ac\u00cc\u0003\u0010\u00c8\u00fc\u00eb\u00f7\u00cb\u009a\u00eew\u00d4*aPh\u00bbA\u008b[.\u00a5\u00a2\u00e22\r5\u00ef\u00c3\u00b8\u00d1\u00ad\u00a9\u0011\u00ae\u00cdu\u00ff\u007f*#\u00db\u008e\u0015\u00cb\u0084\u0005\u0011x^\u009bv1\u00c8\t\u00ab\u00c5K\u00fdRQ)\u00eb\u00ae\u00d4\u001b\u00b7}&\u00f5\u00f7lB\u0000\u00c0\u000f\u00ee\u00b7\u00d3#\u0002\u00ae\u00feum\u0098I5\u0012\u0012]$\u00a4k\u0002\u00db\u0084\"\u0016\u008f\u0003\u00da\u00b8\u00bauz\u008e6\u00bb\u00f6\u0099\u008a";
                var7_6 = "Q\u00ab\u00d7\u00cf\u00c2\u00f9_\u0088\u00e9{\u00cdpT\u00eb\u00ea\u0098\u0003\u00ebk\u00d6\u00ec\u0082\u00faA(h\u0003\u009c\u00bb\u00f9\u00b6V\u0090\u0094%\u00b8\u001a\u0005t\u0081E\u00c56\u00e7FT\u00a78\u00aam\u0003]E\u00fd\u001cLy\u00fe\u00ddk\u00ec\u0013\u009fi\u00e6Q\u0089\u0097\u00db\u0084~\u008c\u00f7\u00f2\u00e4\u009dG\u00ae\u00c2f2\u00f1\u001d\u00cd`\u0007\u001cu\u0002c\u00a7\u00d8\u008b\u0087\u00d42\u000b\u00e2\u0017=\u008a\u00c8l\u00e4\u0014\u009e^!\u00fcK\u0014\u00ee\u0001\u001f\r=\u00b7'\u0011\u0018\u00ed\u00b6_\u00e6\u00e4\u00d5\u00a0\u00af^\b3\u00ff\u00d9Q\u00d3\u00c3\u00be\u00f8\u00a1\u00ca\u00e0C\u001c\u0007\u001cQ\u0010W\u0016Hn/x\u00f9\u00d5\u00b0d3ADh\u00b8\u0007E\u001eR\u00dd#\u00ca\t\u00d8\u0015\u0017\f\u00fa}\u00ac\u00ba)0\u00bb\u00ed\u0086\u00efK\u00d8h\u000e\u00f3\u00c1\u00d6\u00f1\u00f9C0v\u0096\n%\u00eb}\u00af\u0099.O\u0018\u0091\u0081Lz\u0092\u00d7!\u00ee0\u00d8\u00c3|\u0002\u0095\u00ef\u008f,\u00e4\u009a\u00a9\u00cf\u00f9+.{\u00fb\u00c4$\u009d\u00e3.\f\u0090+\f\u00fa\u0006\u00adc\u0016f\u001a\u00ea{\u00ba\u00e69q\u00b8O\u001eIh\u00ca\u009a\u0089\u00eb0\u00fc2\u00dd\u007fY\u00ea\t\u00d1\u00ca\u00e1\u0011\b\u00a2\rE\u0086\u00a1\u00baSx\r\u00e0\u000e\u00bf\u001e\u00c6\u007f\u00cd\u008c\u00e8\u00e1\rB\u0006+\u00b3\u009b\u0091X\u0099\u007f-\u00f6\u0011\u00f4\u009a\b\u00895C\u00a1~\u00e6r\u008b\u001d'8-\u00dcO\u009c\u00e0\u00e0\u007fV\u00fb\u00a5\u00adV\r\u001dBT\u00ad\u00f9\u00ea\u00dcUQx\u00c7pjl\t\u00bfe:\u00de\u00bcx\u00bc\u0019E\u00bcO[=C\u00d0'\u00b9\u00e4\u0082\u00ba\u00fc\u0096\u00b2\u00a1\u008b\u00d1\u00a7\u00b9\u0003<\u0018\u00aexz\u00f6\u008d\u0012&J\u0093at\u00da,\u001f\u00ebE\u00e9\u00d73qa\u00f6\u001ewS\u00e9@\u00c8\u00f8%\u00de\u00ff\u00a1)\u00fb3\u0014\u00de\u00999f\u00d2\u00bb\u00db\u0093\u0090\u00a6M\u00f9y\u0094\u0015\u001d\u00a8-p\u00ed\u00a1\u00e1\u00f3\u00b9\u0098\u0080\u00ac\u00fc\u001d%\u00b4\u00d7\u009a\u00d1\u0090\u00de-9\u0091I\u00fet9\u00ab\f\u00e5\u00be\u00c9\u00d1\u00ab\u00f0\u0003\u009cV7q`m\u001a\u00ce\u00a0\u00c3{u>9]9t\u00b1\u00efGU_\u00a7X\u00c9\u000e\u00a4~\u00d0I@,\u00ab\u008f\u00cd&U\u00f7\u001ft\u00b7<\u0092<I\u0083\u00f9>$\u00ce\u00cc3\u0019\u0017\u001c\u00f7\u00a5\u00bd(G\u0096V\u009b\u0013uE=2\u0089C\u0018\u00eb2\u00b9?\u00a6\u00d8\u00a9\u00f1v\u00c7{h\u00a5\u00cf\t\u00c0<\u0097[\u0084P\u0016\u009aR\u009f\u00f9\u001b/\u00c0\u001b\u00eb\u00c0\u00ad\u00d8\u00b0c\u009f\u0014\u0097\u00b8\u00b8;\u00ac\u00cc\u0003\u0010\u00c8\u00fc\u00eb\u00f7\u00cb\u009a\u00eew\u00d4*aPh\u00bbA\u008b[.\u00a5\u00a2\u00e22\r5\u00ef\u00c3\u00b8\u00d1\u00ad\u00a9\u0011\u00ae\u00cdu\u00ff\u007f*#\u00db\u008e\u0015\u00cb\u0084\u0005\u0011x^\u009bv1\u00c8\t\u00ab\u00c5K\u00fdRQ)\u00eb\u00ae\u00d4\u001b\u00b7}&\u00f5\u00f7lB\u0000\u00c0\u000f\u00ee\u00b7\u00d3#\u0002\u00ae\u00feum\u0098I5\u0012\u0012]$\u00a4k\u0002\u00db\u0084\"\u0016\u008f\u0003\u00da\u00b8\u00bauz\u008e6\u00bb\u00f6\u0099\u008a".length();
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
                    var6_5 = "\u00bf@\u00d86\u00c4u\u00a1\u00d3gt6\u008a2[z\u00c6";
                    var7_6 = "\u00bf@\u00d86\u00c4u\u00a1\u00d3gt6\u008a2[z\u00c6".length();
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
        DataMappingOrchestrator.fb = var8_3;
        DataMappingOrchestrator.gb = new Integer[89];
    }

    private boolean F(LightweightExecutionContext lightweightExecutionContext) {
        block4: {
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
        }
        return this.L.H(lightweightExecutionContext);
    }

    private CacheMemoryManager O() {
        block95: {
            ArrayList<CompressionUtility> arrayList;
            Object object;
            DataTransmissionManager2384 dataTransmissionManager2384;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block94: {
                int n;
                ArrayList<CompressionUtility> arrayList2;
                block92: {
                    int n2;
                    Object object2;
                    block88: {
                        double d2;
                        int n3;
                        block86: {
                            block84: {
                                int n4;
                                CacheMemoryManager cacheMemoryManager;
                                block76: {
                                    long l = bb ^ 0x3A21A2CA5C67L;
                                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                    object2 = ExecutionOrchestrator.F();
                                    ExecutionOrchestrator.c((Qh)object2);
                                    ExecutionOrchestrator.c((Qh)object2);
                                    ExecutionOrchestrator.c((Qh)object2);
                                    double d3 = 2.0;
                                    double d4 = 99.0;
                                    int n5 = 0;
                                    cacheMemoryManager = null;
                                    int n6 = 0;
                                    n2 = EncryptionTransformer.r();
                                    block60: while (true) {
                                        int n7 = n6;
                                        block61: while (n7 <= 30) {
                                            double d5 = 0.0;
                                            n4 = 0;
                                            if (n2 == 0) break block76;
                                            n3 = n4;
                                            block62: while (true) {
                                                int n8 = n3;
                                                block63: while (n8 > -1) {
                                                    n7 = (int)(-d3);
                                                    if (n2 == 0) continue block61;
                                                    int n9 = n7;
                                                    block64: while (true) {
                                                        double d6;
                                                        double d7 = (d6 = (double)n9 - d3) == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
                                                        block65: while (d7 <= 0) {
                                                            n8 = (int)(-d3);
                                                            if (n2 == 0) continue block63;
                                                            int n10 = n8;
                                                            while ((double)n10 <= d3) {
                                                                block77: {
                                                                    block78: {
                                                                        int n11;
                                                                        CompressionUtility compressionUtility;
                                                                        block82: {
                                                                            block80: {
                                                                                block79: {
                                                                                    compressionUtility = new CompressionUtility(AdaptiveComputationEngine.Q(((CryptographicTransformer)object2).F()) + n9, (int)((double)(AdaptiveComputationEngine.Q(((oQ)((TransactionOrchestrator1017)object2).L()).c()) + n3) + d5), AdaptiveComputationEngine.Q(((CryptographicTransformer)object2).B()) + n10);
                                                                                    TransactionCorrelationEngine transactionCorrelationEngine = this.n(compressionUtility);
                                                                                    try {
                                                                                        if (n2 == 0) break block77;
                                                                                        d7 = (double)transactionCorrelationEngine.u().equals(RecursiveNodeTree.V());
                                                                                        if (n2 == 0) continue block65;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (d7 != false) break block78;
                                                                                                n11 = transactionCorrelationEngine.u().B();
                                                                                                if (n2 == 0) break block79;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                                                            }
                                                                                            if (n11 != 0) break block78;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                                        }
                                                                                        n11 = transactionCorrelationEngine.u().s();
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    double d8;
                                                                                    block81: {
                                                                                        try {
                                                                                            try {
                                                                                                if (n2 == 0) break block80;
                                                                                                if (n11 != 0) break block81;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                                                            }
                                                                                            if (n2 != 0) break block78;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                                        }
                                                                                    }
                                                                                    n11 = (d8 = (double)(compressionUtility.h() + 1) - ((oQ)systemConfigurationOrchestrator.L()).c()) == 0.0 ? 0 : (d8 > 0.0 ? 1 : -1);
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                                                }
                                                                            }
                                                                            try {
                                                                                block83: {
                                                                                    try {
                                                                                        try {
                                                                                            if (n2 == 0) break block82;
                                                                                            if (n11 <= 0) break block83;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                                        }
                                                                                        if (n2 != 0) break block78;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                                                    }
                                                                                }
                                                                                n11 = compressionUtility.z();
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                                            }
                                                                        }
                                                                        double d9 = (double)n11 + 0.5;
                                                                        double d10 = (double)compressionUtility.A() + 0.5;
                                                                        double d11 = _Y.V(((CryptographicTransformer)object2).F(), (double)compressionUtility.h() + 0.5, ((CryptographicTransformer)object2).B(), d9, (double)compressionUtility.h() + 0.5, d10);
                                                                        try {
                                                                            if (n2 == 0) break block77;
                                                                            if (!(d11 < d4)) break block78;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                        }
                                                                        d4 = d11;
                                                                        cacheMemoryManager = new CacheMemoryManager(compressionUtility.z(), compressionUtility.h(), compressionUtility.A(), ((CryptographicTransformer)object2).F(), compressionUtility.h(), ((CryptographicTransformer)object2).B());
                                                                        n5 = cacheMemoryManager.H().size();
                                                                        try {
                                                                            try {
                                                                                if (n2 == 0) break block77;
                                                                                if (n5 > 2) break block78;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                                            }
                                                                            return cacheMemoryManager;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                        }
                                                                    }
                                                                    ++n10;
                                                                }
                                                                if (n2 != 0) continue;
                                                            }
                                                            ++n9;
                                                            if (n2 != 0) continue block64;
                                                        }
                                                        break;
                                                    }
                                                    --n3;
                                                    if (n2 != 0) continue block62;
                                                }
                                                break;
                                            }
                                            ExecutionOrchestrator.c((Qh)object2);
                                            ++n6;
                                            if (n2 != 0) continue block60;
                                        }
                                        break;
                                    }
                                    try {
                                        if (cacheMemoryManager == null) break block84;
                                        n4 = n5;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DataMappingOrchestrator.a(customSystemException);
                                    }
                                }
                                try {
                                    if (n4 <= 3) {
                                        return cacheMemoryManager;
                                    }
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataMappingOrchestrator.a(customSystemException);
                                }
                            }
                            object2 = new ArrayList();
                            dataTransmissionManager2384 = DataTransmissionManager2384.h(ApplicationLifecycleManager.c(), systemConfigurationOrchestrator.B());
                            dataTransmissionManager2384.R(systemConfigurationOrchestrator, true);
                            double d12 = dataTransmissionManager2384.V();
                            int n12 = 0;
                            while (n12 <= 10) {
                                block85: {
                                    try {
                                        block87: {
                                            try {
                                                try {
                                                    try {
                                                        ExecutionOrchestrator.c(dataTransmissionManager2384);
                                                        if (n2 == 0) break block85;
                                                        d2 = dataTransmissionManager2384.V();
                                                        if (n2 == 0) break block86;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                    }
                                                    if (!(d2 < d12)) break block87;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                }
                                                ExecutionOrchestrator.c(dataTransmissionManager2384);
                                                if (n2 != 0) break;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DataMappingOrchestrator.a(customSystemException);
                                            }
                                        }
                                        ++n12;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DataMappingOrchestrator.a(customSystemException);
                                    }
                                }
                                if (n2 != 0) continue;
                            }
                            d2 = 4.0;
                        }
                        double d13 = d2;
                        double d14 = 0.0;
                        int n13 = 0;
                        block68: while (true) {
                            int n12 = n13;
                            block69: while (n12 > -5) {
                                if (n2 == 0) break block88;
                                int n15 = (int)(-d13);
                                block70: while (true) {
                                    double d9;
                                    double d10 = (d9 = (double)n15 - d13) == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
                                    block71: while (d10 <= 0) {
                                        n12 = (int)(-d13);
                                        if (n2 == 0) continue block69;
                                        n3 = n12;
                                        while ((double)n3 <= d13) {
                                            block89: {
                                                block90: {
                                                    CompressionUtility compressionUtility = new CompressionUtility(AdaptiveComputationEngine.Q(dataTransmissionManager2384.F()) + n15, (int)((double)(AdaptiveComputationEngine.Q(((oQ)dataTransmissionManager2384.L()).c()) + n13) + d14), AdaptiveComputationEngine.Q(dataTransmissionManager2384.B()) + n3);
                                                    TransactionCorrelationEngine transactionCorrelationEngine = this.n(compressionUtility);
                                                    try {
                                                        if (n2 == 0) break block89;
                                                        d10 = (double)transactionCorrelationEngine.u().equals(RecursiveNodeTree.V());
                                                        if (n2 == 0) continue block71;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                    }
                                                    try {
                                                        boolean bl;
                                                        block91: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (d10 != false) break block90;
                                                                        bl = transactionCorrelationEngine.u().B();
                                                                        if (n2 == 0) break block90;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                                    }
                                                                    if (!bl) break block91;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                                }
                                                                if (n2 != 0) break block90;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                            }
                                                        }
                                                        bl = ((ArrayList)object2).add(compressionUtility);
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                    }
                                                }
                                                ++n3;
                                            }
                                            if (n2 != 0) continue;
                                        }
                                        ++n15;
                                        if (n2 != 0) continue block70;
                                    }
                                    break;
                                }
                                --n13;
                                if (n2 != 0) continue block68;
                            }
                            break;
                        }
                        ((ArrayList)object2).sort(Comparator.comparing(arg_0 -> DataMappingOrchestrator.lambda$getClosestBlock$0(dataTransmissionManager2384, arg_0)));
                    }
                    arrayList2 = new ArrayList<CompressionUtility>();
                    object = ((ArrayList)object2).iterator();
                    while (object.hasNext()) {
                        CompressionUtility compressionUtility = (CompressionUtility)object.next();
                        try {
                            block93: {
                                try {
                                    try {
                                        arrayList2.add(compressionUtility);
                                        n = arrayList2.size();
                                        if (n2 == 0) break block92;
                                        if (n <= 5) break block93;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DataMappingOrchestrator.a(customSystemException);
                                    }
                                    if (n2 != 0) break;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataMappingOrchestrator.a(customSystemException);
                                }
                            }
                            if (n2 != 0) continue;
                            break;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataMappingOrchestrator.a(customSystemException);
                        }
                    }
                    try {
                        arrayList2.sort(Comparator.comparing(arg_0 -> DataMappingOrchestrator.lambda$getClosestBlock$1(dataTransmissionManager2384, arg_0)));
                        arrayList = arrayList2;
                        if (n2 == 0) break block94;
                        n = arrayList.size();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataMappingOrchestrator.a(customSystemException);
                    }
                }
                try {
                    if (n <= 0) break block95;
                    arrayList = arrayList2.get(0);
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
            }
            object = (CompressionUtility)((Object)arrayList);
            try {
                if ((double)(((CompressionUtility)object).h() + 1) > ((oQ)systemConfigurationOrchestrator.L()).c()) {
                    return null;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
            return new CacheMemoryManager(((CompressionUtility)object).z(), ((CompressionUtility)object).h(), ((CompressionUtility)object).A(), dataTransmissionManager2384.F(), ((CompressionUtility)object).h(), dataTransmissionManager2384.B());
        }
        return null;
    }

    @DataExchangeProtocol2090
    public void W(CryptoKeyManagementSystem cryptoKeyManagementSystem) {
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataMappingOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private kg w(AdaptiveConfigurationManager adaptiveConfigurationManager, CompressionUtility compressionUtility) {
        oQ oQ2;
        block26: {
            int n;
            float f;
            float f2;
            float f3;
            float f4;
            block25: {
                int n2;
                block23: {
                    long l;
                    block24: {
                        block21: {
                            block22: {
                                block20: {
                                    int n3;
                                    block19: {
                                        block28: {
                                            block27: {
                                                l = bb ^ 0x4B34F3A25806L;
                                                oQ2 = null;
                                                f4 = 0.15f;
                                                f3 = 0.85f;
                                                f2 = 0.0f;
                                                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                                double d2 = _Y.V(systemConfigurationOrchestrator.F(), systemConfigurationOrchestrator.V(), systemConfigurationOrchestrator.B(), compressionUtility.z(), compressionUtility.h(), compressionUtility.A());
                                                n2 = EncryptionTransformer.a();
                                                double d3 = _Y.V(systemConfigurationOrchestrator.F() + systemConfigurationOrchestrator.G(), systemConfigurationOrchestrator.V() + systemConfigurationOrchestrator.x(), systemConfigurationOrchestrator.B() + systemConfigurationOrchestrator.o(), compressionUtility.z(), compressionUtility.h(), compressionUtility.A());
                                                if (!(d3 + 0.01 > d2)) break block27;
                                                f = 0.95f;
                                                if (n2 == 0) break block28;
                                            }
                                            f = 0.5f;
                                        }
                                        try {
                                            try {
                                                n3 = adaptiveConfigurationManager.e().equals(DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)17715, (long)(0x6C154D38176C1C2EL ^ l)), (long)121952874812060146L, (long)l));
                                                if (n2 != 0) break block19;
                                                if (n3 == 0) break block20;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DataMappingOrchestrator.a(customSystemException);
                                            }
                                            n3 = compressionUtility.z();
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DataMappingOrchestrator.a(customSystemException);
                                        }
                                    }
                                    oQ2 = oQ.E((float)n3 + f4, (float)compressionUtility.h() + f4, (float)compressionUtility.A() - f2, (float)compressionUtility.z() + f3, (float)compressionUtility.h() + f, (float)compressionUtility.A() - f2);
                                }
                                try {
                                    n = adaptiveConfigurationManager.e().equals(DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)17090, (long)(0x2CB577072B669B96L ^ l)), (long)121952874812060146L, (long)l));
                                    if (n2 != 0) break block21;
                                    if (n == 0) break block22;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataMappingOrchestrator.a(customSystemException);
                                }
                                oQ2 = oQ.E((float)compressionUtility.z() + f4, (float)compressionUtility.h() + f4, (float)(compressionUtility.A() + 1) + f2, (float)compressionUtility.z() + f3, (float)compressionUtility.h() + f, (float)(compressionUtility.A() + 1) + f2);
                            }
                            n = adaptiveConfigurationManager.e().equals(DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)24672, (long)(0x1D0A8C93D742B95EL ^ l)), (long)121952874812060146L, (long)l));
                        }
                        try {
                            if (n2 != 0) break block23;
                            if (n == 0) break block24;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataMappingOrchestrator.a(customSystemException);
                        }
                        oQ2 = oQ.E((float)compressionUtility.z() - f2, (float)compressionUtility.h() + f4, (float)compressionUtility.A() + f4, (float)compressionUtility.z() - f2, (float)compressionUtility.h() + f, (float)compressionUtility.A() + f3);
                    }
                    n = adaptiveConfigurationManager.e().equals(DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)9105, (long)(0x4BFBDF04DC5A7ACEL ^ l)), (long)121952874812060146L, (long)l)) ? 1 : 0;
                }
                try {
                    try {
                        if (n2 != 0) break block25;
                        if (n == 0) break block26;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataMappingOrchestrator.a(customSystemException);
                    }
                    n = compressionUtility.z() + 1;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
            }
            oQ2 = oQ.E((float)n + f2, (float)compressionUtility.h() + f4, (float)compressionUtility.A() + f4, (float)(compressionUtility.z() + 1) + f2, (float)compressionUtility.h() + f, (float)compressionUtility.A() + f3);
        }
        try {
            if (oQ2 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataMappingOrchestrator.a(customSystemException);
        }
        return _Y.t(ApplicationLifecycleManager.U(), oQ2, 0.0, 0.0, 0.0);
    }

    private static Method d(long l, long l2) {
        int n = DataMappingOrchestrator.a(l, l2);
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
                clazz3 = DataMappingOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataMappingOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataMappingOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataMappingOrchestrator.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataMappingOrchestrator.b(780847717886645L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataMappingOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataMappingOrchestrator.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataMappingOrchestrator.b(780847717886645L, 0L);
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

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataMappingOrchestrator.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                DataMappingOrchestrator.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "\u001f36";
        objectArray[1] = Integer.TYPE;
        DataMappingOrchestrator.lb[1] = "java/lang/Integer";
        objectArray[2] = "_\u0007B z\bT\bSo\u0007\u0010G\u000fZ&";
        objectArray[3] = "}\"\bF";
        objectArray[4] = "voD_";
        objectArray[5] = "If\u0013.";
        objectArray[6] = "?:\u0012E";
        objectArray[7] = Void.TYPE;
        DataMappingOrchestrator.lb[7] = "java/lang/Void";
        objectArray[8] = "f+\u0019S";
        objectArray[9] = "\u0004f\u0004\u0000";
        objectArray[10] = Boolean.TYPE;
        DataMappingOrchestrator.lb[10] = "java/lang/Boolean";
        objectArray[11] = "tLy\\\u0000b\u007fCh\u0013altHlI";
        objectArray[12] = "7+A6\f\u0003i.\u0002b}6\r\u007fB-\u0003M4\"Ya\u0012r2-U;\u0004\u00121:Al}";
        objectArray[13] = "DIE[\u0019H\u001aL\u0006\u000fh`~\u001fBT\u0001^D\u001bS@\u00049";
        objectArray[14] = ",.\f?<\u0016r+OkM \u0016zK16\u001fu:\u000572g";
        objectArray[15] = "^\\\u0012$kc\u0000YQp\u001abd\t\u0006#|k\u0004\n\u00117+\u0012";
        objectArray[16] = ".r)id\ruk1P1JO6j74A1a(;$1u5n0b\u0000(n/\"Z";
        Object[] objectArray2 = objectArray;
        objectArray[17] = "ceV=J\u0012=`\u0015i;\u001cY5P-I^2aAkIcbwA2G\u000e05\u00137;_>nU4P\u0013+\u007fPV";
    }

    private TransactionCorrelationEngine n(CompressionUtility compressionUtility) {
        return ApplicationLifecycleManager.c().T(ReflectionUtilityBroker.t(compressionUtility.z(), compressionUtility.h(), compressionUtility.A())).I();
    }

    private void g() {
        boolean bl;
        block14: {
            block15: {
                block13: {
                    try {
                        try {
                            if (!this.K.s().booleanValue() || this.B == -1) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataMappingOrchestrator.a(customSystemException);
                        }
                        this.s(this.B);
                        this.B = -1;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataMappingOrchestrator.a(customSystemException);
                    }
                }
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                bl = true;
                try {
                    try {
                        try {
                            if (!this.j.s().booleanValue() || this.v.F(this)) break block14;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataMappingOrchestrator.a(customSystemException);
                        }
                        if (this.N(10) == null) break block15;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataMappingOrchestrator.a(customSystemException);
                    }
                    if (this.R == -999.0) break block15;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
                float f = systemConfigurationOrchestrator.q() - (float)this.R;
                SecurityProtocolHandler2385 securityProtocolHandler2385 = new SecurityProtocolHandler2385(this, ApplicationLifecycleManager.U(), f, systemConfigurationOrchestrator.S() - (float)this.n);
                securityProtocolHandler2385.i(true);
                securityProtocolHandler2385.J(true);
                securityProtocolHandler2385.L(4.0f);
                ConfigurationCalibrator.b.W(securityProtocolHandler2385);
                bl = false;
            }
            this.R = -999.0;
        }
        try {
            if (bl && this.v.b(this)) {
                // empty if block
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataMappingOrchestrator.a(customSystemException);
        }
        this.m.m(this);
        this.b = false;
        this.Wk = false;
    }

    private CompressionUtility N(int n) {
        DataTransmissionManager2384 dataTransmissionManager2384 = ExecutionOrchestrator.F();
        CompressionUtility compressionUtility = null;
        for (int i = 0; i <= n; ++i) {
            boolean bl;
            block11: {
                block10: {
                    double d2 = dataTransmissionManager2384.V();
                    try {
                        block9: {
                            try {
                                try {
                                    ExecutionOrchestrator.c(dataTransmissionManager2384);
                                    if (dataTransmissionManager2384.j() || d2 == dataTransmissionManager2384.V()) break block9;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataMappingOrchestrator.a(customSystemException);
                                }
                                if (!dataTransmissionManager2384.D()) break block10;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataMappingOrchestrator.a(customSystemException);
                            }
                        }
                        bl = true;
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataMappingOrchestrator.a(customSystemException);
                    }
                }
                bl = false;
            }
            boolean bl2 = bl;
            try {
                if (!bl2) continue;
                return new CompressionUtility(AdaptiveComputationEngine.Q(dataTransmissionManager2384.F()), AdaptiveComputationEngine.Q(dataTransmissionManager2384.V()) - 1, AdaptiveComputationEngine.Q(dataTransmissionManager2384.B()));
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
        }
        return compressionUtility;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void m(ContextualEventDispatcher contextualEventDispatcher, Color color) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)2929);
        double d2 = NumericComputationEngine1131.b();
        double d3 = NumericComputationEngine1131.S();
        double d4 = NumericComputationEngine1131.n();
        double d5 = contextualEventDispatcher.X() - 0.05;
        double d6 = contextualEventDispatcher.F() - 0.05;
        double d7 = contextualEventDispatcher.f() - 0.05;
        oQ oQ2 = oQ.E(0.0, 0.0, 0.0, 0.1, 0.1, 0.1);
        GL11.glTranslated((double)(-d2), (double)(-d3), (double)(-d4));
        GL11.glTranslated((double)d5, (double)d6, (double)d7);
        Color color2 = color;
        GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)0.25f);
        this.s(oQ2);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x58A1;
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
                throw new RuntimeException("a/As", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataMappingOrchestrator.gb[n2] = n3;
        }
        return gb[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/As" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @DataExchangeProtocol2090
    public void u(KB kB) {
        boolean bl;
        Object object;
        long l;
        block154: {
            block152: {
                block153: {
                    block151: {
                        SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                        block147: {
                            block149: {
                                boolean bl2;
                                block146: {
                                    block144: {
                                        block145: {
                                            block143: {
                                                block142: {
                                                    block141: {
                                                        block140: {
                                                            block139: {
                                                                block129: {
                                                                    block138: {
                                                                        boolean bl3;
                                                                        block136: {
                                                                            block137: {
                                                                                block134: {
                                                                                    block135: {
                                                                                        block133: {
                                                                                            block132: {
                                                                                                block131: {
                                                                                                    int n;
                                                                                                    block128: {
                                                                                                        l = bb ^ 0x13CF82ACB0D0L;
                                                                                                        systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                                                                                                        try {
                                                                                                            if (systemConfigurationOrchestrator.Y()) {
                                                                                                                return;
                                                                                                            }
                                                                                                        }
                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                                                        }
                                                                                                        this.P.a(systemConfigurationOrchestrator);
                                                                                                        n = this.j();
                                                                                                        try {
                                                                                                            try {
                                                                                                                block127: {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (this.Wk || this.z == null) break block127;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                                                                        }
                                                                                                                        if (this.A != null) break block128;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (!this.b) break block128;
                                                                                                            }
                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                                                                            }
                                                                                                            this.g();
                                                                                                        }
                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        block130: {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (!this.E()) break block129;
                                                                                                                            if (systemConfigurationOrchestrator.M().K()) break block130;
                                                                                                                        }
                                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                                                                        }
                                                                                                                        if (systemConfigurationOrchestrator.T()) break block130;
                                                                                                                    }
                                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                                                                                    }
                                                                                                                    if (systemConfigurationOrchestrator.d()) break block130;
                                                                                                                }
                                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                                                                                }
                                                                                                                if (n != 0) break block131;
                                                                                                            }
                                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                                                                            }
                                                                                                        }
                                                                                                        this.Wk = true;
                                                                                                        return;
                                                                                                    }
                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (this.b) break block132;
                                                                                                            if (this.m.v()) return;
                                                                                                        }
                                                                                                        catch (CustomSystemException customSystemException) {
                                                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                                                        }
                                                                                                        if (this.v.F(this)) {
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                    catch (CustomSystemException customSystemException) {
                                                                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                                                                    }
                                                                                                }
                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    if (this.b) break block129;
                                                                                                    if (!systemConfigurationOrchestrator.j()) break block133;
                                                                                                }
                                                                                                catch (CustomSystemException customSystemException) {
                                                                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                                                                }
                                                                                                if (!(systemConfigurationOrchestrator.x() > 0.0)) break block129;
                                                                                            }
                                                                                            catch (CustomSystemException customSystemException) {
                                                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                                                            }
                                                                                        }
                                                                                        object = null;
                                                                                        bl3 = false;
                                                                                        bl = false;
                                                                                        bl2 = false;
                                                                                        if (this.T.s().booleanValue() && (object = this.N(50)) == null) {
                                                                                            bl3 = true;
                                                                                        }
                                                                                        try {
                                                                                            if (!this.N.s().booleanValue()) break block134;
                                                                                            if (object != null) break block135;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                                        }
                                                                                        object = this.N(50);
                                                                                    }
                                                                                    try {
                                                                                        if (object == null || !(systemConfigurationOrchestrator.V() - (double)((CompressionUtility)object).h() - 3.0 > (double)systemConfigurationOrchestrator.e())) break block134;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                                                    }
                                                                                    bl = true;
                                                                                }
                                                                                try {
                                                                                    if (!this.F.s().booleanValue()) break block136;
                                                                                    if (object != null) break block137;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                                                }
                                                                                object = this.N(50);
                                                                            }
                                                                            try {
                                                                                if (object == null || !(systemConfigurationOrchestrator.V() - (double)(((CompressionUtility)object).h() + 1) >= (Double)this.e.J())) break block136;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                                            }
                                                                            bl2 = true;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (bl3 || bl) break block138;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                                                }
                                                                                if (bl2) break block138;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                                            }
                                                                            if (!this.v.b(this)) return;
                                                                            return;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                                        }
                                                                    }
                                                                    this.b = true;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (!this.b || this.N(10) == null) break block139;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                                    }
                                                                    this.Wk = true;
                                                                    return;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (!systemConfigurationOrchestrator.j()) break block140;
                                                                    if (this.A == null) break block141;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                                }
                                                                ++this.t;
                                                                break block141;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw DataMappingOrchestrator.a(customSystemException);
                                                            }
                                                        }
                                                        this.t = 0;
                                                    }
                                                    try {
                                                        try {
                                                            if (this.b) break block142;
                                                            this.A = null;
                                                            if (this.z == null) return;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                        }
                                                        this.z.X(true);
                                                        return;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (this.z == null || this.A == null) break block143;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw DataMappingOrchestrator.a(customSystemException);
                                                        }
                                                        if (!this.v(systemConfigurationOrchestrator)) break block143;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                    }
                                                    DataMappingOrchestrator.c("o", (Object)this, (long)-1630194630928901806L, (long)l);
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (this.A != null) break block144;
                                                    if (this.z == null) break block145;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                }
                                                this.z.X(true);
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DataMappingOrchestrator.a(customSystemException);
                                            }
                                        }
                                        this.z = null;
                                        this.d = 0;
                                        this.x = null;
                                        this.r = null;
                                    }
                                    try {
                                        try {
                                            try {
                                                if (this.x == null || this.r == null) break block146;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DataMappingOrchestrator.a(customSystemException);
                                            }
                                            if (this.n(this.x).u().equals(RecursiveNodeTree.V())) break block146;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DataMappingOrchestrator.a(customSystemException);
                                        }
                                        this.x = null;
                                        this.r = null;
                                        this.z = null;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DataMappingOrchestrator.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        if (this.t < 1 || this.A == null) break block147;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DataMappingOrchestrator.a(customSystemException);
                                    }
                                    if (!systemConfigurationOrchestrator.D()) break block147;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataMappingOrchestrator.a(customSystemException);
                                }
                                object = ExecutionOrchestrator.F();
                                double d2 = ((CryptographicTransformer)object).V();
                                bl2 = false;
                                int n = 0;
                                while (true) {
                                    block148: {
                                        try {
                                            if (n > 10) break;
                                            ExecutionOrchestrator.c(object);
                                            if (!(((CryptographicTransformer)object).V() < d2)) break block148;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DataMappingOrchestrator.a(customSystemException);
                                        }
                                        bl2 = true;
                                        break;
                                    }
                                    ++n;
                                }
                                try {
                                    if (!bl2) break block149;
                                    break block147;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataMappingOrchestrator.a(customSystemException);
                                }
                            }
                            try {
                                if (systemConfigurationOrchestrator.D()) {
                                    this.A = null;
                                    this.Wk = true;
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataMappingOrchestrator.a(customSystemException);
                            }
                        }
                        try {
                            if (!this.b) {
                                return;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataMappingOrchestrator.a(customSystemException);
                        }
                        if (this.A != null) {
                            block150: {
                                object = this.A.H().get(0);
                                try {
                                    if (!(((GeometricPositionCalculator)object).F + 1.0 > ((oQ)systemConfigurationOrchestrator.L()).c())) break block150;
                                    this.A = null;
                                    break block151;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataMappingOrchestrator.a(customSystemException);
                                }
                            }
                            try {
                                try {
                                    if (!(((GeometricPositionCalculator)object).F + 5.0 > ((oQ)systemConfigurationOrchestrator.L()).c()) || DataMappingOrchestrator.c("o", (Object)this, (long)-1630050683781762015L, (long)l) != false) break block151;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataMappingOrchestrator.a(customSystemException);
                                }
                                this.A = null;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataMappingOrchestrator.a(customSystemException);
                            }
                        }
                    }
                    try {
                        try {
                            if (this.A != null) break block152;
                            if (this.z == null) break block153;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataMappingOrchestrator.a(customSystemException);
                        }
                        this.z.X(true);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataMappingOrchestrator.a(customSystemException);
                    }
                }
                this.z = null;
                object = DataMappingOrchestrator.c("o", (Object)this, (long)-1630140331843580139L, (long)l);
                try {
                    if (object != null) {
                        this.A = object;
                        this.d = 0;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
            }
            try {
                if (this.A == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
            object = this.A.H();
            try {
                if (object.size() == 0) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
            try {
                try {
                    if (this.x != null && this.r != null) break block154;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
                this.z = null;
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
        }
        try {
            try {
                try {
                    if (!this.v.d(this)) return;
                    this.m.E(this);
                    if (this.z != null) return;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
                if (this.d >= object.size()) return;
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataMappingOrchestrator.a(customSystemException);
        }
        while (this.d < object.size()) {
            GeometricPositionCalculator geometricPositionCalculator = (GeometricPositionCalculator)object.get(this.d);
            if (DataMappingOrchestrator.c("o", (Object)this, (Object)geometricPositionCalculator, (long)-1630289621528518540L, (long)l) == false) {
                bl = this.n(geometricPositionCalculator.x()).u().s();
                try {
                    if (bl) {
                        ++this.d;
                        continue;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
            }
            if (this.x == null) return;
            bl = this.n(this.x).u().s();
            try {
                if (!bl) return;
                this.V = this.x;
                this.x = null;
                this.r = null;
                ++this.d;
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean x() {
        block34: {
            block35: {
                block31: {
                    block37: {
                        block36: {
                            var1_1 = DataMappingOrchestrator.bb ^ 63888826183778L;
                            var4_2 = ApplicationLifecycleManager.U();
                            var3_3 = EncryptionTransformer.r();
                            if (GeometryCalculator.C() != 13) break block36;
                            var5_4 = var4_2.L().h().V(0.0, -1.0, 0.0);
                            if (var3_3 != 0) break block37;
                        }
                        var5_4 = var4_2.L().V(0.0, -1.0, 0.0);
                    }
                    var6_5 = 0;
                    for (GeometricPositionCalculator var8_7 : this.A.H()) {
                        block29: {
                            var9_9 = var8_7.x();
                            var10_10 = oQ.E(var9_9.z(), var9_9.h(), var9_9.A(), var9_9.z() + 1, var9_9.h() + 1, var9_9.A() + 1);
                            try {
                                v0 = var5_4.e(var10_10);
                                if (var3_3 == 0) break block29;
                                if (v0) {
                                }
                                ** GOTO lbl27
                            }
                            catch (CustomSystemException v1) {
                                throw DataMappingOrchestrator.a(v1);
                            }
                            v0 = true;
                        }
                        var6_5 = (int)v0;
                        try {
                            if (var3_3 != 0) break;
lbl27:
                            // 2 sources

                            if (var3_3 != 0) continue;
                            break;
                        }
                        catch (CustomSystemException v2) {
                            throw DataMappingOrchestrator.a(v2);
                        }
                    }
                    var7_6 = ExecutionOrchestrator.F();
                    var8_8 = 0;
                    block19: while (true) {
                        v3 = var8_8;
                        block20: while (v3 <= 5) {
                            block32: {
                                block30: {
                                    try {
                                        try {
                                            v4 = var7_6;
                                            if (var3_3 == 0) break block30;
                                            ExecutionOrchestrator.c(v4);
                                            v5 = GeometryCalculator.C();
                                            if (var3_3 == 0) break block31;
                                        }
                                        catch (CustomSystemException v6) {
                                            throw DataMappingOrchestrator.a(v6);
                                        }
                                        if (v5 == 13) {
                                        }
                                        ** GOTO lbl54
                                    }
                                    catch (CustomSystemException v7) {
                                        throw DataMappingOrchestrator.a(v7);
                                    }
                                    var9_9 = var7_6.L().h().V(0.0, -1.0, 0.0);
                                    try {
                                        if (var3_3 != 0) break block32;
lbl54:
                                        // 2 sources

                                        v4 = var7_6;
                                    }
                                    catch (CustomSystemException v8) {
                                        throw DataMappingOrchestrator.a(v8);
                                    }
                                }
                                var9_9 = v4.L().V(0.0, -1.0, 0.0);
                            }
                            for (GeometricPositionCalculator var11_11 : this.A.H()) {
                                block33: {
                                    var12_12 = var11_11.x();
                                    var13_13 = oQ.E(var12_12.z(), var12_12.h(), var12_12.A(), var12_12.z() + 1, var12_12.h() + 1, var12_12.A() + 1);
                                    v3 = (int)var9_9.e(var13_13);
                                    if (var3_3 == 0) continue block20;
                                    try {
                                        if (var3_3 == 0) break block33;
                                        if (v3 != 0) {
                                        }
                                        ** GOTO lbl78
                                    }
                                    catch (CustomSystemException v9) {
                                        throw DataMappingOrchestrator.a(v9);
                                    }
                                    v10 = true;
                                }
                                var6_5 = v10;
                                try {
                                    if (var3_3 != 0) break;
lbl78:
                                    // 2 sources

                                    if (var3_3 != 0) continue;
                                    break;
                                }
                                catch (CustomSystemException v11) {
                                    throw DataMappingOrchestrator.a(v11);
                                }
                            }
                            ++var8_8;
                            if (var3_3 != 0) continue block19;
                        }
                        break;
                    }
                    v5 = var6_5;
                }
                try {
                    try {
                        if (var3_3 == 0) break block34;
                        if (v5 != 0) break block35;
                    }
                    catch (CustomSystemException v12) {
                        throw DataMappingOrchestrator.a(v12);
                    }
                    return false;
                }
                catch (CustomSystemException v13) {
                    throw DataMappingOrchestrator.a(v13);
                }
            }
            v5 = 1;
        }
        return (boolean)v5;
    }

    private boolean g(LightweightExecutionContext lightweightExecutionContext) {
        block7: {
            try {
                try {
                    if (!lightweightExecutionContext.Y() && !lightweightExecutionContext.C().Y()) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
        }
        ProtocolInteractionController protocolInteractionController = lightweightExecutionContext.C();
        try {
            if (!protocolInteractionController.B(ReflectionMetadataResolver.YX)) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataMappingOrchestrator.a(customSystemException);
        }
        return this.Y.q(lightweightExecutionContext);
    }

    private boolean v(SystemConfigurationOrchestrator systemConfigurationOrchestrator) {
        int n = this.X();
        try {
            if (n == -1) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataMappingOrchestrator.a(customSystemException);
        }
        try {
            if (this.B == -1) {
                this.B = systemConfigurationOrchestrator.l().v();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataMappingOrchestrator.a(customSystemException);
        }
        this.s(n);
        return true;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DataMappingOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataMappingOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static CompressionUtility A(DataMappingOrchestrator dataMappingOrchestrator) {
        return dataMappingOrchestrator.x;
    }

    private void n(CompressionUtility compressionUtility, Color color) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)2929);
        double d2 = ApplicationLifecycleManager.r().L();
        double d3 = ApplicationLifecycleManager.r().D();
        double d4 = ApplicationLifecycleManager.r().s();
        GL11.glTranslated((double)(-d2), (double)(-d3), (double)(-d4));
        GL11.glTranslated((double)compressionUtility.z(), (double)compressionUtility.h(), (double)compressionUtility.A());
        Color color2 = Color.yellow;
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)0.45f);
        this.s(oQ.E(0.0, 0.0, 0.0, 1.0, 1.0, 1.0));
        GL11.glColor4f((float)((float)color2.getRed() / 255.0f), (float)((float)color2.getGreen() / 255.0f), (float)((float)color2.getBlue() / 255.0f), (float)0.5f);
        this.D(oQ.E(0.0, 0.0, 0.0, 1.0, 1.0, 1.0));
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean L(GeometricPositionCalculator var1_1) {
        block55: {
            block54: {
                block53: {
                    block51: {
                        block52: {
                            var2_2 = DataMappingOrchestrator.bb ^ 112792348539748L;
                            var5_3 = var1_1.x();
                            var4_4 = EncryptionTransformer.r();
                            var6_5 = ApplicationLifecycleManager.U();
                            v0 = var6_5;
                            if (var4_4 == 0) break block51;
                            try {
                                block68: {
                                    if (!v0.Y()) break block52;
                                    break block68;
                                    catch (Exception v1) {
                                        throw DataMappingOrchestrator.a(v1);
                                    }
                                }
                                return false;
                            }
                            catch (Exception v2) {
                                throw DataMappingOrchestrator.a(v2);
                            }
                        }
                        v0 = ApplicationLifecycleManager.U();
                    }
                    var7_6 = v0.l();
                    var8_7 = ApplicationLifecycleManager.c();
                    var9_8 = ReflectionUtilityBroker.t(var5_3.z(), var5_3.h(), var5_3.A());
                    try {
                        v3 = var8_7.Y();
                        if (var4_4 == 0) break block53;
                        if (!v3) break block54;
                    }
                    catch (Exception v4) {
                        throw DataMappingOrchestrator.a(v4);
                    }
                    v3 = false;
                }
                return v3;
            }
            try {
                var10_9 = AdaptiveConfigurationManager.G();
                var11_11 = var10_9.length;
                var12_12 = 0;
                while (var12_12 < var11_11) {
                    block65: {
                        block61: {
                            block66: {
                                block67: {
                                    block81: {
                                        block80: {
                                            block59: {
                                                block64: {
                                                    block63: {
                                                        block62: {
                                                            block77: {
                                                                block60: {
                                                                    block58: {
                                                                        block56: {
                                                                            block57: {
                                                                                block73: {
                                                                                    block72: {
                                                                                        block71: {
                                                                                            block70: {
                                                                                                block69: {
                                                                                                    var13_13 = var10_9[var12_12];
                                                                                                    var14_14 = var9_8.I(var13_13);
                                                                                                    var15_15 = this.n(var14_14.K());
                                                                                                    var16_16 = 0;
                                                                                                    if (var4_4 == 0) break block55;
                                                                                                    if (this.V == null) break block57;
                                                                                                    break block69;
                                                                                                    catch (Exception v5) {
                                                                                                        throw DataMappingOrchestrator.a(v5);
                                                                                                    }
                                                                                                }
                                                                                                v6 = var14_14.o();
                                                                                                if (var4_4 == 0) break block56;
                                                                                                break block70;
                                                                                                catch (Exception v7) {
                                                                                                    throw DataMappingOrchestrator.a(v7);
                                                                                                }
                                                                                            }
                                                                                            if (v6 != this.V.z()) break block57;
                                                                                            break block71;
                                                                                            catch (Exception v8) {
                                                                                                throw DataMappingOrchestrator.a(v8);
                                                                                            }
                                                                                        }
                                                                                        v6 = var14_14.q();
                                                                                        if (var4_4 == 0) break block56;
                                                                                        break block72;
                                                                                        catch (Exception v9) {
                                                                                            throw DataMappingOrchestrator.a(v9);
                                                                                        }
                                                                                    }
                                                                                    if (v6 != this.V.h()) break block57;
                                                                                    break block73;
                                                                                    catch (Exception v10) {
                                                                                        throw DataMappingOrchestrator.a(v10);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block74: {
                                                                                        v6 = var14_14.j();
                                                                                        if (var4_4 == 0) break block56;
                                                                                        break block74;
                                                                                        catch (Exception v11) {
                                                                                            throw DataMappingOrchestrator.a(v11);
                                                                                        }
                                                                                    }
                                                                                    if (v6 != this.V.A()) break block57;
                                                                                }
                                                                                catch (Exception v12) {
                                                                                    throw DataMappingOrchestrator.a(v12);
                                                                                }
                                                                                var16_16 = 1;
                                                                            }
                                                                            v6 = var16_16;
                                                                        }
                                                                        if (var4_4 == 0) break block58;
                                                                        try {
                                                                            block75: {
                                                                                if (v6 != 0) break block59;
                                                                                break block75;
                                                                                catch (Exception v13) {
                                                                                    throw DataMappingOrchestrator.a(v13);
                                                                                }
                                                                            }
                                                                            v6 = (int)var15_15.u().equals(RecursiveNodeTree.V());
                                                                        }
                                                                        catch (Exception v14) {
                                                                            throw DataMappingOrchestrator.a(v14);
                                                                        }
                                                                    }
                                                                    if (var4_4 == 0) break block60;
                                                                    try {
                                                                        block76: {
                                                                            if (v6 != 0) break block61;
                                                                            break block76;
                                                                            catch (Exception v15) {
                                                                                throw DataMappingOrchestrator.a(v15);
                                                                            }
                                                                        }
                                                                        v6 = (int)var15_15.u().B();
                                                                    }
                                                                    catch (Exception v16) {
                                                                        throw DataMappingOrchestrator.a(v16);
                                                                    }
                                                                }
                                                                if (var4_4 == 0) break block62;
                                                                if (v6 != 0) break block61;
                                                                break block77;
                                                                catch (Exception v17) {
                                                                    throw DataMappingOrchestrator.a(v17);
                                                                }
                                                            }
                                                            try {
                                                                block78: {
                                                                    v18 = var15_15;
                                                                    if (var4_4 == 0) break block63;
                                                                    break block78;
                                                                    catch (Exception v19) {
                                                                        throw DataMappingOrchestrator.a(v19);
                                                                    }
                                                                }
                                                                v6 = (int)v18.u().s();
                                                            }
                                                            catch (Exception v20) {
                                                                throw DataMappingOrchestrator.a(v20);
                                                            }
                                                        }
                                                        if (v6 != 0) ** GOTO lbl145
                                                        try {
                                                            block79: {
                                                                if (var4_4 != 0) break block61;
                                                                break block79;
                                                                catch (Exception v21) {
                                                                    throw DataMappingOrchestrator.a(v21);
                                                                }
                                                            }
                                                            v18 = var15_15;
                                                        }
                                                        catch (Exception v22) {
                                                            throw DataMappingOrchestrator.a(v22);
                                                        }
                                                    }
                                                    var17_17 = v18.T(ApplicationLifecycleManager.c(), var14_14.o(), var14_14.q(), var14_14.j());
                                                    try {
                                                        v23 /* !! */  = var17_17.Y();
                                                        if (var4_4 == 0) break block64;
                                                        if (v23 /* !! */  == 0) break block59;
                                                    }
                                                    catch (Exception v24) {
                                                        throw DataMappingOrchestrator.a(v24);
                                                    }
                                                    v23 /* !! */  = (int)DataMappingOrchestrator.a("u", (int)14402, (long)(1875318348064981516L ^ var2_2));
                                                }
                                                TemporalMetadataResolver.x((String)DataMappingOrchestrator.c("E", (int)v23 /* !! */ , (long)7121157340513882768L, (long)var2_2));
                                                if (var4_4 != 0) break block61;
                                            }
                                            var17_17 = DataMappingOrchestrator.c("o", (Object)this, (Object)var13_13.z(), (Object)var14_14.K(), (long)7121062326891189197L, (long)var2_2);
                                            if (var4_4 == 0) break block65;
                                            if (var17_17 == null) break block61;
                                            break block80;
                                            catch (Exception v25) {
                                                throw DataMappingOrchestrator.a(v25);
                                            }
                                        }
                                        cfr_temp_0 = this.R - -999.0;
                                        v26 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                        if (var4_4 == 0) break block66;
                                        break block81;
                                        catch (Exception v27) {
                                            throw DataMappingOrchestrator.a(v27);
                                        }
                                    }
                                    try {
                                        block82: {
                                            if (v26 != false) break block67;
                                            break block82;
                                            catch (Exception v28) {
                                                throw DataMappingOrchestrator.a(v28);
                                            }
                                        }
                                        this.R = var6_5.q();
                                        this.n = var6_5.S();
                                    }
                                    catch (Exception v29) {
                                        throw DataMappingOrchestrator.a(v29);
                                    }
                                }
                                this.x = var1_1.x();
                                this.r = var14_14.K();
                                this.w = var13_13.z();
                                this.G = ContextualEventDispatcher.N(var17_17.K, var17_17.w, var17_17.O);
                                this.z = new Ni(this, this.G, var13_13);
                                this.z.L(10.0f);
                                this.z.N(0.0f);
                                this.z.i(true);
                                this.z.E(true);
                                this.z.F(true);
                                this.z.J(true);
                                ConfigurationCalibrator.b.W(this.z);
                                v26 = (double)true;
                            }
                            return (boolean)v26;
                        }
                        ++var12_12;
                    }
                    if (var4_4 != 0) continue;
                    break;
                }
            }
            catch (Exception var10_10) {
                TemporalMetadataResolver.W(var10_10);
            }
        }
        return false;
    }

    private void D(oQ oQ2) {
        GL11.glBegin((int)1);
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
    }

    private void Q() {
        block35: {
            CompressionUtility compressionUtility;
            int n;
            block34: {
                long l = bb ^ 0x652AAAD70005L;
                n = EncryptionTransformer.r();
                try {
                    try {
                        compressionUtility = this.x;
                        if (n == 0) break block34;
                        if (compressionUtility == null) break block35;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataMappingOrchestrator.a(customSystemException);
                    }
                    compressionUtility = this.r;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
            }
            if (compressionUtility != null) {
                ConnectionPoolOrchestrator1192 connectionPoolOrchestrator1192;
                block44: {
                    block45: {
                        ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11922;
                        block42: {
                            int n2;
                            block41: {
                                NetworkPacketInterceptor1107 networkPacketInterceptor1107;
                                block40: {
                                    int n3;
                                    CompressionUtility compressionUtility2;
                                    block39: {
                                        block38: {
                                            int n4;
                                            block36: {
                                                block37: {
                                                    networkPacketInterceptor1107 = ApplicationLifecycleManager.u();
                                                    try {
                                                        n4 = networkPacketInterceptor1107.q().equals(ObjectValidator.Y());
                                                        if (n == 0) break block36;
                                                        if (n4 != 0) break block37;
                                                    }
                                                    catch (CustomSystemException customSystemException) {
                                                        throw DataMappingOrchestrator.a(customSystemException);
                                                    }
                                                    return;
                                                }
                                                n4 = networkPacketInterceptor1107.j();
                                            }
                                            AdaptiveConfigurationManager adaptiveConfigurationManager = AdaptiveConfigurationManager.d(n4);
                                            compressionUtility2 = new CompressionUtility(networkPacketInterceptor1107.p() + adaptiveConfigurationManager.n().o(), networkPacketInterceptor1107.b() + adaptiveConfigurationManager.n().q(), networkPacketInterceptor1107.m() + adaptiveConfigurationManager.n().j());
                                            try {
                                                try {
                                                    int n3 = networkPacketInterceptor1107.p();
                                                    n3 = this.r.z();
                                                    if (n == 0) break block38;
                                                    if (n2 != n3) break block35;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                }
                                                int n3 = networkPacketInterceptor1107.b();
                                                n3 = this.r.h();
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DataMappingOrchestrator.a(customSystemException);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (n == 0) break block39;
                                                    if (n2 != n3) break block35;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw DataMappingOrchestrator.a(customSystemException);
                                                }
                                                n2 = networkPacketInterceptor1107.m();
                                                if (n == 0) break block40;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DataMappingOrchestrator.a(customSystemException);
                                            }
                                            n3 = this.r.A();
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DataMappingOrchestrator.a(customSystemException);
                                        }
                                    }
                                    try {
                                        if (n2 != n3) break block35;
                                        n2 = compressionUtility2.equals(this.x) ? 1 : 0;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DataMappingOrchestrator.a(customSystemException);
                                    }
                                }
                                try {
                                    try {
                                        if (n == 0) break block41;
                                        if (n2 == 0) break block35;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DataMappingOrchestrator.a(customSystemException);
                                    }
                                    double d2 = ((oQ)ApplicationLifecycleManager.U().L()).c() - (double)(networkPacketInterceptor1107.b() + 1);
                                    n2 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw DataMappingOrchestrator.a(customSystemException);
                                }
                            }
                            try {
                                if (n2 < 0) {
                                    this.A = null;
                                    return;
                                }
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataMappingOrchestrator.a(customSystemException);
                            }
                            ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11923 = ApplicationLifecycleManager.N().G();
                            try {
                                block43: {
                                    try {
                                        try {
                                            try {
                                                connectionPoolOrchestrator11922 = connectionPoolOrchestrator11923;
                                                if (n == 0) break block42;
                                                if (connectionPoolOrchestrator11922.b()) break block43;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw DataMappingOrchestrator.a(customSystemException);
                                            }
                                            connectionPoolOrchestrator1192 = connectionPoolOrchestrator11923;
                                            if (n == 0) break block44;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw DataMappingOrchestrator.a(customSystemException);
                                        }
                                        if (!connectionPoolOrchestrator1192.k()) break block45;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw DataMappingOrchestrator.a(customSystemException);
                                    }
                                }
                                connectionPoolOrchestrator11922 = connectionPoolOrchestrator11923;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataMappingOrchestrator.a(customSystemException);
                            }
                        }
                        ConnectionPoolOrchestrator1192.d(connectionPoolOrchestrator11922, false);
                    }
                    connectionPoolOrchestrator1192 = ApplicationLifecycleManager.N().D();
                }
                ConnectionPoolOrchestrator1192 connectionPoolOrchestrator11924 = connectionPoolOrchestrator1192;
                connectionPoolOrchestrator11924.X(1);
                this.l = true;
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/As" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void s(oQ oQ2) {
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.f(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.v());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.c(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.R());
        GL11.glVertex3d((double)oQ2.F(), (double)oQ2.P(), (double)oQ2.v());
        GL11.glEnd();
    }

    static TransactionCorrelationEngine j(DataMappingOrchestrator dataMappingOrchestrator, CompressionUtility compressionUtility) {
        return dataMappingOrchestrator.n(compressionUtility);
    }

    @Override
    public void h() {
        GraphicalRenderingController.D(CryptographicContextManager567.class).r(this);
    }

    private int X() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext object = ApplicationLifecycleManager.U().l().F(i);
            try {
                try {
                    if (!object.r() || !this.g(object)) continue;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
                arrayList.add(i);
                continue;
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
        }
        try {
            if (arrayList.isEmpty()) {
                return -1;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataMappingOrchestrator.a(customSystemException);
        }
        for (String string : this.Z) {
            for (Integer n : arrayList) {
                try {
                    if (!ApplicationLifecycleManager.U().l().F(n).g().contains(string)) continue;
                    return n;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
            }
        }
        return (Integer)arrayList.get(0);
    }

    private void s(int n) {
        ApplicationLifecycleManager.U().l().A(n);
    }

    @Override
    public void v() {
        try {
            if (this.z != null) {
                this.z.X(true);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataMappingOrchestrator.a(customSystemException);
        }
        this.z = null;
        this.v.b(this);
        this.d = 0;
        this.x = null;
        this.r = null;
        this.A = null;
        this.b = false;
        this.m.m(this);
        GraphicalRenderingController.D(CryptographicContextManager567.class).v(this);
    }

    static ConnectionLifecycleManager t(DataMappingOrchestrator dataMappingOrchestrator) {
        return dataMappingOrchestrator.v;
    }

    @DataExchangeProtocol2090
    public void Q(EventDispatchRegistry2111 eventDispatchRegistry2111) {
        block14: {
            long l = bb ^ 0x7A670F01440AL;
            SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
            try {
                if (systemConfigurationOrchestrator.Y()) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
            try {
                this.N(10);
                if (this.A == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
            try {
                try {
                    if (this.G == null || this.G.Y()) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
                if (this.r == null) break block14;
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
            CallSite callSite = DataMappingOrchestrator.c("o", (Object)this, (Object)this.w, (Object)this.r, (long)2142873978201140387L, (long)l);
            try {
                try {
                    if (callSite == null || this.z == null) break block14;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
                this.z.F(((kg)((Object)callSite)).l());
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'M' || c == 'm' || c == 'F' || c == '\u00d9') {
                field = DataMappingOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'm' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataMappingOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'J' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public DataMappingOrchestrator() {
        long l = bb ^ 0x8B6D9EBEDL;
        super(a.cs((int)DataMappingOrchestrator.a("u", (int)14578, (long)(0x604DA3D768D1D211L ^ l))), (int)DataMappingOrchestrator.a("u", (int)16993, (long)(0x459F558E8278A8A2L ^ l)), RecursiveNodeGraph.K, a.cs((int)DataMappingOrchestrator.a("u", (int)4969, (long)(0x3CFA18B3AB3479C1L ^ l))));
        this.T = AuthenticationStateTracker.R(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)15454, (long)(0x63421890AA12D69CL ^ l)), (long)-5595150507158470119L, (long)l)), true, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)6904, (long)(0x56342713BEEB703CL ^ l)), (long)-5595150507158470119L, (long)l)));
        this.N = AuthenticationStateTracker.R(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)12284, (long)(0x29DA36C6962E4533L ^ l)), (long)-5595150507158470119L, (long)l)), true, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)25189, (long)(0xD6995B836E0088BL ^ l)), (long)-5595150507158470119L, (long)l)));
        this.F = AuthenticationStateTracker.R(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)32452, (long)(0x4D0963AFA1329479L ^ l)), (long)-5595150507158470119L, (long)l)), false, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)17079, (long)(0x557FF45F2002855L ^ l)), (long)-5595150507158470119L, (long)l)));
        this.e = NumericPrecisionTransformer.N(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)18569, (long)(0x7BA750D7D7A22233L ^ l)), (long)-5595150507158470119L, (long)l)), (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)1091, (long)(0x1B6A8C4C4D316EF4L ^ l)), (long)-5595150507158470119L, (long)l)), "", 3.0, 6.0, 10.0, 1.0);
        this.X = AuthenticationStateTracker.w(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)10437, (long)(0x5E0FE4DAC023C20EL ^ l)), (long)-5595150507158470119L, (long)l)), false);
        this.K = AuthenticationStateTracker.R(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)15681, (long)(0x1981342506B65799L ^ l)), (long)-5595150507158470119L, (long)l)), true, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)10883, (long)(0x78D1210187FFC078L ^ l)), (long)-5595150507158470119L, (long)l)));
        this.j = AuthenticationStateTracker.R(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)7253, (long)(0x4CC66E1A8DBAF68BL ^ l)), (long)-5595150507158470119L, (long)l)), true, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)3434, (long)(0x78E6CA56CFD9E787L ^ l)), (long)-5595150507158470119L, (long)l)));
        this.o = AuthenticationStateTracker.R(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)7857, (long)(0x486CB18FB905747BL ^ l)), (long)-5595150507158470119L, (long)l)), true, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)20855, (long)(0x4D1D883405DE3BABL ^ l)), (long)-5595150507158470119L, (long)l)));
        this.O = Arrays.asList(new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)7695, (long)(0x348A80AF33C74A1L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)24923, (long)(0x1FDC649DE44F0BBEL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)17757, (long)(0x2A56568CD8202FEBL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)32219, (long)(0x5436371C124D1776L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)9051, (long)(0x607A5A40447CC9E2L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)22847, (long)(0x60D70E5E7A5EB38EL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)838, (long)(0x42DE67A30945E988L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)3448, (long)(0x46EA69CFEA88E7ABL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)1814, (long)(0x278CCE69064CEDFAL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)1202, (long)(0x3DC2B23D9EF56E48L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)22705, (long)(0x6357855D5A48325EL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)1167, (long)(0x51FBD35C59B06E3CL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)17563, (long)(0xCAC3546DF7A2E73L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)19493, (long)(0x421C80368DBF26F1L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)13044, (long)(0x790D1DB1C7A85800L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)15052, (long)(0x84BDD530017D01AL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)8641, (long)(0x6BFD9F90738FCB07L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)10186, (long)(0x16B657EF5B70CD38L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)2197, (long)(0x4EC70C794C0EE273L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)29770, (long)(0x5939514BF25F9EF2L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)19416, (long)(0x663C7AE6F7D82166L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)14935, (long)(0x3B7164EEB403D0E5L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)29558, (long)(0xC5B15478DD219BAL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)9833, (long)(0x2ACEC4F7A7B7CCB8L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)19468, (long)(0x15C7C9DCE92426F9L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)11918, (long)(0x4214AAED12BC4470L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)29561, (long)(0x233C62D2B1399989L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)2486, (long)(0x4B87C6FB7B97E30AL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)1629, (long)(0x303E0CCFC10B6CF4L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)27528, (long)(0x7059965D165E014DL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)13166, (long)(0x533733F0E54659C2L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)23153, (long)(0x12ED38233DD0B095L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)14770, (long)(0x3EB1BE77E2E5307L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)2888, (long)(0x579B9DDAEC5DE1F3L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)22064, (long)(0x79FB54EE42E0BCF9L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)18309, (long)(0x2A1BAFDF68AC2D7AL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)24972, (long)(0x23AEC3353B840B56L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)3035, (long)(0x63DFCF7EF75613CL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)16381, (long)(0x708B08CF7F9ED53CL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)24401, (long)(0x64A2959591F135F6L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)15740, (long)(0x776753DE2065D7B1L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)30242, (long)(0x5B156EE2D85E1CE2L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)12532, (long)(0x56637AF4A50FDA24L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)27987, (long)(0x2006F98FB52287B9L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)8608, (long)(0x3E25C7AED57B4B58L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)25587, (long)(0x7D053C04491895CL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)11149, (long)(0x510BB87EBB214156L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)5358, (long)(0x59C113E9623A7E3CL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)25129, (long)(0x51843E7BB9788C8L ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)18700, (long)(0x291CA84F4E8BA3BCL ^ l)), (long)-5595150507158470119L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)5643, (long)(0x36AB639E1482FCA1L ^ l)), (long)-5595150507158470119L, (long)l))));
        this.Y = ColorPaletteManager.o(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)3703, (long)(0x3D436E3A6C90648AL ^ l)), (long)-5595150507158470119L, (long)l)), (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)20398, (long)(0x5ACC5A90FDB3A573L ^ l)), (long)-5595150507158470119L, (long)l)), ColorPaletteManager.g, this.O);
        this.h = AuthenticationStateTracker.R(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)2361, (long)(0x2361BCD7D1AAE3EEL ^ l)), (long)-5595150507158470119L, (long)l)), false, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)25645, (long)(0x4676C7765A4D8EF4L ^ l)), (long)-5595150507158470119L, (long)l)));
        this.L = ColorPaletteManager.r(this, (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)18751, (long)(0x5ECF0E34FE3DA3CEL ^ l)), (long)-5595150507158470119L, (long)l)), (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)21255, (long)(0x7E03A803D509B9FEL ^ l)), (long)-5595150507158470119L, (long)l)), ColorPaletteManager.U, new RecursiveNodeTreeBuilder((String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)14352, (long)(0x212BBE174A652BBL ^ l)), (long)-5595150507158470119L, (long)l))));
        this.Z = new ArrayList<String>(Arrays.asList(DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)14179, (long)(0x6710BCCC8C045D90L ^ l)), (long)-5595150507158470119L, (long)l), DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)19563, (long)(0x5B65B071D47EA680L ^ l)), (long)-5595150507158470119L, (long)l), DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)8785, (long)(0x269BA0949B9C48ADL ^ l)), (long)-5595150507158470119L, (long)l), DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)4954, (long)(0x1AEA4CD02188F9B3L ^ l)), (long)-5595150507158470119L, (long)l), DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)9381, (long)(0x6879A761456CE45L ^ l)), (long)-5595150507158470119L, (long)l), DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)17409, (long)(0x44D90080AE972EF6L ^ l)), (long)-5595150507158470119L, (long)l), DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)17927, (long)(0x109A370D278CACD8L ^ l)), (long)-5595150507158470119L, (long)l)));
        this.v = ConfigurationRegistry.O;
        this.m = ConfigurationRegistry.l;
        this.r = null;
        this.l = false;
        this.b = false;
        this.B = -1;
        this.R = -999.0;
        this.n = -999.0;
        this.P = new CryptographicCipherProvider(20);
        this.o.l(this.Y);
        this.h.l(this.L);
        this.F.l(this.e);
        this.N(this.T, this.N, this.F, this.e, this.X, this.j, this.K, this.o, this.Y, this.h, this.L);
        this.v.y(this, 10);
    }

    private boolean E() {
        boolean bl;
        block11: {
            block10: {
                SystemConfigurationOrchestrator systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                try {
                    if (systemConfigurationOrchestrator.Y()) {
                        return false;
                    }
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
                try {
                    block9: {
                        try {
                            try {
                                if (systemConfigurationOrchestrator.G() != 0.0 || systemConfigurationOrchestrator.x() != 0.0) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataMappingOrchestrator.a(customSystemException);
                            }
                            if (systemConfigurationOrchestrator.o() == 0.0) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataMappingOrchestrator.a(customSystemException);
                        }
                    }
                    bl = true;
                    break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public double e(double d2, boolean bl) {
        long l = bb ^ 0x5FA009D63159L;
        try {
            if (!this.X.s().booleanValue()) {
                return 0.0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataMappingOrchestrator.a(customSystemException);
        }
        int n = this.j();
        Color color = new Color(255, 20, 20);
        if (n >= 32) {
            color = new Color(2, 190, 58);
        } else if (n >= 16) {
            color = new Color(255, 249, 18);
        }
        E8 e8 = ApplicationLifecycleManager.X();
        String string = " \u00a77(" + this.O() + (String)((Object)DataMappingOrchestrator.c("E", (int)DataMappingOrchestrator.a("u", (int)23978, (long)(0x3863B5DFA23DEDD6L ^ l)), (long)7561077489837463725L, (long)l));
        String string2 = n + string;
        double d3 = e8.L(string);
        double d4 = (double)e8.L(string2) - d3;
        double d5 = (float)ApplicationLifecycleManager.e() / 4.0f - (float)AdaptiveComputationEngine.j(d4 / 2.0);
        if (!bl) {
            string2 = String.valueOf(n);
        }
        e8.J(string2, d5, d2, color);
        return e8.B(string2);
    }

    private static Field c(long l, long l2) {
        int n = DataMappingOrchestrator.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = DataMappingOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataMappingOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataMappingOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    DataMappingOrchestrator.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataMappingOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataMappingOrchestrator.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataMappingOrchestrator.b(780847717886645L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataMappingOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataMappingOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private int j() {
        int n;
        AssetLoadBalancer assetLoadBalancer;
        block23: {
            SystemConfigurationOrchestrator systemConfigurationOrchestrator;
            block25: {
                block22: {
                    systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                    assetLoadBalancer = systemConfigurationOrchestrator.l();
                    try {
                        try {
                            if (!assetLoadBalancer.Y() && !systemConfigurationOrchestrator.Y()) break block22;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataMappingOrchestrator.a(customSystemException);
                        }
                        return 0;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw DataMappingOrchestrator.a(customSystemException);
                    }
                }
                n = 0;
                try {
                    block24: {
                        try {
                            try {
                                if (!this.h.s().booleanValue()) break block23;
                                if (systemConfigurationOrchestrator.a().Y()) break block24;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw DataMappingOrchestrator.a(customSystemException);
                            }
                            if (!systemConfigurationOrchestrator.a().C().Y()) break block25;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw DataMappingOrchestrator.a(customSystemException);
                        }
                    }
                    return 0;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataMappingOrchestrator.a(customSystemException);
                }
            }
            try {
                if (!this.F(systemConfigurationOrchestrator.a())) {
                    return 0;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
            try {
                if (!this.g(systemConfigurationOrchestrator.a())) {
                    return 0;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
            return systemConfigurationOrchestrator.a().J();
        }
        for (int i = 0; i < 9; ++i) {
            LightweightExecutionContext lightweightExecutionContext = assetLoadBalancer.F(i);
            try {
                if (lightweightExecutionContext.Y()) {
                    continue;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw DataMappingOrchestrator.a(customSystemException);
            }
            if (this.g(lightweightExecutionContext)) {
                n += lightweightExecutionContext.J();
                continue;
            }
            for (String string : this.Z) {
                if (!lightweightExecutionContext.g().contains(string)) continue;
                n += lightweightExecutionContext.J();
            }
        }
        return n;
    }

    static CompressionUtility w(DataMappingOrchestrator dataMappingOrchestrator) {
        return dataMappingOrchestrator.r;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataMappingOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Integer lambda$getClosestBlock$1(DataTransmissionManager2384 dataTransmissionManager2384, CompressionUtility compressionUtility) {
        return new CacheMemoryManager(compressionUtility.z(), compressionUtility.h(), compressionUtility.A(), dataTransmissionManager2384.F(), ((oQ)dataTransmissionManager2384.L()).c(), dataTransmissionManager2384.B()).H().size();
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

    private static Double lambda$getClosestBlock$0(DataTransmissionManager2384 dataTransmissionManager2384, CompressionUtility compressionUtility) {
        return AdaptiveComputationEngine.T(dataTransmissionManager2384.F(), ((oQ)dataTransmissionManager2384.L()).c(), dataTransmissionManager2384.B(), compressionUtility.z(), compressionUtility.h(), compressionUtility.A());
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
                n3 = 11;
                break;
            }
            case 1: {
                n3 = 19;
                break;
            }
            case 2: {
                n3 = 51;
                break;
            }
            case 3: {
                n3 = 30;
                break;
            }
            case 4: {
                n3 = 54;
                break;
            }
            case 5: {
                n3 = 2;
                break;
            }
            case 6: {
                n3 = 27;
                break;
            }
            case 7: {
                n3 = 38;
                break;
            }
            case 8: {
                n3 = 22;
                break;
            }
            case 9: {
                n3 = 29;
                break;
            }
            case 10: {
                n3 = 59;
                break;
            }
            case 11: {
                n3 = 25;
                break;
            }
            case 12: {
                n3 = 14;
                break;
            }
            case 13: {
                n3 = 8;
                break;
            }
            case 14: {
                n3 = 16;
                break;
            }
            case 15: {
                n3 = 50;
                break;
            }
            case 16: {
                n3 = 42;
                break;
            }
            case 17: {
                n3 = 47;
                break;
            }
            case 18: {
                n3 = 0;
                break;
            }
            case 19: {
                n3 = 4;
                break;
            }
            case 20: {
                n3 = 24;
                break;
            }
            case 21: {
                n3 = 37;
                break;
            }
            case 22: {
                n3 = 5;
                break;
            }
            case 23: {
                n3 = 36;
                break;
            }
            case 24: {
                n3 = 56;
                break;
            }
            case 25: {
                n3 = 28;
                break;
            }
            case 26: {
                n3 = 45;
                break;
            }
            case 27: {
                n3 = 63;
                break;
            }
            case 28: {
                n3 = 9;
                break;
            }
            case 29: {
                n3 = 41;
                break;
            }
            case 30: {
                n3 = 62;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 32: {
                n3 = 10;
                break;
            }
            case 33: {
                n3 = 26;
                break;
            }
            case 34: {
                n3 = 21;
                break;
            }
            case 35: {
                n3 = 61;
                break;
            }
            case 36: {
                n3 = 23;
                break;
            }
            case 37: {
                n3 = 17;
                break;
            }
            case 38: {
                n3 = 53;
                break;
            }
            case 39: {
                n3 = 12;
                break;
            }
            case 40: {
                n3 = 34;
                break;
            }
            case 41: {
                n3 = 58;
                break;
            }
            case 42: {
                n3 = 57;
                break;
            }
            case 43: {
                n3 = 49;
                break;
            }
            case 44: {
                n3 = 46;
                break;
            }
            case 45: {
                n3 = 1;
                break;
            }
            case 46: {
                n3 = 15;
                break;
            }
            case 47: {
                n3 = 7;
                break;
            }
            case 48: {
                n3 = 35;
                break;
            }
            case 49: {
                n3 = 39;
                break;
            }
            case 50: {
                n3 = 18;
                break;
            }
            case 51: {
                n3 = 40;
                break;
            }
            case 52: {
                n3 = 44;
                break;
            }
            case 53: {
                n3 = 60;
                break;
            }
            case 54: {
                n3 = 48;
                break;
            }
            case 55: {
                n3 = 31;
                break;
            }
            case 56: {
                n3 = 32;
                break;
            }
            case 57: {
                n3 = 33;
                break;
            }
            case 58: {
                n3 = 6;
                break;
            }
            case 59: {
                n3 = 55;
                break;
            }
            case 60: {
                n3 = 13;
                break;
            }
            case 61: {
                n3 = 43;
                break;
            }
            case 62: {
                n3 = 3;
                break;
            }
            default: {
                n3 = 52;
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
        DataMappingOrchestrator.lb[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataMappingOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DataMappingOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

