/*
 * Decompiled with CFR 0.152.
 */
package com.crypto.utils;

import a.Rr;
import com.app.config.NumericConfigurationDescriptor;
import com.app.configuration.ConfigurationDescriptor1455;
import com.app.models.EntityDescriptor;
import com.bytecode.analysis.BytecodeAnalysisEngine;
import com.bytecode.analysis.BytecodeMetadataAnalyzer;
import com.bytecode.transformation.BytecodeInstrumentationEngine;
import com.collections.management.MultiContainerRegistry;
import com.diagnostics.error.ErrorDiagnosticTracker;
import com.security.crypto.CryptoContextManager1052;
import com.security.exchange.CryptoKeyExchangeMapping;
import com.system.compatibility.ApiCompatibilityValidator;
import com.system.compatibility.LegacyApiInterceptor;
import com.system.extensions.ExtendedApiResolver;
import com.system.monitoring.SystemHealthMonitor2402;
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
public class CipherEncryptionUtility {
    private final int b;
    private final int[] a;
    private static final Integer[] e;
    private final String[] A;
    private static final Map f;
    private final EntityDescriptor[] w;
    final byte[] I;
    private static final long c;
    public final int N;
    private static final long[] d;
    @Deprecated
    public final byte[] E;
    private final int[] Z;

    public String f(int n, char[] cArray) {
        return this.e(n, cArray);
    }

    private int[] C(BytecodeInstrumentationEngine bytecodeInstrumentationEngine, SystemHealthMonitor2402 systemHealthMonitor2402, int n, boolean bl) {
        char[] cArray = systemHealthMonitor2402.f;
        int n2 = n;
        int[] nArray = new int[this.d(n2)];
        n2 += 2;
        for (int i = 0; i < nArray.length; ++i) {
            int n3;
            block11: {
                ErrorDiagnosticTracker errorDiagnosticTracker;
                int n4;
                block13: {
                    block12: {
                        nArray[i] = n2;
                        n4 = this.D(n2);
                        switch (n4 >>> 24) {
                            case 64: 
                            case 65: {
                                n3 = this.d(n2 + 1);
                                n2 += 3;
                                while (n3-- > 0) {
                                    int n5 = this.d(n2);
                                    int n6 = this.d(n2 + 2);
                                    n2 += 6;
                                    this.M(n5, systemHealthMonitor2402.w);
                                    this.M(n5 + n6, systemHealthMonitor2402.w);
                                }
                                break;
                            }
                            case 71: 
                            case 72: 
                            case 73: 
                            case 74: 
                            case 75: {
                                n2 += 4;
                                break;
                            }
                            case 16: 
                            case 17: 
                            case 18: 
                            case 23: 
                            case 66: 
                            case 67: 
                            case 68: 
                            case 69: 
                            case 70: {
                                n2 += 3;
                                break;
                            }
                            default: {
                                throw new IllegalArgumentException();
                            }
                        }
                        n3 = this.N(n2);
                        try {
                            try {
                                if (n4 >>> 24 != 66) break block11;
                                if (n3 != 0) break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CipherEncryptionUtility.a(illegalArgumentException);
                            }
                            errorDiagnosticTracker = null;
                            break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CipherEncryptionUtility.a(illegalArgumentException);
                        }
                    }
                    errorDiagnosticTracker = new ErrorDiagnosticTracker(this.I, n2);
                }
                ErrorDiagnosticTracker errorDiagnosticTracker2 = errorDiagnosticTracker;
                String string = this.R(n2 += 1 + 2 * n3, cArray);
                n2 += 2;
                n2 = this.x(bytecodeInstrumentationEngine.E(n4 & 0xFFFFFF00, errorDiagnosticTracker2, string, bl), n2, true, cArray);
                continue;
            }
            n2 += 3 + 2 * n3;
            n2 = this.x(null, n2, true, cArray);
        }
        return nArray;
    }

    /*
     * Exception decompiling
     */
    private int W(ExtendedApiResolver var1_1, int var2_2, String var3_3, char[] var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 14[SWITCH]
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

    public int b(int n) {
        return this.Z[n];
    }

    /*
     * Exception decompiling
     */
    private void m(BytecodeInstrumentationEngine var1_1, SystemHealthMonitor2402 var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 54[SWITCH]
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

    /*
     * Exception decompiling
     */
    private int D(int var1_1, Object[] var2_2, int var3_3, char[] var4_4, CryptoKeyExchangeMapping[] var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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

    public int R() {
        return this.Z.length;
    }

    public CipherEncryptionUtility(byte[] byArray, int n, int n2) {
        this(byArray, n, true);
    }

    public short N(int n) {
        byte[] byArray = this.I;
        return (short)((byArray[n] & 0xFF) << 8 | byArray[n + 1] & 0xFF);
    }

    private void A(int n, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray) {
        try {
            if (cryptoKeyExchangeMappingArray[n] == null) {
                this.u((int)n, (CryptoKeyExchangeMapping[])cryptoKeyExchangeMappingArray).C = (short)(this.u((int)n, (CryptoKeyExchangeMapping[])cryptoKeyExchangeMappingArray).C | 1);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
    }

    final String U(int n, char[] cArray) {
        String string = this.A[n];
        try {
            if (string != null) {
                return string;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        int n2 = this.Z[n];
        this.A[n] = this.i(n2 + 2, this.d(n2), cArray);
        return this.A[n];
    }

    public String p(int n, char[] cArray) {
        return this.e(n, cArray);
    }

    /*
     * Unable to fully structure code
     */
    private void g(SystemHealthMonitor2402 var1_1) {
        block25: {
            block26: {
                var2_2 = var1_1.W;
                var3_3 = var1_1.i;
                var4_4 = 0;
                try {
                    try {
                        if ((var1_1.C & 8) != 0) break block25;
                        if (!"<init>".equals(var1_1.V)) break block26;
                    }
                    catch (IllegalArgumentException v0) {
                        throw CipherEncryptionUtility.a(v0);
                    }
                    var3_3[var4_4++] = NumericConfigurationDescriptor.a;
                    break block25;
                }
                catch (IllegalArgumentException v1) {
                    throw CipherEncryptionUtility.a(v1);
                }
            }
            var3_3[var4_4++] = this.p(this.N + 2, var1_1.f);
        }
        var5_5 = 1;
        block20: while (true) {
            var6_6 = var5_5;
            switch (var2_2.charAt(var5_5++)) {
                case 'B': 
                case 'C': 
                case 'I': 
                case 'S': 
                case 'Z': {
                    var3_3[var4_4++] = NumericConfigurationDescriptor.Y;
                    continue block20;
                }
                case 'F': {
                    var3_3[var4_4++] = NumericConfigurationDescriptor.j;
                    continue block20;
                }
                case 'J': {
                    var3_3[var4_4++] = NumericConfigurationDescriptor.A;
                    continue block20;
                }
                case 'D': {
                    var3_3[var4_4++] = NumericConfigurationDescriptor.o;
                    continue block20;
                }
                case '[': {
                    try {
                        while (var2_2.charAt(var5_5) == '[') {
                            ++var5_5;
                        }
                    }
                    catch (IllegalArgumentException v2) {
                        throw CipherEncryptionUtility.a(v2);
                    }
                    try {
                        if (var2_2.charAt(var5_5) == 'L') {
                            ++var5_5;
                        }
                        ** GOTO lbl56
                    }
                    catch (IllegalArgumentException v3) {
                        throw CipherEncryptionUtility.a(v3);
                    }
                    try {
                        while (var2_2.charAt(var5_5) != ';') {
                            ++var5_5;
                        }
                    }
                    catch (IllegalArgumentException v4) {
                        throw CipherEncryptionUtility.a(v4);
                    }
lbl56:
                    // 2 sources

                    var3_3[var4_4++] = var2_2.substring(var6_6, ++var5_5);
                    continue block20;
                }
                case 'L': {
                    try {
                        while (var2_2.charAt(var5_5) != ';') {
                            ++var5_5;
                        }
                    }
                    catch (IllegalArgumentException v5) {
                        throw CipherEncryptionUtility.a(v5);
                    }
                    var3_3[var4_4++] = var2_2.substring(var6_6 + 1, var5_5++);
                    continue block20;
                }
            }
            break;
        }
        var1_1.F = var4_4;
    }

    public long l(int n) {
        long l = this.D(n);
        long l2 = (long)this.D(n + 4) & 0xFFFFFFFFL;
        return l << 32 | l2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x25A6;
        if (e[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/WO", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CipherEncryptionUtility.e[n2] = n3;
        }
        return e[n2];
    }

    public int P() {
        return this.b;
    }

    public int N(int n) {
        return this.I[n] & 0xFF;
    }

    private int c(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer, SystemHealthMonitor2402 systemHealthMonitor2402, int n) {
        Object object;
        CryptoContextManager1052 cryptoContextManager1052;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        char[] cArray;
        block70: {
            String string;
            String string2;
            String string3;
            int n11;
            BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer2;
            long l = c ^ 0x53F15A54FC97L;
            cArray = systemHealthMonitor2402.f;
            n10 = n;
            systemHealthMonitor2402.C = this.d(n10);
            systemHealthMonitor2402.V = this.R(n10 + 2, cArray);
            systemHealthMonitor2402.W = this.R(n10 + 4, cArray);
            n10 += 6;
            n9 = 0;
            int n12 = 0;
            String[] stringArray = null;
            boolean bl = false;
            int n13 = 0;
            n8 = 0;
            n7 = 0;
            n6 = 0;
            n5 = 0;
            n4 = 0;
            n3 = 0;
            n2 = 0;
            int n14 = 0;
            cryptoContextManager1052 = null;
            int n15 = this.d(n10);
            n10 += 2;
            while (n15-- > 0) {
                int n16;
                block68: {
                    block67: {
                        object = this.R(n10, cArray);
                        n16 = this.D(n10 + 2);
                        try {
                            n10 += 6;
                            if (!"Code".equals(object)) break block67;
                            if ((systemHealthMonitor2402.v & 1) != 0) break block68;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CipherEncryptionUtility.a(illegalArgumentException);
                        }
                        n9 = n10;
                        break block68;
                    }
                    if ("Exceptions".equals(object)) {
                        n12 = n10;
                        stringArray = new String[this.d(n12)];
                        int n17 = n12 + 2;
                        try {
                            for (int i = 0; i < stringArray.length; ++i) {
                                stringArray[i] = this.p(n17, cArray);
                                n17 += 2;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CipherEncryptionUtility.a(illegalArgumentException);
                        }
                    }
                    if ("Signature".equals(object)) {
                        n13 = this.d(n10);
                    } else {
                        block69: {
                            try {
                                if (!"Deprecated".equals(object)) break block69;
                                systemHealthMonitor2402.C |= CipherEncryptionUtility.a(29572, 0x16F875F9E03BE20BL ^ l);
                                break block68;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CipherEncryptionUtility.a(illegalArgumentException);
                            }
                        }
                        if ("RuntimeVisibleAnnotations".equals(object)) {
                            n8 = n10;
                        } else if ("RuntimeVisibleTypeAnnotations".equals(object)) {
                            n4 = n10;
                        } else if ("AnnotationDefault".equals(object)) {
                            n2 = n10;
                        } else if ("Synthetic".equals(object)) {
                            bl = true;
                            systemHealthMonitor2402.C |= 0x1000;
                        } else if ("RuntimeInvisibleAnnotations".equals(object)) {
                            n7 = n10;
                        } else if ("RuntimeInvisibleTypeAnnotations".equals(object)) {
                            n3 = n10;
                        } else if ("RuntimeVisibleParameterAnnotations".equals(object)) {
                            n6 = n10;
                        } else if ("RuntimeInvisibleParameterAnnotations".equals(object)) {
                            n5 = n10;
                        } else if ("MethodParameters".equals(object)) {
                            n14 = n10;
                        } else {
                            CryptoContextManager1052 cryptoContextManager10522 = this.D(systemHealthMonitor2402.g, (String)object, n10, n16, cArray, -1, null);
                            cryptoContextManager10522.a = cryptoContextManager1052;
                            cryptoContextManager1052 = cryptoContextManager10522;
                        }
                    }
                }
                n10 += n16;
            }
            try {
                bytecodeMetadataAnalyzer2 = bytecodeMetadataAnalyzer;
                n11 = systemHealthMonitor2402.C;
                string3 = systemHealthMonitor2402.V;
                string2 = systemHealthMonitor2402.W;
                string = n13 == 0 ? null : this.U(n13, cArray);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
            object = bytecodeMetadataAnalyzer2.q(n11, string3, string2, string, stringArray);
            try {
                if (object == null) {
                    return n10;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
            if (object instanceof BytecodeAnalysisEngine) {
                boolean bl2;
                boolean bl3;
                CipherEncryptionUtility cipherEncryptionUtility;
                BytecodeAnalysisEngine bytecodeAnalysisEngine;
                BytecodeAnalysisEngine bytecodeAnalysisEngine2 = (BytecodeAnalysisEngine)object;
                try {
                    bytecodeAnalysisEngine = bytecodeAnalysisEngine2;
                    cipherEncryptionUtility = this;
                    bl3 = bl;
                    bl2 = (systemHealthMonitor2402.C & CipherEncryptionUtility.a(29572, 0x16F875F9E03BE20BL ^ l)) != 0;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CipherEncryptionUtility.a(illegalArgumentException);
                }
                try {
                    if (bytecodeAnalysisEngine.h(cipherEncryptionUtility, bl3, bl2, this.d(n + 4), n13, n12)) {
                        bytecodeAnalysisEngine2.W(n, n10 - n);
                        return n10;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CipherEncryptionUtility.a(illegalArgumentException);
                }
            }
            try {
                if (n14 == 0 || (systemHealthMonitor2402.v & 2) != 0) break block70;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
            int n18 = this.N(n14);
            int n19 = n14 + 1;
            try {
                while (n18-- > 0) {
                    ((BytecodeInstrumentationEngine)object).p(this.R(n19, cArray), this.d(n19 + 2));
                    n19 += 4;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
        }
        if (n2 != 0) {
            ExtendedApiResolver extendedApiResolver = ((BytecodeInstrumentationEngine)object).J();
            try {
                this.W(extendedApiResolver, n2, null, cArray);
                if (extendedApiResolver != null) {
                    extendedApiResolver.P();
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
        }
        if (n8 != 0) {
            int n20 = this.d(n8);
            int n21 = n8 + 2;
            while (n20-- > 0) {
                String string = this.R(n21, cArray);
                n21 += 2;
                n21 = this.x(((BytecodeInstrumentationEngine)object).p(string, true), n21, true, cArray);
            }
        }
        if (n7 != 0) {
            int n22 = this.d(n7);
            int n23 = n7 + 2;
            while (n22-- > 0) {
                String string = this.R(n23, cArray);
                n23 += 2;
                n23 = this.x(((BytecodeInstrumentationEngine)object).p(string, false), n23, true, cArray);
            }
        }
        if (n4 != 0) {
            int n24 = this.d(n4);
            int n25 = n4 + 2;
            while (n24-- > 0) {
                n25 = this.e(systemHealthMonitor2402, n25);
                String string = this.R(n25, cArray);
                n25 += 2;
                n25 = this.x(((BytecodeInstrumentationEngine)object).B(systemHealthMonitor2402.r, systemHealthMonitor2402.n, string, true), n25, true, cArray);
            }
        }
        if (n3 != 0) {
            int n26 = this.d(n3);
            int n27 = n3 + 2;
            while (n26-- > 0) {
                n27 = this.e(systemHealthMonitor2402, n27);
                String string = this.R(n27, cArray);
                n27 += 2;
                n27 = this.x(((BytecodeInstrumentationEngine)object).B(systemHealthMonitor2402.r, systemHealthMonitor2402.n, string, false), n27, true, cArray);
            }
        }
        try {
            if (n6 != 0) {
                this.C((BytecodeInstrumentationEngine)object, systemHealthMonitor2402, n6, true);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        try {
            if (n5 != 0) {
                this.C((BytecodeInstrumentationEngine)object, systemHealthMonitor2402, n5, false);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        while (cryptoContextManager1052 != null) {
            CryptoContextManager1052 cryptoContextManager10523 = cryptoContextManager1052.a;
            cryptoContextManager1052.a = null;
            ((BytecodeInstrumentationEngine)object).u(cryptoContextManager1052);
            cryptoContextManager1052 = cryptoContextManager10523;
        }
        try {
            if (n9 != 0) {
                ((BytecodeInstrumentationEngine)object).v();
                this.m((BytecodeInstrumentationEngine)object, systemHealthMonitor2402, n9);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        ((BytecodeInstrumentationEngine)object).D();
        return n10;
    }

    public void A(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer, int n) {
        this.c(bytecodeMetadataAnalyzer, new CryptoContextManager1052[0], n);
    }

    private void C(BytecodeInstrumentationEngine bytecodeInstrumentationEngine, SystemHealthMonitor2402 systemHealthMonitor2402, int n, boolean bl) {
        int n2 = n;
        int n3 = this.I[n2++] & 0xFF;
        bytecodeInstrumentationEngine.D(n3, bl);
        char[] cArray = systemHealthMonitor2402.f;
        for (int i = 0; i < n3; ++i) {
            int n4 = this.d(n2);
            n2 += 2;
            while (n4-- > 0) {
                String string = this.R(n2, cArray);
                n2 += 2;
                n2 = this.x(bytecodeInstrumentationEngine.I(i, string, bl), n2, true, cArray);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    CipherEncryptionUtility(byte[] var1_1, int var2_2, boolean var3_3) {
        super();
        this.I = var1_1;
        this.E = var1_1;
        if (var3_3) {
            try {
                if (this.N(var2_2 + 6) > 64) {
                    throw new IllegalArgumentException("Unsupported class file major version " + this.N(var2_2 + 6));
                }
            }
            catch (IllegalArgumentException v0) {
                throw CipherEncryptionUtility.a(v0);
            }
        }
        var4_4 = this.d(var2_2 + 8);
        this.Z = new int[var4_4];
        this.A = new String[var4_4];
        var5_5 = 1;
        var6_6 = var2_2 + 10;
        var7_7 = 0;
        var8_8 = false;
        var9_9 = false;
        while (true) {
            try {
                if (var5_5 >= var4_4) break;
            }
            catch (IllegalArgumentException v1) {
                throw CipherEncryptionUtility.a(v1);
            }
            {
                this.Z[var5_5++] = var6_6 + 1;
                ** switch (var1_1[var6_6])
            }
lbl-1000:
            // 1 sources

            {
                case 3: 
                case 4: 
                case 9: 
                case 10: 
                case 11: 
                case 12: {
                    var10_10 = 5;
                    break;
                }
lbl30:
                // 1 sources

                case 17: {
                    var10_10 = 5;
                    var8_8 = true;
                    var9_9 = true;
                    break;
                }
lbl35:
                // 1 sources

                case 18: {
                    var10_10 = 5;
                    var8_8 = true;
                    break;
                }
lbl39:
                // 1 sources

                case 5: 
                case 6: {
                    var10_10 = 9;
                    ++var5_5;
                    break;
                }
lbl43:
                // 1 sources

                case 1: {
                    var10_10 = 3 + this.d(var6_6 + 1);
                    if (var10_10 <= var7_7) break;
                    var7_7 = var10_10;
                    break;
                }
lbl48:
                // 1 sources

                case 15: {
                    var10_10 = 4;
                    break;
                }
lbl51:
                // 1 sources

                case 7: 
                case 8: 
                case 16: 
                case 19: 
                case 20: {
                    var10_10 = 3;
                    break;
                }
lbl54:
                // 1 sources

                default: {
                    throw new IllegalArgumentException();
                }
            }
            var6_6 += var10_10;
        }
        try {
            this.b = var7_7;
            this.N = var6_6;
            v2 = this;
            v3 = var9_9 != false ? new EntityDescriptor[var4_4] : null;
        }
        catch (IllegalArgumentException v4) {
            throw CipherEncryptionUtility.a(v4);
        }
        try {
            v2.w = v3;
            v5 = this;
            v6 = var8_8 != false ? this.l(var7_7) : null;
        }
        catch (IllegalArgumentException v7) {
            throw CipherEncryptionUtility.a(v7);
        }
        v5.a = v6;
    }

    private String i(int n, int n2, char[] cArray) {
        int n3 = n;
        int n4 = n3 + n2;
        int n5 = 0;
        byte[] byArray = this.I;
        while (n3 < n4) {
            byte by = byArray[n3++];
            try {
                if ((by & 0x80) == 0) {
                    cArray[n5++] = (char)(by & 0x7F);
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
            try {
                if ((by & 0xE0) == 192) {
                    cArray[n5++] = (char)(((by & 0x1F) << 6) + (byArray[n3++] & 0x3F));
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
            cArray[n5++] = (char)(((by & 0xF) << 12) + ((byArray[n3++] & 0x3F) << 6) + (byArray[n3++] & 0x3F));
        }
        return new String(cArray, 0, n5);
    }

    private CryptoContextManager1052 D(CryptoContextManager1052[] cryptoContextManager1052Array, String string, int n, int n2, char[] cArray, int n3, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray) {
        for (CryptoContextManager1052 cryptoContextManager1052 : cryptoContextManager1052Array) {
            try {
                if (!cryptoContextManager1052.H.equals(string)) continue;
                return cryptoContextManager1052.E(this, n, n2, cArray, n3, cryptoKeyExchangeMappingArray);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
        }
        return new CryptoContextManager1052(string).E(this, n, n2, null, -1, null);
    }

    private int t(int n, boolean bl, boolean bl2, SystemHealthMonitor2402 systemHealthMonitor2402) {
        int n2;
        CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray;
        int n3;
        block18: {
            block25: {
                int n4;
                char[] cArray;
                block20: {
                    int n5;
                    long l;
                    block24: {
                        block23: {
                            l = c ^ 0x3035CF116287L;
                            n3 = n;
                            cArray = systemHealthMonitor2402.f;
                            cryptoKeyExchangeMappingArray = systemHealthMonitor2402.w;
                            if (bl) {
                                n5 = this.I[n3++] & 0xFF;
                            } else {
                                n5 = 255;
                                systemHealthMonitor2402.S = -1;
                            }
                            systemHealthMonitor2402.I = 0;
                            if (n5 >= 64) break block23;
                            n2 = n5;
                            systemHealthMonitor2402.z = CipherEncryptionUtility.a(31546, 0x4C930EE08CB74A9L ^ l);
                            systemHealthMonitor2402.Q = 0;
                            break block18;
                        }
                        if (n5 >= 128) break block24;
                        n2 = n5 - 64;
                        n3 = this.D(n3, systemHealthMonitor2402.R, 0, cArray, cryptoKeyExchangeMappingArray);
                        systemHealthMonitor2402.z = CipherEncryptionUtility.a(26629, 0x50E97CD6E0A86797L ^ l);
                        systemHealthMonitor2402.Q = 1;
                        break block18;
                    }
                    if (n5 < 247) break block25;
                    n2 = this.d(n3);
                    n3 += 2;
                    if (n5 == 247) {
                        n3 = this.D(n3, systemHealthMonitor2402.R, 0, cArray, cryptoKeyExchangeMappingArray);
                        systemHealthMonitor2402.z = CipherEncryptionUtility.a(22166, 0x226D3F36A6415907L ^ l);
                        systemHealthMonitor2402.Q = 1;
                    } else {
                        int n6;
                        block22: {
                            block21: {
                                block19: {
                                    block17: {
                                        try {
                                            try {
                                                if (n5 < 248 || n5 >= 251) break block17;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CipherEncryptionUtility.a(illegalArgumentException);
                                            }
                                            systemHealthMonitor2402.z = CipherEncryptionUtility.a(28449, 0x52D277E9315460B1L ^ l);
                                            systemHealthMonitor2402.I = 251 - n5;
                                            systemHealthMonitor2402.F -= systemHealthMonitor2402.I;
                                            systemHealthMonitor2402.Q = 0;
                                            break block18;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CipherEncryptionUtility.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        if (n5 != 251) break block19;
                                        systemHealthMonitor2402.z = CipherEncryptionUtility.a(11279, 0x75DB432482042392L ^ l);
                                        systemHealthMonitor2402.Q = 0;
                                        break block18;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CipherEncryptionUtility.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (n5 >= 255) break block20;
                                        if (!bl2) break block21;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CipherEncryptionUtility.a(illegalArgumentException);
                                    }
                                    n6 = systemHealthMonitor2402.F;
                                    break block22;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CipherEncryptionUtility.a(illegalArgumentException);
                                }
                            }
                            n6 = 0;
                        }
                        int n7 = n6;
                        for (int i = n5 - 251; i > 0; --i) {
                            n3 = this.D(n3, systemHealthMonitor2402.i, n7++, cArray, cryptoKeyExchangeMappingArray);
                        }
                        systemHealthMonitor2402.z = 1;
                        systemHealthMonitor2402.I = n5 - 251;
                        systemHealthMonitor2402.F += systemHealthMonitor2402.I;
                        systemHealthMonitor2402.Q = 0;
                    }
                    break block18;
                }
                int n8 = this.d(n3);
                n3 += 2;
                systemHealthMonitor2402.z = 0;
                systemHealthMonitor2402.I = n8;
                systemHealthMonitor2402.F = n8;
                for (n4 = 0; n4 < n8; ++n4) {
                    n3 = this.D(n3, systemHealthMonitor2402.i, n4, cArray, cryptoKeyExchangeMappingArray);
                }
                n4 = this.d(n3);
                n3 += 2;
                systemHealthMonitor2402.Q = n4;
                for (int i = 0; i < n4; ++i) {
                    n3 = this.D(n3, systemHealthMonitor2402.R, i, cArray, cryptoKeyExchangeMappingArray);
                }
                break block18;
            }
            throw new IllegalArgumentException();
        }
        systemHealthMonitor2402.S += n2 + 1;
        this.M(systemHealthMonitor2402.S, cryptoKeyExchangeMappingArray);
        return n3;
    }

    private int m(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer, SystemHealthMonitor2402 systemHealthMonitor2402, int n) {
        String string;
        int n2;
        Object object;
        long l = c ^ 0x14AC908A6BBFL;
        char[] cArray = systemHealthMonitor2402.f;
        int n3 = n;
        int n4 = this.d(n3);
        String string2 = this.R(n3 + 2, cArray);
        String string3 = this.R(n3 + 4, cArray);
        n3 += 6;
        Object object2 = null;
        String string4 = null;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        CryptoContextManager1052 cryptoContextManager1052 = null;
        int n9 = this.d(n3);
        n3 += 2;
        while (n9-- > 0) {
            object = this.R(n3, cArray);
            n2 = this.D(n3 + 2);
            n3 += 6;
            if ("ConstantValue".equals(object)) {
                Object object3;
                int n10 = this.d(n3);
                try {
                    object3 = n10 == 0 ? null : this.D(n10, cArray);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CipherEncryptionUtility.a(illegalArgumentException);
                }
                object2 = object3;
            } else if ("Signature".equals(object)) {
                string4 = this.R(n3, cArray);
            } else if ("Deprecated".equals(object)) {
                n4 |= CipherEncryptionUtility.a(29572, 0x16F832A42AE57523L ^ l);
            } else if ("Synthetic".equals(object)) {
                n4 |= 0x1000;
            } else if ("RuntimeVisibleAnnotations".equals(object)) {
                n5 = n3;
            } else if ("RuntimeVisibleTypeAnnotations".equals(object)) {
                n7 = n3;
            } else if ("RuntimeInvisibleAnnotations".equals(object)) {
                n6 = n3;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(object)) {
                n8 = n3;
            } else {
                CryptoContextManager1052 cryptoContextManager10522 = this.D(systemHealthMonitor2402.g, (String)object, n3, n2, cArray, -1, null);
                cryptoContextManager10522.a = cryptoContextManager1052;
                cryptoContextManager1052 = cryptoContextManager10522;
            }
            n3 += n2;
        }
        object = bytecodeMetadataAnalyzer.d(n4, string2, string3, string4, object2);
        try {
            if (object == null) {
                return n3;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        if (n5 != 0) {
            n2 = this.d(n5);
            int n11 = n5 + 2;
            while (n2-- > 0) {
                string = this.R(n11, cArray);
                n11 += 2;
                n11 = this.x(((ApiCompatibilityValidator)object).N(string, true), n11, true, cArray);
            }
        }
        if (n6 != 0) {
            n2 = this.d(n6);
            int n12 = n6 + 2;
            while (n2-- > 0) {
                string = this.R(n12, cArray);
                n12 += 2;
                n12 = this.x(((ApiCompatibilityValidator)object).N(string, false), n12, true, cArray);
            }
        }
        if (n7 != 0) {
            n2 = this.d(n7);
            int n13 = n7 + 2;
            while (n2-- > 0) {
                n13 = this.e(systemHealthMonitor2402, n13);
                string = this.R(n13, cArray);
                n13 += 2;
                n13 = this.x(((ApiCompatibilityValidator)object).q(systemHealthMonitor2402.r, systemHealthMonitor2402.n, string, true), n13, true, cArray);
            }
        }
        if (n8 != 0) {
            n2 = this.d(n8);
            int n14 = n8 + 2;
            while (n2-- > 0) {
                n14 = this.e(systemHealthMonitor2402, n14);
                string = this.R(n14, cArray);
                n14 += 2;
                n14 = this.x(((ApiCompatibilityValidator)object).q(systemHealthMonitor2402.r, systemHealthMonitor2402.n, string, false), n14, true, cArray);
            }
        }
        while (cryptoContextManager1052 != null) {
            CryptoContextManager1052 cryptoContextManager10523 = cryptoContextManager1052.a;
            cryptoContextManager1052.a = null;
            ((ApiCompatibilityValidator)object).a(cryptoContextManager1052);
            cryptoContextManager1052 = cryptoContextManager10523;
        }
        ((ApiCompatibilityValidator)object).c();
        return n3;
    }

    private CryptoKeyExchangeMapping M(int n, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray) {
        CryptoKeyExchangeMapping cryptoKeyExchangeMapping = this.u(n, cryptoKeyExchangeMappingArray);
        cryptoKeyExchangeMapping.C = (short)(cryptoKeyExchangeMapping.C & 0xFFFFFFFE);
        return cryptoKeyExchangeMapping;
    }

    private void V(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer, SystemHealthMonitor2402 systemHealthMonitor2402, int n, int n2, String string) {
        int n3;
        int n4;
        char[] cArray = systemHealthMonitor2402.f;
        int n5 = n;
        String string2 = this.f(n5, cArray);
        int n6 = this.d(n5 + 2);
        String string3 = this.R(n5 + 4, cArray);
        n5 += 6;
        Rr rr = bytecodeMetadataAnalyzer.S(string2, n6, string3);
        try {
            if (rr == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        try {
            if (string != null) {
                rr.P(string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        if (n2 != 0) {
            n4 = this.d(n2);
            int n7 = n2 + 2;
            try {
                while (n4-- > 0) {
                    rr.F(this.F(n7, cArray));
                    n7 += 2;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
        }
        n4 = this.d(n5);
        n5 += 2;
        while (n4-- > 0) {
            String string4 = this.f(n5, cArray);
            int n8 = this.d(n5 + 2);
            String string5 = this.R(n5 + 4, cArray);
            n5 += 6;
            rr.w(string4, n8, string5);
        }
        int n9 = this.d(n5);
        n5 += 2;
        while (n9-- > 0) {
            String string6 = this.F(n5, cArray);
            int n10 = this.d(n5 + 2);
            n3 = this.d(n5 + 4);
            n5 += 6;
            String[] stringArray = null;
            if (n3 != 0) {
                stringArray = new String[n3];
                try {
                    for (int i = 0; i < n3; ++i) {
                        stringArray[i] = this.f(n5, cArray);
                        n5 += 2;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CipherEncryptionUtility.a(illegalArgumentException);
                }
            }
            rr.f(string6, n10, stringArray);
        }
        int n11 = this.d(n5);
        n5 += 2;
        while (n11-- > 0) {
            String string7 = this.F(n5, cArray);
            n3 = this.d(n5 + 2);
            int n12 = this.d(n5 + 4);
            n5 += 6;
            String[] stringArray = null;
            if (n12 != 0) {
                stringArray = new String[n12];
                try {
                    for (int i = 0; i < n12; ++i) {
                        stringArray[i] = this.f(n5, cArray);
                        n5 += 2;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CipherEncryptionUtility.a(illegalArgumentException);
                }
            }
            rr.m(string7, n3, stringArray);
        }
        int n13 = this.d(n5);
        n5 += 2;
        try {
            while (n13-- > 0) {
                rr.N(this.p(n5, cArray));
                n5 += 2;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        n3 = this.d(n5);
        n5 += 2;
        while (n3-- > 0) {
            String string8 = this.p(n5, cArray);
            int n14 = this.d(n5 + 2);
            n5 += 4;
            String[] stringArray = new String[n14];
            try {
                for (int i = 0; i < n14; ++i) {
                    stringArray[i] = this.p(n5, cArray);
                    n5 += 2;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
            rr.J(string8, stringArray);
        }
        rr.g();
    }

    public String R(int n, char[] cArray) {
        int n2;
        block4: {
            n2 = this.d(n);
            try {
                try {
                    if (n != 0 && n2 != 0) break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CipherEncryptionUtility.a(illegalArgumentException);
                }
                return null;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
        }
        return this.U(n2, cArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int x(ExtendedApiResolver extendedApiResolver, int n, boolean bl, char[] cArray) {
        int n2;
        block8: {
            int n3;
            block7: {
                block6: {
                    n2 = n;
                    n3 = this.d(n2);
                    try {
                        n2 += 2;
                        if (!bl) break block6;
                        break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CipherEncryptionUtility.a(illegalArgumentException);
                    }
                }
                while (n3-- > 0) {
                    n2 = this.W(extendedApiResolver, n2, null, cArray);
                }
                break block8;
            }
            while (n3-- > 0) {
                String string = this.R(n2, cArray);
                n2 = this.W(extendedApiResolver, n2 + 2, string, cArray);
            }
        }
        try {
            if (extendedApiResolver == null) return n2;
            extendedApiResolver.P();
            return n2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
    }

    final int j() {
        int n;
        int n2 = this.N + 8 + this.d(this.N + 6) * 2;
        int n3 = this.d(n2);
        n2 += 2;
        while (n3-- > 0) {
            n = this.d(n2 + 6);
            n2 += 8;
            while (n-- > 0) {
                n2 += 6 + this.D(n2 + 2);
            }
        }
        n = this.d(n2);
        n2 += 2;
        while (n-- > 0) {
            int n4 = this.d(n2 + 6);
            n2 += 8;
            while (n4-- > 0) {
                n2 += 6 + this.D(n2 + 2);
            }
        }
        return n2 + 2;
    }

    protected CryptoKeyExchangeMapping u(int n, CryptoKeyExchangeMapping[] cryptoKeyExchangeMappingArray) {
        try {
            if (cryptoKeyExchangeMappingArray[n] == null) {
                cryptoKeyExchangeMappingArray[n] = new CryptoKeyExchangeMapping();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        return cryptoKeyExchangeMappingArray[n];
    }

    private String e(int n, char[] cArray) {
        return this.R(this.Z[this.d(n)], cArray);
    }

    public int D(int n) {
        byte[] byArray = this.I;
        return (byArray[n] & 0xFF) << 24 | (byArray[n + 1] & 0xFF) << 16 | (byArray[n + 2] & 0xFF) << 8 | byArray[n + 3] & 0xFF;
    }

    private int[] l(int n) {
        char[] cArray = new char[n];
        int n2 = this.j();
        for (int i = this.d(n2 - 2); i > 0; --i) {
            String string = this.R(n2, cArray);
            int n3 = this.D(n2 + 2);
            n2 += 6;
            if ("BootstrapMethods".equals(string)) {
                int[] nArray = new int[this.d(n2)];
                int n4 = n2 + 2;
                for (int j = 0; j < nArray.length; ++j) {
                    nArray[j] = n4;
                    n4 += 4 + this.d(n4 + 2) * 2;
                }
                return nArray;
            }
            n2 += n3;
        }
        throw new IllegalArgumentException();
    }

    /*
     * Exception decompiling
     */
    public Object D(int var1_1, char[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    public CipherEncryptionUtility(byte[] byArray) {
        this(byArray, 0, byArray.length);
    }

    private int e(SystemHealthMonitor2402 systemHealthMonitor2402, int n) {
        ErrorDiagnosticTracker errorDiagnosticTracker;
        int n2;
        long l = c ^ 0x559A4C9A9512L;
        int n3 = n;
        int n4 = this.D(n);
        switch (n4 >>> 24) {
            case 0: 
            case 1: 
            case 22: {
                n4 &= CipherEncryptionUtility.a(1225, 0x8A3608680CE7CCBL ^ l);
                n3 += 2;
                break;
            }
            case 19: 
            case 20: 
            case 21: {
                n4 &= CipherEncryptionUtility.a(10379, 0x50082E8486C95088L ^ l);
                ++n3;
                break;
            }
            case 64: 
            case 65: {
                n4 &= CipherEncryptionUtility.a(15315, 0x4932C2571E3BC3D8L ^ l);
                n2 = this.d(n3 + 1);
                n3 += 3;
                systemHealthMonitor2402.t = new CryptoKeyExchangeMapping[n2];
                systemHealthMonitor2402.q = new CryptoKeyExchangeMapping[n2];
                systemHealthMonitor2402.Z = new int[n2];
                for (int i = 0; i < n2; ++i) {
                    int n5 = this.d(n3);
                    int n6 = this.d(n3 + 2);
                    int n7 = this.d(n3 + 4);
                    n3 += 6;
                    systemHealthMonitor2402.t[i] = this.M(n5, systemHealthMonitor2402.w);
                    systemHealthMonitor2402.q[i] = this.M(n5 + n6, systemHealthMonitor2402.w);
                    systemHealthMonitor2402.Z[i] = n7;
                }
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: 
            case 75: {
                n4 &= CipherEncryptionUtility.a(1570, 0x15FEB96128487E23L ^ l);
                n3 += 4;
                break;
            }
            case 16: 
            case 17: 
            case 18: 
            case 23: 
            case 66: {
                n4 &= 0xFFFFFF00;
                n3 += 3;
                break;
            }
            case 67: 
            case 68: 
            case 69: 
            case 70: {
                n4 &= CipherEncryptionUtility.a(15315, 0x4932C2571E3BC3D8L ^ l);
                n3 += 3;
                break;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
        systemHealthMonitor2402.r = n4;
        n2 = this.N(n3);
        try {
            SystemHealthMonitor2402 systemHealthMonitor24022 = systemHealthMonitor2402;
            errorDiagnosticTracker = n2 == 0 ? null : new ErrorDiagnosticTracker(this.I, n3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        systemHealthMonitor24022.n = errorDiagnosticTracker;
        return n3 + 1 + 2 * n2;
    }

    private int C(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer, SystemHealthMonitor2402 systemHealthMonitor2402, int n) {
        String string;
        int n2;
        Object object;
        char[] cArray = systemHealthMonitor2402.f;
        int n3 = n;
        String string2 = this.R(n3, cArray);
        String string3 = this.R(n3 + 2, cArray);
        n3 += 4;
        String string4 = null;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        CryptoContextManager1052 cryptoContextManager1052 = null;
        int n8 = this.d(n3);
        n3 += 2;
        while (n8-- > 0) {
            object = this.R(n3, cArray);
            n2 = this.D(n3 + 2);
            n3 += 6;
            if ("Signature".equals(object)) {
                string4 = this.R(n3, cArray);
            } else if ("RuntimeVisibleAnnotations".equals(object)) {
                n4 = n3;
            } else if ("RuntimeVisibleTypeAnnotations".equals(object)) {
                n6 = n3;
            } else if ("RuntimeInvisibleAnnotations".equals(object)) {
                n5 = n3;
            } else if ("RuntimeInvisibleTypeAnnotations".equals(object)) {
                n7 = n3;
            } else {
                CryptoContextManager1052 cryptoContextManager10522 = this.D(systemHealthMonitor2402.g, (String)object, n3, n2, cArray, -1, null);
                cryptoContextManager10522.a = cryptoContextManager1052;
                cryptoContextManager1052 = cryptoContextManager10522;
            }
            n3 += n2;
        }
        object = bytecodeMetadataAnalyzer.G(string2, string3, string4);
        try {
            if (object == null) {
                return n3;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        if (n4 != 0) {
            n2 = this.d(n4);
            int n9 = n4 + 2;
            while (n2-- > 0) {
                string = this.R(n9, cArray);
                n9 += 2;
                n9 = this.x(((LegacyApiInterceptor)object).h(string, true), n9, true, cArray);
            }
        }
        if (n5 != 0) {
            n2 = this.d(n5);
            int n10 = n5 + 2;
            while (n2-- > 0) {
                string = this.R(n10, cArray);
                n10 += 2;
                n10 = this.x(((LegacyApiInterceptor)object).h(string, false), n10, true, cArray);
            }
        }
        if (n6 != 0) {
            n2 = this.d(n6);
            int n11 = n6 + 2;
            while (n2-- > 0) {
                n11 = this.e(systemHealthMonitor2402, n11);
                string = this.R(n11, cArray);
                n11 += 2;
                n11 = this.x(((LegacyApiInterceptor)object).i(systemHealthMonitor2402.r, systemHealthMonitor2402.n, string, true), n11, true, cArray);
            }
        }
        if (n7 != 0) {
            n2 = this.d(n7);
            int n12 = n7 + 2;
            while (n2-- > 0) {
                n12 = this.e(systemHealthMonitor2402, n12);
                string = this.R(n12, cArray);
                n12 += 2;
                n12 = this.x(((LegacyApiInterceptor)object).i(systemHealthMonitor2402.r, systemHealthMonitor2402.n, string, false), n12, true, cArray);
            }
        }
        while (cryptoContextManager1052 != null) {
            CryptoContextManager1052 cryptoContextManager10523 = cryptoContextManager1052.a;
            cryptoContextManager1052.a = null;
            ((LegacyApiInterceptor)object).t(cryptoContextManager1052);
            cryptoContextManager1052 = cryptoContextManager10523;
        }
        ((LegacyApiInterceptor)object).S();
        return n3;
    }

    public int d(int n) {
        byte[] byArray = this.I;
        return (byArray[n] & 0xFF) << 8 | byArray[n + 1] & 0xFF;
    }

    public void c(BytecodeMetadataAnalyzer bytecodeMetadataAnalyzer, CryptoContextManager1052[] cryptoContextManager1052Array, int n) {
        Object object;
        Object object2;
        int n2;
        int n3;
        int n4;
        String string;
        String string2;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        char[] cArray;
        SystemHealthMonitor2402 systemHealthMonitor2402;
        block87: {
            long l = c ^ 0x11953B2BA894L;
            systemHealthMonitor2402 = new SystemHealthMonitor2402();
            systemHealthMonitor2402.g = cryptoContextManager1052Array;
            systemHealthMonitor2402.v = n;
            cArray = systemHealthMonitor2402.f = new char[this.b];
            n13 = this.N;
            int n14 = this.d(n13);
            String string3 = this.p(n13 + 2, cArray);
            String string4 = this.p(n13 + 4, cArray);
            String[] stringArray = new String[this.d(n13 + 6)];
            n13 += 8;
            try {
                for (n12 = 0; n12 < stringArray.length; ++n12) {
                    stringArray[n12] = this.p(n13, cArray);
                    n13 += 2;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
            n12 = 0;
            n11 = 0;
            String string5 = null;
            String string6 = null;
            String string7 = null;
            n10 = 0;
            n9 = 0;
            n8 = 0;
            n7 = 0;
            n6 = 0;
            n5 = 0;
            string2 = null;
            string = null;
            n4 = 0;
            n3 = 0;
            n2 = 0;
            object2 = null;
            int n15 = this.j();
            for (int i = this.d(n15 - 2); i > 0; --i) {
                int n16;
                block89: {
                    String string8;
                    block85: {
                        string8 = this.R(n15, cArray);
                        n16 = this.D(n15 + 2);
                        n15 += 6;
                        if ("SourceFile".equals(string8)) {
                            string6 = this.R(n15, cArray);
                        } else if ("InnerClasses".equals(string8)) {
                            n12 = n15;
                        } else if ("EnclosingMethod".equals(string8)) {
                            n11 = n15;
                        } else if ("NestHost".equals(string8)) {
                            string = this.p(n15, cArray);
                        } else if ("NestMembers".equals(string8)) {
                            n4 = n15;
                        } else if ("PermittedSubclasses".equals(string8)) {
                            n3 = n15;
                        } else if ("Signature".equals(string8)) {
                            string5 = this.R(n15, cArray);
                        } else if ("RuntimeVisibleAnnotations".equals(string8)) {
                            n10 = n15;
                        } else if ("RuntimeVisibleTypeAnnotations".equals(string8)) {
                            n8 = n15;
                        } else if ("Deprecated".equals(string8)) {
                            n14 |= CipherEncryptionUtility.a(26520, 0x7F051956F6D82217L ^ l);
                        } else if ("Synthetic".equals(string8)) {
                            n14 |= 0x1000;
                        } else {
                            block86: {
                                try {
                                    try {
                                        if (!"SourceDebugExtension".equals(string8)) break block85;
                                        if (n16 <= this.I.length - n15) break block86;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CipherEncryptionUtility.a(illegalArgumentException);
                                    }
                                    throw new IllegalArgumentException();
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CipherEncryptionUtility.a(illegalArgumentException);
                                }
                            }
                            string7 = this.i(n15, n16, new char[n16]);
                        }
                        break block89;
                    }
                    if ("RuntimeInvisibleAnnotations".equals(string8)) {
                        n9 = n15;
                    } else if ("RuntimeInvisibleTypeAnnotations".equals(string8)) {
                        n7 = n15;
                    } else if ("Record".equals(string8)) {
                        n2 = n15;
                        n14 |= CipherEncryptionUtility.a(22089, 0x5CEA4F26999893CFL ^ l);
                    } else if ("Module".equals(string8)) {
                        n6 = n15;
                    } else if ("ModuleMainClass".equals(string8)) {
                        string2 = this.p(n15, cArray);
                    } else if ("ModulePackages".equals(string8)) {
                        n5 = n15;
                    } else if (!"BootstrapMethods".equals(string8)) {
                        object = this.D(cryptoContextManager1052Array, string8, n15, n16, cArray, -1, null);
                        ((CryptoContextManager1052)object).a = object2;
                        object2 = object;
                    }
                }
                n15 += n16;
            }
            try {
                block88: {
                    try {
                        try {
                            bytecodeMetadataAnalyzer.u(this.D(this.Z[1] - 7), n14, string3, string5, string4, stringArray);
                            if ((n & 2) != 0) break block87;
                            if (string6 != null) break block88;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CipherEncryptionUtility.a(illegalArgumentException);
                        }
                        if (string7 == null) break block87;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CipherEncryptionUtility.a(illegalArgumentException);
                    }
                }
                bytecodeMetadataAnalyzer.j(string6, string7);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
        }
        try {
            if (n6 != 0) {
                this.V(bytecodeMetadataAnalyzer, systemHealthMonitor2402, n6, n5, string2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        try {
            if (string != null) {
                bytecodeMetadataAnalyzer.H(string);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        if (n11 != 0) {
            String string9;
            String string10;
            String string11 = this.p(n11, cArray);
            int n17 = this.d(n11 + 2);
            try {
                string10 = n17 == 0 ? null : this.R(this.Z[n17], cArray);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
            String string12 = string10;
            try {
                string9 = n17 == 0 ? null : this.R(this.Z[n17] + 2, cArray);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
            object = string9;
            bytecodeMetadataAnalyzer.S(string11, string12, (String)object);
        }
        if (n10 != 0) {
            int n18 = this.d(n10);
            int n19 = n10 + 2;
            while (n18-- > 0) {
                String string13 = this.R(n19, cArray);
                n19 += 2;
                n19 = this.x(bytecodeMetadataAnalyzer.e(string13, true), n19, true, cArray);
            }
        }
        if (n9 != 0) {
            int n20 = this.d(n9);
            int n21 = n9 + 2;
            while (n20-- > 0) {
                String string14 = this.R(n21, cArray);
                n21 += 2;
                n21 = this.x(bytecodeMetadataAnalyzer.e(string14, false), n21, true, cArray);
            }
        }
        if (n8 != 0) {
            int n22 = this.d(n8);
            int n23 = n8 + 2;
            while (n22-- > 0) {
                n23 = this.e(systemHealthMonitor2402, n23);
                String string15 = this.R(n23, cArray);
                n23 += 2;
                n23 = this.x(bytecodeMetadataAnalyzer.N(systemHealthMonitor2402.r, systemHealthMonitor2402.n, string15, true), n23, true, cArray);
            }
        }
        if (n7 != 0) {
            int n24 = this.d(n7);
            int n25 = n7 + 2;
            while (n24-- > 0) {
                n25 = this.e(systemHealthMonitor2402, n25);
                String string16 = this.R(n25, cArray);
                n25 += 2;
                n25 = this.x(bytecodeMetadataAnalyzer.N(systemHealthMonitor2402.r, systemHealthMonitor2402.n, string16, false), n25, true, cArray);
            }
        }
        while (object2 != null) {
            CryptoContextManager1052 cryptoContextManager1052 = ((CryptoContextManager1052)object2).a;
            ((CryptoContextManager1052)object2).a = null;
            bytecodeMetadataAnalyzer.p((CryptoContextManager1052)object2);
            object2 = cryptoContextManager1052;
        }
        if (n4 != 0) {
            int n26 = this.d(n4);
            int n27 = n4 + 2;
            try {
                while (n26-- > 0) {
                    bytecodeMetadataAnalyzer.D(this.p(n27, cArray));
                    n27 += 2;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
        }
        if (n3 != 0) {
            int n28 = this.d(n3);
            int n29 = n3 + 2;
            try {
                while (n28-- > 0) {
                    bytecodeMetadataAnalyzer.m(this.p(n29, cArray));
                    n29 += 2;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
        }
        if (n12 != 0) {
            int n30 = this.d(n12);
            int n31 = n12 + 2;
            try {
                while (n30-- > 0) {
                    bytecodeMetadataAnalyzer.G(this.p(n31, cArray), this.p(n31 + 2, cArray), this.R(n31 + 4, cArray), this.d(n31 + 6));
                    n31 += 8;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
        }
        if (n2 != 0) {
            int n32 = this.d(n2);
            n2 += 2;
            while (n32-- > 0) {
                n2 = this.C(bytecodeMetadataAnalyzer, systemHealthMonitor2402, n2);
            }
        }
        int n33 = this.d(n13);
        n13 += 2;
        while (n33-- > 0) {
            n13 = this.m(bytecodeMetadataAnalyzer, systemHealthMonitor2402, n13);
        }
        int n34 = this.d(n13);
        n13 += 2;
        while (n34-- > 0) {
            n13 = this.c(bytecodeMetadataAnalyzer, systemHealthMonitor2402, n13);
        }
        bytecodeMetadataAnalyzer.t();
    }

    private EntityDescriptor F(int n, char[] cArray) {
        EntityDescriptor entityDescriptor = this.w[n];
        try {
            if (entityDescriptor != null) {
                return entityDescriptor;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        int n2 = this.Z[n];
        int n3 = this.Z[this.d(n2 + 2)];
        String string = this.R(n3, cArray);
        String string2 = this.R(n3 + 2, cArray);
        int n4 = this.a[this.d(n2)];
        ConfigurationDescriptor1455 configurationDescriptor1455 = (ConfigurationDescriptor1455)this.D(this.d(n4), cArray);
        Object[] objectArray = new Object[this.d(n4 + 2)];
        n4 += 4;
        try {
            for (int i = 0; i < objectArray.length; ++i) {
                objectArray[i] = this.D(this.d(n4), cArray);
                n4 += 2;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CipherEncryptionUtility.a(illegalArgumentException);
        }
        this.w[n] = new EntityDescriptor(string, string2, configurationDescriptor1455, objectArray);
        return this.w[n];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private int v(int[] nArray, int n) {
        block7: {
            try {
                block6: {
                    try {
                        try {
                            if (nArray == null || n >= nArray.length) break block6;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CipherEncryptionUtility.a(illegalArgumentException);
                        }
                        if (this.N(nArray[n]) >= 67) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CipherEncryptionUtility.a(illegalArgumentException);
                    }
                }
                return -1;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CipherEncryptionUtility.a(illegalArgumentException);
            }
        }
        return this.d(nArray[n] + 1);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CipherEncryptionUtility.c = MultiContainerRegistry.a(5845477825289470209L, -5419404841617389192L, null).a(70407188389328L);
                CipherEncryptionUtility.f = new HashMap<K, V>(13);
                var0 = CipherEncryptionUtility.c ^ 39431796738372L;
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
                var8_3 = new long[12];
                var5_4 = 0;
                var6_5 = "\u00d1'\u0093\u00beonM\u0017\u00d6\u00c9\u0096G\u00fam&\u00946\u001f\u00eb\u0087\u0000\u00cd\u00c3\u0091\u00eb\u00c6\u0006$G\u008a\u00f9|\u00cf\u009b\u001f\u001db\u009eB{\u00a0v\u00c2r\u0097\u0006\u00b2m 3\u00f9\u0012\u00da\r\u007f/\u0016\u00d7\u00d2w\u00f6\u00ad6\u00b1\u008cA\u000b\u00ce\u00c3\u00c5W\u00a2\u00c5T\u00db\u001b6\t7@";
                var7_6 = "\u00d1'\u0093\u00beonM\u0017\u00d6\u00c9\u0096G\u00fam&\u00946\u001f\u00eb\u0087\u0000\u00cd\u00c3\u0091\u00eb\u00c6\u0006$G\u008a\u00f9|\u00cf\u009b\u001f\u001db\u009eB{\u00a0v\u00c2r\u0097\u0006\u00b2m 3\u00f9\u0012\u00da\r\u007f/\u0016\u00d7\u00d2w\u00f6\u00ad6\u00b1\u008cA\u000b\u00ce\u00c3\u00c5W\u00a2\u00c5T\u00db\u001b6\t7@".length();
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
                    var6_5 = "\u0001\u00d5G\u0000\u00b9\"V\u00a6$\u00df\u00c5\u0089\u00a7\u008eM\u0001";
                    var7_6 = "\u0001\u00d5G\u0000\u00b9\"V\u00a6$\u00df\u00c5\u0089\u00a7\u008eM\u0001".length();
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
        CipherEncryptionUtility.d = var8_3;
        CipherEncryptionUtility.e = new Integer[12];
    }

    public String F(int n, char[] cArray) {
        return this.e(n, cArray);
    }
}

