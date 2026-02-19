/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package com.configuration.management;

import a.a;
import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.math.geometry.GeometryCalculator;
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
import org.lwjgl.input.Keyboard;

public class ConfigurationParameterResolver {
    private static final long a = MultiContainerRegistry.a(4772645086822750698L, -1607393005379565508L, MethodHandles.lookup().lookupClass()).a(276487586711109L);
    private static final String[] f;
    static int[] I;
    private static final Integer[] c;
    private static final long[] b;
    private static final Map d;
    private static final Object[] e;

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ConfigurationParameterResolver.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ConfigurationParameterResolver.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ConfigurationParameterResolver.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ConfigurationParameterResolver.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = ConfigurationParameterResolver.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ConfigurationParameterResolver.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ConfigurationParameterResolver.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ConfigurationParameterResolver.a(clazz3, string2, clazz2)) != null) {
                    ConfigurationParameterResolver.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ConfigurationParameterResolver.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ConfigurationParameterResolver.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ConfigurationParameterResolver.b(218122757655759L, 0L);
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

    private static Method d(long l, long l2) {
        int n = ConfigurationParameterResolver.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = ConfigurationParameterResolver.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ConfigurationParameterResolver.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ConfigurationParameterResolver.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ConfigurationParameterResolver.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ConfigurationParameterResolver.b(218122757655759L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ConfigurationParameterResolver.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ConfigurationParameterResolver.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ConfigurationParameterResolver.b(218122757655759L, 0L);
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

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ji" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static int R(long l) {
        long l2 = l & 0xFFFFFFFFFFFF0000L;
        try {
            if (l2 == 131072L) {
                return 3;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterResolver.a(customSystemException);
        }
        try {
            if (l2 == 65536L) {
                return 4;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterResolver.a(customSystemException);
        }
        return 5;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Ji" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void l() {
        block4: {
            try {
                try {
                    if (GeometryCalculator.C() >= 35 || !Keyboard.areRepeatEventsEnabled()) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationParameterResolver.a(customSystemException);
                }
                Keyboard.enableRepeatEvents((boolean)false);
            }
            catch (CustomSystemException customSystemException) {
                throw ConfigurationParameterResolver.a(customSystemException);
            }
        }
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = ",O\u0012";
        objectArray[1] = Integer.TYPE;
        ConfigurationParameterResolver.f[1] = "java/lang/Integer";
        objectArray[2] = "0T]n]a;[L! y(\\Eh";
        objectArray[3] = " y?\u00109!+v._X/ }*\u0005";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "!FpNW^vIM\u001d\u0015=g\u0007 \u0014PB}\u00054vWAb]\"\u0013\u001fC&\u0001M";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ConfigurationParameterResolver.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == '\u00a5' || c == 'K' || c == '\u00ff') {
                field = ConfigurationParameterResolver.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ConfigurationParameterResolver.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'e' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ConfigurationParameterResolver.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ConfigurationParameterResolver.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static String P(int n) {
        long l = a ^ 0x74D7A418B5D1L;
        try {
            if (n == 192) {
                return ConfigurationParameterResolver.b("e", (int)ConfigurationParameterResolver.a("b", (int)29923, (long)(0x16AB2B71EB7A80B7L ^ l)), (long)-860392180789441854L, (long)l);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterResolver.a(customSystemException);
        }
        int n2 = a.a.mvk(n, 0);
        switch (n) {
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 40: 
            case 45: 
            case 46: 
            case 111: 
            case 144: {
                n2 |= 0x100;
            }
        }
        String string = a.a.gkn(n2 << 16);
        return string;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n4] != null) {
            return n4;
        }
        Object object = e[n4];
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
                n3 = 28;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 3: {
                n3 = 53;
                break;
            }
            case 4: {
                n3 = 16;
                break;
            }
            case 5: {
                n3 = 14;
                break;
            }
            case 6: {
                n3 = 22;
                break;
            }
            case 7: {
                n3 = 43;
                break;
            }
            case 8: {
                n3 = 27;
                break;
            }
            case 9: {
                n3 = 58;
                break;
            }
            case 10: {
                n3 = 46;
                break;
            }
            case 11: {
                n3 = 62;
                break;
            }
            case 12: {
                n3 = 23;
                break;
            }
            case 13: {
                n3 = 25;
                break;
            }
            case 14: {
                n3 = 36;
                break;
            }
            case 15: {
                n3 = 48;
                break;
            }
            case 16: {
                n3 = 40;
                break;
            }
            case 17: {
                n3 = 18;
                break;
            }
            case 18: {
                n3 = 31;
                break;
            }
            case 19: {
                n3 = 39;
                break;
            }
            case 20: {
                n3 = 8;
                break;
            }
            case 21: {
                n3 = 50;
                break;
            }
            case 22: {
                n3 = 42;
                break;
            }
            case 23: {
                n3 = 6;
                break;
            }
            case 24: {
                n3 = 44;
                break;
            }
            case 25: {
                n3 = 12;
                break;
            }
            case 26: {
                n3 = 7;
                break;
            }
            case 27: {
                n3 = 15;
                break;
            }
            case 28: {
                n3 = 17;
                break;
            }
            case 29: {
                n3 = 60;
                break;
            }
            case 30: {
                n3 = 41;
                break;
            }
            case 31: {
                n3 = 47;
                break;
            }
            case 32: {
                n3 = 19;
                break;
            }
            case 33: {
                n3 = 13;
                break;
            }
            case 34: {
                n3 = 1;
                break;
            }
            case 35: {
                n3 = 30;
                break;
            }
            case 36: {
                n3 = 52;
                break;
            }
            case 37: {
                n3 = 45;
                break;
            }
            case 38: {
                n3 = 35;
                break;
            }
            case 39: {
                n3 = 10;
                break;
            }
            case 40: {
                n3 = 32;
                break;
            }
            case 41: {
                n3 = 5;
                break;
            }
            case 42: {
                n3 = 61;
                break;
            }
            case 43: {
                n3 = 38;
                break;
            }
            case 44: {
                n3 = 3;
                break;
            }
            case 45: {
                n3 = 49;
                break;
            }
            case 46: {
                n3 = 21;
                break;
            }
            case 47: {
                n3 = 63;
                break;
            }
            case 48: {
                n3 = 51;
                break;
            }
            case 49: {
                n3 = 2;
                break;
            }
            case 50: {
                n3 = 9;
                break;
            }
            case 51: {
                n3 = 29;
                break;
            }
            case 52: {
                n3 = 57;
                break;
            }
            case 53: {
                n3 = 11;
                break;
            }
            case 54: {
                n3 = 54;
                break;
            }
            case 55: {
                n3 = 37;
                break;
            }
            case 56: {
                n3 = 24;
                break;
            }
            case 57: {
                n3 = 20;
                break;
            }
            case 58: {
                n3 = 26;
                break;
            }
            case 59: {
                n3 = 0;
                break;
            }
            case 60: {
                n3 = 34;
                break;
            }
            case 61: {
                n3 = 33;
                break;
            }
            case 62: {
                n3 = 56;
                break;
            }
            default: {
                n3 = 59;
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
        ConfigurationParameterResolver.f[n4] = new String(cArray);
        return n4;
    }

    public static int q(int n, int n2) {
        boolean bl;
        long l = a ^ 0x43D71EC654D1L;
        int n3 = n;
        int n4 = (n2 & ConfigurationParameterResolver.a("b", (int)21797, (long)(0xF564320B254C072L ^ l))) >> 16;
        try {
            bl = (n2 & ConfigurationParameterResolver.a("b", (int)10998, (long)(0x172626FED19E3FA0L ^ l))) != 0;
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterResolver.a(customSystemException);
        }
        boolean bl2 = bl;
        switch (n) {
            case 16: {
                n3 = a.a.mvk(n4, 3);
                break;
            }
            case 17: {
                int n5;
                try {
                    n5 = bl2 ? 163 : 162;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationParameterResolver.a(customSystemException);
                }
                n3 = n5;
                break;
            }
            case 18: {
                int n6;
                try {
                    n6 = bl2 ? 165 : 164;
                }
                catch (CustomSystemException customSystemException) {
                    throw ConfigurationParameterResolver.a(customSystemException);
                }
                n3 = n6;
                break;
            }
            default: {
                n3 = n;
            }
        }
        return n3;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x58;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("a/Ji", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ConfigurationParameterResolver.c[n2] = n3;
        }
        return c[n2];
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[5];
        f = new String[5];
        ConfigurationParameterResolver.a();
        d = new HashMap(13);
        long l = a ^ 0x3E9C7B06544L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "I\u00e3\u00be\u0089\u00bc\u00af\u00b1$o\u00ab%\u00ac\u00e4\u00c5fg\u00fdp\u00b4\u00b9<\u00d4\u0002\u00d4";
        int n2 = "I\u00e3\u00be\u0089\u00bc\u00af\u00b1$o\u00ab%\u00ac\u00e4\u00c5fg\u00fdp\u00b4\u00b9<\u00d4\u0002\u00d4".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[3];
        I = new int[10000];
        ConfigurationParameterResolver.I[1] = 27;
        ConfigurationParameterResolver.I[2] = 49;
        ConfigurationParameterResolver.I[3] = 50;
        ConfigurationParameterResolver.I[4] = 51;
        ConfigurationParameterResolver.I[5] = 52;
        ConfigurationParameterResolver.I[6] = 53;
        ConfigurationParameterResolver.I[7] = 54;
        ConfigurationParameterResolver.I[8] = 55;
        ConfigurationParameterResolver.I[9] = 56;
        ConfigurationParameterResolver.I[10] = 57;
        ConfigurationParameterResolver.I[11] = 48;
        ConfigurationParameterResolver.I[12] = 189;
        ConfigurationParameterResolver.I[13] = 187;
        ConfigurationParameterResolver.I[14] = 8;
        ConfigurationParameterResolver.I[15] = 9;
        ConfigurationParameterResolver.I[16] = 81;
        ConfigurationParameterResolver.I[17] = 87;
        ConfigurationParameterResolver.I[18] = 69;
        ConfigurationParameterResolver.I[19] = 82;
        ConfigurationParameterResolver.I[20] = 84;
        ConfigurationParameterResolver.I[21] = 89;
        ConfigurationParameterResolver.I[22] = 85;
        ConfigurationParameterResolver.I[23] = 73;
        ConfigurationParameterResolver.I[24] = 79;
        ConfigurationParameterResolver.I[25] = 80;
        ConfigurationParameterResolver.I[26] = 219;
        ConfigurationParameterResolver.I[27] = 221;
        ConfigurationParameterResolver.I[28] = 13;
        ConfigurationParameterResolver.I[29] = 162;
        ConfigurationParameterResolver.I[30] = 65;
        ConfigurationParameterResolver.I[31] = 83;
        ConfigurationParameterResolver.I[32] = 68;
        ConfigurationParameterResolver.I[33] = 70;
        ConfigurationParameterResolver.I[34] = 71;
        ConfigurationParameterResolver.I[35] = 72;
        ConfigurationParameterResolver.I[36] = 74;
        ConfigurationParameterResolver.I[37] = 75;
        ConfigurationParameterResolver.I[38] = 76;
        ConfigurationParameterResolver.I[39] = 186;
        ConfigurationParameterResolver.I[40] = 222;
        ConfigurationParameterResolver.I[41] = 192;
        ConfigurationParameterResolver.I[42] = 160;
        ConfigurationParameterResolver.I[43] = 220;
        ConfigurationParameterResolver.I[44] = 90;
        ConfigurationParameterResolver.I[45] = 88;
        ConfigurationParameterResolver.I[46] = 67;
        ConfigurationParameterResolver.I[47] = 86;
        ConfigurationParameterResolver.I[48] = 66;
        ConfigurationParameterResolver.I[49] = 78;
        ConfigurationParameterResolver.I[50] = 77;
        ConfigurationParameterResolver.I[51] = 188;
        ConfigurationParameterResolver.I[52] = 190;
        ConfigurationParameterResolver.I[53] = 191;
        ConfigurationParameterResolver.I[54] = 161;
        ConfigurationParameterResolver.I[55] = 106;
        ConfigurationParameterResolver.I[56] = 164;
        ConfigurationParameterResolver.I[57] = 32;
        ConfigurationParameterResolver.I[58] = 20;
        ConfigurationParameterResolver.I[59] = 112;
        ConfigurationParameterResolver.I[60] = 113;
        ConfigurationParameterResolver.I[61] = 114;
        ConfigurationParameterResolver.I[62] = 115;
        ConfigurationParameterResolver.I[63] = 116;
        ConfigurationParameterResolver.I[64] = 117;
        ConfigurationParameterResolver.I[65] = 118;
        ConfigurationParameterResolver.I[66] = 119;
        ConfigurationParameterResolver.I[67] = 120;
        ConfigurationParameterResolver.I[68] = 121;
        ConfigurationParameterResolver.I[69] = 144;
        ConfigurationParameterResolver.I[70] = 145;
        ConfigurationParameterResolver.I[71] = 103;
        ConfigurationParameterResolver.I[72] = 104;
        ConfigurationParameterResolver.I[73] = 105;
        ConfigurationParameterResolver.I[74] = 109;
        ConfigurationParameterResolver.I[75] = 100;
        ConfigurationParameterResolver.I[76] = 101;
        ConfigurationParameterResolver.I[77] = 102;
        ConfigurationParameterResolver.I[78] = 107;
        ConfigurationParameterResolver.I[79] = 97;
        ConfigurationParameterResolver.I[80] = 98;
        ConfigurationParameterResolver.I[81] = 99;
        ConfigurationParameterResolver.I[82] = 96;
        ConfigurationParameterResolver.I[83] = 110;
        ConfigurationParameterResolver.I[87] = 122;
        ConfigurationParameterResolver.I[88] = 123;
        ConfigurationParameterResolver.I[100] = 124;
        ConfigurationParameterResolver.I[101] = 125;
        ConfigurationParameterResolver.I[102] = 126;
        ConfigurationParameterResolver.I[103] = 127;
        ConfigurationParameterResolver.I[104] = 128;
        ConfigurationParameterResolver.I[105] = 129;
        ConfigurationParameterResolver.I[112] = 21;
        ConfigurationParameterResolver.I[113] = 130;
        ConfigurationParameterResolver.I[121] = 28;
        ConfigurationParameterResolver.I[123] = 29;
        ConfigurationParameterResolver.I[141] = 146;
        ConfigurationParameterResolver.I[146] = 186;
        ConfigurationParameterResolver.I[156] = 13;
        ConfigurationParameterResolver.I[157] = 163;
        ConfigurationParameterResolver.I[179] = 188;
        ConfigurationParameterResolver.I[184] = 165;
        ConfigurationParameterResolver.I[197] = 19;
        ConfigurationParameterResolver.I[199] = 36;
        ConfigurationParameterResolver.I[200] = 38;
        ConfigurationParameterResolver.I[201] = 33;
        ConfigurationParameterResolver.I[203] = 37;
        ConfigurationParameterResolver.I[205] = 39;
        ConfigurationParameterResolver.I[207] = 35;
        ConfigurationParameterResolver.I[208] = 40;
        ConfigurationParameterResolver.I[209] = 34;
        ConfigurationParameterResolver.I[210] = 45;
        ConfigurationParameterResolver.I[211] = 46;
        ConfigurationParameterResolver.I[218] = 12;
    }

    public static int S(int n) {
        try {
            if (n > I.length - 1) {
                return 0;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw ConfigurationParameterResolver.a(customSystemException);
        }
        return I[n];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ConfigurationParameterResolver.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ConfigurationParameterResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ConfigurationParameterResolver.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

