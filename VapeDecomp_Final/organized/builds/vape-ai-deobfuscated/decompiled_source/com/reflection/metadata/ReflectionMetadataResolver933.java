/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.metadata;

import com.core.exception.CustomRuntimeException;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.user.profile.UserProfileManager1412;
import java.util.Map;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ReflectionMetadataResolver933 {
    public static boolean t(String string, String string2) {
        try {
            if (string.charAt(0) != '(') {
                return false;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        int n = 0;
        while (true) {
            char c = string.charAt(n);
            try {
                if (c != string2.charAt(n)) {
                    return false;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ReflectionMetadataResolver933.a(runtimeException);
            }
            try {
                if (c == ')') {
                    return true;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ReflectionMetadataResolver933.a(runtimeException);
            }
            ++n;
        }
    }

    static MetaclassDefinitionRegistry C(char c) {
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = null;
        switch (c) {
            case 'Z': {
                metaclassDefinitionRegistry = MetaclassDefinitionRegistry.T;
                break;
            }
            case 'C': {
                metaclassDefinitionRegistry = MetaclassDefinitionRegistry.G;
                break;
            }
            case 'B': {
                metaclassDefinitionRegistry = MetaclassDefinitionRegistry.t;
                break;
            }
            case 'S': {
                metaclassDefinitionRegistry = MetaclassDefinitionRegistry.s;
                break;
            }
            case 'I': {
                metaclassDefinitionRegistry = MetaclassDefinitionRegistry.b;
                break;
            }
            case 'J': {
                metaclassDefinitionRegistry = MetaclassDefinitionRegistry.L;
                break;
            }
            case 'F': {
                metaclassDefinitionRegistry = MetaclassDefinitionRegistry.R;
                break;
            }
            case 'D': {
                metaclassDefinitionRegistry = MetaclassDefinitionRegistry.Z;
                break;
            }
            case 'V': {
                metaclassDefinitionRegistry = MetaclassDefinitionRegistry.M;
            }
        }
        return metaclassDefinitionRegistry;
    }

    public static int B(String string) {
        return -ReflectionMetadataResolver933.v(string, false);
    }

    public static String t(String string) {
        return string.substring(0, string.indexOf(41) + 1);
    }

    /*
     * Exception decompiling
     */
    public static MetaclassDefinitionRegistry[] Z(String var0, ClassPoolRegistry var1_1) throws CustomRuntimeException {
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
        int n;
        try {
            if (map == null) {
                return string;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        int n3 = 0;
        while (true) {
            n = string.indexOf(76, n3);
            try {
                if (n < 0) {
                    break;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ReflectionMetadataResolver933.a(runtimeException);
            }
            int n4 = string.indexOf(59, n);
            try {
                if (n4 < 0) {
                    break;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ReflectionMetadataResolver933.a(runtimeException);
            }
            n3 = n4 + 1;
            String string2 = string.substring(n + 1, n4);
            String string3 = map.get(string2);
            if (string3 == null) continue;
            stringBuilder.append(string.substring(n2, n));
            stringBuilder.append('L');
            stringBuilder.append(string3);
            stringBuilder.append(';');
            n2 = n3;
        }
        try {
            if (n2 == 0) {
                return string;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        n = string.length();
        try {
            if (n2 < n) {
                stringBuilder.append(string.substring(n2, n));
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        return stringBuilder.toString();
    }

    public static MetaclassDefinitionRegistry X(String string, ClassPoolRegistry classPoolRegistry) throws CustomRuntimeException {
        int n = string.indexOf(41);
        try {
            if (n < 0) {
                return null;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ReflectionMetadataResolver933.a(customRuntimeException);
        }
        MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = new MetaclassDefinitionRegistry[1];
        ReflectionMetadataResolver933.s(classPoolRegistry, string, n + 1, metaclassDefinitionRegistryArray, 0);
        return metaclassDefinitionRegistryArray[0];
    }

    public static String w(String string, String string2) {
        int n = string2.indexOf(41);
        try {
            if (n < 0) {
                return string2;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2.substring(0, n));
        stringBuilder.append('L');
        stringBuilder.append(string.replace('.', '/'));
        stringBuilder.append(';');
        stringBuilder.append(string2.substring(n));
        return stringBuilder.toString();
    }

    public static String q(String string) {
        return string.replace('.', '/');
    }

    public static String m(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        try {
            if (metaclassDefinitionRegistry.p()) {
                return ReflectionMetadataResolver933.H(metaclassDefinitionRegistry);
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        return ReflectionMetadataResolver933.q(metaclassDefinitionRegistry.H());
    }

    public static String Q(MetaclassDefinitionRegistry metaclassDefinitionRegistry, MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        if (metaclassDefinitionRegistryArray != null) {
            int n = metaclassDefinitionRegistryArray.length;
            try {
                for (int i = 0; i < n; ++i) {
                    ReflectionMetadataResolver933.u(stringBuilder, metaclassDefinitionRegistryArray[i]);
                }
            }
            catch (RuntimeException runtimeException) {
                throw ReflectionMetadataResolver933.a(runtimeException);
            }
        }
        try {
            stringBuilder.append(')');
            if (metaclassDefinitionRegistry != null) {
                ReflectionMetadataResolver933.u(stringBuilder, metaclassDefinitionRegistry);
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        return stringBuilder.toString();
    }

    public static String B(String string) {
        String string2;
        int n = 0;
        int n2 = 0;
        char c = string.charAt(0);
        while (c == '[') {
            ++n;
            c = string.charAt(++n2);
        }
        if (c == 'L') {
            int n3 = string.indexOf(59, n2++);
            string2 = string.substring(n2, n3).replace('/', '.');
            n2 = n3;
        } else if (c == 'V') {
            string2 = "void";
        } else if (c == 'I') {
            string2 = "int";
        } else if (c == 'B') {
            string2 = "byte";
        } else if (c == 'J') {
            string2 = "long";
        } else if (c == 'D') {
            string2 = "double";
        } else if (c == 'F') {
            string2 = "float";
        } else if (c == 'C') {
            string2 = "char";
        } else if (c == 'S') {
            string2 = "short";
        } else if (c == 'Z') {
            string2 = "boolean";
        } else {
            throw new RuntimeException("bad descriptor: " + string);
        }
        try {
            if (n2 + 1 != string.length()) {
                throw new RuntimeException("multiple descriptors?: " + string);
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        try {
            if (n == 0) {
                return string2;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        try {
            do {
                stringBuilder.append("[]");
            } while (--n > 0);
            return stringBuilder.toString();
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
    }

    private static int v(String string, boolean bl) {
        int n;
        block26: {
            char c;
            block28: {
                n = 0;
                c = string.charAt(0);
                if (c == '(') {
                    int n2 = 1;
                    while (true) {
                        block24: {
                            boolean bl2;
                            block23: {
                                if ((c = string.charAt(n2)) == ')') {
                                    c = string.charAt(n2 + 1);
                                    break;
                                }
                                bl2 = false;
                                while (c == '[') {
                                    bl2 = true;
                                    c = string.charAt(++n2);
                                }
                                if (c == 'L') {
                                    n2 = string.indexOf(59, n2) + 1;
                                    try {
                                        if (n2 <= 0) {
                                            throw new IndexOutOfBoundsException("bad descriptor");
                                        }
                                        break block23;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw ReflectionMetadataResolver933.a(runtimeException);
                                    }
                                }
                                ++n2;
                            }
                            try {
                                block25: {
                                    try {
                                        try {
                                            if (bl2) break block24;
                                            if (c == 'J') break block25;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw ReflectionMetadataResolver933.a(runtimeException);
                                        }
                                        if (c != 'D') break block24;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw ReflectionMetadataResolver933.a(runtimeException);
                                    }
                                }
                                n -= 2;
                                continue;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ReflectionMetadataResolver933.a(runtimeException);
                            }
                        }
                        --n;
                    }
                }
                try {
                    block27: {
                        try {
                            try {
                                if (!bl) break block26;
                                if (c == 'J') break block27;
                            }
                            catch (RuntimeException runtimeException) {
                                throw ReflectionMetadataResolver933.a(runtimeException);
                            }
                            if (c != 'D') break block28;
                        }
                        catch (RuntimeException runtimeException) {
                            throw ReflectionMetadataResolver933.a(runtimeException);
                        }
                    }
                    n += 2;
                    break block26;
                }
                catch (RuntimeException runtimeException) {
                    throw ReflectionMetadataResolver933.a(runtimeException);
                }
            }
            try {
                if (c != 'V') {
                    ++n;
                }
            }
            catch (RuntimeException runtimeException) {
                throw ReflectionMetadataResolver933.a(runtimeException);
            }
        }
        return n;
    }

    public static MetaclassDefinitionRegistry f(String string, ClassPoolRegistry classPoolRegistry) throws CustomRuntimeException {
        MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = new MetaclassDefinitionRegistry[1];
        int n = ReflectionMetadataResolver933.s(classPoolRegistry, string, 0, metaclassDefinitionRegistryArray, 0);
        try {
            if (n >= 0) {
                return metaclassDefinitionRegistryArray[0];
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw ReflectionMetadataResolver933.a(customRuntimeException);
        }
        return classPoolRegistry.g(string.replace('/', '.'));
    }

    public static int v(String string) {
        int n = 0;
        int n2 = 1;
        while (true) {
            block9: {
                char c = string.charAt(n2);
                try {
                    if (c == ')') {
                        break;
                    }
                }
                catch (RuntimeException runtimeException) {
                    throw ReflectionMetadataResolver933.a(runtimeException);
                }
                while (c == '[') {
                    c = string.charAt(++n2);
                }
                if (c == 'L') {
                    n2 = string.indexOf(59, n2) + 1;
                    try {
                        if (n2 <= 0) {
                            throw new IndexOutOfBoundsException("bad descriptor");
                        }
                        break block9;
                    }
                    catch (RuntimeException runtimeException) {
                        throw ReflectionMetadataResolver933.a(runtimeException);
                    }
                }
                ++n2;
            }
            ++n;
        }
        return n;
    }

    private static int s(ClassPoolRegistry classPoolRegistry, String string, int n, MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray, int n2) throws CustomRuntimeException {
        Object object;
        String string2;
        int n3;
        int n4 = 0;
        char c = string.charAt(n);
        while (c == '[') {
            ++n4;
            c = string.charAt(++n);
        }
        if (c == 'L') {
            n3 = string.indexOf(59, ++n);
            string2 = string.substring(n, n3++).replace('/', '.');
        } else {
            object = ReflectionMetadataResolver933.C(c);
            try {
                if (object == null) {
                    return -1;
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw ReflectionMetadataResolver933.a(customRuntimeException);
            }
            n3 = n + 1;
            try {
                if (n4 == 0) {
                    metaclassDefinitionRegistryArray[n2] = object;
                    return n3;
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw ReflectionMetadataResolver933.a(customRuntimeException);
            }
            string2 = ((MetaclassDefinitionRegistry)object).H();
        }
        if (n4 > 0) {
            object = new StringBuilder(string2);
            try {
                while (n4-- > 0) {
                    ((StringBuilder)object).append("[]");
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw ReflectionMetadataResolver933.a(customRuntimeException);
            }
            string2 = ((StringBuilder)object).toString();
        }
        metaclassDefinitionRegistryArray[n2] = classPoolRegistry.g(string2);
        return n3;
    }

    public static String r(String string, String string2) {
        try {
            if (string2.charAt(0) != '(') {
                return string2;
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        return "(L" + string.replace('.', '/') + ';' + string2.substring(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void u(StringBuilder stringBuilder, MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        try {
            if (metaclassDefinitionRegistry.p()) {
                stringBuilder.append('[');
                try {
                    ReflectionMetadataResolver933.u(stringBuilder, metaclassDefinitionRegistry.r());
                    return;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    stringBuilder.append('L');
                    String string = metaclassDefinitionRegistry.H();
                    stringBuilder.append(ReflectionMetadataResolver933.q(string.substring(0, string.length() - 2)));
                    stringBuilder.append(';');
                    return;
                }
            }
        }
        catch (RuntimeException runtimeException) {
            throw ReflectionMetadataResolver933.a(runtimeException);
        }
        if (metaclassDefinitionRegistry.m()) {
            UserProfileManager1412 userProfileManager1412 = (UserProfileManager1412)metaclassDefinitionRegistry;
            stringBuilder.append(userProfileManager1412.y());
            return;
        }
        stringBuilder.append('L');
        stringBuilder.append(metaclassDefinitionRegistry.H().replace('.', '/'));
        stringBuilder.append(';');
    }

    public static String H(MetaclassDefinitionRegistry metaclassDefinitionRegistry) {
        StringBuilder stringBuilder = new StringBuilder();
        ReflectionMetadataResolver933.u(stringBuilder, metaclassDefinitionRegistry);
        return stringBuilder.toString();
    }

    public static int q(String string) {
        return ReflectionMetadataResolver933.v(string, true);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static String A(String string) {
        return string.replace('/', '.');
    }
}

