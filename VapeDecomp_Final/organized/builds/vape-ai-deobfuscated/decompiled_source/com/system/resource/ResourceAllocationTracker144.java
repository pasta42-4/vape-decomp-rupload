/*
 * Decompiled with CFR 0.152.
 */
package com.system.resource;

import a.Hx;
import a.Jd;
import a.XF;
import a.ay;
import a.i5;
import a.zY;
import com.app.configuration.ConfigurationDescriptor1455;
import com.app.system.health.HealthJudge;
import com.bytecode.analysis.BytecodeMetadataAnalyzer;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.cache.management.CacheInvalidationManager2353;
import com.cloud.security.CloudServiceCredentials;
import com.collections.management.MultiContainerRegistry;
import com.configuration.profile.ConfigurationProfileBuilder;
import com.data.collection.CollectionOrchestrator1895;
import com.device.configuration.DeviceConfigurationProfile;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.game.assets.AssetLoadingCoordinator;
import com.localization.content.MultilingualContentDescriptor;
import com.network.connection.ConnectionStateManager;
import com.network.monitoring.TransmissionStateTracker;
import com.network.pool.ConnectionPoolConfiguration;
import com.resource.management.ResourceAllocationTracker1674;
import com.resource.management.ResourceLifecycleManager1859;
import com.security.authentication.AuthenticationTokenManager2358;
import com.security.crypto.CryptoBlockCipher;
import com.security.crypto.CryptoContextManager1052;
import com.security.crypto.CryptoSecurityManager1576;
import com.security.cryptography.CryptographicKeyManager1236;
import com.security.exchange.CryptoKeyExchangeMapping;
import com.system.extensions.ExtendedApiResolver;
import com.system.integration.SystemIntegrationProfile;
import com.system.resources.ResourceAllocationTracker2106;
import com.transaction.core.TransactionContextManager2370;
import com.vape.analytics.VapeAnalyticsTracker;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ResourceAllocationTracker144
extends BytecodeInstrumentationEngine {
    public List<CryptoBlockCipher> E;
    public int X;
    public List<CryptographicKeyManager1236> C;
    private static final Map i;
    private boolean f;
    private static final long b;
    public List<ay> Z;
    public List<ay> Y;
    public int K;
    public List<String> I;
    public int v;
    public List<CryptoBlockCipher> a;
    public List<ay>[] H;
    public List<CryptoSecurityManager1576> M;
    public XF V;
    public String g;
    public List<CryptoContextManager1052> x;
    public List<CryptoSecurityManager1576> c;
    private static final Integer[] h;
    public String P;
    public List<VapeAnalyticsTracker> z;
    private static final long[] e;
    public int A;
    public Object k;
    public int s;
    public String R;
    public List<ay>[] d;
    public List<MultilingualContentDescriptor> B;

    public void D() {
    }

    public void v(CryptoKeyExchangeMapping cryptoKeyExchangeMapping, int[] nArray, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray) {
        this.V.R(new ResourceAllocationTracker1674(this.T(cryptoKeyExchangeMapping), nArray, this.z(cryptoKeyExchangeMappingArray)));
    }

    public void e(int n, int n2) {
        this.V.R(new ResourceAllocationTracker2106(n, n2));
    }

    public void K(int n, int n2, Object[] objectArray, int n3, Object[] objectArray2) {
        Object[] objectArray3;
        int n4;
        int n5;
        Hx hx;
        Hx hx2;
        XF xF;
        try {
            Hx hx3;
            xF = this.V;
            hx2 = hx3;
            hx = hx3;
            n5 = n;
            n4 = n2;
            objectArray3 = objectArray == null ? null : this.P(objectArray);
        }
        catch (IllegalStateException illegalStateException) {
            throw ResourceAllocationTracker144.a(illegalStateException);
        }
        hx2(n5, n4, objectArray3, n3, objectArray2 == null ? null : this.P(objectArray2));
        xF.R(hx);
    }

    private Object[] P(Object[] objectArray) {
        Object[] objectArray2 = new Object[objectArray.length];
        for (Object object : objectArray) {
            if (object instanceof CryptoKeyExchangeMapping) {
                object = this.T((CryptoKeyExchangeMapping)object);
            }
            objectArray2[var3_3] = object;
        }
        return objectArray2;
    }

    public void z(CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        this.V.R(this.T(cryptoKeyExchangeMapping));
    }

    public void O(CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping cryptoKeyExchangeMapping2, CryptoKeyExchangeMapping cryptoKeyExchangeMapping3, String string) {
        CryptographicKeyManager1236 cryptographicKeyManager1236 = new CryptographicKeyManager1236(this.T(cryptoKeyExchangeMapping), this.T(cryptoKeyExchangeMapping2), this.T(cryptoKeyExchangeMapping3), string);
        this.C = i5.i(this.C, cryptographicKeyManager1236);
    }

    public void C(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer) {
        String[] stringArray;
        try {
            stringArray = this.I == null ? null : this.I.toArray(new String[0]);
        }
        catch (IllegalStateException illegalStateException) {
            throw ResourceAllocationTracker144.a(illegalStateException);
        }
        String[] stringArray2 = stringArray;
        BytecodeInstrumentationEngine bytecodeInstrumentationEngine = bytecodeMetadataAnalyzer.q(this.A, this.R, this.P, this.g, stringArray2);
        try {
            if (bytecodeInstrumentationEngine != null) {
                this.d(bytecodeInstrumentationEngine);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw ResourceAllocationTracker144.a(illegalStateException);
        }
    }

    public void n(int n, int n2) {
        this.V.R(new HealthJudge(n, n2));
    }

    public void T(int n) {
        this.V.R(new ConnectionStateManager(n));
    }

    public void D(int n, boolean bl) {
        block3: {
            block2: {
                try {
                    if (!bl) break block2;
                    this.v = n;
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
            }
            this.s = n;
        }
    }

    public void u(CryptoContextManager1052 cryptoContextManager1052) {
        this.x = i5.i(this.x, cryptoContextManager1052);
    }

    public void Z(Object object) {
        this.V.R(new TransactionContextManager2370(object));
    }

    public void d(BytecodeInstrumentationEngine bytecodeInstrumentationEngine) {
        block58: {
            int n;
            int n2;
            block59: {
                ay ay2;
                int n3;
                int n4;
                List<ay> list;
                if (this.z != null) {
                    n2 = this.z.size();
                    try {
                        for (n = 0; n < n2; ++n) {
                            this.z.get(n).S(bytecodeInstrumentationEngine);
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ResourceAllocationTracker144.a(illegalStateException);
                    }
                }
                if (this.k != null) {
                    ExtendedApiResolver extendedApiResolver = bytecodeInstrumentationEngine.J();
                    try {
                        ay.r(extendedApiResolver, null, this.k);
                        if (extendedApiResolver != null) {
                            extendedApiResolver.P();
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ResourceAllocationTracker144.a(illegalStateException);
                    }
                }
                if (this.Z != null) {
                    n2 = this.Z.size();
                    for (n = 0; n < n2; ++n) {
                        list = this.Z.get(n);
                        ((ay)((Object)list)).n(bytecodeInstrumentationEngine.p(((ay)((Object)list)).Z, true));
                    }
                }
                if (this.Y != null) {
                    n2 = this.Y.size();
                    for (n = 0; n < n2; ++n) {
                        list = this.Y.get(n);
                        ((ay)((Object)list)).n(bytecodeInstrumentationEngine.p(((ay)((Object)list)).Z, false));
                    }
                }
                if (this.c != null) {
                    n2 = this.c.size();
                    for (n = 0; n < n2; ++n) {
                        list = this.c.get(n);
                        ((ay)((Object)list)).n(bytecodeInstrumentationEngine.B(((CryptoSecurityManager1576)((Object)list)).v, ((CryptoSecurityManager1576)((Object)list)).X, ((CryptoSecurityManager1576)((Object)list)).Z, true));
                    }
                }
                if (this.M != null) {
                    n2 = this.M.size();
                    for (n = 0; n < n2; ++n) {
                        list = this.M.get(n);
                        ((ay)((Object)list)).n(bytecodeInstrumentationEngine.B(((CryptoSecurityManager1576)((Object)list)).v, ((CryptoSecurityManager1576)((Object)list)).X, ((CryptoSecurityManager1576)((Object)list)).Z, false));
                    }
                }
                try {
                    if (this.v > 0) {
                        bytecodeInstrumentationEngine.D(this.v, true);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
                if (this.H != null) {
                    n2 = this.H.length;
                    for (n = 0; n < n2; ++n) {
                        list = this.H[n];
                        try {
                            if (list == null) {
                                continue;
                            }
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw ResourceAllocationTracker144.a(illegalStateException);
                        }
                        n4 = list.size();
                        for (n3 = 0; n3 < n4; ++n3) {
                            ay2 = list.get(n3);
                            ay2.n(bytecodeInstrumentationEngine.I(n, ay2.Z, true));
                        }
                    }
                }
                try {
                    if (this.s > 0) {
                        bytecodeInstrumentationEngine.D(this.s, false);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
                if (this.d != null) {
                    n2 = this.d.length;
                    for (n = 0; n < n2; ++n) {
                        list = this.d[n];
                        try {
                            if (list == null) {
                                continue;
                            }
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw ResourceAllocationTracker144.a(illegalStateException);
                        }
                        n4 = list.size();
                        for (n3 = 0; n3 < n4; ++n3) {
                            ay2 = list.get(n3);
                            ay2.n(bytecodeInstrumentationEngine.I(n, ay2.Z, false));
                        }
                    }
                }
                try {
                    if (this.f) {
                        this.V.V();
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
                if (this.x != null) {
                    n2 = this.x.size();
                    try {
                        for (n = 0; n < n2; ++n) {
                            bytecodeInstrumentationEngine.u(this.x.get(n));
                        }
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ResourceAllocationTracker144.a(illegalStateException);
                    }
                }
                try {
                    if (this.V.H() <= 0) break block58;
                    bytecodeInstrumentationEngine.v();
                    if (this.C == null) break block59;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
                n2 = this.C.size();
                try {
                    for (n = 0; n < n2; ++n) {
                        this.C.get(n).X(n);
                        this.C.get(n).D(bytecodeInstrumentationEngine);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
            }
            this.V.E(bytecodeInstrumentationEngine);
            if (this.B != null) {
                n2 = this.B.size();
                try {
                    for (n = 0; n < n2; ++n) {
                        this.B.get(n).Y(bytecodeInstrumentationEngine);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
            }
            if (this.E != null) {
                n2 = this.E.size();
                try {
                    for (n = 0; n < n2; ++n) {
                        this.E.get(n).k(bytecodeInstrumentationEngine, true);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
            }
            if (this.a != null) {
                n2 = this.a.size();
                try {
                    for (n = 0; n < n2; ++n) {
                        this.a.get(n).k(bytecodeInstrumentationEngine, false);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
            }
            bytecodeInstrumentationEngine.c(this.K, this.X);
            this.f = true;
        }
        bytecodeInstrumentationEngine.D();
    }

    private ResourceLifecycleManager1859[] z(CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray) {
        ResourceLifecycleManager1859[] resourceLifecycleManager1859Array = new ResourceLifecycleManager1859[cryptoKeyExchangeMappingArray.length];
        int n = cryptoKeyExchangeMappingArray.length;
        try {
            for (int i = 0; i < n; ++i) {
                resourceLifecycleManager1859Array[i] = this.T(cryptoKeyExchangeMappingArray[i]);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw ResourceAllocationTracker144.a(illegalStateException);
        }
        return resourceLifecycleManager1859Array;
    }

    public ExtendedApiResolver I(int n, String string, boolean bl) {
        ay ay2;
        block5: {
            block3: {
                block4: {
                    ay2 = new ay(string);
                    try {
                        if (!bl) break block3;
                        if (this.H != null) break block4;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw ResourceAllocationTracker144.a(illegalStateException);
                    }
                    int n2 = zY.a(this.P).length;
                    this.H = new List[n2];
                }
                this.H[n] = i5.i(this.H[n], ay2);
                break block5;
            }
            if (this.d == null) {
                int n3 = zY.a(this.P).length;
                this.d = new List[n3];
            }
            this.d[n] = i5.i(this.d[n], ay2);
        }
        return ay2;
    }

    public void p(String string, int n) {
        try {
            if (this.z == null) {
                this.z = new ArrayList<VapeAnalyticsTracker>(5);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw ResourceAllocationTracker144.a(illegalStateException);
        }
        this.z.add(new VapeAnalyticsTracker(string, n));
    }

    public ExtendedApiResolver h(int n, ErrorDiagnosticTracker errorDiagnosticTracker, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray2, int[] nArray, String string, boolean bl) {
        CryptoBlockCipher cryptoBlockCipher;
        block3: {
            block2: {
                cryptoBlockCipher = new CryptoBlockCipher(n, errorDiagnosticTracker, this.z(cryptoKeyExchangeMappingArray), this.z(cryptoKeyExchangeMappingArray2), nArray, string);
                try {
                    if (!bl) break block2;
                    this.E = i5.i(this.E, cryptoBlockCipher);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
            }
            this.a = i5.i(this.a, cryptoBlockCipher);
        }
        return cryptoBlockCipher;
    }

    public void f(String string, String string2, ConfigurationDescriptor1455 configurationDescriptor1455, Object ... objectArray) {
        this.V.R(new CloudServiceCredentials(string, string2, configurationDescriptor1455, objectArray));
    }

    public ResourceAllocationTracker144(int n, String string, String string2, String string3, String[] stringArray) {
        long l = b ^ 0x755A39466FC6L;
        this(ResourceAllocationTracker144.b(26443, 0x7B64C82166131DFEL ^ l), n, string, string2, string3, stringArray);
        if (this.getClass() != ResourceAllocationTracker144.class) {
            throw new IllegalStateException();
        }
    }

    public ExtendedApiResolver E(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        CryptoSecurityManager1576 cryptoSecurityManager1576;
        block3: {
            CryptographicKeyManager1236 cryptographicKeyManager1236;
            block2: {
                long l = b ^ 0x1820FD4A5A77L;
                cryptographicKeyManager1236 = this.C.get((n & ResourceAllocationTracker144.b(18181, 0x279EA9405C88803L ^ l)) >> 8);
                cryptoSecurityManager1576 = new CryptoSecurityManager1576(n, errorDiagnosticTracker, string);
                try {
                    if (!bl) break block2;
                    cryptographicKeyManager1236.k = i5.i(cryptographicKeyManager1236.k, cryptoSecurityManager1576);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
            }
            cryptographicKeyManager1236.W = i5.i(cryptographicKeyManager1236.W, cryptoSecurityManager1576);
        }
        return cryptoSecurityManager1576;
    }

    public ExtendedApiResolver J() {
        return new ay(new Jd(this, 0));
    }

    public void M(int n, String string, String string2, String string3, boolean bl) {
        block4: {
            long l = b ^ 0x78514251657AL;
            try {
                try {
                    if (this.T >= ResourceAllocationTracker144.b(30165, 0x262B4C9D30FA85DFL ^ l) || (n & 0x100) != 0) break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
                super.M(n, string, string2, string3, bl);
                return;
            }
            catch (IllegalStateException illegalStateException) {
                throw ResourceAllocationTracker144.a(illegalStateException);
            }
        }
        int n2 = n & 0xFFFFFEFF;
        this.V.R(new DeviceConfigurationProfile(n2, string, string2, string3, bl));
    }

    public ResourceAllocationTracker144() {
        long l = b ^ 0x2EBC5303CB4DL;
        this(ResourceAllocationTracker144.b(10092, 0x2CE69219C2BDF953L ^ l));
        if (this.getClass() != ResourceAllocationTracker144.class) {
            throw new IllegalStateException();
        }
    }

    public void r(int n, CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        this.V.R(new CacheInvalidationManager2353(n, this.T(cryptoKeyExchangeMapping)));
    }

    public ExtendedApiResolver Q(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        CryptoSecurityManager1576 cryptoSecurityManager1576;
        block4: {
            CollectionOrchestrator1895 collectionOrchestrator1895;
            block3: {
                collectionOrchestrator1895 = this.V.E();
                while (collectionOrchestrator1895.K() == -1) {
                    collectionOrchestrator1895 = collectionOrchestrator1895.m();
                }
                cryptoSecurityManager1576 = new CryptoSecurityManager1576(n, errorDiagnosticTracker, string);
                try {
                    if (!bl) break block3;
                    collectionOrchestrator1895.o = i5.i(collectionOrchestrator1895.o, cryptoSecurityManager1576);
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
            }
            collectionOrchestrator1895.C = i5.i(collectionOrchestrator1895.C, cryptoSecurityManager1576);
        }
        return cryptoSecurityManager1576;
    }

    public void v() {
    }

    public ResourceAllocationTracker144(int n) {
        super(n);
        this.V = new XF();
    }

    public void I(String string, String string2, String string3, CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping cryptoKeyExchangeMapping2, int n) {
        MultilingualContentDescriptor multilingualContentDescriptor = new MultilingualContentDescriptor(string, string2, string3, this.T(cryptoKeyExchangeMapping), this.T(cryptoKeyExchangeMapping2), n);
        this.B = i5.i(this.B, multilingualContentDescriptor);
    }

    public void s(String string, int n) {
        this.V.R(new ConfigurationProfileBuilder(string, n));
    }

    public void n(int n, String string) {
        this.V.R(new AuthenticationTokenManager2358(n, string));
    }

    protected ResourceLifecycleManager1859 T(CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        try {
            if (!(cryptoKeyExchangeMapping.O instanceof ResourceLifecycleManager1859)) {
                cryptoKeyExchangeMapping.O = new ResourceLifecycleManager1859();
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw ResourceAllocationTracker144.a(illegalStateException);
        }
        return (ResourceLifecycleManager1859)cryptoKeyExchangeMapping.O;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ResourceAllocationTracker144.b = MultiContainerRegistry.a(-6862193577900834648L, 4377587481804870789L, null).a(166139243099418L);
                ResourceAllocationTracker144.i = new HashMap<K, V>(13);
                var0 = ResourceAllocationTracker144.b ^ 101558004570263L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u0093\u0013\u0080\u00ed\u00989\u008b\u00a9\u00a2\u00f2_\u00a5\u00d9\u00cb\u00d7E";
                var7_6 = "\u0093\u0013\u0080\u00ed\u00989\u008b\u00a9\u00a2\u00f2_\u00a5\u00d9\u00cb\u00d7E".length();
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
                    var6_5 = "\u00db\u00a0\u00f6\u0011\u0092\u00c5\u00a7\u00e6s\u00cd\u00a8\u00b8\u00b7\u00cd\u0019\u00eb";
                    var7_6 = "\u00db\u00a0\u00f6\u0011\u0092\u00c5\u00a7\u00e6s\u00cd\u00a8\u00b8\u00b7\u00cd\u0019\u00eb".length();
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
        ResourceAllocationTracker144.e = var8_3;
        ResourceAllocationTracker144.h = new Integer[4];
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public ResourceAllocationTracker144(int n, int n2, String string, String string2, String string3, String[] stringArray) {
        super(n);
        this.A = n2;
        this.R = string;
        this.P = string2;
        this.g = string3;
        this.I = i5.Y(stringArray);
        if ((n2 & 0x400) == 0) {
            this.B = new ArrayList<MultilingualContentDescriptor>(5);
        }
        this.C = new ArrayList<CryptographicKeyManager1236>();
        this.V = new XF();
    }

    public void A(int n, String string, String string2, String string3) {
        this.V.R(new SystemIntegrationProfile(n, string, string2, string3));
    }

    public ExtendedApiResolver B(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        CryptoSecurityManager1576 cryptoSecurityManager1576;
        block3: {
            block2: {
                cryptoSecurityManager1576 = new CryptoSecurityManager1576(n, errorDiagnosticTracker, string);
                try {
                    if (!bl) break block2;
                    this.c = i5.i(this.c, cryptoSecurityManager1576);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
            }
            this.M = i5.i(this.M, cryptoSecurityManager1576);
        }
        return cryptoSecurityManager1576;
    }

    public void c(int n, int n2) {
        this.K = n;
        this.X = n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x39B2;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
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
                throw new RuntimeException("a/Nj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ResourceAllocationTracker144.h[n2] = n3;
        }
        return h[n2];
    }

    public void F(int n, int n2) {
        this.V.R(new TransmissionStateTracker(n, n2));
    }

    public void K(int n, int n2, CryptoKeyExchangeMapping cryptoKeyExchangeMapping, CryptoKeyExchangeMapping ... cryptoKeyExchangeMappingArray) {
        this.V.R(new AssetLoadingCoordinator(n, n2, this.T(cryptoKeyExchangeMapping), this.z(cryptoKeyExchangeMappingArray)));
    }

    public ExtendedApiResolver p(String string, boolean bl) {
        ay ay2;
        block3: {
            block2: {
                ay2 = new ay(string);
                try {
                    if (!bl) break block2;
                    this.Z = i5.i(this.Z, ay2);
                    break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw ResourceAllocationTracker144.a(illegalStateException);
                }
            }
            this.Y = i5.i(this.Y, ay2);
        }
        return ay2;
    }

    public void E(int n, CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        this.V.R(new ConnectionPoolConfiguration(n, this.T(cryptoKeyExchangeMapping)));
    }
}

