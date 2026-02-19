/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GM;
import a.IR;
import a.On;
import a.WJ;
import a.WW;
import a.Yp;
import a._H;
import a._s;
import a.c4;
import a.eq;
import a.sb;
import a.sw;
import a.z;
import java.util.HashMap;
import java.util.Map;

public class Nw {
    private int f;
    private GM i;
    private Map<String, Object> u;

    public String q(String string, String string2, String string3, c4 c42) throws _H {
        String string4 = string + ":" + string2;
        String string5 = (String)this.u.get(string4);
        try {
            if (string5 != null) {
                return string5;
            }
        }
        catch (WW wW2) {
            throw Nw.a(wW2);
        }
        z z10 = this.i.Q();
        string5 = this.G(z10);
        try {
            IR iR2;
            c4 c43;
            On on2;
            block13: {
                block12: {
                    eq eq2 = z10.X();
                    on2 = this.i.K();
                    c43 = new c4(eq2, string5, string3);
                    c43.D(8);
                    c43.l(new sw(eq2));
                    sb sb2 = c42.I();
                    try {
                        if (sb2 != null) {
                            c43.l(sb2.O(eq2, null));
                        }
                    }
                    catch (WW wW3) {
                        throw Nw.a(wW3);
                    }
                    GM[] gMArray = _s.Z(string3, on2);
                    int n2 = 0;
                    iR2 = new IR(eq2);
                    for (int i10 = 0; i10 < gMArray.length; ++i10) {
                        n2 += iR2.y(n2, gMArray[i10]);
                    }
                    try {
                        iR2.e(n2);
                        if (string2 != string3) break block12;
                        iR2.I(this.i, string, string2);
                        break block13;
                    }
                    catch (WW wW4) {
                        throw Nw.a(wW4);
                    }
                }
                iR2.L(this.i, string, string2);
            }
            iR2.T(_s.X(string2, on2));
            c43.u(iR2.u());
            z10.b(c43);
        }
        catch (WW wW5) {
            throw new _H(wW5);
        }
        catch (WJ wJ2) {
            throw new _H(wJ2);
        }
        this.u.put(string4, string5);
        return string5;
    }

    public Nw(GM gM) {
        this.i = gM;
        this.f = 1;
        this.u = new HashMap<String, Object>();
    }

    public c4 t(Yp yp2, boolean bl2) throws _H {
        String string = yp2.Q();
        String string2 = string + ":getter";
        Object object = this.u.get(string2);
        try {
            if (object != null) {
                return (c4)object;
            }
        }
        catch (WW wW2) {
            throw Nw.a(wW2);
        }
        z z10 = this.i.Q();
        String string3 = this.G(z10);
        try {
            IR iR2;
            c4 c42;
            String string4;
            On on2;
            block9: {
                block8: {
                    eq eq2 = z10.X();
                    on2 = this.i.K();
                    string4 = yp2.S();
                    String string5 = bl2 ? "()" + string4 : "(" + _s.H(this.i) + ")" + string4;
                    c42 = new c4(eq2, string3, string5);
                    c42.D(8);
                    c42.l(new sw(eq2));
                    iR2 = new IR(eq2);
                    try {
                        if (!bl2) break block8;
                        iR2.J(IR.f, string, string4);
                        break block9;
                    }
                    catch (WW wW3) {
                        throw Nw.a(wW3);
                    }
                }
                iR2.B(0);
                iR2.R(IR.f, string, string4);
                iR2.e(1);
            }
            iR2.T(_s.f(string4, on2));
            c42.u(iR2.u());
            z10.b(c42);
            this.u.put(string2, c42);
            return c42;
        }
        catch (WW wW4) {
            throw new _H(wW4);
        }
        catch (WJ wJ2) {
            throw new _H(wJ2);
        }
    }

    public String v(GM gM, String string, c4 c42) throws _H {
        String string2 = "<init>:" + string;
        String string3 = (String)this.u.get(string2);
        try {
            if (string3 != null) {
                return string3;
            }
        }
        catch (WW wW2) {
            throw Nw.a(wW2);
        }
        string3 = _s.w("javassist.runtime.Inner", string);
        z z10 = this.i.Q();
        try {
            eq eq2 = z10.X();
            On on2 = this.i.K();
            c4 c43 = new c4(eq2, "<init>", string3);
            c43.D(0);
            c43.l(new sw(eq2));
            sb sb2 = c42.I();
            try {
                if (sb2 != null) {
                    c43.l(sb2.O(eq2, null));
                }
            }
            catch (WW wW3) {
                throw Nw.a(wW3);
            }
            GM[] gMArray = _s.Z(string, on2);
            IR iR2 = new IR(eq2);
            iR2.B(0);
            int n2 = 1;
            for (int i10 = 0; i10 < gMArray.length; ++i10) {
                n2 += iR2.y(n2, gMArray[i10]);
            }
            iR2.e(n2 + 1);
            iR2.s(this.i, "<init>", string);
            iR2.T(null);
            c43.u(iR2.u());
            z10.b(c43);
        }
        catch (WW wW4) {
            throw new _H(wW4);
        }
        catch (WJ wJ2) {
            throw new _H(wJ2);
        }
        this.u.put(string2, string3);
        return string3;
    }

    public c4 d(Yp yp2, boolean bl2) throws _H {
        String string = yp2.Q();
        String string2 = string + ":setter";
        Object object = this.u.get(string2);
        try {
            if (object != null) {
                return (c4)object;
            }
        }
        catch (WW wW2) {
            throw Nw.a(wW2);
        }
        z z10 = this.i.Q();
        String string3 = this.G(z10);
        try {
            int n2;
            eq eq2 = z10.X();
            On on2 = this.i.K();
            String string4 = yp2.S();
            String string5 = bl2 ? "(" + string4 + ")V" : "(" + _s.H(this.i) + string4 + ")V";
            c4 c42 = new c4(eq2, string3, string5);
            c42.D(8);
            c42.l(new sw(eq2));
            IR iR2 = new IR(eq2);
            if (bl2) {
                n2 = iR2.y(0, _s.f(string4, on2));
                iR2.W(IR.f, string, string4);
            } else {
                iR2.B(0);
                n2 = iR2.y(1, _s.f(string4, on2)) + 1;
                iR2.k(IR.f, string, string4);
            }
            iR2.T(null);
            iR2.e(n2);
            c42.u(iR2.u());
            z10.b(c42);
            this.u.put(string2, c42);
            return c42;
        }
        catch (WW wW3) {
            throw new _H(wW3);
        }
        catch (WJ wJ2) {
            throw new _H(wJ2);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    private String G(z var1_1) {
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
}

