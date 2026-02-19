/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.F8;
import a.G5;
import a.O_;
import a.SE;
import a.d8;
import a.jG;
import a.ju;
import a.wN;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class wc
extends wN {
    private static final Map xb;
    private static final Integer[] wb;
    private static final String[] Jb;
    private static final Object[] Ib;
    private static final long fb;
    private ju Kl = (ju)this.t();
    private static final long[] vb;

    private static void T() {
        Object[] objectArray = Ib;
        Ib[0] = "\u0004@8";
        objectArray[1] = Integer.TYPE;
        wc.Jb[1] = "java/lang/Integer";
        objectArray[2] = "\u0003\u0016UuL\u001b\b\u0019D:1\u0003\u001b\u001eMs";
        objectArray[3] = "_\u001c\u0004\u000eX0T\u0013\u0015A9>_\u0018\u0011\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "o\u001cZM\u007f$s\u0014G-,c\fF\u0003\u0013})0\u0011[S'\u00185\u0005@R}%e\u000e]\u0010G";
    }

    @Override
    public void V() {
        try {
            if (this.E()) {
                this.Y();
                return;
            }
        }
        catch (O_ o_2) {
            throw wc.a(o_2);
        }
        this.P();
    }

    private static Method k(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
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

    private String c() {
        return LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ROOT).toLowerCase();
    }

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int f(int n2, long l10) {
        int n3 = n2 ^ (int)(l10 & 0x7FFFL) ^ 0xB97;
        if (wb[n3] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10};
            long l11 = vb[n3];
            byte[] byArray3 = new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11};
            Long l12 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])xb.get(l12);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    xb.put(l12, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/wc", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            wc.wb[n3] = n4;
        }
        return wb[n3];
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00ea' || c10 == 'k' || c10 == 'K' || c10 == '\u00ee') {
                field = wc.w(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00ea' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wc.x(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'O' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method l(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = wc.k(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = wc.l(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private String j() {
        long l10 = fb ^ 0x2C3FF4042086L;
        int n2 = LocalTime.now().getMinute();
        String string = String.valueOf(n2);
        if (n2 < 10) {
            string = (String)((Object)wc.l("\u00a3", (int)wc.f("t", (int)1132, (long)(0x5FD6A754FBF87BC9L ^ l10)), (long)-850807999848982229L, (long)l10)) + string;
        }
        return string;
    }

    private static CallSite l(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public double b() {
        try {
            if (this.E()) {
                return 32.0;
            }
        }
        catch (O_ o_2) {
            throw wc.a(o_2);
        }
        return 65.0;
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = wc.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = wc.l(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n2 = (Integer)objectArray[0];
        long l10 = (Long)objectArray[1];
        int n3 = wc.f(n2, l10);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n3);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n3;
    }

    private static Method x(long l10, long l11) {
        int n2 = wc.u(l10, l11);
        Object object = Ib[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = Jb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = wc.v(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = wc.v(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wc.k(clazz, string, clazz2, n3, classArray2)) != null) {
                        wc.Ib[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wc.v(263486683454107L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = wc.l(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        wc.Ib[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wc.v(263486683454107L, 0L);
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

    private String Y() {
        int n2;
        long l10;
        block6: {
            block7: {
                l10 = fb ^ 0x39A3FC21E69L;
                n2 = LocalTime.now().getHour();
                try {
                    try {
                        if (this.Kl.h.s().booleanValue()) break block6;
                        if (n2 <= 12) break block7;
                    }
                    catch (O_ o_2) {
                        throw wc.a(o_2);
                    }
                    n2 -= 12;
                    break block6;
                }
                catch (O_ o_3) {
                    throw wc.a(o_3);
                }
            }
            if (n2 == 0) {
                n2 = 12;
            }
        }
        String string = String.valueOf(n2);
        if (n2 < 10) {
            string = (String)((Object)wc.l("\u00a3", (int)wc.f("t", (int)11752, (long)(0x428F3EFEC40A6CA0L ^ l10)), (long)-3828485176829745212L, (long)l10)) + string;
        }
        return string;
    }

    @Override
    public String A() {
        long l10 = fb ^ 0x72B6047C9727L;
        return wc.l("\u00a3", (int)wc.f("t", (int)14279, (long)(0xB1EDE516117FC9L ^ l10)), (long)4868404564007087754L, (long)l10);
    }

    public wc() {
        super(ju.class);
    }

    private void Y() {
        G5 g5 = SE.h.W().T(3.0, true);
        G5 g52 = SE.h.W().T(1.0, true);
        g5.R(this.Y(), this.G() - g5.D(this.Y()) + 30.0, this.W() + 2.0, this.A());
        F8.T(this.G() + 34.0, this.W() + 15.0, 2.0, 0.0, this.A());
        g5.R(this.j(), this.G() + 39.0, this.W() + 2.0, this.A());
        double d2 = this.G() + 39.0;
        if (!this.Kl.h.s().booleanValue()) {
            g52.R(this.o(), d2 += g5.D(this.j()), this.W() + 18.0, this.A());
        }
        if (this.Kl.G.s().booleanValue()) {
            d2 = this.G() + this.w() - g52.D(this.k(true)) - 6.0;
            String string = this.k(true);
            double d3 = g52.D(string);
            String string2 = this.c().toLowerCase();
            double d4 = g52.D(string2);
            double d5 = d2 + d3 - d4;
            g52.R(string, d2, this.W() + 7.0, this.A());
            g52.R(string2, d5, this.W() + 15.0, this.A());
        }
    }

    private static int u(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (Jb[n5] != null) {
            return n5;
        }
        Object object = Ib[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 43;
                break;
            }
            case 1: {
                n4 = 6;
                break;
            }
            case 2: {
                n4 = 32;
                break;
            }
            case 3: {
                n4 = 14;
                break;
            }
            case 4: {
                n4 = 25;
                break;
            }
            case 5: {
                n4 = 12;
                break;
            }
            case 6: {
                n4 = 8;
                break;
            }
            case 7: {
                n4 = 40;
                break;
            }
            case 8: {
                n4 = 46;
                break;
            }
            case 9: {
                n4 = 22;
                break;
            }
            case 10: {
                n4 = 28;
                break;
            }
            case 11: {
                n4 = 35;
                break;
            }
            case 12: {
                n4 = 48;
                break;
            }
            case 13: {
                n4 = 52;
                break;
            }
            case 14: {
                n4 = 11;
                break;
            }
            case 15: {
                n4 = 34;
                break;
            }
            case 16: {
                n4 = 51;
                break;
            }
            case 17: {
                n4 = 5;
                break;
            }
            case 18: {
                n4 = 23;
                break;
            }
            case 19: {
                n4 = 37;
                break;
            }
            case 20: {
                n4 = 45;
                break;
            }
            case 21: {
                n4 = 44;
                break;
            }
            case 22: {
                n4 = 33;
                break;
            }
            case 23: {
                n4 = 21;
                break;
            }
            case 24: {
                n4 = 38;
                break;
            }
            case 25: {
                n4 = 57;
                break;
            }
            case 26: {
                n4 = 31;
                break;
            }
            case 27: {
                n4 = 26;
                break;
            }
            case 28: {
                n4 = 39;
                break;
            }
            case 29: {
                n4 = 2;
                break;
            }
            case 30: {
                n4 = 4;
                break;
            }
            case 31: {
                n4 = 58;
                break;
            }
            case 32: {
                n4 = 1;
                break;
            }
            case 33: {
                n4 = 59;
                break;
            }
            case 34: {
                n4 = 13;
                break;
            }
            case 35: {
                n4 = 20;
                break;
            }
            case 36: {
                n4 = 10;
                break;
            }
            case 37: {
                n4 = 7;
                break;
            }
            case 38: {
                n4 = 30;
                break;
            }
            case 39: {
                n4 = 49;
                break;
            }
            case 40: {
                n4 = 18;
                break;
            }
            case 41: {
                n4 = 17;
                break;
            }
            case 42: {
                n4 = 55;
                break;
            }
            case 43: {
                n4 = 19;
                break;
            }
            case 44: {
                n4 = 36;
                break;
            }
            case 45: {
                n4 = 53;
                break;
            }
            case 46: {
                n4 = 3;
                break;
            }
            case 47: {
                n4 = 9;
                break;
            }
            case 48: {
                n4 = 47;
                break;
            }
            case 49: {
                n4 = 50;
                break;
            }
            case 50: {
                n4 = 27;
                break;
            }
            case 51: {
                n4 = 16;
                break;
            }
            case 52: {
                n4 = 62;
                break;
            }
            case 53: {
                n4 = 42;
                break;
            }
            case 54: {
                n4 = 54;
                break;
            }
            case 55: {
                n4 = 61;
                break;
            }
            case 56: {
                n4 = 56;
                break;
            }
            case 57: {
                n4 = 24;
                break;
            }
            case 58: {
                n4 = 60;
                break;
            }
            case 59: {
                n4 = 63;
                break;
            }
            case 60: {
                n4 = 29;
                break;
            }
            case 61: {
                n4 = 0;
                break;
            }
            case 62: {
                n4 = 15;
                break;
            }
            default: {
                n4 = 41;
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
        wc.Jb[n5] = new String(cArray);
        return n5;
    }

    private String o() {
        long l10 = fb ^ 0x128E40F6DD97L;
        int n2 = LocalTime.now().getHour();
        try {
            if (n2 >= 12) {
                return wc.l("\u00a3", (int)wc.f("t", (int)27832, (long)(0xC0725C253756E0AL ^ l10)), (long)657644363450557498L, (long)l10);
            }
        }
        catch (O_ o_2) {
            throw wc.a(o_2);
        }
        return wc.l("\u00a3", (int)wc.f("t", (int)32203, (long)(0x353AE4AFD78B7F7EL ^ l10)), (long)657644363450557498L, (long)l10);
    }

    private boolean E() {
        long l10 = fb ^ 0x7C21DF305C5FL;
        try {
            if (this.Kl == null) {
                return false;
            }
        }
        catch (O_ o_2) {
            throw wc.a(o_2);
        }
        return ((jG)this.Kl.b.J()).O().equalsIgnoreCase((String)((Object)wc.l("\u00a3", (int)wc.f("t", (int)26224, (long)(0x39E1598C6EF5650BL ^ l10)), (long)-8581606066569828878L, (long)l10)));
    }

    private void P() {
        float f10 = (float)(this.G() + this.w());
        float f11 = (float)(this.W() + this.b());
        G5 g5 = SE.h.W().T(2.8, true);
        G5 g52 = SE.h.W().T(0.85, true);
        this.p();
        float f12 = (float)(this.G() + this.w() / 2.0);
        float f13 = (float)(this.W() + this.b() / 2.0);
        float f14 = (float)(Math.cos((double)((float)(Integer.parseInt(this.Y()) * 30) + Float.parseFloat(this.j()) / 2.0f) * Math.PI / 180.0 - 1.5707963267948966) * 26.0 + (double)f12);
        float f15 = (float)(Math.sin((double)((float)(Integer.parseInt(this.Y()) * 30) + Float.parseFloat(this.j()) / 2.0f) * Math.PI / 180.0 - 1.5707963267948966) * 26.0 + (double)f13);
        try {
            F8.g(f12, f13, f14, f15, 1.8f, this.s(wc.M.u));
            g5.R(this.Y(), this.G() - g5.D(this.Y()) + 28.0, this.W() + 5.0, this.A());
            g5.R(this.j(), (double)f10 - g5.D(this.j()) - 5.0, (double)f11 - g5.B(this.j()) - 8.0, this.A());
            g52.R(this.c(), this.G() + 10.0, (double)f11 - g52.B(this.c()) - 16.0, this.A());
            g52.R(this.k(false), this.G() + 10.0, (double)f11 - g52.B(this.k(false)) - 8.0, this.A());
            if (!this.Kl.h.s().booleanValue()) {
                g52.R(this.o(), (double)f10 - g52.D(this.o()) - 5.0, this.W() + 5.0, this.A());
            }
        }
        catch (O_ o_2) {
            throw wc.a(o_2);
        }
    }

    private String k(boolean bl2) {
        Object object;
        long l10;
        block4: {
            block3: {
                l10 = fb ^ 0x66DC2F49D311L;
                String string = ZonedDateTime.now().getZone().getId();
                try {
                    if (string == null || !string.contains((CharSequence)((Object)wc.l("\u00a3", (int)wc.f("t", (int)23, (long)(0x450CA4C864818C20L ^ l10)), (long)551154676678863548L, (long)l10)))) break block3;
                }
                catch (O_ o_2) {
                    throw wc.a(o_2);
                }
                object = wc.l("\u00a3", (int)wc.f("t", (int)14661, (long)(0x3FC943EDD605357CL ^ l10)), (long)551154676678863548L, (long)l10);
                break block4;
            }
            object = wc.l("\u00a3", (int)wc.f("t", (int)31898, (long)(0x2A85CE85A9B1F0ACL ^ l10)), (long)551154676678863548L, (long)l10);
        }
        if (!bl2) {
            object = ((String)object).replace((CharSequence)((Object)wc.l("\u00a3", (int)wc.f("t", (int)31982, (long)(0x6FD5684896E370DFL ^ l10)), (long)551154676678863548L, (long)l10)), "");
        }
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern((String)object));
    }

    private void p() {
        float f10 = (float)(this.G() + this.w() / 2.0);
        float f11 = (float)(this.W() + this.b() / 2.0);
        int n2 = 0;
        while (true) {
            block21: {
                block22: {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n2 >= 24) break;
                                                            if (n2 == 8) break block21;
                                                        }
                                                        catch (O_ o_2) {
                                                            throw wc.a(o_2);
                                                        }
                                                        if (n2 == 9) break block21;
                                                    }
                                                    catch (O_ o_3) {
                                                        throw wc.a(o_3);
                                                    }
                                                    if (n2 == 10) break block21;
                                                }
                                                catch (O_ o_4) {
                                                    throw wc.a(o_4);
                                                }
                                                if (n2 == 14) break block21;
                                            }
                                            catch (O_ o_5) {
                                                throw wc.a(o_5);
                                            }
                                            if (n2 == 15) break block21;
                                        }
                                        catch (O_ o_6) {
                                            throw wc.a(o_6);
                                        }
                                        if (n2 == 16) break block21;
                                    }
                                    catch (O_ o_7) {
                                        throw wc.a(o_7);
                                    }
                                    if (n2 == 20) break block21;
                                }
                                catch (O_ o_8) {
                                    throw wc.a(o_8);
                                }
                                if (n2 == 21) break block21;
                            }
                            catch (O_ o_9) {
                                throw wc.a(o_9);
                            }
                            if (n2 != 22) break block22;
                            break block21;
                        }
                        catch (O_ o_10) {
                            throw wc.a(o_10);
                        }
                    }
                    catch (O_ o_11) {
                        throw wc.a(o_11);
                    }
                }
                float f12 = (float)(Math.cos((double)(n2 * 15) * Math.PI / 180.0 - 1.5707963267948966) * 25.0 + (double)f10);
                float f13 = (float)(Math.sin((double)(n2 * 15) * Math.PI / 180.0 - 1.5707963267948966) * 25.0 + (double)f11);
                F8.T((double)(f12 - 1.0f), (double)f13, 0.5, 1.0, this.A());
            }
            ++n2;
        }
    }

    private static Field w(long l10, long l11) {
        int n2 = wc.u(l10, l11);
        Object object = Ib[n2];
        if (object instanceof String) {
            String string = Jb[n2];
            int n3 = string.indexOf(8);
            Class clazz = wc.v(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = wc.v(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wc.k(clazz3, string2, clazz2)) != null) {
                    wc.Ib[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = wc.l(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        wc.Ib[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wc.v(263486683454107L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = wc.f(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    @Override
    public double w() {
        if (this.E()) {
            double d2 = 70.0;
            if (this.Kl.G.s().booleanValue()) {
                d2 += 24.0;
            }
            if (!this.Kl.h.s().booleanValue()) {
                d2 += 12.0;
            }
            return d2;
        }
        return 70.0;
    }

    private static Class v(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = wc.u(l10, l11);
            object = Ib[n2];
            try {
                if (!(object instanceof String)) break block2;
                wc.Ib[n2] = clazz = Class.forName(Jb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                wc.fb = d8.a(-1458347645397179592L, 8869686586692849854L, MethodHandles.lookup().lookupClass()).a(186945618946166L);
                wc.Ib = new Object[5];
                wc.Jb = new String[5];
                wc.T();
                wc.xb = new HashMap<K, V>(13);
                var0 = wc.fb ^ 33745250025013L;
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
                var8_3 = new long[10];
                var5_4 = 0;
                var6_5 = "\u00b6\u00fb\u00d0\u0092\u00fdp[\u00d5rU\u0018\u00c6PMNm\u00ab\u00c6\u0086\u0083\u001f=\u00cb\u00a4,:v\u00df\u00d3\u00b5\u0087 `\u00fe'^}\u00d9\u0081\u00da(\u00da\u00da`^X\u00a2m\u00b3\u008e%\u00d28\u009d\u00e3\u00bczZN\u00e3A'\r\u00fa";
                var7_6 = "\u00b6\u00fb\u00d0\u0092\u00fdp[\u00d5rU\u0018\u00c6PMNm\u00ab\u00c6\u0086\u0083\u001f=\u00cb\u00a4,:v\u00df\u00d3\u00b5\u0087 `\u00fe'^}\u00d9\u0081\u00da(\u00da\u00da`^X\u00a2m\u00b3\u008e%\u00d28\u009d\u00e3\u00bczZN\u00e3A'\r\u00fa".length();
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
                    var6_5 = "\u00ad\u00a6\u00a2\u008e\u00b4\u00fa\u00c7\u00c47\u00e0\u00bfQ\u000e:\u0084\u0019";
                    var7_6 = "\u00ad\u00a6\u00a2\u008e\u00b4\u00fa\u00c7\u00c47\u00e0\u00bfQ\u000e:\u0084\u0019".length();
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
        wc.vb = var8_3;
        wc.wb = new Integer[10];
    }

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wc.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(wc.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

