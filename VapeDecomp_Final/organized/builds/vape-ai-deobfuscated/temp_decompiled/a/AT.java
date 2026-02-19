/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Bp;
import a.O_;
import a._7;
import a._H;
import a._O;
import a.aD;
import a.e0;
import a.e2;
import a.e5;
import a.e7;
import a.eF;
import a.eH;
import a.eO;
import a.eP;
import a.eQ;
import a.eR;
import a.ee;
import a.eg;
import a.eh;
import a.em;
import a.et;
import a.eu;
import a.ez;
import a.zg;
import java.io.Serializable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class at
implements zg {
    private Bp j;
    private static final int[] r = new int[]{0, 0, 0, 0, 1, 6, 0, 0, 0, 1, 2, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 4, 0};

    private eh x(_7 _72, eh eh2) throws _H {
        block5: {
            try {
                try {
                    if (this.j.Q() == 400 && eh2.S() != 344) break block5;
                }
                catch (_H _H2) {
                    throw at.a(_H2);
                }
                throw new _O(this.j);
            }
            catch (_H _H3) {
                throw at.a(_H3);
            }
        }
        String string = this.j.i();
        e5 e52 = new e5(string);
        int n2 = this.D();
        eR eR2 = null;
        if (this.j.w() == 61) {
            this.j.Q();
            eR2 = this.r(_72);
        }
        eh eh3 = eh2.H(e52, n2, eR2);
        _72.s(string, eh3);
        return eh3;
    }

    private eO G(_7 _72) throws _H {
        eO eO2;
        int n2 = this.j.Q();
        _7 _73 = new _7(_72);
        try {
            if (this.j.Q() != 40) {
                throw new _O(this.j);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        if (this.j.w() == 59) {
            this.j.Q();
            eO2 = null;
        } else {
            eO2 = this.S(_73, true);
        }
        eR eR2 = this.j.w() == 59 ? null : this.I(_73);
        try {
            if (this.j.Q() != 59) {
                throw new _H("; is missing", this.j);
            }
        }
        catch (_H _H3) {
            throw at.a(_H3);
        }
        eO eO3 = this.j.w() == 41 ? null : this.s(_73);
        try {
            if (this.j.Q() != 41) {
                throw new _H(") is missing", this.j);
            }
        }
        catch (_H _H4) {
            throw at.a(_H4);
        }
        eO eO4 = this.t(_73);
        return new eO(n2, eO2, new eF(eR2, new eF(eO3, eO4)));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    private eR R(_7 var1_1) throws _H {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[SWITCH]
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

    private eO s(_7 _72) throws _H {
        eO eO2 = null;
        while (true) {
            eO eO3 = new eO(69, this.I(_72));
            eO2 = (eO)eF.W(eO2, new eO(66, (eR)eO3));
            try {
                if (this.j.w() != 44) break;
                this.j.Q();
            }
            catch (_H _H2) {
                throw at.a(_H2);
            }
        }
        return eO2;
    }

    private boolean u() {
        boolean bl2;
        block36: {
            block35: {
                int n2 = this.n(1);
                try {
                    if (n2 < 0) {
                        return false;
                    }
                }
                catch (O_ o_2) {
                    throw at.a(o_2);
                }
                int n3 = this.j.m(n2);
                try {
                    if (n3 != 41) {
                        return false;
                    }
                }
                catch (O_ o_3) {
                    throw at.a(o_3);
                }
                n3 = this.j.m(n2 + 1);
                try {
                    block34: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (n3 == 40 || n3 == 412) break block34;
                                                                        }
                                                                        catch (O_ o_4) {
                                                                            throw at.a(o_4);
                                                                        }
                                                                        if (n3 == 406) break block34;
                                                                    }
                                                                    catch (O_ o_5) {
                                                                        throw at.a(o_5);
                                                                    }
                                                                    if (n3 == 400) break block34;
                                                                }
                                                                catch (O_ o_6) {
                                                                    throw at.a(o_6);
                                                                }
                                                                if (n3 == 339) break block34;
                                                            }
                                                            catch (O_ o_7) {
                                                                throw at.a(o_7);
                                                            }
                                                            if (n3 == 336) break block34;
                                                        }
                                                        catch (O_ o_8) {
                                                            throw at.a(o_8);
                                                        }
                                                        if (n3 == 328) break block34;
                                                    }
                                                    catch (O_ o_9) {
                                                        throw at.a(o_9);
                                                    }
                                                    if (n3 == 410) break block34;
                                                }
                                                catch (O_ o_10) {
                                                    throw at.a(o_10);
                                                }
                                                if (n3 == 411) break block34;
                                            }
                                            catch (O_ o_11) {
                                                throw at.a(o_11);
                                            }
                                            if (n3 == 403) break block34;
                                        }
                                        catch (O_ o_12) {
                                            throw at.a(o_12);
                                        }
                                        if (n3 == 402) break block34;
                                    }
                                    catch (O_ o_13) {
                                        throw at.a(o_13);
                                    }
                                    if (n3 == 401) break block34;
                                }
                                catch (O_ o_14) {
                                    throw at.a(o_14);
                                }
                                if (n3 == 405) break block34;
                            }
                            catch (O_ o_15) {
                                throw at.a(o_15);
                            }
                            if (n3 != 404) break block35;
                        }
                        catch (O_ o_16) {
                            throw at.a(o_16);
                        }
                    }
                    bl2 = true;
                    break block36;
                }
                catch (O_ o_17) {
                    throw at.a(o_17);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private ee T(_7 _72) throws _H {
        try {
            this.j.Q();
            if (this.j.w() == 125) {
                this.j.Q();
                return new ee(null);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        eR eR2 = this.I(_72);
        ee ee2 = new ee(eR2);
        while (this.j.w() == 44) {
            this.j.Q();
            eR2 = this.I(_72);
            eF.c(ee2, eR2);
        }
        try {
            if (this.j.Q() != 125) {
                throw new _O(this.j);
            }
        }
        catch (_H _H3) {
            throw at.a(_H3);
        }
        return ee2;
    }

    private eO p(_7 _72) throws _H {
        int n2 = this.j.Q();
        eR eR2 = this.E(_72);
        eO eO2 = this.t(_72);
        return new eO(n2, eR2, eO2);
    }

    private eO S(_7 _72, boolean bl2) throws _H {
        block8: {
            int n2 = this.j.w();
            while (n2 == 315) {
                this.j.Q();
                n2 = this.j.w();
            }
            if (at.B(n2)) {
                n2 = this.j.Q();
                int n3 = this.D();
                return this.j(_72, new eh(n2, n3));
            }
            if (n2 == 400) {
                int n4 = this.n(0);
                try {
                    if (n4 < 0 || this.j.m(n4) != 400) break block8;
                }
                catch (_H _H2) {
                    throw at.a(_H2);
                }
                eF eF2 = this.q(_72);
                int n5 = this.D();
                return this.j(_72, new eh(eF2, n5));
            }
        }
        eO eO2 = bl2 ? this.s(_72) : new eO(69, this.I(_72));
        try {
            if (this.j.Q() != 59) {
                throw new _H("; is missing", this.j);
            }
        }
        catch (_H _H3) {
            throw at.a(_H3);
        }
        return eO2;
    }

    public eO t(_7 _72) throws _H {
        int n2;
        block41: {
            n2 = this.j.w();
            try {
                if (n2 == 123) {
                    return this.E(_72);
                }
            }
            catch (_H _H2) {
                throw at.a(_H2);
            }
            try {
                if (n2 == 59) {
                    this.j.Q();
                    return new eO(66);
                }
            }
            catch (_H _H3) {
                throw at.a(_H3);
            }
            try {
                if (n2 != 400 || this.j.m(1) != 58) break block41;
            }
            catch (_H _H4) {
                throw at.a(_H4);
            }
            this.j.Q();
            String string = this.j.i();
            this.j.Q();
            return eO.l(76, new e5(string), this.t(_72));
        }
        try {
            if (n2 == 320) {
                return this.P(_72);
            }
        }
        catch (_H _H5) {
            throw at.a(_H5);
        }
        try {
            if (n2 == 346) {
                return this.p(_72);
            }
        }
        catch (_H _H6) {
            throw at.a(_H6);
        }
        try {
            if (n2 == 311) {
                return this.Q(_72);
            }
        }
        catch (_H _H7) {
            throw at.a(_H7);
        }
        try {
            if (n2 == 318) {
                return this.G(_72);
            }
        }
        catch (_H _H8) {
            throw at.a(_H8);
        }
        try {
            if (n2 == 343) {
                return this.n(_72);
            }
        }
        catch (_H _H9) {
            throw at.a(_H9);
        }
        try {
            if (n2 == 337) {
                return this.J(_72);
            }
        }
        catch (_H _H10) {
            throw at.a(_H10);
        }
        try {
            if (n2 == 338) {
                return this.F(_72);
            }
        }
        catch (_H _H11) {
            throw at.a(_H11);
        }
        try {
            if (n2 == 333) {
                return this.B(_72);
            }
        }
        catch (_H _H12) {
            throw at.a(_H12);
        }
        try {
            if (n2 == 340) {
                return this.r(_72);
            }
        }
        catch (_H _H13) {
            throw at.a(_H13);
        }
        try {
            if (n2 == 302) {
                return this.l(_72);
            }
        }
        catch (_H _H14) {
            throw at.a(_H14);
        }
        try {
            if (n2 == 309) {
                return this.Y(_72);
            }
        }
        catch (_H _H15) {
            throw at.a(_H15);
        }
        return this.S(_72, false);
    }

    private eO g(_7 _72) throws _H {
        eO eO2;
        _7 _73;
        block13: {
            try {
                if (this.j.Q() != 123) {
                    throw new _O(this.j);
                }
            }
            catch (_H _H2) {
                throw at.a(_H2);
            }
            _73 = new _7(_72);
            eO2 = this.y(_73);
            try {
                if (eO2 == null) {
                    throw new _H("empty switch block", this.j);
                }
            }
            catch (_H _H3) {
                throw at.a(_H3);
            }
            int n2 = eO2.x();
            try {
                try {
                    if (n2 == 304 || n2 == 310) break block13;
                }
                catch (_H _H4) {
                    throw at.a(_H4);
                }
                throw new _H("no case or default in a switch block", this.j);
            }
            catch (_H _H5) {
                throw at.a(_H5);
            }
        }
        eO eO3 = new eO(66, (eR)eO2);
        while (this.j.w() != 125) {
            eO eO4;
            block14: {
                eO4 = this.y(_73);
                if (eO4 == null) continue;
                int n3 = eO4.x();
                try {
                    if (n3 != 304 && n3 != 310) break block14;
                }
                catch (_H _H6) {
                    throw at.a(_H6);
                }
                eO3 = (eO)eF.W(eO3, new eO(66, (eR)eO4));
                eO2 = eO4;
                continue;
            }
            eO2 = (eO)eF.W(eO2, new eO(66, (eR)eO4));
        }
        this.j.Q();
        return eO3;
    }

    private eO Q(_7 _72) throws _H {
        eR eR2;
        eO eO2;
        int n2;
        block9: {
            block8: {
                n2 = this.j.Q();
                eO2 = this.t(_72);
                try {
                    try {
                        if (this.j.Q() == 346 && this.j.Q() == 40) break block8;
                    }
                    catch (_H _H2) {
                        throw at.a(_H2);
                    }
                    throw new _O(this.j);
                }
                catch (_H _H3) {
                    throw at.a(_H3);
                }
            }
            eR2 = this.I(_72);
            try {
                try {
                    if (this.j.Q() == 41 && this.j.Q() == 59) break block9;
                }
                catch (_H _H4) {
                    throw at.a(_H4);
                }
                throw new _O(this.j);
            }
            catch (_H _H5) {
                throw at.a(_H5);
            }
        }
        return new eO(n2, eR2, eO2);
    }

    private eR V(_7 _72) throws _H {
        eR eR2 = this.S(_72);
        if (this.j.w() == 63) {
            this.j.Q();
            eR eR3 = this.I(_72);
            try {
                if (this.j.Q() != 58) {
                    throw new _H(": is missing", this.j);
                }
            }
            catch (_H _H2) {
                throw at.a(_H2);
            }
            eR eR4 = this.I(_72);
            return new eQ(eR2, eR3, eR4);
        }
        return eR2;
    }

    public at(Bp bp2) {
        this.j = bp2;
    }

    private eO l(_7 _72) throws _H {
        return this.Y(_72);
    }

    private eR K(_7 _72, eR eR2) throws _H {
        block12: {
            block13: {
                if (eR2 instanceof e7) {
                    int n2 = ((e7)eR2).X();
                    try {
                        try {
                            if (n2 == 339 || n2 == 336) break block12;
                        }
                        catch (_H _H2) {
                            throw at.a(_H2);
                        }
                        throw new _O(this.j);
                    }
                    catch (_H _H3) {
                        throw at.a(_H3);
                    }
                }
                try {
                    if (!(eR2 instanceof e5)) break block13;
                    break block12;
                }
                catch (_H _H4) {
                    throw at.a(_H4);
                }
            }
            if (eR2 instanceof em) {
                int n3 = ((em)eR2).I();
                try {
                    try {
                        if (n3 == 46 || n3 == 35) break block12;
                    }
                    catch (_H _H5) {
                        throw at.a(_H5);
                    }
                    throw new _O(this.j);
                }
                catch (_H _H6) {
                    throw at.a(_H6);
                }
            }
        }
        return eH.e(eR2, this.g(_72));
    }

    /*
     * Exception decompiling
     */
    private eO j(_7 var1_1, eh var2_2) throws _H {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[DOLOOP]], but top level block is 1[TRYBLOCK]
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

    private eR L(_7 _72) throws _H {
        block11: {
            int n2;
            block10: {
                n2 = this.j.m(1);
                try {
                    if (!at.B(n2) || !this.r()) break block10;
                }
                catch (_H _H2) {
                    throw at.a(_H2);
                }
                this.j.Q();
                this.j.Q();
                int n3 = this.D();
                try {
                    if (this.j.Q() != 41) {
                        throw new _H(") is missing", this.j);
                    }
                }
                catch (_H _H3) {
                    throw at.a(_H3);
                }
                return new e2(n2, n3, this.j(_72));
            }
            try {
                if (n2 != 400 || !this.u()) break block11;
            }
            catch (_H _H4) {
                throw at.a(_H4);
            }
            this.j.Q();
            eF eF2 = this.q(_72);
            int n4 = this.D();
            try {
                if (this.j.Q() != 41) {
                    throw new _H(") is missing", this.j);
                }
            }
            catch (_H _H5) {
                throw at.a(_H5);
            }
            return new e2(eF2, n4, this.j(_72));
        }
        return this.t(_72);
    }

    private eO F(_7 _72) throws _H {
        int n2 = this.j.Q();
        try {
            if (this.j.Q() != 40) {
                throw new _O(this.j);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        eR eR2 = this.I(_72);
        try {
            if (this.j.Q() != 41) {
                throw new _O(this.j);
            }
        }
        catch (_H _H3) {
            throw at.a(_H3);
        }
        eR eR3 = this.E(_72);
        return new eO(n2, eR2, (eF)eR3);
    }

    private static boolean Q(int n2) {
        boolean bl2;
        block26: {
            block25: {
                try {
                    block24: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n2 == 61 || n2 == 351) break block24;
                                                                }
                                                                catch (O_ o_2) {
                                                                    throw at.a(o_2);
                                                                }
                                                                if (n2 == 352) break block24;
                                                            }
                                                            catch (O_ o_3) {
                                                                throw at.a(o_3);
                                                            }
                                                            if (n2 == 353) break block24;
                                                        }
                                                        catch (O_ o_4) {
                                                            throw at.a(o_4);
                                                        }
                                                        if (n2 == 354) break block24;
                                                    }
                                                    catch (O_ o_5) {
                                                        throw at.a(o_5);
                                                    }
                                                    if (n2 == 355) break block24;
                                                }
                                                catch (O_ o_6) {
                                                    throw at.a(o_6);
                                                }
                                                if (n2 == 356) break block24;
                                            }
                                            catch (O_ o_7) {
                                                throw at.a(o_7);
                                            }
                                            if (n2 == 360) break block24;
                                        }
                                        catch (O_ o_8) {
                                            throw at.a(o_8);
                                        }
                                        if (n2 == 361) break block24;
                                    }
                                    catch (O_ o_9) {
                                        throw at.a(o_9);
                                    }
                                    if (n2 == 365) break block24;
                                }
                                catch (O_ o_10) {
                                    throw at.a(o_10);
                                }
                                if (n2 == 367) break block24;
                            }
                            catch (O_ o_11) {
                                throw at.a(o_11);
                            }
                            if (n2 != 371) break block25;
                        }
                        catch (O_ o_12) {
                            throw at.a(o_12);
                        }
                    }
                    bl2 = true;
                    break block26;
                }
                catch (O_ o_13) {
                    throw at.a(o_13);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private static boolean B(int n2) {
        boolean bl2;
        block18: {
            block17: {
                try {
                    block16: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n2 == 301 || n2 == 303) break block16;
                                                }
                                                catch (O_ o_2) {
                                                    throw at.a(o_2);
                                                }
                                                if (n2 == 306) break block16;
                                            }
                                            catch (O_ o_3) {
                                                throw at.a(o_3);
                                            }
                                            if (n2 == 334) break block16;
                                        }
                                        catch (O_ o_4) {
                                            throw at.a(o_4);
                                        }
                                        if (n2 == 324) break block16;
                                    }
                                    catch (O_ o_5) {
                                        throw at.a(o_5);
                                    }
                                    if (n2 == 326) break block16;
                                }
                                catch (O_ o_6) {
                                    throw at.a(o_6);
                                }
                                if (n2 == 317) break block16;
                            }
                            catch (O_ o_7) {
                                throw at.a(o_7);
                            }
                            if (n2 != 312) break block17;
                        }
                        catch (O_ o_8) {
                            throw at.a(o_8);
                        }
                    }
                    bl2 = true;
                    break block18;
                }
                catch (O_ o_9) {
                    throw at.a(o_9);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    private eu L(_7 _72) throws _H {
        ee ee2 = null;
        int n2 = this.j.w();
        if (at.B(n2)) {
            this.j.Q();
            eF eF2 = this.I(_72);
            if (this.j.w() == 123) {
                ee2 = this.T(_72);
            }
            return new eu(n2, eF2, ee2);
        }
        if (n2 == 400) {
            eF eF3 = this.q(_72);
            n2 = this.j.w();
            if (n2 == 40) {
                eF eF4 = this.g(_72);
                return new eu(eF3, eF4);
            }
            if (n2 == 91) {
                eF eF5 = this.I(_72);
                if (this.j.w() == 123) {
                    ee2 = this.T(_72);
                }
                return eu.l(eF3, eF5, ee2);
            }
        }
        throw new _O(this.j);
    }

    private int n(int n2) {
        int n3;
        while (this.j.m(++n2) == 46) {
            if (this.j.m(++n2) == 400) continue;
            return -1;
        }
        while ((n3 = this.j.m(n2++)) == 91) {
            if (this.j.m(n2++) == 93) continue;
            return -1;
        }
        return n2 - 1;
    }

    public boolean e() {
        boolean bl2;
        try {
            bl2 = this.j.w() >= 0;
        }
        catch (O_ o_2) {
            throw at.a(o_2);
        }
        return bl2;
    }

    private eF I(_7 _72) throws _H {
        eF eF2 = null;
        while (this.j.w() == 91) {
            eF2 = eF.c(eF2, this.O(_72));
        }
        return eF2;
    }

    private eO Y(_7 _72) throws _H {
        int n2 = this.j.Q();
        eO eO2 = new eO(n2);
        int n3 = this.j.Q();
        if (n3 == 400) {
            eO2.M(new e5(this.j.i()));
            n3 = this.j.Q();
        }
        try {
            if (n3 != 59) {
                throw new _H("; is missing", this.j);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        return eO2;
    }

    private eO n(_7 _72) throws _H {
        Serializable serializable;
        this.j.Q();
        eR eR2 = this.E(_72);
        eF eF2 = null;
        while (true) {
            eh eh2;
            block14: {
                block13: {
                    try {
                        try {
                            if (this.j.w() != 305) break;
                            this.j.Q();
                            if (this.j.Q() == 40) break block13;
                        }
                        catch (_H _H2) {
                            throw at.a(_H2);
                        }
                        throw new _O(this.j);
                    }
                    catch (_H _H3) {
                        throw at.a(_H3);
                    }
                }
                serializable = new _7(_72);
                eh2 = this.U((_7)serializable);
                try {
                    try {
                        if (eh2.N() <= 0 && eh2.S() == 307) break block14;
                    }
                    catch (_H _H4) {
                        throw at.a(_H4);
                    }
                    throw new _O(this.j);
                }
                catch (_H _H5) {
                    throw at.a(_H5);
                }
            }
            try {
                if (this.j.Q() != 41) {
                    throw new _O(this.j);
                }
            }
            catch (_H _H6) {
                throw at.a(_H6);
            }
            eR eR3 = this.E((_7)serializable);
            eF2 = eF.c(eF2, new ez(eh2, eR3));
        }
        serializable = null;
        if (this.j.w() == 316) {
            this.j.Q();
            serializable = this.E(_72);
        }
        return eO.q(343, eR2, eF2, serializable);
    }

    private eh a(_7 _72) throws _H {
        block2: {
            int n2 = this.j.w();
            try {
                if (!at.B(n2) && n2 != 344) break block2;
            }
            catch (_H _H2) {
                throw at.a(_H2);
            }
            this.j.Q();
            int n3 = this.D();
            return new eh(n2, n3);
        }
        eF eF2 = this.q(_72);
        int n4 = this.D();
        return new eh(eF2, n4);
    }

    private String K(eR eR2) throws _H {
        StringBuilder stringBuilder = new StringBuilder();
        this.R(eR2, stringBuilder);
        return stringBuilder.toString();
    }

    private eF q(_7 _72) throws _H {
        eF eF2 = null;
        while (true) {
            try {
                if (this.j.Q() != 400) {
                    throw new _O(this.j);
                }
            }
            catch (_H _H2) {
                throw at.a(_H2);
            }
            eF2 = eF.c(eF2, new e5(this.j.i()));
            try {
                if (this.j.w() != 46) break;
                this.j.Q();
            }
            catch (_H _H3) {
                throw at.a(_H3);
            }
        }
        return eF2;
    }

    private eO r(_7 _72) throws _H {
        int n2 = this.j.Q();
        eR eR2 = this.I(_72);
        try {
            if (this.j.Q() != 59) {
                throw new _H("; is missing", this.j);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        return new eO(n2, eR2);
    }

    private eR A(_7 _72, eR eR2, int n2) throws _H {
        int n3 = this.j.Q();
        try {
            if (n3 == 323) {
                return this.d(_72, eR2);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        eR eR3 = this.j(_72);
        while (true) {
            int n4 = this.j.w();
            int n5 = this.e(n4);
            try {
                if (n5 == 0 || n2 <= n5) break;
            }
            catch (_H _H3) {
                throw at.a(_H3);
            }
            eR3 = this.A(_72, eR3, n5);
        }
        return eg.y(n3, eR2, eR3);
    }

    private void R(eR eR2, StringBuilder stringBuilder) throws _H {
        try {
            if (eR2 instanceof e5) {
                stringBuilder.append(((e5)eR2).e());
                return;
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        if (eR2 instanceof em) {
            em em2 = (em)eR2;
            try {
                if (em2.I() == 46) {
                    this.R(em2.R(), stringBuilder);
                    stringBuilder.append('.');
                    this.R(em2.V(), stringBuilder);
                    return;
                }
            }
            catch (_H _H3) {
                throw at.a(_H3);
            }
        }
        throw new _H("bad static member access", this.j);
    }

    /*
     * Exception decompiling
     */
    private eR t(_7 var1_1) throws _H {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
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

    private eR d(_7 _72, eR eR2) throws _H {
        int n2 = this.j.w();
        if (at.B(n2)) {
            this.j.Q();
            int n3 = this.D();
            return new et(n2, n3, eR2);
        }
        eF eF2 = this.q(_72);
        int n4 = this.D();
        return new et(eF2, n4, eR2);
    }

    private eF g(_7 _72) throws _H {
        try {
            if (this.j.Q() != 40) {
                throw new _H("( is missing", this.j);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        eF eF2 = null;
        if (this.j.w() != 41) {
            while (true) {
                eF2 = eF.c(eF2, this.I(_72));
                try {
                    if (this.j.w() != 44) break;
                    this.j.Q();
                }
                catch (_H _H3) {
                    throw at.a(_H3);
                }
            }
        }
        try {
            if (this.j.Q() != 41) {
                throw new _H(") is missing", this.j);
            }
        }
        catch (_H _H4) {
            throw at.a(_H4);
        }
        return eF2;
    }

    private int D() throws _H {
        int n2 = 0;
        while (this.j.w() == 91) {
            ++n2;
            this.j.Q();
            if (this.j.Q() == 93) continue;
            throw new _H("] is missing", this.j);
        }
        return n2;
    }

    private eR r(_7 _72) throws _H {
        try {
            if (this.j.w() == 123) {
                return this.T(_72);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        return this.I(_72);
    }

    private eR O(_7 _72) throws _H {
        try {
            this.j.Q();
            if (this.j.w() == 93) {
                this.j.Q();
                return null;
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        eR eR2 = this.I(_72);
        try {
            if (this.j.Q() != 93) {
                throw new _H("] is missing", this.j);
            }
        }
        catch (_H _H3) {
            throw at.a(_H3);
        }
        return eR2;
    }

    private eR S(_7 _72) throws _H {
        eR eR2 = this.j(_72);
        while (true) {
            int n2 = this.j.w();
            int n3 = this.e(n2);
            try {
                if (n3 == 0) {
                    return eR2;
                }
            }
            catch (_H _H2) {
                throw at.a(_H2);
            }
            eR2 = this.A(_72, eR2, n3);
        }
    }

    private eR E(_7 _72) throws _H {
        try {
            if (this.j.Q() != 40) {
                throw new _O(this.j);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        eR eR2 = this.I(_72);
        try {
            if (this.j.Q() != 41) {
                throw new _O(this.j);
            }
        }
        catch (_H _H3) {
            throw at.a(_H3);
        }
        return eR2;
    }

    private eh U(_7 _72) throws _H {
        eh eh2 = this.a(_72);
        try {
            if (this.j.Q() != 400) {
                throw new _O(this.j);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        String string = this.j.i();
        eh2.L(new e5(string));
        eh2.L(this.D());
        _72.s(string, eh2);
        return eh2;
    }

    private eR y(eR eR2, int n2) throws _H {
        String string = this.K(eR2);
        if (n2 > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            try {
                while (n2-- > 0) {
                    stringBuilder.append('[');
                }
            }
            catch (_H _H2) {
                throw at.a(_H2);
            }
            stringBuilder.append('L').append(string.replace('.', '/')).append(';');
            string = stringBuilder.toString();
        }
        return em.n(46, new e5(string), new eP("class"));
    }

    /*
     * Exception decompiling
     */
    private eR j(_7 var1_1) throws _H {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[SWITCH]
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

    public eR I(_7 _72) throws _H {
        eR eR2 = this.V(_72);
        try {
            if (!at.Q(this.j.w())) {
                return eR2;
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        int n2 = this.j.Q();
        eR eR3 = this.I(_72);
        return e0.O(n2, eR2, eR3);
    }

    private eO J(_7 _72) throws _H {
        int n2 = this.j.Q();
        eR eR2 = this.E(_72);
        eO eO2 = this.g(_72);
        return new eO(n2, eR2, eO2);
    }

    private eO P(_7 _72) throws _H {
        eO eO2;
        int n2 = this.j.Q();
        eR eR2 = this.E(_72);
        eO eO3 = this.t(_72);
        if (this.j.w() == 313) {
            this.j.Q();
            eO2 = this.t(_72);
        } else {
            eO2 = null;
        }
        return new eO(n2, eR2, new eF(eO3, new eF(eO2)));
    }

    private int e(int n2) {
        block37: {
            block35: {
                block33: {
                    block32: {
                        try {
                            try {
                                if (33 > n2 || n2 > 63) break block32;
                            }
                            catch (O_ o_2) {
                                throw at.a(o_2);
                            }
                            return r[n2 - 33];
                        }
                        catch (O_ o_3) {
                            throw at.a(o_3);
                        }
                    }
                    try {
                        if (n2 == 94) {
                            return 7;
                        }
                    }
                    catch (O_ o_4) {
                        throw at.a(o_4);
                    }
                    try {
                        if (n2 == 124) {
                            return 8;
                        }
                    }
                    catch (O_ o_5) {
                        throw at.a(o_5);
                    }
                    try {
                        if (n2 == 369) {
                            return 9;
                        }
                    }
                    catch (O_ o_6) {
                        throw at.a(o_6);
                    }
                    try {
                        if (n2 == 368) {
                            return 10;
                        }
                    }
                    catch (O_ o_7) {
                        throw at.a(o_7);
                    }
                    try {
                        try {
                            if (n2 != 358 && n2 != 350) break block33;
                        }
                        catch (O_ o_8) {
                            throw at.a(o_8);
                        }
                        return 5;
                    }
                    catch (O_ o_9) {
                        throw at.a(o_9);
                    }
                }
                try {
                    block34: {
                        try {
                            try {
                                if (n2 == 357 || n2 == 359) break block34;
                            }
                            catch (O_ o_10) {
                                throw at.a(o_10);
                            }
                            if (n2 != 323) break block35;
                        }
                        catch (O_ o_11) {
                            throw at.a(o_11);
                        }
                    }
                    return 4;
                }
                catch (O_ o_12) {
                    throw at.a(o_12);
                }
            }
            try {
                block36: {
                    try {
                        try {
                            if (n2 == 364 || n2 == 366) break block36;
                        }
                        catch (O_ o_13) {
                            throw at.a(o_13);
                        }
                        if (n2 != 370) break block37;
                    }
                    catch (O_ o_14) {
                        throw at.a(o_14);
                    }
                }
                return 3;
            }
            catch (O_ o_15) {
                throw at.a(o_15);
            }
        }
        return 0;
    }

    private boolean r() {
        boolean bl2;
        int n2;
        int n3 = 2;
        while ((n2 = this.j.m(n3++)) == 91) {
            if (this.j.m(n3++) == 93) continue;
            return false;
        }
        try {
            bl2 = this.j.m(n3 - 1) == 41;
        }
        catch (O_ o_2) {
            throw at.a(o_2);
        }
        return bl2;
    }

    private eO B(_7 _72) throws _H {
        int n2 = this.j.Q();
        eO eO2 = new eO(n2);
        try {
            if (this.j.w() != 59) {
                eO2.M(this.I(_72));
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        try {
            if (this.j.Q() != 59) {
                throw new _H("; is missing", this.j);
            }
        }
        catch (_H _H3) {
            throw at.a(_H3);
        }
        return eO2;
    }

    private eR R(int n2, int n3) throws _H {
        String string;
        if (n3 > 0) {
            String string2 = aD.G(n2, n3);
            return em.n(46, new e5(string2), new eP("class"));
        }
        switch (n2) {
            case 301: {
                string = "java.lang.Boolean";
                break;
            }
            case 303: {
                string = "java.lang.Byte";
                break;
            }
            case 306: {
                string = "java.lang.Character";
                break;
            }
            case 334: {
                string = "java.lang.Short";
                break;
            }
            case 324: {
                string = "java.lang.Integer";
                break;
            }
            case 326: {
                string = "java.lang.Long";
                break;
            }
            case 317: {
                string = "java.lang.Float";
                break;
            }
            case 312: {
                string = "java.lang.Double";
                break;
            }
            case 344: {
                string = "java.lang.Void";
                break;
            }
            default: {
                throw new _H("invalid builtin type: " + n2);
            }
        }
        return em.n(35, new e5(string), new eP("TYPE"));
    }

    private eO y(_7 _72) throws _H {
        int n2;
        block7: {
            n2 = this.j.w();
            try {
                try {
                    if (n2 == 304 || n2 == 310) break block7;
                }
                catch (_H _H2) {
                    throw at.a(_H2);
                }
                return this.t(_72);
            }
            catch (_H _H3) {
                throw at.a(_H3);
            }
        }
        this.j.Q();
        eO eO2 = n2 == 304 ? new eO(n2, this.I(_72)) : new eO(310);
        try {
            if (this.j.Q() != 58) {
                throw new _H(": is missing", this.j);
            }
        }
        catch (_H _H4) {
            throw at.a(_H4);
        }
        return eO2;
    }

    private eO E(_7 _72) throws _H {
        try {
            if (this.j.Q() != 123) {
                throw new _O(this.j);
            }
        }
        catch (_H _H2) {
            throw at.a(_H2);
        }
        eO eO2 = null;
        _7 _73 = new _7(_72);
        while (this.j.w() != 125) {
            eO eO3 = this.t(_73);
            if (eO3 == null) continue;
            eO2 = (eO)eF.W(eO2, new eO(66, (eR)eO3));
        }
        try {
            this.j.Q();
            if (eO2 == null) {
                return new eO(66);
            }
        }
        catch (_H _H3) {
            throw at.a(_H3);
        }
        return eO2;
    }
}

