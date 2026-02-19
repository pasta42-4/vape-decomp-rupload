/*
 * Decompiled with CFR 0.152.
 */
package com.data.encoding;

import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class EncodingTransformationService
extends CryptoProtocolEngine {
    private static final long a;
    private static final String[] g;
    private final ReflectionUtilityService y;
    private final ReflectionUtilityService Q;
    private final ReflectionUtilityService Z;
    private final ReflectionUtilityService m;
    private final ReflectionUtilityService c;
    private static final Object[] f;
    private final ReflectionUtilityService z;
    private ReflectionUtilityService J;
    private static String[] S;
    private final ReflectionUtilityService E;
    private ReflectionUtilityService K;
    private static final Integer[] d;
    private static final Map e;
    private static final long[] b;
    private final ReflectionUtilityService D;
    private final ReflectionUtilityService A;
    private ReflectionUtilityService Y;
    private ReflectionUtilityService h;

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = EncodingTransformationService.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = EncodingTransformationService.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5962;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/q4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EncodingTransformationService.d[n2] = n3;
        }
        return d[n2];
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "(\bN";
        objectArray[1] = Integer.TYPE;
        EncodingTransformationService.g[1] = "java/lang/Integer";
        objectArray[2] = "?HjiBV4G{&?N'@ro";
        objectArray[3] = "V\u001d8\u000b";
        objectArray[4] = Boolean.TYPE;
        EncodingTransformationService.g[4] = "java/lang/Boolean";
        objectArray[5] = "\u0013\f\u0004Y&%\u0018\u0003\u0015\u0016K%\u0018\u001e\u0001";
        objectArray[6] = "r\u00197(";
        objectArray[7] = "5_TE\b^>PE\niP5[AP";
        objectArray[8] = "(z.{K\u0003o\u007fw\")>\u0012~x&P\u001e\u007f(nmHe(6p&\u0017\u0007n&u&)^r-jdF_u'h\u001d\u0015\u001c}|g'T\u000esy\u0015";
        objectArray[9] = "}RXp-$}^\\\u001d/#\u0011@@,u>{B\u0001yDa|\u0005Bf)7jNZ\u001d";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "#LJ_b\u0018dI\u0013\u0006\u0000/\u0019J\u0011S\u007f\u0007vK\u0016Y}~ \u001cJ@{\u0013v\n\u0001X\u0000Dh\u0014J\u0007b\u0002x\u0011J9;\u001es\u000e\bV:\u0019y\fq\u0005y\u0011\"\u0003KDk\u001f'q";
    }

    static float Z(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.H(object);
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

    private float p(Object object) {
        return this.c.x(object);
    }

    static void x(EncodingTransformationService encodingTransformationService, Object object, boolean bl) {
        encodingTransformationService.W(object, bl);
    }

    private void W(Object object, boolean bl) {
        this.J.B(object, bl);
    }

    public EncodingTransformationService() {
        block18: {
            long l;
            block16: {
                block17: {
                    String[] stringArray;
                    block15: {
                        block13: {
                            l = a ^ 0x676D3C7896A9L;
                            String[] stringArray2 = EncodingTransformationService.o();
                            super(ReflectionMetadataResolver.Ua);
                            stringArray = stringArray2;
                            try {
                                block14: {
                                    try {
                                        try {
                                            if (stringArray != null) break block13;
                                            if (GeometryCalculator.C() < 37) break block14;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw EncodingTransformationService.a(customSystemException);
                                        }
                                        this.y = EncodingTransformationService.c("m", (Object)this, (Object)ReflectionMetadataResolver.i, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)18309, (long)(0x5C86D0DB242C52DDL ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Integer.TYPE, (long)-3731056458726040794L, (long)l);
                                        this.z = EncodingTransformationService.c("m", (Object)this, (Object)ReflectionMetadataResolver.i, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)25812, (long)(0x7D6E5A997221F186L ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Integer.TYPE, (long)-3731056458726040794L, (long)l);
                                        if (stringArray == null) break block15;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw EncodingTransformationService.a(customSystemException);
                                    }
                                }
                                this.y = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)9687, (long)(0x348445008A99B08BL ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Integer.TYPE, (long)-3731188288280484697L, (long)l);
                            }
                            catch (CustomSystemException customSystemException) {
                                throw EncodingTransformationService.a(customSystemException);
                            }
                        }
                        this.z = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)951, (long)(0x76BF9930647816EDL ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Integer.TYPE, (long)-3731188288280484697L, (long)l);
                    }
                    try {
                        try {
                            this.A = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)7066, (long)(0x65CDBC40765C8ECEL ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Float.TYPE, (long)-3731188288280484697L, (long)l);
                            this.Z = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)25370, (long)(0x5DB0D74B0ECBF645L ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Float.TYPE, (long)-3731188288280484697L, (long)l);
                            this.D = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)29327, (long)(0xF39F320874A67D2L ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Float.TYPE, (long)-3731188288280484697L, (long)l);
                            this.m = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)8404, (long)(0x13BEE170374F3584L ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Float.TYPE, (long)-3731188288280484697L, (long)l);
                            this.E = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)15850, (long)(0x326FB6FCF1AF28BFL ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Float.TYPE, (long)-3731188288280484697L, (long)l);
                            this.c = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)22565, (long)(0x5D93A3A1BE4C4D73L ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Float.TYPE, (long)-3731188288280484697L, (long)l);
                            this.Q = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)3720, (long)(0x7F760519D1269BD3L ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Boolean.TYPE, (long)-3731188288280484697L, (long)l);
                            if (stringArray != null) break block16;
                            if (GeometryCalculator.C() < 35) break block17;
                            break block18;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw EncodingTransformationService.a(customSystemException);
                        }
                    }
                    catch (CustomSystemException customSystemException) {
                        throw EncodingTransformationService.a(customSystemException);
                    }
                }
                this.h = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)11744, (long)(0x7BB60A80048938B9L ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Float.TYPE, (long)-3731188288280484697L, (long)l);
                this.K = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)6879, (long)(0x5986DD285D8A8F8EL ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Float.TYPE, (long)-3731188288280484697L, (long)l);
                this.Y = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)12750, (long)(0x2D7012DD55B12490L ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Float.TYPE, (long)-3731188288280484697L, (long)l);
            }
            this.J = EncodingTransformationService.c("m", (Object)this, (Object)EncodingTransformationService.c("\u00e6", (int)EncodingTransformationService.b("s", (int)14045, (long)(0x412EB9A95D9A38EL ^ l)), (long)-3731140448806405429L, (long)l), (boolean)true, Boolean.TYPE, (long)-3731188288280484697L, (long)l);
        }
        try {
            if (AbstractComputationKernel.J() != null) {
                EncodingTransformationService.p(new String[2]);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw EncodingTransformationService.a(customSystemException);
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/q4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private float k(Object object) {
        return this.K.x(object);
    }

    private float v(Object object) {
        return this.Z.x(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                EncodingTransformationService.a = MultiContainerRegistry.a(8621601042575344492L, -6840920138893246284L, MethodHandles.lookup().lookupClass()).a(39577561500406L);
                EncodingTransformationService.f = new Object[11];
                EncodingTransformationService.g = new String[11];
                EncodingTransformationService.a();
                EncodingTransformationService.e = new HashMap<K, V>(13);
                EncodingTransformationService.p(null);
                var0 = EncodingTransformationService.a ^ 108175542920703L;
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
                var8_3 = new long[15];
                var5_4 = 0;
                var6_5 = "\u00eaU\u00d6\u001c|\u0086\u0013\u00b6\u00e5\u0014h\u009c\rR|\u00e5?{@C\u0083\u00fe\u0006?\u00b0\u0098\u0088x.`>JtXx\u00e0OZM\u00b5d`Vj/\u001e\u00b1\u008d\u008dc\u00e6\t\u00c1\u0000%\u00a5\u001b\u00df\u00ba\u00b7\u0086n\u000b\u00be\u000f\u00be\u008f\u008f\u0005\u0090\u001b0T\u00da\u0016\tp\u00be;\u0097\u00a6\u0003r\u00bb>\u00ee\u0019\u0082\u00fb\u00b9a@:o\u00b5`\u00a0\u00b2*HA\u00b9\u001f\u0085";
                var7_6 = "\u00eaU\u00d6\u001c|\u0086\u0013\u00b6\u00e5\u0014h\u009c\rR|\u00e5?{@C\u0083\u00fe\u0006?\u00b0\u0098\u0088x.`>JtXx\u00e0OZM\u00b5d`Vj/\u001e\u00b1\u008d\u008dc\u00e6\t\u00c1\u0000%\u00a5\u001b\u00df\u00ba\u00b7\u0086n\u000b\u00be\u000f\u00be\u008f\u008f\u0005\u0090\u001b0T\u00da\u0016\tp\u00be;\u0097\u00a6\u0003r\u00bb>\u00ee\u0019\u0082\u00fb\u00b9a@:o\u00b5`\u00a0\u00b2*HA\u00b9\u001f\u0085".length();
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
lbl30:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "b\u00d4\u00b8K\u00c8\u000bt2h{\u00d2\u0015\u00c3\u00d0\u0097\u0081";
                    var7_6 = "b\u00d4\u00b8K\u00c8\u000bt2h{\u00d2\u0015\u00c3\u00d0\u0097\u0081".length();
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
lbl43:
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
lbl56:
                // 1 sources

                ** continue;
            }
        }
        EncodingTransformationService.b = var8_3;
        EncodingTransformationService.d = new Integer[15];
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = EncodingTransformationService.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                EncodingTransformationService.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private float r(Object object) {
        return this.h.x(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == 't' || c == '\u00e3' || c == '\u00ff') {
                field = EncodingTransformationService.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 't' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = EncodingTransformationService.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private float H(Object object) {
        return this.Y.x(object);
    }

    static int C(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.Z(object);
    }

    private static Field g(long l, long l2) {
        int n = EncodingTransformationService.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = EncodingTransformationService.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = EncodingTransformationService.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = EncodingTransformationService.c(clazz3, string2, clazz2)) != null) {
                    EncodingTransformationService.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = EncodingTransformationService.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        EncodingTransformationService.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = EncodingTransformationService.f(515255060278630L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/q4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static int R(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.k(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = EncodingTransformationService.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = EncodingTransformationService.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static float H(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.k(object);
    }

    static float o(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.v(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = EncodingTransformationService.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = EncodingTransformationService.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static String[] o() {
        return S;
    }

    public static void p(String[] stringArray) {
        S = stringArray;
    }

    static float U(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.z(object);
    }

    private float R(Object object) {
        return this.A.x(object);
    }

    static float e(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.r(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    static void Y(EncodingTransformationService encodingTransformationService, Object object, boolean bl) {
        encodingTransformationService.r(object, bl);
    }

    private float z(Object object) {
        return this.E.x(object);
    }

    private static Method h(long l, long l2) {
        int n = EncodingTransformationService.e(l, l2);
        Object object = f[n];
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
                clazz3 = EncodingTransformationService.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = EncodingTransformationService.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = EncodingTransformationService.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        EncodingTransformationService.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = EncodingTransformationService.f(515255060278630L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = EncodingTransformationService.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        EncodingTransformationService.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = EncodingTransformationService.f(515255060278630L, 0L);
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static float l(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.p(object);
    }

    private float C(Object object) {
        return this.D.x(object);
    }

    static float z(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.R(object);
    }

    private void r(Object object, boolean bl) {
        this.Q.B(object, bl);
    }

    private int Z(Object object) {
        return this.z.R(object);
    }

    private float e(Object object) {
        return this.m.x(object);
    }

    static float P(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.C(object);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = f[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 10;
                break;
            }
            case 1: {
                n3 = 12;
                break;
            }
            case 2: {
                n3 = 62;
                break;
            }
            case 3: {
                n3 = 46;
                break;
            }
            case 4: {
                n3 = 27;
                break;
            }
            case 5: {
                n3 = 8;
                break;
            }
            case 6: {
                n3 = 6;
                break;
            }
            case 7: {
                n3 = 48;
                break;
            }
            case 8: {
                n3 = 1;
                break;
            }
            case 9: {
                n3 = 29;
                break;
            }
            case 10: {
                n3 = 31;
                break;
            }
            case 11: {
                n3 = 39;
                break;
            }
            case 12: {
                n3 = 51;
                break;
            }
            case 13: {
                n3 = 24;
                break;
            }
            case 14: {
                n3 = 21;
                break;
            }
            case 15: {
                n3 = 59;
                break;
            }
            case 16: {
                n3 = 57;
                break;
            }
            case 17: {
                n3 = 7;
                break;
            }
            case 18: {
                n3 = 63;
                break;
            }
            case 19: {
                n3 = 50;
                break;
            }
            case 20: {
                n3 = 18;
                break;
            }
            case 21: {
                n3 = 19;
                break;
            }
            case 22: {
                n3 = 25;
                break;
            }
            case 23: {
                n3 = 40;
                break;
            }
            case 24: {
                n3 = 44;
                break;
            }
            case 25: {
                n3 = 33;
                break;
            }
            case 26: {
                n3 = 2;
                break;
            }
            case 27: {
                n3 = 58;
                break;
            }
            case 28: {
                n3 = 4;
                break;
            }
            case 29: {
                n3 = 55;
                break;
            }
            case 30: {
                n3 = 42;
                break;
            }
            case 31: {
                n3 = 35;
                break;
            }
            case 32: {
                n3 = 60;
                break;
            }
            case 33: {
                n3 = 53;
                break;
            }
            case 34: {
                n3 = 22;
                break;
            }
            case 35: {
                n3 = 17;
                break;
            }
            case 36: {
                n3 = 9;
                break;
            }
            case 37: {
                n3 = 37;
                break;
            }
            case 38: {
                n3 = 45;
                break;
            }
            case 39: {
                n3 = 36;
                break;
            }
            case 40: {
                n3 = 49;
                break;
            }
            case 41: {
                n3 = 43;
                break;
            }
            case 42: {
                n3 = 38;
                break;
            }
            case 43: {
                n3 = 13;
                break;
            }
            case 44: {
                n3 = 32;
                break;
            }
            case 45: {
                n3 = 23;
                break;
            }
            case 46: {
                n3 = 28;
                break;
            }
            case 47: {
                n3 = 15;
                break;
            }
            case 48: {
                n3 = 26;
                break;
            }
            case 49: {
                n3 = 3;
                break;
            }
            case 50: {
                n3 = 0;
                break;
            }
            case 51: {
                n3 = 30;
                break;
            }
            case 52: {
                n3 = 47;
                break;
            }
            case 53: {
                n3 = 52;
                break;
            }
            case 54: {
                n3 = 20;
                break;
            }
            case 55: {
                n3 = 11;
                break;
            }
            case 56: {
                n3 = 56;
                break;
            }
            case 57: {
                n3 = 14;
                break;
            }
            case 58: {
                n3 = 54;
                break;
            }
            case 59: {
                n3 = 34;
                break;
            }
            case 60: {
                n3 = 16;
                break;
            }
            case 61: {
                n3 = 41;
                break;
            }
            case 62: {
                n3 = 5;
                break;
            }
            default: {
                n3 = 61;
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
        EncodingTransformationService.g[n4] = new String(cArray);
        return n4;
    }

    static float W(EncodingTransformationService encodingTransformationService, Object object) {
        return encodingTransformationService.e(object);
    }

    private int k(Object object) {
        return this.y.R(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(EncodingTransformationService.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(EncodingTransformationService.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

