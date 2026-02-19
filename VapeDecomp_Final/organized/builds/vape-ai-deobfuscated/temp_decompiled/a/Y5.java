/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Cb;
import a.Cy;
import a.NW;
import a.O_;
import a.RH;
import a.d8;
import a.hy;
import a.ks;
import a.wr;
import a.yh;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class y5
extends yh {
    private static final Object[] ub;
    private static final Map ob;
    private final List<RH> pZ;
    private static final long bb;
    private RH pa;
    private boolean pl;
    private final Cb pq;
    private static final Integer[] mb;
    private static final long[] lb;
    private static final String[] vb;
    private static boolean pI;
    hy pV;
    private final Runnable pu;

    public void u(RH rH2) {
        this.pZ.add(rH2);
        this.pu.run();
    }

    public void v() {
        block4: {
            try {
                try {
                    if (this.pq.a().isEmpty() && this.pZ.isEmpty()) break block4;
                }
                catch (O_ o_2) {
                    throw y5.a(o_2);
                }
                this.pq.y("");
                this.pZ.clear();
                this.pu.run();
            }
            catch (O_ o_3) {
                throw y5.a(o_3);
            }
        }
    }

    public void Y() {
        try {
            if (!this.pZ.isEmpty()) {
                this.pZ.remove(this.pZ.size() - 1);
                this.pu.run();
            }
        }
        catch (O_ o_2) {
            throw y5.a(o_2);
        }
    }

    static List f(y5 y52) {
        return y52.pZ;
    }

    public static boolean i() {
        return pI;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = y5.c(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static int m(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (vb[n5] != null) {
            return n5;
        }
        Object object = ub[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 25;
                break;
            }
            case 1: {
                n4 = 21;
                break;
            }
            case 2: {
                n4 = 31;
                break;
            }
            case 3: {
                n4 = 47;
                break;
            }
            case 4: {
                n4 = 20;
                break;
            }
            case 5: {
                n4 = 56;
                break;
            }
            case 6: {
                n4 = 26;
                break;
            }
            case 7: {
                n4 = 28;
                break;
            }
            case 8: {
                n4 = 62;
                break;
            }
            case 9: {
                n4 = 14;
                break;
            }
            case 10: {
                n4 = 10;
                break;
            }
            case 11: {
                n4 = 59;
                break;
            }
            case 12: {
                n4 = 0;
                break;
            }
            case 13: {
                n4 = 24;
                break;
            }
            case 14: {
                n4 = 49;
                break;
            }
            case 15: {
                n4 = 45;
                break;
            }
            case 16: {
                n4 = 22;
                break;
            }
            case 17: {
                n4 = 33;
                break;
            }
            case 18: {
                n4 = 6;
                break;
            }
            case 19: {
                n4 = 39;
                break;
            }
            case 20: {
                n4 = 51;
                break;
            }
            case 21: {
                n4 = 8;
                break;
            }
            case 22: {
                n4 = 54;
                break;
            }
            case 23: {
                n4 = 23;
                break;
            }
            case 24: {
                n4 = 53;
                break;
            }
            case 25: {
                n4 = 27;
                break;
            }
            case 26: {
                n4 = 18;
                break;
            }
            case 27: {
                n4 = 16;
                break;
            }
            case 28: {
                n4 = 35;
                break;
            }
            case 29: {
                n4 = 5;
                break;
            }
            case 30: {
                n4 = 9;
                break;
            }
            case 31: {
                n4 = 11;
                break;
            }
            case 32: {
                n4 = 3;
                break;
            }
            case 33: {
                n4 = 55;
                break;
            }
            case 34: {
                n4 = 13;
                break;
            }
            case 35: {
                n4 = 29;
                break;
            }
            case 36: {
                n4 = 15;
                break;
            }
            case 37: {
                n4 = 61;
                break;
            }
            case 38: {
                n4 = 42;
                break;
            }
            case 39: {
                n4 = 4;
                break;
            }
            case 40: {
                n4 = 41;
                break;
            }
            case 41: {
                n4 = 57;
                break;
            }
            case 42: {
                n4 = 19;
                break;
            }
            case 43: {
                n4 = 17;
                break;
            }
            case 44: {
                n4 = 60;
                break;
            }
            case 45: {
                n4 = 12;
                break;
            }
            case 46: {
                n4 = 32;
                break;
            }
            case 47: {
                n4 = 1;
                break;
            }
            case 48: {
                n4 = 44;
                break;
            }
            case 49: {
                n4 = 7;
                break;
            }
            case 50: {
                n4 = 48;
                break;
            }
            case 51: {
                n4 = 34;
                break;
            }
            case 52: {
                n4 = 46;
                break;
            }
            case 53: {
                n4 = 63;
                break;
            }
            case 54: {
                n4 = 2;
                break;
            }
            case 55: {
                n4 = 37;
                break;
            }
            case 56: {
                n4 = 58;
                break;
            }
            case 57: {
                n4 = 50;
                break;
            }
            case 58: {
                n4 = 40;
                break;
            }
            case 59: {
                n4 = 30;
                break;
            }
            case 60: {
                n4 = 52;
                break;
            }
            case 61: {
                n4 = 43;
                break;
            }
            case 62: {
                n4 = 36;
                break;
            }
            default: {
                n4 = 38;
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
        y5.vb[n5] = new String(cArray);
        return n5;
    }

    @Override
    public double e() {
        return super.e();
    }

    private static Method h(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = y5.g(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = y5.h(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Method p(long l10, long l11) {
        int n2 = y5.m(l10, l11);
        Object object = ub[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = vb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = y5.n(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = y5.n(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = y5.g(clazz, string, clazz2, n3, classArray2)) != null) {
                        y5.ub[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = y5.n(275064922974107L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = y5.h(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        y5.ub[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = y5.n(275064922974107L, 0L);
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

    public List<RH> p() {
        return this.pZ;
    }

    static boolean C(y5 y52) {
        return y52.pl;
    }

    public boolean t(String string) {
        for (RH rH2 : this.pZ) {
            try {
                if (!rH2.p().equalsIgnoreCase(string)) continue;
                return true;
            }
            catch (O_ o_2) {
                throw y5.a(o_2);
            }
        }
        return false;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = y5.d(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public hy C() {
        return this.pV;
    }

    public Cb o() {
        return this.pq;
    }

    public y5(String string, Runnable runnable, double d2, double d3, boolean bl2, boolean bl3) {
        long l10 = bb ^ 0x487543329955L;
        super(d2);
        this.pZ = new ArrayList<RH>();
        this.pl = false;
        this.pu = runnable;
        this.pa = new RH((String)((Object)y5.f("D", (int)y5.c("i", (int)17146, (long)(0x28CBC5D69BEE75FFL ^ l10)), (long)-6673728341750521968L, (long)l10)));
        ks ks2 = new ks();
        ks2.b(null);
        this.pq = new Cy(this, string, bl2, bl3, runnable);
        this.pq.M(ks2);
        this.pV = new hy((String)((Object)y5.f("D", (int)y5.c("i", (int)29890, (long)(0x77F2F16E5E39C3C6L ^ l10)), (long)-6673728341750521968L, (long)l10)), 1.0);
        this.pV.N(false);
        this.pV.T(10.0);
        this.pV.w(10.0);
        wr wr2 = new wr(5.0, 0.0, 1.0, 4.0, this.pV);
        wr2.T(15.0);
        wr2.w(10.0);
        this.pq.T(d2 - 16.0);
        this.pq.w(d3);
        this.pq.i(false);
        this.pq.I(false);
        this.pq.Z(0.0);
        this.pq.R(0.0f);
        this.pq.H(0.0f);
        this.pq.i(false);
        this.pq.I(false);
        this.pq.Q(Color.RED);
        this.pq.J(Color.BLUE);
        this.i(false);
        this.pq.O().N(false);
        this.pq.g(y5.M.w);
        this.n(this.pq, new Object[0]);
        this.n(wr2, new Object[0]);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.pq.l(new NW(this, atomicBoolean));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        bb = d8.a(-7840861213229732539L, 626423637795004005L, MethodHandles.lookup().lookupClass()).a(257486227081493L);
        ub = new Object[5];
        vb = new String[5];
        y5.D();
        ob = new HashMap(13);
        y5.t(true);
        long l10 = bb ^ 0x2A851169BAE1L;
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
        long[] lArray = new long[2];
        int n2 = 0;
        String string = "\u001dw\u00f4\u00bdy\u00a43bu\u009b\u0092\u008b6\u0005<\u0082";
        int n3 = "\u001dw\u00f4\u00bdy\u00a43bu\u009b\u0092\u008b6\u0005<\u0082".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l11 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray[n5] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n3);
        lb = lArray;
        mb = new Integer[2];
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00a5' || c10 == 'X' || c10 == 'J' || c10 == 'L') {
                field = y5.o(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00a5' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'J' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = y5.p(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00e9' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static boolean K() {
        boolean bl2 = y5.i();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw y5.a(o_2);
        }
        return false;
    }

    public List<String> C() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (RH rH2 : this.pZ) {
            arrayList.add(rH2.p());
        }
        return arrayList;
    }

    @Override
    public void G() {
        super.G();
        double d2 = 0.0;
        for (RH rH2 : this.pZ) {
            d2 += rH2.w() + 2.0;
            try {
                if (!(d2 > this.w() / 2.0)) continue;
                this.pl = true;
                return;
            }
            catch (O_ o_2) {
                throw y5.a(o_2);
            }
        }
        this.pl = false;
    }

    @Override
    public double z() {
        return super.z();
    }

    static RH X(y5 y52) {
        return y52.pa;
    }

    private static int c(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0x1467;
        if (mb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = lb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ob.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    ob.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/y5", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            y5.mb[n3] = n4;
        }
        return mb[n3];
    }

    private static void D() {
        Object[] objectArray = ub;
        ub[0] = "\u0011WS";
        objectArray[1] = Integer.TYPE;
        y5.vb[1] = "java/lang/Integer";
        objectArray[2] = "-\u000b6m\u0019Z&\u0004'\"dB5\u0003.k";
        objectArray[3] = "KuB\u0015\u0005\u001b@zSZd\u0015KqW\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "p6\u001b (e!e\u0014B9'N#\u0017,#e1`H\u007fRe4&I:7:7;\u0018B";
    }

    private static Class n(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = y5.m(l10, l11);
            object = ub[n2];
            try {
                if (!(object instanceof String)) break block2;
                y5.ub[n2] = clazz = Class.forName(vb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field o(long l10, long l11) {
        int n2 = y5.m(l10, l11);
        Object object = ub[n2];
        if (object instanceof String) {
            String string = vb[n2];
            int n3 = string.indexOf(8);
            Class clazz = y5.n(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = y5.n(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = y5.g(clazz3, string2, clazz2)) != null) {
                    y5.ub[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = y5.h(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        y5.ub[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = y5.n(275064922974107L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = y5.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = y5.h(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void t(boolean bl2) {
        pI = bl2;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/y5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void T(RH rH2) {
        this.pZ.remove(rH2);
        this.pu.run();
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(y5.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(y5.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

