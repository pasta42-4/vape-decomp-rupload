/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.On;
import a.TF;
import a.W;
import a._s;
import a.a7;
import a.eq;
import a.r1;
import a.r9;
import a.rY;
import a.rq;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class _0
implements W {
    protected On A;
    protected String J;
    protected eq N;
    protected rq[] F;
    protected rq[] o;
    protected int v;

    private void n(String string, int n2) throws a7 {
        block24: {
            int n3;
            char c10;
            block23: {
                boolean bl2;
                block22: {
                    block20: {
                        block19: {
                            c10 = string.charAt(n2);
                            try {
                                if (c10 == ')') {
                                    return;
                                }
                            }
                            catch (a7 a72) {
                                throw _0.a(a72);
                            }
                            n3 = n2;
                            bl2 = false;
                            while (c10 == '[') {
                                bl2 = true;
                                c10 = string.charAt(++n3);
                            }
                            if (c10 == 'L') {
                                n3 = string.indexOf(59, n3) + 1;
                                try {
                                    if (n3 <= 0) {
                                        throw new IndexOutOfBoundsException("bad descriptor");
                                    }
                                    break block19;
                                }
                                catch (a7 a73) {
                                    throw _0.a(a73);
                                }
                            }
                            ++n3;
                        }
                        try {
                            block21: {
                                try {
                                    try {
                                        this.n(string, n3);
                                        if (bl2) break block20;
                                        if (c10 == 'J') break block21;
                                    }
                                    catch (a7 a74) {
                                        throw _0.a(a74);
                                    }
                                    if (c10 != 'D') break block20;
                                }
                                catch (a7 a75) {
                                    throw _0.a(a75);
                                }
                            }
                            this.v -= 2;
                            break block22;
                        }
                        catch (a7 a76) {
                            throw _0.a(a76);
                        }
                    }
                    --this.v;
                }
                try {
                    if (!bl2) break block23;
                    this.o[this.v].e(string.substring(n2, n3), this.A);
                    break block24;
                }
                catch (a7 a77) {
                    throw _0.a(a77);
                }
            }
            try {
                if (c10 == 'L') {
                    this.o[this.v].e(string.substring(n2 + 1, n3 - 1).replace('/', '.'), this.A);
                }
            }
            catch (a7 a78) {
                throw _0.a(a78);
            }
        }
    }

    private int k(int n2) {
        this.o[this.v++] = this.F[n2];
        return 2;
    }

    /*
     * Exception decompiling
     */
    private int O(int var1_1, byte[] var2_2, int var3_3) throws a7 {
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

    protected void W(int n2, byte[] byArray, int n3, int n4, int n5) throws a7 {
    }

    protected void l(int n2, byte[] byArray) throws a7 {
    }

    private int F(int n2, byte[] byArray) {
        int n3 = TF.M(byArray, n2 + 1);
        int n4 = byArray[n2 + 3] & 0xFF;
        this.v -= n4 - 1;
        String string = this.N.u(n3).replace('.', '/');
        this.o[this.v - 1] = new r9(string);
        return 4;
    }

    private int h(int n2, byte[] byArray, rq rq2) {
        int n3 = byArray[n2 + 1] & 0xFF;
        return this.U(n3, rq2);
    }

    private int l(int n2, byte[] byArray) throws a7 {
        int n3 = TF.M(byArray, n2 + 1);
        String string = this.N.G(n3);
        this.n(string, 1);
        this.B(string);
        return 5;
    }

    protected void D(int n2, byte[] byArray, int n3) throws a7 {
    }

    private int P(rq rq2, byte[] byArray, int n2) {
        int n3 = byArray[n2 + 1] & 0xFF;
        return this.G(n3, rq2);
    }

    public _0(_0 _02) {
        this.A = _02.A;
        this.N = _02.N;
        this.J = _02.J;
        this.v = _02.v;
        this.o = rq.i(_02.o.length);
        this.F = rq.i(_02.F.length);
    }

    private int J(int n2, byte[] byArray) throws a7 {
        int n3 = TF.M(byArray, n2 + 1);
        String string = this.N.b(n3);
        this.n(string, 1);
        String string2 = this.N.f(n3);
        this.o[--this.v].e(string2, this.A);
        this.B(string);
        return 5;
    }

    private void J(int n2) {
        block15: {
            int n3;
            block20: {
                block19: {
                    block18: {
                        block17: {
                            block16: {
                                block14: {
                                    rq[] rqArray = this.o;
                                    n3 = this.N.b(n2);
                                    try {
                                        if (n3 != 8) break block14;
                                        rqArray[this.v++] = new r9("java.lang.String");
                                        break block15;
                                    }
                                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                        throw _0.a(arrayIndexOutOfBoundsException);
                                    }
                                }
                                try {
                                    if (n3 != 3) break block16;
                                    rqArray[this.v++] = n;
                                    break block15;
                                }
                                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                    throw _0.a(arrayIndexOutOfBoundsException);
                                }
                            }
                            try {
                                if (n3 != 4) break block17;
                                rqArray[this.v++] = q;
                                break block15;
                            }
                            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                                throw _0.a(arrayIndexOutOfBoundsException);
                            }
                        }
                        try {
                            if (n3 != 5) break block18;
                            rqArray[this.v++] = Z;
                            rqArray[this.v++] = C;
                            break block15;
                        }
                        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                            throw _0.a(arrayIndexOutOfBoundsException);
                        }
                    }
                    try {
                        if (n3 != 6) break block19;
                        rqArray[this.v++] = w;
                        rqArray[this.v++] = C;
                        break block15;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw _0.a(arrayIndexOutOfBoundsException);
                    }
                }
                try {
                    if (n3 != 7) break block20;
                    rqArray[this.v++] = new r9("java.lang.Class");
                    break block15;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw _0.a(arrayIndexOutOfBoundsException);
                }
            }
            if (n3 == 17) {
                String string = this.N.D(n2);
                this.B(string);
            } else {
                throw new RuntimeException("bad LDC: " + n3);
            }
        }
    }

    private void e(rq rq2, int n2) {
        int n3;
        rq2.j(n2);
        try {
            for (n3 = 0; n3 < this.v; ++n3) {
                this.o[n3].j(n2);
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw _0.a(arrayIndexOutOfBoundsException);
        }
        try {
            for (n3 = 0; n3 < this.F.length; ++n3) {
                this.F[n3].j(n2);
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw _0.a(arrayIndexOutOfBoundsException);
        }
    }

    private void x(int n2, byte[] byArray, rq rq2) {
        int n3 = TF.M(byArray, n2 + 2);
        this.G(n3, rq2);
    }

    protected void G(int n2, byte[] byArray) throws a7 {
    }

    /*
     * Exception decompiling
     */
    private int a(int var1_1, byte[] var2_2, int var3_3) throws a7 {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 3[SWITCH]
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

    protected void q(int n2, byte[] byArray, int n3) throws a7 {
    }

    private int H(int n2, byte[] byArray, boolean bl2) throws a7 {
        int n3 = TF.M(byArray, n2 + 1);
        String string = this.N.W(n3);
        this.n(string, 1);
        if (bl2) {
            rq rq2;
            String string2;
            block9: {
                block8: {
                    string2 = this.N.M(n3);
                    rq2 = this.o[--this.v];
                    try {
                        try {
                            if (!(rq2 instanceof rY) || !rq2.p()) break block8;
                        }
                        catch (a7 a72) {
                            throw _0.a(a72);
                        }
                        this.e(rq2, ((rY)rq2).l());
                        break block9;
                    }
                    catch (a7 a73) {
                        throw _0.a(a73);
                    }
                }
                try {
                    if (rq2 instanceof r1) {
                        this.e(rq2, ((r1)rq2).F());
                    }
                }
                catch (a7 a74) {
                    throw _0.a(a74);
                }
            }
            rq2.e(string2, this.A);
        }
        this.B(string);
        return 3;
    }

    public _0(On on2, eq eq2, int n2, int n3, String string) {
        this.A = on2;
        this.N = eq2;
        this.J = string;
        this.v = 0;
        this.o = rq.i(n2);
        this.F = rq.i(n3);
    }

    /*
     * Exception decompiling
     */
    private void B(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 2[SWITCH]
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

    protected void r(int n2, byte[] byArray, int n3, int n4, int n5) throws a7 {
    }

    private void c(boolean bl2, int n2) throws a7 {
        if (bl2) {
            String string = this.N.g(n2);
            this.o[--this.v].e(string, this.A);
        }
    }

    /*
     * Exception decompiling
     */
    private int r(int var1_1, byte[] var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 2[SWITCH]
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

    private void N(int n2, byte[] byArray, rq rq2) {
        int n3 = TF.M(byArray, n2 + 2);
        this.U(n3, rq2);
    }

    private int C(int n2, byte[] byArray) {
        String string;
        int n3 = this.v - 1;
        switch (byArray[n2 + 1] & 0xFF) {
            case 4: {
                string = "[Z";
                break;
            }
            case 5: {
                string = "[C";
                break;
            }
            case 6: {
                string = "[F";
                break;
            }
            case 7: {
                string = "[D";
                break;
            }
            case 8: {
                string = "[B";
                break;
            }
            case 9: {
                string = "[S";
                break;
            }
            case 10: {
                string = "[I";
                break;
            }
            case 11: {
                string = "[J";
                break;
            }
            default: {
                throw new RuntimeException("bad newarray");
            }
        }
        this.o[n3] = new r9(string);
        return 2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    protected int k(int n2, byte[] byArray) throws a7 {
        int n3;
        try {
            n3 = byArray[n2] & 0xFF;
            if (n3 < 54) {
                return this.O(n2, byArray, n3);
            }
            try {
                if (n3 < 96) {
                    return this.a(n2, byArray, n3);
                }
            }
            catch (a7 a72) {
                throw _0.a(a72);
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new a7("inconsistent stack height " + arrayIndexOutOfBoundsException.getMessage(), (Throwable)arrayIndexOutOfBoundsException);
        }
        try {
            if (n3 < 148) {
                return this.r(n2, byArray, n3);
            }
        }
        catch (a7 a73) {
            throw _0.a(a73);
        }
        return this.p(n2, byArray, n3);
    }

    private int M(int n2, byte[] byArray, boolean bl2) throws a7 {
        int n3;
        block6: {
            char c10;
            String string;
            block5: {
                n3 = TF.M(byArray, n2 + 1);
                string = this.N.v(n3);
                this.v -= _s.q(string);
                c10 = string.charAt(0);
                try {
                    if (c10 != 'L') break block5;
                    this.o[this.v].e(_0.U(string, 0), this.A);
                    break block6;
                }
                catch (a7 a72) {
                    throw _0.a(a72);
                }
            }
            try {
                if (c10 == '[') {
                    this.o[this.v].e(string, this.A);
                }
            }
            catch (a7 a73) {
                throw _0.a(a73);
            }
        }
        this.c(bl2, n3);
        return 3;
    }

    private void W(int n2, int n3) {
        int n4;
        rq[] rqArray = this.o;
        int n5 = n4 - n3;
        try {
            for (n4 = this.v - 1; n4 > n5; --n4) {
                rqArray[n4 + n2] = rqArray[n4];
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw _0.a(arrayIndexOutOfBoundsException);
        }
    }

    protected void S(int n2, byte[] byArray) throws a7 {
    }

    protected void q(int n2, byte[] byArray) throws a7 {
    }

    private static String U(String string, int n2) {
        return string.substring(n2 + 1, string.length() - 1).replace('/', '.');
    }

    private int r(int n2) {
        --this.v;
        this.F[n2] = this.o[this.v];
        return 2;
    }

    /*
     * Exception decompiling
     */
    private int h(int var1_1, byte[] var2_2) throws a7 {
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

    private int G(int n2, rq rq2) {
        try {
            this.o[this.v++] = rq2;
            if (rq2.n()) {
                this.o[this.v++] = C;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw _0.a(arrayIndexOutOfBoundsException);
        }
        return 2;
    }

    private int U(int n2, rq rq2) {
        try {
            --this.v;
            this.F[n2] = rq2;
            if (rq2.n()) {
                --this.v;
                this.F[n2 + 1] = C;
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw _0.a(arrayIndexOutOfBoundsException);
        }
        return 2;
    }

    /*
     * Exception decompiling
     */
    private int p(int var1_1, byte[] var2_2, int var3_3) throws a7 {
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

    private int d(int n2, byte[] byArray, boolean bl2) throws a7 {
        int n3 = TF.M(byArray, n2 + 1);
        this.c(bl2, n3);
        String string = this.N.v(n3);
        this.B(string);
        return 3;
    }
}

