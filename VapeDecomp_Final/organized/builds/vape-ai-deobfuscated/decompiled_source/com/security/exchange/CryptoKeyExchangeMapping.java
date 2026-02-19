/*
 * Decompiled with CFR 0.152.
 */
package com.security.exchange;

import com.app.connection.ConnectionPoolManager2695;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.security.orchestration.CryptoOperationOrchestrator951;
import com.text.encoding.EncodingUtilityManager;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class CryptoKeyExchangeMapping {
    CryptoKeyExchangeMapping h;
    private int[] Z;
    short a;
    short t;
    private short R;
    short g;
    private static final long[] d;
    short C;
    short u;
    private static final long c;
    int n;
    private int[] o;
    ConnectionPoolManager2695 e;
    private static final Map i;
    static final CryptoKeyExchangeMapping z;
    CryptoOperationOrchestrator951 b;
    CryptoKeyExchangeMapping E;
    public Object O;
    private static final Integer[] f;

    private CryptoKeyExchangeMapping Q(CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping2 = cryptoKeyExchangeMapping;
        ConnectionPoolManager2695 connectionPoolManager2695 = this.e;
        while (true) {
            block11: {
                boolean bl;
                block10: {
                    block9: {
                        try {
                            try {
                                try {
                                    if (connectionPoolManager2695 == null) break;
                                    if ((this.C & 0x10) == 0) break block9;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw CryptoKeyExchangeMapping.a(customSystemException);
                                }
                                if (connectionPoolManager2695 != this.e.P) break block9;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoKeyExchangeMapping.a(customSystemException);
                            }
                            bl = true;
                            break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoKeyExchangeMapping.a(customSystemException);
                        }
                    }
                    bl = false;
                }
                boolean bl2 = bl;
                try {
                    if (bl2 || connectionPoolManager2695.n.E != null) break block11;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoKeyExchangeMapping.a(customSystemException);
                }
                connectionPoolManager2695.n.E = cryptoKeyExchangeMapping2;
                cryptoKeyExchangeMapping2 = connectionPoolManager2695.n;
            }
            connectionPoolManager2695 = connectionPoolManager2695.P;
        }
        return cryptoKeyExchangeMapping2;
    }

    final void L(CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping2;
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping3 = z;
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping4 = this;
        cryptoKeyExchangeMapping4.E = z;
        while (cryptoKeyExchangeMapping4 != z) {
            block6: {
                cryptoKeyExchangeMapping2 = cryptoKeyExchangeMapping4;
                cryptoKeyExchangeMapping4 = cryptoKeyExchangeMapping2.E;
                cryptoKeyExchangeMapping2.E = cryptoKeyExchangeMapping3;
                cryptoKeyExchangeMapping3 = cryptoKeyExchangeMapping2;
                try {
                    try {
                        if ((cryptoKeyExchangeMapping2.C & 0x40) == 0 || cryptoKeyExchangeMapping2.a == cryptoKeyExchangeMapping.a) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoKeyExchangeMapping.a(customSystemException);
                    }
                    cryptoKeyExchangeMapping2.e = new ConnectionPoolManager2695(cryptoKeyExchangeMapping2.g, cryptoKeyExchangeMapping.e.n, cryptoKeyExchangeMapping2.e);
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoKeyExchangeMapping.a(customSystemException);
                }
            }
            cryptoKeyExchangeMapping4 = cryptoKeyExchangeMapping2.Q(cryptoKeyExchangeMapping4);
        }
        while (cryptoKeyExchangeMapping3 != z) {
            cryptoKeyExchangeMapping2 = cryptoKeyExchangeMapping3.E;
            cryptoKeyExchangeMapping3.E = null;
            cryptoKeyExchangeMapping3 = cryptoKeyExchangeMapping2;
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }

    final boolean F(byte[] byArray, int n) {
        long l = c ^ 0x40BFB3399CD2L;
        try {
            this.C = (short)(this.C | 4);
            this.n = n;
            if (this.Z == null) {
                return false;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyExchangeMapping.a(customSystemException);
        }
        boolean bl = false;
        for (int i = this.Z[0]; i > 0; i -= 2) {
            int n2;
            block10: {
                block12: {
                    int n3;
                    block11: {
                        n3 = this.Z[i - 1];
                        int n4 = this.Z[i];
                        n2 = n - n3;
                        int n5 = n4 & CryptoKeyExchangeMapping.a(22109, 0x1CDB0FAC9B02167L ^ l);
                        try {
                            try {
                                if ((n4 & CryptoKeyExchangeMapping.a(8867, 0x5912DF1929E0559CL ^ l)) != CryptoKeyExchangeMapping.a(18043, 0x7B6F474A2C67B140L ^ l)) break block10;
                                if (n2 < Short.MIN_VALUE) break block11;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoKeyExchangeMapping.a(customSystemException);
                            }
                            if (n2 <= Short.MAX_VALUE) break block12;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoKeyExchangeMapping.a(customSystemException);
                        }
                    }
                    int n6 = byArray[n3] & 0xFF;
                    try {
                        byArray[n3] = n6 < 198 ? (byte)(n6 + 49) : (byte)(n6 + 20);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw CryptoKeyExchangeMapping.a(customSystemException);
                    }
                    bl = true;
                }
                byArray[n5++] = (byte)(n2 >>> 8);
                byArray[n5] = (byte)n2;
                continue;
            }
            byArray[n5++] = (byte)(n2 >>> 24);
            byArray[n5++] = (byte)(n2 >>> 16);
            byArray[n5++] = (byte)(n2 >>> 8);
            byArray[n5] = (byte)n2;
        }
        return bl;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7949;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/lc", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoKeyExchangeMapping.f[n2] = n3;
        }
        return f[n2];
    }

    private void a(int n, int n2, int n3) {
        try {
            if (this.Z == null) {
                this.Z = new int[6];
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyExchangeMapping.a(customSystemException);
        }
        int n4 = this.Z[0];
        if (n4 + 2 >= this.Z.length) {
            int[] nArray = new int[this.Z.length + 6];
            System.arraycopy(this.Z, 0, nArray, 0, this.Z.length);
            this.Z = nArray;
        }
        this.Z[++n4] = n;
        this.Z[++n4] = n2 | n3;
        this.Z[0] = n4;
    }

    final void q(short s2) {
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping = this;
        cryptoKeyExchangeMapping.E = z;
        while (cryptoKeyExchangeMapping != z) {
            CryptoKeyExchangeMapping cryptoKeyExchangeMapping2 = cryptoKeyExchangeMapping;
            cryptoKeyExchangeMapping = cryptoKeyExchangeMapping.E;
            cryptoKeyExchangeMapping2.E = null;
            if (cryptoKeyExchangeMapping2.a != 0) continue;
            cryptoKeyExchangeMapping2.a = s2;
            cryptoKeyExchangeMapping = cryptoKeyExchangeMapping2.Q(cryptoKeyExchangeMapping);
        }
    }

    final void D(EncodingUtilityManager encodingUtilityManager, int n, boolean bl) {
        block8: {
            block9: {
                block6: {
                    long l;
                    block7: {
                        l = c ^ 0x4D2ADED90202L;
                        try {
                            try {
                                if ((this.C & 4) != 0) break block6;
                                if (!bl) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw CryptoKeyExchangeMapping.a(customSystemException);
                            }
                            this.a(n, CryptoKeyExchangeMapping.a(13545, 0x2DBB637F9D295D01L ^ l), encodingUtilityManager.I);
                            encodingUtilityManager.y(-1);
                            break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw CryptoKeyExchangeMapping.a(customSystemException);
                        }
                    }
                    this.a(n, CryptoKeyExchangeMapping.a(9528, 0x7C97988E07C8CCD1L ^ l), encodingUtilityManager.I);
                    encodingUtilityManager.f(-1);
                    break block8;
                }
                try {
                    if (!bl) break block9;
                    encodingUtilityManager.y(this.n - n);
                    break block8;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoKeyExchangeMapping.a(customSystemException);
                }
            }
            encodingUtilityManager.f(this.n - n);
        }
    }

    final void Q(BytecodeInstrumentationEngine bytecodeInstrumentationEngine, boolean bl) {
        block7: {
            long l = c ^ 0x5B02B06FDC96L;
            try {
                try {
                    bytecodeInstrumentationEngine.z(this);
                    if (!bl || this.R == 0) break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoKeyExchangeMapping.a(customSystemException);
                }
                bytecodeInstrumentationEngine.E(this.R & CryptoKeyExchangeMapping.a(9960, 0x636B12AA9F4F9192L ^ l), this);
                if (this.o == null) break block7;
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoKeyExchangeMapping.a(customSystemException);
            }
            try {
                for (int i = 1; i <= this.o[0]; ++i) {
                    bytecodeInstrumentationEngine.E(this.o[i], this);
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoKeyExchangeMapping.a(customSystemException);
            }
        }
    }

    final void i(int n) {
        block7: {
            block6: {
                try {
                    if (this.R != 0) break block6;
                    this.R = (short)n;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw CryptoKeyExchangeMapping.a(customSystemException);
                }
            }
            try {
                if (this.o == null) {
                    this.o = new int[4];
                }
            }
            catch (CustomSystemException customSystemException) {
                throw CryptoKeyExchangeMapping.a(customSystemException);
            }
            this.o[0] = this.o[0] + 1;
            int n2 = this.o[0];
            if (n2 >= this.o.length) {
                int[] nArray = new int[this.o.length + 4];
                System.arraycopy(this.o, 0, nArray, 0, this.o.length);
                this.o = nArray;
            }
            this.o[n2] = n;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoKeyExchangeMapping.c = MultiContainerRegistry.a(-8915645111045143560L, 7375810797049058169L, null).a(89085235349111L);
                CryptoKeyExchangeMapping.i = new HashMap<K, V>(13);
                var0 = CryptoKeyExchangeMapping.c ^ 54885373076034L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "P]\u001d\u00af\u00cd\u00f1\u00bbi\u009b\u00cc\u00a1Mk\u00b6\u00a2?e/\u00d7\u00aa\u00af\u0099\u00f8\u00e1\u00c3\u00de\u00f5\u0088\u00e0EE\u00d2";
                var7_6 = "P]\u001d\u00af\u00cd\u00f1\u00bbi\u009b\u00cc\u00a1Mk\u00b6\u00a2?e/\u00d7\u00aa\u00af\u0099\u00f8\u00e1\u00c3\u00de\u00f5\u0088\u00e0EE\u00d2".length();
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
                    var6_5 = "\u00ca\u0094\u00ce\u0003\u000e\u00b4\u00e6\u008d\u009ebj\u00b9\u0087\u00a9\u009b\u000f";
                    var7_6 = "\u00ca\u0094\u00ce\u0003\u000e\u00b4\u00e6\u008d\u009ebj\u00b9\u0087\u00a9\u009b\u000f".length();
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
        CryptoKeyExchangeMapping.d = var8_3;
        CryptoKeyExchangeMapping.f = new Integer[6];
        CryptoKeyExchangeMapping.z = new CryptoKeyExchangeMapping();
    }

    final CryptoKeyExchangeMapping a() {
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping;
        try {
            cryptoKeyExchangeMapping = this.b == null ? this : this.b.M;
        }
        catch (CustomSystemException customSystemException) {
            throw CryptoKeyExchangeMapping.a(customSystemException);
        }
        return cryptoKeyExchangeMapping;
    }
}

