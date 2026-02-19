/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Fq;
import a.G1;
import a.G6;
import a.GE;
import a.GJ;
import a.GU;
import a.TF;
import a.a7;
import a.eq;
import a.lN;
import a.s5;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class s6
extends s5 {
    public static GE K(String string) throws a7 {
        try {
            return s6.U(string, new Fq(null));
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw s6.S(string);
        }
    }

    s6(eq eq2, int n2, DataInputStream dataInputStream) throws IOException {
        super(eq2, n2, dataInputStream);
    }

    private static GU A(String string, Fq fq2) throws a7 {
        int n2 = 1;
        try {
            while (string.charAt(++fq2.R) == '[') {
                ++n2;
            }
        }
        catch (a7 a72) {
            throw s6.a(a72);
        }
        return new GJ(n2, s6.U(string, fq2));
    }

    static a7 B(String string) {
        return s6.S(string);
    }

    private static boolean lambda$makeNewClassName$0(int n2) {
        boolean bl2;
        try {
            bl2 = n2 == 36;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw s6.a(indexOutOfBoundsException);
        }
        return bl2;
    }

    private static lN[] r(String string, Fq fq2) throws a7 {
        ArrayList<lN> arrayList = new ArrayList<lN>();
        while (true) {
            lN lN2;
            block7: {
                char c10;
                block6: {
                    block5: {
                        c10 = string.charAt(fq2.R++);
                        try {
                            if (c10 == '>') break;
                            if (c10 != '*') break block5;
                        }
                        catch (a7 a72) {
                            throw s6.a(a72);
                        }
                        lN2 = new lN(null, '*');
                        break block7;
                    }
                    try {
                        if (c10 == '+' || c10 == '-') break block6;
                    }
                    catch (a7 a73) {
                        throw s6.a(a73);
                    }
                    c10 = ' ';
                    --fq2.R;
                }
                lN2 = new lN(s6.q(string, fq2, false), c10);
            }
            arrayList.add(lN2);
        }
        return arrayList.toArray(new lN[arrayList.size()]);
    }

    private static a7 S(String string) {
        return new a7("bad signature: " + string);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    private static GU q(String var0, Fq var1_1, boolean var2_2) throws a7 {
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

    public String Z() {
        return this.K().Z(TF.M(this.p(), 0));
    }

    private static GE U(String string, Fq fq2) throws a7 {
        GE gE = s6.q(string, fq2, true);
        if (gE == null) {
            gE = new G1(string.charAt(fq2.R++));
        }
        return gE;
    }

    @Override
    public s5 O(eq eq2, Map<String, String> map) {
        return new s6(eq2, this.Z());
    }

    public s6(eq eq2, String string) {
        super(eq2, "Signature");
        int n2 = eq2.D(string);
        byte[] byArray = new byte[]{(byte)(n2 >>> 8), (byte)n2};
        this.p(byArray);
    }

    private static G6 X(String string, Fq fq2, G6 g6) throws a7 {
        G6 g62;
        block9: {
            lN[] lNArray;
            char c10;
            int n2 = ++fq2.R;
            while ((c10 = string.charAt(fq2.R++)) != '$') {
                try {
                    if (c10 != '<' && c10 != ';') continue;
                    break;
                }
                catch (a7 a72) {
                    throw s6.a(a72);
                }
            }
            int n3 = fq2.R - 1;
            if (c10 == '<') {
                lNArray = s6.r(string, fq2);
                c10 = string.charAt(fq2.R++);
            } else {
                lNArray = null;
            }
            g62 = G6.z(string, n2, n3, lNArray, g6);
            try {
                try {
                    if (c10 != '$' && c10 != '.') break block9;
                }
                catch (a7 a73) {
                    throw s6.a(a73);
                }
                --fq2.R;
                return s6.X(string, fq2, g62);
            }
            catch (a7 a74) {
                throw s6.a(a74);
            }
        }
        return g62;
    }
}

