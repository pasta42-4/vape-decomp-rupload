/*
 * Decompiled with CFR 0.152.
 */
package com.ui.rendering;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.scientific.modeling.ComputationalModelCalibrator;
import com.security.crypto.CryptographicParameterGenerator;
import com.system.configuration.ConfigurationManager;
import com.system.parameters.SystemParameterConfiguration;
import com.system.resources.ResourceAllocationManager420;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class FontRenderingEngine {
    private final ConcurrentMap<Integer, CryptographicParameterGenerator> G;
    private boolean w;
    private static final long a;
    byte[] s;
    byte[] g;
    public static ArrayList<String> h;
    private final ConcurrentMap<Integer, CryptographicParameterGenerator> Z;
    private static final long[] b;
    byte[] H;
    private final ConcurrentMap<Integer, CryptographicParameterGenerator> E;
    private static final String[] i;
    private static final Map d;
    private final ConcurrentMap<Integer, CryptographicParameterGenerator> z;
    private static final Object[] e;
    private final String F = "arial";
    private static final Integer[] c;
    private final ConcurrentMap<Integer, CryptographicParameterGenerator> y;
    byte[] m;
    private final ConcurrentMap<Integer, CryptographicParameterGenerator> Q;
    private final ConcurrentMap<Integer, CryptographicParameterGenerator> f;

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public void P() {
        this.G.clear();
        this.Z.clear();
        this.Q.clear();
        this.z.clear();
        this.y.clear();
        this.E.clear();
        this.f.clear();
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = FontRenderingEngine.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public CryptographicParameterGenerator q() {
        return this.A(false);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f1' || c == '\u00ce' || c == 'Z' || c == 'T') {
                field = FontRenderingEngine.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = FontRenderingEngine.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public CryptographicParameterGenerator T(double d2, boolean bl) {
        long l = a ^ 0x12159633A32EL;
        int n = (int)(16.0 * d2);
        double d3 = TemporalMetadataResolver.h.a().b();
        n = (int)((double)n * d3);
        CryptographicParameterGenerator cryptographicParameterGenerator = (CryptographicParameterGenerator)this.Q.get(n);
        try {
            if (cryptographicParameterGenerator != null) {
                return cryptographicParameterGenerator;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw FontRenderingEngine.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = ConfigurationManager.U() ? new ComputationalModelCalibrator((String)((Object)FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)25779, (long)(0x64BCC433F842DFFDL ^ l)), (long)7567120404780154616L, (long)l)), n) : new ResourceAllocationManager420((String)((Object)FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)28773, (long)(0x4659044BD33FCB2EL ^ l)), (long)7567120404780154616L, (long)l)), n);
        this.Q.put(n, cryptographicParameterGenerator2);
        return cryptographicParameterGenerator2;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "9F>";
        objectArray[1] = Integer.TYPE;
        FontRenderingEngine.i[1] = "java/lang/Integer";
        objectArray[2] = "2@IAtd9OX\u000e\t|*HQG";
        objectArray[3] = "n\u001eV=";
        objectArray[4] = "nC";
        objectArray[5] = "Y4a%\u000f\tR;pjn\u0007Y0t0";
        objectArray[6] = "QX\fz\u0010\nSV\u000b{m4k\u000e[o\b\u0001\u0012\u000eJy\u0002jP\u0007\ne\fW\fKLqm";
        Object[] objectArray2 = objectArray;
        objectArray[7] = "\u0007M_kVS\u0018FW[C\u0018c\u0004\u0018jG\u0003\u001aYU4\u0017cZSA>C\u001aZBW4(";
    }

    public CryptographicParameterGenerator S(double d2) {
        return this.k(d2, true);
    }

    /*
     * Exception decompiling
     */
    public CryptographicParameterGenerator L(SystemParameterConfiguration var1_1, int var2_2, boolean var3_3) {
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

    private static Field c(long l, long l2) {
        int n = FontRenderingEngine.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = FontRenderingEngine.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = FontRenderingEngine.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = FontRenderingEngine.a(clazz3, string2, clazz2)) != null) {
                    FontRenderingEngine.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = FontRenderingEngine.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        FontRenderingEngine.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = FontRenderingEngine.b(371488162256109L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void d() {
        long l = a ^ 0x62862943A1AAL;
        this.m = (byte[])FontRenderingEngine.b("\u00f2", (Object)FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)12893, (long)(0x31E711D9F6860B9CL ^ l)), (long)7748372213764979836L, (long)l), (long)7748430871899972360L, (long)l);
        this.g = (byte[])FontRenderingEngine.b("\u00f2", (Object)FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)26223, (long)(0xB99918F79795FA8L ^ l)), (long)7748372213764979836L, (long)l), (long)7748430871899972360L, (long)l);
        this.H = (byte[])FontRenderingEngine.b("\u00f2", (Object)FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)19218, (long)(0xABC15EEF2D6F2DEL ^ l)), (long)7748372213764979836L, (long)l), (long)7748430871899972360L, (long)l);
        this.s = (byte[])FontRenderingEngine.b("\u00f2", (Object)FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)14169, (long)(0x653BB2CA6B748E99L ^ l)), (long)7748372213764979836L, (long)l), (long)7748430871899972360L, (long)l);
        this.w = true;
    }

    public CryptographicParameterGenerator k(double d2, boolean bl) {
        int n = (int)(16.0 * d2);
        double d3 = TemporalMetadataResolver.h.a().b();
        n = (int)((double)n * d3);
        return this.W(n, false);
    }

    public CryptographicParameterGenerator A(boolean bl) {
        return this.W(16, bl);
    }

    public CryptographicParameterGenerator u() {
        return this.W(12, false);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x524D;
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
                throw new RuntimeException("a/Y7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FontRenderingEngine.c[n2] = n3;
        }
        return c[n2];
    }

    private CryptographicParameterGenerator Q(int n, boolean bl) {
        CallSite callSite;
        ConcurrentMap<Integer, CryptographicParameterGenerator> concurrentMap;
        long l = a ^ 0x6B87F0B07047L;
        try {
            concurrentMap = bl ? this.y : this.G;
        }
        catch (CustomSystemException customSystemException) {
            throw FontRenderingEngine.a(customSystemException);
        }
        ConcurrentMap<Integer, CryptographicParameterGenerator> concurrentMap2 = concurrentMap;
        CryptographicParameterGenerator cryptographicParameterGenerator = (CryptographicParameterGenerator)concurrentMap2.get(n);
        try {
            if (cryptographicParameterGenerator != null) {
                return cryptographicParameterGenerator;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw FontRenderingEngine.a(customSystemException);
        }
        try {
            callSite = bl ? FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)83, (long)(0x1B76B94E1288E873L ^ l)), (long)-5013994608258699887L, (long)l) : FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)23064, (long)(0x239B5057B89CB236L ^ l)), (long)-5013994608258699887L, (long)l);
        }
        catch (CustomSystemException customSystemException) {
            throw FontRenderingEngine.a(customSystemException);
        }
        CallSite callSite2 = callSite;
        CryptographicParameterGenerator cryptographicParameterGenerator2 = ConfigurationManager.U() ? new ComputationalModelCalibrator((String)((Object)callSite2), n) : new ResourceAllocationManager420((String)((Object)callSite2), n);
        concurrentMap2.put(n, cryptographicParameterGenerator2);
        return cryptographicParameterGenerator2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Y7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public CryptographicParameterGenerator u(double d2, boolean bl) {
        int n = (int)(16.0 * d2);
        double d3 = TemporalMetadataResolver.h.a().b();
        n = (int)((double)n * d3);
        return this.W(n, true);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private CryptographicParameterGenerator t(int n) {
        long l = a ^ 0x10BB28FBB59DL;
        CryptographicParameterGenerator cryptographicParameterGenerator = (CryptographicParameterGenerator)this.z.get(n);
        try {
            if (cryptographicParameterGenerator != null) {
                return cryptographicParameterGenerator;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw FontRenderingEngine.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = ConfigurationManager.U() ? new ComputationalModelCalibrator(this.H, n, (String)((Object)FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)12560, (long)(0x2E5BD0F0D6521CE5L ^ l)), (long)9201079734103959627L, (long)l))) : new ResourceAllocationManager420(this.H, n);
        this.z.put(n, cryptographicParameterGenerator2);
        return cryptographicParameterGenerator2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                FontRenderingEngine.a = MultiContainerRegistry.a(5031910245637987444L, 4235040216614672239L, MethodHandles.lookup().lookupClass()).a(15218259126987L);
                FontRenderingEngine.e = new Object[8];
                FontRenderingEngine.i = new String[8];
                FontRenderingEngine.a();
                FontRenderingEngine.d = new HashMap<K, V>(13);
                var0 = FontRenderingEngine.a ^ 76334349233048L;
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
                var8_3 = new long[13];
                var5_4 = 0;
                var6_5 = "\u00d5z\u00a2C\u008df\u0001\u0093\u0094\u00a5\\?\u00f4\u008d\u00c8%\r\u000f\u0015\u00a4i\u00ba\u0090\u0094\u00cc\u00c5j>\u00c1\u001a\u00f9H\u00b4LT.\u00cfy\u0012\u0001\u00db H\u00d3!\u00e32\bm7C(\u009c2\u00e2\u0000M\\\u0094\u00188z\u001a\u00d4}\tATU\u00e9\u0081p\u009e\u00a3\u00db\u00a5\u00d5\u00e4\u00b6\u00ba\u0011\u008eY\u00ae\u00c4\u00b3\u00da\u00f8";
                var7_6 = "\u00d5z\u00a2C\u008df\u0001\u0093\u0094\u00a5\\?\u00f4\u008d\u00c8%\r\u000f\u0015\u00a4i\u00ba\u0090\u0094\u00cc\u00c5j>\u00c1\u001a\u00f9H\u00b4LT.\u00cfy\u0012\u0001\u00db H\u00d3!\u00e32\bm7C(\u009c2\u00e2\u0000M\\\u0094\u00188z\u001a\u00d4}\tATU\u00e9\u0081p\u009e\u00a3\u00db\u00a5\u00d5\u00e4\u00b6\u00ba\u0011\u008eY\u00ae\u00c4\u00b3\u00da\u00f8".length();
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
                    var6_5 = "\u00b9m\u00feq\u009b\u00dc\u00aa2\u00e3\u00ca\u00df\u007f\u00ea{S\u00f2";
                    var7_6 = "\u00b9m\u00feq\u009b\u00dc\u00aa2\u00e3\u00ca\u00df\u007f\u00ea{S\u00f2".length();
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
        FontRenderingEngine.b = var8_3;
        FontRenderingEngine.c = new Integer[13];
        FontRenderingEngine.h = new ArrayList<E>();
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 23;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 19;
                break;
            }
            case 3: {
                n3 = 39;
                break;
            }
            case 4: {
                n3 = 22;
                break;
            }
            case 5: {
                n3 = 26;
                break;
            }
            case 6: {
                n3 = 25;
                break;
            }
            case 7: {
                n3 = 30;
                break;
            }
            case 8: {
                n3 = 27;
                break;
            }
            case 9: {
                n3 = 13;
                break;
            }
            case 10: {
                n3 = 16;
                break;
            }
            case 11: {
                n3 = 6;
                break;
            }
            case 12: {
                n3 = 12;
                break;
            }
            case 13: {
                n3 = 32;
                break;
            }
            case 14: {
                n3 = 49;
                break;
            }
            case 15: {
                n3 = 9;
                break;
            }
            case 16: {
                n3 = 10;
                break;
            }
            case 17: {
                n3 = 29;
                break;
            }
            case 18: {
                n3 = 60;
                break;
            }
            case 19: {
                n3 = 62;
                break;
            }
            case 20: {
                n3 = 8;
                break;
            }
            case 21: {
                n3 = 3;
                break;
            }
            case 22: {
                n3 = 2;
                break;
            }
            case 23: {
                n3 = 38;
                break;
            }
            case 24: {
                n3 = 41;
                break;
            }
            case 25: {
                n3 = 34;
                break;
            }
            case 26: {
                n3 = 18;
                break;
            }
            case 27: {
                n3 = 4;
                break;
            }
            case 28: {
                n3 = 47;
                break;
            }
            case 29: {
                n3 = 54;
                break;
            }
            case 30: {
                n3 = 28;
                break;
            }
            case 31: {
                n3 = 42;
                break;
            }
            case 32: {
                n3 = 43;
                break;
            }
            case 33: {
                n3 = 52;
                break;
            }
            case 34: {
                n3 = 56;
                break;
            }
            case 35: {
                n3 = 31;
                break;
            }
            case 36: {
                n3 = 57;
                break;
            }
            case 37: {
                n3 = 33;
                break;
            }
            case 38: {
                n3 = 61;
                break;
            }
            case 39: {
                n3 = 48;
                break;
            }
            case 40: {
                n3 = 40;
                break;
            }
            case 41: {
                n3 = 35;
                break;
            }
            case 42: {
                n3 = 20;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 51;
                break;
            }
            case 45: {
                n3 = 50;
                break;
            }
            case 46: {
                n3 = 44;
                break;
            }
            case 47: {
                n3 = 59;
                break;
            }
            case 48: {
                n3 = 36;
                break;
            }
            case 49: {
                n3 = 55;
                break;
            }
            case 50: {
                n3 = 1;
                break;
            }
            case 51: {
                n3 = 24;
                break;
            }
            case 52: {
                n3 = 0;
                break;
            }
            case 53: {
                n3 = 5;
                break;
            }
            case 54: {
                n3 = 21;
                break;
            }
            case 55: {
                n3 = 11;
                break;
            }
            case 56: {
                n3 = 46;
                break;
            }
            case 57: {
                n3 = 17;
                break;
            }
            case 58: {
                n3 = 37;
                break;
            }
            case 59: {
                n3 = 7;
                break;
            }
            case 60: {
                n3 = 15;
                break;
            }
            case 61: {
                n3 = 53;
                break;
            }
            case 62: {
                n3 = 58;
                break;
            }
            default: {
                n3 = 63;
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
        FontRenderingEngine.i[n4] = new String(cArray);
        return n4;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = FontRenderingEngine.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                FontRenderingEngine.e[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = FontRenderingEngine.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(long l, long l2) {
        int n = FontRenderingEngine.a(l, l2);
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
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = FontRenderingEngine.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = FontRenderingEngine.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = FontRenderingEngine.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        FontRenderingEngine.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = FontRenderingEngine.b(371488162256109L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = FontRenderingEngine.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        FontRenderingEngine.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = FontRenderingEngine.b(371488162256109L, 0L);
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = FontRenderingEngine.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = FontRenderingEngine.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = FontRenderingEngine.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = FontRenderingEngine.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private CryptographicParameterGenerator A(int n, boolean bl) {
        ConcurrentMap<Integer, CryptographicParameterGenerator> concurrentMap;
        block10: {
            CryptographicParameterGenerator cryptographicParameterGenerator;
            block14: {
                byte[] byArray;
                ResourceAllocationManager420 resourceAllocationManager420;
                ResourceAllocationManager420 resourceAllocationManager4202;
                block11: {
                    byte[] byArray2;
                    ComputationalModelCalibrator computationalModelCalibrator;
                    ComputationalModelCalibrator computationalModelCalibrator2;
                    long l;
                    block13: {
                        block12: {
                            ConcurrentMap<Integer, CryptographicParameterGenerator> concurrentMap2;
                            l = a ^ 0x56F97F0ABB3AL;
                            try {
                                concurrentMap2 = bl ? this.E : this.Z;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw FontRenderingEngine.a(customSystemException);
                            }
                            concurrentMap = concurrentMap2;
                            try {
                                try {
                                    ComputationalModelCalibrator computationalModelCalibrator3;
                                    try {
                                        if (concurrentMap.containsKey(n)) break block10;
                                        if (!ConfigurationManager.U()) break block11;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw FontRenderingEngine.a(customSystemException);
                                    }
                                    computationalModelCalibrator2 = computationalModelCalibrator3;
                                    computationalModelCalibrator = computationalModelCalibrator3;
                                    if (!bl) break block12;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw FontRenderingEngine.a(customSystemException);
                                }
                                byArray2 = this.g;
                                break block13;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw FontRenderingEngine.a(customSystemException);
                            }
                        }
                        byArray2 = this.m;
                    }
                    computationalModelCalibrator2(byArray2, n, (String)((Object)(bl ? FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)17224, (long)(0x4DE3C923D58DE016L ^ l)), (long)8149134911232468716L, (long)l) : FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)25641, (long)(0x14E95C9EFE0E4771L ^ l)), (long)8149134911232468716L, (long)l))));
                    cryptographicParameterGenerator = computationalModelCalibrator;
                    break block14;
                }
                try {
                    ResourceAllocationManager420 resourceAllocationManager4203;
                    resourceAllocationManager4202 = resourceAllocationManager4203;
                    resourceAllocationManager420 = resourceAllocationManager4203;
                    byArray = bl ? this.g : this.m;
                }
                catch (CustomSystemException customSystemException) {
                    throw FontRenderingEngine.a(customSystemException);
                }
                resourceAllocationManager4202(byArray, n);
                cryptographicParameterGenerator = resourceAllocationManager420;
            }
            concurrentMap.put(n, cryptographicParameterGenerator);
            return cryptographicParameterGenerator;
        }
        return (CryptographicParameterGenerator)concurrentMap.get(n);
    }

    public FontRenderingEngine() {
        long l = a ^ 0x29F15D4BC4D9L;
        this.F = FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)24994, (long)(0x7D537A2EAC013D1AL ^ l)), (long)1077754554918869263L, (long)l);
        this.w = false;
        this.G = new ConcurrentHashMap<Integer, CryptographicParameterGenerator>();
        this.Z = new ConcurrentHashMap<Integer, CryptographicParameterGenerator>();
        this.Q = new ConcurrentHashMap<Integer, CryptographicParameterGenerator>();
        this.z = new ConcurrentHashMap<Integer, CryptographicParameterGenerator>();
        this.y = new ConcurrentHashMap<Integer, CryptographicParameterGenerator>();
        this.E = new ConcurrentHashMap<Integer, CryptographicParameterGenerator>();
        this.f = new ConcurrentHashMap<Integer, CryptographicParameterGenerator>();
    }

    public CryptographicParameterGenerator E(SystemParameterConfiguration systemParameterConfiguration, float f, boolean bl) {
        int n = (int)(16.0f * f);
        double d2 = TemporalMetadataResolver.h.a().b();
        n = (int)((double)n * d2);
        return this.L(systemParameterConfiguration, n, bl);
    }

    public boolean h() {
        return this.w;
    }

    public CryptographicParameterGenerator z(int n) {
        long l = a ^ 0x2A31825F21D6L;
        CryptographicParameterGenerator cryptographicParameterGenerator = (CryptographicParameterGenerator)this.f.get(n);
        try {
            if (cryptographicParameterGenerator != null) {
                return cryptographicParameterGenerator;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw FontRenderingEngine.a(customSystemException);
        }
        CryptographicParameterGenerator cryptographicParameterGenerator2 = ConfigurationManager.U() ? new ComputationalModelCalibrator(this.s, n, (String)((Object)FontRenderingEngine.b("\u00f2", (int)FontRenderingEngine.a("d", (int)30220, (long)(0x1F5024F74B9DCFB9L ^ l)), (long)-1442286789763302400L, (long)l))) : new ResourceAllocationManager420(this.s, n);
        this.f.put(n, cryptographicParameterGenerator2);
        return cryptographicParameterGenerator2;
    }

    public CryptographicParameterGenerator W(int n, boolean bl) {
        SystemParameterConfiguration systemParameterConfiguration = TemporalMetadataResolver.h.e().l().W();
        try {
            if (systemParameterConfiguration != null) {
                return this.L(systemParameterConfiguration, n, bl);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw FontRenderingEngine.a(customSystemException);
        }
        return this.A(n, bl);
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Y7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(FontRenderingEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(FontRenderingEngine.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

