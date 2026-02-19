/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package com.context.negotiation;

import com.collections.management.MultiContainerRegistry;
import com.security.algorithm.CryptoAlgorithmRegistry851;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class DynamicContextNegotiator {
    public static CryptoAlgorithmRegistry851 J;
    public static String x;
    private static final String[] g;
    private static final Object[] e;
    private static final Map d;
    public static String f;
    private static final long[] b;
    private static final long a;
    private static final Integer[] c;

    private static void X() {
        long l = a ^ 0x6B9477AA702AL;
        try {
            TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)2551, (long)(0x58BA7563231072F2L ^ l)), (long)-7973797497126164408L, (long)l)) + GL11.glGetInteger((int)3379));
            TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)16005, (long)(0x41207F8A5906C590L ^ l)), (long)-7973797497126164408L, (long)l)) + GL11.glGetInteger((int)DynamicContextNegotiator.a("z", (int)25030, (long)(0x24634994CC6D1AD2L ^ l))));
            TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)16433, (long)(0x4310E5C63257BB35L ^ l)), (long)-7973797497126164408L, (long)l)) + GL11.glGetInteger((int)DynamicContextNegotiator.a("z", (int)2464, (long)(0x61D474EF947372B8L ^ l))));
            TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)27514, (long)(0x708892EF31611068L ^ l)), (long)-7973797497126164408L, (long)l)) + GL11.glGetInteger((int)DynamicContextNegotiator.a("z", (int)4571, (long)(0x27F2E41186196ADCL ^ l))));
            TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)29140, (long)(0x344ED1F0D6BC0AC3L ^ l)), (long)-7973797497126164408L, (long)l)) + GL11.glGetInteger((int)3386));
            TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)16363, (long)(0x14C46CCB4BA44F6L ^ l)), (long)-7973797497126164408L, (long)l)) + GL11.glGetInteger((int)DynamicContextNegotiator.a("z", (int)10103, (long)(0x773C3B2ACFC1DC7BL ^ l))));
            TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)20353, (long)(0x60F274BC78DB349BL ^ l)), (long)-7973797497126164408L, (long)l)) + GL11.glGetInteger((int)DynamicContextNegotiator.a("z", (int)17072, (long)(0x58DA3FD594A0B9A9L ^ l))));
        }
        catch (Exception exception) {
            TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)27285, (long)(0x2E201579FA3E918AL ^ l)), (long)-7973797497126164408L, (long)l)) + exception.getMessage());
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DynamicContextNegotiator.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DynamicContextNegotiator.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method d(long l, long l2) {
        int n = DynamicContextNegotiator.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = DynamicContextNegotiator.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DynamicContextNegotiator.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DynamicContextNegotiator.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        DynamicContextNegotiator.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DynamicContextNegotiator.b(251146750664154L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DynamicContextNegotiator.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DynamicContextNegotiator.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DynamicContextNegotiator.b(251146750664154L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DynamicContextNegotiator.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void y() {
        long l = a ^ 0x2154B0AD28A7L;
        try {
            Object object;
            Object object2;
            String string = GL11.glGetString((int)7937);
            String string2 = GL11.glGetString((int)7936);
            String string3 = GL11.glGetString((int)7938);
            try {
                object2 = string != null ? string : DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)25523, (long)(0x6C66E7470E11C02DL ^ l)), (long)-3901758106612125499L, (long)l);
            }
            catch (Exception exception) {
                throw DynamicContextNegotiator.a(exception);
            }
            try {
                f = object2;
                object = string3 != null ? string3 : DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)30473, (long)(0x263225401795D495L ^ l)), (long)-3901758106612125499L, (long)l);
            }
            catch (Exception exception) {
                throw DynamicContextNegotiator.a(exception);
            }
            x = object;
            J = DynamicContextNegotiator.U(string2);
        }
        catch (Exception exception) {
            TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)28469, (long)(0x459FF183B91E4CB5L ^ l)), (long)-3901758106612125499L, (long)l)) + exception.getMessage());
        }
    }

    private static Field c(long l, long l2) {
        int n = DynamicContextNegotiator.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = DynamicContextNegotiator.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DynamicContextNegotiator.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DynamicContextNegotiator.a(clazz3, string2, clazz2)) != null) {
                    DynamicContextNegotiator.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DynamicContextNegotiator.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DynamicContextNegotiator.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DynamicContextNegotiator.b(251146750664154L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Exception decompiling
     */
    private static CryptoAlgorithmRegistry851 U(String var0) {
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/R6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 58;
                break;
            }
            case 1: {
                n3 = 6;
                break;
            }
            case 2: {
                n3 = 54;
                break;
            }
            case 3: {
                n3 = 10;
                break;
            }
            case 4: {
                n3 = 30;
                break;
            }
            case 5: {
                n3 = 37;
                break;
            }
            case 6: {
                n3 = 35;
                break;
            }
            case 7: {
                n3 = 39;
                break;
            }
            case 8: {
                n3 = 36;
                break;
            }
            case 9: {
                n3 = 2;
                break;
            }
            case 10: {
                n3 = 61;
                break;
            }
            case 11: {
                n3 = 51;
                break;
            }
            case 12: {
                n3 = 55;
                break;
            }
            case 13: {
                n3 = 26;
                break;
            }
            case 14: {
                n3 = 17;
                break;
            }
            case 15: {
                n3 = 59;
                break;
            }
            case 16: {
                n3 = 31;
                break;
            }
            case 17: {
                n3 = 9;
                break;
            }
            case 18: {
                n3 = 38;
                break;
            }
            case 19: {
                n3 = 27;
                break;
            }
            case 20: {
                n3 = 19;
                break;
            }
            case 21: {
                n3 = 0;
                break;
            }
            case 22: {
                n3 = 52;
                break;
            }
            case 23: {
                n3 = 62;
                break;
            }
            case 24: {
                n3 = 44;
                break;
            }
            case 25: {
                n3 = 45;
                break;
            }
            case 26: {
                n3 = 12;
                break;
            }
            case 27: {
                n3 = 23;
                break;
            }
            case 28: {
                n3 = 8;
                break;
            }
            case 29: {
                n3 = 34;
                break;
            }
            case 30: {
                n3 = 57;
                break;
            }
            case 31: {
                n3 = 48;
                break;
            }
            case 32: {
                n3 = 18;
                break;
            }
            case 33: {
                n3 = 63;
                break;
            }
            case 34: {
                n3 = 28;
                break;
            }
            case 35: {
                n3 = 49;
                break;
            }
            case 36: {
                n3 = 47;
                break;
            }
            case 37: {
                n3 = 1;
                break;
            }
            case 38: {
                n3 = 60;
                break;
            }
            case 39: {
                n3 = 43;
                break;
            }
            case 40: {
                n3 = 3;
                break;
            }
            case 41: {
                n3 = 50;
                break;
            }
            case 42: {
                n3 = 4;
                break;
            }
            case 43: {
                n3 = 56;
                break;
            }
            case 44: {
                n3 = 5;
                break;
            }
            case 45: {
                n3 = 20;
                break;
            }
            case 46: {
                n3 = 29;
                break;
            }
            case 47: {
                n3 = 24;
                break;
            }
            case 48: {
                n3 = 21;
                break;
            }
            case 49: {
                n3 = 41;
                break;
            }
            case 50: {
                n3 = 25;
                break;
            }
            case 51: {
                n3 = 11;
                break;
            }
            case 52: {
                n3 = 40;
                break;
            }
            case 53: {
                n3 = 15;
                break;
            }
            case 54: {
                n3 = 46;
                break;
            }
            case 55: {
                n3 = 32;
                break;
            }
            case 56: {
                n3 = 42;
                break;
            }
            case 57: {
                n3 = 33;
                break;
            }
            case 58: {
                n3 = 14;
                break;
            }
            case 59: {
                n3 = 16;
                break;
            }
            case 60: {
                n3 = 13;
                break;
            }
            case 61: {
                n3 = 7;
                break;
            }
            case 62: {
                n3 = 53;
                break;
            }
            default: {
                n3 = 22;
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
        DynamicContextNegotiator.g[n4] = new String(cArray);
        return n4;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'F' || c == '\u00ea' || c == '\u00a4' || c == '\u00e0') {
                field = DynamicContextNegotiator.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'F' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ea' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DynamicContextNegotiator.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void R() {
        long l = a ^ 0x4A7D16D2283EL;
        TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)9970, (long)(0x583376401DE785FDL ^ l)), (long)-3944237908644515748L, (long)l)));
        TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)8689, (long)(0x716C5EF0AE2302E4L ^ l)), (long)-3944237908644515748L, (long)l)) + J.name());
        TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)18693, (long)(0x57FA4123FA1AEA12L ^ l)), (long)-3944237908644515748L, (long)l)) + f);
        TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)8447, (long)(0x23D62A6B851203FDL ^ l)), (long)-3944237908644515748L, (long)l)) + x);
        TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)2127, (long)(0x6298807811712B54L ^ l)), (long)-3944237908644515748L, (long)l)));
        DynamicContextNegotiator.X();
        TemporalMetadataResolver.x((String)((Object)DynamicContextNegotiator.b("\u00dc", (int)DynamicContextNegotiator.a("z", (int)8958, (long)(0x4E3777B0033D81EAL ^ l)), (long)-3944237908644515748L, (long)l)));
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A43;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/R6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DynamicContextNegotiator.c[n2] = n3;
        }
        return c[n2];
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DynamicContextNegotiator.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DynamicContextNegotiator.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                DynamicContextNegotiator.e[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = DynamicContextNegotiator.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DynamicContextNegotiator.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "LPc";
        objectArray[1] = Integer.TYPE;
        DynamicContextNegotiator.g[1] = "java/lang/Integer";
        objectArray[2] = "e\fF{A7n\u0003W4</}\u0004^}";
        objectArray[3] = "\u0006hS.4U\rgBaU[\u0006lF;";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "t\u0010!SZ[~\u0014`(T\u0010\u0019\u000fcOT\u0001|\u0010)\u0011?R`\u0010fDS\n\u007f\u00134(";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/R6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DynamicContextNegotiator.a = MultiContainerRegistry.a(6511618779698421530L, 4978966324376606878L, MethodHandles.lookup().lookupClass()).a(91721676830120L);
                DynamicContextNegotiator.e = new Object[5];
                DynamicContextNegotiator.g = new String[5];
                DynamicContextNegotiator.a();
                DynamicContextNegotiator.d = new HashMap<K, V>(13);
                var0 = DynamicContextNegotiator.a ^ 7089806534562L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[27];
                var5_4 = 0;
                var6_5 = "\u00ce\u00fc\u00b8\u00c6\u00be\u00de\u00c88\u0091\u00ec$|\u00bf\u00b7\u0086n\u00cc\u00c0 H4\u00d7w\u00ed\u008b\u00b0\u007fK\u0099%\u00fd\u001bVE\u00a1\u00ed\u00a9\u0082\u000b\u0085\u00bc\u0093\u00b7\u00f1\u00e1v|\u0085\u00b3A^B\u00f6\u00a8`\u00bc\r\u00a3e\u00d2\u00c7\u001b]\u0098\u001e\u00bb\u00cb\u00a2\u0083\u00b97\u00ae\u0081\u0090f\u00f4\u001d\u001c\u00fd\u00aaR@84\u00d9\u00aa\u00da\u0016\u00fe\u0093\u00cf\u0013<c%\u00b3\u009f^^`\u0010Y\u00ec\u009c\u00134\u00a1B\u00a0`|\u0092\u00e6\u00a6\u00c8\u00d9\u00d1\u0006GW\u0003BU\u00b63@\u0017bR\u0019\u001f\u00d0d\r\u00acs#\u00d7\u00d3$U\u008d>\u00b7\r^7u<A\u00b5$q8\u0014\u00aa\u00a6\u00cfq)x\u00d3qWH\u00f8W\u00b8D\u00bd\u00ee\u00ee\u00b7\u0002\u00ff\u001e.y2\u00ed\u0092\u00d5D\u00ff\u00b82D\u008c\u00c3\n\u00bfdE\u00f6C\u00190\u00aa\u00f5\u00a4";
                var7_6 = "\u00ce\u00fc\u00b8\u00c6\u00be\u00de\u00c88\u0091\u00ec$|\u00bf\u00b7\u0086n\u00cc\u00c0 H4\u00d7w\u00ed\u008b\u00b0\u007fK\u0099%\u00fd\u001bVE\u00a1\u00ed\u00a9\u0082\u000b\u0085\u00bc\u0093\u00b7\u00f1\u00e1v|\u0085\u00b3A^B\u00f6\u00a8`\u00bc\r\u00a3e\u00d2\u00c7\u001b]\u0098\u001e\u00bb\u00cb\u00a2\u0083\u00b97\u00ae\u0081\u0090f\u00f4\u001d\u001c\u00fd\u00aaR@84\u00d9\u00aa\u00da\u0016\u00fe\u0093\u00cf\u0013<c%\u00b3\u009f^^`\u0010Y\u00ec\u009c\u00134\u00a1B\u00a0`|\u0092\u00e6\u00a6\u00c8\u00d9\u00d1\u0006GW\u0003BU\u00b63@\u0017bR\u0019\u001f\u00d0d\r\u00acs#\u00d7\u00d3$U\u008d>\u00b7\r^7u<A\u00b5$q8\u0014\u00aa\u00a6\u00cfq)x\u00d3qWH\u00f8W\u00b8D\u00bd\u00ee\u00ee\u00b7\u0002\u00ff\u001e.y2\u00ed\u0092\u00d5D\u00ff\u00b82D\u008c\u00c3\n\u00bfdE\u00f6C\u00190\u00aa\u00f5\u00a4".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "B Y\u00b1.\u001b\u00c3,\u00904B\u000494V\u00b4";
                    var7_6 = "B Y\u00b1.\u001b\u00c3,\u00904B\u000494V\u00b4".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl42:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
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
        DynamicContextNegotiator.b = var8_3;
        DynamicContextNegotiator.c = new Integer[27];
        DynamicContextNegotiator.J = CryptoAlgorithmRegistry851.UNKNOWN;
        DynamicContextNegotiator.x = null;
        DynamicContextNegotiator.f = null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DynamicContextNegotiator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(DynamicContextNegotiator.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

