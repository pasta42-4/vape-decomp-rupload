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
import a.kX;
import a.qB;
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class qb
extends v2 {
    private HK g;
    private static final Integer[] d;
    private Ib r;
    private Ib A;
    private static final long[] c;
    private static final Map e;
    private static final long a;
    private HK v;
    private HK h;
    private HK S;
    private HK b;
    private HK s;
    private HK f;
    private HK n;
    private static final Object[] i;
    private HK J;
    private static final String[] j;

    static void w(qb qb2, Object object, Object object2, Object object3, Object object4, int n2, int n3) {
        qb2.e(object, object2, object3, object4, n2, n3);
    }

    private void g(Object object, Object object2, Object object3, int n2, int n3, int[] nArray, Object object4, Object object5, Object object6) {
        this.n.l(null, object, object2, object3, n2, n3, nArray, object4, object5, object6);
    }

    private float C(Object object) {
        return this.A.x(object);
    }

    static void t(qb qb2, Object object, float f10) {
        qb2.N(object, f10);
    }

    private Object x(Object object, Object object2, Object object3, Object object4, int n2) {
        return this.S.T(object, object2, object3, object4, n2);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    static void D(qb qb2, Object object, float f10) {
        qb2.B(object, f10);
    }

    private void h(Object object, Object object2, Object object3, Object object4, int n2, int n3) {
        this.J.l(object, object2, object3, object4, n2, n3);
    }

    private Object s() {
        return this.f.T(null, new Object[0]);
    }

    static HK W(qb qb2) {
        return qb2.v;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private void q(Object object, Object object2, int n2, int n3) {
        this.g.l(object, object2, n2, n3);
    }

    static void t(qb qb2, Object object, Object object2, int n2, int n3) {
        qb2.q(object, object2, n2, n3);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qb.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = qb.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x5487;
        if (d[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = c[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/qb", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qb.d[n3] = n4;
        }
        return d[n3];
    }

    private void e(Object object, Object object2, Object object3, Object object4, int n2, int n3) {
        this.b.l(object, object2, object3, object4, n2, n3);
    }

    private void c(Object object, Object object2, Object object3, int n2, int n3) {
        this.s.l(object, object2, object3, n2, n3);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00fd' || c10 == '\u00c4' || c10 == 'e' || c10 == '\u00f6') {
                field = qb.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00fd' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c4' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'e' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qb.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c5' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void N(Object object, float f10) {
        this.r.H(object, f10);
    }

    private static Method h(long l10, long l11) {
        int n2 = qb.e(l10, l11);
        Object object = i[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n2];
                int n4 = string2.indexOf(8);
                clazz3 = qb.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = qb.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qb.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        qb.i[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qb.f(782512926940105L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = qb.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        qb.i[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qb.f(782512926940105L, 0L);
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

    static Object P(qb qb2, Object object, Object object2, Object object3, Object object4, int n2) {
        return qb2.x(object, object2, object3, object4, n2);
    }

    static void G(qb qb2, Object object, Object object2, Object object3, int n2, int n3) {
        qb2.c(object, object2, object3, n2, n3);
    }

    static HK l(qb qb2) {
        return qb2.f;
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (j[n5] != null) {
            return n5;
        }
        Object object = i[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 20;
                break;
            }
            case 1: {
                n4 = 1;
                break;
            }
            case 2: {
                n4 = 18;
                break;
            }
            case 3: {
                n4 = 11;
                break;
            }
            case 4: {
                n4 = 6;
                break;
            }
            case 5: {
                n4 = 41;
                break;
            }
            case 6: {
                n4 = 0;
                break;
            }
            case 7: {
                n4 = 59;
                break;
            }
            case 8: {
                n4 = 39;
                break;
            }
            case 9: {
                n4 = 13;
                break;
            }
            case 10: {
                n4 = 45;
                break;
            }
            case 11: {
                n4 = 2;
                break;
            }
            case 12: {
                n4 = 38;
                break;
            }
            case 13: {
                n4 = 42;
                break;
            }
            case 14: {
                n4 = 56;
                break;
            }
            case 15: {
                n4 = 15;
                break;
            }
            case 16: {
                n4 = 52;
                break;
            }
            case 17: {
                n4 = 53;
                break;
            }
            case 18: {
                n4 = 35;
                break;
            }
            case 19: {
                n4 = 19;
                break;
            }
            case 20: {
                n4 = 34;
                break;
            }
            case 21: {
                n4 = 58;
                break;
            }
            case 22: {
                n4 = 46;
                break;
            }
            case 23: {
                n4 = 50;
                break;
            }
            case 24: {
                n4 = 22;
                break;
            }
            case 25: {
                n4 = 48;
                break;
            }
            case 26: {
                n4 = 21;
                break;
            }
            case 27: {
                n4 = 5;
                break;
            }
            case 28: {
                n4 = 26;
                break;
            }
            case 29: {
                n4 = 49;
                break;
            }
            case 30: {
                n4 = 14;
                break;
            }
            case 31: {
                n4 = 37;
                break;
            }
            case 32: {
                n4 = 43;
                break;
            }
            case 33: {
                n4 = 62;
                break;
            }
            case 34: {
                n4 = 4;
                break;
            }
            case 35: {
                n4 = 51;
                break;
            }
            case 36: {
                n4 = 61;
                break;
            }
            case 37: {
                n4 = 55;
                break;
            }
            case 38: {
                n4 = 47;
                break;
            }
            case 39: {
                n4 = 40;
                break;
            }
            case 40: {
                n4 = 17;
                break;
            }
            case 41: {
                n4 = 30;
                break;
            }
            case 42: {
                n4 = 16;
                break;
            }
            case 43: {
                n4 = 57;
                break;
            }
            case 44: {
                n4 = 32;
                break;
            }
            case 45: {
                n4 = 25;
                break;
            }
            case 46: {
                n4 = 33;
                break;
            }
            case 47: {
                n4 = 31;
                break;
            }
            case 48: {
                n4 = 10;
                break;
            }
            case 49: {
                n4 = 27;
                break;
            }
            case 50: {
                n4 = 54;
                break;
            }
            case 51: {
                n4 = 60;
                break;
            }
            case 52: {
                n4 = 3;
                break;
            }
            case 53: {
                n4 = 8;
                break;
            }
            case 54: {
                n4 = 44;
                break;
            }
            case 55: {
                n4 = 28;
                break;
            }
            case 56: {
                n4 = 9;
                break;
            }
            case 57: {
                n4 = 12;
                break;
            }
            case 58: {
                n4 = 36;
                break;
            }
            case 59: {
                n4 = 29;
                break;
            }
            case 60: {
                n4 = 24;
                break;
            }
            case 61: {
                n4 = 23;
                break;
            }
            case 62: {
                n4 = 63;
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
        qb.j[n5] = new String(cArray);
        return n5;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = qb.e(l10, l11);
            object = i[n2];
            try {
                if (!(object instanceof String)) break block2;
                qb.i[n2] = clazz = Class.forName(j[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
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
        int n3 = qb.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
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

    static void i(qb qb2, Object object, Object object2, Object object3, boolean bl2, Object object4, Object object5, int n2, int n3, Object object6) {
        qb2.G(object, object2, object3, bl2, object4, object5, n2, n3, object6);
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "Vy\u0014\u000e";
        objectArray[1] = "q[tF|.zTe\t\u00016iSl@";
        objectArray[2] = Boolean.TYPE;
        qb.j[2] = "java/lang/Boolean";
        objectArray[3] = "\u0000\u0017GEIO\u000b\u0018V\n$O\u000b\u0005B";
        objectArray[4] = "J(_C<.?\bTL-aR\bTQ9t";
        objectArray[5] = "\u0007V\u000f~";
        objectArray[6] = "e\u001fa;c\u0013\u0010?j4r\\}?j)fI";
        objectArray[7] = "-po";
        objectArray[8] = Integer.TYPE;
        qb.j[8] = "java/lang/Integer";
        objectArray[9] = "(\\Lu";
        objectArray[10] = "^U\u000bp]~+u\u0000\u007fL1Fu\u0000bX$";
        objectArray[11] = "1\u0015;q2B:\u001a*>SL1\u0011.d";
        objectArray[12] = "JEC\u001b8=[\u0017Ab\u0018\u0002QW\r\\'gFL[bfoJ\u0010\u0006\u0001\"s\u0010P<X`p\u001d\u001d\f\u00039<G,\u0003X$}\u001fI_\u000e?\u007f!\u0017E\b?|AG\u0006^!\u0002";
        objectArray[13] = "A\u000e\u0011N%qP\\\u00137\u000fN\u0010X\u001c\u000bs~K\u0001PQB>QVPO')J\u0000n\u000e/%\u0016]\rJ3\u007fVgT\b0r\u001bW\u000fQ|(*XTL=pO\u0004\u0002W?N\u0011\u001e\u0004W<.A]RIB";
        objectArray[14] = "n\u0014R$z`\u007fFP]F_u\u0006\u001cce:b\u001dJ]$2nA\u0017>`.4\u0001-g\"-9L\u001d<{ac}\u00137yo\u007f\u0017T!x%\u0005";
        objectArray[15] = "\u0006I\\n6R\u0017\u001b^\u0017\fm\u001d[\u0012))\b\n@D\u0017h\u0000\u0006\u001c\u0019t,\u001c\\\\#-n\u001fQ\u0011\u0013v7S\u000b \u001c-*\u0012SE@{1\u0010m\u001bZ}1\u0013\rK\u0019+/m";
        Object[] objectArray2 = objectArray;
        objectArray[16] = "l\b0yho(G'\u007f\u0005t*6u#zq7O:si{QF0/;g4Q+y\u0005";
    }

    static float I(qb qb2, Object object) {
        return qb2.C(object);
    }

    static Object z(qb qb2) {
        return qb2.s();
    }

    public qb() {
        long l10;
        block21: {
            int n2;
            int n3;
            int[] nArray;
            block17: {
                block18: {
                    block19: {
                        block20: {
                            l10 = a ^ 0x4B97EDE04155L;
                            int[] nArray2 = qB.s();
                            super(eM.Vp);
                            nArray = nArray2;
                            try {
                                try {
                                    try {
                                        try {
                                            n3 = kX.C();
                                            n2 = 13;
                                            if (nArray != null) break block17;
                                            if (n3 != n2) break block18;
                                        }
                                        catch (O_ o_2) {
                                            throw qb.a(o_2);
                                        }
                                        this.v = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)19366, (long)(0x6F7F9D6A28FCDD9AL ^ l10)), (long)4809565008899638691L, (long)l10), (boolean)false, Void.TYPE, (Object)new Class[0], (long)4807647215493071375L, (long)l10);
                                        if (nArray != null) break block19;
                                    }
                                    catch (O_ o_3) {
                                        throw qb.a(o_3);
                                    }
                                    if (Hc.U.r()) break block20;
                                }
                                catch (O_ o_4) {
                                    throw qb.a(o_4);
                                }
                                this.f = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)5082, (long)(0x45EC824DC17505E1L ^ l10)), (long)4809565008899638691L, (long)l10), (boolean)false, (Object)eM.Vp, (Object)new Class[0], (long)4807861824851851846L, (long)l10);
                            }
                            catch (O_ o_5) {
                                throw qb.a(o_5);
                            }
                        }
                        this.J = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)8455, (long)(0x5F781DAE4F853733L ^ l10)), (long)4809565008899638691L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.ts, eM.Em, eM.Vl, Integer.TYPE, Integer.TYPE}, (long)4807647215493071375L, (long)l10);
                        this.b = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)8378, (long)(0x2B9C63512A7F3683L ^ l10)), (long)4809565008899638691L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.ts, eM.Em, eM.Vl, Integer.TYPE, Integer.TYPE}, (long)4807647215493071375L, (long)l10);
                    }
                    try {
                        if (nArray == null) break block21;
                        ht.I(new String[2]);
                    }
                    catch (O_ o_6) {
                        throw qb.a(o_6);
                    }
                }
                n3 = kX.C();
                n2 = 50;
            }
            try {
                block22: {
                    try {
                        if (n3 < n2) break block22;
                        this.g = qb.c("\u00c5", (Object)this, (Object)eM.F0, (Object)qb.c("\u00da", (int)qb.b("l", (int)20218, (long)(0x1ADC3D988988D8C7L ^ l10)), (long)4809565008899638691L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.Vl, Integer.TYPE, Integer.TYPE}, (long)4807709184850683248L, (long)l10);
                        this.s = qb.c("\u00c5", (Object)this, (Object)eM.F0, (Object)qb.c("\u00da", (int)qb.b("l", (int)29072, (long)(0x4F7B3BBF41AB67AAL ^ l10)), (long)4809565008899638691L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.ts, eM.Vl, Integer.TYPE, Integer.TYPE}, (long)4807709184850683248L, (long)l10);
                        if (nArray == null) break block21;
                    }
                    catch (O_ o_7) {
                        throw qb.a(o_7);
                    }
                }
                this.g = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)22233, (long)(0x38ED7F458F5340E7L ^ l10)), (long)4809565008899638691L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.Vl, Integer.TYPE, Integer.TYPE}, (long)4807647215493071375L, (long)l10);
                this.s = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)8979, (long)(0x5FDAF892D174352BL ^ l10)), (long)4809565008899638691L, (long)l10), (boolean)true, Void.TYPE, (Object)new Class[]{eM.ts, eM.Vl, Integer.TYPE, Integer.TYPE}, (long)4807647215493071375L, (long)l10);
            }
            catch (O_ o_8) {
                throw qb.a(o_8);
            }
        }
        try {
            if (Na.MC_1_20_6.Q()) {
                this.r = qb.c("\u00c5", (Object)this, (Object)qb.c("\u00da", (int)qb.b("l", (int)23993, (long)(0x7B7CCFEB1A344B86L ^ l10)), (long)4809565008899638691L, (long)l10), (boolean)true, Float.TYPE, (long)4807797480874072269L, (long)l10);
            }
        }
        catch (O_ o_9) {
            throw qb.a(o_9);
        }
    }

    static void V(qb qb2, Object object, Object object2, Object object3, Object object4, int n2, int n3) {
        qb2.h(object, object2, object3, object4, n2, n3);
    }

    private float w(Object object) {
        return this.r.x(object);
    }

    private void G(Object object, Object object2, Object object3, boolean bl2, Object object4, Object object5, int n2, int n3, Object object6) {
        this.h.l(object, object2, object3, bl2, object4, object5, n2, n3, object6);
    }

    private static Field g(long l10, long l11) {
        int n2 = qb.e(l10, l11);
        Object object = i[n2];
        if (object instanceof String) {
            String string = j[n2];
            int n3 = string.indexOf(8);
            Class clazz = qb.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = qb.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qb.c(clazz3, string2, clazz2)) != null) {
                    qb.i[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = qb.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        qb.i[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qb.f(782512926940105L, 0L);
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
    static {
        block9: {
            block8: {
                qb.a = d8.a(5964535205844862793L, -7643446517010510338L, MethodHandles.lookup().lookupClass()).a(51722031200431L);
                qb.i = new Object[17];
                qb.j = new String[17];
                qb.a();
                qb.e = new HashMap<K, V>(13);
                var0 = qb.a ^ 132092999783122L;
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
                var8_3 = new long[9];
                var5_4 = 0;
                var6_5 = "\u00d5k\u00cd\u00a5O\u00cf\u0014\u00c7A\u00e3\u00f94\u00b7\u00d5L\u00ea\u0016\u00147\b3\u00cb\u00d1w\u0004 \u00af\u0006\u008e&\u00d8\u00da\u0093!\u00c5\u00fa\u0082\u00d0}7E\u00ff\u00c4|?\u00cf\u00a9\u009d\u00a0\u00e7Qf\u00d3\u00df\u001cF";
                var7_6 = "\u00d5k\u00cd\u00a5O\u00cf\u0014\u00c7A\u00e3\u00f94\u00b7\u00d5L\u00ea\u0016\u00147\b3\u00cb\u00d1w\u0004 \u00af\u0006\u008e&\u00d8\u00da\u0093!\u00c5\u00fa\u0082\u00d0}7E\u00ff\u00c4|?\u00cf\u00a9\u009d\u00a0\u00e7Qf\u00d3\u00df\u001cF".length();
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
                    var6_5 = "\u00ccjO#\u00d6\u00ea\u00a2\u00de{'o\u009e\u00b6\u00b55\u00b0";
                    var7_6 = "\u00ccjO#\u00d6\u00ea\u00a2\u00de{'o\u009e\u00b6\u00b55\u00b0".length();
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
        qb.c = var8_3;
        qb.d = new Integer[9];
    }

    private void B(Object object, float f10) {
        this.A.H(object, f10);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = qb.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = qb.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    static float R(qb qb2, Object object) {
        return qb2.w(object);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = qb.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(qb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

