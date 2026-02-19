/*
 * Decompiled with CFR 0.152.
 */
package com.resource.management;

import a.RE;
import a.Rr;
import a.ay;
import a.i5;
import com.app.network.connection.ConnectionParameterResolver;
import com.bytecode.analysis.BytecodeMetadataAnalyzer;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.network.exchange.MultiProtocolDataExchanger;
import com.network.protocol.MultiProtocolDataContainer;
import com.security.crypto.CryptoContextManager1052;
import com.security.crypto.CryptoSecurityManager1576;
import com.system.compatibility.ApiCompatibilityValidator;
import com.system.compatibility.LegacyApiInterceptor;
import com.system.extensions.ExtendedApiResolver;
import com.system.resource.ResourceAllocationTracker144;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class MultiResourceOrchestrator
extends BytecodeMetadataAnalyzer {
    public List<CryptoContextManager1052> R;
    public List<CryptoSecurityManager1576> x;
    public int N;
    public String u;
    public RE E;
    private static final long d = MultiContainerRegistry.a(5076048312915812380L, 3589922125508593712L, null).a(126454637382136L);
    public String K;
    public List<ResourceAllocationTracker144> H;
    public List<String> G;
    public List<ConnectionParameterResolver> b;
    public String o;
    public List<MultiProtocolDataExchanger> z;
    public String q;
    public String l;
    private static final long k;
    public String Y;
    public List<ay> C;
    public int a;
    public List<String> A;
    public List<String> V;
    public List<MultiProtocolDataContainer> S;
    public List<ay> m;
    public String n;
    public List<CryptoSecurityManager1576> j;
    public String D;
    public String e;

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = d ^ 0x46CB2E0F6213L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -1055982944993253827L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                k = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public void G(String string, String string2, String string3, int n) {
        ConnectionParameterResolver connectionParameterResolver = new ConnectionParameterResolver(string, string2, string3, n);
        this.b.add(connectionParameterResolver);
    }

    public LegacyApiInterceptor G(String string, String string2, String string3) {
        MultiProtocolDataExchanger multiProtocolDataExchanger = new MultiProtocolDataExchanger(string, string2, string3);
        this.z = i5.i(this.z, multiProtocolDataExchanger);
        return multiProtocolDataExchanger;
    }

    public ExtendedApiResolver N(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        CryptoSecurityManager1576 cryptoSecurityManager1576;
        block3: {
            block2: {
                cryptoSecurityManager1576 = new CryptoSecurityManager1576(n, errorDiagnosticTracker, string);
                try {
                    if (!bl) break block2;
                    this.j = i5.i(this.j, cryptoSecurityManager1576);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw MultiResourceOrchestrator.a(illegalStateException);
                }
            }
            this.x = i5.i(this.x, cryptoSecurityManager1576);
        }
        return cryptoSecurityManager1576;
    }

    public void S(String string, String string2, String string3) {
        this.n = string;
        this.l = string2;
        this.D = string3;
    }

    public void H(String string) {
        this.u = string;
    }

    public void j(String string, String string2) {
        this.q = string;
        this.K = string2;
    }

    public void u(int n, int n2, String string, String string2, String string3, String[] stringArray) {
        this.a = n;
        this.N = n2;
        this.e = string;
        this.Y = string2;
        this.o = string3;
        this.G = i5.Y(stringArray);
    }

    public BytecodeInstrumentationEngine q(int n, String string, String string2, String string3, String[] stringArray) {
        ResourceAllocationTracker144 resourceAllocationTracker144 = new ResourceAllocationTracker144(n, string, string2, string3, stringArray);
        this.H.add(resourceAllocationTracker144);
        return resourceAllocationTracker144;
    }

    public ApiCompatibilityValidator d(int n, String string, String string2, String string3, Object object) {
        MultiProtocolDataContainer multiProtocolDataContainer = new MultiProtocolDataContainer(n, string, string2, string3, object);
        this.S.add(multiProtocolDataContainer);
        return multiProtocolDataContainer;
    }

    public MultiResourceOrchestrator(int n) {
        super(n);
        this.G = new ArrayList<String>();
        this.b = new ArrayList<ConnectionParameterResolver>();
        this.S = new ArrayList<MultiProtocolDataContainer>();
        this.H = new ArrayList<ResourceAllocationTracker144>();
    }

    public ExtendedApiResolver e(String string, boolean bl) {
        ay ay2;
        block3: {
            block2: {
                ay2 = new ay(string);
                try {
                    if (!bl) break block2;
                    this.C = i5.i(this.C, ay2);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw MultiResourceOrchestrator.a(illegalStateException);
                }
            }
            this.m = i5.i(this.m, ay2);
        }
        return ay2;
    }

    public void D(String string) {
        this.V = i5.i(this.V, string);
    }

    public Rr S(String string, int n, String string2) {
        this.E = new RE(string, n, string2);
        return this.E;
    }

    public void p(CryptoContextManager1052 cryptoContextManager1052) {
        this.R = i5.i(this.R, cryptoContextManager1052);
    }

    public MultiResourceOrchestrator() {
        long l = d ^ 0x3508F37B00C0L;
        this((int)k);
        if (this.getClass() != MultiResourceOrchestrator.class) {
            throw new IllegalStateException();
        }
    }

    public void a(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer) {
        ay ay2;
        int n;
        int n2;
        block46: {
            String[] stringArray = new String[this.G.size()];
            try {
                try {
                    this.G.toArray(stringArray);
                    bytecodeMetadataAnalyzer.u(this.a, this.N, this.e, this.Y, this.o, stringArray);
                    if (this.q == null && this.K == null) break block46;
                }
                catch (IllegalStateException illegalStateException) {
                    throw MultiResourceOrchestrator.a(illegalStateException);
                }
                bytecodeMetadataAnalyzer.j(this.q, this.K);
            }
            catch (IllegalStateException illegalStateException) {
                throw MultiResourceOrchestrator.a(illegalStateException);
            }
        }
        try {
            if (this.E != null) {
                this.E.v(bytecodeMetadataAnalyzer);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw MultiResourceOrchestrator.a(illegalStateException);
        }
        try {
            if (this.u != null) {
                bytecodeMetadataAnalyzer.H(this.u);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw MultiResourceOrchestrator.a(illegalStateException);
        }
        try {
            if (this.n != null) {
                bytecodeMetadataAnalyzer.S(this.n, this.l, this.D);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw MultiResourceOrchestrator.a(illegalStateException);
        }
        if (this.C != null) {
            n2 = this.C.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.C.get(n);
                ay2.n(bytecodeMetadataAnalyzer.e(ay2.Z, true));
            }
        }
        if (this.m != null) {
            n2 = this.m.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.m.get(n);
                ay2.n(bytecodeMetadataAnalyzer.e(ay2.Z, false));
            }
        }
        if (this.j != null) {
            n2 = this.j.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.j.get(n);
                ay2.n(bytecodeMetadataAnalyzer.N(((CryptoSecurityManager1576)ay2).v, ((CryptoSecurityManager1576)ay2).X, ((CryptoSecurityManager1576)ay2).Z, true));
            }
        }
        if (this.x != null) {
            n2 = this.x.size();
            for (n = 0; n < n2; ++n) {
                ay2 = this.x.get(n);
                ay2.n(bytecodeMetadataAnalyzer.N(((CryptoSecurityManager1576)ay2).v, ((CryptoSecurityManager1576)ay2).X, ((CryptoSecurityManager1576)ay2).Z, false));
            }
        }
        if (this.R != null) {
            n2 = this.R.size();
            try {
                for (n = 0; n < n2; ++n) {
                    bytecodeMetadataAnalyzer.p(this.R.get(n));
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw MultiResourceOrchestrator.a(illegalStateException);
            }
        }
        if (this.V != null) {
            n2 = this.V.size();
            try {
                for (n = 0; n < n2; ++n) {
                    bytecodeMetadataAnalyzer.D(this.V.get(n));
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw MultiResourceOrchestrator.a(illegalStateException);
            }
        }
        if (this.A != null) {
            n2 = this.A.size();
            try {
                for (n = 0; n < n2; ++n) {
                    bytecodeMetadataAnalyzer.m(this.A.get(n));
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw MultiResourceOrchestrator.a(illegalStateException);
            }
        }
        n2 = this.b.size();
        try {
            for (n = 0; n < n2; ++n) {
                this.b.get(n).N(bytecodeMetadataAnalyzer);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw MultiResourceOrchestrator.a(illegalStateException);
        }
        if (this.z != null) {
            n2 = this.z.size();
            try {
                for (n = 0; n < n2; ++n) {
                    this.z.get(n).B(bytecodeMetadataAnalyzer);
                }
            }
            catch (IllegalStateException illegalStateException) {
                throw MultiResourceOrchestrator.a(illegalStateException);
            }
        }
        n2 = this.S.size();
        try {
            for (n = 0; n < n2; ++n) {
                this.S.get(n).o(bytecodeMetadataAnalyzer);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw MultiResourceOrchestrator.a(illegalStateException);
        }
        n2 = this.H.size();
        try {
            for (n = 0; n < n2; ++n) {
                this.H.get(n).C(bytecodeMetadataAnalyzer);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw MultiResourceOrchestrator.a(illegalStateException);
        }
        bytecodeMetadataAnalyzer.t();
    }

    public void m(String string) {
        this.A = i5.i(this.A, string);
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public void t() {
    }
}

