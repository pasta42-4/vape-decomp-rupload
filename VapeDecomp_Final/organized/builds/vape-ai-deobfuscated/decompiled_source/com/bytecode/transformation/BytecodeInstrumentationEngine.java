/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.transformation;

import a.zY;
import com.app.configuration.ConfigurationDescriptor1455;
import com.app.models.EntityDescriptor;
import com.bytecode.analysis.BytecodeMetadataAnalyzer1072;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.security.crypto.CryptoContextManager1052;
import com.security.exchange.CryptoKeyExchangeMapping;
import com.system.extensions.ExtendedApiResolver;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class BytecodeInstrumentationEngine {
    private static final long ab;
    protected final int T;
    private static final Integer[] db;
    private static final Map eb;
    protected BytecodeInstrumentationEngine t;
    private static final long[] cb;
    private static boolean q;

    public static void c(boolean bl) {
        q = bl;
    }

    public void M(int n, String string, String string2, String string3, boolean bl) {
        block12: {
            boolean bl2;
            boolean bl3;
            block14: {
                block13: {
                    long l = ab ^ 0x1450CDE56566L;
                    try {
                        try {
                            try {
                                if (this.T >= BytecodeInstrumentationEngine.a(22546, 0x63E21C701F9627A7L ^ l) || (n & 0x100) != 0) break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                            }
                            bl3 = bl;
                            if (n != 185) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                        }
                        bl2 = true;
                        break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                    }
                }
                bl2 = false;
            }
            try {
                if (bl3 != bl2) {
                    throw new UnsupportedOperationException("INVOKESPECIAL/STATIC on interfaces requires ASM5");
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeInstrumentationEngine.b(illegalArgumentException);
            }
            this.D(n, string, string2, string3);
            return;
        }
        try {
            if (this.t != null) {
                this.t.M(n & 0xFFFFFEFF, string, string2, string3, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void K(int n, int n2, CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping ... cryptoKeyExchangeMappingArray) {
        try {
            if (this.t != null) {
                this.t.K(n, n2, cryptoKeyExchangeMapping, cryptoKeyExchangeMappingArray);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void v() {
        try {
            if (this.t != null) {
                this.t.v();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x360D;
        if (db[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = cb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])eb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    eb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/NV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            BytecodeInstrumentationEngine.db[n2] = n3;
        }
        return db[n2];
    }

    public void K(int n, int n2, Object[] objectArray, int n3, Object[] objectArray2) {
        try {
            if (this.t != null) {
                this.t.K(n, n2, objectArray, n3, objectArray2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void p(String string, int n) {
        long l = ab ^ 0x173DCDB4D686L;
        try {
            if (this.T < BytecodeInstrumentationEngine.a(22546, 0x63E21F1D1FC79447L ^ l)) {
                throw new UnsupportedOperationException("This feature requires ASM5");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        try {
            if (this.t != null) {
                this.t.p(string, n);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void e(int n, int n2) {
        try {
            if (this.t != null) {
                this.t.e(n, n2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                BytecodeInstrumentationEngine.ab = MultiContainerRegistry.a(7432630182397790618L, -6417369066495781442L, null).a(56637661713664L);
                BytecodeInstrumentationEngine.eb = new HashMap<K, V>(13);
                BytecodeInstrumentationEngine.c(true);
                var0 = BytecodeInstrumentationEngine.ab ^ 21861471729797L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u009bls\u0081\u0002]\u00e4?\u009b\u0014ny\u00af\u00db\u00ad\u0092\u00d1+\u0094|\u0006Z@R\u00cd\u00d6E*-`,\u00a1\u00ab\u00a7v\u00c3/\u0015Z<6H\u00c9\u00e9A\u00ca:}\u00b6\u00cdj\u008a2z\u0014\u001f\u008d\u00d95\u00ca\u0090\u0085f\u00bf";
                var7_6 = "\u009bls\u0081\u0002]\u00e4?\u009b\u0014ny\u00af\u00db\u00ad\u0092\u00d1+\u0094|\u0006Z@R\u00cd\u00d6E*-`,\u00a1\u00ab\u00a7v\u00c3/\u0015Z<6H\u00c9\u00e9A\u00ca:}\u00b6\u00cdj\u008a2z\u0014\u001f\u008d\u00d95\u00ca\u0090\u0085f\u00bf".length();
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
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0012p\u00999&oy\u00ea|\u00ff\"\u00b3\u00ea!\u00d0\u00ec";
                    var7_6 = "\u0012p\u00999&oy\u00ea|\u00ff\"\u00b3\u00ea!\u00d0\u00ec".length();
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
lbl40:
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
lbl53:
                // 1 sources

                ** continue;
            }
        }
        BytecodeInstrumentationEngine.cb = var8_3;
        BytecodeInstrumentationEngine.db = new Integer[10];
    }

    protected BytecodeInstrumentationEngine(int n, BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        long l;
        block16: {
            l = ab ^ 0x60EE4E4783B3L;
            if (n != BytecodeInstrumentationEngine.a(21711, 0x264976BD7DFD4DADL ^ l)) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (n == BytecodeInstrumentationEngine.a(22044, 0x2B0A19F14C99CF79L ^ l) || n == BytecodeInstrumentationEngine.a(24322, 0x3E934C048618466BL ^ l)) break block16;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                                    }
                                    if (n == BytecodeInstrumentationEngine.a(2821, 0x31F603CBBB909262L ^ l)) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                                }
                                if (n == BytecodeInstrumentationEngine.a(22546, 0x63E268CE9C34C172L ^ l)) break block16;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                            }
                            if (n == BytecodeInstrumentationEngine.a(7497, 0x69B713A3DA31842FL ^ l)) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                        }
                        if (n == BytecodeInstrumentationEngine.a(15371, 0x3F04364BECA9A56AL ^ l)) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                    }
                    throw new IllegalArgumentException("Unsupported api " + n);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                }
            }
        }
        try {
            if (n == BytecodeInstrumentationEngine.a(19136, 0x7ACB5AA1E7BBD3A3L ^ l)) {
                BytecodeMetadataAnalyzer1072.h(this);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        this.T = n;
        this.t = bytecodeInstrumentationEngine;
    }

    public void c(int n, int n2) {
        try {
            if (this.t != null) {
                this.t.c(n, n2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void A(int n, String string, String string2, String string3) {
        try {
            if (this.t != null) {
                this.t.A(n, string, string2, string3);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    private static IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Deprecated
    public void D(int n, String string, String string2, String string3) {
        boolean bl;
        String string4;
        String string5;
        String string6;
        int n2;
        BytecodeInstrumentationEngine bytecodeInstrumentationEngine;
        int n3;
        int n4;
        long l = ab ^ 0x2A13B4DF3A71L;
        try {
            n4 = n;
            n3 = this.T < BytecodeInstrumentationEngine.a(22546, 0x63E2223366AC78B0L ^ l) ? 256 : 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        int n5 = n4 | n3;
        try {
            bytecodeInstrumentationEngine = this;
            n2 = n5;
            string6 = string;
            string5 = string2;
            string4 = string3;
            bl = n == 185;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        bytecodeInstrumentationEngine.M(n2, string6, string5, string4, bl);
    }

    public ExtendedApiResolver I(int n, String string, boolean bl) {
        try {
            if (this.t != null) {
                return this.t.I(n, string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        return null;
    }

    public ExtendedApiResolver h(int n, ErrorDiagnosticTracker errorDiagnosticTracker, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray2, int[] nArray, String string, boolean bl) {
        long l = ab ^ 0x18DB35A95B7FL;
        try {
            if (this.T < BytecodeInstrumentationEngine.a(22546, 0x63E210FBE7DA19BEL ^ l)) {
                throw new UnsupportedOperationException("This feature requires ASM5");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        try {
            if (this.t != null) {
                return this.t.h(n, errorDiagnosticTracker, cryptoKeyExchangeMappingArray, cryptoKeyExchangeMappingArray2, nArray, string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        return null;
    }

    public ExtendedApiResolver Q(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        long l = ab ^ 0xFEADAEB1093L;
        try {
            if (this.T < BytecodeInstrumentationEngine.a(22546, 0x63E207CA08985252L ^ l)) {
                throw new UnsupportedOperationException("This feature requires ASM5");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        try {
            if (this.t != null) {
                return this.t.Q(n, errorDiagnosticTracker, string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        return null;
    }

    public void F(int n, int n2) {
        try {
            if (this.t != null) {
                this.t.F(n, n2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public ExtendedApiResolver B(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        long l = ab ^ 0x309DF1F8C330L;
        try {
            if (this.T < BytecodeInstrumentationEngine.a(22546, 0x63E238BD238B81F1L ^ l)) {
                throw new UnsupportedOperationException("This feature requires ASM5");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        try {
            if (this.t != null) {
                return this.t.B(n, errorDiagnosticTracker, string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        return null;
    }

    public void I(String string, String string2, String string3, CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping cryptoKeyExchangeMapping2, int n) {
        try {
            if (this.t != null) {
                this.t.I(string, string2, string3, cryptoKeyExchangeMapping, cryptoKeyExchangeMapping2, n);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public ExtendedApiResolver p(String string, boolean bl) {
        try {
            if (this.t != null) {
                return this.t.p(string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        return null;
    }

    public void u(CryptoContextManager1052 cryptoContextManager1052) {
        try {
            if (this.t != null) {
                this.t.u(cryptoContextManager1052);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    protected BytecodeInstrumentationEngine(int n) {
        this(n, null);
    }

    public static boolean S() {
        boolean bl = BytecodeInstrumentationEngine.I();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        return false;
    }

    public void z(CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        try {
            if (this.t != null) {
                this.t.z(cryptoKeyExchangeMapping);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void r(int n, CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        try {
            if (this.t != null) {
                this.t.r(n, cryptoKeyExchangeMapping);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void D(int n, boolean bl) {
        try {
            if (this.t != null) {
                this.t.D(n, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void s(String string, int n) {
        try {
            if (this.t != null) {
                this.t.s(string, n);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void O(CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping cryptoKeyExchangeMapping2, CryptoKeyExchangeMapping cryptoKeyExchangeMapping3, String string) {
        try {
            if (this.t != null) {
                this.t.O(cryptoKeyExchangeMapping, cryptoKeyExchangeMapping2, cryptoKeyExchangeMapping3, string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void D() {
        try {
            if (this.t != null) {
                this.t.D();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void n(int n, int n2) {
        try {
            if (this.t != null) {
                this.t.n(n, n2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void Z(Object object) {
        block17: {
            long l;
            block15: {
                l = ab ^ 0x515B2AD46B5BL;
                try {
                    block16: {
                        try {
                            try {
                                try {
                                    if (this.T >= BytecodeInstrumentationEngine.a(22546, 0x63E2597BF8A7299AL ^ l)) break block15;
                                    if (object instanceof ConfigurationDescriptor1455) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                                }
                                if (!(object instanceof zY)) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                            }
                            if (((zY)object).T() != 11) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                        }
                    }
                    throw new UnsupportedOperationException("This feature requires ASM5");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                }
            }
            try {
                try {
                    if (this.T >= BytecodeInstrumentationEngine.a(11049, 0x55853BFA06FFDAA9L ^ l) || !(object instanceof EntityDescriptor)) break block17;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeInstrumentationEngine.b(illegalArgumentException);
                }
                throw new UnsupportedOperationException("This feature requires ASM7");
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeInstrumentationEngine.b(illegalArgumentException);
            }
        }
        try {
            if (this.t != null) {
                this.t.Z(object);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public ExtendedApiResolver J() {
        try {
            if (this.t != null) {
                return this.t.J();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        return null;
    }

    public void v(CryptoKeyExchangeMapping cryptoKeyExchangeMapping, int[] nArray, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray) {
        try {
            if (this.t != null) {
                this.t.v(cryptoKeyExchangeMapping, nArray, cryptoKeyExchangeMappingArray);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void E(int n, CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        try {
            if (this.t != null) {
                this.t.E(n, cryptoKeyExchangeMapping);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void f(String string, String string2, ConfigurationDescriptor1455 configurationDescriptor1455, Object ... objectArray) {
        long l = ab ^ 0x1A561642AEADL;
        try {
            if (this.T < BytecodeInstrumentationEngine.a(22546, 0x63E21276C431EC6CL ^ l)) {
                throw new UnsupportedOperationException("This feature requires ASM5");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        try {
            if (this.t != null) {
                this.t.f(string, string2, configurationDescriptor1455, objectArray);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void T(int n) {
        try {
            if (this.t != null) {
                this.t.T(n);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public void n(int n, String string) {
        try {
            if (this.t != null) {
                this.t.n(n, string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
    }

    public ExtendedApiResolver E(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        long l = ab ^ 0x742172FE5A6BL;
        try {
            if (this.T < BytecodeInstrumentationEngine.a(1752, 0x18B3ED42BD514664L ^ l)) {
                throw new UnsupportedOperationException("This feature requires ASM5");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        try {
            if (this.t != null) {
                return this.t.E(n, errorDiagnosticTracker, string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeInstrumentationEngine.b(illegalArgumentException);
        }
        return null;
    }

    public static boolean I() {
        return q;
    }
}

