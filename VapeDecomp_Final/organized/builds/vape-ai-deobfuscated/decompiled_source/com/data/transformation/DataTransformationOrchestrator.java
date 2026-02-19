/*
 * Decompiled with CFR 0.152.
 */
package com.data.transformation;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.multimedia.codec.MultimediaCodecOrchestrator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
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

public class DataTransformationOrchestrator
extends CryptoProtocolEngine {
    private ReflectionUtilityService o;
    private ReflectionUtilityService H;
    private ReflectionUtilityService S;
    private final HK s;
    private static final Integer[] f;
    private static final long b;
    private static final String[] k;
    private static final Map g;
    private ReflectionUtilityService R;
    private ReflectionUtilityService n;
    private ReflectionUtilityService w;
    private ReflectionUtilityService e;
    private static final Object[] i;
    private HK Q;
    private HK t;
    private ReflectionUtilityService V;
    private ReflectionUtilityService j;
    private static final long[] d;
    private ReflectionUtilityService c;
    private ReflectionUtilityService p;
    private ReflectionUtilityService h;
    private ReflectionUtilityService W;
    private ReflectionUtilityService M;
    private ReflectionUtilityService U;
    private ReflectionUtilityService a;

    private int O(Object object) {
        return this.U.R(object);
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "\tU*\u000e";
        objectArray[1] = "\u0013[#\u0012\u0016W\u0018T2]{W\u0018I&";
        objectArray[2] = "\\,\u0010h#DW#\u0001'^\\D$\bn";
        objectArray[3] = Boolean.TYPE;
        DataTransformationOrchestrator.k[3] = "java/lang/Boolean";
        objectArray[4] = "\u00125\\Q";
        objectArray[5] = "!f[b\u000e\u0000TFPm\u001fO9FPp\u000bZ";
        objectArray[6] = "\u0000UIa";
        objectArray[7] = "j\u0003J";
        objectArray[8] = Integer.TYPE;
        DataTransformationOrchestrator.k[8] = "java/lang/Integer";
        objectArray[9] = "\u0014\u0011DG";
        objectArray[10] = "$v6gb\u001dQV=hsR<V=ugG";
        objectArray[11] = "\u0012S>\\Tk\u0019\\/\u00135e\u0012W+I";
        objectArray[12] = "-`<G&*pe3v\u0006[vi=\u001a$7p=%\u001c\\b+f)\u00162%4)avf0%=\"\u0007agqfXOm># 4I9&%Xb\u00077cr=3Ha!O";
        objectArray[13] = "Rj\u0019k\u0013\u001b\u000fo\u0016Z.j\t6C+\t\u0004N)\fciP[8\u0018 \u0018W\flCZP[U>\u00056V\u000fM8}d\u001b\u0012V\"\fbX\u0016RRA>\u0000\u0015Ao\u0007*P\u00100";
        objectArray[14] = "A~\f<p\u0016\u001c{\u0003\rQg\u001a\"V|j\t]=\u00194\n]H,\rw{Z\u001fxV\r3VF*\u0010a5\u0002^,h7{\f\u001b{\rf4ZYF";
        objectArray[15] = ";#H(q\u001ef&G\u0019So`\u007f\u0012hk\u0001'`] \u000bVh~@agP<fF\u00195\u000ec+PksP8k,";
        objectArray[16] = "c4\u0014M\b->1\u001b|?\\8hN\r\u00122\u007fw\u0001Erfjf\u0015\u0006\u0003a=2N|Kmd`\b\u0010M9|fpF\u0003791\u0015\u0017La{\f";
        objectArray[17] = ":A\u000e\f#*gD\u0001=\u0004[a\u001dTL95&\u0002\u001b\u0004Ya3\u0013\u000fG(fdGT=`j=\u0015\u0012Qf>%\u0013j\u0003+#>\t\u001b\u0005h':yVY0$)D\u0010M`!X";
        Object[] objectArray2 = objectArray;
        objectArray[18] = "\u0019z75\bG\\-1:6K_C`tL^\u00188=e\u000bZ$z94G@J=&{\u000f ";
    }

    static Object j(DataTransformationOrchestrator dataTransformationOrchestrator, int n) {
        return dataTransformationOrchestrator.O(n);
    }

    private static Field g(long l, long l2) {
        int n = DataTransformationOrchestrator.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = DataTransformationOrchestrator.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = DataTransformationOrchestrator.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = DataTransformationOrchestrator.c(clazz3, string2, clazz2)) != null) {
                    DataTransformationOrchestrator.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = DataTransformationOrchestrator.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        DataTransformationOrchestrator.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = DataTransformationOrchestrator.f(823939538097850L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private String Z(Object object, int n) {
        return (String)this.s.T(object, n);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c2' || c == 'e' || c == 'Y' || c == '\u00c7') {
                field = DataTransformationOrchestrator.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = DataTransformationOrchestrator.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static String n(DataTransformationOrchestrator dataTransformationOrchestrator, Object object, int n) {
        return dataTransformationOrchestrator.Z(object, n);
    }

    /*
     * Unable to fully structure code
     */
    public DataTransformationOrchestrator() {
        block40: {
            block38: {
                block37: {
                    block34: {
                        block36: {
                            block35: {
                                var1_1 = DataTransformationOrchestrator.b ^ 135376989980909L;
                                v0 = MultimediaCodecOrchestrator.l();
                                super(ReflectionMetadataResolver.PW);
                                var3_2 = v0;
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var3_2 == null) break block34;
                                                if (GameVersionEnumerator.MC_1_12_2.H()) {
                                                }
                                                ** GOTO lbl61
                                            }
                                            catch (CustomSystemException v1) {
                                                throw DataTransformationOrchestrator.a(v1);
                                            }
                                            v2 = GameVersionEnumerator.MC_1_16_5.H();
                                            if (var3_2 == null) break block35;
                                        }
                                        catch (CustomSystemException v3) {
                                            throw DataTransformationOrchestrator.a(v3);
                                        }
                                        if (v2) {
                                        }
                                        ** GOTO lbl54
                                    }
                                    catch (CustomSystemException v4) {
                                        throw DataTransformationOrchestrator.a(v4);
                                    }
                                    v2 = GameVersionEnumerator.MC_1_20_6.H();
                                }
                                catch (CustomSystemException v5) {
                                    throw DataTransformationOrchestrator.a(v5);
                                }
                            }
                            try {
                                try {
                                    if (var3_2 == null) break block36;
                                    if (v2) {
                                    }
                                    ** GOTO lbl49
                                }
                                catch (CustomSystemException v6) {
                                    throw DataTransformationOrchestrator.a(v6);
                                }
                                v2 = GameVersionEnumerator.MC_1_21_0.H();
                            }
                            catch (CustomSystemException v7) {
                                throw DataTransformationOrchestrator.a(v7);
                            }
                        }
                        if (v2) break block37;
                        try {
                            try {
                                try {
                                    this.V = DataTransformationOrchestrator.c("\u00e4", (Object)this, (Object)ReflectionMetadataResolver.PA, (Object)DataTransformationOrchestrator.c("\u00cd", (int)DataTransformationOrchestrator.b("f", (int)7730, (long)(2855740099897674676L ^ var1_1)), (long)-8094772616719187993L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bB, (long)-8093506838604368164L, (long)var1_1);
                                    if (var3_2 != null) break block37;
lbl49:
                                    // 2 sources

                                    this.V = DataTransformationOrchestrator.c("\u00e4", (Object)this, (Object)ReflectionMetadataResolver.bB, (Object)DataTransformationOrchestrator.c("\u00cd", (int)DataTransformationOrchestrator.b("f", (int)16750, (long)(6622048967592187114L ^ var1_1)), (long)-8094772616719187993L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.bB, (long)-8093506838604368164L, (long)var1_1);
                                    if (var3_2 != null) break block37;
                                }
                                catch (CustomSystemException v8) {
                                    throw DataTransformationOrchestrator.a(v8);
                                }
lbl54:
                                // 2 sources

                                this.Q = DataTransformationOrchestrator.c("\u00e4", (Object)this, (Object)DataTransformationOrchestrator.c("\u00cd", (int)DataTransformationOrchestrator.b("f", (int)18073, (long)(6489095502105645852L ^ var1_1)), (long)-8094772616719187993L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.PW, (Object)new Class[]{Integer.TYPE}, (long)-8094799706510970159L, (long)var1_1);
                                this.t = DataTransformationOrchestrator.c("\u00e4", (Object)this, (Object)DataTransformationOrchestrator.c("\u00cd", (int)DataTransformationOrchestrator.b("f", (int)27787, (long)(1820563321216973067L ^ var1_1)), (long)-8094772616719187993L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.PW}, (long)-8094799706510970159L, (long)var1_1);
                                this.V = DataTransformationOrchestrator.c("\u00e4", (Object)this, (Object)DataTransformationOrchestrator.c("\u00cd", (int)DataTransformationOrchestrator.b("f", (int)1987, (long)(2374711978405286474L ^ var1_1)), (long)-8094772616719187993L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.F3, (long)-8094890175962855610L, (long)var1_1);
                                if (var3_2 != null) break block37;
                            }
                            catch (CustomSystemException v9) {
                                throw DataTransformationOrchestrator.a(v9);
                            }
lbl61:
                            // 2 sources

                            this.U = DataTransformationOrchestrator.c("\u00e4", (Object)this, (Object)DataTransformationOrchestrator.c("\u00cd", (int)DataTransformationOrchestrator.b("f", (int)21541, (long)(6873355471351185837L ^ var1_1)), (long)-8094772616719187993L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-8093345756400956972L, (long)var1_1);
                        }
                        catch (CustomSystemException v10) {
                            throw DataTransformationOrchestrator.a(v10);
                        }
                    }
                    this.n = ((ThreadPoolCoordinator)DataTransformationOrchestrator.c("\u00e4", (Object)this, (Object)DataTransformationOrchestrator.c("\u00cd", (int)DataTransformationOrchestrator.b("f", (int)17408, (long)(7047093626681430407L ^ var1_1)), (long)-8094772616719187993L, (long)var1_1), (Object)ReflectionMetadataResolver.PW, (long)-8093316188651008438L, (long)var1_1).L(true)).q(1).p();
                }
                try {
                    block39: {
                        try {
                            try {
                                v11 = GameVersionEnumerator.MC_1_21_0.H();
                                if (var3_2 == null) break block38;
                                if (!v11) break block39;
                            }
                            catch (CustomSystemException v12) {
                                throw DataTransformationOrchestrator.a(v12);
                            }
                            this.s = DataTransformationOrchestrator.c("\u00e4", (Object)this, (Object)DataTransformationOrchestrator.c("\u00cd", (int)DataTransformationOrchestrator.b("f", (int)19362, (long)(3567723750638460449L ^ var1_1)), (long)-8094772616719187993L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V_, (Object)new Class[]{ReflectionMetadataResolver.rM, Integer.TYPE}, (long)-8094799706510970159L, (long)var1_1);
                            if (var3_2 != null) break block40;
                        }
                        catch (CustomSystemException v13) {
                            throw DataTransformationOrchestrator.a(v13);
                        }
                    }
                    v11 = GameVersionEnumerator.MC_1_16_5.H();
                }
                catch (CustomSystemException v14) {
                    throw DataTransformationOrchestrator.a(v14);
                }
            }
            try {
                block41: {
                    try {
                        if (!v11) break block41;
                        this.s = DataTransformationOrchestrator.c("\u00e4", (Object)this, (Object)DataTransformationOrchestrator.c("\u00cd", (int)DataTransformationOrchestrator.b("f", (int)3602, (long)(4664330249351060368L ^ var1_1)), (long)-8094772616719187993L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V_, (Object)new Class[]{Integer.TYPE}, (long)-8093420797766894390L, (long)var1_1);
                        if (var3_2 != null) break block40;
                    }
                    catch (CustomSystemException v15) {
                        throw DataTransformationOrchestrator.a(v15);
                    }
                }
                this.s = DataTransformationOrchestrator.c("\u00e4", (Object)this, (Object)DataTransformationOrchestrator.c("\u00cd", (int)DataTransformationOrchestrator.b("f", (int)24285, (long)(1938366870288960348L ^ var1_1)), (long)-8094772616719187993L, (long)var1_1), (boolean)true, String.class, (Object)new Class[]{Integer.TYPE}, (long)-8093420797766894390L, (long)var1_1);
            }
            catch (CustomSystemException v16) {
                throw DataTransformationOrchestrator.a(v16);
            }
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                MultimediaCodecOrchestrator.m(new int[4]);
            }
        }
        catch (CustomSystemException v17) {
            throw DataTransformationOrchestrator.a(v17);
        }
    }

    static Object q(DataTransformationOrchestrator dataTransformationOrchestrator) {
        return dataTransformationOrchestrator.r();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                DataTransformationOrchestrator.b = MultiContainerRegistry.a(-4051120051334081634L, 4189856138788311364L, MethodHandles.lookup().lookupClass()).a(20376855523915L);
                DataTransformationOrchestrator.i = new Object[19];
                DataTransformationOrchestrator.k = new String[19];
                DataTransformationOrchestrator.a();
                DataTransformationOrchestrator.g = new HashMap<K, V>(13);
                var0 = DataTransformationOrchestrator.b ^ 10836088809301L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u009d\u0096$s\u00c3\u00fc\u007f\u0014,\r]i\u0097Sg\u00fe\u00deB\u00a54sj<w\u00a3\u00b9\u0091\u00e4\u00170\u0016J\u0096\u00a2y\u00dd%\u0081\u001f\u00a8\u00c1\u00a1\u00fd3\u00e3.c\u00a5`Zl\u00e3\u00cd\u00d2\u00fcc\u0091\u00e3\u00b4\u00e0\u00cc\u009c\u00c0R";
                var7_6 = "\u009d\u0096$s\u00c3\u00fc\u007f\u0014,\r]i\u0097Sg\u00fe\u00deB\u00a54sj<w\u00a3\u00b9\u0091\u00e4\u00170\u0016J\u0096\u00a2y\u00dd%\u0081\u001f\u00a8\u00c1\u00a1\u00fd3\u00e3.c\u00a5`Zl\u00e3\u00cd\u00d2\u00fcc\u0091\u00e3\u00b4\u00e0\u00cc\u009c\u00c0R".length();
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
                    var6_5 = "\u00a9\u00eaa2\u00a7j\u00d9\u00e5\u00b3\u00a1:\u0092B\u00caX\u001a";
                    var7_6 = "\u00a9\u00eaa2\u00a7j\u00d9\u00e5\u00b3\u00a1:\u0092B\u00caX\u001a".length();
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
        DataTransformationOrchestrator.d = var8_3;
        DataTransformationOrchestrator.f = new Integer[10];
    }

    static Object p(DataTransformationOrchestrator dataTransformationOrchestrator, Object object, int n) {
        return dataTransformationOrchestrator.s(object, n);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ug" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object W(Object object, int n) {
        return this.s.T(object, n);
    }

    private Object r() {
        return this.V.Z(null);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = DataTransformationOrchestrator.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = DataTransformationOrchestrator.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
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

    static Object t(DataTransformationOrchestrator dataTransformationOrchestrator, Object object, int n) {
        return dataTransformationOrchestrator.W(object, n);
    }

    static int R(DataTransformationOrchestrator dataTransformationOrchestrator, Object object) {
        return dataTransformationOrchestrator.O(object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = DataTransformationOrchestrator.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5A2C;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
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
                throw new RuntimeException("a/Ug", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DataTransformationOrchestrator.f[n2] = n3;
        }
        return f[n2];
    }

    private int t(Object object) {
        return this.t.R(null, object);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n4] != null) {
            return n4;
        }
        Object object = i[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 12;
                break;
            }
            case 1: {
                n3 = 8;
                break;
            }
            case 2: {
                n3 = 52;
                break;
            }
            case 3: {
                n3 = 48;
                break;
            }
            case 4: {
                n3 = 39;
                break;
            }
            case 5: {
                n3 = 20;
                break;
            }
            case 6: {
                n3 = 30;
                break;
            }
            case 7: {
                n3 = 2;
                break;
            }
            case 8: {
                n3 = 23;
                break;
            }
            case 9: {
                n3 = 9;
                break;
            }
            case 10: {
                n3 = 50;
                break;
            }
            case 11: {
                n3 = 31;
                break;
            }
            case 12: {
                n3 = 49;
                break;
            }
            case 13: {
                n3 = 15;
                break;
            }
            case 14: {
                n3 = 53;
                break;
            }
            case 15: {
                n3 = 3;
                break;
            }
            case 16: {
                n3 = 17;
                break;
            }
            case 17: {
                n3 = 32;
                break;
            }
            case 18: {
                n3 = 24;
                break;
            }
            case 19: {
                n3 = 29;
                break;
            }
            case 20: {
                n3 = 44;
                break;
            }
            case 21: {
                n3 = 47;
                break;
            }
            case 22: {
                n3 = 28;
                break;
            }
            case 23: {
                n3 = 25;
                break;
            }
            case 24: {
                n3 = 61;
                break;
            }
            case 25: {
                n3 = 54;
                break;
            }
            case 26: {
                n3 = 5;
                break;
            }
            case 27: {
                n3 = 57;
                break;
            }
            case 28: {
                n3 = 41;
                break;
            }
            case 29: {
                n3 = 40;
                break;
            }
            case 30: {
                n3 = 16;
                break;
            }
            case 31: {
                n3 = 14;
                break;
            }
            case 32: {
                n3 = 38;
                break;
            }
            case 33: {
                n3 = 59;
                break;
            }
            case 34: {
                n3 = 62;
                break;
            }
            case 35: {
                n3 = 42;
                break;
            }
            case 36: {
                n3 = 33;
                break;
            }
            case 37: {
                n3 = 18;
                break;
            }
            case 38: {
                n3 = 34;
                break;
            }
            case 39: {
                n3 = 11;
                break;
            }
            case 40: {
                n3 = 56;
                break;
            }
            case 41: {
                n3 = 10;
                break;
            }
            case 42: {
                n3 = 35;
                break;
            }
            case 43: {
                n3 = 46;
                break;
            }
            case 44: {
                n3 = 63;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 37;
                break;
            }
            case 47: {
                n3 = 60;
                break;
            }
            case 48: {
                n3 = 26;
                break;
            }
            case 49: {
                n3 = 19;
                break;
            }
            case 50: {
                n3 = 43;
                break;
            }
            case 51: {
                n3 = 0;
                break;
            }
            case 52: {
                n3 = 27;
                break;
            }
            case 53: {
                n3 = 21;
                break;
            }
            case 54: {
                n3 = 13;
                break;
            }
            case 55: {
                n3 = 36;
                break;
            }
            case 56: {
                n3 = 22;
                break;
            }
            case 57: {
                n3 = 4;
                break;
            }
            case 58: {
                n3 = 6;
                break;
            }
            case 59: {
                n3 = 51;
                break;
            }
            case 60: {
                n3 = 55;
                break;
            }
            case 61: {
                n3 = 7;
                break;
            }
            case 62: {
                n3 = 1;
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
        DataTransformationOrchestrator.k[n4] = new String(cArray);
        return n4;
    }

    static int j(DataTransformationOrchestrator dataTransformationOrchestrator, Object object) {
        return dataTransformationOrchestrator.t(object);
    }

    static Object[] b(DataTransformationOrchestrator dataTransformationOrchestrator) {
        return dataTransformationOrchestrator.p();
    }

    private static Method h(long l, long l2) {
        int n = DataTransformationOrchestrator.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = DataTransformationOrchestrator.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = DataTransformationOrchestrator.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = DataTransformationOrchestrator.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        DataTransformationOrchestrator.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = DataTransformationOrchestrator.f(823939538097850L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = DataTransformationOrchestrator.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        DataTransformationOrchestrator.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = DataTransformationOrchestrator.f(823939538097850L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = DataTransformationOrchestrator.e(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                DataTransformationOrchestrator.i[n] = clazz = Class.forName(k[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DataTransformationOrchestrator.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ug" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private Object s(Object object, int n) {
        return this.s.T(null, object, n);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private Object[] p() {
        return this.n.t(null);
    }

    private Object O(int n) {
        return this.Q.T(null, n);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = DataTransformationOrchestrator.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = DataTransformationOrchestrator.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(DataTransformationOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(DataTransformationOrchestrator.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

