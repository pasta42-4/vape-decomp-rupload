/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
import com.network.transmission.SecureDataTransmissionHandler;
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

public class qd
extends CryptoProtocolEngine {
    private ReflectionUtilityService N;
    private ReflectionUtilityService g;
    private static final long a;
    private ReflectionUtilityService Z;
    private ReflectionUtilityService e;
    private static final Object[] h;
    private static final Map d;
    private ReflectionUtilityService K;
    private ReflectionUtilityService P;
    private static final long[] b;
    private static final Integer[] c;
    private ReflectionUtilityService B;
    private static final String[] i;
    private ReflectionUtilityService f;

    private void I(Object object, float f) {
        this.B.H(object, f);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    static void q(qd qd2, Object object, float f) {
        qd2.y(object, f);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = qd.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    static void c(qd qd2, Object object, int n) {
        qd2.s(object, n);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n4] != null) {
            return n4;
        }
        Object object = h[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 35;
                break;
            }
            case 1: {
                n3 = 17;
                break;
            }
            case 2: {
                n3 = 19;
                break;
            }
            case 3: {
                n3 = 28;
                break;
            }
            case 4: {
                n3 = 58;
                break;
            }
            case 5: {
                n3 = 59;
                break;
            }
            case 6: {
                n3 = 34;
                break;
            }
            case 7: {
                n3 = 6;
                break;
            }
            case 8: {
                n3 = 2;
                break;
            }
            case 9: {
                n3 = 1;
                break;
            }
            case 10: {
                n3 = 61;
                break;
            }
            case 11: {
                n3 = 48;
                break;
            }
            case 12: {
                n3 = 7;
                break;
            }
            case 13: {
                n3 = 10;
                break;
            }
            case 14: {
                n3 = 57;
                break;
            }
            case 15: {
                n3 = 11;
                break;
            }
            case 16: {
                n3 = 41;
                break;
            }
            case 17: {
                n3 = 39;
                break;
            }
            case 18: {
                n3 = 9;
                break;
            }
            case 19: {
                n3 = 54;
                break;
            }
            case 20: {
                n3 = 15;
                break;
            }
            case 21: {
                n3 = 52;
                break;
            }
            case 22: {
                n3 = 24;
                break;
            }
            case 23: {
                n3 = 53;
                break;
            }
            case 24: {
                n3 = 26;
                break;
            }
            case 25: {
                n3 = 0;
                break;
            }
            case 26: {
                n3 = 5;
                break;
            }
            case 27: {
                n3 = 21;
                break;
            }
            case 28: {
                n3 = 29;
                break;
            }
            case 29: {
                n3 = 55;
                break;
            }
            case 30: {
                n3 = 43;
                break;
            }
            case 31: {
                n3 = 51;
                break;
            }
            case 32: {
                n3 = 22;
                break;
            }
            case 33: {
                n3 = 56;
                break;
            }
            case 34: {
                n3 = 27;
                break;
            }
            case 35: {
                n3 = 49;
                break;
            }
            case 36: {
                n3 = 31;
                break;
            }
            case 37: {
                n3 = 62;
                break;
            }
            case 38: {
                n3 = 13;
                break;
            }
            case 39: {
                n3 = 42;
                break;
            }
            case 40: {
                n3 = 37;
                break;
            }
            case 41: {
                n3 = 40;
                break;
            }
            case 42: {
                n3 = 8;
                break;
            }
            case 43: {
                n3 = 63;
                break;
            }
            case 44: {
                n3 = 46;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 4;
                break;
            }
            case 47: {
                n3 = 20;
                break;
            }
            case 48: {
                n3 = 45;
                break;
            }
            case 49: {
                n3 = 44;
                break;
            }
            case 50: {
                n3 = 30;
                break;
            }
            case 51: {
                n3 = 16;
                break;
            }
            case 52: {
                n3 = 38;
                break;
            }
            case 53: {
                n3 = 36;
                break;
            }
            case 54: {
                n3 = 3;
                break;
            }
            case 55: {
                n3 = 60;
                break;
            }
            case 56: {
                n3 = 14;
                break;
            }
            case 57: {
                n3 = 25;
                break;
            }
            case 58: {
                n3 = 23;
                break;
            }
            case 59: {
                n3 = 12;
                break;
            }
            case 60: {
                n3 = 47;
                break;
            }
            case 61: {
                n3 = 33;
                break;
            }
            case 62: {
                n3 = 32;
                break;
            }
            default: {
                n3 = 50;
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
        qd.i[n4] = new String(cArray);
        return n4;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6779;
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
                throw new RuntimeException("a/qd", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qd.c[n2] = n3;
        }
        return c[n2];
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qd.a = MultiContainerRegistry.a(-4550431209551726592L, -4828925037634514801L, MethodHandles.lookup().lookupClass()).a(30422419969293L);
                qd.h = new Object[10];
                qd.i = new String[10];
                qd.a();
                qd.d = new HashMap<K, V>(13);
                var0 = qd.a ^ 117537443164859L;
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
                var6_5 = "C\u00f8nI_ifI\u00e9\u0095\u00f7\u00b2\u00cc-cw\u00db,\u00f0\u00dfWS\u00d1\u001aQ\u008eB\u00d6\u0015\u0088\u00be\u00b5\u0087s\u009d\u00d1\u00fe(\u00d0\u00db\u00b3 \u00c7s-\u00a0f\u0092\u00e5\u0083\u001f\u00bc[y\u00db\u0014\u00cao\u00a4\u00b3N>6!H\u00fd{\u009f\u00ddt\u00fcf";
                var7_6 = "C\u00f8nI_ifI\u00e9\u0095\u00f7\u00b2\u00cc-cw\u00db,\u00f0\u00dfWS\u00d1\u001aQ\u008eB\u00d6\u0015\u0088\u00be\u00b5\u0087s\u009d\u00d1\u00fe(\u00d0\u00db\u00b3 \u00c7s-\u00a0f\u0092\u00e5\u0083\u001f\u00bc[y\u00db\u0014\u00cao\u00a4\u00b3N>6!H\u00fd{\u009f\u00ddt\u00fcf".length();
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
                    var6_5 = "\fPT\u00c0\u00d3\u00a1\u00e1\u0010\u00a0q\u001e\u00d7Mp\u00d2\\";
                    var7_6 = "\fPT\u00c0\u00d3\u00a1\u00e1\u0010\u00a0q\u001e\u00d7Mp\u00d2\\".length();
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
        qd.b = var8_3;
        qd.c = new Integer[11];
    }

    public qd() {
        block8: {
            long l;
            block6: {
                block7: {
                    l = a ^ 0x64BE2EE965AEL;
                    super(ReflectionMetadataResolver.Yg);
                    this.g = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)21857, (long)(0x307884FAB7CD2810L ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, Float.TYPE, (long)1875795059132369510L, (long)l);
                    this.K = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)25919, (long)(0x1A5D6EFA197D9844L ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, Float.TYPE, (long)1875795059132369510L, (long)l);
                    this.Z = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)5193, (long)(0x7AC69A47E881E93AL ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, Float.TYPE, (long)1875795059132369510L, (long)l);
                    this.B = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)4110, (long)(0x20FE92F9A7046D77L ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, Float.TYPE, (long)1875795059132369510L, (long)l);
                    String string = SecureDataTransmissionHandler.j();
                    try {
                        try {
                            try {
                                if (string == null) break block6;
                                if (GeometryCalculator.C() < 50) break block7;
                            }
                            catch (CustomSystemException customSystemException) {
                                throw qd.a(customSystemException);
                            }
                            this.P = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)25317, (long)(0x24707A147A909F92L ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, Integer.TYPE, (long)1875795059132369510L, (long)l);
                            this.f = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)24717, (long)(0x27AE0EF8B97E1DF9L ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, Integer.TYPE, (long)1875795059132369510L, (long)l);
                            this.N = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)5498, (long)(0x157B3E06675FE80FL ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.r_, (long)1875795059132369510L, (long)l);
                            this.e = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)28478, (long)(0x48AEB8E48A7E924CL ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.tS, (long)1875795059132369510L, (long)l);
                            if (string != null) break block8;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw qd.a(customSystemException);
                        }
                        AbstractComputationKernel.I(new String[3]);
                    }
                    catch (CustomSystemException customSystemException) {
                        throw qd.a(customSystemException);
                    }
                }
                this.P = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)18700, (long)(0x1CFD4A19F994B47CL ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, Integer.TYPE, (long)1875795059132369510L, (long)l);
                this.f = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)10666, (long)(0x5766CE0731C6D4D0L ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, Integer.TYPE, (long)1875795059132369510L, (long)l);
            }
            this.N = qd.c("c", (Object)this, (Object)qd.c("\u00d9", (int)qd.b("s", (int)11399, (long)(0x7C403F0CE67951F1L ^ l)), (long)1875886975024447439L, (long)l), (boolean)true, (Object)ReflectionMetadataResolver.VW, (long)1875795059132369510L, (long)l);
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private void J(Object object, float f) {
        this.K.H(object, f);
    }

    private Object k(Object object) {
        return this.N.Z(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == '\u00f1' || c == 'f' || c == 'e') {
                field = qd.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'f' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qd.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'c' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method h(long l, long l2) {
        int n = qd.e(l, l2);
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
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = qd.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = qd.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qd.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        qd.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qd.f(534380572375396L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = qd.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        qd.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qd.f(534380572375396L, 0L);
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

    static float[] K(qd qd2, Object object) {
        return qd2.b(object);
    }

    static Object V(qd qd2, Object object) {
        return qd2.I(object);
    }

    private void s(Object object, int n) {
        this.f.t(object, n);
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

    private void Y(Object object, float f) {
        this.Z.H(object, f);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private void y(Object object, float f) {
        this.g.H(object, f);
    }

    private static Field g(long l, long l2) {
        int n = qd.e(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = qd.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = qd.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qd.c(clazz3, string2, clazz2)) != null) {
                    qd.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = qd.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        qd.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qd.f(534380572375396L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "3=\u007f";
        objectArray[1] = Integer.TYPE;
        qd.i[1] = "java/lang/Integer";
        objectArray[2] = "D'\n,a`O(\u001bc\u001cx\\/\u0012*";
        objectArray[3] = "XG)\u0012";
        objectArray[4] = Boolean.TYPE;
        qd.i[4] = "java/lang/Boolean";
        objectArray[5] = "P\r\u0016Dp<[\u0002\u0007\u000b\u001d<[\u001f\u0013";
        objectArray[6] = "EJ\rY";
        objectArray[7] = "MH>Kw'FG/\u0004\u0016)ML+^";
        objectArray[8] = "\u0011a\u0000\u0017u8R8FF\u0007\b+g\\Ge1Rb\u0007\raS\u0010aG\u0007~!\u001b&_\r\u0007o\u00160\\\u001bz?\u0016%\u0003};>M?J\u0007>6N38";
        Object[] objectArray2 = objectArray;
        objectArray[9] = "~\u000eua]Gl\nkY_E\u0012\u0013j0IA/\u0005c64\u0007vTh;M\u0002-\u001elY";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = qd.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static void z(qd qd2, Object object, float f) {
        qd2.J(object, f);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = qd.e(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                qd.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static void k(qd qd2, Object object, int n) {
        qd2.Q(object, n);
    }

    static void E(qd qd2, Object object, float f) {
        qd2.Y(object, f);
    }

    private float[] b(Object object) {
        float[] fArray = new float[]{this.g.x(object), this.K.x(object), this.Z.x(object), this.B.x(object)};
        return fArray;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qd.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = qd.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static Object Y(qd qd2, Object object) {
        return qd2.k(object);
    }

    private void Q(Object object, int n) {
        this.P.t(object, n);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = qd.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = qd.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private Object I(Object object) {
        return this.e.Z(object);
    }

    static void N(qd qd2, Object object, float f) {
        qd2.I(object, f);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qd.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(qd.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

