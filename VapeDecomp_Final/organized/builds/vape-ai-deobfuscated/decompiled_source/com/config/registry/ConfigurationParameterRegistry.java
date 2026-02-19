/*
 * Decompiled with CFR 0.152.
 */
package com.config.registry;

import a.aN;
import a.aX;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.exception.system.CustomSystemException;
import com.performance.management.ComputationalRateController;
import com.security.crypto.CryptoContextManager1052;
import com.system.compatibility.ApiCompatibilityValidator;
import com.system.extensions.ExtendedApiResolver;
import com.text.encoding.EncodingUtilityManager;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class ConfigurationParameterRegistry
extends ApiCompatibilityValidator {
    private final int u;
    private final int r;
    private static final Integer[] h;
    private int q;
    private aN b;
    private aN W;
    private aN Q;
    private CryptoContextManager1052 j;
    private final aX A;
    private static final Map i;
    private static final long[] f;
    private aN K;
    private int y;
    private final int M;
    private static final long c;

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = MultiContainerRegistry.a(6243348763940761945L, -240110113578249776L, null).a(156001982137957L);
        i = new HashMap(13);
        long l = c ^ 0x6B3E6C1D3E2CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "3\u00cf\u00ad\u0088r-\u00ad\u00f8\u00a15J\u00c7x\u00e0\n\u0014";
        int n2 = "3\u00cf\u00ad\u0088r-\u00ad\u00f8\u00a15J\u00c7x\u00e0\n\u0014".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        f = lArray;
        h = new Integer[2];
    }

    public ExtendedApiResolver N(String string, boolean bl) {
        try {
            if (bl) {
                this.K = aN.H(this.A, string, this.K);
                return this.K;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
        this.Q = aN.H(this.A, string, this.Q);
        return this.Q;
    }

    void x(EncodingUtilityManager encodingUtilityManager) {
        int n;
        long l;
        block36: {
            int n2;
            boolean bl;
            l = c ^ 0x4C644E28ED7BL;
            try {
                bl = this.A.q() < 49;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationParameterRegistry.a(customSystemException);
            }
            boolean bl2 = bl;
            try {
                n2 = bl2 ? 4096 : 0;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationParameterRegistry.a(customSystemException);
            }
            int n3 = n2;
            encodingUtilityManager.f(this.M & ~n3).f(this.r).f(this.u);
            n = 0;
            try {
                if (this.y != 0) {
                    ++n;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationParameterRegistry.a(customSystemException);
            }
            try {
                try {
                    if ((this.M & 0x1000) == 0 || !bl2) break block36;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationParameterRegistry.a(customSystemException);
                }
                ++n;
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationParameterRegistry.a(customSystemException);
            }
        }
        try {
            if (this.q != 0) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
        try {
            if ((this.M & ConfigurationParameterRegistry.b(19752, 0x6054E0D5B8D5552AL ^ l)) != 0) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
        try {
            if (this.K != null) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
        try {
            if (this.Q != null) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
        try {
            if (this.W != null) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
        try {
            if (this.b != null) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
        if (this.j != null) {
            n += this.j.f();
        }
        try {
            encodingUtilityManager.f(n);
            if (this.y != 0) {
                encodingUtilityManager.f(this.A.j("ConstantValue")).y(2).f(this.y);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
        try {
            CryptoContextManager1052.F(this.A, this.M, this.q, encodingUtilityManager);
            aN.r(this.A, this.K, this.Q, this.W, this.b, encodingUtilityManager);
            if (this.j != null) {
                this.j.y(this.A, encodingUtilityManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
    }

    int q() {
        int n = 8;
        try {
            if (this.y != 0) {
                this.A.j("ConstantValue");
                n += 8;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
        n += CryptoContextManager1052.z(this.A, this.M, this.q);
        n += aN.m(this.K, this.Q, this.W, this.b);
        if (this.j != null) {
            n += this.j.X(this.A);
        }
        return n;
    }

    public void a(CryptoContextManager1052 cryptoContextManager1052) {
        cryptoContextManager1052.a = this.j;
        this.j = cryptoContextManager1052;
    }

    final void S(ComputationalRateController computationalRateController) {
        computationalRateController.O(this.j);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1B4D;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
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
                throw new RuntimeException("a/IU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigurationParameterRegistry.h[n2] = n3;
        }
        return h[n2];
    }

    public ExtendedApiResolver q(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        try {
            if (bl) {
                this.W = aN.h(this.A, n, errorDiagnosticTracker, string, this.W);
                return this.W;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
        this.b = aN.h(this.A, n, errorDiagnosticTracker, string, this.b);
        return this.b;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    ConfigurationParameterRegistry(aX aX2, int n, String string, String string2, String string3, Object object) {
        long l = c ^ 0x30D8AD03CC0BL;
        super(ConfigurationParameterRegistry.b(30250, 0x50077C231AB0CF59L ^ l));
        this.A = aX2;
        this.M = n;
        this.r = aX2.j(string);
        this.u = aX2.j(string2);
        if (string3 != null) {
            this.q = aX2.j(string3);
        }
        try {
            if (object != null) {
                this.y = aX2.P((Object)object).Z;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterRegistry.a(customSystemException);
        }
    }

    public void c() {
    }
}

