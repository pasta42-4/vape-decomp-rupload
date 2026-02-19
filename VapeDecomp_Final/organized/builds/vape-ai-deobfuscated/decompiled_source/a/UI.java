/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.HK;
import com.collections.management.MultiContainerRegistry;
import com.crypto.protocol.CryptoProtocolEngine;
import com.reflection.metadata.ReflectionMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ui
extends CryptoProtocolEngine {
    private HK N;
    private static final Object[] b;
    private static final long a;
    private static final String[] c;

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ui" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = Ui.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Ui.e(l, l2);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                Ui.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u0002ykk";
        objectArray[1] = "c:%>K/\u0016\u001a.1Z`{\u001a.,Nu";
        objectArray[2] = "Ui@`";
        objectArray[3] = "\u0019@\u0003;'X\u0012O\u0012tFV\u0019D\u0016.";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0018O\u001b;@M\u001f@\u0006En=\u000eQ\u000e/\u0012\u0000\n@\u0016E\u0010OBV\u001f#WSKN|";
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field g(long l, long l2) {
        int n = Ui.e(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = Ui.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Ui.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Ui.c(clazz3, string2, clazz2)) != null) {
                    Ui.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Ui.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Ui.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Ui.f(252259365888494L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = Ui.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Ui.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private Object y(int n, int n2, int n3) {
        return this.N.A(n, n2, n3);
    }

    private static Method h(long l, long l2) {
        int n = Ui.e(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = Ui.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = Ui.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Ui.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        Ui.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Ui.f(252259365888494L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = Ui.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        Ui.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Ui.f(252259365888494L, 0L);
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

    static {
        a = MultiContainerRegistry.a(409739616734913049L, -2198100079351642533L, MethodHandles.lookup().lookupClass()).a(508120572682L);
        b = new Object[5];
        c = new String[5];
        Ui.a();
    }

    static Object S(Ui ui, int n, int n2, int n3) {
        return ui.y(n, n2, n3);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (c[n4] != null) {
            return n4;
        }
        Object object = b[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 55;
                break;
            }
            case 1: {
                n3 = 47;
                break;
            }
            case 2: {
                n3 = 12;
                break;
            }
            case 3: {
                n3 = 32;
                break;
            }
            case 4: {
                n3 = 54;
                break;
            }
            case 5: {
                n3 = 56;
                break;
            }
            case 6: {
                n3 = 33;
                break;
            }
            case 7: {
                n3 = 2;
                break;
            }
            case 8: {
                n3 = 42;
                break;
            }
            case 9: {
                n3 = 43;
                break;
            }
            case 10: {
                n3 = 1;
                break;
            }
            case 11: {
                n3 = 49;
                break;
            }
            case 12: {
                n3 = 62;
                break;
            }
            case 13: {
                n3 = 3;
                break;
            }
            case 14: {
                n3 = 63;
                break;
            }
            case 15: {
                n3 = 45;
                break;
            }
            case 16: {
                n3 = 18;
                break;
            }
            case 17: {
                n3 = 35;
                break;
            }
            case 18: {
                n3 = 38;
                break;
            }
            case 19: {
                n3 = 41;
                break;
            }
            case 20: {
                n3 = 59;
                break;
            }
            case 21: {
                n3 = 6;
                break;
            }
            case 22: {
                n3 = 4;
                break;
            }
            case 23: {
                n3 = 14;
                break;
            }
            case 24: {
                n3 = 60;
                break;
            }
            case 25: {
                n3 = 28;
                break;
            }
            case 26: {
                n3 = 0;
                break;
            }
            case 27: {
                n3 = 30;
                break;
            }
            case 28: {
                n3 = 7;
                break;
            }
            case 29: {
                n3 = 8;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 9;
                break;
            }
            case 32: {
                n3 = 44;
                break;
            }
            case 33: {
                n3 = 27;
                break;
            }
            case 34: {
                n3 = 48;
                break;
            }
            case 35: {
                n3 = 21;
                break;
            }
            case 36: {
                n3 = 57;
                break;
            }
            case 37: {
                n3 = 15;
                break;
            }
            case 38: {
                n3 = 23;
                break;
            }
            case 39: {
                n3 = 20;
                break;
            }
            case 40: {
                n3 = 36;
                break;
            }
            case 41: {
                n3 = 53;
                break;
            }
            case 42: {
                n3 = 10;
                break;
            }
            case 43: {
                n3 = 37;
                break;
            }
            case 44: {
                n3 = 16;
                break;
            }
            case 45: {
                n3 = 39;
                break;
            }
            case 46: {
                n3 = 52;
                break;
            }
            case 47: {
                n3 = 13;
                break;
            }
            case 48: {
                n3 = 25;
                break;
            }
            case 49: {
                n3 = 24;
                break;
            }
            case 50: {
                n3 = 11;
                break;
            }
            case 51: {
                n3 = 5;
                break;
            }
            case 52: {
                n3 = 61;
                break;
            }
            case 53: {
                n3 = 51;
                break;
            }
            case 54: {
                n3 = 40;
                break;
            }
            case 55: {
                n3 = 26;
                break;
            }
            case 56: {
                n3 = 34;
                break;
            }
            case 57: {
                n3 = 58;
                break;
            }
            case 58: {
                n3 = 31;
                break;
            }
            case 59: {
                n3 = 22;
                break;
            }
            case 60: {
                n3 = 29;
                break;
            }
            case 61: {
                n3 = 19;
                break;
            }
            case 62: {
                n3 = 46;
                break;
            }
            default: {
                n3 = 50;
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
        Ui.c[n4] = new String(cArray);
        return n4;
    }

    public Ui() {
        long l = a ^ 0x2C90F81B981CL;
        super(ReflectionMetadataResolver.bX);
        this.N = Ui.b("\u00fa", (Object)this, (Object)new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, (long)-4111167617421398760L, (long)l);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Ui.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Ui.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 's' || c == '\u00f3' || c == 'E' || c == '\u00aa') {
                field = Ui.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 's' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Ui.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fa' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Ui.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

