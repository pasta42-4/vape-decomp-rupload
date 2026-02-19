/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.SE;
import a.Wg;
import a.d8;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class st
implements Wg {
    private static final Integer[] c;
    private static final Map d;
    private SimpleDateFormat K;
    private static final long[] b;
    private static final Object[] e;
    private File M;
    private static final long a;
    private PrintWriter C;
    private static final String[] f;

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/st" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00e3' || c10 == '\u00c6' || c10 == '\u00e5' || c10 == 'S') {
                field = st.c(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == '\u00c6' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00e5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = st.d(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field c(long l10, long l11) {
        int n2 = st.a(l10, l11);
        Object object = e[n2];
        if (object instanceof String) {
            String string = f[n2];
            int n3 = string.indexOf(8);
            Class clazz = st.b(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = st.b(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = st.a(clazz3, string2, clazz2)) != null) {
                    st.e[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = st.b(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        st.e[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = st.b(240731517291722L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
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

    private static void b() {
        Object[] objectArray = e;
        e[0] = "{xQ";
        objectArray[1] = Integer.TYPE;
        st.f[1] = "java/lang/Integer";
        objectArray[2] = "a6MJ+yj9\\\u0005Vay>UL";
        objectArray[3] = "R\u0015HG]HY\u001aY\b<FR\u0011]R";
        Object[] objectArray2 = objectArray;
        objectArray[4] = ">\u001b\u001d\u007f&>0\u0004\u0001\u001e.4\u0000[\u001d&8=:\u001a\bu'O9\u0019\u0011x|2n\u0010\u0017uE";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = st.a(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private void lambda$new$0() {
        this.a();
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = st.a(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method d(long l10, long l11) {
        int n2 = st.a(l10, l11);
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
                clazz3 = st.b(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = st.b(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = st.a(clazz, string, clazz2, n3, classArray2)) != null) {
                        st.e[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = st.b(240731517291722L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = st.b(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        st.e[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = st.b(240731517291722L, 0L);
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

    @Override
    public void a() {
        try {
            if (this.C != null) {
                this.C.close();
            }
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    private static Class b(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = st.a(l10, l11);
            object = e[n2];
            try {
                if (!(object instanceof String)) break block2;
                st.e[n2] = clazz = Class.forName(f[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void N(String string) {
        long l10 = a ^ 0x88F68E80A13L;
        try {
            String string2 = this.K.format(new Date());
            this.C.printf((String)((Object)st.b("\u00e9", (int)st.a("y", (int)7145, (long)(0x43463C4FE0F5531EL ^ l10)), (long)7145842416192005928L, (long)l10)), string2, string);
            this.C.flush();
        }
        catch (Exception exception) {
            SE.W(exception);
        }
    }

    private static int a(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x2BD8;
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
                throw new RuntimeException("a/st", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            st.c[n3] = n4;
        }
        return c[n3];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = st.a(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = st.b(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static int a(long l10, long l11) {
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
                n4 = 10;
                break;
            }
            case 1: {
                n4 = 57;
                break;
            }
            case 2: {
                n4 = 41;
                break;
            }
            case 3: {
                n4 = 62;
                break;
            }
            case 4: {
                n4 = 14;
                break;
            }
            case 5: {
                n4 = 27;
                break;
            }
            case 6: {
                n4 = 12;
                break;
            }
            case 7: {
                n4 = 49;
                break;
            }
            case 8: {
                n4 = 31;
                break;
            }
            case 9: {
                n4 = 34;
                break;
            }
            case 10: {
                n4 = 1;
                break;
            }
            case 11: {
                n4 = 11;
                break;
            }
            case 12: {
                n4 = 59;
                break;
            }
            case 13: {
                n4 = 2;
                break;
            }
            case 14: {
                n4 = 33;
                break;
            }
            case 15: {
                n4 = 61;
                break;
            }
            case 16: {
                n4 = 36;
                break;
            }
            case 17: {
                n4 = 23;
                break;
            }
            case 18: {
                n4 = 19;
                break;
            }
            case 19: {
                n4 = 21;
                break;
            }
            case 20: {
                n4 = 30;
                break;
            }
            case 21: {
                n4 = 29;
                break;
            }
            case 22: {
                n4 = 46;
                break;
            }
            case 23: {
                n4 = 51;
                break;
            }
            case 24: {
                n4 = 32;
                break;
            }
            case 25: {
                n4 = 28;
                break;
            }
            case 26: {
                n4 = 60;
                break;
            }
            case 27: {
                n4 = 63;
                break;
            }
            case 28: {
                n4 = 40;
                break;
            }
            case 29: {
                n4 = 53;
                break;
            }
            case 30: {
                n4 = 54;
                break;
            }
            case 31: {
                n4 = 8;
                break;
            }
            case 32: {
                n4 = 56;
                break;
            }
            case 33: {
                n4 = 25;
                break;
            }
            case 34: {
                n4 = 45;
                break;
            }
            case 35: {
                n4 = 26;
                break;
            }
            case 36: {
                n4 = 0;
                break;
            }
            case 37: {
                n4 = 17;
                break;
            }
            case 38: {
                n4 = 37;
                break;
            }
            case 39: {
                n4 = 39;
                break;
            }
            case 40: {
                n4 = 20;
                break;
            }
            case 41: {
                n4 = 35;
                break;
            }
            case 42: {
                n4 = 15;
                break;
            }
            case 43: {
                n4 = 48;
                break;
            }
            case 44: {
                n4 = 22;
                break;
            }
            case 45: {
                n4 = 18;
                break;
            }
            case 46: {
                n4 = 58;
                break;
            }
            case 47: {
                n4 = 43;
                break;
            }
            case 48: {
                n4 = 24;
                break;
            }
            case 49: {
                n4 = 47;
                break;
            }
            case 50: {
                n4 = 3;
                break;
            }
            case 51: {
                n4 = 4;
                break;
            }
            case 52: {
                n4 = 13;
                break;
            }
            case 53: {
                n4 = 44;
                break;
            }
            case 54: {
                n4 = 38;
                break;
            }
            case 55: {
                n4 = 42;
                break;
            }
            case 56: {
                n4 = 6;
                break;
            }
            case 57: {
                n4 = 16;
                break;
            }
            case 58: {
                n4 = 9;
                break;
            }
            case 59: {
                n4 = 52;
                break;
            }
            case 60: {
                n4 = 55;
                break;
            }
            case 61: {
                n4 = 5;
                break;
            }
            case 62: {
                n4 = 7;
                break;
            }
            default: {
                n4 = 50;
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
        st.f[n5] = new String(cArray);
        return n5;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = st.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = st.b(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/st" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public st() {
        long l10 = a ^ 0x23F503519FEAL;
        this.K = new SimpleDateFormat((String)((Object)st.b("\u00e9", (int)st.a("y", (int)17917, (long)(0x8357C210E5E18FEL ^ l10)), (long)-661454464142363951L, (long)l10)));
        try {
            String string = System.getenv((String)((Object)st.b("\u00e9", (int)st.a("y", (int)5282, (long)(0x3B447253B7B149ABL ^ l10)), (long)-661454464142363951L, (long)l10)));
            String string2 = string + File.separator + (String)((Object)st.b("\u00e9", (int)st.a("y", (int)25497, (long)(0x1A9BC846F1253E96L ^ l10)), (long)-661454464142363951L, (long)l10));
            File file = new File(string2);
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            catch (IOException iOException) {
                throw st.a(iOException);
            }
            String string3 = string2 + File.separator + (String)((Object)st.b("\u00e9", (int)st.a("y", (int)12230, (long)(0x12AB6E274C38F2CAL ^ l10)), (long)-661454464142363951L, (long)l10)) + this.K.format(new Date()).replace((CharSequence)((Object)st.b("\u00e9", (int)st.a("y", (int)9506, (long)(0x202A99B32AC5F829L ^ l10)), (long)-661454464142363951L, (long)l10)), (CharSequence)((Object)st.b("\u00e9", (int)st.a("y", (int)27015, (long)(0x536F72760392B48DL ^ l10)), (long)-661454464142363951L, (long)l10))) + (String)((Object)st.b("\u00e9", (int)st.a("y", (int)32550, (long)(0x27844E346473222BL ^ l10)), (long)-661454464142363951L, (long)l10));
            SE.x((String)((Object)st.b("\u00e9", (int)st.a("y", (int)10215, (long)(0x64B977BB3D7D7AEFL ^ l10)), (long)-661454464142363951L, (long)l10)) + string3);
            this.M = new File(string3);
            FileWriter fileWriter = new FileWriter(this.M, false);
            this.C = new PrintWriter(fileWriter);
            Runtime.getRuntime().addShutdownHook(new Thread(this::lambda$new$0));
        }
        catch (IOException iOException) {
            SE.W(iOException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                st.a = d8.a(5066378421284018947L, -7258149892015301613L, MethodHandles.lookup().lookupClass()).a(181098916478631L);
                st.e = new Object[5];
                st.f = new String[5];
                st.b();
                st.d = new HashMap<K, V>(13);
                var0 = st.a ^ 2087317898209L;
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
                var6_5 = "\u0099\u00f7\u00a8>rvB>9\f\u00ee\u0095z\u00e1\u00fc\u00c2\u0003\u00eb6\u001c\u000b\u0099\u001c\u009a\u00cd\u0096\u00fe\u0016+'\u00e3\u00ea\u00a6\u000f^\u0016\u00e3\t]ED]n\\c\u00be\u0093\u00fcB?+\u00caSI&\u00f2";
                var7_6 = "\u0099\u00f7\u00a8>rvB>9\f\u00ee\u0095z\u00e1\u00fc\u00c2\u0003\u00eb6\u001c\u000b\u0099\u001c\u009a\u00cd\u0096\u00fe\u0016+'\u00e3\u00ea\u00a6\u000f^\u0016\u00e3\t]ED]n\\c\u00be\u0093\u00fcB?+\u00caSI&\u00f2".length();
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
                    var6_5 = "~\u008e\u00de\u00850\u00a7\u00e0\t\u00a8Q\u0019\u00ed`h\u0015\u00f6";
                    var7_6 = "~\u008e\u00de\u00850\u00a7\u00e0\t\u00a8Q\u0019\u00ed`h\u0015\u00f6".length();
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
        st.b = var8_3;
        st.c = new Integer[9];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(st.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(st.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

