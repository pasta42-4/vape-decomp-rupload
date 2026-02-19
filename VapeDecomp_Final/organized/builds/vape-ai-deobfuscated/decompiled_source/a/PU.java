/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.actions.ActionSequenceHandler;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.system.lifecycle.ObjectLifecycleTracker;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class PU
extends CryptoProtocolEngine {
    private HK N;
    private static final long a;
    private HK f;
    private static final Map e;
    private static final Object[] g;
    private HK G;
    private static final long[] b;
    private static final Integer[] c;
    private static final String[] h;
    private HK d;
    private HK P;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/PU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object H(PU pU, FloatBuffer floatBuffer) {
        return pU.k(floatBuffer);
    }

    private Object k() {
        return this.d.A(new Object[0]);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (h[n4] != null) {
            return n4;
        }
        Object object = g[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 4;
                break;
            }
            case 1: {
                n3 = 34;
                break;
            }
            case 2: {
                n3 = 11;
                break;
            }
            case 3: {
                n3 = 24;
                break;
            }
            case 4: {
                n3 = 23;
                break;
            }
            case 5: {
                n3 = 37;
                break;
            }
            case 6: {
                n3 = 54;
                break;
            }
            case 7: {
                n3 = 60;
                break;
            }
            case 8: {
                n3 = 32;
                break;
            }
            case 9: {
                n3 = 59;
                break;
            }
            case 10: {
                n3 = 6;
                break;
            }
            case 11: {
                n3 = 62;
                break;
            }
            case 12: {
                n3 = 49;
                break;
            }
            case 13: {
                n3 = 28;
                break;
            }
            case 14: {
                n3 = 21;
                break;
            }
            case 15: {
                n3 = 10;
                break;
            }
            case 16: {
                n3 = 20;
                break;
            }
            case 17: {
                n3 = 27;
                break;
            }
            case 18: {
                n3 = 45;
                break;
            }
            case 19: {
                n3 = 13;
                break;
            }
            case 20: {
                n3 = 5;
                break;
            }
            case 21: {
                n3 = 12;
                break;
            }
            case 22: {
                n3 = 16;
                break;
            }
            case 23: {
                n3 = 41;
                break;
            }
            case 24: {
                n3 = 58;
                break;
            }
            case 25: {
                n3 = 46;
                break;
            }
            case 26: {
                n3 = 52;
                break;
            }
            case 27: {
                n3 = 33;
                break;
            }
            case 28: {
                n3 = 25;
                break;
            }
            case 29: {
                n3 = 57;
                break;
            }
            case 30: {
                n3 = 7;
                break;
            }
            case 31: {
                n3 = 0;
                break;
            }
            case 32: {
                n3 = 35;
                break;
            }
            case 33: {
                n3 = 43;
                break;
            }
            case 34: {
                n3 = 50;
                break;
            }
            case 35: {
                n3 = 61;
                break;
            }
            case 36: {
                n3 = 39;
                break;
            }
            case 37: {
                n3 = 3;
                break;
            }
            case 38: {
                n3 = 55;
                break;
            }
            case 39: {
                n3 = 38;
                break;
            }
            case 40: {
                n3 = 15;
                break;
            }
            case 41: {
                n3 = 63;
                break;
            }
            case 42: {
                n3 = 48;
                break;
            }
            case 43: {
                n3 = 19;
                break;
            }
            case 44: {
                n3 = 22;
                break;
            }
            case 45: {
                n3 = 26;
                break;
            }
            case 46: {
                n3 = 8;
                break;
            }
            case 47: {
                n3 = 51;
                break;
            }
            case 48: {
                n3 = 36;
                break;
            }
            case 49: {
                n3 = 42;
                break;
            }
            case 50: {
                n3 = 9;
                break;
            }
            case 51: {
                n3 = 17;
                break;
            }
            case 52: {
                n3 = 2;
                break;
            }
            case 53: {
                n3 = 31;
                break;
            }
            case 54: {
                n3 = 1;
                break;
            }
            case 55: {
                n3 = 18;
                break;
            }
            case 56: {
                n3 = 30;
                break;
            }
            case 57: {
                n3 = 47;
                break;
            }
            case 58: {
                n3 = 56;
                break;
            }
            case 59: {
                n3 = 53;
                break;
            }
            case 60: {
                n3 = 44;
                break;
            }
            case 61: {
                n3 = 29;
                break;
            }
            case 62: {
                n3 = 14;
                break;
            }
            default: {
                n3 = 40;
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
        PU.h[n4] = new String(cArray);
        return n4;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00aa' || c == '\u00b5' || c == '\u00dd' || c == '\u00ba') {
                field = PU.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00aa' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = PU.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'E' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        int n2 = PU.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = PU.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = PU.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = PU.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = PU.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public PU() {
        block13: {
            CallSite callSite;
            block10: {
                long l = a ^ 0x519346081879L;
                String[] stringArray = N9.I();
                super(ReflectionMetadataResolver.rr);
                String[] stringArray2 = stringArray;
                try {
                    PU pU;
                    block11: {
                        try {
                            block12: {
                                try {
                                    try {
                                        try {
                                            pU = this;
                                            callSite = PU.c("\u00ec", (Object)this, (Object)PU.c("E", (int)PU.b("x", (int)316, (long)(0x572EC936141FF01FL ^ l)), (long)3854169505990727945L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[0], (long)3854024341840855823L, (long)l);
                                            if (stringArray2 == null) break block10;
                                            pU.d = callSite;
                                            if (GeometryCalculator.C() < 35) break block11;
                                        }
                                        catch (CustomSystemException customSystemException) {
                                            throw PU.a(customSystemException);
                                        }
                                        if (GeometryCalculator.C() < 50) break block12;
                                    }
                                    catch (CustomSystemException customSystemException) {
                                        throw PU.a(customSystemException);
                                    }
                                    this.G = PU.c("\u00ec", (Object)this, (Object)PU.c("E", (int)PU.b("x", (int)5945, (long)(0x4309F77DFAA5E61BL ^ l)), (long)3854169505990727945L, (long)l), (boolean)false, FloatBuffer.class, (Object)new Class[]{FloatBuffer.class}, (long)3854024341840855823L, (long)l);
                                    this.f = PU.c("\u00ec", (Object)this, (Object)PU.c("E", (int)PU.b("x", (int)19922, (long)(0x42FD78F15843BCF5L ^ l)), (long)3854169505990727945L, (long)l), (boolean)false, Void.TYPE, (Object)new Class[]{FloatBuffer.class}, (long)3854024341840855823L, (long)l);
                                    this.N = PU.c("\u00ec", (Object)this, (Object)PU.c("E", (int)PU.b("x", (int)3695, (long)(0x4C6A44CB7720FF4BL ^ l)), (long)3854169505990727945L, (long)l), (boolean)false, (Object)ReflectionMetadataResolver.rr, (Object)new Class[]{ReflectionMetadataResolver.by}, (long)3854024341840855823L, (long)l);
                                    this.P = PU.c("\u00ec", (Object)this, (Object)PU.c("E", (int)PU.b("x", (int)19021, (long)(0x574A0C1304953B6BL ^ l)), (long)3854169505990727945L, (long)l), (boolean)false, (Object)ReflectionMetadataResolver.rr, (Object)new Class[]{Float.TYPE, Float.TYPE, Float.TYPE}, (long)3854024341840855823L, (long)l);
                                    if (stringArray2 != null) break block13;
                                }
                                catch (CustomSystemException customSystemException) {
                                    throw PU.a(customSystemException);
                                }
                            }
                            this.N = PU.c("\u00ec", (Object)this, (Object)PU.c("E", (int)PU.b("x", (int)4789, (long)(0x78C66E73A59BE395L ^ l)), (long)3854169505990727945L, (long)l), (boolean)ObjectLifecycleTracker.z, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.rr}, (long)3854024341840855823L, (long)l);
                            if (stringArray2 != null) break block13;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw PU.a(customSystemException);
                        }
                    }
                    pU = this;
                    callSite = PU.c("\u00ec", (Object)this, (Object)PU.c("E", (int)PU.b("x", (int)24895, (long)(0x609A79C81748101AL ^ l)), (long)3854169505990727945L, (long)l), (boolean)true, Void.TYPE, (Object)new Class[]{FloatBuffer.class}, (long)3854024341840855823L, (long)l);
                }
                catch (CustomSystemException customSystemException) {
                    throw PU.a(customSystemException);
                }
            }
            pU.G = callSite;
        }
    }

    private void e(Object object, ActionSequenceHandler actionSequenceHandler) {
        try {
            if (GeometryCalculator.C() >= 50) {
                this.N.T(object, actionSequenceHandler.M());
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PU.a(customSystemException);
        }
        this.N.l(object, actionSequenceHandler.M());
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = PU.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                PU.g[n] = clazz = Class.forName(h[n]);
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

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u0000 \u0006\u0006";
        objectArray[1] = " z!c\u0013g+u0,n\u007f8r9e";
        objectArray[2] = Boolean.TYPE;
        PU.h[2] = "java/lang/Boolean";
        objectArray[3] = "7EVE>{<JG\nS{<WS";
        objectArray[4] = "\u0016N'\nybcn,\u0005h-\u000en,\u0018|8";
        objectArray[5] = "KN\u001an";
        objectArray[6] = ")k\t";
        objectArray[7] = Integer.TYPE;
        PU.h[7] = "java/lang/Integer";
        objectArray[8] = "lo\u0001Abwg`\u0010\u000e\u0003ylk\u0014T";
        objectArray[9] = "#\u0019'K\u0016\u0013nFbq*bh\u0006~\u001c\n\u0004x\u000f|qT\u0006y\u0003{\r\u0001\u000e(\u0019\u001dKR]+\u0014`\u001a\u000f\u0005}\u007f&I\u001c\u0007~G\u007f\u0010\u0010\r\u0012D~\u000e\u0004\u0007nA~\u0012\u0010b";
        Object[] objectArray2 = objectArray;
        objectArray[10] = "B\u0013^\u000eA~\u001eS\u0007\u0006%/\u0005n\u0001FC?\u0006\b^UL&~\u0014DUH#\u0018\u0004MW%";
    }

    private Object S(Object object, float f, float f2, float f3) {
        return this.P.T(object, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                PU.a = MultiContainerRegistry.a(8212379747904516801L, -4782304580677593070L, MethodHandles.lookup().lookupClass()).a(109735600985480L);
                PU.g = new Object[11];
                PU.h = new String[11];
                PU.a();
                PU.e = new HashMap<K, V>(13);
                var0 = PU.a ^ 73878483838875L;
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
                var6_5 = "\u00f7\u00d5\u00ac\r\u00b8P\u00acn\u00db\u0099J\u001dT\u00c1r\u00c0\u00ef\u00fd\u00ac~e\u00c6^\u00c8O\u00b2\u00e0\u00e6\u00e8\r\u0003*\u0005\u00f5{\u00ee\u000e\\\u00b6x";
                var7_6 = "\u00f7\u00d5\u00ac\r\u00b8P\u00acn\u00db\u0099J\u001dT\u00c1r\u00c0\u00ef\u00fd\u00ac~e\u00c6^\u00c8O\u00b2\u00e0\u00e6\u00e8\r\u0003*\u0005\u00f5{\u00ee\u000e\\\u00b6x".length();
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
                    var6_5 = "\u0092\u0092\u0085\u0086\u00f2\u00c8\u00fe9\u00fe\u00dbh[\\jd7";
                    var7_6 = "\u0092\u0092\u0085\u0086\u00f2\u00c8\u00fe9\u00fe\u00dbh[\\jd7".length();
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
        PU.b = var8_3;
        PU.c = new Integer[7];
    }

    private void N(Object object, FloatBuffer floatBuffer) {
        try {
            if (GeometryCalculator.C() >= 50) {
                this.G.T(object, floatBuffer);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw PU.a(customSystemException);
        }
        this.G.l(object, floatBuffer);
    }

    private void a(Object object, FloatBuffer floatBuffer) {
        this.f.l(object, floatBuffer);
    }

    private static Field g(long l, long l2) {
        int n = PU.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = PU.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = PU.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = PU.c(clazz3, string2, clazz2)) != null) {
                    PU.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = PU.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        PU.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = PU.f(599452392896059L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static void E(PU pU, Object object, FloatBuffer floatBuffer) {
        pU.a(object, floatBuffer);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4458;
        if (c[n2] == null) {
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
                throw new RuntimeException("a/PU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            PU.c[n2] = n3;
        }
        return c[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/PU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
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
        MethodHandle methodHandle = PU.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static Object l(PU pU) {
        return pU.k();
    }

    private Object k(FloatBuffer floatBuffer) {
        return this.f.A(floatBuffer);
    }

    static Object H(PU pU, Object object, float f, float f2, float f3) {
        return pU.S(object, f, f2, f3);
    }

    static void P(PU pU, Object object, ActionSequenceHandler actionSequenceHandler) {
        pU.e(object, actionSequenceHandler);
    }

    private static Method h(long l, long l2) {
        int n = PU.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n];
                int n3 = string2.indexOf(8);
                clazz3 = PU.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = PU.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = PU.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        PU.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = PU.f(599452392896059L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = PU.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        PU.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = PU.f(599452392896059L, 0L);
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

    static void B(PU pU, Object object, FloatBuffer floatBuffer) {
        pU.N(object, floatBuffer);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(PU.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(PU.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

