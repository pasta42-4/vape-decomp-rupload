/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 */
package com.security.exchange;

import com.collections.management.MultiContainerRegistry;
import com.event.core.EventDispatcher;
import com.exception.system.CustomSystemException;
import com.game.actions.ActionSequenceHandler;
import com.math.computation.GeometricComputationEngine920;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.FloatBuffer;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.BufferUtils;

public class SecureDataExchanger793 {
    private static int[] R;
    private static final long b;
    private static final String[] e;
    private static final long a;
    private static final Object[] c;
    public float[] d;

    public SecureDataExchanger793 e(float f, float f2, float f3, float f4) {
        float f5 = (float)Math.toRadians(f);
        float f6 = (float)Math.cos(f5);
        float f7 = (float)Math.sin(f5);
        float f8 = 1.0f - f6;
        SecureDataExchanger793 secureDataExchanger793 = new SecureDataExchanger793().Z();
        secureDataExchanger793.d[0] = f2 * f2 * f8 + f6;
        secureDataExchanger793.d[1] = f3 * f2 * f8 + f4 * f7;
        secureDataExchanger793.d[2] = f2 * f4 * f8 - f3 * f7;
        secureDataExchanger793.d[4] = f2 * f3 * f8 - f4 * f7;
        secureDataExchanger793.d[5] = f3 * f3 * f8 + f6;
        secureDataExchanger793.d[6] = f3 * f4 * f8 + f2 * f7;
        secureDataExchanger793.d[8] = f2 * f4 * f8 + f3 * f7;
        secureDataExchanger793.d[9] = f3 * f4 * f8 - f2 * f7;
        secureDataExchanger793.d[10] = f4 * f4 * f8 + f6;
        return this.E(secureDataExchanger793);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = SecureDataExchanger793.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                SecureDataExchanger793.c[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public SecureDataExchanger793(GeometricComputationEngine920 geometricComputationEngine920) {
        this();
        this.d[0] = geometricComputationEngine920.F;
        this.d[5] = geometricComputationEngine920.s;
        this.d[10] = geometricComputationEngine920.X;
        this.d[15] = geometricComputationEngine920.n;
    }

    public SecureDataExchanger793 f(float f, float f2, float f3, float f4, float f5, float f6) {
        this.d[0] = 2.0f / (f2 - f);
        this.d[5] = 2.0f / (f4 - f3);
        this.d[10] = -2.0f / (f6 - f5);
        this.d[12] = -((f2 + f) / (f2 - f));
        this.d[13] = -((f4 + f3) / (f4 - f3));
        this.d[14] = -((f6 + f5) / (f6 - f5));
        return this;
    }

    public SecureDataExchanger793(float[] fArray) {
        this.d = fArray;
    }

    public FloatBuffer c() {
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)16);
        floatBuffer.put(this.d).flip();
        return floatBuffer;
    }

    public SecureDataExchanger793 Z() {
        try {
            for (int i = 0; i < 16; ++i) {
                this.d[i] = 0.0f;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataExchanger793.a(customSystemException);
        }
        this.d[0] = 1.0f;
        this.d[5] = 1.0f;
        this.d[10] = 1.0f;
        this.d[15] = 1.0f;
        return this;
    }

    public String toString() {
        long l = a ^ 0x7F2DB095C353L;
        return (String)((Object)SecureDataExchanger793.a("\u00a3", (int)((int)b), (long)-4528024315672140759L, (long)l)) + Arrays.toString(this.d) + '}';
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == 'x' || c == 'D' || c == '\u00f4') {
                field = SecureDataExchanger793.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'x' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = SecureDataExchanger793.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c8' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a/kd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field c(long l, long l2) {
        int n = SecureDataExchanger793.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = SecureDataExchanger793.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = SecureDataExchanger793.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = SecureDataExchanger793.a(clazz3, string2, clazz2)) != null) {
                    SecureDataExchanger793.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = SecureDataExchanger793.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        SecureDataExchanger793.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = SecureDataExchanger793.b(256332372048626L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "oOu";
        objectArray[1] = Integer.TYPE;
        SecureDataExchanger793.e[1] = "java/lang/Integer";
        objectArray[2] = "W_W@2:\\PF\u000fO\"OWOF";
        objectArray[3] = "t{O\u0004A\u0000\u007ft^K \u000et\u007fZ\u0011";
        Object[] objectArray2 = objectArray;
        objectArray[4] = "\u0003\\J\fIU\u0012\u000fPfO\u0010b\u001d]\u001cT\u0016\\^\rV$QX\u0001T_TPZW\u0001f";
    }

    public void f(GeometricComputationEngine920 geometricComputationEngine920, GeometricComputationEngine920 geometricComputationEngine9202) {
        float f = geometricComputationEngine920.F;
        float f2 = geometricComputationEngine920.s;
        float f3 = geometricComputationEngine920.X;
        float f4 = geometricComputationEngine920.n;
        geometricComputationEngine9202.F = this.d[0] * f + this.d[4] * f2 + this.d[8] * f3 + this.d[12] * f4;
        geometricComputationEngine9202.s = this.d[1] * f + this.d[5] * f2 + this.d[9] * f3 + this.d[13] * f4;
        geometricComputationEngine9202.X = this.d[2] * f + this.d[6] * f2 + this.d[10] * f3 + this.d[14] * f4;
        geometricComputationEngine9202.n = this.d[3] * f + this.d[7] * f2 + this.d[11] * f3 + this.d[15] * f4;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = SecureDataExchanger793.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = SecureDataExchanger793.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public SecureDataExchanger793 k(float f, float f2, float f3) {
        SecureDataExchanger793 secureDataExchanger793 = new SecureDataExchanger793().Z();
        secureDataExchanger793.d[12] = f;
        secureDataExchanger793.d[13] = f2;
        secureDataExchanger793.d[14] = f3;
        return this.E(secureDataExchanger793);
    }

    private static CustomSystemException a(CustomSystemException customSystemException) {
        return customSystemException;
    }

    public static int[] z() {
        return R;
    }

    public SecureDataExchanger793() {
        this.d = new float[16];
    }

    public static void m(int[] nArray) {
        R = nArray;
    }

    public SecureDataExchanger793 g(float f) {
        this.Z();
        float f2 = (float)Math.toRadians(f);
        this.d[5] = (float)Math.cos(f2);
        this.d[6] = -((float)Math.sin(f2));
        this.d[9] = (float)Math.sin(f2);
        this.d[10] = (float)Math.cos(f2);
        return this;
    }

    public ActionSequenceHandler B() {
        ActionSequenceHandler actionSequenceHandler;
        ActionSequenceHandler actionSequenceHandler2 = ActionSequenceHandler.b();
        ActionSequenceHandler actionSequenceHandler3 = actionSequenceHandler2.q(this.c());
        try {
            actionSequenceHandler = actionSequenceHandler3 == null ? actionSequenceHandler2 : actionSequenceHandler3;
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataExchanger793.a(customSystemException);
        }
        return actionSequenceHandler;
    }

    public SecureDataExchanger793(EventDispatcher eventDispatcher) {
        this();
        float f = eventDispatcher.Q();
        float f2 = eventDispatcher.G();
        float f3 = eventDispatcher.i();
        float f4 = eventDispatcher.H();
        float f5 = 2.0f * f * f;
        float f6 = 2.0f * f2 * f2;
        float f7 = 2.0f * f3 * f3;
        this.d[0] = 1.0f - f6 - f7;
        this.d[5] = 1.0f - f7 - f5;
        this.d[10] = 1.0f - f5 - f6;
        this.d[15] = 1.0f;
        float f8 = f * f2;
        float f9 = f2 * f3;
        float f10 = f3 * f;
        float f11 = f * f4;
        float f12 = f2 * f4;
        float f13 = f3 * f4;
        this.d[4] = 2.0f * (f8 + f13);
        this.d[1] = 2.0f * (f8 - f13);
        this.d[8] = 2.0f * (f10 - f12);
        this.d[2] = 2.0f * (f10 + f12);
        this.d[9] = 2.0f * (f9 + f11);
        this.d[6] = 2.0f * (f9 - f11);
    }

    public SecureDataExchanger793 D(float f, float f2, float f3, float f4) {
        float f5 = (float)Math.tan(Math.toRadians(f) / 2.0);
        this.d[0] = 1.0f / (f2 * f5);
        this.d[5] = 1.0f / f5;
        this.d[10] = -((f4 + f3) / (f4 - f3));
        this.d[11] = -(2.0f * f4 * f3 / (f4 - f3));
        this.d[14] = -1.0f;
        return this;
    }

    public boolean z(SecureDataExchanger793 secureDataExchanger793) {
        try {
            if (this == secureDataExchanger793) {
                return true;
            }
        }
        catch (CustomSystemException customSystemException) {
            throw SecureDataExchanger793.a(customSystemException);
        }
        if (secureDataExchanger793 != null) {
            int n = 0;
            while (true) {
                block9: {
                    try {
                        try {
                            if (n >= 16) break;
                            if (Float.compare(this.d[n], secureDataExchanger793.d[n]) == 0) break block9;
                        }
                        catch (CustomSystemException customSystemException) {
                            throw SecureDataExchanger793.a(customSystemException);
                        }
                        return false;
                    }
                    catch (CustomSystemException customSystemException) {
                        throw SecureDataExchanger793.a(customSystemException);
                    }
                }
                ++n;
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = MultiContainerRegistry.a(911495713450068343L, 2430142237212774140L, MethodHandles.lookup().lookupClass()).a(78755540533269L);
        c = new Object[5];
        e = new String[5];
        SecureDataExchanger793.a();
        long l = a ^ 0x4B965D14BFA1L;
        SecureDataExchanger793.m(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -7537776610719323753L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public SecureDataExchanger793 f() {
        return new SecureDataExchanger793(this);
    }

    public SecureDataExchanger793 q(float f, float f2, float f3) {
        SecureDataExchanger793 secureDataExchanger793 = new SecureDataExchanger793().Z();
        secureDataExchanger793.d[0] = f;
        secureDataExchanger793.d[5] = f2;
        secureDataExchanger793.d[10] = f3;
        return this.E(secureDataExchanger793);
    }

    public SecureDataExchanger793 E(SecureDataExchanger793 secureDataExchanger793) {
        float[] fArray = new float[16];
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                float f = 0.0f;
                for (int k = 0; k < 4; ++k) {
                    f += this.d[j + k * 4] * secureDataExchanger793.d[k + i * 4];
                }
                fArray[j + i * 4] = f;
            }
        }
        this.d = fArray;
        return this;
    }

    private static Method d(long l, long l2) {
        int n = SecureDataExchanger793.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = SecureDataExchanger793.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = SecureDataExchanger793.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = SecureDataExchanger793.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        SecureDataExchanger793.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = SecureDataExchanger793.b(256332372048626L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = SecureDataExchanger793.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        SecureDataExchanger793.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = SecureDataExchanger793.b(256332372048626L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = SecureDataExchanger793.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = SecureDataExchanger793.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = SecureDataExchanger793.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3;
        int n4 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (e[n4] != null) {
            return n4;
        }
        Object object = c[n4];
        if (!(object instanceof String)) {
            return n4;
        }
        int n5 = 0;
        switch ((int)(l >>> 42 & 0x3FL)) {
            case 0: {
                n3 = 38;
                break;
            }
            case 1: {
                n3 = 7;
                break;
            }
            case 2: {
                n3 = 30;
                break;
            }
            case 3: {
                n3 = 31;
                break;
            }
            case 4: {
                n3 = 23;
                break;
            }
            case 5: {
                n3 = 51;
                break;
            }
            case 6: {
                n3 = 9;
                break;
            }
            case 7: {
                n3 = 40;
                break;
            }
            case 8: {
                n3 = 60;
                break;
            }
            case 9: {
                n3 = 20;
                break;
            }
            case 10: {
                n3 = 37;
                break;
            }
            case 11: {
                n3 = 62;
                break;
            }
            case 12: {
                n3 = 36;
                break;
            }
            case 13: {
                n3 = 58;
                break;
            }
            case 14: {
                n3 = 25;
                break;
            }
            case 15: {
                n3 = 1;
                break;
            }
            case 16: {
                n3 = 39;
                break;
            }
            case 17: {
                n3 = 2;
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
                n3 = 42;
                break;
            }
            case 21: {
                n3 = 46;
                break;
            }
            case 22: {
                n3 = 61;
                break;
            }
            case 23: {
                n3 = 22;
                break;
            }
            case 24: {
                n3 = 8;
                break;
            }
            case 25: {
                n3 = 26;
                break;
            }
            case 26: {
                n3 = 33;
                break;
            }
            case 27: {
                n3 = 50;
                break;
            }
            case 28: {
                n3 = 35;
                break;
            }
            case 29: {
                n3 = 34;
                break;
            }
            case 30: {
                n3 = 17;
                break;
            }
            case 31: {
                n3 = 24;
                break;
            }
            case 32: {
                n3 = 12;
                break;
            }
            case 33: {
                n3 = 5;
                break;
            }
            case 34: {
                n3 = 0;
                break;
            }
            case 35: {
                n3 = 41;
                break;
            }
            case 36: {
                n3 = 13;
                break;
            }
            case 37: {
                n3 = 55;
                break;
            }
            case 38: {
                n3 = 63;
                break;
            }
            case 39: {
                n3 = 47;
                break;
            }
            case 40: {
                n3 = 59;
                break;
            }
            case 41: {
                n3 = 44;
                break;
            }
            case 42: {
                n3 = 14;
                break;
            }
            case 43: {
                n3 = 19;
                break;
            }
            case 44: {
                n3 = 48;
                break;
            }
            case 45: {
                n3 = 45;
                break;
            }
            case 46: {
                n3 = 52;
                break;
            }
            case 47: {
                n3 = 54;
                break;
            }
            case 48: {
                n3 = 32;
                break;
            }
            case 49: {
                n3 = 15;
                break;
            }
            case 50: {
                n3 = 21;
                break;
            }
            case 51: {
                n3 = 18;
                break;
            }
            case 52: {
                n3 = 27;
                break;
            }
            case 53: {
                n3 = 49;
                break;
            }
            case 54: {
                n3 = 56;
                break;
            }
            case 55: {
                n3 = 57;
                break;
            }
            case 56: {
                n3 = 43;
                break;
            }
            case 57: {
                n3 = 53;
                break;
            }
            case 58: {
                n3 = 6;
                break;
            }
            case 59: {
                n3 = 10;
                break;
            }
            case 60: {
                n3 = 29;
                break;
            }
            case 61: {
                n3 = 16;
                break;
            }
            case 62: {
                n3 = 11;
                break;
            }
            default: {
                n3 = 3;
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
        SecureDataExchanger793.e[n4] = new String(cArray);
        return n4;
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

    public SecureDataExchanger793(SecureDataExchanger793 secureDataExchanger793) {
        this.d = secureDataExchanger793.d;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(SecureDataExchanger793.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

