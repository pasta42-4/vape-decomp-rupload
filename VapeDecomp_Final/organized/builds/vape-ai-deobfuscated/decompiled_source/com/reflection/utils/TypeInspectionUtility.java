/*
 * Decompiled with CFR 0.152.
 */
package com.reflection.utils;

import a.eF;
import com.app.core.config.ConfigurationManager2183;
import com.bytecode.analysis.BytecodeInspectionEngine;
import com.configuration.management.ConfigurationOrchestrator2115;
import com.core.exception.CustomRuntimeException;
import com.data.persistence.PersistenceRecord;
import com.event.orchestration.DeclarativeEventOrchestrator;
import com.network.messaging.TransmissionPayload;
import com.operations.bitwise.BitwiseOperationInterface;
import com.reflection.management.ClassPoolRegistry;
import com.reflection.metadata.ClassMetadataExtractor;
import com.reflection.metadata.ReflectionMetadataResolver933;
import com.reflection.registry.MetaclassDefinitionRegistry;
import com.reverse.engineering.DecompilationAnalyzer;
import com.system.compilation.CompilationDiagnosticException;
import com.util.reflection.ReflectionFieldResolver;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class TypeInspectionUtility
implements BitwiseOperationInterface {
    private Map<String, String> d = null;
    private ClassPoolRegistry j;
    private static Map<ClassPoolRegistry, Reference<Map<String, String>>> P = new WeakHashMap<ClassPoolRegistry, Reference<Map<String, String>>>();

    public static MetaclassDefinitionRegistry s(MetaclassDefinitionRegistry metaclassDefinitionRegistry) throws CompilationDiagnosticException {
        try {
            MetaclassDefinitionRegistry metaclassDefinitionRegistry2 = metaclassDefinitionRegistry.G();
            if (metaclassDefinitionRegistry2 != null) {
                return metaclassDefinitionRegistry2;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            // empty catch block
        }
        throw new CompilationDiagnosticException("cannot find the super class of " + metaclassDefinitionRegistry.H());
    }

    public ConfigurationManager2183 s(MetaclassDefinitionRegistry metaclassDefinitionRegistry, MetaclassDefinitionRegistry metaclassDefinitionRegistry2, BytecodeInspectionEngine bytecodeInspectionEngine, String string, int[] nArray, int[] nArray2, String[] stringArray) throws CompilationDiagnosticException {
        boolean bl;
        String[] stringArray2;
        int[] nArray3;
        int[] nArray4;
        String string2;
        MetaclassDefinitionRegistry metaclassDefinitionRegistry3;
        TypeInspectionUtility typeInspectionUtility;
        ConfigurationManager2183 configurationManager2183;
        block13: {
            configurationManager2183 = null;
            try {
                try {
                    if (bytecodeInspectionEngine == null || metaclassDefinitionRegistry != metaclassDefinitionRegistry2) break block13;
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw TypeInspectionUtility.a(compilationDiagnosticException);
                }
                if (!bytecodeInspectionEngine.C().equals(string)) break block13;
            }
            catch (CompilationDiagnosticException compilationDiagnosticException) {
                throw TypeInspectionUtility.a(compilationDiagnosticException);
            }
            int n = this.j(bytecodeInspectionEngine.b(), nArray, nArray2, stringArray);
            if (n != -1) {
                ConfigurationManager2183 configurationManager21832 = new ConfigurationManager2183(metaclassDefinitionRegistry, bytecodeInspectionEngine, n);
                try {
                    if (n == 0) {
                        return configurationManager21832;
                    }
                }
                catch (CompilationDiagnosticException compilationDiagnosticException) {
                    throw TypeInspectionUtility.a(compilationDiagnosticException);
                }
                configurationManager2183 = configurationManager21832;
            }
        }
        try {
            typeInspectionUtility = this;
            metaclassDefinitionRegistry3 = metaclassDefinitionRegistry;
            string2 = string;
            nArray4 = nArray;
            nArray3 = nArray2;
            stringArray2 = stringArray;
            bl = configurationManager2183 != null;
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw TypeInspectionUtility.a(compilationDiagnosticException);
        }
        ConfigurationManager2183 configurationManager21833 = typeInspectionUtility.X(metaclassDefinitionRegistry3, string2, nArray4, nArray3, stringArray2, bl);
        try {
            if (configurationManager21833 != null) {
                return configurationManager21833;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw TypeInspectionUtility.a(compilationDiagnosticException);
        }
        return configurationManager2183;
    }

    private static void y() throws CompilationDiagnosticException {
        throw new CompilationDiagnosticException("fatal");
    }

    private MetaclassDefinitionRegistry m(String string, boolean bl) throws CustomRuntimeException {
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = null;
        do {
            try {
                metaclassDefinitionRegistry = this.j.g(string);
            }
            catch (CustomRuntimeException customRuntimeException) {
                int n;
                block7: {
                    n = string.lastIndexOf(46);
                    try {
                        try {
                            if (!bl && n >= 0) break block7;
                        }
                        catch (CustomRuntimeException customRuntimeException2) {
                            throw TypeInspectionUtility.a(customRuntimeException2);
                        }
                        throw customRuntimeException;
                    }
                    catch (CustomRuntimeException customRuntimeException3) {
                        throw TypeInspectionUtility.a(customRuntimeException3);
                    }
                }
                StringBuilder stringBuilder = new StringBuilder(string);
                stringBuilder.setCharAt(n, '$');
                string = stringBuilder.toString();
            }
        } while (metaclassDefinitionRegistry == null);
        return metaclassDefinitionRegistry;
    }

    static String F(int n) throws CompilationDiagnosticException {
        String string = "";
        switch (n) {
            case 301: {
                string = "boolean";
                break;
            }
            case 306: {
                string = "char";
                break;
            }
            case 303: {
                string = "byte";
                break;
            }
            case 334: {
                string = "short";
                break;
            }
            case 324: {
                string = "int";
                break;
            }
            case 326: {
                string = "long";
                break;
            }
            case 317: {
                string = "float";
                break;
            }
            case 312: {
                string = "double";
                break;
            }
            case 344: {
                string = "void";
                break;
            }
            default: {
                TypeInspectionUtility.y();
            }
        }
        return string;
    }

    public DecompilationAnalyzer c(String string, TransmissionPayload transmissionPayload) throws CompilationDiagnosticException {
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.g(string, false);
        try {
            return metaclassDefinitionRegistry.t(transmissionPayload.e());
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw new CompilationDiagnosticException("no such field: " + transmissionPayload.e());
        }
    }

    private MetaclassDefinitionRegistry M(String string) throws CompilationDiagnosticException {
        if (string.indexOf(46) < 0) {
            Iterator<String> iterator = this.j.L();
            while (iterator.hasNext()) {
                String string2 = iterator.next();
                String string3 = string2.replaceAll("\\.$", "") + "." + string;
                try {
                    return this.j.g(string3);
                }
                catch (CustomRuntimeException customRuntimeException) {
                    try {
                        if (!string2.endsWith("." + string)) continue;
                        return this.j.g(string2);
                    }
                    catch (CompilationDiagnosticException compilationDiagnosticException) {
                        throw TypeInspectionUtility.a(compilationDiagnosticException);
                    }
                    catch (CustomRuntimeException customRuntimeException2) {
                    }
                }
            }
        }
        this.J().put(string, "<invalid>");
        throw new CompilationDiagnosticException("no such class: " + string);
    }

    public DecompilationAnalyzer G(String string, TransmissionPayload transmissionPayload, PersistenceRecord persistenceRecord) throws ReflectionFieldResolver {
        String string2 = transmissionPayload.e();
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = null;
        try {
            metaclassDefinitionRegistry = this.g(TypeInspectionUtility.M(string), true);
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw new ReflectionFieldResolver(string + "/" + string2, persistenceRecord);
        }
        try {
            return metaclassDefinitionRegistry.t(string2);
        }
        catch (CustomRuntimeException customRuntimeException) {
            string = TypeInspectionUtility.i(metaclassDefinitionRegistry.H());
            throw new ReflectionFieldResolver(string + "$" + string2, persistenceRecord);
        }
    }

    public ClassPoolRegistry X() {
        return this.j;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public MetaclassDefinitionRegistry b(int n, int n2, String string) throws CompilationDiagnosticException {
        String string2 = "";
        if (n == 307) {
            MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.w(string);
            if (n2 <= 0) return metaclassDefinitionRegistry;
            string2 = metaclassDefinitionRegistry.H();
        } else {
            string2 = TypeInspectionUtility.F(n);
        }
        while (n2-- > 0) {
            string2 = string2 + "[]";
        }
        return this.g(string2, false);
    }

    public DecompilationAnalyzer p(String string, TransmissionPayload transmissionPayload) throws CompilationDiagnosticException {
        return this.c(TypeInspectionUtility.M(string), transmissionPayload);
    }

    public static MetaclassDefinitionRegistry t(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string) throws CompilationDiagnosticException {
        block5: {
            try {
                MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray = metaclassDefinitionRegistry.l();
                int n = 0;
                while (true) {
                    block6: {
                        try {
                            if (n >= metaclassDefinitionRegistryArray.length) break block5;
                            if (!metaclassDefinitionRegistryArray[n].H().equals(string)) break block6;
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw TypeInspectionUtility.a(customRuntimeException);
                        }
                        return metaclassDefinitionRegistryArray[n];
                    }
                    ++n;
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                // empty catch block
            }
        }
        throw new CompilationDiagnosticException("cannot find the super interface " + string + " of " + metaclassDefinitionRegistry.H());
    }

    public static String i(String string) {
        return string.replace('.', '/');
    }

    public static String M(String string) {
        return string.replace('/', '.');
    }

    public TypeInspectionUtility(ClassPoolRegistry classPoolRegistry) {
        this.j = classPoolRegistry;
    }

    public MetaclassDefinitionRegistry V(eF eF2) throws CompilationDiagnosticException {
        return this.g(DeclarativeEventOrchestrator.s(eF2, '.'), false);
    }

    public String S(String string) throws CompilationDiagnosticException {
        try {
            if (string == null) {
                return null;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw TypeInspectionUtility.a(compilationDiagnosticException);
        }
        return TypeInspectionUtility.i(this.w(string).H());
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int j(String string, int[] nArray, int[] nArray2, String[] stringArray) throws CompilationDiagnosticException {
        int n = 0;
        int n2 = 1;
        int n3 = nArray.length;
        try {
            if (n3 != ReflectionMetadataResolver933.v(string)) {
                return -1;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw TypeInspectionUtility.a(customRuntimeException);
        }
        int n4 = string.length();
        int n5 = 0;
        while (n2 < n4) {
            block53: {
                int n6;
                char c;
                block54: {
                    block55: {
                        block62: {
                            int n7;
                            block61: {
                                block51: {
                                    block52: {
                                        block60: {
                                            block50: {
                                                c = string.charAt(n2++);
                                                if (c != ')') break block50;
                                                try {
                                                    block59: {
                                                        break block59;
                                                        catch (CustomRuntimeException customRuntimeException) {
                                                            throw TypeInspectionUtility.a(customRuntimeException);
                                                        }
                                                    }
                                                    if (n5 != n3) return -1;
                                                    int n8 = n;
                                                    return n8;
                                                }
                                                catch (CustomRuntimeException customRuntimeException) {
                                                    throw TypeInspectionUtility.a(customRuntimeException);
                                                }
                                            }
                                            try {
                                                if (n5 >= n3) {
                                                    return -1;
                                                }
                                            }
                                            catch (CustomRuntimeException customRuntimeException) {
                                                throw TypeInspectionUtility.a(customRuntimeException);
                                            }
                                            n7 = 0;
                                            while (c == '[') {
                                                ++n7;
                                                c = string.charAt(n2++);
                                            }
                                            if (nArray[n5] != 412) break block51;
                                            if (n7 != 0) break block52;
                                            break block60;
                                            catch (CustomRuntimeException customRuntimeException) {
                                                throw TypeInspectionUtility.a(customRuntimeException);
                                            }
                                        }
                                        try {
                                            if (c == 'L') break block52;
                                            return -1;
                                            catch (CustomRuntimeException customRuntimeException) {
                                                throw TypeInspectionUtility.a(customRuntimeException);
                                            }
                                        }
                                        catch (CustomRuntimeException customRuntimeException) {
                                            throw TypeInspectionUtility.a(customRuntimeException);
                                        }
                                    }
                                    if (c == 'L') {
                                        n2 = string.indexOf(59, n2) + 1;
                                    }
                                    break block53;
                                }
                                if (nArray2[n5] == n7) break block54;
                                break block61;
                                catch (CustomRuntimeException customRuntimeException) {
                                    throw TypeInspectionUtility.a(customRuntimeException);
                                }
                            }
                            if (n7 != 0) return -1;
                            break block62;
                            catch (CustomRuntimeException customRuntimeException) {
                                throw TypeInspectionUtility.a(customRuntimeException);
                            }
                        }
                        if (c != 'L') return -1;
                        try {
                            if (string.startsWith("java/lang/Object;", n2)) break block55;
                            return -1;
                            catch (CustomRuntimeException customRuntimeException) {
                                throw TypeInspectionUtility.a(customRuntimeException);
                            }
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            throw TypeInspectionUtility.a(customRuntimeException);
                        }
                    }
                    n2 = string.indexOf(59, n2) + 1;
                    try {
                        ++n;
                        if (n2 <= 0) {
                            return -1;
                        }
                        break block53;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw TypeInspectionUtility.a(customRuntimeException);
                    }
                }
                if (c == 'L') {
                    block57: {
                        block56: {
                            n6 = string.indexOf(59, n2);
                            if (n6 < 0) return -1;
                            try {
                                if (nArray[n5] == 307) break block56;
                                return -1;
                                catch (CustomRuntimeException customRuntimeException) {
                                    throw TypeInspectionUtility.a(customRuntimeException);
                                }
                            }
                            catch (CustomRuntimeException customRuntimeException) {
                                throw TypeInspectionUtility.a(customRuntimeException);
                            }
                        }
                        String string2 = string.substring(n2, n6);
                        if (string2.equals(stringArray[n5])) break block57;
                        MetaclassDefinitionRegistry metaclassDefinitionRegistry = this.w(stringArray[n5]);
                        try {
                            try {
                                if (!metaclassDefinitionRegistry.t(this.w(string2))) return -1;
                                ++n;
                            }
                            catch (CustomRuntimeException customRuntimeException) {
                                throw TypeInspectionUtility.a(customRuntimeException);
                            }
                        }
                        catch (CustomRuntimeException customRuntimeException) {
                            ++n;
                        }
                    }
                    n2 = n6 + 1;
                } else {
                    n6 = TypeInspectionUtility.y(c);
                    int n9 = nArray[n5];
                    try {
                        block58: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n6 == n9) break block53;
                                            if (n6 != 324) return -1;
                                        }
                                        catch (CustomRuntimeException customRuntimeException) {
                                            throw TypeInspectionUtility.a(customRuntimeException);
                                        }
                                        if (n9 == 334) break block58;
                                    }
                                    catch (CustomRuntimeException customRuntimeException) {
                                        throw TypeInspectionUtility.a(customRuntimeException);
                                    }
                                    if (n9 == 303) break block58;
                                }
                                catch (CustomRuntimeException customRuntimeException) {
                                    throw TypeInspectionUtility.a(customRuntimeException);
                                }
                                if (n9 != 306) return -1;
                            }
                            catch (CustomRuntimeException customRuntimeException) {
                                throw TypeInspectionUtility.a(customRuntimeException);
                            }
                        }
                        ++n;
                    }
                    catch (CustomRuntimeException customRuntimeException) {
                        throw TypeInspectionUtility.a(customRuntimeException);
                    }
                }
            }
            ++n5;
        }
        return -1;
    }

    /*
     * Exception decompiling
     */
    public static int y(char var0) throws CompilationDiagnosticException {
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

    public MetaclassDefinitionRegistry w(String string) throws CompilationDiagnosticException {
        return this.g(TypeInspectionUtility.M(string), false);
    }

    private ConfigurationManager2183 X(MetaclassDefinitionRegistry metaclassDefinitionRegistry, String string, int[] nArray, int[] nArray2, String[] stringArray, boolean bl) throws CompilationDiagnosticException {
        ConfigurationManager2183 configurationManager2183 = null;
        ClassMetadataExtractor classMetadataExtractor = metaclassDefinitionRegistry.o();
        if (classMetadataExtractor != null) {
            List<BytecodeInspectionEngine> list = classMetadataExtractor.L();
            for (BytecodeInspectionEngine metaclassDefinitionRegistryArray2 : list) {
                try {
                    if (!metaclassDefinitionRegistryArray2.C().equals(string) || (metaclassDefinitionRegistryArray2.Z() & 0x40) != 0) continue;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw TypeInspectionUtility.a(customRuntimeException);
                }
                int n = this.j(metaclassDefinitionRegistryArray2.b(), nArray, nArray2, stringArray);
                if (n == -1) continue;
                ConfigurationManager2183 configurationManager21832 = new ConfigurationManager2183(metaclassDefinitionRegistry, metaclassDefinitionRegistryArray2, n);
                try {
                    if (n == 0) {
                        return configurationManager21832;
                    }
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw TypeInspectionUtility.a(customRuntimeException);
                }
                try {
                    if (configurationManager2183 != null && configurationManager2183.f <= n) continue;
                }
                catch (CustomRuntimeException customRuntimeException) {
                    throw TypeInspectionUtility.a(customRuntimeException);
                }
                configurationManager2183 = configurationManager21832;
            }
        }
        if (bl) {
            configurationManager2183 = null;
        } else {
            try {
                if (configurationManager2183 != null) {
                    return configurationManager2183;
                }
            }
            catch (CustomRuntimeException customRuntimeException) {
                throw TypeInspectionUtility.a(customRuntimeException);
            }
        }
        int n = metaclassDefinitionRegistry.a();
        boolean bl2 = ConfigurationOrchestrator2115.E(n);
        try {
            ConfigurationManager2183 configurationManager21833;
            MetaclassDefinitionRegistry customRuntimeException;
            if (!bl2 && (customRuntimeException = metaclassDefinitionRegistry.G()) != null && (configurationManager21833 = this.X(customRuntimeException, string, nArray, nArray2, stringArray, bl)) != null) {
                return configurationManager21833;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            // empty catch block
        }
        try {
            ConfigurationManager2183 configurationManager21834;
            MetaclassDefinitionRegistry[] metaclassDefinitionRegistryArray;
            Object object = metaclassDefinitionRegistryArray = metaclassDefinitionRegistry.l();
            int n2 = ((MetaclassDefinitionRegistry[])object).length;
            for (int i = 0; i < n2; ++i) {
                MetaclassDefinitionRegistry metaclassDefinitionRegistry2 = object[i];
                ConfigurationManager2183 configurationManager21835 = this.X(metaclassDefinitionRegistry2, string, nArray, nArray2, stringArray, bl);
                if (configurationManager21835 == null) continue;
                return configurationManager21835;
            }
            if (bl2 && (object = metaclassDefinitionRegistry.G()) != null && (configurationManager21834 = this.X((MetaclassDefinitionRegistry)object, string, nArray, nArray2, stringArray, bl)) != null) {
                return configurationManager21834;
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            // empty catch block
        }
        return configurationManager2183;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MetaclassDefinitionRegistry g(String string, boolean bl) throws CompilationDiagnosticException {
        Map<String, String> map = this.J();
        String string2 = map.get(string);
        try {
            if (string2 == "<invalid>") {
                throw new CompilationDiagnosticException("no such class: " + string);
            }
        }
        catch (CustomRuntimeException customRuntimeException) {
            throw TypeInspectionUtility.a(customRuntimeException);
        }
        try {
            if (string2 != null) {
                try {
                    return this.j.g(string2);
                }
                catch (CustomRuntimeException customRuntimeException) {
                    // empty catch block
                }
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw TypeInspectionUtility.a(compilationDiagnosticException);
        }
        MetaclassDefinitionRegistry metaclassDefinitionRegistry = null;
        try {
            metaclassDefinitionRegistry = this.m(string, bl);
        }
        catch (CustomRuntimeException customRuntimeException) {
            metaclassDefinitionRegistry = this.M(string);
        }
        map.put(string, metaclassDefinitionRegistry.H());
        return metaclassDefinitionRegistry;
    }

    public String t(eF eF2) throws CompilationDiagnosticException {
        try {
            if (eF2 == null) {
                return null;
            }
        }
        catch (CompilationDiagnosticException compilationDiagnosticException) {
            throw TypeInspectionUtility.a(compilationDiagnosticException);
        }
        return TypeInspectionUtility.i(this.V(eF2).H());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Map<String, String> J() {
        Map<String, String> map = this.d;
        if (map != null) return map;
        Class<TypeInspectionUtility> clazz = TypeInspectionUtility.class;
        synchronized (TypeInspectionUtility.class) {
            Reference<Map<String, String>> reference = P.get(this.j);
            if (reference != null) {
                map = reference.get();
            }
            if (map == null) {
                map = new Hashtable<String, String>();
                P.put(this.j, new WeakReference<Map<String, String>>(map));
            }
            // ** MonitorExit[var2_2] (shouldn't be in output)
            this.d = map;
            return map;
        }
    }
}

