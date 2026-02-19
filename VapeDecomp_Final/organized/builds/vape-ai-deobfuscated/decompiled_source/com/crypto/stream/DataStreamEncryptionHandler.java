/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.crypto.stream;

import a.Ry;
import a._b;
import a.bE;
import a.hr;
import com.collections.management.MultiContainerRegistry;
import com.data.archival.TemporalDataArchiver;
import com.data.compression.DataCompressionNegotiator;
import com.data.conversion.TemporalDataTransformer;
import com.exception.system.CustomSystemException;
import com.financial.transaction.TransactionValidator1909;
import com.graphics.rendering.GraphicalRenderEngine1082;
import com.graphics.transformation.GeometricTransformEngine;
import com.math.computation.IntegerComputationManager;
import com.security.crypto.CipherContextManager1101;
import com.security.session.CipherSessionManager;
import com.temporal.metadata.TemporalMetadataResolver;
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
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class DataStreamEncryptionHandler
extends GraphicalRenderEngine1082 {
    private static final Object[] lb;
    private static final long ab;
    private static final long[] bb;
    private static final Map fb;
    private static final Integer[] eb;
    private final Ry _c;
    private static final String[] mb;

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (mb[n4] != null) {
            return n4;
        }
        Object object = lb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 14;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 41;
                break;
            }
            case 4: {
                n3 = 20;
                break;
            }
            case 5: {
                n3 = 13;
                break;
            }
            case 6: {
                n3 = 25;
                break;
            }
            case 7: {
                n3 = 40;
                break;
            }
            case 8: {
                n3 = 22;
                break;
            }
            case 9: {
                n3 = 45;
                break;
            }
            case 10: {
                n3 = 58;
                break;
            }
            case 11: {
                n3 = 37;
                break;
            }
            case 12: {
                n3 = 59;
                break;
            }
            case 13: {
                n3 = 15;
                break;
            }
            case 14: {
                n3 = 17;
                break;
            }
            case 15: {
                n3 = 50;
                break;
            }
            case 16: {
                n3 = 43;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 7;
                break;
            }
            case 19: {
                n3 = 36;
                break;
            }
            case 20: {
                n3 = 47;
                break;
            }
            case 21: {
                n3 = 63;
                break;
            }
            case 22: {
                n3 = 8;
                break;
            }
            case 23: {
                n3 = 38;
                break;
            }
            case 24: {
                n3 = 57;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 11;
                break;
            }
            case 27: {
                n3 = 60;
                break;
            }
            case 28: {
                n3 = 9;
                break;
            }
            case 29: {
                n3 = 48;
                break;
            }
            case 30: {
                n3 = 27;
                break;
            }
            case 31: {
                n3 = 1;
                break;
            }
            case 32: {
                n3 = 51;
                break;
            }
            case 33: {
                n3 = 54;
                break;
            }
            case 34: {
                n3 = 33;
                break;
            }
            case 35: {
                n3 = 32;
                break;
            }
            case 36: {
                n3 = 56;
                break;
            }
            case 37: {
                n3 = 10;
                break;
            }
            case 38: {
                n3 = 53;
                break;
            }
            case 39: {
                n3 = 23;
                break;
            }
            case 40: {
                n3 = 35;
                break;
            }
            case 41: {
                n3 = 4;
                break;
            }
            case 42: {
                n3 = 31;
                break;
            }
            case 43: {
                n3 = 39;
                break;
            }
            case 44: {
                n3 = 29;
                break;
            }
            case 45: {
                n3 = 44;
                break;
            }
            case 46: {
                n3 = 26;
                break;
            }
            case 47: {
                n3 = 52;
                break;
            }
            case 48: {
                n3 = 6;
                break;
            }
            case 49: {
                n3 = 62;
                break;
            }
            case 50: {
                n3 = 21;
                break;
            }
            case 51: {
                n3 = 24;
                break;
            }
            case 52: {
                n3 = 42;
                break;
            }
            case 53: {
                n3 = 30;
                break;
            }
            case 54: {
                n3 = 3;
                break;
            }
            case 55: {
                n3 = 34;
                break;
            }
            case 56: {
                n3 = 49;
                break;
            }
            case 57: {
                n3 = 5;
                break;
            }
            case 58: {
                n3 = 61;
                break;
            }
            case 59: {
                n3 = 46;
                break;
            }
            case 60: {
                n3 = 18;
                break;
            }
            case 61: {
                n3 = 19;
                break;
            }
            case 62: {
                n3 = 2;
                break;
            }
            default: {
                n3 = 28;
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
        DataStreamEncryptionHandler.mb[n4] = new String(cArray);
        return n4;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'z' || c == '\u00f8' || c == '\u00cd' || c == 't') {
                field = DataStreamEncryptionHandler.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataStreamEncryptionHandler.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ce' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00de' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private TransactionStatusTracker lambda$null$2(Throwable throwable) {
        this.I();
        return null;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataStreamEncryptionHandler.ab = MultiContainerRegistry.a(1322528095965664912L, -8973633834503110119L, MethodHandles.lookup().lookupClass()).a(84904063043968L);
                DataStreamEncryptionHandler.lb = new Object[5];
                DataStreamEncryptionHandler.mb = new String[5];
                DataStreamEncryptionHandler.x();
                DataStreamEncryptionHandler.fb = new HashMap<K, V>(13);
                var0 = DataStreamEncryptionHandler.ab ^ 34444559964416L;
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
                var8_3 = new long[21];
                var5_4 = 0;
                var6_5 = "\u00bf\u00de\u00b0\u00f0\u00e1U}\u00e9(\u00cf\u00e59H\u00d8\u00bb\u000f[\u00f0\u00f2y\u00c8j\u00e4\u0085\u00feH\u00f3\u0005r\u00c4\u00f4}\u0092\u00d1\u00dd\u00dc\u0006>\u0017{\u00b7\u0097\u0086\u0015\u00de|j\u0092\u0092\u00b4\u00ea\u008e\u0080qp\u00b3\u00ca\u00e6\u009cj~Z\u00bb\u00d5\u00e7D\u00acC\u000b\u00cb\u00c71G\u0095\u0019\u001c\u00fd\u0005\u00f1\r\u0092v\u00b9\u00e6\\N[c\u0006\u00c2\u00a6\tT\u0004\u0010~UC\u00dd\u0007\u00adj4P\u00b7\u00ee\u00c23\u00857\"\u00c1\u00fc\u00b8\u0004\u00c5\u0018*u\u009eIX\u00eaVz\u0085\u00da\\Hl\u00ee\u001e\u00d2\u0000\u0013\u00db\u0004\u00a3\u00cf\u0084~\u0004\u00bd\u00ef\u00ae.)\u00bc\u00c2\u00f3;\u00d0";
                var7_6 = "\u00bf\u00de\u00b0\u00f0\u00e1U}\u00e9(\u00cf\u00e59H\u00d8\u00bb\u000f[\u00f0\u00f2y\u00c8j\u00e4\u0085\u00feH\u00f3\u0005r\u00c4\u00f4}\u0092\u00d1\u00dd\u00dc\u0006>\u0017{\u00b7\u0097\u0086\u0015\u00de|j\u0092\u0092\u00b4\u00ea\u008e\u0080qp\u00b3\u00ca\u00e6\u009cj~Z\u00bb\u00d5\u00e7D\u00acC\u000b\u00cb\u00c71G\u0095\u0019\u001c\u00fd\u0005\u00f1\r\u0092v\u00b9\u00e6\\N[c\u0006\u00c2\u00a6\tT\u0004\u0010~UC\u00dd\u0007\u00adj4P\u00b7\u00ee\u00c23\u00857\"\u00c1\u00fc\u00b8\u0004\u00c5\u0018*u\u009eIX\u00eaVz\u0085\u00da\\Hl\u00ee\u001e\u00d2\u0000\u0013\u00db\u0004\u00a3\u00cf\u0084~\u0004\u00bd\u00ef\u00ae.)\u00bc\u00c2\u00f3;\u00d0".length();
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
                    var6_5 = "\u0089\u000eQ\u001d.\u00e2\u00b7|d\u0085\u00f3b\u0000\u0001\u007f\u0092";
                    var7_6 = "\u0089\u000eQ\u001d.\u00e2\u00b7|d\u0085\u00f3b\u0000\u0001\u007f\u0092".length();
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
        DataStreamEncryptionHandler.bb = var8_3;
        DataStreamEncryptionHandler.eb = new Integer[21];
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = DataStreamEncryptionHandler.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataStreamEncryptionHandler.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void M(@Nullable TemporalDataTransformer temporalDataTransformer, @Nullable TemporalDataArchiver temporalDataArchiver) {
        Object object;
        StringBuilder stringBuilder;
        DataCompressionNegotiator dataCompressionNegotiator;
        DataCompressionNegotiator dataCompressionNegotiator2;
        long l;
        block6: {
            l = ab ^ 0xDDC55E5BA30L;
            try {
                try {
                    if (temporalDataTransformer != null || temporalDataArchiver != null) break block6;
                }
                catch (CustomSystemException customSystemException) {
                    throw DataStreamEncryptionHandler.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw DataStreamEncryptionHandler.a(customSystemException);
            }
        }
        try {
            DataCompressionNegotiator dataCompressionNegotiator3;
            this.i(false);
            this.d().f((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)2413, (long)(0x643BDF6C0E4839FBL ^ l)), (long)-536425765960287223L, (long)l)));
            dataCompressionNegotiator2 = dataCompressionNegotiator3;
            dataCompressionNegotiator = dataCompressionNegotiator3;
            stringBuilder = new StringBuilder().append((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)6615, (long)(0x703BFBD72155A94CL ^ l)), (long)-536425765960287223L, (long)l)));
            object = temporalDataTransformer != null ? temporalDataTransformer.S().X() : (this._c.E() != null ? this._c.E().X() : DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)17888, (long)(0x53936008BAD4F56AL ^ l)), (long)-536425765960287223L, (long)l));
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamEncryptionHandler.a(customSystemException);
        }
        dataCompressionNegotiator2(stringBuilder.append((String)object).append((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)24199, (long)(0x69007F652B986E1AL ^ l)), (long)-536425765960287223L, (long)l))).append((String)((Object)(temporalDataTransformer != null ? DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)10012, (long)(0x2857B7390403978DL ^ l)), (long)-536425765960287223L, (long)l) : DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)22606, (long)(0x676E0E1BADC068C7L ^ l)), (long)-536425765960287223L, (long)l)))).toString(), 1.0);
        DataCompressionNegotiator dataCompressionNegotiator4 = dataCompressionNegotiator;
        dataCompressionNegotiator4.T(this.w());
        dataCompressionNegotiator4.B(DataStreamEncryptionHandler.M.c);
        dataCompressionNegotiator4.q(true);
        this.n(dataCompressionNegotiator4, new Object[0]);
        this.n(new bE(0.0, 20.0), new Object[0]);
        TransactionValidator1909 transactionValidator1909 = new TransactionValidator1909((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)23997, (long)(0x2D0C2A3F3BFA6D36L ^ l)), (long)-536425765960287223L, (long)l)));
        transactionValidator1909.x(0.0f);
        transactionValidator1909.Z(0.0);
        transactionValidator1909.R(0.0f);
        double d2 = this.w() / 2.0 - transactionValidator1909.w() / 2.0;
        this.n(new bE(d2, 12.0), DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)7466, (long)(0xE34E4C8EF5DADB6L ^ l)), (long)-536425765960287223L, (long)l));
        this.n(transactionValidator1909, new Object[0]);
        this.n(new bE(d2, 12.0), DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)13700, (long)(0x4C89111655D68517L ^ l)), (long)-536425765960287223L, (long)l));
        this.n(new GeometricTransformEngine(transactionValidator1909.w(), 0.0, 0.5, 0.0, DataStreamEncryptionHandler.M.k), DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)18659, (long)(0x6DEE28D20103F87BL ^ l)), (long)-536425765960287223L, (long)l));
        GraphicalRenderEngine1082 graphicalRenderEngine1082 = new GraphicalRenderEngine1082(this.w(), 12.0);
        graphicalRenderEngine1082.i(false);
        graphicalRenderEngine1082.d().f((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)8125, (long)(0x14DDC88A5A5DAF22L ^ l)), (long)-536425765960287223L, (long)l)));
        this.n(new bE(0.0, 6.0), new Object[0]);
        this.n(graphicalRenderEngine1082, new Object[0]);
        graphicalRenderEngine1082.n(new bE(100.0, 12.0), new Object[0]);
        VisualRenderContext visualRenderContext = new VisualRenderContext((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)31392, (long)(0x657E5D3A7EF54A28L ^ l)), (long)-536425765960287223L, (long)l)), 0.7);
        visualRenderContext.c(DataStreamEncryptionHandler.M.n);
        visualRenderContext.f(true);
        visualRenderContext.T(30.0);
        visualRenderContext.w(12.0);
        visualRenderContext.N(this::lambda$setup$0);
        graphicalRenderEngine1082.n(visualRenderContext, new Object[0]);
        hr hr2 = new hr((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)2886, (long)(0x353C9B6247ECBBD3L ^ l)), (long)-536425765960287223L, (long)l)), DataStreamEncryptionHandler.M.Y, DataStreamEncryptionHandler.M.u);
        hr2.d(0.7);
        hr2.q(false);
        hr2.A(Color.WHITE);
        hr2.f(true);
        hr2.T(30.0);
        hr2.w(12.0);
        hr2.f(() -> this.lambda$setup$5(temporalDataTransformer, transactionValidator1909, temporalDataArchiver));
        graphicalRenderEngine1082.n(hr2, new Object[0]);
    }

    private TransactionStatusTracker lambda$null$4(Throwable throwable) {
        this.I();
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4815;
        if (eb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = bb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataStreamEncryptionHandler.eb[n2] = n3;
        }
        return eb[n2];
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "%\u001dz";
        objectArray[1] = Integer.TYPE;
        DataStreamEncryptionHandler.mb[1] = "java/lang/Integer";
        objectArray[2] = "*Hp\u0012\u001f-!Ga]b52@h\u0014";
        objectArray[3] = "Lq\u001dBzOG~\f\r\u001bALu\bW";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "MdBD\t\u001b\u0017:^~\u0010\u0003,3\u0004\u0002\u0001\u0006B3Z\u0006Ex\u0015m]\u0017\n\bA1C\u0003{";
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataStreamEncryptionHandler.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public DataStreamEncryptionHandler(Ry ry, TemporalDataArchiver temporalDataArchiver) {
        super(200.0, 100.0);
        this._c = ry;
        this.M(null, temporalDataArchiver);
    }

    private static Method l(long l, long l2) {
        int n = DataStreamEncryptionHandler.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataStreamEncryptionHandler.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataStreamEncryptionHandler.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataStreamEncryptionHandler.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataStreamEncryptionHandler.lb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataStreamEncryptionHandler.j(231462812221261L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataStreamEncryptionHandler.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataStreamEncryptionHandler.lb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataStreamEncryptionHandler.j(231462812221261L, 0L);
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

    private void I() {
        CipherSessionManager cipherSessionManager = this.V();
        try {
            if (!(cipherSessionManager instanceof CipherContextManager1101)) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamEncryptionHandler.a(customSystemException);
        }
        CipherContextManager1101 cipherContextManager1101 = (CipherContextManager1101)cipherSessionManager;
        GraphicalRenderingController.z(cipherContextManager1101);
    }

    private void lambda$setup$0() {
        GraphicalRenderingController.st.execute(this::I);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Field k(long l, long l2) {
        int n = DataStreamEncryptionHandler.i(l, l2);
        Object object = lb[n];
        if (object instanceof String) {
            String string = mb[n];
            int n2 = string.indexOf(8);
            Class clazz = DataStreamEncryptionHandler.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataStreamEncryptionHandler.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataStreamEncryptionHandler.e(clazz3, string2, clazz2)) != null) {
                    DataStreamEncryptionHandler.lb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataStreamEncryptionHandler.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataStreamEncryptionHandler.lb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataStreamEncryptionHandler.j(231462812221261L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataStreamEncryptionHandler.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void lambda$null$1(TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        long l = ab ^ 0x6C76EA49898L;
        try {
            this.I();
            if (throwable != null) {
                TemporalMetadataResolver.W(throwable);
                IntegerComputationManager.q((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)25833, (long)(0x6994639C519676D1L ^ l)), (long)-2727439195448484191L, (long)l)));
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamEncryptionHandler.a(customSystemException);
        }
        try {
            if (!transactionStatusTracker.b()) {
                TemporalMetadataResolver.x((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)31321, (long)(0x57D363F31AB3E86FL ^ l)), (long)-2727439195448484191L, (long)l)) + transactionStatusTracker.A());
                IntegerComputationManager.q((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)29977, (long)(0x53F7D517B54C6726L ^ l)), (long)-2727439195448484191L, (long)l)) + transactionStatusTracker.A());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamEncryptionHandler.a(customSystemException);
        }
        IntegerComputationManager.G((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)30093, (long)(0x159EADEC05AE7B1L ^ l)), (long)-2727439195448484191L, (long)l)));
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private void lambda$null$3(TransactionStatusTracker transactionStatusTracker, Throwable throwable) {
        long l = ab ^ 0x5A847BC7933L;
        try {
            this.I();
            if (throwable != null) {
                TemporalMetadataResolver.W(throwable);
                IntegerComputationManager.q((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)14657, (long)(0xEB664E03B9ACAD8L ^ l)), (long)4291143124526841610L, (long)l)));
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamEncryptionHandler.a(customSystemException);
        }
        try {
            if (!transactionStatusTracker.b()) {
                TemporalMetadataResolver.x((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)15956, (long)(0x2645374FFFCC4DCEL ^ l)), (long)4291143124526841610L, (long)l)) + transactionStatusTracker.A());
                IntegerComputationManager.q((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)16325, (long)(0x1E34C2FE9A3ECC54L ^ l)), (long)4291143124526841610L, (long)l)) + transactionStatusTracker.A());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamEncryptionHandler.a(customSystemException);
        }
        IntegerComputationManager.G((String)((Object)DataStreamEncryptionHandler.d("\u00de", (int)DataStreamEncryptionHandler.c("d", (int)23290, (long)(0x25E9FE92E4AC2977L ^ l)), (long)4291143124526841610L, (long)l)));
    }

    public DataStreamEncryptionHandler(Ry ry, TemporalDataTransformer temporalDataTransformer) {
        super(200.0, 100.0);
        this._c = ry;
        this.M(temporalDataTransformer, null);
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataStreamEncryptionHandler.i(l, l2);
            object = lb[n];
            try {
                if (!(object instanceof String)) break block2;
                DataStreamEncryptionHandler.lb[n] = clazz = Class.forName(mb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private CompletableFuture lambda$setup$5(TemporalDataTransformer temporalDataTransformer, TransactionValidator1909 transactionValidator1909, TemporalDataArchiver temporalDataArchiver) {
        try {
            if (temporalDataTransformer != null) {
                return ((CompletableFuture)_b.S().M().V(temporalDataTransformer.V(), transactionValidator1909.a()).whenCompleteAsync(this::lambda$null$1, (Executor)GraphicalRenderingController.st)).exceptionally(this::lambda$null$2);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamEncryptionHandler.a(customSystemException);
        }
        try {
            if (temporalDataArchiver != null) {
                return ((CompletableFuture)_b.S().M().r(temporalDataArchiver.H(), transactionValidator1909.a()).whenCompleteAsync(this::lambda$null$3, (Executor)GraphicalRenderingController.st)).exceptionally(this::lambda$null$4);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw DataStreamEncryptionHandler.a(customSystemException);
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataStreamEncryptionHandler.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataStreamEncryptionHandler.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataStreamEncryptionHandler.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DataStreamEncryptionHandler.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

