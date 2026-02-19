/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Ib;
import a.O_;
import a.d8;
import a.eM;
import a.ht;
import a.v2;
import a.vZ;
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
public class v6
extends v2 {
    private static final Object[] e;
    private final Ib P;
    private final Ib O;
    private static final long[] b;
    private final Ib w;
    private static final Integer[] c;
    private final Ib J;
    private final Ib H;
    private static final long a;
    private final Ib D;
    private final Ib C;
    private final HK I;
    private final Ib y;
    private static final Map d;
    private final Ib R;
    private final Ib G;
    public HK j;
    private static final String[] f;
    private final Ib k;

    private double H(Object object) {
        return this.H.C(object);
    }

    static float Q(v6 v62, Object object) {
        return v62.K(object);
    }

    static void g(v6 v62, Object object, double d2) {
        v62.F(object, d2);
    }

    private static Method h(long l10, long l11) {
        int n2 = v6.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n2];
                int n4 = string2.indexOf(8);
                clazz3 = v6.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = v6.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = v6.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        v6.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = v6.f(643239581941098L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = v6.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        v6.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = v6.f(643239581941098L, 0L);
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

    private Object U(Object object) {
        return this.k.Z(object);
    }

    static Object A(v6 v62, Object object) {
        return v62.U(object);
    }

    static void d(v6 v62, Object object, float f10) {
        v62.d(object, f10);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                v6.a = d8.a(-7507006628464144714L, -8549676041260184546L, MethodHandles.lookup().lookupClass()).a(203186362306553L);
                v6.e = new Object[13];
                v6.f = new String[13];
                v6.a();
                v6.d = new HashMap<K, V>(13);
                var0 = v6.a ^ 19631697830716L;
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
                var6_5 = "\u0014^s+\u001dW\u00b9\u00b4%6m\u00aa\u00bb\u00cf\u00f3(bQ\u00ae\u00a5\u0019F\u00fd-\u00ce\u0087\n\b\u00e0\u0002\u0007\u00d9\u00cd1'\u00c3\n\u0014\u0013C\u00ba^\u00d6\u00c4\u00cb\u001f\u0098&\u00ee\u00df\u00c1\u0015s\u00d9Ic\u0011a8\u00a4\u008e$\u00b5i\u0080@\u00b5z\u00b0\u00bc\u00b50m\u0001\u0014\u00a5\u00b9\u0017\u00ca\u00f33\u00c5\u00b7\u00e8Q\u00d6n\u00be";
                var7_6 = "\u0014^s+\u001dW\u00b9\u00b4%6m\u00aa\u00bb\u00cf\u00f3(bQ\u00ae\u00a5\u0019F\u00fd-\u00ce\u0087\n\b\u00e0\u0002\u0007\u00d9\u00cd1'\u00c3\n\u0014\u0013C\u00ba^\u00d6\u00c4\u00cb\u001f\u0098&\u00ee\u00df\u00c1\u0015s\u00d9Ic\u0011a8\u00a4\u008e$\u00b5i\u0080@\u00b5z\u00b0\u00bc\u00b50m\u0001\u0014\u00a5\u00b9\u0017\u00ca\u00f33\u00c5\u00b7\u00e8Q\u00d6n\u00be".length();
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
                    var6_5 = "{O\u00ab\u0093\u00f7`$\u00e8,\u00994\u00bf\u0088\u0082d\u0087";
                    var7_6 = "{O\u00ab\u0093\u00f7`$\u00e8,\u00994\u00bf\u0088\u0082d\u0087".length();
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
        v6.b = var8_3;
        v6.c = new Integer[13];
    }

    static void l(v6 v62, Object object, boolean bl2) {
        v62.M(object, bl2);
    }

    static void H(v6 v62, Object object, String string) {
        v62.T(object, string);
    }

    static void f(v6 v62, Object object, double d2) {
        v62.c(object, d2);
    }

    private void c(Object object, double d2) {
        this.H.A(object, d2);
    }

    static void i(v6 v62, Object object, double d2) {
        v62.T(object, d2);
    }

    private double h(Object object) {
        return this.P.C(object);
    }

    static void Y(v6 v62, Object object, boolean bl2) {
        v62.S(object, bl2);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = v6.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private double m(Object object) {
        return this.D.C(object);
    }

    private void F(Object object, double d2) {
        this.P.A(object, d2);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private void S(Object object, float f10) {
        this.w.H(object, f10);
    }

    static void X(v6 v62, Object object, float f10) {
        v62.S(object, f10);
    }

    private void M(Object object, boolean bl2) {
        this.G.B(object, bl2);
    }

    static boolean P(v6 v62, Object object) {
        return v62.l(object);
    }

    private void s(Object object, boolean bl2) {
        this.J.B(object, bl2);
    }

    static float b(v6 v62, Object object) {
        return v62.B(object);
    }

    private int C(Object object) {
        return this.O.R(object);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = v6.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    static boolean j(v6 v62, Object object) {
        return v62.h(object);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/v6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static double Q(v6 v62, Object object) {
        return v62.m(object);
    }

    private static Field g(long l10, long l11) {
        int n2 = v6.e(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = v6.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = v6.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = v6.c(clazz3, string2, clazz2)) != null) {
                    v6.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = v6.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        v6.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = v6.f(643239581941098L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void l(Object object, int n2) {
        this.O.t(object, n2);
    }

    private float B(Object object) {
        return this.w.x(object);
    }

    private void S(Object object, boolean bl2) {
        this.C.B(object, bl2);
    }

    private void T(Object object, double d2) {
        this.R.A(object, d2);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = ",\u0012e%";
        objectArray[1] = "<#F_\n,7,W\u0010w4$+^Y";
        objectArray[2] = Boolean.TYPE;
        v6.f[2] = "java/lang/Boolean";
        objectArray[3] = "s\u0012tK\u0007\u0015x\u001de\u0004j\u0015x\u0000q";
        objectArray[4] = "\rw\"P( xW)_9o\u0015W)B-z";
        objectArray[5] = "Md|h";
        objectArray[6] = "N}x";
        objectArray[7] = Integer.TYPE;
        v6.f[7] = "java/lang/Integer";
        objectArray[8] = "4zhu";
        objectArray[9] = "h!\u000efr c.\u001f)\u0013.h%\u001bs";
        objectArray[10] = "8\u0016\n!_;kSAQ(\u0001\u007fEU(\u0002jpE\u0007QVa|WWh\ne?\u0014:k\fbjJW`\u0012mz)\u0000-T;xBU=W?\u0001\u0012D<\u001fa=I[h\u0003\u0001";
        objectArray[11] = "=x\u00075UCn=LE>yz+X<\b\u0012u+\nE\\\u0019y9Z|\u0000\u001d:z7\u007f\u0006\u001ao$Zt\u0018\u0015\u007fG\tx_\u0017x=\u0007%X\u0014\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "K\u001dEh<jJ_B{B8\f#\u001fq)+\u0013\u001aXx8+w]On;>\u001cRO<B";
    }

    static int P(v6 v62, Object object) {
        return v62.C(object);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'w' || c10 == '\u00ff' || c10 == '\u00f2' || c10 == 'x') {
                field = v6.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'w' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ff' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = v6.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00a5' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (f[n5] != null) {
            return n5;
        }
        Object object = e[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 21;
                break;
            }
            case 1: {
                n4 = 43;
                break;
            }
            case 2: {
                n4 = 3;
                break;
            }
            case 3: {
                n4 = 41;
                break;
            }
            case 4: {
                n4 = 8;
                break;
            }
            case 5: {
                n4 = 51;
                break;
            }
            case 6: {
                n4 = 63;
                break;
            }
            case 7: {
                n4 = 22;
                break;
            }
            case 8: {
                n4 = 36;
                break;
            }
            case 9: {
                n4 = 4;
                break;
            }
            case 10: {
                n4 = 29;
                break;
            }
            case 11: {
                n4 = 18;
                break;
            }
            case 12: {
                n4 = 28;
                break;
            }
            case 13: {
                n4 = 17;
                break;
            }
            case 14: {
                n4 = 48;
                break;
            }
            case 15: {
                n4 = 31;
                break;
            }
            case 16: {
                n4 = 2;
                break;
            }
            case 17: {
                n4 = 6;
                break;
            }
            case 18: {
                n4 = 30;
                break;
            }
            case 19: {
                n4 = 1;
                break;
            }
            case 20: {
                n4 = 57;
                break;
            }
            case 21: {
                n4 = 24;
                break;
            }
            case 22: {
                n4 = 12;
                break;
            }
            case 23: {
                n4 = 58;
                break;
            }
            case 24: {
                n4 = 13;
                break;
            }
            case 25: {
                n4 = 10;
                break;
            }
            case 26: {
                n4 = 0;
                break;
            }
            case 27: {
                n4 = 42;
                break;
            }
            case 28: {
                n4 = 60;
                break;
            }
            case 29: {
                n4 = 39;
                break;
            }
            case 30: {
                n4 = 19;
                break;
            }
            case 31: {
                n4 = 7;
                break;
            }
            case 32: {
                n4 = 33;
                break;
            }
            case 33: {
                n4 = 53;
                break;
            }
            case 34: {
                n4 = 5;
                break;
            }
            case 35: {
                n4 = 35;
                break;
            }
            case 36: {
                n4 = 47;
                break;
            }
            case 37: {
                n4 = 44;
                break;
            }
            case 38: {
                n4 = 54;
                break;
            }
            case 39: {
                n4 = 38;
                break;
            }
            case 40: {
                n4 = 46;
                break;
            }
            case 41: {
                n4 = 50;
                break;
            }
            case 42: {
                n4 = 15;
                break;
            }
            case 43: {
                n4 = 59;
                break;
            }
            case 44: {
                n4 = 61;
                break;
            }
            case 45: {
                n4 = 16;
                break;
            }
            case 46: {
                n4 = 37;
                break;
            }
            case 47: {
                n4 = 27;
                break;
            }
            case 48: {
                n4 = 52;
                break;
            }
            case 49: {
                n4 = 55;
                break;
            }
            case 50: {
                n4 = 45;
                break;
            }
            case 51: {
                n4 = 62;
                break;
            }
            case 52: {
                n4 = 11;
                break;
            }
            case 53: {
                n4 = 20;
                break;
            }
            case 54: {
                n4 = 34;
                break;
            }
            case 55: {
                n4 = 25;
                break;
            }
            case 56: {
                n4 = 56;
                break;
            }
            case 57: {
                n4 = 9;
                break;
            }
            case 58: {
                n4 = 14;
                break;
            }
            case 59: {
                n4 = 23;
                break;
            }
            case 60: {
                n4 = 40;
                break;
            }
            case 61: {
                n4 = 32;
                break;
            }
            case 62: {
                n4 = 26;
                break;
            }
            default: {
                n4 = 49;
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
        v6.f[n5] = new String(cArray);
        return n5;
    }

    static void H(v6 v62, Object object, boolean bl2) {
        v62.s(object, bl2);
    }

    private double v(Object object) {
        return this.R.C(object);
    }

    static void Q(v6 v62, Object object, double d2) {
        v62.I(object, d2);
    }

    static double W(v6 v62, Object object) {
        return v62.h(object);
    }

    private float K(Object object) {
        return this.y.x(object);
    }

    private void d(Object object, float f10) {
        this.y.H(object, f10);
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = v6.e(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                v6.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public v6() {
        long l10 = a ^ 0x75BBFA7AB3F2L;
        super(eM.Fm);
        this.k = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)12638, (long)(0x64FC316D4EA6998DL ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, (Object)eM.US, (long)1041891048568292201L, (long)l10);
        this.C = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)30308, (long)(0x505BAE5FBC525EB4L ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Boolean.TYPE, (long)1041891048568292201L, (long)l10);
        this.J = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)2833, (long)(0x26DF94E8774223C4L ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Boolean.TYPE, (long)1041891048568292201L, (long)l10);
        this.D = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)31108, (long)(0x67083ED5280A515AL ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Double.TYPE, (long)1041891048568292201L, (long)l10);
        this.R = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)26471, (long)(0xF8D4B5E23634FB1L ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Double.TYPE, (long)1041891048568292201L, (long)l10);
        ht[] htArray = vZ.J();
        try {
            this.P = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)31826, (long)(0x7AD1C0E22826548DL ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Double.TYPE, (long)1041891048568292201L, (long)l10);
            this.H = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)17385, (long)(0x2E1D9FD1C94AEB34L ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Double.TYPE, (long)1041891048568292201L, (long)l10);
            this.y = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)963, (long)(0x7B63350ADE35AB14L ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Float.TYPE, (long)1041891048568292201L, (long)l10);
            this.w = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)7684, (long)(0x3A36AF4EA1B636D5L ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Float.TYPE, (long)1041891048568292201L, (long)l10);
            this.O = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)14296, (long)(0x80068EF2DF51F04L ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Integer.TYPE, (long)1041891048568292201L, (long)l10);
            this.G = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)1702, (long)(0x21F98D88662FAE72L ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Boolean.TYPE, (long)1041891048568292201L, (long)l10);
            this.I = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)10703, (long)(0x332C3904B2D8117L ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{String.class}, (long)1042014697981970521L, (long)l10);
            this.j = v6.c("\u00a5", (Object)this, (Object)v6.c("t", (int)v6.b("s", (int)15448, (long)(0x252ADAB82CC5948AL ^ l10)), (long)1041597430036314765L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[0], (long)1042014697981970521L, (long)l10);
            if (ht.J() != null) {
                vZ.M(new ht[2]);
            }
        }
        catch (O_ o_2) {
            throw v6.a(o_2);
        }
    }

    static double z(v6 v62, Object object) {
        return v62.v(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/v6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x26A3;
        if (c[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = b[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/v6", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            v6.c[n3] = n4;
        }
        return c[n3];
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = v6.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = v6.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    static double u(v6 v62, Object object) {
        return v62.H(object);
    }

    private void T(Object object, String string) {
        this.I.l(object, string);
    }

    private void I(Object object, double d2) {
        this.D.A(object, d2);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private boolean l(Object object) {
        return this.C.R(object);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = v6.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = v6.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private boolean h(Object object) {
        return this.J.R(object);
    }

    static void C(v6 v62, Object object, int n2) {
        v62.l(object, n2);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(v6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(v6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

