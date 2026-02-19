/*
 * Decompiled with CFR 0.152.
 */
package com.stream.transformation;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.core.computation.AbstractComputationKernel;
import com.crypto.protocol.CryptoProtocolEngine;
import com.exception.system.CustomSystemException;
import com.game.configuration.GameVersionEnumerator;
import com.math.geometry.GeometryCalculator;
import com.reflection.metadata.ReflectionMetadataResolver;
import com.runtime.reflection.ReflectionUtilityService;
import com.security.authentication.AuthenticationStateManager675;
import com.state.management.StatefulEventToggle;
import com.system.lifecycle.ObjectLifecycleTracker;
import com.type.registry.DynamicTypeRegistry;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class StreamTransformationService
extends CryptoProtocolEngine {
    private HK a;
    private final ReflectionUtilityService C;
    public final HK z;
    private HK m;
    private ReflectionUtilityService j;
    private HK Y;
    private static final long[] c;
    private static final String[] h;
    private HK e;
    private HK G;
    private static final long b;
    public final HK w;
    private final HK Z;
    private static final Object[] g;
    private HK R;
    private static final Integer[] d;
    private ReflectionUtilityService D;
    private final HK N;
    public final HK E;
    private HK i;
    private HK J;
    private static final Map f;
    private ReflectionUtilityService O;

    private void o(Object object, Object object2, Object object3, List list) {
        block3: {
            block2: {
                try {
                    if (GeometryCalculator.C() < 23) break block2;
                    this.i.l(object, object3, list);
                    break block3;
                }
                catch (CustomSystemException customSystemException) {
                    throw StreamTransformationService.a(customSystemException);
                }
            }
            this.i.l(object, object2, object3, list);
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ua" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static Object x(StreamTransformationService streamTransformationService, int n) {
        return streamTransformationService.r(n);
    }

    private Object A(Object object) {
        return this.Y.T(object, new Object[0]);
    }

    private int m(Object object, Object object2) {
        return this.e.R(object, object2);
    }

    private String D(Object object) {
        return this.G.T(object, new Object[0]).toString();
    }

    private static Field g(long l, long l2) {
        int n = StreamTransformationService.e(l, l2);
        Object object = g[n];
        if (object instanceof String) {
            String string = h[n];
            int n2 = string.indexOf(8);
            Class clazz = StreamTransformationService.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = StreamTransformationService.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = StreamTransformationService.c(clazz3, string2, clazz2)) != null) {
                    StreamTransformationService.g[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = StreamTransformationService.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        StreamTransformationService.g[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = StreamTransformationService.f(845366300201924L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private String j(Object object) {
        return (String)this.R.T(object, new Object[0]);
    }

    static Object Y(StreamTransformationService streamTransformationService, Object object) {
        return streamTransformationService.A(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                StreamTransformationService.b = MultiContainerRegistry.a(1778330247744801713L, -6254246369579351136L, MethodHandles.lookup().lookupClass()).a(200591742377700L);
                StreamTransformationService.g = new Object[20];
                StreamTransformationService.h = new String[20];
                StreamTransformationService.a();
                StreamTransformationService.f = new HashMap<K, V>(13);
                var0 = StreamTransformationService.b ^ 17318126310012L;
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
                var8_3 = new long[29];
                var5_4 = 0;
                var6_5 = "+\u00bd\u00aezL\u00a3\r\u00d3kH\u00c7\u001c\u00f5\u00e6Le\u00b0\u00b8\u00b7\u00b4\u0081QQB\u00bd\u00cd\u0090\u00b0\u008aaJ\u0018K\u00c2\u00ae\u0099\u0010(\u0089|\u00d1f\u00d6\u00812\u00c4\u00a0\u00c7\u00da\u000b\u00dd\u0092\u00f55\u00db\u008b\u00b4?\u009a\u00f8\u00e9\u0014\u00e5fi(FP\u00a7W\u0011\u00a9\u00e3\u00b4\u00c8\u0092\u00d3l\u00bdV\u001c\u00d6\u00fe`)\u00fbS\u00ca\u00bd\u0090\u00bf;\u00bfOgm\u00fb\u000f\u00fdS\u008cK\u00b6b|\u00ddG\u0006\u00d7\u0093C\u009fI\u00a6\u00ec\u00de\u00cc\u009c\u008b\u00ee\u00ed\u008a\u00be\u00af\u00e1\u001f\u0094\u00be\u0095\u00fd\u00b3\u00c2\u007f.G\u00c6\u0014@\u00dd|&\u00a4h[\u00fe\u00c2\u00b7\u00f9A\u000eB\u0011\u00b3$\t\u0094\u00ad)o\u00dd\u001c\u0085\u00a98\u00cc4E\u0085\u00d5#\u00d7b\ndH\u00c3\u001c\u00d1\u00c1\u00d8Y\u0081\u008ex\u0005\u0094\n,zu\u00d8\u00c8\u0006\u0095W\u0018\u0099\u008f\u00e1\u0018\u00aa\u0086bV7\u00c6\u0087\u00d5\u00bc_\t\u008aK\u009a\u0000\u00a2";
                var7_6 = "+\u00bd\u00aezL\u00a3\r\u00d3kH\u00c7\u001c\u00f5\u00e6Le\u00b0\u00b8\u00b7\u00b4\u0081QQB\u00bd\u00cd\u0090\u00b0\u008aaJ\u0018K\u00c2\u00ae\u0099\u0010(\u0089|\u00d1f\u00d6\u00812\u00c4\u00a0\u00c7\u00da\u000b\u00dd\u0092\u00f55\u00db\u008b\u00b4?\u009a\u00f8\u00e9\u0014\u00e5fi(FP\u00a7W\u0011\u00a9\u00e3\u00b4\u00c8\u0092\u00d3l\u00bdV\u001c\u00d6\u00fe`)\u00fbS\u00ca\u00bd\u0090\u00bf;\u00bfOgm\u00fb\u000f\u00fdS\u008cK\u00b6b|\u00ddG\u0006\u00d7\u0093C\u009fI\u00a6\u00ec\u00de\u00cc\u009c\u008b\u00ee\u00ed\u008a\u00be\u00af\u00e1\u001f\u0094\u00be\u0095\u00fd\u00b3\u00c2\u007f.G\u00c6\u0014@\u00dd|&\u00a4h[\u00fe\u00c2\u00b7\u00f9A\u000eB\u0011\u00b3$\t\u0094\u00ad)o\u00dd\u001c\u0085\u00a98\u00cc4E\u0085\u00d5#\u00d7b\ndH\u00c3\u001c\u00d1\u00c1\u00d8Y\u0081\u008ex\u0005\u0094\n,zu\u00d8\u00c8\u0006\u0095W\u0018\u0099\u008f\u00e1\u0018\u00aa\u0086bV7\u00c6\u0087\u00d5\u00bc_\t\u008aK\u009a\u0000\u00a2".length();
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
                    var6_5 = ";\u00a8qm\rs\u008f\u009bA\u00c6\u00cctx?\n\u0018";
                    var7_6 = ";\u00a8qm\rs\u008f\u009bA\u00c6\u00cctx?\n\u0018".length();
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
        StreamTransformationService.c = var8_3;
        StreamTransformationService.d = new Integer[29];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = StreamTransformationService.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static String Y(StreamTransformationService streamTransformationService, Object object) {
        return streamTransformationService.D(object);
    }

    static int v(StreamTransformationService streamTransformationService, Object object, Object object2) {
        return streamTransformationService.m(object, object2);
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
                n3 = 59;
                break;
            }
            case 1: {
                n3 = 45;
                break;
            }
            case 2: {
                n3 = 50;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 3;
                break;
            }
            case 5: {
                n3 = 35;
                break;
            }
            case 6: {
                n3 = 43;
                break;
            }
            case 7: {
                n3 = 22;
                break;
            }
            case 8: {
                n3 = 5;
                break;
            }
            case 9: {
                n3 = 34;
                break;
            }
            case 10: {
                n3 = 28;
                break;
            }
            case 11: {
                n3 = 6;
                break;
            }
            case 12: {
                n3 = 2;
                break;
            }
            case 13: {
                n3 = 54;
                break;
            }
            case 14: {
                n3 = 52;
                break;
            }
            case 15: {
                n3 = 33;
                break;
            }
            case 16: {
                n3 = 27;
                break;
            }
            case 17: {
                n3 = 16;
                break;
            }
            case 18: {
                n3 = 26;
                break;
            }
            case 19: {
                n3 = 31;
                break;
            }
            case 20: {
                n3 = 11;
                break;
            }
            case 21: {
                n3 = 21;
                break;
            }
            case 22: {
                n3 = 10;
                break;
            }
            case 23: {
                n3 = 29;
                break;
            }
            case 24: {
                n3 = 14;
                break;
            }
            case 25: {
                n3 = 15;
                break;
            }
            case 26: {
                n3 = 47;
                break;
            }
            case 27: {
                n3 = 23;
                break;
            }
            case 28: {
                n3 = 60;
                break;
            }
            case 29: {
                n3 = 63;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 44;
                break;
            }
            case 32: {
                n3 = 25;
                break;
            }
            case 33: {
                n3 = 42;
                break;
            }
            case 34: {
                n3 = 58;
                break;
            }
            case 35: {
                n3 = 55;
                break;
            }
            case 36: {
                n3 = 40;
                break;
            }
            case 37: {
                n3 = 57;
                break;
            }
            case 38: {
                n3 = 0;
                break;
            }
            case 39: {
                n3 = 61;
                break;
            }
            case 40: {
                n3 = 9;
                break;
            }
            case 41: {
                n3 = 8;
                break;
            }
            case 42: {
                n3 = 19;
                break;
            }
            case 43: {
                n3 = 12;
                break;
            }
            case 44: {
                n3 = 38;
                break;
            }
            case 45: {
                n3 = 56;
                break;
            }
            case 46: {
                n3 = 20;
                break;
            }
            case 47: {
                n3 = 24;
                break;
            }
            case 48: {
                n3 = 41;
                break;
            }
            case 49: {
                n3 = 46;
                break;
            }
            case 50: {
                n3 = 36;
                break;
            }
            case 51: {
                n3 = 51;
                break;
            }
            case 52: {
                n3 = 48;
                break;
            }
            case 53: {
                n3 = 4;
                break;
            }
            case 54: {
                n3 = 53;
                break;
            }
            case 55: {
                n3 = 49;
                break;
            }
            case 56: {
                n3 = 1;
                break;
            }
            case 57: {
                n3 = 62;
                break;
            }
            case 58: {
                n3 = 39;
                break;
            }
            case 59: {
                n3 = 13;
                break;
            }
            case 60: {
                n3 = 32;
                break;
            }
            case 61: {
                n3 = 18;
                break;
            }
            case 62: {
                n3 = 30;
                break;
            }
            default: {
                n3 = 7;
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
        StreamTransformationService.h[n4] = new String(cArray);
        return n4;
    }

    static String c(StreamTransformationService streamTransformationService, Object object) {
        return streamTransformationService.j(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = StreamTransformationService.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = StreamTransformationService.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = StreamTransformationService.e(l, l2);
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
                clazz3 = StreamTransformationService.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = StreamTransformationService.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = StreamTransformationService.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        StreamTransformationService.g[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = StreamTransformationService.f(845366300201924L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = StreamTransformationService.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        StreamTransformationService.g[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = StreamTransformationService.f(845366300201924L, 0L);
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

    static Object Q(StreamTransformationService streamTransformationService, Object object) {
        return streamTransformationService.o(object);
    }

    private int v(Object object) {
        return this.D.R(object);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u000e^[G";
        objectArray[1] = "ay&e\u000e*jv7*c*jk#";
        objectArray[2] = "]&4\bH\u0013V)%G5\u000bE.,\u000e";
        objectArray[3] = Boolean.TYPE;
        StreamTransformationService.h[3] = "java/lang/Boolean";
        objectArray[4] = "kJo>";
        objectArray[5] = "vvV\u00164C\u0003V]\u0019%\fnV]\u00041\u0019";
        objectArray[6] = "CW.|";
        objectArray[7] = "\t<E";
        objectArray[8] = Integer.TYPE;
        StreamTransformationService.h[8] = "java/lang/Integer";
        objectArray[9] = "=u>Y\u001e,HU5V\u000fc%U5K\u001bv";
        objectArray[10] = "F\u0006p)8g3&{&)(^&{;==";
        objectArray[11] = "=-\u0015<";
        objectArray[12] = "\n\u0016C\u0003Be\u0001\u0019RL#k\n\u0012V\u0016";
        objectArray[13] = "<T\u007fd[\u000f4^*\u0006f}/\u000b*mMD+\u0015b\u0006\u0005\u0003,\u0015y`\\\u001b7\u001a\u001a<\u0003\u0018)\u0016y`\u0001\u0013?ddi\f\u0016 ]`wD}j\\&7\f\u001chY{9<";
        objectArray[14] = "\u0016/k/\u0001@\u001e%>M!2Bas<\u0005T\u001byh3f\bDzv?\u0005TFq`M\u0018]Kt\u007ft\u001cC\u0003\u001f1\"\u0017CD}b.\u0016\u0002{#o+\u0001[\u0000c0p\u001d2";
        objectArray[15] = "\"q\u0007#A\u007f*{RA}\rv?\u001f0Ek/'\u0004?&7p$\u001a3Ekr/\fAXb\u007f*\u0013x\\|7AYy\u001a<\u007f [|G2O";
        objectArray[16] = "\u001aI,uy)\u0012Cy\u0017S[N\u00074f}=\u0017\u001f/i\u001eaH\u001c1e}=J\u0017'\u0017`4G\u00128.d*\u000fyr/\"jG\u0018p*\u007fdw";
        objectArray[17] = "{PM8\u001cHsZ\u0018Z&:/\u001eU+\u0018\\v\u0006N${\u0000)\u0005P(\u0018\\+\u000eFZ\u0005U&\u000bYc\u0001Kn`\u00175\nK)\u0002D9\u000b\n\u0016\\I<\u001cSm\u001c\u0016g\u0000:";
        objectArray[18] = "\u0010dm2\u0006yJz1odmV\u000b?6\u0019:I0ghUe-2\u007fw\u0015eKkgl\u001a\u0006";
        Object[] objectArray2 = objectArray;
        objectArray[19] = "jJeS\u0001$b@01\u0004V>\u0004}@\u00050g\u001cfOf(hJk@_,v\u0002\u0000\u000e\t'vEb]\u0005&7z?A\t88Ke^Vo\u0007";
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = StreamTransformationService.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = StreamTransformationService.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static Map D(StreamTransformationService streamTransformationService) {
        return streamTransformationService.F();
    }

    static boolean J(StreamTransformationService streamTransformationService, Object object) {
        return streamTransformationService.R(object);
    }

    private boolean R(Object object) {
        return this.j.R(object);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x127D;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ua", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            StreamTransformationService.d[n2] = n3;
        }
        return d[n2];
    }

    private Object t() {
        return this.C.Z(null);
    }

    private Map F() {
        return (Map)this.O.Z(null);
    }

    static Object h(StreamTransformationService streamTransformationService, Object object, Object object2) {
        return streamTransformationService.e(object, object2);
    }

    private int K(Object object) {
        return this.z.R(null, object);
    }

    private Object Y(String string) {
        return this.m.T(null, string);
    }

    static Object w(StreamTransformationService streamTransformationService, String string) {
        return streamTransformationService.Y(string);
    }

    private Object e(Object object, Object object2) {
        return this.Z.T(object, object2);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'h' || c == '\u00ce' || c == '\u00ca' || c == '\u00e9') {
                field = StreamTransformationService.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'h' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = StreamTransformationService.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static Object Y(StreamTransformationService streamTransformationService) {
        return streamTransformationService.t();
    }

    private Object R(Object object) {
        return this.J.T(object, new Object[0]);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = StreamTransformationService.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private Object o(Object object) {
        return this.a.T(object, new Object[0]);
    }

    static void L(StreamTransformationService streamTransformationService, Object object, Object object2, Object object3, List list) {
        streamTransformationService.o(object, object2, object3, list);
    }

    static Object N(StreamTransformationService streamTransformationService, Object object) {
        return streamTransformationService.R(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ua" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int n(Object object, Object object2, Object object3) {
        return this.e.R(object, object2, object3);
    }

    static int c(StreamTransformationService streamTransformationService, Object object) {
        return streamTransformationService.v(object);
    }

    private String p(Object object, Object object2) {
        Object object3 = this.N.T(object, object2);
        if (GeometryCalculator.C() >= GeometryCalculator.C) {
            AuthenticationStateManager675 authenticationStateManager675 = new AuthenticationStateManager675(object3);
            return authenticationStateManager675.i();
        }
        return object3.toString();
    }

    private Object r(int n) {
        return this.w.T(null, n);
    }

    /*
     * Unable to fully structure code
     */
    public StreamTransformationService() {
        block112: {
            block113: {
                block110: {
                    block108: {
                        block109: {
                            block107: {
                                block105: {
                                    block106: {
                                        block104: {
                                            block101: {
                                                block102: {
                                                    block100: {
                                                        block98: {
                                                            block97: {
                                                                block96: {
                                                                    block95: {
                                                                        block93: {
                                                                            block91: {
                                                                                block88: {
                                                                                    block90: {
                                                                                        block86: {
                                                                                            block87: {
                                                                                                var1_1 = StreamTransformationService.b ^ 133845107037486L;
                                                                                                v0 = DynamicTypeRegistry.B();
                                                                                                super(ReflectionMetadataResolver.VP);
                                                                                                var3_2 = v0;
                                                                                                try {
                                                                                                    try {
                                                                                                        v1 = GameVersionEnumerator.MC_1_21_0.H();
                                                                                                        if (var3_2 != null) break block86;
                                                                                                        if (v1 == 0) break block87;
                                                                                                    }
                                                                                                    catch (CustomSystemException v2) {
                                                                                                        throw StreamTransformationService.a(v2);
                                                                                                    }
                                                                                                    this.R = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)28457, (long)(4851417358132215777L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, String.class, (Object)new Class[0], (long)-9027576886759261706L, (long)var1_1);
                                                                                                }
                                                                                                catch (CustomSystemException v3) {
                                                                                                    throw StreamTransformationService.a(v3);
                                                                                                }
                                                                                            }
                                                                                            v1 = GeometryCalculator.C();
                                                                                        }
                                                                                        try {
                                                                                            block89: {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v4 = 13;
                                                                                                                if (var3_2 != null) break block88;
                                                                                                                if (v1 != v4) break block89;
                                                                                                            }
                                                                                                            catch (CustomSystemException v5) {
                                                                                                                throw StreamTransformationService.a(v5);
                                                                                                            }
                                                                                                            v1 = (int)ObjectLifecycleTracker.U.d();
                                                                                                            if (var3_2 != null) break block90;
                                                                                                        }
                                                                                                        catch (CustomSystemException v6) {
                                                                                                            throw StreamTransformationService.a(v6);
                                                                                                        }
                                                                                                        if (v1 == 0) break block89;
                                                                                                    }
                                                                                                    catch (CustomSystemException v7) {
                                                                                                        throw StreamTransformationService.a(v7);
                                                                                                    }
                                                                                                    this.D = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)12051, (long)(8192245639988264905L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-9027476302383813731L, (long)var1_1);
                                                                                                    if (var3_2 == null) break block91;
                                                                                                }
                                                                                                catch (CustomSystemException v8) {
                                                                                                    throw StreamTransformationService.a(v8);
                                                                                                }
                                                                                            }
                                                                                            v1 = GeometryCalculator.C();
                                                                                        }
                                                                                        catch (CustomSystemException v9) {
                                                                                            throw StreamTransformationService.a(v9);
                                                                                        }
                                                                                    }
                                                                                    v4 = 50;
                                                                                }
                                                                                try {
                                                                                    block92: {
                                                                                        try {
                                                                                            if (v1 >= v4) break block92;
                                                                                            this.D = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)7829, (long)(610404488592756308L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-9027476302383813731L, (long)var1_1);
                                                                                            if (var3_2 == null) break block91;
                                                                                        }
                                                                                        catch (CustomSystemException v10) {
                                                                                            throw StreamTransformationService.a(v10);
                                                                                        }
                                                                                    }
                                                                                    this.J = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)24803, (long)(4681708017314951216L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Vl, (Object)new Class[0], (long)-9027576886759261706L, (long)var1_1);
                                                                                }
                                                                                catch (CustomSystemException v11) {
                                                                                    throw StreamTransformationService.a(v11);
                                                                                }
                                                                            }
                                                                            try {
                                                                                block94: {
                                                                                    try {
                                                                                        try {
                                                                                            this.z = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)5554, (long)(2745106911483921770L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VP}, (long)-9029588889112181640L, (long)var1_1);
                                                                                            this.w = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)12111, (long)(8895338276830297993L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.VP, (Object)new Class[]{Integer.TYPE}, (long)-9029588889112181640L, (long)var1_1);
                                                                                            v12 = GeometryCalculator.C();
                                                                                            v13 = 13;
                                                                                            if (var3_2 != null) break block93;
                                                                                            if (v12 != v13) break block94;
                                                                                        }
                                                                                        catch (CustomSystemException v14) {
                                                                                            throw StreamTransformationService.a(v14);
                                                                                        }
                                                                                        this.G = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)24358, (long)(6549468766589046758L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, String.class, (Object)new Class[0], (long)-9027576886759261706L, (long)var1_1);
                                                                                        if (var3_2 == null) break block95;
                                                                                    }
                                                                                    catch (CustomSystemException v15) {
                                                                                        throw StreamTransformationService.a(v15);
                                                                                    }
                                                                                }
                                                                                v12 = GeometryCalculator.C();
                                                                                v13 = 35;
                                                                            }
                                                                            catch (CustomSystemException v16) {
                                                                                throw StreamTransformationService.a(v16);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var3_2 != null) break block96;
                                                                                if (v12 >= v13) break block95;
                                                                            }
                                                                            catch (CustomSystemException v17) {
                                                                                throw StreamTransformationService.a(v17);
                                                                            }
                                                                            this.m = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)2195, (long)(4221245134082021471L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.VP, (Object)new Class[]{String.class}, (long)-9029588889112181640L, (long)var1_1);
                                                                        }
                                                                        catch (CustomSystemException v18) {
                                                                            throw StreamTransformationService.a(v18);
                                                                        }
                                                                    }
                                                                    v12 = GeometryCalculator.C();
                                                                    v13 = 23;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var3_2 != null) break block97;
                                                                        if (v12 >= v13) {
                                                                        }
                                                                        ** GOTO lbl170
                                                                    }
                                                                    catch (CustomSystemException v19) {
                                                                        throw StreamTransformationService.a(v19);
                                                                    }
                                                                    v12 = GeometryCalculator.C();
                                                                    v13 = 35;
                                                                }
                                                                catch (CustomSystemException v20) {
                                                                    throw StreamTransformationService.a(v20);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var3_2 != null) break block98;
                                                                    if (v12 >= v13) {
                                                                    }
                                                                    ** GOTO lbl164
                                                                }
                                                                catch (CustomSystemException v21) {
                                                                    throw StreamTransformationService.a(v21);
                                                                }
                                                                v12 = GeometryCalculator.C();
                                                                v13 = 50;
                                                            }
                                                            catch (CustomSystemException v22) {
                                                                throw StreamTransformationService.a(v22);
                                                            }
                                                        }
                                                        try {
                                                            block99: {
                                                                try {
                                                                    if (v12 < v13) break block99;
                                                                    this.C = StreamTransformationService.c("\u00dc", (Object)this, (Object)ReflectionMetadataResolver.PA, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)25018, (long)(7051672914944717177L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Fy, (long)-9027655672487614664L, (long)var1_1);
                                                                    if (var3_2 == null) break block100;
                                                                }
                                                                catch (CustomSystemException v23) {
                                                                    throw StreamTransformationService.a(v23);
                                                                }
                                                            }
                                                            this.C = StreamTransformationService.c("\u00dc", (Object)this, (Object)ReflectionMetadataResolver.bB, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)31658, (long)(3445380420398672751L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Fy, (long)-9027655672487614664L, (long)var1_1);
                                                            this.i = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)27213, (long)(6289448998372506260L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.r7, ReflectionMetadataResolver.VB}, (long)-9027576886759261706L, (long)var1_1);
                                                        }
                                                        catch (CustomSystemException v24) {
                                                            throw StreamTransformationService.a(v24);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v25 = GameVersionEnumerator.MC_1_21_0.Q();
                                                                    if (var3_2 != null) break block101;
                                                                    if (v25 == 0) break block102;
                                                                }
                                                                catch (CustomSystemException v26) {
                                                                    throw StreamTransformationService.a(v26);
                                                                }
                                                                this.Y = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)7137, (long)(8012671060927155002L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V_, (Object)new Class[0], (long)-9027576886759261706L, (long)var1_1);
                                                                if (var3_2 == null) break block102;
                                                            }
                                                            catch (CustomSystemException v27) {
                                                                throw StreamTransformationService.a(v27);
                                                            }
lbl164:
                                                            // 2 sources

                                                            this.C = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)19199, (long)(4551074424976988705L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.F3, (long)-9029672798096974270L, (long)var1_1);
                                                            this.i = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)4385, (long)(4091732390054101488L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.r7, ReflectionMetadataResolver.VB}, (long)-9027576886759261706L, (long)var1_1);
                                                            if (var3_2 == null) break block102;
                                                        }
                                                        catch (CustomSystemException v28) {
                                                            throw StreamTransformationService.a(v28);
                                                        }
lbl170:
                                                        // 2 sources

                                                        this.C = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)26018, (long)(4799437381523109228L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.F3, (long)-9029672798096974270L, (long)var1_1);
                                                        this.i = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)2751, (long)(5972327902628518509L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{ReflectionMetadataResolver.VP, ReflectionMetadataResolver.r7, List.class}, (long)-9027576886759261706L, (long)var1_1);
                                                    }
                                                    catch (CustomSystemException v29) {
                                                        throw StreamTransformationService.a(v29);
                                                    }
                                                }
                                                v25 = GeometryCalculator.C();
                                            }
                                            try {
                                                block103: {
                                                    try {
                                                        if (v25 < 35) break block103;
                                                        this.N = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)1456, (long)(6100934201238295935L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V_, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)-9027576886759261706L, (long)var1_1);
                                                        this.Z = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)29532, (long)(1405910466528306065L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.V_, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)-9027576886759261706L, (long)var1_1);
                                                        if (var3_2 == null) break block104;
                                                    }
                                                    catch (CustomSystemException v30) {
                                                        throw StreamTransformationService.a(v30);
                                                    }
                                                }
                                                this.N = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)731, (long)(1831272060312326672L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, String.class, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)-9027576886759261706L, (long)var1_1);
                                                this.Z = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)26396, (long)(4609143862814865366L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, String.class, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)-9027576886759261706L, (long)var1_1);
                                            }
                                            catch (CustomSystemException v31) {
                                                throw StreamTransformationService.a(v31);
                                            }
                                        }
                                        try {
                                            try {
                                                v32 = GeometryCalculator.C();
                                                v33 = 15;
                                                if (var3_2 != null) break block105;
                                                if (v32 < v33) break block106;
                                            }
                                            catch (CustomSystemException v34) {
                                                throw StreamTransformationService.a(v34);
                                            }
                                            this.O = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)12283, (long)(8278552038434422574L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Map.class, (long)-9029672798096974270L, (long)var1_1);
                                        }
                                        catch (CustomSystemException v35) {
                                            throw StreamTransformationService.a(v35);
                                        }
                                    }
                                    try {
                                        v32 = GeometryCalculator.C();
                                        if (var3_2 != null) break block107;
                                        v33 = 35;
                                    }
                                    catch (CustomSystemException v36) {
                                        throw StreamTransformationService.a(v36);
                                    }
                                }
                                try {
                                    if (v32 < v33) {
                                        this.j = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)19971, (long)(1599842192107101907L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-9027476302383813731L, (long)var1_1);
                                    }
                                }
                                catch (CustomSystemException v37) {
                                    throw StreamTransformationService.a(v37);
                                }
                                v32 = (int)GameVersionEnumerator.MC_1_21_0.H();
                            }
                            try {
                                try {
                                    if (var3_2 != null) break block108;
                                    if (v32 == 0) break block109;
                                }
                                catch (CustomSystemException v38) {
                                    throw StreamTransformationService.a(v38);
                                }
                                this.a = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)17835, (long)(8722960759379219830L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.rp, (Object)new Class[0], (long)-9027576886759261706L, (long)var1_1);
                            }
                            catch (CustomSystemException v39) {
                                throw StreamTransformationService.a(v39);
                            }
                        }
                        v32 = (int)GameVersionEnumerator.MC_1_21_4.H();
                    }
                    try {
                        block111: {
                            try {
                                try {
                                    if (var3_2 != null) break block110;
                                    if (v32 == 0) break block111;
                                }
                                catch (CustomSystemException v40) {
                                    throw StreamTransformationService.a(v40);
                                }
                                this.E = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)1608, (long)(6580253016130066068L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.d, (Object)new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.UQ, ReflectionMetadataResolver.re}, (long)-9029588889112181640L, (long)var1_1);
                                if (var3_2 == null) break block112;
                            }
                            catch (CustomSystemException v41) {
                                throw StreamTransformationService.a(v41);
                            }
                        }
                        v32 = (int)GameVersionEnumerator.MC_1_16_5.H();
                    }
                    catch (CustomSystemException v42) {
                        throw StreamTransformationService.a(v42);
                    }
                }
                try {
                    block114: {
                        try {
                            try {
                                if (var3_2 != null) break block113;
                                if (v32 == 0) break block114;
                            }
                            catch (CustomSystemException v43) {
                                throw StreamTransformationService.a(v43);
                            }
                            this.E = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)19394, (long)(176476694722894597L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.d, (Object)new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.UQ, ReflectionMetadataResolver.Y0}, (long)-9029588889112181640L, (long)var1_1);
                            if (var3_2 == null) break block112;
                        }
                        catch (CustomSystemException v44) {
                            throw StreamTransformationService.a(v44);
                        }
                    }
                    v32 = (int)GameVersionEnumerator.MC_1_12_2.H();
                }
                catch (CustomSystemException v45) {
                    throw StreamTransformationService.a(v45);
                }
            }
            try {
                block115: {
                    try {
                        if (v32 == 0) break block115;
                        this.E = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)10470, (long)(7735008387006052388L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Er, (Object)new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.UQ, Boolean.TYPE}, (long)-9027576886759261706L, (long)var1_1);
                        if (var3_2 == null) break block112;
                    }
                    catch (CustomSystemException v46) {
                        throw StreamTransformationService.a(v46);
                    }
                }
                this.E = StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)18959, (long)(983139440349371083L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)ReflectionMetadataResolver.Er, (Object)new Class[]{ReflectionMetadataResolver.EV, ReflectionMetadataResolver.UQ, Boolean.TYPE}, (long)-9027576886759261706L, (long)var1_1);
            }
            catch (CustomSystemException v47) {
                throw StreamTransformationService.a(v47);
            }
        }
        try {
            this.e = ((StatefulEventToggle)StreamTransformationService.c("\u00dc", (Object)this, (Object)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)1540, (long)(7040543169211438797L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), Integer.TYPE, (Object)new Class[]{ReflectionMetadataResolver.Vl}, (long)-9029457196820804166L, (long)var1_1).e(GameVersionEnumerator.MC_1_16_5.R(), (String)StreamTransformationService.c("n", (int)StreamTransformationService.b("c", (int)23165, (long)(6186964405560953506L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1))).H(GameVersionEnumerator.MC_1_21_4.R(), new Class[]{ReflectionMetadataResolver.Vl, ReflectionMetadataResolver.Ut}).M();
            if (AbstractComputationKernel.J() != null) {
                DynamicTypeRegistry.W("h4nE7b");
            }
        }
        catch (CustomSystemException v48) {
            throw StreamTransformationService.a(v48);
        }
    }

    static int Z(StreamTransformationService streamTransformationService, Object object) {
        return streamTransformationService.K(object);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = StreamTransformationService.e(l, l2);
            object = g[n];
            try {
                if (!(object instanceof String)) break block2;
                StreamTransformationService.g[n] = clazz = Class.forName(h[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static String x(StreamTransformationService streamTransformationService, Object object, Object object2) {
        return streamTransformationService.p(object, object2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(StreamTransformationService.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(StreamTransformationService.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

