/*
 * Decompiled with CFR 0.152.
 */
package com.compiler.parsing;

import com.metadata.registry.DynamicMetadataRegistry;
import com.monitoring.model.TelemetryRecord;
import com.operations.bitwise.BitwiseOperationInterface;

public class SyntaxTokenizer
implements BitwiseOperationInterface {
    private static final int[] I = new int[]{350, 0, 0, 0, 351, 352, 0, 0, 0, 353, 354, 0, 355, 0, 356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 357, 358, 359, 0};
    private String R;
    private StringBuilder z = new StringBuilder();
    private int S;
    private int J;
    private TelemetryRecord V = null;
    private static final DynamicMetadataRegistry F = new DynamicMetadataRegistry();
    private TelemetryRecord E = new TelemetryRecord();
    private int W = -1;
    private int s;

    private void r(int n) {
        this.W = n;
    }

    /*
     * Exception decompiling
     */
    private int a(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 11[SWITCH]
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

    private int T() {
        int n;
        block4: do {
            if ((n = this.M()) != 47) continue;
            n = this.M();
            if (n == 47) {
                while ((n = this.M()) != 10) {
                    try {
                        if (n != 13 && n != -1) continue;
                        continue block4;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw SyntaxTokenizer.a(numberFormatException);
                    }
                }
                continue;
            }
            if (n == 42) {
                while (true) {
                    n = this.M();
                    try {
                        if (n == -1) {
                            continue block4;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw SyntaxTokenizer.a(numberFormatException);
                    }
                    if (n != 42) continue;
                    n = this.M();
                    if (n == 47) {
                        n = 32;
                        continue block4;
                    }
                    this.r(n);
                }
            }
            this.r(n);
            n = 47;
        } while (SyntaxTokenizer.h(n));
        return n;
    }

    private int r(TelemetryRecord telemetryRecord) {
        int n;
        block22: {
            n = this.T();
            try {
                if (n < 0) {
                    return n;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw SyntaxTokenizer.a(numberFormatException);
            }
            try {
                if (n == 10) {
                    ++this.S;
                    return 10;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw SyntaxTokenizer.a(numberFormatException);
            }
            try {
                if (n == 39) {
                    return this.B(telemetryRecord);
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw SyntaxTokenizer.a(numberFormatException);
            }
            try {
                if (n == 34) {
                    return this.A(telemetryRecord);
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw SyntaxTokenizer.a(numberFormatException);
            }
            try {
                try {
                    if (48 > n || n > 57) break block22;
                }
                catch (NumberFormatException numberFormatException) {
                    throw SyntaxTokenizer.a(numberFormatException);
                }
                return this.l(n, telemetryRecord);
            }
            catch (NumberFormatException numberFormatException) {
                throw SyntaxTokenizer.a(numberFormatException);
            }
        }
        if (n == 46) {
            block23: {
                n = this.M();
                try {
                    if (48 > n || n > 57) break block23;
                }
                catch (NumberFormatException numberFormatException) {
                    throw SyntaxTokenizer.a(numberFormatException);
                }
                StringBuilder stringBuilder = this.z;
                stringBuilder.setLength(0);
                stringBuilder.append('.');
                return this.k(stringBuilder, n, telemetryRecord);
            }
            this.r(n);
            return this.a(46);
        }
        try {
            if (Character.isJavaIdentifierStart((char)n)) {
                return this.v(n, telemetryRecord);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw SyntaxTokenizer.a(numberFormatException);
        }
        return this.a(n);
    }

    /*
     * Loose catch block
     */
    private int k(StringBuilder stringBuilder, int n, TelemetryRecord telemetryRecord) {
        block34: {
            block33: {
                block31: {
                    block32: {
                        block30: {
                            block36: {
                                block35: {
                                    if (n == 69) break block30;
                                    if (n == 101) break block30;
                                    break block35;
                                    catch (NumberFormatException numberFormatException) {
                                        throw SyntaxTokenizer.a(numberFormatException);
                                    }
                                }
                                if (n == 68) break block30;
                                break block36;
                                catch (NumberFormatException numberFormatException) {
                                    throw SyntaxTokenizer.a(numberFormatException);
                                }
                            }
                            try {
                                block37: {
                                    if (n == 100) break block30;
                                    break block37;
                                    catch (NumberFormatException numberFormatException) {
                                        throw SyntaxTokenizer.a(numberFormatException);
                                    }
                                }
                                stringBuilder.append((char)n);
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw SyntaxTokenizer.a(numberFormatException);
                            }
                            while (true) {
                                n = this.M();
                                if (48 > n) break;
                                try {
                                    block38: {
                                        if (n > 57) break;
                                        break block38;
                                        catch (NumberFormatException numberFormatException) {
                                            throw SyntaxTokenizer.a(numberFormatException);
                                        }
                                    }
                                    stringBuilder.append((char)n);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw SyntaxTokenizer.a(numberFormatException);
                                }
                            }
                        }
                        try {
                            if (n != 69 && n != 101) break block31;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw SyntaxTokenizer.a(numberFormatException);
                        }
                        stringBuilder.append((char)n);
                        n = this.M();
                        try {
                            if (n != 43 && n != 45) break block32;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw SyntaxTokenizer.a(numberFormatException);
                        }
                        stringBuilder.append((char)n);
                        n = this.M();
                    }
                    while (true) {
                        try {
                            if (48 > n || n > 57) break;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw SyntaxTokenizer.a(numberFormatException);
                        }
                        stringBuilder.append((char)n);
                        n = this.M();
                    }
                }
                try {
                    telemetryRecord.h = Double.parseDouble(stringBuilder.toString());
                }
                catch (NumberFormatException numberFormatException) {
                    return 500;
                }
                try {
                    try {
                        if (n != 70 && n != 102) break block33;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw SyntaxTokenizer.a(numberFormatException);
                    }
                    return 404;
                }
                catch (NumberFormatException numberFormatException) {
                    throw SyntaxTokenizer.a(numberFormatException);
                }
            }
            try {
                try {
                    if (n == 68 || n == 100) break block34;
                }
                catch (NumberFormatException numberFormatException) {
                    throw SyntaxTokenizer.a(numberFormatException);
                }
                this.r(n);
            }
            catch (NumberFormatException numberFormatException) {
                throw SyntaxTokenizer.a(numberFormatException);
            }
        }
        return 405;
    }

    public SyntaxTokenizer(String string) {
        this.R = string;
        this.s = 0;
        this.J = string.length();
        this.S = 0;
    }

    public String E() {
        int n;
        int n2 = this.s - 10;
        if (n2 < 0) {
            n2 = 0;
        }
        if ((n = this.s + 10) > this.J) {
            n = this.J;
        }
        return this.R.substring(n2, n);
    }

    public String i() {
        return this.E.a;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public int Q() {
        TelemetryRecord telemetryRecord;
        try {
            if (this.V == null) {
                return this.P(this.E);
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw SyntaxTokenizer.a(numberFormatException);
        }
        this.E = telemetryRecord = this.V;
        this.V = this.V.s;
        return telemetryRecord.A;
    }

    /*
     * Exception decompiling
     */
    private int P(TelemetryRecord var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[DOLOOP]], but top level block is 0[TRYBLOCK]
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

    private int l() {
        int n = this.M();
        if (n == 110) {
            n = 10;
        } else if (n == 116) {
            n = 9;
        } else if (n == 114) {
            n = 13;
        } else if (n == 102) {
            n = 12;
        } else {
            try {
                if (n == 10) {
                    ++this.S;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw SyntaxTokenizer.a(numberFormatException);
            }
        }
        return n;
    }

    private int B(TelemetryRecord telemetryRecord) {
        int n = 0;
        while (true) {
            int n2;
            block8: {
                block9: {
                    block7: {
                        n2 = this.M();
                        try {
                            if (n2 == 39) break;
                            if (n2 != 92) break block7;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw SyntaxTokenizer.a(numberFormatException);
                        }
                        n = this.l();
                        continue;
                    }
                    try {
                        try {
                            if (n2 >= 32) break block8;
                            if (n2 != 10) break block9;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw SyntaxTokenizer.a(numberFormatException);
                        }
                        ++this.S;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw SyntaxTokenizer.a(numberFormatException);
                    }
                }
                return 500;
            }
            n = n2;
        }
        telemetryRecord.k = n;
        return 401;
    }

    public int w() {
        return this.m(0);
    }

    private static boolean h(int n) {
        boolean bl;
        block12: {
            block11: {
                try {
                    block10: {
                        try {
                            try {
                                try {
                                    try {
                                        if (n == 32 || n == 9) break block10;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw SyntaxTokenizer.a(numberFormatException);
                                    }
                                    if (n == 12) break block10;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw SyntaxTokenizer.a(numberFormatException);
                                }
                                if (n == 13) break block10;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw SyntaxTokenizer.a(numberFormatException);
                            }
                            if (n != 10) break block11;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw SyntaxTokenizer.a(numberFormatException);
                        }
                    }
                    bl = true;
                    break block12;
                }
                catch (NumberFormatException numberFormatException) {
                    throw SyntaxTokenizer.a(numberFormatException);
                }
            }
            bl = false;
        }
        return bl;
    }

    private int v(int n, TelemetryRecord telemetryRecord) {
        StringBuilder stringBuilder = this.z;
        stringBuilder.setLength(0);
        do {
            stringBuilder.append((char)n);
        } while (Character.isJavaIdentifierPart((char)(n = this.M())));
        this.r(n);
        String string = stringBuilder.toString();
        int n2 = F.K(string);
        try {
            if (n2 >= 0) {
                return n2;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw SyntaxTokenizer.a(numberFormatException);
        }
        telemetryRecord.a = string;
        return 400;
    }

    public long N() {
        return this.E.k;
    }

    public int m(int n) {
        TelemetryRecord telemetryRecord = this.V;
        if (telemetryRecord == null) {
            this.V = telemetryRecord = this.E;
            telemetryRecord.s = null;
            this.P(telemetryRecord);
        }
        while (true) {
            block4: {
                TelemetryRecord telemetryRecord2;
                try {
                    if (n-- <= 0) break;
                    if (telemetryRecord.s != null) break block4;
                }
                catch (NumberFormatException numberFormatException) {
                    throw SyntaxTokenizer.a(numberFormatException);
                }
                telemetryRecord.s = telemetryRecord2 = new TelemetryRecord();
                this.P(telemetryRecord2);
            }
            telemetryRecord = telemetryRecord.s;
        }
        this.E = telemetryRecord;
        return telemetryRecord.A;
    }

    private int A(TelemetryRecord telemetryRecord) {
        int n;
        StringBuilder stringBuilder = this.z;
        stringBuilder.setLength(0);
        while (true) {
            block11: {
                block13: {
                    block12: {
                        n = this.M();
                        try {
                            if (n == 34) break block11;
                            if (n != 92) break block12;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw SyntaxTokenizer.a(numberFormatException);
                        }
                        n = this.l();
                        break block13;
                    }
                    try {
                        try {
                            if (n != 10 && n >= 0) break block13;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw SyntaxTokenizer.a(numberFormatException);
                        }
                        ++this.S;
                        return 500;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw SyntaxTokenizer.a(numberFormatException);
                    }
                }
                stringBuilder.append((char)n);
                continue;
            }
            while (true) {
                n = this.M();
                try {
                    if (n == 10) {
                        ++this.S;
                        continue;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    throw SyntaxTokenizer.a(numberFormatException);
                }
                if (!SyntaxTokenizer.h(n)) break;
            }
            if (n != 34) break;
        }
        this.r(n);
        telemetryRecord.a = stringBuilder.toString();
        return 406;
    }

    private int l(int n, TelemetryRecord telemetryRecord) {
        int n2;
        block53: {
            block52: {
                long l;
                block51: {
                    block50: {
                        block43: {
                            block49: {
                                block45: {
                                    block48: {
                                        block44: {
                                            l = 0L;
                                            n2 = this.M();
                                            try {
                                                try {
                                                    if (n != 48) break block43;
                                                    if (n2 == 88) break block44;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw SyntaxTokenizer.a(numberFormatException);
                                                }
                                                if (n2 != 120) break block45;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw SyntaxTokenizer.a(numberFormatException);
                                            }
                                        }
                                        while (true) {
                                            block47: {
                                                block46: {
                                                    n = this.M();
                                                    try {
                                                        if (48 > n || n > 57) break block46;
                                                    }
                                                    catch (NumberFormatException numberFormatException) {
                                                        throw SyntaxTokenizer.a(numberFormatException);
                                                    }
                                                    l = l * 16L + (long)(n - 48);
                                                    continue;
                                                }
                                                try {
                                                    if (65 > n || n > 70) break block47;
                                                }
                                                catch (NumberFormatException numberFormatException) {
                                                    throw SyntaxTokenizer.a(numberFormatException);
                                                }
                                                l = l * 16L + (long)(n - 65 + 10);
                                                continue;
                                            }
                                            try {
                                                if (97 > n || n > 102) break;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw SyntaxTokenizer.a(numberFormatException);
                                            }
                                            l = l * 16L + (long)(n - 97 + 10);
                                        }
                                        try {
                                            try {
                                                telemetryRecord.k = l;
                                                if (n != 76 && n != 108) break block48;
                                            }
                                            catch (NumberFormatException numberFormatException) {
                                                throw SyntaxTokenizer.a(numberFormatException);
                                            }
                                            return 403;
                                        }
                                        catch (NumberFormatException numberFormatException) {
                                            throw SyntaxTokenizer.a(numberFormatException);
                                        }
                                    }
                                    this.r(n);
                                    return 402;
                                }
                                try {
                                    if (48 > n2 || n2 > 55) break block43;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw SyntaxTokenizer.a(numberFormatException);
                                }
                                l = n2 - 48;
                                while (true) {
                                    n = this.M();
                                    try {
                                        if (48 > n || n > 55) break;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw SyntaxTokenizer.a(numberFormatException);
                                    }
                                    l = l * 8L + (long)(n - 48);
                                }
                                try {
                                    try {
                                        telemetryRecord.k = l;
                                        if (n != 76 && n != 108) break block49;
                                    }
                                    catch (NumberFormatException numberFormatException) {
                                        throw SyntaxTokenizer.a(numberFormatException);
                                    }
                                    return 403;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw SyntaxTokenizer.a(numberFormatException);
                                }
                            }
                            this.r(n);
                            return 402;
                        }
                        l = n - 48;
                        while (true) {
                            try {
                                if (48 > n2 || n2 > 57) break;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw SyntaxTokenizer.a(numberFormatException);
                            }
                            l = l * 10L + (long)n2 - 48L;
                            n2 = this.M();
                        }
                        try {
                            try {
                                telemetryRecord.k = l;
                                if (n2 != 70 && n2 != 102) break block50;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw SyntaxTokenizer.a(numberFormatException);
                            }
                            telemetryRecord.h = l;
                            return 404;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw SyntaxTokenizer.a(numberFormatException);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (n2 == 69 || n2 == 101) break block51;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    throw SyntaxTokenizer.a(numberFormatException);
                                }
                                if (n2 == 68) break block51;
                            }
                            catch (NumberFormatException numberFormatException) {
                                throw SyntaxTokenizer.a(numberFormatException);
                            }
                            if (n2 == 100) break block51;
                        }
                        catch (NumberFormatException numberFormatException) {
                            throw SyntaxTokenizer.a(numberFormatException);
                        }
                        if (n2 != 46) break block52;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw SyntaxTokenizer.a(numberFormatException);
                    }
                }
                StringBuilder stringBuilder = this.z;
                stringBuilder.setLength(0);
                stringBuilder.append(l);
                return this.k(stringBuilder, n2, telemetryRecord);
            }
            try {
                try {
                    if (n2 != 76 && n2 != 108) break block53;
                }
                catch (NumberFormatException numberFormatException) {
                    throw SyntaxTokenizer.a(numberFormatException);
                }
                return 403;
            }
            catch (NumberFormatException numberFormatException) {
                throw SyntaxTokenizer.a(numberFormatException);
            }
        }
        this.r(n2);
        return 402;
    }

    public double u() {
        return this.E.h;
    }

    private int M() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.W >= 0) break block4;
                        if (this.s >= this.J) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw SyntaxTokenizer.a(numberFormatException);
                    }
                    return this.R.charAt(this.s++);
                }
                catch (NumberFormatException numberFormatException) {
                    throw SyntaxTokenizer.a(numberFormatException);
                }
            }
            return -1;
        }
        int n = this.W;
        this.W = -1;
        return n;
    }

    static {
        F.U("abstract", 300);
        F.U("boolean", 301);
        F.U("break", 302);
        F.U("byte", 303);
        F.U("case", 304);
        F.U("catch", 305);
        F.U("char", 306);
        F.U("class", 307);
        F.U("const", 308);
        F.U("continue", 309);
        F.U("default", 310);
        F.U("do", 311);
        F.U("double", 312);
        F.U("else", 313);
        F.U("extends", 314);
        F.U("false", 411);
        F.U("final", 315);
        F.U("finally", 316);
        F.U("float", 317);
        F.U("for", 318);
        F.U("goto", 319);
        F.U("if", 320);
        F.U("implements", 321);
        F.U("import", 322);
        F.U("instanceof", 323);
        F.U("int", 324);
        F.U("interface", 325);
        F.U("long", 326);
        F.U("native", 327);
        F.U("new", 328);
        F.U("null", 412);
        F.U("package", 329);
        F.U("private", 330);
        F.U("protected", 331);
        F.U("public", 332);
        F.U("return", 333);
        F.U("short", 334);
        F.U("static", 335);
        F.U("strictfp", 347);
        F.U("super", 336);
        F.U("switch", 337);
        F.U("synchronized", 338);
        F.U("this", 339);
        F.U("throw", 340);
        F.U("throws", 341);
        F.U("transient", 342);
        F.U("true", 410);
        F.U("try", 343);
        F.U("void", 344);
        F.U("volatile", 345);
        F.U("while", 346);
    }
}

