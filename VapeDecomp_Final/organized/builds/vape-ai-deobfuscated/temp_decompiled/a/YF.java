/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package a;

import a.Ci;
import a.Fb;
import a.Io;
import a.O_;
import a.Yw;
import a.bE;
import a.cb;
import a.d8;
import a.ep;
import a.wJ;
import a.yG;
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
import org.jetbrains.annotations.Nullable;

class yf
extends yG {
    @Nullable
    private final Io DA;
    private static final Integer[] eb;
    private static final long[] bb;
    private final Yw DE;
    private final Io DG;
    private final Runnable Dp;
    private final ep DH;
    private static final Object[] lb;
    private static final long ab;
    private static final String[] mb;
    private static final Map fb;

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 's' || c10 == 'M' || c10 == '\u00fd' || c10 == 'u') {
                field = yf.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'M' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00fd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = yf.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public yf(double d2, Yw yw2, ep ep2, Io io2, @Nullable Io io3, Runnable runnable) {
        long l10 = ab ^ 0x39A4DC63FBDCL;
        super(d2, 0.0);
        this.DE = yw2;
        this.DH = ep2;
        this.DG = io2;
        this.DA = io3;
        this.Dp = runnable;
        this.d().f((String)((Object)yf.d("\u00a5", (int)yf.c("t", (int)4178, (long)(0xD2C422E7D739B3AL ^ l10)), (long)6467572729601512402L, (long)l10)));
        this.i(false);
        this.Y(false);
        this.i(Double.MAX_VALUE);
        this.y();
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = yf.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = yf.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = yf.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private void lambda$update$0() {
        block3: {
            block2: {
                try {
                    if (!this.DG.A().isEmpty()) break block2;
                    this.DH.Q(this.DG);
                    this.Dp.run();
                    break block3;
                }
                catch (O_ o_2) {
                    throw yf.a(o_2);
                }
            }
            this.y();
        }
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = yf.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static void x() {
        Object[] objectArray = lb;
        lb[0] = "8\u0019_";
        objectArray[1] = Integer.TYPE;
        yf.mb[1] = "java/lang/Integer";
        objectArray[2] = "$Z~\\\u0012\u0015/Uo\u0013o\r<RfZ";
        objectArray[3] = "z{79W\u0002qt&v6\fz\u007f\",";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "vBL]\n\u0000d\u001eV3\u000e\u0018\u0015Q_B\u000b\u0006lVIIeZqW[^\t\tqS\u00163";
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x52A8;
        if (eb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = bb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])fb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    fb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/yf", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            yf.eb[n3] = n4;
        }
        return eb[n3];
    }

    private static Field k(long l10, long l11) {
        int n2 = yf.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            String string = mb[n2];
            int n3 = string.indexOf(8);
            Class clazz = yf.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = yf.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = yf.e(clazz3, string2, clazz2)) != null) {
                    yf.lb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = yf.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        yf.lb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = yf.j(226969690397483L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public double z() {
        return this.d().R();
    }

    private static Method l(long l10, long l11) {
        int n2 = yf.i(l10, l11);
        Object object = lb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = mb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = yf.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = yf.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = yf.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        yf.lb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = yf.j(226969690397483L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = yf.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        yf.lb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = yf.j(226969690397483L, 0L);
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
        if (mb[n5] != null) {
            return n5;
        }
        Object object = lb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 39;
                break;
            }
            case 1: {
                n4 = 31;
                break;
            }
            case 2: {
                n4 = 36;
                break;
            }
            case 3: {
                n4 = 44;
                break;
            }
            case 4: {
                n4 = 38;
                break;
            }
            case 5: {
                n4 = 20;
                break;
            }
            case 6: {
                n4 = 27;
                break;
            }
            case 7: {
                n4 = 13;
                break;
            }
            case 8: {
                n4 = 42;
                break;
            }
            case 9: {
                n4 = 29;
                break;
            }
            case 10: {
                n4 = 47;
                break;
            }
            case 11: {
                n4 = 22;
                break;
            }
            case 12: {
                n4 = 48;
                break;
            }
            case 13: {
                n4 = 49;
                break;
            }
            case 14: {
                n4 = 12;
                break;
            }
            case 15: {
                n4 = 10;
                break;
            }
            case 16: {
                n4 = 56;
                break;
            }
            case 17: {
                n4 = 57;
                break;
            }
            case 18: {
                n4 = 19;
                break;
            }
            case 19: {
                n4 = 37;
                break;
            }
            case 20: {
                n4 = 24;
                break;
            }
            case 21: {
                n4 = 8;
                break;
            }
            case 22: {
                n4 = 62;
                break;
            }
            case 23: {
                n4 = 35;
                break;
            }
            case 24: {
                n4 = 1;
                break;
            }
            case 25: {
                n4 = 46;
                break;
            }
            case 26: {
                n4 = 15;
                break;
            }
            case 27: {
                n4 = 18;
                break;
            }
            case 28: {
                n4 = 0;
                break;
            }
            case 29: {
                n4 = 43;
                break;
            }
            case 30: {
                n4 = 28;
                break;
            }
            case 31: {
                n4 = 7;
                break;
            }
            case 32: {
                n4 = 21;
                break;
            }
            case 33: {
                n4 = 45;
                break;
            }
            case 34: {
                n4 = 51;
                break;
            }
            case 35: {
                n4 = 30;
                break;
            }
            case 36: {
                n4 = 59;
                break;
            }
            case 37: {
                n4 = 52;
                break;
            }
            case 38: {
                n4 = 6;
                break;
            }
            case 39: {
                n4 = 58;
                break;
            }
            case 40: {
                n4 = 54;
                break;
            }
            case 41: {
                n4 = 50;
                break;
            }
            case 42: {
                n4 = 55;
                break;
            }
            case 43: {
                n4 = 25;
                break;
            }
            case 44: {
                n4 = 3;
                break;
            }
            case 45: {
                n4 = 33;
                break;
            }
            case 46: {
                n4 = 53;
                break;
            }
            case 47: {
                n4 = 4;
                break;
            }
            case 48: {
                n4 = 34;
                break;
            }
            case 49: {
                n4 = 26;
                break;
            }
            case 50: {
                n4 = 41;
                break;
            }
            case 51: {
                n4 = 61;
                break;
            }
            case 52: {
                n4 = 2;
                break;
            }
            case 53: {
                n4 = 14;
                break;
            }
            case 54: {
                n4 = 23;
                break;
            }
            case 55: {
                n4 = 16;
                break;
            }
            case 56: {
                n4 = 32;
                break;
            }
            case 57: {
                n4 = 5;
                break;
            }
            case 58: {
                n4 = 40;
                break;
            }
            case 59: {
                n4 = 17;
                break;
            }
            case 60: {
                n4 = 60;
                break;
            }
            case 61: {
                n4 = 11;
                break;
            }
            case 62: {
                n4 = 9;
                break;
            }
            default: {
                n4 = 63;
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
        yf.mb[n5] = new String(cArray);
        return n5;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = yf.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = yf.f(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = yf.i(l10, l11);
            object = lb[n2];
            try {
                if (!(object instanceof String)) break block2;
                yf.lb[n2] = clazz = Class.forName(mb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/yf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = d8.a(-4646851956944790085L, -7197087815021752447L, MethodHandles.lookup().lookupClass()).a(196979202980684L);
        lb = new Object[5];
        mb = new String[5];
        yf.x();
        fb = new HashMap(13);
        long l10 = ab ^ 0x4E21B6512BE9L;
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
        String string = "\u00c1\u0011\\O\u00c6\u00ec2\u00c9\u0094i\u0089\u00a2}L\u0094Ch\u0099\u009d\u0000\u0010,k+";
        int n3 = "\u00c1\u0011\\O\u00c6\u00ec2\u00c9\u0094i\u0089\u00a2}L\u0094Ch\u0099\u009d\u0000\u0010,k+".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        bb = lArray;
        eb = new Integer[3];
    }

    public void y() {
        long l10 = ab ^ 0x4FBBC6A24876L;
        try {
            this.f();
            if (this.DA != null) {
                this.n(new bE(8.0, 0.0), yf.d("\u00a5", (int)yf.c("t", (int)16138, (long)(0x1B5231ABA5F107CAL ^ l10)), (long)-1555121489694990216L, (long)l10));
                this.n(new Ci(Fb.OR), new Object[0]);
            }
        }
        catch (O_ o_2) {
            throw yf.a(o_2);
        }
        for (int i10 = 0; i10 < this.DG.A().size(); ++i10) {
            cb<?> cb2 = this.DG.A().get(i10);
            wJ wJ2 = new wJ(this.w() - 5.0, this.DE, this.DG, cb2, this::lambda$update$0);
            try {
                this.n(wJ2, new Object[0]);
                if (i10 == this.DG.A().size() - 1) continue;
                this.n(new bE(8.0, 0.0), yf.d("\u00a5", (int)yf.c("t", (int)20335, (long)(0x59A30DFCDBFAF7ACL ^ l10)), (long)-1555121489694990216L, (long)l10));
                this.n(new Ci(Fb.AND), new Object[0]);
                continue;
            }
            catch (O_ o_3) {
                throw yf.a(o_3);
            }
        }
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(yf.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(yf.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

