/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package com.security.crypto;

import com.collections.management.MultiContainerRegistry;
import com.game.configuration.GameVersionEnumerator;
import com.graphics.rendering.RenderingPipelineController;
import com.math.geometry.GeometryCalculator;
import com.network.protocol.NetworkProtocolTranslator;
import com.system.resources.ResourceAllocator2619;
import com.temporal.metadata.TemporalMetadataResolver;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;

public class CryptographicContextManager895
extends ResourceAllocator2619 {
    private static final long d;
    private static final String[] g;
    private static final Object[] e;
    private static final long a;

    public String S() {
        try {
            if (GameVersionEnumerator.MC_1_16_5.Q()) {
                TemporalMetadataResolver.k();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicContextManager895.a(unsupportedOperationException);
        }
        return NetworkProtocolTranslator.T(CryptographicContextManager895.U.u().Ls, this.M());
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = CryptographicContextManager895.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = CryptographicContextManager895.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public Object[] w() {
        try {
            if (GameVersionEnumerator.MC_1_16_5.Q()) {
                TemporalMetadataResolver.k();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicContextManager895.a(unsupportedOperationException);
        }
        return NetworkProtocolTranslator.Q(CryptographicContextManager895.U.u().Ls, this.M());
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public CryptographicContextManager895(Object object) {
        super(object);
    }

    private static Method l(long l, long l2) {
        int n = CryptographicContextManager895.i(l, l2);
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
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = CryptographicContextManager895.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = CryptographicContextManager895.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = CryptographicContextManager895.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        CryptographicContextManager895.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = CryptographicContextManager895.j(212438636740440L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = CryptographicContextManager895.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        CryptographicContextManager895.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = CryptographicContextManager895.j(212438636740440L, 0L);
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

    public String r() {
        try {
            if (GameVersionEnumerator.MC_1_20_6.Q()) {
                TemporalMetadataResolver.k();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicContextManager895.a(unsupportedOperationException);
        }
        return NetworkProtocolTranslator.z(CryptographicContextManager895.U.u().Ls, this.M());
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/or" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void c() {
        Object[] objectArray = e;
        e[0] = "eW1";
        objectArray[1] = Integer.TYPE;
        CryptographicContextManager895.g[1] = "java/lang/Integer";
        objectArray[2] = "3\u001f.8Wf8\u0010?w*~+\u00176>";
        objectArray[3] = "\u001aLcUfN\u0011Cr\u001a\u0007@\u001aHv@";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "~\u0007s\u0007$\u007f+Glbq9AO2\u000bu |Hu\u0013!Bx\u0011b\u0006\"+}\feR\u001a";
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = CryptographicContextManager895.i(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                CryptographicContextManager895.e[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static CryptographicContextManager895 I(String string, @Nullable String string2, Object[] objectArray) {
        long l = a ^ 0x328F87C61402L;
        try {
            if (GameVersionEnumerator.MC_1_20_6.Q()) {
                TemporalMetadataResolver.k();
                throw new UnsupportedOperationException((String)((Object)CryptographicContextManager895.a("I", (int)((int)d), (long)7422025279016077304L, (long)l)));
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CryptographicContextManager895.a(unsupportedOperationException);
        }
        return new CryptographicContextManager895(NetworkProtocolTranslator.I(CryptographicContextManager895.U.u().Ls, string, string2, objectArray));
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = CryptographicContextManager895.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = CryptographicContextManager895.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = CryptographicContextManager895.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public static CryptographicContextManager895 I(String string, Object ... objectArray) {
        return new CryptographicContextManager895(NetworkProtocolTranslator.a(CryptographicContextManager895.U.u().Ls, string, objectArray));
    }

    private static Field k(long l, long l2) {
        int n = CryptographicContextManager895.i(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = CryptographicContextManager895.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = CryptographicContextManager895.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = CryptographicContextManager895.e(clazz3, string2, clazz2)) != null) {
                    CryptographicContextManager895.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = CryptographicContextManager895.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        CryptographicContextManager895.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = CryptographicContextManager895.j(212438636740440L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    @Override
    public String i() {
        if (GeometryCalculator.C() >= 50) {
            RenderingPipelineController renderingPipelineController = RenderingPipelineController.z(this.H);
            return renderingPipelineController.i();
        }
        return super.i();
    }

    public List P() {
        return CryptographicContextManager895.U.u().Ls.Y(this.M());
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'c' || c == '\u00a3' || c == '\u00dd' || c == '\u00e3') {
                field = CryptographicContextManager895.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'c' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = CryptographicContextManager895.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'I' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n4] != null) {
            return n4;
        }
        Object object = e[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 16;
                break;
            }
            case 1: {
                n3 = 40;
                break;
            }
            case 2: {
                n3 = 42;
                break;
            }
            case 3: {
                n3 = 37;
                break;
            }
            case 4: {
                n3 = 14;
                break;
            }
            case 5: {
                n3 = 10;
                break;
            }
            case 6: {
                n3 = 18;
                break;
            }
            case 7: {
                n3 = 62;
                break;
            }
            case 8: {
                n3 = 1;
                break;
            }
            case 9: {
                n3 = 55;
                break;
            }
            case 10: {
                n3 = 46;
                break;
            }
            case 11: {
                n3 = 15;
                break;
            }
            case 12: {
                n3 = 20;
                break;
            }
            case 13: {
                n3 = 47;
                break;
            }
            case 14: {
                n3 = 48;
                break;
            }
            case 15: {
                n3 = 39;
                break;
            }
            case 16: {
                n3 = 45;
                break;
            }
            case 17: {
                n3 = 58;
                break;
            }
            case 18: {
                n3 = 19;
                break;
            }
            case 19: {
                n3 = 49;
                break;
            }
            case 20: {
                n3 = 21;
                break;
            }
            case 21: {
                n3 = 43;
                break;
            }
            case 22: {
                n3 = 61;
                break;
            }
            case 23: {
                n3 = 28;
                break;
            }
            case 24: {
                n3 = 26;
                break;
            }
            case 25: {
                n3 = 35;
                break;
            }
            case 26: {
                n3 = 50;
                break;
            }
            case 27: {
                n3 = 4;
                break;
            }
            case 28: {
                n3 = 41;
                break;
            }
            case 29: {
                n3 = 9;
                break;
            }
            case 30: {
                n3 = 36;
                break;
            }
            case 31: {
                n3 = 17;
                break;
            }
            case 32: {
                n3 = 51;
                break;
            }
            case 33: {
                n3 = 23;
                break;
            }
            case 34: {
                n3 = 57;
                break;
            }
            case 35: {
                n3 = 59;
                break;
            }
            case 36: {
                n3 = 27;
                break;
            }
            case 37: {
                n3 = 0;
                break;
            }
            case 38: {
                n3 = 2;
                break;
            }
            case 39: {
                n3 = 56;
                break;
            }
            case 40: {
                n3 = 44;
                break;
            }
            case 41: {
                n3 = 34;
                break;
            }
            case 42: {
                n3 = 38;
                break;
            }
            case 43: {
                n3 = 25;
                break;
            }
            case 44: {
                n3 = 52;
                break;
            }
            case 45: {
                n3 = 6;
                break;
            }
            case 46: {
                n3 = 13;
                break;
            }
            case 47: {
                n3 = 5;
                break;
            }
            case 48: {
                n3 = 54;
                break;
            }
            case 49: {
                n3 = 12;
                break;
            }
            case 50: {
                n3 = 30;
                break;
            }
            case 51: {
                n3 = 31;
                break;
            }
            case 52: {
                n3 = 33;
                break;
            }
            case 53: {
                n3 = 24;
                break;
            }
            case 54: {
                n3 = 22;
                break;
            }
            case 55: {
                n3 = 11;
                break;
            }
            case 56: {
                n3 = 53;
                break;
            }
            case 57: {
                n3 = 60;
                break;
            }
            case 58: {
                n3 = 29;
                break;
            }
            case 59: {
                n3 = 7;
                break;
            }
            case 60: {
                n3 = 3;
                break;
            }
            case 61: {
                n3 = 32;
                break;
            }
            case 62: {
                n3 = 8;
                break;
            }
            default: {
                n3 = 63;
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
        CryptographicContextManager895.g[n4] = new String(cArray);
        return n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(-8435549240709883643L, 2656922493481226660L, MethodHandles.lookup().lookupClass()).a(20974863569390L);
        e = new Object[5];
        g = new String[5];
        CryptographicContextManager895.c();
        long l = a ^ 0x9D88712EA3CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 2558534890978628380L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                d = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CryptographicContextManager895.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

