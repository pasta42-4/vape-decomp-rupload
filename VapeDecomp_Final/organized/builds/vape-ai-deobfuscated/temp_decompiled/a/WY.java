/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ao;
import a.EP;
import a.Na;
import a.O_;
import a.QX;
import a.RK;
import a.V4;
import a.d8;
import a.ht;
import a.jH;
import a.kX;
import a.wN;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wy
extends wN {
    private RK uX;
    private static final Object[] wb;
    private RK u9;
    private static final String[] xb;
    private jH ug;
    private boolean uj = false;
    private RK uv;
    private static final long vb;
    private static final long fb;
    private RK uH;
    private ArrayList<RK> uq = new ArrayList();

    private static Field k(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public double w() {
        double d2;
        try {
            if (this.ug == null) {
                return 70.0;
            }
        }
        catch (O_ o_2) {
            throw wy.a(o_2);
        }
        try {
            d2 = this.ug.T.s() != false ? 26.0 : 54.0;
        }
        catch (O_ o_3) {
            throw wy.a(o_3);
        }
        return d2;
    }

    private static void X() {
        Object[] objectArray = wb;
        wb[0] = "\u007f\u001fp";
        objectArray[1] = Integer.TYPE;
        wy.xb[1] = "java/lang/Integer";
        objectArray[2] = "\u0002wFx\\\u001f\txW7!\u0007\u001a\u007f^~";
        objectArray[3] = "d&\u001f=Guo)\u000er&{d\"\n(";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "Px\u0014J1(@y\u00005'1:-TV*;\nq\u000eI)J\u0003e\f\u000b<,@u\n\u0004L";
    }

    private static Field w(long l10, long l11) {
        int n2 = wy.u(l10, l11);
        Object object = wb[n2];
        if (object instanceof String) {
            String string = xb[n2];
            int n3 = string.indexOf(8);
            Class clazz = wy.v(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = wy.v(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wy.k(clazz3, string2, clazz2)) != null) {
                    wy.wb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = wy.l(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        wy.wb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wy.v(218117043557335L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void T() {
        boolean bl2;
        RK rK2;
        boolean bl3;
        double d2;
        block17: {
            for (ht ht2 : this.A()) {
                if (!(ht2 instanceof RK)) continue;
                RK rK3 = (RK)ht2;
                try {
                    if (!rK3.A().y().r()) continue;
                    rK3.N(true);
                }
                catch (O_ o_2) {
                    throw wy.a(o_2);
                }
            }
            d2 = this.W() + 2.0;
            bl3 = this.ug.T.s();
            rK2 = null;
            bl2 = false;
            try {
                if (Ao.K.P || this.u()) break block17;
            }
            catch (O_ o_3) {
                throw wy.a(o_3);
            }
            bl2 = true;
        }
        for (RK rK4 : this.uq) {
            if (rK4.f()) {
                rK4.b(this.G() + 2.0);
                rK4.M(d2);
                d2 += (double)this.W();
                if (bl3) {
                    d2 += 2.0;
                }
                rK4.Z(false);
                rK2 = rK4;
            }
            try {
                rK4.I(bl2);
                if (bl2) {
                    rK4.N(true);
                }
            }
            catch (O_ o_4) {
                throw wy.a(o_4);
            }
            rK4.u(bl3);
        }
        try {
            if (rK2 != null) {
                rK2.Z(true);
            }
        }
        catch (O_ o_5) {
            throw wy.a(o_5);
        }
        try {
            if (!this.uj) {
                this.A();
                this.uj = true;
            }
        }
        catch (O_ o_6) {
            throw wy.a(o_6);
        }
    }

    private static MethodHandle f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == 'l' || c10 == 'W' || c10 == '\u00d1' || c10 == 'Q') {
                field = wy.w(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == 'l' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == '\u00d1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wy.x(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == '\u00fc' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00e9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        Method method = wy.k(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = wy.l(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class v(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = wy.u(l10, l11);
            object = wb[n2];
            try {
                if (!(object instanceof String)) break block2;
                wy.wb[n2] = clazz = Class.forName(xb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static int u(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (xb[n5] != null) {
            return n5;
        }
        Object object = wb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 2;
                break;
            }
            case 1: {
                n4 = 16;
                break;
            }
            case 2: {
                n4 = 32;
                break;
            }
            case 3: {
                n4 = 56;
                break;
            }
            case 4: {
                n4 = 27;
                break;
            }
            case 5: {
                n4 = 13;
                break;
            }
            case 6: {
                n4 = 6;
                break;
            }
            case 7: {
                n4 = 8;
                break;
            }
            case 8: {
                n4 = 34;
                break;
            }
            case 9: {
                n4 = 28;
                break;
            }
            case 10: {
                n4 = 19;
                break;
            }
            case 11: {
                n4 = 52;
                break;
            }
            case 12: {
                n4 = 5;
                break;
            }
            case 13: {
                n4 = 10;
                break;
            }
            case 14: {
                n4 = 23;
                break;
            }
            case 15: {
                n4 = 51;
                break;
            }
            case 16: {
                n4 = 18;
                break;
            }
            case 17: {
                n4 = 17;
                break;
            }
            case 18: {
                n4 = 4;
                break;
            }
            case 19: {
                n4 = 20;
                break;
            }
            case 20: {
                n4 = 25;
                break;
            }
            case 21: {
                n4 = 30;
                break;
            }
            case 22: {
                n4 = 3;
                break;
            }
            case 23: {
                n4 = 44;
                break;
            }
            case 24: {
                n4 = 11;
                break;
            }
            case 25: {
                n4 = 43;
                break;
            }
            case 26: {
                n4 = 53;
                break;
            }
            case 27: {
                n4 = 54;
                break;
            }
            case 28: {
                n4 = 49;
                break;
            }
            case 29: {
                n4 = 9;
                break;
            }
            case 30: {
                n4 = 41;
                break;
            }
            case 31: {
                n4 = 15;
                break;
            }
            case 32: {
                n4 = 42;
                break;
            }
            case 33: {
                n4 = 47;
                break;
            }
            case 34: {
                n4 = 63;
                break;
            }
            case 35: {
                n4 = 40;
                break;
            }
            case 36: {
                n4 = 1;
                break;
            }
            case 37: {
                n4 = 61;
                break;
            }
            case 38: {
                n4 = 12;
                break;
            }
            case 39: {
                n4 = 26;
                break;
            }
            case 40: {
                n4 = 48;
                break;
            }
            case 41: {
                n4 = 22;
                break;
            }
            case 42: {
                n4 = 38;
                break;
            }
            case 43: {
                n4 = 57;
                break;
            }
            case 44: {
                n4 = 36;
                break;
            }
            case 45: {
                n4 = 50;
                break;
            }
            case 46: {
                n4 = 7;
                break;
            }
            case 47: {
                n4 = 58;
                break;
            }
            case 48: {
                n4 = 59;
                break;
            }
            case 49: {
                n4 = 62;
                break;
            }
            case 50: {
                n4 = 39;
                break;
            }
            case 51: {
                n4 = 37;
                break;
            }
            case 52: {
                n4 = 24;
                break;
            }
            case 53: {
                n4 = 45;
                break;
            }
            case 54: {
                n4 = 55;
                break;
            }
            case 55: {
                n4 = 46;
                break;
            }
            case 56: {
                n4 = 35;
                break;
            }
            case 57: {
                n4 = 31;
                break;
            }
            case 58: {
                n4 = 0;
                break;
            }
            case 59: {
                n4 = 21;
                break;
            }
            case 60: {
                n4 = 33;
                break;
            }
            case 61: {
                n4 = 60;
                break;
            }
            case 62: {
                n4 = 29;
                break;
            }
            default: {
                n4 = 14;
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
        wy.xb[n5] = new String(cArray);
        return n5;
    }

    private static Method x(long l10, long l11) {
        int n2 = wy.u(l10, l11);
        Object object = wb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = xb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = wy.v(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = wy.v(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wy.k(clazz, string, clazz2, n3, classArray2)) != null) {
                        wy.wb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wy.v(218117043557335L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = wy.l(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        wy.wb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wy.v(218117043557335L, 0L);
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

    private static CallSite f(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public String A() {
        long l10 = fb ^ 0x43960C3AEC82L;
        return wy.f("\u00e9", (int)((int)vb), (long)4868436836870333915L, (long)l10);
    }

    private static Object f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = wy.f(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public double b() {
        int n2 = 0;
        for (ht ht2 : this.A()) {
            try {
                try {
                    if (!(ht2 instanceof RK) || !ht2.f()) continue;
                }
                catch (O_ o_2) {
                    throw wy.a(o_2);
                }
                ++n2;
            }
            catch (O_ o_3) {
                throw wy.a(o_3);
            }
        }
        try {
            if (n2 == 0) {
                return 0.0;
            }
        }
        catch (O_ o_4) {
            throw wy.a(o_4);
        }
        try {
            if (this.ug == null) {
                return 20.0;
            }
        }
        catch (O_ o_5) {
            throw wy.a(o_5);
        }
        int n3 = this.W();
        try {
            if (this.ug.T.s().booleanValue()) {
                n3 += 2;
            }
        }
        catch (O_ o_6) {
            throw wy.a(o_6);
        }
        double d2 = n2 * n3 + 4;
        if (n2 == 1) {
            d2 = n3 + 4;
        }
        if (this.ug.T.s().booleanValue()) {
            d2 -= 2.0;
        }
        return d2;
    }

    public wy() {
        super(jH.class);
        this.ug = (jH)this.t();
        int n2 = 310;
        int n3 = 311;
        int n4 = 312;
        int n5 = 313;
        if (Na.MC_1_21_10.H()) {
            n2 = 970;
            n3 = 971;
            n4 = 972;
            n5 = 973;
        } else if (Na.MC_1_21_0.H()) {
            n2 = 899;
            n3 = 900;
            n4 = 901;
            n5 = 902;
        } else if (kX.C() >= 50) {
            n2 = 868;
            n3 = 869;
            n4 = 870;
            n5 = 871;
        } else if (kX.C() >= 37) {
            n2 = 750;
            n3 = 751;
            n4 = 752;
            n5 = 753;
        } else if (kX.C() >= 35) {
            n2 = 634;
            n3 = 635;
            n4 = 636;
            n5 = 637;
        }
        this.uX = new RK(this, 5, V4.d(QX.Y(n2)));
        this.u9 = new RK(this, 6, V4.d(QX.Y(n3)));
        this.uH = new RK(this, 7, V4.d(QX.Y(n4)));
        this.uv = new RK(this, 8, V4.d(QX.Y(n5)));
        this.uq.add(this.uX);
        this.uq.add(this.u9);
        this.uq.add(this.uH);
        this.uq.add(this.uv);
        this.o(this.uX, this.u9, this.uH, this.uv);
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

    @Override
    public void V() {
        try {
            if (EP.U().r()) {
                this.T();
            }
        }
        catch (O_ o_2) {
            throw wy.a(o_2);
        }
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    public int W() {
        int n2;
        try {
            if (this.ug == null) {
                return 20;
            }
        }
        catch (O_ o_2) {
            throw wy.a(o_2);
        }
        try {
            n2 = this.ug.T.s() != false ? 22 : 20;
        }
        catch (O_ o_3) {
            throw wy.a(o_3);
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        fb = d8.a(1287159385973180802L, -1461253921495721023L, MethodHandles.lookup().lookupClass()).a(177059728523221L);
        wb = new Object[5];
        xb = new String[5];
        wy.X();
        long l10 = fb ^ 0x7D9971A07711L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = 7625255404911760339L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                vb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    private static Field l(Class clazz, String string, Class clazz2) {
        Field field = wy.k(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = wy.l(classArray[i10], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean u() {
        for (RK rK2 : this.uq) {
            try {
                if (!rK2.o().r()) continue;
                return true;
            }
            catch (O_ o_2) {
                throw wy.a(o_2);
            }
        }
        return false;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wy.class, "f", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

