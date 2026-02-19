/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Hv;
import a.Jt;
import a.OL;
import a.Ok;
import a.Rk;
import a.Ts;
import a.V4;
import a.W1;
import a.d8;
import com.google.gson.JsonObject;
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
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class i9
implements Rk<i9> {
    private static final long b;
    private static final Map k;
    private static final long[] i;
    private Short W;
    private static final Integer[] j;
    private static final Object[] o;
    private static final String[] q;
    private int d;
    private Ts O;
    private Jt L;

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = i9.i(l10, l11);
            object = o[n2];
            try {
                if (!(object instanceof String)) break block2;
                i9.o[n2] = clazz = Class.forName(q[n2]);
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
    @Override
    public boolean T(V4 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[TRYBLOCK]], but top level block is 8[SWITCH]
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

    public i9 L() {
        return new i9(this.O, this.W, this.d, this.L);
    }

    private static void c() {
        Object[] objectArray = o;
        o[0] = "@\u0005n";
        objectArray[1] = Integer.TYPE;
        i9.q[1] = "java/lang/Integer";
        objectArray[2] = "1\u0001T\u001a*!:\u000eEUW9)\tL\u001c";
        objectArray[3] = ".?\u0001;vJ%0\u0010t\u0017D.;\u0014.";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "msv&\u007fr|jlXk1\u0007gb#x-ygi#\u0000sxvx5qs\u007f|kX";
    }

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (q[n5] != null) {
            return n5;
        }
        Object object = o[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 40;
                break;
            }
            case 1: {
                n4 = 48;
                break;
            }
            case 2: {
                n4 = 0;
                break;
            }
            case 3: {
                n4 = 33;
                break;
            }
            case 4: {
                n4 = 58;
                break;
            }
            case 5: {
                n4 = 47;
                break;
            }
            case 6: {
                n4 = 24;
                break;
            }
            case 7: {
                n4 = 26;
                break;
            }
            case 8: {
                n4 = 19;
                break;
            }
            case 9: {
                n4 = 15;
                break;
            }
            case 10: {
                n4 = 45;
                break;
            }
            case 11: {
                n4 = 50;
                break;
            }
            case 12: {
                n4 = 17;
                break;
            }
            case 13: {
                n4 = 21;
                break;
            }
            case 14: {
                n4 = 25;
                break;
            }
            case 15: {
                n4 = 38;
                break;
            }
            case 16: {
                n4 = 54;
                break;
            }
            case 17: {
                n4 = 27;
                break;
            }
            case 18: {
                n4 = 32;
                break;
            }
            case 19: {
                n4 = 29;
                break;
            }
            case 20: {
                n4 = 35;
                break;
            }
            case 21: {
                n4 = 51;
                break;
            }
            case 22: {
                n4 = 34;
                break;
            }
            case 23: {
                n4 = 31;
                break;
            }
            case 24: {
                n4 = 59;
                break;
            }
            case 25: {
                n4 = 30;
                break;
            }
            case 26: {
                n4 = 44;
                break;
            }
            case 27: {
                n4 = 14;
                break;
            }
            case 28: {
                n4 = 60;
                break;
            }
            case 29: {
                n4 = 42;
                break;
            }
            case 30: {
                n4 = 13;
                break;
            }
            case 31: {
                n4 = 20;
                break;
            }
            case 32: {
                n4 = 10;
                break;
            }
            case 33: {
                n4 = 46;
                break;
            }
            case 34: {
                n4 = 5;
                break;
            }
            case 35: {
                n4 = 55;
                break;
            }
            case 36: {
                n4 = 61;
                break;
            }
            case 37: {
                n4 = 2;
                break;
            }
            case 38: {
                n4 = 63;
                break;
            }
            case 39: {
                n4 = 4;
                break;
            }
            case 40: {
                n4 = 22;
                break;
            }
            case 41: {
                n4 = 16;
                break;
            }
            case 42: {
                n4 = 9;
                break;
            }
            case 43: {
                n4 = 28;
                break;
            }
            case 44: {
                n4 = 3;
                break;
            }
            case 45: {
                n4 = 53;
                break;
            }
            case 46: {
                n4 = 43;
                break;
            }
            case 47: {
                n4 = 6;
                break;
            }
            case 48: {
                n4 = 41;
                break;
            }
            case 49: {
                n4 = 39;
                break;
            }
            case 50: {
                n4 = 8;
                break;
            }
            case 51: {
                n4 = 56;
                break;
            }
            case 52: {
                n4 = 57;
                break;
            }
            case 53: {
                n4 = 36;
                break;
            }
            case 54: {
                n4 = 49;
                break;
            }
            case 55: {
                n4 = 11;
                break;
            }
            case 56: {
                n4 = 37;
                break;
            }
            case 57: {
                n4 = 18;
                break;
            }
            case 58: {
                n4 = 52;
                break;
            }
            case 59: {
                n4 = 12;
                break;
            }
            case 60: {
                n4 = 23;
                break;
            }
            case 61: {
                n4 = 62;
                break;
            }
            case 62: {
                n4 = 7;
                break;
            }
            default: {
                n4 = 1;
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
        i9.q[n5] = new String(cArray);
        return n5;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/i9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public Ts m() {
        return this.O;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                i9.b = d8.a(-7169231448782629153L, 5169547641924410034L, MethodHandles.lookup().lookupClass()).a(29844322130685L);
                i9.o = new Object[5];
                i9.q = new String[5];
                i9.c();
                i9.k = new HashMap<K, V>(13);
                var0 = i9.b ^ 103560078649523L;
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
                var8_3 = new long[7];
                var5_4 = 0;
                var6_5 = "\u00fc \u00f5Fd\u0002{\u008a\u00e7\u00b7-\u00f0q\u007f\u0093DC%\u0087\u00ae\u00bbem\u00e1zDuc\\c\u00feP\u0095\u0092\u00b4\\\u00cd2\u00c7\u0013";
                var7_6 = "\u00fc \u00f5Fd\u0002{\u008a\u00e7\u00b7-\u00f0q\u007f\u0093DC%\u0087\u00ae\u00bbem\u00e1zDuc\\c\u00feP\u0095\u0092\u00b4\\\u00cd2\u00c7\u0013".length();
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
                    var6_5 = "\u00ed\u00df]\u00e9u.\u00eak\u00ba\u00abc\u00f6\u00e5g\u001b\u0019";
                    var7_6 = "\u00ed\u00df]\u00e9u.\u00eak\u00ba\u00abc\u00f6\u00e5g\u001b\u0019".length();
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
        i9.i = var8_3;
        i9.j = new Integer[7];
    }

    @Override
    public Ok A() {
        return Ok.POTION_EFFECT;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1DF7;
        if (j[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = i[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/i9", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            i9.j[n3] = n4;
        }
        return j[n3];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = i9.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public i9 V(Ts ts2) {
        this.O = ts2;
        return this;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/i9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public String G() {
        return String.valueOf(this.d);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00a4' || c10 == 'J' || c10 == '\u00d0' || c10 == '\u00fd') {
                field = i9.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00a4' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'J' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = i9.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'M' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = i9.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = i9.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public i9 i(Jt jt2) {
        this.L = jt2;
        return this;
    }

    public i9() {
        this.O = Ts.HAS;
        this.L = Jt.EQUALS;
        this.d = 1;
    }

    public i9 W(Short s10) {
        this.W = s10;
        return this;
    }

    public i9(Ts ts2, short s10, int n2, Jt jt2) {
        this.O = Ts.HAS;
        this.L = Jt.EQUALS;
        this.d = 1;
        this.O = ts2;
        this.W = s10;
        this.d = n2;
        this.L = jt2;
    }

    public Short U() {
        return this.W;
    }

    public i9(JsonObject jsonObject) {
        int n2;
        long l10 = b ^ 0x5AFB7B0EEF05L;
        this.O = Ts.HAS;
        this.L = Jt.EQUALS;
        this.d = 1;
        this.O = Ts.Q(OL.g(jsonObject, (String)((Object)i9.e("M", (int)i9.b("h", (int)12749, (long)(0x3C73D8E084BC8511L ^ l10)), (long)2966504283594917974L, (long)l10))));
        this.W = OL.P(jsonObject, (String)((Object)i9.e("M", (int)i9.b("h", (int)4744, (long)(0xE793228F2B62650L ^ l10)), (long)2966504283594917974L, (long)l10)));
        Integer n3 = OL.m(jsonObject, (String)((Object)i9.e("M", (int)i9.b("h", (int)30981, (long)(0x153538AA82A6CDD8L ^ l10)), (long)2966504283594917974L, (long)l10)));
        try {
            i9 i92 = this;
            n2 = n3 != null ? n3 : 1;
        }
        catch (NumberFormatException numberFormatException) {
            throw i9.a(numberFormatException);
        }
        i92.d = n2;
        this.L = Jt.B(jsonObject.get((String)((Object)i9.e("M", (int)i9.b("h", (int)27245, (long)(0x3A5088D54D995EB4L ^ l10)), (long)2966504283594917974L, (long)l10))).getAsString());
    }

    public i9 A(String string) throws NumberFormatException {
        this.d = Integer.parseInt(string);
        return this;
    }

    public i9 W(int n2) {
        this.d = n2;
        return this;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = i9.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = i9.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public JsonObject a() {
        long l10 = b ^ 0x1FE81CC15F47L;
        JsonObject jsonObject = Rk.super.a();
        jsonObject.addProperty((String)((Object)i9.e("M", (int)i9.b("h", (int)24529, (long)(0x7FF28C1F842BDB4DL ^ l10)), (long)-7392264069432592364L, (long)l10)), this.O.O());
        jsonObject.addProperty((String)((Object)i9.e("M", (int)i9.b("h", (int)16967, (long)(0x27298C3DEBEEC6DAL ^ l10)), (long)-7392264069432592364L, (long)l10)), (Number)this.W);
        jsonObject.addProperty((String)((Object)i9.e("M", (int)i9.b("h", (int)23909, (long)(0x584C27B5C2F1D9FCL ^ l10)), (long)-7392264069432592364L, (long)l10)), (Number)this.d);
        return jsonObject;
    }

    @Nullable
    public W1 W() {
        try {
            if (this.W == null) {
                return null;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw i9.a(numberFormatException);
        }
        return Hv.r(this.W);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = i9.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method l(long l10, long l11) {
        int n2 = i9.i(l10, l11);
        Object object = o[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = q[n2];
                int n4 = string2.indexOf(8);
                clazz3 = i9.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = i9.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = i9.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        i9.o[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = i9.j(241518711588055L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = i9.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        i9.o[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = i9.j(241518711588055L, 0L);
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

    @Override
    public Jt l() {
        return this.L;
    }

    private static Field k(long l10, long l11) {
        int n2 = i9.i(l10, l11);
        Object object = o[n2];
        if (object instanceof String) {
            String string = q[n2];
            int n3 = string.indexOf(8);
            Class clazz = i9.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = i9.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = i9.e(clazz3, string2, clazz2)) != null) {
                    i9.o[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = i9.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        i9.o[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = i9.j(241518711588055L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public int G() {
        return this.d;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(i9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(i9.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

