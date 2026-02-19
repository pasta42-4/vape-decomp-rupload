/*
 * Decompiled with CFR 0.152.
 */
package com.network.protocol;

import a.ay;
import a.i5;
import com.bytecode.analysis.BytecodeMetadataAnalyzer;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.security.crypto.CryptoContextManager1052;
import com.security.crypto.CryptoSecurityManager1576;
import com.system.compatibility.ApiCompatibilityValidator;
import com.system.extensions.ExtendedApiResolver;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MultiProtocolDataContainer
extends ApiCompatibilityValidator {
    public int f;
    public String o;
    public List<ay> S;
    public List<CryptoContextManager1052> z;
    public List<ay> H;
    public String m;
    public String T;
    public Object Q;
    private static final long c;
    public List<CryptoSecurityManager1576> D;
    public List<CryptoSecurityManager1576> V;
    private static final long b;

    public ExtendedApiResolver q(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        CryptoSecurityManager1576 cryptoSecurityManager1576;
        block3: {
            block2: {
                cryptoSecurityManager1576 = new CryptoSecurityManager1576(n, errorDiagnosticTracker, string);
                try {
                    if (!bl) break block2;
                    this.V = i5.i(this.V, cryptoSecurityManager1576);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw MultiProtocolDataContainer.a(illegalStateException);
                }
            }
            this.D = i5.i(this.D, cryptoSecurityManager1576);
        }
        return cryptoSecurityManager1576;
    }

    public void c() {
    }

    public MultiProtocolDataContainer(int n, int n2, String string, String string2, String string3, Object object) {
        super(n);
        this.f = n2;
        this.T = string;
        this.m = string2;
        this.o = string3;
        this.Q = object;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = MultiContainerRegistry.a(8372274419159218009L, 8189927120027421763L, null).a(229094005274509L);
        long l = b ^ 0x68B9C30F1632L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -7550216903610322569L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public void a(CryptoContextManager1052 cryptoContextManager1052) {
        this.z = i5.i(this.z, cryptoContextManager1052);
    }

    public void o(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer) {
        ay ay2;
        int n;
        int n2;
        ApiCompatibilityValidator apiCompatibilityValidator = bytecodeMetadataAnalyzer.d(this.f, this.T, this.m, this.o, this.Q);
        try {
            if (apiCompatibilityValidator == null) {
                return;
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw MultiProtocolDataContainer.a(illegalStateException);
        }
        if (this.H != null) {
            n2 = this.H.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.H.get(n);
                ay2.n(apiCompatibilityValidator.N(ay2.Z, true));
            }
        }
        if (this.S != null) {
            n2 = this.S.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.S.get(n);
                ay2.n(apiCompatibilityValidator.N(ay2.Z, false));
            }
        }
        if (this.V != null) {
            n2 = this.V.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.V.get(n);
                ay2.n(apiCompatibilityValidator.q(((CryptoSecurityManager1576)ay2).v, ((CryptoSecurityManager1576)ay2).X, ((CryptoSecurityManager1576)ay2).Z, true));
            }
        }
        if (this.D != null) {
            n2 = this.D.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.D.get(n);
                ay2.n(apiCompatibilityValidator.q(((CryptoSecurityManager1576)ay2).v, ((CryptoSecurityManager1576)ay2).X, ((CryptoSecurityManager1576)ay2).Z, false));
            }
        }
        if (this.z != null) {
            n2 = this.z.size();
            try {
                for (n = 0; n < n2; ++n) {
                    apiCompatibilityValidator.a(this.z.get(n));
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw MultiProtocolDataContainer.a(illegalStateException);
            }
        }
        apiCompatibilityValidator.c();
    }

    public ExtendedApiResolver N(String string, boolean bl) {
        ay ay2;
        block3: {
            block2: {
                ay2 = new ay(string);
                try {
                    if (!bl) break block2;
                    this.H = i5.i(this.H, ay2);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw MultiProtocolDataContainer.a(illegalStateException);
                }
            }
            this.S = i5.i(this.S, ay2);
        }
        return ay2;
    }

    public MultiProtocolDataContainer(int n, String string, String string2, String string3, Object object) {
        long l = b ^ 0x5BD060908856L;
        this((int)c, n, string, string2, string3, object);
        if (this.getClass() != MultiProtocolDataContainer.class) {
            throw new IllegalStateException();
        }
    }
}

