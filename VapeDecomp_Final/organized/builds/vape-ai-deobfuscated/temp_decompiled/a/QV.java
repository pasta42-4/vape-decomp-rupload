/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import a.Hc;
import a.Ib;
import a.O_;
import a.d8;
import a.eM;
import a.ht;
import a.kX;
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

public class qv
extends v2 {
    private static final Object[] h;
    private final Ib j;
    public final HK O;
    private static final String[] i;
    private final Ib A;
    public final HK J;
    public final HK d;
    private static final long[] e;
    private final Ib L;
    public final HK c;
    private static final long a;
    private static final Map g;
    private static String W;
    public final HK B;
    private static final Integer[] f;
    public final HK I;
    public final HK b;
    public final HK z;

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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public Object Q(Object object, int n2, int n3, int n4, int n5, Object object2) {
        return this.b.T(object, n2, n3, n4, n5, object2);
    }

    public Object M(Object object, Object object2, Object object3, Object object4) {
        try {
            if (kX.C() >= 50) {
                return this.O.T(object, object2, object4);
            }
        }
        catch (O_ o_2) {
            throw qv.a(o_2);
        }
        return this.O.T(object, object2, object3, object4);
    }

    public Object X(Object object, int n2, int n3, int n4, Object object2, Object object3) {
        try {
            if (kX.C() >= 37) {
                this.b.l(object, n2, n3, n4, object2, object3);
                return null;
            }
        }
        catch (O_ o_2) {
            throw qv.a(o_2);
        }
        return this.b.T(object, n2, n3, n4, object2, object3);
    }

    private Object y(Object object) {
        return this.j.Z(object);
    }

    private static Method h(long l10, long l11) {
        int n2 = qv.e(l10, l11);
        Object object = h[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n2];
                int n4 = string2.indexOf(8);
                clazz3 = qv.f(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = qv.f(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = qv.c(clazz, string, clazz2, n3, classArray2)) != null) {
                        qv.h[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = qv.f(748596610432264L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = qv.d(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        qv.h[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = qv.f(748596610432264L, 0L);
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

    static void X(qv qv2, Object object, Object object2, Object object3) {
        qv2.D(object, object2, object3);
    }

    private static Field g(long l10, long l11) {
        int n2 = qv.e(l10, l11);
        Object object = h[n2];
        if (object instanceof String) {
            String string = i[n2];
            int n3 = string.indexOf(8);
            Class clazz = qv.f(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = qv.f(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = qv.c(clazz3, string2, clazz2)) != null) {
                    qv.h[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = qv.d(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        qv.h[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = qv.f(748596610432264L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void D(Object object, Object object2, Object object3) {
        this.J.l(object, object2, object3);
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "\u000f\tEp";
        objectArray[1] = "\u0001zZwx\u000b\nuK8\u0005\u0013\u0019rBq";
        objectArray[2] = Boolean.TYPE;
        qv.i[2] = "java/lang/Boolean";
        objectArray[3] = "lB\u0007N\tbgM\u0016\u0001dbgP\u0002";
        objectArray[4] = "\u000f^mT5%z~f[$j\u0017~fF0\u007f";
        objectArray[5] = "ql\u0004-";
        objectArray[6] = "&4AU\u0002$S\u0014JZ\u0013k>\u0014JG\u0007~";
        objectArray[7] = "Su6";
        objectArray[8] = Integer.TYPE;
        qv.i[8] = "java/lang/Integer";
        objectArray[9] = "+3/2";
        objectArray[10] = "\u00074\\\u001eb6\f;MQ\u00038\u00070I\u000b";
        objectArray[11] = "m\u001b^Og=7WN\u007f\u001dX>\u001cKFf'n\u0015\t\u0010Zb?FSO&&n\\Q\u007f`7>D[\u001a<3>Z5C5=y\\N\u0019j5c%\u000e\u00060<|\u0014[\u0013 &\u0007";
        objectArray[12] = "D^\u001bx\u00112\u001e\u0012\u000bHaW\u0014\u000fI)B2H\u000bI7,n\u0017\u001eItS>\u001e\\\u001fH\u0016oM\u0006@4R>W\u0004prCnO\u000e\u0015.GnQ`L'I)W\u001b\u0016xA3.[\t\"H,\u001f\u000e\u001c2RW";
        objectArray[13] = "\u001f\rAr~vEAQB\u0018\u0013L\nT{\u007fl\u001c\u0003\u0016-C)MPLr?m\u001cJNBy|LRD'%xLL*| j\u0010\t@\u007f#vH3";
        Object[] objectArray2 = objectArray;
        objectArray[14] = "\r\u0000w\u0019^[U\fm\u0018b\u000bKi7BY\u000eU\fm\u0018\u000f\u00190P0\u0007[\\O\u00009E\r`";
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = qv.b(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public Object C(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.B.T(object, object2, object3, object4, object5, object6, object7);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    public qv() {
        block70: {
            block65: {
                block68: {
                    block67: {
                        block66: {
                            block64: {
                                block62: {
                                    block61: {
                                        block59: {
                                            block55: {
                                                block58: {
                                                    block56: {
                                                        block57: {
                                                            var1_1 = qv.a ^ 102405233043927L;
                                                            v0 = qv.h();
                                                            super(eM.EJ);
                                                            var3_2 = v0;
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var3_2 == null) break block55;
                                                                                if (kX.C() >= 23) {
                                                                                }
                                                                                ** GOTO lbl51
                                                                            }
                                                                            catch (O_ v1) {
                                                                                throw qv.a(v1);
                                                                            }
                                                                            v2 = this;
                                                                            v3 = this;
                                                                            v4 = qv.c("\u00e4", (int)qv.b("i", (int)7435, (long)(7596427853921535704L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1);
                                                                            v5 = true;
                                                                            v6 = eM.US;
                                                                            if (var3_2 == null) break block56;
                                                                        }
                                                                        catch (O_ v7) {
                                                                            throw qv.a(v7);
                                                                        }
                                                                        v2.j = qv.c("\u00c7", (Object)v3, (Object)v4, (boolean)v5, (Object)v6, (long)-3767226525071675268L, (long)var1_1);
                                                                        if (kX.C() < 37) break block57;
                                                                    }
                                                                    catch (O_ v8) {
                                                                        throw qv.a(v8);
                                                                    }
                                                                    this.b = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)3428, (long)(7515364401251800763L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, eM.VG, eM.UQ}, (long)-3766786148320840384L, (long)var1_1);
                                                                    if (var3_2 != null) break block58;
                                                                }
                                                                catch (O_ v9) {
                                                                    throw qv.a(v9);
                                                                }
                                                                ht.I(new String[3]);
                                                            }
                                                            catch (O_ v10) {
                                                                throw qv.a(v10);
                                                            }
                                                        }
                                                        v2 = this;
                                                        v3 = this;
                                                        v4 = qv.c("\u00e4", (int)qv.b("i", (int)714, (long)(5705946687425730845L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1);
                                                        v5 = true;
                                                        v6 = eM.Vl;
                                                    }
                                                    v2.b = qv.c("\u00c7", (Object)v3, (Object)v4, (boolean)v5, (Object)v6, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, eM.VG, eM.UQ}, (long)-3766786148320840384L, (long)var1_1);
                                                }
                                                try {
                                                    this.O = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)10821, (long)(5480975762265272721L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, (Object)eM.FO, (Object)new Class[]{eM.UQ, eM.EV, eM.F7}, (long)-3766786148320840384L, (long)var1_1);
                                                    if (var3_2 != null) break block59;
lbl51:
                                                    // 2 sources

                                                    this.j = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)26159, (long)(5284175408429710846L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, (Object)eM.US, (long)-3767226525071675268L, (long)var1_1);
                                                    this.b = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)6409, (long)(1923178806367896272L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, (Object)eM.Vl, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, eM.UQ}, (long)-3766786148320840384L, (long)var1_1);
                                                }
                                                catch (O_ v11) {
                                                    throw qv.a(v11);
                                                }
                                            }
                                            this.O = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)262, (long)(9042067919985498838L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{eM.UQ, eM.EV, eM.Vl}, (long)-3766786148320840384L, (long)var1_1);
                                        }
                                        try {
                                            block60: {
                                                try {
                                                    if (kX.C() < 35) break block60;
                                                    this.c = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)22873, (long)(8622529354631217816L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-3766786148320840384L, (long)var1_1);
                                                    if (var3_2 != null) break block61;
                                                }
                                                catch (O_ v12) {
                                                    throw qv.a(v12);
                                                }
                                            }
                                            this.c = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)12722, (long)(1576746173807618671L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-3766786148320840384L, (long)var1_1);
                                        }
                                        catch (O_ v13) {
                                            throw qv.a(v13);
                                        }
                                    }
                                    try {
                                        block63: {
                                            try {
                                                try {
                                                    this.A = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)4736, (long)(4559973643167779158L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Boolean.TYPE, (long)-3767226525071675268L, (long)var1_1);
                                                    v14 = this;
                                                    v15 = this;
                                                    v16 = qv.c("\u00e4", (int)qv.b("i", (int)31445, (long)(902635540563370261L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1);
                                                    v17 = true;
                                                    v18 = Float.TYPE;
                                                    if (var3_2 == null) break block62;
                                                    v14.L = qv.c("\u00c7", (Object)v15, (Object)v16, (boolean)v17, v18, (long)-3767226525071675268L, (long)var1_1);
                                                    if (kX.C() < 50) break block63;
                                                }
                                                catch (O_ v19) {
                                                    throw qv.a(v19);
                                                }
                                                this.z = qv.c("\u00c7", (Object)this, (Object)eM.UQ, (Object)qv.c("\u00e4", (int)qv.b("i", (int)27512, (long)(4339699947277594788L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Double.TYPE, (Object)new Class[0], (long)-3767172012826527066L, (long)var1_1);
                                                if (var3_2 != null) break block64;
                                            }
                                            catch (O_ v20) {
                                                throw qv.a(v20);
                                            }
                                        }
                                        v14 = this;
                                        v15 = this;
                                        v16 = qv.c("\u00e4", (int)qv.b("i", (int)8020, (long)(2638298748353135756L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1);
                                        v17 = true;
                                        v18 = Float.TYPE;
                                    }
                                    catch (O_ v21) {
                                        throw qv.a(v21);
                                    }
                                }
                                v14.z = qv.c("\u00c7", (Object)v15, (Object)v16, (boolean)v17, v18, (Object)new Class[0], (long)-3766786148320840384L, (long)var1_1);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            this.J = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)674, (long)(3453908921441737079L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.UQ, eM.PE}, (long)-3766786148320840384L, (long)var1_1);
                                            this.I = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)12206, (long)(5031274529932670068L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[0], (long)-3766786148320840384L, (long)var1_1);
                                            v22 = this;
                                            v23 = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)18662, (long)(7397490223245792034L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Void.TYPE, (Object)new Class[]{eM.UQ}, (long)-3766786148320840384L, (long)var1_1);
                                            if (var3_2 == null) break block65;
                                            v22.d = v23;
                                            if (kX.C() > 13) {
                                            }
                                            ** GOTO lbl198
                                        }
                                        catch (O_ v24) {
                                            throw qv.a(v24);
                                        }
                                        v25 = kX.C();
                                        v26 = 23;
                                        if (var3_2 == null) break block66;
                                    }
                                    catch (O_ v27) {
                                        throw qv.a(v27);
                                    }
                                    if (v25 >= v26) {
                                    }
                                    ** GOTO lbl193
                                }
                                catch (O_ v28) {
                                    throw qv.a(v28);
                                }
                                v25 = kX.C();
                                v26 = 35;
                            }
                            catch (O_ v29) {
                                throw qv.a(v29);
                            }
                        }
                        try {
                            try {
                                if (var3_2 == null) break block67;
                                if (v25 >= v26) {
                                }
                                ** GOTO lbl188
                            }
                            catch (O_ v30) {
                                throw qv.a(v30);
                            }
                            v25 = kX.C();
                            v26 = 37;
                        }
                        catch (O_ v31) {
                            throw qv.a(v31);
                        }
                    }
                    try {
                        try {
                            if (var3_2 == null) break block68;
                            if (v25 >= v26) {
                            }
                            ** GOTO lbl183
                        }
                        catch (O_ v32) {
                            throw qv.a(v32);
                        }
                        v25 = kX.C();
                        v26 = 50;
                    }
                    catch (O_ v33) {
                        throw qv.a(v33);
                    }
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    block69: {
                                        try {
                                            if (v25 < v26) break block69;
                                            this.B = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)20460, (long)(8029086715563185194L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, (Object)eM.FO, (Object)new Class[]{eM.rl, eM.F7, eM.d}, (long)-3766786148320840384L, (long)var1_1);
                                            if (var3_2 != null) break block70;
                                        }
                                        catch (O_ v34) {
                                            throw qv.a(v34);
                                        }
                                    }
                                    this.B = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)16830, (long)(4660083759873104480L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, (Object)eM.FO, (Object)new Class[]{eM.rl, eM.Et, eM.F7, eM.d}, (long)-3766786148320840384L, (long)var1_1);
                                    if (var3_2 != null) break block70;
                                }
                                catch (O_ v35) {
                                    throw qv.a(v35);
                                }
lbl183:
                                // 2 sources

                                this.B = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)6228, (long)(932588508940157830L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)Hc.z, (Object)eM.FO, (Object)new Class[]{eM.rl, eM.Et, eM.F7, eM.d}, (long)-3766786148320840384L, (long)var1_1);
                                if (var3_2 != null) break block70;
                            }
                            catch (O_ v36) {
                                throw qv.a(v36);
                            }
lbl188:
                            // 2 sources

                            this.B = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)31489, (long)(195937408683155674L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, (Object)eM.FO, (Object)new Class[]{eM.rl, eM.Et, eM.P2, eM.Pb, eM.YN, eM.F7}, (long)-3766786148320840384L, (long)var1_1);
                            if (var3_2 != null) break block70;
                        }
                        catch (O_ v37) {
                            throw qv.a(v37);
                        }
lbl193:
                        // 2 sources

                        this.B = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)32405, (long)(7135335875398444368L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{eM.rl, eM.Et, eM.Vl, eM.P2, eM.Pb, eM.YN}, (long)-3766786148320840384L, (long)var1_1);
                        if (var3_2 != null) break block70;
                    }
                    catch (O_ v38) {
                        throw qv.a(v38);
                    }
lbl198:
                    // 2 sources

                    v22 = this;
                    v23 = qv.c("\u00c7", (Object)this, (Object)qv.c("\u00e4", (int)qv.b("i", (int)19716, (long)(4180287452240680643L ^ var1_1)), (long)-3767043967498533600L, (long)var1_1), (boolean)true, Boolean.TYPE, (Object)new Class[]{eM.UQ, eM.EV, eM.Vl, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, eM.YN}, (long)-3766786148320840384L, (long)var1_1);
                }
                catch (O_ v39) {
                    throw qv.a(v39);
                }
            }
            v22.B = v23;
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/qv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean i(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return this.B.V(object, object2, object3, object4, object5, object6, object7);
    }

    public void w(Object object) {
        this.c.V(object);
    }

    public boolean n(Object object, Object object2, Object object3, Object object4, int n2, int n3, int n4, int n5, Object object5) {
        return this.B.V(object, object2, object3, object4, n2, n3, n4, n5, object5);
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = qv.b(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    static void l(qv qv2, Object object) {
        qv2.S(object);
    }

    private static int b(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x106E;
        if (f[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = e[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/qv", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            qv.f[n3] = n4;
        }
        return f[n3];
    }

    static Object J(qv qv2, Object object) {
        return qv2.y(object);
    }

    public float L(Object object) {
        try {
            if (kX.C() >= 50) {
                return (float)this.z.s(object, new Object[0]);
            }
        }
        catch (O_ o_2) {
            throw qv.a(o_2);
        }
        return this.z.p(object, new Object[0]);
    }

    public void O(Object object, Object object2) {
        this.d.l(object, object2);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = qv.c(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = qv.d(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class f(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = qv.e(l10, l11);
            object = h[n2];
            try {
                if (!(object instanceof String)) break block2;
                qv.h[n2] = clazz = Class.forName(i[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static void M(String string) {
        W = string;
    }

    private boolean H(Object object) {
        return this.A.R(object);
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = qv.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = qv.d(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                qv.a = d8.a(267052701993269231L, -5813528311680101293L, MethodHandles.lookup().lookupClass()).a(6988253334694L);
                qv.h = new Object[15];
                qv.i = new String[15];
                qv.a();
                qv.g = new HashMap<K, V>(13);
                qv.M("mCuGjb");
                var0 = qv.a ^ 99355400372772L;
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
                var8_3 = new long[22];
                var5_4 = 0;
                var6_5 = "Z\u0094\u00fe'5<\u00c3\u00c3\u00ab\u00e8\u00cf\u0097\u00a9K\u001e\u00a9\f\u00deG\u00c1\u00ba\u00deX\u00a3\u0012\u0017\u00e8\u00ea\u0007+\r+\u001a\u00afWmB\u00e0_\\\u0089#c\u008dJ\u00feX\u0080\u0085\u00bf\u00d3w\u00a1:\u001e\f\u00047(v\u00e5<\u001d\u0083+&.t\u00d0_\u00c5\u00ec;W?j'\u0081\u00b9\"\u00f5\u0013\u001d\u0004C\u00e1\u00f1\u00c65\u001b\u001dn\u0088\u00f8\u0010\u0085\u00dbx\u00ef\u009b\u0017\u00d3\u00b5\u00ff\u00d9\u00e5M\u0098\u00ac\u00ed,a\u00cbm\u00f8\u001d:H\u0000\u00be\u00da\u0081n \u0081\u00c9\u00b4\u00acS1\u00b8\u00b5\u000f\u00ab\u007f\u00d18\u00d1\u0090\u0000\u001c\u0091N\u00be\u00c4\u00ae5q\u00dd\u008a[_\u00cc\u0004\u00b3\u00b9]\u00fa\u00b5\u00d5";
                var7_6 = "Z\u0094\u00fe'5<\u00c3\u00c3\u00ab\u00e8\u00cf\u0097\u00a9K\u001e\u00a9\f\u00deG\u00c1\u00ba\u00deX\u00a3\u0012\u0017\u00e8\u00ea\u0007+\r+\u001a\u00afWmB\u00e0_\\\u0089#c\u008dJ\u00feX\u0080\u0085\u00bf\u00d3w\u00a1:\u001e\f\u00047(v\u00e5<\u001d\u0083+&.t\u00d0_\u00c5\u00ec;W?j'\u0081\u00b9\"\u00f5\u0013\u001d\u0004C\u00e1\u00f1\u00c65\u001b\u001dn\u0088\u00f8\u0010\u0085\u00dbx\u00ef\u009b\u0017\u00d3\u00b5\u00ff\u00d9\u00e5M\u0098\u00ac\u00ed,a\u00cbm\u00f8\u001d:H\u0000\u00be\u00da\u0081n \u0081\u00c9\u00b4\u00acS1\u00b8\u00b5\u000f\u00ab\u007f\u00d18\u00d1\u0090\u0000\u001c\u0091N\u00be\u00c4\u00ae5q\u00dd\u008a[_\u00cc\u0004\u00b3\u00b9]\u00fa\u00b5\u00d5".length();
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
                    var6_5 = "\u008b\u00e4\u00f7u/v\u0086\u00b0\u00dbO\u0097d\u00fbI\u00d5\u00de";
                    var7_6 = "\u008b\u00e4\u00f7u/v\u0086\u00b0\u00dbO\u0097d\u00fbI\u00d5\u00de".length();
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
        qv.e = var8_3;
        qv.f = new Integer[22];
    }

    public boolean o(Object object, Object object2, Object object3, Object object4) {
        return this.O.V(object, object2, object3, object4);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'W' || c10 == '\u00fe' || c10 == 'p' || c10 == 'D') {
                field = qv.g(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'W' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00fe' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'p' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = qv.h(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00c7' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    static float L(qv qv2, Object object) {
        return qv2.D(object);
    }

    private float D(Object object) {
        return this.L.x(object);
    }

    private static int e(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (i[n5] != null) {
            return n5;
        }
        Object object = h[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 45;
                break;
            }
            case 1: {
                n4 = 25;
                break;
            }
            case 2: {
                n4 = 36;
                break;
            }
            case 3: {
                n4 = 7;
                break;
            }
            case 4: {
                n4 = 3;
                break;
            }
            case 5: {
                n4 = 21;
                break;
            }
            case 6: {
                n4 = 33;
                break;
            }
            case 7: {
                n4 = 39;
                break;
            }
            case 8: {
                n4 = 2;
                break;
            }
            case 9: {
                n4 = 34;
                break;
            }
            case 10: {
                n4 = 53;
                break;
            }
            case 11: {
                n4 = 42;
                break;
            }
            case 12: {
                n4 = 22;
                break;
            }
            case 13: {
                n4 = 62;
                break;
            }
            case 14: {
                n4 = 63;
                break;
            }
            case 15: {
                n4 = 11;
                break;
            }
            case 16: {
                n4 = 60;
                break;
            }
            case 17: {
                n4 = 10;
                break;
            }
            case 18: {
                n4 = 56;
                break;
            }
            case 19: {
                n4 = 29;
                break;
            }
            case 20: {
                n4 = 40;
                break;
            }
            case 21: {
                n4 = 55;
                break;
            }
            case 22: {
                n4 = 4;
                break;
            }
            case 23: {
                n4 = 35;
                break;
            }
            case 24: {
                n4 = 57;
                break;
            }
            case 25: {
                n4 = 23;
                break;
            }
            case 26: {
                n4 = 38;
                break;
            }
            case 27: {
                n4 = 14;
                break;
            }
            case 28: {
                n4 = 28;
                break;
            }
            case 29: {
                n4 = 41;
                break;
            }
            case 30: {
                n4 = 44;
                break;
            }
            case 31: {
                n4 = 31;
                break;
            }
            case 32: {
                n4 = 6;
                break;
            }
            case 33: {
                n4 = 17;
                break;
            }
            case 34: {
                n4 = 0;
                break;
            }
            case 35: {
                n4 = 59;
                break;
            }
            case 36: {
                n4 = 48;
                break;
            }
            case 37: {
                n4 = 52;
                break;
            }
            case 38: {
                n4 = 12;
                break;
            }
            case 39: {
                n4 = 8;
                break;
            }
            case 40: {
                n4 = 51;
                break;
            }
            case 41: {
                n4 = 16;
                break;
            }
            case 42: {
                n4 = 46;
                break;
            }
            case 43: {
                n4 = 19;
                break;
            }
            case 44: {
                n4 = 24;
                break;
            }
            case 45: {
                n4 = 58;
                break;
            }
            case 46: {
                n4 = 32;
                break;
            }
            case 47: {
                n4 = 47;
                break;
            }
            case 48: {
                n4 = 37;
                break;
            }
            case 49: {
                n4 = 20;
                break;
            }
            case 50: {
                n4 = 43;
                break;
            }
            case 51: {
                n4 = 13;
                break;
            }
            case 52: {
                n4 = 50;
                break;
            }
            case 53: {
                n4 = 30;
                break;
            }
            case 54: {
                n4 = 18;
                break;
            }
            case 55: {
                n4 = 27;
                break;
            }
            case 56: {
                n4 = 54;
                break;
            }
            case 57: {
                n4 = 61;
                break;
            }
            case 58: {
                n4 = 5;
                break;
            }
            case 59: {
                n4 = 9;
                break;
            }
            case 60: {
                n4 = 15;
                break;
            }
            case 61: {
                n4 = 1;
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
        qv.i[n5] = new String(cArray);
        return n5;
    }

    public static String h() {
        return W;
    }

    private void S(Object object) {
        this.I.V(object);
    }

    public Object A(Object object, Object object2, Object object3, Object object4, Object object5) {
        try {
            if (kX.C() >= 50) {
                return this.B.T(object, object2, object4, object5);
            }
        }
        catch (O_ o_2) {
            throw qv.a(o_2);
        }
        return this.B.T(object, object2, object3, object4, object5);
    }

    static boolean E(qv qv2, Object object) {
        return qv2.H(object);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(qv.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(qv.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

