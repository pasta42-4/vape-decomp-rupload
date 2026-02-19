/*
 * Decompiled with CFR 0.152.
 */
package com.security.orchestration;

import a.aX;
import a.zY;
import com.app.config.NumericConfigurationDescriptor;
import com.bytecode.analysis.BytecodeAnalysisEngine;
import com.collections.management.MultiContainerRegistry;
import com.security.crypto.EncryptionContextInitializer;
import com.security.exchange.CryptoKeyExchangeMapping;
import com.text.encoding.EncodingUtilityManager;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

class CryptoOperationOrchestrator951 {
    CryptoKeyExchangeMapping M;
    private int[] D;
    private short t;
    private static final Map d;
    private static final long[] b;
    private int[] x;
    private int[] g;
    private static final Integer[] c;
    private int B;
    private int[] P;
    private short R;
    private int[] I;
    private static final long a;

    /*
     * Exception decompiling
     */
    void o(int var1_1, int var2_2, EncryptionContextInitializer var3_3, aX var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 16[SWITCH]
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

    private void p(int n) {
        try {
            if (this.g == null) {
                this.g = new int[10];
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
        }
        int n2 = this.g.length;
        if (this.t >= n2) {
            int[] nArray = new int[Math.max(this.t + 1, 2 * n2)];
            System.arraycopy(this.g, 0, nArray, 0, n2);
            this.g = nArray;
        }
        short s2 = this.t;
        this.t = (short)(s2 + 1);
        this.g[s2] = n;
        short s3 = (short)(this.R + this.t);
        try {
            if (s3 > this.M.u) {
                this.M.u = s3;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
        }
    }

    final void Z(aX aX2, int n, Object[] objectArray, int n2, Object[] objectArray2) {
        long l = a ^ 0x20BF74A34CE8L;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            block25: {
                try {
                    block24: {
                        try {
                            try {
                                if (n4 >= n) break;
                                this.x[n3++] = CryptoOperationOrchestrator951.Q(aX2, objectArray[n4]);
                                if (objectArray[n4] == NumericConfigurationDescriptor.A) break block24;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                            }
                            if (objectArray[n4] != NumericConfigurationDescriptor.o) break block25;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                    }
                    this.x[n3++] = CryptoOperationOrchestrator951.a(6848, 0x4517DF2E5B293AB8L ^ l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                }
            }
            ++n4;
        }
        try {
            while (n3 < this.x.length) {
                this.x[n3++] = CryptoOperationOrchestrator951.a(6848, 0x4517DF2E5B293AB8L ^ l);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
        }
        n4 = 0;
        int n5 = 0;
        while (true) {
            block27: {
                try {
                    block26: {
                        try {
                            try {
                                if (n5 >= n2) break;
                                if (objectArray2[n5] == NumericConfigurationDescriptor.A) break block26;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                            }
                            if (objectArray2[n5] != NumericConfigurationDescriptor.o) break block27;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                    }
                    ++n4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                }
            }
            ++n5;
        }
        this.I = new int[n2 + n4];
        n5 = 0;
        int n6 = 0;
        while (true) {
            block29: {
                try {
                    block28: {
                        try {
                            try {
                                if (n6 >= n2) break;
                                this.I[n5++] = CryptoOperationOrchestrator951.Q(aX2, objectArray2[n6]);
                                if (objectArray2[n6] == NumericConfigurationDescriptor.A) break block28;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                            }
                            if (objectArray2[n6] != NumericConfigurationDescriptor.o) break block29;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                    }
                    this.I[n5++] = CryptoOperationOrchestrator951.a(6848, 0x4517DF2E5B293AB8L ^ l);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                }
            }
            ++n6;
        }
        this.t = 0;
        this.B = 0;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C3;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ik", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CryptoOperationOrchestrator951.c[n2] = n3;
        }
        return c[n2];
    }

    final void E(aX aX2, int n, String string, int n2) {
        int n3;
        long l;
        block12: {
            block13: {
                l = a ^ 0x5F884AD3AE1CL;
                this.x = new int[n2];
                this.I = new int[0];
                n3 = 0;
                try {
                    try {
                        if ((n & 8) != 0) break block12;
                        if ((n & CryptoOperationOrchestrator951.a(12262, 0x191E7FB3EE21ED7FL ^ l)) != 0) break block13;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                    this.x[n3++] = CryptoOperationOrchestrator951.a(27132, 0x46AC98189F602B68L ^ l) | aX2.O(aX2.B());
                    break block12;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                }
            }
            this.x[n3++] = CryptoOperationOrchestrator951.a(4746, 0x60781FB79B31D00EL ^ l);
        }
        for (zY zY2 : zY.a(string)) {
            int n4 = CryptoOperationOrchestrator951.x(aX2, zY2.d(), 0);
            try {
                try {
                    this.x[n3++] = n4;
                    if (n4 != CryptoOperationOrchestrator951.a(14940, 0x1550FA865A50F8D7L ^ l) && n4 != CryptoOperationOrchestrator951.a(4089, 0x73D002A147094D42L ^ l)) continue;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                }
                this.x[n3++] = CryptoOperationOrchestrator951.a(6848, 0x4517A0196559D84CL ^ l);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
            }
        }
        try {
            while (n3 < n2) {
                this.x[n3++] = CryptoOperationOrchestrator951.a(6848, 0x4517A0196559D84CL ^ l);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
        }
    }

    final boolean Z(aX aX2, CryptoOperationOrchestrator951 cryptoOperationOrchestrator951, int n) {
        int n2;
        int n3;
        boolean bl = false;
        int n4 = this.x.length;
        int n5 = this.I.length;
        if (cryptoOperationOrchestrator951.x == null) {
            cryptoOperationOrchestrator951.x = new int[n4];
            bl = true;
        }
        int n6 = 0;
        while (true) {
            block16: {
                block15: {
                    try {
                        try {
                            if (n6 >= n4) break;
                            if (this.D == null) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                        if (n6 >= this.D.length) break block15;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                    n3 = this.D[n6];
                    n2 = n3 == 0 ? this.x[n6] : this.Y(n3, n5);
                    break block16;
                }
                n2 = this.x[n6];
            }
            if (this.P != null) {
                n2 = this.K(aX2, n2);
            }
            bl |= CryptoOperationOrchestrator951.I(aX2, n2, cryptoOperationOrchestrator951.x, n6);
            ++n6;
        }
        if (n > 0) {
            for (n6 = 0; n6 < n4; ++n6) {
                bl |= CryptoOperationOrchestrator951.I(aX2, this.x[n6], cryptoOperationOrchestrator951.x, n6);
            }
            if (cryptoOperationOrchestrator951.I == null) {
                cryptoOperationOrchestrator951.I = new int[1];
                bl = true;
            }
            return bl |= CryptoOperationOrchestrator951.I(aX2, n, cryptoOperationOrchestrator951.I, 0);
        }
        n6 = this.I.length + this.R;
        if (cryptoOperationOrchestrator951.I == null) {
            cryptoOperationOrchestrator951.I = new int[n6 + this.t];
            bl = true;
        }
        for (n2 = 0; n2 < n6; ++n2) {
            n3 = this.I[n2];
            if (this.P != null) {
                n3 = this.K(aX2, n3);
            }
            bl |= CryptoOperationOrchestrator951.I(aX2, n3, cryptoOperationOrchestrator951.I, n2);
        }
        for (n2 = 0; n2 < this.t; ++n2) {
            n3 = this.g[n2];
            int n7 = this.Y(n3, n5);
            if (this.P != null) {
                n7 = this.K(aX2, n7);
            }
            bl |= CryptoOperationOrchestrator951.I(aX2, n7, cryptoOperationOrchestrator951.I, n6 + n2);
        }
        return bl;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private int Y(int n, int n2) {
        long l = a ^ 0x6B1D5CC60F56L;
        int n3 = n & CryptoOperationOrchestrator951.a(30134, 0x7332381C8944964DL ^ l);
        int n4 = n & CryptoOperationOrchestrator951.a(21430, 0x6EF5AED413FC306CL ^ l);
        if (n4 == CryptoOperationOrchestrator951.a(11080, 0x75B622680D9048BDL ^ l)) {
            int n5;
            block10: {
                block11: {
                    n5 = n3 + this.x[n & CryptoOperationOrchestrator951.a(9363, 0x25A251E770E9C76CL ^ l)];
                    try {
                        try {
                            if ((n & CryptoOperationOrchestrator951.a(25195, 0x4E8A33B115C281AFL ^ l)) == 0) break block10;
                            if (n5 == CryptoOperationOrchestrator951.a(14940, 0x1550CE134C45599DL ^ l)) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                        if (n5 != CryptoOperationOrchestrator951.a(4089, 0x73D03634511CEC08L ^ l)) break block10;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                }
                n5 = CryptoOperationOrchestrator951.a(6848, 0x4517948C734C7906L ^ l);
            }
            return n5;
        }
        if (n4 == CryptoOperationOrchestrator951.a(21747, 0x4A3B2F6568D8B707L ^ l)) {
            int n6;
            block12: {
                block13: {
                    n6 = n3 + this.I[n2 - (n & CryptoOperationOrchestrator951.a(9363, 0x25A251E770E9C76CL ^ l))];
                    try {
                        try {
                            if ((n & CryptoOperationOrchestrator951.a(25195, 0x4E8A33B115C281AFL ^ l)) == 0) break block12;
                            if (n6 == CryptoOperationOrchestrator951.a(14940, 0x1550CE134C45599DL ^ l)) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                        if (n6 != CryptoOperationOrchestrator951.a(4089, 0x73D03634511CEC08L ^ l)) break block12;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                }
                n6 = CryptoOperationOrchestrator951.a(6848, 0x4517948C734C7906L ^ l);
            }
            return n6;
        }
        return n;
    }

    static int Q(aX aX2, Object object) {
        long l = a ^ 0x1359522DD737L;
        try {
            if (object instanceof Integer) {
                return CryptoOperationOrchestrator951.a(6848, 0x4517ECC87DA7A167L ^ l) | (Integer)object;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
        }
        if (object instanceof String) {
            String string = zY.p((String)object).d();
            return CryptoOperationOrchestrator951.x(aX2, string, 0);
        }
        return CryptoOperationOrchestrator951.a(5447, 0x35666D8DB68F2EEAL ^ l) | aX2.V("", ((CryptoKeyExchangeMapping)object).n);
    }

    private void q(int n, int n2) {
        try {
            if (this.D == null) {
                this.D = new int[10];
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
        }
        int n3 = this.D.length;
        if (n >= n3) {
            int[] nArray = new int[Math.max(n + 1, 2 * n3)];
            System.arraycopy(this.D, 0, nArray, 0, n3);
            this.D = nArray;
        }
        this.D[n] = n2;
    }

    CryptoOperationOrchestrator951(CryptoKeyExchangeMapping cryptoKeyExchangeMapping) {
        this.M = cryptoKeyExchangeMapping;
    }

    private void H(String string) {
        block7: {
            block8: {
                char c;
                block6: {
                    c = string.charAt(0);
                    try {
                        if (c != '(') break block6;
                        this.K((zY.m(string) >> 2) - 1);
                        break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        if (c != 'J' && c != 'D') break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                    this.K(2);
                    break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                }
            }
            this.K(1);
        }
    }

    private void K(int n) {
        block3: {
            block2: {
                try {
                    if (this.t < n) break block2;
                    this.t = (short)(this.t - n);
                    break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                }
            }
            this.R = (short)(this.R - (n - this.t));
            this.t = 0;
        }
    }

    final int E() {
        return this.I.length;
    }

    private void U(aX aX2, String string) {
        block8: {
            int n;
            long l = a ^ 0x58C15D2D509L;
            try {
                n = string.charAt(0) == '(' ? zY.Q(string) : 0;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
            }
            int n2 = n;
            int n3 = CryptoOperationOrchestrator951.x(aX2, string, n2);
            try {
                block9: {
                    try {
                        try {
                            if (n3 == 0) break block8;
                            this.p(n3);
                            if (n3 == CryptoOperationOrchestrator951.a(14940, 0x1550A082055183C2L ^ l)) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                        if (n3 != CryptoOperationOrchestrator951.a(4089, 0x73D058A518083657L ^ l)) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                }
                this.p(CryptoOperationOrchestrator951.a(6848, 0x4517FA1D3A58A359L ^ l));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
            }
        }
    }

    /*
     * Exception decompiling
     */
    static void O(aX var0, int var1_1, EncodingUtilityManager var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[SWITCH]
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

    final void P(CryptoOperationOrchestrator951 cryptoOperationOrchestrator951) {
        this.x = cryptoOperationOrchestrator951.x;
        this.I = cryptoOperationOrchestrator951.I;
        this.R = 0;
        this.D = cryptoOperationOrchestrator951.D;
        this.g = cryptoOperationOrchestrator951.g;
        this.t = cryptoOperationOrchestrator951.t;
        this.B = cryptoOperationOrchestrator951.B;
        this.P = cryptoOperationOrchestrator951.P;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CryptoOperationOrchestrator951.a = MultiContainerRegistry.a(3467051818340172728L, 4936157262144143565L, null).a(23886474414816L);
                CryptoOperationOrchestrator951.d = new HashMap<K, V>(13);
                var0 = CryptoOperationOrchestrator951.a ^ 130687652202193L;
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
                var8_3 = new long[47];
                var5_4 = 0;
                var6_5 = "\u00133\u00c9\u00c6<\u001f!\u00f3\u00eaP\u000f\u001d\u00f2K\u00b0\u00ce\u00f19\u00a7^$#f\u00b8\n\u00af5\u00ad\u00e3=\u00eev\t\u00cd\u00d3JK\u00ec9\u00af\u00ab|\u00d3\u00ac6\u00e8\"\u00fbn\u00bb\u00177f.X\u00c5!k2\u00d3\u000b\u0016c\u00bf^\u00c9\u00b3\u0094P\u0007a\u008be\u00e8\u00d4\u00c5*h,\u00e8\u00de\u007f\u00bf\u00f7\u00ec7\u009f\u00e6'\u009e\u0081\u0083D\u00fd\u00ac!\u00f3\u009e1*\u008d\u00cc\u00e8qK\u00e1\u0080\u00ad\u00f6\u00f3\u0013\u0088\u00b7+Z\u009b\u0083\u0097O\u000b\u00a1o'\u008fZ\u000f;\"m\u0082*\u00cb\u009e\u009a\u00f8\u00e0-F\u00d9\u00c5oD\u00c0#:\u00ef\u00e4\u00b2\u001d\u00de\u0099\u00fc^\u00ec\u0014\u001e\u00e5\u00e8HfG_3\u00d3<a\u00bc\u00b5}D\u00b7\u0082\u00bc]\u008d4X7\u00db\u009ac\u00a2\u0085]+\u00b9\u00ed\u00af+\u00fdF\u00cfVp\u001aC\u0016uz\u0082,\u00aam\u00c1\u0006\f\u00be\u00bf\u00ee\u00dfd\u00ff\u0080h\u0011\u00e8\u0095\u00d9\u00b143~g\u0086S\u0004Qxnv\u0011\u00a3D\u0096\u00ee\u00a6\u00a1%\u00e1Q\u00a0\u00f8C\u00bb\u009bm \u00b1n\u009e]\u00f0\u008d>\u0088z\u00e6;\u00e9\u00b9qa\u009d\u00d4\u00e9E0\u00d9\u00ea\u00d5\u00ff\u0094\u001e\u00a08\u00d3;6\u00c6U&\u00b4\u0094\u00b73\u000bIB\u00f5\u00ebj\u0089i\u00d0X]\u00d5%\u00e4\u0087\u00bd\u00aa\u00e5\u0012\u00b6>U&\u001f\u00ecJ`\u00c8\u00dd\u001f\u00ea\u009c\u0001\u00cczu\u00a6u\u0000xu\u0007\u0003c\u00ea8\u0018\u0098\u00bc\u00b3:9\u00bc\u00e09\u0090\u0088\u00ad\u00dd(\u009aBY\u0015\u001b;JZOc-\u0001y\u00b1=";
                var7_6 = "\u00133\u00c9\u00c6<\u001f!\u00f3\u00eaP\u000f\u001d\u00f2K\u00b0\u00ce\u00f19\u00a7^$#f\u00b8\n\u00af5\u00ad\u00e3=\u00eev\t\u00cd\u00d3JK\u00ec9\u00af\u00ab|\u00d3\u00ac6\u00e8\"\u00fbn\u00bb\u00177f.X\u00c5!k2\u00d3\u000b\u0016c\u00bf^\u00c9\u00b3\u0094P\u0007a\u008be\u00e8\u00d4\u00c5*h,\u00e8\u00de\u007f\u00bf\u00f7\u00ec7\u009f\u00e6'\u009e\u0081\u0083D\u00fd\u00ac!\u00f3\u009e1*\u008d\u00cc\u00e8qK\u00e1\u0080\u00ad\u00f6\u00f3\u0013\u0088\u00b7+Z\u009b\u0083\u0097O\u000b\u00a1o'\u008fZ\u000f;\"m\u0082*\u00cb\u009e\u009a\u00f8\u00e0-F\u00d9\u00c5oD\u00c0#:\u00ef\u00e4\u00b2\u001d\u00de\u0099\u00fc^\u00ec\u0014\u001e\u00e5\u00e8HfG_3\u00d3<a\u00bc\u00b5}D\u00b7\u0082\u00bc]\u008d4X7\u00db\u009ac\u00a2\u0085]+\u00b9\u00ed\u00af+\u00fdF\u00cfVp\u001aC\u0016uz\u0082,\u00aam\u00c1\u0006\f\u00be\u00bf\u00ee\u00dfd\u00ff\u0080h\u0011\u00e8\u0095\u00d9\u00b143~g\u0086S\u0004Qxnv\u0011\u00a3D\u0096\u00ee\u00a6\u00a1%\u00e1Q\u00a0\u00f8C\u00bb\u009bm \u00b1n\u009e]\u00f0\u008d>\u0088z\u00e6;\u00e9\u00b9qa\u009d\u00d4\u00e9E0\u00d9\u00ea\u00d5\u00ff\u0094\u001e\u00a08\u00d3;6\u00c6U&\u00b4\u0094\u00b73\u000bIB\u00f5\u00ebj\u0089i\u00d0X]\u00d5%\u00e4\u0087\u00bd\u00aa\u00e5\u0012\u00b6>U&\u001f\u00ecJ`\u00c8\u00dd\u001f\u00ea\u009c\u0001\u00cczu\u00a6u\u0000xu\u0007\u0003c\u00ea8\u0018\u0098\u00bc\u00b3:9\u00bc\u00e09\u0090\u0088\u00ad\u00dd(\u009aBY\u0015\u001b;JZOc-\u0001y\u00b1=".length();
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
                    var6_5 = "wfJ\u00cb\u00d1\u0087\u0094(\u00d8{<\u00a2\u0094\u001eA\u00f9";
                    var7_6 = "wfJ\u00cb\u00d1\u0087\u0094(\u00d8{<\u00a2\u0094\u001eA\u00f9".length();
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
        CryptoOperationOrchestrator951.b = var8_3;
        CryptoOperationOrchestrator951.c = new Integer[47];
    }

    final void U(BytecodeAnalysisEngine bytecodeAnalysisEngine) {
        int n;
        int n2;
        long l = a ^ 0x415CD443F1A9L;
        int[] nArray = this.x;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (n5 < nArray.length) {
            int n6;
            int n7;
            int n8;
            block24: {
                block23: {
                    n8 = nArray[n5];
                    try {
                        try {
                            n7 = n5;
                            if (n8 != CryptoOperationOrchestrator951.a(9394, 0x208A66B5909C398AL ^ l) && n8 != CryptoOperationOrchestrator951.a(10941, 0x38CF239254AAB7BCL ^ l)) break block23;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                        n6 = 2;
                        break block24;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                }
                n6 = 1;
            }
            n5 = n7 + n6;
            try {
                if (n8 == CryptoOperationOrchestrator951.a(14607, 0x75C8E271C5F82424L ^ l)) {
                    ++n4;
                    continue;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
            }
            n3 += n4 + 1;
            n4 = 0;
        }
        int[] nArray2 = this.I;
        int n9 = 0;
        n5 = 0;
        while (n5 < nArray2.length) {
            int n10;
            int n11;
            block26: {
                block25: {
                    n2 = nArray2[n5];
                    try {
                        try {
                            n11 = n5;
                            if (n2 != CryptoOperationOrchestrator951.a(14940, 0x1550E452C4C0A762L ^ l) && n2 != CryptoOperationOrchestrator951.a(4089, 0x73D01C75D99912F7L ^ l)) break block25;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                        n10 = 2;
                        break block26;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                }
                n10 = 1;
            }
            n5 = n11 + n10;
            ++n9;
        }
        n2 = bytecodeAnalysisEngine.m(this.M.n, n3, n9);
        n5 = 0;
        while (n3-- > 0) {
            int n12;
            int n13;
            block28: {
                block27: {
                    n = nArray[n5];
                    try {
                        try {
                            n13 = n5;
                            if (n != CryptoOperationOrchestrator951.a(14940, 0x1550E452C4C0A762L ^ l) && n != CryptoOperationOrchestrator951.a(4089, 0x73D01C75D99912F7L ^ l)) break block27;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                        n12 = 2;
                        break block28;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                }
                n12 = 1;
            }
            n5 = n13 + n12;
            bytecodeAnalysisEngine.G(n2++, n);
        }
        n5 = 0;
        while (n9-- > 0) {
            int n14;
            int n15;
            block30: {
                block29: {
                    n = nArray2[n5];
                    try {
                        try {
                            n15 = n5;
                            if (n != CryptoOperationOrchestrator951.a(14940, 0x1550E452C4C0A762L ^ l) && n != CryptoOperationOrchestrator951.a(4089, 0x73D01C75D99912F7L ^ l)) break block29;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                        n14 = 2;
                        break block30;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                }
                n14 = 1;
            }
            n5 = n15 + n14;
            bytecodeAnalysisEngine.G(n2++, n);
        }
        bytecodeAnalysisEngine.T();
    }

    private int K(aX aX2, int n) {
        block10: {
            long l = a ^ 0x59C42F70A4EAL;
            try {
                if (n != CryptoOperationOrchestrator951.a(7768, 0x679201EDF4D3D627L ^ l) && (n & CryptoOperationOrchestrator951.a(22025, 0x48BB7685CB799E77L ^ l)) != CryptoOperationOrchestrator951.a(5447, 0x35662710CBD25D37L ^ l)) break block10;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
            }
            for (int i = 0; i < this.B; ++i) {
                block11: {
                    int n2 = this.P[i];
                    int n3 = n2 & CryptoOperationOrchestrator951.a(30134, 0x73320AC5FAF23DF1L ^ l);
                    int n4 = n2 & CryptoOperationOrchestrator951.a(21430, 0x6EF59C0D604A9BD0L ^ l);
                    int n5 = n2 & CryptoOperationOrchestrator951.a(9363, 0x25A2633E035F6CD0L ^ l);
                    if (n4 == CryptoOperationOrchestrator951.a(11080, 0x75B610B17E26E301L ^ l)) {
                        n2 = n3 + this.x[n5];
                    } else if (n4 == CryptoOperationOrchestrator951.a(21747, 0x4A3B1DBC1B6E1CBBL ^ l)) {
                        n2 = n3 + this.I[this.I.length - n5];
                    }
                    try {
                        try {
                            if (n != n2) continue;
                            if (n != CryptoOperationOrchestrator951.a(4746, 0x607819FBFE92DAF8L ^ l)) break block11;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                        return CryptoOperationOrchestrator951.a(27132, 0x46AC9E54FAC3219EL ^ l) | aX2.O(aX2.B());
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                    }
                }
                return CryptoOperationOrchestrator951.a(27132, 0x46AC9E54FAC3219EL ^ l) | aX2.O(aX2.S((int)(n & CryptoOperationOrchestrator951.a((int)9363, (long)(0x25A2633E035F6CD0L ^ l)))).i);
            }
        }
        return n;
    }

    private int q() {
        long l = a ^ 0x6001B73C4E58L;
        try {
            if (this.t > 0) {
                this.t = (short)(this.t - 1);
                return this.g[this.t];
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
        }
        this.R = (short)(this.R - 1);
        return CryptoOperationOrchestrator951.a(21747, 0x4A3B24798322F609L ^ l) | -this.R;
    }

    private static boolean I(aX aX2, int n, int[] nArray, int n2) {
        int n3;
        int n4;
        block46: {
            long l;
            block42: {
                int n5;
                block45: {
                    block44: {
                        int n6;
                        block35: {
                            block39: {
                                int n7;
                                int n8;
                                block41: {
                                    block40: {
                                        block37: {
                                            block38: {
                                                block36: {
                                                    block33: {
                                                        block34: {
                                                            l = a ^ 0x7C3F79E04D64L;
                                                            n4 = nArray[n2];
                                                            try {
                                                                if (n4 == n) {
                                                                    return false;
                                                                }
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                                            }
                                                            n6 = n;
                                                            try {
                                                                try {
                                                                    if ((n & CryptoOperationOrchestrator951.a(15354, 0xC43CE3DDA211A3AL ^ l)) != CryptoOperationOrchestrator951.a(15425, 0x69279326C49B9DB9L ^ l)) break block33;
                                                                    if (n4 != CryptoOperationOrchestrator951.a(26291, 0x20D0467DA429C75DL ^ l)) break block34;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                                                }
                                                                return false;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                                            }
                                                        }
                                                        n6 = CryptoOperationOrchestrator951.a(26291, 0x20D0467DA429C75DL ^ l);
                                                    }
                                                    try {
                                                        if (n4 == 0) {
                                                            nArray[n2] = n6;
                                                            return true;
                                                        }
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if ((n4 & CryptoOperationOrchestrator951.a(1580, 0x460388E4254AA7DEL ^ l)) == 0 && (n4 & CryptoOperationOrchestrator951.a(8089, 0x52173E7595CBBE72L ^ l)) != CryptoOperationOrchestrator951.a(20215, 0x3A85F2790A2CEF0DL ^ l)) break block35;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                                            }
                                                            if (n6 != CryptoOperationOrchestrator951.a(26291, 0x20D0467DA429C75DL ^ l)) break block36;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                                        }
                                                        return false;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                                    }
                                                }
                                                try {
                                                    if ((n6 & CryptoOperationOrchestrator951.a(10503, 0x6A49BED53DF908C8L ^ l)) != (n4 & CryptoOperationOrchestrator951.a(22025, 0x48BB537E9DE977F9L ^ l))) break block37;
                                                    if ((n4 & CryptoOperationOrchestrator951.a(21430, 0x6EF5B9F636DA725EL ^ l)) != CryptoOperationOrchestrator951.a(27132, 0x46ACBBAFAC53C810L ^ l)) break block38;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                                }
                                                n3 = n6 & CryptoOperationOrchestrator951.a(30134, 0x73322F3EAC62D47FL ^ l) | CryptoOperationOrchestrator951.a(27132, 0x46ACBBAFAC53C810L ^ l) | aX2.P(n6 & CryptoOperationOrchestrator951.a(3677, 0x37A328E0156B2FB2L ^ l), n4 & CryptoOperationOrchestrator951.a(9363, 0x25A246C555CF855EL ^ l));
                                                break block46;
                                            }
                                            int n9 = CryptoOperationOrchestrator951.a(30134, 0x73322F3EAC62D47FL ^ l) + (n6 & CryptoOperationOrchestrator951.a(30134, 0x73322F3EAC62D47FL ^ l));
                                            n3 = n9 | CryptoOperationOrchestrator951.a(27132, 0x46ACBBAFAC53C810L ^ l) | aX2.O("java/lang/Object");
                                            break block46;
                                        }
                                        try {
                                            if ((n6 & CryptoOperationOrchestrator951.a(30134, 0x73322F3EAC62D47FL ^ l)) == 0 && (n6 & CryptoOperationOrchestrator951.a(21430, 0x6EF5B9F636DA725EL ^ l)) != CryptoOperationOrchestrator951.a(27132, 0x46ACBBAFAC53C810L ^ l)) break block39;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                        }
                                        n8 = n6 & CryptoOperationOrchestrator951.a(30134, 0x73322F3EAC62D47FL ^ l);
                                        try {
                                            if (n8 == 0 || (n6 & CryptoOperationOrchestrator951.a(21430, 0x6EF5B9F636DA725EL ^ l)) == CryptoOperationOrchestrator951.a(27132, 0x46ACBBAFAC53C810L ^ l)) break block40;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                        }
                                        n8 = CryptoOperationOrchestrator951.a(30134, 0x73322F3EAC62D47FL ^ l) + n8;
                                    }
                                    n7 = n4 & CryptoOperationOrchestrator951.a(30134, 0x73322F3EAC62D47FL ^ l);
                                    try {
                                        if (n7 == 0 || (n4 & CryptoOperationOrchestrator951.a(21430, 0x6EF5B9F636DA725EL ^ l)) == CryptoOperationOrchestrator951.a(27132, 0x46ACBBAFAC53C810L ^ l)) break block41;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                    }
                                    n7 = CryptoOperationOrchestrator951.a(30134, 0x73322F3EAC62D47FL ^ l) + n7;
                                }
                                n3 = Math.min(n8, n7) | CryptoOperationOrchestrator951.a(27132, 0x46ACBBAFAC53C810L ^ l) | aX2.O("java/lang/Object");
                                break block46;
                            }
                            n3 = CryptoOperationOrchestrator951.a(6848, 0x451783AE566A3B34L ^ l);
                            break block46;
                        }
                        try {
                            block43: {
                                try {
                                    try {
                                        if (n4 != CryptoOperationOrchestrator951.a(26291, 0x20D0467DA429C75DL ^ l)) break block42;
                                        if ((n6 & CryptoOperationOrchestrator951.a(30134, 0x73322F3EAC62D47FL ^ l)) != 0) break block43;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                    }
                                    if ((n6 & CryptoOperationOrchestrator951.a(21430, 0x6EF5B9F636DA725EL ^ l)) != CryptoOperationOrchestrator951.a(27132, 0x46ACBBAFAC53C810L ^ l)) break block44;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                                }
                            }
                            n5 = n6;
                            break block45;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                        }
                    }
                    n5 = CryptoOperationOrchestrator951.a(6848, 0x451783AE566A3B34L ^ l);
                }
                n3 = n5;
                break block46;
            }
            n3 = CryptoOperationOrchestrator951.a(6848, 0x451783AE566A3B34L ^ l);
        }
        try {
            if (n3 != n4) {
                nArray[n2] = n3;
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
        }
        return false;
    }

    private int R(int n) {
        long l;
        block5: {
            l = a ^ 0x5D44292DFFE1L;
            try {
                try {
                    if (this.D != null && n < this.D.length) break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CryptoOperationOrchestrator951.a(illegalArgumentException);
                }
                return CryptoOperationOrchestrator951.a(11080, 0x75B61431787BB80AL ^ l) | n;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CryptoOperationOrchestrator951.a(illegalArgumentException);
            }
        }
        int n2 = this.D[n];
        if (n2 == 0) {
            n2 = this.D[n] = CryptoOperationOrchestrator951.a(11080, 0x75B61431787BB80AL ^ l) | n;
        }
        return n2;
    }

    private void l(int n) {
        try {
            if (this.P == null) {
                this.P = new int[2];
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CryptoOperationOrchestrator951.a(illegalArgumentException);
        }
        int n2 = this.P.length;
        if (this.B >= n2) {
            int[] nArray = new int[Math.max(this.B + 1, 2 * n2)];
            System.arraycopy(this.P, 0, nArray, 0, n2);
            this.P = nArray;
        }
        this.P[this.B++] = n;
    }

    /*
     * Exception decompiling
     */
    private static int x(aX var0, String var1_1, int var2_2) {
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

    static int M(aX aX2, String string) {
        long l = a ^ 0x648318CEFF9DL;
        return CryptoOperationOrchestrator951.a(27132, 0x46ACA313CD7D7AE9L ^ l) | aX2.O(string);
    }
}

