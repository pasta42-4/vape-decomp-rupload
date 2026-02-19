/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.UnmodifiableView
 */
package com.system.error;

import com.app.caching.CacheInvalidationTrigger;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.notification.dispatch.NotificationDispatchInterface2673;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnmodifiableView;

public final class ErrorResilienceProtocol
extends Enum<ErrorResilienceProtocol>
implements NotificationDispatchInterface2673,
CacheInvalidationTrigger {
    public static final /* enum */ ErrorResilienceProtocol GREATHER_THAN_OR_EQUAL;
    private final String Y;
    private static String[] p;
    private final String l;
    public static final /* enum */ ErrorResilienceProtocol NOT_EQUAL;
    public static final /* enum */ ErrorResilienceProtocol GREATER_THAN;
    public static final @UnmodifiableView List<ErrorResilienceProtocol> VALUES;
    private static final Object[] a;
    public static final /* enum */ ErrorResilienceProtocol LESS_THAN_OR_EQUAL;
    private static final ErrorResilienceProtocol[] f;
    private static final String[] b;
    public static final /* enum */ ErrorResilienceProtocol LESS_THAN;
    public static final /* enum */ ErrorResilienceProtocol EQUALS;

    public static String[] o() {
        return p;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ErrorResilienceProtocol.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private ErrorResilienceProtocol(String string2, String string3) {
        this.Y = string2;
        this.l = string3;
    }

    /*
     * Exception decompiling
     */
    public boolean B(double var1_1, double var3_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 7[SWITCH]
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ErrorResilienceProtocol.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ErrorResilienceProtocol.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static ErrorResilienceProtocol[] values() {
        return (ErrorResilienceProtocol[])f.clone();
    }

    public static void A(String[] stringArray) {
        p = stringArray;
    }

    private static Method d(long l, long l2) {
        int n = ErrorResilienceProtocol.a(l, l2);
        Object object = a[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = b[n];
                int n3 = string2.indexOf(8);
                clazz3 = ErrorResilienceProtocol.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = ErrorResilienceProtocol.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ErrorResilienceProtocol.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ErrorResilienceProtocol.a[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ErrorResilienceProtocol.b(249043890250574L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ErrorResilienceProtocol.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ErrorResilienceProtocol.a[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ErrorResilienceProtocol.b(249043890250574L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    @Nullable
    public static ErrorResilienceProtocol d(String string) {
        for (ErrorResilienceProtocol errorResilienceProtocol : VALUES) {
            try {
                if (!errorResilienceProtocol.O().equalsIgnoreCase(string)) continue;
                return errorResilienceProtocol;
            }
            catch (CustomSystemException customSystemException) {
                throw ErrorResilienceProtocol.a(customSystemException);
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ErrorResilienceProtocol.a(l, l2);
            object = a[n];
            try {
                if (!(object instanceof String)) break block2;
                ErrorResilienceProtocol.a[n] = clazz = Class.forName(b[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Exception decompiling
     */
    public boolean W(int var1_1, int var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 7[SWITCH]
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

    @Override
    public String e() {
        return this.l;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    public static ErrorResilienceProtocol I(String string, ErrorResilienceProtocol errorResilienceProtocol) {
        ErrorResilienceProtocol errorResilienceProtocol2;
        ErrorResilienceProtocol errorResilienceProtocol3 = ErrorResilienceProtocol.d(string);
        try {
            errorResilienceProtocol2 = errorResilienceProtocol3 == null ? errorResilienceProtocol : errorResilienceProtocol3;
        }
        catch (CustomSystemException customSystemException) {
            throw ErrorResilienceProtocol.a(customSystemException);
        }
        return errorResilienceProtocol2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = a;
        a[0] = "X\u0000p";
        objectArray[1] = Integer.TYPE;
        ErrorResilienceProtocol.b[1] = "java/lang/Integer";
        objectArray[2] = "6SAbAf=\\P-<~.[Yd";
        objectArray[3] = "|7\\Y\"xw8M\u0016Cv|3IL";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "C\u0007HYZ\u0004Y\u0001\n`TG&\u001b\u0001\u0000\u000f\u0003\u001f\f\u0002\u001e?\u0006\u001c\u001f\t\u0006TF\u001a\u001f\u000b`";
    }

    @Override
    public String O() {
        return this.Y;
    }

    private static Field c(long l, long l2) {
        int n = ErrorResilienceProtocol.a(l, l2);
        Object object = a[n];
        if (object instanceof String) {
            String string = b[n];
            int n2 = string.indexOf(8);
            Class clazz = ErrorResilienceProtocol.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ErrorResilienceProtocol.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ErrorResilienceProtocol.a(clazz3, string2, clazz2)) != null) {
                    ErrorResilienceProtocol.a[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ErrorResilienceProtocol.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ErrorResilienceProtocol.a[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ErrorResilienceProtocol.b(249043890250574L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c4' || c == '\u00ee' || c == 'o' || c == 'B') {
                field = ErrorResilienceProtocol.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ErrorResilienceProtocol.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'D' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Exception decompiling
     */
    public boolean O(short var1_1, short var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 7[SWITCH]
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

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block9: {
                var11 = MultiContainerRegistry.a(1323278438783521978L, 3377201844368874590L, MethodHandles.lookup().lookupClass()).a(18751318979570L) ^ 97850654598914L;
                ErrorResilienceProtocol.a = new Object[5];
                ErrorResilienceProtocol.b = new String[5];
                ErrorResilienceProtocol.a();
                if (ErrorResilienceProtocol.o() == null) {
                    ErrorResilienceProtocol.A(new String[5]);
                }
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[18];
                var4_4 = 0;
                var5_5 = "\u00c4\u00b9\u001bjw\u00f5G\u00de\u00f2(\u0088\u00bf\u00ed\u0099\u00c1\u008b\u0084\u0002Ji\u00aa\u00f26%G+\u00a7|1\u00fa\u001aEy\u00ee\u00c8>\u0096\u00cf\u001eA6\u00f1\u00ae|\u00fc\u00b6\u00ce\u00e3|\u00d0\u00e7\u00c2Z\u0083\u008dk\u00b7\u00dcN\u00b1OW1\u0088\u0014\u0006`\u00e6\t\u0014\f\u00c9\u0096#\u00d4\u00c9\u00f4\u009e\u0089\ry\u0000\u00c0uc;\u008e\u00a9;\u00e1\u001c9D%\u0005\t\u0016n\u001e7`\u0011\u0083+\u00fbT\u00fe#\u001d\u001fH\u00a4i\u00d1\u0094\u00d1\taM\u00c7\u00a5\u00ceS\u00ceE\u000e\u00a8b";
                var6_6 = "\u00c4\u00b9\u001bjw\u00f5G\u00de\u00f2(\u0088\u00bf\u00ed\u0099\u00c1\u008b\u0084\u0002Ji\u00aa\u00f26%G+\u00a7|1\u00fa\u001aEy\u00ee\u00c8>\u0096\u00cf\u001eA6\u00f1\u00ae|\u00fc\u00b6\u00ce\u00e3|\u00d0\u00e7\u00c2Z\u0083\u008dk\u00b7\u00dcN\u00b1OW1\u0088\u0014\u0006`\u00e6\t\u0014\f\u00c9\u0096#\u00d4\u00c9\u00f4\u009e\u0089\ry\u0000\u00c0uc;\u008e\u00a9;\u00e1\u001c9D%\u0005\t\u0016n\u001e7`\u0011\u0083+\u00fbT\u00fe#\u001d\u001fH\u00a4i\u00d1\u0094\u00d1\taM\u00c7\u00a5\u00ceS\u00ceE\u000e\u00a8b".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block9;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "@\u00d1\u00cdX]j\u0099\u0013\u00de\u0089?D\u00ba\u00bd\u009c%";
                    var6_6 = "@\u00d1\u00cdX]j\u0099\u0013\u00de\u0089?D\u00ba\u00bd\u009c%".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block9;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block10;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl55:
                // 1 sources

                ** continue;
            }
        }
        ErrorResilienceProtocol.EQUALS = new ErrorResilienceProtocol((String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[2]), (long)-2248724195466816L, (long)var11), (String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[5]), (long)-2248724195466816L, (long)var11));
        ErrorResilienceProtocol.NOT_EQUAL = new ErrorResilienceProtocol((String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[9]), (long)-2248724195466816L, (long)var11), (String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[7]), (long)-2248724195466816L, (long)var11));
        ErrorResilienceProtocol.GREATER_THAN = new ErrorResilienceProtocol((String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[8]), (long)-2248724195466816L, (long)var11), (String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[6]), (long)-2248724195466816L, (long)var11));
        ErrorResilienceProtocol.GREATHER_THAN_OR_EQUAL = new ErrorResilienceProtocol((String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[13]), (long)-2248724195466816L, (long)var11), (String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[3]), (long)-2248724195466816L, (long)var11));
        ErrorResilienceProtocol.LESS_THAN = new ErrorResilienceProtocol((String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[0]), (long)-2248724195466816L, (long)var11), (String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[1]), (long)-2248724195466816L, (long)var11));
        ErrorResilienceProtocol.LESS_THAN_OR_EQUAL = new ErrorResilienceProtocol((String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[11]), (long)-2248724195466816L, (long)var11), (String)ErrorResilienceProtocol.a("\u00e3", (int)((int)var0_3[12]), (long)-2248724195466816L, (long)var11));
        ErrorResilienceProtocol.f = new ErrorResilienceProtocol[]{ErrorResilienceProtocol.EQUALS, ErrorResilienceProtocol.NOT_EQUAL, ErrorResilienceProtocol.GREATER_THAN, ErrorResilienceProtocol.GREATHER_THAN_OR_EQUAL, ErrorResilienceProtocol.LESS_THAN, ErrorResilienceProtocol.LESS_THAN_OR_EQUAL};
        ErrorResilienceProtocol.VALUES = Arrays.asList(ErrorResilienceProtocol.values());
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (b[n4] != null) {
            return n4;
        }
        Object object = a[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 30;
                break;
            }
            case 1: {
                n3 = 1;
                break;
            }
            case 2: {
                n3 = 26;
                break;
            }
            case 3: {
                n3 = 25;
                break;
            }
            case 4: {
                n3 = 57;
                break;
            }
            case 5: {
                n3 = 24;
                break;
            }
            case 6: {
                n3 = 8;
                break;
            }
            case 7: {
                n3 = 59;
                break;
            }
            case 8: {
                n3 = 31;
                break;
            }
            case 9: {
                n3 = 9;
                break;
            }
            case 10: {
                n3 = 36;
                break;
            }
            case 11: {
                n3 = 37;
                break;
            }
            case 12: {
                n3 = 29;
                break;
            }
            case 13: {
                n3 = 39;
                break;
            }
            case 14: {
                n3 = 5;
                break;
            }
            case 15: {
                n3 = 11;
                break;
            }
            case 16: {
                n3 = 52;
                break;
            }
            case 17: {
                n3 = 32;
                break;
            }
            case 18: {
                n3 = 6;
                break;
            }
            case 19: {
                n3 = 15;
                break;
            }
            case 20: {
                n3 = 50;
                break;
            }
            case 21: {
                n3 = 46;
                break;
            }
            case 22: {
                n3 = 48;
                break;
            }
            case 23: {
                n3 = 0;
                break;
            }
            case 24: {
                n3 = 63;
                break;
            }
            case 25: {
                n3 = 22;
                break;
            }
            case 26: {
                n3 = 61;
                break;
            }
            case 27: {
                n3 = 21;
                break;
            }
            case 28: {
                n3 = 28;
                break;
            }
            case 29: {
                n3 = 53;
                break;
            }
            case 30: {
                n3 = 60;
                break;
            }
            case 31: {
                n3 = 40;
                break;
            }
            case 32: {
                n3 = 10;
                break;
            }
            case 33: {
                n3 = 55;
                break;
            }
            case 34: {
                n3 = 19;
                break;
            }
            case 35: {
                n3 = 27;
                break;
            }
            case 36: {
                n3 = 54;
                break;
            }
            case 37: {
                n3 = 49;
                break;
            }
            case 38: {
                n3 = 12;
                break;
            }
            case 39: {
                n3 = 2;
                break;
            }
            case 40: {
                n3 = 20;
                break;
            }
            case 41: {
                n3 = 13;
                break;
            }
            case 42: {
                n3 = 7;
                break;
            }
            case 43: {
                n3 = 45;
                break;
            }
            case 44: {
                n3 = 18;
                break;
            }
            case 45: {
                n3 = 23;
                break;
            }
            case 46: {
                n3 = 16;
                break;
            }
            case 47: {
                n3 = 35;
                break;
            }
            case 48: {
                n3 = 41;
                break;
            }
            case 49: {
                n3 = 42;
                break;
            }
            case 50: {
                n3 = 51;
                break;
            }
            case 51: {
                n3 = 34;
                break;
            }
            case 52: {
                n3 = 38;
                break;
            }
            case 53: {
                n3 = 62;
                break;
            }
            case 54: {
                n3 = 44;
                break;
            }
            case 55: {
                n3 = 3;
                break;
            }
            case 56: {
                n3 = 58;
                break;
            }
            case 57: {
                n3 = 4;
                break;
            }
            case 58: {
                n3 = 33;
                break;
            }
            case 59: {
                n3 = 17;
                break;
            }
            case 60: {
                n3 = 43;
                break;
            }
            case 61: {
                n3 = 56;
                break;
            }
            case 62: {
                n3 = 14;
                break;
            }
            default: {
                n3 = 47;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        ErrorResilienceProtocol.b[n4] = new String(cArray);
        return n4;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ErrorResilienceProtocol.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ErrorResilienceProtocol.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Jt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static ErrorResilienceProtocol B(String string) {
        return ErrorResilienceProtocol.I(string, EQUALS);
    }

    public static ErrorResilienceProtocol valueOf(String string) {
        return Enum.valueOf(ErrorResilienceProtocol.class, string);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ErrorResilienceProtocol.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

