/*
 * Decompiled with CFR 0.152.
 */
package com.network.exchange;

import a.ay;
import a.i5;
import com.bytecode.analysis.BytecodeMetadataAnalyzer;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.security.crypto.CryptoContextManager1052;
import com.security.crypto.CryptoSecurityManager1576;
import com.system.compatibility.LegacyApiInterceptor;
import com.system.extensions.ExtendedApiResolver;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MultiProtocolDataExchanger
extends LegacyApiInterceptor {
    public List<ay> Q;
    public List<CryptoSecurityManager1576> B;
    public List<ay> h;
    private static final long a = MultiContainerRegistry.a(-2625616258523248533L, 234011643588416021L, null).a(267014572485773L);
    public String f;
    public List<CryptoSecurityManager1576> I;
    public String C;
    public List<CryptoContextManager1052> G;
    public String M;
    private static final long c;

    public MultiProtocolDataExchanger(int n, String string, String string2, String string3) {
        super(n);
        this.C = string;
        this.M = string2;
        this.f = string3;
    }

    public MultiProtocolDataExchanger(String string, String string2, String string3) {
        long l = a ^ 0x5C49194EAFC3L;
        this((int)c, string, string2, string3);
        if (this.getClass() != MultiProtocolDataExchanger.class) {
            throw new IllegalStateException();
        }
    }

    public void t(CryptoContextManager1052 cryptoContextManager1052) {
        this.G = i5.i(this.G, cryptoContextManager1052);
    }

    public void B(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer) {
        ay ay2;
        int n;
        int n2;
        LegacyApiInterceptor legacyApiInterceptor = bytecodeMetadataAnalyzer.G(this.C, this.M, this.f);
        try {
            if (legacyApiInterceptor == null) {
                return;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw MultiProtocolDataExchanger.a(illegalStateException);
        }
        if (this.h != null) {
            n2 = this.h.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.h.get(n);
                ay2.n(legacyApiInterceptor.h(ay2.Z, true));
            }
        }
        if (this.Q != null) {
            n2 = this.Q.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.Q.get(n);
                ay2.n(legacyApiInterceptor.h(ay2.Z, false));
            }
        }
        if (this.B != null) {
            n2 = this.B.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.B.get(n);
                ay2.n(legacyApiInterceptor.i(((CryptoSecurityManager1576)ay2).v, ((CryptoSecurityManager1576)ay2).X, ((CryptoSecurityManager1576)ay2).Z, true));
            }
        }
        if (this.I != null) {
            n2 = this.I.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.I.get(n);
                ay2.n(legacyApiInterceptor.i(((CryptoSecurityManager1576)ay2).v, ((CryptoSecurityManager1576)ay2).X, ((CryptoSecurityManager1576)ay2).Z, false));
            }
        }
        if (this.G != null) {
            n2 = this.G.size();
            try {
                for (n = 0; n < n2; ++n) {
                    legacyApiInterceptor.t(this.G.get(n));
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw MultiProtocolDataExchanger.a(illegalStateException);
            }
        }
        legacyApiInterceptor.S();
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public ExtendedApiResolver h(String string, boolean bl) {
        ay ay2;
        block3: {
            block2: {
                ay2 = new ay(string);
                try {
                    if (!bl) break block2;
                    this.h = i5.i(this.h, ay2);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw MultiProtocolDataExchanger.a(illegalStateException);
                }
            }
            this.Q = i5.i(this.Q, ay2);
        }
        return ay2;
    }

    public void S() {
    }

    public ExtendedApiResolver i(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        CryptoSecurityManager1576 cryptoSecurityManager1576;
        block3: {
            block2: {
                cryptoSecurityManager1576 = new CryptoSecurityManager1576(n, errorDiagnosticTracker, string);
                try {
                    if (!bl) break block2;
                    this.B = i5.i(this.B, cryptoSecurityManager1576);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw MultiProtocolDataExchanger.a(illegalStateException);
                }
            }
            this.I = i5.i(this.I, cryptoSecurityManager1576);
        }
        return cryptoSecurityManager1576;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x2FB18E075EA7L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -5850359138801991357L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

