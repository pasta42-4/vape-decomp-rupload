/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.D_;
import a.Dv;
import a.Hc;
import a.P8;
import a.d8;
import a.kX;
import a.sy;
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
public class oo
extends Hc {
    private static oo Z;
    private static final String[] o;
    private Integer x;
    private static oo e;
    public static final int W;
    private static final Map g;
    private oo m;
    private static oo S;
    private static oo V;
    private static final Integer[] d;
    private static oo[] B;
    public static final int Y;
    private static final long[] c;
    private static oo D;
    private static oo N;
    private static final Object[] h;
    public static final int y = 0;
    private Dv k;
    private static oo[] i;
    private static final long b;
    public static final int O;
    private Integer K;
    public static final int w;
    public static final int a = 1;

    public static oo C(int n2) {
        oo[] ooArray = oo.Y();
        return ooArray[sy.L(n2 % ooArray.length)];
    }

    public int i() {
        return this.n().j();
    }

    public int P() {
        return this.n().o();
    }

    public oo z() {
        block2: {
            int n2;
            block4: {
                block3: {
                    try {
                        if (this.m != null) break block2;
                        if (kX.C() <= 13) break block3;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw oo.a(illegalStateException);
                    }
                    n2 = oo.U.u().GF.E(this.H);
                    break block4;
                }
                n2 = oo.U.u().GF.T(this.H);
            }
            this.m = oo.d(n2);
        }
        return this.m;
    }

    public int p() {
        block4: {
            block5: {
                try {
                    try {
                        if (this.K != null) break block4;
                        if (kX.C() <= 13) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw oo.a(illegalStateException);
                    }
                    this.K = oo.U.u().GF.R(this.H);
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo.a(illegalStateException);
                }
            }
            this.K = oo.U.u().GF.V(this.H);
        }
        return this.K;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (o[n5] != null) {
            return n5;
        }
        Object object = h[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 25;
                break;
            }
            case 1: {
                n4 = 45;
                break;
            }
            case 2: {
                n4 = 13;
                break;
            }
            case 3: {
                n4 = 47;
                break;
            }
            case 4: {
                n4 = 26;
                break;
            }
            case 5: {
                n4 = 24;
                break;
            }
            case 6: {
                n4 = 20;
                break;
            }
            case 7: {
                n4 = 10;
                break;
            }
            case 8: {
                n4 = 53;
                break;
            }
            case 9: {
                n4 = 62;
                break;
            }
            case 10: {
                n4 = 15;
                break;
            }
            case 11: {
                n4 = 21;
                break;
            }
            case 12: {
                n4 = 46;
                break;
            }
            case 13: {
                n4 = 14;
                break;
            }
            case 14: {
                n4 = 44;
                break;
            }
            case 15: {
                n4 = 7;
                break;
            }
            case 16: {
                n4 = 5;
                break;
            }
            case 17: {
                n4 = 48;
                break;
            }
            case 18: {
                n4 = 17;
                break;
            }
            case 19: {
                n4 = 0;
                break;
            }
            case 20: {
                n4 = 16;
                break;
            }
            case 21: {
                n4 = 6;
                break;
            }
            case 22: {
                n4 = 38;
                break;
            }
            case 23: {
                n4 = 60;
                break;
            }
            case 24: {
                n4 = 31;
                break;
            }
            case 25: {
                n4 = 8;
                break;
            }
            case 26: {
                n4 = 40;
                break;
            }
            case 27: {
                n4 = 27;
                break;
            }
            case 28: {
                n4 = 36;
                break;
            }
            case 29: {
                n4 = 37;
                break;
            }
            case 30: {
                n4 = 54;
                break;
            }
            case 31: {
                n4 = 52;
                break;
            }
            case 32: {
                n4 = 1;
                break;
            }
            case 33: {
                n4 = 61;
                break;
            }
            case 34: {
                n4 = 4;
                break;
            }
            case 35: {
                n4 = 19;
                break;
            }
            case 36: {
                n4 = 29;
                break;
            }
            case 37: {
                n4 = 43;
                break;
            }
            case 38: {
                n4 = 30;
                break;
            }
            case 39: {
                n4 = 9;
                break;
            }
            case 40: {
                n4 = 50;
                break;
            }
            case 41: {
                n4 = 51;
                break;
            }
            case 42: {
                n4 = 63;
                break;
            }
            case 43: {
                n4 = 2;
                break;
            }
            case 44: {
                n4 = 56;
                break;
            }
            case 45: {
                n4 = 12;
                break;
            }
            case 46: {
                n4 = 22;
                break;
            }
            case 47: {
                n4 = 33;
                break;
            }
            case 48: {
                n4 = 34;
                break;
            }
            case 49: {
                n4 = 41;
                break;
            }
            case 50: {
                n4 = 59;
                break;
            }
            case 51: {
                n4 = 32;
                break;
            }
            case 52: {
                n4 = 55;
                break;
            }
            case 53: {
                n4 = 39;
                break;
            }
            case 54: {
                n4 = 23;
                break;
            }
            case 55: {
                n4 = 49;
                break;
            }
            case 56: {
                n4 = 28;
                break;
            }
            case 57: {
                n4 = 35;
                break;
            }
            case 58: {
                n4 = 18;
                break;
            }
            case 59: {
                n4 = 57;
                break;
            }
            case 60: {
                n4 = 11;
                break;
            }
            case 61: {
                n4 = 3;
                break;
            }
            case 62: {
                n4 = 42;
                break;
            }
            default: {
                n4 = 58;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        oo.o[n5] = new String(cArray);
        return n5;
    }

    public static oo y() {
        try {
            if (Z == null) {
                Z = new oo(P8.N(oo.U.u().GF).Z(null));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw oo.a(illegalStateException);
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
                oo.b = d8.a(-13158824564473086L, 2694762471045110287L, MethodHandles.lookup().lookupClass()).a(42473905529127L);
                oo.h = new Object[5];
                oo.o = new String[5];
                oo.a();
                oo.g = new HashMap<K, V>(13);
                var0 = oo.b ^ 79666650538518L;
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
        oo.c = var8_3;
        oo.d = new Integer[11];
        oo.Y = (int)oo.a("r", (int)29132, (long)(var0 ^ 326211287357756800L));
        oo.W = (int)oo.a("r", (int)1073, (long)(var0 ^ 6619603851942027390L));
        oo.w = (int)oo.a("r", (int)18520, (long)(var0 ^ 3042878969751907349L));
        oo.O = (int)oo.a("r", (int)28495, (long)(var0 ^ 9111433447056804614L));
    }

    private static Field g(long l10, long l11) {
        int n2 = oo.e(l10, l11);
        Object object = h[n2];
        if (object instanceof String) {
            String string = o[n2];
            int n3 = string.indexOf(8);
            Class clazz = oo.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = oo.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = oo.c(clazz3, string2, clazz2)) != null) {
                    oo.h[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = oo.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        oo.h[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = oo.f(277107355744371L, 0L);
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
    public static oo k(String var0) {
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
                        if (kX.C() <= 13) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw oo.a(illegalStateException);
                    }
                    this.k = new Dv(oo.U.u().GF.q(this.H));
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo.a(illegalStateException);
                }
            }
            int n2 = oo.U.u().GF.a(this.H);
            int n3 = oo.U.u().GF.J(this.H);
            int n4 = oo.U.u().GF.Q(this.H);
            this.k = new D_(n2, n3, n4);
        }
        return this.k;
    }

    public static oo O() {
        try {
            if (S == null) {
                S = new oo(P8.Z(oo.U.u().GF).Z(null));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw oo.a(illegalStateException);
        }
        return S;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00fa' || c10 == '\u00c4' || c10 == '\u00a2' || c10 == 'X') {
                field = oo.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00fa' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00a2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = oo.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'A' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = oo.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static oo G() {
        try {
            if (V == null) {
                V = new oo(P8.Q(oo.U.u().GF).Z(null));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw oo.a(illegalStateException);
        }
        return V;
    }

    public String e() {
        return String.valueOf(oo.U.u().GF.x(this.H));
    }

    public static oo u() {
        try {
            if (N == null) {
                N = new oo(P8.O(oo.U.u().GF).Z(null));
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw oo.a(illegalStateException);
        }
        return N;
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x4B1C;
        if (d[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
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
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            oo.d[n3] = n4;
        }
        return d[n3];
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "8NQ";
        objectArray[1] = Integer.TYPE;
        oo.o[1] = "java/lang/Integer";
        objectArray[2] = "C8\u0019\u0002,\nH7\bMQ\u0012[0\u0001\u0004";
        objectArray[3] = ",V\u0004(\u0018U'Y\u0015gy[,R\u0011=";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\n=\u000b\u00197h\t/Y\"1/nf\f]79\b3QRdTW0Q\\f(\u0002aRLZ";
    }

    public static oo s(double d2) {
        return oo.C(sy.Q(d2 / 90.0 + 0.5) & 3);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = oo.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public static oo[] Y() {
        if (B == null) {
            oo[] ooArray;
            oo[] ooArray2;
            block9: {
                ooArray2 = new oo[4];
                try {
                    if (kX.C() <= 13 || kX.C() >= 35) break block9;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo.a(illegalStateException);
                }
                Object[] objectArray = oo.U.u().GF.V();
                try {
                    for (int i10 = 0; i10 < objectArray.length; ++i10) {
                        ooArray2[i10] = new oo(objectArray[i10]);
                    }
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo.a(illegalStateException);
                }
            }
            for (oo oo2 : ooArray = oo.G()) {
                int n2 = oo2.g();
                try {
                    if (n2 == -1) continue;
                    ooArray2[n2] = oo2;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo.a(illegalStateException);
                }
            }
            B = ooArray2;
        }
        return B;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = oo.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = oo.d(classArray[i10], string, clazz2);
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

    public static oo d(int n2) {
        return oo.G()[n2];
    }

    public int g() {
        block12: {
            block13: {
                try {
                    try {
                        try {
                            if (this.x != null) break block12;
                            if (kX.C() <= kX.W) break block13;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw oo.a(illegalStateException);
                        }
                        if (kX.C() >= 35) break block13;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw oo.a(illegalStateException);
                    }
                    this.x = oo.U.u().GF.u(this.H);
                    break block12;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo.a(illegalStateException);
                }
            }
            int n2 = -1;
            switch (this.p()) {
                case 3: {
                    n2 = 0;
                    break;
                }
                case 4: {
                    n2 = 1;
                    break;
                }
                case 2: {
                    n2 = 2;
                    break;
                }
                case 5: {
                    n2 = 3;
                }
            }
            this.x = n2;
        }
        return this.x;
    }

    private static Method h(long l10, long l11) {
        int n2 = oo.e(l10, l11);
        Object object = h[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = o[n2];
                int n4 = string2.indexOf(8);
                clazz3 = oo.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = oo.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = oo.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        oo.h[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = oo.f(277107355744371L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = oo.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        oo.h[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = oo.f(277107355744371L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    public static oo F() {
        block4: {
            block5: {
                try {
                    try {
                        if (e != null) break block4;
                        if (kX.C() <= 13) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw oo.a(illegalStateException);
                    }
                    e = new oo(P8.Y(oo.U.u().GF).Z(null));
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo.a(illegalStateException);
                }
            }
            e = new oo(P8.h(oo.U.u().GF).Z(null));
        }
        return e;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = oo.e(l10, l11);
            object = h[n2];
            try {
                if (!(object instanceof String)) break block2;
                oo.h[n2] = clazz = Class.forName(o[n2]);
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

    public static oo[] G() {
        block3: {
            Object[] objectArray;
            block5: {
                block4: {
                    try {
                        if (i != null) break block3;
                        if (kX.C() <= 13) break block4;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw oo.a(illegalStateException);
                    }
                    objectArray = oo.U.u().GF.r();
                    break block5;
                }
                objectArray = oo.U.u().GF.m();
            }
            oo[] ooArray = new oo[6];
            for (Object object : objectArray) {
                oo oo2;
                ooArray[oo2.p()] = oo2 = new oo(object);
            }
            i = ooArray;
        }
        return i;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = oo.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = oo.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public oo(Object object) {
        super(object);
    }

    public static oo A() {
        block4: {
            block5: {
                try {
                    try {
                        if (D != null) break block4;
                        if (kX.C() <= 13) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw oo.a(illegalStateException);
                    }
                    D = new oo(P8.h(oo.U.u().GF).Z(null));
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw oo.a(illegalStateException);
                }
            }
            D = new oo(P8.Y(oo.U.u().GF).Z(null));
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
            return MethodHandles.lookup().findStatic(oo.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(oo.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

