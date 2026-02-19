/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
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

public class vL
extends CryptoProtocolEngine {
    private HK y;
    public ReflectionUtilityService u;
    private static final Map d;
    public final HK w;
    private static final Integer[] c;
    private static boolean f;
    private ReflectionUtilityService V;
    private ReflectionUtilityService h;
    private ReflectionUtilityService Y;
    public final HK H;
    private static final long a;
    private static final long[] b;
    public final HK C;
    private static final String[] i;
    private final HK g;
    private static final Object[] e;

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean J(Object object) {
        return this.w.V(object, new Object[0]);
    }

    public Object g() {
        return this.u.Z(null);
    }

    public Object Q() {
        return this.V.Z(null);
    }

    private static Field g(long l, long l2) {
        int n = vL.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = vL.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = vL.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = vL.c(clazz3, string2, clazz2)) != null) {
                    vL.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = vL.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        vL.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = vL.f(646447304540941L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Unable to fully structure code
     */
    public vL() {
        block21: {
            block22: {
                block24: {
                    block25: {
                        block23: {
                            var1_1 = vL.a ^ 91141997475302L;
                            v0 = vL.G();
                            super(ReflectionMetadataResolver.EE);
                            var3_2 = v0;
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                v1 = GeometryCalculator.C();
                                                v2 = 50;
                                                if (!var3_2) break block21;
                                                if (v1 >= v2) break block22;
                                            }
                                            catch (CustomSystemException v3) {
                                                throw vL.a(v3);
                                            }
                                            v4 = GeometryCalculator.C();
                                            v5 = 23;
                                            if (!var3_2) break block23;
                                        }
                                        catch (CustomSystemException v6) {
                                            throw vL.a(v6);
                                        }
                                        if (v4 >= v5) {
                                        }
                                        ** GOTO lbl58
                                    }
                                    catch (CustomSystemException v7) {
                                        throw vL.a(v7);
                                    }
                                    this.u = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)4107, (long)(7178252402247543155L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (long)-8380170840572857881L, (long)var1_1);
                                    this.h = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)7001, (long)(8695342751565554216L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (long)-8380170840572857881L, (long)var1_1);
                                    this.V = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)10859, (long)(8036827118594462493L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (long)-8380170840572857881L, (long)var1_1);
                                    if (!var3_2) break block24;
                                }
                                catch (CustomSystemException v8) {
                                    throw vL.a(v8);
                                }
                                v4 = GeometryCalculator.C();
                                v5 = 35;
                            }
                            catch (CustomSystemException v9) {
                                throw vL.a(v9);
                            }
                        }
                        try {
                            try {
                                if (v4 < v5) break block25;
                                this.Y = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)12424, (long)(6992907046469241339L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (long)-8380170840572857881L, (long)var1_1);
                                if (var3_2) break block22;
                            }
                            catch (CustomSystemException v10) {
                                throw vL.a(v10);
                            }
                            AbstractComputationKernel.I(new String[2]);
                        }
                        catch (CustomSystemException v11) {
                            throw vL.a(v11);
                        }
                    }
                    this.Y = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)9290, (long)(4451192332215393588L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (long)-8380170840572857881L, (long)var1_1);
                }
                try {
                    if (var3_2) break block22;
lbl58:
                    // 2 sources

                    this.u = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)11369, (long)(2402395863561835804L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (long)-8380170840572857881L, (long)var1_1);
                    this.h = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)4441, (long)(2885116206724032544L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (long)-8380170840572857881L, (long)var1_1);
                    this.Y = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)8940, (long)(635448740851653523L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (long)-8380170840572857881L, (long)var1_1);
                    this.V = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)22844, (long)(2659707047361667144L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.EE, (long)-8380170840572857881L, (long)var1_1);
                }
                catch (CustomSystemException v12) {
                    throw vL.a(v12);
                }
            }
            v1 = GeometryCalculator.C();
            v2 = GeometryCalculator.C;
        }
        try {
            if (v1 < v2) {
                this.y = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)1670, (long)(6941343528872329201L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)-8380100571897687842L, (long)var1_1);
            }
        }
        catch (CustomSystemException v13) {
            throw vL.a(v13);
        }
        this.H = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)26403, (long)(9217733851719458399L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)-8380100571897687842L, (long)var1_1);
        this.C = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)27217, (long)(8874885828064203564L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)-8380100571897687842L, (long)var1_1);
        this.w = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)787, (long)(5613643023612066403L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)-8380100571897687842L, (long)var1_1);
        this.g = vL.c("\u00e6", (Object)this, (Object)vL.c("\u00ff", (int)vL.b("j", (int)21360, (long)(7076844639662402050L ^ var1_1)), (long)-8380500016554913211L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[0], (long)-8380100571897687842L, (long)var1_1);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = vL.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = vL.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = vL.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public static boolean G() {
        boolean bl = vL.J();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw vL.a(customSystemException);
        }
        return false;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = vL.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                vL.e[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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

    public static void H(boolean bl) {
        f = bl;
    }

    private static int e(long l, long l2) {
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
                n3 = 57;
                break;
            }
            case 1: {
                n3 = 34;
                break;
            }
            case 2: {
                n3 = 37;
                break;
            }
            case 3: {
                n3 = 25;
                break;
            }
            case 4: {
                n3 = 44;
                break;
            }
            case 5: {
                n3 = 6;
                break;
            }
            case 6: {
                n3 = 5;
                break;
            }
            case 7: {
                n3 = 49;
                break;
            }
            case 8: {
                n3 = 3;
                break;
            }
            case 9: {
                n3 = 51;
                break;
            }
            case 10: {
                n3 = 4;
                break;
            }
            case 11: {
                n3 = 62;
                break;
            }
            case 12: {
                n3 = 45;
                break;
            }
            case 13: {
                n3 = 36;
                break;
            }
            case 14: {
                n3 = 40;
                break;
            }
            case 15: {
                n3 = 29;
                break;
            }
            case 16: {
                n3 = 27;
                break;
            }
            case 17: {
                n3 = 55;
                break;
            }
            case 18: {
                n3 = 42;
                break;
            }
            case 19: {
                n3 = 26;
                break;
            }
            case 20: {
                n3 = 10;
                break;
            }
            case 21: {
                n3 = 18;
                break;
            }
            case 22: {
                n3 = 31;
                break;
            }
            case 23: {
                n3 = 35;
                break;
            }
            case 24: {
                n3 = 56;
                break;
            }
            case 25: {
                n3 = 53;
                break;
            }
            case 26: {
                n3 = 24;
                break;
            }
            case 27: {
                n3 = 13;
                break;
            }
            case 28: {
                n3 = 33;
                break;
            }
            case 29: {
                n3 = 47;
                break;
            }
            case 30: {
                n3 = 61;
                break;
            }
            case 31: {
                n3 = 39;
                break;
            }
            case 32: {
                n3 = 50;
                break;
            }
            case 33: {
                n3 = 52;
                break;
            }
            case 34: {
                n3 = 59;
                break;
            }
            case 35: {
                n3 = 28;
                break;
            }
            case 36: {
                n3 = 43;
                break;
            }
            case 37: {
                n3 = 11;
                break;
            }
            case 38: {
                n3 = 19;
                break;
            }
            case 39: {
                n3 = 21;
                break;
            }
            case 40: {
                n3 = 2;
                break;
            }
            case 41: {
                n3 = 8;
                break;
            }
            case 42: {
                n3 = 63;
                break;
            }
            case 43: {
                n3 = 15;
                break;
            }
            case 44: {
                n3 = 46;
                break;
            }
            case 45: {
                n3 = 9;
                break;
            }
            case 46: {
                n3 = 41;
                break;
            }
            case 47: {
                n3 = 14;
                break;
            }
            case 48: {
                n3 = 7;
                break;
            }
            case 49: {
                n3 = 48;
                break;
            }
            case 50: {
                n3 = 60;
                break;
            }
            case 51: {
                n3 = 0;
                break;
            }
            case 52: {
                n3 = 32;
                break;
            }
            case 53: {
                n3 = 58;
                break;
            }
            case 54: {
                n3 = 30;
                break;
            }
            case 55: {
                n3 = 54;
                break;
            }
            case 56: {
                n3 = 22;
                break;
            }
            case 57: {
                n3 = 38;
                break;
            }
            case 58: {
                n3 = 1;
                break;
            }
            case 59: {
                n3 = 23;
                break;
            }
            case 60: {
                n3 = 20;
                break;
            }
            case 61: {
                n3 = 12;
                break;
            }
            case 62: {
                n3 = 17;
                break;
            }
            default: {
                n3 = 16;
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
        vL.i[n4] = new String(cArray);
        return n4;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x32C4;
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
                throw new RuntimeException("a/vL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            vL.c[n2] = n3;
        }
        return c[n2];
    }

    public Object L() {
        return this.Y.Z(null);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public boolean M(Object object) {
        return this.H.V(object, new Object[0]);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                vL.a = MultiContainerRegistry.a(-40077296339146570L, 1813520972319688919L, MethodHandles.lookup().lookupClass()).a(37219167768783L);
                vL.e = new Object[13];
                vL.i = new String[13];
                vL.a();
                vL.d = new HashMap<K, V>(13);
                vL.H(false);
                var0 = vL.a ^ 45711487660273L;
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
                var8_3 = new long[14];
                var5_4 = 0;
                var6_5 = "\u00f4+\u00ac\u00bd!\u00a0K4\u00ba\u0017\u000b,\u001c\u00c0<\u00a2\u0083\u00f7\u00c32\u00dc\u00dccU\u008co\u00dc\u00eb\u00f5OW\u00b0\u00db\u0011*} \u00d9\u0084\u00b3\u00f0Q\u00801\u0014\u00cd\u000em\u001e\u0094\t\u007f\u00c2\u00a0\u00071(\u0082\u0012\t\u0018\u00c1f\u001f\u0005K(\u00ec\u001a*\u0086(\u00eb)\u00d9\u00d2\u00bb\u008d\f&\u001b\u00e3\u001e\u00f9\u00be\u00d6!>O\u00c6\u00ad!\u0016\u00ad^\u00f6";
                var7_6 = "\u00f4+\u00ac\u00bd!\u00a0K4\u00ba\u0017\u000b,\u001c\u00c0<\u00a2\u0083\u00f7\u00c32\u00dc\u00dccU\u008co\u00dc\u00eb\u00f5OW\u00b0\u00db\u0011*} \u00d9\u0084\u00b3\u00f0Q\u00801\u0014\u00cd\u000em\u001e\u0094\t\u007f\u00c2\u00a0\u00071(\u0082\u0012\t\u0018\u00c1f\u001f\u0005K(\u00ec\u001a*\u0086(\u00eb)\u00d9\u00d2\u00bb\u008d\f&\u001b\u00e3\u001e\u00f9\u00be\u00d6!>O\u00c6\u00ad!\u0016\u00ad^\u00f6".length();
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
                    var6_5 = "{\u00cd\u0007\u00a6RS\u0091\u00b0d$u\u0090\u00c1<\u00e2}";
                    var7_6 = "{\u00cd\u0007\u00a6RS\u0091\u00b0d$u\u0090\u00c1<\u00e2}".length();
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
        vL.b = var8_3;
        vL.c = new Integer[14];
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fb' || c == '\u00f3' || c == '\u00cd' || c == 'Z') {
                field = vL.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fb' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = vL.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = vL.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = vL.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static boolean J() {
        return f;
    }

    public boolean x(Object object) {
        return this.g.V(object, new Object[0]);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "B[/\u001c";
        objectArray[1] = "^Z@\u001d~\u001fUUQR\u0003\u0007FRX\u001b";
        objectArray[2] = Boolean.TYPE;
        vL.i[2] = "java/lang/Boolean";
        objectArray[3] = "\u001f\r\u000e.\u001e\u0015\u0014\u0002\u001fas\u0015\u0014\u001f\u000b";
        objectArray[4] = "#\u001dOwx8V=Dxiw;=De}b";
        objectArray[5] = "\u0015\u001c<:";
        objectArray[6] = "k\u0011q";
        objectArray[7] = Integer.TYPE;
        vL.i[7] = "java/lang/Integer";
        objectArray[8] = "d\u0005\u00171";
        objectArray[9] = ">\u00003Gr\u000f5\u000f\"\b\u0013\u0001>\u0004&R";
        objectArray[10] = "\u0013m~\u0001LhZk{\u007fnRR.a\u001aH=\u0015-w\u007f\u0010/\u0010(b\u0000R1O+\u001eEIlZnz\rB3LQ$\u0000NhN=g\u0004Kl*jz\u001cL=\u00175%\u0013RR";
        objectArray[11] = "e\u001b2\u007fS\u0012,\u001d7\u0001{($X-dWGc[;\u0001\u000fUf^.~MK9]R;V\u0016,\u00186s]I:'o{VD?V.gRX\\";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "Q.7\u0003BP\u000e/5PrX\u0016@g\u001d\u0002H\u00100<\u0001L\tm8$\u001f\u0017R\u0002\u007f'\tr";
    }

    public boolean e(Object object) {
        return this.y.V(object, new Object[0]);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/vL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean X(Object object) {
        return this.C.V(object, new Object[0]);
    }

    public Object p() {
        return this.h.Z(null);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = vL.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method h(long l, long l2) {
        int n = vL.e(l, l2);
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
                clazz3 = vL.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = vL.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = vL.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        vL.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = vL.f(646447304540941L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = vL.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        vL.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = vL.f(646447304540941L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(vL.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(vL.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

