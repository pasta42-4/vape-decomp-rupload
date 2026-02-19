/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.N9;
import com.collections.management.MultiContainerRegistry;
import com.concurrency.management.ThreadPoolCoordinator;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.system.lifecycle.ObjectLifecycleTracker;
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

public class P6
extends CryptoProtocolEngine {
    private ReflectionUtilityService J;
    private static final long[] b;
    private static final String[] g;
    private ReflectionUtilityService m;
    private static final Integer[] c;
    private static final long a;
    private ReflectionUtilityService n;
    private ReflectionUtilityService d;
    private ReflectionUtilityService q;
    private static final Object[] f;
    private static final Map e;
    private ReflectionUtilityService E;

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

    private Object n(Object object) {
        return this.q.Z(object);
    }

    static float P(P6 p6, Object object) {
        return p6.w(object);
    }

    static void K(P6 p6, Object object, Object object2) {
        p6.y(object, object2);
    }

    private float u(Object object) {
        return this.n.x(object);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private boolean K(Object object) {
        return this.E.R(object);
    }

    static float x(P6 p6, Object object) {
        return p6.u(object);
    }

    private static Method h(long l, long l2) {
        int n = P6.e(l, l2);
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
                clazz3 = P6.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = P6.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = P6.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        P6.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = P6.f(621908499551541L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = P6.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        P6.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = P6.f(621908499551541L, 0L);
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

    private void P(Object object, float f) {
        this.d.H(object, f);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                P6.a = MultiContainerRegistry.a(6595960602638655192L, 2938197325188595930L, MethodHandles.lookup().lookupClass()).a(15454760695955L);
                P6.f = new Object[12];
                P6.g = new String[12];
                P6.a();
                P6.e = new HashMap<K, V>(13);
                var0 = P6.a ^ 40680483054677L;
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
                var6_5 = "\u001dW\u00be?\re\u0017\\u\u00aaKc\u0017\u0018\u00ba\u00a5\u0089T\u00d4\u00e5\u00aa'j\u001b\u00c3\u00e7\u0097w\u001d1\u00f1\u001aw~d\u00a0\u00fd`iVFa\u0012\u009fz\u00dd\u00d9\u00d1HtD\u00a4b.\u0003\u00ef\u00b1\u00ef/\u0083\u0001\u00f9%J\u008e\u009e\u00b3p]\u00a3\u00ca\u00ea\u0092c^\u00e2.\u00ce\u0001P\u001eHyW\u00ce\u00a6#\u00c2";
                var7_6 = "\u001dW\u00be?\re\u0017\\u\u00aaKc\u0017\u0018\u00ba\u00a5\u0089T\u00d4\u00e5\u00aa'j\u001b\u00c3\u00e7\u0097w\u001d1\u00f1\u001aw~d\u00a0\u00fd`iVFa\u0012\u009fz\u00dd\u00d9\u00d1HtD\u00a4b.\u0003\u00ef\u00b1\u00ef/\u0083\u0001\u00f9%J\u008e\u009e\u00b3p]\u00a3\u00ca\u00ea\u0092c^\u00e2.\u00ce\u0001P\u001eHyW\u00ce\u00a6#\u00c2".length();
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
                    var6_5 = "D\u00b9\u00c6\f\u00e7\u00e2C\u00b9%\u009cf\u00ea\u0098\u0005\u00c4g";
                    var7_6 = "D\u00b9\u00c6\f\u00e7\u00e2C\u00b9%\u009cf\u00ea\u0098\u0005\u00c4g".length();
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
        P6.b = var8_3;
        P6.c = new Integer[13];
    }

    static void T(P6 p6, Object object, boolean bl) {
        p6.W(object, bl);
    }

    private boolean J(Object object) {
        return this.J.R(object);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = P6.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = P6.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = P6.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public P6() {
        block33: {
            block34: {
                block31: {
                    block32: {
                        block30: {
                            block29: {
                                var1_1 = P6.a ^ 94717319855162L;
                                v0 = N9.I();
                                super(ReflectionMetadataResolver.Ps);
                                var3_2 = v0;
                                try {
                                    try {
                                        if (var3_2 == null) break block29;
                                        if (GameVersionEnumerator.MC_1_21_6.H()) {
                                        }
                                        ** GOTO lbl20
                                    }
                                    catch (CustomSystemException v1) {
                                        throw P6.a(v1);
                                    }
                                    this.m = P6.c("o", (Object)this, (Object)P6.c("s", (int)P6.b("m", (int)7496, (long)(8361638690596978341L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Y_, (long)-4570293850151719902L, (long)var1_1);
                                }
                                catch (CustomSystemException v2) {
                                    throw P6.a(v2);
                                }
                            }
                            try {
                                if (var3_2 != null) break block30;
lbl20:
                                // 2 sources

                                this.d = ((ThreadPoolCoordinator)P6.c("o", (Object)this, (Object)P6.c("s", (int)P6.b("m", (int)28859, (long)(9209429191036539735L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1), Float.TYPE, (long)-4570069376349310747L, (long)var1_1).e(GameVersionEnumerator.MC_1_21_0.R(), (String)P6.c("s", (int)P6.b("m", (int)32536, (long)(7196757083448253694L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1))).p();
                            }
                            catch (CustomSystemException v3) {
                                throw P6.a(v3);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        v4 = GameVersionEnumerator.MC_1_21_4.H();
                                        if (var3_2 == null) break block31;
                                        if (v4 != 0) {
                                        }
                                        ** GOTO lbl53
                                    }
                                    catch (CustomSystemException v5) {
                                        throw P6.a(v5);
                                    }
                                    this.q = P6.c("o", (Object)this, (Object)P6.c("s", (int)P6.b("m", (int)2117, (long)(2302483989956160416L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Yf, (long)-4570293850151719902L, (long)var1_1);
                                    if (var3_2 == null) break block32;
                                }
                                catch (CustomSystemException v6) {
                                    throw P6.a(v6);
                                }
                                if (!GameVersionEnumerator.MC_1_21_6.Q()) break block33;
                            }
                            catch (CustomSystemException v7) {
                                throw P6.a(v7);
                            }
                            this.n = P6.c("o", (Object)this, (Object)P6.c("s", (int)P6.b("m", (int)14556, (long)(8860278301760445243L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1), (boolean)true, Float.TYPE, (long)-4570293850151719902L, (long)var1_1);
                        }
                        catch (CustomSystemException v8) {
                            throw P6.a(v8);
                        }
                    }
                    try {
                        try {
                            if (var3_2 != null) break block33;
lbl53:
                            // 2 sources

                            this.E = ((ThreadPoolCoordinator)P6.c("o", (Object)this, (Object)P6.c("s", (int)P6.b("m", (int)16107, (long)(555178539227471112L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1), Boolean.TYPE, (long)-4570069376349310747L, (long)var1_1).e(GameVersionEnumerator.MC_1_21_0.R(), (String)P6.c("s", (int)P6.b("m", (int)18285, (long)(32418087995614348L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1))).p();
                            v9 = this;
                            v10 = ((ThreadPoolCoordinator)((ThreadPoolCoordinator)P6.c("o", (Object)this, (Object)P6.c("s", (int)P6.b("m", (int)17447, (long)(8398632079470405577L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1), Boolean.TYPE, (long)-4570069376349310747L, (long)var1_1).e(GameVersionEnumerator.MC_1_21_0.R(), (String)P6.c("s", (int)P6.b("m", (int)11790, (long)(5522097201589865966L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1))).e(GameVersionEnumerator.MC_1_16_5.R(), (String)P6.c("s", (int)P6.b("m", (int)1603, (long)(4128117114101294506L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1))).p();
                            if (var3_2 == null) break block34;
                        }
                        catch (CustomSystemException v11) {
                            throw P6.a(v11);
                        }
                        v9.J = v10;
                        v4 = GeometryCalculator.C();
                    }
                    catch (CustomSystemException v12) {
                        throw P6.a(v12);
                    }
                }
                try {
                    block35: {
                        try {
                            block36: {
                                try {
                                    try {
                                        if (v4 < 23) break block35;
                                        if (GeometryCalculator.C() < 37) break block36;
                                    }
                                    catch (CustomSystemException v13) {
                                        throw P6.a(v13);
                                    }
                                    this.n = P6.c("o", (Object)this, (Object)P6.c("s", (int)P6.b("m", (int)9027, (long)(421709563300397223L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1), (boolean)true, Float.TYPE, (long)-4570293850151719902L, (long)var1_1);
                                    if (var3_2 != null) break block33;
                                }
                                catch (CustomSystemException v14) {
                                    throw P6.a(v14);
                                }
                            }
                            this.n = P6.c("o", (Object)this, (Object)P6.c("s", (int)P6.b("m", (int)16760, (long)(1573786477306258074L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1), (boolean)ObjectLifecycleTracker.z, Float.TYPE, (long)-4570293850151719902L, (long)var1_1);
                            if (var3_2 != null) break block33;
                        }
                        catch (CustomSystemException v15) {
                            throw P6.a(v15);
                        }
                    }
                    v9 = this;
                    v10 = P6.c("o", (Object)this, (Object)P6.c("s", (int)P6.b("m", (int)5334, (long)(4297098501016909625L ^ var1_1)), (long)-4570147094151392627L, (long)var1_1), (boolean)true, Float.TYPE, (long)-4570293850151719902L, (long)var1_1);
                }
                catch (CustomSystemException v16) {
                    throw P6.a(v16);
                }
            }
            v9.n = v10;
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/P6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void N(P6 p6, Object object, float f) {
        p6.P(object, f);
    }

    static boolean Y(P6 p6, Object object) {
        return p6.K(object);
    }

    static Object k(P6 p6, Object object) {
        return p6.B(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = P6.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = P6.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
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
                n3 = 31;
                break;
            }
            case 1: {
                n3 = 14;
                break;
            }
            case 2: {
                n3 = 9;
                break;
            }
            case 3: {
                n3 = 7;
                break;
            }
            case 4: {
                n3 = 44;
                break;
            }
            case 5: {
                n3 = 46;
                break;
            }
            case 6: {
                n3 = 41;
                break;
            }
            case 7: {
                n3 = 34;
                break;
            }
            case 8: {
                n3 = 6;
                break;
            }
            case 9: {
                n3 = 16;
                break;
            }
            case 10: {
                n3 = 38;
                break;
            }
            case 11: {
                n3 = 32;
                break;
            }
            case 12: {
                n3 = 20;
                break;
            }
            case 13: {
                n3 = 1;
                break;
            }
            case 14: {
                n3 = 28;
                break;
            }
            case 15: {
                n3 = 30;
                break;
            }
            case 16: {
                n3 = 35;
                break;
            }
            case 17: {
                n3 = 29;
                break;
            }
            case 18: {
                n3 = 49;
                break;
            }
            case 19: {
                n3 = 59;
                break;
            }
            case 20: {
                n3 = 25;
                break;
            }
            case 21: {
                n3 = 37;
                break;
            }
            case 22: {
                n3 = 45;
                break;
            }
            case 23: {
                n3 = 43;
                break;
            }
            case 24: {
                n3 = 39;
                break;
            }
            case 25: {
                n3 = 12;
                break;
            }
            case 26: {
                n3 = 47;
                break;
            }
            case 27: {
                n3 = 63;
                break;
            }
            case 28: {
                n3 = 17;
                break;
            }
            case 29: {
                n3 = 15;
                break;
            }
            case 30: {
                n3 = 52;
                break;
            }
            case 31: {
                n3 = 3;
                break;
            }
            case 32: {
                n3 = 2;
                break;
            }
            case 33: {
                n3 = 58;
                break;
            }
            case 34: {
                n3 = 50;
                break;
            }
            case 35: {
                n3 = 51;
                break;
            }
            case 36: {
                n3 = 48;
                break;
            }
            case 37: {
                n3 = 8;
                break;
            }
            case 38: {
                n3 = 33;
                break;
            }
            case 39: {
                n3 = 23;
                break;
            }
            case 40: {
                n3 = 13;
                break;
            }
            case 41: {
                n3 = 53;
                break;
            }
            case 42: {
                n3 = 18;
                break;
            }
            case 43: {
                n3 = 4;
                break;
            }
            case 44: {
                n3 = 11;
                break;
            }
            case 45: {
                n3 = 61;
                break;
            }
            case 46: {
                n3 = 54;
                break;
            }
            case 47: {
                n3 = 5;
                break;
            }
            case 48: {
                n3 = 42;
                break;
            }
            case 49: {
                n3 = 27;
                break;
            }
            case 50: {
                n3 = 36;
                break;
            }
            case 51: {
                n3 = 10;
                break;
            }
            case 52: {
                n3 = 19;
                break;
            }
            case 53: {
                n3 = 26;
                break;
            }
            case 54: {
                n3 = 60;
                break;
            }
            case 55: {
                n3 = 55;
                break;
            }
            case 56: {
                n3 = 40;
                break;
            }
            case 57: {
                n3 = 0;
                break;
            }
            case 58: {
                n3 = 56;
                break;
            }
            case 59: {
                n3 = 57;
                break;
            }
            case 60: {
                n3 = 22;
                break;
            }
            case 61: {
                n3 = 62;
                break;
            }
            case 62: {
                n3 = 21;
                break;
            }
            default: {
                n3 = 24;
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
        P6.g[n4] = new String(cArray);
        return n4;
    }

    private static Field g(long l, long l2) {
        int n = P6.e(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = P6.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = P6.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = P6.c(clazz3, string2, clazz2)) != null) {
                    P6.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = P6.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        P6.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = P6.f(621908499551541L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    static void c(P6 p6, Object object, boolean bl) {
        p6.B(object, bl);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = P6.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = P6.e(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                P6.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static void j(P6 p6, Object object, float f) {
        p6.E(object, f);
    }

    private void W(Object object, boolean bl) {
        this.J.B(object, bl);
    }

    private void B(Object object, boolean bl) {
        this.E.B(object, bl);
    }

    private void y(Object object, Object object2) {
        this.q.L(object, object2);
    }

    private void C(Object object, Object object2) {
        this.m.L(object, object2);
    }

    private float w(Object object) {
        return this.d.x(object);
    }

    private void E(Object object, float f) {
        this.n.H(object, f);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Z' || c == 'X' || c == 'E' || c == 'H') {
                field = P6.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Z' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = P6.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'o' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 's' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static boolean j(P6 p6, Object object) {
        return p6.J(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2374;
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
                throw new RuntimeException("a/P6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            P6.c[n2] = n3;
        }
        return c[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/P6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object g(P6 p6, Object object) {
        return p6.n(object);
    }

    private Object B(Object object) {
        return this.m.Z(object);
    }

    private static void a() {
        Object[] objectArray = f;
        f[0] = "2=2";
        objectArray[1] = Integer.TYPE;
        P6.g[1] = "java/lang/Integer";
        objectArray[2] = "*x \u00159K!w1ZDS2p8\u0013";
        objectArray[3] = "\u0013o$t";
        objectArray[4] = Boolean.TYPE;
        P6.g[4] = "java/lang/Boolean";
        objectArray[5] = ",\u0002g\u0010_g'\rv_2g'\u0010b";
        objectArray[6] = ".9\u007f!";
        objectArray[7] = "\fj6\u001d";
        objectArray[8] = "X\u0015.+\u0007XS\u001a?dfVX\u0011;>";
        objectArray[9] = "\fT\u0018u;QZWG&Et6\u0000T(,\u0017\u000e\bGs9/\rSW0,]QVM3E\u0014Q\u0005G$:\u0010\tUVHy\u0010]\u0007C-(\u0013\u000fW)";
        objectArray[10] = "\u001eI%\u0000#\u001fHJzS]9$\u001di]4Y\u001c\u0015z\u0006!a\u001fC(S1\u001e\u001b\u001bxB]\\\u0018Ku]>\u001eVGp=";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "lAjz`4c\u0002l\u0014lt\f\u0002zed`n\u001avm\u00076q\u001bc,?>b@v\u0014";
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(P6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(P6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

