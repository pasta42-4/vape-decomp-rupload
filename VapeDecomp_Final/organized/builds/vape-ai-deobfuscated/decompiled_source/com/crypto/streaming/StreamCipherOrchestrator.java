/*
 * Decompiled with CFR 0.152.
 */
package com.crypto.streaming;

import a.KB;
import a._Y;
import com.app.config.management.ConfigurationRegistry;
import com.app.context.transformation.ContextTransformationEngine;
import com.collections.management.MultiContainerRegistry;
import com.communication.protocol.DataExchangeProtocol2090;
import com.core.lifecycle.ApplicationLifecycleManager;
import com.crypto.stream.DataStreamCipher;
import com.encoding.protocol.EncodingProtocolEnum;
import com.exception.system.CustomSystemException;
import com.network.packet.NetworkPacketOrchestrator1222;
import com.object.lifecycle.ObjectLifecycleMediator;
import com.resource.management.ResourceAllocationTracker401;
import com.runtime.context.ContextualExecutionFramework;
import com.security.auth.AuthorizationManager;
import com.security.encryption.DataEncryptionHandler2660;
import com.security.transform.CryptographicTransformer;
import com.transaction.management.TransactionOrchestrator1017;
import com.ui.rendering.GraphicalRenderingController;
import com.util.numeric.NumericFormattingUtility;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class StreamCipherOrchestrator
extends ContextTransformationEngine<DataStreamCipher> {
    private long v;
    private int V;
    private static final long d;
    private static final String[] n;
    private long r;
    private final ObjectLifecycleMediator A;
    private static final Map l;
    private CryptographicTransformer j;
    private final NumericFormattingUtility t;
    private static final Integer[] h;
    private long O;
    private static final long[] e;
    private final NumericFormattingUtility N;
    private double K;
    private DataEncryptionHandler2660 o;
    private static final Object[] m;
    private final Queue<NetworkPacketOrchestrator1222> G;

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (StreamCipherOrchestrator.n[n4] != null) {
            return n4;
        }
        Object object = m[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 40;
                break;
            }
            case 1: {
                n3 = 30;
                break;
            }
            case 2: {
                n3 = 60;
                break;
            }
            case 3: {
                n3 = 32;
                break;
            }
            case 4: {
                n3 = 57;
                break;
            }
            case 5: {
                n3 = 44;
                break;
            }
            case 6: {
                n3 = 1;
                break;
            }
            case 7: {
                n3 = 21;
                break;
            }
            case 8: {
                n3 = 49;
                break;
            }
            case 9: {
                n3 = 2;
                break;
            }
            case 10: {
                n3 = 10;
                break;
            }
            case 11: {
                n3 = 13;
                break;
            }
            case 12: {
                n3 = 28;
                break;
            }
            case 13: {
                n3 = 33;
                break;
            }
            case 14: {
                n3 = 24;
                break;
            }
            case 15: {
                n3 = 18;
                break;
            }
            case 16: {
                n3 = 61;
                break;
            }
            case 17: {
                n3 = 27;
                break;
            }
            case 18: {
                n3 = 3;
                break;
            }
            case 19: {
                n3 = 51;
                break;
            }
            case 20: {
                n3 = 39;
                break;
            }
            case 21: {
                n3 = 35;
                break;
            }
            case 22: {
                n3 = 55;
                break;
            }
            case 23: {
                n3 = 14;
                break;
            }
            case 24: {
                n3 = 59;
                break;
            }
            case 25: {
                n3 = 31;
                break;
            }
            case 26: {
                n3 = 19;
                break;
            }
            case 27: {
                n3 = 17;
                break;
            }
            case 28: {
                n3 = 22;
                break;
            }
            case 29: {
                n3 = 15;
                break;
            }
            case 30: {
                n3 = 48;
                break;
            }
            case 31: {
                n3 = 58;
                break;
            }
            case 32: {
                n3 = 9;
                break;
            }
            case 33: {
                n3 = 53;
                break;
            }
            case 34: {
                n3 = 29;
                break;
            }
            case 35: {
                n3 = 45;
                break;
            }
            case 36: {
                n3 = 63;
                break;
            }
            case 37: {
                n3 = 41;
                break;
            }
            case 38: {
                n3 = 54;
                break;
            }
            case 39: {
                n3 = 47;
                break;
            }
            case 40: {
                n3 = 43;
                break;
            }
            case 41: {
                n3 = 46;
                break;
            }
            case 42: {
                n3 = 0;
                break;
            }
            case 43: {
                n3 = 42;
                break;
            }
            case 44: {
                n3 = 16;
                break;
            }
            case 45: {
                n3 = 7;
                break;
            }
            case 46: {
                n3 = 5;
                break;
            }
            case 47: {
                n3 = 25;
                break;
            }
            case 48: {
                n3 = 34;
                break;
            }
            case 49: {
                n3 = 50;
                break;
            }
            case 50: {
                n3 = 11;
                break;
            }
            case 51: {
                n3 = 6;
                break;
            }
            case 52: {
                n3 = 8;
                break;
            }
            case 53: {
                n3 = 20;
                break;
            }
            case 54: {
                n3 = 12;
                break;
            }
            case 55: {
                n3 = 4;
                break;
            }
            case 56: {
                n3 = 62;
                break;
            }
            case 57: {
                n3 = 56;
                break;
            }
            case 58: {
                n3 = 38;
                break;
            }
            case 59: {
                n3 = 37;
                break;
            }
            case 60: {
                n3 = 26;
                break;
            }
            case 61: {
                n3 = 36;
                break;
            }
            case 62: {
                n3 = 23;
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
        StreamCipherOrchestrator.n[n4] = new String(cArray);
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                StreamCipherOrchestrator.d = MultiContainerRegistry.a(2280583178955218407L, -7943027861741386404L, MethodHandles.lookup().lookupClass()).a(129318315103729L);
                StreamCipherOrchestrator.m = new Object[5];
                StreamCipherOrchestrator.n = new String[5];
                StreamCipherOrchestrator.a();
                StreamCipherOrchestrator.l = new HashMap<K, V>(13);
                var0 = StreamCipherOrchestrator.d ^ 55933209695439L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "z\u00b4\u000e*\u00ea\\L\u00e5H\u0013\u0080H\u0082\u00a6'\u000e5\r%\u00ba?\u00d56&";
                var7_6 = "z\u00b4\u000e*\u00ea\\L\u00e5H\u0013\u0080H\u0082\u00a6'\u000e5\r%\u00ba?\u00d56&".length();
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
                    var6_5 = "\u0080\u00a5Z\u00e4R\u00e9\u00df\u00f7N,\u00cd\u00aa\u00f7\u00d1B\u0015";
                    var7_6 = "\u0080\u00a5Z\u00e4R\u00e9\u00df\u00f7N,\u00cd\u00aa\u00f7\u00d1B\u0015".length();
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
        StreamCipherOrchestrator.e = var8_3;
        StreamCipherOrchestrator.h = new Integer[5];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = StreamCipherOrchestrator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1CC2;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])StreamCipherOrchestrator.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    StreamCipherOrchestrator.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xQ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            StreamCipherOrchestrator.h[n2] = n3;
        }
        return h[n2];
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public TransactionOrchestrator1017 e(double d2, double d3) {
        TransactionOrchestrator1017 transactionOrchestrator1017 = _Y.u(d3, d2 / 2.0);
        try {
            if (transactionOrchestrator1017 == null) {
                return null;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamCipherOrchestrator.a(customSystemException);
        }
        try {
            if (_Y.a(ApplicationLifecycleManager.U(), transactionOrchestrator1017, d3, 90.0, true)) {
                return transactionOrchestrator1017;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamCipherOrchestrator.a(customSystemException);
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = StreamCipherOrchestrator.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                StreamCipherOrchestrator.m[n] = clazz = Class.forName(StreamCipherOrchestrator.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @DataExchangeProtocol2090(b=EncodingProtocolEnum.LOWEST)
    public void w(NetworkPacketOrchestrator1222 var1_1) {
        block53: {
            block68: {
                block69: {
                    block64: {
                        block67: {
                            block65: {
                                block66: {
                                    block59: {
                                        block60: {
                                            block63: {
                                                block62: {
                                                    block61: {
                                                        block58: {
                                                            block56: {
                                                                block57: {
                                                                    block55: {
                                                                        block54: {
                                                                            block52: {
                                                                                var2_2 = StreamCipherOrchestrator.d ^ 124125001673109L;
                                                                                var4_3 = GraphicalRenderingController.b();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            v0 = var1_1.getWorld().r();
                                                                                            if (var4_3 != 0) break block52;
                                                                                            if (!v0) break block53;
                                                                                        }
                                                                                        catch (CustomSystemException v1) {
                                                                                            throw StreamCipherOrchestrator.a(v1);
                                                                                        }
                                                                                        v2 = var1_1;
                                                                                        if (var4_3 != 0) break block54;
                                                                                    }
                                                                                    catch (CustomSystemException v3) {
                                                                                        throw StreamCipherOrchestrator.a(v3);
                                                                                    }
                                                                                    v0 = v2.getThePlayer().r();
                                                                                }
                                                                                catch (CustomSystemException v4) {
                                                                                    throw StreamCipherOrchestrator.a(v4);
                                                                                }
                                                                            }
                                                                            if (!v0) break block53;
                                                                            v2 = var1_1;
                                                                        }
                                                                        if (this.A.n(var5_4 = v2.getPacket())) break block53;
                                                                        var6_5 = ResourceAllocationTracker401.l(var5_4);
                                                                        try {
                                                                            v5 = var6_5;
                                                                            if (var4_3 != 0) break block55;
                                                                            if (v5 == null) break block56;
                                                                        }
                                                                        catch (CustomSystemException v6) {
                                                                            throw StreamCipherOrchestrator.a(v6);
                                                                        }
                                                                        v5 = var6_5;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            v7 = v5.equals(var1_1.getThePlayer());
                                                                            if (var4_3 != 0) break block57;
                                                                            if (v7 == 0) break block56;
                                                                        }
                                                                        catch (CustomSystemException v8) {
                                                                            throw StreamCipherOrchestrator.a(v8);
                                                                        }
                                                                        cfr_temp_0 = System.currentTimeMillis() - this.O - 475L;
                                                                        v7 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                                    }
                                                                    catch (CustomSystemException v9) {
                                                                        throw StreamCipherOrchestrator.a(v9);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var4_3 != 0) break block58;
                                                                    if (v7 <= 0) break block56;
                                                                }
                                                                catch (CustomSystemException v10) {
                                                                    throw StreamCipherOrchestrator.a(v10);
                                                                }
                                                                v7 = 1;
                                                                break block58;
                                                            }
                                                            v7 = 0;
                                                        }
                                                        var7_6 = v7;
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        v11 = var7_6;
                                                                        if (var4_3 != 0) break block59;
                                                                        if (v11 == 0) break block60;
                                                                    }
                                                                    catch (CustomSystemException v12) {
                                                                        throw StreamCipherOrchestrator.a(v12);
                                                                    }
                                                                    v13 = this;
                                                                    if (var4_3 != 0) break block61;
                                                                }
                                                                catch (CustomSystemException v14) {
                                                                    throw StreamCipherOrchestrator.a(v14);
                                                                }
                                                                if (v13.j == null) break block62;
                                                            }
                                                            catch (CustomSystemException v15) {
                                                                throw StreamCipherOrchestrator.a(v15);
                                                            }
                                                            v13 = this;
                                                        }
                                                        catch (CustomSystemException v16) {
                                                            throw StreamCipherOrchestrator.a(v16);
                                                        }
                                                    }
                                                    try {
                                                        if (var4_3 != 0) break block63;
                                                        if (!v13.E()) {
                                                        }
                                                        ** GOTO lbl97
                                                    }
                                                    catch (CustomSystemException v17) {
                                                        throw StreamCipherOrchestrator.a(v17);
                                                    }
                                                }
                                                var7_6 = 0;
                                                try {
                                                    if (var4_3 == 0) break block60;
lbl97:
                                                    // 2 sources

                                                    v13 = this;
                                                }
                                                catch (CustomSystemException v18) {
                                                    throw StreamCipherOrchestrator.a(v18);
                                                }
                                            }
                                            v13.O = System.currentTimeMillis();
                                        }
                                        v11 = var7_6;
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var4_3 != 0) break block64;
                                                            if (v11 != 0) {
                                                            }
                                                            ** GOTO lbl164
                                                        }
                                                        catch (CustomSystemException v19) {
                                                            throw StreamCipherOrchestrator.a(v19);
                                                        }
                                                        v11 = (int)this.G.isEmpty();
                                                        if (var4_3 != 0) break block64;
                                                    }
                                                    catch (CustomSystemException v20) {
                                                        throw StreamCipherOrchestrator.a(v20);
                                                    }
                                                    if (v11 != 0) {
                                                    }
                                                    ** GOTO lbl164
                                                }
                                                catch (CustomSystemException v21) {
                                                    throw StreamCipherOrchestrator.a(v21);
                                                }
                                                v22 = this;
                                                if (var4_3 != 0) break block65;
                                            }
                                            catch (CustomSystemException v23) {
                                                throw StreamCipherOrchestrator.a(v23);
                                            }
                                            if (v22.V >= 3) break block66;
                                            break block67;
                                        }
                                        catch (CustomSystemException v24) {
                                            throw StreamCipherOrchestrator.a(v24);
                                        }
                                    }
                                    catch (CustomSystemException v25) {
                                        throw StreamCipherOrchestrator.a(v25);
                                    }
                                }
                                v22 = this;
                            }
                            v22.r = (long)this.t.l();
                        }
                        try {
                            try {
                                try {
                                    cfr_temp_1 = this.r - 0L;
                                    v11 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                    if (var4_3 != 0) break block68;
                                    if (v11 <= 0) break block69;
                                }
                                catch (CustomSystemException v26) {
                                    throw StreamCipherOrchestrator.a(v26);
                                }
                                this.K = var1_1.getThePlayer().y(this.j);
                                this.v = System.currentTimeMillis() + this.r;
                                this.G.add(var1_1);
                                var1_1.setCanceled(true);
                                this.o.d();
                                if (var4_3 == 0) break block69;
                            }
                            catch (CustomSystemException v27) {
                                throw StreamCipherOrchestrator.a(v27);
                            }
lbl164:
                            // 3 sources

                            v11 = (int)this.G.isEmpty();
                        }
                        catch (CustomSystemException v28) {
                            throw StreamCipherOrchestrator.a(v28);
                        }
                    }
                    try {
                        try {
                            if (var4_3 != 0) break block68;
                            if (v11 != 0) break block69;
                        }
                        catch (CustomSystemException v29) {
                            throw StreamCipherOrchestrator.a(v29);
                        }
                        this.G.add(var1_1);
                        var1_1.setCanceled(true);
                        this.o.d();
                    }
                    catch (CustomSystemException v30) {
                        throw StreamCipherOrchestrator.a(v30);
                    }
                }
                v11 = (int)this.G.isEmpty();
            }
            if (v11 != 0) {
                var8_7 = System.currentTimeMillis() - this.v;
                this.A.q(var5_4);
                this.o.Z();
            }
        }
    }

    private void lambda$onClientTick$0() {
        this.g();
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private boolean E() {
        boolean bl;
        block5: {
            block4: {
                try {
                    try {
                        if (((DataStreamCipher)this.n()).R() || !((DataStreamCipher)this.n()).B()) break block4;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamCipherOrchestrator.a(customSystemException);
                    }
                    bl = true;
                    break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamCipherOrchestrator.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    @DataExchangeProtocol2090
    public void N(KB kB) {
        block19: {
            block21: {
                StreamCipherOrchestrator streamCipherOrchestrator;
                boolean bl;
                int n;
                block20: {
                    block18: {
                        block16: {
                            block17: {
                                long l = d ^ 0x212E11465A73L;
                                n = GraphicalRenderingController.x();
                                try {
                                    bl = ApplicationLifecycleManager.U().Y();
                                    if (n == 0) break block16;
                                    if (!bl) break block17;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw StreamCipherOrchestrator.a(customSystemException);
                                }
                                return;
                            }
                            ObjectLifecycleMediator.R(this::lambda$onClientTick$0);
                            bl = kB.getWorld().r();
                        }
                        try {
                            try {
                                if (n == 0) break block18;
                                if (!bl) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StreamCipherOrchestrator.a(customSystemException);
                            }
                            bl = kB.getThePlayer().r();
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamCipherOrchestrator.a(customSystemException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n == 0) break block20;
                                if (!bl) break block19;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw StreamCipherOrchestrator.a(customSystemException);
                            }
                            streamCipherOrchestrator = this;
                            if (n == 0) break block21;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamCipherOrchestrator.a(customSystemException);
                        }
                        streamCipherOrchestrator.j = this.e(90.0, 5.0);
                        bl = kB.getThePlayer().j();
                    }
                    catch (CustomSystemException customSystemException) {
                        throw StreamCipherOrchestrator.a(customSystemException);
                    }
                }
                try {
                    block22: {
                        try {
                            if (!bl) break block22;
                            ++this.V;
                            if (n != 0) break block19;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw StreamCipherOrchestrator.a(customSystemException);
                        }
                    }
                    streamCipherOrchestrator = this;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamCipherOrchestrator.a(customSystemException);
                }
            }
            streamCipherOrchestrator.V = 0;
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = StreamCipherOrchestrator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = StreamCipherOrchestrator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = StreamCipherOrchestrator.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = StreamCipherOrchestrator.n[n];
            int n2 = string.indexOf(8);
            Class clazz = StreamCipherOrchestrator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = StreamCipherOrchestrator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = StreamCipherOrchestrator.a(clazz3, string2, clazz2)) != null) {
                    StreamCipherOrchestrator.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = StreamCipherOrchestrator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        StreamCipherOrchestrator.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = StreamCipherOrchestrator.b(273872013806740L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = StreamCipherOrchestrator.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = StreamCipherOrchestrator.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = StreamCipherOrchestrator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = StreamCipherOrchestrator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = StreamCipherOrchestrator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        StreamCipherOrchestrator.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = StreamCipherOrchestrator.b(273872013806740L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = StreamCipherOrchestrator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        StreamCipherOrchestrator.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = StreamCipherOrchestrator.b(273872013806740L, 0L);
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

    private static void a() {
        Object[] objectArray = m;
        m[0] = "4V'";
        objectArray[1] = Integer.TYPE;
        StreamCipherOrchestrator.n[1] = "java/lang/Integer";
        objectArray[2] = ":\u001d\u000b\u001eC\u000b1\u0012\u001aQ>\u0013\"\u0015\u0013\u0018";
        objectArray[3] = "a$?-,\u0011j+.bM\u001fa *8";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "u p` \f'slZ7\u001b\u001c=1*'\r$?g\"\\Y\u007fv?7f\u0011r,uZ";
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = StreamCipherOrchestrator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = StreamCipherOrchestrator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == 'g' || c == '\u00ed' || c == 'U') {
                field = StreamCipherOrchestrator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = StreamCipherOrchestrator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'y' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'q' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public StreamCipherOrchestrator(ContextualExecutionFramework contextualExecutionFramework, String string) {
        long l = d ^ 0x251451630D66L;
        super(contextualExecutionFramework, string);
        this.A = ObjectLifecycleMediator.P;
        this.G = new LinkedList<NetworkPacketOrchestrator1222>();
        this.V = 0;
        this.N = NumericFormattingUtility.P(this, (String)((Object)StreamCipherOrchestrator.c("q", (int)StreamCipherOrchestrator.a("c", (int)3470, (long)(0x351842842AEF14F3L ^ l)), (long)-8809527825439963354L, (long)l)), (String)((Object)StreamCipherOrchestrator.c("q", (int)StreamCipherOrchestrator.a("c", (int)16898, (long)(0x2779554B48BDDB7BL ^ l)), (long)-8809527825439963354L, (long)l)), "", 0.0, 50.0, 100.0, 500.0);
        this.t = NumericFormattingUtility.P(this, (String)((Object)StreamCipherOrchestrator.c("q", (int)StreamCipherOrchestrator.a("c", (int)122, (long)(0x791333811CEF9906L ^ l)), (long)-8809527825439963354L, (long)l)), (String)((Object)StreamCipherOrchestrator.c("q", (int)StreamCipherOrchestrator.a("c", (int)31858, (long)(0x3F5CEB95ABC7E50CL ^ l)), (long)-8809527825439963354L, (long)l)), "", 0.0, 200.0, 250.0, 500.0);
        this.o = ConfigurationRegistry.R;
        this.N(this.N, this.t);
        this.o.y(this, 5);
    }

    private void g() {
        try {
            if (this.G.isEmpty()) {
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw StreamCipherOrchestrator.a(customSystemException);
        }
        boolean bl = false;
        if (System.currentTimeMillis() >= this.v) {
            AuthorizationManager authorizationManager = ApplicationLifecycleManager.U().U();
            for (NetworkPacketOrchestrator1222 networkPacketOrchestrator1222 : this.G) {
                this.A.Q(networkPacketOrchestrator1222.getPacket(), authorizationManager);
            }
            this.G.clear();
        }
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = StreamCipherOrchestrator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public String t() {
        long l = d ^ 0x7A840FF1641BL;
        Object object = StreamCipherOrchestrator.c("q", (int)StreamCipherOrchestrator.a("c", (int)15169, (long)(0x46CC4E2432934B43L ^ l)), (long)-1386235061985530277L, (long)l);
        if (!this.G.isEmpty()) {
            object = "\u00a7c" + (String)object;
        }
        return object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(StreamCipherOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(StreamCipherOrchestrator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

