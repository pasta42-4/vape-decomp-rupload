/*
 * Decompiled with CFR 0.152.
 */
package com.bytecode.analysis;

import a.aN;
import a.aX;
import a.zY;
import com.app.config.NumericConfigurationDescriptor;
import com.app.configuration.ConfigurationDescriptor1455;
import com.app.connection.ConnectionPoolManager2695;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.collections.management.MultiContainerRegistry;
import com.crypto.utils.CipherEncryptionUtility;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.exception.complexity.MethodComplexityException;
import com.network.protocol.AbstractCommunicationProtocol;
import com.performance.management.ComputationalRateController;
import com.security.crypto.CryptoContextManager1052;
import com.security.crypto.CryptographicPaddingUtility;
import com.security.crypto.EncryptionContextInitializer;
import com.security.exchange.CryptoKeyExchangeMapping;
import com.security.orchestration.CryptoOperationOrchestrator951;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class BytecodeAnalysisEngine
extends BytecodeInstrumentationEngine {
    private EncodingUtilityManager P;
    private CryptoContextManager1052 M;
    private static final long bb;
    private final int p;
    private CryptoContextManager1052 E;
    private int y;
    private final EncodingUtilityManager N;
    private final int o;
    private int X;
    private final int g;
    private int u;
    private int d;
    private aN m;
    private CryptographicPaddingUtility k;
    private EncodingUtilityManager l;
    private static final Map hb;
    private aN f;
    private aN Y;
    private final aX Ui;
    private int e;
    private CryptoKeyExchangeMapping K;
    private int C;
    private EncodingUtilityManager n;
    private CryptoKeyExchangeMapping J;
    private static final Integer[] gb;
    private static final int[] j;
    private final String O;
    private int b;
    private aN[] W;
    private int I;
    private int D;
    private EncodingUtilityManager v;
    private aN UC;
    private aN[] Q;
    private boolean i;
    private int L;
    private int s;
    private final String UI;
    private EncodingUtilityManager V;
    private final int r;
    private final int[] S;
    private int h;
    private int[] c;
    private static final long[] fb;
    private int R;
    private boolean A;
    private CryptographicPaddingUtility G;
    private aN x;
    private final int U;
    private int a;
    private EncodingUtilityManager B;
    private final int z;
    private int H;
    private int[] F;
    private int Uf;
    private CryptoKeyExchangeMapping w;
    private aN Z;

    public void n(int n, String string) {
        block10: {
            block12: {
                this.b = this.N.I;
                EncryptionContextInitializer encryptionContextInitializer = this.Ui.c(string);
                try {
                    block11: {
                        try {
                            try {
                                this.N.I(n, encryptionContextInitializer.Z);
                                if (this.w == null) break block10;
                                if (this.r == 4) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                            if (this.r != 3) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                    }
                    this.w.b.o(n, this.b, encryptionContextInitializer, this.Ui);
                    break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            if (n == 187) {
                int n2 = this.D + 1;
                try {
                    if (n2 > this.e) {
                        this.e = n2;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
                this.D = n2;
            }
        }
    }

    public void z(CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        block35: {
            block36: {
                block37: {
                    block33: {
                        block34: {
                            block28: {
                                block31: {
                                    block32: {
                                        block29: {
                                            block30: {
                                                try {
                                                    this.A |= cryptoKeyExchangeMapping.F(this.N.U, this.N.I);
                                                    if ((cryptoKeyExchangeMapping.C & 1) != 0) {
                                                        return;
                                                    }
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (this.r != 4) break block28;
                                                            if (this.w == null) break block29;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                        }
                                                        if (cryptoKeyExchangeMapping.n != this.w.n) break block30;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                    }
                                                    this.w.C = (short)(this.w.C | cryptoKeyExchangeMapping.C & 2);
                                                    cryptoKeyExchangeMapping.b = this.w.b;
                                                    return;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                }
                                            }
                                            this.O(0, cryptoKeyExchangeMapping);
                                        }
                                        try {
                                            try {
                                                if (this.K == null) break block31;
                                                if (cryptoKeyExchangeMapping.n != this.K.n) break block32;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                            }
                                            this.K.C = (short)(this.K.C | cryptoKeyExchangeMapping.C & 2);
                                            cryptoKeyExchangeMapping.b = this.K.b;
                                            this.w = this.K;
                                            return;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                        }
                                    }
                                    this.K.h = cryptoKeyExchangeMapping;
                                }
                                this.K = cryptoKeyExchangeMapping;
                                this.w = cryptoKeyExchangeMapping;
                                cryptoKeyExchangeMapping.b = new CryptoOperationOrchestrator951(cryptoKeyExchangeMapping);
                                break block35;
                            }
                            try {
                                try {
                                    if (this.r != 3) break block33;
                                    if (this.w != null) break block34;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                this.w = cryptoKeyExchangeMapping;
                                break block35;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                        }
                        this.w.b.M = cryptoKeyExchangeMapping;
                        break block35;
                    }
                    try {
                        try {
                            if (this.r != 1) break block36;
                            if (this.w == null) break block37;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                        this.w.u = (short)this.e;
                        this.O(this.D, cryptoKeyExchangeMapping);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                try {
                    this.w = cryptoKeyExchangeMapping;
                    this.D = 0;
                    this.e = 0;
                    if (this.K != null) {
                        this.K.h = cryptoKeyExchangeMapping;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
                this.K = cryptoKeyExchangeMapping;
                break block35;
            }
            try {
                try {
                    if (this.r != 2 || this.w != null) break block35;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
                this.w = cryptoKeyExchangeMapping;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
    }

    BytecodeAnalysisEngine(aX aX2, int n, String string, String string2, String string3, String[] stringArray, int n2) {
        int n3;
        block11: {
            int n4;
            long l = bb ^ 0x6CE72E38D4DBL;
            super(BytecodeAnalysisEngine.b(18283, 0x5FEFF74798139643L ^ l));
            this.N = new EncodingUtilityManager();
            this.Ui = aX2;
            try {
                this.p = "<init>".equals(string) ? n | BytecodeAnalysisEngine.b(15401, 0x6FBE25FB9D61ED05L ^ l) : n;
                this.U = aX2.j(string);
                this.O = string;
                this.o = aX2.j(string2);
                this.UI = string2;
                BytecodeAnalysisEngine bytecodeAnalysisEngine = this;
                n4 = string3 == null ? 0 : aX2.j(string3);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
            try {
                bytecodeAnalysisEngine.g = n4;
                if (stringArray == null || stringArray.length <= 0) break block11;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
            this.z = stringArray.length;
            this.S = new int[this.z];
            try {
                for (n3 = 0; n3 < this.z; ++n3) {
                    this.S[n3] = aX2.c((String)stringArray[n3]).Z;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
        this.z = 0;
        this.S = null;
        this.r = n2;
        if (n2 != 0) {
            n3 = zY.m(string2) >> 2;
            try {
                if ((n & 8) != 0) {
                    --n3;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
            this.R = n3;
            this.s = n3;
            this.J = new CryptoKeyExchangeMapping();
            this.z(this.J);
        }
    }

    public void D() {
    }

    /*
     * Unable to fully structure code
     */
    public void Z(Object var1_1) {
        block29: {
            block31: {
                block27: {
                    block28: {
                        block26: {
                            block25: {
                                block24: {
                                    this.b = this.N.I;
                                    var2_2 = this.Ui.P(var1_1);
                                    var3_3 = var2_2.Z;
                                    try {
                                        try {
                                            if (var2_2.c != 5 && var2_2.c != 6) {
                                            }
                                            ** GOTO lbl22
                                        }
                                        catch (IllegalArgumentException v0) {
                                            throw BytecodeAnalysisEngine.a(v0);
                                        }
                                        if (var2_2.c != 17) break block24;
                                    }
                                    catch (IllegalArgumentException v1) {
                                        throw BytecodeAnalysisEngine.a(v1);
                                    }
                                    var4_4 = var2_2.i.charAt(0);
                                    try {
                                        try {
                                            if (var4_4 != 'J' && var4_4 != 'D') break block24;
                                        }
                                        catch (IllegalArgumentException v2) {
                                            throw BytecodeAnalysisEngine.a(v2);
                                        }
lbl22:
                                        // 2 sources

                                        v3 = true;
                                        break block25;
                                    }
                                    catch (IllegalArgumentException v4) {
                                        throw BytecodeAnalysisEngine.a(v4);
                                    }
                                }
                                v3 = false;
                            }
                            var5_5 = v3;
                            try {
                                if (!var5_5) break block26;
                                this.N.I(20, var3_3);
                                break block27;
                            }
                            catch (IllegalArgumentException v5) {
                                throw BytecodeAnalysisEngine.a(v5);
                            }
                        }
                        try {
                            if (var3_3 < 256) break block28;
                            this.N.I(19, var3_3);
                            break block27;
                        }
                        catch (IllegalArgumentException v6) {
                            throw BytecodeAnalysisEngine.a(v6);
                        }
                    }
                    this.N.T(18, var3_3);
                }
                try {
                    block30: {
                        try {
                            try {
                                if (this.w == null) break block29;
                                if (this.r == 4) break block30;
                            }
                            catch (IllegalArgumentException v7) {
                                throw BytecodeAnalysisEngine.a(v7);
                            }
                            if (this.r != 3) break block31;
                        }
                        catch (IllegalArgumentException v8) {
                            throw BytecodeAnalysisEngine.a(v8);
                        }
                    }
                    this.w.b.o(18, 0, var2_2, this.Ui);
                    break block29;
                }
                catch (IllegalArgumentException v9) {
                    throw BytecodeAnalysisEngine.a(v9);
                }
            }
            try {
                v10 = this.D;
                v11 = var5_5 != false ? 2 : 1;
            }
            catch (IllegalArgumentException v12) {
                throw BytecodeAnalysisEngine.a(v12);
            }
            var6_6 = v10 + v11;
            try {
                if (var6_6 > this.e) {
                    this.e = var6_6;
                }
            }
            catch (IllegalArgumentException v13) {
                throw BytecodeAnalysisEngine.a(v13);
            }
            this.D = var6_6;
        }
    }

    public ExtendedApiResolver J() {
        this.V = new EncodingUtilityManager();
        return new aN(this.Ui, false, this.V, null);
    }

    public ExtendedApiResolver Q(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        long l = bb ^ 0x3FFBCC1D4121L;
        try {
            if (bl) {
                this.Y = aN.h(this.Ui, n & BytecodeAnalysisEngine.b(27491, 0x26058CBCC0692FB3L ^ l) | this.b << 8, errorDiagnosticTracker, string, this.Y);
                return this.Y;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        this.x = aN.h(this.Ui, n & BytecodeAnalysisEngine.b(22939, 0x76BE2F3AC8ED9D4AL ^ l) | this.b << 8, errorDiagnosticTracker, string, this.x);
        return this.x;
    }

    public void K(int n, int n2, CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping ... cryptoKeyExchangeMappingArray) {
        this.b = this.N.I;
        this.N.Z(170).T(null, 0, (4 - this.N.I % 4) % 4);
        cryptoKeyExchangeMapping.D(this.N, this.b, true);
        this.N.y(n).y(n2);
        for (CryptoKeyExchangeMapping cryptoKeyExchangeMapping2 : cryptoKeyExchangeMappingArray) {
            cryptoKeyExchangeMapping2.D(this.N, this.b, true);
        }
        this.e(cryptoKeyExchangeMapping, cryptoKeyExchangeMappingArray);
    }

    public void s(String string, int n) {
        block6: {
            block8: {
                this.b = this.N.I;
                EncryptionContextInitializer encryptionContextInitializer = this.Ui.c(string);
                try {
                    block7: {
                        try {
                            try {
                                this.N.I(197, encryptionContextInitializer.Z).Z(n);
                                if (this.w == null) break block6;
                                if (this.r == 4) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                            if (this.r != 3) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                    }
                    this.w.b.o(197, n, encryptionContextInitializer, this.Ui);
                    break block6;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            this.D += 1 - n;
        }
    }

    private void i(int n, int n2) {
        try {
            for (int i = n; i < n2; ++i) {
                CryptoOperationOrchestrator951.O(this.Ui, this.c[i], this.l);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
    }

    boolean e() {
        return this.A;
    }

    public ExtendedApiResolver h(int n, ErrorDiagnosticTracker errorDiagnosticTracker, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray2, int[] nArray, String string, boolean bl) {
        EncodingUtilityManager encodingUtilityManager = new EncodingUtilityManager();
        encodingUtilityManager.Z(n >>> 24).f(cryptoKeyExchangeMappingArray.length);
        try {
            for (int i = 0; i < cryptoKeyExchangeMappingArray.length; ++i) {
                encodingUtilityManager.f(cryptoKeyExchangeMappingArray[i].n).f(cryptoKeyExchangeMappingArray2[i].n - cryptoKeyExchangeMappingArray[i].n).f(nArray[i]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        try {
            ErrorDiagnosticTracker.X(errorDiagnosticTracker, encodingUtilityManager);
            encodingUtilityManager.f(this.Ui.j(string)).f(0);
            if (bl) {
                this.Y = new aN(this.Ui, true, encodingUtilityManager, this.Y);
                return this.Y;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        this.x = new aN(this.Ui, true, encodingUtilityManager, this.x);
        return this.x;
    }

    void T() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.F == null) break block4;
                        if (this.l != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                    this.l = new EncodingUtilityManager();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            this.Y();
            ++this.Uf;
        }
        this.F = this.c;
        this.c = null;
    }

    public void O(CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping cryptoKeyExchangeMapping2, CryptoKeyExchangeMapping cryptoKeyExchangeMapping3, String string) {
        CryptographicPaddingUtility cryptographicPaddingUtility;
        block5: {
            block4: {
                int n;
                CryptoKeyExchangeMapping cryptoKeyExchangeMapping4;
                CryptoKeyExchangeMapping cryptoKeyExchangeMapping5;
                CryptoKeyExchangeMapping cryptoKeyExchangeMapping6;
                CryptographicPaddingUtility cryptographicPaddingUtility2;
                CryptographicPaddingUtility cryptographicPaddingUtility3;
                try {
                    CryptographicPaddingUtility cryptographicPaddingUtility4;
                    cryptographicPaddingUtility3 = cryptographicPaddingUtility4;
                    cryptographicPaddingUtility2 = cryptographicPaddingUtility4;
                    cryptoKeyExchangeMapping6 = cryptoKeyExchangeMapping;
                    cryptoKeyExchangeMapping5 = cryptoKeyExchangeMapping2;
                    cryptoKeyExchangeMapping4 = cryptoKeyExchangeMapping3;
                    n = string != null ? this.Ui.c((String)string).Z : 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
                cryptographicPaddingUtility3(cryptoKeyExchangeMapping6, cryptoKeyExchangeMapping5, cryptoKeyExchangeMapping4, n, string);
                cryptographicPaddingUtility = cryptographicPaddingUtility2;
                try {
                    if (this.k != null) break block4;
                    this.k = cryptographicPaddingUtility;
                    break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            this.G.i = cryptographicPaddingUtility;
        }
        this.G = cryptographicPaddingUtility;
    }

    private void Q(Object object) {
        block5: {
            block6: {
                block4: {
                    try {
                        if (!(object instanceof Integer)) break block4;
                        this.l.Z((Integer)object);
                        break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                try {
                    if (!(object instanceof String)) break block6;
                    this.l.Z(7).f(this.Ui.c((String)((String)object)).Z);
                    break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            this.l.Z(8).f(((CryptoKeyExchangeMapping)object).n);
        }
    }

    int m(int n, int n2, int n3) {
        block4: {
            int n4 = 3 + n2 + n3;
            try {
                try {
                    if (this.c != null && this.c.length >= n4) break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
                this.c = new int[n4];
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
        this.c[0] = n;
        this.c[1] = n2;
        this.c[2] = n3;
        return 3;
    }

    void W(int n, int n2) {
        this.a = n + 6;
        this.H = n2 - 6;
    }

    /*
     * Unable to fully structure code
     */
    public void K(int var1_1, int var2_2, Object[] var3_3, int var4_4, Object[] var5_5) {
        block61: {
            block64: {
                block62: {
                    block63: {
                        block59: {
                            block60: {
                                try {
                                    if (this.r == 4) {
                                        return;
                                    }
                                }
                                catch (IllegalArgumentException v0) {
                                    throw BytecodeAnalysisEngine.a(v0);
                                }
                                try {
                                    try {
                                        if (this.r != 3) break block59;
                                        if (this.w.b != null) break block60;
                                    }
                                    catch (IllegalArgumentException v1) {
                                        throw BytecodeAnalysisEngine.a(v1);
                                    }
                                    this.w.b = new AbstractCommunicationProtocol(this.w);
                                    this.w.b.E(this.Ui, this.p, this.UI, var2_2);
                                    this.w.b.U(this);
                                    break block61;
                                }
                                catch (IllegalArgumentException v2) {
                                    throw BytecodeAnalysisEngine.a(v2);
                                }
                            }
                            try {
                                if (var1_1 == -1) {
                                    this.w.b.Z(this.Ui, var2_2, var3_3, var4_4, var5_5);
                                }
                            }
                            catch (IllegalArgumentException v3) {
                                throw BytecodeAnalysisEngine.a(v3);
                            }
                            this.w.b.U(this);
                            break block61;
                        }
                        try {
                            if (var1_1 != -1) break block62;
                            if (this.F != null) break block63;
                        }
                        catch (IllegalArgumentException v4) {
                            throw BytecodeAnalysisEngine.a(v4);
                        }
                        var6_6 = zY.m(this.UI) >> 2;
                        var7_7 = new CryptoOperationOrchestrator951(new CryptoKeyExchangeMapping());
                        var7_7.E(this.Ui, this.p, this.UI, var6_6);
                        var7_7.U(this);
                    }
                    this.s = var2_2;
                    var6_6 = this.m(this.N.I, var2_2, var4_4);
                    try {
                        for (var7_8 = 0; var7_8 < var2_2; ++var7_8) {
                            this.c[var6_6++] = CryptoOperationOrchestrator951.Q(this.Ui, var3_3[var7_8]);
                        }
                    }
                    catch (IllegalArgumentException v5) {
                        throw BytecodeAnalysisEngine.a(v5);
                    }
                    try {
                        for (var7_8 = 0; var7_8 < var4_4; ++var7_8) {
                            this.c[var6_6++] = CryptoOperationOrchestrator951.Q(this.Ui, var5_5[var7_8]);
                        }
                    }
                    catch (IllegalArgumentException v6) {
                        throw BytecodeAnalysisEngine.a(v6);
                    }
                    this.T();
                    break block61;
                }
                try {
                    if (this.Ui.q() < 50) {
                        throw new IllegalArgumentException("Class versions V1_5 or less must use F_NEW frames.");
                    }
                }
                catch (IllegalArgumentException v7) {
                    throw BytecodeAnalysisEngine.a(v7);
                }
                if (this.l == null) {
                    this.l = new EncodingUtilityManager();
                    var6_6 = this.N.I;
                } else {
                    block65: {
                        var6_6 = this.N.I - this.y - 1;
                        try {
                            try {
                                if (var6_6 >= 0) break block64;
                                if (var1_1 != 3) break block65;
                            }
                            catch (IllegalArgumentException v8) {
                                throw BytecodeAnalysisEngine.a(v8);
                            }
                            return;
                        }
                        catch (IllegalArgumentException v9) {
                            throw BytecodeAnalysisEngine.a(v9);
                        }
                    }
                    throw new IllegalStateException();
                }
            }
            switch (var1_1) {
                case 0: {
                    this.s = var2_2;
                    this.l.Z(255).f(var6_6).f(var2_2);
                    try {
                        for (var7_8 = 0; var7_8 < var2_2; ++var7_8) {
                            this.Q(var3_3[var7_8]);
                        }
                    }
                    catch (IllegalArgumentException v10) {
                        throw BytecodeAnalysisEngine.a(v10);
                    }
                    this.l.f(var4_4);
                    try {
                        for (var7_8 = 0; var7_8 < var4_4; ++var7_8) {
                            this.Q(var5_5[var7_8]);
                        }
                        break;
                    }
                    catch (IllegalArgumentException v11) {
                        throw BytecodeAnalysisEngine.a(v11);
                    }
                }
                case 1: {
                    this.s += var2_2;
                    this.l.Z(251 + var2_2).f(var6_6);
                    try {
                        for (var7_8 = 0; var7_8 < var2_2; ++var7_8) {
                            this.Q(var3_3[var7_8]);
                        }
                        break;
                    }
                    catch (IllegalArgumentException v12) {
                        throw BytecodeAnalysisEngine.a(v12);
                    }
                }
                case 2: {
                    this.s -= var2_2;
                    this.l.Z(251 - var2_2).f(var6_6);
                    break;
                }
                case 3: {
                    try {
                        if (var6_6 < 64) {
                            this.l.Z(var6_6);
                            break;
                        }
                    }
                    catch (IllegalArgumentException v13) {
                        throw BytecodeAnalysisEngine.a(v13);
                    }
                    this.l.Z(251).f(var6_6);
                    break;
                }
                case 4: {
                    try {
                        if (var6_6 >= 64) ** GOTO lbl141
                        this.l.Z(64 + var6_6);
                        ** GOTO lbl143
                    }
                    catch (IllegalArgumentException v14) {
                        throw BytecodeAnalysisEngine.a(v14);
                    }
lbl141:
                    // 1 sources

                    this.l.Z(247).f(var6_6);
lbl143:
                    // 2 sources

                    this.Q(var5_5[0]);
                    break;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
            this.y = this.N.I;
            ++this.Uf;
        }
        if (this.r == 2) {
            this.D = var4_4;
            var6_6 = 0;
            while (true) {
                block67: {
                    try {
                        block66: {
                            try {
                                try {
                                    if (var6_6 >= var4_4) break;
                                    if (var5_5[var6_6] == NumericConfigurationDescriptor.A) break block66;
                                }
                                catch (IllegalArgumentException v15) {
                                    throw BytecodeAnalysisEngine.a(v15);
                                }
                                if (var5_5[var6_6] != NumericConfigurationDescriptor.o) break block67;
                            }
                            catch (IllegalArgumentException v16) {
                                throw BytecodeAnalysisEngine.a(v16);
                            }
                        }
                        ++this.D;
                    }
                    catch (IllegalArgumentException v17) {
                        throw BytecodeAnalysisEngine.a(v17);
                    }
                }
                ++var6_6;
            }
            try {
                if (this.D > this.e) {
                    this.e = this.D;
                }
            }
            catch (IllegalArgumentException v18) {
                throw BytecodeAnalysisEngine.a(v18);
            }
        }
        this.C = Math.max(this.C, var4_4);
        this.R = Math.max(this.R, this.s);
    }

    private void O(int n, CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        this.w.e = new ConnectionPoolManager2695(n, cryptoKeyExchangeMapping, this.w.e);
    }

    public void u(CryptoContextManager1052 cryptoContextManager1052) {
        block3: {
            block2: {
                try {
                    if (!cryptoContextManager1052.k()) break block2;
                    cryptoContextManager1052.a = this.E;
                    this.E = cryptoContextManager1052;
                    break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            cryptoContextManager1052.a = this.M;
            this.M = cryptoContextManager1052;
        }
    }

    /*
     * Exception decompiling
     */
    public void A(int var1_1, String var2_2, String var3_3, String var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 13[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public void n(int n, int n2) {
        block45: {
            block42: {
                int n3;
                block47: {
                    block44: {
                        block43: {
                            block38: {
                                block41: {
                                    block40: {
                                        block37: {
                                            block36: {
                                                block34: {
                                                    block46: {
                                                        block35: {
                                                            try {
                                                                try {
                                                                    this.b = this.N.I;
                                                                    if (n2 >= 4 || n == 169) break block34;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                                }
                                                                if (n >= 54) break block35;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                            }
                                                            n3 = 26 + (n - 21 << 2) + n2;
                                                            break block46;
                                                        }
                                                        n3 = 59 + (n - 54 << 2) + n2;
                                                    }
                                                    this.N.Z(n3);
                                                    break block37;
                                                }
                                                try {
                                                    if (n2 < 256) break block36;
                                                    this.N.Z(196).I(n, n2);
                                                    break block37;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                }
                                            }
                                            this.N.T(n, n2);
                                        }
                                        try {
                                            block39: {
                                                try {
                                                    try {
                                                        if (this.w == null) break block38;
                                                        if (this.r == 4) break block39;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                    }
                                                    if (this.r != 3) break block40;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                }
                                            }
                                            this.w.b.o(n, n2, null, null);
                                            break block38;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        if (n != 169) break block41;
                                        this.w.C = (short)(this.w.C | 0x40);
                                        this.w.g = (short)this.D;
                                        this.R();
                                        break block38;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                }
                                n3 = this.D + j[n];
                                try {
                                    if (n3 > this.e) {
                                        this.e = n3;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                this.D = n3;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (this.r == 0) break block42;
                                            if (n == 22) break block43;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                        }
                                        if (n == 24) break block43;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    if (n == 55) break block43;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                if (n != 57) break block44;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                        }
                        n3 = n2 + 2;
                        break block47;
                    }
                    n3 = n2 + 1;
                }
                try {
                    if (n3 > this.R) {
                        this.R = n3;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            try {
                try {
                    try {
                        if (n < 54 || this.r != 4) break block45;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                    if (this.k == null) break block45;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
                this.z(new CryptoKeyExchangeMapping());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
    }

    private void a() {
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping;
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping2;
        long l = bb ^ 0x5810FF4FF5E8L;
        CryptographicPaddingUtility cryptographicPaddingUtility = this.k;
        while (cryptographicPaddingUtility != null) {
            CryptoKeyExchangeMapping cryptoKeyExchangeMapping3 = cryptographicPaddingUtility.l;
            cryptoKeyExchangeMapping2 = cryptographicPaddingUtility.F;
            cryptoKeyExchangeMapping = cryptographicPaddingUtility.t;
            while (true) {
                block26: {
                    block25: {
                        try {
                            try {
                                if (cryptoKeyExchangeMapping2 == cryptoKeyExchangeMapping) break;
                                if ((cryptoKeyExchangeMapping2.C & 0x10) != 0) break block25;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                            cryptoKeyExchangeMapping2.e = new ConnectionPoolManager2695(BytecodeAnalysisEngine.b(11886, 0x317AD962B0D6DE70L ^ l), cryptoKeyExchangeMapping3, cryptoKeyExchangeMapping2.e);
                            break block26;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                    }
                    cryptoKeyExchangeMapping2.e.P.P = new ConnectionPoolManager2695(BytecodeAnalysisEngine.b(30060, 0x3449777C5BBC0576L ^ l), cryptoKeyExchangeMapping3, cryptoKeyExchangeMapping2.e.P.P);
                }
                cryptoKeyExchangeMapping2 = cryptoKeyExchangeMapping2.h;
            }
            cryptographicPaddingUtility = cryptographicPaddingUtility.i;
        }
        if (this.i) {
            short s2 = 1;
            this.J.q(s2);
            block16: for (short s3 = 1; s3 <= s2; s3 = (short)(s3 + 1)) {
                cryptoKeyExchangeMapping = this.J;
                while (true) {
                    block27: {
                        try {
                            try {
                                if (cryptoKeyExchangeMapping == null) continue block16;
                                if ((cryptoKeyExchangeMapping.C & 0x10) == 0) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                            if (cryptoKeyExchangeMapping.a != s3) break block27;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                        CryptoKeyExchangeMapping cryptoKeyExchangeMapping4 = cryptoKeyExchangeMapping.e.P.n;
                        if (cryptoKeyExchangeMapping4.a == 0) {
                            s2 = (short)(s2 + 1);
                            cryptoKeyExchangeMapping4.q(s2);
                        }
                    }
                    cryptoKeyExchangeMapping = cryptoKeyExchangeMapping.h;
                }
            }
            cryptoKeyExchangeMapping2 = this.J;
            while (true) {
                block28: {
                    try {
                        if (cryptoKeyExchangeMapping2 == null) break;
                        if ((cryptoKeyExchangeMapping2.C & 0x10) == 0) break block28;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                    cryptoKeyExchangeMapping = cryptoKeyExchangeMapping2.e.P.n;
                    cryptoKeyExchangeMapping.L(cryptoKeyExchangeMapping2);
                }
                cryptoKeyExchangeMapping2 = cryptoKeyExchangeMapping2.h;
            }
        }
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping5 = this.J;
        cryptoKeyExchangeMapping5.E = CryptoKeyExchangeMapping.z;
        int n = this.C;
        while (cryptoKeyExchangeMapping5 != CryptoKeyExchangeMapping.z) {
            cryptoKeyExchangeMapping = cryptoKeyExchangeMapping5;
            cryptoKeyExchangeMapping5 = cryptoKeyExchangeMapping5.E;
            short s4 = cryptoKeyExchangeMapping.t;
            int n2 = s4 + cryptoKeyExchangeMapping.u;
            if (n2 > n) {
                n = n2;
            }
            ConnectionPoolManager2695 connectionPoolManager2695 = cryptoKeyExchangeMapping.e;
            if ((cryptoKeyExchangeMapping.C & 0x10) != 0) {
                connectionPoolManager2695 = connectionPoolManager2695.P;
            }
            while (connectionPoolManager2695 != null) {
                block29: {
                    int n3;
                    CryptoKeyExchangeMapping cryptoKeyExchangeMapping6;
                    block31: {
                        block30: {
                            cryptoKeyExchangeMapping6 = connectionPoolManager2695.n;
                            try {
                                try {
                                    if (cryptoKeyExchangeMapping6.E != null) break block29;
                                    CryptoKeyExchangeMapping cryptoKeyExchangeMapping7 = cryptoKeyExchangeMapping6;
                                    if (connectionPoolManager2695.i != BytecodeAnalysisEngine.b(30060, 0x3449777C5BBC0576L ^ l)) break block30;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                n3 = 1;
                                break block31;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                        }
                        n3 = s4 + connectionPoolManager2695.i;
                    }
                    cryptoKeyExchangeMapping7.t = (short)n3;
                    cryptoKeyExchangeMapping6.E = cryptoKeyExchangeMapping5;
                    cryptoKeyExchangeMapping5 = cryptoKeyExchangeMapping6;
                }
                connectionPoolManager2695 = connectionPoolManager2695.P;
            }
        }
        this.C = n;
    }

    public void D(int n, boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    this.d = n;
                    break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            this.L = n;
        }
    }

    private void R() {
        if (this.r == 4) {
            CryptoKeyExchangeMapping cryptoKeyExchangeMapping = new CryptoKeyExchangeMapping();
            cryptoKeyExchangeMapping.b = new CryptoOperationOrchestrator951(cryptoKeyExchangeMapping);
            cryptoKeyExchangeMapping.F(this.N.U, this.N.I);
            this.K.h = cryptoKeyExchangeMapping;
            this.K = cryptoKeyExchangeMapping;
            this.w = null;
        } else {
            try {
                if (this.r == 1) {
                    this.w.u = (short)this.e;
                    this.w = null;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
    }

    public void I(String string, String string2, String string3, CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping cryptoKeyExchangeMapping2, int n) {
        block15: {
            block16: {
                try {
                    try {
                        if (string3 == null) break block15;
                        if (this.v != null) break block16;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                    this.v = new EncodingUtilityManager();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            ++this.I;
            this.v.f(cryptoKeyExchangeMapping.n).f(cryptoKeyExchangeMapping2.n - cryptoKeyExchangeMapping.n).f(this.Ui.j(string)).f(this.Ui.j(string3)).f(n);
        }
        try {
            if (this.B == null) {
                this.B = new EncodingUtilityManager();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        ++this.u;
        this.B.f(cryptoKeyExchangeMapping.n).f(cryptoKeyExchangeMapping2.n - cryptoKeyExchangeMapping.n).f(this.Ui.j(string)).f(this.Ui.j(string2)).f(n);
        if (this.r != 0) {
            int n2;
            int n3;
            block18: {
                block17: {
                    char c = string2.charAt(0);
                    try {
                        try {
                            n3 = n;
                            if (c != 'J' && c != 'D') break block17;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                        n2 = 2;
                        break block18;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                n2 = 1;
            }
            int n4 = n3 + n2;
            try {
                if (n4 > this.R) {
                    this.R = n4;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
    }

    public void r(int n, CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        block45: {
            int n2;
            block43: {
                CryptoKeyExchangeMapping cryptoKeyExchangeMapping2;
                block44: {
                    boolean bl;
                    block38: {
                        block41: {
                            block42: {
                                block40: {
                                    block39: {
                                        block37: {
                                            block36: {
                                                block35: {
                                                    block31: {
                                                        block33: {
                                                            int n3;
                                                            EncodingUtilityManager encodingUtilityManager;
                                                            block34: {
                                                                block32: {
                                                                    int n4;
                                                                    try {
                                                                        this.b = this.N.I;
                                                                        n4 = n >= 200 ? n - 33 : n;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                                    }
                                                                    n2 = n4;
                                                                    bl = false;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if ((cryptoKeyExchangeMapping.C & 4) == 0 || cryptoKeyExchangeMapping.n - this.N.I >= Short.MIN_VALUE) break block31;
                                                                            }
                                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                                            }
                                                                            if (n2 != 167) break block32;
                                                                        }
                                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                                        }
                                                                        this.N.Z(200);
                                                                        break block33;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                                    }
                                                                }
                                                                try {
                                                                    if (n2 != 168) break block34;
                                                                    this.N.Z(201);
                                                                    break block33;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                                }
                                                            }
                                                            try {
                                                                encodingUtilityManager = this.N;
                                                                n3 = n2 >= 198 ? n2 ^ 1 : (n2 + 1 ^ 1) - 1;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                            }
                                                            encodingUtilityManager.Z(n3);
                                                            this.N.f(8);
                                                            this.N.Z(220);
                                                            this.A = true;
                                                            bl = true;
                                                        }
                                                        cryptoKeyExchangeMapping.D(this.N, this.N.I - 1, true);
                                                        break block36;
                                                    }
                                                    try {
                                                        if (n2 == n) break block35;
                                                        this.N.Z(n);
                                                        cryptoKeyExchangeMapping.D(this.N, this.N.I - 1, true);
                                                        break block36;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                    }
                                                }
                                                this.N.Z(n2);
                                                cryptoKeyExchangeMapping.D(this.N, this.N.I - 1, false);
                                            }
                                            if (this.w == null) break block45;
                                            cryptoKeyExchangeMapping2 = null;
                                            try {
                                                if (this.r != 4) break block37;
                                                this.w.b.o(n2, 0, null, null);
                                                cryptoKeyExchangeMapping.a().C = (short)(cryptoKeyExchangeMapping.a().C | 2);
                                                this.O(0, cryptoKeyExchangeMapping);
                                                if (n2 == 167) break block38;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                            }
                                            cryptoKeyExchangeMapping2 = new CryptoKeyExchangeMapping();
                                            break block38;
                                        }
                                        try {
                                            if (this.r != 3) break block39;
                                            this.w.b.o(n2, 0, null, null);
                                            break block38;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        if (this.r != 2) break block40;
                                        this.D += j[n2];
                                        break block38;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (n2 != 168) break block41;
                                        if ((cryptoKeyExchangeMapping.C & 0x20) != 0) break block42;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    cryptoKeyExchangeMapping.C = (short)(cryptoKeyExchangeMapping.C | 0x20);
                                    this.i = true;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                            }
                            this.w.C = (short)(this.w.C | 0x10);
                            this.O(this.D + 1, cryptoKeyExchangeMapping);
                            cryptoKeyExchangeMapping2 = new CryptoKeyExchangeMapping();
                            break block38;
                        }
                        this.D += j[n2];
                        this.O(this.D, cryptoKeyExchangeMapping);
                    }
                    try {
                        try {
                            if (cryptoKeyExchangeMapping2 == null) break block43;
                            if (!bl) break block44;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                        cryptoKeyExchangeMapping2.C = (short)(cryptoKeyExchangeMapping2.C | 2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                this.z(cryptoKeyExchangeMapping2);
            }
            try {
                if (n2 == 167) {
                    this.R();
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
    }

    /*
     * Exception decompiling
     */
    private void Y() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[TRYBLOCK]], but top level block is 15[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    final void j(ComputationalRateController computationalRateController) {
        computationalRateController.O(this.M);
        computationalRateController.O(this.E);
    }

    int Y() {
        int n;
        block39: {
            int n2;
            aN[] aNArray;
            String string;
            int n3;
            block41: {
                block40: {
                    block36: {
                        int n4;
                        aN[] aNArray2;
                        String string2;
                        int n5;
                        block38: {
                            block37: {
                                block31: {
                                    block33: {
                                        String string3;
                                        aX aX2;
                                        boolean bl;
                                        block35: {
                                            block34: {
                                                block32: {
                                                    long l = bb ^ 0x1F4FD6B583L;
                                                    try {
                                                        if (this.a != 0) {
                                                            return 6 + this.H;
                                                        }
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                    }
                                                    n = 8;
                                                    try {
                                                        try {
                                                            if (this.N.I <= 0) break block31;
                                                            if (this.N.I <= BytecodeAnalysisEngine.b(11276, 0x208F37D796E91C7BL ^ l)) break block32;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                        }
                                                        throw new MethodComplexityException(this.Ui.B(), this.O, this.UI, this.N.I);
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                    }
                                                }
                                                this.Ui.j("Code");
                                                n += 16 + this.N.I + CryptographicPaddingUtility.S(this.k);
                                                try {
                                                    try {
                                                        if (this.l == null) break block33;
                                                        if (this.Ui.q() < 50) break block34;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                    }
                                                    bl = true;
                                                    break block35;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                }
                                            }
                                            bl = false;
                                        }
                                        boolean bl2 = bl;
                                        try {
                                            aX2 = this.Ui;
                                            string3 = bl2 ? "StackMapTable" : "StackMap";
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                        }
                                        aX2.j(string3);
                                        n += 8 + this.l.I;
                                    }
                                    if (this.P != null) {
                                        this.Ui.j("LineNumberTable");
                                        n += 8 + this.P.I;
                                    }
                                    if (this.B != null) {
                                        this.Ui.j("LocalVariableTable");
                                        n += 8 + this.B.I;
                                    }
                                    if (this.v != null) {
                                        this.Ui.j("LocalVariableTypeTable");
                                        n += 8 + this.v.I;
                                    }
                                    if (this.Y != null) {
                                        n += this.Y.M("RuntimeVisibleTypeAnnotations");
                                    }
                                    if (this.x != null) {
                                        n += this.x.M("RuntimeInvisibleTypeAnnotations");
                                    }
                                    if (this.E != null) {
                                        n += this.E.B(this.Ui, this.N.U, this.N.I, this.C, this.R);
                                    }
                                }
                                if (this.z > 0) {
                                    this.Ui.j("Exceptions");
                                    n += 8 + 2 * this.z;
                                }
                                n += CryptoContextManager1052.z(this.Ui, this.p, this.g);
                                n += aN.m(this.UC, this.m, this.f, this.Z);
                                try {
                                    try {
                                        if (this.W == null) break block36;
                                        n5 = n;
                                        string2 = "RuntimeVisibleParameterAnnotations";
                                        aNArray2 = this.W;
                                        if (this.d != 0) break block37;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    n4 = this.W.length;
                                    break block38;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                            }
                            n4 = this.d;
                        }
                        n = n5 + aN.P(string2, aNArray2, n4);
                    }
                    try {
                        try {
                            if (this.Q == null) break block39;
                            n3 = n;
                            string = "RuntimeInvisibleParameterAnnotations";
                            aNArray = this.Q;
                            if (this.L != 0) break block40;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                        n2 = this.Q.length;
                        break block41;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                n2 = this.L;
            }
            n = n3 + aN.P(string, aNArray, n2);
        }
        if (this.V != null) {
            this.Ui.j("AnnotationDefault");
            n += 6 + this.V.I;
        }
        if (this.n != null) {
            this.Ui.j("MethodParameters");
            n += 7 + this.n.I;
        }
        if (this.M != null) {
            n += this.M.X(this.Ui);
        }
        return n;
    }

    void T(EncodingUtilityManager encodingUtilityManager) {
        block106: {
            int n;
            aN[] aNArray;
            int n2;
            block108: {
                block107: {
                    block103: {
                        int n3;
                        aN[] aNArray2;
                        int n4;
                        block105: {
                            block104: {
                                int n5;
                                long l;
                                block99: {
                                    int n6;
                                    boolean bl;
                                    l = bb ^ 0xA07A71E1FA9L;
                                    try {
                                        bl = this.Ui.q() < 49;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    boolean bl2 = bl;
                                    try {
                                        n6 = bl2 ? 4096 : 0;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    int n7 = n6;
                                    try {
                                        encodingUtilityManager.f(this.p & ~n7).f(this.U).f(this.o);
                                        if (this.a != 0) {
                                            encodingUtilityManager.T(this.Ui.n().I, this.a, this.H);
                                            return;
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    n5 = 0;
                                    try {
                                        if (this.N.I > 0) {
                                            ++n5;
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.z > 0) {
                                            ++n5;
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    try {
                                        try {
                                            if ((this.p & 0x1000) == 0 || !bl2) break block99;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                        }
                                        ++n5;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    if (this.g != 0) {
                                        ++n5;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                try {
                                    if ((this.p & BytecodeAnalysisEngine.b(14943, 0x7C78B3BD4FDDA003L ^ l)) != 0) {
                                        ++n5;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                try {
                                    if (this.UC != null) {
                                        ++n5;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                try {
                                    if (this.m != null) {
                                        ++n5;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                try {
                                    if (this.W != null) {
                                        ++n5;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                try {
                                    if (this.Q != null) {
                                        ++n5;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                try {
                                    if (this.f != null) {
                                        ++n5;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                try {
                                    if (this.Z != null) {
                                        ++n5;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                try {
                                    if (this.V != null) {
                                        ++n5;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                try {
                                    if (this.n != null) {
                                        ++n5;
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                if (this.M != null) {
                                    n5 += this.M.f();
                                }
                                encodingUtilityManager.f(n5);
                                if (this.N.I > 0) {
                                    block100: {
                                        String string;
                                        aX aX2;
                                        EncodingUtilityManager encodingUtilityManager2;
                                        int n8;
                                        block102: {
                                            block101: {
                                                int n9 = 10 + this.N.I + CryptographicPaddingUtility.S(this.k);
                                                int n10 = 0;
                                                if (this.l != null) {
                                                    n9 += 8 + this.l.I;
                                                    ++n10;
                                                }
                                                if (this.P != null) {
                                                    n9 += 8 + this.P.I;
                                                    ++n10;
                                                }
                                                if (this.B != null) {
                                                    n9 += 8 + this.B.I;
                                                    ++n10;
                                                }
                                                if (this.v != null) {
                                                    n9 += 8 + this.v.I;
                                                    ++n10;
                                                }
                                                if (this.Y != null) {
                                                    n9 += this.Y.M("RuntimeVisibleTypeAnnotations");
                                                    ++n10;
                                                }
                                                if (this.x != null) {
                                                    n9 += this.x.M("RuntimeInvisibleTypeAnnotations");
                                                    ++n10;
                                                }
                                                if (this.E != null) {
                                                    n9 += this.E.B(this.Ui, this.N.U, this.N.I, this.C, this.R);
                                                    n10 += this.E.f();
                                                }
                                                try {
                                                    try {
                                                        encodingUtilityManager.f(this.Ui.j("Code")).y(n9).f(this.C).f(this.R).y(this.N.I).T(this.N.U, 0, this.N.I);
                                                        CryptographicPaddingUtility.P(this.k, encodingUtilityManager);
                                                        encodingUtilityManager.f(n10);
                                                        if (this.l == null) break block100;
                                                        if (this.Ui.q() < 50) break block101;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                    }
                                                    n8 = 1;
                                                    break block102;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                                }
                                            }
                                            n8 = 0;
                                        }
                                        int n11 = n8;
                                        try {
                                            encodingUtilityManager2 = encodingUtilityManager;
                                            aX2 = this.Ui;
                                            string = n11 != 0 ? "StackMapTable" : "StackMap";
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                        }
                                        encodingUtilityManager2.f(aX2.j(string)).y(2 + this.l.I).f(this.Uf).T(this.l.U, 0, this.l.I);
                                    }
                                    try {
                                        if (this.P != null) {
                                            encodingUtilityManager.f(this.Ui.j("LineNumberTable")).y(2 + this.P.I).f(this.X).T(this.P.U, 0, this.P.I);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.B != null) {
                                            encodingUtilityManager.f(this.Ui.j("LocalVariableTable")).y(2 + this.B.I).f(this.u).T(this.B.U, 0, this.B.I);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.v != null) {
                                            encodingUtilityManager.f(this.Ui.j("LocalVariableTypeTable")).y(2 + this.v.I).f(this.I).T(this.v.U, 0, this.v.I);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.Y != null) {
                                            this.Y.r(this.Ui.j("RuntimeVisibleTypeAnnotations"), encodingUtilityManager);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.x != null) {
                                            this.x.r(this.Ui.j("RuntimeInvisibleTypeAnnotations"), encodingUtilityManager);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    try {
                                        if (this.E != null) {
                                            this.E.G(this.Ui, this.N.U, this.N.I, this.C, this.R, encodingUtilityManager);
                                        }
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                }
                                if (this.z > 0) {
                                    encodingUtilityManager.f(this.Ui.j("Exceptions")).y(2 + 2 * this.z).f(this.z);
                                    for (int n12 : this.S) {
                                        encodingUtilityManager.f(n12);
                                    }
                                }
                                try {
                                    try {
                                        CryptoContextManager1052.F(this.Ui, this.p, this.g, encodingUtilityManager);
                                        aN.r(this.Ui, this.UC, this.m, this.f, this.Z, encodingUtilityManager);
                                        if (this.W == null) break block103;
                                        n4 = this.Ui.j("RuntimeVisibleParameterAnnotations");
                                        aNArray2 = this.W;
                                        if (this.d != 0) break block104;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    n3 = this.W.length;
                                    break block105;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                            }
                            n3 = this.d;
                        }
                        aN.i(n4, aNArray2, n3, encodingUtilityManager);
                    }
                    try {
                        try {
                            if (this.Q == null) break block106;
                            n2 = this.Ui.j("RuntimeInvisibleParameterAnnotations");
                            aNArray = this.Q;
                            if (this.L != 0) break block107;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                        n = this.Q.length;
                        break block108;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                n = this.L;
            }
            aN.i(n2, aNArray, n, encodingUtilityManager);
        }
        try {
            if (this.V != null) {
                encodingUtilityManager.f(this.Ui.j("AnnotationDefault")).y(this.V.I).T(this.V.U, 0, this.V.I);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        try {
            if (this.n != null) {
                encodingUtilityManager.f(this.Ui.j("MethodParameters")).y(1 + this.n.I).Z(this.h).T(this.n.U, 0, this.n.I);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        try {
            if (this.M != null) {
                this.M.y(this.Ui, encodingUtilityManager);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x789A;
        if (gb[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hb.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    hb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Nf", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            BytecodeAnalysisEngine.gb[n2] = n3;
        }
        return gb[n2];
    }

    boolean p() {
        boolean bl;
        try {
            bl = this.Uf > 0;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        return bl;
    }

    public void T(int n) {
        block15: {
            block18: {
                block17: {
                    try {
                        block16: {
                            try {
                                try {
                                    this.b = this.N.I;
                                    this.N.Z(n);
                                    if (this.w == null) break block15;
                                    if (this.r == 4) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                if (this.r != 3) break block17;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                        }
                        this.w.b.o(n, 0, null, null);
                        break block18;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                int n2 = this.D + j[n];
                try {
                    if (n2 > this.e) {
                        this.e = n2;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
                this.D = n2;
            }
            try {
                block19: {
                    try {
                        try {
                            if (n >= 172 && n <= 177) break block19;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                        if (n != 191) break block15;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                this.R();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean h(CipherEncryptionUtility cipherEncryptionUtility, boolean bl, boolean bl2, int n, int n2, int n3) {
        block31: {
            boolean bl3;
            block30: {
                block29: {
                    boolean bl4;
                    boolean bl5;
                    block28: {
                        block27: {
                            long l = bb ^ 0x3425DA5265D9L;
                            try {
                                try {
                                    try {
                                        try {
                                            if (cipherEncryptionUtility != this.Ui.n() || n != this.o) return false;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                        }
                                        if (n2 != this.g) return false;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                    }
                                    bl5 = bl2;
                                    if ((this.p & BytecodeAnalysisEngine.b(29111, 0x523E4105CE4A9191L ^ l)) == 0) break block27;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                bl4 = true;
                                break block28;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                        }
                        bl4 = false;
                    }
                    try {
                        if (bl5 != bl4) {
                            return false;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                    try {
                        try {
                            if (this.Ui.q() >= 49 || (this.p & 0x1000) == 0) break block29;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                        bl3 = true;
                        break block30;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                bl3 = false;
            }
            boolean bl6 = bl3;
            try {
                if (bl != bl6) {
                    return false;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
            try {
                try {
                    if (n3 != 0) break block31;
                    if (this.z == 0) return true;
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
        if (cipherEncryptionUtility.d(n3) != this.z) return true;
        int n4 = n3 + 2;
        int n5 = 0;
        while (true) {
            block32: {
                try {
                    try {
                        if (n5 >= this.z) return true;
                        if (cipherEncryptionUtility.d(n4) == this.S[n5]) break block32;
                        return false;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            n4 += 2;
            ++n5;
        }
    }

    public ExtendedApiResolver B(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        try {
            if (bl) {
                this.f = aN.h(this.Ui, n, errorDiagnosticTracker, string, this.f);
                return this.f;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        this.Z = aN.h(this.Ui, n, errorDiagnosticTracker, string, this.Z);
        return this.Z;
    }

    public void c(int n, int n2) {
        block7: {
            block9: {
                block8: {
                    block6: {
                        try {
                            if (this.r != 4) break block6;
                            this.p();
                            break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (this.r != 1) break block8;
                        this.a();
                        break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                try {
                    if (this.r != 2) break block9;
                    this.C = this.e;
                    break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            this.C = n;
            this.R = n2;
        }
    }

    public void v() {
    }

    public void p(String string, int n) {
        int n2;
        EncodingUtilityManager encodingUtilityManager;
        try {
            if (this.n == null) {
                this.n = new EncodingUtilityManager();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        try {
            ++this.h;
            encodingUtilityManager = this.n;
            n2 = string == null ? 0 : this.Ui.j(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        encodingUtilityManager.f(n2).f(n);
    }

    public void f(String string, String string2, ConfigurationDescriptor1455 configurationDescriptor1455, Object ... objectArray) {
        block9: {
            EncryptionContextInitializer encryptionContextInitializer;
            block11: {
                this.b = this.N.I;
                encryptionContextInitializer = this.Ui.e(string, string2, configurationDescriptor1455, objectArray);
                try {
                    block10: {
                        try {
                            try {
                                this.N.I(186, encryptionContextInitializer.Z);
                                this.N.f(0);
                                if (this.w == null) break block9;
                                if (this.r == 4) break block10;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                            if (this.r != 3) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                    }
                    this.w.b.o(186, 0, encryptionContextInitializer, this.Ui);
                    break block9;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            int n = encryptionContextInitializer.d();
            int n2 = (n & 3) - (n >> 2) + 1;
            int n3 = this.D + n2;
            try {
                if (n3 > this.e) {
                    this.e = n3;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
            this.D = n3;
        }
    }

    public void M(int n, String string, String string2, String string3, boolean bl) {
        block13: {
            EncryptionContextInitializer encryptionContextInitializer;
            block15: {
                block12: {
                    block11: {
                        this.b = this.N.I;
                        encryptionContextInitializer = this.Ui.V(string, string2, string3, bl);
                        try {
                            if (n != 185) break block11;
                            this.N.I(185, encryptionContextInitializer.Z).T(encryptionContextInitializer.d() >> 2, 0);
                            break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                    }
                    this.N.I(n, encryptionContextInitializer.Z);
                }
                try {
                    block14: {
                        try {
                            try {
                                if (this.w == null) break block13;
                                if (this.r == 4) break block14;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                            if (this.r != 3) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                    }
                    this.w.b.o(n, 0, encryptionContextInitializer, this.Ui);
                    break block13;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            int n2 = encryptionContextInitializer.d();
            int n3 = (n2 & 3) - (n2 >> 2);
            int n4 = n == 184 ? this.D + n3 + 1 : this.D + n3;
            try {
                if (n4 > this.e) {
                    this.e = n4;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
            this.D = n4;
        }
    }

    public void E(int n, CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        try {
            if (this.P == null) {
                this.P = new EncodingUtilityManager();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        ++this.X;
        this.P.f(cryptoKeyExchangeMapping.n);
        this.P.f(n);
    }

    private void p() {
        int n;
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping;
        Object object;
        CryptographicPaddingUtility cryptographicPaddingUtility = this.k;
        while (true) {
            String string;
            block24: {
                block23: {
                    try {
                        try {
                            if (cryptographicPaddingUtility == null) break;
                            if (cryptographicPaddingUtility.u != null) break block23;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                        string = "java/lang/Throwable";
                        break block24;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                string = cryptographicPaddingUtility.u;
            }
            object = string;
            int n2 = CryptoOperationOrchestrator951.M(this.Ui, (String)object);
            CryptoKeyExchangeMapping cryptoKeyExchangeMapping2 = cryptographicPaddingUtility.l.a();
            cryptoKeyExchangeMapping2.C = (short)(cryptoKeyExchangeMapping2.C | 2);
            cryptoKeyExchangeMapping = cryptographicPaddingUtility.F.a();
            CryptoKeyExchangeMapping cryptoKeyExchangeMapping3 = cryptographicPaddingUtility.t.a();
            while (cryptoKeyExchangeMapping != cryptoKeyExchangeMapping3) {
                cryptoKeyExchangeMapping.e = new ConnectionPoolManager2695(n2, cryptoKeyExchangeMapping2, cryptoKeyExchangeMapping.e);
                cryptoKeyExchangeMapping = cryptoKeyExchangeMapping.h;
            }
            cryptographicPaddingUtility = cryptographicPaddingUtility.i;
        }
        object = this.J.b;
        ((CryptoOperationOrchestrator951)object).E(this.Ui, this.p, this.UI, this.R);
        ((CryptoOperationOrchestrator951)object).U(this);
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping4 = this.J;
        cryptoKeyExchangeMapping4.E = CryptoKeyExchangeMapping.z;
        int n3 = 0;
        while (cryptoKeyExchangeMapping4 != CryptoKeyExchangeMapping.z) {
            cryptoKeyExchangeMapping = cryptoKeyExchangeMapping4;
            cryptoKeyExchangeMapping4 = cryptoKeyExchangeMapping4.E;
            cryptoKeyExchangeMapping.E = null;
            cryptoKeyExchangeMapping.C = (short)(cryptoKeyExchangeMapping.C | 8);
            int n4 = cryptoKeyExchangeMapping.b.E() + cryptoKeyExchangeMapping.u;
            if (n4 > n3) {
                n3 = n4;
            }
            ConnectionPoolManager2695 connectionPoolManager2695 = cryptoKeyExchangeMapping.e;
            while (connectionPoolManager2695 != null) {
                block25: {
                    CryptoKeyExchangeMapping cryptoKeyExchangeMapping5 = connectionPoolManager2695.n.a();
                    n = cryptoKeyExchangeMapping.b.Z(this.Ui, cryptoKeyExchangeMapping5.b, connectionPoolManager2695.i) ? 1 : 0;
                    try {
                        if (n == 0 || cryptoKeyExchangeMapping5.E != null) break block25;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                    cryptoKeyExchangeMapping5.E = cryptoKeyExchangeMapping4;
                    cryptoKeyExchangeMapping4 = cryptoKeyExchangeMapping5;
                }
                connectionPoolManager2695 = connectionPoolManager2695.P;
            }
        }
        cryptoKeyExchangeMapping = this.J;
        while (true) {
            block26: {
                try {
                    try {
                        if (cryptoKeyExchangeMapping == null) break;
                        if ((cryptoKeyExchangeMapping.C & 0xA) != 10) break block26;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                    cryptoKeyExchangeMapping.b.U(this);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            if ((cryptoKeyExchangeMapping.C & 8) == 0) {
                int n5;
                CryptoKeyExchangeMapping cryptoKeyExchangeMapping6 = cryptoKeyExchangeMapping.h;
                int n6 = cryptoKeyExchangeMapping.n;
                try {
                    n5 = cryptoKeyExchangeMapping6 == null ? this.N.I : cryptoKeyExchangeMapping6.n;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
                int n7 = n5 - 1;
                if (n7 >= n6) {
                    try {
                        for (n = n6; n < n7; ++n) {
                            this.N.U[n] = 0;
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                    this.N.U[n7] = -65;
                    n = this.m(n6, 0, 1);
                    this.c[n] = CryptoOperationOrchestrator951.M(this.Ui, "java/lang/Throwable");
                    this.T();
                    this.k = CryptographicPaddingUtility.N(this.k, cryptoKeyExchangeMapping, cryptoKeyExchangeMapping6);
                    n3 = Math.max(n3, 1);
                }
            }
            cryptoKeyExchangeMapping = cryptoKeyExchangeMapping.h;
        }
        this.C = n3;
    }

    public ExtendedApiResolver I(int n, String string, boolean bl) {
        block7: {
            block8: {
                try {
                    try {
                        if (!bl) break block7;
                        if (this.W != null) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                    this.W = new aN[zY.a(this.UI).length];
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            this.W[n] = aN.H(this.Ui, string, this.W[n]);
            return this.W[n];
        }
        try {
            if (this.Q == null) {
                this.Q = new aN[zY.a(this.UI).length];
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        this.Q[n] = aN.H(this.Ui, string, this.Q[n]);
        return this.Q[n];
    }

    private void e(CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray) {
        block5: {
            block7: {
                block6: {
                    try {
                        if (this.w == null) break block5;
                        if (this.r != 4) break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                    this.w.b.o(171, 0, null, null);
                    this.O(0, cryptoKeyExchangeMapping);
                    cryptoKeyExchangeMapping.a().C = (short)(cryptoKeyExchangeMapping.a().C | 2);
                    for (CryptoKeyExchangeMapping cryptoKeyExchangeMapping2 : cryptoKeyExchangeMappingArray) {
                        this.O(0, cryptoKeyExchangeMapping2);
                        cryptoKeyExchangeMapping2.a().C = (short)(cryptoKeyExchangeMapping2.a().C | 2);
                    }
                    break block7;
                }
                if (this.r == 1) {
                    --this.D;
                    this.O(this.D, cryptoKeyExchangeMapping);
                    for (CryptoKeyExchangeMapping cryptoKeyExchangeMapping3 : cryptoKeyExchangeMappingArray) {
                        this.O(this.D, cryptoKeyExchangeMapping3);
                    }
                }
            }
            this.R();
        }
    }

    public ExtendedApiResolver p(String string, boolean bl) {
        try {
            if (bl) {
                this.UC = aN.H(this.Ui, string, this.UC);
                return this.UC;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        this.m = aN.H(this.Ui, string, this.m);
        return this.m;
    }

    public void v(CryptoKeyExchangeMapping cryptoKeyExchangeMapping, int[] nArray, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray) {
        this.b = this.N.I;
        this.N.Z(171).T(null, 0, (4 - this.N.I % 4) % 4);
        cryptoKeyExchangeMapping.D(this.N, this.b, true);
        this.N.y(cryptoKeyExchangeMappingArray.length);
        try {
            for (int i = 0; i < cryptoKeyExchangeMappingArray.length; ++i) {
                this.N.y(nArray[i]);
                cryptoKeyExchangeMappingArray[i].D(this.N, this.b, true);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        this.e(cryptoKeyExchangeMapping, cryptoKeyExchangeMappingArray);
    }

    public ExtendedApiResolver E(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        try {
            if (bl) {
                this.Y = aN.h(this.Ui, n, errorDiagnosticTracker, string, this.Y);
                return this.Y;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw BytecodeAnalysisEngine.a(illegalArgumentException);
        }
        this.x = aN.h(this.Ui, n, errorDiagnosticTracker, string, this.x);
        return this.x;
    }

    public void F(int n, int n2) {
        block14: {
            block16: {
                block13: {
                    block12: {
                        try {
                            this.b = this.N.I;
                            if (n != 17) break block12;
                            this.N.I(n, n2);
                            break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                    }
                    this.N.T(n, n2);
                }
                try {
                    block15: {
                        try {
                            try {
                                if (this.w == null) break block14;
                                if (this.r == 4) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                            if (this.r != 3) break block16;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                    }
                    this.w.b.o(n, n2, null, null);
                    break block14;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
            }
            if (n != 188) {
                int n3 = this.D + 1;
                try {
                    if (n3 > this.e) {
                        this.e = n3;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                }
                this.D = n3;
            }
        }
    }

    void G(int n, int n2) {
        this.c[n] = n2;
    }

    public void e(int n, int n2) {
        block19: {
            block18: {
                block17: {
                    try {
                        block16: {
                            try {
                                try {
                                    this.b = this.N.I;
                                    if (n > 255 || n2 > 127) break block16;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw BytecodeAnalysisEngine.a(illegalArgumentException);
                                }
                                if (n2 >= -128) break block17;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw BytecodeAnalysisEngine.a(illegalArgumentException);
                            }
                        }
                        this.N.Z(196).I(132, n).f(n2);
                        break block18;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                this.N.Z(132).T(n, n2);
            }
            try {
                block20: {
                    try {
                        try {
                            if (this.w == null) break block19;
                            if (this.r == 4) break block20;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw BytecodeAnalysisEngine.a(illegalArgumentException);
                        }
                        if (this.r != 3) break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw BytecodeAnalysisEngine.a(illegalArgumentException);
                    }
                }
                this.w.b.o(132, n, null, null);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
        if (this.r != 0) {
            int n3 = n + 1;
            try {
                if (n3 > this.R) {
                    this.R = n3;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw BytecodeAnalysisEngine.a(illegalArgumentException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                BytecodeAnalysisEngine.bb = MultiContainerRegistry.a(-1344519093594345944L, 1465160515499655888L, null).a(184734554395975L);
                BytecodeAnalysisEngine.hb = new HashMap<K, V>(13);
                var0 = BytecodeAnalysisEngine.bb ^ 121683791727702L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00f8T\u00b5\u0080:\u007f{\u0084\u00dc}\u00db\u00bcm\u00f7\u00cc\u00b6\u00cc\u00a7/CTA\u0018~v=\u0092e\u00e6\u00f7\u00dc\u00a7\u00ec\u00aaJ\u00a2\u00f6@\u0096\u0083\u00d5\u00e8s\u000f\u00fd\u00c2i\u0097\u0001\u0018\u00ed\u0000\u0017\u00e4\u00d0\u00ca";
                var7_6 = "\u00f8T\u00b5\u0080:\u007f{\u0084\u00dc}\u00db\u00bcm\u00f7\u00cc\u00b6\u00cc\u00a7/CTA\u0018~v=\u0092e\u00e6\u00f7\u00dc\u00a7\u00ec\u00aaJ\u00a2\u00f6@\u0096\u0083\u00d5\u00e8s\u000f\u00fd\u00c2i\u0097\u0001\u0018\u00ed\u0000\u0017\u00e4\u00d0\u00ca".length();
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
                    var6_5 = "\u00c0\u00bb\u00b4\u000e\u00efz\r&\u00aa\u00f7MA\u0093\u0091\u009b\u000f";
                    var7_6 = "\u00c0\u00bb\u00b4\u000e\u00efz\r&\u00aa\u00f7MA\u0093\u0091\u009b\u000f".length();
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
        BytecodeAnalysisEngine.fb = var8_3;
        BytecodeAnalysisEngine.gb = new Integer[9];
        BytecodeAnalysisEngine.j = new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
    }
}

