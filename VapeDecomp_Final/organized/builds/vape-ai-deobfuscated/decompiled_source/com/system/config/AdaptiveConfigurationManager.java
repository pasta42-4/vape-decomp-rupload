/*
 * Decompiled with CFR 0.152.
 */
package com.system.config;

import a.Dv;
import com.algorithm.optimization.AdaptiveComputationEngine;
import com.collections.management.MultiContainerRegistry;
import com.math.geometry.GeometryCalculator;
import com.persistence.context.PersistenceContextManager;
import com.security.crypto.CryptographicTransformationEngine;
import com.system.lifecycle.ObjectLifecycleTracker;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class AdaptiveConfigurationManager
extends ObjectLifecycleTracker {
    private static AdaptiveConfigurationManager Z;
    private static final String[] o;
    private Integer x;
    private static AdaptiveConfigurationManager e;
    public static final int W;
    private static final Map g;
    private AdaptiveConfigurationManager m;
    private static AdaptiveConfigurationManager S;
    private static AdaptiveConfigurationManager V;
    private static final Integer[] d;
    private static AdaptiveConfigurationManager[] B;
    public static final int Y;
    private static final long[] c;
    private static AdaptiveConfigurationManager D;
    private static AdaptiveConfigurationManager N;
    private static final Object[] h;
    public static final int y = 0;
    private Dv k;
    private static AdaptiveConfigurationManager[] i;
    private static final long b;
    public static final int O;
    private Integer K;
    public static final int w;
    public static final int a = 1;

    public static AdaptiveConfigurationManager C(int n) {
        AdaptiveConfigurationManager[] adaptiveConfigurationManagerArray = AdaptiveConfigurationManager.Y();
        return adaptiveConfigurationManagerArray[AdaptiveComputationEngine.L(n % adaptiveConfigurationManagerArray.length)];
    }

    public int i() {
        return this.n().j();
    }

    public int P() {
        return this.n().o();
    }

    public AdaptiveConfigurationManager z() {
        block2: {
            int n;
            block4: {
                block3: {
                    try {
                        if (this.m != null) break block2;
                        if (GeometryCalculator.C() <= 13) break block3;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw AdaptiveConfigurationManager.a(illegalStateException);
                    }
                    n = AdaptiveConfigurationManager.U.u().GF.E(this.H);
                    break block4;
                }
                n = AdaptiveConfigurationManager.U.u().GF.T(this.H);
            }
            this.m = AdaptiveConfigurationManager.d(n);
        }
        return this.m;
    }

    public int p() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.K != null) break block4;
                        if (GeometryCalculator.C() <= 13) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw AdaptiveConfigurationManager.a(illegalStateException);
                    }
                    this.K = AdaptiveConfigurationManager.U.u().GF.R(this.H);
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw AdaptiveConfigurationManager.a(illegalStateException);
                }
            }
            this.K = AdaptiveConfigurationManager.U.u().GF.V(this.H);
        }
        return this.K;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (o[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 25;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 13;
                break;
            }
            case 3: {
                n3 = 47;
                break;
            }
            case 4: {
                n3 = 26;
                break;
            }
            case 5: {
                n3 = 24;
                break;
            }
            case 6: {
                n3 = 20;
                break;
            }
            case 7: {
                n3 = 10;
                break;
            }
            case 8: {
                n3 = 53;
                break;
            }
            case 9: {
                n3 = 62;
                break;
            }
            case 10: {
                n3 = 15;
                break;
            }
            case 11: {
                n3 = 21;
                break;
            }
            case 12: {
                n3 = 46;
                break;
            }
            case 13: {
                n3 = 14;
                break;
            }
            case 14: {
                n3 = 44;
                break;
            }
            case 15: {
                n3 = 7;
                break;
            }
            case 16: {
                n3 = 5;
                break;
            }
            case 17: {
                n3 = 48;
                break;
            }
            case 18: {
                n3 = 17;
                break;
            }
            case 19: {
                n3 = 0;
                break;
            }
            case 20: {
                n3 = 16;
                break;
            }
            case 21: {
                n3 = 6;
                break;
            }
            case 22: {
                n3 = 38;
                break;
            }
            case 23: {
                n3 = 60;
                break;
            }
            case 24: {
                n3 = 31;
                break;
            }
            case 25: {
                n3 = 8;
                break;
            }
            case 26: {
                n3 = 40;
                break;
            }
            case 27: {
                n3 = 27;
                break;
            }
            case 28: {
                n3 = 36;
                break;
            }
            case 29: {
                n3 = 37;
                break;
            }
            case 30: {
                n3 = 54;
                break;
            }
            case 31: {
                n3 = 52;
                break;
            }
            case 32: {
                n3 = 1;
                break;
            }
            case 33: {
                n3 = 61;
                break;
            }
            case 34: {
                n3 = 4;
                break;
            }
            case 35: {
                n3 = 19;
                break;
            }
            case 36: {
                n3 = 29;
                break;
            }
            case 37: {
                n3 = 43;
                break;
            }
            case 38: {
                n3 = 30;
                break;
            }
            case 39: {
                n3 = 9;
                break;
            }
            case 40: {
                n3 = 50;
                break;
            }
            case 41: {
                n3 = 51;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 2;
                break;
            }
            case 44: {
                n3 = 56;
                break;
            }
            case 45: {
                n3 = 12;
                break;
            }
            case 46: {
                n3 = 22;
                break;
            }
            case 47: {
                n3 = 33;
                break;
            }
            case 48: {
                n3 = 34;
                break;
            }
            case 49: {
                n3 = 41;
                break;
            }
            case 50: {
                n3 = 59;
                break;
            }
            case 51: {
                n3 = 32;
                break;
            }
            case 52: {
                n3 = 55;
                break;
            }
            case 53: {
                n3 = 39;
                break;
            }
            case 54: {
                n3 = 23;
                break;
            }
            case 55: {
                n3 = 49;
                break;
            }
            case 56: {
                n3 = 28;
                break;
            }
            case 57: {
                n3 = 35;
                break;
            }
            case 58: {
                n3 = 18;
                break;
            }
            case 59: {
                n3 = 57;
                break;
            }
            case 60: {
                n3 = 11;
                break;
            }
            case 61: {
                n3 = 3;
                break;
            }
            case 62: {
                n3 = 42;
                break;
            }
            default: {
                n3 = 58;
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
        AdaptiveConfigurationManager.o[n4] = new String(cArray);
        return n4;
    }

    public static AdaptiveConfigurationManager y() {
        try {
            if (Z == null) {
                Z = new AdaptiveConfigurationManager(PersistenceContextManager.N(AdaptiveConfigurationManager.U.u().GF).Z(null));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw AdaptiveConfigurationManager.a(illegalStateException);
        }
        return Z;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                AdaptiveConfigurationManager.b = MultiContainerRegistry.a(-13158824564473086L, 2694762471045110287L, MethodHandles.lookup().lookupClass()).a(42473905529127L);
                AdaptiveConfigurationManager.h = new Object[5];
                AdaptiveConfigurationManager.o = new String[5];
                AdaptiveConfigurationManager.a();
                AdaptiveConfigurationManager.g = new HashMap<K, V>(13);
                var0 = AdaptiveConfigurationManager.b ^ 79666650538518L;
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
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u00act\u0000\u0004|\u00dd*\u0087\u00caL\bZ\u00af'\u00e3\u0085\u00bfn\u0083\u0096\u00d4O\u0097a\u00d5`\u00d8d]j\u00a2\u00bbS\"\u0002(\u0097\u00bed \u00db\u008b\u008c\u0014\u0012\"\u0017Z>7\u00fb\u00c9\u00b5)\u0018\u00b9\u0097bd\u00dc#\u00b2\u00e3eq\u00a0\u00bd\u00b6!@\u0003\u00c4";
                var7_6 = "\u00act\u0000\u0004|\u00dd*\u0087\u00caL\bZ\u00af'\u00e3\u0085\u00bfn\u0083\u0096\u00d4O\u0097a\u00d5`\u00d8d]j\u00a2\u00bbS\"\u0002(\u0097\u00bed \u00db\u008b\u008c\u0014\u0012\"\u0017Z>7\u00fb\u00c9\u00b5)\u0018\u00b9\u0097bd\u00dc#\u00b2\u00e3eq\u00a0\u00bd\u00b6!@\u0003\u00c4".length();
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
                    var6_5 = "\u00f2\u00b3\u008c.\u0018d|\t$\u00e5\u00e2W\u00c8\u0017\u00b0+";
                    var7_6 = "\u00f2\u00b3\u008c.\u0018d|\t$\u00e5\u00e2W\u00c8\u0017\u00b0+".length();
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
        AdaptiveConfigurationManager.c = var8_3;
        AdaptiveConfigurationManager.d = new Integer[11];
        AdaptiveConfigurationManager.Y = (int)AdaptiveConfigurationManager.a("r", (int)29132, (long)(var0 ^ 326211287357756800L));
        AdaptiveConfigurationManager.W = (int)AdaptiveConfigurationManager.a("r", (int)1073, (long)(var0 ^ 6619603851942027390L));
        AdaptiveConfigurationManager.w = (int)AdaptiveConfigurationManager.a("r", (int)18520, (long)(var0 ^ 3042878969751907349L));
        AdaptiveConfigurationManager.O = (int)AdaptiveConfigurationManager.a("r", (int)28495, (long)(var0 ^ 9111433447056804614L));
    }

    private static Field g(long l, long l2) {
        int n = AdaptiveConfigurationManager.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = o[n];
            int n2 = string.indexOf(8);
            Class clazz = AdaptiveConfigurationManager.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = AdaptiveConfigurationManager.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = AdaptiveConfigurationManager.c(clazz3, string2, clazz2)) != null) {
                    AdaptiveConfigurationManager.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = AdaptiveConfigurationManager.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        AdaptiveConfigurationManager.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = AdaptiveConfigurationManager.f(277107355744371L, 0L);
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
    public static AdaptiveConfigurationManager k(String var0) {
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

    public Dv n() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.k != null) break block4;
                        if (GeometryCalculator.C() <= 13) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw AdaptiveConfigurationManager.a(illegalStateException);
                    }
                    this.k = new Dv(AdaptiveConfigurationManager.U.u().GF.q(this.H));
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw AdaptiveConfigurationManager.a(illegalStateException);
                }
            }
            int n = AdaptiveConfigurationManager.U.u().GF.a(this.H);
            int n2 = AdaptiveConfigurationManager.U.u().GF.J(this.H);
            int n3 = AdaptiveConfigurationManager.U.u().GF.Q(this.H);
            this.k = new CryptographicTransformationEngine(n, n2, n3);
        }
        return this.k;
    }

    public static AdaptiveConfigurationManager O() {
        try {
            if (S == null) {
                S = new AdaptiveConfigurationManager(PersistenceContextManager.Z(AdaptiveConfigurationManager.U.u().GF).Z(null));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw AdaptiveConfigurationManager.a(illegalStateException);
        }
        return S;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fa' || c == '\u00c4' || c == '\u00a2' || c == 'X') {
                field = AdaptiveConfigurationManager.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = AdaptiveConfigurationManager.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'A' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = AdaptiveConfigurationManager.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static AdaptiveConfigurationManager G() {
        try {
            if (V == null) {
                V = new AdaptiveConfigurationManager(PersistenceContextManager.Q(AdaptiveConfigurationManager.U.u().GF).Z(null));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw AdaptiveConfigurationManager.a(illegalStateException);
        }
        return V;
    }

    public String e() {
        return String.valueOf(AdaptiveConfigurationManager.U.u().GF.x(this.H));
    }

    public static AdaptiveConfigurationManager u() {
        try {
            if (N == null) {
                N = new AdaptiveConfigurationManager(PersistenceContextManager.O(AdaptiveConfigurationManager.U.u().GF).Z(null));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw AdaptiveConfigurationManager.a(illegalStateException);
        }
        return N;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4B1C;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/oo", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            AdaptiveConfigurationManager.d[n2] = n3;
        }
        return d[n2];
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "8NQ";
        objectArray[1] = Integer.TYPE;
        AdaptiveConfigurationManager.o[1] = "java/lang/Integer";
        objectArray[2] = "C8\u0019\u0002,\nH7\bMQ\u0012[0\u0001\u0004";
        objectArray[3] = ",V\u0004(\u0018U'Y\u0015gy[,R\u0011=";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\n=\u000b\u00197h\t/Y\"1/nf\f]79\b3QRdTW0Q\\f(\u0002aRLZ";
    }

    public static AdaptiveConfigurationManager s(double d2) {
        return AdaptiveConfigurationManager.C(AdaptiveComputationEngine.Q(d2 / 90.0 + 0.5) & 3);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = AdaptiveConfigurationManager.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static AdaptiveConfigurationManager[] Y() {
        if (B == null) {
            AdaptiveConfigurationManager[] adaptiveConfigurationManagerArray;
            AdaptiveConfigurationManager[] adaptiveConfigurationManagerArray2;
            block9: {
                adaptiveConfigurationManagerArray2 = new AdaptiveConfigurationManager[4];
                try {
                    if (GeometryCalculator.C() <= 13 || GeometryCalculator.C() >= 35) break block9;
                }
                catch (IllegalStateException illegalStateException) {
                    throw AdaptiveConfigurationManager.a(illegalStateException);
                }
                Object[] objectArray = AdaptiveConfigurationManager.U.u().GF.V();
                try {
                    for (int i = 0; i < objectArray.length; ++i) {
                        adaptiveConfigurationManagerArray2[i] = new AdaptiveConfigurationManager(objectArray[i]);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw AdaptiveConfigurationManager.a(illegalStateException);
                }
            }
            for (AdaptiveConfigurationManager adaptiveConfigurationManager : adaptiveConfigurationManagerArray = AdaptiveConfigurationManager.G()) {
                int n = adaptiveConfigurationManager.g();
                try {
                    if (n == -1) continue;
                    adaptiveConfigurationManagerArray2[n] = adaptiveConfigurationManager;
                }
                catch (IllegalStateException illegalStateException) {
                    throw AdaptiveConfigurationManager.a(illegalStateException);
                }
            }
            B = adaptiveConfigurationManagerArray2;
        }
        return B;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = AdaptiveConfigurationManager.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = AdaptiveConfigurationManager.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/oo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static AdaptiveConfigurationManager d(int n) {
        return AdaptiveConfigurationManager.G()[n];
    }

    public int g() {
        block12: {
            block13: {
                try {
                    try {
                        try {
                            if (this.x != null) break block12;
                            if (GeometryCalculator.C() <= GeometryCalculator.W) break block13;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw AdaptiveConfigurationManager.a(illegalStateException);
                        }
                        if (GeometryCalculator.C() >= 35) break block13;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw AdaptiveConfigurationManager.a(illegalStateException);
                    }
                    this.x = AdaptiveConfigurationManager.U.u().GF.u(this.H);
                    break block12;
                }
                catch (IllegalStateException illegalStateException) {
                    throw AdaptiveConfigurationManager.a(illegalStateException);
                }
            }
            int n = -1;
            switch (this.p()) {
                case 3: {
                    n = 0;
                    break;
                }
                case 4: {
                    n = 1;
                    break;
                }
                case 2: {
                    n = 2;
                    break;
                }
                case 5: {
                    n = 3;
                }
            }
            this.x = n;
        }
        return this.x;
    }

    private static Method h(long l, long l2) {
        int n = AdaptiveConfigurationManager.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n];
                int n3 = string2.indexOf(8);
                clazz3 = AdaptiveConfigurationManager.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = AdaptiveConfigurationManager.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = AdaptiveConfigurationManager.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        AdaptiveConfigurationManager.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = AdaptiveConfigurationManager.f(277107355744371L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = AdaptiveConfigurationManager.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        AdaptiveConfigurationManager.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = AdaptiveConfigurationManager.f(277107355744371L, 0L);
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

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static AdaptiveConfigurationManager F() {
        block4: {
            block5: {
                try {
                    try {
                        if (e != null) break block4;
                        if (GeometryCalculator.C() <= 13) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw AdaptiveConfigurationManager.a(illegalStateException);
                    }
                    e = new AdaptiveConfigurationManager(PersistenceContextManager.Y(AdaptiveConfigurationManager.U.u().GF).Z(null));
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw AdaptiveConfigurationManager.a(illegalStateException);
                }
            }
            e = new AdaptiveConfigurationManager(PersistenceContextManager.h(AdaptiveConfigurationManager.U.u().GF).Z(null));
        }
        return e;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = AdaptiveConfigurationManager.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                AdaptiveConfigurationManager.h[n] = clazz = Class.forName(o[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/oo" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static AdaptiveConfigurationManager[] G() {
        block3: {
            Object[] objectArray;
            block5: {
                block4: {
                    try {
                        if (i != null) break block3;
                        if (GeometryCalculator.C() <= 13) break block4;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw AdaptiveConfigurationManager.a(illegalStateException);
                    }
                    objectArray = AdaptiveConfigurationManager.U.u().GF.r();
                    break block5;
                }
                objectArray = AdaptiveConfigurationManager.U.u().GF.m();
            }
            AdaptiveConfigurationManager[] adaptiveConfigurationManagerArray = new AdaptiveConfigurationManager[6];
            for (Object object : objectArray) {
                AdaptiveConfigurationManager adaptiveConfigurationManager;
                adaptiveConfigurationManagerArray[adaptiveConfigurationManager.p()] = adaptiveConfigurationManager = new AdaptiveConfigurationManager(object);
            }
            i = adaptiveConfigurationManagerArray;
        }
        return i;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = AdaptiveConfigurationManager.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = AdaptiveConfigurationManager.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public AdaptiveConfigurationManager(Object object) {
        super(object);
    }

    public static AdaptiveConfigurationManager A() {
        block4: {
            block5: {
                try {
                    try {
                        if (D != null) break block4;
                        if (GeometryCalculator.C() <= 13) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw AdaptiveConfigurationManager.a(illegalStateException);
                    }
                    D = new AdaptiveConfigurationManager(PersistenceContextManager.h(AdaptiveConfigurationManager.U.u().GF).Z(null));
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw AdaptiveConfigurationManager.a(illegalStateException);
                }
            }
            D = new AdaptiveConfigurationManager(PersistenceContextManager.Y(AdaptiveConfigurationManager.U.u().GF).Z(null));
        }
        return D;
    }

    public int t() {
        return this.n().q();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(AdaptiveConfigurationManager.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(AdaptiveConfigurationManager.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

