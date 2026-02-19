/*
 * Decompiled with CFR 0.152.
 */
package com.security.session;

import a.aN;
import a.aX;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.exception.system.CustomSystemException;
import com.performance.management.ComputationalRateController;
import com.security.crypto.CryptoContextManager1052;
import com.system.compatibility.LegacyApiInterceptor;
import com.system.extensions.ExtendedApiResolver;
import com.text.encoding.EncodingUtilityManager;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class CryptographicSessionManager1126
extends LegacyApiInterceptor {
    private aN s;
    private CryptoContextManager1052 V;
    private static final long f;
    private final int n;
    private static final long c;
    private final aX g;
    private aN p;
    private int G;
    private aN a;
    private final int T;
    private aN z;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void S() {
    }

    int p() {
        int n = 6;
        n += CryptoContextManager1052.z(this.g, 0, this.G);
        n += aN.m(this.s, this.p, this.a, this.z);
        if (this.V != null) {
            n += this.V.X(this.g);
        }
        return n;
    }

    CryptographicSessionManager1126(aX aX2, String string, String string2, String string3) {
        long l = c ^ 0x6E5684791773L;
        super((int)f);
        this.g = aX2;
        this.n = aX2.j(string);
        this.T = aX2.j(string2);
        if (string3 != null) {
            this.G = aX2.j(string3);
        }
    }

    void S(EncodingUtilityManager encodingUtilityManager) {
        encodingUtilityManager.f(this.n).f(this.T);
        int n = 0;
        try {
            if (this.G != 0) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1126.a(customSystemException);
        }
        try {
            if (this.s != null) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1126.a(customSystemException);
        }
        try {
            if (this.p != null) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1126.a(customSystemException);
        }
        try {
            if (this.a != null) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1126.a(customSystemException);
        }
        try {
            if (this.z != null) {
                ++n;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1126.a(customSystemException);
        }
        if (this.V != null) {
            n += this.V.f();
        }
        try {
            encodingUtilityManager.f(n);
            CryptoContextManager1052.F(this.g, 0, this.G, encodingUtilityManager);
            aN.r(this.g, this.s, this.p, this.a, this.z, encodingUtilityManager);
            if (this.V != null) {
                this.V.y(this.g, encodingUtilityManager);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1126.a(customSystemException);
        }
    }

    final void R(ComputationalRateController computationalRateController) {
        computationalRateController.O(this.V);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = MultiContainerRegistry.a(4468544138655020957L, 1559759144215381035L, null).a(39847932969551L);
        long l = c ^ 0x3A573670012CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 4653795519972985787L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                f = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public ExtendedApiResolver h(String string, boolean bl) {
        try {
            if (bl) {
                this.s = aN.H(this.g, string, this.s);
                return this.s;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1126.a(customSystemException);
        }
        this.p = aN.H(this.g, string, this.p);
        return this.p;
    }

    public void t(CryptoContextManager1052 cryptoContextManager1052) {
        cryptoContextManager1052.a = this.V;
        this.V = cryptoContextManager1052;
    }

    public ExtendedApiResolver i(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        try {
            if (bl) {
                this.a = aN.h(this.g, n, errorDiagnosticTracker, string, this.a);
                return this.a;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw CryptographicSessionManager1126.a(customSystemException);
        }
        this.z = aN.h(this.g, n, errorDiagnosticTracker, string, this.z);
        return this.z;
    }
}

