/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import a.Rr;
import com.bytecode.analysis.BytecodeMetadataAnalyzer1072;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.security.crypto.CryptoContextManager1052;
import com.system.compatibility.ApiCompatibilityValidator;
import com.system.compatibility.LegacyApiInterceptor;
import com.system.extensions.ExtendedApiResolver;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class BytecodeMetadataAnalyzer {
    private static final long f;
    private static final long[] g;
    protected BytecodeMetadataAnalyzer p;
    private static final Integer[] h;
    private static final Map i;
    protected final int c;

    public LegacyApiInterceptor G(String string, String string2, String string3) {
        long l = f ^ 0x61BBD3B60701L;
        try {
            if (this.c < BytecodeMetadataAnalyzer.a(31692, 0xFEFE428C8B57933L ^ l)) {
                throw new UnsupportedOperationException("Record requires ASM8");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        try {
            if (this.p != null) {
                return this.p.G(string, string2, string3);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        return null;
    }

    public ExtendedApiResolver e(String string, boolean bl) {
        try {
            if (this.p != null) {
                return this.p.e(string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        return null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x78D;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
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
                throw new RuntimeException("a/YL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            BytecodeMetadataAnalyzer.h[n2] = n3;
        }
        return h[n2];
    }

    public void H(String string) {
        long l = f ^ 0x11E39AB5A796L;
        try {
            if (this.c < BytecodeMetadataAnalyzer.a(29029, 0x735C2C92046F5302L ^ l)) {
                throw new UnsupportedOperationException("NestHost requires ASM7");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        try {
            if (this.p != null) {
                this.p.H(string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
    }

    public void G(String string, String string2, String string3, int n) {
        try {
            if (this.p != null) {
                this.p.G(string, string2, string3, n);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
    }

    public ApiCompatibilityValidator d(int n, String string, String string2, String string3, Object object) {
        try {
            if (this.p != null) {
                return this.p.d(n, string, string2, string3, object);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        return null;
    }

    public void S(String string, String string2, String string3) {
        try {
            if (this.p != null) {
                this.p.S(string, string2, string3);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
    }

    protected BytecodeMetadataAnalyzer(int n) {
        this(n, null);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public void j(String string, String string2) {
        try {
            if (this.p != null) {
                this.p.j(string, string2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
    }

    public void D(String string) {
        long l = f ^ 0x2EB1F77A3318L;
        try {
            if (this.c < BytecodeMetadataAnalyzer.a(11610, 0x1EB95F7245A59BBBL ^ l)) {
                throw new UnsupportedOperationException("NestMember requires ASM7");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        try {
            if (this.p != null) {
                this.p.D(string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
    }

    public void m(String string) {
        long l = f ^ 0x436B11FAA4D6L;
        try {
            if (this.c < BytecodeMetadataAnalyzer.a(1521, 0x7C517D2DB05CA4D0L ^ l)) {
                throw new UnsupportedOperationException("PermittedSubclasses requires ASM9");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        try {
            if (this.p != null) {
                this.p.m(string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
    }

    public void u(int n, int n2, String string, String string2, String string3, String[] stringArray) {
        block7: {
            long l = f ^ 0x49AFAD9E3304L;
            try {
                try {
                    if (this.c >= BytecodeMetadataAnalyzer.a(4942, 0x463782743077A5B8L ^ l) || (n2 & BytecodeMetadataAnalyzer.a(8269, 0x5624961E14EA96B9L ^ l)) == 0) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
                }
                throw new UnsupportedOperationException("Records requires ASM8");
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
            }
        }
        try {
            if (this.p != null) {
                this.p.u(n, n2, string, string2, string3, stringArray);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
    }

    public BytecodeInstrumentationEngine q(int n, String string, String string2, String string3, String[] stringArray) {
        try {
            if (this.p != null) {
                return this.p.q(n, string, string2, string3, stringArray);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        return null;
    }

    public void p(CryptoContextManager1052 cryptoContextManager1052) {
        try {
            if (this.p != null) {
                this.p.p(cryptoContextManager1052);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
    }

    public void t() {
        try {
            if (this.p != null) {
                this.p.t();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
    }

    protected BytecodeMetadataAnalyzer(int n, BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer) {
        long l;
        block16: {
            l = f ^ 0x4C9A09AF7DBDL;
            if (n != BytecodeMetadataAnalyzer.a(10096, 0x7EB2D9CA1BCB5F31L ^ l)) {
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (n == BytecodeMetadataAnalyzer.a(4942, 0x463787419446EB01L ^ l) || n == BytecodeMetadataAnalyzer.a(29029, 0x735C71EB97758929L ^ l)) break block16;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
                                    }
                                    if (n == BytecodeMetadataAnalyzer.a(27005, 0x499F017E0C2D113BL ^ l)) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
                                }
                                if (n == BytecodeMetadataAnalyzer.a(32589, 0x4C85AF0D24BC8703L ^ l)) break block16;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
                            }
                            if (n == BytecodeMetadataAnalyzer.a(29800, 0x3433C91A77AA0C2FL ^ l)) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
                        }
                        if (n == BytecodeMetadataAnalyzer.a(22648, 0x32A499F1980CA038L ^ l)) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException("Unsupported api " + n);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
                }
            }
        }
        try {
            if (n == BytecodeMetadataAnalyzer.a(25618, 0x7B614CD610601C50L ^ l)) {
                BytecodeMetadataAnalyzer1072.h(this);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        this.c = n;
        this.p = bytecodeMetadataAnalyzer;
    }

    public ExtendedApiResolver N(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        long l = f ^ 0x14DE52C925DAL;
        try {
            if (this.c < BytecodeMetadataAnalyzer.a(22476, 0x6AB16DE45E5BF7E0L ^ l)) {
                throw new UnsupportedOperationException("TypeAnnotation requires ASM5");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        try {
            if (this.p != null) {
                return this.p.N(n, errorDiagnosticTracker, string, bl);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                BytecodeMetadataAnalyzer.f = MultiContainerRegistry.a(-7012497281395663693L, 8307925401088335391L, null).a(241034685787929L);
                BytecodeMetadataAnalyzer.i = new HashMap<K, V>(13);
                var0 = BytecodeMetadataAnalyzer.f ^ 27234118528697L;
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
                var8_3 = new long[14];
                var5_4 = 0;
                var6_5 = "\u00e2\u00177\u00ecLy\u00b8S}\u009d\u00ca\u0097\u0087PM\u00edgz\u001f\u0083\u00a6\u007f\u00favk\u0002\u00a2\u001bH\u00fd.\u00e3\u00cd\u0087\u00c8\u0001\u00bd9*\u00fb\u0088X\u00c1d\u0017H-\u00d9M^\u00ec\u0018\u00f56j\u00afw\u0084\u0083\u00a7\u0003A\u00e1li\u00f8~5\u0002\u0080\u001b\u0012\u0012\u00ae\u00ec\u0090\u0000'\u00ed\u00a46\u00f10)\u00bc(\u00b8E\u00b6\b\u0090|\u0082\u001c\u00fc\u0005";
                var7_6 = "\u00e2\u00177\u00ecLy\u00b8S}\u009d\u00ca\u0097\u0087PM\u00edgz\u001f\u0083\u00a6\u007f\u00favk\u0002\u00a2\u001bH\u00fd.\u00e3\u00cd\u0087\u00c8\u0001\u00bd9*\u00fb\u0088X\u00c1d\u0017H-\u00d9M^\u00ec\u0018\u00f56j\u00afw\u0084\u0083\u00a7\u0003A\u00e1li\u00f8~5\u0002\u0080\u001b\u0012\u0012\u00ae\u00ec\u0090\u0000'\u00ed\u00a46\u00f10)\u00bc(\u00b8E\u00b6\b\u0090|\u0082\u001c\u00fc\u0005".length();
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
                    var6_5 = "rY\u00e6\u00b1.\u00fb:c\u0018\u00e9\u00b2|=\u00ef/#";
                    var7_6 = "rY\u00e6\u00b1.\u00fb:c\u0018\u00e9\u00b2|=\u00ef/#".length();
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
        BytecodeMetadataAnalyzer.g = var8_3;
        BytecodeMetadataAnalyzer.h = new Integer[14];
    }

    public Rr S(String string, int n, String string2) {
        long l = f ^ 0x583370AD423AL;
        try {
            if (this.c < BytecodeMetadataAnalyzer.a(16011, 0x3F0B9A3ACA4D7949L ^ l)) {
                throw new UnsupportedOperationException("Module requires ASM6");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        try {
            if (this.p != null) {
                return this.p.S(string, n, string2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeMetadataAnalyzer.a(illegalArgumentException);
        }
        return null;
    }
}

