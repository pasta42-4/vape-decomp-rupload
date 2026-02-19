/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.fS;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.numeric.transform.NumericTransformationEngine469;
import com.security.session.CipherSessionManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fG
extends CipherSessionManager {
    private boolean BA = false;
    private static final Object[] fb;
    private fS Bc = new fS(this);
    private static final long ab;
    private static final long eb;
    private static final String[] lb;

    @Override
    public double e() {
        return this.w();
    }

    @Override
    public String A() {
        long l = ab ^ 0x28A84062EAA9L;
        return fG.d("t", (int)((int)eb), (long)4868393615796420668L, (long)l);
    }

    @Override
    public double b() {
        return 50.0;
    }

    @Override
    public void i() {
    }

    private static void T() {
        Object[] objectArray = fb;
        fb[0] = "I0s";
        objectArray[1] = Integer.TYPE;
        fG.lb[1] = "java/lang/Integer";
        objectArray[2] = "Jg\u001b\r34Ah\nBN,Ro\u0003\u000b";
        objectArray[3] = "\u0007k01\u000f\u0013\fd!~n\u001d\u0007o%$";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "MuJD3sO1\r88r(6\u000f\u000382KtCS,\t\u0011wWR7gA~QRS";
    }

    @Override
    public void R() {
        super.R();
        this.Bc.R();
    }

    @Override
    public void E() {
        try {
            super.E();
            if (!this.BA) {
                this.Bc.R();
                this.BA = true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw fG.a(customSystemException);
        }
        this.Bc.T(this.w());
        this.Bc.w(this.b());
        this.Bc.m(this.G(), this.W() + this.Q().b());
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/fG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fG.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fG.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public fG() {
        this.d().m(false);
        this.d().o(false);
        this.d().i(false);
        this.d().y(false);
        this.d().v(false);
        this.Q(fG.M.W);
        this.a(new NumericTransformationEngine469(this));
        this.N(false);
        this.B(false, false);
        this.L(true);
    }

    @Override
    public double w() {
        return 137.5;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (lb[n4] != null) {
            return n4;
        }
        Object object = fb[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 33;
                break;
            }
            case 1: {
                n3 = 60;
                break;
            }
            case 2: {
                n3 = 46;
                break;
            }
            case 3: {
                n3 = 3;
                break;
            }
            case 4: {
                n3 = 29;
                break;
            }
            case 5: {
                n3 = 30;
                break;
            }
            case 6: {
                n3 = 12;
                break;
            }
            case 7: {
                n3 = 58;
                break;
            }
            case 8: {
                n3 = 19;
                break;
            }
            case 9: {
                n3 = 54;
                break;
            }
            case 10: {
                n3 = 48;
                break;
            }
            case 11: {
                n3 = 8;
                break;
            }
            case 12: {
                n3 = 26;
                break;
            }
            case 13: {
                n3 = 44;
                break;
            }
            case 14: {
                n3 = 37;
                break;
            }
            case 15: {
                n3 = 18;
                break;
            }
            case 16: {
                n3 = 11;
                break;
            }
            case 17: {
                n3 = 0;
                break;
            }
            case 18: {
                n3 = 4;
                break;
            }
            case 19: {
                n3 = 28;
                break;
            }
            case 20: {
                n3 = 32;
                break;
            }
            case 21: {
                n3 = 62;
                break;
            }
            case 22: {
                n3 = 17;
                break;
            }
            case 23: {
                n3 = 15;
                break;
            }
            case 24: {
                n3 = 53;
                break;
            }
            case 25: {
                n3 = 38;
                break;
            }
            case 26: {
                n3 = 1;
                break;
            }
            case 27: {
                n3 = 10;
                break;
            }
            case 28: {
                n3 = 13;
                break;
            }
            case 29: {
                n3 = 59;
                break;
            }
            case 30: {
                n3 = 61;
                break;
            }
            case 31: {
                n3 = 41;
                break;
            }
            case 32: {
                n3 = 9;
                break;
            }
            case 33: {
                n3 = 5;
                break;
            }
            case 34: {
                n3 = 21;
                break;
            }
            case 35: {
                n3 = 6;
                break;
            }
            case 36: {
                n3 = 24;
                break;
            }
            case 37: {
                n3 = 14;
                break;
            }
            case 38: {
                n3 = 31;
                break;
            }
            case 39: {
                n3 = 35;
                break;
            }
            case 40: {
                n3 = 51;
                break;
            }
            case 41: {
                n3 = 23;
                break;
            }
            case 42: {
                n3 = 43;
                break;
            }
            case 43: {
                n3 = 42;
                break;
            }
            case 44: {
                n3 = 47;
                break;
            }
            case 45: {
                n3 = 2;
                break;
            }
            case 46: {
                n3 = 50;
                break;
            }
            case 47: {
                n3 = 7;
                break;
            }
            case 48: {
                n3 = 39;
                break;
            }
            case 49: {
                n3 = 56;
                break;
            }
            case 50: {
                n3 = 63;
                break;
            }
            case 51: {
                n3 = 40;
                break;
            }
            case 52: {
                n3 = 16;
                break;
            }
            case 53: {
                n3 = 22;
                break;
            }
            case 54: {
                n3 = 52;
                break;
            }
            case 55: {
                n3 = 25;
                break;
            }
            case 56: {
                n3 = 49;
                break;
            }
            case 57: {
                n3 = 20;
                break;
            }
            case 58: {
                n3 = 27;
                break;
            }
            case 59: {
                n3 = 36;
                break;
            }
            case 60: {
                n3 = 34;
                break;
            }
            case 61: {
                n3 = 57;
                break;
            }
            case 62: {
                n3 = 45;
                break;
            }
            default: {
                n3 = 55;
            }
        }
        n5 = n3;
        int[] nArray = new int[6];
        int n6 = 0;
        while (n6 < 6) {
            n2 = 7 * (5 - n6);
            n = (int)(l >>> n2 & 0x7FL);
            if ((n -= n5) < 0) {
                n += 128;
            }
            nArray[n6] = n;
            ++n6;
        }
        char[] cArray = ((String)object).toCharArray();
        n2 = 0;
        while (n2 < cArray.length) {
            n = nArray[n2 % nArray.length];
            if (n == 0) break;
            cArray[n2] = (char)(cArray[n2] ^ n);
            ++n2;
        }
        fG.lb[n4] = new String(cArray);
        return n4;
    }

    @Override
    public void u() {
    }

    @Override
    public double z() {
        return 20.0;
    }

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        block0: for (Method method : clazz.getDeclaredMethods()) {
            Class<?>[] classArray2;
            if (!method.getName().equals(string) || method.getReturnType() != clazz2 || (classArray2 = method.getParameterTypes()).length != n) continue;
            for (int i = 0; i < n; ++i) {
                if (classArray2[i] != classArray[i]) continue block0;
            }
            return method;
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fG.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fG.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f6' || c == 'X' || c == '\u00d6' || c == '\u00e4') {
                field = fG.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fG.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 't' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public fS P() {
        return this.Bc;
    }

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fG.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method p(long l, long l2) {
        int n = fG.m(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = lb[n];
                int n3 = string2.indexOf(8);
                clazz3 = fG.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
                int n4 = string2.indexOf(8, ++n3);
                string = string2.substring(n3, n4);
                int n5 = -1;
                int n6 = n4;
                do {
                    ++n5;
                    ++n6;
                } while ((n6 = string2.indexOf(8, n6)) > -1);
                n2 = n5 - 1;
                classArray2 = new Class[n2];
                clazz2 = null;
                n6 = n4 + 1;
                for (int i = 0; i < n5; ++i) {
                    int n7 = string2.indexOf(8, n6);
                    clazz2 = fG.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fG.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fG.fb[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fG.n(278331591355446L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fG.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fG.fb[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fG.n(278331591355446L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchMethodException in ").append(clazz3.getName()).append(' ').append(clazz2.getName()).append(' ').append(string).append('(');
            int n8 = 0;
            while (n8 < n2) {
                stringBuffer.append(classArray2[n8].getName());
                if (++n8 >= n2) continue;
                stringBuffer.append(", ");
            }
            stringBuffer.append(')');
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Method)object;
    }

    @Override
    public void r(boolean bl, boolean bl2) {
        super.r(bl, bl2);
        this.Bc.N(bl);
    }

    private static Field o(long l, long l2) {
        int n = fG.m(l, l2);
        Object object = fb[n];
        if (object instanceof String) {
            String string = lb[n];
            int n2 = string.indexOf(8);
            Class clazz = fG.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fG.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fG.g(clazz3, string2, clazz2)) != null) {
                    fG.fb[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fG.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fG.fb[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fG.n(278331591355446L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fG.m(l, l2);
            object = fb[n];
            try {
                if (!(object instanceof String)) break block2;
                fG.fb[n] = clazz = Class.forName(lb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ab = MultiContainerRegistry.a(-5499665230703032232L, -8609864207827730208L, MethodHandles.lookup().lookupClass()).a(41351415958262L);
        fb = new Object[5];
        lb = new String[5];
        fG.T();
        long l = ab ^ 0x4F07A07CED23L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 1376887825874450884L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                eb = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fG.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

