/*
 * Decompiled with CFR 0.152.
 */
package a;

import a.Ne;
import a.Nu;
import a.RL;
import a.z1;
import com.app.security.validation.DecompilationValidator;
import com.app.simulation.PhysicsSimulationParameters;
import com.app.workflow.StateTrackingCoordinator;
import com.collections.management.MultiContainerRegistry;
import com.data.obfuscation.NumericScrambler;
import com.dynamic.instrumentation.RuntimeInstrumentationEngine;
import com.exception.system.CustomSystemException;
import com.reflection.dispatch.MethodInvocationResolver;
import com.security.crypto.CryptographicSessionController;
import com.security.exchange.SecureDataExchanger793;
import com.simulation.physics.PhysicsSimulator1815;
import com.system.resources.ResourceAllocationTracker882;
import java.awt.Color;
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

public class z6 {
    public static SecureDataExchanger793 J;
    private static final String[] f;
    private static String[] A;
    public static SecureDataExchanger793 O;
    private static final long a;
    private static final Integer[] c;
    public static NumericScrambler p;
    private static final Object[] e;
    public static ResourceAllocationTracker882 i;
    public static RL D;
    public static DecompilationValidator N;
    private static final long[] b;
    private static final Map d;

    public static void J(float f, float f2, float f3, float f4, Color color, float f5, Color color2) {
        if (color2 != null) {
            float f6 = f + (f3 + f4) / 2.0f - f5 / 2.0f;
            CryptographicSessionController.x().p(new RuntimeInstrumentationEngine().Q(f6, f2, f5, f3, color2));
        }
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().W(f, f2, f3, f4, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    public static String[] M() {
        return A;
    }

    public static void j(float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(3).r(f, f2, 0.0f, f3, f4, 0.0f, f5, f6, 0.0f, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    public static void t(float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().K(f, f2, f3, f4, f5, f6, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = z6.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static void H(float f, float f2, float f3, float f4, float f5, float f6, float f7, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine(2).f(f, f2, f3, f4, f5, f6, f7, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = z6.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                z6.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static void X(float f, float f2, float f3, float f4, Color color, boolean bl, float f5, float f6, float f7, Color color2, int n) {
        try {
            if (f5 == 0.0f) {
                z6.O(f, f2, f3, f4, color);
                return;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw z6.a(customSystemException);
        }
        try {
            if (bl) {
                CryptographicSessionController.x().p(new RuntimeInstrumentationEngine().K(f, f2 + 0.5f, f3, f4 - 1.5f, f7, f5, color2));
            }
        }
        catch (CustomSystemException customSystemException) {
            throw z6.a(customSystemException);
        }
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().H(f, f2, f3, f4, color, f5, f6, n);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = z6.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    public static void A(float f, float f2, float f3, float f4, float f5, float f6, int n, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().f(f, f2, f3, f4, f5, f6, n, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    public static void g(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().H(z1.LINES_LOOP).b(f, f2, 0.0f, f3, f4, 0.0f, f5, f6, 0.0f, f7, f8, 0.0f, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    public static void G(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, Color color) {
        z6.u((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, (float)d9, (float)d10, (float)d11, (float)d12, (float)d13, color);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = z6.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = z6.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void o(float f, float f2, float f3, float f4, Color color, float f5, float f6, float f7) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().W(f, f2, f3, f4, color, f5, f6, f7);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    public static void b(double d2, double d3, double d4, double d5, double d6, double d7, float f, Color color) {
        z6.H((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, f, color);
    }

    private static Field c(long l, long l2) {
        int n = z6.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = z6.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = z6.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = z6.a(clazz3, string2, clazz2)) != null) {
                    z6.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = z6.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        z6.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = z6.b(249729136847327L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static void P(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Color color) {
        z6.g((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, (float)d9, color);
    }

    public static void O(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Color color, Color color2) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().k(f, f2, 0.0f, f3, f4, 0.0f, f5, f6, 0.0f, f7, f8, 0.0f, color, color2);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static void O(float f, float f2, float f3, float f4, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().j(f, f2, f3, f4, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    public static void g(float f, float f2, PhysicsSimulator1815 physicsSimulator1815, NumericScrambler numericScrambler, Color color, float f3) {
        p = numericScrambler;
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().S(f, f2, physicsSimulator1815, color, f3);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
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
                n3 = 3;
                break;
            }
            case 1: {
                n3 = 12;
                break;
            }
            case 2: {
                n3 = 34;
                break;
            }
            case 3: {
                n3 = 32;
                break;
            }
            case 4: {
                n3 = 35;
                break;
            }
            case 5: {
                n3 = 6;
                break;
            }
            case 6: {
                n3 = 56;
                break;
            }
            case 7: {
                n3 = 8;
                break;
            }
            case 8: {
                n3 = 27;
                break;
            }
            case 9: {
                n3 = 37;
                break;
            }
            case 10: {
                n3 = 41;
                break;
            }
            case 11: {
                n3 = 29;
                break;
            }
            case 12: {
                n3 = 25;
                break;
            }
            case 13: {
                n3 = 45;
                break;
            }
            case 14: {
                n3 = 57;
                break;
            }
            case 15: {
                n3 = 39;
                break;
            }
            case 16: {
                n3 = 7;
                break;
            }
            case 17: {
                n3 = 20;
                break;
            }
            case 18: {
                n3 = 50;
                break;
            }
            case 19: {
                n3 = 11;
                break;
            }
            case 20: {
                n3 = 28;
                break;
            }
            case 21: {
                n3 = 52;
                break;
            }
            case 22: {
                n3 = 15;
                break;
            }
            case 23: {
                n3 = 16;
                break;
            }
            case 24: {
                n3 = 1;
                break;
            }
            case 25: {
                n3 = 30;
                break;
            }
            case 26: {
                n3 = 23;
                break;
            }
            case 27: {
                n3 = 0;
                break;
            }
            case 28: {
                n3 = 55;
                break;
            }
            case 29: {
                n3 = 54;
                break;
            }
            case 30: {
                n3 = 48;
                break;
            }
            case 31: {
                n3 = 2;
                break;
            }
            case 32: {
                n3 = 18;
                break;
            }
            case 33: {
                n3 = 49;
                break;
            }
            case 34: {
                n3 = 61;
                break;
            }
            case 35: {
                n3 = 47;
                break;
            }
            case 36: {
                n3 = 33;
                break;
            }
            case 37: {
                n3 = 22;
                break;
            }
            case 38: {
                n3 = 58;
                break;
            }
            case 39: {
                n3 = 62;
                break;
            }
            case 40: {
                n3 = 51;
                break;
            }
            case 41: {
                n3 = 19;
                break;
            }
            case 42: {
                n3 = 60;
                break;
            }
            case 43: {
                n3 = 38;
                break;
            }
            case 44: {
                n3 = 40;
                break;
            }
            case 45: {
                n3 = 46;
                break;
            }
            case 46: {
                n3 = 10;
                break;
            }
            case 47: {
                n3 = 36;
                break;
            }
            case 48: {
                n3 = 53;
                break;
            }
            case 49: {
                n3 = 44;
                break;
            }
            case 50: {
                n3 = 24;
                break;
            }
            case 51: {
                n3 = 59;
                break;
            }
            case 52: {
                n3 = 31;
                break;
            }
            case 53: {
                n3 = 14;
                break;
            }
            case 54: {
                n3 = 43;
                break;
            }
            case 55: {
                n3 = 5;
                break;
            }
            case 56: {
                n3 = 13;
                break;
            }
            case 57: {
                n3 = 21;
                break;
            }
            case 58: {
                n3 = 4;
                break;
            }
            case 59: {
                n3 = 63;
                break;
            }
            case 60: {
                n3 = 9;
                break;
            }
            case 61: {
                n3 = 26;
                break;
            }
            case 62: {
                n3 = 17;
                break;
            }
            default: {
                n3 = 42;
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
        z6.f[n4] = new String(cArray);
        return n4;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7E98;
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
                throw new RuntimeException("a/z6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            z6.c[n2] = n3;
        }
        return c[n2];
    }

    public static void M(double d2, double d3, double d4, double d5, Color color) {
        z6.O((float)d2, (float)d3, (float)d4, (float)d5, color);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e8' || c == '\u00f6' || c == 'o' || c == 'L') {
                field = z6.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = z6.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static void X(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, Color color, Color color2, boolean bl) {
        Object object;
        try {
            if (Math.signum(f11) >= 0.0f) {
                Ne.h.x(f11, f11, f11);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw z6.a(customSystemException);
        }
        if (bl) {
            object = new Color(0, 0, 0, 150);
            RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().E(f + 0.5f, f2 + 0.5f, f3, f4, f5, f6, f7, f8, f9, f10, (Color)object);
            CryptographicSessionController.x().p(runtimeInstrumentationEngine);
        }
        if (color2 == null) {
            object = new RuntimeInstrumentationEngine().E(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, color);
            CryptographicSessionController.x().p((RuntimeInstrumentationEngine)object);
        }
        try {
            if (Math.signum(f11) >= 0.0f) {
                Ne.h.x(1.0f / f11, 1.0f / f11, 1.0f / f11);
            }
        }
        catch (CustomSystemException customSystemException) {
            throw z6.a(customSystemException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(9010208437925268463L, 8322129998666637089L, MethodHandles.lookup().lookupClass()).a(16426485437393L);
        e = new Object[5];
        f = new String[5];
        z6.a();
        d = new HashMap(13);
        z6.t(new String[5]);
        long l = a ^ 0x944281E340BL;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "<a&\u0088\u00a8\u00ec\u00e3\u00f17\u00a4\u00f9\u00b2vVSS";
        int n2 = "<a&\u0088\u00a8\u00ec\u00e3\u00f17\u00a4\u00f9\u00b2vVSS".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
        D = new RL();
        J = new SecureDataExchanger793().Z();
        O = new SecureDataExchanger793().Z();
        i = null;
        p = null;
        N = new DecompilationValidator();
    }

    public static void h(double d2, double d3, double d4, double d5, double d6, Color color, Color color2) {
        if (color.equals(color2)) {
            d6 = 0.0;
            z6.M(d2, d3, d4 - d6, d5 - d6, color);
            return;
        }
        z6.M(d2 -= d6, d3, (d4 += d6) - d6, (d5 += d6) - d6, color);
    }

    public static void m(float f, float f2, float f3, float f4, float f5, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().o(f, f2, f3, f4, f5, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    public static void u(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().b(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    public static void v(float f, float f2, float f3, float f4, NumericScrambler numericScrambler, String string, float f5, Color color, Color color2, boolean bl) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        block5: {
            long l = a ^ 0xEF59C6A8F4L;
            f11 = 0.0f;
            f10 = 0.0f;
            f9 = 1.0f;
            f8 = 1.0f;
            f7 = numericScrambler.t;
            f6 = numericScrambler.v;
            Nu nu = MethodInvocationResolver.g().O((String)((Object)z6.b("\u00d1", (int)z6.a("u", (int)23807, (long)(0x6287768FD7D63E2DL ^ l)), (long)2038520583235564319L, (long)l)));
            try {
                if (nu.q() == null || numericScrambler.M != nu.q().M) break block5;
            }
            catch (CustomSystemException customSystemException) {
                throw z6.a(customSystemException);
            }
            PhysicsSimulationParameters physicsSimulationParameters = nu.V(string);
            try {
                if (physicsSimulationParameters == null) {
                    StateTrackingCoordinator.D((String)((Object)z6.b("\u00d1", (int)z6.a("u", (int)29904, (long)(0x357831F73D959603L ^ l)), (long)2038520583235564319L, (long)l)));
                    return;
                }
            }
            catch (CustomSystemException customSystemException) {
                throw z6.a(customSystemException);
            }
            f11 = physicsSimulationParameters.L;
            f9 = physicsSimulationParameters.T;
            f10 = physicsSimulationParameters.R;
            f8 = physicsSimulationParameters.g;
            f7 = physicsSimulationParameters.v;
            f6 = physicsSimulationParameters.u;
            f3 += 0.5f;
            f4 += 0.5f;
            f -= 0.5f;
            f2 -= 0.5f;
        }
        z6.X(f, f2, f3, f4, f7, f6, f11, f10, f9, f8, f5, color, color2, bl);
    }

    public static void S(float f, float f2, float f3, float f4, float f5, Color color) {
        z6.H(f, f2, 0.0f, f3, f4, 0.0f, f5, color);
    }

    public static void T(float f, float f2, float f3, float f4, float f5, float f6, Color color, NumericScrambler numericScrambler) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().D(numericScrambler).j(f, f2, f3, f4, f5, f6, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "\u0013>\u0014";
        objectArray[1] = Integer.TYPE;
        z6.f[1] = "java/lang/Integer";
        objectArray[2] = "E%S\u001dd\u0015N*BR\u0019\r]-K\u001b";
        objectArray[3] = "=\u001d@\u000bh>6\u0012QD\t0=\u0019U\u001e";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "M\u001c0\\\u0007X\u0014\u0002b>VX.C6BOZE\u0003e\u0002Y#\u0017\u0007&\u0005W\u0019G\u00194R=";
    }

    public static void r(float f, float f2, float f3, float f4, float f5, float f6, float f7, Color color) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().B(f, f2, f3, f4, f5, f6, f7, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    public static void d(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Color color, Color color2) {
        z6.O((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, (float)d9, color, color2);
    }

    private static Method d(long l, long l2) {
        int n = z6.a(l, l2);
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
                clazz3 = z6.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = z6.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = z6.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        z6.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = z6.b(249729136847327L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = z6.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        z6.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = z6.b(249729136847327L, 0L);
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

    public static void t(String[] stringArray) {
        A = stringArray;
    }

    public static void W(double d2, double d3, double d4, double d5, double d6, double d7, Color color) {
        z6.j((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, color);
    }

    public static void A(float f, float f2, float f3, float f4, Color color, NumericScrambler numericScrambler) {
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().D(numericScrambler).S(f, f2, f3, f4, color);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/z6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = z6.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = z6.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static void E(double d2, double d3, double d4, double d5, float f, float f2, float f3, float f4, NumericScrambler numericScrambler) {
        block4: {
            try {
                try {
                    if (d4 != 0.0 && d5 != 0.0) break block4;
                }
                catch (CustomSystemException customSystemException) {
                    throw z6.a(customSystemException);
                }
                return;
            }
            catch (CustomSystemException customSystemException) {
                throw z6.a(customSystemException);
            }
        }
        RuntimeInstrumentationEngine runtimeInstrumentationEngine = new RuntimeInstrumentationEngine().D(numericScrambler).E((float)d2, (float)d3, (float)d4, (float)d5, f, f2, f3, f4);
        CryptographicSessionController.x().p(runtimeInstrumentationEngine);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static void I(double d2, double d3, double d4, double d5, float f, Color color) {
        z6.S((float)d2, (float)d3, (float)d4, (float)d5, f, color);
    }

    public static void t(double d2, double d3, double d4, double d5, double d6, double d7, int n, Color color) {
        z6.A((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, n, color);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/z6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static void n(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, Color color) {
        z6.X((float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, (float)d9, color);
    }

    public static void X(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Color color) {
        z6.u(f, f2, 0.0f, f3, f4, 0.0f, f5, f6, 0.0f, f7, f8, 0.0f, color);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(z6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(z6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

