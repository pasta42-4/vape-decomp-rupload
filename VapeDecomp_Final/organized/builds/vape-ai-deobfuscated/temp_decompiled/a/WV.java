/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.B8;
import a.G4;
import a.O_;
import a.SE;
import a.Sz;
import a.d8;
import a.ht;
import a.w_;
import a.yG;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class wv
extends yG {
    private static final String[] fb;
    private final Map<B8, w_> zd;
    private boolean z2;
    private static final long ab;
    private static boolean zU;
    double zj;
    private static final Object[] eb;
    private static final long bb;

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = wv.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i10 = 0; i10 < classArray.length; ++i10) {
                field = wv.f(classArray[i10], string, clazz2);
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

    public static boolean g() {
        return zU;
    }

    private static Method l(long l10, long l11) {
        int n2 = wv.i(l10, l11);
        Object object = eb[n2];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n3;
            String string;
            Class clazz3;
            block10: {
                String string2 = fb[n2];
                int n4 = string2.indexOf(8);
                clazz3 = wv.j(Long.parseLong(string2.substring(0, n4), 36), 0L);
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
                    clazz2 = wv.j(Long.parseLong(string2.substring(n7, n8), 36), 0L);
                    if (i10 < n3) {
                        classArray2[i10] = clazz2;
                    }
                    n7 = n8 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = wv.e(clazz, string, clazz2, n3, classArray2)) != null) {
                        wv.eb[n2] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = wv.j(243228868834941L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i11 = 0; i11 < classArray.length; ++i11) {
                        Method method = wv.f(classArray[i11], string, clazz2, n3, classArray2);
                        if (method == null) continue;
                        wv.eb[n2] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = wv.j(243228868834941L, 0L);
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

    public void F() {
        List<ht> list = this.A();
        int n2 = 0;
        while (true) {
            block6: {
                block5: {
                    try {
                        try {
                            if (n2 >= list.size()) break;
                            if (n2 != 0) break block5;
                        }
                        catch (O_ o_2) {
                            throw wv.a(o_2);
                        }
                        list.get(n2).N(true);
                        break block6;
                    }
                    catch (O_ o_3) {
                        throw wv.a(o_3);
                    }
                }
                list.get(n2).N(this.z2);
            }
            ++n2;
        }
        this.R(0.0);
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n2 = objectArray.length - 2;
        long l10 = (Long)objectArray[n2];
        long l11 = (Long)objectArray[++n2];
        MethodHandle methodHandle = wv.c(lookup, mutableCallSite, string, methodType, l10, l11);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public void v() {
        boolean bl2;
        try {
            wv wv2 = this;
            bl2 = !this.z2;
        }
        catch (O_ o_2) {
            throw wv.a(o_2);
        }
        wv2.z2 = bl2;
        this.Y(this.z2);
        this.F();
    }

    public wv() {
        long l10 = ab ^ 0x34B237C3E0E2L;
        super(100.0, 0.0);
        this.zd = new LinkedHashMap<B8, w_>();
        this.zj = 0.0;
        this.i(false);
        this.O(G4.OUTSIDE);
        this.d().f((String)((Object)wv.c("\u00a5", (int)((int)bb), (long)914925771461356304L, (long)l10)));
    }

    @Override
    public double e() {
        return 100.0;
    }

    private static O_ a(O_ o_2) {
        return o_2;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n2, Class[] classArray) {
        Method method = wv.e(clazz, string, clazz2, n2, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i10 = 0; i10 < classArray2.length; ++i10) {
                method = wv.f(classArray2[i10], string, clazz2, n2, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void u() {
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/wv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void V(boolean bl2) {
        zU = bl2;
    }

    private static Field k(long l10, long l11) {
        int n2 = wv.i(l10, l11);
        Object object = eb[n2];
        if (object instanceof String) {
            String string = fb[n2];
            int n3 = string.indexOf(8);
            Class clazz = wv.j(Long.parseLong(string.substring(0, n3), 36), 0L);
            int n4 = string.indexOf(8, ++n3);
            String string2 = string.substring(n3, n4);
            Class clazz2 = wv.j(Long.parseLong(string.substring(++n4), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = wv.e(clazz3, string2, clazz2)) != null) {
                    wv.eb[n2] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i10 = 0; i10 < classArray.length; ++i10) {
                        field = wv.f(classArray[i10], string2, clazz2);
                        if (field == null) continue;
                        wv.eb[n2] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = wv.j(243228868834941L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static int i(long l10, long l11) {
        int n2;
        int n3;
        int n4;
        int n5 = (int)((l10 ^= l11 << 48 | l11) >>> 46);
        if (fb[n5] != null) {
            return n5;
        }
        Object object = eb[n5];
        if (!(object instanceof String)) {
            return n5;
        }
        int n6 = 0;
        switch ((int)(l10 >>> 42 & 0x3FL)) {
            case 0: {
                n4 = 21;
                break;
            }
            case 1: {
                n4 = 44;
                break;
            }
            case 2: {
                n4 = 34;
                break;
            }
            case 3: {
                n4 = 38;
                break;
            }
            case 4: {
                n4 = 60;
                break;
            }
            case 5: {
                n4 = 5;
                break;
            }
            case 6: {
                n4 = 61;
                break;
            }
            case 7: {
                n4 = 6;
                break;
            }
            case 8: {
                n4 = 43;
                break;
            }
            case 9: {
                n4 = 1;
                break;
            }
            case 10: {
                n4 = 50;
                break;
            }
            case 11: {
                n4 = 4;
                break;
            }
            case 12: {
                n4 = 26;
                break;
            }
            case 13: {
                n4 = 2;
                break;
            }
            case 14: {
                n4 = 23;
                break;
            }
            case 15: {
                n4 = 40;
                break;
            }
            case 16: {
                n4 = 39;
                break;
            }
            case 17: {
                n4 = 33;
                break;
            }
            case 18: {
                n4 = 56;
                break;
            }
            case 19: {
                n4 = 53;
                break;
            }
            case 20: {
                n4 = 37;
                break;
            }
            case 21: {
                n4 = 3;
                break;
            }
            case 22: {
                n4 = 22;
                break;
            }
            case 23: {
                n4 = 36;
                break;
            }
            case 24: {
                n4 = 11;
                break;
            }
            case 25: {
                n4 = 57;
                break;
            }
            case 26: {
                n4 = 45;
                break;
            }
            case 27: {
                n4 = 9;
                break;
            }
            case 28: {
                n4 = 46;
                break;
            }
            case 29: {
                n4 = 24;
                break;
            }
            case 30: {
                n4 = 12;
                break;
            }
            case 31: {
                n4 = 15;
                break;
            }
            case 32: {
                n4 = 0;
                break;
            }
            case 33: {
                n4 = 32;
                break;
            }
            case 34: {
                n4 = 17;
                break;
            }
            case 35: {
                n4 = 41;
                break;
            }
            case 36: {
                n4 = 8;
                break;
            }
            case 37: {
                n4 = 51;
                break;
            }
            case 38: {
                n4 = 62;
                break;
            }
            case 39: {
                n4 = 20;
                break;
            }
            case 40: {
                n4 = 54;
                break;
            }
            case 41: {
                n4 = 10;
                break;
            }
            case 42: {
                n4 = 58;
                break;
            }
            case 43: {
                n4 = 28;
                break;
            }
            case 44: {
                n4 = 42;
                break;
            }
            case 45: {
                n4 = 48;
                break;
            }
            case 46: {
                n4 = 18;
                break;
            }
            case 47: {
                n4 = 47;
                break;
            }
            case 48: {
                n4 = 59;
                break;
            }
            case 49: {
                n4 = 14;
                break;
            }
            case 50: {
                n4 = 30;
                break;
            }
            case 51: {
                n4 = 49;
                break;
            }
            case 52: {
                n4 = 16;
                break;
            }
            case 53: {
                n4 = 63;
                break;
            }
            case 54: {
                n4 = 35;
                break;
            }
            case 55: {
                n4 = 52;
                break;
            }
            case 56: {
                n4 = 27;
                break;
            }
            case 57: {
                n4 = 55;
                break;
            }
            case 58: {
                n4 = 31;
                break;
            }
            case 59: {
                n4 = 29;
                break;
            }
            case 60: {
                n4 = 13;
                break;
            }
            case 61: {
                n4 = 25;
                break;
            }
            case 62: {
                n4 = 7;
                break;
            }
            default: {
                n4 = 19;
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
        wv.fb[n5] = new String(cArray);
        return n5;
    }

    private static Class j(long l10, long l11) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n2 = wv.i(l10, l11);
            object = eb[n2];
            try {
                if (!(object instanceof String)) break block2;
                wv.eb[n2] = clazz = Class.forName(fb[n2]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(B8 b82) {
        Map<B8, w_> map = this.zd;
        synchronized (map) {
            w_ w_2 = this.zd.get(b82);
            if (w_2 == null) {
                return;
            }
            this.J(w_2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void J(w_ w_2) {
        Map<B8, w_> map = this.zd;
        synchronized (map) {
            this.zd.remove(w_2.d());
            this.J((ht)w_2);
            this.F();
        }
    }

    @Override
    public void C() {
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
        ab = d8.a(7753382085025141618L, -2965440082384628043L, MethodHandles.lookup().lookupClass()).a(251902803347133L);
        eb = new Object[5];
        fb = new String[5];
        wv.x();
        long l10 = ab ^ 0x4FCCEB3BC868L;
        wv.V(false);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l10 >>> 56);
        int n2 = 1;
        while (true) {
            if (n2 >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l11 = -5276481270725458014L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
                bb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n2] = (byte)(l10 << n2 * 8 >>> 56);
            ++n2;
        }
    }

    private static void x() {
        Object[] objectArray = eb;
        eb[0] = "LmC";
        objectArray[1] = Integer.TYPE;
        wv.fb[1] = "java/lang/Integer";
        objectArray[2] = "c\u0015/_s\u0003h\u001a>\u0010\u000e\u001b{\u001d7Y";
        objectArray[3] = "\u0018_(x\u0016%\u0013P97w+\u0018[=m";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "evw\u0019sqs*\u0010\r9\u0016 zlZ'}\u007f4m\u0019B/h;v\u001f,{`8bf";
    }

    @Override
    public void G() {
        block7: {
            double d2;
            block8: {
                int n2;
                block6: {
                    n2 = SE.h.O().p().B().size();
                    try {
                        if (n2 >= 1) break block6;
                        this.zj = 1.0;
                        break block7;
                    }
                    catch (O_ o_2) {
                        throw wv.a(o_2);
                    }
                }
                try {
                    if (n2 >= 2) break block8;
                    this.zj = 17.0;
                    break block7;
                }
                catch (O_ o_3) {
                    throw wv.a(o_3);
                }
            }
            try {
                wv wv2 = this;
                d2 = this.z2 ? 48.0 : 17.0;
            }
            catch (O_ o_4) {
                throw wv.a(o_4);
            }
            wv2.zj = d2;
        }
        this.i(this.zj);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l10, long l11) {
        char c10 = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c10 == '\u00df' || c10 == 'e' || c10 == 'I' || c10 == 'Q') {
                field = wv.k(l10, l11);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c10 == '\u00df' ? lookup.findGetter(clazz, string2, clazz2) : (c10 == 'e' ? lookup.findSetter(clazz, string2, clazz2) : (c10 == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = wv.l(l10, l11);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c10 == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c10 == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static boolean U() {
        boolean bl2 = wv.g();
        try {
            if (!bl2) {
                return true;
            }
        }
        catch (O_ o_2) {
            throw wv.a(o_2);
        }
        return false;
    }

    @Override
    public double z() {
        return this.zj;
    }

    @Override
    public void i() {
    }

    @Override
    public void Z(Sz sz2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(w_ w_2) {
        Map<B8, w_> map = this.zd;
        synchronized (map) {
            this.zd.put(w_2.d(), w_2);
            this.n(w_2, new Object[0]);
            this.F();
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(wv.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

