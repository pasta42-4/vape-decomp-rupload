/*
 * Decompiled with CFR 0.152.
 */
package com.metadata.analysis;

import a.Rr;
import a.aN;
import a.aX;
import com.bytecode.analysis.BytecodeAnalysisEngine;
import com.bytecode.analysis.BytecodeMetadataAnalyzer;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.collections.management.MultiContainerRegistry;
import com.config.registry.ConfigurationParameterRegistry;
import com.crypto.utils.CipherEncryptionUtility;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.module.configuration.ModuleConfigurationResolver;
import com.performance.management.ComputationalRateController;
import com.security.crypto.CryptoContextManager1052;
import com.security.crypto.EncryptionContextInitializer;
import com.security.session.CryptographicSessionManager1126;
import com.system.compatibility.ApiCompatibilityValidator;
import com.system.compatibility.LegacyApiInterceptor;
import com.system.constraints.ClassSizeViolationException;
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

public class MetadataExtractor
extends BytecodeMetadataAnalyzer {
    private static final Integer[] l;
    private BytecodeAnalysisEngine M;
    private BytecodeAnalysisEngine W;
    private aN a;
    private CryptoContextManager1052 t;
    private int s;
    private static final long[] k;
    private int B;
    private ModuleConfigurationResolver L;
    private int z;
    private final int S;
    private int D;
    private aN Y;
    private aN e;
    private final aX A;
    private int m;
    private EncodingUtilityManager r;
    private int o;
    private static final long b;
    private EncodingUtilityManager E;
    private EncodingUtilityManager N;
    private int n;
    private int X;
    private aN R;
    private int x;
    private static final Map u;
    private ConfigurationParameterRegistry H;
    private int d;
    private ConfigurationParameterRegistry v;
    private CryptographicSessionManager1126 w;
    private CryptographicSessionManager1126 j;
    private int J;
    private int[] I;
    private EncodingUtilityManager q;
    private int F;
    private int y;
    private int Z;

    public final Rr S(String string, int n, String string2) {
        int n2;
        int n3;
        int n4;
        aX aX2;
        ModuleConfigurationResolver moduleConfigurationResolver;
        ModuleConfigurationResolver moduleConfigurationResolver2;
        try {
            ModuleConfigurationResolver moduleConfigurationResolver3;
            MetadataExtractor metadataExtractor = this;
            moduleConfigurationResolver2 = moduleConfigurationResolver3;
            moduleConfigurationResolver = moduleConfigurationResolver3;
            aX2 = this.A;
            n4 = this.A.t((String)string).Z;
            n3 = n;
            n2 = string2 == null ? 0 : this.A.j(string2);
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
        moduleConfigurationResolver2(aX2, n4, n3, n2);
        metadataExtractor.L = moduleConfigurationResolver;
        return moduleConfigurationResolver;
    }

    private CryptoContextManager1052[] E() {
        ComputationalRateController computationalRateController = new ComputationalRateController();
        computationalRateController.O(this.t);
        ConfigurationParameterRegistry configurationParameterRegistry = this.v;
        while (configurationParameterRegistry != null) {
            configurationParameterRegistry.S(computationalRateController);
            configurationParameterRegistry = (ConfigurationParameterRegistry)configurationParameterRegistry.p;
        }
        BytecodeAnalysisEngine bytecodeAnalysisEngine = this.W;
        while (bytecodeAnalysisEngine != null) {
            bytecodeAnalysisEngine.j(computationalRateController);
            bytecodeAnalysisEngine = (BytecodeAnalysisEngine)bytecodeAnalysisEngine.t;
        }
        CryptographicSessionManager1126 cryptographicSessionManager1126 = this.j;
        while (cryptographicSessionManager1126 != null) {
            cryptographicSessionManager1126.R(computationalRateController);
            cryptographicSessionManager1126 = (CryptographicSessionManager1126)cryptographicSessionManager1126.x;
        }
        return computationalRateController.b();
    }

    public final ExtendedApiResolver N(int n, ErrorDiagnosticTracker errorDiagnosticTracker, String string, boolean bl) {
        try {
            if (bl) {
                this.e = aN.h(this.A, n, errorDiagnosticTracker, string, this.e);
                return this.e;
            }
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
        this.Y = aN.h(this.A, n, errorDiagnosticTracker, string, this.Y);
        return this.Y;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    protected String G(String var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [14[DOLOOP]], but top level block is 6[TRYBLOCK]
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

    public final void S(String string, String string2, String string3) {
        block4: {
            try {
                try {
                    this.x = this.A.c((String)string).Z;
                    if (string2 == null || string3 == null) break block4;
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
                this.m = this.A.s(string2, string3);
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
        }
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1A38;
        if (MetadataExtractor.l[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = k[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])u.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    u.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Yb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MetadataExtractor.l[n2] = n3;
        }
        return MetadataExtractor.l[n2];
    }

    public final BytecodeInstrumentationEngine q(int n, String string, String string2, String string3, String[] stringArray) {
        BytecodeAnalysisEngine bytecodeAnalysisEngine;
        block3: {
            block2: {
                bytecodeAnalysisEngine = new BytecodeAnalysisEngine(this.A, n, string, string2, string3, stringArray, this.s);
                try {
                    if (this.W != null) break block2;
                    this.W = bytecodeAnalysisEngine;
                    break block3;
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
            }
            this.M.t = bytecodeAnalysisEngine;
        }
        this.M = bytecodeAnalysisEngine;
        return this.M;
    }

    private byte[] D(byte[] byArray, boolean bl) {
        int n;
        CryptoContextManager1052[] cryptoContextManager1052Array;
        MetadataExtractor metadataExtractor;
        CipherEncryptionUtility cipherEncryptionUtility;
        int n2;
        CryptoContextManager1052[] cryptoContextManager1052Array2 = this.E();
        try {
            this.v = null;
            this.H = null;
            this.W = null;
            this.M = null;
            this.a = null;
            this.R = null;
            this.e = null;
            this.Y = null;
            this.L = null;
            this.J = 0;
            this.Z = 0;
            this.r = null;
            this.y = 0;
            this.E = null;
            this.j = null;
            this.w = null;
            this.t = null;
            MetadataExtractor metadataExtractor2 = this;
            n2 = bl ? 3 : 0;
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
        try {
            metadataExtractor2.s = n2;
            cipherEncryptionUtility = new CipherEncryptionUtility(byArray, 0, false);
            metadataExtractor = this;
            cryptoContextManager1052Array = cryptoContextManager1052Array2;
            n = bl ? 8 : 0;
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
        cipherEncryptionUtility.c((BytecodeMetadataAnalyzer)metadataExtractor, cryptoContextManager1052Array, n | 0x100);
        return this.V();
    }

    public final ApiCompatibilityValidator d(int n, String string, String string2, String string3, Object object) {
        ConfigurationParameterRegistry configurationParameterRegistry;
        block3: {
            block2: {
                configurationParameterRegistry = new ConfigurationParameterRegistry(this.A, n, string, string2, string3, object);
                try {
                    if (this.v != null) break block2;
                    this.v = configurationParameterRegistry;
                    break block3;
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
            }
            this.H.p = configurationParameterRegistry;
        }
        this.H = configurationParameterRegistry;
        return this.H;
    }

    public final void m(String string) {
        try {
            if (this.E == null) {
                this.E = new EncodingUtilityManager();
            }
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
        ++this.y;
        this.E.f(this.A.c((String)string).Z);
    }

    public final void G(String string, String string2, String string3, int n) {
        block9: {
            int n2;
            EncodingUtilityManager encodingUtilityManager;
            int n3;
            EncodingUtilityManager encodingUtilityManager2;
            block11: {
                block10: {
                    try {
                        if (this.N == null) {
                            this.N = new EncodingUtilityManager();
                        }
                    }
                    catch (ClassSizeViolationException classSizeViolationException) {
                        throw MetadataExtractor.a(classSizeViolationException);
                    }
                    EncryptionContextInitializer encryptionContextInitializer = this.A.c(string);
                    try {
                        try {
                            if (encryptionContextInitializer.K != 0) break block9;
                            ++this.B;
                            this.N.f(encryptionContextInitializer.Z);
                            encodingUtilityManager2 = this.N;
                            if (string2 != null) break block10;
                        }
                        catch (ClassSizeViolationException classSizeViolationException) {
                            throw MetadataExtractor.a(classSizeViolationException);
                        }
                        n3 = 0;
                        break block11;
                    }
                    catch (ClassSizeViolationException classSizeViolationException) {
                        throw MetadataExtractor.a(classSizeViolationException);
                    }
                }
                n3 = this.A.c((String)string2).Z;
            }
            try {
                encodingUtilityManager2.f(n3);
                encodingUtilityManager = this.N;
                n2 = string3 == null ? 0 : this.A.j(string3);
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
            encodingUtilityManager.f(n2);
            this.N.f(n);
            encryptionContextInitializer.K = this.B;
        }
    }

    public byte[] V() {
        boolean bl;
        int n;
        EncodingUtilityManager encodingUtilityManager;
        block89: {
            int n2;
            int n3;
            long l;
            block88: {
                int n4;
                int n5;
                BytecodeAnalysisEngine bytecodeAnalysisEngine;
                int n6;
                ConfigurationParameterRegistry configurationParameterRegistry;
                int n7;
                int n8;
                block87: {
                    block86: {
                        l = b ^ 0x200B56EEE88CL;
                        n8 = 24 + 2 * this.D;
                        n7 = 0;
                        configurationParameterRegistry = this.v;
                        while (configurationParameterRegistry != null) {
                            ++n7;
                            n8 += configurationParameterRegistry.q();
                            configurationParameterRegistry = (ConfigurationParameterRegistry)configurationParameterRegistry.p;
                        }
                        n6 = 0;
                        bytecodeAnalysisEngine = this.W;
                        while (bytecodeAnalysisEngine != null) {
                            ++n6;
                            n8 += bytecodeAnalysisEngine.Y();
                            bytecodeAnalysisEngine = (BytecodeAnalysisEngine)bytecodeAnalysisEngine.t;
                        }
                        n5 = 0;
                        if (this.N != null) {
                            ++n5;
                            n8 += 8 + this.N.I;
                            this.A.j("InnerClasses");
                        }
                        try {
                            if (this.x != 0) {
                                ++n5;
                                n8 += 10;
                                this.A.j("EnclosingMethod");
                            }
                        }
                        catch (ClassSizeViolationException classSizeViolationException) {
                            throw MetadataExtractor.a(classSizeViolationException);
                        }
                        try {
                            try {
                                if ((this.F & 0x1000) == 0 || (this.n & MetadataExtractor.b(8670, 0x32CCF4E7742152D2L ^ l)) >= 49) break block86;
                            }
                            catch (ClassSizeViolationException classSizeViolationException) {
                                throw MetadataExtractor.a(classSizeViolationException);
                            }
                            ++n5;
                            n8 += 6;
                            this.A.j("Synthetic");
                        }
                        catch (ClassSizeViolationException classSizeViolationException) {
                            throw MetadataExtractor.a(classSizeViolationException);
                        }
                    }
                    try {
                        if (this.z != 0) {
                            ++n5;
                            n8 += 8;
                            this.A.j("Signature");
                        }
                    }
                    catch (ClassSizeViolationException classSizeViolationException) {
                        throw MetadataExtractor.a(classSizeViolationException);
                    }
                    try {
                        if (this.X != 0) {
                            ++n5;
                            n8 += 8;
                            this.A.j("SourceFile");
                        }
                    }
                    catch (ClassSizeViolationException classSizeViolationException) {
                        throw MetadataExtractor.a(classSizeViolationException);
                    }
                    if (this.q != null) {
                        ++n5;
                        n8 += 6 + this.q.I;
                        this.A.j("SourceDebugExtension");
                    }
                    try {
                        if ((this.F & MetadataExtractor.b(1319, 0x284FE9A90D79F62CL ^ l)) != 0) {
                            ++n5;
                            n8 += 6;
                            this.A.j("Deprecated");
                        }
                    }
                    catch (ClassSizeViolationException classSizeViolationException) {
                        throw MetadataExtractor.a(classSizeViolationException);
                    }
                    if (this.a != null) {
                        ++n5;
                        n8 += this.a.M("RuntimeVisibleAnnotations");
                    }
                    if (this.R != null) {
                        ++n5;
                        n8 += this.R.M("RuntimeInvisibleAnnotations");
                    }
                    if (this.e != null) {
                        ++n5;
                        n8 += this.e.M("RuntimeVisibleTypeAnnotations");
                    }
                    if (this.Y != null) {
                        ++n5;
                        n8 += this.Y.M("RuntimeInvisibleTypeAnnotations");
                    }
                    if (this.A.b() > 0) {
                        ++n5;
                        n8 += this.A.b();
                    }
                    if (this.L != null) {
                        n5 += this.L.U();
                        n8 += this.L.J();
                    }
                    try {
                        if (this.J != 0) {
                            ++n5;
                            n8 += 8;
                            this.A.j("NestHost");
                        }
                    }
                    catch (ClassSizeViolationException classSizeViolationException) {
                        throw MetadataExtractor.a(classSizeViolationException);
                    }
                    if (this.r != null) {
                        ++n5;
                        n8 += 8 + this.r.I;
                        this.A.j("NestMembers");
                    }
                    if (this.E != null) {
                        ++n5;
                        n8 += 8 + this.E.I;
                        this.A.j("PermittedSubclasses");
                    }
                    n3 = 0;
                    n2 = 0;
                    try {
                        if ((this.F & MetadataExtractor.b(5205, 0x15F28F10B297675CL ^ l)) == 0 && this.j == null) break block87;
                    }
                    catch (ClassSizeViolationException classSizeViolationException) {
                        throw MetadataExtractor.a(classSizeViolationException);
                    }
                    CryptographicSessionManager1126 cryptographicSessionManager1126 = this.j;
                    while (cryptographicSessionManager1126 != null) {
                        ++n3;
                        n2 += cryptographicSessionManager1126.p();
                        cryptographicSessionManager1126 = (CryptographicSessionManager1126)cryptographicSessionManager1126.x;
                    }
                    ++n5;
                    n8 += 8 + n2;
                    this.A.j("Record");
                }
                if (this.t != null) {
                    n5 += this.t.f();
                    n8 += this.t.X(this.A);
                }
                n8 += this.A.n();
                int n9 = this.A.L();
                try {
                    if (n9 > MetadataExtractor.b(19912, 0x421B87D56330BEC0L ^ l)) {
                        throw new ClassSizeViolationException(this.A.B(), n9);
                    }
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
                encodingUtilityManager = new EncodingUtilityManager(n8);
                try {
                    encodingUtilityManager.y(MetadataExtractor.b(25341, 0x420BF8AFA89311F7L ^ l)).y(this.n);
                    this.A.I(encodingUtilityManager);
                    n4 = (this.n & MetadataExtractor.b(19912, 0x421B87D56330BEC0L ^ l)) < 49 ? 4096 : 0;
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
                int n10 = n4;
                encodingUtilityManager.f(this.F & ~n10).f(this.d).f(this.o);
                encodingUtilityManager.f(this.D);
                try {
                    for (n = 0; n < this.D; n += 1) {
                        encodingUtilityManager.f(this.I[n]);
                    }
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
                encodingUtilityManager.f(n7);
                configurationParameterRegistry = this.v;
                while (configurationParameterRegistry != null) {
                    configurationParameterRegistry.x(encodingUtilityManager);
                    configurationParameterRegistry = (ConfigurationParameterRegistry)configurationParameterRegistry.p;
                }
                encodingUtilityManager.f(n6);
                n = 0;
                bl = false;
                bytecodeAnalysisEngine = this.W;
                while (bytecodeAnalysisEngine != null) {
                    n |= bytecodeAnalysisEngine.p();
                    bl |= bytecodeAnalysisEngine.e();
                    bytecodeAnalysisEngine.T(encodingUtilityManager);
                    bytecodeAnalysisEngine = (BytecodeAnalysisEngine)bytecodeAnalysisEngine.t;
                }
                try {
                    encodingUtilityManager.f(n5);
                    if (this.N != null) {
                        encodingUtilityManager.f(this.A.j("InnerClasses")).y(this.N.I + 2).f(this.B).T(this.N.U, 0, this.N.I);
                    }
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
                try {
                    if (this.x != 0) {
                        encodingUtilityManager.f(this.A.j("EnclosingMethod")).y(4).f(this.x).f(this.m);
                    }
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
                try {
                    try {
                        if ((this.F & 0x1000) == 0 || (this.n & MetadataExtractor.b(19912, 0x421B87D56330BEC0L ^ l)) >= 49) break block88;
                    }
                    catch (ClassSizeViolationException classSizeViolationException) {
                        throw MetadataExtractor.a(classSizeViolationException);
                    }
                    encodingUtilityManager.f(this.A.j("Synthetic")).y(0);
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
            }
            try {
                if (this.z != 0) {
                    encodingUtilityManager.f(this.A.j("Signature")).y(2).f(this.z);
                }
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
            try {
                if (this.X != 0) {
                    encodingUtilityManager.f(this.A.j("SourceFile")).y(2).f(this.X);
                }
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
            if (this.q != null) {
                int n11 = this.q.I;
                encodingUtilityManager.f(this.A.j("SourceDebugExtension")).y(n11).T(this.q.U, 0, n11);
            }
            try {
                if ((this.F & MetadataExtractor.b(29324, 0x48C0A4071B77018CL ^ l)) != 0) {
                    encodingUtilityManager.f(this.A.j("Deprecated")).y(0);
                }
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
            try {
                aN.r(this.A, this.a, this.R, this.e, this.Y, encodingUtilityManager);
                this.A.y(encodingUtilityManager);
                if (this.L != null) {
                    this.L.E(encodingUtilityManager);
                }
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
            try {
                if (this.J != 0) {
                    encodingUtilityManager.f(this.A.j("NestHost")).y(2).f(this.J);
                }
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
            try {
                if (this.r != null) {
                    encodingUtilityManager.f(this.A.j("NestMembers")).y(this.r.I + 2).f(this.Z).T(this.r.U, 0, this.r.I);
                }
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
            try {
                if (this.E != null) {
                    encodingUtilityManager.f(this.A.j("PermittedSubclasses")).y(this.E.I + 2).f(this.y).T(this.E.U, 0, this.E.I);
                }
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
            try {
                if ((this.F & MetadataExtractor.b(12481, 0x5AA752611CD643CCL ^ l)) == 0 && this.j == null) break block89;
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
            encodingUtilityManager.f(this.A.j("Record")).y(n2 + 2).f(n3);
            CryptographicSessionManager1126 cryptographicSessionManager1126 = this.j;
            while (cryptographicSessionManager1126 != null) {
                cryptographicSessionManager1126.S(encodingUtilityManager);
                cryptographicSessionManager1126 = (CryptographicSessionManager1126)cryptographicSessionManager1126.x;
            }
        }
        try {
            if (this.t != null) {
                this.t.y(this.A, encodingUtilityManager);
            }
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
        try {
            if (bl) {
                return this.D(encodingUtilityManager.U, n != 0);
            }
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
        return encodingUtilityManager.U;
    }

    public final LegacyApiInterceptor G(String string, String string2, String string3) {
        CryptographicSessionManager1126 cryptographicSessionManager1126;
        block3: {
            block2: {
                cryptographicSessionManager1126 = new CryptographicSessionManager1126(this.A, string, string2, string3);
                try {
                    if (this.j != null) break block2;
                    this.j = cryptographicSessionManager1126;
                    break block3;
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
            }
            this.w.x = cryptographicSessionManager1126;
        }
        this.w = cryptographicSessionManager1126;
        return this.w;
    }

    public final void t() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                MetadataExtractor.b = MultiContainerRegistry.a(-7925129495505473819L, 2643803129808230410L, null).a(127734738589849L);
                MetadataExtractor.u = new HashMap<K, V>(13);
                var0 = MetadataExtractor.b ^ 96014612592950L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u0004\u00c8\u00b2\u00a3\u0001\u00a1\u0081n\u0085\u00169\u00bf\u00bd`\u00b9}z\u0082\u008a\u00b2\u00f6\u00d3\u0010\u00f5\u00d7\u00fa\u0018\u00a53\u00f1/\u00bf\u00ff\u00b49W\u00ad\u000fM\u0086-_\u000b\u009c\fDN:\u0014Vq\u0003\u0096f^\u00cb\u00ed$h\u008f\u00d3K\u001a|v\u00c0q\u00a9H\u00e6\u0014\u001f";
                var7_6 = "\u0004\u00c8\u00b2\u00a3\u0001\u00a1\u0081n\u0085\u00169\u00bf\u00bd`\u00b9}z\u0082\u008a\u00b2\u00f6\u00d3\u0010\u00f5\u00d7\u00fa\u0018\u00a53\u00f1/\u00bf\u00ff\u00b49W\u00ad\u000fM\u0086-_\u000b\u009c\fDN:\u0014Vq\u0003\u0096f^\u00cb\u00ed$h\u008f\u00d3K\u001a|v\u00c0q\u00a9H\u00e6\u0014\u001f".length();
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
                    var6_5 = "\u00fa^nFc\u001d\u00ee>a\u00a8]{\f\u00dd\t6";
                    var7_6 = "\u00fa^nFc\u001d\u00ee>a\u00a8]{\f\u00dd\t6".length();
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
        MetadataExtractor.k = var8_3;
        MetadataExtractor.l = new Integer[11];
    }

    public final void u(int n, int n2, String string, String string2, String string3, String[] stringArray) {
        block15: {
            long l;
            block14: {
                int n3;
                l = b ^ 0x35567C9D30CEL;
                try {
                    this.n = n;
                    this.F = n2;
                    this.d = this.A.H(n & MetadataExtractor.b(19912, 0x421B928849436682L ^ l), string);
                    if (string2 != null) {
                        this.z = this.A.j(string2);
                    }
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
                try {
                    MetadataExtractor metadataExtractor = this;
                    n3 = string3 == null ? 0 : this.A.c((String)string3).Z;
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
                try {
                    metadataExtractor.o = n3;
                    if (stringArray == null || stringArray.length <= 0) break block14;
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
                this.D = stringArray.length;
                this.I = new int[this.D];
                try {
                    for (int i = 0; i < this.D; ++i) {
                        this.I[i] = this.A.c((String)stringArray[i]).Z;
                    }
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
            }
            try {
                try {
                    if (this.s != 1 || (n & MetadataExtractor.b(19912, 0x421B928849436682L ^ l)) < 51) break block15;
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
                this.s = MetadataExtractor.b(24298, 0x38D8DDBEED9875A7L ^ l);
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
        }
    }

    public MetadataExtractor(int n) {
        this(null, n);
    }

    public MetadataExtractor(CipherEncryptionUtility cipherEncryptionUtility, int n) {
        block5: {
            block4: {
                long l = b ^ 0x408123362EA7L;
                super(MetadataExtractor.b(14780, 0x21D8CE278FE60C94L ^ l));
                this.S = n;
                try {
                    this.A = cipherEncryptionUtility == null ? new aX(this) : new aX(this, cipherEncryptionUtility);
                    if ((n & 2) == 0) break block4;
                    this.s = MetadataExtractor.b(5896, 0x70F6DBB30696A222L ^ l);
                    break block5;
                }
                catch (ClassSizeViolationException classSizeViolationException) {
                    throw MetadataExtractor.a(classSizeViolationException);
                }
            }
            try {
                this.s = (n & 1) != 0 ? 1 : 0;
            }
            catch (ClassSizeViolationException classSizeViolationException) {
                throw MetadataExtractor.a(classSizeViolationException);
            }
        }
    }

    public final void H(String string) {
        this.J = this.A.c((String)string).Z;
    }

    protected ClassLoader d() {
        return this.getClass().getClassLoader();
    }

    public final void p(CryptoContextManager1052 cryptoContextManager1052) {
        cryptoContextManager1052.a = this.t;
        this.t = cryptoContextManager1052;
    }

    public final ExtendedApiResolver e(String string, boolean bl) {
        try {
            if (bl) {
                this.a = aN.H(this.A, string, this.a);
                return this.a;
            }
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
        this.R = aN.H(this.A, string, this.R);
        return this.R;
    }

    public final void j(String string, String string2) {
        long l = b ^ 0x5EB3F7F770C5L;
        try {
            if (string != null) {
                this.X = this.A.j(string);
            }
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
        try {
            if (string2 != null) {
                this.q = new EncodingUtilityManager().h(string2, 0, MetadataExtractor.b(18759, 0x39693246502AA200L ^ l));
            }
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
    }

    public final void D(String string) {
        try {
            if (this.r == null) {
                this.r = new EncodingUtilityManager();
            }
        }
        catch (ClassSizeViolationException classSizeViolationException) {
            throw MetadataExtractor.a(classSizeViolationException);
        }
        ++this.Z;
        this.r.f(this.A.c((String)string).Z);
    }
}

