/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.EP;
import a.FI;
import a.OY;
import a.O_;
import a.Oq;
import a.Qg;
import a.SE;
import a.VG;
import a.Vt;
import a.a;
import a.cp;
import a.d8;
import a.eM;
import a.jU;
import a.jx;
import a.pa;
import a.pj;
import a.xi;
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

public class xy
extends xi {
    private static final Map h;
    private final jU B;
    private static final Object[] j;
    private static final long b;
    private boolean o;
    private static final String[] l;
    private final cp G;
    private static final long[] d;
    private static final Integer[] e;

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2D44;
        if (e[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = d[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/xy", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xy.e[n3] = n4;
        }
        return e[n3];
    }

    @Override
    public boolean j() {
        return true;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method a(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = xy.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = xy.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = xy.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                xy.b = d8.a(6589894716398145455L, 3119890379658806874L, MethodHandles.lookup().lookupClass()).a(249209776719103L);
                xy.j = new Object[5];
                xy.l = new String[5];
                xy.a();
                xy.h = new HashMap<K, V>(13);
                var0 = xy.b ^ 88987386787565L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "T\u00c8E\u00d7\u00b0\u0097\u00cb\u00da\u00e2\u0015H\u00e6\u008a_\u0018\u00e5\u008f\u0097X\u008cg\u00a1M\u00f5r\u00d1\u00f6P\u009e\u00b4B\u0094P\u0000\u00f0b\u00e5\u001e\u001f\u00cd\u0010\u009c\u00cd\u00d6\u009ey3\u00fd";
                var7_6 = "T\u00c8E\u00d7\u00b0\u0097\u00cb\u00da\u00e2\u0015H\u00e6\u008a_\u0018\u00e5\u008f\u0097X\u008cg\u00a1M\u00f5r\u00d1\u00f6P\u009e\u00b4B\u0094P\u0000\u00f0b\u00e5\u001e\u001f\u00cd\u0010\u009c\u00cd\u00d6\u009ey3\u00fd".length();
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
                    var6_5 = "\u00edF\n\u0003\u00e4\u00bc*\u00b6\u00c2\t\u00car\u00ce?q\u00fb";
                    var7_6 = "\u00edF\n\u0003\u00e4\u00bc*\u00b6\u00c2\t\u00car\u00ce?q\u00fb".length();
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
        xy.d = var8_3;
        xy.e = new Integer[8];
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "8oJ";
        objectArray[1] = Integer.TYPE;
        xy.l[1] = "java/lang/Integer";
        objectArray[2] = "G5#\u000b&\bL:2D[\u0010_=;\r";
        objectArray[3] = "0P\u007f\u0019U;;_nV450Tj\f";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "X\\$\u0011(r\u0001[-(/y1R'M(mMO`VD;P\u0018`M\u007f<\u0001\u001c<(";
    }

    public xy() {
        long l10 = b ^ 0x6BC3A2AA06D5L;
        super(a.cs((int)xy.a("o", (int)16456, (long)(0x1D1CBEB99149FA80L ^ l10))), (int)xy.a("o", (int)25549, (long)(0x186010A0748A5906L ^ l10)), Oq.P, a.cs((int)xy.a("o", (int)4065, (long)(0x6A6DBF07660FB52EL ^ l10))));
        this.B = jU.R(this, (String)((Object)xy.c("t", (int)xy.a("o", (int)26820, (long)(0x6541ECD612A4D20EL ^ l10)), (long)1695743826361444404L, (long)l10)), false, (String)((Object)xy.c("t", (int)xy.a("o", (int)12273, (long)(0x739FA06FD351953CL ^ l10)), (long)1695743826361444404L, (long)l10)));
        this.G = cp.r(this, (String)((Object)xy.c("t", (int)xy.a("o", (int)28219, (long)(0x50777A547D20D4F5L ^ l10)), (long)1695743826361444404L, (long)l10)), (String)((Object)xy.c("t", (int)xy.a("o", (int)6991, (long)(0x46DF277A1F692183L ^ l10)), (long)1695743826361444404L, (long)l10)), cp.U, new FI((String)((Object)xy.c("t", (int)xy.a("o", (int)15821, (long)(0x7770096E91990704L ^ l10)), (long)1695743826361444404L, (long)l10))));
        this.B.l(this.G);
        this.N(this.B, this.G);
    }

    private static Field c(long l10, long l11) {
        int n2 = xy.a(l10, l11);
        Object object = j[n2];
        if (object instanceof String) {
            String string = l[n2];
            int n3 = string.indexOf(8);
            Class clazz = xy.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = xy.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = xy.a(clazz3, string2, clazz2)) != null) {
                    xy.j[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = xy.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        xy.j[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = xy.b(251404709829265L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'L' || c10 == '\u00ca' || c10 == '\u00c7' || c10 == '\u00d2') {
                field = xy.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'L' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00ca' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00c7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = xy.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'R' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @OY
    public void y(pa pa2) {
        block8: {
            Vt vt2 = pa2.getPacket();
            try {
                if (vt2.B(eM.Ub)) {
                    this.o = true;
                }
            }
            catch (O_ o_2) {
                throw xy.a(o_2);
            }
            if (vt2.B(eM.bh)) {
                VG vG2 = new VG(vt2);
                Qg qg2 = EP.U();
                try {
                    try {
                        if (!qg2.r() || vG2.h() != qg2.X()) break block8;
                    }
                    catch (O_ o_3) {
                        throw xy.a(o_3);
                    }
                    this.o = true;
                }
                catch (O_ o_4) {
                    throw xy.a(o_4);
                }
            }
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = xy.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method d(long l10, long l11) {
        int n2 = xy.a(l10, l11);
        Object object = j[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = l[n2];
                int n4 = string2.indexOf(8);
                clazz3 = xy.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = xy.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = xy.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        xy.j[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = xy.b(251404709829265L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = xy.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        xy.j[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = xy.b(251404709829265L, 0L);
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

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = xy.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = xy.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @OY
    public void S(pj pj2) {
        block41: {
            float f10;
            double d2;
            double d3;
            Qg qg2;
            block49: {
                double d4;
                double d5;
                block51: {
                    block50: {
                        block47: {
                            block48: {
                                block45: {
                                    block46: {
                                        block44: {
                                            block39: {
                                                block40: {
                                                    qg2 = EP.U();
                                                    try {
                                                        try {
                                                            if (!this.o) break block39;
                                                            if (!qg2.j()) break block40;
                                                        }
                                                        catch (O_ o_2) {
                                                            throw xy.a(o_2);
                                                        }
                                                        this.o = false;
                                                    }
                                                    catch (O_ o_3) {
                                                        throw xy.a(o_3);
                                                    }
                                                }
                                                return;
                                            }
                                            try {
                                                if (qg2.F()) {
                                                    return;
                                                }
                                            }
                                            catch (O_ o_4) {
                                                throw xy.a(o_4);
                                            }
                                            d3 = qg2.W().t();
                                            d2 = qg2.W().m();
                                            f10 = qg2.q();
                                            try {
                                                try {
                                                    block43: {
                                                        try {
                                                            try {
                                                                block42: {
                                                                    try {
                                                                        try {
                                                                            if (!qg2.G()) break block41;
                                                                            if (!this.B.s().booleanValue()) break block42;
                                                                        }
                                                                        catch (O_ o_5) {
                                                                            throw xy.a(o_5);
                                                                        }
                                                                        if (!this.G.H(qg2.K())) break block41;
                                                                    }
                                                                    catch (O_ o_6) {
                                                                        throw xy.a(o_6);
                                                                    }
                                                                }
                                                                if (Math.abs(d2) == (double)0.2f) break block43;
                                                            }
                                                            catch (O_ o_7) {
                                                                throw xy.a(o_7);
                                                            }
                                                            if (Math.abs(d3) != (double)0.2f) break block41;
                                                        }
                                                        catch (O_ o_8) {
                                                            throw xy.a(o_8);
                                                        }
                                                    }
                                                    if (!SE.h.U().W(jx.class)) break block44;
                                                }
                                                catch (O_ o_9) {
                                                    throw xy.a(o_9);
                                                }
                                                qg2.h(true);
                                            }
                                            catch (O_ o_10) {
                                                throw xy.a(o_10);
                                            }
                                        }
                                        try {
                                            try {
                                                if (Math.abs(d2) != (double)0.2f) break block45;
                                                if (!(d2 > 0.0)) break block46;
                                            }
                                            catch (O_ o_11) {
                                                throw xy.a(o_11);
                                            }
                                            qg2.W().N(1.0f);
                                            break block45;
                                        }
                                        catch (O_ o_12) {
                                            throw xy.a(o_12);
                                        }
                                    }
                                    try {
                                        if (d2 < 0.0) {
                                            qg2.W().N(-1.0f);
                                        }
                                    }
                                    catch (O_ o_13) {
                                        throw xy.a(o_13);
                                    }
                                }
                                try {
                                    try {
                                        if (Math.abs(d3) != (double)0.2f) break block47;
                                        if (!(d3 > 0.0)) break block48;
                                    }
                                    catch (O_ o_14) {
                                        throw xy.a(o_14);
                                    }
                                    qg2.W().I(1.0f);
                                    break block47;
                                }
                                catch (O_ o_15) {
                                    throw xy.a(o_15);
                                }
                            }
                            try {
                                if (d3 < 0.0) {
                                    qg2.W().I(-1.0f);
                                }
                            }
                            catch (O_ o_16) {
                                throw xy.a(o_16);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (Math.abs(qg2.W().m()) == 1.0f || !(d3 > 0.0)) break block49;
                                }
                                catch (O_ o_17) {
                                    throw xy.a(o_17);
                                }
                                d5 = d3;
                                if (!qg2.o()) break block50;
                            }
                            catch (O_ o_18) {
                                throw xy.a(o_18);
                            }
                            d4 = 1.3f;
                            break block51;
                        }
                        catch (O_ o_19) {
                            throw xy.a(o_19);
                        }
                    }
                    d4 = 1.0;
                }
                d3 = d5 * d4;
            }
            d2 = d3 != 0.0 ? (d2 *= 0.5) : (d2 *= 0.85);
            qg2.t(d3 * Math.cos(Math.toRadians(f10 + 90.0f)) + d2 * Math.sin(Math.toRadians(f10 + 90.0f)));
            qg2.s(d3 * Math.sin(Math.toRadians(f10 + 90.0f)) - d2 * Math.cos(Math.toRadians(f10 + 90.0f)));
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = xy.a(l10, l11);
            object = j[n2];
            try {
                if (!(object instanceof String)) break block2;
                xy.j[n2] = clazz = Class.forName(l[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int a(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (l[n5] != null) {
            return n5;
        }
        Object object = j[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 3;
                break;
            }
            case 1: {
                n4 = 60;
                break;
            }
            case 2: {
                n4 = 30;
                break;
            }
            case 3: {
                n4 = 7;
                break;
            }
            case 4: {
                n4 = 45;
                break;
            }
            case 5: {
                n4 = 54;
                break;
            }
            case 6: {
                n4 = 38;
                break;
            }
            case 7: {
                n4 = 16;
                break;
            }
            case 8: {
                n4 = 42;
                break;
            }
            case 9: {
                n4 = 14;
                break;
            }
            case 10: {
                n4 = 51;
                break;
            }
            case 11: {
                n4 = 40;
                break;
            }
            case 12: {
                n4 = 35;
                break;
            }
            case 13: {
                n4 = 39;
                break;
            }
            case 14: {
                n4 = 48;
                break;
            }
            case 15: {
                n4 = 37;
                break;
            }
            case 16: {
                n4 = 11;
                break;
            }
            case 17: {
                n4 = 6;
                break;
            }
            case 18: {
                n4 = 15;
                break;
            }
            case 19: {
                n4 = 2;
                break;
            }
            case 20: {
                n4 = 46;
                break;
            }
            case 21: {
                n4 = 21;
                break;
            }
            case 22: {
                n4 = 1;
                break;
            }
            case 23: {
                n4 = 26;
                break;
            }
            case 24: {
                n4 = 9;
                break;
            }
            case 25: {
                n4 = 33;
                break;
            }
            case 26: {
                n4 = 43;
                break;
            }
            case 27: {
                n4 = 20;
                break;
            }
            case 28: {
                n4 = 4;
                break;
            }
            case 29: {
                n4 = 29;
                break;
            }
            case 30: {
                n4 = 47;
                break;
            }
            case 31: {
                n4 = 5;
                break;
            }
            case 32: {
                n4 = 61;
                break;
            }
            case 33: {
                n4 = 59;
                break;
            }
            case 34: {
                n4 = 44;
                break;
            }
            case 35: {
                n4 = 55;
                break;
            }
            case 36: {
                n4 = 36;
                break;
            }
            case 37: {
                n4 = 34;
                break;
            }
            case 38: {
                n4 = 56;
                break;
            }
            case 39: {
                n4 = 41;
                break;
            }
            case 40: {
                n4 = 13;
                break;
            }
            case 41: {
                n4 = 12;
                break;
            }
            case 42: {
                n4 = 0;
                break;
            }
            case 43: {
                n4 = 17;
                break;
            }
            case 44: {
                n4 = 50;
                break;
            }
            case 45: {
                n4 = 22;
                break;
            }
            case 46: {
                n4 = 62;
                break;
            }
            case 47: {
                n4 = 27;
                break;
            }
            case 48: {
                n4 = 57;
                break;
            }
            case 49: {
                n4 = 53;
                break;
            }
            case 50: {
                n4 = 28;
                break;
            }
            case 51: {
                n4 = 8;
                break;
            }
            case 52: {
                n4 = 32;
                break;
            }
            case 53: {
                n4 = 18;
                break;
            }
            case 54: {
                n4 = 63;
                break;
            }
            case 55: {
                n4 = 10;
                break;
            }
            case 56: {
                n4 = 25;
                break;
            }
            case 57: {
                n4 = 58;
                break;
            }
            case 58: {
                n4 = 52;
                break;
            }
            case 59: {
                n4 = 31;
                break;
            }
            case 60: {
                n4 = 49;
                break;
            }
            case 61: {
                n4 = 19;
                break;
            }
            case 62: {
                n4 = 23;
                break;
            }
            default: {
                n4 = 24;
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
        xy.l[n5] = new String(cArray);
        return n5;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/xy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(xy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(xy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

