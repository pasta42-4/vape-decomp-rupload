/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Hc;
import a.Ib;
import a.Na;
import a.O_;
import a.d8;
import a.eM;
import a.ht;
import a.ic;
import a.kX;
import a.m4;
import a.ob;
import a.v2;
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
public class Ua
extends v2 {
    private HK a;
    private final Ib C;
    public final HK z;
    private HK m;
    private Ib j;
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
    private Ib D;
    private final HK N;
    public final HK E;
    private HK i;
    private HK J;
    private static final Map f;
    private Ib O;

    private void o(Object object, Object object2, Object object3, List list) {
        block3: {
            block2: {
                try {
                    if (kX.C() < 23) break block2;
                    this.i.l(object, object3, list);
                    break block3;
                }
                catch (O_ o_2) {
                    throw Ua.a(o_2);
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

    static Object x(Ua ua, int n2) {
        return ua.r(n2);
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

    private static Field g(long l10, long l11) {
        int n2 = Ua.e(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            String string = h[n2];
            int n3 = string.indexOf(8);
            Class clazz = Ua.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = Ua.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Ua.c(clazz3, string2, clazz2)) != null) {
                    Ua.g[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = Ua.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        Ua.g[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Ua.f(845366300201924L, 0L);
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

    static Object Y(Ua ua, Object object) {
        return ua.A(object);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                Ua.b = d8.a(1778330247744801713L, -6254246369579351136L, MethodHandles.lookup().lookupClass()).a(200591742377700L);
                Ua.g = new Object[20];
                Ua.h = new String[20];
                Ua.a();
                Ua.f = new HashMap<K, V>(13);
                var0 = Ua.b ^ 17318126310012L;
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
        Ua.c = var8_3;
        Ua.d = new Integer[29];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = Ua.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static String Y(Ua ua, Object object) {
        return ua.D(object);
    }

    static int v(Ua ua, Object object, Object object2) {
        return ua.m(object, object2);
    }

    private static Method c(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n2) continue;
            for (int i10 = 0; i10 < n2; ++i10) {
                if (classArray2[i10] != classArray[i10]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (h[n5] != null) {
            return n5;
        }
        Object object = g[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 59;
                break;
            }
            case 1: {
                n4 = 45;
                break;
            }
            case 2: {
                n4 = 50;
                break;
            }
            case 3: {
                n4 = 37;
                break;
            }
            case 4: {
                n4 = 3;
                break;
            }
            case 5: {
                n4 = 35;
                break;
            }
            case 6: {
                n4 = 43;
                break;
            }
            case 7: {
                n4 = 22;
                break;
            }
            case 8: {
                n4 = 5;
                break;
            }
            case 9: {
                n4 = 34;
                break;
            }
            case 10: {
                n4 = 28;
                break;
            }
            case 11: {
                n4 = 6;
                break;
            }
            case 12: {
                n4 = 2;
                break;
            }
            case 13: {
                n4 = 54;
                break;
            }
            case 14: {
                n4 = 52;
                break;
            }
            case 15: {
                n4 = 33;
                break;
            }
            case 16: {
                n4 = 27;
                break;
            }
            case 17: {
                n4 = 16;
                break;
            }
            case 18: {
                n4 = 26;
                break;
            }
            case 19: {
                n4 = 31;
                break;
            }
            case 20: {
                n4 = 11;
                break;
            }
            case 21: {
                n4 = 21;
                break;
            }
            case 22: {
                n4 = 10;
                break;
            }
            case 23: {
                n4 = 29;
                break;
            }
            case 24: {
                n4 = 14;
                break;
            }
            case 25: {
                n4 = 15;
                break;
            }
            case 26: {
                n4 = 47;
                break;
            }
            case 27: {
                n4 = 23;
                break;
            }
            case 28: {
                n4 = 60;
                break;
            }
            case 29: {
                n4 = 63;
                break;
            }
            case 30: {
                n4 = 17;
                break;
            }
            case 31: {
                n4 = 44;
                break;
            }
            case 32: {
                n4 = 25;
                break;
            }
            case 33: {
                n4 = 42;
                break;
            }
            case 34: {
                n4 = 58;
                break;
            }
            case 35: {
                n4 = 55;
                break;
            }
            case 36: {
                n4 = 40;
                break;
            }
            case 37: {
                n4 = 57;
                break;
            }
            case 38: {
                n4 = 0;
                break;
            }
            case 39: {
                n4 = 61;
                break;
            }
            case 40: {
                n4 = 9;
                break;
            }
            case 41: {
                n4 = 8;
                break;
            }
            case 42: {
                n4 = 19;
                break;
            }
            case 43: {
                n4 = 12;
                break;
            }
            case 44: {
                n4 = 38;
                break;
            }
            case 45: {
                n4 = 56;
                break;
            }
            case 46: {
                n4 = 20;
                break;
            }
            case 47: {
                n4 = 24;
                break;
            }
            case 48: {
                n4 = 41;
                break;
            }
            case 49: {
                n4 = 46;
                break;
            }
            case 50: {
                n4 = 36;
                break;
            }
            case 51: {
                n4 = 51;
                break;
            }
            case 52: {
                n4 = 48;
                break;
            }
            case 53: {
                n4 = 4;
                break;
            }
            case 54: {
                n4 = 53;
                break;
            }
            case 55: {
                n4 = 49;
                break;
            }
            case 56: {
                n4 = 1;
                break;
            }
            case 57: {
                n4 = 62;
                break;
            }
            case 58: {
                n4 = 39;
                break;
            }
            case 59: {
                n4 = 13;
                break;
            }
            case 60: {
                n4 = 32;
                break;
            }
            case 61: {
                n4 = 18;
                break;
            }
            case 62: {
                n4 = 30;
                break;
            }
            default: {
                n4 = 7;
            }
        }
        n6 = n4;
        int[] nArray = new int[6];
        int n7 = 0;
        while (n7 < 6) {
            n3 = 7 * (5 - n7);
            n2 = (int)(l10 >>> n3 & 0x7FL);
            if ((n2 -= n6) < 0) {
                n2 += 128;
            }
            nArray[n7] = n2;
            ++n7;
        }
        char[] cArray = ((String)object).toCharArray();
        n3 = 0;
        while (n3 < cArray.length) {
            n2 = nArray[n3 % nArray.length];
            if (n2 == 0) break;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            ++n3;
        }
        Ua.h[n5] = new String(cArray);
        return n5;
    }

    static String c(Ua ua, Object object) {
        return ua.j(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = Ua.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = Ua.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method h(long l10, long l11) {
        int n2 = Ua.e(l10, l11);
        Object object = g[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = h[n2];
                int n4 = string2.indexOf(8);
                clazz3 = Ua.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
                int n5 = string2.indexOf(8, ++n4);
                string = string2.substring(n4, n5);
                int n6 = -1;
                int n7 = n5;
                do {
                    ++n6;
                    ++n7;
                } while ((n7 = string2.indexOf(8, n7)) > -1);
                n3 = n6 - 1;
                classArray2 = new Class[n3];
                clazz2 = null;
                n7 = n5 + 1;
                for (int i10 = 0; i10 < n6; ++i10) {
                    int n8 = string2.indexOf(8, n7);
                    clazz2 = Ua.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Ua.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        Ua.g[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Ua.f(845366300201924L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = Ua.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        Ua.g[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Ua.f(845366300201924L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n9 = 0;
            while (n9 < n3) {
                stringBuffer.append(classArray2[n9].getName());
                if (++n9 >= n3) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    static Object Q(Ua ua, Object object) {
        return ua.o(object);
    }

    private int v(Object object) {
        return this.D.R(object);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static void a() {
        Object[] objectArray = g;
        g[0] = "\u000e^[G";
        objectArray[1] = "ay&e\u000e*jv7*c*jk#";
        objectArray[2] = "]&4\bH\u0013V)%G5\u000bE.,\u000e";
        objectArray[3] = Boolean.TYPE;
        Ua.h[3] = "java/lang/Boolean";
        objectArray[4] = "kJo>";
        objectArray[5] = "vvV\u00164C\u0003V]\u0019%\fnV]\u00041\u0019";
        objectArray[6] = "CW.|";
        objectArray[7] = "\t<E";
        objectArray[8] = Integer.TYPE;
        Ua.h[8] = "java/lang/Integer";
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
        Field field = Ua.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = Ua.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static Map D(Ua ua) {
        return ua.F();
    }

    static boolean J(Ua ua, Object object) {
        return ua.R(object);
    }

    private boolean R(Object object) {
        return this.j.R(object);
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x127D;
        if (d[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l12, objectArray);
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
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ua.d[n3] = n4;
        }
        return d[n3];
    }

    private Object t() {
        return this.C.Z(null);
    }

    private Map F() {
        return (Map)this.O.Z(null);
    }

    static Object h(Ua ua, Object object, Object object2) {
        return ua.e(object, object2);
    }

    private int K(Object object) {
        return this.z.R(null, object);
    }

    private Object Y(String string) {
        return this.m.T(null, string);
    }

    static Object w(Ua ua, String string) {
        return ua.Y(string);
    }

    private Object e(Object object, Object object2) {
        return this.Z.T(object, object2);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'h' || c10 == '\u00ce' || c10 == '\u00ca' || c10 == '\u00e9') {
                field = Ua.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'h' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00ca' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Ua.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00dc' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static Object Y(Ua ua) {
        return ua.t();
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
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = Ua.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private Object o(Object object) {
        return this.a.T(object, new Object[0]);
    }

    static void L(Ua ua, Object object, Object object2, Object object3, List list) {
        ua.o(object, object2, object3, list);
    }

    static Object N(Ua ua, Object object) {
        return ua.R(object);
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

    static int c(Ua ua, Object object) {
        return ua.v(object);
    }

    private String p(Object object, Object object2) {
        Object object3 = this.N.T(object, object2);
        if (kX.C() >= kX.C) {
            ob ob2 = new ob(object3);
            return ob2.i();
        }
        return object3.toString();
    }

    private Object r(int n2) {
        return this.w.T(null, n2);
    }

    /*
     * Unable to fully structure code
     */
    public Ua() {
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
                                                                                                var1_1 = Ua.b ^ 133845107037486L;
                                                                                                v0 = m4.B();
                                                                                                super(eM.VP);
                                                                                                var3_2 = v0;
                                                                                                try {
                                                                                                    try {
                                                                                                        v1 = Na.MC_1_21_0.H();
                                                                                                        if (var3_2 != null) break block86;
                                                                                                        if (v1 == 0) break block87;
                                                                                                    }
                                                                                                    catch (O_ v2) {
                                                                                                        throw Ua.a(v2);
                                                                                                    }
                                                                                                    this.R = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)28457, (long)(4851417358132215777L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, String.class, (Object)new Class[0], (long)-9027576886759261706L, (long)var1_1);
                                                                                                }
                                                                                                catch (O_ v3) {
                                                                                                    throw Ua.a(v3);
                                                                                                }
                                                                                            }
                                                                                            v1 = kX.C();
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
                                                                                                            catch (O_ v5) {
                                                                                                                throw Ua.a(v5);
                                                                                                            }
                                                                                                            v1 = (int)Hc.U.d();
                                                                                                            if (var3_2 != null) break block90;
                                                                                                        }
                                                                                                        catch (O_ v6) {
                                                                                                            throw Ua.a(v6);
                                                                                                        }
                                                                                                        if (v1 == 0) break block89;
                                                                                                    }
                                                                                                    catch (O_ v7) {
                                                                                                        throw Ua.a(v7);
                                                                                                    }
                                                                                                    this.D = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)12051, (long)(8192245639988264905L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-9027476302383813731L, (long)var1_1);
                                                                                                    if (var3_2 == null) break block91;
                                                                                                }
                                                                                                catch (O_ v8) {
                                                                                                    throw Ua.a(v8);
                                                                                                }
                                                                                            }
                                                                                            v1 = kX.C();
                                                                                        }
                                                                                        catch (O_ v9) {
                                                                                            throw Ua.a(v9);
                                                                                        }
                                                                                    }
                                                                                    v4 = 50;
                                                                                }
                                                                                try {
                                                                                    block92: {
                                                                                        try {
                                                                                            if (v1 >= v4) break block92;
                                                                                            this.D = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)7829, (long)(610404488592756308L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Integer.TYPE, (long)-9027476302383813731L, (long)var1_1);
                                                                                            if (var3_2 == null) break block91;
                                                                                        }
                                                                                        catch (O_ v10) {
                                                                                            throw Ua.a(v10);
                                                                                        }
                                                                                    }
                                                                                    this.J = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)24803, (long)(4681708017314951216L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.Vl, (Object)new Class[0], (long)-9027576886759261706L, (long)var1_1);
                                                                                }
                                                                                catch (O_ v11) {
                                                                                    throw Ua.a(v11);
                                                                                }
                                                                            }
                                                                            try {
                                                                                block94: {
                                                                                    try {
                                                                                        try {
                                                                                            this.z = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)5554, (long)(2745106911483921770L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Integer.TYPE, (Object)new Class[]{eM.VP}, (long)-9029588889112181640L, (long)var1_1);
                                                                                            this.w = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)12111, (long)(8895338276830297993L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.VP, (Object)new Class[]{Integer.TYPE}, (long)-9029588889112181640L, (long)var1_1);
                                                                                            v12 = kX.C();
                                                                                            v13 = 13;
                                                                                            if (var3_2 != null) break block93;
                                                                                            if (v12 != v13) break block94;
                                                                                        }
                                                                                        catch (O_ v14) {
                                                                                            throw Ua.a(v14);
                                                                                        }
                                                                                        this.G = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)24358, (long)(6549468766589046758L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, String.class, (Object)new Class[0], (long)-9027576886759261706L, (long)var1_1);
                                                                                        if (var3_2 == null) break block95;
                                                                                    }
                                                                                    catch (O_ v15) {
                                                                                        throw Ua.a(v15);
                                                                                    }
                                                                                }
                                                                                v12 = kX.C();
                                                                                v13 = 35;
                                                                            }
                                                                            catch (O_ v16) {
                                                                                throw Ua.a(v16);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var3_2 != null) break block96;
                                                                                if (v12 >= v13) break block95;
                                                                            }
                                                                            catch (O_ v17) {
                                                                                throw Ua.a(v17);
                                                                            }
                                                                            this.m = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)2195, (long)(4221245134082021471L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.VP, (Object)new Class[]{String.class}, (long)-9029588889112181640L, (long)var1_1);
                                                                        }
                                                                        catch (O_ v18) {
                                                                            throw Ua.a(v18);
                                                                        }
                                                                    }
                                                                    v12 = kX.C();
                                                                    v13 = 23;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var3_2 != null) break block97;
                                                                        if (v12 >= v13) {
                                                                        }
                                                                        ** GOTO lbl170
                                                                    }
                                                                    catch (O_ v19) {
                                                                        throw Ua.a(v19);
                                                                    }
                                                                    v12 = kX.C();
                                                                    v13 = 35;
                                                                }
                                                                catch (O_ v20) {
                                                                    throw Ua.a(v20);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var3_2 != null) break block98;
                                                                    if (v12 >= v13) {
                                                                    }
                                                                    ** GOTO lbl164
                                                                }
                                                                catch (O_ v21) {
                                                                    throw Ua.a(v21);
                                                                }
                                                                v12 = kX.C();
                                                                v13 = 50;
                                                            }
                                                            catch (O_ v22) {
                                                                throw Ua.a(v22);
                                                            }
                                                        }
                                                        try {
                                                            block99: {
                                                                try {
                                                                    if (v12 < v13) break block99;
                                                                    this.C = Ua.c("\u00dc", (Object)this, (Object)eM.PA, (Object)Ua.c("n", (int)Ua.b("c", (int)25018, (long)(7051672914944717177L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.Fy, (long)-9027655672487614664L, (long)var1_1);
                                                                    if (var3_2 == null) break block100;
                                                                }
                                                                catch (O_ v23) {
                                                                    throw Ua.a(v23);
                                                                }
                                                            }
                                                            this.C = Ua.c("\u00dc", (Object)this, (Object)eM.bB, (Object)Ua.c("n", (int)Ua.b("c", (int)31658, (long)(3445380420398672751L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.Fy, (long)-9027655672487614664L, (long)var1_1);
                                                            this.i = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)27213, (long)(6289448998372506260L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.r7, eM.VB}, (long)-9027576886759261706L, (long)var1_1);
                                                        }
                                                        catch (O_ v24) {
                                                            throw Ua.a(v24);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v25 = Na.MC_1_21_0.Q();
                                                                    if (var3_2 != null) break block101;
                                                                    if (v25 == 0) break block102;
                                                                }
                                                                catch (O_ v26) {
                                                                    throw Ua.a(v26);
                                                                }
                                                                this.Y = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)7137, (long)(8012671060927155002L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.V_, (Object)new Class[0], (long)-9027576886759261706L, (long)var1_1);
                                                                if (var3_2 == null) break block102;
                                                            }
                                                            catch (O_ v27) {
                                                                throw Ua.a(v27);
                                                            }
lbl164:
                                                            // 2 sources

                                                            this.C = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)19199, (long)(4551074424976988705L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.F3, (long)-9029672798096974270L, (long)var1_1);
                                                            this.i = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)4385, (long)(4091732390054101488L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.r7, eM.VB}, (long)-9027576886759261706L, (long)var1_1);
                                                            if (var3_2 == null) break block102;
                                                        }
                                                        catch (O_ v28) {
                                                            throw Ua.a(v28);
                                                        }
lbl170:
                                                        // 2 sources

                                                        this.C = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)26018, (long)(4799437381523109228L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.F3, (long)-9029672798096974270L, (long)var1_1);
                                                        this.i = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)2751, (long)(5972327902628518509L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.VP, eM.r7, List.class}, (long)-9027576886759261706L, (long)var1_1);
                                                    }
                                                    catch (O_ v29) {
                                                        throw Ua.a(v29);
                                                    }
                                                }
                                                v25 = kX.C();
                                            }
                                            try {
                                                block103: {
                                                    try {
                                                        if (v25 < 35) break block103;
                                                        this.N = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)1456, (long)(6100934201238295935L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.V_, (Object)new Class[]{eM.Vl}, (long)-9027576886759261706L, (long)var1_1);
                                                        this.Z = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)29532, (long)(1405910466528306065L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.V_, (Object)new Class[]{eM.Vl}, (long)-9027576886759261706L, (long)var1_1);
                                                        if (var3_2 == null) break block104;
                                                    }
                                                    catch (O_ v30) {
                                                        throw Ua.a(v30);
                                                    }
                                                }
                                                this.N = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)731, (long)(1831272060312326672L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, String.class, (Object)new Class[]{eM.Vl}, (long)-9027576886759261706L, (long)var1_1);
                                                this.Z = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)26396, (long)(4609143862814865366L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, String.class, (Object)new Class[]{eM.Vl}, (long)-9027576886759261706L, (long)var1_1);
                                            }
                                            catch (O_ v31) {
                                                throw Ua.a(v31);
                                            }
                                        }
                                        try {
                                            try {
                                                v32 = kX.C();
                                                v33 = 15;
                                                if (var3_2 != null) break block105;
                                                if (v32 < v33) break block106;
                                            }
                                            catch (O_ v34) {
                                                throw Ua.a(v34);
                                            }
                                            this.O = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)12283, (long)(8278552038434422574L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Map.class, (long)-9029672798096974270L, (long)var1_1);
                                        }
                                        catch (O_ v35) {
                                            throw Ua.a(v35);
                                        }
                                    }
                                    try {
                                        v32 = kX.C();
                                        if (var3_2 != null) break block107;
                                        v33 = 35;
                                    }
                                    catch (O_ v36) {
                                        throw Ua.a(v36);
                                    }
                                }
                                try {
                                    if (v32 < v33) {
                                        this.j = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)19971, (long)(1599842192107101907L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-9027476302383813731L, (long)var1_1);
                                    }
                                }
                                catch (O_ v37) {
                                    throw Ua.a(v37);
                                }
                                v32 = (int)Na.MC_1_21_0.H();
                            }
                            try {
                                try {
                                    if (var3_2 != null) break block108;
                                    if (v32 == 0) break block109;
                                }
                                catch (O_ v38) {
                                    throw Ua.a(v38);
                                }
                                this.a = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)17835, (long)(8722960759379219830L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.rp, (Object)new Class[0], (long)-9027576886759261706L, (long)var1_1);
                            }
                            catch (O_ v39) {
                                throw Ua.a(v39);
                            }
                        }
                        v32 = (int)Na.MC_1_21_4.H();
                    }
                    try {
                        block111: {
                            try {
                                try {
                                    if (var3_2 != null) break block110;
                                    if (v32 == 0) break block111;
                                }
                                catch (O_ v40) {
                                    throw Ua.a(v40);
                                }
                                this.E = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)1608, (long)(6580253016130066068L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.d, (Object)new Class[]{eM.EV, eM.UQ, eM.re}, (long)-9029588889112181640L, (long)var1_1);
                                if (var3_2 == null) break block112;
                            }
                            catch (O_ v41) {
                                throw Ua.a(v41);
                            }
                        }
                        v32 = (int)Na.MC_1_16_5.H();
                    }
                    catch (O_ v42) {
                        throw Ua.a(v42);
                    }
                }
                try {
                    block114: {
                        try {
                            try {
                                if (var3_2 != null) break block113;
                                if (v32 == 0) break block114;
                            }
                            catch (O_ v43) {
                                throw Ua.a(v43);
                            }
                            this.E = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)19394, (long)(176476694722894597L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.d, (Object)new Class[]{eM.EV, eM.UQ, eM.Y0}, (long)-9029588889112181640L, (long)var1_1);
                            if (var3_2 == null) break block112;
                        }
                        catch (O_ v44) {
                            throw Ua.a(v44);
                        }
                    }
                    v32 = (int)Na.MC_1_12_2.H();
                }
                catch (O_ v45) {
                    throw Ua.a(v45);
                }
            }
            try {
                block115: {
                    try {
                        if (v32 == 0) break block115;
                        this.E = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)10470, (long)(7735008387006052388L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.Er, (Object)new Class[]{eM.EV, eM.UQ, Boolean.TYPE}, (long)-9027576886759261706L, (long)var1_1);
                        if (var3_2 == null) break block112;
                    }
                    catch (O_ v46) {
                        throw Ua.a(v46);
                    }
                }
                this.E = Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)18959, (long)(983139440349371083L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), (boolean)true, (Object)eM.Er, (Object)new Class[]{eM.EV, eM.UQ, Boolean.TYPE}, (long)-9027576886759261706L, (long)var1_1);
            }
            catch (O_ v47) {
                throw Ua.a(v47);
            }
        }
        try {
            this.e = ((ic)Ua.c("\u00dc", (Object)this, (Object)Ua.c("n", (int)Ua.b("c", (int)1540, (long)(7040543169211438797L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1), Integer.TYPE, (Object)new Class[]{eM.Vl}, (long)-9029457196820804166L, (long)var1_1).e(Na.MC_1_16_5.R(), (String)Ua.c("n", (int)Ua.b("c", (int)23165, (long)(6186964405560953506L ^ var1_1)), (long)-9029557858833842514L, (long)var1_1))).H(Na.MC_1_21_4.R(), new Class[]{eM.Vl, eM.Ut}).M();
            if (ht.J() != null) {
                m4.W("h4nE7b");
            }
        }
        catch (O_ v48) {
            throw Ua.a(v48);
        }
    }

    static int Z(Ua ua, Object object) {
        return ua.K(object);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = Ua.e(l10, l11);
            object = g[n2];
            try {
                if (!(object instanceof String)) break block2;
                Ua.g[n2] = clazz = Class.forName(h[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    static String x(Ua ua, Object object, Object object2) {
        return ua.p(object, object2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Ua.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(Ua.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

