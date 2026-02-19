/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ok;
import com.collections.management.MultiContainerRegistry;
import com.google.gson.JsonObject;
import com.network.protocol.GenericProtocolInterceptor;
import com.runtime.context.LightweightExecutionContext;
import com.security.config.CryptoConfigurationRegistry;
import com.security.protocol.EncryptionProtocolHandler397;
import com.system.error.ErrorResilienceProtocol;
import com.system.pipeline.ObjectPipelineManager;
import com.system.resource.ResourceAllocationManager1058;
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
implements GenericProtocolInterceptor<i9> {
    private static final long b;
    private static final Map k;
    private static final long[] i;
    private Short W;
    private static final Integer[] j;
    private static final Object[] o;
    private static final String[] q;
    private int d;
    private CryptoConfigurationRegistry O;
    private ErrorResilienceProtocol L;

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = i9.i(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                i9.o[n] = clazz = Class.forName(q[n]);
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
    public boolean T(LightweightExecutionContext var1_1) {
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

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (q[n4] != null) {
            return n4;
        }
        Object object = o[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 40;
                break;
            }
            case 1: {
                n3 = 48;
                break;
            }
            case 2: {
                n3 = 0;
                break;
            }
            case 3: {
                n3 = 33;
                break;
            }
            case 4: {
                n3 = 58;
                break;
            }
            case 5: {
                n3 = 47;
                break;
            }
            case 6: {
                n3 = 24;
                break;
            }
            case 7: {
                n3 = 26;
                break;
            }
            case 8: {
                n3 = 19;
                break;
            }
            case 9: {
                n3 = 15;
                break;
            }
            case 10: {
                n3 = 45;
                break;
            }
            case 11: {
                n3 = 50;
                break;
            }
            case 12: {
                n3 = 17;
                break;
            }
            case 13: {
                n3 = 21;
                break;
            }
            case 14: {
                n3 = 25;
                break;
            }
            case 15: {
                n3 = 38;
                break;
            }
            case 16: {
                n3 = 54;
                break;
            }
            case 17: {
                n3 = 27;
                break;
            }
            case 18: {
                n3 = 32;
                break;
            }
            case 19: {
                n3 = 29;
                break;
            }
            case 20: {
                n3 = 35;
                break;
            }
            case 21: {
                n3 = 51;
                break;
            }
            case 22: {
                n3 = 34;
                break;
            }
            case 23: {
                n3 = 31;
                break;
            }
            case 24: {
                n3 = 59;
                break;
            }
            case 25: {
                n3 = 30;
                break;
            }
            case 26: {
                n3 = 44;
                break;
            }
            case 27: {
                n3 = 14;
                break;
            }
            case 28: {
                n3 = 60;
                break;
            }
            case 29: {
                n3 = 42;
                break;
            }
            case 30: {
                n3 = 13;
                break;
            }
            case 31: {
                n3 = 20;
                break;
            }
            case 32: {
                n3 = 10;
                break;
            }
            case 33: {
                n3 = 46;
                break;
            }
            case 34: {
                n3 = 5;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 61;
                break;
            }
            case 37: {
                n3 = 2;
                break;
            }
            case 38: {
                n3 = 63;
                break;
            }
            case 39: {
                n3 = 4;
                break;
            }
            case 40: {
                n3 = 22;
                break;
            }
            case 41: {
                n3 = 16;
                break;
            }
            case 42: {
                n3 = 9;
                break;
            }
            case 43: {
                n3 = 28;
                break;
            }
            case 44: {
                n3 = 3;
                break;
            }
            case 45: {
                n3 = 53;
                break;
            }
            case 46: {
                n3 = 43;
                break;
            }
            case 47: {
                n3 = 6;
                break;
            }
            case 48: {
                n3 = 41;
                break;
            }
            case 49: {
                n3 = 39;
                break;
            }
            case 50: {
                n3 = 8;
                break;
            }
            case 51: {
                n3 = 56;
                break;
            }
            case 52: {
                n3 = 57;
                break;
            }
            case 53: {
                n3 = 36;
                break;
            }
            case 54: {
                n3 = 49;
                break;
            }
            case 55: {
                n3 = 11;
                break;
            }
            case 56: {
                n3 = 37;
                break;
            }
            case 57: {
                n3 = 18;
                break;
            }
            case 58: {
                n3 = 52;
                break;
            }
            case 59: {
                n3 = 12;
                break;
            }
            case 60: {
                n3 = 23;
                break;
            }
            case 61: {
                n3 = 62;
                break;
            }
            case 62: {
                n3 = 7;
                break;
            }
            default: {
                n3 = 1;
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
        i9.q[n4] = new String(cArray);
        return n4;
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

    public CryptoConfigurationRegistry m() {
        return this.O;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                i9.b = MultiContainerRegistry.a(-7169231448782629153L, 5169547641924410034L, MethodHandles.lookup().lookupClass()).a(29844322130685L);
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

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1DF7;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l3, objectArray);
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
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            i9.j[n2] = n3;
        }
        return j[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = i9.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public i9 V(CryptoConfigurationRegistry cryptoConfigurationRegistry) {
        this.O = cryptoConfigurationRegistry;
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

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a4' || c == 'J' || c == '\u00d0' || c == '\u00fd') {
                field = i9.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = i9.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'M' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = i9.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = i9.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public i9 i(ErrorResilienceProtocol errorResilienceProtocol) {
        this.L = errorResilienceProtocol;
        return this;
    }

    public i9() {
        this.O = CryptoConfigurationRegistry.HAS;
        this.L = ErrorResilienceProtocol.EQUALS;
        this.d = 1;
    }

    public i9 W(Short s2) {
        this.W = s2;
        return this;
    }

    public i9(CryptoConfigurationRegistry cryptoConfigurationRegistry, short s2, int n, ErrorResilienceProtocol errorResilienceProtocol) {
        this.O = CryptoConfigurationRegistry.HAS;
        this.L = ErrorResilienceProtocol.EQUALS;
        this.d = 1;
        this.O = cryptoConfigurationRegistry;
        this.W = s2;
        this.d = n;
        this.L = errorResilienceProtocol;
    }

    public Short U() {
        return this.W;
    }

    public i9(JsonObject jsonObject) {
        int n;
        long l = b ^ 0x5AFB7B0EEF05L;
        this.O = CryptoConfigurationRegistry.HAS;
        this.L = ErrorResilienceProtocol.EQUALS;
        this.d = 1;
        this.O = CryptoConfigurationRegistry.Q(EncryptionProtocolHandler397.g(jsonObject, (String)((Object)i9.e("M", (int)i9.b("h", (int)12749, (long)(0x3C73D8E084BC8511L ^ l)), (long)2966504283594917974L, (long)l))));
        this.W = EncryptionProtocolHandler397.P(jsonObject, (String)((Object)i9.e("M", (int)i9.b("h", (int)4744, (long)(0xE793228F2B62650L ^ l)), (long)2966504283594917974L, (long)l)));
        Integer n2 = EncryptionProtocolHandler397.m(jsonObject, (String)((Object)i9.e("M", (int)i9.b("h", (int)30981, (long)(0x153538AA82A6CDD8L ^ l)), (long)2966504283594917974L, (long)l)));
        try {
            i9 i92 = this;
            n = n2 != null ? n2 : 1;
        }
        catch (NumberFormatException numberFormatException) {
            throw i9.a(numberFormatException);
        }
        i92.d = n;
        this.L = ErrorResilienceProtocol.B(jsonObject.get((String)((Object)i9.e("M", (int)i9.b("h", (int)27245, (long)(0x3A5088D54D995EB4L ^ l)), (long)2966504283594917974L, (long)l))).getAsString());
    }

    public i9 A(String string) throws NumberFormatException {
        this.d = Integer.parseInt(string);
        return this;
    }

    public i9 W(int n) {
        this.d = n;
        return this;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = i9.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = i9.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    @Override
    public JsonObject a() {
        long l = b ^ 0x1FE81CC15F47L;
        JsonObject jsonObject = GenericProtocolInterceptor.super.a();
        jsonObject.addProperty((String)((Object)i9.e("M", (int)i9.b("h", (int)24529, (long)(0x7FF28C1F842BDB4DL ^ l)), (long)-7392264069432592364L, (long)l)), this.O.O());
        jsonObject.addProperty((String)((Object)i9.e("M", (int)i9.b("h", (int)16967, (long)(0x27298C3DEBEEC6DAL ^ l)), (long)-7392264069432592364L, (long)l)), (Number)this.W);
        jsonObject.addProperty((String)((Object)i9.e("M", (int)i9.b("h", (int)23909, (long)(0x584C27B5C2F1D9FCL ^ l)), (long)-7392264069432592364L, (long)l)), (Number)this.d);
        return jsonObject;
    }

    @Nullable
    public ResourceAllocationManager1058 W() {
        try {
            if (this.W == null) {
                return null;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw i9.a(numberFormatException);
        }
        return ObjectPipelineManager.r(this.W);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = i9.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method l(long l, long l2) {
        int n = i9.i(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = q[n];
                int n3 = string2.indexOf(8);
                clazz3 = i9.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = i9.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = i9.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        i9.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = i9.j(241518711588055L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = i9.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        i9.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = i9.j(241518711588055L, 0L);
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

    @Override
    public ErrorResilienceProtocol l() {
        return this.L;
    }

    private static Field k(long l, long l2) {
        int n = i9.i(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = q[n];
            int n2 = string.indexOf(8);
            Class clazz = i9.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = i9.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = i9.e(clazz3, string2, clazz2)) != null) {
                    i9.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = i9.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        i9.o[n] = field;
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

