/*
 * Decompiled with CFR 0.152.
 */
package a;

/*
 * This class specifies class file version 49.0 but uses Java 6 signatures.  Assumed Java 6.
 */
public final class zY {
    public static final zY N;
    public static final zY w;
    public static final zY I;
    private final int j;
    private final int g;
    public static final zY V;
    private final String A;
    public static final zY W;
    public static final zY H;
    public static final zY L;
    public static final zY O;
    public static final zY e;
    private final int h;

    static {
        W = new zY(0, "VZCBSIFJD", 0, 1);
        N = new zY(1, "VZCBSIFJD", 1, 2);
        V = new zY(2, "VZCBSIFJD", 2, 3);
        H = new zY(3, "VZCBSIFJD", 3, 4);
        I = new zY(4, "VZCBSIFJD", 4, 5);
        O = new zY(5, "VZCBSIFJD", 5, 6);
        w = new zY(6, "VZCBSIFJD", 6, 7);
        e = new zY(7, "VZCBSIFJD", 7, 8);
        L = new zY(8, "VZCBSIFJD", 8, 9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zY[] a(String string) {
        int n = 0;
        int n2 = 1;
        while (true) {
            try {
                try {
                    if (string.charAt(n2) == ')') break;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw zY.a(illegalArgumentException);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw zY.a(illegalArgumentException);
            }
            while (string.charAt(n2) == '[') {
                ++n2;
            }
            if (string.charAt(n2++) == 'L') {
                int n3 = string.indexOf(59, n2);
                n2 = Math.max(n2, n3 + 1);
            }
            ++n;
        }
        zY[] zYArray = new zY[n];
        n2 = 1;
        int n4 = 0;
        while (string.charAt(n2) != ')') {
            int n5 = n2;
            try {
                while (string.charAt(n2) == '[') {
                    ++n2;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw zY.a(illegalArgumentException);
            }
            if (string.charAt(n2++) == 'L') {
                int n6 = string.indexOf(59, n2);
                n2 = Math.max(n2, n6 + 1);
            }
            zYArray[n4++] = zY.O(string, n5, n2);
        }
        return zYArray;
    }

    /*
     * Exception decompiling
     */
    public int q() {
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

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Exception decompiling
     */
    public int W(int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 8[SWITCH]
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

    public static int m(String string) {
        int n;
        int n2;
        int n3;
        block22: {
            block21: {
                n3 = 1;
                int n4 = 1;
                char c = string.charAt(n4);
                while (true) {
                    block20: {
                        block19: {
                            try {
                                block18: {
                                    try {
                                        try {
                                            if (c == ')') break;
                                            if (c == 'J') break block18;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw zY.a(illegalArgumentException);
                                        }
                                        if (c != 'D') break block19;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw zY.a(illegalArgumentException);
                                    }
                                }
                                ++n4;
                                n3 += 2;
                                break block20;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw zY.a(illegalArgumentException);
                            }
                        }
                        try {
                            while (string.charAt(n4) == '[') {
                                ++n4;
                            }
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw zY.a(illegalArgumentException);
                        }
                        if (string.charAt(n4++) == 'L') {
                            n2 = string.indexOf(59, n4);
                            n4 = Math.max(n4, n2 + 1);
                        }
                        ++n3;
                    }
                    c = string.charAt(n4);
                }
                c = string.charAt(n4 + 1);
                try {
                    if (c == 'V') {
                        return n3 << 2;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw zY.a(illegalArgumentException);
                }
                try {
                    try {
                        if (c != 'J' && c != 'D') break block21;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw zY.a(illegalArgumentException);
                    }
                    n = 2;
                    break block22;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw zY.a(illegalArgumentException);
                }
            }
            n = 1;
        }
        n2 = n;
        return n3 << 2 | n2;
    }

    public static zY C(String string) {
        return zY.O(string, zY.Q(string), string.length());
    }

    public int hashCode() {
        int n;
        int n2;
        try {
            n2 = 13;
            n = this.g == 12 ? 10 : this.g;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        int n3 = n2 * n;
        if (this.g >= 9) {
            int n4 = this.j;
            for (int i = this.h; i < n4; ++i) {
                n3 = 17 * (n3 + this.A.charAt(i));
            }
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static int Q(String string) {
        int n = 1;
        while (true) {
            block7: {
                block6: {
                    try {
                        try {
                            if (string.charAt(n) == ')') break block6;
                            break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw zY.a(illegalArgumentException);
                        }
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw zY.a(illegalArgumentException);
                    }
                }
                return n + 1;
            }
            while (string.charAt(n) == '[') {
                ++n;
            }
            if (string.charAt(n++) != 'L') continue;
            int n2 = string.indexOf(59, n);
            n = Math.max(n, n2 + 1);
        }
    }

    public boolean equals(Object object) {
        int n;
        int n2;
        try {
            if (this == object) {
                return true;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        try {
            if (!(object instanceof zY)) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        zY zY2 = (zY)object;
        try {
            n2 = this.g == 12 ? 10 : this.g;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        try {
            n = zY2.g == 12 ? 10 : zY2.g;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        try {
            if (n2 != n) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        int n3 = this.h;
        int n4 = this.j;
        int n5 = zY2.h;
        int n6 = zY2.j;
        try {
            if (n4 - n3 != n6 - n5) {
                return false;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        int n7 = n3;
        int n8 = n5;
        while (true) {
            block21: {
                try {
                    try {
                        if (n7 >= n4) break;
                        if (this.A.charAt(n7) == zY2.A.charAt(n8)) break block21;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw zY.a(illegalArgumentException);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw zY.a(illegalArgumentException);
                }
            }
            ++n7;
            ++n8;
        }
        return true;
    }

    public String d() {
        try {
            if (this.g == 10) {
                return this.A.substring(this.h - 1, this.j + 1);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        try {
            if (this.g == 12) {
                return 'L' + this.A.substring(this.h, this.j) + ';';
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        return this.A.substring(this.h, this.j);
    }

    private zY(int n, String string, int n2, int n3) {
        this.g = n;
        this.A = string;
        this.h = n2;
        this.j = n3;
    }

    /*
     * Exception decompiling
     */
    private static zY O(String var0, int var1_1, int var2_2) {
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

    public static zY r(String string) {
        return new zY(11, string, 0, string.length());
    }

    public static String v(Class<?> clazz) {
        return clazz.getName().replace('.', '/');
    }

    public String toString() {
        return this.d();
    }

    public static zY n(String string) {
        return zY.O(string, 0, string.length());
    }

    public static zY p(String string) {
        int n;
        zY zY2;
        zY zY3;
        try {
            zY zY4;
            zY3 = zY4;
            zY2 = zY4;
            n = string.charAt(0) == '[' ? 9 : 12;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        zY3(n, string, 0, string.length());
        return zY2;
    }

    public int T() {
        int n;
        try {
            n = this.g == 12 ? 10 : this.g;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw zY.a(illegalArgumentException);
        }
        return n;
    }

    public String W() {
        return this.A.substring(this.h, this.j);
    }
}

