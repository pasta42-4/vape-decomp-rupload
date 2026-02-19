/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Gs;
import a.O_;
import a.Or;
import a.Sz;
import a._L;
import a._q;
import a.b7;
import a.d8;
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

public class bz
extends b7 {
    private static final long[] jb;
    private static final Object[] ob;
    private static final Integer[] kb;
    private static final Map lb;
    private _q tC;
    private static final String[] pb;
    private static final long ab;

    private static Method e(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    @Override
    public String w() {
        return super.w();
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void G() {
        String string;
        block4: {
            long l10;
            block3: {
                l10 = ab ^ 0x5AB2A56810D6L;
                super.G();
                string = this.tC.n();
                try {
                    if (this.Y()) break block3;
                    if (this.tC.x().equals(this.tC.n())) break block4;
                }
                catch (O_ o_2) {
                    throw bz.a(o_2);
                }
                string = (String)((Object)bz.e("J", (int)bz.c("i", (int)23644, (long)(0x27DB3C9E243F5D1FL ^ l10)), (long)8938334782106471292L, (long)l10)) + this.tC.H();
                break block4;
            }
            if (this.tC instanceof _L) {
                _L _L2 = (_L)this.tC;
                string = (String)((Object)bz.e("J", (int)bz.c("i", (int)12491, (long)(0x5BB2838C8814318CL ^ l10)), (long)8938334782106471292L, (long)l10)) + _L2.p().j();
            }
        }
        this.f(string);
    }

    private static void i() {
        Object[] objectArray = ob;
        ob[0] = "j7i";
        objectArray[1] = Integer.TYPE;
        bz.pb[1] = "java/lang/Integer";
        objectArray[2] = "\u000e\u0003W%9=\u0005\fFjD%\u0016\u000bO#";
        objectArray[3] = "6b$S>~=m5\u001c_p6f1F";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0004yEy.1C&DD( >p\u001c+}5Nt\u0015&)[\u00075^{89\u00030\u001c~C";
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = bz.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                bz.ab = d8.a(-4393165027152034049L, 3416754785251286867L, MethodHandles.lookup().lookupClass()).a(125344354625812L);
                bz.ob = new Object[5];
                bz.pb = new String[5];
                bz.i();
                bz.lb = new HashMap<K, V>(13);
                var0 = bz.ab ^ 23335270242228L;
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
                var8_3 = new long[5];
                var5_4 = 0;
                var6_5 = "\u00ecm\u00ffC\u00ebAb?\u00fa\u00fe\u00da-\u001d\u00ad\u00eb\u00de\u0005\u0007O\u009e\bwi\u00e9";
                var7_6 = "\u00ecm\u00ffC\u00ebAb?\u00fa\u00fe\u00da-\u001d\u00ad\u00eb\u00de\u0005\u0007O\u009e\bwi\u00e9".length();
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
                    var6_5 = "p\u00b8\t\u00f4\u00d0K\u000b\u00be\u0084\u0090{[\u0011\u0016M\u0014";
                    var7_6 = "p\u00b8\t\u00f4\u00d0K\u000b\u00be\u0084\u0090{[\u0011\u0016M\u0014".length();
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
        bz.jb = var8_3;
        bz.kb = new Integer[5];
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = bz.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = bz.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field k(long l10, long l11) {
        int n2 = bz.i(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            String string = pb[n2];
            int n3 = string.indexOf(8);
            Class clazz = bz.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = bz.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bz.e(clazz3, string2, clazz2)) != null) {
                    bz.ob[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = bz.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        bz.ob[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bz.j(280793088823330L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public bz(_q _q2) {
        long l10 = ab ^ 0x543C0A2FD583L;
        super(bz.M.Y, _q2.n());
        this.tC = _q2;
        if (_q2 instanceof _L) {
            this.m((String)((Object)bz.e("J", (int)bz.c("i", (int)9506, (long)(0x37B13741901F6133L ^ l10)), (long)-5089535222790336983L, (long)l10)));
            this.A(bz.M.f);
        }
        this.Z(0.0f);
        this.T(99.0);
        this.J(true);
        this.R(new Gs(this, _q2));
        this.g((String)((Object)bz.e("J", (int)bz.c("i", (int)445, (long)(0x3D251C4DF9D245ADL ^ l10)), (long)-5089535222790336983L, (long)l10)));
        this.r().g((String)((Object)bz.e("J", (int)bz.c("i", (int)28727, (long)(0x4E40B54D529EB424L ^ l10)), (long)-5089535222790336983L, (long)l10)));
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = bz.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    @Override
    public void Z(Sz sz2) {
        block4: {
            boolean bl2;
            _q _q2;
            block6: {
                block5: {
                    try {
                        try {
                            super.Z(sz2);
                            if (!sz2.getAction().equals((Object)Or.LEFT_CLICK)) break block4;
                            _q2 = this.tC;
                            if (this.tC.F()) break block5;
                        }
                        catch (O_ o_2) {
                            throw bz.a(o_2);
                        }
                        bl2 = true;
                        break block6;
                    }
                    catch (O_ o_3) {
                        throw bz.a(o_3);
                    }
                }
                bl2 = false;
            }
            _q2.U(bl2);
        }
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'd' || c10 == 'Y' || c10 == '\u00f9' || c10 == '\u00e1') {
                field = bz.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'd' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'Y' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00f9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bz.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00f0' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'J' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x7D4D;
        if (kb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = jb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])lb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    lb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/bz", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bz.kb[n3] = n4;
        }
        return kb[n3];
    }

    private static Method l(long l10, long l11) {
        int n2 = bz.i(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = pb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = bz.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = bz.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bz.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        bz.ob[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bz.j(280793088823330L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = bz.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        bz.ob[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bz.j(280793088823330L, 0L);
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

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (pb[n5] != null) {
            return n5;
        }
        Object object = ob[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 63;
                break;
            }
            case 1: {
                n4 = 44;
                break;
            }
            case 2: {
                n4 = 15;
                break;
            }
            case 3: {
                n4 = 35;
                break;
            }
            case 4: {
                n4 = 29;
                break;
            }
            case 5: {
                n4 = 4;
                break;
            }
            case 6: {
                n4 = 14;
                break;
            }
            case 7: {
                n4 = 45;
                break;
            }
            case 8: {
                n4 = 1;
                break;
            }
            case 9: {
                n4 = 5;
                break;
            }
            case 10: {
                n4 = 49;
                break;
            }
            case 11: {
                n4 = 7;
                break;
            }
            case 12: {
                n4 = 10;
                break;
            }
            case 13: {
                n4 = 9;
                break;
            }
            case 14: {
                n4 = 54;
                break;
            }
            case 15: {
                n4 = 26;
                break;
            }
            case 16: {
                n4 = 51;
                break;
            }
            case 17: {
                n4 = 46;
                break;
            }
            case 18: {
                n4 = 57;
                break;
            }
            case 19: {
                n4 = 6;
                break;
            }
            case 20: {
                n4 = 50;
                break;
            }
            case 21: {
                n4 = 30;
                break;
            }
            case 22: {
                n4 = 0;
                break;
            }
            case 23: {
                n4 = 8;
                break;
            }
            case 24: {
                n4 = 23;
                break;
            }
            case 25: {
                n4 = 60;
                break;
            }
            case 26: {
                n4 = 58;
                break;
            }
            case 27: {
                n4 = 2;
                break;
            }
            case 28: {
                n4 = 48;
                break;
            }
            case 29: {
                n4 = 33;
                break;
            }
            case 30: {
                n4 = 55;
                break;
            }
            case 31: {
                n4 = 37;
                break;
            }
            case 32: {
                n4 = 32;
                break;
            }
            case 33: {
                n4 = 19;
                break;
            }
            case 34: {
                n4 = 22;
                break;
            }
            case 35: {
                n4 = 20;
                break;
            }
            case 36: {
                n4 = 39;
                break;
            }
            case 37: {
                n4 = 34;
                break;
            }
            case 38: {
                n4 = 42;
                break;
            }
            case 39: {
                n4 = 13;
                break;
            }
            case 40: {
                n4 = 31;
                break;
            }
            case 41: {
                n4 = 27;
                break;
            }
            case 42: {
                n4 = 53;
                break;
            }
            case 43: {
                n4 = 28;
                break;
            }
            case 44: {
                n4 = 18;
                break;
            }
            case 45: {
                n4 = 62;
                break;
            }
            case 46: {
                n4 = 38;
                break;
            }
            case 47: {
                n4 = 24;
                break;
            }
            case 48: {
                n4 = 3;
                break;
            }
            case 49: {
                n4 = 56;
                break;
            }
            case 50: {
                n4 = 21;
                break;
            }
            case 51: {
                n4 = 12;
                break;
            }
            case 52: {
                n4 = 47;
                break;
            }
            case 53: {
                n4 = 52;
                break;
            }
            case 54: {
                n4 = 59;
                break;
            }
            case 55: {
                n4 = 40;
                break;
            }
            case 56: {
                n4 = 41;
                break;
            }
            case 57: {
                n4 = 36;
                break;
            }
            case 58: {
                n4 = 25;
                break;
            }
            case 59: {
                n4 = 11;
                break;
            }
            case 60: {
                n4 = 43;
                break;
            }
            case 61: {
                n4 = 61;
                break;
            }
            case 62: {
                n4 = 17;
                break;
            }
            default: {
                n4 = 16;
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
        bz.pb[n5] = new String(cArray);
        return n5;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = bz.i(l10, l11);
            object = ob[n2];
            try {
                if (!(object instanceof String)) break block2;
                bz.ob[n2] = clazz = Class.forName(pb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public boolean O() {
        return this.tC.F();
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = bz.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = bz.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bz.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(bz.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

