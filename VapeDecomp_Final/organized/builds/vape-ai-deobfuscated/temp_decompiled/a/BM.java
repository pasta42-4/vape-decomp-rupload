/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.G5;
import a.O_;
import a.SE;
import a.bt;
import a.d8;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
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
public class bm
extends bt {
    private double F3;
    private List<String> L;
    private static final Object[] ob;
    private static final Integer[] kb;
    private double FO;
    private double v = 0.0;
    private static final String[] pb;
    private boolean Fu = false;
    private boolean FY = true;
    private static final long ab;
    private static final Map lb;
    private boolean Fy;
    private double F0 = 0.0;
    private static final long[] jb;

    private static Field k(long l10, long l11) {
        int n2 = bm.i(l10, l11);
        Object object = ob[n2];
        if (object instanceof String) {
            String string = pb[n2];
            int n3 = string.indexOf(8);
            Class clazz = bm.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = bm.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bm.e(clazz3, string2, clazz2)) != null) {
                    bm.ob[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = bm.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        bm.ob[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bm.j(232156061343727L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void A(boolean bl2) {
        this.Fu = bl2;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x73FD;
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
                throw new RuntimeException("a/bm", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bm.kb[n3] = n4;
        }
        return kb[n3];
    }

    @Override
    public double z() {
        return this.v;
    }

    public void n(double d2) {
        this.F3 = d2;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public void H(String string) {
        super.H(string);
        this.L = null;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = bm.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = bm.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

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

    public List<String> n() {
        block4: {
            G5 g5;
            long l10;
            block6: {
                block5: {
                    l10 = ab ^ 0x6404159E6D89L;
                    try {
                        try {
                            if (this.L != null) break block4;
                            if (!this.Fy) break block5;
                        }
                        catch (O_ o_2) {
                            throw bm.a(o_2);
                        }
                        g5 = SE.h.W().u(this.B, false);
                        break block6;
                    }
                    catch (O_ o_3) {
                        throw bm.a(o_3);
                    }
                }
                g5 = SE.h.W().k(this.B, false);
            }
            G5 g52 = g5;
            this.L = this.w(Arrays.asList(this.E.split((String)((Object)bm.e("K", (int)bm.c("d", (int)26944, (long)(0x793FD6175F94029CL ^ l10)), (long)1739017967693891382L, (long)l10)))), g52);
        }
        return this.L;
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
                n4 = 36;
                break;
            }
            case 1: {
                n4 = 45;
                break;
            }
            case 2: {
                n4 = 9;
                break;
            }
            case 3: {
                n4 = 37;
                break;
            }
            case 4: {
                n4 = 23;
                break;
            }
            case 5: {
                n4 = 22;
                break;
            }
            case 6: {
                n4 = 46;
                break;
            }
            case 7: {
                n4 = 62;
                break;
            }
            case 8: {
                n4 = 27;
                break;
            }
            case 9: {
                n4 = 42;
                break;
            }
            case 10: {
                n4 = 44;
                break;
            }
            case 11: {
                n4 = 18;
                break;
            }
            case 12: {
                n4 = 8;
                break;
            }
            case 13: {
                n4 = 32;
                break;
            }
            case 14: {
                n4 = 21;
                break;
            }
            case 15: {
                n4 = 25;
                break;
            }
            case 16: {
                n4 = 39;
                break;
            }
            case 17: {
                n4 = 40;
                break;
            }
            case 18: {
                n4 = 0;
                break;
            }
            case 19: {
                n4 = 60;
                break;
            }
            case 20: {
                n4 = 58;
                break;
            }
            case 21: {
                n4 = 51;
                break;
            }
            case 22: {
                n4 = 17;
                break;
            }
            case 23: {
                n4 = 52;
                break;
            }
            case 24: {
                n4 = 61;
                break;
            }
            case 25: {
                n4 = 11;
                break;
            }
            case 26: {
                n4 = 59;
                break;
            }
            case 27: {
                n4 = 28;
                break;
            }
            case 28: {
                n4 = 47;
                break;
            }
            case 29: {
                n4 = 2;
                break;
            }
            case 30: {
                n4 = 63;
                break;
            }
            case 31: {
                n4 = 35;
                break;
            }
            case 32: {
                n4 = 14;
                break;
            }
            case 33: {
                n4 = 19;
                break;
            }
            case 34: {
                n4 = 4;
                break;
            }
            case 35: {
                n4 = 31;
                break;
            }
            case 36: {
                n4 = 24;
                break;
            }
            case 37: {
                n4 = 55;
                break;
            }
            case 38: {
                n4 = 26;
                break;
            }
            case 39: {
                n4 = 16;
                break;
            }
            case 40: {
                n4 = 38;
                break;
            }
            case 41: {
                n4 = 34;
                break;
            }
            case 42: {
                n4 = 1;
                break;
            }
            case 43: {
                n4 = 13;
                break;
            }
            case 44: {
                n4 = 29;
                break;
            }
            case 45: {
                n4 = 49;
                break;
            }
            case 46: {
                n4 = 43;
                break;
            }
            case 47: {
                n4 = 30;
                break;
            }
            case 48: {
                n4 = 33;
                break;
            }
            case 49: {
                n4 = 5;
                break;
            }
            case 50: {
                n4 = 57;
                break;
            }
            case 51: {
                n4 = 53;
                break;
            }
            case 52: {
                n4 = 12;
                break;
            }
            case 53: {
                n4 = 7;
                break;
            }
            case 54: {
                n4 = 15;
                break;
            }
            case 55: {
                n4 = 54;
                break;
            }
            case 56: {
                n4 = 3;
                break;
            }
            case 57: {
                n4 = 56;
                break;
            }
            case 58: {
                n4 = 20;
                break;
            }
            case 59: {
                n4 = 50;
                break;
            }
            case 60: {
                n4 = 6;
                break;
            }
            case 61: {
                n4 = 10;
                break;
            }
            case 62: {
                n4 = 41;
                break;
            }
            default: {
                n4 = 48;
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
        bm.pb[n5] = new String(cArray);
        return n5;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = bm.i(l10, l11);
            object = ob[n2];
            try {
                if (!(object instanceof String)) break block2;
                bm.ob[n2] = clazz = Class.forName(pb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00d6' || c10 == '\u00b5' || c10 == 'k' || c10 == '\u00de') {
                field = bm.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00d6' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00b5' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bm.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00d2' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'K' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public bm(String string, double d2, Color color, boolean bl2, double d3) {
        super(string, d2);
        this.B(color);
        this.Fy = bl2;
        this.F0 = d3;
    }

    public void v(boolean bl2) {
        this.FY = bl2;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = bm.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = bm.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void q(boolean bl2) {
        this.Fy = bl2;
    }

    @Override
    public double w() {
        return this.FO;
    }

    private static Method l(long l10, long l11) {
        int n2 = bm.i(l10, l11);
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
                clazz3 = bm.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = bm.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bm.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        bm.ob[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bm.j(232156061343727L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = bm.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        bm.ob[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bm.j(232156061343727L, 0L);
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

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/bm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private ArrayList<String> w(List<String> list, G5 g5) {
        ArrayList<String> arrayList;
        long l10 = ab ^ 0x3ECDC5FF72E8L;
        ArrayList<String> arrayList2 = new ArrayList<String>();
        boolean bl2 = false;
        for (String string : list) {
            String[] stringArray = string.split((String)((Object)bm.e("K", (int)bm.c("d", (int)6058, (long)(0x249D41F2C4EFE314L ^ l10)), (long)523369087150823511L, (long)l10)));
            String string2 = "";
            for (int i10 = 0; i10 < stringArray.length; ++i10) {
                String string3 = stringArray[i10];
                double d2 = g5.D(string3);
                if (d2 > this.q()) {
                    bl2 = true;
                    double d3 = this.q() / d2;
                    int n2 = (int)((double)string3.length() * d3);
                    String string4 = string3.substring(0, n2);
                    String string5 = string3.substring(n2, string3.length() - 1);
                    arrayList2.add(string4);
                    arrayList2.add(string5);
                    continue;
                }
                if (i10 < stringArray.length - 1) {
                    String string6 = stringArray[i10 + 1];
                    double d4 = g5.D(string6);
                    if (d2 + g5.D(string2) + d4 < this.q()) {
                        string2 = string2 + string3 + (String)((Object)bm.e("K", (int)bm.c("d", (int)31823, (long)(0x7D127C845BA388F0L ^ l10)), (long)523369087150823511L, (long)l10));
                        continue;
                    }
                    string2 = string2 + string3;
                    string2 = string2.trim();
                    arrayList2.add(string2);
                    string2 = "";
                    continue;
                }
                string2 = string2 + string3;
                arrayList2.add(string2);
            }
        }
        try {
            arrayList = bl2 ? this.w(arrayList2, g5) : arrayList2;
        }
        catch (O_ o_2) {
            throw bm.a(o_2);
        }
        return arrayList;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = bm.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = bm.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    public double q() {
        return this.F3;
    }

    public bm(String string, double d2) {
        super(string, d2);
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = d8.a(7902235534995176107L, -2049542500822840907L, MethodHandles.lookup().lookupClass()).a(151478088044776L);
        ob = new Object[5];
        pb = new String[5];
        bm.i();
        lb = new HashMap(13);
        long l10 = ab ^ 0x56052D95CA8BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        for (int i10 = 1; i10 < 8; ++i10) {
            byArray2 = byArray2;
            byArray2[i10] = (byte)(l10 << i10 * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n2 = 0;
        String string = "\u008dH@Z\u00fc\u00c7\u0018cY\u00e09;\u00f9w\u00a5#\u0016\u009c\u00d86\u00ef\u0018\u0092|";
        int n3 = "\u008dH@Z\u00fc\u00c7\u0018cY\u00e09;\u00f9w\u00a5#\u0016\u009c\u00d86\u00ef\u0018\u0092|".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        jb = lArray;
        kb = new Integer[3];
    }

    @Override
    public void E() {
        super.E();
        this.z();
    }

    public bm(String string, double d2, Color color, boolean bl2) {
        super(string, d2);
        this.B(color);
        this.Fy = bl2;
    }

    private static void i() {
        Object[] objectArray = ob;
        ob[0] = "gqQ";
        objectArray[1] = Integer.TYPE;
        bm.pb[1] = "java/lang/Integer";
        objectArray[2] = "L/1\rJ<G  B7$T')\u000b";
        objectArray[3] = "2%&[\u001d\u000f9*7\u0014|\u00012!3N";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "=$\u0005L\u0005|/{^)V\u007f]1IH[}lrD\u0019==!:VN\u0001>8(D)";
    }

    @Override
    public void G() {
    }

    private void z() {
        G5 g5;
        try {
            g5 = this.Fy ? SE.h.W().u(this.B, false) : SE.h.W().k(this.B, false);
        }
        catch (O_ o_2) {
            throw bm.a(o_2);
        }
        G5 g52 = g5;
        double d2 = this.W();
        for (String string : this.n()) {
            block8: {
                block7: {
                    try {
                        if (!this.Fu) break block7;
                        g52.Y(string, this.G() + this.F0, d2, this.V());
                        break block8;
                    }
                    catch (O_ o_3) {
                        throw bm.a(o_3);
                    }
                }
                g52.R(string, this.G() + this.F0, d2, this.V());
            }
            d2 += g52.B(string);
            double d3 = g52.D(string);
            try {
                if (!(d3 > this.FO)) continue;
                this.FO = d3;
            }
            catch (O_ o_4) {
                throw bm.a(o_4);
            }
        }
        this.v = d2 - this.W();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bm.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bm.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

