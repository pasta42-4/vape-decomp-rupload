/*
 * Decompiled with CFR 0.152.
 */
package a;

import com.auth.tracking.AuthenticationStateTracker;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.exception.system.CustomSystemException;
import com.rendering.style.RenderStyleController;
import com.ui.events.UserInteractionEventDispatcher;
import com.util.reflection.ReflectionUtility;
import java.awt.Color;
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

public class bN
extends AbstractComputationKernel {
    private RenderStyleController E;
    private static final Map D;
    private static final Integer[] B;
    private static final long n;
    private RenderStyleController R;
    private static final long[] v;
    private static final Object[] F;
    private ReflectionUtility b;
    private static final String[] V;
    private RenderStyleController L;

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'a' || c == '\u00eb' || c == 'w' || c == '\u00d1') {
                field = bN.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'a' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'w' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bN.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'X' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = bN.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    @Override
    public double z() {
        return 20.0;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static void lambda$new$1(ReflectionUtility reflectionUtility) {
        ((AuthenticationStateTracker)reflectionUtility.J()).Z();
    }

    @Override
    public void U() {
    }

    @Override
    public void g() {
    }

    private static Field g(long l, long l2) {
        int n = bN.e(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            String string = V[n];
            int n2 = string.indexOf(8);
            Class clazz = bN.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bN.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bN.c(clazz3, string2, clazz2)) != null) {
                    bN.F[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bN.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bN.F[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bN.f(269966826937869L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void lambda$new$2(ReflectionUtility reflectionUtility) {
        reflectionUtility.G().Z();
    }

    private static void a() {
        Object[] objectArray = F;
        F[0] = ".\u0016r";
        objectArray[1] = Integer.TYPE;
        bN.V[1] = "java/lang/Integer";
        objectArray[2] = "&JWC\"\u001d-EF\f_\u0005>BOE";
        objectArray[3] = "i;N{ 3b4_4A=i?[n";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Dmj\u0001#'Oin:&7*ofV!<T94[2L\u0013,i\u0006&*Ah6\\M";
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = bN.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public double e() {
        return 110.0;
    }

    private static void lambda$new$0(ReflectionUtility reflectionUtility) {
        reflectionUtility.c().Z();
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7A55;
        if (B[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = v[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])D.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    D.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bN", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bN.B[n2] = n3;
        }
        return B[n2];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = bN.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bN.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public void d() {
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bN.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bN.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = bN.e(l, l2);
            object = F[n];
            try {
                if (!(object instanceof String)) break block2;
                bN.F[n] = clazz = Class.forName(V[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void G() {
        double d2 = (this.w() - 10.0 - 6.0) / 3.0;
        double d3 = this.G() + 5.0;
        this.o(this.E, this.b.c(), d2, d3);
        this.o(this.R, (AuthenticationStateTracker)this.b.J(), d2, d3 += d2 + 2.0);
        this.o(this.L, this.b.G(), d2, d3 += d2 + 2.0);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                bN.n = MultiContainerRegistry.a(-7498069170011912678L, -3057399956810511319L, MethodHandles.lookup().lookupClass()).a(77961986915008L);
                bN.F = new Object[5];
                bN.V = new String[5];
                bN.a();
                bN.D = new HashMap<K, V>(13);
                var0 = bN.n ^ 139347284377269L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "v\u0095@\u00cfq\u000b\u00f2\u0017d\u00d6\u00f5{\u00c4\b\u00b2\u00eb\u00bau?\u00a2\u00d6jUn\u00de\u0084\u00d4\u000e\u00b2\u008e\u0089\u008a";
                var7_6 = "v\u0095@\u00cfq\u000b\u00f2\u0017d\u00d6\u00f5{\u00c4\b\u00b2\u00eb\u00bau?\u00a2\u00d6jUn\u00de\u0084\u00d4\u000e\u00b2\u008e\u0089\u008a".length();
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
                    var6_5 = "\u00d8X8\u00fa\u00e1\u0097\u0012\u00817\u00f9\u009f\u0089\u009b\u00c4\u00b9\u001e";
                    var7_6 = "\u00d8X8\u00fa\u00e1\u0097\u0012\u00817\u00f9\u009f\u0089\u009b\u00c4\u00b9\u001e".length();
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
        bN.v = var8_3;
        bN.B = new Integer[6];
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (V[n4] != null) {
            return n4;
        }
        Object object = F[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 1;
                break;
            }
            case 1: {
                n3 = 25;
                break;
            }
            case 2: {
                n3 = 17;
                break;
            }
            case 3: {
                n3 = 27;
                break;
            }
            case 4: {
                n3 = 58;
                break;
            }
            case 5: {
                n3 = 49;
                break;
            }
            case 6: {
                n3 = 59;
                break;
            }
            case 7: {
                n3 = 7;
                break;
            }
            case 8: {
                n3 = 4;
                break;
            }
            case 9: {
                n3 = 8;
                break;
            }
            case 10: {
                n3 = 42;
                break;
            }
            case 11: {
                n3 = 60;
                break;
            }
            case 12: {
                n3 = 14;
                break;
            }
            case 13: {
                n3 = 2;
                break;
            }
            case 14: {
                n3 = 12;
                break;
            }
            case 15: {
                n3 = 30;
                break;
            }
            case 16: {
                n3 = 43;
                break;
            }
            case 17: {
                n3 = 36;
                break;
            }
            case 18: {
                n3 = 56;
                break;
            }
            case 19: {
                n3 = 41;
                break;
            }
            case 20: {
                n3 = 15;
                break;
            }
            case 21: {
                n3 = 32;
                break;
            }
            case 22: {
                n3 = 47;
                break;
            }
            case 23: {
                n3 = 26;
                break;
            }
            case 24: {
                n3 = 40;
                break;
            }
            case 25: {
                n3 = 5;
                break;
            }
            case 26: {
                n3 = 55;
                break;
            }
            case 27: {
                n3 = 24;
                break;
            }
            case 28: {
                n3 = 16;
                break;
            }
            case 29: {
                n3 = 3;
                break;
            }
            case 30: {
                n3 = 10;
                break;
            }
            case 31: {
                n3 = 35;
                break;
            }
            case 32: {
                n3 = 53;
                break;
            }
            case 33: {
                n3 = 63;
                break;
            }
            case 34: {
                n3 = 57;
                break;
            }
            case 35: {
                n3 = 21;
                break;
            }
            case 36: {
                n3 = 11;
                break;
            }
            case 37: {
                n3 = 52;
                break;
            }
            case 38: {
                n3 = 61;
                break;
            }
            case 39: {
                n3 = 23;
                break;
            }
            case 40: {
                n3 = 22;
                break;
            }
            case 41: {
                n3 = 13;
                break;
            }
            case 42: {
                n3 = 19;
                break;
            }
            case 43: {
                n3 = 48;
                break;
            }
            case 44: {
                n3 = 37;
                break;
            }
            case 45: {
                n3 = 18;
                break;
            }
            case 46: {
                n3 = 6;
                break;
            }
            case 47: {
                n3 = 51;
                break;
            }
            case 48: {
                n3 = 9;
                break;
            }
            case 49: {
                n3 = 31;
                break;
            }
            case 50: {
                n3 = 45;
                break;
            }
            case 51: {
                n3 = 62;
                break;
            }
            case 52: {
                n3 = 44;
                break;
            }
            case 53: {
                n3 = 20;
                break;
            }
            case 54: {
                n3 = 28;
                break;
            }
            case 55: {
                n3 = 33;
                break;
            }
            case 56: {
                n3 = 34;
                break;
            }
            case 57: {
                n3 = 39;
                break;
            }
            case 58: {
                n3 = 0;
                break;
            }
            case 59: {
                n3 = 38;
                break;
            }
            case 60: {
                n3 = 54;
                break;
            }
            case 61: {
                n3 = 46;
                break;
            }
            case 62: {
                n3 = 29;
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
        bN.V[n4] = new String(cArray);
        return n4;
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

    @Override
    public void Z(UserInteractionEventDispatcher userInteractionEventDispatcher) {
    }

    public bN(ReflectionUtility reflectionUtility) {
        long l = n ^ 0x1BB91FF8028DL;
        this.E = new RenderStyleController((String)((Object)bN.c("X", (int)bN.b("k", (int)7584, (long)(0x7D08A1B85274C8A9L ^ l)), (long)-5810439849636970495L, (long)l)));
        this.R = new RenderStyleController((String)((Object)bN.c("X", (int)bN.b("k", (int)609, (long)(0x45A76BE77796576AL ^ l)), (long)-5810439849636970495L, (long)l)));
        this.L = new RenderStyleController((String)((Object)bN.c("X", (int)bN.b("k", (int)10684, (long)(0x5AB2E9D2AACF7CB0L ^ l)), (long)-5810439849636970495L, (long)l)));
        this.b = reflectionUtility;
        this.E.N(() -> bN.lambda$new$0(reflectionUtility));
        this.E.U(true);
        this.E.g((String)((Object)bN.c("X", (int)bN.b("k", (int)12793, (long)(0x7C87BF2397CFE4F1L ^ l)), (long)-5810439849636970495L, (long)l)));
        this.R.N(() -> bN.lambda$new$1(reflectionUtility));
        this.R.U(true);
        this.R.g((String)((Object)bN.c("X", (int)bN.b("k", (int)17833, (long)(0x46E73816821990A4L ^ l)), (long)-5810439849636970495L, (long)l)));
        this.L.N(() -> bN.lambda$new$2(reflectionUtility));
        this.L.U(true);
        this.L.g((String)((Object)bN.c("X", (int)bN.b("k", (int)28832, (long)(0xC7153BCA8B125AAL ^ l)), (long)-5810439849636970495L, (long)l)));
        this.o(this.E, this.R, this.L);
    }

    private void o(RenderStyleController renderStyleController, AuthenticationStateTracker authenticationStateTracker, double d2, double d3) {
        block12: {
            Color color;
            RenderStyleController renderStyleController2;
            block11: {
                block10: {
                    try {
                        try {
                            renderStyleController.b(d3);
                            renderStyleController.M(this.W() + 2.5);
                            renderStyleController.T(d2);
                            renderStyleController.w(this.b() - 5.0);
                            renderStyleController.v(authenticationStateTracker.s());
                            renderStyleController2 = renderStyleController;
                            if (!authenticationStateTracker.s().booleanValue() && !renderStyleController.s()) break block10;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw bN.a(customSystemException);
                        }
                        color = M.X();
                        break block11;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw bN.a(customSystemException);
                    }
                }
                color = null;
            }
            try {
                try {
                    try {
                        renderStyleController2.h(color);
                        if (renderStyleController.b().C() || renderStyleController.b().F()) break block12;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw bN.a(customSystemException);
                    }
                    if (!authenticationStateTracker.s().booleanValue()) break block12;
                }
                catch (CustomSystemException customSystemException) {
                    throw bN.a(customSystemException);
                }
                renderStyleController.b().c();
            }
            catch (CustomSystemException customSystemException) {
                throw bN.a(customSystemException);
            }
        }
    }

    private static Method h(long l, long l2) {
        int n = bN.e(l, l2);
        Object object = F[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = V[n];
                int n3 = string2.indexOf(8);
                clazz3 = bN.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bN.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bN.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        bN.F[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bN.f(269966826937869L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bN.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bN.F[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bN.f(269966826937869L, 0L);
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
            return MethodHandles.lookup().findStatic(bN.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bN.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

