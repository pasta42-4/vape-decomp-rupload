/*
 * Decompiled with CFR 0.152.
 */
package com.protocol.dynamic;

import a.Fc;
import com.app.transaction.TransactionMediator2514;
import com.collections.management.MultiContainerRegistry;
import com.events.management.EventLifecycleInterface;
import com.exception.system.CustomSystemException;
import com.metrics.analysis.DimensionalMetricsTracker;
import com.network.protocol.NetworkProtocolResolver1585;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DynamicProtocolResolver
implements EventLifecycleInterface,
Fc,
NetworkProtocolResolver1585,
TransactionMediator2514 {
    private int j;
    private int M;
    private static final long[] b;
    private int m;
    private int l;
    private static final Map d;
    private static final Integer[] c;
    private static final long a;

    @Override
    public TransactionMediator2514 N() {
        this.M = 0;
        return this;
    }

    @Override
    public Fc Y(int n) {
        this.j = n;
        return this;
    }

    @Override
    public TransactionMediator2514 p() {
        long l = a ^ 0x5DC24D036CA6L;
        this.M = (int)DynamicProtocolResolver.a("e", (int)29561, (long)(0x3D062461BBE617BDL ^ l));
        return this;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D35;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/O8", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicProtocolResolver.c[n2] = n3;
        }
        return c[n2];
    }

    @Override
    public TransactionMediator2514 I(boolean bl) {
        int n;
        long l = a ^ 0x12CB7656E595L;
        try {
            this.M = (int)DynamicProtocolResolver.a("e", (int)3813, (long)(0x49E1ADFB65C2E315L ^ l));
            DynamicProtocolResolver dynamicProtocolResolver = this;
            n = bl ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProtocolResolver.a(customSystemException);
        }
        dynamicProtocolResolver.l = n;
        return this;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicProtocolResolver.a = MultiContainerRegistry.a(1258989125592450300L, 9113613001033093516L, MethodHandles.lookup().lookupClass()).a(148676623468716L);
                DynamicProtocolResolver.d = new HashMap<K, V>(13);
                var0 = DynamicProtocolResolver.a ^ 134785977309635L;
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
                var6_5 = "\u00c3\u00e9\u0093\u00b4k\u00c0j\u0012\u00dc\u00b6\u00a2\u0099\u00ec\u00f5^o\u008f.M\u00b5\u0007\u00f9\u00f1\b";
                var7_6 = "\u00c3\u00e9\u0093\u00b4k\u00c0j\u0012\u00dc\u00b6\u00a2\u0099\u00ec\u00f5^o\u008f.M\u00b5\u0007\u00f9\u00f1\b".length();
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
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "wl\nNU\u00c8\u00fb\u0016\u00a4M\u00cb3V\u00a6'\u00a1";
                    var7_6 = "wl\nNU\u00c8\u00fb\u0016\u00a4M\u00cb3V\u00a6'\u00a1".length();
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
lbl39:
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        DynamicProtocolResolver.b = var8_3;
        DynamicProtocolResolver.c = new Integer[5];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/O8" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public DimensionalMetricsTracker S() {
        return new DimensionalMetricsTracker(this.j, this.m, this.l, this.M);
    }

    @Override
    public TransactionMediator2514 F() {
        this.M = 1;
        return this;
    }

    @Override
    public TransactionMediator2514 D(int n) {
        long l = a ^ 0x368B65CA32CCL;
        this.M = (int)DynamicProtocolResolver.a("e", (int)30424, (long)(0x43560F025CF74C75L ^ l));
        this.l = n;
        return this;
    }

    @Override
    public TransactionMediator2514 P() {
        return this.B(0);
    }

    @Override
    public TransactionMediator2514 B(int n) {
        long l = a ^ 0x5779988107B3L;
        this.M = (int)DynamicProtocolResolver.a("e", (int)6370, (long)(0x5A4E9B24D05B1732L ^ l));
        this.l = n;
        return this;
    }

    @Override
    public NetworkProtocolResolver1585 C(int n) {
        this.m = n;
        return this;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicProtocolResolver.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    @Override
    public TransactionMediator2514 J(boolean bl) {
        int n;
        long l = a ^ 0x4B278D55AAB8L;
        try {
            this.M = (int)DynamicProtocolResolver.a("e", (int)12266, (long)(0x13B9A61AF81A0D32L ^ l));
            DynamicProtocolResolver dynamicProtocolResolver = this;
            n = bl ? 1 : 0;
        }
        catch (CustomSystemException customSystemException) {
            throw DynamicProtocolResolver.a(customSystemException);
        }
        dynamicProtocolResolver.l = n;
        return this;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicProtocolResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

