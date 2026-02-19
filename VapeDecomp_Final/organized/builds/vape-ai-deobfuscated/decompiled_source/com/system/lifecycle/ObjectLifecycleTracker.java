/*
 * Decompiled with CFR 0.152.
 */
package com.system.lifecycle;

import com.collections.management.MultiContainerRegistry;
import com.exception.system.CustomSystemException;
import com.temporal.metadata.TemporalMetadataResolver;
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
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ObjectLifecycleTracker {
    private static final String[] E;
    private static int[] n;
    private static final long f;
    private static final Object[] u;
    private static final Map<String, Integer> l;
    public static boolean C;
    protected Object H;
    public static TemporalMetadataResolver U;
    public static boolean z;
    private static final long j;

    public boolean B(Class clazz) {
        boolean bl;
        block7: {
            block6: {
                try {
                    try {
                        try {
                            if (!this.r() || clazz == null) break block6;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw ObjectLifecycleTracker.a(customSystemException);
                        }
                        if (!clazz.isInstance(this.H)) break block6;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw ObjectLifecycleTracker.a(customSystemException);
                    }
                    bl = true;
                    break block7;
                }
                catch (CustomSystemException customSystemException) {
                    throw ObjectLifecycleTracker.a(customSystemException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean equals(Object object) {
        block5: {
            try {
                try {
                    if (object != null && this.H != null) break block5;
                }
                catch (CustomSystemException customSystemException) {
                    throw ObjectLifecycleTracker.a(customSystemException);
                }
                return false;
            }
            catch (CustomSystemException customSystemException) {
                throw ObjectLifecycleTracker.a(customSystemException);
            }
        }
        if (object instanceof ObjectLifecycleTracker) {
            ObjectLifecycleTracker objectLifecycleTracker = (ObjectLifecycleTracker)object;
            return this.H.equals(objectLifecycleTracker.H);
        }
        return super.equals(object);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'e' || c == 'K' || c == 'H' || c == '\u00cb') {
                field = ObjectLifecycleTracker.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'K' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ObjectLifecycleTracker.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00df' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public String toString() {
        long l = f ^ 0x2812AA7C9672L;
        try {
            if (this.H == null) {
                return ObjectLifecycleTracker.c("Y", (int)((int)j), (long)-1311645619563505021L, (long)l);
            }
        }
        catch (Exception exception) {
            throw ObjectLifecycleTracker.a(exception);
        }
        try {
            return this.H.toString();
        }
        catch (Exception exception) {
            return "";
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

    private static Field c(long l, long l2) {
        int n = ObjectLifecycleTracker.a(l, l2);
        Object object = u[n];
        if (object instanceof String) {
            String string = E[n];
            int n2 = string.indexOf(8);
            Class clazz = ObjectLifecycleTracker.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ObjectLifecycleTracker.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ObjectLifecycleTracker.a(clazz3, string2, clazz2)) != null) {
                    ObjectLifecycleTracker.u[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ObjectLifecycleTracker.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ObjectLifecycleTracker.u[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ObjectLifecycleTracker.b(277929822581405L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void ab() {
        Object[] objectArray = u;
        u[0] = "c\u0001V";
        objectArray[1] = Integer.TYPE;
        ObjectLifecycleTracker.E[1] = "java/lang/Integer";
        objectArray[2] = "5EF])0>JW\u0012T(-M^[";
        objectArray[3] = "y\u0005k?Ntr\nzp/zy\u0001~*";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "7?:vXi-mr\u001c_oRofa\f%0;;aL\u0014k7p\"Zsn2w 4";
    }

    private static Method d(long l, long l2) {
        int n = ObjectLifecycleTracker.a(l, l2);
        Object object = u[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = E[n];
                int n3 = string2.indexOf(8);
                clazz3 = ObjectLifecycleTracker.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ObjectLifecycleTracker.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ObjectLifecycleTracker.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ObjectLifecycleTracker.u[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ObjectLifecycleTracker.b(277929822581405L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ObjectLifecycleTracker.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ObjectLifecycleTracker.u[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ObjectLifecycleTracker.b(277929822581405L, 0L);
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

    public boolean Y() {
        boolean bl;
        try {
            bl = this.H == null;
        }
        catch (CustomSystemException customSystemException) {
            throw ObjectLifecycleTracker.a(customSystemException);
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = MultiContainerRegistry.a(-5932919560773058168L, -5123257168680363813L, MethodHandles.lookup().lookupClass()).a(222984117615397L);
        u = new Object[5];
        E = new String[5];
        ObjectLifecycleTracker.ab();
        long l = f ^ 0x47B9BBF52FAFL;
        ObjectLifecycleTracker.R(new int[2]);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 8370624546943137175L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                j = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                U = TemporalMetadataResolver.h;
                z = U.r();
                C = false;
                ObjectLifecycleTracker.l = new HashMap<String, Integer>();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public Object M() {
        return this.H;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (E[n4] != null) {
            return n4;
        }
        Object object = u[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 56;
                break;
            }
            case 1: {
                n3 = 37;
                break;
            }
            case 2: {
                n3 = 4;
                break;
            }
            case 3: {
                n3 = 19;
                break;
            }
            case 4: {
                n3 = 40;
                break;
            }
            case 5: {
                n3 = 17;
                break;
            }
            case 6: {
                n3 = 44;
                break;
            }
            case 7: {
                n3 = 50;
                break;
            }
            case 8: {
                n3 = 9;
                break;
            }
            case 9: {
                n3 = 21;
                break;
            }
            case 10: {
                n3 = 33;
                break;
            }
            case 11: {
                n3 = 26;
                break;
            }
            case 12: {
                n3 = 30;
                break;
            }
            case 13: {
                n3 = 61;
                break;
            }
            case 14: {
                n3 = 35;
                break;
            }
            case 15: {
                n3 = 32;
                break;
            }
            case 16: {
                n3 = 49;
                break;
            }
            case 17: {
                n3 = 57;
                break;
            }
            case 18: {
                n3 = 29;
                break;
            }
            case 19: {
                n3 = 8;
                break;
            }
            case 20: {
                n3 = 59;
                break;
            }
            case 21: {
                n3 = 2;
                break;
            }
            case 22: {
                n3 = 45;
                break;
            }
            case 23: {
                n3 = 0;
                break;
            }
            case 24: {
                n3 = 58;
                break;
            }
            case 25: {
                n3 = 62;
                break;
            }
            case 26: {
                n3 = 25;
                break;
            }
            case 27: {
                n3 = 15;
                break;
            }
            case 28: {
                n3 = 36;
                break;
            }
            case 29: {
                n3 = 3;
                break;
            }
            case 30: {
                n3 = 46;
                break;
            }
            case 31: {
                n3 = 39;
                break;
            }
            case 32: {
                n3 = 24;
                break;
            }
            case 33: {
                n3 = 7;
                break;
            }
            case 34: {
                n3 = 23;
                break;
            }
            case 35: {
                n3 = 48;
                break;
            }
            case 36: {
                n3 = 63;
                break;
            }
            case 37: {
                n3 = 31;
                break;
            }
            case 38: {
                n3 = 20;
                break;
            }
            case 39: {
                n3 = 47;
                break;
            }
            case 40: {
                n3 = 52;
                break;
            }
            case 41: {
                n3 = 60;
                break;
            }
            case 42: {
                n3 = 51;
                break;
            }
            case 43: {
                n3 = 14;
                break;
            }
            case 44: {
                n3 = 53;
                break;
            }
            case 45: {
                n3 = 1;
                break;
            }
            case 46: {
                n3 = 12;
                break;
            }
            case 47: {
                n3 = 43;
                break;
            }
            case 48: {
                n3 = 22;
                break;
            }
            case 49: {
                n3 = 10;
                break;
            }
            case 50: {
                n3 = 28;
                break;
            }
            case 51: {
                n3 = 16;
                break;
            }
            case 52: {
                n3 = 18;
                break;
            }
            case 53: {
                n3 = 34;
                break;
            }
            case 54: {
                n3 = 11;
                break;
            }
            case 55: {
                n3 = 54;
                break;
            }
            case 56: {
                n3 = 55;
                break;
            }
            case 57: {
                n3 = 13;
                break;
            }
            case 58: {
                n3 = 38;
                break;
            }
            case 59: {
                n3 = 42;
                break;
            }
            case 60: {
                n3 = 6;
                break;
            }
            case 61: {
                n3 = 27;
                break;
            }
            case 62: {
                n3 = 41;
                break;
            }
            default: {
                n3 = 5;
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
        ObjectLifecycleTracker.E[n4] = new String(cArray);
        return n4;
    }

    public boolean r() {
        boolean bl;
        try {
            bl = !this.Y();
        }
        catch (CustomSystemException customSystemException) {
            throw ObjectLifecycleTracker.a(customSystemException);
        }
        return bl;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/Hc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ObjectLifecycleTracker.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ObjectLifecycleTracker.a(l, l2);
            object = u[n];
            try {
                if (!(object instanceof String)) break block2;
                ObjectLifecycleTracker.u[n] = clazz = Class.forName(E[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ObjectLifecycleTracker.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ObjectLifecycleTracker.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static void R(int[] nArray) {
        n = nArray;
    }

    public ObjectLifecycleTracker(Object object) {
        if (object instanceof ObjectLifecycleTracker) {
            ObjectLifecycleTracker objectLifecycleTracker = (ObjectLifecycleTracker)object;
            this.H = objectLifecycleTracker.M();
            return;
        }
        this.H = object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ObjectLifecycleTracker.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ObjectLifecycleTracker.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static int[] z() {
        return n;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ObjectLifecycleTracker.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

