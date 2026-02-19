/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.crypto.adaptive;

import a.KB;
import a.TR;
import a.Ya;
import a.a;
import com.app.config.management.ConfigurationRegistry;
import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.configuration.management.ConfigurationParameterController;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.data.compression.CompressionUtility;
import com.data.transformation.AbstractDataTransformer;
import com.event.orchestration.ClusterEventOrchestrator;
import com.exception.system.CustomSystemException;
import com.financial.processing.TransactionCorrelationEngine;
import com.financial.transaction.TransactionProcessor1409;
import com.game.configuration.GameVersionEnumerator;
import com.graph.structure.RecursiveNodeGraph;
import com.graphics.palette.ColorPaletteManager;
import com.math.computation.NumericComputationFramework;
import com.metrics.analysis.DimensionalMetricsTracker;
import com.network.configuration.NetworkConfigManager;
import com.network.core.NetworkConnectionOrchestrator;
import com.network.protocol.NetworkPacketInterceptor1107;
import com.network.protocol.NetworkProtocolDecoder345;
import com.network.protocol.NetworkProtocolNegotiator;
import com.numeric.precision.NumericPrecisionTransformer;
import com.runtime.context.ContextualExecutionFramework;
import com.runtime.reflection.ReflectionUtilityBroker;
import com.security.crypto.CryptographicSecurityProvider;
import com.security.interception.CryptoResourceInterceptor;
import com.security.resolution.CryptoContextResolver520;
import com.structure.tree.RecursiveNodeTreeBuilder;
import com.system.configuration.ConfigurationCalibrator;
import com.system.configuration.GenericConfigurationResolver;
import com.system.configuration.SystemConfigurationOrchestrator;
import com.temporal.metadata.TemporalMetadataResolver;
import com.text.normalization.CharsetNormalizationEnum;
import com.text.processing.PatternMatchingOrchestrator;
import com.util.numeric.NumericFormattingUtility;
import java.lang.invoke.CallSite;
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
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
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
public class AdaptiveCryptoNegotiator
extends ContextualExecutionFramework {
    @Nullable
    private NumericComputationFramework N;
    @Nullable
    Ya b;
    private static final long[] fb;
    @NotNull
    final NetworkConfigManager o;
    static final boolean r = false;
    @Nullable
    private ConfigurationParameterController t;
    @Nullable
    private CompressionUtility Y;
    private static final Map hb;
    final AuthenticationStateTracker R;
    private CharsetNormalizationEnum e;
    final AuthenticationStateTracker P;
    @NotNull
    private final NetworkConfigManager d;
    final ColorPaletteManager h;
    private boolean F;
    final NumericPrecisionTransformer L;
    private double n;
    final Queue<DimensionalMetricsTracker> m;
    private static final long bb;
    private final NumericPrecisionTransformer K;
    @Nullable
    private CompressionUtility X;
    private final AuthenticationStateTracker B;
    private static final Object[] kb;
    private static final Integer[] gb;
    private final NumericFormattingUtility G;
    private final AuthenticationStateTracker l;
    final AuthenticationStateTracker z;
    private double w;
    @Nullable
    Ya v;
    private final AuthenticationStateTracker A;
    final NetworkProtocolDecoder345 V;
    private static final String[] lb;
    @NotNull
    private final NetworkConfigManager j;
    private boolean T;
    final AuthenticationStateTracker O;
    @NotNull
    final NetworkConfigManager x;
    private final CryptoContextResolver520 Z;

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void M(String string, StackTraceElement stackTraceElement) {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AdaptiveCryptoNegotiator.bb = MultiContainerRegistry.a(-2328546759884165432L, 1989174631155129414L, MethodHandles.lookup().lookupClass()).a(216335689865695L);
                AdaptiveCryptoNegotiator.kb = new Object[5];
                AdaptiveCryptoNegotiator.lb = new String[5];
                AdaptiveCryptoNegotiator.a();
                AdaptiveCryptoNegotiator.hb = new HashMap<K, V>(13);
                var0 = AdaptiveCryptoNegotiator.bb ^ 33078820190552L;
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
                var8_3 = new long[45];
                var5_4 = 0;
                var6_5 = "F\u00bfS\u001f\u00aaq$\u00bf\u00e9\r\u00e4\u00a4b:\u00cf\u007f<\u0086\u00c2\u00db\u00d1\u00c1\u0003\u00c79O\u00d7\u00c7\u00f4\u00d8\u00cb3}\nk~\u0099\u0014fJ\u0004`\u00f9\u0002\u00ddJ\tSk\u00b7\u0080\u00c1\u0019,\u009dY7\u00ebT0 \u000ba\u00b0\u0094\u00db`\u00c6W\u001f\u00bd-uK\u00f1x\u00cc\u008d\u00b8\u0099n\u0007`\u00e6,\u0094\u0086\u00d0\u0019\u00b6\u00041\u0096\u00cbNkE\u0002\u0086\u00ac\u00c5s\u00bc\u00b6\u0087.\u0002\u00eej\u000b\u00a3\u00b4\u009aZ\u0099\u00b7\u009c\u007f^\u00e6'9\u0091\u00a4^\u00e2!}\u0090\u0003V\u00f8\u00bc-\u00111\u00eeWdcI\u00b0\u007fO\u00f2\u0018\u00f0L\u00b4\u00da@/\u0096\u00d3[\n\u00det\u00c3\u009b\u00146\u00f7DYq?-\u00ba\u00f3Q\u009b\u00d3\u008dHl4\u0082\u008f\u00d1\u00c3\" \u00fc)\u00eaE\u0080&\u009fM\u001c\u0003\u0099X\u00c5sd\u00c39\u009e\u00a9\u00bc\u0080g\u00ef\u00f5W\u00d7\u00bd\u0000|\fp\u00c41\u00e3\u00e8\u00aa\u00959\u00dax\u00b2k6\u009e\u00f34`\u00a8\u00daJg\u00c2\u00d4\u00f1q'\u00e4 \u00f0\u00bc\u008f\u0010:\u007f\u009e\u00e4?\u00bd\u00b9\u00b9\n\u00914\u00ed\u00a7\t\u0084_\u001b\u00e9@\u00e6\u0094\f\f0E\u00aa\u00adyr\u008b\u0004sM\u00d2(\u00cd,\u008a/\u00c84\u00b9G\u001a\u000b\u00d1J\u00d1fG\u00e7-[\u007f\u0096\u00e6\u00ecmd\u00f4\u00d08\u00af`\u0094\u00b1f}]\u00dblQ\u0082)\u00c0Q\u0094M\u00ec\u00dck\u0006\u00ec\u00d6k^G\n\u009d\u0006\u00f2$\u0087\u00bd\u00f2\u00f1V%\u0083";
                var7_6 = "F\u00bfS\u001f\u00aaq$\u00bf\u00e9\r\u00e4\u00a4b:\u00cf\u007f<\u0086\u00c2\u00db\u00d1\u00c1\u0003\u00c79O\u00d7\u00c7\u00f4\u00d8\u00cb3}\nk~\u0099\u0014fJ\u0004`\u00f9\u0002\u00ddJ\tSk\u00b7\u0080\u00c1\u0019,\u009dY7\u00ebT0 \u000ba\u00b0\u0094\u00db`\u00c6W\u001f\u00bd-uK\u00f1x\u00cc\u008d\u00b8\u0099n\u0007`\u00e6,\u0094\u0086\u00d0\u0019\u00b6\u00041\u0096\u00cbNkE\u0002\u0086\u00ac\u00c5s\u00bc\u00b6\u0087.\u0002\u00eej\u000b\u00a3\u00b4\u009aZ\u0099\u00b7\u009c\u007f^\u00e6'9\u0091\u00a4^\u00e2!}\u0090\u0003V\u00f8\u00bc-\u00111\u00eeWdcI\u00b0\u007fO\u00f2\u0018\u00f0L\u00b4\u00da@/\u0096\u00d3[\n\u00det\u00c3\u009b\u00146\u00f7DYq?-\u00ba\u00f3Q\u009b\u00d3\u008dHl4\u0082\u008f\u00d1\u00c3\" \u00fc)\u00eaE\u0080&\u009fM\u001c\u0003\u0099X\u00c5sd\u00c39\u009e\u00a9\u00bc\u0080g\u00ef\u00f5W\u00d7\u00bd\u0000|\fp\u00c41\u00e3\u00e8\u00aa\u00959\u00dax\u00b2k6\u009e\u00f34`\u00a8\u00daJg\u00c2\u00d4\u00f1q'\u00e4 \u00f0\u00bc\u008f\u0010:\u007f\u009e\u00e4?\u00bd\u00b9\u00b9\n\u00914\u00ed\u00a7\t\u0084_\u001b\u00e9@\u00e6\u0094\f\f0E\u00aa\u00adyr\u008b\u0004sM\u00d2(\u00cd,\u008a/\u00c84\u00b9G\u001a\u000b\u00d1J\u00d1fG\u00e7-[\u007f\u0096\u00e6\u00ecmd\u00f4\u00d08\u00af`\u0094\u00b1f}]\u00dblQ\u0082)\u00c0Q\u0094M\u00ec\u00dck\u0006\u00ec\u00d6k^G\n\u009d\u0006\u00f2$\u0087\u00bd\u00f2\u00f1V%\u0083".length();
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
                    var6_5 = "\u00156i\u00a3\u008b\u0091\u00cdmf\f\u009f\u00f0\u0002\u0096\u007f|";
                    var7_6 = "\u00156i\u00a3\u008b\u0091\u00cdmf\f\u009f\u00f0\u0002\u0096\u007f|".length();
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
        AdaptiveCryptoNegotiator.fb = var8_3;
        AdaptiveCryptoNegotiator.gb = new Integer[45];
    }

    void Q(String string) {
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AdaptiveCryptoNegotiator.a(l, l2);
            object = kb[n];
            try {
                if (!(object instanceof String)) break block2;
                AdaptiveCryptoNegotiator.kb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void N() {
        try {
            this.F = false;
            this.j.m();
            this.o.m();
            this.d.m();
            this.m.clear();
            if (this.v != null) {
                this.V(this.v, true, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCryptoNegotiator.a(customSystemException);
        }
        try {
            if (this.b != null) {
                this.V(this.b, true, false);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCryptoNegotiator.a(customSystemException);
        }
        this.v = null;
        this.b = null;
        this.t = null;
        this.T = false;
        this.X = null;
        this.N = null;
        this.Y = null;
        this.e = CharsetNormalizationEnum.IDLE;
        this.n = 0.0;
        this.w = 0.0;
        this.x.m();
    }

    private NumericComputationFramework g(SystemConfigurationOrchestrator systemConfigurationOrchestrator, boolean bl) {
        block4: {
            try {
                try {
                    if (!bl && this.N != null) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                }
                this.N = new NumericComputationFramework(systemConfigurationOrchestrator);
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCryptoNegotiator.a(customSystemException);
            }
        }
        return this.N;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
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

    private void V(Ya ya, boolean bl, boolean bl2) {
        block13: {
            try {
                if (ya == null) {
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCryptoNegotiator.a(customSystemException);
            }
            try {
                if (ya.equals(ConfigurationCalibrator.b.N())) {
                    ConfigurationCalibrator.b.v(ya);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCryptoNegotiator.a(customSystemException);
            }
            try {
                try {
                    ya.q(false);
                    if (!bl2 || !(ya instanceof CryptographicSecurityProvider)) break block13;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                }
                ((CryptographicSecurityProvider)ya).n(false);
                ya.X(true);
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCryptoNegotiator.a(customSystemException);
            }
        }
        try {
            if (bl) {
                ConfigurationRegistry.O.b(this);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCryptoNegotiator.a(customSystemException);
        }
    }

    boolean R() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!ConfigurationRegistry.O.z(this) && !ConfigurationRegistry.O.O(this, this.O.s())) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2D79;
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
                throw new RuntimeException("a/jT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveCryptoNegotiator.gb[n2] = n3;
        }
        return gb[n2];
    }

    private GenericConfigurationResolver h() {
        long l = bb ^ 0x310853D2B70FL;
        try {
            if (this.X == null) {
                return GenericConfigurationResolver.r((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)15175, (long)(0x18C9BB24C6E0CDCBL ^ l)), (long)-2594849954472631283L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCryptoNegotiator.a(customSystemException);
        }
        try {
            if (this.b == null) {
                this.b = this.V.r(this.X, TR.h());
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCryptoNegotiator.a(customSystemException);
        }
        return this.V.h(TR.h(), this.X, this.b, true);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'l' || c == '\u00cd' || c == '\u00e0' || c == '\u00b5') {
                field = AdaptiveCryptoNegotiator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AdaptiveCryptoNegotiator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'i' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @NotNull
    GenericConfigurationResolver Y() {
        long l = bb ^ 0x3C69E7A9FD77L;
        try {
            if (AbstractDataTransformer.D()) {
                this.T = true;
                return GenericConfigurationResolver.a((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)14641, (long)(0x576DC07BB76805DAL ^ l)), (long)-7960903064749920651L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCryptoNegotiator.a(customSystemException);
        }
        if (AbstractDataTransformer.y()) {
            GenericConfigurationResolver genericConfigurationResolver;
            GenericConfigurationResolver genericConfigurationResolver2 = this.m();
            try {
                if (genericConfigurationResolver2.Y()) {
                    return GenericConfigurationResolver.r(String.format((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)5058, (long)(0x197F0F217E262F2BL ^ l)), (long)-7960903064749920651L, (long)l)), genericConfigurationResolver2.w())).i(genericConfigurationResolver2.H());
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCryptoNegotiator.a(customSystemException);
            }
            try {
                genericConfigurationResolver = genericConfigurationResolver2.x() ? GenericConfigurationResolver.B((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)6647, (long)(0x6C2820467809A51DL ^ l)), (long)-7960903064749920651L, (long)l))) : GenericConfigurationResolver.B((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)4810, (long)(0x17FFEC3D17F22E31L ^ l)), (long)-7960903064749920651L, (long)l)));
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCryptoNegotiator.a(customSystemException);
            }
            return genericConfigurationResolver;
        }
        if (this.y()) {
            this.x.m();
            boolean bl = AbstractDataTransformer.K();
            try {
                if (!bl) {
                    return GenericConfigurationResolver.a((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)28781, (long)(0x6921775D2C264CB3L ^ l)), (long)-7960903064749920651L, (long)l)));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCryptoNegotiator.a(customSystemException);
            }
            this.T = true;
            return GenericConfigurationResolver.B((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)13740, (long)(0x6CE25E982EC6094AL ^ l)), (long)-7960903064749920651L, (long)l)));
        }
        return GenericConfigurationResolver.B((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)22445, (long)(0x5D955FAA32846B77L ^ l)), (long)-7960903064749920651L, (long)l)));
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void v() {
        super.v();
        this.N();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AdaptiveCryptoNegotiator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private boolean v() {
        boolean bl;
        block61: {
            block60: {
                float f;
                block59: {
                    SystemConfigurationOrchestrator systemConfigurationOrchestrator;
                    block58: {
                        try {
                            if (ApplicationLifecycleManager.X().r()) {
                                return false;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                        }
                        systemConfigurationOrchestrator = ApplicationLifecycleManager.U();
                        try {
                            if (systemConfigurationOrchestrator.Y()) {
                                return false;
                            }
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                        }
                        TransactionProcessor1409 transactionProcessor1409 = systemConfigurationOrchestrator.M();
                        try {
                            block56: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    block57: {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (this.n < 2.0 || systemConfigurationOrchestrator.x() == 0.0) break block56;
                                                                                        }
                                                                                        catch (CustomSystemException customSystemException) {
                                                                                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                                                                                        }
                                                                                        if (transactionProcessor1409.G()) break block56;
                                                                                    }
                                                                                    catch (CustomSystemException customSystemException) {
                                                                                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                                                                                    }
                                                                                    if (transactionProcessor1409.m()) break block56;
                                                                                }
                                                                                catch (CustomSystemException customSystemException) {
                                                                                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                                                                                }
                                                                                if (transactionProcessor1409.K()) break block56;
                                                                            }
                                                                            catch (CustomSystemException customSystemException) {
                                                                                throw AdaptiveCryptoNegotiator.a(customSystemException);
                                                                            }
                                                                            if (systemConfigurationOrchestrator.x()) break block56;
                                                                        }
                                                                        catch (CustomSystemException customSystemException) {
                                                                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                                                                        }
                                                                        if (systemConfigurationOrchestrator.O()) break block56;
                                                                    }
                                                                    catch (CustomSystemException customSystemException) {
                                                                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                                                                    }
                                                                    if (systemConfigurationOrchestrator.C()) break block56;
                                                                }
                                                                catch (CustomSystemException customSystemException) {
                                                                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                                                                }
                                                                if (!GameVersionEnumerator.MC_1_16_5.H()) break block57;
                                                            }
                                                            catch (CustomSystemException customSystemException) {
                                                                throw AdaptiveCryptoNegotiator.a(customSystemException);
                                                            }
                                                            if (systemConfigurationOrchestrator.f()) break block56;
                                                        }
                                                        catch (CustomSystemException customSystemException) {
                                                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                                                        }
                                                    }
                                                    if (systemConfigurationOrchestrator.j()) break block56;
                                                }
                                                catch (CustomSystemException customSystemException) {
                                                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                                                }
                                                if (systemConfigurationOrchestrator.T()) break block56;
                                            }
                                            catch (CustomSystemException customSystemException) {
                                                throw AdaptiveCryptoNegotiator.a(customSystemException);
                                            }
                                            if (systemConfigurationOrchestrator.F()) break block56;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                                        }
                                        if (systemConfigurationOrchestrator.L()) break block56;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                                    }
                                    if (!systemConfigurationOrchestrator.t()) break block58;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                                }
                            }
                            return false;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                        }
                    }
                    try {
                        if (TemporalMetadataResolver.h.U().K(CryptoResourceInterceptor.class).Z()) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                    }
                    float f2 = 0.0f;
                    CompressionUtility compressionUtility = TR.d(false, 50, systemConfigurationOrchestrator, this.g(systemConfigurationOrchestrator, true));
                    if (compressionUtility != null) {
                        NetworkProtocolNegotiator networkProtocolNegotiator = systemConfigurationOrchestrator.N();
                        for (int i = 0; i <= 3; ++i) {
                            ReflectionUtilityBroker reflectionUtilityBroker = compressionUtility.t().v(i);
                            NetworkConnectionOrchestrator networkConnectionOrchestrator = networkProtocolNegotiator.T(reflectionUtilityBroker);
                            if (!networkConnectionOrchestrator.r()) continue;
                            TransactionCorrelationEngine transactionCorrelationEngine = networkConnectionOrchestrator.I();
                            try {
                                try {
                                    if (!transactionCorrelationEngine.r() || !PatternMatchingOrchestrator.R(transactionCorrelationEngine)) continue;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                                }
                                return false;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveCryptoNegotiator.a(customSystemException);
                            }
                        }
                        f2 = (float)(systemConfigurationOrchestrator.V() - (double)(compressionUtility.h() + 1));
                    }
                    float f3 = TR.S(systemConfigurationOrchestrator, true, false, this.g(systemConfigurationOrchestrator, false));
                    float f4 = Math.max(f2, f3);
                    try {
                        if (f4 <= 0.0f) {
                            return false;
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                    }
                    float f5 = TR.c(systemConfigurationOrchestrator, f4);
                    double d2 = (Double)this.K.J();
                    f = systemConfigurationOrchestrator.e() - f5;
                    try {
                        try {
                            if (!this.l.s().booleanValue() || !((double)f5 >= d2)) break block59;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                        }
                        return true;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                    }
                }
                try {
                    try {
                        if (!this.A.s().booleanValue() || !(f <= 0.0f)) break block60;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                    }
                    bl = true;
                    break block61;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public AdaptiveCryptoNegotiator() {
        long l = bb ^ 0x72EB12A21EBEL;
        super(a.cs((int)AdaptiveCryptoNegotiator.a("v", (int)4781, (long)(0x42644BD955164D84L ^ l))), (int)AdaptiveCryptoNegotiator.a("v", (int)19330, (long)(0x1D486A58C93994A8L ^ l)), RecursiveNodeGraph.k, a.cs((int)AdaptiveCryptoNegotiator.a("v", (int)28540, (long)(0x48477DDAE79B304BL ^ l))));
        this.l = AuthenticationStateTracker.R(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)3110, (long)(0x4EA90CF40865313L ^ l)), (long)8236096724964789692L, (long)l)), false, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)25538, (long)(0xE8A0AC4962F3CFBL ^ l)), (long)8236096724964789692L, (long)l)));
        this.A = AuthenticationStateTracker.R(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)17752, (long)(0x68A210F2C2F19A7DL ^ l)), (long)8236096724964789692L, (long)l)), true, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)32662, (long)(0x1EDC2EF4CCC2A088L ^ l)), (long)8236096724964789692L, (long)l)));
        this.L = NumericPrecisionTransformer.D(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)19078, (long)(0x385DC7211D4B1592L ^ l)), (long)8236096724964789692L, (long)l)), (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)31497, (long)(0x565CBB544A7B2415L ^ l)), (long)8236096724964789692L, (long)l)), "", 5.0, 5.0, 15.0, 0.5, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)14495, (long)(0x1C135B17BB80678AL ^ l)), (long)8236096724964789692L, (long)l)));
        this.B = AuthenticationStateTracker.R(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)21439, (long)(0x61DA54EE40928C87L ^ l)), (long)8236096724964789692L, (long)l)), false, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)27067, (long)(0x3831B544309AB6ABL ^ l)), (long)8236096724964789692L, (long)l)));
        this.j = new NetworkConfigManager();
        this.x = new NetworkConfigManager();
        this.G = NumericFormattingUtility.K(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)31341, (long)(0x7B7754D4A3B2257BL ^ l)), (long)8236096724964789692L, (long)l)), (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)28611, (long)(0x334DB7534E4B30F0L ^ l)), (long)8236096724964789692L, (long)l)), (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)27045, (long)(0xE360EEA1EFAB68DL ^ l)), (long)8236096724964789692L, (long)l)), 50.0, 75.0, 125.0, 200.0, 5.0, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)5138, (long)(0x301A00DDAE354B2CL ^ l)), (long)8236096724964789692L, (long)l)));
        this.o = new NetworkConfigManager();
        this.d = new NetworkConfigManager();
        this.m = new ConcurrentLinkedQueue<DimensionalMetricsTracker>();
        this.O = AuthenticationStateTracker.R(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)8413, (long)(0x6244B63F626F7FFBL ^ l)), (long)8236096724964789692L, (long)l)), false, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)10378, (long)(0x336D38AABA0477ABL ^ l)), (long)8236096724964789692L, (long)l)));
        this.z = AuthenticationStateTracker.R(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)22913, (long)(0x692D1E6B015F86BAL ^ l)), (long)8236096724964789692L, (long)l)), true, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)3184, (long)(0x4420E3EF9A7FD34FL ^ l)), (long)8236096724964789692L, (long)l)));
        this.P = AuthenticationStateTracker.R(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)14024, (long)(0x161D80DDCFD569E5L ^ l)), (long)8236096724964789692L, (long)l)), true, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)26456, (long)(0x49946DE673E3862L ^ l)), (long)8236096724964789692L, (long)l)));
        this.R = AuthenticationStateTracker.R(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)5187, (long)(0x1BE9296EFFC14B5CL ^ l)), (long)8236096724964789692L, (long)l)), true, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)5082, (long)(0x230687FC2BAB4CC2L ^ l)), (long)8236096724964789692L, (long)l)));
        this.h = ColorPaletteManager.o(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)31283, (long)(0x248B238F086251DL ^ l)), (long)8236096724964789692L, (long)l)), (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)3624, (long)(0x636898F41E0FD13AL ^ l)), (long)8236096724964789692L, (long)l)), ColorPaletteManager.U, Arrays.asList(new RecursiveNodeTreeBuilder((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)2983, (long)(0x56757212110BD49BL ^ l)), (long)8236096724964789692L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)9757, (long)(0x19822548566FF92DL ^ l)), (long)8236096724964789692L, (long)l))), new RecursiveNodeTreeBuilder((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)8291, (long)(0x2D84681673937F4FL ^ l)), (long)8236096724964789692L, (long)l)))));
        this.K = NumericPrecisionTransformer.D(this, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)20741, (long)(0x17FE693951E20E22L ^ l)), (long)8236096724964789692L, (long)l)), (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)3463, (long)(0x71DF679449A1D2B6L ^ l)), (long)8236096724964789692L, (long)l)), "", 1.0, 5.0, 20.0, 1.0, (String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)20865, (long)(0x6749643D2BF18EAAL ^ l)), (long)8236096724964789692L, (long)l)));
        this.v = null;
        this.t = null;
        this.T = false;
        this.n = 0.0;
        this.X = null;
        this.w = 0.0;
        this.N = null;
        this.Y = null;
        this.e = CharsetNormalizationEnum.IDLE;
        this.b = null;
        this.F = false;
        this.z.l(this.B);
        this.l.l(this.K);
        this.R.l(this.G);
        this.N(this.z, this.B, this.P, this.R, this.G, this.O, this.L, this.A, this.l, this.K);
        this.V = new NetworkProtocolDecoder345(this);
        this.Z = new CryptoContextResolver520(this);
        ConfigurationRegistry.O.y(this, 10);
    }

    private static void a() {
        Object[] objectArray = kb;
        kb[0] = "9\u0011>";
        objectArray[1] = Integer.TYPE;
        AdaptiveCryptoNegotiator.lb[1] = "java/lang/Integer";
        objectArray[2] = "*ml%}D!b}j\u0000\\2et#";
        objectArray[3] = "\b-fL\u001e^\u0003\"w\u0003\u007fP\b)sY";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Gc[\u0019\u00121\u0019'\\(\u0006$)/@G\u00130\u0016<\bGmfS9DN\u00013Q&U(";
    }

    /*
     * Exception decompiling
     */
    @DataExchangeProtocol2090
    public void D(KB var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[TRYBLOCK]], but top level block is 31[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    boolean y() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (!(this.G.q() <= 0.0) && !this.x.m((long)this.G.l())) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void D(ClusterEventOrchestrator clusterEventOrchestrator) {
        block20: {
            NetworkPacketInterceptor1107 networkPacketInterceptor1107;
            block18: {
                block16: {
                    try {
                        try {
                            if (this.F && this.X != null) break block16;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                        }
                        return;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                    }
                }
                networkPacketInterceptor1107 = TR.D(TR.h());
                try {
                    block17: {
                        try {
                            try {
                                if (networkPacketInterceptor1107 == null || networkPacketInterceptor1107.Y()) break block17;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw AdaptiveCryptoNegotiator.a(customSystemException);
                            }
                            if (!networkPacketInterceptor1107.f().Y()) break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                        }
                    }
                    return;
                }
                catch (CustomSystemException customSystemException) {
                    throw AdaptiveCryptoNegotiator.a(customSystemException);
                }
            }
            int n = networkPacketInterceptor1107.p();
            int n2 = this.X.z();
            int n3 = networkPacketInterceptor1107.b();
            int n4 = this.X.h();
            int n5 = networkPacketInterceptor1107.m();
            int n6 = this.X.A();
            try {
                block19: {
                    try {
                        try {
                            if (n != n2 || n3 != n4) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw AdaptiveCryptoNegotiator.a(customSystemException);
                        }
                        if (n5 == n6) break block20;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw AdaptiveCryptoNegotiator.a(customSystemException);
                    }
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCryptoNegotiator.a(customSystemException);
            }
        }
    }

    @Override
    public void h() {
        super.h();
        this.N();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveCryptoNegotiator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AdaptiveCryptoNegotiator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AdaptiveCryptoNegotiator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = AdaptiveCryptoNegotiator.a(l, l2);
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
                clazz3 = AdaptiveCryptoNegotiator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AdaptiveCryptoNegotiator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AdaptiveCryptoNegotiator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        AdaptiveCryptoNegotiator.kb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AdaptiveCryptoNegotiator.b(220034768283859L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AdaptiveCryptoNegotiator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AdaptiveCryptoNegotiator.kb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AdaptiveCryptoNegotiator.b(220034768283859L, 0L);
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

    @NotNull
    GenericConfigurationResolver m() {
        long l = bb ^ 0x462CDE57CCCEL;
        try {
            if (!AbstractDataTransformer.y()) {
                this.T = false;
                return GenericConfigurationResolver.a((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)30286, (long)(0x4985E7A84A2E7B2FL ^ l)), (long)-6900558536372314164L, (long)l)));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCryptoNegotiator.a(customSystemException);
        }
        try {
            if (!this.T) {
                return GenericConfigurationResolver.r((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)3839, (long)(0x46B568AECB2703BBL ^ l)), (long)-6900558536372314164L, (long)l))).w();
            }
        }
        catch (CustomSystemException customSystemException) {
            throw AdaptiveCryptoNegotiator.a(customSystemException);
        }
        if (this.y()) {
            this.x.m();
            boolean bl = AbstractDataTransformer.S();
            try {
                if (!bl) {
                    return GenericConfigurationResolver.a((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)17554, (long)(0x5377C09FD589C9C6L ^ l)), (long)-6900558536372314164L, (long)l)));
                }
            }
            catch (CustomSystemException customSystemException) {
                throw AdaptiveCryptoNegotiator.a(customSystemException);
            }
            this.T = false;
            return GenericConfigurationResolver.B((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)1536, (long)(0x30F551357AF08B6DL ^ l)), (long)-6900558536372314164L, (long)l)));
        }
        return GenericConfigurationResolver.B((String)((Object)AdaptiveCryptoNegotiator.c("i", (int)AdaptiveCryptoNegotiator.a("v", (int)27230, (long)(0x6A8795351ECDE718L ^ l)), (long)-6900558536372314164L, (long)l)));
    }

    private static Field c(long l, long l2) {
        int n = AdaptiveCryptoNegotiator.a(l, l2);
        Object object = kb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = AdaptiveCryptoNegotiator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AdaptiveCryptoNegotiator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AdaptiveCryptoNegotiator.a(clazz3, string2, clazz2)) != null) {
                    AdaptiveCryptoNegotiator.kb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AdaptiveCryptoNegotiator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AdaptiveCryptoNegotiator.kb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AdaptiveCryptoNegotiator.b(220034768283859L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    void N(String string, Object ... objectArray) {
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/jT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = AdaptiveCryptoNegotiator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AdaptiveCryptoNegotiator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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
                n3 = 37;
                break;
            }
            case 1: {
                n3 = 34;
                break;
            }
            case 2: {
                n3 = 50;
                break;
            }
            case 3: {
                n3 = 5;
                break;
            }
            case 4: {
                n3 = 8;
                break;
            }
            case 5: {
                n3 = 19;
                break;
            }
            case 6: {
                n3 = 46;
                break;
            }
            case 7: {
                n3 = 26;
                break;
            }
            case 8: {
                n3 = 43;
                break;
            }
            case 9: {
                n3 = 6;
                break;
            }
            case 10: {
                n3 = 40;
                break;
            }
            case 11: {
                n3 = 44;
                break;
            }
            case 12: {
                n3 = 41;
                break;
            }
            case 13: {
                n3 = 14;
                break;
            }
            case 14: {
                n3 = 20;
                break;
            }
            case 15: {
                n3 = 3;
                break;
            }
            case 16: {
                n3 = 22;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 53;
                break;
            }
            case 19: {
                n3 = 7;
                break;
            }
            case 20: {
                n3 = 17;
                break;
            }
            case 21: {
                n3 = 57;
                break;
            }
            case 22: {
                n3 = 52;
                break;
            }
            case 23: {
                n3 = 9;
                break;
            }
            case 24: {
                n3 = 62;
                break;
            }
            case 25: {
                n3 = 31;
                break;
            }
            case 26: {
                n3 = 24;
                break;
            }
            case 27: {
                n3 = 56;
                break;
            }
            case 28: {
                n3 = 35;
                break;
            }
            case 29: {
                n3 = 39;
                break;
            }
            case 30: {
                n3 = 0;
                break;
            }
            case 31: {
                n3 = 58;
                break;
            }
            case 32: {
                n3 = 59;
                break;
            }
            case 33: {
                n3 = 21;
                break;
            }
            case 34: {
                n3 = 45;
                break;
            }
            case 35: {
                n3 = 12;
                break;
            }
            case 36: {
                n3 = 25;
                break;
            }
            case 37: {
                n3 = 36;
                break;
            }
            case 38: {
                n3 = 42;
                break;
            }
            case 39: {
                n3 = 49;
                break;
            }
            case 40: {
                n3 = 38;
                break;
            }
            case 41: {
                n3 = 1;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 16;
                break;
            }
            case 44: {
                n3 = 54;
                break;
            }
            case 45: {
                n3 = 32;
                break;
            }
            case 46: {
                n3 = 51;
                break;
            }
            case 47: {
                n3 = 28;
                break;
            }
            case 48: {
                n3 = 60;
                break;
            }
            case 49: {
                n3 = 23;
                break;
            }
            case 50: {
                n3 = 33;
                break;
            }
            case 51: {
                n3 = 15;
                break;
            }
            case 52: {
                n3 = 47;
                break;
            }
            case 53: {
                n3 = 2;
                break;
            }
            case 54: {
                n3 = 10;
                break;
            }
            case 55: {
                n3 = 18;
                break;
            }
            case 56: {
                n3 = 27;
                break;
            }
            case 57: {
                n3 = 61;
                break;
            }
            case 58: {
                n3 = 13;
                break;
            }
            case 59: {
                n3 = 30;
                break;
            }
            case 60: {
                n3 = 4;
                break;
            }
            case 61: {
                n3 = 48;
                break;
            }
            case 62: {
                n3 = 11;
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
        AdaptiveCryptoNegotiator.lb[n4] = new String(cArray);
        return n4;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveCryptoNegotiator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(AdaptiveCryptoNegotiator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

