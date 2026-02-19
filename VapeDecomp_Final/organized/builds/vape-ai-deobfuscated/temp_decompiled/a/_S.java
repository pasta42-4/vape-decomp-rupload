/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.GM;
import a.Ge;
import a.On;
import a.WJ;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class _s {
    public static boolean t(String string, String string2) {
        try {
            if (string.charAt(0) != '(') {
                return false;
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        int n2 = 0;
        while (true) {
            char c10 = string.charAt(n2);
            try {
                if (c10 != string2.charAt(n2)) {
                    return false;
                }
            }
            catch (RuntimeException runtimeException) {
                throw _s.a(runtimeException);
            }
            try {
                if (c10 == ')') {
                    return true;
                }
            }
            catch (RuntimeException runtimeException) {
                throw _s.a(runtimeException);
            }
            ++n2;
        }
    }

    static GM C(char c10) {
        GM gM = null;
        switch (c10) {
            case 'Z': {
                gM = GM.T;
                break;
            }
            case 'C': {
                gM = GM.G;
                break;
            }
            case 'B': {
                gM = GM.t;
                break;
            }
            case 'S': {
                gM = GM.s;
                break;
            }
            case 'I': {
                gM = GM.b;
                break;
            }
            case 'J': {
                gM = GM.L;
                break;
            }
            case 'F': {
                gM = GM.R;
                break;
            }
            case 'D': {
                gM = GM.Z;
                break;
            }
            case 'V': {
                gM = GM.M;
            }
        }
        return gM;
    }

    public static int B(String string) {
        return -_s.v(string, false);
    }

    public static String t(String string) {
        return string.substring(0, string.indexOf(41) + 1);
    }

    /*
     * Exception decompiling
     */
    public static GM[] Z(String var0, On var1_1) throws WJ {
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

    public static String z(String string, Map<String, String> map) {
        int n2;
        try {
            if (map == null) {
                return string;
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = 0;
        int n4 = 0;
        while (true) {
            n2 = string.indexOf(76, n4);
            try {
                if (n2 < 0) {
                    break;
                }
            }
            catch (RuntimeException runtimeException) {
                throw _s.a(runtimeException);
            }
            int n5 = string.indexOf(59, n2);
            try {
                if (n5 < 0) {
                    break;
                }
            }
            catch (RuntimeException runtimeException) {
                throw _s.a(runtimeException);
            }
            n4 = n5 + 1;
            String string2 = string.substring(n2 + 1, n5);
            String string3 = map.get(string2);
            if (string3 == null) continue;
            stringBuilder.append(string.substring(n3, n2));
            stringBuilder.append('L');
            stringBuilder.append(string3);
            stringBuilder.append(';');
            n3 = n4;
        }
        try {
            if (n3 == 0) {
                return string;
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        n2 = string.length();
        try {
            if (n3 < n2) {
                stringBuilder.append(string.substring(n3, n2));
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        return stringBuilder.toString();
    }

    public static GM X(String string, On on2) throws WJ {
        int n2 = string.indexOf(41);
        try {
            if (n2 < 0) {
                return null;
            }
        }
        catch (WJ wJ2) {
            throw _s.a(wJ2);
        }
        GM[] gMArray = new GM[1];
        _s.s(on2, string, n2 + 1, gMArray, 0);
        return gMArray[0];
    }

    public static String w(String string, String string2) {
        int n2 = string2.indexOf(41);
        try {
            if (n2 < 0) {
                return string2;
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2.substring(0, n2));
        stringBuilder.append('L');
        stringBuilder.append(string.replace('.', '/'));
        stringBuilder.append(';');
        stringBuilder.append(string2.substring(n2));
        return stringBuilder.toString();
    }

    public static String q(String string) {
        return string.replace('.', '/');
    }

    public static String m(GM gM) {
        try {
            if (gM.p()) {
                return _s.H(gM);
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        return _s.q(gM.H());
    }

    public static String Q(GM gM, GM[] gMArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        if (gMArray != null) {
            int n2 = gMArray.length;
            try {
                for (int i10 = 0; i10 < n2; ++i10) {
                    _s.u(stringBuilder, gMArray[i10]);
                }
            }
            catch (RuntimeException runtimeException) {
                throw _s.a(runtimeException);
            }
        }
        try {
            stringBuilder.append(')');
            if (gM != null) {
                _s.u(stringBuilder, gM);
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        return stringBuilder.toString();
    }

    public static String B(String string) {
        String string2;
        int n2 = 0;
        int n3 = 0;
        char c10 = string.charAt(0);
        while (c10 == '[') {
            ++n2;
            c10 = string.charAt(++n3);
        }
        if (c10 == 'L') {
            int n4 = string.indexOf(59, n3++);
            string2 = string.substring(n3, n4).replace('/', '.');
            n3 = n4;
        } else if (c10 == 'V') {
            string2 = "void";
        } else if (c10 == 'I') {
            string2 = "int";
        } else if (c10 == 'B') {
            string2 = "byte";
        } else if (c10 == 'J') {
            string2 = "long";
        } else if (c10 == 'D') {
            string2 = "double";
        } else if (c10 == 'F') {
            string2 = "float";
        } else if (c10 == 'C') {
            string2 = "char";
        } else if (c10 == 'S') {
            string2 = "short";
        } else if (c10 == 'Z') {
            string2 = "boolean";
        } else {
            throw new RuntimeException("bad descriptor: " + string);
        }
        try {
            if (n3 + 1 != string.length()) {
                throw new RuntimeException("multiple descriptors?: " + string);
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        try {
            if (n2 == 0) {
                return string2;
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        try {
            do {
                stringBuilder.append("[]");
            } while (--n2 > 0);
            return stringBuilder.toString();
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
    }

    private static int v(String string, boolean bl2) {
        int n2;
        block26: {
            char c10;
            block28: {
                n2 = 0;
                c10 = string.charAt(0);
                if (c10 == '(') {
                    int n3 = 1;
                    while (true) {
                        block24: {
                            boolean bl3;
                            block23: {
                                if ((c10 = string.charAt(n3)) == ')') {
                                    c10 = string.charAt(n3 + 1);
                                    break;
                                }
                                bl3 = false;
                                while (c10 == '[') {
                                    bl3 = true;
                                    c10 = string.charAt(++n3);
                                }
                                if (c10 == 'L') {
                                    n3 = string.indexOf(59, n3) + 1;
                                    try {
                                        if (n3 <= 0) {
                                            throw new IndexOutOfBoundsException("bad descriptor");
                                        }
                                        break block23;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw _s.a(runtimeException);
                                    }
                                }
                                ++n3;
                            }
                            try {
                                block25: {
                                    try {
                                        try {
                                            if (bl3) break block24;
                                            if (c10 == 'J') break block25;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw _s.a(runtimeException);
                                        }
                                        if (c10 != 'D') break block24;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw _s.a(runtimeException);
                                    }
                                }
                                n2 -= 2;
                                continue;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _s.a(runtimeException);
                            }
                        }
                        --n2;
                    }
                }
                try {
                    block27: {
                        try {
                            try {
                                if (!bl2) break block26;
                                if (c10 == 'J') break block27;
                            }
                            catch (RuntimeException runtimeException) {
                                throw _s.a(runtimeException);
                            }
                            if (c10 != 'D') break block28;
                        }
                        catch (RuntimeException runtimeException) {
                            throw _s.a(runtimeException);
                        }
                    }
                    n2 += 2;
                    break block26;
                }
                catch (RuntimeException runtimeException) {
                    throw _s.a(runtimeException);
                }
            }
            try {
                if (c10 != 'V') {
                    ++n2;
                }
            }
            catch (RuntimeException runtimeException) {
                throw _s.a(runtimeException);
            }
        }
        return n2;
    }

    public static GM f(String string, On on2) throws WJ {
        GM[] gMArray = new GM[1];
        int n2 = _s.s(on2, string, 0, gMArray, 0);
        try {
            if (n2 >= 0) {
                return gMArray[0];
            }
        }
        catch (WJ wJ2) {
            throw _s.a(wJ2);
        }
        return on2.g(string.replace('/', '.'));
    }

    public static int v(String string) {
        int n2 = 0;
        int n3 = 1;
        while (true) {
            block9: {
                char c10 = string.charAt(n3);
                try {
                    if (c10 == ')') {
                        break;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw _s.a(runtimeException);
                }
                while (c10 == '[') {
                    c10 = string.charAt(++n3);
                }
                if (c10 == 'L') {
                    n3 = string.indexOf(59, n3) + 1;
                    try {
                        if (n3 <= 0) {
                            throw new IndexOutOfBoundsException("bad descriptor");
                        }
                        break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw _s.a(runtimeException);
                    }
                }
                ++n3;
            }
            ++n2;
        }
        return n2;
    }

    private static int s(On on2, String string, int n2, GM[] gMArray, int n3) throws WJ {
        Object object;
        String string2;
        int n4;
        int n5 = 0;
        char c10 = string.charAt(n2);
        while (c10 == '[') {
            ++n5;
            c10 = string.charAt(++n2);
        }
        if (c10 == 'L') {
            n4 = string.indexOf(59, ++n2);
            string2 = string.substring(n2, n4++).replace('/', '.');
        } else {
            object = _s.C(c10);
            try {
                if (object == null) {
                    return -1;
                }
            }
            catch (WJ wJ2) {
                throw _s.a(wJ2);
            }
            n4 = n2 + 1;
            try {
                if (n5 == 0) {
                    gMArray[n3] = object;
                    return n4;
                }
            }
            catch (WJ wJ3) {
                throw _s.a(wJ3);
            }
            string2 = ((GM)object).H();
        }
        if (n5 > 0) {
            object = new StringBuilder(string2);
            try {
                while (n5-- > 0) {
                    ((StringBuilder)object).append("[]");
                }
            }
            catch (WJ wJ4) {
                throw _s.a(wJ4);
            }
            string2 = ((StringBuilder)object).toString();
        }
        gMArray[n3] = on2.g(string2);
        return n4;
    }

    public static String r(String string, String string2) {
        try {
            if (string2.charAt(0) != '(') {
                return string2;
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        return "(L" + string.replace('.', '/') + ';' + string2.substring(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void u(StringBuilder stringBuilder, GM gM) {
        try {
            if (gM.p()) {
                stringBuilder.append('[');
                try {
                    _s.u(stringBuilder, gM.r());
                    return;
                }
                catch (WJ wJ2) {
                    stringBuilder.append('L');
                    String string = gM.H();
                    stringBuilder.append(_s.q(string.substring(0, string.length() - 2)));
                    stringBuilder.append(';');
                    return;
                }
            }
        }
        catch (RuntimeException runtimeException) {
            throw _s.a(runtimeException);
        }
        if (gM.m()) {
            Ge ge = (Ge)gM;
            stringBuilder.append(ge.y());
            return;
        }
        stringBuilder.append('L');
        stringBuilder.append(gM.H().replace('.', '/'));
        stringBuilder.append(';');
    }

    public static String H(GM gM) {
        StringBuilder stringBuilder = new StringBuilder();
        _s.u(stringBuilder, gM);
        return stringBuilder.toString();
    }

    public static int q(String string) {
        return _s.v(string, true);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static String A(String string) {
        return string.replace('/', '.');
    }
}

